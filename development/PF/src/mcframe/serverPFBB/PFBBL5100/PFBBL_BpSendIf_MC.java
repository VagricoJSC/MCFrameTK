package mcframe.serverPFBB.PFBBL5100;

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
import mcframe.commonPFBB.PFBBR5100.*;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
import mcframe.serverCore.requester.MCSimpleRequester;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheCW;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import mcframe.commonCore.util.MCDataConvUtil.JSON;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBBL_BpSendIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBBL_BpSendIf_MC extends PFBBL_BpSendIf_MC_A{
	//FMCB CUSTOM START

	// キャッシュ用
	protected static final Class<PFBBL_BpSendIf> CLAZZ = PFBBL_BpSendIf.class;

	/** ＧＡ 取引先マスタ用IMPORTID */
	protected static final String _IMPORTID_BP = "504";
	/** 取引先区分 1:仕入先（発注先） */
	protected static final int _CORRESPTYPE_SPPL = 1;
	/** 取引先区分 2:顧客（得意先） */
	protected static final int _CORRESPTYPE_CST = 2;
	/** 取引先区分 3:顧客兼仕入先 */
	protected static final int _CORRESPTYPE_COM = 3;
	/** GA通常日付の最大値：28 */
	protected static final int GA_MAX_NORMAL_DATE = 28;
	/** GA月末日：31 */
	protected static final int GA_END_MONTH_DATE = 31;

	protected MCList<MAM_BP_R> _bpL;

	protected MCIndexKey _bpKey;
	protected Map<String, String> _gaParmMap;
	protected String _extSysCd;

	/**
	 * BpCstIf_Conv01オペレーション.<p>
	 *
	 */
	public class BpCstIf_Conv01 extends PFBBL_BpSendIf_MC_A.BpCstIf_Conv01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void setIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MBT_BP_SND_IF_R.class);
		}
		
		@Override
		protected void post() {
			setExeStsSkp(up0().get(0).data_no(), MAC_MASTER_TYP.CST.value());
			super.post();
		}

		@Override
		protected void sendRequest(MCList<?> ifL) {
			bfrSendRequest(ifL);
			super.sendRequest(ifL);
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
			int limit = MCConst.app.getInteger("PF.PFBBL5100.cst.send_size", 5000);
			return getRequestGroupListCom(ifL, limit);
		}

		@Override
		protected String convertMCDBtoJson(MCList<?> ifL) {
			initGAMappingCols("PF.PFBBL5100.cst.mapping_cols");
			initBpCache(ifL);
			initRcvSchdCtl();
			MCList<DtlR> dtlL = MCList.create(DtlR.class);
			addAll(dtlL, ifL, new CST_DtlR_MBT_BP_SND_IF_R());
			return getRequestBody(up0().get(0), ifL, dtlL);
		}

	}

	/**
	 * BpSpplIf_Conv01オペレーション.<p>
	 *
	 */
	public class BpSpplIf_Conv01 extends PFBBL_BpSendIf_MC_A.BpSpplIf_Conv01 {


		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void setIfDBC() {
			_ifDBC = PFBZL_CodeConvert.crtRecvIfDBContainer(MBT_BP_SND_IF_R.class);
		}
		
		@Override
		protected void post() {
			setExeStsSkp(up0().get(0).data_no(), MAC_MASTER_TYP.SPL.value());
			super.post();
		}

		@Override
		protected void sendRequest(MCList<?> ifL) {
			bfrSendRequest(ifL);
			super.sendRequest(ifL);
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
			int limit = MCConst.app.getInteger("PF.PFBBL5100.sppl.send_size", 5000);
			return getRequestGroupListCom(ifL, limit);
		}

		@Override
		protected String convertMCDBtoJson(MCList<?> ifL) {
			initGAMappingCols("PF.PFBBL5100.sppl.mapping_cols");
			initBpCache(ifL);
			initPaySchdCtl();
			MCList<DtlR> dtlL = MCList.create(DtlR.class);
			addAll(dtlL, ifL, new SPPL_DtlR_MBT_BP_SND_IF_R());
			return getRequestBody(up0().get(0), ifL, dtlL);
		}

	}

	protected Map<String, String> getGaParmMap(SdrvDtlR up) {
		if(_gaParmMap == null || !isSame(_extSysCd,up.sdrvIf().ext_sys_cd())) {
			_extSysCd = up.sdrvIf().ext_sys_cd();
			MAM_EXT_SYS_USR_R extSysUsrR = getExtSysUsrNE(_extSysCd);
			if(extSysUsrR == null) {
				extSysUsrR = MAM_EXT_SYS_USR_R.create();
			}
			String userKey = PFUCL_AppSys.ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.EXT_SYS_STR2, up.sdrvIf().if_proc_typ());
			_gaParmMap = new HashMap<>();
			_gaParmMap.put("LANG", nvl(extSysUsrR.ext_sys_str1(), "ja-JP"));
			_gaParmMap.put("USER", extSysUsrR.ext_sys_usr_cd());
			_gaParmMap.put("PASSWD", extSysUsrR.ext_sys_pass());
			_gaParmMap.put("USERKEY", userKey);
			_gaParmMap.put("COMPANY", getCo().co_cd());
			_gaParmMap.put("IMPORTID", _IMPORTID_BP);
		}
		return _gaParmMap;
	}

	protected String getRequestBody(SdrvDtlR up, MCList<?> ifL, MCList<DtlR> dtlL) {
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("Company", getGaParmMap(up).get("COMPANY"));
		map.put("Lang", getGaParmMap(up).get("LANG"));
		map.put("UserID", getGaParmMap(up).get("USER"));
		map.put("Password", nvl(getGaParmMap(up).get("PASSWD"),""));
		map.put("UserKey", getGaParmMap(up).get("USERKEY"));
		map.put("ImportId", getGaParmMap(up).get("IMPORTID"));
		map.put("ImportCode", "");
		map.put("Data", getData(ifL, dtlL));

		return PFUCL_AppSys.createJsonObj(up.if_proc_typ()).toJson(map);
	}

	protected LinkedHashMap<String, Object>[] getData(MCList<?> ifL, MCList<DtlR> dtlL) {
		List<LinkedHashMap<String, Object>> data = new ArrayList<>();
		String[] ca = dtlL.getColumnPathArray();
		for (int i = 0; i < dtlL.size(); i++) {
			LinkedHashMap<String, Object>[] ml = new LinkedHashMap[ca.length];
			DtlR s = dtlL.get(i);
			for (int j = 0; j < ca.length; j++) {
				LinkedHashMap<String, Object> m = new LinkedHashMap<>();
				m.put("fieldName", ca[j]);
				m.put("value", isNull(s.getValue(ca[j]))? "":s.getValue(ca[j]).toString());
				ml[j] = m;
			}
			LinkedHashMap<String, Object> line = new LinkedHashMap<String, Object>();
			line.put("lineNo", (Object) i);
			line.put("values", ml);
			data.add(line);
		}
		return data.toArray(new LinkedHashMap[data.size()]);
	}

	/**分割して送信*/
	protected List<MCList<?>> getRequestGroupListCom(MCList<?> ifL, int limit) {
		List<MCList<?>> ret = new ArrayList<>();
		if (limit <= 0 || limit >= ifL.size()) {
			ret.add(ifL);
			return ret;
		}

		MCList<MCRow> temp = MCList.create(MCRow.class);
		int cnt = 0;
		for (int i = 0; i < ifL.size(); i++) {
			temp.add(ifL.get(i));
			if(cnt >= limit || i == ifL.size() - 1) {
				MCList<MCRow> l= temp.createInstance();
				l.setAll(temp);
				ret.add(l);
				temp.clear();
				cnt = 0;
			}
			cnt++;
		}
		return ret;
	}

	protected void bfrSendRequest(MCList<?> ifL) {
		// バッチログに必要なキーを設定する
		getConcurrentLogger().setLogKey(ifL, MBT_BP_SND_IF_R.$batch_log_no,
				MBT_BP_SND_IF_R.$log_sub_key1, MBT_BP_SND_IF_R.$log_sub_key2);
		ifL.forEach(ifR -> {
			ifR.setParamIndex(ifR.getNumber(MBT_BP_SND_IF_R.$log_sub_key1).intValue());
			ifR.setParamRowIndex(ifR.getNumber(MBT_BP_SND_IF_R.$log_sub_key2).intValue());
		});
		MBT_BP_SND_IF_R t = MBT_BP_SND_IF_R.create("T");
		MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
		bldr.setSet(t.batch_log_no, t.log_sub_key1, t.log_sub_key2);
		dbUpdateKey("PFBBL5100_MBT_BP_SND_IF_U01", ifL, bldr);
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
	
	/**
	 * 対応する取引先マスタがない送信ＩＦデータの実行状況区分にスキップを設定。
	 * @param dataNo 送信ＩＦデータのデータＮＯ
	 * @param masterTyp マスタ連携区分
	 */
	protected void setExeStsSkp(MCNumber dataNo, String masterTyp) {
		MBT_BP_SND_IF_R bpSenIF = MBT_BP_SND_IF_R.create("BSI");
		bpSenIF.exe_sts_typ(MAC_EXE_STS_TYP.SKP.value());
		
		MAM_BP_R bp = MAM_BP_R.create("BP");
		
		MCQueryApiBuilder bpSenIF_bldr = MCQueryApiBuilder.create(bpSenIF);
		bpSenIF_bldr.setSet(bpSenIF.exe_sts_typ);
		bpSenIF_bldr.setWhere(bpSenIF.data_no.eq(bind("1")), dataNo);
		bpSenIF_bldr.addWhereWithAnd(bpSenIF.data_crud_typ.eq(bind("1")), MAC_DATA_CRUD_TYP.DEL.value());
		if (MAC_MASTER_TYP.isCST(masterTyp)) {
			bpSenIF_bldr.addWhereWithAnd(notExists(
					subQuery().select(value("X"))
					.from(bp)
					.where(bp.bp_cd.eq(bpSenIF.bp_cd)
					.and(bp.cst_flg.eq(value(true))))));
		}
		else if (MAC_MASTER_TYP.isSPL(masterTyp)) {
			bpSenIF_bldr.addWhereWithAnd(notExists(
					subQuery().select(value("X"))
					.from(bp)
					.where(bp.bp_cd.eq(bpSenIF.bp_cd)
					.and(bp.sppl_flg.eq(value(true))))));
		}
	
		dbUpdate("PFBBL5100_MBT_BP_SND_IF_U01", bpSenIF, bpSenIF_bldr);
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

	protected void initBpCache(MCList<?> ifL) {
		
		deleteBpWk();
		insertBpWk(ifL);
		
		MCList<MAM_BP_R> dbc = MCList.create(MAM_BP_R.class);
		MAM_BP_R t = MAM_BP_R.create("T");
		MAM_BP_R acst = MAM_BP_R.create("ACST");
		MAM_BP_R bcst = MAM_BP_R.create("BCST");
		MAM_BP_R asppl = MAM_BP_R.create("ASPPL");
		MAM_BP_R bsppl = MAM_BP_R.create("BSPPL");
		MAW_BP_KEY_R bpKey = MAW_BP_KEY_R.create("WK");
		
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.removeSelect(MAM_BP_R.$zip_cd, MAM_BP_R.$addr1, MAM_BP_R.$addr2, MAM_BP_R.$addr3, MAM_BP_R.$addr4,
				MAM_BP_R.$tel, MAM_BP_R.$fax, MAM_BP_R.$bill_cl_typ, MAM_BP_R.$bill_cl_day1, MAM_BP_R.$rcv_ba_typ,
				MAM_BP_R.$pay_spot_flg, MAM_BP_R.$psppl_cl_day1, MAM_BP_R.$pay_schd_ba_typ);
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"));
		dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("today"), value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"));
		
		dbc_bldr.addSelect(bcst.bill_cl_typ);
		dbc_bldr.addSelect(bcst.bill_cl_day1);
		dbc_bldr.addSelect(bcst.rcv_ba_typ);
		dbc_bldr.addSelect(bsppl.pay_spot_flg);
		dbc_bldr.addSelect(bsppl.psppl_cl_day1);
		dbc_bldr.addSelect(bsppl.pay_schd_ba_typ);
		dbc_bldr.addSelect(bcst.bp_cd.as("bcst_cd"));
		dbc_bldr.addSelect(bsppl.bp_cd.as("bsppl_cd"));

		dbc_bldr.addLeftOuterJoin(acst, t.cst_flg.eq(value(true)).and(acst.acst_flg.eq(value(true))).and(t.acst_cd.eq(acst.bp_cd)));
		dbc_bldr.addLeftOuterJoin(bcst, bcst.bcst_flg.eq(value(true)).and(acst.bcst_cd.eq(bcst.bp_cd)));
		dbc_bldr.addLeftOuterJoin(asppl, t.sppl_flg.eq(value(true)).and(asppl.asppl_flg.eq(value(true))).and(t.asppl_cd.eq(asppl.bp_cd)));
		dbc_bldr.addLeftOuterJoin(bsppl, bsppl.bsppl_flg.eq(value(true)).and(asppl.bsppl_cd.eq(bsppl.bp_cd)));
		
		dbc_bldr.addInnerJoin(bpKey, bpKey.bp_cd.eq(t.bp_cd));
		
		MCRow bind = MCRow.create();
		bind.addDateColumn("TODAY", getToday());

		dbSelect("PFBBL5100_MAM_BP_S01", dbc, dbc_bldr, bind);
		
		deleteBpWk();
		
		object(CLAZZ)._bpL = dbc;
		object(CLAZZ)._bpKey = object(CLAZZ)._bpL.createIndex(MAM_BP_R.$bp_cd);
	}
	
	protected void insertBpWk(MCList<?> ifL) {
		
		MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
		MCQueryApiBuilder bpBldr = MCQueryApiBuilder.create(MAM_BP_R.create("BP"));
		
		for (MCRow r : ifL) {
			MAM_BP_R wkR = MAM_BP_R.create();
			wkR.bp_cd(r.getStringNE(MBT_BP_SND_IF_R.$bp_cd));
			bpL.add(wkR);
		}
		dbWkInsert("PFBBL5100_MAW_BP_I01", bpL, bpBldr.getBaseDbc());

	}
	
	protected void deleteBpWk() {
		
		MCQueryApiBuilder bpBldr = MCQueryApiBuilder.create(MAM_BP_R.create("BP"));
		dbWkDelete("PFBBL5100_MAW_BP_D01", bpBldr.getBaseDbc());
	}

	protected MAM_BP_R getBpR(String bpCd) {
		return object(CLAZZ)._bpL.getFirst(object(CLAZZ)._bpKey, bpCd);
	}

	// 得意先RowMapper
	public class CST_DtlR_MBT_BP_SND_IF_R<D extends DtlR, S extends MBT_BP_SND_IF_R> extends BPRowMapper<D, S> {

		@Override
		protected void valueCopy(D dest, S src) {
			dest.corresptype(_CORRESPTYPE_CST);
			super.valueCopy(dest, src);
		}

	}

	// 発注先RowMapper
	public class SPPL_DtlR_MBT_BP_SND_IF_R<D extends DtlR, S extends MBT_BP_SND_IF_R> extends BPRowMapper<D, S> {

		@Override
		protected void valueCopy(D dest, S src) {
			dest.corresptype(_CORRESPTYPE_SPPL);
			super.valueCopy(dest, src);
		}

	}

	public class BPRowMapper<D extends DtlR, S extends MBT_BP_SND_IF_R> extends MCRowMapper<D, S> {

		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlR.$code, MBT_BP_SND_IF_R.$bp_cd);
		}

		@Override
		protected void valueCopy(D dest, S src) {

			MAM_BP_R bp = getBpR(src.bp_cd());

			dest.name(bp.bp_nm());
			dest.activeflag(MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ()) ? 0 : 1);
			if (bp.cst_flg() && bp.sppl_flg() || bp.onr_prsppl_flg()) {
				dest.corresptype(_CORRESPTYPE_COM);
			}
			dest.zip(bp.zip_cd());
			dest.address1(nvl(bp.addr1(), ""));
			dest.address2(nvl(bp.addr2(), ""));
			dest.tel1(bp.tel());
			dest.fax(bp.fax());
			dest.regioncode(bp.area_cd());
			dest.creditlimitflag(1);
			dest.sal_vatsummaryset(getVatSummarySet(nvl(bp.sls_tax_calc_typ(), bp.prov_tax_calc_typ())));
			dest.sal_currencycode(bp.cur_cd());
			dest.sal_closingdate(getSalClosingDate(bp));
			dest.sal_workingdayset(getSalWorkingDaySet(bp));
			dest.sal_monthlymargin(getSalMonthlyMargin(bp));
			dest.collectdate(getCollectDate(bp));
			dest.sal_mo_invoiceflag(getSalMoInvoiceFlag(bp));
			dest.sal_forcondition(0);
			dest.sal_valueflag(0);
			dest.sal_settle_discountday(0);
			dest.sal_settle_discountrate(0);
			dest.pur_vatsummaryset(getVatSummarySet(bp.purc_tax_calc_typ()));
			dest.pur_currencycode(bp.cur_cd());
			dest.pur_closingdate(getClosingDate(bp));
			dest.pur_workingdayset(getPurWorkingDaySet(bp));
			dest.pur_monthlymargin(getPurMonthlyMargin(bp));
			dest.paymentdate(getPaymentDate(bp));
			dest.pur_mo_invoiceflag(getPurMoInvoiceFlag(bp));
			dest.pur_valueflag(0);
			dest.pur_settle_discountday(0);
			dest.pur_settle_discountrate(0);
			dest.taxid(bp.biz_co_no());
			dest.overdueextensionaldays(0);
			dest.linkageflag(0);
			
			// リソース設定に従って、GA項目にマッピングする
			_gaMappingCols.entrySet().forEach(e -> {
				if (dest.contains(e.getKey())) {
					MCDataType type = dest.getDataType(e.getKey());
					if (type.equals(bp.getDataType(e.getValue()))) {
						dest.setValueNE(e.getKey(), bp.getValueNE(e.getValue()));
					}
					else  {
						try {
							if (type == MCDataType.NUMBER) {
								dest.setNumberNE(e.getKey(), MCNumber.valueOf((String)bp.getValueNE(e.getValue())));
							}
						} 
						catch (MCException ex) {
							throw new MCAppException(MAUCC0001, e.getKey());
						}
					}
				}
			});
		}

		/**
		 * GAの付加価値税集計単位を返す
		 * @param taxCalcTyp 税計算区分
		 * @return 1：対象外、2：明細行単位、3：伝票単位
		 */
		protected int getVatSummarySet(String taxCalcTyp) {
			if (MAC_TAX_CALC_TYP.isLINE(taxCalcTyp)) {
				return 2;
			}
			else if (MAC_TAX_CALC_TYP.isSLIP(taxCalcTyp)) {
				return 3;
			}
			else {
				return 1;
			}
		}
		
		/**
		 * MC7の請求締日１に基づき、GA側の債権締日を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 債権締日
		 */
		protected MCNumber getSalClosingDate(MAM_BP_R bpR) {
			
			MCNumber salClosingDate = null;
			if (bpR.cst_flg()) {
				if (MAC_BILL_CL_TYP.isBATCH(bpR.bill_cl_typ())
						|| MAC_BILL_CL_TYP.isMANUAL(bpR.bill_cl_typ())) {
					
					salClosingDate = bpR.bill_cl_day1().gt(GA_MAX_NORMAL_DATE) ? MCNumber.valueOf(GA_END_MONTH_DATE) : bpR.bill_cl_day1();
				}
			}
			
			return salClosingDate;
		}
		
		/**
		 * MC7の入金予定前後区分に基づき、GA側の債権決済予定日休日時調整を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 債権決済予定日休日時調整
		 */
		protected MCNumber getSalWorkingDaySet(MAM_BP_R bpR) {

			MCNumber salWorkingDaySet = null;
			if (bpR.cst_flg()) {
				if (MAC_BA_TYP.isBF(bpR.rcv_ba_typ())) {
					// 1：前営業日
					salWorkingDaySet = MCNumber.valueOf(1);
				}
				else if (MAC_BA_TYP.isAF(bpR.rcv_ba_typ())) {
					// 2：後営業日
					salWorkingDaySet = MCNumber.valueOf(2);
				}
				else if (isNullAnd(bpR.bill_cal_cd(), bpR.rcv_ba_typ())) {
					// 3：調整しない
					salWorkingDaySet = MCNumber.valueOf(3);
				}
			}
			else {
				salWorkingDaySet = MCNumber.valueOf(1);
			}
			
			return salWorkingDaySet;
		}
		
		
		/**
		 * MC7の請求締日１と入金予定日１に基づき、GA側の債権差月を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 債権差月
		 */
		protected MCNumber getSalMonthlyMargin(MAM_BP_R bpR) {
			
			MCNumber salMonthlyMargin = null;
			if (bpR.cst_flg()) {
				
				if (MAC_BILL_CL_TYP.isBATCH(bpR.bill_cl_typ())
						|| MAC_BILL_CL_TYP.isMANUAL(bpR.bill_cl_typ())) {
					MAM_RCV_SCHD_CTL__R rscR = getRcvSchdCtlR(bpR);
					
					if (!isNull(rscR)) {
						if (rscR.rcv_day1().lt(bpR.bill_cl_day1())) {
							
							salMonthlyMargin = rscR.rcv_crryovr_mons1().add(1);
						}
						else {
							salMonthlyMargin = rscR.rcv_crryovr_mons1();
						}
					}
				}
			}
			
			return salMonthlyMargin;
		}
		
		/**
		 * MC7の入金予定日１に基づき、GA側の債権予定日（回収予定日）を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 債権予定日（回収予定日）
		 */
		protected MCNumber getCollectDate(MAM_BP_R bpR) {
			
			MCNumber collectDate = null;
			if (bpR.cst_flg()) {
				if (MAC_BILL_CL_TYP.isBATCH(bpR.bill_cl_typ())
						|| MAC_BILL_CL_TYP.isMANUAL(bpR.bill_cl_typ())) {
					MAM_RCV_SCHD_CTL__R rscR = getRcvSchdCtlR(bpR);
					if (!isNull(rscR)) {
						collectDate = rscR.rcv_day1().gt(GA_MAX_NORMAL_DATE) ? MCNumber.valueOf(GA_END_MONTH_DATE) : rscR.rcv_day1();
					}
				}
			}
			
			return collectDate;
		}
		
		/**
		 * MC7の請求締処理区分に基づき、GA側の月締請求書作成対象を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 月締請求書作成対象
		 */
		protected MCNumber getSalMoInvoiceFlag(MAM_BP_R bpR) {
			
			MCNumber salMoInvoiceFlag = MCNumber.valueOf(0);
			if (bpR.cst_flg()) {
				if (MAC_BILL_CL_TYP.isEACH_SLS(bpR.bill_cl_typ())) {
					salMoInvoiceFlag = MCNumber.valueOf(1);
				}
			}
			
			return salMoInvoiceFlag;
		}
		
		/**
		 * MC7の支払締日１に基づき、GA側の債務締日を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 債務締日
		 */
		protected MCNumber getClosingDate(MAM_BP_R bpR) {
			
			MCNumber closingDate = null;
			if (bpR.sppl_flg()) {
				if (!bpR.pay_spot_flg()) {
					closingDate = bpR.psppl_cl_day1().gt(GA_MAX_NORMAL_DATE) ? MCNumber.valueOf(GA_END_MONTH_DATE) : bpR.psppl_cl_day1();
				}
			}
			
			return closingDate;
		}
		
		/**
		 * MC7の支払予定前後区分に基づき、GA側の債務決済予定日休日時調整を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 債務決済予定日休日時調整
		 */
		protected MCNumber getPurWorkingDaySet(MAM_BP_R bpR) {

			MCNumber purWorkingDaySet = null;
			if (bpR.sppl_flg()) {
				if (MAC_BA_TYP.isBF(bpR.pay_schd_ba_typ())) {
					// 1：前営業日
					purWorkingDaySet = MCNumber.valueOf(1);
				}
				else if (MAC_BA_TYP.isAF(bpR.pay_schd_ba_typ())) {
					// 2：後営業日
					purWorkingDaySet = MCNumber.valueOf(2);
				}
				else {
					// 3：調整しない
					purWorkingDaySet = MCNumber.valueOf(3);
				}
			}
			else {
				purWorkingDaySet = MCNumber.valueOf(1);
			}
			
			return purWorkingDaySet;
		}
		
		/**
		 * MC7の支払締日１と支払予定日１に基づき、GA側の債権差月を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 債務差月
		 */
		protected MCNumber getPurMonthlyMargin(MAM_BP_R bpR) {
			
			MCNumber purMonthlyMargin = null;
			if (bpR.sppl_flg()) {
				
				if (!bpR.pay_spot_flg()) {
					MAM_PAY_SCHD_CTL__R pscR = getPaySchdCtlR(bpR);
					
					if (!isNull(pscR)) {
						if (pscR.pay_day1().lt(bpR.psppl_cl_day1())) {
							
							purMonthlyMargin = pscR.pay_crryovr_mons1().add(1);
						}
						else {
							purMonthlyMargin = pscR.pay_crryovr_mons1();
						}
					}
				}
			}
			
			return purMonthlyMargin;
		}
		
		/**
		 * MC7の入金予定日１に基づき、GA側の債権予定日（回収予定日）を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 債権予定日（回収予定日）
		 */
		protected MCNumber getPaymentDate(MAM_BP_R bpR) {
			
			MCNumber paymentDate = null;
			if (bpR.sppl_flg()) {
				if (!bpR.pay_spot_flg()) {
					MAM_PAY_SCHD_CTL__R pscR = getPaySchdCtlR(bpR);
					if (!isNull(pscR)) {
						paymentDate = pscR.pay_day1().gt(GA_MAX_NORMAL_DATE) ? MCNumber.valueOf(GA_END_MONTH_DATE) : pscR.pay_day1();
					}
				}
			}
			
			return paymentDate;
		}
		
		/**
		 * MC7の都度支払に基づき、GA側の月締支払通知書作成対象を設定して返す。
		 * @param bpR 取引先マスタ
		 * @return 月締支払通知書作成対象
		 */
		protected MCNumber getPurMoInvoiceFlag(MAM_BP_R bpR) {
			
			MCNumber purMoInvoiceFlag = MCNumber.valueOf(0);;
			if (bpR.sppl_flg()) {
				if (!bpR.pay_spot_flg()) {
					purMoInvoiceFlag = MCNumber.valueOf(1);
				}
			}
			
			return purMoInvoiceFlag;
		}
	}
	
	/**
	 * GAに連携する項目のマッピング情報をキャッシュ
	 */
	protected Map<String, String> _gaMappingCols;
	protected void initGAMappingCols(String key) {
		_gaMappingCols = new LinkedHashMap<>();
		for (String col : MCConst.app.findPattern(MCConst.createKey(key, "*"))) {
			if (!_gaMappingCols.containsKey(col)) {
				// key：GA側の項目
				// value：７側の項目
				String[] keys = MCConst.splitKey(col);
				_gaMappingCols.put(keys[keys.length-1], MCConst.app.getString(col));
			}
		}
	}
	
	protected  MCList<MAM_RCV_SCHD_CTL__R> _rcvSchdCtlL = null;
	protected MCIndexKey _rcvSchdCtlIdxKey = null;
	protected void initRcvSchdCtl() {
		
		MCList<MAM_RCV_SCHD_CTL__R> rcvSchdCtlL = MCList.create(MAM_RCV_SCHD_CTL__R.class);
		MAM_RCV_SCHD_CTL__R rsc = MAM_RCV_SCHD_CTL__R.create("RSC");
		MCQueryApiBuilder rsc_bldr = MCQueryApiBuilder.create(rsc);
		rsc_bldr.setWhere(rsc.wg_cd.eq(bind("1")), MAC_STR.NULL_VAL.value());
		rsc_bldr.addWhereWithAnd(rsc.crryovr_mons_typ.eq(bind("1")), MAC_CRRYOVR_MONS_TYP.MM.value());
		dbSelect("PFBBL5100_MAM_RCV_SCHD_CTL_S01", rcvSchdCtlL, rsc_bldr);
		
		object(CLAZZ)._rcvSchdCtlL = rcvSchdCtlL;
		object(CLAZZ)._rcvSchdCtlIdxKey = object(CLAZZ)._rcvSchdCtlL.createIndex(MAM_RCV_SCHD_CTL_R.$cur_cd, MAM_RCV_SCHD_CTL_R.$bcst_cd);
	}
	
	protected MAM_RCV_SCHD_CTL__R getRcvSchdCtlR(MAM_BP_R bpR) {
		if (object(CLAZZ)._rcvSchdCtlL == null) {
			initRcvSchdCtl();
		}
		MCList<MAM_RCV_SCHD_CTL__R> rcvSchdCtlL = object(CLAZZ)._rcvSchdCtlL.subList(object(CLAZZ)._rcvSchdCtlIdxKey, bpR.cur_cd(), bpR.getStringNE("bcst_cd"));
		
		
		if (rcvSchdCtlL.isEmpty()) {
			rcvSchdCtlL = object(CLAZZ)._rcvSchdCtlL.subList(object(CLAZZ)._rcvSchdCtlIdxKey, bpR.cur_cd(), MAC_STR.NULL_VAL.value());
		}
		
		MAM_RCV_SCHD_CTL__R ctlR = null; 
		if (!rcvSchdCtlL.isEmpty()) {
			MCSortPolicy p = new MCSortPolicy();
			p.add(SortType.ASC, MAM_RCV_SCHD_CTL_R.$min_amt);
			p.add(SortType.DESC, MAM_RCV_SCHD_CTL_R.$rate);
			rcvSchdCtlL.sort(p);
			
			ctlR = rcvSchdCtlL.get(0);
		}
		
		return ctlR;
	}
	
	protected  MCList<MAM_PAY_SCHD_CTL__R> _paySchdCtlL = null;
	protected MCIndexKey _paySchdCtlIdxKey = null;
	protected void initPaySchdCtl() {
		
		MCList<MAM_PAY_SCHD_CTL__R> paySchdCtlL = MCList.create(MAM_PAY_SCHD_CTL__R.class);
		MAM_PAY_SCHD_CTL__R rsc = MAM_PAY_SCHD_CTL__R.create("RSC");
		MCQueryApiBuilder rsc_bldr = MCQueryApiBuilder.create(rsc);
		rsc_bldr.setWhere(rsc.wg_cd.eq(bind("1")), MAC_STR.NULL_VAL.value());
		rsc_bldr.addWhereWithAnd(rsc.crryovr_mons_typ.eq(bind("1")), MAC_CRRYOVR_MONS_TYP.MM.value());
		dbSelect("PFBBL5100_MAM_PAY_SCHD_CTL_S01", paySchdCtlL, rsc_bldr);
		
		object(CLAZZ)._paySchdCtlL = paySchdCtlL;
		object(CLAZZ)._paySchdCtlIdxKey = object(CLAZZ)._paySchdCtlL.createIndex(MAM_PAY_SCHD_CTL_R.$cur_cd, MAM_PAY_SCHD_CTL_R.$bsppl_cd);
	}
	
	protected MAM_PAY_SCHD_CTL__R getPaySchdCtlR(MAM_BP_R bpR) {
		if (object(CLAZZ)._paySchdCtlL == null) {
			initPaySchdCtl();
		}
		MCList<MAM_PAY_SCHD_CTL__R> paySchdCtlL = object(CLAZZ)._paySchdCtlL.subList(object(CLAZZ)._paySchdCtlIdxKey, bpR.cur_cd(), bpR.getStringNE("bsppl_cd"));
		
		
		if (paySchdCtlL.isEmpty()) {
			paySchdCtlL = object(CLAZZ)._paySchdCtlL.subList(object(CLAZZ)._paySchdCtlIdxKey, bpR.cur_cd(), MAC_STR.NULL_VAL.value());
		}
		
		MAM_PAY_SCHD_CTL__R ctlR = null; 
		if (!paySchdCtlL.isEmpty()) {
			MCSortPolicy p = new MCSortPolicy();
			p.add(SortType.ASC, MAM_PAY_SCHD_CTL_R.$min_amt);
			p.add(SortType.DESC, MAM_PAY_SCHD_CTL_R.$rate);
			paySchdCtlL.sort(p);
			
			ctlR = paySchdCtlL.get(0);
		}
		
		return ctlR;
	}

	//FMCB CUSTOM END
}