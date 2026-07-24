package mcframe.serverPFUD.PFUDL5040;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.net.*;
import java.util.*;
import mcframe.serverCore.requester.MCSimpleRequester;
import mcframe.serverPFUD.PFUDL5030.service.PFUDL_BasicAuth;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFUDL_ODataLogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFUDL_ODataLogicBase_MC extends PFUDL_ODataLogicBase_MC_A{
	//FMCB CUSTOM START

	/**
	 * SrchBase01オペレーション.<p>
	 *
	 */
	public class SrchBase01 extends PFUDL_ODataLogicBase_MC_A.SrchBase01 {
		
		// 検索対象のエンティティのメタデータ。Map<項目名、型>
		protected Map<String, String> _metaData;
		protected String _serviceRoot;
		protected String _entitySetName;
		protected String _namespaceURIForEntityType; 
		protected String _namespaceURIForProperty;
		
		@Override
		protected void call() {
			super.call();
			
			initServiceInfo();
			checkReqServiceInfo();

			srchMeta();
			srchData();

		}

		protected void initServiceInfo() {
			ifPrtclMgr().init(up0().ext_sys_cd());
			
			_serviceRoot = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.WEB_URL, up0().if_proc_typ());
			_entitySetName = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR1, up0().if_proc_typ());
			_namespaceURIForEntityType = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR2, up0().if_proc_typ());
			_namespaceURIForProperty = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR3, up0().if_proc_typ());
		}
		
		protected void checkReqServiceInfo() {
			if (null == _serviceRoot || _serviceRoot.isEmpty() || null == _entitySetName || _entitySetName.isEmpty()) {
				throw new MCAppException(new MCMessage(up0(), null, PFUDL0101, up0().ext_sys_cd(), up0().if_proc_typ()));
			}
		}

		protected void srchMeta() {
			String metaResponse = sendRequestMetaData();
			handleMetaResponse(metaResponse);
		}

		protected void srchData() {
			String response = sendRequest();
			handleResponse(response);
		}

		/**
		 * ODataのURLにオプションを付与する場合は、サブクラスでOverrideする。
		 * @param serviceURLBaseStr データ取得用のURL　
		 * @return データ取得用のURL
		 */
		protected String createURL(String serviceURLBaseStr) {
			return serviceURLBaseStr;
		}
		
		protected String sendRequestMetaData() {
			MCSimpleRequester rq =createRequester(); 
			// metadataのレスポンスはxmlのみ
			rq.setHeader("Accept", "application/xml");
			String metaDataURL = createMetaDataURL();
			String response = rq.request(metaDataURL);
			
			
			if (rq.getResponseCode() == HttpURLConnection.HTTP_OK) {
				return response;
			}
			else {
				return new String();
			}
		}
		
		protected String createMetaDataURL() {
			return _serviceRoot + "/$metadata";
		}

		/**
		 * HTTPヘッダマスタの設定を反映させたMCSimpleRequesterを返す。<BR>
		 * 
		 * レスポンス形式にはjsonが指定される。
		 * Odata v2はレスポンスの形式にxmlも選択可能だが、標準で用意しているレスポンスの解析メソッド（以下）がjsonにしか対応していないため。
		 * {@link mcframe.serverPFUD.PFUDL5040.PFUDL_ODataResponseParser_MC#responseToChildNodes(String)} 
		 * @return MCSimpleRequester
		 */
		protected MCSimpleRequester createRequester() {
			MCSimpleRequester rq = new MCSimpleRequester(ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.WEB_REQ_ID, up0().if_proc_typ()));
			MCRow ifR = MCRow.create();
			ifR.addStringColumn(MAM_HTTP_HEADER_R.$ext_sys_cd, up0().ext_sys_cd());
			ifR.addStringColumn(MAM_HTTP_HEADER_R.$if_proc_typ, up0().if_proc_typ());
			rq.setHeader("Accept", "application/json");
			
			for (MAM_HTTP_HEADER_R hhr : httpHdrMgr().getHttpHeaderL(ifR)) {
				rq.setHeader(hhr.http_header_nm(), hhr.http_header_val());
			}
			return rq;
		}
		
		/**
		 * Basic認証を付与する場合に、サブクラスから実行する。<BR>
		 * createRequester()メソッドで生成したインスタンスを、本メソッドの引数に渡す。
		 */
		protected void setBasicAuth(MCSimpleRequester rq, String extSysCd) {
			rq.setHeader("Authorization", PFUDL_BasicAuth.createInstance(extSysCd).getBaseAuthStr());
		}

		protected String sendRequest() {
			
			String serviceURLStr = createURL(createServiceBaseURL());
			MCSimpleRequester rq = createRequester();
			String response = rq.request(serviceURLStr);

			if (rq.getResponseCode() == HttpURLConnection.HTTP_OK) {
				return response;
			}

			return new String();
		}
		
		protected String createServiceBaseURL() {
			return _serviceRoot + "/" + _entitySetName;
		}

		protected void handleResponse(String response) {
			// サブクラスで実装
		}

		protected void handleMetaResponse(String response) {
			try {
				_metaData = PFUDL_ODataMetaDataParser.getAllPropertyTypes(response, _entitySetName, _namespaceURIForProperty, _namespaceURIForEntityType);
			}
			catch (Exception e) {
				throw new MCAppException(e);
			}

			if (null == _metaData || _metaData.isEmpty()) {
				throw new MCAppException(new MCMessage(up0(), null, PFUDL0100, up0().ext_sys_cd(), up0().if_proc_typ()));
			}
		}
	}

	//FMCB CUSTOM END
}