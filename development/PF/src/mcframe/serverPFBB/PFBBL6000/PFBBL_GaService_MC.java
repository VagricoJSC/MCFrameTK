package mcframe.serverPFBB.PFBBL6000;

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
import mcframe.serverPFBB.PFBBL6000.*;	// このimportはFrameManagerの自動生成で追加されました。

import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.requester.MCSimpleRequester;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;

import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys_MC.httpHdrMgr;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys_MC.ifPrtclMgr;

import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import mcframe.serverPFUD.PFUDL5020.IfPFUDL_SendRecvIf_Conv03;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

import mcframe.commonCore.util.MCDataConvUtil.JSON;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBBL_GaService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBBL_GaService_MC extends PFBBL_GaService_MC_A{
	//FMCB CUSTOM START

	// キャッシュ用
	protected static final Class<PFBBL_GaService> CLAZZ = PFBBL_GaService.class;

	// ＧＡ用パラメータキー
	protected static final String LANG = "GA_LANG";
	protected static final String USER = "GA_USER";
	protected static final String PASSWD = "GA_PASSWD";
	protected static final String COMPANY = "COMPANY";
	protected static final String REPORTID = "REPORTID";

	// ＧＡ Analytics用レポートＩＤ
	protected static final String RPTID_AC = "1010";
	protected static final String RPTID_SUBAC = "1020";
	protected static final String RPTID_ACDPT = "1030";
	protected static final String RPTID_BUDGET = "3010";
	protected static final String RPTID_BALANCE = "3020";

	// ＧＡ連携用パラメータ
	protected Map<String, String> _gaParmMap;
	protected String _extSysCd;

	/**
	 * Recv_Chk01オペレーション.<p>
	 *
	 * 受信前チェック<br>
	 */
	public class Recv_Chk01 extends PFBBL_GaService_MC_A.Recv_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			checkArg(msgList);
			return msgList;
		}

		/** 引数チェック */
		protected void checkArg(MCMessageList msgList) {
			//条件付き必須チェック
			checkSubReq(msgList);

			if (!isNull(up0().if_proc_typ()) && !MAC_IF_PROC_TYP.is_ac(up0().if_proc_typ())) {
				msgList.add(new MCMessage(PFBBL0003, up0().if_proc_typ()));
			}
			if(!isNull(up0().ext_sys_cd()) && !up0().web_api_flg()) {
				msgList.add(new MCMessage(PFBBL0004, up0().ext_sys_cd()));
			}

			if(!isNullOr(up0().if_proc_typ(), up0().ext_sys_cd())) {
				// シスパラ、ＩＦ通信ルールマスタの確認
				checkSubGaParm(msgList);
				// ＩＦアダプタマスタの確認
				checkSubAdpter(msgList);
			}
		}

		/** 条件付き必須チェック */
		protected void checkSubReq(MCMessageList msgList) {
			if(MAC_IF_PROC_TYP.isAC_PLN_ALC_AMT_RCV(up0().if_proc_typ())
					|| MAC_IF_PROC_TYP.isAC_ACT_ALC_AMT_RCV(up0().if_proc_typ())) {
				msgList.addAll(check(up0(), Recv_DtlR.$tgt_dt_fr, new FXUCL_RequiredValidater()));
				msgList.addAll(check(up0(), Recv_DtlR.$tgt_dt_to, new FXUCL_RequiredValidater()));
				msgList.addAll(check(up0(), Recv_DtlR.$calc_ctg_cd, new FXUCL_RequiredValidater()));
			}
		}

		/** ＩＦアダプタマスタのチェック */
		protected void checkSubAdpter(MCMessageList msgList) {
			PFT_SDRV_IF_R ifR = PFT_SDRV_IF_R.create();
			ifR.ext_sys_cd(up0().ext_sys_cd());
			ifR.if_proc_typ(up0().if_proc_typ());
			up0().web_api_ope(ifAdptrMgr().getWebApiOpe(ifR));
			if(isNull(up0().web_api_ope())) {
				msgList.add(new MCMessage(PFBBL0007, up0().if_proc_typ(), up0().ext_sys_cd()));
			}
		}

		/** パラメータのチェック */
		protected void checkSubGaParm(MCMessageList msgList) {
			Map<String, String> parm = getGaParmMap(up0());
			//GA_USERは必須
			if(isNull(parm.get(USER))) {
				msgList.add(new MCMessage(PFBBL0010, up0().ext_sys_cd()));
			}
			if(isNull(parm.get(MAC_IF_CTL_TYP.WEB_URL.value()))) {
				msgList.add(new MCMessage(PFBBL0006, up0().ext_sys_cd(), up0().if_proc_typ(), MAC_IF_CTL_TYP.WEB_URL.key()));
			}
			if(isNull(parm.get(REPORTID))) {
				msgList.add(new MCMessage(PFBBL0005, up0().if_proc_typ()));
			}
		}

		/** 下り電文の設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * Recv_Upd01オペレーション.<p>
	 *
	 * ＧＡのAPIを呼び出し、受信変換処理を実行する。<br>
	 */
	public class Recv_Upd01 extends PFBBL_GaService_MC_A.Recv_Upd01 {

		/** ロガー **/
		protected FXBAL_BatchLogger _logger = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				_logger = getConcurrentLogger();
				_logger.writeStartLog(PFBBL0001);
				pushStartLog(_logger);
				execMain();
			}
			catch (Exception ex) {
				handleEx(ex, _logger);
			}
			finally {
				if(_logger != null) {
					_logger.writeEndLog(PFBBL0002);
					pushEndLog(_logger);
					_logger.close();
				}
			}
		}

		/** メイン処理 */
		protected void execMain() {

			// チェック処理
			callThisChk01();
			throwUpdErr();

			// GA WebAPI呼び出し
			List<Map<String, String>> result = callWebApi();

			// 受信変換処理
			callRecvDataConvOpe(result);

		}

		/** チェックオペレーション呼び出し */
		protected void callThisChk01() {
			PFBBL_GaService.Recv_Chk01 o = PFBBL_GaService.crtRecv_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		/** 受信用WebAPI呼び出し */
		protected List<Map<String, String>> callWebApi() {
			return requestWebApi(up0());
		}

		/** 受信変換オペレーション呼び出し */
		protected void callRecvDataConvOpe(List<Map<String, String>> result) {
			if(result.isEmpty()) {
				return;
			}

			IfPFUDL_SendRecvIf_Conv03 ope = createConv03Operation(up0().web_api_ope());
			setUp0Parm(ope.up0());
			setUp1Parm((MCList<MCRow>)ope.up(1), result);
			ope.exec();
		}

		/** 受信変換オペレーションの上り電文（ヘッダ）を設定する */
		protected void setUp0Parm(MCList<SdrvDtlR> up0L) {
			SdrvDtlR up0 = up0L.add();
			up0.if_proc_typ(up0().if_proc_typ());
			up0.ext_sys_cd(up0().ext_sys_cd());
			up0.not_coopr_flg(true);
		}

		/** 受信変換オペレーションの上り電文（明細）を設定する */
		protected void setUp1Parm(MCList<MCRow> up1L, List<Map<String, String>> result) {
			MCStringValueSetter setter = new MCStringValueSetter("yyyy-MM-dd", null);
			setter.setListValues(up1L, Arrays.asList(up1L.getColumnPathArray()), result);
			up1L.addStringColumn("calc_ctg_cd", up0().calc_ctg_cd());
		}

		/** 例外処理 */
		protected void handleEx(Exception ex, FXBAL_BatchLogger logger) {
			MCException mcex;
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}
			if(logger != null) {
				logger.writeProcessLog(mcex);
			}
			throw mcex;
		}

	}

	/** ＧＡ AnalyticsServiceのWebApiを実行し、受信データを返す */
	protected List<Map<String, String>> requestWebApi(Recv_DtlR r) {
		MCSimpleRequester request = new MCSimpleRequester(getGaParmMap(r).get(MAC_IF_CTL_TYP.WEB_REQ_ID.value()));
		request.setMethod("POST");
		for (MAM_HTTP_HEADER_R hhr : httpHdrMgr().getHttpHeaderL(r)) {
			request.setHeader(hhr.http_header_nm(), hhr.http_header_val());
		}

		try {
			String responseBody = request.request(getRequestUrl(r), getRequestBody(r));
			return checkResponse(r, responseBody, request.getResponseCode());
		}
		catch (MCAppException ex) {
			throw ex;
		}
		catch (Exception ex) {
			throw new MCAppException(new MCMessage(PFBBL0009, ex.getMessage()));
		}

	}

	/** ステータスの確認と受信データの取得 */
	protected List<Map<String, String>> checkResponse(Recv_DtlR upR, String responseBody, int responseCode) {
		// httpステータス
		if (responseCode != 200) {
			throw new MCAppException(new MCMessage(PFBBL0008));
		}

		// {"Status":0,...,"Data":[{...},{...},],"Count":XX}
		JSON jsonConverter = PFUCL_AppSys.createJsonObj(upR.if_proc_typ());
		Map<String, Object> response = jsonConverter.toMap(responseBody);

		// GAステータス
		MCNumber status = response.get("Status") == null ? null: MCNumber.valueOf(response.get("Status").toString());
		if(isNull(status) || !status.isZero()) {
			throw new MCAppException(new MCMessage(PFBBL0008));
		}

		return convToMap(response.get("Data"));
	}

	/** ＧＡ連携用パラメータを取得する */
	protected Map<String, String> getGaParmMap(Recv_DtlR r) {
		if(object(CLAZZ)._gaParmMap == null || !isSame(object(CLAZZ)._extSysCd,r.ext_sys_cd())) {
			object(CLAZZ)._extSysCd = r.ext_sys_cd();
			MAM_EXT_SYS_USR_R extSysUsrR = getExtSysUsrNE(r.ext_sys_cd());
			if(extSysUsrR == null) {
				extSysUsrR = MAM_EXT_SYS_USR_R.create();
			}
			Map<String, String> m = new HashMap<>();
			m.put(LANG, nvl(extSysUsrR.ext_sys_str1(), "ja-JP"));
			m.put(USER, extSysUsrR.ext_sys_usr_cd());
			m.put(PASSWD, extSysUsrR.ext_sys_pass());
			m.put(COMPANY, getCo().co_cd());
			m.put(REPORTID, getReportId(r.if_proc_typ()));

			ifPrtclMgr().init(r.ext_sys_cd());
			m.put(MAC_IF_CTL_TYP.WEB_REQ_ID.value(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.WEB_REQ_ID, r.if_proc_typ()));
			m.put(MAC_IF_CTL_TYP.WEB_URL.value(), ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.WEB_URL, r.if_proc_typ()));

			object(CLAZZ)._gaParmMap = m;
		}
		return object(CLAZZ)._gaParmMap;
	}

	/** Web API にアクセスするためのURLを取得する */
	protected String getRequestUrl(Recv_DtlR r) {
		return getGaParmMap(r).get(MAC_IF_CTL_TYP.WEB_URL.value());
	}

	/** WebApi呼び出し用のリクエストBodyを取得する */
	protected String getRequestBody(Recv_DtlR r) {
		Map<String, String> parm = getGaParmMap(r);

		Map<String, Object> map = new LinkedHashMap<>();
		map.put("Company", parm.get(COMPANY));
		map.put("Lang", parm.get(LANG));
		map.put("UserID", parm.get(USER));
		map.put("Password", nvl(parm.get(PASSWD),""));
		map.put("IsEncrypted", false);
		map.put("ReportId", parm.get(REPORTID));
		map.put("Message", null);
		map.put("Data", getSrchCnd(r));

		return PFUCL_AppSys.createJsonObj(r.if_proc_typ()).toJson(map);
	}

	/** WebApi呼び出し時の検索条件を取得する */
	protected Map<String, Object> getSrchCnd(Recv_DtlR r) {
		Map<String, String> parm = getGaParmMap(r);

		Map<String, Object> cndMap = new LinkedHashMap<>();
		cndMap.put("Company", parm.get(COMPANY));
		cndMap.put("Lang", parm.get(LANG));
		cndMap.put("ReportId", Integer.parseInt(parm.get(REPORTID)));
		cndMap.put("Date1", isNull(r.tgt_dt_fr())? null: r.tgt_dt_fr().toString("yyyy-MM-dd"));
		cndMap.put("Date2", isNull(r.tgt_dt_to())? null: r.tgt_dt_to().toString("yyyy-MM-dd"));
		cndMap.put("Text1", r.budgetcode());

		return cndMap;
	}

	/** ＧＡ Analyticsで定義されたレポートID */
	protected String getReportId(String ifProcTyp) {
		if(MAC_IF_PROC_TYP.isAC_ACCOUNT_RECV(ifProcTyp)) {
			return RPTID_AC;
		}
		else if(MAC_IF_PROC_TYP.isAC_SUB_ACCOUNT_RECV(ifProcTyp)) {
			return RPTID_SUBAC;
		}
		else if(MAC_IF_PROC_TYP.isAC_AC_DPT_RECV(ifProcTyp)) {
			return RPTID_ACDPT;
		}
		else if(MAC_IF_PROC_TYP.isAC_PLN_ALC_AMT_RCV(ifProcTyp)) {
			return RPTID_BUDGET;
		}
		else if(MAC_IF_PROC_TYP.isAC_ACT_ALC_AMT_RCV(ifProcTyp)) {
			return RPTID_BALANCE;
		}
		else {
			return "";
		}
	}

	/** 小文字キーのMapに変換する */
	protected List<Map<String, String>> convToMap(Object data) {
		List<Map<String, Object>> srcMap = (List<Map<String, Object>>)data;
		List<Map<String, String>> destMap = new ArrayList<>();

		for(Map<String, Object> map: srcMap) {
			Map<String, String> m = new LinkedHashMap<>();
			map.entrySet().forEach(r -> m.put(r.getKey().toLowerCase(), r.getValue() == null ? null : r.getValue().toString()));
			destMap.add(m);
		}
		return destMap;
	}

	/** 受信変換オペレーションを生成する */
	protected IfPFUDL_SendRecvIf_Conv03 createConv03Operation(String ope) {
		String[] arr = ope.split("\\.");
		return createOperation(arr[0], arr[1], arr[2], IfPFUDL_SendRecvIf_Conv03.class);
	}

	//FMCB CUSTOM END
}