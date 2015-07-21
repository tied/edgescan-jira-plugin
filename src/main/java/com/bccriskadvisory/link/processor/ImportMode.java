package com.bccriskadvisory.link.processor;

import com.bccriskadvisory.link.JiraPluginContext;

public enum ImportMode {
	
	AUTO(true) {
		@Override
		public ProjectImportProcessor createProcessor( JiraPluginContext pluginContext, boolean testMode) {
			return new AutoProjectImportProcessor(pluginContext, testMode);
		}
	}, 
	UPDATE(true) {
		@Override
		public ProjectImportProcessor createProcessor( JiraPluginContext pluginContext, boolean testMode) {
			return new UpdateProjectImportProcessor(pluginContext, testMode);
		}
	}, 
	FULL(false) {
		@Override
		public ProjectImportProcessor createProcessor( JiraPluginContext pluginContext, boolean testMode) {
			return new FullProjectImportProcessor(pluginContext, testMode);
		}
	};
	
	private boolean isUpdate;
	
	private ImportMode(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}
	
	public abstract ProjectImportProcessor createProcessor(JiraPluginContext pluginContext, boolean testMode);

	public boolean isUpdate() {
		return isUpdate;
	}
	
	public static ImportMode fromString(String in) {
		switch (in.toLowerCase()) {
		case "auto":
			return AUTO;
		case "update":
			return UPDATE;
		case "full":
			return FULL;
		default:
			throw new IllegalArgumentException("Unrecognised import mode: " + in);
		}
	}
}