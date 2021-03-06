

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.junit.Test;

import com.ctg.ag.sdk.core.constant.Scheme;
import com.ctg.ag.sdk.core.model.ApiCallBack;

import com.ctg.ag.sdk.biz.AepDeviceControlClient;
import com.ctg.ag.sdk.biz.aep_device_control.QueryRemoteControlListRequest;
import com.ctg.ag.sdk.biz.aep_device_control.QueryRemoteControlListResponse;
import com.ctg.ag.sdk.biz.aep_device_control.CreateRemoteControlRequest;
import com.ctg.ag.sdk.biz.aep_device_control.CreateRemoteControlResponse;


public class AepDeviceControlDemo {

	// 没有签名同步调用接口示例
	@Test
	public void testApi() throws Exception {

		AepDeviceControlClient client = AepDeviceControlClient.newClient().build();

		{
			QueryRemoteControlListRequest request = new QueryRemoteControlListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryRemoteControlList(request));
		}
		
		{
			CreateRemoteControlRequest request = new CreateRemoteControlRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateRemoteControl(request));
		}
		
		client.shutdown();

	}

	// 没有签名异步调用接口示例
	@Test
	public void testApiAsync() throws Exception {

		AepDeviceControlClient client = AepDeviceControlClient.newClient().build();

		{
			
			List<Future<QueryRemoteControlListResponse>> res = new ArrayList<Future<QueryRemoteControlListResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				QueryRemoteControlListRequest request = new QueryRemoteControlListRequest();
				// request.setParam..  	// set your request params here

				res.add(client.QueryRemoteControlList(request, new ApiCallBack<QueryRemoteControlListRequest, QueryRemoteControlListResponse>() {
					@Override
					public void onFailure(QueryRemoteControlListRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(QueryRemoteControlListRequest request, QueryRemoteControlListResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<QueryRemoteControlListResponse> future : res)
				System.out.println(future.get());

		}
		
		{
			
			List<Future<CreateRemoteControlResponse>> res = new ArrayList<Future<CreateRemoteControlResponse>>();
			
			// multi request
			for (int i = 0; i < 5; i++) {
			
				CreateRemoteControlRequest request = new CreateRemoteControlRequest();
				// request.setParam..  	// set your request params here

				res.add(client.CreateRemoteControl(request, new ApiCallBack<CreateRemoteControlRequest, CreateRemoteControlResponse>() {
					@Override
					public void onFailure(CreateRemoteControlRequest request, Exception e) {
						e.printStackTrace();
					}
		
					@Override
					public void onResponse(CreateRemoteControlRequest request, CreateRemoteControlResponse response) {
						System.out.println("Receive data and handle it");
					}
				}));
			
			}
			
			// wait and collect all data
			for (Future<CreateRemoteControlResponse> future : res)
				System.out.println(future.get());

		}
		
		client.shutdown();
	}

	// 没有签名https同步调用接口示例
	@Test
	public void testApiWithSsl() throws Exception {

		AepDeviceControlClient client = AepDeviceControlClient.newClient().scheme(Scheme.HTTPS).build();

		{
			QueryRemoteControlListRequest request = new QueryRemoteControlListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryRemoteControlList(request));
		}
		
		{
			CreateRemoteControlRequest request = new CreateRemoteControlRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateRemoteControl(request));
		}
		
		client.shutdown();
	}

	// 签名同步调用接口示例
	@Test
	public void testApiWithSignature() throws Exception {

		AepDeviceControlClient client = AepDeviceControlClient.newClient().appKey("Your app key here").appSecret("Your app secret here").build();

		{
			QueryRemoteControlListRequest request = new QueryRemoteControlListRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.QueryRemoteControlList(request));
		}
		
		{
			CreateRemoteControlRequest request = new CreateRemoteControlRequest();
			// request.setParam..  	// set your request params here
			System.out.println(client.CreateRemoteControl(request));
		}
		
		client.shutdown();
	}

}
