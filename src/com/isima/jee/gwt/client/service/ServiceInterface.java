package com.isima.jee.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.isima.jee.ws.BiblioService;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("app")
public interface ServiceInterface extends RemoteService, BiblioService {
	
}
