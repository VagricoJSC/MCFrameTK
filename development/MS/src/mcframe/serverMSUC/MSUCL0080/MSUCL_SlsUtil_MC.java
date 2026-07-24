package mcframe.serverMSUC.MSUCL0080;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMSUC.MSUCL0080.Query.*;
import static mcframe.serverCore.requester.MCRequestObject.object;
import mcframe.serverFXUC.FXUCL0030.*;
import java.util.Set;
import java.util.TreeSet;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSUCL_SlsUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSUCL_SlsUtil_MC extends MSUCL_SlsUtil_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MSUCL_SlsUtil> CLAZZ = MSUCL_SlsUtil.class;
	
	/**
	 * 見積に対して次処理が行われているか
	 * 
	 * @param qtn_no
	 * @param qtn_rev
	 * @return 行われている場合にtrue
	 */
	public static boolean isQtnNextOper(String qtn_no, MCNumber qtn_rev) {
		return object(CLAZZ)._isQtnNextOper(qtn_no, qtn_rev);
	}
	
	protected boolean _isQtnNextOper(String qtn_no, MCNumber qtn_rev) {
		MCList<MST_QTN_D_R> qtnDL = MCList.create(MST_QTN_D_R.class);
		MST_QTN_D_R t = MST_QTN_D_R.create("T");
		String sqlid = createSqlId(LOGIC_ID, t, "S01");
		
		MCQueryApiBuilder qtnDL_bldr = MCQueryApiBuilder.create(t);
		qtnDL_bldr.setSelect(t.qtn_d_no);
		qtnDL_bldr.setWhere(t.qtn_no.eq(bind("1")), qtn_no);
		qtnDL_bldr.addWhereWithAnd(t.qtn_rev.eq(bind("1")), qtn_rev);
		qtnDL_bldr.addWhereWithAnd(bracket(t.slo_trnst_qty.gt(value(0)).or(t.sls_trnst_qty.gt(value(0)))));
		dbSelect(sqlid, qtnDL, qtnDL_bldr);
		
		return !qtnDL.isEmpty() && qtnDL.size() > 0;
	}

	/**
	 * 受注に対して次処理が行われているか
	 * 
	 * @param slo_no
	 * @return 行われている場合にtrue
	 */
	public static boolean isSloNextOper(String slo_no) {
		return object(CLAZZ)._isSloNextOper(slo_no);
	}
	
	protected boolean _isSloNextOper(String slo_no) {
		
		MST_SLO_R bindR = MST_SLO_R.create();
		bindR.slo_no(slo_no);
		
		MCList<MST_SHIP_PR_R> shipPrL = MCList.create(MST_SHIP_PR_R.class);
		executeQuery(shipPrL, MSUCL0080_MST_SHIP_PR_S01(), bindR);
		
		if (!shipPrL.isEmpty()) {
			return true;
		}
		
		MCList<MST_PO_D_R> poDL = MCList.create(MST_PO_D_R.class);
		MST_PO_D_R t = MST_PO_D_R.create("T");
		String sqlid = createSqlId(LOGIC_ID, t, "S02");
		
		MCQueryApiBuilder poDL_bldr = MCQueryApiBuilder.create(t);
		poDL_bldr.setSelect(t.po_d_no);
		poDL_bldr.setWhere(t.can_flg.eq(value(false)));
		poDL_bldr.addWhereWithAnd(t.rqst_can_flg.eq(value(false)));
		poDL_bldr.addWhereWithAnd(t.slo_no.eq(bind("1")), slo_no);
		dbSelect(sqlid, poDL, poDL_bldr);
		
		if (!poDL.isEmpty()) {
			return true;
		}
		
		return  false;
	}
	
	/**
	 * 原価単価と基準単位数量から原価金額を取得する
	 * 
	 * @param costUpri 原価単価
	 * @param baseUnitQty 基準単位数量
	 * @param baseCurAmtDecPlace 基準通貨金額小数部有効桁数
	 * 
	 * @return 原価金額
	 */
	public static MCNumber getCostAmt(MCNumber costUpri, MCNumber baseUnitQty, MCNumber baseCurAmtDecPlace) {
		return object(CLAZZ)._getCostAmt(costUpri, baseUnitQty, baseCurAmtDecPlace);
	}
	
	/**
	 * 原価単価と基準単位数量から原価金額を取得する
	 * 
	 * @param costUpri 原価単価
	 * @param baseUnitQty 基準単位数量
	 * @param baseCurAmtDecPlace 基準通貨金額小数部有効桁数
	 * 
	 * @return 原価金額
	 */
	protected MCNumber _getCostAmt(MCNumber costUpri, MCNumber baseUnitQty, MCNumber baseCurAmtDecPlace) {
		
		if (isNullOr(costUpri, baseUnitQty, baseCurAmtDecPlace)) {
			return null;
		}
		return costUpri.multiply(baseUnitQty, baseCurAmtDecPlace.intValue(), MAC_RND_TYP.RNDOFF.toMC());
	}
	
	/**
	 * 基準通貨金額と原価金額から粗利率を取得する
	 * 
	 * @param baseCurAmt 基準通貨金額（値引後、税抜）
	 * @param costUpri 原価金額（原価単価 * 基準単位数量）
	 * 
	 * @return 粗利率
	 */
	public static MCNumber getProfRate(MCNumber baseCurAmt, MCNumber costAmt) {
		return object(CLAZZ)._getProfRate(baseCurAmt, costAmt);
	}
	
	/**
	 * 基準通貨金額と原価金額から粗利率を取得する
	 * 
	 * @param baseCurAmt 基準通貨金額（値引後、税抜）
	 * @param costUpri 原価金額（原価単価 * 基準単位数量）
	 * 
	 * @return 粗利率
	 */
	protected MCNumber _getProfRate(MCNumber baseCurAmt, MCNumber costAmt) {
		
		if (isNullOr(baseCurAmt, costAmt)) {
			return null;
		}
		if (baseCurAmt.isZero()) {
			return null;
		}
		
		// (baseCurAmt - costAmt) * 100 / baseCurAmt
		return (baseCurAmt.subtract(costAmt)).multiply(100).divide(baseCurAmt, mcframe.commonMA.meta.MA_META.PER.scale(), MAC_RND_TYP.RNDUP.toMC());
	}
	
	/**
	 * 引当状況区分を取得する
	 * 
	 * @param alloc_typ 引当区分
	 * @param base_unit_qty 基準単位数量
	 * @param alloc_qty 引当数量
	 * @param ship_schd_abort_qty 出荷予定打切数量（受注明細、移動・移送予定の粒度で表示する場合に設定する。出荷予定の粒度で表示する場合はnullを設定する）
	 * @param can_flg 取消ＦＬＧ（受注明細、移動移送予定の粒度で表示する場合に設定する。出荷予定の粒度で表示する場合はfalseを設定する）
	 * @return 引当状況区分
	 */
	public static String getAllocStsTyp (String alloc_typ, MCNumber base_unit_qty, MCNumber alloc_qty, MCNumber ship_schd_abort_qty, boolean can_flg) {
		return object(CLAZZ)._getAllocStsTyp(alloc_typ, base_unit_qty, alloc_qty, ship_schd_abort_qty, can_flg);
	}
	
	/**
	 * 引当状況区分を取得する
	 * 
	 * @param alloc_typ
	 * @param base_unit_qty
	 * @param alloc_qty
	 * @param abort_qty
	 * @param can_flg
	 * @return 引当状況区分
	 */
	protected String _getAllocStsTyp (String alloc_typ, MCNumber base_unit_qty, MCNumber alloc_qty, MCNumber ship_schd_abort_qty, boolean can_flg) {
		
		MCNumber tmpBaseUnitQty = nvl(base_unit_qty, MCNumber.ZERO);
		MCNumber tmpShipSchdAbortQty = nvl(ship_schd_abort_qty, MCNumber.ZERO);
		
		MCNumber remQty = tmpBaseUnitQty.subtract(tmpShipSchdAbortQty);
		MCNumber notAbortQty = tmpBaseUnitQty.subtract(tmpShipSchdAbortQty);
		
		if(can_flg || isNull(alloc_typ) || MAC_ALLOC_TYP.isNON(alloc_typ) && alloc_qty.isZero()) {
			return MSC_ALLOC_STS_TYP.NON.value();
		}
		else if (notAbortQty.isZero()) {
			return MSC_ALLOC_STS_TYP.NOT_ALLOC.value();
		}
		else if (remQty.lte(alloc_qty)) {
			return MSC_ALLOC_STS_TYP.ALL_ALLOC.value();
		}
		else if (remQty.gt(alloc_qty) && alloc_qty.isPositive()) {
			return MSC_ALLOC_STS_TYP.PART_ALLOC.value();
		}
		else {
			return MSC_ALLOC_STS_TYP.NOT_ALLOC.value();
		}
	}
	
	protected FXUCL_MCFuncCache<String> _midLoc;

	/**
	 * 売上部門をもとに仕入直送中継場所を取得する。
	 * 
	 * @param deptCd
	 * @param dt
	 * @return
	 */
	public static String getMidLocCd(String deptCd, MCDate dt) {
		return object(CLAZZ)._getMidLocCd(deptCd, dt);
	}

	protected String _getMidLocCd(String deptCd, MCDate dt) {
		if (_midLoc == null) {
			_midLoc = new FXUCL_MCFuncCache<> (in -> {
				return MAPA_LOC$F_GET_SLS_DPT_LOC_CD(value((String) in[0]), value((MCDate) in[1]));
			});
		}
		return _midLoc.get(deptCd, dt);
	}
	
	/**
	 * SlsUtil_Srch01オペレーション.<p>
	 *
	 * 販売状況区分を求める<br>
	 */
	public class SlsUtil_Srch01 extends MSUCL_SlsUtil_MC_A.SlsUtil_Srch01 {
		
		protected MCList<MST_SHIP_PR_R> _shipPrL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			crtSloDWk();
			getShipPr();
			setSlsStsTyp();
			setDown();
		}
		
		/**
		 * 受注明細のワークテーブルを作成する。
		 */
		protected void crtSloDWk() {
			
			MCList<MST_SLO_D_R> insL = MCList.create(MST_SLO_D_R.class);
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			String sqlid_del = createSqlId(LOGIC_ID, t.getPkWorkDbc(), "D01");
			String sqlid_ins = createSqlId(LOGIC_ID, t.getPkWorkDbc(), "I01");
			
			MST_SLO_D_R insR = null;
			for (SlsUtil_Srch01_CndR dtlR : up0().groupBy(SlsUtil_Srch01_CndR.$slo_d_no)) {
				insR = MST_SLO_D_R.create();
				insR.slo_d_no(dtlR.slo_d_no());
				insL.add(insR);
			}
			
			dbWkDelete(sqlid_del, t);
			dbWkInsert(sqlid_ins, insL, t);
		}
		
		/**
		 * 出荷進捗と受注明細情報を取得する。
		 */
		protected void getShipPr() {
			
			_shipPrL = MCList.create(MST_SHIP_PR_R.class);
			_shipPrL.addBooleanColumn(MST_SLO_D_R.$sls_cststk_flg);
			
			executeQuery(_shipPrL, MSUCL0080_MST_SHIP_PR_S02());
		}
		
		/**
		 * 出荷進捗と受注明細情報に基づき、販売状況区分を設定する。
		 */
		protected void setSlsStsTyp() {

			for (MST_SHIP_PR_R shipPrR : _shipPrL) {
				
				if (isCompl(shipPrR)) {
					shipPrR.sls_sts_typ(MSC_SLS_STS_TYP.COMPL.value());
				}
				else if (isSls(shipPrR)) {
					shipPrR.sls_sts_typ(MSC_SLS_STS_TYP.SLS.value());
				}
				else if (isShip(shipPrR)) {
					shipPrR.sls_sts_typ(MSC_SLS_STS_TYP.SHIP.value());
				}
				else if (isDlvInstPrms(shipPrR)) {
					shipPrR.sls_sts_typ(MSC_SLS_STS_TYP.DLV_INST_PRMS.value());
				}
				else if (isDlvInstRcpt(shipPrR)) {
					shipPrR.sls_sts_typ(MSC_SLS_STS_TYP.DLV_INST_RCPT.value());
				}
				else if (isPrms(shipPrR)) {
					shipPrR.sls_sts_typ(MSC_SLS_STS_TYP.PRMS.value());
				}
				else {
					shipPrR.sls_sts_typ(MSC_SLS_STS_TYP.SLO.value());
				}
			}
		}
		
		/**
		 * 販売状況区分が完了かどうか。
		 * @param shipPrR 出荷進捗情報
		 * @return 完了の場合はtrue
		 */
		protected boolean isCompl(MST_SHIP_PR_R shipPrR) {
			
			return (MAC_TRD_PTN_TYP.isSLS(shipPrR.trd_ptn_typ()) && shipPrR.ship_cmpl_flg() && shipPrR.sls_cmpl_flg() 
					&& (!shipPrR.getBoolean(MST_SLO_D_R.$sls_cststk_flg) || !MAC_VIA_DLV_TYP.isVIA(shipPrR.via_dlv_typ()) || shipPrR.iv_schd_qty().eq(shipPrR.iv_act_qty())))
					|| (MAC_TRD_PTN_TYP.isSHIP(shipPrR.trd_ptn_typ()) && shipPrR.ship_cmpl_flg());
		}
		
		/**
		 * 販売状況区分が売上済みかどうか。
		 * @param shipPrR 出荷進捗情報
		 * @return 売上済みの場合はtrue
		 */
		protected boolean isSls(MST_SHIP_PR_R shipPrR) {
			
			return MAC_TRD_PTN_TYP.isSLS(shipPrR.trd_ptn_typ()) 
					&& shipPrR.getBoolean(MST_SLO_D_R.$sls_cststk_flg) 
					&& !shipPrR.ship_cmpl_flg() 
					&& shipPrR.sls_cmpl_flg();
		}
		
		/**
		 * 販売状況区分が出荷済みかどうか。
		 * @param shipPrR 出荷進捗情報
		 * @return 出荷済みの場合はtrue
		 */
		protected boolean isShip(MST_SHIP_PR_R shipPrR) {
			
			return MAC_TRD_PTN_TYP.isSLS(shipPrR.trd_ptn_typ()) 
					&& shipPrR.ship_cmpl_flg() 
					&& (!shipPrR.sls_cmpl_flg() 
							|| (shipPrR.getBoolean(MST_SLO_D_R.$sls_cststk_flg) && MAC_VIA_DLV_TYP.isVIA(shipPrR.via_dlv_typ()) && !shipPrR.iv_schd_qty().eq(shipPrR.iv_act_qty())));
		}
		
		/**
		 * 販売状況区分が納入指示回答済かどうか。
		 * @param shipPrR 出荷進捗情報
		 * @return 納入指示回答済の場合はtrue
		 */
		protected boolean isDlvInstPrms(MST_SHIP_PR_R shipPrR) {
			
			return shipPrR.dlv_inst_rcpt_qty().isPositive()
					&& isSame(shipPrR.dlv_inst_rcpt_qty(), shipPrR.dlv_inst_prms_qty())
					&& isSame(sum(shipPrR.base_unit_qty(), shipPrR.re_ship_schd_qty(), shipPrR.prms_qty().negate()), shipPrR.dlv_inst_prms_qty());
		}
		
		/**
		 * 販売状況区分が納入指示受領済かどうか。
		 * @param shipPrR 出荷進捗情報
		 * @return 納入指示受領済の場合はtrue
		 */
		protected boolean isDlvInstRcpt(MST_SHIP_PR_R shipPrR) {
			
			return isSame(sum(shipPrR.base_unit_qty(), shipPrR.re_ship_schd_qty()), shipPrR.dlv_inst_rcpt_qty());
		}
		
		/**
		 * 販売状況区分が納期回答済かどうか。
		 * @param shipPrR 出荷進捗情報
		 * @return 納期回答済の場合はtrue
		 */
		protected boolean isPrms(MST_SHIP_PR_R shipPrR) {
			
			return isSame(sum(shipPrR.base_unit_qty(), shipPrR.re_ship_schd_qty()), shipPrR.prms_qty());
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			
			MST_SHIP_PR_R shipPrR = null;
			
			MCIndexKey idxkey = _shipPrL.createIndex(MST_SHIP_PR_R.$slo_d_no);
			
			for (SlsUtil_Srch01_CndR upR : up0()) {
				
				shipPrR = _shipPrL.getFirst(idxkey, upR.slo_d_no());
				
				if (!isNull(shipPrR) && !shipPrR.isEmpty()) {
					upR.sls_sts_typ(shipPrR.sls_sts_typ());
				}
			}
			
			down0().setAll(up0());
		}
	}
	
	/**
	 * 出荷進捗の回答納入日遅れＦＬＧを設定する。
	 * @param shipPrL 出荷進捗
	 */
	public static void setPrmsDlvDtDverdueFlg(MCList<MST_SHIP_PR_R> shipPrL) {
		
		object(CLAZZ)._setPrmsDlvDtDverdueFlg(shipPrL);
	}
	
	protected void _setPrmsDlvDtDverdueFlg(MCList<MST_SHIP_PR_R> shipPrL) {
		
		shipPrL.setBooleanNE(MST_SHIP_PR_R.$prms_dlv_dt_overdue_flg, false);
		
		if (isNull(shipPrL) || shipPrL.isEmpty()) {
			return;
		}
		
		crtShipPrWk(shipPrL);
		
		MCList<MST_SLO_PRMS_R> sloPrmsL = getSloPrms();
		MCList<MST_SHIP_ACT_D_R> shipActDL = getShipActD();
		
		MCIndexKey sloPrmsIdx = sloPrmsL.createIndex("ship_pr_no");
		MCIndexKey shipActIdx = shipActDL.createIndex("ship_pr_no");
		
		MCList<MST_SLO_PRMS_R> subSloPrmsL = null;
		MCList<MST_SHIP_ACT_D_R> subShipActL = null;
		
		for (MST_SHIP_PR_R shipPrR : shipPrL) {
			
			if (!shipPrR.dlv_cmpl_flg()) {
				continue;
			}
			
			subSloPrmsL = sloPrmsL.subList(sloPrmsIdx, shipPrR.ship_pr_no());
			subShipActL = shipActDL.subList(shipActIdx, shipPrR.ship_pr_no());
			
			if (isNull(subSloPrmsL) || subSloPrmsL.isEmpty() || isNull(shipActDL) || shipActDL.isEmpty()) {
				continue;
			}
			
			MCIndexKey prmsKey = subSloPrmsL.createIndex(MST_SLO_PRMS_R.$prms_dlv_tm);
			MCIndexKey actKey = subShipActL.createIndex("dlv_tm");
			
			Set<MCDate> dtSet = new TreeSet<MCDate>();
			subSloPrmsL.forEach(prmsR -> dtSet.add(prmsR.prms_dlv_tm()));
			subShipActL.forEach(actR -> dtSet.add(actR.getDateNE("dlv_tm")));
			
			MCNumber prmsQty = MCNumber.ZERO;
			MCNumber actQty = MCNumber.ZERO;
			
			for (MCDate dt : dtSet) {
				
				prmsQty = prmsQty.add(nvl(subSloPrmsL.subList(prmsKey, dt).sum(MST_SLO_PRMS_R.$base_unit_prms_qty), MCNumber.ZERO));
				actQty = actQty.add(nvl(subShipActL.subList(actKey, dt).sum(MST_SHIP_ACT_D_R.$base_unit_qty), MCNumber.ZERO));
				
				if (actQty.lt(prmsQty)) {
					shipPrR.prms_dlv_dt_overdue_flg(true);
					break;
				}
			}
		}
		
		delShipPrWk(shipPrL);
	}
	
	/**
	 * 出荷進捗のワークテーブルを作成する。
	 */
	protected void crtShipPrWk(MCList<MST_SHIP_PR_R> shipPrL) {

		MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
		dbWkDelete(createSqlId(LOGIC_ID, t.getPkWorkDbc(), "D01"), t);
		dbWkInsert(createSqlId(LOGIC_ID, t.getPkWorkDbc(), "I01"), shipPrL, t);
	}
	
	/**
	 * 出荷進捗のワークテーブルを削除する。
	 */
	protected void delShipPrWk(MCList<MST_SHIP_PR_R> shipPrL) {

		MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
		String sqlid = createSqlId(LOGIC_ID, t.getPkWorkDbc(), "D02");
		dbWkDelete(sqlid, t);
	}
	
	/**
	 * 出荷進捗に紐付く納期回答情報を取得する。
	 * @return 納期回答
	 */
	protected MCList<MST_SLO_PRMS_R> getSloPrms() {
		
		MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
		MSW_SHIP_PR_KEY_R wk = MSW_SHIP_PR_KEY_R.create("WK");
		
		MCList<MST_SLO_PRMS_R> sloPrmsL = MCList.create(MST_SLO_PRMS_R.class);
		MST_SLO_PRMS_R t = MST_SLO_PRMS_R.create("T");
		String sqlid = createSqlId(LOGIC_ID, t, "S01");
		
		MCQueryApiBuilder sloPrmsL_bldr = MCQueryApiBuilder.create(t);
		sloPrmsL_bldr.setSelect(t.prms_dlv_tm, t.base_unit_prms_qty);
		sloPrmsL_bldr.addSelect(wk.ship_pr_no);
		sloPrmsL_bldr.addInnerJoin(t1, bracket(t1.slo_d_no.eq(t.slo_d_no)));
		sloPrmsL_bldr.addInnerJoin(wk, bracket(wk.ship_pr_no.eq(t1.ship_pr_no)));
		
		dbSelect(sqlid, sloPrmsL, sloPrmsL_bldr);
		
		return sloPrmsL;
	}
	
	/**
	 * 出荷進捗に紐付く出荷実績明細を取得する。
	 * @return 出荷実績明細
	 */
	protected MCList<MST_SHIP_ACT_D_R> getShipActD() {
		
		MST_SHIP_ACT_R t2 = MST_SHIP_ACT_R.create("T2");
		MST_SHIP_ALLOC_STS_R t3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MST_SHIP_SCHD_R t4 = MST_SHIP_SCHD_R.create("T4");
		MSW_SHIP_PR_KEY_R wk = MSW_SHIP_PR_KEY_R.create("WK");
		
		MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
		String sqlid = createSqlId(LOGIC_ID, t, "S01");
		
		MCQueryApiBuilder shipActDL_bldr = MCQueryApiBuilder.create(t);
		shipActDL_bldr.setSelect(t.base_unit_qty);
		shipActDL_bldr.addSelect(wk.ship_pr_no);
		shipActDL_bldr.addSelect(t2.dlv_tm);
		
		shipActDL_bldr.addInnerJoin(t2, bracket(t2.ship_act_no.eq(t.ship_act_no)));
		shipActDL_bldr.addInnerJoin(t3, bracket(t3.ship_alloc_sts_no.eq(t.ship_alloc_sts_no)));
		shipActDL_bldr.addInnerJoin(t4, bracket(t4.ship_schd_no.eq(t3.ship_schd_no)));
		shipActDL_bldr.addInnerJoin(wk, bracket(wk.ship_pr_no.eq(t4.ship_pr_no)));
		shipActDL_bldr.setWhere(t.can_flg.eq(value(false)));
		
		dbSelect(sqlid, shipActDL, shipActDL_bldr);
		
		return shipActDL;
	}
	
	/**
	 * 受注引当マスタ取得用の変数を作成する。
	 * @param bindL 検索条件（ワーキンググループＣＤ）が設定されているバインド変数
	 * @return 受注引当マスタ取得用の変数
	 */
	public static SrchSloAlloc crtSrchSloAlloc(MCList<?> bindL) {
		MSUCL_SlsUtil lgc = new MSUCL_SlsUtil();
		return lgc.new SrchSloAlloc(bindL);
	}
	/**
	 * 受注引当マスタ取得用の変数を作成する。
	 * @param strWgCd ワーキンググループＣＤ
	 * @return 受注引当マスタ取得用の変数
	 */
	public static SrchSloAlloc crtSrchSloAlloc(String strWgCd) {
		MCList<MCRow> bindL = MCList.create(MCRow.class); 
		bindL.add().addStringColumn("wg_cd", strWgCd);
		return crtSrchSloAlloc(bindL);
	}
	/**
	 * 受注引当マスタを取得するクラス
	 */
	public class SrchSloAlloc {
		
		protected MCList<MAM_SLO_ALLOC_R> _sloAllocL = null;
		protected MCIndexKey _sloAllocIdxkey = null;
		protected MCIndexKey _sloAllocDefIdxkey = null;
		
		protected SrchSloAlloc(MCList<?> bindL) {
			_sloAllocL = MCList.create(MAM_SLO_ALLOC_R.class);
			MAM_SLO_ALLOC_R t = MAM_SLO_ALLOC_R.create("T");
			MCQueryApiBuilder sloAllocL_bldr = MCQueryApiBuilder.create(t);
			String sqlId = createSqlId(LOGIC_ID, t, "S02");
			dbSelectColumn(sqlId, _sloAllocL, sloAllocL_bldr, MAM_SLO_ALLOC_R.$wg_cd, bindL, "wg_cd");
			
			_sloAllocIdxkey = _sloAllocL.createIndex(
					MAM_SLO_ALLOC_R.$to_lg_grp_cd, 
					MAM_SLO_ALLOC_R.$itm_ship_grp_cd,
					MAM_SLO_ALLOC_R.$wg_cd,
					MAM_SLO_ALLOC_R.$loc_cd,
					MAM_SLO_ALLOC_R.$lg_grp_cd,
					MAM_SLO_ALLOC_R.$alloc_grp_cd);
			
			_sloAllocDefIdxkey = _sloAllocL.createIndex(
					MAM_SLO_ALLOC_R.$to_lg_grp_cd, 
					MAM_SLO_ALLOC_R.$itm_ship_grp_cd,
					MAM_SLO_ALLOC_R.$wg_cd,
					MAM_SLO_ALLOC_R.$def_flg);
		}
		
		/**
		 * 以下の優先順位で受注引当マスタを検索する。<br />
		 * １．物流グループ、品目出荷グループが一致するレコード<br />
		 * ２．品目出荷グループが一致するレコード<br />
		 * ３．物流グループが一致するレコード<br />
		 * ４．物流グループ、品目出荷グループが設定されていないレコード
		 * 
		 * @param dtlR 受注明細
		 * @param strWgCd ワーキンググループＣＤ
		 * @param strLgGrpCd 引当物流グループＣＤ
		 * @param retR メッセージ出力用のバインド変数
		 * @return 受注引当マスタ
		 */
		public MAM_SLO_ALLOC_R getSloAllocR(MCRow dtlR, String strWgCd, String strLgGrpCd, MCRow retR) {
			String strItmShipGrpCd = dtlR.getStringNE("itm_ship_grp_cd");
			String strAllocGrpCd = dtlR.getStringNE("alloc_grp_cd");
			String strShipLgGrpCd = dtlR.getStringNE("ship_lg_grp_cd");
			String strLocCd = dtlR.getStringNE("loc_cd");
			if (isNull(strLgGrpCd)) {
				strLgGrpCd = MAC_STR.NULL_VAL.value();
			}
			if (isNull(strItmShipGrpCd)) {
				strItmShipGrpCd = MAC_STR.NULL_VAL.value();
			}
	
			MAM_SLO_ALLOC_R allInfR = null;
			// 品目出荷Ｇ＋納品先物流Ｇで検索
			if (!isNullOrNullVal(strLgGrpCd) && !isNullOrNullVal(strItmShipGrpCd)) {
				allInfR = getAllocScopeAndAllocLoc(strLgGrpCd, strItmShipGrpCd, strWgCd, 
						strAllocGrpCd, strShipLgGrpCd, strLocCd, retR);
				if (!isNull(allInfR)) {
					return allInfR;
				}
			}
			// 品目出荷Ｇで再検索
			if (!isNullOrNullVal(strItmShipGrpCd)) {
				allInfR = getAllocScopeAndAllocLoc(MAC_STR.NULL_VAL.value(), strItmShipGrpCd, strWgCd,
						strAllocGrpCd, strShipLgGrpCd, strLocCd, retR);
				if (!isNull(allInfR)) {
					return allInfR;
				}
			}
			// 納品先物流Ｇで再検索
			if (!isNullOrNullVal(strLgGrpCd)) {
				allInfR = getAllocScopeAndAllocLoc(strLgGrpCd, MAC_STR.NULL_VAL.value(), strWgCd,
						strAllocGrpCd, strShipLgGrpCd, strLocCd, retR);
				if (!isNull(allInfR)) {
					return allInfR;
				}
			}
			// 条件無しで検索
			allInfR = getAllocScopeAndAllocLoc(MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(), strWgCd, 
					strAllocGrpCd, strShipLgGrpCd, strLocCd, retR);
			
			return allInfR;
		}
		
		/**
		 * 受注引当マスタを検索する。
		 * @param strLgGrpCd 物流グループＣＤ
		 * @param strItmShipGrpCd 品目出荷グループＣＤ
		 * @param strWgCd ワーキンググループＣＤ
		 * @param strAllocGrpCd 総量引当場所グループＣＤ
		 * @param strShipLgGrpCd 引当物流グループＣＤ
		 * @param strLocCd 引当場所ＣＤ
		 * @param retR メッセージ出力用のバインド変数
		 * @return 受注引当マスタ
		 */
		protected MAM_SLO_ALLOC_R getAllocScopeAndAllocLoc(String strLgGrpCd,
				String strItmShipGrpCd, String strWgCd, String strAllocGrpCd, String strShipLgGrpCd, String strLocCd, MCRow retR) {
			
			MCList<MAM_SLO_ALLOC_R> subsloAllocL = null;
			
			// 上り電文の総量引当場所G、物流G、場所の全てがNULLの場合、デフォルトＦＬＧがオンのレコードを取得
			if (isNull(strLocCd) && isNull(strShipLgGrpCd) && isNull(strAllocGrpCd)){
				Comparable<?>[] vals = new Comparable[]{strLgGrpCd, strItmShipGrpCd, strWgCd, true};
				subsloAllocL = _sloAllocL.subList(_sloAllocDefIdxkey, vals);
			}
			else {
				Comparable<?>[] vals = new Comparable[]{strLgGrpCd, strItmShipGrpCd, strWgCd, null, null, null};
				
				if (!isNull(strLocCd)){
					vals[3] = strLocCd;
					retR.setStringNE("loc_cd", strLocCd);
				}
				
				if (!isNull(strShipLgGrpCd)){
					vals[4] = strShipLgGrpCd;
					retR.setStringNE("lg_grp_cd", strShipLgGrpCd);
				}
				
				if (!isNull(strAllocGrpCd)){
					vals[5] = strAllocGrpCd;
					retR.setStringNE("alloc_grp_cd", strAllocGrpCd);
				}
				
				subsloAllocL = _sloAllocL.subList(_sloAllocIdxkey, vals);
			}
			
			if (!subsloAllocL.isEmpty()) {
				
				return subsloAllocL.get(0);
			}
			
			return null;
		}
	}

	//FMCB CUSTOM END
}