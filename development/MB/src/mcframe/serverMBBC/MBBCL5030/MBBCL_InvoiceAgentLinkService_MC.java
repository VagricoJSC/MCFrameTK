package mcframe.serverMBBC.MBBCL5030;

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


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBC.MBBCL5030.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.io.File;
import mcframe.commonCore.util.MCDataConvUtil;
import mcframe.serverCore.requester.MCSimpleMultiPartParam;
import mcframe.serverCore.requester.MCSimpleRequester;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import static mcframe.commonCore.net.MCNetConsts.*;
import static mcframe.serverCore.requester.MCRequestObject.object;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBCL_InvoiceAgentLinkService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBCL_InvoiceAgentLinkService_MC extends MBBCL_InvoiceAgentLinkService_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MBBCL_InvoiceAgentLinkService> CLAZZ = MBBCL_InvoiceAgentLinkService.class;

	protected static final String EXT_SYS_CD = "ext_sys_cd";
	protected static final String USER_CD = "user_cd";
	protected static final String PASSWORD = "password";
	protected static final String WEB_URL = "web_url";

	/**
	 * IALink_Srch01オペレーション.<p>
	 *
	 * invoiceAgentのフォルダを検索します。<br>
	 */
	public class IALink_Srch01 extends MBBCL_InvoiceAgentLinkService_MC_A.IALink_Srch01 {

		protected InvoiceAgentRequester _invoiceAgent;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setDown(callWebApi());
		}

		protected MCList<MCRow> callWebApi() {

			_invoiceAgent = getRequester(up0().ext_sys_cd());

			MCList<MCRow> retL;
			try {
				if(up0().inc_file_flg()) {
					retL = _invoiceAgent.doGetDocumentsList(up0().dir());
				}
				else {
					retL = _invoiceAgent.doGetFoldersList(up0().dir());
				}
			}
			finally {
				if(_invoiceAgent != null) {
					_invoiceAgent.logout();
				}
			}

			return retL;
		}

		protected void setDown(MCList<MCRow> list) {
			for (MCRow row : list) {
				IALink_Srch01_RsltR r = down0().add();

				r.id(row.getStringNE("id"));
				r.name(row.getStringNE("name"));
				r.type(row.getStringNE("type"));
				r.updatedate(MCDate.valueOf(row.getStringNE("updatedate"), "yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
				r.type(row.getStringNE("type"));
				r.filesize(MCNumber.valueOf(row.getStringNE("size")));
			}
		}

	}

	/**
	 * IALink_Copy01オペレーション.<p>
	 *
	 * invoiceAgentにアーカイブします。<br>
	 */
	public class IALink_Copy01 extends MBBCL_InvoiceAgentLinkService_MC_A.IALink_Copy01 {

		protected InvoiceAgentRequester _invoiceAgent;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callWebApi();
			setDown();
		}

		protected void editUp() {
			up0().sort(IALink_Copy01_DtlR.$ext_sys_cd);
		}

		protected void callWebApi() {
			for(MCList<IALink_Copy01_DtlR> l:up0().groupList(IALink_Copy01_DtlR.$ext_sys_cd)) {
				try {
					_invoiceAgent = getRequester(l.get(0).ext_sys_cd());
					for (IALink_Copy01_DtlR r: up0()) {
						callWebApi(r);
					}
				}
				finally {
					if(_invoiceAgent != null) {
						_invoiceAgent.logout();
						_invoiceAgent = null;
					}
				}
			}
		}

		protected void callWebApi(IALink_Copy01_DtlR r) {
			MCRow ret = _invoiceAgent.doArchive(r.src_file(), r.file_path(), r.file_name(), r.overwrite_flg());
			r.id(ret.getString("id"));
			r.file_name(ret.getString("file_name"));
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected void handleEx(Exception e) {

		}

	}

	protected class InvoiceAgentRequester {
		/** invoiceAgentのURL（https://[ホスト名].spa-cloud.com/spa/service） */
		protected String _url;
		protected static final String HEADER_COOKIE = "Cookie";
		protected static final String HEADER_XSFR_TOKEN = "x-xsrf-token";
		protected static final String HEADER_X_REQUESTED_WITH = "x-requested-with";
		protected static final String HEADER_ERROR_CODE = "X-Spa-Error-Code";
		protected static final String HEADER_ERROR_MESSAGE = "X-Spa-Error-Message";
		/** Web API実行に使用するリクエストヘッダ */
		protected LinkedHashMap<String, String> _requestHeader = new LinkedHashMap<>();


		/**
		 * コンストラクタです。
		 *
		 * @param url invoiceAgentのURL（https://[ホスト名]:44230/spa/service、https://[ホスト名].spa-cloud.com/spa/service）
		 */
		public InvoiceAgentRequester(String url) {
			this._url = url;
		}

		/**
		 * ログインAPIを実行します。
		 *
		 * @param user ユーザID
		 * @param password パスワード
		 */
		protected void login(String user, String password) {
			MCSimpleRequester requester = new MCSimpleRequester();

			Map<String, String> up = new LinkedHashMap<>();
			up.put("user", user);
			up.put("password", password);

			try {
				requester.request(getApiUrl("login", null), createQueryBody(up), CONTENT_TYPE_PARAM);
			}
			catch (MCException e) {
				throwEx(requester.getResponseCode(), requester.getResponseHeader());
			}

			setApiHeader(requester.getResponseHeader());
		}

		/**
		 * レスポンスヘッダからWeb API実行に必要な情報を取得します。
		 *
		 * @param header レスポンスヘッダ
		 */
		protected void setApiHeader(Map<String, List<String>> header) {
			_requestHeader.clear();
			List<String> list = header.get("Set-Cookie");
			StringBuffer sbCookie = new StringBuffer();
			for (String cookie : list) {
				String[] array = cookie.split(";");
				sbCookie.append(cookie).append("; ");
				for (String str : array) {
					if (str.matches("XSRF-TOKEN=.*")) {
						String[] kvp = str.split("=");
						_requestHeader.put(HEADER_XSFR_TOKEN, kvp[1]);
						break;
					}
				}
			}
			_requestHeader.put(HEADER_COOKIE, sbCookie.toString());
			_requestHeader.put(HEADER_X_REQUESTED_WITH, "XMLHttpRequest");
		}

		/**
		 * ファイル取得APIを実行します。
		 */
		protected MCList<MCRow> doGetDocumentsList(String dir) {

			MCList<MCRow> retL = MCList.create(MCRow.class);

			String folderId = doGetFolderId(dir);
			if (isNull(folderId)) {
				return retL;
			}

			MCSimpleRequester requester = new MCSimpleRequester();
			// ヘッダの設定
			requester.addHeaders(_requestHeader);

			String ret = null;
			try {
				ret = requester.request(getApiUrl("documents", folderId), createQueryBody(getBodyForDocuments()), CONTENT_TYPE_PARAM);
			}
			catch (MCException e) {
				throwEx(requester.getResponseCode(), requester.getResponseHeader());
			}

			List<Map<String,Object>> list = (List<Map<String,Object>>)jsonToMap(ret).get("documentList");

			return getValueFromResponse(list);
		}

		/**
		 * フォルダ取得APIを実行します。
		 */
		protected MCList<MCRow> doGetFoldersList(String dir) {

			MCList<MCRow> retL = MCList.create(MCRow.class);

			String folderId = doGetFolderId(dir);
			if (isNull(folderId)) {
				return retL;
			}

			MCSimpleRequester requester = new MCSimpleRequester();
			requester.addHeaders(_requestHeader);

			String ret = null;
			try {
				ret = requester.request(getApiUrl("folders", folderId));
			}
			catch (MCException e) {
				throwEx(requester.getResponseCode(), requester.getResponseHeader());
			}

			List<Map<String,Object>> list = (List<Map<String,Object>>)jsonToMap(ret).get("folderList");

			return getValueFromResponse(list);
		}

		protected MCList<MCRow> getValueFromResponse(List<Map<String,Object>> list){
			MCList<MCRow> retL = MCList.create(MCRow.class);
			for (Object doc : list) {
				MCRow r = retL.add();
				for (Map.Entry<String, Object> entry : ((Map<String,Object>)doc).entrySet()) {
					if(isSame(entry.getKey(), "properties")) {
						((Map<String,?>)entry.getValue()).forEach((k, v) -> r.addStringColumn(k, v == null ? null : v.toString()));
					}
					else {
						r.addStringColumn(entry.getKey(), entry.getValue() == null ? null : entry.getValue().toString());
					}
				}
			}
			return retL;
		}

		/**
		 * フォルダID取得APIを実行します。
		 *
		 * @param folder フォルダー名。/から始まっている必要があります。
		 * @return フォルダーID
		 */
		protected String doGetFolderId(String folder) {
			MCSimpleRequester requester = new MCSimpleRequester();
			// ヘッダの設定
			requester.addHeaders(_requestHeader);

			// BODYの生成
			Map<String, String> lookupTableList = new HashMap<>();
			lookupTableList.put("name", folder);
			Map<String, Object> up = new HashMap<>();
			up.put("lookupTableList", new Map[] {lookupTableList});

			String ret = null;
			try {
				ret = requester.request(getApiUrl("folderslookup", null), createJsonBody(up));
			}
			catch (MCException e) {
				throwEx(requester.getResponseCode(), requester.getResponseHeader());
			}

			List<Map<?,?>> list = (List<Map<?,?>>)jsonToMap(ret).get("lookupTableList");
			ret =  (String) list.get(0).get("id");

			return ret;
		}

		/**
		 * ドキュメントID取得APIを実行します。
		 *
		 * @param path ファイルパス。/から始まっている必要があります。
		 * @return ドキュメントID
		 */
		protected String doGetDocumentId(String path) {
			MCSimpleRequester requester = new MCSimpleRequester();
			// ヘッダの設定
			requester.addHeaders(_requestHeader);

			// BODYの生成
			Map<String, String> lookupTableList = new HashMap<>();
			lookupTableList.put("name", path);
			Map<String, Object> up = new HashMap<>();
			up.put("lookupTableList", new Map[] {lookupTableList});

			String ret = null;
			try {
				ret = requester.request(getApiUrl("documentslookup", null), createJsonBody(up));

			}
			catch (MCException e) {
				throwEx(requester.getResponseCode(), requester.getResponseHeader());
			}

			List<Map<?,?>> list = (List<Map<?,?>>)jsonToMap(ret).get("lookupTableList");
			ret =  (String) list.get(0).get("id");

			return ret;
		}

		/**
		 * アーカイブAPIを実行します。
		 */
		protected MCRow doArchive(String srcFile, String path, String name, boolean overwrite) {
			MCRow retR = MCRow.create();

			MCSimpleRequester requester = new MCSimpleRequester();
			// ヘッダの設定
			requester.addHeaders(_requestHeader);

			String ret = null;
			try {
				ret = requester.request(getApiUrl("archive", null), getBodyForArchive(path, name, srcFile, overwrite));
			}
			catch (MCException e) {
				throwEx(requester.getResponseCode(), requester.getResponseHeader());
			}

			Map<String, Object> m = jsonToMap(ret);
			retR.addStringColumn("id", (String) m.get("id"));
			retR.addStringColumn("file_name", (String) m.get("name"));

			return retR;
		}

		/**
		 * ログアウトAPIを実行します。
		 */
		protected void logout() {
			MCSimpleRequester requester = new MCSimpleRequester();
			// ヘッダの設定
			requester.addHeaders(_requestHeader);
			
			try {
				requester.request(getApiUrl("logout", null), "");
			}
			catch (MCException e) {
				throwEx(requester.getResponseCode(), requester.getResponseHeader());
			}
		}

		protected String getApiUrl(String typ, String folderId) {
			if(isSame(typ, "login")) {
				return _url + "/auth/login";
			}
			else if(isSame(typ, "logout")) {
				return _url + "/auth/logout";
			}
			else if(isSame(typ, "documents")) {
				return _url + "/documents_v15/" + folderId + "/list";
			}
			else if(isSame(typ, "folders")) {
				return _url + "/folders_v4/" + folderId + "/list";
			}
			else if(isSame(typ, "folderslookup")) {
				return _url + "/folders_v2/lookup";
			}
			else if(isSame(typ, "documentslookup")) {
				return _url + "/documents_v2/lookup";
			}
			else if(isSame(typ, "archive")) {
				return _url + "/archives_v5";
			}
			return _url;
		}

		protected Map<String, String> getBodyForFolders() {
			// BODYの生成
			Map<String, String> up = new LinkedHashMap<>();
			up.put("folder", "true");
			up.put("properties", "id,name,updatedate,size");

			return up;
		}

		protected Map<String, String> getBodyForDocuments() {
			// BODYの生成
			Map<String, String> up = new LinkedHashMap<>();
			up.put("folder", "true");
			up.put("properties", "id,name,updatedate,size");

			return up;
		}

		protected MCSimpleMultiPartParam getBodyForArchive(String path, String name, String srcFile, boolean overwrite) {
			// BODYの生成
			MCSimpleMultiPartParam body = new MCSimpleMultiPartParam();
			File f = new File(srcFile);
			body.addParam("file", name, f, CONTENT_TYPE_PDF);

			body.addParam("path", path);
			body.addParam("name", name);
			body.addParam("overwrite", overwrite ? "true" : "false");
			body.addParam("nameAutomaticNumbering", "true");

			return body;
		}

		/**
		 * invoiceAgentが返したレスポンスヘッダに設定されている情報を付加してエラーをスローします。
		 *
		 * @param responseCode レスポンスコード
		 * @param header レスポンスヘッダ
		 */
		protected void throwEx(int responseCode, Map<String, List<String>> header) {
			String errorCode = getResponseHeaderString(header, HEADER_ERROR_CODE);
			String errorMsg = decode(getResponseHeaderString(header, HEADER_ERROR_MESSAGE));

			throw new MCAppException(new MCMessage(MBBCL0011, responseCode, errorCode, errorMsg));
		}

		/**
		 * レスポンスヘッダから値を取得します。
		 * 
		 * @param header レスポンスヘッダ
		 * @param key キー
		 * @return 値
		 */
		protected String getResponseHeaderString(Map<String, List<String>> header, String key) {
			if (header.get(key) != null) {
				return header.get(key).get(0);
			}
			return null;
		}

		/**
		 * URLデコードします。
		 *
		 * @param str 文字列
		 * @return でコードした文字列
		 */
		protected String decode(String str) {
			if (str != null) {
				try {
					return URLDecoder.decode(str, "UTF-8");
				}
				catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			return str;
		}

	}

	public static String getDocId(String extSysCd, String path) {
		return object(CLAZZ)._getDocId(extSysCd, path);
	}

	protected String _getDocId(String extSysCd, String path) {
		InvoiceAgentRequester invoiceAgent = null;
		String id = null;
		try {
			invoiceAgent = getRequester(extSysCd);
			id = invoiceAgent.doGetDocumentId(path);
		}
		catch (Exception e) {
			//ここでは無視
		}
		finally {
			if(invoiceAgent != null) {
				invoiceAgent.logout();
			}
		}

		return id;
	}

	protected Map<String, String> _ivParmMap = new HashMap<>();
	protected  Map<String, String> getExtParaMap(String extSysCd) {
		if(_ivParmMap.isEmpty() || !isSame(_ivParmMap.get(EXT_SYS_CD), extSysCd)) {
			setExtParaMap(extSysCd);
		}

		return _ivParmMap;
	}

	protected void setExtParaMap(String extSysCd) {
		MAM_EXT_SYS_USR_R extSysUsrR = getExtSysUsrNE(extSysCd);
		if(extSysUsrR == null) {
			extSysUsrR = MAM_EXT_SYS_USR_R.create();
		}

		MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
		MAM_IF_PROTOCOL_R t2 = MAM_IF_PROTOCOL_R.create("T2");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSelect(t.web_api_flg, t2.var_str);
		bldr.addLeftOuterJoin(t2, t2.ext_sys_cd.eq(t.ext_sys_cd).and(t2.if_ctl_typ.eq(value(MAC_IF_CTL_TYP.WEB_URL.value()))));
		bldr.setWhere(t.ext_sys_cd.eq(value(extSysCd)));
		dbSelect("MBBCL5030_MAM_EXT_SYS_S01", t, bldr);

		_ivParmMap.clear();
		_ivParmMap.put(EXT_SYS_CD, extSysCd);
		_ivParmMap.put(USER_CD, extSysUsrR.ext_sys_usr_cd());
		_ivParmMap.put(PASSWORD, extSysUsrR.ext_sys_pass());
		_ivParmMap.put(WEB_URL, t.getStringNE(MAM_IF_PROTOCOL_R.$var_str));
	}

	protected InvoiceAgentRequester getRequester(String extSysCd) {
		Map<String, String> m = getExtParaMap(extSysCd);
		InvoiceAgentRequester ret = new InvoiceAgentRequester(m.get(WEB_URL));
		ret.login(m.get(USER_CD), m.get(PASSWORD));

		return ret;
	}

	/**
	 * JSON変換用ユーティリティー
	 */
	protected String createQueryBody(Map<String, String> up) {
		return MCDataConvUtil.QUERY_STRING.create().toQueryString(up);
	}

	/**
	 * JSON変換用ユーティリティー
	 */
	protected String createJsonBody(Map<String, Object> up) {
		return MCDataConvUtil.JSON.create().toJson(up);
	}

	/**
	 * JSON変換用ユーティリティー
	 */
	protected  Map<String, Object> jsonToMap(String res) {
		return MCDataConvUtil.JSON.create().toMap(res);
	}

	//FMCB CUSTOM END
}