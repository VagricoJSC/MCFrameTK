package mcframe.serverPFBB.PFBBL5010;

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
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

import mcframe.commonPFBB.PFBBR5010.*;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import mcframe.serverCore.requester.MCSimpleRequester;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.commonCore.util.MCDataConvUtil.JSON;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBBL_JournalGlSendIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBBL_JournalGlSendIf_MC extends PFBBL_JournalGlSendIf_MC_A{
	//FMCB CUSTOM START

	// ＧＡ 仕訳伝票用IMPORTID
	protected static final String _IMPORTID_GL = "103";

	// キャッシュ用
	protected static final Class<PFBBL_JournalGlSendIf> CLAZZ = PFBBL_JournalGlSendIf.class;
	
	protected MCList<MAM_ACCOUNT_R> _acL;
	protected MCIndexKey _acKey;

	/**
	 * GlIf_Conv01オペレーション.<p>
	 *
	 */
	public class GlIf_Conv01 extends PFBBL_JournalGlSendIf_MC_A.GlIf_Conv01 {

		protected Map<String, String> _gaParmMap;
		protected String _extSysCd;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void setIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MBT_JOURNAL_SND_IF_R.class);
		}

		@Override
		protected void sendRequest(MCList<?> ifL) {
			bfrSendRequest(ifL);
			super.sendRequest(ifL);
		}

		protected void bfrSendRequest(MCList<?> ifL) {
			// バッチログに必要なキーを設定する
			getConcurrentLogger().setLogKey(ifL, MBT_JOURNAL_SND_IF_R.$batch_log_no,
					MBT_JOURNAL_SND_IF_R.$log_sub_key1, MBT_JOURNAL_SND_IF_R.$log_sub_key2);
			ifL.forEach(ifR -> {
				ifR.setParamIndex(
						ifR.getNumber(MBT_JOURNAL_SND_IF_R.$log_sub_key1).intValue());
				ifR.setParamRowIndex(
						ifR.getNumber(MBT_JOURNAL_SND_IF_R.$log_sub_key2).intValue());
			});
			MBT_JOURNAL_SND_IF_R t = MBT_JOURNAL_SND_IF_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
			dbUpdateKey("PFBBL5010_MBT_JOURNAL_SND_IF_U01", ifL, bldr);
		}

		@Override
		protected String sendRequestSub(MCSimpleRequester r, String url, MCList<?> ifL) {
			String resb = null;
			for (MCList<?> list: getRequestGroupList(ifL)) {
				resb = super.sendRequestSub(r, url, list);
				int resi = r.getResponseCode();
				checkResponseStatus(up0().get(0), resb, resi, ifL);
			}
			return resb;
		}

		/**分割して送信*/
		protected List<MCList<?>> getRequestGroupList(MCList<?> ifL) {
			int limit = MCConst.app.getInteger("PF.PFBBL5010.gl.send_size", 5000);
			List<MCList<?>> ret = new ArrayList<>();
			if (limit <= 0 || limit >= ifL.size()) {
				ret.add(ifL);
				return ret;
			}

			ifL.sort(MBT_JOURNAL_SND_IF_R.$ac_ym,
					MBT_JOURNAL_SND_IF_R.$ac_if_typ,
					MBT_JOURNAL_SND_IF_R.$slip_cnt_id,
					MBT_JOURNAL_SND_IF_R.$jnl_no,
					MBT_JOURNAL_SND_IF_R.$dc_typ, MBT_JOURNAL_SND_IF_R.$jnl_no_seq);

			MCList<MCRow> temp = MCList.create(MCRow.class);
			int cnt = 0;
			String  preJnlNo = null;
			for (int i = 0; i < ifL.size(); i++) {
				MCRow r = ifL.get(i);
				if(cnt >= limit && !isSame(preJnlNo, r.getString(MBT_JOURNAL_SND_IF_R.$jnl_no))) {
					MCList<MCRow> l= temp.createInstance();
					l.setAll(temp);
					ret.add(l);
					temp.clear();
					cnt = 0;
				}

				temp.add(r);
				cnt++;
				preJnlNo = r.getString(MBT_JOURNAL_SND_IF_R.$jnl_no);

				if(i == ifL.size() - 1) {
					MCList<MCRow> l= temp.createInstance();
					l.setAll(temp);
					ret.add(l);
					temp.clear();
				}
			}
			return ret;
		}

		@Override
		protected String convertMCDBtoJson(MCList<?> ifL) {
			MCList<DtlR> dtlL = MCList.create(DtlR.class);
			addAll(dtlL, ifL, new DtlR_MBT_JOURNAL_SND_IF_R());
			return getRequestBody(up0().get(0), ifL, dtlL);
		}

		protected void checkResponseStatus(SdrvDtlR r, String resb, int resi, MCList<?> _ifL) {
			JSON jsonConverter = PFUCL_AppSys.createJsonObj(r.if_proc_typ());
			Map<String, Object> m = jsonConverter.toMap(resb);
			// GAステータス
			MCNumber status = m.get("Status") == null ? null
					: MCNumber.valueOf(m.get("Status").toString());

			if (!(isNull(status) || status.isZero())) {
				if (m.containsKey("Message")) {
					getConcurrentLogger().writeProcessLog(PFBBL0008, m.get("Message"));
				}
				if (m.containsKey("SaveStatus")) {
					getConcurrentLogger().writeProcessLog(PFBBL0008, m.get("SaveStatus"));
				}
				if (m.containsKey("SaveStatusDetail")) {
					checkResponseStatusSub(r, resb, resi, _ifL, m.get("SaveStatusDetail"));
				}
			}
		}

		protected void checkResponseStatusSub(SdrvDtlR r, String resb, int resi,
				MCList<?> _ifL, Object data) {
			List<Map<String, String>> dtlList = convToMap(data);

			for (Map<String, String> dtl : dtlList) {
				if (!dtl.containsKey("errordetail")) {
					continue;
				}
				StringBuffer sb = new StringBuffer(dtl.get("errordetail").toString());
				MCRow bindR = null;
				if (dtl.containsKey("itemname")) {
					if (!isNull(dtl.get("itemname"))) {
						sb.append(System.lineSeparator());
						sb.append("ItemName:" + dtl.get("itemname"));
					}
				}
				if (dtl.containsKey("recordkey")) {
					try {
						String[] key = dtl.get("recordkey").split("=");
						if (key.length > 1) {
							MCNumber idx = MCNumber.valueOf(key[1].trim());
							bindR = _ifL.get(idx.intValue());
						}
					}
					catch (MCException ex) {
						MCLog.write(ex);
					}
				}
				getConcurrentLogger().writeDataLog(bindR, PFBBL0102, sb);
			}
		}

		/** 小文字キーのMapに変換する */
		protected List<Map<String, String>> convToMap(Object data) {
			List<Map<String, Object>> srcMap = (List<Map<String, Object>>) data;
			List<Map<String, String>> destMap = new ArrayList<>();

			for (Map<String, Object> map : srcMap) {
				Map<String, String> m = new LinkedHashMap<>();
				map.entrySet().forEach(r -> m.put(r.getKey().toLowerCase(),
						r.getValue() == null ? null : r.getValue().toString()));
				destMap.add(m);
			}
			return destMap;
		}

		protected Map<String, String> getGaParmMap() {
			if(_gaParmMap == null || !isSame(_extSysCd,up0().get(0).ext_sys_cd())) {
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
				_gaParmMap.put("IMPORTID", _IMPORTID_GL);
			}
			return _gaParmMap;
		}

		protected String getRequestBody(SdrvDtlR up, MCList<?> ifL, MCList<DtlR> dtlL) {
			Map<String, Object> map = new LinkedHashMap<>();
			map.put("Company", getGaParmMap().get("COMPANY"));
			map.put("Lang", getGaParmMap().get("LANG"));
			map.put("UserID", getGaParmMap().get("USER"));
			map.put("Password", nvl(getGaParmMap().get("PASSWD"),""));
			map.put("UserKey", getGaParmMap().get("USERKEY"));
			map.put("ImportId", getGaParmMap().get("IMPORTID"));
			//map.put("ImportCode", "");
			map.put("Data", getData(ifL, dtlL));

			return PFUCL_AppSys.createJsonObj(up.if_proc_typ()).toJson(map);
		}

		protected LinkedHashMap<String, Object>[] getData(MCList<?> ifL, MCList<DtlR> dtlL) {
			List<LinkedHashMap<String, Object>> data = new ArrayList<>();
			String[] ca = dtlL.getColumnPathArray();
			for (int i = 0; i < dtlL.size(); i++) {
				Map<String, Object>[] ml = new LinkedHashMap[ca.length];
				DtlR s = dtlL.get(i);
				for (int j = 0; j < ca.length; j++) {
					Map<String, Object> m = new LinkedHashMap<>();
					m.put("fieldName", ca[j]);
					Comparable<?> v = s.getValue(ca[j]);
					m.put("value", isNull(v)? "": v.toString());
					ml[j] = m;
				}
				LinkedHashMap<String, Object> line = new LinkedHashMap<String, Object>();
				line.put("lineNo", (Object) i);
				line.put("values", ml);
				data.add(line);
			}
			return data.toArray(new LinkedHashMap[data.size()]);
		}

	}

	protected void initAcCache() {
		MCList<MAM_ACCOUNT_R> dbc = MCList.create(MAM_ACCOUNT_R.class);
		MAM_ACCOUNT_R t = MAM_ACCOUNT_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.ac_cd, t.ac_typ1);
		dbSelect("PFBBL5010_MAM_ACCOUNT_S01", dbc, dbc_bldr);

		object(CLAZZ)._acL = dbc;
		object(CLAZZ)._acKey = object(CLAZZ)._acL.createIndex(MAM_ACCOUNT_R.$ac_cd);
	}

	protected MAM_ACCOUNT_R getAcR(String acCd) {
		if (object(CLAZZ)._acL == null) {
			initAcCache();
		}
		return object(CLAZZ)._acL.getFirst(object(CLAZZ)._acKey, acCd);
	}

	public class DtlR_MBT_JOURNAL_SND_IF_R<D extends DtlR, S extends MBT_JOURNAL_SND_IF_R> extends MCRowMapper<D, S> {

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$header_descriptname, MBT_JOURNAL_SND_IF_R.$abstract1);
			addColumnPathMap(DtlR.$inchargecode, MBT_JOURNAL_SND_IF_R.$usr_cd);
			addColumnPathMap(DtlR.$accode, MBT_JOURNAL_SND_IF_R.$ac_cd);
			addColumnPathMap(DtlR.$subcode, MBT_JOURNAL_SND_IF_R.$sub_ac_cd);
			addColumnPathMap(DtlR.$deptcode, MBT_JOURNAL_SND_IF_R.$dpt_cd);
			addColumnPathMap(DtlR.$correspcode, MBT_JOURNAL_SND_IF_R.$bp_cd);
			addColumnPathMap(DtlR.$detail_descriptname, MBT_JOURNAL_SND_IF_R.$abstract2);
			addColumnPathMap(DtlR.$detail_usermaster1, MBT_JOURNAL_SND_IF_R.$summary_cd1);
			addColumnPathMap(DtlR.$detail_usermaster2, MBT_JOURNAL_SND_IF_R.$summary_cd2);
			addColumnPathMap(DtlR.$detail_usermaster3, MBT_JOURNAL_SND_IF_R.$summary_cd3);
			addColumnPathMap(DtlR.$detail_usermaster4, MBT_JOURNAL_SND_IF_R.$summary_cd4);
			addColumnPathMap(DtlR.$detail_usermaster5, MBT_JOURNAL_SND_IF_R.$summary_cd5);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.voucherno(src.slip_cnt_id() + src.ac_ym().toString("yyMM") + src.jnl_no());
			dest.inpdate(src.ac_dt().toString("yyyy/MM/dd"));
			dest.datalevel(1);
			dest.drcrtype(MAC_DC_TYP.isCR(src.dc_typ()) ? 0 : 1);
			MAM_ACCOUNT_R acR = getAcR(src.ac_cd());

			if (!isSame(acR.ac_typ1(), "1")) {
				dest.taxablecode(null);
				dest.taxtype(2);
			}
			else {
				dest.taxablecode(src.tax_cd());
				if(!isNull(src.tax_typ())) {
					if("023568".indexOf(src.tax_typ()) > -1) {
						dest.taxtype(2);
					}
					else {
						dest.taxtype("ABCD".indexOf(src.tax_typ()) > -1 ? 1 : 0);
					}
				}
			}

			dest.currencycode(nvl(src.trd_cur_cd(), src.base_cur_cd()));
			if (isNull(src.trd_cur_cd()) || isSame(src.trd_cur_cd(), src.base_cur_cd())) {
				dest.ratetype(null);
				dest.rate(1);
			}
			else {
				dest.ratetype(src.xrate_cd());
				dest.rate(src.xrate());
			}

			//入力金額 基準金額
			dest.inpamount_fc(isNull(src.trd_cur_cd())? src.base_cur_amt(): src.trd_cur_amt());
			dest.inpamount_sc(src.base_cur_amt());
			if (!isSame(acR.ac_typ1(), "1")) {
				// 課税対象外
				dest.taxamount_fc(0);
				dest.taxableamount_fc(0);
				dest.taxamount_sc(0);
				dest.taxableamount_sc(0);
			}
			else {
				// 入力税額 基準税額
				dest.taxamount_fc(isNull(src.trd_cur_cd())? src.base_cur_tax_amt(): src.trd_cur_tax_amt());
				dest.taxamount_sc(src.base_cur_tax_amt());
				// 入力税対象金額
				if (isSame(dest.taxtype(), 0)) {
					// 内税
					dest.taxableamount_fc(isNull(src.trd_cur_cd())? src.base_cur_sum_amt(): src.trd_cur_sum_amt());
					dest.taxableamount_sc(src.base_cur_sum_amt());
				}
				else {
					// 外税
					dest.taxableamount_fc(isNull(src.trd_cur_cd())? src.base_cur_amt(): src.trd_cur_amt());
					dest.taxableamount_sc(src.base_cur_amt());
				}				
			}

		}

	}

	//FMCB CUSTOM END
}