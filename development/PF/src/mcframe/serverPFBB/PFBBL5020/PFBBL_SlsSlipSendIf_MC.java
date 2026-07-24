package mcframe.serverPFBB.PFBBL5020;

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
import mcframe.commonCore.util.MCDataConvUtil.JSON;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.requester.MCSimpleRequester;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMA.dbc.MAM_ITM_R;
import mcframe.serverMB.dbc.MBT_SLS_SLIP_SND_IF_R;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import mcframe.commonPFBB.PFBBR5020.DtlR;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBBL_SlsSlipSendIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBBL_SlsSlipSendIf_MC extends PFBBL_SlsSlipSendIf_MC_A{
	//FMCB CUSTOM START
	// キャッシュ用
	protected static final Class<PFBBL_SlsSlipSendIf> CLAZZ = PFBBL_SlsSlipSendIf.class;

	// GAのAPI群
	protected static final String[] REQ_TYPE_SAVE;
	protected static final String[] REQ_TYPE_SRCH;
	protected static final String[] REQ_TYPE_DEL;
	static {
		REQ_TYPE_SAVE = new String[]{"1", "/save"};
	 	REQ_TYPE_SRCH = new String[]{"2", "/search"};
	 	REQ_TYPE_DEL = new String[]{"3", "/delete"};
	};

	/**
	 * SlsSlipSendIf_Conv01オペレーション.<p>
	 *
	 */
	public class SlsSlipSendIf_Conv01 extends PFBBL_SlsSlipSendIf_MC_A.SlsSlipSendIf_Conv01 {
		protected String _$srch_ac_dt = "srch_ac_dt";
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void setIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MBT_SLS_SLIP_SND_IF_R.class);
		}

		@Override
		protected void sendRequest(MCList<?> ifL) {
			bfrSendRequest(ifL);
			super.sendRequest(ifL);
			aftrSendRequest(ifL);
		}

		@Override
		protected String sendRequestSub(MCSimpleRequester req, String url, MCList<?> ifL) {
			java.util.function.Function<MCList<?>, Boolean> isDel = (lst) -> {
				for (MCRow r : lst) {
					if (!MAC_DATA_CRUD_TYP.isDEL(r.getStringNE("data_crud_typ"))) {
						return false;
					}
				}
				return true;
			};

			initItmCache(ifL);
			initGAMappingCols();

			int limit = getSendLimitSize();
			MCList<MCRow> saveL[] = new MCList[]{
				MCList.create(MCRow.class),		// 登録・訂正
				MCList.create(MCRow.class)			// 取消
			};
			
			String grpKey = MBT_SLS_SLIP_SND_IF_R.$sls_slip_no;
			MCList<?>[] reqGrp = ifL.groupList(grpKey);
			for (int i=0; i<reqGrp.length; i++) {
				MCList<?> reqL = reqGrp[i];
				if (isDel.apply(reqL)) {
					// 取消分
					saveL[0].addAll(reqL);
				}
				else {
					// 登録・訂正分
					saveL[1].addAll(reqL);
				}

				// 取消分の送信
				if (!saveL[0].isEmpty()) {
					if (limit > 0 && saveL[0].distinctNE(grpKey).size() >= limit || i == reqGrp.length - 1) {
						for (MCList<?> lst : saveL[0].groupList(grpKey)) {
							// 取消は事前に検索する必要あり（検索のレスポンスが必要）
							String res = sendRequestSrch(req, url, lst);
							if (!isNull(res)) {
								preRequestDel(res, lst);
							}
						}
						
						sendRequestDel(req, url, saveL[0]);
						saveL[0].clear();
					}
				}
				// 登録・訂正分の送信
				if (!saveL[1].isEmpty()) {
					if (limit > 0 && saveL[1].distinctNE(grpKey).size() >= limit || i == reqGrp.length - 1) {
						sendRequestSave(req, url, saveL[1]);
						saveL[1].clear();
					}
				}
			}
			
			// 戻り値は使用していないっぽいのでnullを返す
			return null;
		}
		
		/**
		 * リクエスト前処理
		 */
		protected void bfrSendRequest(MCList<?> ifL) {
			setLogKey(ifL);
			setSrchAcDt(ifL);
		}

		/**
		 * バッチログに必要なキーを設定する		
		 */
		protected void setLogKey(MCList<?> ifL) {
			saveMessagePool();
			MCMessagePool.clear();
			
			// バッチログ出力用に取得する
			MBT_SLS_SLIP_SND_IF_R t = MBT_SLS_SLIP_SND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(
				t.data_lno, t.data_no, t.batch_log_no, t.log_sub_key1, t.log_sub_key2
			);
			FXUCL_MCDbcCache<MBT_SLS_SLIP_SND_IF_R> cache = new FXUCL_MCDbcCache<MBT_SLS_SLIP_SND_IF_R>(
				bldr, ifL, MBT_SLS_SLIP_SND_IF_R.$data_lno
			);
			for (MCRow r : ifL) {
				MBT_SLS_SLIP_SND_IF_R ifR = cache.get(r.getNumberNE(MBT_SLS_SLIP_SND_IF_R.$data_lno));
				r.setValuesByName(
					ifR,
					MBT_SLS_SLIP_SND_IF_R.$batch_log_no,
					MBT_SLS_SLIP_SND_IF_R.$log_sub_key1,
					MBT_SLS_SLIP_SND_IF_R.$log_sub_key2
				 );
				 // ＩＦデータとバッチログを紐付ける
				 r.setParamIndex(ifR.log_sub_key1().intValue());
				 r.setParamRowIndex(ifR.log_sub_key2().intValue());
			}
		}
		
		/**
		 * search用の計上日を設定する
		 */
		protected void setSrchAcDt(MCList<?> ifL) {
			MCList<?> ifDelL = ifL.subList(
				r -> MAC_DATA_CRUD_TYP.isDEL(r.getStringNE(MBT_SLS_SLIP_SND_IF_R.$data_crud_typ)));
			if (ifDelL.isEmpty()) {
				return;
			}
			
			MBT_SLS_SLIP_SND_IF_R t = MBT_SLS_SLIP_SND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(
				t.data_lno, t.data_no,
				t.sls_slip_no, nvl(t.prov_act_no, t.sls_act_no).as("act_no"),
				t.ac_dt
			);
			bldr.setWhere(t.sls_slip_no.eq(bind("sls_slip_no")));
			
			MCList<MBT_SLS_SLIP_SND_IF_R> rlstL = MCList.create(MBT_SLS_SLIP_SND_IF_R.class);
			dbSelect("PFBBL5020_MBT_SLS_SLIP_SND_IF_S01", rlstL, bldr, ifDelL);
			
			String[] key = {
				MBT_SLS_SLIP_SND_IF_R.$sls_slip_no, MBT_SLS_SLIP_SND_IF_R.$act_no
			};
			MCIndexKey idx = rlstL.createIndex(key);
			for (MCList<?> ifGrpL : ifDelL.groupList(key)) {
				// 同一伝票のうち、データNOが一番小さい行を取得
				// 取得したデータよりひとつ前のデータNOの計上日を取得したいので
				ifGrpL.sort(SortType.ASC, MBT_SLS_SLIP_SND_IF_R.$data_no);
				MBT_SLS_SLIP_SND_IF_R ifR = MBT_SLS_SLIP_SND_IF_R.class.cast(ifGrpL.get(0));
			
				MCList<MBT_SLS_SLIP_SND_IF_R> lst =
					rlstL.subList(idx, ifR.sls_slip_no(), nvl(ifR.prov_act_no(), ifR.sls_act_no()));
				if (!isNull(lst)) {
					lst.sort(SortType.DESC, MBT_SLS_SLIP_SND_IF_R.$data_no);
					
					for (MBT_SLS_SLIP_SND_IF_R r : lst) {
						if (r.data_no().lt(ifR.data_no())) {
							ifGrpL.setDateNE(_$srch_ac_dt, r.ac_dt());
							break;
						}
					}
				}
			}
		}
		
		/**
		 * リクエスト後処理
		 */
		protected void aftrSendRequest(MCList<?> ifL) {
			addMsgPool();
			updIf(ifL);
		}
		
		/**
		 * 連携先でエラーが発生したことを通知するメッセージを追加する
		 */
		protected void addMsgPool() {
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			rollbackMessagePool();
			
			if (msgL.size() > 0) {
				getBatchLogger().writeDataLog(msgL);
				
				// GAでエラーがあったことを通知するためのメッセージ
				MCList<MCRow> lst = MCList.create(MCRow.class);
				for (MCMessage msg : msgL) {
					lst.add(msg.getCauseRow());
				}
				lst.distinctNE("sls_slip_no").forEach(r -> {
					MCMessagePool.add(
						r, null,
						PFBBL0101,
						r.getNumberNE("data_no"), r.getStringNE("sls_slip_no"),
						isNull(r.getStringNE("iv_no")) ? null : r.getStringNE("iv_no"),
						isNull(r.getStringNE("iv_no")) ? r.getStringNE("sls_act_no") : null,
						r.getStringNE("prov_act_no")
					);
				});
			}
		}
		
		/**
		 * 連携先でエラーが発生したIFレコードを更新する
		 */
		protected void updIf(MCList<?> ifL) {
			MCList<?> updL = ifL.subList(r -> r.getBooleanNE(MBT_SLS_SLIP_SND_IF_R.$snd_to_err_flg));
			if (updL.isEmpty()) {
				return;
			}
			
			// 連携先エラーフラグをオンにする
			MBT_SLS_SLIP_SND_IF_R t = MBT_SLS_SLIP_SND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.snd_to_err_flg);
			dbUpdateKey("PFBBL5020_MBT_SLS_SLIP_SND_IF_U01", updL, bldr);
		}

		/**
		 * GAのAPI「save」の送信上限数を取得する
		 */
		protected int getSendLimitSize() {
			// 複数伝票をまとめず伝票単位に送信する
			// 複数送信したうちのひとつでもエラーがあった場合、すべての伝票がエラー扱いになるので
			return MCConst.app.getInteger("PF.PFBBL5020.send_size", 1);
		}

		/**
		 * GAのAPI「save」を実行する
		 */
		protected String sendRequestSave(MCSimpleRequester req, String url, MCList<?> ifL) {
			// 登録・訂正は明細単位
			String saveUrl = url + REQ_TYPE_SAVE[1];
			String res = req.request(saveUrl, getRequestBody(REQ_TYPE_SAVE[0], ifL));
			checkResponse(REQ_TYPE_SAVE[0], res, ifL);
			return res;
		}

		/**
		 * GAのAPI「delete」を実行する
		 */
		protected String sendRequestDel(MCSimpleRequester req, String url, MCList<?> ifL) {
			MCList<?> ifDelL = ifL.subList(r -> !isNull(r.getStringNE("internalNo")));
			if (ifDelL.isEmpty()) {
				return null;
			}
			// 取消は伝票単位
			String delUrl =  url + REQ_TYPE_DEL[1];
			MCList<?> reqL = ifDelL.distinctNE(MBT_SLS_SLIP_SND_IF_R.$sls_slip_no);
			String res = req.request(delUrl, getRequestBody(REQ_TYPE_DEL[0], reqL));

			checkResponse(REQ_TYPE_DEL[0], res, ifDelL);
			return res;
		}

		/**
		 * GAのAPI 「delete」を実行する
		 */
		protected String sendRequestSrch(MCSimpleRequester req, String url, MCList<?> ifL) {
			// 検索は伝票単位
			String srchUrl =  url + REQ_TYPE_SRCH[1];
			MCList<?> reqL = ifL.distinctNE(MBT_SLS_SLIP_SND_IF_R.$sls_slip_no);
			String res = req.request(srchUrl, getRequestBody(REQ_TYPE_SRCH[0], reqL));
			
			if (checkResponse(REQ_TYPE_SRCH[0], res, ifL)) {
				return res;
			}
			
			return null;
		}

		/**
		 * GAのAPI「delete」の前処理
		 */
		protected void preRequestDel(String resb, MCList<?> ifL) {
			JSON jsonConverter = PFUCL_AppSys.createJsonObj(up0().get(0).if_proc_typ());
			Map<String, Object> response = jsonConverter.toMap(resb);

			MCIndexKey idx = ifL.createIndex(MBT_SLS_SLIP_SND_IF_R.$sls_slip_no);

			// search のレスポンスから、取消に必要な項目を取得する
			// convToMapのキー項目はすべて小文字なので、小文字でgetする
			List<Map<String, String>> res = convToMap(response.get("Data"));
			for (Map<String, String> map : res) {
				for (MCRow r : ifL.subList(idx, map.get("voucherno"))) {
					r.setStringNE("Dispid", map.get("dispid"));
					r.setStringNE("internalNo", map.get("header_internalno"));
					r.setStringNE("changeCount", map.get("header_changecount"));
					r.setStringNE("slipType", map.get("sliptype"));
				}
			}
		}

		/**
		 * GAのAPI呼出の共通パラメータを取得する
		 */
		protected Map<String, String> _gaParmMap;
		protected String _extSysCd;
		protected Map<String, String> getGaParmMap() {
			if(_gaParmMap == null || !isSame(_extSysCd, up0().get(0).ext_sys_cd())) {
				_extSysCd = up0().get(0).ext_sys_cd();
				MAM_EXT_SYS_USR_R extSysUsrR = getExtSysUsrNE(_extSysCd);
				if(extSysUsrR == null) {
					extSysUsrR = MAM_EXT_SYS_USR_R.create();
				}
				String userKey = PFUCL_AppSys.ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR2, up0().get(0).if_proc_typ());
				_gaParmMap = new HashMap<>();
				_gaParmMap.put("LANG", nvl(extSysUsrR.ext_sys_str1(), "ja-JP"));
				_gaParmMap.put("USER", extSysUsrR.ext_sys_usr_cd());
				_gaParmMap.put("PASSWD", extSysUsrR.ext_sys_pass());
				_gaParmMap.put("USERKEY", userKey);
				_gaParmMap.put("COMPANY", getCo().co_cd());
			}
			return _gaParmMap;
		}
		
		/**
		 * GAのAPI呼出のリクエストを取得する
		 */
		protected String getRequestBody(String reqTyp, MCList<?> ifL) {
			Map<String, Object> map = new LinkedHashMap<>();

			setRequestBodyCmn(map);
			
			if (isSame(reqTyp, REQ_TYPE_SAVE[0])) {
				setRequestBodySave(ifL, map);
			}
			else if (isSame(reqTyp, REQ_TYPE_SRCH[0])) {
				setRequestBodySrch(ifL, map);
			}
			else if (isSame(reqTyp, REQ_TYPE_DEL[0])) {
				setRequestBodyDel(ifL, map);
			}

			return PFUCL_AppSys.createJsonObj(up0().get(0).if_proc_typ()).toJson(map);
			
		}

		/**
		 * GAのAPI呼出のリクエストを設定する
		 */
		protected void setRequestBodyCmn(Map<String, Object> map) {
			map.put("Company", getGaParmMap().get("COMPANY"));
			map.put("Lang", getGaParmMap().get("LANG"));
			map.put("UserID", getGaParmMap().get("USER"));
			map.put("Password", nvl(getGaParmMap().get("PASSWD"),""));
			map.put("UserKey", getGaParmMap().get("USERKEY"));
		}

		/**
		 * GAのAPI「save」のリクエストを設定する		
		 */
		protected void setRequestBodySave(MCList<?> ifL, Map<String, Object> map) {
			java.util.function.BiFunction<String, Comparable<?>, LinkedHashMap<String, Object>> f = (key, val) -> {
				LinkedHashMap<String, Object> mp = new LinkedHashMap<>();
				mp.put("fieldName", key);
				mp.put("fieldID", key);
				mp.put("value", isNull(val) ? "" : val.toString());
				return mp;
			};
			
			MCList<DtlR> dtlL = getSaveData(ifL);
			List<LinkedHashMap<String, Object>> arr = new ArrayList<>();
			for (int i=0; i<dtlL.size(); i++) {

				List<LinkedHashMap<String, Object>> flds = new ArrayList<>();
				for (String col : dtlL.getColumnPathArray()) {
					flds.add(f.apply(col,  dtlL.get(i).getValue(col)));
				}

				LinkedHashMap<String, Object> m = new LinkedHashMap<>();
				m.put("lineNo", i + 1);
				m.put("values", flds.toArray());
				arr.add(m);
			}
			map.put("Data", arr.toArray());
		}
		
		/**
		 * GAのAPI「search」のリクエストを設定する
		 */
		protected void setRequestBodySrch(MCList<?> ifL, Map<String, Object> map) {
			List<LinkedHashMap<String, Object>> arr = new ArrayList<>();
			for (MCRow r : ifL) {
				MBT_SLS_SLIP_SND_IF_R ifR = MBT_SLS_SLIP_SND_IF_R.class.cast(r);
				LinkedHashMap<String, Object> m = new LinkedHashMap<>();
				m.put("fromInpDate", ifR.getDateNE(_$srch_ac_dt).toString("yyyy/MM/dd"));
				m.put("toInpDate", m.get("fromInpDate"));
				m.put("slipTypes", new String[]{"2"});		// 2：売上
				m.put("fromVoucherNo", ifR.sls_slip_no());
				m.put("toVoucherNo", m.get("fromVoucherNo"));
				arr.add(m);
			}
			map.put("Data", arr.toArray());
		}
		
		/**
		 * GAのAPI「delete」のリクエストを設定する
		 */
		protected void setRequestBodyDel(MCList<?> ifL, Map<String, Object> map) {
			List<LinkedHashMap<String, Object>> arr = new ArrayList<>();
			for (MCRow r : ifL) {
				MBT_SLS_SLIP_SND_IF_R ifR = MBT_SLS_SLIP_SND_IF_R.class.cast(r);
				LinkedHashMap<String, Object> m = new LinkedHashMap<>();
				m.put("Dispid", ifR.getStringNE("Dispid"));
				m.put("internalNo", ifR.getStringNE("internalNo"));
				m.put("voucherNo", ifR.sls_slip_no());
				m.put("changeCount", ifR.getStringNE("changeCount"));
				m.put("slipType", ifR.getStringNE("slipType"));
				arr.add(m);
			}
			map.put("forceFlag", "1");
			map.put("Data", arr.toArray());
		}

		/**
		 * ＩＦデータをGA項目にマッピングする
		 */
		protected MCList<DtlR> getSaveData(MCList<?> ifL) {
			MCList<DtlR> dtlL = MCList.create(DtlR.class);
			addAll(dtlL, ifL, new DtlR_MBT_SLS_SLIP_SND_IF_R());
			return dtlL;
		}
		public class DtlR_MBT_SLS_SLIP_SND_IF_R<D extends DtlR, S extends MBT_SLS_SLIP_SND_IF_R> extends MCRowMapper<D, S> {
			@Override
			protected void valueCopy(D dest, S src) {
				dest.inpDate(src.ac_dt().toString("yyyy/MM/dd"));
				dest.voucherNo(src.sls_slip_no());
				dest.correspType(1);		//	1：取引先
				dest.customerCode(isProv(src.trd_ptn_typ()) ? src.prsppl_cd() : src.cst_cd());
				dest.deptCode(isProv(src.trd_ptn_typ()) ? src.asst_dpt_cd() : src.bill_dpt_cd());
				dest.inchargeCode(nvl(src.usr_cd(), mcframe.serverCore.sys.MCSys.user.ID()));
				dest.ar_PatternCode(src.trd_cd());
				
				dest.currencyCode(src.trd_cur_cd());
				if (isNull(src.trd_cur_cd()) || isSame(src.trd_cur_cd(), src.base_cur_cd())) {
					dest.rateTypeCode(null);
					dest.rate(1);
				}
				else {
					dest.rateTypeCode(src.xrate_cd());
					dest.rate(src.xrate());
				}

				if (MAC_TAX_CALC_TYP.isSLIP(src.tax_calc_typ())) {
					dest.taxableCode(src.tax_cd());
					// 課税または免税（免税は課税0%として扱う）
					if (MAC_TAX_TYP.isTAX_ABL(src.tax_typ()) || MAC_TAX_TYP.isEX_XMPT(src.tax_typ())) {
						dest.taxType(src.inc_tax_flg() ? 0 : 1);
					}
					else {
						dest.taxType(2);		// 2：対象外
					}
				}
				else {
					dest.taxableCode(null);
					dest.taxType(2);		// 2：対象外
				}
				dest.settleMethod(src.ar_sttl_cd());
				dest.dueDate(src.rcv_schd_dt().toString("yyyy/MM/dd"));
				dest.journalType(0);		// 0：仕訳対象
				dest.invoiceNo(nullValToNull(src.iv_no()));

				dest.rowNo(src.sls_slip_lno());

				if (isXpns(src)) {
					dest.detailType(1);		// 1：諸掛
				}
				else {
					dest.detailType(0);		// 0：品目
				}
				dest.detail_DeptCode(src.dpt_cd());
				
				// 品目
				MAM_ITM_R itmR = getItmCache(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
				if (isSame(dest.detailType(), 0)) {
					MCNumber pm = getQtyPm(src.trd_ptn_typ(), itmR.dscnt_itm_flg(), src.dtl_dscnt_flg());
					dest.warehouse(getSysParm("GA_WH_CD"));
					dest.goodsCode(src.itm_jnl_cd());
					dest.chargesCode(null);
					dest.unitType(0);
					dest.unitPrice(src.dtl_dscnt_flg() ? src.trd_cur_dscnt_amt() : src.trd_cur_upri());
					if (isProv(src.trd_ptn_typ())) {
						dest.qty_Minus(src.base_unit_qty().multiply(pm));
					}
					else {
						dest.qty_Minus(src.trd_unit_qty().multiply(pm));
					}
				}
				// 諸掛
				else {
					dest.warehouse(null);
					dest.goodsCode(null);
					dest.chargesCode(src.itm_jnl_cd());
					dest.unitType(null);
					dest.unitPrice(null);
					dest.qty_Minus(null);
					dest.packingUnitCode(null);
					dest.packingUnitPrice(null);
					dest.packingUnitQty(null);
				}

				if (!isNull(dest.taxableCode())) {
					dest.detail_TaxableCode(null);
					dest.detail_TaxType(2);		// 2：対象外
				}
				else {
					dest.detail_TaxableCode(src.tax_cd());
					// 課税または免税（免税は課税0%として扱う）
					if (MAC_TAX_TYP.isTAX_ABL(src.tax_typ()) || MAC_TAX_TYP.isEX_XMPT(src.tax_typ())) {
						dest.detail_TaxType(src.inc_tax_flg() ? 0 : 1);
					}
					else {
						dest.detail_TaxType(2);		// 2：対象外
					}
				}

				MCNumber pm = getAmtPm(src.trd_ptn_typ(), itmR.dscnt_itm_flg(), src.dtl_dscnt_flg());
				if (src.dtl_dscnt_flg()) {
					dest.inpAmount_Fc(src.trd_cur_dscnt_amt().multiply(pm));
					dest.taxAmount_Fc(0);
					dest.taxableAmount_Fc(src.trd_cur_dscnt_amt().multiply(pm));
					dest.inpAmount_Sc(src.base_cur_dscnt_amt().multiply(pm));
					dest.taxAmount_Sc(0);
					dest.taxableAmount_Sc(src.base_cur_dscnt_amt().multiply(pm));
				}
				else {
					dest.inpAmount_Fc(sum(src.trd_cur_amt(), src.trd_cur_tax_amt()).multiply(pm));
					dest.taxAmount_Fc(src.trd_cur_tax_amt().multiply(pm));
					dest.taxableAmount_Fc(src.trd_cur_amt().multiply(pm));
					dest.inpAmount_Sc(sum(src.base_cur_amt(), src.base_cur_tax_amt()).multiply(pm));
					dest.taxAmount_Sc(src.base_cur_tax_amt().multiply(pm));
					dest.taxableAmount_Sc(src.base_cur_amt().multiply(pm));
				}
				
				src.setStringNE("act_no_s",
					isProv(src.trd_ptn_typ()) ?
						src.prov_act_no() + "-" + src.prov_act_rev().toString() :
						src.sls_act_no() + "-" + src.sls_act_rev().toString()
				);
				src.setStringNE("act_d_no_s", isProv(src.trd_ptn_typ()) ? null : src.sls_act_d_no());
				src.setStringNE("itm_cd_s", toDispItm(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3()));
				
				// リソース設定に従って、GA項目にマッピングする
				_gaMappingCols.entrySet().forEach(e -> {
					dest.setValueNE(e.getKey(), src.getValueNE(e.getValue()));
				});
			}
			protected boolean isProv(String trdPtnTyp) {
				return
					MAC_TRD_PTN_TYP.isPROV(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isPROV_RTN(trdPtnTyp);
			}
			protected MCNumber getQtyPm(String trdPtnTyp, boolean dscntItmFlg, boolean dtlDscntFlg) {
				return getAmtPm(trdPtnTyp, dscntItmFlg, dtlDscntFlg);
			}
			protected MCNumber getAmtPm(String trdPtnTyp, boolean dscntItmFlg, boolean dtlDscntFlg) {
				MCNumber pm = MAUCL_TrdUtil.getAmtDispPm(trdPtnTyp, dscntItmFlg);
				if (dtlDscntFlg) {
					pm = pm.multiply(-1);
				}
				return pm;
			} 
			protected boolean isXpns(MBT_SLS_SLIP_SND_IF_R src) {
				// 常に品目で連携する
				return false;
			}
		}

		/**
		 * GAのAPIのレスポンスをチェックする
		 */
		protected boolean checkResponse(String reqTyp, String resb, MCList<?> ifL) {

			JSON jsonConverter = PFUCL_AppSys.createJsonObj(up0().get(0).if_proc_typ());
			Map<String, Object> response = jsonConverter.toMap(resb);

			// GAステータス
			MCNumber status = response.get("Status") == null ? null: MCNumber.valueOf(response.get("Status").toString());

			boolean ret = true;
			if (isSame(reqTyp, REQ_TYPE_SAVE[0])) {
				ret = checkResponseSave(status, response, ifL);
			}
			else if (isSame(reqTyp, REQ_TYPE_SRCH[0])) {
				ret = checkResponseSrch(status, response, ifL);
			}
			else if (isSame(reqTyp, REQ_TYPE_DEL[0])) {
				ret = checkResponseDel(status, response, ifL);
			}
			
			if (!ret) {
				// 他の伝票のエラーに巻き込まれて反映できなかった伝票の扱い
				// 伝票内の明細すべてにメッセージを紐付け、送信先エラーフラグをオンにする
				MCIndexKey idx = ifL.createIndex(
					MBT_SLS_SLIP_SND_IF_R.$sls_slip_no, MBT_SLS_SLIP_SND_IF_R.$snd_to_err_flg
				);
				for (MCList<?> lst : ifL.groupList(MBT_SLS_SLIP_SND_IF_R.$sls_slip_no)) {
					MBT_SLS_SLIP_SND_IF_R ifR = MBT_SLS_SLIP_SND_IF_R.class.cast(lst.get(0));
					
					// 伝票内に送信先エラーが含まれていない伝票のみ対象
					if (isNull(ifL.getFirst(idx, ifR.sls_slip_no(), true))) {
						for (MCRow r : lst) {
							ifR = MBT_SLS_SLIP_SND_IF_R.class.cast(r);
							MCMessagePool.add(
								ifR, null,
								PFBBL0104,
								ifR.data_no(), ifR.sls_slip_no(),
								isNull(ifR.iv_no()) ? null : ifR.iv_no(),
								isNull(ifR.iv_no()) ? ifR.sls_act_no() : null,
								ifR.prov_act_no()
							);
							ifR.snd_to_err_flg(true);
						}
					}
				}
			}
			
			// true：エラー（警告）なし ／ false：エラー（警告）あり
			return ret;
		}
		
		/**
		 * GAのAPI「save」のレスポンスをチェックする
		 */
		protected boolean checkResponseSave(MCNumber status, Map<String, Object> response, MCList<?> ifL) {
			
			if ( !(isNull(status) || !status.isZero()) ) {
				return true;	// エラー（警告）なし
			}
			
			List<Map<String, String>> res = new ArrayList<>();
			if (response.containsKey("SaveStatusDetail")) {
				res.addAll(convToMap(response.get("SaveStatusDetail")));
			}
			
			// レスポンス解析後のマップのキー項目は小文字で統一する（convToMap のキー項目は小文字で統一されているので）
			for (Map<String, String> m : res) {
				if (!m.containsKey("errordetail")) {
					continue;
				}
					
				// 以下のようなメッセージが対象（他にもある）
				// ErrorDetail: "承認済ﾃﾞｰﾀのため、変更できません｡（E001744）"
				// ErrorDetail: "必須項目のため、入力が必要です｡（E001007）"
				// ErrorDetail: "存在しないコードが入力されています｡（E001014）"
				StringBuffer msg = new StringBuffer(m.get("errordetail").toString());
				if (m.containsKey("itemname")) {
					msg.append(System.lineSeparator());
					msg.append("ItemName:" + m.get("itemname"));
				}

				// メッセージに紐付けるロウを特定する
				// メッセージに行情報がなかったり、あっても不正な場合は全てのロウを紐付ける
				MCList<MCRow> bindL = MCList.create(MCRow.class);
				MCNumber idx = null;
				try {
					if (m.containsKey("recordkey")) {
						// RecordKey: "Row = 1"
						idx = MCNumber.valueOf(m.get("recordkey").split("=")[1].trim());
						bindL.add(ifL.get(idx.intValue() - 1));
					}
				}
				finally {
					if (isNull(idx)) {
						bindL.addAll(ifL);
					}
				}
				
				bindL.forEach(bindR -> {
					MCMessagePool.add(bindR, null, PFBBL0102, msg);
					bindR.setBooleanNE(MBT_SLS_SLIP_SND_IF_R.$snd_to_err_flg, true);
				});
			}
			
			if (response.containsKey("Message")) {
				ifL.forEach(bindR -> {
					// {"Message":"License information not found.","Status":10}
					// {"Message":"Operator ID or Password setting is wrong.","Status":10}
					// {"Message":"Userkey - 設定に誤りがあります｡（E001102）","Status":11}
					MCMessagePool.add(bindR, null, PFBBL0102, response.get("Message").toString());
					bindR.setBooleanNE(MBT_SLS_SLIP_SND_IF_R.$snd_to_err_flg, true);
				});
			}
			
			return false;	// エラー（警告）あり
		}

		/**
		 * GAのAPI「search」のレスポンスをチェックする
		 */
		protected boolean checkResponseSrch(MCNumber status, Map<String, Object> response, MCList<?> ifL) {
			
			if (!response.containsKey("Message")) {
				return true;	// エラー（警告）なし
			}
			
			ifL.forEach(bindR -> {
				// Message: "設定されたデータは存在しません｡（E001000）"
				MCMessagePool.add(bindR, null, PFBBL0102, response.get("Message").toString());
				bindR.setBooleanNE(MBT_SLS_SLIP_SND_IF_R.$snd_to_err_flg, true);
			});
			
			return false;	// エラー（警告）あり
		}
		
		/**
		 * GAのAPI「delete」のレスポンスをチェックする
		 */
		protected boolean checkResponseDel(MCNumber status, Map<String, Object> response, MCList<?> ifL) {
			
			if ( !(isNull(status) || !status.isZero()) ) {
				return true;	// エラー（警告）なし
			}
			
			List<Map<String, String>> res = new ArrayList<>();
			if (response.containsKey("StatusDetail")) {
				res.addAll(convToMap(response.get("StatusDetail")));
			}
			
			// レスポンス解析後のマップのキー項目は小文字で統一する（convToMap のキー項目は小文字で統一されているので）
			for (Map<String, String> m : res) {
				if (!m.containsKey("message")) {
					continue;
				}
				
				// Message: "データが承認済のため、削除できません。（E001107）"
				StringBuffer msg = new StringBuffer(m.get("message").toString());
				if (m.containsKey("itemname")) {
					msg.append(System.lineSeparator());
					msg.append("ItemName:" + m.get("itemname"));
				}
				ifL.forEach(bindR -> {
					MCMessagePool.add(bindR, null, PFBBL0102, msg);
					bindR.setBooleanNE(MBT_SLS_SLIP_SND_IF_R.$snd_to_err_flg, true);
				});
			}
			
			if (response.containsKey("Message")) {
				ifL.forEach(bindR -> {
					// {"Message":"License information not found.","Status":10}
					// {"Message":"Operator ID or Password setting is wrong.","Status":10}
					// {"Message":"Userkey - 設定に誤りがあります｡（E001102）","Status":11}
					MCMessagePool.add(bindR, null, PFBBL0102, response.get("Message").toString());
					bindR.setBooleanNE(MBT_SLS_SLIP_SND_IF_R.$snd_to_err_flg, true);
				});
			}
			
			return false;	// エラー（警告）あり
		}
	}

	/**
	 * 品目マスタキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
	protected void initItmCache(MCList<?> cndL) {
		object(CLAZZ)._itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
			MCQueryApiBuilder.create(
				MAM_ITM_R.create("T")),
				cndL,
				MBT_SLS_SLIP_SND_IF_R.$itm_cd, 
				MBT_SLS_SLIP_SND_IF_R.$itm_sub1,
				MBT_SLS_SLIP_SND_IF_R.$itm_sub2,
				MBT_SLS_SLIP_SND_IF_R.$itm_sub3
			);
	}
	protected MAM_ITM_R getItmCache(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
	}
	
	/**
	 * GAに連携する項目のマッピング情報をキャッシュ
	 */
	protected Map<String, String> _gaMappingCols;
	protected void initGAMappingCols() {
		_gaMappingCols = new LinkedHashMap<>();
		for (String col : MCConst.app.findPattern(MCConst.createKey("PF.PFBBL5020.mapping_cols", "*"))) {
			if (!_gaMappingCols.containsKey(col)) {
				// key：GA側の項目
				// value：７側の項目
				String[] keys = MCConst.splitKey(col);
				_gaMappingCols.put(keys[keys.length-1], MCConst.app.getString(col));
			}
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

	//FMCB CUSTOM END
}