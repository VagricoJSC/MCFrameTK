package mcframe.serverMSBB.MSBBL1320;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBB.MSBBL1320.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBA.MBBAL5010.*; 
import static mcframe.serverMSBB.MSBBL1320.Query.*;
import mcframe.serverMSBB.MSBBL6010.*;
import mcframe.serverMSBD.MSBDL5180.*;
import mcframe.serverMSBE.MSBEL5010.MSBEL_IoActService;
import mcframe.serverMSBE.MSBEL5710.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.commonCore.param.MCParam;

import java.util.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeAfterValidater;
import mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_Dtl1R;
import mcframe.serverMSUC.MSUCL0020.ConvQtyAmtUtil_Calc01_HdrR;
import mcframe.serverMSUC.MSUCL0020.MSUCL_ConvQtyAmtUtil;
import mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil;
import static mcframe.serverMSUC.MSUCL0080.MSUCL_SlsUtil.*;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import static mcframe.serverCore.requester.MCRequestObject.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_SlsActListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_SlsActListReg_MC extends MSBBL_SlsActListReg_MC_A{
	//FMCB CUSTOM START

	protected static final String SRCH_OPE_INS = "INS";
	protected static final String SRCH_MODE_DTL = "DTL";
	protected MCList<ConvQtyAmtUtil_Calc01_HdrR> _calc01HdrL = MCList.create(ConvQtyAmtUtil_Calc01_HdrR.class);
	protected MCIndexKey _idxCalc01HdrKey;
	protected static final String LIST_INDEX_KEY_NM = "sls_schd_no";
	protected void initCalc01Hdr() {
		_calc01HdrL.addNumberColumn("sls_schd_qty");
		_calc01HdrL.addNumberColumn("base_unit_cmpl_qty");
		_calc01HdrL.addStringColumn("base_unit_cd");
		_calc01HdrL.addStringColumn("sls_schd_no");
	}
	protected MCList<Chk01_RsltR> _slsSchdL = MCList.create(Chk01_RsltR.class);
	
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBBL_SlsActListReg> CLAZZ = MSBBL_SlsActListReg.class;

	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上予定の検索を行います。<br>
	 */
	public class Srch01 extends MSBBL_SlsActListReg_MC_A.Srch01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd();
			
			MCQueryPlan sql = MSBBL1320_MST_SLS_SCHD_S10();
			sql.addDynamicSQLInfo(checkJoin(up0()));
			searchForDL(sql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0());

			for (Srch01_RsltR dtlR : down0()) {

				if (isNull(dtlR.wg_cd())) {
					MAM_DPT_R dptR = _cacheMamDpt.get(dtlR.sls_schd_dt(), dtlR.sls_dpt_cd());
					dtlR.wg_cd(dptR.wg_cd());
					dtlR.wg_nm(dptR.getStringNE("wg_nm"));
				}

				if (isNull(dtlR.purc_schd_no()) && !isNull(dtlR.ship_dlv_slip_d_no()) && _cacheItm != null) {
					// 納品書伝票明細のロットに対する版NO
					MAM_ITM_R itmR = _cacheItm.get(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3());
					if (itmR.ver_flg()) {
						MSVT_LOT_LIST_R lotR = _cacheLot.get(dtlR.itm_cd(),
								dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.lot_no(), dtlR.sublot_no());
						dtlR.ver_no(lotR.ver_no());
					}
				}

				// 出荷元期限（詳細が複数件ある場合は表示しない）
				if (_cachePad != null) {
					MST_PURC_ACT_D_R padR = _cachePad.get(dtlR.purc_act_d_no(), dtlR.purc_act_d_seq());
					MCNumber cnt = padR.getNumberNE("valid_cnt");
					if (isNull(cnt) || !cnt.eq(1)) {
						dtlR.ship_fr_valid_dt(null);
					}
					else {
						dtlR.ship_fr_valid_dt(padR.getDate("ship_fr_valid_dt"));
					}
				}
				if (isNull(dtlR.bill_crryovr_times())) {
					if (!isNull(dtlR.itm_bill_crryovr_times())) {
						dtlR.bill_crryovr_times(dtlR.itm_bill_crryovr_times());
					}
					else {
						dtlR.bill_crryovr_times(dtlR.cst_bill_crryovr_times());
					}
				}
			}
			doEditDownSub();
		}
		
		@Override
		protected void doEditDown() {
			super.doEditDown();
		}
		
		/**
		 * 下り電文の加工
		 */
		protected void doEditDownSub() {
			MCList<Srch01_RsltR>[] ddlvIvGrpL = down0().groupList(Srch01_RsltR.$iv_no);
			
			for (MCList<Srch01_RsltR> tmpL : ddlvIvGrpL) {
				boolean ddlvGrpFlg = false;
				for (Srch01_RsltR tmpR : tmpL) {
					if (isNullOrNullVal(tmpR.iv_no())) {
						continue;
					}
					if (!isNull(tmpR.purc_schd_no())) {
						ddlvGrpFlg = true;
						break;
					}
				}
				if (ddlvGrpFlg) {
					tmpL.setValue(Srch01_RsltR.$ddlv_iv_grp_flg, true);
				}
			}
			
			setSlsTgtTyp(down0());
			
			setShipDlvDt();
			
			setEdiFlg();
			
			setLotNo();
			
			setRemoveFlgNotMatcheLotNoOrSubLotNo();
			
			calcQty(down0());
			
			convQtyAmt(down0());
			
			if (down0().size() > 0) {
				for (Srch01_RsltR dtlR : down0()) {
					// 複数詳細ＦＬＧ
					if (dtlR.ship_alloc_sts_cnt().gt(1) || dtlR.ship_act_d_cnt().gt(1) || dtlR.iv_ship_act_d_cnt().gt(1) || dtlR.arr_act_cnt().gt(1)) {
						dtlR.multi_io_flg(true);
					}
					// 複数出荷時納品書明細
					if (dtlR.dlv_slip_d_cnt().gt(1)) {
						dtlR.ship_dlv_slip_multi_flg(true);
						dtlR.ship_dlv_slip_d_no(null);
					}
					
					// 基準通貨換算
					dtlR.base_cur_upri(convToBaseCur(
							dtlR.trd_cur_upri(),
							dtlR.xrate(),
							dtlR.base_cur_upri_dec_place(),
							dtlR.xrate_rnd_typ()));
					dtlR.base_cur_amt(convToBaseCur(
							dtlR.trd_cur_amt(),
							dtlR.xrate(),
							dtlR.base_cur_amt_dec_place(),
							dtlR.xrate_rnd_typ()));
					dtlR.base_cur_tax_amt(convToBaseCur(
							dtlR.trd_cur_tax_amt(),
							dtlR.xrate(),
							dtlR.base_cur_amt_dec_place(),
							dtlR.xrate_rnd_typ()));
					dtlR.base_cur_dscnt_amt(convToBaseCur(
							dtlR.trd_cur_dscnt_amt(),
							dtlR.xrate(),
							dtlR.base_cur_amt_dec_place(),
							dtlR.xrate_rnd_typ()));
					dtlR.base_cur_inc_tax_amt(convToBaseCur(
							dtlR.trd_cur_inc_tax_amt(),
							dtlR.xrate(),
							dtlR.base_cur_amt_dec_place(),
							dtlR.xrate_rnd_typ()));
					
					// 納税通貨換算
					if (!isNull(dtlR.ptax_cur_cd())) {
						dtlR.ptax_cur_upri(convCur(
								dtlR.trd_cur_upri(),
								dtlR.ptax_xrate(),
								dtlR.ptax_cur_upri_dec_place(),
								dtlR.xrate_rnd_typ()));
						dtlR.ptax_cur_amt(convCur(
								dtlR.trd_cur_amt(),
								dtlR.ptax_xrate(),
								dtlR.ptax_cur_amt_dec_place(),
								dtlR.xrate_rnd_typ()));
						dtlR.ptax_cur_tax_amt(convCur(
								dtlR.trd_cur_tax_amt(),
								dtlR.ptax_xrate(),
								dtlR.ptax_cur_amt_dec_place(),
								dtlR.xrate_rnd_typ()));
						dtlR.ptax_cur_dscnt_amt(convCur(
								dtlR.trd_cur_dscnt_amt(),
								dtlR.ptax_xrate(),
								dtlR.ptax_cur_amt_dec_place(),
								dtlR.xrate_rnd_typ()));
						dtlR.ptax_cur_inc_tax_amt(convCur(
								dtlR.trd_cur_inc_tax_amt(),
								dtlR.ptax_xrate(),
								dtlR.ptax_cur_amt_dec_place(),
								dtlR.xrate_rnd_typ()));
						
					}
					// 原価金額、粗利率の設定
					dtlR.cost_amt(MSUCL_SlsUtil.getCostAmt(dtlR.cost_upri(), dtlR.base_unit_qty(), dtlR.base_cur_amt_dec_place()));
					dtlR.prof_rate(MSUCL_SlsUtil.getProfRate(dtlR.base_cur_amt(), dtlR.cost_amt()));
					
					if (!isNull(dtlR.wtax_rate())) {
						
						if (isSame(dtlR.trd_cur_cd(), dtlR.base_cur_cd()) 
								&& (isSame(dtlR.trd_cur_cd(), dtlR.ptax_cur_cd()) || isNull(dtlR.ptax_cur_cd()))) {
							// 取引通貨＝基準通貨＝納税通貨」、もしくは「取引通貨＝基準通貨かつ納税通貨IS NULL
							
							dtlR.wtax_amt(dtlR.trd_cur_amt().multiply(dtlR.wtax_rate()).divide(100,
									dtlR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(dtlR.wtax_rnd_typ())));
						}
						else {
							dtlR.wtax_rate(null);
						}
					}
					
					// ロット作成ＦＬＧ
					if (MSC_SLS_TGT_TYP.isDDLV_SLS(dtlR.sls_tgt_typ()) && dtlR.sync_flg()) {
						if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtlR.lot_mng_typ()) && isNull(dtlR.lot_no())) {
							dtlR.crt_lot_flg(true);
						}
					}
				}
			}
			
			down0().removeAll(down0().subList(Srch01_RsltR.$remove_flg, true));
		}
		
		/**
		 * 売上対象区分と最新税の設定
		 * @param rsltL
		 */
		protected void setSlsTgtTyp(MCList<Srch01_RsltR> rsltL) {
			if (down0().size() > 0) {
				for (Srch01_RsltR dtlR : down0()) {
					// 売上対象区分
					if (dtlR.sls_cststk_flg()) {
						dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.CSTSTK_SLS.value());
						
						if (!up0().sls_cststk_flg()) {
							dtlR.remove_flg(true);
						}
						setNewTax(dtlR);
					}
					else if (!isNull(dtlR.purc_schd_no()) || dtlR.ddlv_iv_grp_flg()) {
						dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.DDLV_SLS.value());
						
						if (!up0().sls_ddlv_flg()) {
							dtlR.remove_flg(true);
						}
						setNewTax(dtlR);
					}
					else if (!isNull(dtlR.sls_basis_typ()) && MAC_SLS_BASIS_TYP.isIN_BASIS(dtlR.sls_basis_typ())) {
						dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.XFR_IN_SLS.value());

						if (!up0().arrv_sls_flg()) {
							dtlR.remove_flg(true);
						}
					}
					else if (!isNull(dtlR.sls_basis_typ()) && MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(dtlR.sls_basis_typ())) {
						dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.ARRIVAL_SLS.value());

						if (!up0().arrv_base_sls_flg()) {
							dtlR.remove_flg(true);
						}
					}
					else {
						dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.NOT_SHIP_ORD_SLS.value());
						
						if (!up0().not_ship_ord_sls_flg() || isNull(dtlR.sls_schd_no())) {
							// マニュアルで追加したインボイス明細も表示する
							dtlR.remove_flg(true);
						}
						setNewTax(dtlR);
					}
				}
			}
		}
		protected void setShipDlvDt() {
			down0().forEach(r -> {
				if (r.cst_iv_flg() && !MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(r.sls_tgt_typ())
						&& !MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())) {
					r.ship_dt(null);
					r.ship_hm(null);
					r.dlv_dt(null);
					r.dlv_hm(null);
				}
			});
		}
		/**
		 * ＥＤＩＦＬＧを設定する
		 */
		protected void setEdiFlg() {
			down0().forEach(r -> {
				if (!MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())
						&& !MSC_SLS_TGT_TYP.isXFR_IN_SLS(r.sls_tgt_typ())
						&& !MSC_SLS_TGT_TYP.isARRIVAL_SLS(r.sls_tgt_typ())) {
					r.edi_flg(false);
				}
			});

			if (up0().edi_flg() && !up0().not_edi_flg()) {
				down0().subList(Srch01_RsltR.$edi_flg, false).setBoolean(Srch01_RsltR.$remove_flg, true);
			}
			else if (!up0().edi_flg() && up0().not_edi_flg()) {
				down0().subList(Srch01_RsltR.$edi_flg, true).setBoolean(Srch01_RsltR.$remove_flg, true);
			}
		}
		protected void setLotNo() {
			
			MCList<Srch01_RsltR> tgtL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if (r.cst_iv_flg()) {
					tgtL.add(r);
				}
			}
			if (tgtL.isEmpty()) {
				return;
			}
			
			// インボイス出荷実績
			MST_IV_SHIP_ACT_MAP_R map1 = MST_IV_SHIP_ACT_MAP_R.create("MAP1");
			MST_IV_SHIP_ACT_D_R t = MST_IV_SHIP_ACT_D_R.create("T");
			MCQueryApiBuilder bldr1 = MCQueryApiBuilder.create(t);
			MCList<MST_IV_SHIP_ACT_D_R> rslt1L = MCList.create(MST_IV_SHIP_ACT_D_R.class);
			
			bldr1.setSelect(t.lot_no, t.sublot_no, t.ver_no, map1.iv_d_no);
			bldr1.addInnerJoin(map1, bracket(t.ship_act_d_no.eq(map1.ship_act_d_no)));
			bldr1.setWhere(map1.iv_d_no.eq(bind("iv_d_no")));
			dbSelect("MSBBL1320_MST_IV_SHIP_ACT_D_S01", rslt1L, bldr1, tgtL);
			MCIndexKey key1 = rslt1L.createIndex(MST_IV_SHIP_ACT_D_R.$iv_d_no);
			
			// 出荷実績
			MST_IV_SHIP_ACT_MAP_R map2 = MST_IV_SHIP_ACT_MAP_R.create("MAP2");
			MST_SHIP_ACT_D_R t2 = MST_SHIP_ACT_D_R.create("T2");
			MCQueryApiBuilder bldr2 = MCQueryApiBuilder.create(t2);
			MCList<MST_SHIP_ACT_D_R> rslt2L = MCList.create(MST_SHIP_ACT_D_R.class);
			
			t2.addStringColumn("iv_d_no");
			bldr2.setSelect(t2.lot_no, t2.sublot_no, t2.ver_no, map2.iv_d_no);
			bldr2.addInnerJoin(map2, bracket(t2.ship_act_d_no.eq(map2.ship_act_d_no)));
			bldr2.setWhere(map2.iv_d_no.eq(bind("iv_d_no")).and(t2.can_flg.eq(value(false))));
			dbSelect("MSBBL1320_MST_SHIP_ACT_D_S01", rslt2L, bldr2, tgtL);
			MCIndexKey key2 = rslt2L.createIndex("iv_d_no");
			
			// 出荷引当状況
			MST_IV_MAP_R map3 = MST_IV_MAP_R.create("MAP3");
			MST_SHIP_ALLOC_STS_R t3 = MST_SHIP_ALLOC_STS_R.create("T3");
			MCQueryApiBuilder bldr3 = MCQueryApiBuilder.create(t3);
			MCList<MST_SHIP_ALLOC_STS_R> rslt3L = MCList.create(MST_SHIP_ALLOC_STS_R.class);
			
			t3.addStringColumn("iv_d_no");
			bldr3.setSelect(t3.lot_no, t3.sublot_no, t3.ver_no, map3.iv_d_no);
			bldr3.addInnerJoin(map3, bracket(t3.ship_schd_no.eq(map3.ship_schd_no)));
			bldr3.setWhere(map3.iv_d_no.eq(bind("iv_d_no")));
			dbSelect("MSBBL1320_MST_SHIP_ALLOC_STS_S02", rslt3L, bldr3, tgtL);
			MCIndexKey key3 = rslt3L.createIndex("iv_d_no");
			
			for (Srch01_RsltR r : tgtL) {
				MCList<MST_IV_SHIP_ACT_D_R> temp1L = rslt1L.subList(key1, r.iv_d_no());
				if (!isNull(temp1L) &&
						temp1L.groupBy(MST_IV_SHIP_ACT_D_R.$lot_no, MST_IV_SHIP_ACT_D_R.$sublot_no, MST_IV_SHIP_ACT_D_R.$ver_no).size() == 1) {
					r.lot_no(temp1L.get(0).lot_no());
					r.sublot_no(temp1L.get(0).sublot_no());
					r.ver_no(temp1L.get(0).ver_no());
				}
				else if (!isNull(temp1L) &&
						temp1L.groupBy(MST_IV_SHIP_ACT_D_R.$lot_no, MST_IV_SHIP_ACT_D_R.$sublot_no, MST_IV_SHIP_ACT_D_R.$ver_no).size() >= 2) {
					r.lot_no(null);
					r.sublot_no(null);
					r.ver_no(null);
				}
				else {
					MCList<MST_SHIP_ACT_D_R> temp2L = rslt2L.subList(key2, r.iv_d_no());
					if (!isNull(temp2L) &&
							temp2L.groupBy(MST_SHIP_ACT_D_R.$lot_no, MST_SHIP_ACT_D_R.$sublot_no, MST_SHIP_ACT_D_R.$ver_no).size() == 1) {
						r.lot_no(temp2L.get(0).lot_no());
						r.sublot_no(temp2L.get(0).sublot_no());
						r.ver_no(temp2L.get(0).ver_no());
					}
					else if (!isNull(temp2L) &&
							temp2L.groupBy(MST_SHIP_ACT_D_R.$lot_no, MST_SHIP_ACT_D_R.$sublot_no, MST_SHIP_ACT_D_R.$ver_no).size() >= 2) {
						r.lot_no(null);
						r.sublot_no(null);
						r.ver_no(null);
					}
					else {
						MCList<MST_SHIP_ALLOC_STS_R> temp3L = rslt3L.subList(key3, r.iv_d_no());
						if (!isNull(temp3L) &&
								temp3L.groupBy(MST_SHIP_ALLOC_STS_R.$lot_no, MST_SHIP_ALLOC_STS_R.$sublot_no, MST_SHIP_ALLOC_STS_R.$ver_no).size()== 1) {
							r.lot_no(temp3L.get(0).lot_no());
							r.sublot_no(temp3L.get(0).sublot_no());
							r.ver_no(temp3L.get(0).ver_no());
						}
						else {
							r.lot_no(null);
							r.sublot_no(null);
							r.ver_no(null);
						}
					}
				}
			}
		}
		
		protected void setRemoveFlgNotMatcheLotNoOrSubLotNo() {
			if (down0().size() > 0) {
				for (Srch01_RsltR dtlR : down0()) {
					if (dtlR.remove_flg()) {
						continue;
					}
					if (!isNull(up0().lot_no())) {
						if (!isLike(dtlR.lot_no(), up0().lot_no())) {
							dtlR.remove_flg(true);
						}
					}
					if (!isNull(up0().sublot_no())) {
						if (!isLike(dtlR.sublot_no(), up0().sublot_no())) {
							dtlR.remove_flg(true);
						}
					}
				}
			}
		}
		
		/**
		 * 内税・税指定が共にオフの場合、最新の税情報を設定する
		 * @param dtlR
		 */
		protected void setNewTax(Srch01_RsltR dtlR) {
			if (!dtlR.inc_tax_flg() && !dtlR.tax_fix_flg() && !isSame(dtlR.tax_cd(), dtlR.new_tax_cd())) {
				dtlR.tax_cd(dtlR.new_tax_cd());
				dtlR.tax_nm(dtlR.new_tax_nm());
				dtlR.tax_typ(dtlR.new_tax_typ());
				dtlR.inc_tax_flg(dtlR.new_inc_tax_flg());
				dtlR.tax_rate(dtlR.new_tax_rate());
			}
		}
		
		protected java.math.RoundingMode toRoundingMode(String rndTyp) {
			MAC_RND_TYP typ = MAC_RND_TYP.getNE(rndTyp);
			if (typ == null) {
				return null;
			}
			else {
				return typ.toMC();
			}
		}
		
		protected void editCnd() {
			Srch01_CndR cnd = up0();
			
			// Ｉ／Ｖ取引対象フラグの状態に応じ、インボイス取引対象を対象とするかどうかの条件を追加
			if (cnd.iv_flg() && !cnd.not_iv_flg()) {
				cnd.addStringColumn("cst_iv_flg_str", toTrueStr(cnd.iv_flg()));
			}
			else if (!cnd.iv_flg() && cnd.not_iv_flg()) {
				cnd.addStringColumn("cst_iv_flg_str", toFalseStr(cnd.iv_flg()));
			}
			if (cnd.edi_flg() && !cnd.not_edi_flg()) {
				cnd.addStringColumn("edi_flg_str", toTrueStr(cnd.edi_flg()));
			}
			else if (!cnd.edi_flg() && cnd.not_edi_flg()) {
				cnd.addStringColumn("edi_flg_str", toFalseStr(cnd.edi_flg()));
			}
			cnd.addDateColumn("today", getToday());
			cnd.addStringColumn("base_cur_cd", getCo().base_cur_cd());
			cnd.addStringColumn("sls_xrate_cd", getCo().sls_xrate_cd());
			cnd.addStringColumn("ptax_cur_cd", getCo().ptax_cur_cd());
			cnd.addStringColumn("xrate_rnd_typ", getCo().xrate_rnd_typ());
			cnd.addStringColumn("wtax_rnd_typ", getCo().wtax_rnd_typ());
		}
		
		
		/**
		 * 基準単位数量は、「売上予定.基準単位数量 - 売上予定.基準単位売上数量」の結果で<br>
		 * 取得基準単位数量を取引単位ＣＤで換算可能であれば換算結果し、換算不可であれば基準単位数量、単位ＣＤを設定する
		 *
		 * @param rsltL 検索結果
		 */
		protected void calcQty(MCList<Srch01_RsltR> rsltL) {

			MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			for (Srch01_RsltR rsltR : rsltL) {
				if ((MSC_SLS_TGT_TYP.isXFR_IN_SLS(rsltR.sls_tgt_typ()) || MSC_SLS_TGT_TYP.isARRIVAL_SLS(rsltR.sls_tgt_typ())) && !rsltR.remove_flg()) {
					if (rsltR.cst_iv_flg() && isNull(rsltR.slo_no())) {
						// インボイス取引対象計画外出荷の場合、売上予定に返品数量が反映済のため、計算不要
						continue;
					}
					slsSchdL.add().sls_schd_no(rsltR.sls_schd_no());
				}
			}
			if (!slsSchdL.isEmpty()) {
				MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
				dbWkDelete("MSBBL1320_MSW_SLS_SCHD_D01", slsSchdL_bldr.getBaseDbc());
				dbWkInsert("MSBBL1320_MSW_SLS_SCHD_I01", slsSchdL, slsSchdL_bldr.getBaseDbc());
				
				slsSchdL.addNumberColumn("ship_ret_qty");
				executeQuery(slsSchdL, MSBBL1320_MST_SLS_SCHD_S11());
				
				dbWkDelete("MSBBL1320_MSW_SLS_SCHD_D02", slsSchdL_bldr.getBaseDbc());
			}
			MCIndexKey ik = slsSchdL.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
			for (Srch01_RsltR rsltR : rsltL) {

				rsltR.base_unit_qty(rsltR.sls_schd_qty().subtract(rsltR.sls_qty()).subtract(rsltR.abort_qty()));
				MST_SLS_SCHD_R slsSchdR = slsSchdL.getFirst(ik, rsltR.sls_schd_no());
				if (slsSchdR != null) {
					rsltR.base_unit_qty(rsltR.base_unit_qty().subtract(slsSchdR.getNumber("ship_ret_qty")));
					if (rsltR.base_unit_qty().isZero()) {
						rsltR.remove_flg(true);
						continue;
					}
				}
				
				MCNumber convQty = rvrsBaseUnitConv(rsltR.base_unit_qty(),
						rsltR.trd_unit_conv_base_qty(), rsltR.trd_unit_conv_qty(),
						rsltR.trd_unit_dec_place(), rsltR.trd_unit_rnd_typ());
				MCNumber reEntQty = convToBaseUnit(convQty,
						rsltR.trd_unit_conv_base_qty(), rsltR.trd_unit_conv_qty(),
						rsltR.base_unit_dec_place(), rsltR.base_unit_rnd_typ());
				if(isSame(reEntQty, rsltR.base_unit_qty())) {
					rsltR.trd_unit_qty(convQty);
				}
				else {
					rsltR.trd_unit_qty(rsltR.base_unit_qty());
					rsltR.trd_unit_cd(rsltR.base_unit_cd());
					rsltR.trd_unit_nm(rsltR.base_unit_nm());
					rsltR.trd_unit_dec_place(rsltR.base_unit_dec_place());
					rsltR.trd_unit_rnd_typ(rsltR.base_unit_rnd_typ());
					rsltR.trd_unit_conv_base_qty(1);
					rsltR.trd_unit_conv_qty(1);
				}
			}
		}
		
		/**
		 * 単位金額を換算する。
		 * @param rsltL 検索結果
		 */
		protected void convQtyAmt(MCList<Srch01_RsltR> rsltL) {
					
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			
			ConvQtyAmtUtil_Calc01_HdrR up0R = null;
			ConvQtyAmtUtil_Calc01_Dtl1R up1R = null;
			
			setPegNo(rsltL);
			
			for (Srch01_RsltR rsltR : rsltL) {
				
				up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
				copy(up0R, rsltR, createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR());
				
				up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
				copy(up1R, rsltR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR());
				
				ope.up0().add(up0R);
				ope.up1().add(up1R);
			}
			
			if (!ope.up0().isEmpty()) {
				
				setPegNo(ope.up0());
				
				setPegNo(ope.up1());
				setPegNo(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, ope.up1());
				
				ope.exec();
				
				String[] destCols = new String[] {
						Srch01_RsltR.$trd_cur_upri, 
						Srch01_RsltR.$trd_cur_dscnt_amt,
						Srch01_RsltR.$trd_cur_amt, 
						Srch01_RsltR.$trd_cur_tax_amt,
						Srch01_RsltR.$trd_cur_inc_tax_amt
						,Srch01_RsltR.$wtax_amt
				};
				String[] srcCols = new String[] {
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri,
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_dscnt_amt,
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_amt,
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_tax_amt,
						ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_inc_tax_amt
						,ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_amt
				};

				copyByPegNo(rsltL, destCols, ope.down0(), srcCols);
			}
		}
	}
	
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 売上実績の検索を行います。<br>
	 */
	public class Srch02 extends MSBBL_SlsActListReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			refBindForBizDatDL(up0());
			setGrpFlgTrue(up0());
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			MCQueryPlan sql = null;

			// 検索モード「明細」
			if (isSame(up0().mode(), SRCH_MODE_DTL)) {
				editCnd();
				sql = MSBBL1320_MST_SLS_ACT_D_S04();
			}
			// 検索モード「ヘッダ」
			else {
				setEdiFlgStr(up0());
				sql = MSBBL1320_MST_SLS_ACT_S02();
			}
			searchForDL(sql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			setValuesDbc(up0(), down0());
			
			if (down0().size() > 0) {
				// 検索モードが明細の場合
				if (isSame(up0().mode(), SRCH_MODE_DTL)) {
					//データ補完処理
					crrctData();
				}
				MCList<Srch01_RsltR> removeL = MCList.create(Srch01_RsltR.class);
				for (Srch01_RsltR rsltR : down0()) {
					if (!isNull(rsltR.rcv_schd_dt())) {
						rsltR.bill_basis_dt(null);
					}
					// 検索モードが明細の場合
					if (isSame(up0().mode(), SRCH_MODE_DTL)) {
						// 売上対象区分の設定
						if (isNull(rsltR.sls_schd_no()) || (isNull(rsltR.slo_d_no())
								&& !existsNotShipOrdSlsIv(rsltR.iv_no())
								&& (MAC_SLS_BASIS_TYP.isSHIP_BASIS(rsltR.sls_basis_typ()) || isNull(rsltR.sls_basis_typ())))) {
							rsltR.sls_tgt_typ(MSC_SLS_TGT_TYP.NON_SCHD.value());
						}
						else if (rsltR.sls_cststk_flg()) {
							rsltR.sls_tgt_typ(MSC_SLS_TGT_TYP.CSTSTK_SLS.value());
						}
						else if (!isNull(rsltR.po_no()) || rsltR.ddlv_iv_grp_flg()) {
							rsltR.sls_tgt_typ(MSC_SLS_TGT_TYP.DDLV_SLS.value());
						}
						else if (MAC_SLS_BASIS_TYP.isIN_BASIS(rsltR.sls_basis_typ())) {
							rsltR.sls_tgt_typ(MSC_SLS_TGT_TYP.XFR_IN_SLS.value());
						}
						else if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(rsltR.sls_basis_typ())) {
							rsltR.sls_tgt_typ(MSC_SLS_TGT_TYP.ARRIVAL_SLS.value());
						}
						else if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(rsltR.sls_basis_typ()) 
								&& (MAC_SHIP_INST_TYP.isNON(rsltR.ship_inst_typ()) || (isNull(rsltR.slo_d_no()) && existsNotShipOrdSlsIv(rsltR.iv_no())))) {
							rsltR.sls_tgt_typ(MSC_SLS_TGT_TYP.NOT_SHIP_ORD_SLS.value());
							if (rsltR.abort_flg() && _cacheSlodSls != null) {
								// 同一受注明細ＮＯの売上予定の合計値で売上予定数量、打切数量を設定
								MST_SLO_D_R slodR = _cacheSlodSls.getCache(rsltR.slo_d_no());
								if (slodR != null) {
									rsltR.sls_schd_qty(slodR.getNumberNE("sls_schd_qty"));
									rsltR.abort_qty(slodR.getNumberNE("abort_qty"));
								}
							}
						}
						else if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(rsltR.sls_basis_typ()) && !MAC_SHIP_INST_TYP.isNON(rsltR.ship_inst_typ())) {
							rsltR.sls_tgt_typ(MSC_SLS_TGT_TYP.SHIP_ORD_SLS.value());
						}
						rsltR.prof_rate(MSUCL_SlsUtil.getProfRate(rsltR.base_cur_amt(), rsltR.cost_amt()));
						MAM_ITM_R itmR = _cacheItm.get(rsltR.itm_cd(), rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3());
						if (itmR.ver_flg()) {
							MSVT_LOT_LIST_R lotR = _cacheLot.get(
									rsltR.itm_cd(), rsltR.itm_sub1(), rsltR.itm_sub2(), rsltR.itm_sub3(), rsltR.lot_no(), rsltR.sublot_no());
							rsltR.ver_no(lotR.ver_no());
						}
						if (_cacheSad != null) {
							MST_SLS_ACT_D_R sadR = _cacheSad.getCache(rsltR.sls_act_d_no(), rsltR.sls_act_d_seq());
							if (sadR != null) {
								// 仕入同時計上
								MCNumber cnt = sadR.getNumberNE("sync_flg_cnt");
								rsltR.sync_flg(!isNull(cnt) && cnt.isPositive());
		
								// 複数詳細
								cnt = sadR.getNumberNE("io_cnt");
								rsltR.multi_io_flg(!isNull(cnt) && cnt.gt(1));
							}
						}

						if (isNull(rsltR.getStringNE("iv_no_sls_schd"))) {
							// インボイスの場合はSQLで取得済み
							// (売上予定のインボイスNOを参照する。売上実績が持つインボイスはインボイス取引対象でなくても設定されることがあるため)
							if (_cacheSlo != null) {
								MST_SLO_R sloR = _cacheSlo.get(rsltR.slo_no());
								rsltR.xrate_inpt_flg(sloR.xrate_inpt_flg());
								rsltR.ptax_xrate_inpt_flg(sloR.ptax_xrate_inpt_flg());
							}
						}
						// インボイス対象だと売上実績明細の売上予定NOの有無では計画外かどうか判断できないのでここで計画外を除外
						if (!up0().non_schd_flg() && MSC_SLS_TGT_TYP.isNON_SCHD(rsltR.sls_tgt_typ())) {
							removeL.add(rsltR);
						}
						// 入荷予定ロット指定
						if (_cacheSs != null) {
							MST_SLS_SCHD_R ssR = _cacheSs.get(rsltR.sls_schd_no());
							rsltR.arr_schd_lot_fix_flg(ssR.getBooleanNE("arr_schd_lot_fix_flg"));
						}
					}
				}
				if (!isNull(removeL)) {
					down0().removeAll(removeL);
				}
			}
		}
		/**
		 * 
		 * @param ivNo インボイス明細NO
		 * @return 出荷指図対象外売上のインボイスに追加した明細の場合はtrue
		 */
		protected boolean existsNotShipOrdSlsIv(String ivNo) {
			if (isNullOrNullVal(ivNo)) {
				return false;
			}
			
			return !down0().subList(r->isSame(r.iv_no(), ivNo) 
					&& MAC_SLS_BASIS_TYP.isSHIP_BASIS(r.sls_basis_typ()) 
					&& !r.sls_cststk_flg()
					&& isNull(r.po_no())
					&& !r.ddlv_iv_grp_flg()
					&& MAC_SHIP_INST_TYP.isNON(r.ship_inst_typ())).isEmpty();
		}
		
		/**
		 * データ補完処理
		 */
		protected void crrctData() {
			MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
			for (Srch01_RsltR r : down0()) {
				MST_SLS_ACT_D_R slsActDR = MST_SLS_ACT_D_R.create();
				slsActDR.sls_act_d_no(r.sls_act_d_no());
				slsActDR.sls_act_d_seq(r.sls_act_d_seq());
				slsActDL.add(slsActDR);
			}
			MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(MST_SLS_ACT_D_R.create("T"));
			dbWkDelete("MSBBL1320_MSW_SLS_ACT_D_D01", slsActDL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1320_MSW_SLS_ACT_D_I01", slsActDL, slsActDL_bldr.getBaseDbc());
			
			MCList<Srch01_RsltR> tmpL = MCList.create(Srch01_RsltR.class);
			executeQuery(tmpL, MSBBL1320_MSW_SLS_ACT_D_KEY_S01());
			MCIndexKey slsActDKey = tmpL.createIndex(Srch01_RsltR.$sls_act_d_no, Srch01_RsltR.$sls_act_d_seq);
			for (Srch01_RsltR r : down0()) {
				Srch01_RsltR tgtR = tmpL.getFirst(slsActDKey, r.sls_act_d_no(), r.sls_act_d_seq());
				if (!isNull(tgtR)) {
					r.ship_fr_valid_dt(tgtR.ship_fr_valid_dt());
				}
			}
		}
		
		protected void editCnd() {
			Srch01_CndR cnd = up0();

			cnd.addStringColumn("xrate_rnd_typ", getCo().xrate_rnd_typ());
			cnd.addStringColumn("wtax_rnd_typ", getCo().wtax_rnd_typ());
			setEdiFlgStr(cnd);
		}
		/**
		 * ＥＤＩＦＬＧの検索条件設定
		 */
		protected void setEdiFlgStr(Srch01_CndR cnd) {
			if (cnd.edi_flg() && !cnd.not_edi_flg()) {
				cnd.addStringColumn("edi_flg_str", toTrueStr(cnd.edi_flg()));
			}
			else if (!cnd.edi_flg() && cnd.not_edi_flg()) {
				cnd.addStringColumn("edi_flg_str", toFalseStr(cnd.edi_flg()));
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェックを行います。<br>
	 */
	public class Chk01 extends MSBBL_SlsActListReg_MC_A.Chk01 {
		protected MCList<MST_SLS_SCHD_R> _slsSchdL;
		protected MCList<MST_SHIP_PR_R> _shipPrL;
		protected MCIndexKey _slsSchdIdxKey;
		protected MCIndexKey _shipPrIdxKey;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			super.doIt();
			setDown();
		}
		
		/**
		 * 各部門組織変更対応
		 */
		protected void editUp() {
			// 負担部門
			MAUCL_DptUtil.setDpt(up0(), Chk01_RsltR.$bd_dpt_cd, Chk01_RsltR.$ac_dt);
			
			// 売上部門
			MAUCL_DptUtil.setDpt(up0(), Chk01_RsltR.$sls_dpt_cd, Chk01_RsltR.$ac_dt);
			
			// 債権部門
			MAUCL_DptUtil.setDpt(up0(), Chk01_RsltR.$ar_dpt_cd, Chk01_RsltR.$ac_dt);
		}
		
		protected void setDown() {
			down0().addAll(up0());
			down2().addAllByName(_calc01HdrL);
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			// 排他制御
			lock();
			
			// 更新カウンタチェック
			msgL.addAll(checkUpdCntr());
			
			// 更新カウンタチェック（出荷進捗）
			msgL.addAll(checkShipPrUpdCntr());
			
			setErrFlg(msgL);
			
			// データ補完
			crrctData();
			
			// 承認提供チェックサービス呼出
			callAprvSv();
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			msgL.addAll(checkDtl());
			// 品目マスタ存在チェック
			msgL.addAll(checkMamItm());
			return msgL;
		}
		
		protected MCMessageList checkDtl() {
			MCMessageList msgL = new MCMessageList();
			initBpCache();
			for (Chk01_RsltR r : up0()) {
				//Chk01~Chk03でcheckCstを共通化している都合で、cst_cdも引数として渡す
				msgL.addAll(checkCst(r, r.cst_cd()));
			}
			return msgL;
		}
		
		/**
		 * 品目マスタ存在チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkMamItm() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MAM_ITM_R> mamItmL = searchMamItm(up0());

			MCIndexKey mamItmIdx = mamItmL.createIndex(MAM_ITM_R.create().getKeyColumn());
			
			for (Chk01_RsltR up0R : up0()) {
				if (isNull(mamItmL.getFirst(mamItmIdx, up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3()))) {
					String itmInfo = toDispItm(up0R.itm_cd(), up0R.itm_sub1(), up0R.itm_sub2(), up0R.itm_sub3());
					msgL.add(new MCMessage(up0R, null, MAUAL0189, itmInfo, toDispGUIIndex(up0R)));
				}
			}
			return msgL;
		}
		
		/**
		 * 承認提供チェックサービス呼出
		 */
		protected void callAprvSv() {
			for (Chk01_RsltR chkR : up0()) {
				if ((MSC_SLS_TGT_TYP.isCSTSTK_SLS(chkR.sls_tgt_typ()) || MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(chkR.sls_tgt_typ())) &&
					!isNull(chkR.slo_no()) && !isNull(chkR.aprv_no())) {
					MBBAL_AprvService.Aprv_Chk02 aprvChk02 = MBBAL_AprvService.crtAprv_Chk02();
					MBBAL_AprvService.Aprv_Chk03 aprvChk03 = MBBAL_AprvService.crtAprv_Chk03();
					Aprv_Chk02_Rslt1R chk02Up = aprvChk02.up0().createRow();
					Aprv_Chk02_Rslt1R chk03Up = aprvChk03.up0().createRow();
					
					chk02Up.aprv_no(chkR.aprv_no());
					chk03Up.aprv_no(chkR.aprv_no());
					aprvChk02.up0().add(chk02Up);
					aprvChk03.up0().add(chk03Up);
					
					if (!aprvChk02.up0().isEmpty()) {
						aprvChk02.exec();
						copyErrFlg(chkR, aprvChk02.down0().get(0));
					}
					
					if (!chkR.err_flg() && !aprvChk03.up0().isEmpty()) {
						aprvChk03.exec();
						copyErrFlg(chkR, aprvChk03.down0().get(0));
					}
				}
			}
		}
		
		/**
		 * 更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList checkUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_RsltR> chkL = up0().groupBy(Chk01_RsltR.$sls_schd_no, Chk01_RsltR.$upd_cntr);
			for (Chk01_RsltR chkR : chkL) {
				
				MST_SLS_SCHD_R slsSchdR = _slsSchdL.getFirst(_slsSchdIdxKey, chkR.sls_schd_no());
				
				if (isNull(slsSchdR) || slsSchdR.isEmpty()) {
					msgL.addAll(checkUpdCntrNE(chkR, Chk01_RsltR.$upd_cntr, null));
				} 
				else {
					msgL.addAll(checkUpdCntrNE(chkR, Chk01_RsltR.$upd_cntr, slsSchdR));
				}
			}
			
			// CauseRowを差し替える
			MCIndexKey idxkey = up0().createIndex(Chk01_RsltR.$sls_schd_no);
			for (MCMessage msg : msgL) {
				
				Chk01_RsltR errMsgR = (Chk01_RsltR)msg.getCauseRow();
				Chk01_RsltR causeRow = up0().getFirst(idxkey, errMsgR.sls_schd_no());
				msg.setCauseRow(causeRow, msg.getCauseColumn());
			}
			
			setErrFlg(msgL);
			
			MCList<Chk01_RsltR>[] chkGrpL = up0().groupList(Chk01_RsltR.$chk_grp_no);
			for (MCList<Chk01_RsltR> chkRsltL : chkGrpL) {
				if (hasErrFlgOn(chkRsltL)) {
					msgL.addAll(setErrChkGrp(chkRsltL));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 	出荷進捗の更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList checkShipPrUpdCntr() {
			
			MCMessageList msgL = new MCMessageList();
			
			if (isNull(_shipPrL)) {
				return msgL;
			}
			
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			for (Chk01_RsltR r : notErrL) {
				if (!isNull(r.slo_d_no()) && !isNull(r.ship_pr_upd_cntr())) {
					MST_SHIP_PR_R shipPr = _shipPrL.getFirst(_shipPrIdxKey, r.slo_d_no());
					if (isNull(shipPr) || shipPr.isEmpty()) {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$ship_pr_upd_cntr, null));
					}
					else {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$ship_pr_upd_cntr, shipPr));
					}
				}
			}
			
			MCIndexKey idxkey = up0().createIndex(Chk01_RsltR.$slo_d_no);
			for (MCMessage msg : msgL) {
				
				Chk01_RsltR errMsgR = (Chk01_RsltR)msg.getCauseRow();
				Chk01_RsltR causeRow = up0().getFirst(idxkey, errMsgR.slo_d_no());
				msg.setCauseRow(causeRow, msg.getCauseColumn());
			}
			
			setErrFlg(msgL);
			
			MCList<Chk01_RsltR>[] chkGrpL = up0().groupList(Chk01_RsltR.$chk_grp_no);
			for (MCList<Chk01_RsltR> chkRsltL : chkGrpL) {
				if (hasErrFlgOn(chkRsltL)) {
					msgL.addAll(setErrChkGrp(chkRsltL));
				}
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckBase();
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			MSBEL_ExActService.ExAct_Chk02 exOpe = MSBEL_ExActService.crtExAct_Chk02();
			
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			initDbcCacheDlvSlip(notErrL);
			for (MCList<Chk01_RsltR> chkL : notErrL.groupList(Chk01_RsltR.$chk_grp_no)) {
				MSBDL_PurcActRegService.Purc_Chk03 tmpOpe = MSBDL_PurcActRegService.crtPurc_Chk03();
				MSBEL_ExActService.ExAct_Chk02 tmpExOpe = MSBEL_ExActService.crtExAct_Chk02();
				
				// DAC更新権限チェック
				msgL.addAll(checkWritableDptCdDac(chkL, Chk01_RsltR.$sls_dpt_cd));
				
				// 固有チェック
				msgL.addAll(checkOther(chkL));
				
				// 仕入実績登録チェックサービス呼出電文作成
				tmpOpe = makePurcActRegSvChk03(chkL);
				ope.up0().addAll(tmpOpe.up0());
				ope.up1().addAll(tmpOpe.up1());
				ope.up2().addAll(tmpOpe.up2());
				
				// 輸出実績サービス：インボイス更新前チェック呼出電文作成
				tmpExOpe = makeExActSvChk02(chkL);
				exOpe.up0().addAll(tmpExOpe.up0());
				
			}
			
			// 仕入実績登録チェックサービス呼出
			callPurcActRegSvChk03(ope);
			
			// 輸出実績サービス：インボイス更新前チェック呼出
			callExActSvChk02(exOpe);
			
			// 同一処理グループで一件でもエラーがあった場合、その他のレコードもエラーにする
			setErrFlg(msgL);
			MCList<Chk01_RsltR>[] chkGrpL = up0().groupList(Chk01_RsltR.$chk_grp_no);
			for (MCList<Chk01_RsltR> chkL : chkGrpL) {
				if (hasErrFlgOn(chkL)) {
					msgL.addAll(setErrChkGrp(chkL));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 	チェックＧＲＰＮＯ単位のすべてのレコードのエラーＦＬＧをオンにする
		 * @param chkL
		 */
		protected MCMessageList setErrChkGrp(MCList<Chk01_RsltR> chkL) {

			MCMessageList msgL = new MCMessageList();

			Chk01_RsltR errDtl = chkL.getFirst(Chk01_RsltR.$err_flg, true);

			for (Chk01_RsltR r : chkL) {
				if (!r.err_flg()) {
					msgL.add(new MCMessage(r, null, MAUDL0013, toDispGUIIndex(r), toDispGUIIndex(errDtl)));
					r.err_flg(true);
				}
			}
			return msgL;
		}
		
		/**
		 * 輸出実績サービス：インボイス更新前チェック呼出
		 * 
		 * @param ope
		 */
		protected void callExActSvChk02(MSBEL_ExActService.ExAct_Chk02 ope) {
			if (!ope.up0().isEmpty()) {
				ope.exec();
				copyErrFlg(up0(), ope.down0());
			}
		}
		
		/**
		 * 輸出実績サービス：インボイス更新前チェック呼出電文作成
		 * 
		 * @param chkL
		 * @return
		 */
		protected MSBEL_ExActService.ExAct_Chk02 makeExActSvChk02(MCList<Chk01_RsltR> chkL) {
			MSBEL_ExActService.ExAct_Chk02 ope = MSBEL_ExActService.crtExAct_Chk02();
			ExAct_Upd02_DtlR oUp0;
			MCList<Chk01_RsltR> ivGrL = chkL.groupBy(
					Chk01_RsltR.$peg_no,
					Chk01_RsltR.$sls_tgt_typ,
					Chk01_RsltR.$cst_iv_flg,
					Chk01_RsltR.$sls_cststk_flg,
					Chk01_RsltR.$via_dlv_typ,
					Chk01_RsltR.$iv_no);
			for (Chk01_RsltR chkR : ivGrL) {
				if (chkR.cst_iv_flg()
						&& !isNullOrNullVal(chkR.iv_no())
						&& !chkR.sls_cststk_flg()
						&& !MAC_VIA_DLV_TYP.isVIA(chkR.via_dlv_typ())) {
					oUp0 = ExAct_Upd02_DtlR.create();
					oUp0.peg_no(chkR.peg_no());
					oUp0.iv_no(chkR.iv_no());
					oUp0.cmpl_flg(true);
					ope.up0().add(oUp0);
				}
			}
			
			return ope;
		}
		
		/**
		 * 仕入実績登録チェックサービス呼出（新規登録用）
		 * 
		 * @param ope
		 */
		protected void callPurcActRegSvChk03(MSBDL_PurcActRegService.Purc_Chk03 ope) {
			if (!ope.up0().isEmpty()) {
				ope.up3().crt_param_cache_flg(true);
				ope.up3().purc_ddlv_reg_exec_flg(true);
				ope.exec();
				// ヘッダ、明細、詳細のいずれかでもエラーならばエラー
				copyErrFlg(up0(), ope.down0());
				copyErrFlg(up0(), ope.down1());
				copyErrFlg(up0(), ope.down2());
			}
		}
		
		/**
		 * 	仕入実績登録チェックサービス呼出電文作成（新規登録用）
		 */
		protected MSBDL_PurcActRegService.Purc_Chk03 makePurcActRegSvChk03(MCList<Chk01_RsltR> chkL) {
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			
			chkL.setDateNE("today", getToday());
			
			// 売上実績一覧登録からの仕入直送売上では、ヘッダ：明細：詳細＝１：１：１の関係
			MCList<MST_SLS_SCHD_R> wkL = MCList.create(MST_SLS_SCHD_R.class);
			for (Chk01_RsltR chkR : chkL) {
				if (chkR.sync_flg()) {
					MST_SLS_SCHD_R wkR = MST_SLS_SCHD_R.create();
					wkR.sls_schd_no(chkR.sls_schd_no());
					wkL.add(wkR);
				}
			}
			if (wkL.isEmpty()) {
				return ope;
			}
			
			MCList<Purc_Chk03_HdrR> oUp0L = MCList.create(Purc_Chk03_HdrR.class);
			MCList<Purc_Chk03_DtlR> oUp1L = MCList.create(Purc_Chk03_DtlR.class);
			oUp1L.addNumberColumn("po_base_unit_qty");
			oUp1L.addStringColumn("purc_amt_rnd_typ");
			oUp1L.addStringColumn("ship_pr_loc_cd");
			oUp1L.addStringColumn("ship_pr_str_ln_cd");
			oUp1L.addStringColumn("pr_loc_wg_cd");
			MCIndexKey ikUp0 = null;
			MCIndexKey ikUp1 = null;

			if (!wkL.isEmpty()) {
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
				dbWkDelete("MSBBL1320_MSW_SLS_SCHD_D03", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBBL1320_MSW_SLS_SCHD_I02", wkL, wkL_bldr.getBaseDbc());
				
				MCRow row = MCRow.create();
				row.addDateColumn("today", chkL.getDate(0, "sls_dt"));

				executeQuery(oUp0L, MSBBL1320_MST_SLS_SCHD_S04(), row);
				executeQuery(oUp1L, MSBBL1320_MST_PO_D_S01(), row);
				
				ikUp0 = oUp0L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
				ikUp1 = oUp1L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);

				dbWkDelete("MSBBL1320_MSW_SLS_SCHD_D04", wkL_bldr.getBaseDbc());
			}
			for (Chk01_RsltR chkR : chkL) {
				if (chkR.sync_flg()) {
					Purc_Chk03_HdrR oUp0 = oUp0L.getFirst(ikUp0, chkR.sls_schd_no());	// ヘッダ
					Purc_Chk03_DtlR oUp1 = oUp1L.getFirst(ikUp1, chkR.sls_schd_no());	// 明細
					Purc_Chk03_IoR oUp2 = ope.up2().createRow();	// 詳細
					
					// ヘッダ情報の設定
					copy(oUp0, chkR, createMap_Purc_Chk03_HdrR_Chk01_RsltR());
					oUp0.peg_no(chkR.peg_no());
					ope.up0().add(oUp0);
					chkR.po_no(oUp0.po_no());
					
					// 明細情報の設定
					copy(oUp1, chkR, createMap_Purc_Chk03_DtlR_Chk01_RsltR());
					chkR.loc_cd(oUp1.dlv_loc_cd());
					chkR.str_ln_cd(oUp1.str_ln_cd());
					oUp1.hdr_peg_no(oUp0.peg_no());
					oUp1.peg_no(oUp0.peg_no());
					
					// 基準単位数
					if (isSame(oUp1.trd_unit_cd(), oUp1.base_unit_cd())) {
						oUp1.base_unit_qty(oUp1.trd_unit_qty());
					}
					else {
						oUp1.base_unit_qty(getBaseUnitQty(
								oUp1.trd_unit_qty(),
								oUp1.trd_unit_cd(),
								oUp1.base_unit_cd(),
								oUp1.itm_cd(),
								oUp1.itm_sub1(),
								oUp1.itm_sub2(),
								oUp1.itm_sub3()));
					}
					
					// 取引通貨明細値引金額
					MAM_CUR_R trdCurR = getCur(chkR.trd_cur_cd());
					if (!isNull(oUp1.trd_cur_dscnt_amt())) {
						oUp1.trd_cur_dscnt_amt(
							oUp1.trd_cur_dscnt_amt().multiply(oUp1.base_unit_qty())
							.divide(oUp1.getNumberNE("po_base_unit_qty"), trdCurR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(oUp1.getStringNE("purc_amt_rnd_typ")))
						);
					}
					ope.up1().add(oUp1);
					
					// 詳細情報の設定
					copy(oUp2, oUp1, createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR());
					
					// ロット作成
					if (chkR.crt_lot_flg()) {
						oUp2.crt_lot_flg(true);
					}
					
					oUp2.dtl_peg_no(oUp1.peg_no());
					oUp2.peg_no(oUp2.dtl_peg_no());
					
					if (isPack(oUp1.itm_cd(), oUp1.itm_sub1(), oUp1.itm_sub2(), oUp1.itm_sub3(), oUp1.trd_unit_cd())){
						oUp2.pack_unit_cd(oUp2.trd_unit_cd());
						oUp2.pack_unit_qty(oUp2.trd_unit_qty());
					}
					else {
						oUp2.pack_unit_cd(oUp2.base_unit_cd());
						oUp2.pack_unit_qty(oUp2.base_unit_qty());
					}
					
					oUp2.gi_loc_cd(oUp1.getStringNE("ship_pr_loc_cd"));
					oUp2.gi_str_ln_cd(oUp1.getStringNE("str_ln_cd"));
					oUp2.gi_wg_cd(oUp1.getStringNE("pr_loc_wg_cd"));
					oUp2.from_gd_cd(oUp1.gd_cd());
					
					ope.up2().add(oUp2);
				}
			}
			
			return ope;
		}
		
		/**
		 * 	ロットＮＯ発番処理
		 */
		protected void setLotNo() {

			// ロットＮＯ、サブロットＮＯ発番対象リスト
			MCList<ElmArgsR> lotNoL = MCList.create(ElmArgsR.class);
			MCList<ElmArgsR> subLotNoL = MCList.create(ElmArgsR.class);
			
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			// 明細のロットＮＯ・サブロットＮＯの発番対象の抽出
			for (Chk01_RsltR rsltR : notErrL) {

				if (!MSC_SLS_TGT_TYP.isDDLV_SLS(rsltR.sls_tgt_typ())) {
					continue;
				}
				if (!rsltR.sync_flg()) {
					continue;
				}

				// 入荷予定にロットＮＯが設定されている場合、そのロットＮＯを採用するのでロットＮＯを発番しない
				MST_PURC_SCHD_R schdR = MST_PURC_SCHD_R.create();
				MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
				MST_ARR_SCHD_R arrschd = MST_ARR_SCHD_R.create("ARRSCHD");
				MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(t);
				schdR_bldr.setSelect(t.purc_schd_no);
				schdR_bldr.addLeftOuterJoin(arrschd, bracket( t.arr_schd_no.eq(arrschd.arr_schd_no)));
				schdR_bldr.addSelect(arrschd.lot_no.as("lot_no"), arrschd.sublot_no.as("sublot_no"),
						arrschd.arr_loc_cd.as("arr_loc_cd"), arrschd.bp_lot_no);
				
				schdR_bldr.setWhere(t.purc_schd_no.eq(bind("1")), rsltR.purc_schd_no());
				dbSelect("MSBBL1320_MST_PURC_SCHD_S01", schdR, schdR_bldr);
				
				if (!isNull(schdR) && !isNull(schdR.getStringNE("lot_no"))) {
					rsltR.lot_no(schdR.getStringNE("lot_no"));
					rsltR.sublot_no(nvl(schdR.getStringNE("sublot_no"), MAC_STR.NULL_VAL.value()));
					rsltR.crt_lot_flg(false);
					continue;
				}
				
				// ロットＮＯ発番対象リスト登録
				if (isCrtLotNo(rsltR)) {
					ElmArgsR lotArgs = getLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.LOT, schdR);
					lotNoL.add(lotArgs);
				}
				
				// サブロットＮＯ発番対象リスト登録
				if (isCrtSubLotNo(rsltR)) {
					ElmArgsR subLotArgs = getSubLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.SUBLOT, schdR);
					subLotNoL.add(subLotArgs);
				}
				else if (isNull(rsltR.sublot_no())) {
					rsltR.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
			
			// ロットＮＯ発番・セット
			if (!isNull(lotNoL) && !lotNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.LOT, lotNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{Chk01_RsltR.$lot_no};
				copyByPegNo(notErrL, lotNoL, Chk01_RsltR.$dtl_peg_no, destCols, ElmArgsR.$peg_no, srcCols);
			}
			
			// サブロットＮＯ発番・セット
			if (!isNull(subLotNoL) && !subLotNoL.isEmpty()) {
				setNum(MAC_NUM_BIZ_TYP.SUBLOT, subLotNoL);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{Chk01_RsltR.$sublot_no};
				copyByPegNo(notErrL, subLotNoL, Chk01_RsltR.$dtl_peg_no, destCols, ElmArgsR.$peg_no, srcCols);
			}
		}
		
		/**
		 * [ロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [ロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、ロットＮＯの発番対象とする。
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtLotNo(Chk01_RsltR rstlR) {

			return !MAC_LOT_MNG_TYP.isNOT_MNG(rstlR.lot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.lot_no_typ())
					&& rstlR.crt_lot_flg()
					&& isNull(rstlR.lot_no());
		}
		
		/**
		 * [サブロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [サブロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、サブロットＮＯの発番対象とする。
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtSubLotNo(Chk01_RsltR rstlR) {

			return 	!MAC_SUBLOT_MNG_TYP.isNOT_MNG(rstlR.sublot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.sublot_no_typ())
					&& (rstlR.crt_lot_flg() || MAC_SUBLOT_MNG_TYP.isSTK(rstlR.sublot_mng_typ()))
					&& isNull(rstlR.sublot_no());
		}

		/**
		 * ロットＮＯの発番要素を取得する
		 * 
		 * @param r
		 * @param numBizTyp
		 * @return 発番要素
		 */
		protected ElmArgsR getLotElmArgs(Chk01_RsltR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR) {

			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.lot_no_ptn_cd());
			arg.bp_cd(r.sppl_cd());
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(r.sls_dt());
			arg.bp_lot_no(r.bp_lot_no());
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());
			arg.peg_no(r.dtl_peg_no());

			return arg;
		}
		
		/**
		 * サブロットＮＯの発番要素を取得する
		 * 
		 * @param r
		 * @param numBizTyp
		 * @return 発番要素
		 */
		protected ElmArgsR getSubLotElmArgs(Chk01_RsltR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR) {
			
			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.sublot_no_ptn_cd());
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(r.sls_dt());
			arg.bp_lot_no(schdR.getStringNE("bp_lot_no"));
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());
			arg.lot_no(r.lot_no());
			arg.peg_no(r.dtl_peg_no());

			return arg;
		}
		
		protected Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<Purc_Chk03_IoR,Purc_Chk03_DtlR> createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR() {
			return new Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<Purc_Chk03_IoR, Purc_Chk03_DtlR>();
		}
		
		public class Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<D extends Purc_Chk03_IoR, S extends Purc_Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_cd, Purc_Chk03_DtlR.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$trd_unit_qty, Purc_Chk03_DtlR.$trd_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_cd, Purc_Chk03_DtlR.$base_unit_cd);
				addColumnPathMap(Purc_Chk03_IoR.$base_unit_qty, Purc_Chk03_DtlR.$base_unit_qty);
				addColumnPathMap(Purc_Chk03_IoR.$ver_no, Purc_Chk03_DtlR.$ver_no);
				addColumnPathMap(Purc_Chk03_IoR.$gd_cd, Purc_Chk03_DtlR.$gd_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, Purc_Chk03_DtlR.$dlv_loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, Purc_Chk03_DtlR.$dlv_loc_wg_cd);
				addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, Purc_Chk03_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$lot_no, Purc_Chk03_DtlR.$lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$sublot_no, Purc_Chk03_DtlR.$sublot_no);
				addColumnPathMap(Purc_Chk03_IoR.$quality_typ, Purc_Chk03_DtlR.$quality_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, Purc_Chk03_DtlR.$stk_insp_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_id_typ, Purc_Chk03_DtlR.$stk_id_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_bp_cd, Purc_Chk03_DtlR.$stk_bp_cd);
				addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, Purc_Chk03_DtlR.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, Purc_Chk03_DtlR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, Purc_Chk03_DtlR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$ship_fr_valid_dt, Purc_Chk03_DtlR.$ship_fr_valid_dt);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
		}
		
		protected Map_Purc_Chk03_DtlR_Chk01_RsltR<Purc_Chk03_DtlR,Chk01_RsltR> createMap_Purc_Chk03_DtlR_Chk01_RsltR() {
			return new Map_Purc_Chk03_DtlR_Chk01_RsltR<Purc_Chk03_DtlR, Chk01_RsltR>();
		}
		
		public class Map_Purc_Chk03_DtlR_Chk01_RsltR<D extends Purc_Chk03_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
				addColumnPathMap(Purc_Chk03_DtlR.$abort_flg, Chk01_RsltR.$abort_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$ver_no, Chk01_RsltR.$ver_no);
				addColumnPathMap(Purc_Chk03_DtlR.$ship_fr_valid_dt, Chk01_RsltR.$ship_fr_valid_dt);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_lot_no, Chk01_RsltR.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_no, Chk01_RsltR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, Chk01_RsltR.$bp_dlv_slip_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.disp_seq(1);
				dest.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
			}
		}
		
		protected Map_Purc_Chk03_HdrR_Chk01_RsltR<Purc_Chk03_HdrR,Chk01_RsltR> createMap_Purc_Chk03_HdrR_Chk01_RsltR() {
			return new Map_Purc_Chk03_HdrR_Chk01_RsltR<Purc_Chk03_HdrR, Chk01_RsltR>();
		}

		public class Map_Purc_Chk03_HdrR_Chk01_RsltR<D extends Purc_Chk03_HdrR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {

				addColumnPathMap(Purc_Chk03_HdrR.$ac_dt, Chk01_RsltR.$ac_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$ptax_dt, Chk01_RsltR.$ptax_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

				dest.purc_dt(src.sls_dt());
				if (isNull(dest.pay_basis_dt()) && isNull(dest.pay_schd_dt())) {
					dest.pay_basis_dt(src.sls_dt());
				}
			}
		}
		
		/**
		 * 	固有チェック
		 * @return
		 */
		protected MCMessageList checkOther(MCList<Chk01_RsltR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_RsltR r : chkL) {
				// 計上日≦請求起算日チェック
				msgL.addAll(checkAcDtBillBasisDt(r));
				
				msgL.addAll(chkShipAcDtAcDt(r));
				
				// 打切チェック
				msgL.addAll(checkAbort(r));
				
				// 場所ＣＤ未決定チェック
				msgL.addAll(checkLoc(r));
			}
			// 売上禁止チェック
			msgL.addAll(checkSlsStop(chkL));
			// インボイスチェック
			msgL.addAll(chkIV(chkL));

			return msgL;
		}
		
		/**
		 * 計上日≦請求起算日チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkAcDtBillBasisDt(Chk01_RsltR r) {
			
			MCMessageList msgL = new MCMessageList();
			
			MAM_BP_R bcstR = getBpCache(r.bcst_cd());
			
			// 売上都度請求以外、計上日≦請求起算日チェック
			if (!MAC_BILL_CL_TYP.isEACH_SLS(bcstR.bill_cl_typ())) {
				msgL.addAll(check(r, new String[] {Chk01_RsltR.$ac_dt, Chk01_RsltR.$bill_basis_dt}, new FXUCL_BeforeAfterValidater()));
			}
			
			return msgL;
		}
		
		protected MCMessageList chkShipAcDtAcDt(Chk01_RsltR r) {
			MCMessageList msgL = new MCMessageList();

			if (MAC_SLS_BASIS_TYP.isIN_BASIS(r.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(r.sls_basis_typ())) {
				MST_DLV_SLIP_R dlvSlipR = getFirstDlvSlipCache(r.ship_dlv_slip_no());

				if (!isNull(dlvSlipR) && r.ac_dt().lt(dlvSlipR.ac_dt())) {
					msgL.add(new MCMessage(r, Chk01_RsltR.$ac_dt, MSBEL1067,
							toYMDString(dlvSlipR.ac_dt()), toYMDString(r.ac_dt()),
							toDispGUIIndex(r)));
				}
			}

			return msgL;
		}
		
		/**
		 * 全インボイス明細対象存在チェック（新規用）
		 * 
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkIV(MCList<Chk01_RsltR> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxkey = chkL.createIndex(Chk03_RsltR.$cst_iv_flg);
			
			// チェック対象のインボイスＮＯ
			MCList<Chk01_RsltR> ivL = chkL.subList(idxkey, true).groupBy(Chk01_RsltR.$iv_no);
			
			for (Chk01_RsltR ivR : ivL) {
				
				if (isNullOrNullVal(ivR.iv_no())) {
					for (Chk01_RsltR tgtR : chkL.subList(idxkey, true)) {
						msgL.add(new MCMessage(tgtR, Chk01_RsltR.$iv_no, MSBBL0254, toDispGUIIndex(tgtR)));
					}
					
					continue;
				}
				// 上り電文の対象インボイスＮＯを持つリストを取得
				MCList<Chk01_RsltR> tgtIvGrL = chkL.subList(Chk01_RsltR.$iv_no, ivR.iv_no());
				
				// インボイス明細トランに存在する対象インボイスＮＯを持つ件数を取得
				MST_IV_D_R ivd = MST_IV_D_R.create("IVD");
				MST_SLS_SCHD_R slss = MST_SLS_SCHD_R.create("SLSS");
				MCList<MST_IV_R> ivTblL = MCList.create(MST_IV_R.class);
				MST_IV_R t = MST_IV_R.create("T");
				MCQueryApiBuilder ivTblL_bldr = MCQueryApiBuilder.create(t);
				ivTblL_bldr.addSelect(ivd.iv_d_no);
				ivTblL_bldr.addLeftOuterJoin(ivd, bracket( t.iv_mng_no.eq(ivd.iv_mng_no)));
				ivTblL_bldr.addLeftOuterJoin(slss, bracket( ivd.iv_d_no.eq(slss.iv_d_no)));
				ivTblL.addStringColumn(MST_IV_D_R.$iv_d_no);
				ivTblL_bldr.setWhere(t.iv_no.eq(bind("1")), ivR.iv_no());
				dbSelect("MSBBL1320_MST_IV_S01", ivTblL, ivTblL_bldr);
				
				if (ivTblL.isEmpty()) {
					for (Chk01_RsltR tgtIvGrR : tgtIvGrL) {
						msgL.add(new MCMessage(tgtIvGrR, Chk01_RsltR.$iv_no, MSBBL0254, toDispGUIIndex(tgtIvGrR)));
					}
				}
				else if (tgtIvGrL.size() != ivTblL.size()) {
					for (Chk01_RsltR tgtIvGrR : tgtIvGrL) {
						msgL.add(new MCMessage(tgtIvGrR, Chk01_RsltR.$iv_no, MSBBL0204, tgtIvGrR.iv_no(),toDispGUIIndex(tgtIvGrR)));
					}
				}
			}
			setErrFlg(msgL);
			
			return msgL;
		}
		
		/**
		 * 打切チェック（新規用）
		 * 
		 * @param r
		 * @return
		 */
		protected MCMessageList checkAbort(Chk01_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			
			if (r.abort_flg()) {
				if (!isNull(r.sls_schd_no())) {
					MCList<MST_SLS_SCHD_R> tmpL = _slsSchdL.subList(MST_SLS_SCHD_R.$sls_schd_no, r.sls_schd_no());
					if (!isNull(tmpL)) {
						// 売上予定の売上済数　＋　（入力値）基準単位数　≧　売上予定の予定数量-売上予定の打切数量の場合
						if (tmpL.get(0).base_unit_sls_qty().add(r.base_unit_qty()).gte(tmpL.get(0).base_unit_qty().subtract(tmpL.get(0).base_unit_abort_qty()))) {
							msgL.add(new MCMessage(r, Chk01_RsltR.$abort_flg, MSBBL0115, toDispGUIIndex(r)));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 場所ＣＤ未決定チェック（出荷指図対象外）
		 * 
		 * @param r
		 * @return
		 */
		protected MCMessageList checkLoc(Chk01_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			
			if (MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(r.sls_tgt_typ()) ||
				MSC_SLS_TGT_TYP.isCSTSTK_SLS(r.sls_tgt_typ())) {
				if (isNull(r.loc_cd()) && !isNull(r.slo_d_no())) {
					// インボイス登録でマニュアルで追加した明細はチェックしない
					if (r.cst_iv_flg()) {
						msgL.add(new MCMessage(r, null, MSBBL0603, toDispGUIIndex(r)));
					}
					else {
						msgL.add(new MCMessage(r, null, MSBBL0274, toDispGUIIndex(r)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 売上禁止チェック（得意先、品目)
		 * 
		 * @return
		 */
		protected MCMessageList checkSlsStop(MCList<Chk01_RsltR> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_BP$F_IS_SLS_STOP", "01"), 
					MABSFunction.getFunctionExecuter("MAPA_BP$F_IS_SLS_STOP"), Chk01_RsltR.$cst_sls_stop_flg,
					chkL, Chk01_RsltR.$cst_cd, Chk01_RsltR.$sls_dt);
			execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_SLS_STOP", "01"),
					MABSFunction.getFunctionExecuter("MAPA_ITM$F_IS_SLS_STOP"),Chk01_RsltR.$itm_sls_stop_flg,
					chkL, Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3, Chk01_RsltR.$sls_dt);
			
			for (Chk01_RsltR chkR : chkL) {
				if (chkR.cst_sls_stop_flg()) {
					msgL.add(new MCMessage(chkR, Chk01_RsltR.$cst_cd, MSBBL0089, chkR.cst_cd(), 
							toYMDString(chkR.sls_dt()), toDispGUIIndex(chkR)));
				}
				if (chkR.itm_sls_stop_flg()) {
					msgL.add(new MCMessage(chkR, Chk01_RsltR.$itm_cd, MSBBL0090, 
							toDispItm(chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3()),
							toYMDString(chkR.sls_dt()), toDispGUIIndex(chkR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * データ補完処理
		 */
		protected void crrctData() {
			int i = 0;
			int ioCnt = 0;
			
			// 売上予定に紐づく内容を取得
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			
			MCList<MSW_SLS_ACT_R> wkL = MCList.create(MSW_SLS_ACT_R.class);
			MSW_SLS_ACT_R t1 = MSW_SLS_ACT_R.create("T");
			MCList<MST_SLS_SCHD_R> wkKeyL = MCList.create(MST_SLS_SCHD_R.class);
			execDbWkDelete("MSBBL1320_MSW_SLS_ACT_D01", t1);
			for (Chk01_RsltR dtlR : notErrL) {
				// 売上実績WK
				MSW_SLS_ACT_R wkR = MSW_SLS_ACT_R.create();
				wkR.sls_schd_no(dtlR.sls_schd_no());
				wkR.unit_cd(dtlR.trd_unit_cd());
				wkR.tax_cd(dtlR.tax_cd());
				wkL.add(wkR);
				
				// 売上予定キーWK
				MST_SLS_SCHD_R wkKeyR = MST_SLS_SCHD_R.create();
				wkKeyR.sls_schd_no(dtlR.sls_schd_no());
				wkKeyL.add(wkKeyR);
			}
			dbInsert("MSBBL1320_MSW_SLS_ACT_I01", wkL, MCQueryApiBuilder.create(t1));
			dbWkInsert("MSBBL1320_MSW_SLS_SCHD_I03", wkKeyL,
					MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T")).getBaseDbc());
			
			MCList<Chk01_RsltR> allTmpL = MCList.create(Chk01_RsltR.class);
			executeQuery(allTmpL, MSBBL1320_MST_SLS_SCHD_S02());
			if (!allTmpL.isEmpty()) {
				MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
				for (Chk01_RsltR r : allTmpL) {
					MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create();
					shipSchdR.ship_schd_no(r.ship_schd_no());
					shipSchdL.add(shipSchdR);
				}
				MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
				dbWkDelete("MSBBL1320_MSW_SHIP_SCHD_D01", shipSchdL_bldr.getBaseDbc());
				dbWkInsert("MSBBL1320_MSW_SHIP_SCHD_I01", shipSchdL, shipSchdL_bldr.getBaseDbc());
				
				MCList<Chk01_RsltR> allTmp2L = MCList.create(Chk01_RsltR.class);
				executeQuery(allTmp2L, MSBBL1320_MSW_SHIP_SCHD_KEY_S01());
				MCIndexKey shipSchdKey = allTmp2L.createIndex(Chk01_RsltR.$ship_schd_no);
				for (Chk01_RsltR r : allTmpL) {
					Chk01_RsltR tgtR = allTmp2L.getFirst(shipSchdKey, r.ship_schd_no());
					if (!isNull(tgtR)) {
						r.sls_lot_no(tgtR.sls_lot_no());
						r.sls_sublot_no(tgtR.sls_sublot_no());
						r.ship_alloc_sts_no(tgtR.ship_alloc_sts_no());
						r.loc_cd(tgtR.loc_cd());
						r.str_ln_cd(tgtR.str_ln_cd());
					}
				}
			}
			MCIndexKey idxKey = allTmpL.createIndex(Chk01_RsltR.$sls_schd_no);

			initCalc01Hdr();
			executeQuery(_calc01HdrL, MSBBL1320_MST_SLS_SCHD_S07());
			_idxCalc01HdrKey = _calc01HdrL.createIndex(LIST_INDEX_KEY_NM);
			
			for (Chk01_RsltR dtlR : notErrL) {
				int rowIndex = dtlR.getParamRowIndex();
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				
				dtlR.base_cur_cd(getCo().base_cur_cd());
				dtlR.ptax_cur_cd(getCo().ptax_cur_cd());
				dtlR.xrate_cd(getCo().sls_xrate_cd());
				
				boolean multiFlg = false;
				MCList<Chk01_RsltR> tmpL = allTmpL.subList(idxKey, dtlR.sls_schd_no());
				if (!isNull(tmpL) && tmpL.size() > 1) {
					createMap_Chk01_RsltR_Chk01_RsltR_Multi().copyValue(dtlR, tmpL.get(0));
					multiFlg = true;
				}
				else {
					createMap_Chk01_RsltR_Chk01_RsltR().copyValue(dtlR, tmpL.get(0));
				}
				dtlR.setParamRowIndex(rowIndex);
				
				dtlR.base_unit_qty(
						convToBaseUnit(
								dtlR.trd_unit_qty(),
								dtlR.trd_unit_conv_base_qty(),
								dtlR.trd_unit_conv_qty(),
								dtlR.base_unit_dec_place(),
								dtlR.base_unit_rnd_typ()
						)
				);
				// 元の単価を保持
				dtlR.org_trd_cur_upri(dtlR.trd_cur_upri());
				
				dtlR.cost_amt(MSUCL_SlsUtil.getCostAmt(dtlR.cost_upri(), dtlR.base_unit_qty(), dtlR.base_amt_dec_place()));
				
				// 明細紐付けＮＯをセット
				dtlR.dtl_peg_no(++i);
				
				// 売上対象区分
				if (dtlR.sls_cststk_flg()) {
					dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.CSTSTK_SLS.value());
					if (isNull(dtlR.lot_no())) {
						dtlR.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (isNull(dtlR.sublot_no())) {
						dtlR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					dtlR.sls_lot_no(dtlR.lot_no());
					dtlR.sls_sublot_no(dtlR.sublot_no());
				}
				else if (!isNull(dtlR.purc_schd_no()) || dtlR.ddlv_iv_grp_flg()) {
					dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.DDLV_SLS.value());
					dtlR.ship_act_service_exec_flg(true);
					
					if (!dtlR.sync_flg()) {
						dtlR.sls_lot_no(dtlR.lot_no());
						dtlR.sls_sublot_no(dtlR.sublot_no());
					}
				}
				else if (!isNull(dtlR.sls_basis_typ()) && MAC_SLS_BASIS_TYP.isIN_BASIS(dtlR.sls_basis_typ())) {
					dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.XFR_IN_SLS.value());
				}
				else if (!isNull(dtlR.sls_basis_typ()) && MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(dtlR.sls_basis_typ())) {
					dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.ARRIVAL_SLS.value());
				}
				else {
					dtlR.sls_tgt_typ(MSC_SLS_TGT_TYP.NOT_SHIP_ORD_SLS.value());
					dtlR.ship_act_service_exec_flg(true);
					if (isNull(dtlR.lot_no())) {
						dtlR.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (isNull(dtlR.sublot_no())) {
						dtlR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					dtlR.sls_lot_no(dtlR.lot_no());
					dtlR.sls_sublot_no(dtlR.sublot_no());
				}
				
				// 明細に紐づく詳細部を取得
				MCList<Chk01_SlsActIoR> ioL = MCList.create(Chk01_SlsActIoR.class);
				
				if (!isNull(dtlR.purc_ddlv_po_no()) || dtlR.ddlv_iv_grp_flg()) {
					// 仕入後の場合
					if (!dtlR.sync_flg() && !isNull(dtlR.purc_ddlv_po_no())) {
						executeQuery(ioL, MSBBL1320_MST_ARR_ACT_S01(), dtlR);
						ioL.setValue(Chk01_SlsActIoR.$ship_alloc_sts_no, dtlR.ship_alloc_sts_no());
						
						if (ioL.size() == 1) {
							ioL.get(0).trd_unit_cd(dtlR.trd_unit_cd());
							ioL.get(0).trd_unit_qty(dtlR.trd_unit_qty());
							ioL.get(0).base_unit_cd(dtlR.base_unit_cd());
							ioL.get(0).base_unit_qty(dtlR.base_unit_qty());
							if (isNull(dtlR.loc_cd())) {
								dtlR.loc_cd(ioL.get(0).loc_cd());
							}
							if (isNull(dtlR.str_ln_cd())) {
								dtlR.str_ln_cd(ioL.get(0).str_ln_cd());
							}
							if (isNull(dtlR.lot_no())) {
								dtlR.lot_no(ioL.get(0).lot_no());
							}
							if (isNull(dtlR.sublot_no())) {
								dtlR.sublot_no(ioL.get(0).sublot_no());
							}
						}
					}
					else {
						Chk01_SlsActIoR ioR = Chk01_SlsActIoR.create();
						copy(ioR, dtlR, createMap_Chk01_SlsActIoR_Chk01_RsltR());
						ioL.add(ioR);
					}
				}
				else {
					if (!isNullOrNullVal(dtlR.iv_no()) || !isNull(dtlR.dlv_slip_d_no())) {
						if (!isNull(dtlR.dlv_slip_d_no())) {
							executeQuery(ioL, MSBBL1320_MST_SLS_SCHD_S06(), dtlR);
						}
						else {
							if (dtlR.sls_cststk_flg() || MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(dtlR.sls_tgt_typ())) {
								// 預り売上または荷指図対象外売上の場合、未出荷のため、出荷引当状況から出荷場所を取得する。
								executeQuery(ioL, MSBBL1320_MST_SLS_SCHD_S12(), dtlR);
								ioL.setValueNE(Chk01_SlsActIoR.$lot_no, dtlR.lot_no());
								ioL.setValueNE(Chk01_SlsActIoR.$sublot_no, dtlR.sublot_no());
							}
							else {
								executeQuery(ioL, MSBBL1320_MST_SLS_SCHD_S03(), dtlR);
							}
						}
						if (ioL.size() == 1) {
							ioL.get(0).base_unit_cd(dtlR.base_unit_cd());
							ioL.get(0).base_unit_qty(dtlR.base_unit_qty());
							if (isNull(dtlR.ship_schd_no())) {
								dtlR.ship_schd_no(ioL.get(0).getStringNE("ship_schd_no"));
							}
							if (isNull(dtlR.loc_cd())) {
								dtlR.loc_cd(ioL.get(0).loc_cd());
							}
							if (isNull(dtlR.str_ln_cd())) {
								dtlR.str_ln_cd(ioL.get(0).str_ln_cd());
							}
							if (isNull(dtlR.lot_no())) {
								dtlR.lot_no(ioL.get(0).lot_no());
							}
							if (isNull(dtlR.sublot_no())) {
								dtlR.sublot_no(ioL.get(0).sublot_no());
							}
							
							if (isNull(ioL.get(0).trd_unit_cd())) {
								ioL.get(0).trd_unit_cd(dtlR.trd_unit_cd());
								ioL.get(0).trd_unit_qty(dtlR.trd_unit_qty());
							}
							else if (isSame(ioL.get(0).trd_unit_cd(), dtlR.trd_unit_cd())) {
								ioL.get(0).trd_unit_qty(dtlR.trd_unit_qty());
							}
							else {
								// 売上明細の取引単位から出荷時の単位に変換
								MAVM_ITM_UNIT_R itmUnitR = getItmUnit(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), ioL.get(0).trd_unit_cd());
								MCNumber convQty = unitConv(dtlR.trd_unit_qty(),
										dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(),
										dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ(),
										itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
										itmUnitR.dec_place(), itmUnitR.rnd_typ(), true);
								
								if (isNull(convQty)) {
									ioL.get(0).trd_unit_cd(dtlR.trd_unit_cd());
									ioL.get(0).trd_unit_qty(dtlR.trd_unit_qty());
								}
								else {
									ioL.get(0).trd_unit_qty(convQty);
								}
							}
						}
					}
					else {
						for (Chk01_RsltR tmpR : tmpL) {
							Chk01_SlsActIoR ioR = Chk01_SlsActIoR.create();
							ioR.sno1(dtlR.sno1());
							ioR.sno2(dtlR.sno2());
							ioR.sno3(dtlR.sno3());
							ioR.sno4(dtlR.sno4());
							ioR.gd_cd(dtlR.gd_cd());
							
							if (!isNull(tmpR.ship_alloc_sts_no())) {
								MST_SHIP_ALLOC_STS_R shipAllocStsR = MST_SHIP_ALLOC_STS_R.create();
								MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T");
								MCQueryApiBuilder shipAllocStsR_bldr = MCQueryApiBuilder.create(t2);
								shipAllocStsR_bldr.setWhere(t2.ship_alloc_sts_no.eq(bind("1")), tmpR.ship_alloc_sts_no());
								dbSelect("MSBBL1320_MST_SHIP_ALLOC_STS_S01", shipAllocStsR, shipAllocStsR_bldr);
								
								ioR.loc_cd(shipAllocStsR.ship_loc_cd());
								ioR.str_ln_cd(shipAllocStsR.ship_str_ln_cd());
								if (!isNullOrNullVal(dtlR.sls_lot_no())) {
									ioR.lot_no(dtlR.sls_lot_no());
									ioR.sublot_no(dtlR.sls_sublot_no());
								}
								else {
									ioR.lot_no(nvl(shipAllocStsR.lot_no(), MAC_STR.NULL_VAL.value()));
									ioR.sublot_no(nvl(shipAllocStsR.sublot_no(), MAC_STR.NULL_VAL.value()));
								}
								
								if (dtlR.abort_flg()) {
									ioR.trd_unit_cd(dtlR.trd_unit_cd());
									ioR.trd_unit_qty(dtlR.trd_unit_qty());
									ioR.base_unit_cd(dtlR.base_unit_cd());
									ioR.base_unit_qty(dtlR.base_unit_qty());
								}
								else {
									if (multiFlg) {
										ioR.trd_unit_cd(shipAllocStsR.trd_unit_cd());
										ioR.trd_unit_qty(shipAllocStsR.trd_unit_qty());
										ioR.base_unit_cd(shipAllocStsR.base_unit_cd());
										ioR.base_unit_qty(shipAllocStsR.base_unit_qty());
									}
									else {
										ioR.trd_unit_cd(dtlR.trd_unit_cd());
										ioR.trd_unit_qty(dtlR.trd_unit_qty());
										ioR.base_unit_cd(dtlR.base_unit_cd());
										ioR.base_unit_qty(dtlR.base_unit_qty());
									}
								}
								ioR.ship_alloc_sts_no(tmpR.ship_alloc_sts_no());
							}
							else {
								ioR.loc_cd(dtlR.loc_cd());
								ioR.str_ln_cd(dtlR.str_ln_cd());
								ioR.lot_no(dtlR.sls_lot_no());
								ioR.sublot_no(dtlR.sls_sublot_no());
								ioR.trd_unit_cd(dtlR.trd_unit_cd());
								ioR.trd_unit_qty(dtlR.trd_unit_qty());
								ioR.base_unit_cd(dtlR.base_unit_cd());
								ioR.base_unit_qty(dtlR.base_unit_qty());
							}
							ioL.add(ioR);
						}
					}
				}
				
				if (ioL.size() > 1 && !isSame(dtlR.sls_schd_qty(), dtlR.base_unit_qty())) {
					MCMessage msg = new MCMessage(dtlR, null, MSBBL0280, toDispGUIIndex(dtlR));
					MCMessagePool.add(msg);
					dtlR.err_flg(true);
				}
				else {
					for (Chk01_SlsActIoR tmpIoR : ioL){
						tmpIoR.sync_flg(dtlR.sync_flg());	// 同時計上ＦＬＧ
						tmpIoR.dtl_peg_no(dtlR.dtl_peg_no());
						tmpIoR.io_peg_no(++ioCnt);
					}
					
					down1().addAll(ioL);
				}
			}
			// 荷姿単位・荷姿数量
			setItmUnitCache(notErrL);
			MCIndexKey ik = down1().createIndex(Chk01_SlsActIoR.$dtl_peg_no);
			for (Chk01_RsltR dtlR : notErrL) {
				MCList<Chk01_SlsActIoR> tmpIoL = down1().subList(ik, dtlR.dtl_peg_no());
				for (Chk01_SlsActIoR tmpIoR : tmpIoL) {
					if (isPack(dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), tmpIoR.trd_unit_cd())) {
						tmpIoR.pack_unit_cd(tmpIoR.trd_unit_cd());
						tmpIoR.pack_unit_qty(tmpIoR.trd_unit_qty());
					}
					else {
						tmpIoR.pack_unit_cd(tmpIoR.base_unit_cd());
						tmpIoR.pack_unit_qty(tmpIoR.base_unit_qty());
					}
				}
			}
			
			// ヘッダ紐付けＮＯの設定
			// 同一受注ＮＯ、売上日、計上日、請求起算日、売上担当者、売上部門、為替レート、納税為替レート、納品書ＮＯ、インボイスＮＯ、取引備考、内部備考、予備１、予備２、予備３
			// この場合、ヘッダ紐付けＮＯを同じにする（1ヘッダ、複数明細の形式）
			// 同一売上対象区分のもの
			String[] sameKeys = new String[] {
					Chk01_RsltR.$sls_tgt_typ,
					Chk01_RsltR.$ship_tm, Chk01_RsltR.$dlv_tm,
					Chk01_RsltR.$slo_no, Chk01_RsltR.$sls_dt, Chk01_RsltR.$ac_dt, Chk01_RsltR.$bill_basis_dt,
					Chk01_RsltR.$sls_usr_cd, Chk01_RsltR.$sls_dpt_cd, Chk01_RsltR.$ar_dpt_cd, 
					Chk01_RsltR.$xrate, Chk01_RsltR.$ptax_xrate, Chk01_RsltR.$hdr_peg_no, Chk01_RsltR.$dlv_slip_no, Chk01_RsltR.$iv_no,
					Chk01_RsltR.$trd_rmrks, Chk01_RsltR.$intr_rmrks, Chk01_RsltR.$sub_char1, Chk01_RsltR.$sub_char2, Chk01_RsltR.$sub_char3
					,Chk01_RsltR.$purc_ddlv_dlv_slip_no
			};
			int hdrPegNo = 0;
			for (Chk01_RsltR dtlR : up0()) {
				if (isNull(dtlR.hdr_peg_no())) {
					
					dtlR.hdr_peg_no(++hdrPegNo);
					Comparable<?>[] sameVals = new Comparable[] {
							dtlR.sls_tgt_typ(),
							dtlR.ship_tm(), dtlR.dlv_tm(),
							dtlR.slo_no(), dtlR.sls_dt(), dtlR.ac_dt(), dtlR.bill_basis_dt(),
							dtlR.sls_usr_cd(), dtlR.sls_dpt_cd(), dtlR.ar_dpt_cd(), 
							dtlR.xrate(), dtlR.ptax_xrate(), null, dtlR.dlv_slip_no(), dtlR.iv_no(),
							dtlR.trd_rmrks(), dtlR.intr_rmrks(), dtlR.sub_char1(), dtlR.sub_char2(), dtlR.sub_char3()
							,dtlR.purc_ddlv_dlv_slip_no()
					};
					MCList<Chk01_RsltR> tmpList = up0().subList(sameKeys, sameVals);
					for (Chk01_RsltR tmpR : tmpList) {
						tmpR.hdr_peg_no(dtlR.hdr_peg_no());
					}
				}
			}
			
			// ロット設定
			setLotNo();
		}
		
		/**
		 * 取引通貨単価を算出する。
		 * @param dtlR 売上チェックRow
		 */
		protected void calcTrdCurUpri(Chk01_RsltR dtlR) {
					
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			
			ConvQtyAmtUtil_Calc01_HdrR up0R = null;
			ConvQtyAmtUtil_Calc01_Dtl1R up1R = null;
			
			up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
			getCredSrcBySlsSchd(up0R, dtlR.sls_schd_no());
			
			up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
			copy(up1R, dtlR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_RsltR());
			
			ope.up0().add(up0R);
			ope.up1().add(up1R);
		
			if (!ope.up0().isEmpty()) {
				
				setPegNo(ope.up0());
				
				setPegNo(ope.up1());
				setPegNo(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, ope.up1());
				
				ope.exec();
				
				dtlR.trd_cur_upri(ope.down0().get(0).trd_cur_upri());
			}
		}
		
		protected Map_Chk01_SlsActIoR_Chk01_RsltR<Chk01_SlsActIoR,Chk01_RsltR> createMap_Chk01_SlsActIoR_Chk01_RsltR() {
			return new Map_Chk01_SlsActIoR_Chk01_RsltR<Chk01_SlsActIoR, Chk01_RsltR>();
		}
		
		public class Map_Chk01_SlsActIoR_Chk01_RsltR<D extends Chk01_SlsActIoR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_SlsActIoR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(Chk01_SlsActIoR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(Chk01_SlsActIoR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(Chk01_SlsActIoR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(Chk01_SlsActIoR.$gd_cd, Chk01_RsltR.$gd_cd);
				addColumnPathMap(Chk01_SlsActIoR.$loc_cd, Chk01_RsltR.$loc_cd);
				addColumnPathMap(Chk01_SlsActIoR.$str_ln_cd, Chk01_RsltR.$str_ln_cd);
				addColumnPathMap(Chk01_SlsActIoR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(Chk01_SlsActIoR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(Chk01_SlsActIoR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
				addColumnPathMap(Chk01_SlsActIoR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
				addColumnPathMap(Chk01_SlsActIoR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
				addColumnPathMap(Chk01_SlsActIoR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
				addColumnPathMap(Chk01_SlsActIoR.$ship_alloc_sts_no, Chk01_RsltR.$ship_alloc_sts_no);
			}
		}
		
		protected Map_Chk01_RsltR_Chk01_RsltR<Chk01_RsltR,Chk01_RsltR> createMap_Chk01_RsltR_Chk01_RsltR() {
			return new Map_Chk01_RsltR_Chk01_RsltR<Chk01_RsltR, Chk01_RsltR>();
		}
		public class Map_Chk01_RsltR_Chk01_RsltR<D extends Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_RsltR.$trd_cd, Chk01_RsltR.$trd_cd);
				addColumnPathMap(Chk01_RsltR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
				addColumnPathMap(Chk01_RsltR.$sls_schd_dt, Chk01_RsltR.$sls_schd_dt);
				addColumnPathMap(Chk01_RsltR.$eta_dt, Chk01_RsltR.$eta_dt);
				addColumnPathMap(Chk01_RsltR.$cst_cd, Chk01_RsltR.$cst_cd);
				addColumnPathMap(Chk01_RsltR.$trd_cur_cd, Chk01_RsltR.$trd_cur_cd);
				addColumnPathMap(Chk01_RsltR.$trd_amt_dec_place, Chk01_RsltR.$trd_amt_dec_place);
				addColumnPathMap(Chk01_RsltR.$trd_upri_dec_place, Chk01_RsltR.$trd_upri_dec_place);
				addColumnPathMap(Chk01_RsltR.$base_cur_cd, Chk01_RsltR.$base_cur_cd);
				addColumnPathMap(Chk01_RsltR.$base_amt_dec_place, Chk01_RsltR.$base_amt_dec_place);
				addColumnPathMap(Chk01_RsltR.$base_upri_dec_place, Chk01_RsltR.$base_upri_dec_place);
				addColumnPathMap(Chk01_RsltR.$ptax_cur_cd, Chk01_RsltR.$ptax_cur_cd);
				addColumnPathMap(Chk01_RsltR.$ptax_amt_dec_place, Chk01_RsltR.$ptax_amt_dec_place);
				addColumnPathMap(Chk01_RsltR.$ptax_upri_dec_place, Chk01_RsltR.$ptax_upri_dec_place);
				addColumnPathMap(Chk01_RsltR.$cst_po_no, Chk01_RsltR.$cst_po_no);
				addColumnPathMap(Chk01_RsltR.$iv_no, Chk01_RsltR.$iv_no);
				addColumnPathMap(Chk01_RsltR.$iv_d_no, Chk01_RsltR.$iv_d_no);
				addColumnPathMap(Chk01_RsltR.$ref_iv_no, Chk01_RsltR.$ref_iv_no);
				addColumnPathMap(Chk01_RsltR.$rcpt_iv_mng_no, Chk01_RsltR.$rcpt_iv_mng_no);
				addColumnPathMap(Chk01_RsltR.$rcpt_iv_no, Chk01_RsltR.$rcpt_iv_no);
				addColumnPathMap(Chk01_RsltR.$tterm_cd1, Chk01_RsltR.$tterm_cd1);
				addColumnPathMap(Chk01_RsltR.$tterm_rmrks1, Chk01_RsltR.$tterm_rmrks1);
				addColumnPathMap(Chk01_RsltR.$tterm_cd2, Chk01_RsltR.$tterm_cd2);
				addColumnPathMap(Chk01_RsltR.$tterm_rmrks2, Chk01_RsltR.$tterm_rmrks2);
				addColumnPathMap(Chk01_RsltR.$tterm_cd3, Chk01_RsltR.$tterm_cd3);
				addColumnPathMap(Chk01_RsltR.$tterm_rmrks3, Chk01_RsltR.$tterm_rmrks3);
				addColumnPathMap(Chk01_RsltR.$lc_no, Chk01_RsltR.$lc_no);
				addColumnPathMap(Chk01_RsltR.$lc_dt, Chk01_RsltR.$lc_dt);
				addColumnPathMap(Chk01_RsltR.$lc_rmrks, Chk01_RsltR.$lc_rmrks);
				addColumnPathMap(Chk01_RsltR.$cred_cd, Chk01_RsltR.$cred_cd);
				addColumnPathMap(Chk01_RsltR.$bcst_cd, Chk01_RsltR.$bcst_cd);
				addColumnPathMap(Chk01_RsltR.$ship_act_no, Chk01_RsltR.$ship_act_no);
				addColumnPathMap(Chk01_RsltR.$slo_no, Chk01_RsltR.$slo_no);
				addColumnPathMap(Chk01_RsltR.$slo_d_no, Chk01_RsltR.$slo_d_no);
				addColumnPathMap(Chk01_RsltR.$qtn_no, Chk01_RsltR.$qtn_no);
				addColumnPathMap(Chk01_RsltR.$qtn_rev, Chk01_RsltR.$qtn_rev);
				addColumnPathMap(Chk01_RsltR.$qtn_d_no, Chk01_RsltR.$qtn_d_no);
				addColumnPathMap(Chk01_RsltR.$purc_ddlv_po_no, Chk01_RsltR.$purc_ddlv_po_no);
				addColumnPathMap(Chk01_RsltR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Chk01_RsltR.$acst_cd, Chk01_RsltR.$acst_cd);
				addColumnPathMap(Chk01_RsltR.$dlv_cd, Chk01_RsltR.$dlv_cd);
				addColumnPathMap(Chk01_RsltR.$dlv_sundry_flg, Chk01_RsltR.$dlv_sundry_flg);
				addColumnPathMap(Chk01_RsltR.$dlv_zip_cd, Chk01_RsltR.$dlv_zip_cd);
				addColumnPathMap(Chk01_RsltR.$dlv_addr1, Chk01_RsltR.$dlv_addr1);
				addColumnPathMap(Chk01_RsltR.$dlv_addr2, Chk01_RsltR.$dlv_addr2);
				addColumnPathMap(Chk01_RsltR.$dlv_addr3, Chk01_RsltR.$dlv_addr3);
				addColumnPathMap(Chk01_RsltR.$dlv_addr4, Chk01_RsltR.$dlv_addr4);
				addColumnPathMap(Chk01_RsltR.$dlv_cntct_dpt, Chk01_RsltR.$dlv_cntct_dpt);
				addColumnPathMap(Chk01_RsltR.$dlv_cntct_psn, Chk01_RsltR.$dlv_cntct_psn);
				addColumnPathMap(Chk01_RsltR.$dlv_tel, Chk01_RsltR.$dlv_tel);
				addColumnPathMap(Chk01_RsltR.$dlv_fax, Chk01_RsltR.$dlv_fax);
				addColumnPathMap(Chk01_RsltR.$cntry_cd, Chk01_RsltR.$cntry_cd);
				addColumnPathMap(Chk01_RsltR.$pri_prnt_flg, Chk01_RsltR.$pri_prnt_flg);
				addColumnPathMap(Chk01_RsltR.$dest_cd1, Chk01_RsltR.$dest_cd1);
				addColumnPathMap(Chk01_RsltR.$dest_cd2, Chk01_RsltR.$dest_cd2);
				addColumnPathMap(Chk01_RsltR.$dest_cd3, Chk01_RsltR.$dest_cd3);
				addColumnPathMap(Chk01_RsltR.$tdlv_cd, Chk01_RsltR.$tdlv_cd);
				addColumnPathMap(Chk01_RsltR.$tdlv_sundry_flg, Chk01_RsltR.$tdlv_sundry_flg);
				addColumnPathMap(Chk01_RsltR.$tdlv_nm, Chk01_RsltR.$tdlv_nm);
				addColumnPathMap(Chk01_RsltR.$tdlv_zip_cd, Chk01_RsltR.$tdlv_zip_cd);
				addColumnPathMap(Chk01_RsltR.$tdlv_addr1, Chk01_RsltR.$tdlv_addr1);
				addColumnPathMap(Chk01_RsltR.$tdlv_addr2, Chk01_RsltR.$tdlv_addr2);
				addColumnPathMap(Chk01_RsltR.$tdlv_addr3, Chk01_RsltR.$tdlv_addr3);
				addColumnPathMap(Chk01_RsltR.$tdlv_addr4, Chk01_RsltR.$tdlv_addr4);
				addColumnPathMap(Chk01_RsltR.$tdlv_tel, Chk01_RsltR.$tdlv_tel);
				addColumnPathMap(Chk01_RsltR.$tdlv_fax, Chk01_RsltR.$tdlv_fax);
				addColumnPathMap(Chk01_RsltR.$tdlv_cntct_dpt, Chk01_RsltR.$tdlv_cntct_dpt);
				addColumnPathMap(Chk01_RsltR.$tdlv_cntct_psn, Chk01_RsltR.$tdlv_cntct_psn);
				addColumnPathMap(Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Chk01_RsltR.$lot_mng_typ, Chk01_RsltR.$lot_mng_typ);
				addColumnPathMap(Chk01_RsltR.$lot_no_ptn_cd, Chk01_RsltR.$lot_no_ptn_cd);
				addColumnPathMap(Chk01_RsltR.$lot_no_typ, Chk01_RsltR.$lot_no_typ);
				addColumnPathMap(Chk01_RsltR.$sublot_mng_typ, Chk01_RsltR.$sublot_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sublot_no_typ, Chk01_RsltR.$sublot_no_typ);
				addColumnPathMap(Chk01_RsltR.$sublot_no_ptn_cd, Chk01_RsltR.$sublot_no_ptn_cd);
				addColumnPathMap(Chk01_RsltR.$cntry_org_cd, Chk01_RsltR.$cntry_org_cd);
				addColumnPathMap(Chk01_RsltR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(Chk01_RsltR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(Chk01_RsltR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(Chk01_RsltR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(Chk01_RsltR.$loc_cd, Chk01_RsltR.$loc_cd);
				addColumnPathMap(Chk01_RsltR.$str_ln_cd, Chk01_RsltR.$str_ln_cd);
				addColumnPathMap(Chk01_RsltR.$sls_lot_no, Chk01_RsltR.$sls_lot_no);
				addColumnPathMap(Chk01_RsltR.$sls_sublot_no, Chk01_RsltR.$sls_sublot_no);
				addColumnPathMap(Chk01_RsltR.$wrk_no, Chk01_RsltR.$wrk_no);
				addColumnPathMap(Chk01_RsltR.$asset_mng_typ, Chk01_RsltR.$asset_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sundry_itm_flg, Chk01_RsltR.$sundry_itm_flg);
				addColumnPathMap(Chk01_RsltR.$itm_typ, Chk01_RsltR.$itm_typ);
				addColumnPathMap(Chk01_RsltR.$itm_typ_d_cd, Chk01_RsltR.$itm_typ_d_cd);
				addColumnPathMap(Chk01_RsltR.$ship_alloc_sts_cnt, Chk01_RsltR.$ship_alloc_sts_cnt);
				addColumnPathMap(Chk01_RsltR.$ship_act_d_cnt, Chk01_RsltR.$ship_act_d_cnt);
				addColumnPathMap(Chk01_RsltR.$iv_ship_act_d_cnt, Chk01_RsltR.$iv_ship_act_d_cnt);
				addColumnPathMap(Chk01_RsltR.$trd_unit_dec_place, Chk01_RsltR.$trd_unit_dec_place);
				addColumnPathMap(Chk01_RsltR.$trd_unit_conv_base_qty, Chk01_RsltR.$trd_unit_conv_base_qty);
				addColumnPathMap(Chk01_RsltR.$trd_unit_conv_qty, Chk01_RsltR.$trd_unit_conv_qty);
				addColumnPathMap(Chk01_RsltR.$trd_unit_rnd_typ, Chk01_RsltR.$trd_unit_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
				addColumnPathMap(Chk01_RsltR.$base_unit_dec_place, Chk01_RsltR.$base_unit_dec_place);
				addColumnPathMap(Chk01_RsltR.$base_unit_rnd_typ, Chk01_RsltR.$base_unit_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$sls_schd_qty, Chk01_RsltR.$sls_schd_qty);
				addColumnPathMap(Chk01_RsltR.$abort_qty, Chk01_RsltR.$abort_qty);
				addColumnPathMap(Chk01_RsltR.$sls_qty, Chk01_RsltR.$sls_qty);
				addColumnPathMap(Chk01_RsltR.$tax_fix_flg, Chk01_RsltR.$tax_fix_flg);
				addColumnPathMap(Chk01_RsltR.$tax_rate, Chk01_RsltR.$tax_rate);
				addColumnPathMap(Chk01_RsltR.$tax_typ, Chk01_RsltR.$tax_typ);
				addColumnPathMap(Chk01_RsltR.$cost_amt, Chk01_RsltR.$cost_amt);
				addColumnPathMap(Chk01_RsltR.$stk_mng_typ, Chk01_RsltR.$stk_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sno1_mng_typ, Chk01_RsltR.$sno1_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sno2_mng_typ, Chk01_RsltR.$sno2_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sno3_mng_typ, Chk01_RsltR.$sno3_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sno4_mng_typ, Chk01_RsltR.$sno4_mng_typ);
				addColumnPathMap(Chk01_RsltR.$itm_jnl_cd, Chk01_RsltR.$itm_jnl_cd);
				addColumnPathMap(Chk01_RsltR.$ship_schd_no, Chk01_RsltR.$ship_schd_no);
				addColumnPathMap(Chk01_RsltR.$purc_ddlv_po_d_no, Chk01_RsltR.$purc_ddlv_po_d_no);
				addColumnPathMap(Chk01_RsltR.$gd_cd, Chk01_RsltR.$gd_cd);
				addColumnPathMap(Chk01_RsltR.$cst_po_d_no, Chk01_RsltR.$cst_po_d_no);
				addColumnPathMap(Chk01_RsltR.$cst_itm_cd, Chk01_RsltR.$cst_itm_cd);
				addColumnPathMap(Chk01_RsltR.$cst_itm_nm, Chk01_RsltR.$cst_itm_nm);
				addColumnPathMap(Chk01_RsltR.$tgt_upd_cntr, Chk01_RsltR.$tgt_upd_cntr);
				addColumnPathMap(Chk01_RsltR.$cst_iv_flg, Chk01_RsltR.$cst_iv_flg);
				addColumnPathMap(Chk01_RsltR.$sls_amt_rnd_typ, Chk01_RsltR.$sls_amt_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$sls_tax_rnd_typ, Chk01_RsltR.$sls_tax_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$xrate_rnd_typ, Chk01_RsltR.$xrate_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$wtax_rnd_typ, Chk01_RsltR.$wtax_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$sls_basis_typ, Chk01_RsltR.$sls_basis_typ);
				addColumnPathMap(Chk01_RsltR.$sls_cststk_flg, Chk01_RsltR.$sls_cststk_flg);
				addColumnPathMap(Chk01_RsltR.$ship_inst_typ, Chk01_RsltR.$ship_inst_typ);
				addColumnPathMap(Chk01_RsltR.$purc_schd_no, Chk01_RsltR.$purc_schd_no);
				addColumnPathMap(Chk01_RsltR.$ddlv_iv_grp_flg, Chk01_RsltR.$ddlv_iv_grp_flg);
				addColumnPathMap(Chk01_RsltR.$inc_tax_flg, Chk01_RsltR.$inc_tax_flg);
				addColumnPathMap(Chk01_RsltR.$dscnt_itm_flg, Chk01_RsltR.$dscnt_itm_flg);
				addColumnPathMap(Chk01_RsltR.$purc_act_d_no, Chk01_RsltR.$purc_act_d_no);
				addColumnPathMap(Chk01_RsltR.$purc_act_no, Chk01_RsltR.$purc_act_no);
				addColumnPathMap(Chk01_RsltR.$aprv_no, Chk01_RsltR.$aprv_no);
				addColumnPathMap(Chk01_RsltR.$upri_not_tgt_flg, Chk01_RsltR.$upri_not_tgt_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.sundry_itm_flg()) {
					dest.itm_nm(src.itm_nm());
					dest.iv_itm_nm(src.iv_itm_nm());
				}
				
				if (src.dlv_sundry_flg()) {
					dest.dlv_nm(src.dlv_nm());
				}
				if (isNull(src.iv_no())) {
					dest.dlv_slip_no(src.dlv_slip_no());
					dest.dlv_slip_d_no(src.dlv_slip_d_no());
				}
			}
		}
		
		protected Map_Chk01_RsltR_Chk01_RsltR_Multi<Chk01_RsltR,Chk01_RsltR> createMap_Chk01_RsltR_Chk01_RsltR_Multi() {
			return new Map_Chk01_RsltR_Chk01_RsltR_Multi<Chk01_RsltR, Chk01_RsltR>();
		}
		public class Map_Chk01_RsltR_Chk01_RsltR_Multi<D extends Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_RsltR.$trd_cd, Chk01_RsltR.$trd_cd);
				addColumnPathMap(Chk01_RsltR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
				addColumnPathMap(Chk01_RsltR.$sls_schd_dt, Chk01_RsltR.$sls_schd_dt);
				addColumnPathMap(Chk01_RsltR.$eta_dt, Chk01_RsltR.$eta_dt);
				addColumnPathMap(Chk01_RsltR.$cst_cd, Chk01_RsltR.$cst_cd);
				addColumnPathMap(Chk01_RsltR.$trd_cur_cd, Chk01_RsltR.$trd_cur_cd);
				addColumnPathMap(Chk01_RsltR.$trd_amt_dec_place, Chk01_RsltR.$trd_amt_dec_place);
				addColumnPathMap(Chk01_RsltR.$trd_upri_dec_place, Chk01_RsltR.$trd_upri_dec_place);
				addColumnPathMap(Chk01_RsltR.$base_cur_cd, Chk01_RsltR.$base_cur_cd);
				addColumnPathMap(Chk01_RsltR.$base_amt_dec_place, Chk01_RsltR.$base_amt_dec_place);
				addColumnPathMap(Chk01_RsltR.$base_upri_dec_place, Chk01_RsltR.$base_upri_dec_place);
				addColumnPathMap(Chk01_RsltR.$ptax_cur_cd, Chk01_RsltR.$ptax_cur_cd);
				addColumnPathMap(Chk01_RsltR.$ptax_amt_dec_place, Chk01_RsltR.$ptax_amt_dec_place);
				addColumnPathMap(Chk01_RsltR.$ptax_upri_dec_place, Chk01_RsltR.$ptax_upri_dec_place);
				addColumnPathMap(Chk01_RsltR.$cst_po_no, Chk01_RsltR.$cst_po_no);
				addColumnPathMap(Chk01_RsltR.$dlv_slip_no, Chk01_RsltR.$dlv_slip_no);
				addColumnPathMap(Chk01_RsltR.$dlv_slip_d_no, Chk01_RsltR.$dlv_slip_d_no);
				addColumnPathMap(Chk01_RsltR.$iv_no, Chk01_RsltR.$iv_no);
				addColumnPathMap(Chk01_RsltR.$iv_d_no, Chk01_RsltR.$iv_d_no);
				addColumnPathMap(Chk01_RsltR.$ref_iv_no, Chk01_RsltR.$ref_iv_no);
				addColumnPathMap(Chk01_RsltR.$rcpt_iv_mng_no, Chk01_RsltR.$rcpt_iv_mng_no);
				addColumnPathMap(Chk01_RsltR.$rcpt_iv_no, Chk01_RsltR.$rcpt_iv_no);
				addColumnPathMap(Chk01_RsltR.$tterm_cd1, Chk01_RsltR.$tterm_cd1);
				addColumnPathMap(Chk01_RsltR.$tterm_rmrks1, Chk01_RsltR.$tterm_rmrks1);
				addColumnPathMap(Chk01_RsltR.$tterm_cd2, Chk01_RsltR.$tterm_cd2);
				addColumnPathMap(Chk01_RsltR.$tterm_rmrks2, Chk01_RsltR.$tterm_rmrks2);
				addColumnPathMap(Chk01_RsltR.$tterm_cd3, Chk01_RsltR.$tterm_cd3);
				addColumnPathMap(Chk01_RsltR.$tterm_rmrks3, Chk01_RsltR.$tterm_rmrks3);
				addColumnPathMap(Chk01_RsltR.$lc_no, Chk01_RsltR.$lc_no);
				addColumnPathMap(Chk01_RsltR.$lc_dt, Chk01_RsltR.$lc_dt);
				addColumnPathMap(Chk01_RsltR.$lc_rmrks, Chk01_RsltR.$lc_rmrks);
				addColumnPathMap(Chk01_RsltR.$cred_cd, Chk01_RsltR.$cred_cd);
				addColumnPathMap(Chk01_RsltR.$bcst_cd, Chk01_RsltR.$bcst_cd);
				addColumnPathMap(Chk01_RsltR.$ship_act_no, Chk01_RsltR.$ship_act_no);
				addColumnPathMap(Chk01_RsltR.$slo_no, Chk01_RsltR.$slo_no);
				addColumnPathMap(Chk01_RsltR.$slo_d_no, Chk01_RsltR.$slo_d_no);
				addColumnPathMap(Chk01_RsltR.$qtn_no, Chk01_RsltR.$qtn_no);
				addColumnPathMap(Chk01_RsltR.$qtn_rev, Chk01_RsltR.$qtn_rev);
				addColumnPathMap(Chk01_RsltR.$qtn_d_no, Chk01_RsltR.$qtn_d_no);
				addColumnPathMap(Chk01_RsltR.$purc_ddlv_po_no, Chk01_RsltR.$purc_ddlv_po_no);
				addColumnPathMap(Chk01_RsltR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Chk01_RsltR.$acst_cd, Chk01_RsltR.$acst_cd);
				addColumnPathMap(Chk01_RsltR.$dlv_cd, Chk01_RsltR.$dlv_cd);
				addColumnPathMap(Chk01_RsltR.$dlv_sundry_flg, Chk01_RsltR.$dlv_sundry_flg);
				addColumnPathMap(Chk01_RsltR.$dlv_zip_cd, Chk01_RsltR.$dlv_zip_cd);
				addColumnPathMap(Chk01_RsltR.$dlv_addr1, Chk01_RsltR.$dlv_addr1);
				addColumnPathMap(Chk01_RsltR.$dlv_addr2, Chk01_RsltR.$dlv_addr2);
				addColumnPathMap(Chk01_RsltR.$dlv_addr3, Chk01_RsltR.$dlv_addr3);
				addColumnPathMap(Chk01_RsltR.$dlv_addr4, Chk01_RsltR.$dlv_addr4);
				addColumnPathMap(Chk01_RsltR.$dlv_cntct_dpt, Chk01_RsltR.$dlv_cntct_dpt);
				addColumnPathMap(Chk01_RsltR.$dlv_cntct_psn, Chk01_RsltR.$dlv_cntct_psn);
				addColumnPathMap(Chk01_RsltR.$dlv_tel, Chk01_RsltR.$dlv_tel);
				addColumnPathMap(Chk01_RsltR.$dlv_fax, Chk01_RsltR.$dlv_fax);
				addColumnPathMap(Chk01_RsltR.$cntry_cd, Chk01_RsltR.$cntry_cd);
				addColumnPathMap(Chk01_RsltR.$pri_prnt_flg, Chk01_RsltR.$pri_prnt_flg);
				addColumnPathMap(Chk01_RsltR.$dest_cd1, Chk01_RsltR.$dest_cd1);
				addColumnPathMap(Chk01_RsltR.$dest_cd2, Chk01_RsltR.$dest_cd2);
				addColumnPathMap(Chk01_RsltR.$dest_cd3, Chk01_RsltR.$dest_cd3);
				addColumnPathMap(Chk01_RsltR.$tdlv_cd, Chk01_RsltR.$tdlv_cd);
				addColumnPathMap(Chk01_RsltR.$tdlv_sundry_flg, Chk01_RsltR.$tdlv_sundry_flg);
				addColumnPathMap(Chk01_RsltR.$tdlv_nm, Chk01_RsltR.$tdlv_nm);
				addColumnPathMap(Chk01_RsltR.$tdlv_zip_cd, Chk01_RsltR.$tdlv_zip_cd);
				addColumnPathMap(Chk01_RsltR.$tdlv_addr1, Chk01_RsltR.$tdlv_addr1);
				addColumnPathMap(Chk01_RsltR.$tdlv_addr2, Chk01_RsltR.$tdlv_addr2);
				addColumnPathMap(Chk01_RsltR.$tdlv_addr3, Chk01_RsltR.$tdlv_addr3);
				addColumnPathMap(Chk01_RsltR.$tdlv_addr4, Chk01_RsltR.$tdlv_addr4);
				addColumnPathMap(Chk01_RsltR.$tdlv_tel, Chk01_RsltR.$tdlv_tel);
				addColumnPathMap(Chk01_RsltR.$tdlv_fax, Chk01_RsltR.$tdlv_fax);
				addColumnPathMap(Chk01_RsltR.$tdlv_cntct_dpt, Chk01_RsltR.$tdlv_cntct_dpt);
				addColumnPathMap(Chk01_RsltR.$tdlv_cntct_psn, Chk01_RsltR.$tdlv_cntct_psn);
				addColumnPathMap(Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Chk01_RsltR.$lot_mng_typ, Chk01_RsltR.$lot_mng_typ);
				addColumnPathMap(Chk01_RsltR.$lot_no_typ, Chk01_RsltR.$lot_no_typ);
				addColumnPathMap(Chk01_RsltR.$lot_no_ptn_cd, Chk01_RsltR.$lot_no_ptn_cd);
				addColumnPathMap(Chk01_RsltR.$sublot_mng_typ, Chk01_RsltR.$sublot_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sublot_no_typ, Chk01_RsltR.$sublot_no_typ);
				addColumnPathMap(Chk01_RsltR.$sublot_no_ptn_cd, Chk01_RsltR.$sublot_no_ptn_cd);
				addColumnPathMap(Chk01_RsltR.$cntry_org_cd, Chk01_RsltR.$cntry_org_cd);
				addColumnPathMap(Chk01_RsltR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(Chk01_RsltR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(Chk01_RsltR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(Chk01_RsltR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(Chk01_RsltR.$wrk_no, Chk01_RsltR.$wrk_no);
				addColumnPathMap(Chk01_RsltR.$asset_mng_typ, Chk01_RsltR.$asset_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sundry_itm_flg, Chk01_RsltR.$sundry_itm_flg);
				addColumnPathMap(Chk01_RsltR.$itm_typ, Chk01_RsltR.$itm_typ);
				addColumnPathMap(Chk01_RsltR.$itm_typ_d_cd, Chk01_RsltR.$itm_typ_d_cd);
				addColumnPathMap(Chk01_RsltR.$ship_alloc_sts_cnt, Chk01_RsltR.$ship_alloc_sts_cnt);
				addColumnPathMap(Chk01_RsltR.$ship_act_d_cnt, Chk01_RsltR.$ship_act_d_cnt);
				addColumnPathMap(Chk01_RsltR.$iv_ship_act_d_cnt, Chk01_RsltR.$iv_ship_act_d_cnt);
				addColumnPathMap(Chk01_RsltR.$trd_unit_dec_place, Chk01_RsltR.$trd_unit_dec_place);
				addColumnPathMap(Chk01_RsltR.$trd_unit_conv_base_qty, Chk01_RsltR.$trd_unit_conv_base_qty);
				addColumnPathMap(Chk01_RsltR.$trd_unit_conv_qty, Chk01_RsltR.$trd_unit_conv_qty);
				addColumnPathMap(Chk01_RsltR.$trd_unit_rnd_typ, Chk01_RsltR.$trd_unit_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
				addColumnPathMap(Chk01_RsltR.$base_unit_dec_place, Chk01_RsltR.$base_unit_dec_place);
				addColumnPathMap(Chk01_RsltR.$base_unit_rnd_typ, Chk01_RsltR.$base_unit_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$sls_schd_qty, Chk01_RsltR.$sls_schd_qty);
				addColumnPathMap(Chk01_RsltR.$abort_qty, Chk01_RsltR.$abort_qty);
				addColumnPathMap(Chk01_RsltR.$sls_qty, Chk01_RsltR.$sls_qty);
				addColumnPathMap(Chk01_RsltR.$tax_fix_flg, Chk01_RsltR.$tax_fix_flg);
				addColumnPathMap(Chk01_RsltR.$tax_rate, Chk01_RsltR.$tax_rate);
				addColumnPathMap(Chk01_RsltR.$tax_typ, Chk01_RsltR.$tax_typ);
				addColumnPathMap(Chk01_RsltR.$cost_amt, Chk01_RsltR.$cost_amt);
				addColumnPathMap(Chk01_RsltR.$stk_mng_typ, Chk01_RsltR.$stk_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sno1_mng_typ, Chk01_RsltR.$sno1_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sno2_mng_typ, Chk01_RsltR.$sno2_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sno3_mng_typ, Chk01_RsltR.$sno3_mng_typ);
				addColumnPathMap(Chk01_RsltR.$sno4_mng_typ, Chk01_RsltR.$sno4_mng_typ);
				addColumnPathMap(Chk01_RsltR.$itm_jnl_cd, Chk01_RsltR.$itm_jnl_cd);
				addColumnPathMap(Chk01_RsltR.$ship_schd_no, Chk01_RsltR.$ship_schd_no);
				addColumnPathMap(Chk01_RsltR.$purc_ddlv_po_d_no, Chk01_RsltR.$purc_ddlv_po_d_no);
				addColumnPathMap(Chk01_RsltR.$gd_cd, Chk01_RsltR.$gd_cd);
				addColumnPathMap(Chk01_RsltR.$cst_po_d_no, Chk01_RsltR.$cst_po_d_no);
				addColumnPathMap(Chk01_RsltR.$cst_itm_cd, Chk01_RsltR.$cst_itm_cd);
				addColumnPathMap(Chk01_RsltR.$cst_itm_nm, Chk01_RsltR.$cst_itm_nm);
				addColumnPathMap(Chk01_RsltR.$tgt_upd_cntr, Chk01_RsltR.$tgt_upd_cntr);
				addColumnPathMap(Chk01_RsltR.$cst_iv_flg, Chk01_RsltR.$cst_iv_flg);
				addColumnPathMap(Chk01_RsltR.$sls_amt_rnd_typ, Chk01_RsltR.$sls_amt_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$sls_tax_rnd_typ, Chk01_RsltR.$sls_tax_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$xrate_rnd_typ, Chk01_RsltR.$xrate_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$wtax_rnd_typ, Chk01_RsltR.$wtax_rnd_typ);
				addColumnPathMap(Chk01_RsltR.$sls_basis_typ, Chk01_RsltR.$sls_basis_typ);
				addColumnPathMap(Chk01_RsltR.$sls_cststk_flg, Chk01_RsltR.$sls_cststk_flg);
				addColumnPathMap(Chk01_RsltR.$ship_inst_typ, Chk01_RsltR.$ship_inst_typ);
				addColumnPathMap(Chk01_RsltR.$purc_schd_no, Chk01_RsltR.$purc_schd_no);
				addColumnPathMap(Chk01_RsltR.$ddlv_iv_grp_flg, Chk01_RsltR.$ddlv_iv_grp_flg);
				addColumnPathMap(Chk01_RsltR.$inc_tax_flg, Chk01_RsltR.$inc_tax_flg);
				addColumnPathMap(Chk01_RsltR.$dscnt_itm_flg, Chk01_RsltR.$dscnt_itm_flg);
				addColumnPathMap(Chk01_RsltR.$purc_act_d_no, Chk01_RsltR.$purc_act_d_no);
				addColumnPathMap(Chk01_RsltR.$purc_act_no, Chk01_RsltR.$purc_act_no);
				addColumnPathMap(Chk01_RsltR.$aprv_no, Chk01_RsltR.$aprv_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.sundry_itm_flg()) {
					dest.itm_nm(src.itm_nm());
					dest.iv_itm_nm(src.iv_itm_nm());
				}
				
				if (src.dlv_sundry_flg()) {
					dest.dlv_nm(src.dlv_nm());
				}
			}
		}
		
		
		/**
		 * 処理対象売上予定・出荷進捗の排他
		 */
		protected void lock() {
			// 出荷進捗
			MCList<MST_SLO_D_R> wkSloDKeyL = MCList.create(MST_SLO_D_R.class);
			MCList<MST_SLS_SCHD_R> wkSlsSchdKeyL = MCList.create(MST_SLS_SCHD_R.class);
			for (Chk01_RsltR r : up0()) {
				if (!isNull(r.slo_d_no())) {
					MST_SLO_D_R wkSloDR = MST_SLO_D_R.create();
					wkSloDR.slo_d_no(r.slo_d_no());
					wkSloDKeyL.add(wkSloDR);
				}
				if (!isNull(r.sls_schd_no())) {
					MST_SLS_SCHD_R wkSlsSchdR = MST_SLS_SCHD_R.create();
					wkSlsSchdR.sls_schd_no(r.sls_schd_no());
					wkSlsSchdKeyL.add(wkSlsSchdR);
				}
			}
			if (!isNull(wkSloDKeyL)) {
				MCQueryApiBuilder wkSloDKeyL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
				dbWkDelete("MSBBL1320_MSW_SLO_D_D01", wkSloDKeyL_bldr.getBaseDbc());
				dbWkInsert("MSBBL1320_MSW_SLO_D_I01", wkSloDKeyL, wkSloDKeyL_bldr.getBaseDbc());
				_shipPrL = MCList.create(MST_SHIP_PR_R.class);
				executeQuery(_shipPrL, MSBBL1320_MST_SHIP_PR_S01());
				_shipPrIdxKey = _shipPrL.createIndex(Chk01_RsltR.$slo_d_no);
			}
			MCQueryApiBuilder wkSlsSchdKeyL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
			dbWkDelete("MSBBL1320_MSW_SLS_SCHD_D05", wkSlsSchdKeyL_bldr.getBaseDbc());
			dbWkInsert("MSBBL1320_MSW_SLS_SCHD_I04", wkSlsSchdKeyL, wkSlsSchdKeyL_bldr.getBaseDbc());
			_slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
			executeQuery(_slsSchdL, MSBBL1320_MST_SLS_SCHD_S08());
			_slsSchdIdxKey = _slsSchdL.createIndex(Chk01_RsltR.$sls_schd_no);
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売上実績情報の訂正を行います。<br>
	 */
	public class Ins01 extends MSBBL_SlsActListReg_MC_A.Ins01 {
		MCList<Chk01_SlsActIoR> _ioL = MCList.create(Chk01_SlsActIoR.class);
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				rollbackMessagePool();
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			// 上り電文の編集
			editUp();
			
			// チェック・補完処理呼出
			callThisChk01();
			
			// 更新処理でメッセージプールが追加された後に例外となった際に元に戻すための設定
			saveMessagePool();
			
			// エラーのない行のみ登録
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				
				// 承認提供サービスの呼出
				callAprvSvUpd02(notErrL);
				
				// 仕入実績サービスの呼出
				callPurcActSvUpd02();
				
				// 輸出実績サービス（インボイス更新）の呼出
				callExActSvUpd02(notErrL);
				
				// 与信サービス呼出（受注紐付き）
				callCredSvUpd01(notErrL);
				
				// 売上実績サービス呼出
				callSlsActSvUpd01(notErrL);
				
				// 受払実績サービス呼出
				callIoActSvUpd01();
			}
		}
		
		/**
		 * 承認提供サービスの呼出
		 * @param dtlL
		 */
		protected void callAprvSvUpd02(MCList<Chk01_RsltR> dtlL) {
			MBBAL_AprvService.Aprv_Upd02 ope = MBBAL_AprvService.crtAprv_Upd02();
			for (Chk01_RsltR dtlR : dtlL) {
				Aprv_Chk02_Rslt1R up = ope.up0().createRow();
				if ((MSC_SLS_TGT_TYP.isCSTSTK_SLS(dtlR.sls_tgt_typ()) || MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(dtlR.sls_tgt_typ())) &&
					!isNull(dtlR.slo_no()) && !isNull(dtlR.aprv_no())) {
					up.aprv_no(dtlR.aprv_no());
					up.setAttributes(dtlR);
					ope.up0().add(up);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 輸出実績サービス（インボイス更新）の呼出
		 * 
		 * @param dtlL
		 */
		protected void callExActSvUpd02(MCList<Chk01_RsltR> dtlL) {
			MSBEL_ExActService.ExAct_Upd02 ope = MSBEL_ExActService.crtExAct_Upd02();
			ExAct_Upd02_DtlR oUp0;
			MCList<Chk01_RsltR> ivGrL = dtlL.groupBy(
					Chk01_RsltR.$peg_no,
					Chk01_RsltR.$sls_tgt_typ,
					Chk01_RsltR.$cst_iv_flg,
					Chk01_RsltR.$sls_cststk_flg,
					Chk01_RsltR.$iv_no,
					Chk01_RsltR.$via_dlv_typ);
			for (Chk01_RsltR dtlR : ivGrL) {
				if (dtlR.cst_iv_flg()
						&& !isNullOrNullVal(dtlR.iv_no())
						&& !dtlR.sls_cststk_flg()
						&& !MAC_VIA_DLV_TYP.isVIA(dtlR.via_dlv_typ())) {
						oUp0 = ExAct_Upd02_DtlR.create();
						oUp0.peg_no(dtlR.peg_no());
						oUp0.iv_no(dtlR.iv_no());
						oUp0.cmpl_flg(true);
						ope.up0().add(oUp0);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 	与信サービス呼出（受注紐付き）
		 * 
		 */
		protected void callCredSvUpd01(MCList<Chk01_RsltR> dtlL) {
			
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			Cred_Upd01_CndR up0R = null;
			MCNumber credAmtSum = null;
			MCNumber credAmt = null;
			
			MCIndexKey idxkey = dtlL.createIndex(Chk01_RsltR.$cst_cd, Chk01_RsltR.$trd_cur_cd, Chk01_RsltR.$trd_ptn_typ);
			
			for (Chk01_RsltR grpR : dtlL.groupBy(Chk01_RsltR.$cst_cd, Chk01_RsltR.$trd_cur_cd, Chk01_RsltR.$trd_ptn_typ)) {
				
				credAmtSum = MCNumber.ZERO;
				up0R = Cred_Upd01_CndR.create();
				
				up0R.cst_cd(grpR.cst_cd());
				up0R.cur_cd(grpR.trd_cur_cd());
				up0R.trd_ptn_typ(grpR.trd_ptn_typ());
				up0R.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				
				MCList<Chk01_RsltR> subDtlL = dtlL.subList(idxkey, grpR.cst_cd(), grpR.trd_cur_cd(), grpR.trd_ptn_typ());
				
				for (Chk01_RsltR dtlR : subDtlL) {
					
					if (!isNull(dtlR.sls_schd_no())) {
						
						credAmt = calcCredAmt(dtlR.sls_schd_no(), dtlR.base_unit_qty(), MCNumber.ZERO,
								dtlR.sync_flg(), dtlR.sls_tgt_typ(), dtlR.sls_act_no(), dtlR.slo_d_no(), false, false, false);
						
						credAmtSum = credAmtSum.add(dtlR.dscnt_itm_flg() ? credAmt.negate() : credAmt);
					}
				}
				
				up0R.amt(credAmtSum);
				
				ope.up0().add(up0R);
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 	仕入実績登録サービスの呼出
		 * 
		 */
		protected void callPurcActSvUpd02() {
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService
					.crtPurc_Upd02();
			
			for (Chk01_RsltR chkR : up0()) {
				// ヘッダ・明細・詳細は１：１：１となるためpeg_noはすべて同じ
				if (chkR.sync_flg() && !chkR.err_flg()) {
					Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
					opeHdr.peg_no(chkR.peg_no());
					ope.up1().add(opeHdr);
					
					Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
					opeDtl.peg_no(chkR.peg_no());
					ope.up2().add(opeDtl);
					
					Purc_Ins01_IoR opeIo = ope.up3().createRow();
					opeIo.peg_no(chkR.peg_no());
					ope.up3().add(opeIo);
				}
			}
			
			if (!ope.up1().isEmpty()) {
				
				ope.up0().purc_ddlv_reg_exec_flg(true);
				ope.up0().amt_calc_flg(true);
				ope.exec();
				// 仕入実績サービスからの下り電文をコピーする
				String[] cols = new String[] {Chk01_RsltR.$purc_act_no, Chk01_RsltR.$purc_act_seq};
				copyByPegNo(up0(), cols, ope.down0(), cols);
				
				cols = new String[] {Chk01_RsltR.$purc_act_d_no, Chk01_RsltR.$purc_act_d_seq};
				copyByPegNo(up0(), cols, ope.down1(), cols);
				
				cols = new String[] {Chk01_RsltR.$purc_act_io_no, Chk01_RsltR.$purc_act_io_seq, Chk01_RsltR.$arr_act_no};
				copyByPegNo(up0(), cols, ope.down2(), cols);
			}
		}
		
		/**
		 * 売上実績SV呼出
		 * 
		 * @param dtlL
		 */
		protected void callSlsActSvUpd01(MCList<Chk01_RsltR> dtlL) {
			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			
			// 電文編集
			MCNumber preHdrPegNo = MCNumber.ZERO;
			
			dtlL.sort(Chk01_RsltR.$hdr_peg_no, Chk01_RsltR.$dtl_peg_no);
			for (Chk01_RsltR dtlR : dtlL) {
				SlsAct_Upd01_HdrR up0 = SlsAct_Upd01_HdrR.create();
				MCList<SlsAct_Upd01_DtlR> up1 = MCList.create(SlsAct_Upd01_DtlR.class);
				
				if (!isSame(preHdrPegNo, dtlR.hdr_peg_no())) {
					up0 = makeSlsActHdr(dtlR);
					ope.up0().add(up0);
				}
				up1 = makeSlsActDtl(up0, dtlR);
				ope.up1().addAll(up1);
				ope.up2().addAll(makeSlsActIo(up1));
				
				preHdrPegNo = dtlR.hdr_peg_no();
			}
			
			if (ope.up0().size() > 0) { 
				ope.up3().indiv_prnt_flg(up1().indiv_prnt_flg());
				// 売上実績サービス呼出
				ope.exec();
				
				String[] dtlDestCols = new String[]{Chk01_RsltR.$sls_act_d_no, Chk01_RsltR.$sls_act_d_seq, Chk01_RsltR.$dlv_slip_d_no,
						Chk01_RsltR.$sls_act_no, Chk01_RsltR.$sls_act_seq, Chk01_RsltR.$sls_act_rev, Chk01_RsltR.$dlv_slip_no, Chk01_RsltR.$iv_no};
				String[] dtlSrcCols = new String[]{SlsAct_Upd01_Rslt_DtlR.$sls_act_d_no, SlsAct_Upd01_Rslt_DtlR.$sls_act_d_seq, SlsAct_Upd01_Rslt_DtlR.$dlv_slip_d_no
						,SlsAct_Upd01_Rslt_DtlR.$sls_act_no, SlsAct_Upd01_Rslt_DtlR.$sls_act_seq, SlsAct_Upd01_Rslt_DtlR.$sls_act_rev, SlsAct_Upd01_Rslt_DtlR.$dlv_slip_no, SlsAct_Upd01_Rslt_DtlR.$iv_no};
				
				copyByPegNo(dtlL, ope.down1(), Chk01_RsltR.$dtl_peg_no, dtlDestCols, SlsAct_Upd01_Rslt_DtlR.$dtl_peg_no, dtlSrcCols);
			}
		}
		
		/**
		 * 売上実績SV呼出用電文作成（ヘッダ）
		 * 
		 * @param hdrR
		 * @return
		 */
		protected SlsAct_Upd01_HdrR makeSlsActHdr(Chk01_RsltR dtlR) {
			SlsAct_Upd01_HdrR up0 = SlsAct_Upd01_HdrR.create();
			
			copy(up0, dtlR, createMap_SlsAct_Upd01_HdrR_Chk01_RsltR());
			
			initBpCache();
			up0.cst_iv_flg(getBpCache(up0.cst_cd()).cst_iv_flg());
			return up0;
		}
		
		protected Map_SlsAct_Upd01_HdrR_Chk01_RsltR<SlsAct_Upd01_HdrR,Chk01_RsltR> createMap_SlsAct_Upd01_HdrR_Chk01_RsltR() {
			return new Map_SlsAct_Upd01_HdrR_Chk01_RsltR<SlsAct_Upd01_HdrR, Chk01_RsltR>();
		}
		
		public class Map_SlsAct_Upd01_HdrR_Chk01_RsltR<D extends SlsAct_Upd01_HdrR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$hdr_peg_no, Chk01_RsltR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, Chk01_RsltR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, Chk01_RsltR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev, Chk01_RsltR.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, Chk01_RsltR.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, Chk01_RsltR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, Chk01_RsltR.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt, Chk01_RsltR.$can_ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, Chk01_RsltR.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, Chk01_RsltR.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, Chk01_RsltR.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, Chk01_RsltR.$sls_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_tm, Chk01_RsltR.$ship_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_tm, Chk01_RsltR.$dlv_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$eta_dt, Chk01_RsltR.$eta_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, Chk01_RsltR.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, Chk01_RsltR.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, Chk01_RsltR.$ref_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_mng_no, Chk01_RsltR.$rcpt_iv_mng_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_no, Chk01_RsltR.$rcpt_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, Chk01_RsltR.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, Chk01_RsltR.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, Chk01_RsltR.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, Chk01_RsltR.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, Chk01_RsltR.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, Chk01_RsltR.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_no, Chk01_RsltR.$lc_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_dt, Chk01_RsltR.$lc_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_rmrks, Chk01_RsltR.$lc_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt, Chk01_RsltR.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt, Chk01_RsltR.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, Chk01_RsltR.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, Chk01_RsltR.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, Chk01_RsltR.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, Chk01_RsltR.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, Chk01_RsltR.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, Chk01_RsltR.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd, Chk01_RsltR.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, Chk01_RsltR.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, Chk01_RsltR.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd, Chk01_RsltR.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, Chk01_RsltR.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, Chk01_RsltR.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_no, Chk01_RsltR.$ship_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, Chk01_RsltR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, Chk01_RsltR.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, Chk01_RsltR.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no, Chk01_RsltR.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_basis_typ, Chk01_RsltR.$sls_basis_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, Chk01_RsltR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_service_exec_flg, Chk01_RsltR.$ship_act_service_exec_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_rnd_typ, Chk01_RsltR.$xrate_rnd_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_dlv_slip_no, Chk01_RsltR.$ship_dlv_slip_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (isNullOrNullVal(src.iv_no())) {
					dest.dlv_slip_prnt_flg(src.prnt_out_flg());
				}
				else {
					dest.dlv_slip_prnt_flg(false);
				}
				
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				if (!isNull(src.purc_ddlv_dlv_slip_no())) {
					dest.dlv_slip_no(src.purc_ddlv_dlv_slip_no());
					dest.purc_ddlv_dlv_slip_no(src.purc_ddlv_dlv_slip_no());
				}
				dest.amt_calc_flg(false);
			}
		}
		
		protected MCList<SlsAct_Upd01_DtlR> makeSlsActDtl(SlsAct_Upd01_HdrR hdrR, Chk01_RsltR dtlR) {
			MCList<SlsAct_Upd01_DtlR> up1 = MCList.create(SlsAct_Upd01_DtlR.class);
			
			// 同一ヘッダ紐付けＮＯのものを取得
			String[] keys = new String[] {
					Chk01_RsltR.$hdr_peg_no
			};
			Comparable<?>[] vals = new Comparable[] {
					hdrR.hdr_peg_no()
			};
			MCList<Chk01_RsltR> tmpList = up0().subList(keys, vals);
			int tmpDispSeq = 0;
			for (Chk01_RsltR tmpR : tmpList) {
				SlsAct_Upd01_DtlR up1R = SlsAct_Upd01_DtlR.create();
				
				copy(up1R, tmpR, createMap_SlsAct_Upd01_DtlR_Chk01_RsltR());
				up1R.disp_seq(++tmpDispSeq);
				up1R.setStatus(MCRow.CREATE);
				up1.add(up1R);
			}
			
			return up1;
		}
		
		protected Map_SlsAct_Upd01_DtlR_Chk01_RsltR<SlsAct_Upd01_DtlR,Chk01_RsltR> createMap_SlsAct_Upd01_DtlR_Chk01_RsltR() {
			return new Map_SlsAct_Upd01_DtlR_Chk01_RsltR<SlsAct_Upd01_DtlR, Chk01_RsltR>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_Chk01_RsltR<D extends SlsAct_Upd01_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$hdr_peg_no, Chk01_RsltR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dtl_peg_no, Chk01_RsltR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, Chk01_RsltR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, Chk01_RsltR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, Chk01_RsltR.$disp_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, Chk01_RsltR.$dlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg, Chk01_RsltR.$dlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, Chk01_RsltR.$dlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, Chk01_RsltR.$dlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, Chk01_RsltR.$dlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, Chk01_RsltR.$dlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, Chk01_RsltR.$dlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, Chk01_RsltR.$dlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, Chk01_RsltR.$dlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, Chk01_RsltR.$dlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, Chk01_RsltR.$dlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, Chk01_RsltR.$dlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, Chk01_RsltR.$pri_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, Chk01_RsltR.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, Chk01_RsltR.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, Chk01_RsltR.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, Chk01_RsltR.$tdlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg, Chk01_RsltR.$tdlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, Chk01_RsltR.$tdlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, Chk01_RsltR.$tdlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, Chk01_RsltR.$tdlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, Chk01_RsltR.$tdlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, Chk01_RsltR.$tdlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, Chk01_RsltR.$tdlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_tel, Chk01_RsltR.$tdlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_fax, Chk01_RsltR.$tdlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, Chk01_RsltR.$tdlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_psn, Chk01_RsltR.$tdlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, Chk01_RsltR.$itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, Chk01_RsltR.$iv_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, Chk01_RsltR.$cntry_org_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, Chk01_RsltR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, Chk01_RsltR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, Chk01_RsltR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, Chk01_RsltR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, Chk01_RsltR.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt, Chk01_RsltR.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_upri, Chk01_RsltR.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_amt, Chk01_RsltR.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_tax_amt, Chk01_RsltR.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_dscnt_amt, Chk01_RsltR.$base_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_upri, Chk01_RsltR.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_amt, Chk01_RsltR.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_tax_amt, Chk01_RsltR.$ptax_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_dscnt_amt, Chk01_RsltR.$ptax_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, Chk01_RsltR.$interim_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, Chk01_RsltR.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg, Chk01_RsltR.$inc_tax_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, Chk01_RsltR.$tax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, Chk01_RsltR.$tax_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, Chk01_RsltR.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, Chk01_RsltR.$cost_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, Chk01_RsltR.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times, Chk01_RsltR.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ, Chk01_RsltR.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg, Chk01_RsltR.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, Chk01_RsltR.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, Chk01_RsltR.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, Chk01_RsltR.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, Chk01_RsltR.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_jnl_cd, Chk01_RsltR.$itm_jnl_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, Chk01_RsltR.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, Chk01_RsltR.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, Chk01_RsltR.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, Chk01_RsltR.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks, Chk01_RsltR.$intr_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, Chk01_RsltR.$sls_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, Chk01_RsltR.$bd_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, Chk01_RsltR.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, Chk01_RsltR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, Chk01_RsltR.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, Chk01_RsltR.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, Chk01_RsltR.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, Chk01_RsltR.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, Chk01_RsltR.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, Chk01_RsltR.$qtn_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, Chk01_RsltR.$purc_ddlv_po_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, Chk01_RsltR.$purc_ddlv_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no, Chk01_RsltR.$purc_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no, Chk01_RsltR.$purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, Chk01_RsltR.$iv_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, Chk01_RsltR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, Chk01_RsltR.$dscnt_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, Chk01_RsltR.$dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_no, Chk01_RsltR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_seq, Chk01_RsltR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wrk_no, Chk01_RsltR.$wrk_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_itm_flg, Chk01_RsltR.$dscnt_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_d_no, Chk01_RsltR.$ship_dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_multi_flg, Chk01_RsltR.$ship_dlv_slip_multi_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$upri_not_tgt_flg, Chk01_RsltR.$upri_not_tgt_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.sls_schd_abort_flg(src.abort_flg());
				if (!isNull(src.purc_ddlv_dlv_slip_d_no())) {
					dest.dlv_slip_d_no(src.purc_ddlv_dlv_slip_d_no());
					dest.purc_ddlv_dlv_slip_d_no(src.purc_ddlv_dlv_slip_d_no());
				}
			}
		}
		
		protected MCList<SlsAct_Upd01_IoR> makeSlsActIo(MCList<SlsAct_Upd01_DtlR> dtlL) {
			// 明細紐付けＮＯに該当する_ioLより紐付く詳細を取得する
			MCList<SlsAct_Upd01_IoR> up2 = MCList.create(SlsAct_Upd01_IoR.class);
			
			MCIndexKey idxkey = up0().createIndex(Chk01_RsltR.$hdr_peg_no, Chk01_RsltR.$dtl_peg_no);
			
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				MCList<Chk01_SlsActIoR> tmpList = MCList.create(Chk01_SlsActIoR.class);
				tmpList = _ioL.subList(Chk01_SlsActIoR.$dtl_peg_no, dtlR.dtl_peg_no());
				
				for (Chk01_SlsActIoR tmpR : tmpList) {
					SlsAct_Upd01_IoR up2R = SlsAct_Upd01_IoR.create();
					
					copy(up2R, tmpR, createMap_SlsAct_Upd01_IoR_Chk01_SlsActIoR());
					up2R.setStatus(MCRow.CREATE);
					up2R.hdr_peg_no(dtlR.hdr_peg_no());
					up2R.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					
					Chk01_RsltR upR = up0().getFirst(idxkey, dtlR.hdr_peg_no(), dtlR.dtl_peg_no());
					
					if (!isNull(upR) && upR.sync_flg()) {
						
						up2R.purc_act_io_no(upR.purc_act_io_no());
						up2R.arr_act_no(upR.arr_act_no());
						up2R.loc_cd(upR.loc_cd());
						up2R.str_ln_cd(upR.str_ln_cd());
						up2R.lot_no(upR.lot_no());
						up2R.sublot_no(upR.sublot_no());
					}
					
					up2.add(up2R);
				}
			}
			return up2;
		}
		
		protected Map_SlsAct_Upd01_IoR_Chk01_SlsActIoR<SlsAct_Upd01_IoR,Chk01_SlsActIoR> createMap_SlsAct_Upd01_IoR_Chk01_SlsActIoR() {
			return new Map_SlsAct_Upd01_IoR_Chk01_SlsActIoR<SlsAct_Upd01_IoR, Chk01_SlsActIoR>();
		}
		
		public class Map_SlsAct_Upd01_IoR_Chk01_SlsActIoR<D extends SlsAct_Upd01_IoR, S extends Chk01_SlsActIoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$hdr_peg_no, Chk01_SlsActIoR.$hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$dtl_peg_no, Chk01_SlsActIoR.$dtl_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$io_peg_no, Chk01_SlsActIoR.$io_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, Chk01_SlsActIoR.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, Chk01_SlsActIoR.$sls_act_io_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$data_crud_typ, Chk01_SlsActIoR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, Chk01_SlsActIoR.$ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$iv_ship_act_d_no, Chk01_SlsActIoR.$iv_ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no, Chk01_SlsActIoR.$arr_act_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no, Chk01_SlsActIoR.$purc_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, Chk01_SlsActIoR.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, Chk01_SlsActIoR.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, Chk01_SlsActIoR.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, Chk01_SlsActIoR.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, Chk01_SlsActIoR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, Chk01_SlsActIoR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, Chk01_SlsActIoR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, Chk01_SlsActIoR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, Chk01_SlsActIoR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, Chk01_SlsActIoR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, Chk01_SlsActIoR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, Chk01_SlsActIoR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, Chk01_SlsActIoR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, Chk01_SlsActIoR.$pack_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, Chk01_SlsActIoR.$pack_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, Chk01_SlsActIoR.$sync_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_schd_abort_flg, Chk01_SlsActIoR.$sls_schd_abort_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_alloc_sts_no, Chk01_SlsActIoR.$ship_alloc_sts_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, Chk01_SlsActIoR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, Chk01_SlsActIoR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, Chk01_SlsActIoR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_ret_schd_flg, Chk01_SlsActIoR.$sls_ret_schd_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$new_hdr_peg_no, Chk01_SlsActIoR.$new_hdr_peg_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_no, Chk01_SlsActIoR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_seq, Chk01_SlsActIoR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_upri, Chk01_SlsActIoR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_cur_dscnt_amt, Chk01_SlsActIoR.$trd_cur_dscnt_amt);
			}
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			
			setDlvSlipNo();
			
			setPegNo(Chk01_RsltR.$peg_no, up0());
			
			setChkGrpNo();
		}
		/**
		 * 納品書ＮＯの設定.
		 */
		protected void setDlvSlipNo() {
			for (Chk01_RsltR dtlR : up0()) {
				if (!isNull(dtlR.purc_ddlv_dlv_slip_no())) {
					dtlR.dlv_slip_no(dtlR.purc_ddlv_dlv_slip_no());
					dtlR.dlv_slip_d_no(dtlR.purc_ddlv_dlv_slip_d_no());
				}
				else {
					if (isNull(dtlR.iv_no())) {
						dtlR.dlv_slip_no(dtlR.ship_dlv_slip_no());
						dtlR.dlv_slip_d_no(dtlR.ship_dlv_slip_d_no());
					}
				}
			}
		}
		/**
		 * チェックＧＲＰの設定.
		 */
		protected void setChkGrpNo() {
			// 売上対象区分、受注ＮＯ、売上日、計上日、請求起算日、売上担当者、売上部門、債権部門、為替レート、納税為替レート、納品書ＮＯ、インボイスＮＯ
			// この場合、チェックＧＲＰを同じにする（1ヘッダ、複数明細の形式）
			// インボイスＮＯが設定されている場合、インボイスＮＯ毎にチェックＧＲＰを同じにする
			// エラーが発生した場合は同一チェックＧＲＰのレコード全てエラー扱いにする
			String[] sameKeys = new String[] {
					Chk01_RsltR.$sls_tgt_typ,
					Chk01_RsltR.$slo_no, Chk01_RsltR.$sls_dt, Chk01_RsltR.$ac_dt, Chk01_RsltR.$bill_basis_dt,
					Chk01_RsltR.$sls_usr_cd, Chk01_RsltR.$sls_dpt_cd, Chk01_RsltR.$ar_dpt_cd, 
					Chk01_RsltR.$xrate, Chk01_RsltR.$ptax_xrate, Chk01_RsltR.$hdr_peg_no, Chk01_RsltR.$dlv_slip_no, Chk01_RsltR.$iv_no
			};
			int chkGrpNo = 0;
			MCIndexKey ivNoIdxkey = up0().createIndex(Chk01_RsltR.$iv_no);
			MCIndexKey sameKeysIdxkey = up0().createIndex(sameKeys);
			for (Chk01_RsltR dtlR : up0()) {
				if (isNull(dtlR.chk_grp_no())) {
					if (!isNull(dtlR.iv_no())) {
						MCList<Chk01_RsltR> tmpList = up0().subList(ivNoIdxkey, dtlR.iv_no());
						tmpList.setNumberNE(Chk01_RsltR.$chk_grp_no, ++chkGrpNo);
					}
					else {
						Comparable<?>[] sameVals = new Comparable[] {
								dtlR.sls_tgt_typ(),
								dtlR.slo_no(), dtlR.sls_dt(), dtlR.ac_dt(), dtlR.bill_basis_dt(),
								dtlR.sls_usr_cd(), dtlR.sls_dpt_cd(), dtlR.ar_dpt_cd(), 
								dtlR.xrate(), dtlR.ptax_xrate(), null, dtlR.dlv_slip_no(), dtlR.iv_no()
						};
						MCList<Chk01_RsltR> tmpList = up0().subList(sameKeysIdxkey, sameVals);
						tmpList.setNumberNE(Chk01_RsltR.$chk_grp_no, ++chkGrpNo);
					}
				}
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			mapUpContainers(CALL_OPE);
			chk01.call();
			up0().setAll(chk01.down0());
			_ioL.setAll(chk01.down1());
			initCalc01Hdr();
			_calc01HdrL.addAllByName(chk01.down2());
			_idxCalc01HdrKey = _calc01HdrL.createIndex(LIST_INDEX_KEY_NM);
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}
	
	/**
	 * 対象インボイスの配送先経由区分取得
	 * 
	 * @param ivNo
	 * @return
	 */
	protected String getViaDlvTyp(String ivNo) {
		MST_IV_R ivR = MST_IV_R.create();
		MST_IV_R t = MST_IV_R.create("T");
		MCQueryApiBuilder ivR_bldr = MCQueryApiBuilder.create(t);
		ivR_bldr.setSelect(t.via_dlv_typ);
		ivR_bldr.setWhere(t.iv_no.eq(bind("1")), ivNo);
		dbSelect("MSBBL1320_MST_IV_S02", ivR, ivR_bldr);
		return ivR.via_dlv_typ();
	}
	
	/**
	 * インボイスＮＯまたは請求先ＣＤが同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
		List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
		// データ補完
		crrctData(list);

		// インボイスＮＯ
		MCList<Chk01_RsltR>[] ivNoGrpL = list.groupList(Chk01_RsltR.$iv_no);
		List<MCList<Chk01_RsltR>> ivNoGrpBf1L = new ArrayList<>();
		List<MCList<Chk01_RsltR>> ivNoGrpBf2L = new ArrayList<>();
		List<MCList<Chk01_RsltR>> ivNoGrpAfL = new ArrayList<>();
		
		for (MCList<Chk01_RsltR> ivGL : ivNoGrpL) {
			if (!isNullOrNullVal(ivGL.get(0).iv_no())) {
				ivNoGrpBf1L.add(ivGL);
			}
			else {
				ivNoGrpBf2L.add(ivGL);
			}
		}
		
		if (ivNoGrpBf1L.size() > 1) {
			//売上集計キーが同一のモノも同じグループに含める(スレッドを分けない)
			//売上集計キー：計上年月、売上部門ＣＤ、売上担当者ＣＤ、得意先ＣＤ、品目ＣＤ、枝番１、枝番２、枝番３、通貨ＣＤ、案件ＮＯ
			ivNoGrpAfL = reGrp(ivNoGrpBf1L, 0);
		}
		else {
			ivNoGrpAfL = ivNoGrpBf1L;
		}
		ivNoGrpAfL.addAll(ivNoGrpBf2L);
		MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
		for (MCList<Chk01_RsltR> ivNoL : ivNoGrpAfL) {
			if (!isNullOrNullVal(ivNoL.get(0).iv_no())) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_RsltR.class);
				}
				tmp.addAll(ivNoL);
			}
			else {
				// インボイスＮＯがなければ与信管理先ＣＤ
				MCList<Chk01_RsltR>[] credCdGrpL = ivNoL
						.groupList(Chk01_RsltR.$cred_cd);
				for (MCList<Chk01_RsltR> credCdL : credCdGrpL) {
					if (!isNull(credCdL.get(0).cred_cd())) {
						if (tmp.size() >= max) {
							ret.add(tmp);
							tmp = MCList.create(Chk01_RsltR.class);
						}
						tmp.addAll(credCdL);
					}
					else {
						// 与信管理先ＣＤがなければ請求先ＣＤ
						MCList<Chk01_RsltR>[] bcstCdGrpL = credCdL
								.groupList(Chk01_RsltR.$bcst_cd);
						for (MCList<Chk01_RsltR> bcstCdL : bcstCdGrpL) {
							if (tmp.size() >= max) {
								ret.add(tmp);
								tmp = MCList.create(Chk01_RsltR.class);
							}
							tmp.addAll(bcstCdL);
						}
					}
				}
			}
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}
	
	protected List<MCList<Chk01_RsltR>> reGrp(List<MCList<Chk01_RsltR>> ivNoGrpBfL, int i) {
		List<MCList<Chk01_RsltR>> arrTmp = new ArrayList<>();
		List<MCList<Chk01_RsltR>> arrTmp1 = new ArrayList<>();
		List<MCList<Chk01_RsltR>> arrTmp2 = new ArrayList<>();
		Map<ArrayList<String>, Chk01_RsltR> cstH;
		Map<ArrayList<String>, Chk01_RsltR> cstHF = new HashMap<ArrayList<String>, Chk01_RsltR>();
		int n = 0;
		//売上集計キーを含む
		boolean iFlg = false;
		//再比較対象
		boolean cntFlg = false;
		MCIndexKey idxKey = _slsSchdL.createIndex(Chk01_RsltR.$sls_schd_no);

		for (MCList<Chk01_RsltR> grp : ivNoGrpBfL) {
			if (n < i) {
				n = n + 1;
				arrTmp.add(grp);
				continue;
			}

			cstH = new HashMap<ArrayList<String>, Chk01_RsltR>();
			iFlg = false;
			MCList<Chk01_RsltR> grpL = MCList.create(Chk01_RsltR.class);
			for (Chk01_RsltR r : grp) {
				MCList<Chk01_RsltR> tmpL = _slsSchdL.subList(idxKey, r.sls_schd_no());
				grpL.addAll(tmpL);
			}
			// 売上部門の組織変更対応
			MAUCL_DptUtil.setDpt(grpL, Chk01_RsltR.$sls_dpt_cd, Chk01_RsltR.$ac_dt);

			for (Chk01_RsltR r : grpL) {
				//重複キーを追加しない
				if (cstH.containsKey(getKeyCols(r))) {
					continue;
				}
				cstH.put(getKeyCols(r), r);
				
				//先頭Gを比較しない
				if (n > i && cstHF.containsKey(getKeyCols(r))) {
					iFlg = true;
					cntFlg = true;
					break;
				}
			}

			//先頭Gの場合のみ処理をする。
			if (n == i) {
				cstHF = cstH;
				arrTmp1.add(grp);
			}
			else {
				if (iFlg) {
					arrTmp1.add(grp);
				}
				else {
					arrTmp2.add(grp);
				}
			}

			n = n + 1;
		}

		MCList<Chk01_RsltR> grpL = MCList.create(Chk01_RsltR.class);
		for (MCList<Chk01_RsltR> grp : arrTmp1) {
			grpL.addAll(grp);
		}

		if (!grpL.isEmpty()) {
			arrTmp.add(grpL);
		}
		arrTmp.addAll(arrTmp2);

		//再比較対象外
		if (!cntFlg) {
			i = i + 1;
		}

		if (n > i) {
			return reGrp(arrTmp, i);
		}
		else {
			return arrTmp;
		}
	}

	/**
	 * 売上集計用カラムを設定
	 * 
	 * @return
	 */
	protected ArrayList<String> getKeyCols(Chk01_RsltR r) {
		ArrayList<String> key = new ArrayList<String>();
		key.add(getAcYm(r.ac_dt()).toString());
		key.add(r.sls_dpt_cd());
		key.add(r.sls_usr_cd());
		key.add(r.cst_cd());
		key.add(r.itm_cd());
		key.add(r.itm_sub1());
		key.add(r.itm_sub2());
		key.add(r.itm_sub3());
		key.add(r.trd_cur_cd());
		key.add(r.wrk_no());
		
		return key;
	}
	/**
	 * データ補完
	 * @param list
	 */
	protected void crrctData(MCList<Chk01_RsltR> list) {
		
		MCList<MSW_SLS_ACT_R> wkL = MCList.create(MSW_SLS_ACT_R.class);
		MSW_SLS_ACT_R t1 = MSW_SLS_ACT_R.create("T");
		execDbWkDelete("MSBBL1320_MSW_SLS_ACT_D02", t1);
		MCList<MST_SLS_SCHD_R> wkKeyL = MCList.create(MST_SLS_SCHD_R.class);
		for (Chk01_RsltR dtlR : list) {
			// 売上実績WK
			MSW_SLS_ACT_R wkR = MSW_SLS_ACT_R.create();
			wkR.sls_schd_no(dtlR.sls_schd_no());
			wkR.unit_cd(dtlR.trd_unit_cd());
			wkR.tax_cd(dtlR.tax_cd());
			wkL.add(wkR);
			
			// 売上予定キーWK
			MST_SLS_SCHD_R wkKeyR = MST_SLS_SCHD_R.create();
			wkKeyR.sls_schd_no(dtlR.sls_schd_no());
			wkKeyL.add(wkKeyR);
		}
		dbInsert("MSBBL1320_MSW_SLS_ACT_I02", wkL, MCQueryApiBuilder.create(t1));
		dbWkInsert("MSBBL1320_MSW_SLS_SCHD_I05", wkKeyL,
				MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T")).getBaseDbc());
		
		
		// SELECT
		MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
		MAM_CO_R co = MAM_CO_R.create("CO");
		MSW_SLS_ACT_R slsactwk = MSW_SLS_ACT_R.create("SLSACTWK");
		MST_SLO_D_R slod = MST_SLO_D_R.create("SLOD");
		MST_SLO_R slo = MST_SLO_R.create("SLO");
		MST_IV_R iv = MST_IV_R.create("IV");
		MST_IV_D_R ivd = MST_IV_D_R.create("IVD");
		MST_PURC_ACT_D_R purcactd = MST_PURC_ACT_D_R.create("PURCACTD");
		MST_PURC_ACT_R purcact = MST_PURC_ACT_R.create("PURCACT");
		MST_DLV_SLIP_D_R slipd = MST_DLV_SLIP_D_R.create("SLIPD");
		MST_DLV_SLIP_D_R S1W = MST_DLV_SLIP_D_R.create("W");
		MST_DLV_SLIP_R slip = MST_DLV_SLIP_R.create("SLIP");
		MST_WRK_SNO_R wrkSno = MST_WRK_SNO_R.create("WRKSNO");
		MAM_BP_R cst = MAM_BP_R.create("CST");
		MAM_BP_R acst = MAM_BP_R.create("ACST");
		MAM_BP_R bcst = MAM_BP_R.create("BCST");

		MCList<MST_SLS_SCHD_R> slsSchdDL = MCList.create(MST_SLS_SCHD_R.class);
		MCQueryApiBuilder slsSchdDL_bldr = MCQueryApiBuilder.create(t);
		slsSchdDL_bldr.setSelect(t.sls_schd_no);
		slsSchdDL_bldr.addSelect(t.iv_no);
		slsSchdDL_bldr.addSelect(acst.bcst_cd);
		slsSchdDL_bldr.addSelect(bcst.ar_cred_cd);
		slsSchdDL_bldr.addSelect(iv.ship_rqst_id_cd.as("cst_cd"));
		slsSchdDL_bldr.addSelect(iv.trd_cur_cd.as("trd_cur_cd"));
		slsSchdDL_bldr.addSelect(ivd.itm_cd.as("itm_cd"));
		slsSchdDL_bldr.addSelect(ivd.itm_sub1.as("itm_sub1"));
		slsSchdDL_bldr.addSelect(ivd.itm_sub2.as("itm_sub2"));
		slsSchdDL_bldr.addSelect(ivd.itm_sub3.as("itm_sub3"));
		slsSchdDL_bldr.addSelect(wrkSno.wrk_no);
		slsSchdDL_bldr.setWhere(bracket( purcact.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())) .or(purcactd.purc_act_seq.isNull())));
		slsSchdDL_bldr.addCrossJoin(co);
		slsSchdDL_bldr.addInnerJoin(slsactwk, bracket( t.sls_schd_no.eq(slsactwk.sls_schd_no)));
		slsSchdDL_bldr.addLeftOuterJoin(slod, bracket( t.slo_d_no.eq(slod.slo_d_no)));
		slsSchdDL_bldr.addLeftOuterJoin(slo, bracket( slod.slo_no.eq(slo.slo_no)));
		slsSchdDL_bldr.addLeftOuterJoin(iv, bracket( t.iv_no.eq(iv.iv_no)));
		slsSchdDL_bldr.addLeftOuterJoin(purcactd, bracket( t.purc_act_d_no.eq(purcactd.purc_act_d_no)));
		slsSchdDL_bldr.addLeftOuterJoin(purcact, bracket( purcact.purc_act_no.eq(purcactd.purc_act_no) 
				.and(purcact.purc_act_seq.eq(purcactd.purc_act_seq))));
		slsSchdDL_bldr.addLeftOuterJoin(slipd, bracket( t.dlv_slip_d_no.eq(slipd.dlv_slip_d_no) 
				.and( slipd.dlv_slip_d_seq.eq(subQuery() .select(max(S1W.dlv_slip_d_seq)) .from(S1W) .where( S1W.dlv_slip_d_no.eq(t.dlv_slip_d_no) ) ) )));
		slsSchdDL_bldr.addLeftOuterJoin(slip, bracket( slipd.dlv_slip_no.eq(slip.dlv_slip_no) 
				.and(slipd.dlv_slip_seq.eq(slip.dlv_slip_seq))));
		slsSchdDL_bldr.addLeftOuterJoin(ivd, bracket( t.iv_d_no.eq(ivd.iv_d_no)));
		slsSchdDL_bldr.addLeftOuterJoin(wrkSno, bracket(ivd.sno1.eq(wrkSno.sno1)));
		slsSchdDL_bldr.addLeftOuterJoin(cst, bracket( decode( t.iv_no, nullValue(),
				decode( t.slo_d_no, nullValue(), slip.bp_cd, slo.cst_cd ), iv.ship_rqst_id_cd ).eq(cst.bp_cd)));
		slsSchdDL_bldr.addLeftOuterJoin(acst, bracket( cst.acst_cd.eq(acst.bp_cd)));
		slsSchdDL_bldr.addLeftOuterJoin(bcst, bracket( acst.bcst_cd.eq(bcst.bp_cd)));
		dbSelect("MSBBL1320_MST_SLS_SCHD_S01", slsSchdDL, slsSchdDL_bldr);
		
		
		MCIndexKey idxKey = slsSchdDL.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
		
		for (Chk01_RsltR dtlR : list) {
			Chk01_RsltR slsSchdR = dtlR.clone();
			MCList<MST_SLS_SCHD_R> tmpL = slsSchdDL.subList(idxKey, dtlR.sls_schd_no());
			dtlR.bcst_cd(tmpL.get(0).getStringNE("bcst_cd"));
			dtlR.cred_cd(tmpL.get(0).getStringNE("ar_cred_cd"));
			dtlR.iv_no(tmpL.get(0).iv_no());
			for (MST_SLS_SCHD_R schdR : tmpL) {
				slsSchdR.cst_cd(schdR.getStringNE("cst_cd"));
				slsSchdR.trd_cur_cd(schdR.getStringNE("trd_cur_cd"));
				slsSchdR.itm_cd(schdR.getStringNE("itm_cd"));
				slsSchdR.itm_sub1(schdR.getStringNE("itm_sub1"));
				slsSchdR.itm_sub2(schdR.getStringNE("itm_sub2"));
				slsSchdR.itm_sub3(schdR.getStringNE("itm_sub3"));
				slsSchdR.wrk_no(schdR.getStringNE("wrk_no"));
				_slsSchdL.add(slsSchdR);
			}
		}
		execDbWkDelete("MSBBL1320_MSW_SLS_ACT_D03", slsactwk);

	}
	
	protected void handleSuccess(MCList<Chk01_RsltR> l) {
		dbTran().commit();

		// ここの処理は更新が正常終了した場合に実行される想定。
		// 一覧登録訂正ではチェック処理でerr_flgがオフの行のみ更新処理を実行するため、err_flgがオフの行のみ処理結果状況区分をOKに設定する。
		// なお、err_flgがオンの行の処理結果状況区分はチェックロジックの中で、共通処理として設定されているため、ここでは設定しない。
		for (Chk01_RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleEx(Exception e,
			MCList<Chk01_RsltR> l) {
		dbTran().rollback();

		// ここの処理は更新サービス内でチェックした結果例外がスローされた場合や、予期せぬ例外が起きた場合に実行される想定。
		// 更新サービス内でチェックする場合、msgOpeErrで取得できるメッセージで例外を生成し、エラーの状態を全て
		// メッセージリストとして例外の原因として設定する（addCauseMessageListを使って設定する)。
		// 例えば、マイナス在庫エラーや引当数不足の場合、処理の過程でマイナスや不足となった在庫情報を全てメッセージリストとしてた蓄え、
		// 1件でもマイナスや不足のメッセージがあれば例外とする。
		// なお、会社マスタや基準通貨が取得できない場合にも例外が発生する（ユーティリティがthrowするため）。
		// その場合は、行毎にエラーチェックしてメッセージプールに追加するわけではないので、
		// 例えば「会社マスタが取得できない」といった旨のメッセージをそのままthrowすればよい。
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		
		// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
		// causeRowは設定しない
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (Chk01_RsltR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上実績情報の訂正を行います。<br>
	 */
	public class Upd01 extends MSBBL_SlsActListReg_MC_A.Upd01 {
		MCList<Chk02_SlsActIoR> _ioL = MCList.create(Chk02_SlsActIoR.class);
		MCList<Chk02_SlsActR> _slsActL = MCList.create(Chk02_SlsActR.class);
		MCList<Chk02_SlsActDtlR> _slsActDL = MCList.create(Chk02_SlsActDtlR.class);
		
		/**
		 * 仕入実績明細と受払の紐付けＮＯリスト
		 */
		protected MCList<Chk02_PurcActIoR> _purdActIoL = null;
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccessUpd(up0());
			}
			catch (Exception e) {
				rollbackMessagePool();
				handleExUpd(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			
			// 上り電文の編集
			editUp();
			
			// チェック・補完処理呼出
			callThisChk02();

			// 更新処理でメッセージプールが追加された後に例外となった際に元に戻すための設定
			saveMessagePool();
			
			//  エラーのない行のみ更新
			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				// 仕入実績サービスの呼出
				callPurcActSvUpd02();
				
				// 輸出実績サービス（インボイス更新）の呼出
				callExActSvUpd02(notErrL);
				
				// 与信サービス呼出（受注紐づき）
				callCredSvUpd01(notErrL);
				
				// 売上実績サービス呼出
				callSlsActSvUpd01(notErrL);
				
				// 受払実績サービス呼出
				callIoActSvUpd01();
			}
		}
		
		/**
		 * 輸出実績サービス（インボイス更新）の呼出
		 * 
		 * @param dtlL
		 */
		protected void callExActSvUpd02(MCList<Chk02_RsltR> dtlL) {
			MSBEL_ExActService.ExAct_Upd02 ope = MSBEL_ExActService.crtExAct_Upd02();
			ExAct_Upd02_DtlR oUp0;
			MCList<Chk02_RsltR> ivGrL = dtlL.groupBy(
					Chk02_RsltR.$peg_no,
					Chk02_RsltR.$sls_tgt_typ,
					Chk02_RsltR.$cst_iv_flg,
					Chk02_RsltR.$sls_cststk_flg,
					Chk02_RsltR.$iv_no,
					Chk02_RsltR.$via_dlv_typ);
			for (Chk02_RsltR dtlR : ivGrL) {
				if (dtlR.cst_iv_flg()
						&& !isNullOrNullVal(dtlR.iv_no())
						&& !dtlR.sls_cststk_flg()
						&& !MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(dtlR.iv_no()))) {
						oUp0 = ExAct_Upd02_DtlR.create();
						oUp0.peg_no(dtlR.peg_no());
						oUp0.iv_no(dtlR.iv_no());
						oUp0.cmpl_flg(true);
						ope.up0().add(oUp0);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 	与信サービス呼出（受注紐付き）
		 * 
		 */
		protected void callCredSvUpd01(MCList<Chk02_RsltR> dtlL) {
			
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			Cred_Upd01_CndR up0R = null;
			MCNumber credAmtSum = null;
			MCNumber credAmt = null;
			
			MCIndexKey idxkey = dtlL.createIndex(Chk02_RsltR.$cst_cd, Chk02_RsltR.$trd_cur_cd, Chk02_RsltR.$trd_ptn_typ);
			
			getSloAndSlsSchd(dtlL);
			for (Chk02_SlsActR grpR : _slsActL.groupBy(Chk02_SlsActR.$cst_cd, Chk02_SlsActR.$trd_cur_cd, Chk02_SlsActR.$trd_ptn_typ)) {
				
				credAmtSum = MCNumber.ZERO;
				up0R = Cred_Upd01_CndR.create();
				
				up0R.cst_cd(grpR.cst_cd());
				up0R.cur_cd(grpR.trd_cur_cd());
				up0R.trd_ptn_typ(grpR.trd_ptn_typ());
				up0R.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				
				MCList<Chk02_RsltR> subDtlL = dtlL.subList(idxkey, grpR.cst_cd(), grpR.trd_cur_cd(), grpR.trd_ptn_typ());
				
				for (Chk02_RsltR dtlR : subDtlL) {
						
					Chk02_SlsActDtlR slsActDR = _slsActDL.getFirst(Chk02_SlsActDtlR.$sls_act_d_no, dtlR.sls_act_d_no());
					
					if (!isNull(slsActDR) && !isNull(dtlR.sls_schd_no())) {
						
						credAmt = calcCredAmt(dtlR.sls_schd_no(),
								getBaseUnitQty(dtlR.trd_unit_qty(), dtlR.trd_unit_cd(), slsActDR.base_unit_cd(), slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3()), 
								slsActDR.getNumberNE("bef_base_unit_qty"), dtlR.sync_flg(), dtlR.sls_tgt_typ(), dtlR.sls_act_no(), dtlR.slo_d_no(), false, false, dtlR.abort_flg());
						
						credAmtSum = credAmtSum.add(dtlR.dscnt_itm_flg() ? credAmt.negate() : credAmt);
					}
				}
				
				up0R.amt(credAmtSum);
				
				ope.up0().add(up0R);
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 	仕入実績登録サービスの呼出
		 * 
		 */
		protected void callPurcActSvUpd02() {
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService
					.crtPurc_Upd02();
			
			MCIndexKey idxkey = _purdActIoL.createIndex(Chk03_PurcActIoR.$dtl_peg_no);
			
			for (Chk02_RsltR chkR : up0()) {
				
				if (chkR.sync_flg() && !chkR.err_flg()) {
					Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
					opeHdr.peg_no(chkR.peg_no());
					ope.up1().add(opeHdr);
					
					Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
					opeDtl.peg_no(chkR.peg_no());
					ope.up2().add(opeDtl);
					
					for (Chk02_PurcActIoR purcActIoR : _purdActIoL.subList(idxkey, chkR.peg_no())) {
						
						Purc_Ins01_IoR opeIo = ope.up3().createRow();
						
						opeIo.peg_no(purcActIoR.peg_no());
						ope.up3().add(opeIo);
					}
				}
			}
			
			if (!ope.up1().isEmpty()) {
				
				ope.up0().purc_ddlv_reg_exec_flg(true);
				ope.up0().amt_calc_flg(true);
				ope.exec();
			}
		}
		
		/**
		 * 上り電文編集
		 * 
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());
			
			up0().sort(Chk02_RsltR.$iv_no, Chk02_RsltR.$sls_act_no);
			
			// インボイス単位、売上実績ＮＯ単位でのチェックＧＲＰを設定
			// エラーが発生した場合は同一チェックＧＲＰのレコード全てエラー扱いにする
			int i = 0;
			MCList<Chk02_RsltR>[] ivNoGrpL =  up0().groupList(Chk02_RsltR.$iv_no);
			for (MCList<Chk02_RsltR> ivNoL : ivNoGrpL) {
				if (!isNullOrNullVal(ivNoL.get(0).iv_no())) {
					ivNoL.setNumber(Chk02_RsltR.$chk_grp_no, i++);
				}
				else {
					MCList<Chk02_RsltR>[] slsActNoGrpL = ivNoL
							.groupList(Chk02_RsltR.$sls_act_no);
					for (MCList<Chk02_RsltR> slsActNoL : slsActNoGrpL) {
						slsActNoL.setNumber(Chk02_RsltR.$chk_grp_no, i++);
					}
				}
			}
		}
		
		/**
		 * 売上実績SV呼出
		 * 
		 * @param upL
		 */
		protected void callSlsActSvUpd01(MCList<Chk02_RsltR> upL) {
 			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();

			// 電文編集
			MCList<Chk02_RsltR> tgtHdrL = upL.groupBy(Chk02_RsltR.$sls_act_no, Chk02_RsltR.$cst_iv_flg, Chk02_RsltR.$prnt_out_flg);
			int hdrPegNo = 0;
			for (Chk02_RsltR tgtHdrR : tgtHdrL) {
				// 処理対象となる売上実績データをセットする
				// ヘッダ部
				MCList<Chk02_SlsActR> slsActL = _slsActL.subList(Chk02_SlsActR.$sls_act_no, tgtHdrR.sls_act_no());
				SlsAct_Upd01_HdrR up0 = SlsAct_Upd01_HdrR.create();
				up0 = makeSlsActHdr(slsActL.get(0), ++hdrPegNo, tgtHdrR);
				ope.up0().add(up0);
				
				// 明細部
				MCList<Chk02_SlsActDtlR> slsActDL = _slsActDL.subList(Chk02_SlsActDtlR.$sls_act_no, tgtHdrR.sls_act_no());
				MCList<SlsAct_Upd01_DtlR> up1 = MCList.create(SlsAct_Upd01_DtlR.class);
				up1 = makeSlsActDtl(up0, slsActDL, upL);
				ope.up1().addAll(up1);
				
				// 詳細部
				ope.up2().addAll(makeSlsActIo(up1));
			}
			
			if (ope.up0().size() > 0) { 
				ope.up3().indiv_prnt_flg(up1().indiv_prnt_flg());
				// 売上実績サービス呼出
				ope.exec();
				String[] dtlDestCols = new String[]{Chk02_RsltR.$hdr_peg_no, Chk02_RsltR.$sls_act_d_no, Chk02_RsltR.$sls_act_d_seq, Chk02_RsltR.$dlv_slip_d_no};
				String[] dtlSrcCols = new String[]{SlsAct_Upd01_Rslt_DtlR.$hdr_peg_no, SlsAct_Upd01_Rslt_DtlR.$sls_act_d_no, SlsAct_Upd01_Rslt_DtlR.$sls_act_d_seq, SlsAct_Upd01_Rslt_DtlR.$dlv_slip_d_no};
				copyByPegNo(upL, ope.down1(), Chk02_RsltR.$peg_no, dtlDestCols, SlsAct_Upd01_Rslt_DtlR.$dtl_peg_no, dtlSrcCols);
				
				String[] destCols = new String[]{Chk02_RsltR.$sls_act_no, Chk02_RsltR.$sls_act_seq, Chk02_RsltR.$sls_act_rev, Chk02_RsltR.$dlv_slip_no, Chk02_RsltR.$iv_no};
				String[] srcCols = new String[]{SlsAct_Upd01_RsltR.$sls_act_no, SlsAct_Upd01_RsltR.$sls_act_seq, SlsAct_Upd01_RsltR.$sls_act_rev, SlsAct_Upd01_RsltR.$dlv_slip_no, SlsAct_Upd01_RsltR.$iv_no};
				copyByPegNo(upL, ope.down0(), Chk02_RsltR.$hdr_peg_no, destCols, SlsAct_Upd01_RsltR.$hdr_peg_no, srcCols);
			}
		}
		
		/**
		 * 売上実績SV呼出用電文作成（詳細部）
		 * 
		 * @param dtlL
		 * @return
		 */
		protected MCList<SlsAct_Upd01_IoR> makeSlsActIo(MCList<SlsAct_Upd01_DtlR> dtlL) {
			MCList<SlsAct_Upd01_IoR> slsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
			
			int ioPegNo = 0;
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				// 明細に紐づく詳細を取得
				MCList<Chk02_SlsActIoR> ioL = _ioL.subList(Chk02_SlsActIoR.$sls_act_d_no, dtlR.sls_act_d_no());
				for (Chk02_SlsActIoR ioR : ioL) {
					SlsAct_Upd01_IoR slsActIoR = SlsAct_Upd01_IoR.create();
					slsActIoR.hdr_peg_no(dtlR.hdr_peg_no());
					slsActIoR.dtl_peg_no(dtlR.dtl_peg_no());
					slsActIoR.io_peg_no(++ioPegNo);
					copy(slsActIoR, ioR, createMap_SlsAct_Upd01_IoR_Chk02_SlsActIoR());
					slsActIoL.add(slsActIoR);
				}
			}
			return slsActIoL;
		}
		
		protected Map_SlsAct_Upd01_IoR_Chk02_SlsActIoR<SlsAct_Upd01_IoR,Chk02_SlsActIoR> createMap_SlsAct_Upd01_IoR_Chk02_SlsActIoR() {
			return new Map_SlsAct_Upd01_IoR_Chk02_SlsActIoR<SlsAct_Upd01_IoR, Chk02_SlsActIoR>();
		}
		
		public class Map_SlsAct_Upd01_IoR_Chk02_SlsActIoR<D extends SlsAct_Upd01_IoR, S extends Chk02_SlsActIoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, Chk02_SlsActIoR.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, Chk02_SlsActIoR.$sls_act_io_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, Chk02_SlsActIoR.$ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$iv_ship_act_d_no, Chk02_SlsActIoR.$iv_ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no, Chk02_SlsActIoR.$arr_act_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no, Chk02_SlsActIoR.$purc_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, Chk02_SlsActIoR.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, Chk02_SlsActIoR.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, Chk02_SlsActIoR.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, Chk02_SlsActIoR.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, Chk02_SlsActIoR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, Chk02_SlsActIoR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, Chk02_SlsActIoR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, Chk02_SlsActIoR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, Chk02_SlsActIoR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, Chk02_SlsActIoR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, Chk02_SlsActIoR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, Chk02_SlsActIoR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, Chk02_SlsActIoR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, Chk02_SlsActIoR.$pack_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, Chk02_SlsActIoR.$pack_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, Chk02_SlsActIoR.$sync_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, Chk02_SlsActIoR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, Chk02_SlsActIoR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, Chk02_SlsActIoR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_alloc_sts_no, Chk02_SlsActIoR.$ship_alloc_sts_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_no, Chk02_SlsActIoR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_seq, Chk02_SlsActIoR.$sls_act_d_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
		
		/**
		 * 売上実績SV呼出用電文作成（明細部）
		 * 
		 * @param hdrR
		 * @param slsActL
		 * @return
		 */
		protected MCList<SlsAct_Upd01_DtlR> makeSlsActDtl(SlsAct_Upd01_HdrR hdrR, MCList<Chk02_SlsActDtlR> slsActDL, MCList<Chk02_RsltR> upL) {
			MCList<SlsAct_Upd01_DtlR> dtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			
			int dtlPegNo = 0;
			dtlPegNo = upL.size();
			for (Chk02_SlsActDtlR slsActDR : slsActDL) {
				SlsAct_Upd01_DtlR dtlR = SlsAct_Upd01_DtlR.create();
				dtlR.hdr_peg_no(hdrR.hdr_peg_no());
				Chk02_RsltR upR = upL.getFirst(Chk02_RsltR.$sls_act_d_no, slsActDR.sls_act_d_no());
				if(isNull(upR)) {
					dtlR.dtl_peg_no(dtlPegNo++);
				}
				else {
					dtlR.dtl_peg_no(upR.peg_no());
				}
				copy(dtlR, slsActDR, createMap_SlsAct_Upd01_DtlR_Chk02_SlsActDtlR());
				dtlL.add(dtlR);
			}
			return dtlL; 
		}
		
		protected Map_SlsAct_Upd01_DtlR_Chk02_SlsActDtlR<SlsAct_Upd01_DtlR,Chk02_SlsActDtlR> createMap_SlsAct_Upd01_DtlR_Chk02_SlsActDtlR() {
			return new Map_SlsAct_Upd01_DtlR_Chk02_SlsActDtlR<SlsAct_Upd01_DtlR, Chk02_SlsActDtlR>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_Chk02_SlsActDtlR<D extends SlsAct_Upd01_DtlR, S extends Chk02_SlsActDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, Chk02_SlsActDtlR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, Chk02_SlsActDtlR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, Chk02_SlsActDtlR.$disp_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, Chk02_SlsActDtlR.$dlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg, Chk02_SlsActDtlR.$dlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, Chk02_SlsActDtlR.$dlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, Chk02_SlsActDtlR.$dlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, Chk02_SlsActDtlR.$dlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, Chk02_SlsActDtlR.$dlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, Chk02_SlsActDtlR.$dlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, Chk02_SlsActDtlR.$dlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, Chk02_SlsActDtlR.$dlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, Chk02_SlsActDtlR.$dlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, Chk02_SlsActDtlR.$dlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, Chk02_SlsActDtlR.$dlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, Chk02_SlsActDtlR.$pri_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, Chk02_SlsActDtlR.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, Chk02_SlsActDtlR.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, Chk02_SlsActDtlR.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, Chk02_SlsActDtlR.$tdlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg, Chk02_SlsActDtlR.$tdlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, Chk02_SlsActDtlR.$tdlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, Chk02_SlsActDtlR.$tdlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, Chk02_SlsActDtlR.$tdlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, Chk02_SlsActDtlR.$tdlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, Chk02_SlsActDtlR.$tdlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, Chk02_SlsActDtlR.$tdlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_tel, Chk02_SlsActDtlR.$tdlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_fax, Chk02_SlsActDtlR.$tdlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, Chk02_SlsActDtlR.$tdlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_psn, Chk02_SlsActDtlR.$tdlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, Chk02_SlsActDtlR.$itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, Chk02_SlsActDtlR.$itm_sub1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, Chk02_SlsActDtlR.$itm_sub2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, Chk02_SlsActDtlR.$itm_sub3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, Chk02_SlsActDtlR.$sno1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, Chk02_SlsActDtlR.$sno2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, Chk02_SlsActDtlR.$sno3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, Chk02_SlsActDtlR.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, Chk02_SlsActDtlR.$itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, Chk02_SlsActDtlR.$iv_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, Chk02_SlsActDtlR.$cntry_org_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, Chk02_SlsActDtlR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, Chk02_SlsActDtlR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, Chk02_SlsActDtlR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, Chk02_SlsActDtlR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, Chk02_SlsActDtlR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, Chk02_SlsActDtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, Chk02_SlsActDtlR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, Chk02_SlsActDtlR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, Chk02_SlsActDtlR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, Chk02_SlsActDtlR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, Chk02_SlsActDtlR.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_upri, Chk01_RsltR.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_amt, Chk01_RsltR.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_tax_amt, Chk01_RsltR.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_dscnt_amt, Chk01_RsltR.$base_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_upri, Chk01_RsltR.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_amt, Chk01_RsltR.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_tax_amt, Chk01_RsltR.$ptax_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_dscnt_amt, Chk01_RsltR.$ptax_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt, Chk02_SlsActDtlR.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$upri_not_tgt_flg, Chk02_SlsActDtlR.$upri_not_tgt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, Chk02_SlsActDtlR.$interim_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, Chk02_SlsActDtlR.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, Chk02_SlsActDtlR.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, Chk02_SlsActDtlR.$cost_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, Chk02_SlsActDtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times, Chk02_SlsActDtlR.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ, Chk02_SlsActDtlR.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg, Chk02_SlsActDtlR.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, Chk02_SlsActDtlR.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, Chk02_SlsActDtlR.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, Chk02_SlsActDtlR.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, Chk02_SlsActDtlR.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, Chk02_SlsActDtlR.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, Chk02_SlsActDtlR.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, Chk02_SlsActDtlR.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, Chk02_SlsActDtlR.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks, Chk02_SlsActDtlR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, Chk02_SlsActDtlR.$rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, Chk02_SlsActDtlR.$bd_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, Chk02_SlsActDtlR.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, Chk02_SlsActDtlR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, Chk02_SlsActDtlR.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_no, Chk02_SlsActDtlR.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_d_no, Chk02_SlsActDtlR.$sls_ret_schd_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, Chk02_SlsActDtlR.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, Chk02_SlsActDtlR.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, Chk02_SlsActDtlR.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, Chk02_SlsActDtlR.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, Chk02_SlsActDtlR.$qtn_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, Chk02_SlsActDtlR.$purc_ddlv_po_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, Chk02_SlsActDtlR.$purc_ddlv_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no, Chk02_SlsActDtlR.$purc_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no, Chk02_SlsActDtlR.$purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, Chk02_SlsActDtlR.$iv_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, Chk02_SlsActDtlR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, Chk02_SlsActDtlR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, Chk02_SlsActDtlR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, Chk02_SlsActDtlR.$dscnt_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_no, Chk02_SlsActDtlR.$ref_sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_seq, Chk02_SlsActDtlR.$ref_sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_no, Chk02_SlsActDtlR.$ref_sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_seq, Chk02_SlsActDtlR.$ref_sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, Chk02_SlsActDtlR.$dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_d_no, Chk02_SlsActDtlR.$ship_dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_multi_flg, Chk02_SlsActDtlR.$ship_dlv_slip_multi_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_sys_cd, Chk02_SlsActDtlR.$ext_sys_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ext_purc_act_d_no, Chk02_SlsActDtlR.$ext_purc_act_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.sls_schd_abort_flg(src.getBooleanNE("abort_flg"));
				dest.inc_tax_flg(src.getBooleanNE("inc_tax_flg"));
				dest.tax_rate(src.getNumberNE("tax_rate"));
				dest.tax_typ(src.getStringNE("tax_typ"));
				dest.dscnt_itm_flg(src.getBooleanNE("dscnt_itm_flg"));
			}
		}
		
		/**
		 * 売上実績SV呼出用電文作成（ヘッダ部）
		 * 
		 * @param slsActR
		 * @param hdrPegNo
		 * @param prntOutFlg
		 * @return
		 */
		protected SlsAct_Upd01_HdrR makeSlsActHdr(Chk02_SlsActR slsActR, int hdrPegNo, Chk02_RsltR tgtHdrR) {
			SlsAct_Upd01_HdrR hdrR = SlsAct_Upd01_HdrR.create();
			hdrR.hdr_peg_no(hdrPegNo);
			copy(hdrR, slsActR, createMap_SlsAct_Upd01_HdrR_Chk02_SlsActR());
			
			if (tgtHdrR.cst_iv_flg()) {
				hdrR.dlv_slip_prnt_flg(false);
				hdrR.slip_split_non_flg(true);
			}
			else {
				hdrR.dlv_slip_prnt_flg(tgtHdrR.prnt_out_flg());
			}
			return hdrR;
		}
		
		protected Map_SlsAct_Upd01_HdrR_Chk02_SlsActR<SlsAct_Upd01_HdrR,Chk02_SlsActR> createMap_SlsAct_Upd01_HdrR_Chk02_SlsActR() {
			return new Map_SlsAct_Upd01_HdrR_Chk02_SlsActR<SlsAct_Upd01_HdrR, Chk02_SlsActR>();
		}
		
		public class Map_SlsAct_Upd01_HdrR_Chk02_SlsActR<D extends SlsAct_Upd01_HdrR, S extends Chk02_SlsActR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, Chk02_SlsActR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, Chk02_SlsActR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev, Chk02_SlsActR.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, Chk02_SlsActR.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, Chk02_SlsActR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, Chk02_SlsActR.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, Chk02_SlsActR.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, Chk02_SlsActR.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, Chk02_SlsActR.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, Chk02_SlsActR.$sls_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_tm, Chk02_SlsActR.$ship_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_tm, Chk02_SlsActR.$dlv_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, Chk02_SlsActR.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, Chk02_SlsActR.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, Chk02_SlsActR.$ref_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_mng_no, Chk02_SlsActR.$rcpt_iv_mng_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_no, Chk02_SlsActR.$rcpt_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, Chk02_SlsActR.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, Chk02_SlsActR.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, Chk02_SlsActR.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, Chk02_SlsActR.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, Chk02_SlsActR.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, Chk02_SlsActR.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_no, Chk02_SlsActR.$lc_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_dt, Chk02_SlsActR.$lc_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_rmrks, Chk02_SlsActR.$lc_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt, Chk02_SlsActR.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt, Chk02_SlsActR.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, Chk02_SlsActR.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, Chk02_SlsActR.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, Chk02_SlsActR.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, Chk02_SlsActR.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, Chk02_SlsActR.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, Chk02_SlsActR.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd, Chk02_SlsActR.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, Chk02_SlsActR.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, Chk02_SlsActR.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd, Chk02_SlsActR.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, Chk02_SlsActR.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, Chk02_SlsActR.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks, Chk02_SlsActR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_no, Chk02_SlsActR.$ship_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, Chk02_SlsActR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_ret_schd_no, Chk02_SlsActR.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, Chk02_SlsActR.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, Chk02_SlsActR.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no, Chk02_SlsActR.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_flg, Chk02_SlsActR.$aprv_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_no, Chk02_SlsActR.$aprv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_sts_typ, Chk02_SlsActR.$aprv_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_basis_typ, Chk02_SlsActR.$sls_basis_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_tgt_dt, Chk02_SlsActR.$adjst_tgt_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_adjst_typ, Chk02_SlsActR.$sls_adjst_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_mtd_typ, Chk02_SlsActR.$adjst_mtd_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, Chk02_SlsActR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, Chk02_SlsActR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, Chk02_SlsActR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slip_form_cd, Chk02_SlsActR.$slip_form_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slip_sts_typ, Chk02_SlsActR.$slip_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_ym, Chk02_SlsActR.$ac_ym);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_dlv_slip_no, Chk02_SlsActR.$ship_dlv_slip_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.can_ac_dt(src.getDate("can_ac_dt"));
				dest.eta_dt(src.getDateNE("eta_dt"));
				if (MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(src.getStringNE("sls_tgt_typ")) ||
					MSC_SLS_TGT_TYP.isDDLV_SLS(src.getStringNE("sls_tgt_typ"))) {
					dest.ship_act_service_exec_flg(true);
				}
				dest.amt_calc_flg(false);
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			mapUpContainers(CALL_OPE);
			chk02.call();
			up0().setAll(chk02.down0());
			_ioL.setAll(chk02.down1());
			_slsActL.setAll(chk02.down2());
			_slsActDL.setAll(chk02.down3());
			initCalc01Hdr();
			_calc01HdrL.addAllByName(chk02.down4());
			_idxCalc01HdrKey = _calc01HdrL.createIndex(LIST_INDEX_KEY_NM);
			
			_purdActIoL = MCList.create(Chk02_PurcActIoR.class);
			_purdActIoL.setAll(chk02.down5());
		}
	}
	
	protected void handleSuccessUpd(MCList<Chk02_RsltR> l) {
		dbTran().commit();

		// ここの処理は更新が正常終了した場合に実行される想定。
		// 一覧登録訂正ではチェック処理でerr_flgがオフの行のみ更新処理を実行するため、err_flgがオフの行のみ処理結果状況区分をOKに設定する。
		// なお、err_flgがオンの行の処理結果状況区分はチェックロジックの中で、共通処理として設定されているため、ここでは設定しない。
		for (Chk02_RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleExUpd(Exception e,
			MCList<Chk02_RsltR> l) {
		dbTran().rollback();

		// ここの処理は更新サービス内でチェックした結果例外がスローされた場合や、予期せぬ例外が起きた場合に実行される想定。
		// 更新サービス内でチェックする場合、msgOpeErrで取得できるメッセージで例外を生成し、エラーの状態を全て
		// メッセージリストとして例外の原因として設定する（addCauseMessageListを使って設定する)。
		// 例えば、マイナス在庫エラーや引当数不足の場合、処理の過程でマイナスや不足となった在庫情報を全てメッセージリストとしてた蓄え、
		// 1件でもマイナスや不足のメッセージがあれば例外とする。
		// なお、会社マスタや基準通貨が取得できない場合にも例外が発生する（ユーティリティがthrowするため）。
		// その場合は、行毎にエラーチェックしてメッセージプールに追加するわけではないので、
		// 例えば「会社マスタが取得できない」といった旨のメッセージをそのままthrowすればよい。
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
		// causeRowは設定しない
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (Chk02_RsltR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}
	
	protected MCList<MST_SLO_D_R> _sloDL = MCList.create(MST_SLO_D_R.class);
	protected MCList<MST_SLS_SCHD_R> _schdQtyL = MCList.create(MST_SLS_SCHD_R.class);
	protected MCIndexKey _idxSloD = null;
	protected MCIndexKey _idxSlsSchd = null;

	protected void getSloDQty(MCList<Chk02_RsltR> dtlL) {
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");

		MCList<Chk02_RsltR> bindL = dtlL.groupBy(Chk02_RsltR.$slo_d_no);
		MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
		MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(t);
		sloDL_bldr.setSelect(t.slo_d_no);
		sloDL_bldr.addSelect(t.base_unit_qty.add(t2.re_ship_schd_qty).as("base_unit_qty"));
		sloDL_bldr.addInnerJoin(t2, bracket( t.slo_d_no.eq(t2.slo_d_no)));
		sloDL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
		sloDL_bldr.addConstWhereWithAnd(bracket( t.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NON.value())) 
				.and(t.sls_cststk_flg.eq(value(false)))));
		dbSelect("MSBBL1320_MST_SLO_D_S01", sloDL, sloDL_bldr, bindL, null);

		if (!isNull(sloDL)) {
			_sloDL.setAll(sloDL);
			_idxSloD = _sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
		}
	}

	protected void getSlsSchdQty(MCList<Chk02_RsltR> dtlL) {
		MCList<Chk02_RsltR> bindL = dtlL.groupBy(Chk02_RsltR.$slo_d_no);
		MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
		MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
		MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(t);
		slsSchdL_bldr.setSelect(t.base_unit_sls_qty, t.base_unit_abort_qty);
		slsSchdL_bldr.setWhere(t.slo_d_no.eq(bind("slo_d_no")));
		slsSchdL_bldr.setGroupBy(t.slo_d_no);
		slsSchdL_bldr.addGroupFunc(sum(t.base_unit_sls_qty), "BASE_UNIT_SLS_QTY");
		slsSchdL_bldr.addGroupFunc(sum(t.base_unit_abort_qty), "BASE_UNIT_ABORT_QTY");
		dbSelect("MSBBL1320_MST_SLS_SCHD_S02", slsSchdL, slsSchdL_bldr, bindL);
		
		if (!isNull(slsSchdL)) {
			_schdQtyL.setAll(slsSchdL);
			_idxSlsSchd = _schdQtyL.createIndex(MST_SLS_SCHD_R.$slo_d_no);
		}
	}

	protected void getSloAndSlsSchd(MCList<Chk02_RsltR> dtlL) {
		getSloDQty(dtlL);
		getSlsSchdQty(dtlL);
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上実績情報の取消を行います。<br>
	 */
	public class Del01 extends MSBBL_SlsActListReg_MC_A.Del01 {
		MCList<Chk03_SlsActIoR> _ioL = MCList.create(Chk03_SlsActIoR.class);
		MCList<Chk03_SlsActR> _slsActL = MCList.create(Chk03_SlsActR.class);
		MCList<Chk03_SlsActDtlR> _slsActDL = MCList.create(Chk03_SlsActDtlR.class);
		
		/**
		 * 仕入実績明細と受払の紐付けＮＯリスト
		 */
		protected MCList<Chk03_PurcActIoR> _purdActIoL = null;
		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccessDel(up0());
			}
			catch (Exception e) {
				rollbackMessagePool();
				handleExDel(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			// 上り電文の編集
			editUp();
			
			// チェック・補完処理呼出
			callThisChk03();
			
			// 更新処理でメッセージプールが追加された後に例外となった際に元に戻すための設定
			saveMessagePool();
			
			// エラーのない行のみ取消
			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 輸出実績サービス（インボイス更新）の呼出
				callExActSvUpd02(notErrL);
				
				// 与信サービス呼出（受注紐づき）
				callCredSvUpd01(notErrL);
				
				// 売上実績サービス呼出
				callSlsActSvUpd01(notErrL);
				
				// 仕入実績サービスの呼出
				callPurcActSvUpd02();
				
				// 承認提供サービスの呼出
				callAprvSvUpd03(notErrL);
				
				// 受払実績サービス呼出
				callIoActSvUpd01();
			}
		}
		
		/**
		 * 承認提供サービス呼出
		 * @param dtlL
		 */
		protected void callAprvSvUpd03(MCList<Chk03_RsltR> dtlL) {
			MBBAL_AprvService.Aprv_Upd03 ope = MBBAL_AprvService.crtAprv_Upd03();
			for (Chk03_RsltR dtlR : dtlL) {
				if ((MSC_SLS_TGT_TYP.isCSTSTK_SLS(dtlR.sls_tgt_typ()) || MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(dtlR.sls_tgt_typ())) &&
					!isNull(dtlR.aprv_no()) && !isNull(dtlR.slo_no()) && !isSloNextOper(dtlR.slo_no())) {
					Aprv_Chk02_Rslt1R up = ope.up0().createRow();
					up.aprv_no(dtlR.aprv_no());
					up.setAttributes(dtlR);
					ope.up0().add(up);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 輸出実績サービス（インボイス更新）の呼出
		 * 
		 * @param dtlL
		 */
		protected void callExActSvUpd02(MCList<Chk03_RsltR> dtlL) {
			MSBEL_ExActService.ExAct_Upd02 ope = MSBEL_ExActService.crtExAct_Upd02();
			ExAct_Upd02_DtlR oUp0;
			MCList<Chk03_RsltR> ivGrL = dtlL.groupBy(
					Chk03_RsltR.$peg_no,
					Chk03_RsltR.$sls_tgt_typ,
					Chk03_RsltR.$cst_iv_flg,
					Chk03_RsltR.$sls_cststk_flg,
					Chk03_RsltR.$iv_no,
					Chk03_RsltR.$via_dlv_typ);
			for (Chk03_RsltR dtlR : ivGrL) {
				MCList<Chk03_SlsActR> tmpActL = _slsActL.subList(MST_SLS_ACT_R.$iv_no, dtlR.iv_no());
				dtlR.sls_tgt_typ(tmpActL.get(0).getStringNE("sls_tgt_typ"));
				if (dtlR.cst_iv_flg()
						&& !isNullOrNullVal(dtlR.iv_no())
						&& !dtlR.sls_cststk_flg()
						&& !MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(dtlR.iv_no()))) {
						oUp0 = ExAct_Upd02_DtlR.create();
						oUp0.peg_no(dtlR.peg_no());
						oUp0.iv_no(dtlR.iv_no());
						oUp0.cmpl_flg(false);
						ope.up0().add(oUp0);
				}
			}
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 	与信サービス呼出（受注紐付き）
		 * 
		 */
		protected void callCredSvUpd01(MCList<Chk03_RsltR> dtlL) {
			
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			Cred_Upd01_CndR up0R = null;
			MCNumber credAmtSum = null;
			MCNumber credAmt = null;
			
			MCIndexKey idxkey = dtlL.createIndex(Chk03_RsltR.$cst_cd, Chk03_RsltR.$trd_cur_cd, Chk03_RsltR.$trd_ptn_typ);
			
			MCList<Chk02_RsltR> chk02L = MCList.create(Chk02_RsltR.class);
			for (Chk03_RsltR dtlR : dtlL) {
				Chk02_RsltR chk02R = Chk02_RsltR.create();
				chk02R.slo_d_no(dtlR.slo_d_no());
				chk02L.add(chk02R);
			}
			getSloAndSlsSchd(chk02L);
			
			String befSloDNo = null;
			boolean ajstFlg = false;
			for (Chk03_SlsActR grpR : _slsActL.groupBy(Chk03_SlsActR.$cst_cd, Chk03_SlsActR.$trd_cur_cd, Chk03_SlsActR.$trd_ptn_typ)) {
				
				credAmtSum = MCNumber.ZERO;
				up0R = Cred_Upd01_CndR.create();
				
				up0R.cst_cd(grpR.cst_cd());
				up0R.cur_cd(grpR.trd_cur_cd());
				up0R.trd_ptn_typ(grpR.trd_ptn_typ());
				up0R.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				
				MCList<Chk03_RsltR> subDtlL = dtlL.subList(idxkey, grpR.cst_cd(), grpR.trd_cur_cd(), grpR.trd_ptn_typ());
				
				for (Chk03_RsltR dtlR : subDtlL) {
						
					Chk03_SlsActDtlR slsActDR = _slsActDL.getFirst(Chk03_SlsActDtlR.$sls_act_d_no, dtlR.sls_act_d_no());
					
					if (!isNull(slsActDR) && !isNull(dtlR.sls_schd_no())) {
						
						if (isNull(befSloDNo)) {
							befSloDNo = dtlR.slo_d_no();
							ajstFlg = true;
						}
						else {
							if (isSame(befSloDNo, dtlR.slo_d_no())) {
								ajstFlg = false;
							}
							else {
								befSloDNo = dtlR.slo_d_no();
								ajstFlg = true;
							}
						}
						credAmt = calcCredAmt(dtlR.sls_schd_no(), MCNumber.ZERO, slsActDR.base_unit_qty(),
								dtlR.sync_flg(), dtlR.sls_tgt_typ(), dtlR.sls_act_no(), dtlR.slo_d_no(), true, ajstFlg, false);
						
						credAmtSum = credAmtSum.add(dtlR.dscnt_itm_flg() ? credAmt.negate() : credAmt);
					}
				}
				
				up0R.amt(credAmtSum);
				
				ope.up0().add(up0R);
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
				
		/**
		 * 	仕入実績登録サービスの呼出
		 * 
		 */
		protected void callPurcActSvUpd02() {
			MSBDL_PurcActRegService.Purc_Upd02 ope = MSBDL_PurcActRegService
					.crtPurc_Upd02();
			
			MCIndexKey idxkey = _purdActIoL.createIndex(Chk03_PurcActIoR.$dtl_peg_no);
			
			for (Chk03_RsltR chkR : up0()) {
				
				if (chkR.sync_flg() && !chkR.err_flg()) {
					Purc_Ins01_HdrR opeHdr = ope.up1().createRow();
					opeHdr.peg_no(chkR.peg_no());
					ope.up1().add(opeHdr);
					
					Purc_Ins01_DtlR opeDtl = ope.up2().createRow();
					opeDtl.peg_no(chkR.peg_no());
					ope.up2().add(opeDtl);
					
					for (Chk03_PurcActIoR purcActIoR : _purdActIoL.subList(idxkey, chkR.peg_no())) {
						
						Purc_Ins01_IoR opeIo = ope.up3().createRow();
						
						opeIo.peg_no(purcActIoR.peg_no());
						ope.up3().add(opeIo);
					}
				}
			}
			
			if (!ope.up1().isEmpty()) {
				ope.up0().purc_ddlv_reg_exec_flg(true);
				ope.exec();
			}
		}
		
		/**
		 * 上り電文編集
		 * 
		 */
		protected void editUp() {
			setPegNo(Chk03_RsltR.$peg_no, up0());
			
			up0().sort(Chk03_RsltR.$iv_no, Chk03_RsltR.$sls_act_no);
			
			// インボイス単位、売上実績ＮＯ単位でのチェックＧＲＰを設定
			// エラーが発生した場合は同一チェックＧＲＰのレコード全てエラー扱いにする
			int i = 0;
			MCList<Chk03_RsltR>[] ivNoGrpL =  up0().groupList(Chk03_RsltR.$iv_no);
			for (MCList<Chk03_RsltR> ivNoL : ivNoGrpL) {
				if (!isNullOrNullVal(ivNoL.get(0).iv_no())) {
					ivNoL.setNumber(Chk03_RsltR.$chk_grp_no, i++);
				}
				else {
					MCList<Chk03_RsltR>[] slsActNoGrpL = ivNoL
							.groupList(Chk03_RsltR.$sls_act_no);
					for (MCList<Chk03_RsltR> slsActNoL : slsActNoGrpL) {
						slsActNoL.setNumber(Chk03_RsltR.$chk_grp_no, i++);
					}
				}
			}
		}
		
		/**
		 * 売上実績SV呼出
		 * 
		 * @param upL
		 */
		protected void callSlsActSvUpd01(MCList<Chk03_RsltR> upL) {
			MSBBL_SlsActService.SlsAct_Upd01 ope = MSBBL_SlsActService.crtSlsAct_Upd01();
			// 電文編集
			MCList<Chk03_RsltR> tgtHdrL = upL.groupBy(Chk03_RsltR.$sls_act_no, Chk03_RsltR.$cst_iv_flg, Chk03_RsltR.$prnt_out_flg);
			int hdrPegNo = 0;
			for (Chk03_RsltR tgtHdrR : tgtHdrL) {
				// 処理対象となる売上実績データをセットする
				// ヘッダ部
				MCList<Chk03_SlsActR> slsActL = _slsActL.subList(Chk03_SlsActR.$sls_act_no, tgtHdrR.sls_act_no());
				SlsAct_Upd01_HdrR up0 = SlsAct_Upd01_HdrR.create();
				up0 = makeSlsActHdr(slsActL.get(0), ++hdrPegNo, tgtHdrR);
				
				// 明細部
				MCList<Chk03_SlsActDtlR> slsActDL = _slsActDL.subList(Chk03_SlsActDtlR.$sls_act_no, tgtHdrR.sls_act_no());
				MCList<SlsAct_Upd01_DtlR> up1 = MCList.create(SlsAct_Upd01_DtlR.class);
				up1 = makeSlsActDtl(up0, slsActDL);
				if (MSC_SLS_TGT_TYP.isDDLV_SLS(slsActL.get(0).sls_tgt_typ()) && !isNullOrNullVal(slsActL.get(0).iv_no())) {
					if (isNull(slsActDL.get(0).purc_ddlv_po_no()) ) {
						up0.ship_act_service_exec_flg(false);
					}
				}
				ope.up0().add(up0);
				ope.up1().addAll(up1);
				
				// 詳細部
				ope.up2().addAll(makeSlsActIo(up1));
			}
			
			if (ope.up0().size() > 0) {
				ope.up3().indiv_prnt_flg(up1().indiv_prnt_flg());
				// 売上実績サービス呼出
				ope.exec();
			}
		}
		
		/**
		 * 売上実績SV呼出用電文作成（詳細部）
		 * 
		 * @param dtlL
		 * @return
		 */
		protected MCList<SlsAct_Upd01_IoR> makeSlsActIo(MCList<SlsAct_Upd01_DtlR> dtlL) {
			MCList<SlsAct_Upd01_IoR> slsActIoL = MCList.create(SlsAct_Upd01_IoR.class);
			
			int ioPegNo = 0;
			for (SlsAct_Upd01_DtlR dtlR : dtlL) {
				// 明細に紐づく詳細を取得
				MCList<Chk03_SlsActIoR> ioL = _ioL.subList(Chk03_SlsActIoR.$sls_act_d_no, dtlR.sls_act_d_no());
				for (Chk03_SlsActIoR ioR : ioL) {
					SlsAct_Upd01_IoR slsActIoR = SlsAct_Upd01_IoR.create();
					slsActIoR.hdr_peg_no(dtlR.hdr_peg_no());
					slsActIoR.dtl_peg_no(dtlR.dtl_peg_no());
					slsActIoR.io_peg_no(++ioPegNo);
					slsActIoR.data_crud_typ(ioR.data_crud_typ());
					copy(slsActIoR, ioR, createMap_SlsAct_Upd01_IoR_Chk03_SlsActIoR());
					slsActIoL.add(slsActIoR);
				}
			}
			return slsActIoL;
		}
		
		protected Map_SlsAct_Upd01_IoR_Chk03_SlsActIoR<SlsAct_Upd01_IoR,Chk03_SlsActIoR> createMap_SlsAct_Upd01_IoR_Chk03_SlsActIoR() {
			return new Map_SlsAct_Upd01_IoR_Chk03_SlsActIoR<SlsAct_Upd01_IoR, Chk03_SlsActIoR>();
		}
		
		public class Map_SlsAct_Upd01_IoR_Chk03_SlsActIoR<D extends SlsAct_Upd01_IoR, S extends Chk03_SlsActIoR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_no, Chk03_SlsActIoR.$sls_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_io_seq, Chk03_SlsActIoR.$sls_act_io_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_act_d_no, Chk03_SlsActIoR.$ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$iv_ship_act_d_no, Chk03_SlsActIoR.$iv_ship_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$arr_act_no, Chk03_SlsActIoR.$arr_act_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$purc_act_io_no, Chk03_SlsActIoR.$purc_act_io_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno1, Chk03_SlsActIoR.$sno1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno2, Chk03_SlsActIoR.$sno2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno3, Chk03_SlsActIoR.$sno3);
				addColumnPathMap(SlsAct_Upd01_IoR.$sno4, Chk03_SlsActIoR.$sno4);
				addColumnPathMap(SlsAct_Upd01_IoR.$gd_cd, Chk03_SlsActIoR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$loc_cd, Chk03_SlsActIoR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$str_ln_cd, Chk03_SlsActIoR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$lot_no, Chk03_SlsActIoR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sublot_no, Chk03_SlsActIoR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_cd, Chk03_SlsActIoR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$trd_unit_qty, Chk03_SlsActIoR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_cd, Chk03_SlsActIoR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$base_unit_qty, Chk03_SlsActIoR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_cd, Chk03_SlsActIoR.$pack_unit_cd);
				addColumnPathMap(SlsAct_Upd01_IoR.$pack_unit_qty, Chk03_SlsActIoR.$pack_unit_qty);
				addColumnPathMap(SlsAct_Upd01_IoR.$sync_flg, Chk03_SlsActIoR.$sync_flg);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char1, Chk03_SlsActIoR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char2, Chk03_SlsActIoR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_IoR.$sub_char3, Chk03_SlsActIoR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_IoR.$ship_alloc_sts_no, Chk03_SlsActIoR.$ship_alloc_sts_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_no, Chk03_SlsActIoR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_IoR.$sls_act_d_seq, Chk03_SlsActIoR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_IoR.$data_crud_typ, Chk03_SlsActIoR.$data_crud_typ);
			}
		}
		
		/**
		 * 売上実績SV呼出用電文作成（明細部）
		 * 
		 * @param hdrR
		 * @param slsActDL
		 * @return
		 */
		protected MCList<SlsAct_Upd01_DtlR> makeSlsActDtl(SlsAct_Upd01_HdrR hdrR, MCList<Chk03_SlsActDtlR> slsActDL) {
			MCList<SlsAct_Upd01_DtlR> dtlL = MCList.create(SlsAct_Upd01_DtlR.class);
			
			int dtlPegNo = 0;
			for (Chk03_SlsActDtlR slsActDR : slsActDL) {
				SlsAct_Upd01_DtlR dtlR = SlsAct_Upd01_DtlR.create();
				dtlR.hdr_peg_no(hdrR.hdr_peg_no());
				dtlR.dtl_peg_no(++dtlPegNo);
				if (MAC_DATA_CRUD_TYP.isUPD(slsActDR.data_crud_typ())) {
					copy(dtlR, slsActDR, createMap_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR());
				}
				else {
					copy(dtlR, slsActDR, createMap_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR_DEL());
				}
				dtlL.add(dtlR);
			}
			return dtlL; 
		}
		
		protected Map_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR_DEL<SlsAct_Upd01_DtlR,Chk03_SlsActDtlR> createMap_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR_DEL() {
			return new Map_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR_DEL<SlsAct_Upd01_DtlR, Chk03_SlsActDtlR>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR_DEL<D extends SlsAct_Upd01_DtlR, S extends Chk03_SlsActDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, Chk03_SlsActDtlR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, Chk03_SlsActDtlR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, Chk03_SlsActDtlR.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, Chk03_SlsActDtlR.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$data_crud_typ, Chk03_SlsActDtlR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, Chk03_SlsActDtlR.$purc_ddlv_po_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, Chk03_SlsActDtlR.$iv_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_schd_abort_flg(src.abort_flg());
			}
		}
		
		protected Map_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR<SlsAct_Upd01_DtlR,Chk03_SlsActDtlR> createMap_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR() {
			return new Map_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR<SlsAct_Upd01_DtlR, Chk03_SlsActDtlR>();
		}
		
		public class Map_SlsAct_Upd01_DtlR_Chk03_SlsActDtlR<D extends SlsAct_Upd01_DtlR, S extends Chk03_SlsActDtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_DtlR.$data_crud_typ, Chk03_SlsActDtlR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_no, Chk03_SlsActDtlR.$sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_d_seq, Chk03_SlsActDtlR.$sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$disp_seq, Chk03_SlsActDtlR.$disp_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cd, Chk03_SlsActDtlR.$dlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_sundry_flg, Chk03_SlsActDtlR.$dlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_nm, Chk03_SlsActDtlR.$dlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_zip_cd, Chk03_SlsActDtlR.$dlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr1, Chk03_SlsActDtlR.$dlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr2, Chk03_SlsActDtlR.$dlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr3, Chk03_SlsActDtlR.$dlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_addr4, Chk03_SlsActDtlR.$dlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_dpt, Chk03_SlsActDtlR.$dlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_cntct_psn, Chk03_SlsActDtlR.$dlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_tel, Chk03_SlsActDtlR.$dlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_fax, Chk03_SlsActDtlR.$dlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$pri_prnt_flg, Chk03_SlsActDtlR.$pri_prnt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd1, Chk03_SlsActDtlR.$dest_cd1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd2, Chk03_SlsActDtlR.$dest_cd2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dest_cd3, Chk03_SlsActDtlR.$dest_cd3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cd, Chk03_SlsActDtlR.$tdlv_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_sundry_flg, Chk03_SlsActDtlR.$tdlv_sundry_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_nm, Chk03_SlsActDtlR.$tdlv_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_zip_cd, Chk03_SlsActDtlR.$tdlv_zip_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr1, Chk03_SlsActDtlR.$tdlv_addr1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr2, Chk03_SlsActDtlR.$tdlv_addr2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr3, Chk03_SlsActDtlR.$tdlv_addr3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_addr4, Chk03_SlsActDtlR.$tdlv_addr4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_tel, Chk03_SlsActDtlR.$tdlv_tel);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_fax, Chk03_SlsActDtlR.$tdlv_fax);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_dpt, Chk03_SlsActDtlR.$tdlv_cntct_dpt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tdlv_cntct_psn, Chk03_SlsActDtlR.$tdlv_cntct_psn);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_cd, Chk03_SlsActDtlR.$itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub1, Chk03_SlsActDtlR.$itm_sub1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub2, Chk03_SlsActDtlR.$itm_sub2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_sub3, Chk03_SlsActDtlR.$itm_sub3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1, Chk03_SlsActDtlR.$sno1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2, Chk03_SlsActDtlR.$sno2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3, Chk03_SlsActDtlR.$sno3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4, Chk03_SlsActDtlR.$sno4);
				addColumnPathMap(SlsAct_Upd01_DtlR.$itm_nm, Chk03_SlsActDtlR.$itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_itm_nm, Chk03_SlsActDtlR.$iv_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cntry_org_cd, Chk03_SlsActDtlR.$cntry_org_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$loc_cd, Chk03_SlsActDtlR.$loc_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$str_ln_cd, Chk03_SlsActDtlR.$str_ln_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$lot_no, Chk03_SlsActDtlR.$lot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sublot_no, Chk03_SlsActDtlR.$sublot_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$gd_cd, Chk03_SlsActDtlR.$gd_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_cd, Chk03_SlsActDtlR.$trd_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_unit_qty, Chk03_SlsActDtlR.$trd_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_cd, Chk03_SlsActDtlR.$base_unit_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_unit_qty, Chk03_SlsActDtlR.$base_unit_qty);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_upri, Chk03_SlsActDtlR.$trd_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_amt, Chk03_SlsActDtlR.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$upri_not_tgt_flg, Chk03_SlsActDtlR.$upri_not_tgt_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$interim_flg, Chk03_SlsActDtlR.$interim_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_cd, Chk03_SlsActDtlR.$tax_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_tax_amt, Chk03_SlsActDtlR.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_upri, Chk03_SlsActDtlR.$cost_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cost_amt, Chk03_SlsActDtlR.$cost_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_cur_dscnt_amt, Chk03_SlsActDtlR.$trd_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bill_crryovr_times, Chk03_SlsActDtlR.$bill_crryovr_times);
				addColumnPathMap(SlsAct_Upd01_DtlR.$stk_mng_typ, Chk03_SlsActDtlR.$stk_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sundry_itm_flg, Chk03_SlsActDtlR.$sundry_itm_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno1_mng_typ, Chk03_SlsActDtlR.$sno1_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno2_mng_typ, Chk03_SlsActDtlR.$sno2_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno3_mng_typ, Chk03_SlsActDtlR.$sno3_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sno4_mng_typ, Chk03_SlsActDtlR.$sno4_mng_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_po_d_no, Chk03_SlsActDtlR.$cst_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_cd, Chk03_SlsActDtlR.$cst_itm_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$cst_itm_nm, Chk03_SlsActDtlR.$cst_itm_nm);
				addColumnPathMap(SlsAct_Upd01_DtlR.$trd_d_rmrks, Chk03_SlsActDtlR.$trd_d_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$intr_rmrks, Chk03_SlsActDtlR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_DtlR.$rsn_cd, Chk03_SlsActDtlR.$rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$bd_dpt_cd, Chk03_SlsActDtlR.$bd_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_rate, Chk03_SlsActDtlR.$wtax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wtax_amt, Chk03_SlsActDtlR.$wtax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_no, Chk03_SlsActDtlR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$slo_d_no, Chk03_SlsActDtlR.$slo_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_no, Chk03_SlsActDtlR.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_ret_schd_d_no, Chk03_SlsActDtlR.$sls_ret_schd_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_schd_no, Chk03_SlsActDtlR.$ship_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_schd_no, Chk03_SlsActDtlR.$sls_schd_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_no, Chk03_SlsActDtlR.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_rev, Chk03_SlsActDtlR.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_DtlR.$qtn_d_no, Chk03_SlsActDtlR.$qtn_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_no, Chk03_SlsActDtlR.$purc_ddlv_po_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_ddlv_po_d_no, Chk03_SlsActDtlR.$purc_ddlv_po_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_no, Chk03_SlsActDtlR.$purc_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$purc_act_d_no, Chk03_SlsActDtlR.$purc_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$iv_d_no, Chk03_SlsActDtlR.$iv_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char1, Chk03_SlsActDtlR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char2, Chk03_SlsActDtlR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sub_char3, Chk03_SlsActDtlR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_rsn_cd, Chk03_SlsActDtlR.$dscnt_rsn_cd);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_no, Chk03_SlsActDtlR.$ref_sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_seq, Chk03_SlsActDtlR.$ref_sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_no, Chk03_SlsActDtlR.$ref_sls_act_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ref_sls_act_d_seq, Chk03_SlsActDtlR.$ref_sls_act_d_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dlv_slip_d_no, Chk03_SlsActDtlR.$dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_no, Chk03_SlsActDtlR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$sls_act_seq, Chk03_SlsActDtlR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_upri, Chk03_SlsActDtlR.$base_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_amt, Chk03_SlsActDtlR.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_tax_amt, Chk03_SlsActDtlR.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_upri, Chk03_SlsActDtlR.$ptax_cur_upri);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_amt, Chk03_SlsActDtlR.$ptax_cur_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_tax_amt, Chk03_SlsActDtlR.$ptax_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$base_cur_dscnt_amt, Chk03_SlsActDtlR.$base_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ptax_cur_dscnt_amt, Chk03_SlsActDtlR.$ptax_cur_dscnt_amt);
				addColumnPathMap(SlsAct_Upd01_DtlR.$wrk_no, Chk03_SlsActDtlR.$wrk_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ar_typ, Chk03_SlsActDtlR.$ar_typ);
				
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_rate, Chk03_SlsActDtlR.$tax_rate);
				addColumnPathMap(SlsAct_Upd01_DtlR.$tax_typ, Chk03_SlsActDtlR.$tax_typ);
				addColumnPathMap(SlsAct_Upd01_DtlR.$inc_tax_flg, Chk03_SlsActDtlR.$inc_tax_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$dscnt_itm_flg, Chk03_SlsActDtlR.$inc_tax_flg);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_d_no, Chk03_SlsActDtlR.$ship_dlv_slip_d_no);
				addColumnPathMap(SlsAct_Upd01_DtlR.$ship_dlv_slip_multi_flg, Chk03_SlsActDtlR.$ship_dlv_slip_multi_flg);
				
			}
		}
		
		/**
		 * 売上実績SV呼出用電文作成（ヘッダ部）
		 * 
		 * @param slsActR
		 * @param hdrPegNo
		 * @param prntOutFlg
		 * @return
		 */
		protected SlsAct_Upd01_HdrR makeSlsActHdr(Chk03_SlsActR slsActR, int hdrPegNo, Chk03_RsltR tgtHdrR) {
			SlsAct_Upd01_HdrR hdrR = SlsAct_Upd01_HdrR.create();
			hdrR.hdr_peg_no(hdrPegNo);
			
			// 更新処理
			if (MAC_DATA_CRUD_TYP.isUPD(slsActR.data_crud_typ())) {
				copy(hdrR, slsActR, createMap_SlsAct_Upd01_HdrR_Chk03_SlsActR());
			}
			// 取消処理
			else {
				copy(hdrR, slsActR, createMap_SlsAct_Upd01_HdrR_Chk03_SlsActR_DEL());
			}
			
			if (tgtHdrR.cst_iv_flg()) {
				hdrR.dlv_slip_prnt_flg(false);
				hdrR.slip_split_non_flg(true);
			}
			else {
				hdrR.dlv_slip_prnt_flg(tgtHdrR.prnt_out_flg());
			}
			
			return hdrR;
		}
		
		protected Map_SlsAct_Upd01_HdrR_Chk03_SlsActR_DEL<SlsAct_Upd01_HdrR,Chk03_SlsActR> createMap_SlsAct_Upd01_HdrR_Chk03_SlsActR_DEL() {
			return new Map_SlsAct_Upd01_HdrR_Chk03_SlsActR_DEL<SlsAct_Upd01_HdrR, Chk03_SlsActR>();
		}
		
		public class Map_SlsAct_Upd01_HdrR_Chk03_SlsActR_DEL<D extends SlsAct_Upd01_HdrR, S extends Chk03_SlsActR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, Chk03_SlsActR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, Chk03_SlsActR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev, Chk03_SlsActR.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, Chk03_SlsActR.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, Chk03_SlsActR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, Chk03_SlsActR.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no, Chk03_SlsActR.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$data_crud_typ, Chk03_SlsActR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt, Chk03_SlsActR.$can_ac_dt);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(src.sls_tgt_typ()) ||
					MSC_SLS_TGT_TYP.isDDLV_SLS(src.sls_tgt_typ())) {
					dest.ship_act_service_exec_flg(true);
				}
				dest.amt_calc_flg(false);
			}
		}
		
		protected Map_SlsAct_Upd01_HdrR_Chk03_SlsActR<SlsAct_Upd01_HdrR,Chk03_SlsActR> createMap_SlsAct_Upd01_HdrR_Chk03_SlsActR() {
			return new Map_SlsAct_Upd01_HdrR_Chk03_SlsActR<SlsAct_Upd01_HdrR, Chk03_SlsActR>();
		}
		
		public class Map_SlsAct_Upd01_HdrR_Chk03_SlsActR<D extends SlsAct_Upd01_HdrR, S extends Chk03_SlsActR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_no, Chk03_SlsActR.$sls_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_seq, Chk03_SlsActR.$sls_act_seq);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_act_rev, Chk03_SlsActR.$sls_act_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cd, Chk03_SlsActR.$trd_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_ptn_typ, Chk03_SlsActR.$trd_ptn_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_dt, Chk03_SlsActR.$ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_usr_cd, Chk03_SlsActR.$sls_usr_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dpt_cd, Chk03_SlsActR.$sls_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$wg_cd, Chk03_SlsActR.$wg_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_dt, Chk03_SlsActR.$sls_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_tm, Chk03_SlsActR.$ship_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_tm, Chk03_SlsActR.$dlv_tm);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_cd, Chk03_SlsActR.$cst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$iv_no, Chk03_SlsActR.$iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ref_iv_no, Chk03_SlsActR.$ref_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_mng_no, Chk03_SlsActR.$rcpt_iv_mng_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcpt_iv_no, Chk03_SlsActR.$rcpt_iv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd1, Chk03_SlsActR.$tterm_cd1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks1, Chk03_SlsActR.$tterm_rmrks1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd2, Chk03_SlsActR.$tterm_cd2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks2, Chk03_SlsActR.$tterm_rmrks2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_cd3, Chk03_SlsActR.$tterm_cd3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$tterm_rmrks3, Chk03_SlsActR.$tterm_rmrks3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_no, Chk03_SlsActR.$lc_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_dt, Chk03_SlsActR.$lc_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$lc_rmrks, Chk03_SlsActR.$lc_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$rcv_schd_dt, Chk03_SlsActR.$rcv_schd_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bill_basis_dt, Chk03_SlsActR.$bill_basis_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cred_cd, Chk03_SlsActR.$cred_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$bcst_cd, Chk03_SlsActR.$bcst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$acst_cd, Chk03_SlsActR.$acst_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ar_dpt_cd, Chk03_SlsActR.$ar_dpt_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$cst_po_no, Chk03_SlsActR.$cst_po_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_cd, Chk03_SlsActR.$trd_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_cd, Chk03_SlsActR.$base_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate_cd, Chk03_SlsActR.$xrate_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$xrate, Chk03_SlsActR.$xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_cur_cd, Chk03_SlsActR.$ptax_cur_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ptax_xrate, Chk03_SlsActR.$ptax_xrate);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_rmrks, Chk03_SlsActR.$trd_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$intr_rmrks, Chk03_SlsActR.$intr_rmrks);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_act_no, Chk03_SlsActR.$ship_act_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slo_no, Chk03_SlsActR.$slo_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_ret_schd_no, Chk03_SlsActR.$sls_ret_schd_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_no, Chk03_SlsActR.$qtn_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$qtn_rev, Chk03_SlsActR.$qtn_rev);
				addColumnPathMap(SlsAct_Upd01_HdrR.$dlv_slip_no, Chk03_SlsActR.$dlv_slip_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_flg, Chk03_SlsActR.$aprv_flg);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_no, Chk03_SlsActR.$aprv_no);
				addColumnPathMap(SlsAct_Upd01_HdrR.$aprv_sts_typ, Chk03_SlsActR.$aprv_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_basis_typ, Chk03_SlsActR.$sls_basis_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_tgt_dt, Chk03_SlsActR.$adjst_tgt_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sls_adjst_typ, Chk03_SlsActR.$sls_adjst_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$adjst_mtd_typ, Chk03_SlsActR.$adjst_mtd_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char1, Chk03_SlsActR.$sub_char1);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char2, Chk03_SlsActR.$sub_char2);
				addColumnPathMap(SlsAct_Upd01_HdrR.$sub_char3, Chk03_SlsActR.$sub_char3);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slip_form_cd, Chk03_SlsActR.$slip_form_cd);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_amt, Chk03_SlsActR.$trd_cur_amt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$trd_cur_tax_amt, Chk03_SlsActR.$trd_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_amt, Chk03_SlsActR.$base_cur_amt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$base_cur_tax_amt, Chk03_SlsActR.$base_cur_tax_amt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$slip_sts_typ, Chk03_SlsActR.$slip_sts_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ac_ym, Chk03_SlsActR.$ac_ym);
				addColumnPathMap(SlsAct_Upd01_HdrR.$data_crud_typ, Chk03_SlsActR.$data_crud_typ);
				addColumnPathMap(SlsAct_Upd01_HdrR.$eta_dt, Chk03_SlsActR.$eta_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$can_ac_dt, Chk03_SlsActR.$can_ac_dt);
				addColumnPathMap(SlsAct_Upd01_HdrR.$ship_dlv_slip_no, Chk03_SlsActR.$ship_dlv_slip_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(src.sls_tgt_typ()) ||
					MSC_SLS_TGT_TYP.isDDLV_SLS(src.sls_tgt_typ())) {
					dest.ship_act_service_exec_flg(true);
				}
				dest.amt_calc_flg(false);
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			mapUpContainers(CALL_OPE);
			chk03.call();
			up0().setAll(chk03.down0());
			_ioL.setAll(chk03.down1());
			_slsActL.setAll(chk03.down2());
			_slsActDL.setAll(chk03.down3());
			initCalc01Hdr();
			_calc01HdrL.addAllByName(chk03.down4());
			_idxCalc01HdrKey = _calc01HdrL.createIndex(LIST_INDEX_KEY_NM);
			
			_purdActIoL = MCList.create(Chk03_PurcActIoR.class);
			_purdActIoL.setAll(chk03.down5());
		}
	}
	
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 取消前チェックを行います。<br>
	 */
	public class Chk03 extends MSBBL_SlsActListReg_MC_A.Chk03 {
		MCList<MST_SLS_ACT_R> _slsActL = MCList.create(MST_SLS_ACT_R.class);
		MCList<MST_SLS_ACT_D_R> _slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
		MCList<MST_SLS_ACT_IO_R> _slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
		
		/**
		 * 仕入実績明細と受払の紐付けＮＯリスト
		 */
		protected MCList<Chk03_PurcActIoR> _purcActIoL = MCList.create(Chk03_PurcActIoR.class);
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			setDown();
		}
		
		/**
		 * 上り電文と取得した売上実績のデータより取消・更新データを作成する
		 * 全明細が取消となる場合は、ヘッダ単位での取消となる。
		 * 一部明細の取消となる場合は、行削除の更新となる。
		 * 
		 */
		protected void mrgData() {
			String befSls_act_no = null;
			// 更新情報のマージ
			for (MST_SLS_ACT_R slsActR : _slsActL) {
				MCList<Chk03_RsltR> tgtL = up0().subList(Chk03_RsltR.$sls_act_no, slsActR.sls_act_no());
				slsActR.addDateColumn("can_ac_dt", tgtL.get(0).can_ac_dt());
				setWgInfo(slsActR);
				setIvInfo(slsActR);
				setBpInfo(slsActR);
				
				MAM_BP_R cst = getBpCache(slsActR.cst_cd());
				
				if (!isNull(cst)) {
					tgtL.setBoolean(Chk03_RsltR.$cst_iv_flg, cst.cst_iv_flg());
				}

				// ヘッダに紐づく明細情報
				MCList<MST_SLS_ACT_D_R> slsActDL = _slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_no, slsActR.sls_act_no());
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					// ヘッダ変更単位で売上対象区分をセット
					if (isNull(befSls_act_no)) {
						befSls_act_no = slsActR.sls_act_no();
						setSlsTgtTyp(slsActR, slsActDR);
					}
					else if (!isSame(slsActR.sls_act_no(), befSls_act_no)) {
						setSlsTgtTyp(slsActR, slsActDR);
					}
					else {
						befSls_act_no = slsActR.sls_act_no();
					}
					
					slsActDR.addStringColumn("data_crud_typ");
					if (MSC_SLS_TGT_TYP.isDDLV_SLS(slsActR.getStringNE("sls_tgt_typ"))) {
						if (!isNull(slsActDR.slo_d_no())) {
							slsActDR.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value());
						}
					}
					else {
						slsActDR.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value());
					}
					
					MCList<MST_SLS_ACT_IO_R> slsIoL = _slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, slsActDR.sls_act_d_no());
					slsIoL.addStringColumn("data_crud_typ");
					if (MAC_DATA_CRUD_TYP.isDEL(slsActDR.getStringNE("data_crud_typ"))) {
						slsIoL.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						slsIoL.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value());
					}
					
					// 取消対象の明細の場合は詳細も取消 
					for (Chk03_RsltR tgtDR : tgtL) {
						if (isSame(slsActDR.sls_act_d_no(), tgtDR.sls_act_d_no())) {
							slsActDR.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
							slsIoL.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
							break;
						}
					}
				}
				// 仕入直送の場合、処理対象の全明細が削除となったら紐付きなしの行も削除対象とする
				if (MSC_SLS_TGT_TYP.isDDLV_SLS(slsActR.getStringNE("sls_tgt_typ"))) {
					if (slsActDL.subList("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value()).size() == 0) {
						for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
							if (isNull(slsActDR.getStringNE("data_crud_typ"))) {
								slsActDL.setValueNE("data_crud_typ",  MAC_DATA_CRUD_TYP.DEL.value());
								MCList<MST_SLS_ACT_IO_R> slsIoL = _slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, slsActDR.sls_act_d_no());
								// 取消対象の明細の場合は詳細も取消 
								slsIoL.get(0).setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
							}
						}
					}
					else {
						for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
							if (isNull(slsActDR.getStringNE("data_crud_typ"))) {
								slsActDL.setValueNE("data_crud_typ",  MAC_DATA_CRUD_TYP.UPD.value());
							}
						}
					}
				}
			}
			
			// 全明細が取消となった場合、ヘッダも取消
			for (MST_SLS_ACT_R slsActR : _slsActL) {
				slsActR.addStringColumn("data_crud_typ");
				MCList<MST_SLS_ACT_D_R> slsActDL = _slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_no, slsActR.sls_act_no());
				
				if((slsActDL.subList("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value())).size() == 0) {
					slsActR.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					slsActR.setStringNE("data_crud_typ", MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCList<Chk03_SlsActR> downSlsActL = MCList.create(Chk03_SlsActR.class);
			MCList<Chk03_SlsActDtlR> downSlsActDL = MCList.create(Chk03_SlsActDtlR.class);
			MCList<Chk03_SlsActIoR> downSlsActIoL = MCList.create(Chk03_SlsActIoR.class);
			
			
			for (Chk03_RsltR rsltR : up0()) {
				
				MST_SLS_ACT_R slsActR = _slsActL.getFirst(MST_SLS_ACT_R.$sls_act_no, rsltR.sls_act_no());
				MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(MST_SLS_ACT_D_R.$sls_act_d_no, rsltR.sls_act_d_no());
				
				if (!isNull(slsActR)) {
					rsltR.cst_cd(slsActR.cst_cd());
					rsltR.trd_cur_cd(slsActR.trd_cur_cd());
					rsltR.trd_ptn_typ(slsActR.trd_ptn_typ());
				}
				
				if (!isNull(slsActDR)) {
					rsltR.dscnt_itm_flg(slsActDR.getBooleanNE("dscnt_itm_flg"));
					rsltR.slo_d_no(slsActDR.slo_d_no());
				}
			}
			
			down0().addAll(up0());
			
			for (MST_SLS_ACT_R slsActR :_slsActL) {
				Chk03_SlsActR downSlsActR = Chk03_SlsActR.create();
				copy(downSlsActR, slsActR, createMap_Chk03_SlsActR_MST_SLS_ACT_R());
				downSlsActR.data_crud_typ(slsActR.getStringNE("data_crud_typ"));
				downSlsActR.can_ac_dt(slsActR.getDate("can_ac_dt"));
				downSlsActR.eta_dt(slsActR.getDateNE("eta_dt"));
				downSlsActR.sls_tgt_typ(slsActR.getStringNE("sls_tgt_typ"));
				downSlsActR.setStatus(MCRow.MODIFY);
				downSlsActL.add(downSlsActR);
			}
			
			for (MST_SLS_ACT_D_R slsActDR : _slsActDL) {
				Chk03_SlsActDtlR downSlsActDR = Chk03_SlsActDtlR.create();
				copy(downSlsActDR, slsActDR, createMap_Chk03_SlsActDtlR_MST_SLS_ACT_D_R());
				downSlsActDR.data_crud_typ(slsActDR.getStringNE("data_crud_typ"));
				downSlsActDR.abort_flg(slsActDR.getBooleanNE("abort_flg"));
				downSlsActDR.tax_rate(slsActDR.getNumberNE("tax_rate"));
				downSlsActDR.tax_typ(slsActDR.getStringNE("tax_typ"));
				downSlsActDR.inc_tax_flg(slsActDR.getBooleanNE("inc_tax_flg"));
				downSlsActDR.dscnt_itm_flg(slsActDR.getBooleanNE("dscnt_itm_flg"));
				if (MAC_DATA_CRUD_TYP.isDEL(downSlsActDR.data_crud_typ())) {
					downSlsActDR.setStatus(MCRow.DELETE);
				}
				else {
					downSlsActDR.setStatus(MCRow.MODIFY);
				}
				downSlsActDL.add(downSlsActDR);
			}
			
			for (MST_SLS_ACT_IO_R slsActIoR : _slsActIoL) {
				Chk03_SlsActIoR downSlsActIoR = Chk03_SlsActIoR.create();
				copy(downSlsActIoR, slsActIoR, createMap_Chk03_SlsActIoR_MST_SLS_ACT_IO_R());
				downSlsActIoR.data_crud_typ(slsActIoR.getStringNE("data_crud_typ"));
				downSlsActIoR.ship_alloc_sts_no(slsActIoR.getStringNE("ship_alloc_sts_no"));
				if (MAC_DATA_CRUD_TYP.isDEL(downSlsActIoR.data_crud_typ())) {
					downSlsActIoR.setStatus(MCRow.DELETE);
				}
				else {
					downSlsActIoR.setStatus(MCRow.MODIFY);
				}
				downSlsActIoL.add(downSlsActIoR);
			}
			down1().addAll(downSlsActIoL);
			down2().addAll(downSlsActL);
			down3().addAll(downSlsActDL);
			down4().addAllByName(_calc01HdrL);
			down5().addAll(_purcActIoL);
		}
		
		protected Map_Chk03_SlsActIoR_MST_SLS_ACT_IO_R<Chk03_SlsActIoR,MST_SLS_ACT_IO_R> createMap_Chk03_SlsActIoR_MST_SLS_ACT_IO_R() {
			return new Map_Chk03_SlsActIoR_MST_SLS_ACT_IO_R<Chk03_SlsActIoR, MST_SLS_ACT_IO_R>();
		}
		
		public class Map_Chk03_SlsActIoR_MST_SLS_ACT_IO_R<D extends Chk03_SlsActIoR, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk03_SlsActIoR.$sls_act_io_no, MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(Chk03_SlsActIoR.$sls_act_io_seq, MST_SLS_ACT_IO_R.$sls_act_io_seq);
				addColumnPathMap(Chk03_SlsActIoR.$ship_act_d_no, MST_SLS_ACT_IO_R.$ship_act_d_no);
				addColumnPathMap(Chk03_SlsActIoR.$iv_ship_act_d_no, MST_SLS_ACT_IO_R.$iv_ship_act_d_no);
				addColumnPathMap(Chk03_SlsActIoR.$arr_act_no, MST_SLS_ACT_IO_R.$arr_act_no);
				addColumnPathMap(Chk03_SlsActIoR.$purc_act_io_no, MST_SLS_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(Chk03_SlsActIoR.$sno1, MST_SLS_ACT_IO_R.$sno1);
				addColumnPathMap(Chk03_SlsActIoR.$sno2, MST_SLS_ACT_IO_R.$sno2);
				addColumnPathMap(Chk03_SlsActIoR.$sno3, MST_SLS_ACT_IO_R.$sno3);
				addColumnPathMap(Chk03_SlsActIoR.$sno4, MST_SLS_ACT_IO_R.$sno4);
				addColumnPathMap(Chk03_SlsActIoR.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
				addColumnPathMap(Chk03_SlsActIoR.$loc_cd, MST_SLS_ACT_IO_R.$loc_cd);
				addColumnPathMap(Chk03_SlsActIoR.$str_ln_cd, MST_SLS_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(Chk03_SlsActIoR.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
				addColumnPathMap(Chk03_SlsActIoR.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
				addColumnPathMap(Chk03_SlsActIoR.$trd_unit_cd, MST_SLS_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(Chk03_SlsActIoR.$trd_unit_qty, MST_SLS_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(Chk03_SlsActIoR.$base_unit_cd, MST_SLS_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(Chk03_SlsActIoR.$base_unit_qty, MST_SLS_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(Chk03_SlsActIoR.$pack_unit_cd, MST_SLS_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(Chk03_SlsActIoR.$pack_unit_qty, MST_SLS_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(Chk03_SlsActIoR.$sync_flg, MST_SLS_ACT_IO_R.$sync_flg);
				addColumnPathMap(Chk03_SlsActIoR.$sub_char1, MST_SLS_ACT_IO_R.$sub_char1);
				addColumnPathMap(Chk03_SlsActIoR.$sub_char2, MST_SLS_ACT_IO_R.$sub_char2);
				addColumnPathMap(Chk03_SlsActIoR.$sub_char3, MST_SLS_ACT_IO_R.$sub_char3);
				addColumnPathMap(Chk03_SlsActIoR.$sls_act_d_no, MST_SLS_ACT_IO_R.$sls_act_d_no);
				addColumnPathMap(Chk03_SlsActIoR.$sls_act_d_seq, MST_SLS_ACT_IO_R.$sls_act_d_seq);
				addColumnPathMap(Chk03_SlsActIoR.$trd_cur_upri, MST_SLS_ACT_IO_R.$trd_cur_upri);
				addColumnPathMap(Chk03_SlsActIoR.$trd_cur_amt, MST_SLS_ACT_IO_R.$trd_cur_amt);
				addColumnPathMap(Chk03_SlsActIoR.$trd_cur_dscnt_amt, MST_SLS_ACT_IO_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Chk03_SlsActIoR.$trd_cur_tax_amt, MST_SLS_ACT_IO_R.$trd_cur_tax_amt);
				addColumnPathMap(Chk03_SlsActIoR.$base_cur_upri, MST_SLS_ACT_IO_R.$base_cur_upri);
				addColumnPathMap(Chk03_SlsActIoR.$base_cur_amt, MST_SLS_ACT_IO_R.$base_cur_amt);
				addColumnPathMap(Chk03_SlsActIoR.$base_cur_dscnt_amt, MST_SLS_ACT_IO_R.$base_cur_dscnt_amt);
				addColumnPathMap(Chk03_SlsActIoR.$base_cur_tax_amt, MST_SLS_ACT_IO_R.$base_cur_tax_amt);
				addColumnPathMap(Chk03_SlsActIoR.$ptax_cur_upri, MST_SLS_ACT_IO_R.$ptax_cur_upri);
				addColumnPathMap(Chk03_SlsActIoR.$ptax_cur_amt, MST_SLS_ACT_IO_R.$ptax_cur_amt);
				addColumnPathMap(Chk03_SlsActIoR.$ptax_cur_dscnt_amt, MST_SLS_ACT_IO_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Chk03_SlsActIoR.$ptax_cur_tax_amt, MST_SLS_ACT_IO_R.$ptax_cur_tax_amt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.ship_alloc_sts_no(src.getStringNE("ship_alloc_sts_no"));
			}
		}
		
		protected Map_Chk03_SlsActDtlR_MST_SLS_ACT_D_R<Chk03_SlsActDtlR,MST_SLS_ACT_D_R> createMap_Chk03_SlsActDtlR_MST_SLS_ACT_D_R() {
			return new Map_Chk03_SlsActDtlR_MST_SLS_ACT_D_R<Chk03_SlsActDtlR, MST_SLS_ACT_D_R>();
		}
		
		public class Map_Chk03_SlsActDtlR_MST_SLS_ACT_D_R<D extends Chk03_SlsActDtlR, S extends MST_SLS_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk03_SlsActDtlR.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$sls_act_d_seq, MST_SLS_ACT_D_R.$sls_act_d_seq);
				addColumnPathMap(Chk03_SlsActDtlR.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_no);
				addColumnPathMap(Chk03_SlsActDtlR.$sls_act_seq, MST_SLS_ACT_D_R.$sls_act_seq);
				addColumnPathMap(Chk03_SlsActDtlR.$disp_seq, MST_SLS_ACT_D_R.$disp_seq);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_cd, MST_SLS_ACT_D_R.$dlv_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_sundry_flg, MST_SLS_ACT_D_R.$dlv_sundry_flg);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_nm, MST_SLS_ACT_D_R.$dlv_nm);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_zip_cd, MST_SLS_ACT_D_R.$dlv_zip_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_addr1, MST_SLS_ACT_D_R.$dlv_addr1);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_addr2, MST_SLS_ACT_D_R.$dlv_addr2);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_addr3, MST_SLS_ACT_D_R.$dlv_addr3);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_addr4, MST_SLS_ACT_D_R.$dlv_addr4);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_cntct_dpt, MST_SLS_ACT_D_R.$dlv_cntct_dpt);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_cntct_psn, MST_SLS_ACT_D_R.$dlv_cntct_psn);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_tel, MST_SLS_ACT_D_R.$dlv_tel);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_fax, MST_SLS_ACT_D_R.$dlv_fax);
				addColumnPathMap(Chk03_SlsActDtlR.$pri_prnt_flg, MST_SLS_ACT_D_R.$pri_prnt_flg);
				addColumnPathMap(Chk03_SlsActDtlR.$dest_cd1, MST_SLS_ACT_D_R.$dest_cd1);
				addColumnPathMap(Chk03_SlsActDtlR.$dest_cd2, MST_SLS_ACT_D_R.$dest_cd2);
				addColumnPathMap(Chk03_SlsActDtlR.$dest_cd3, MST_SLS_ACT_D_R.$dest_cd3);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_cd, MST_SLS_ACT_D_R.$tdlv_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_sundry_flg, MST_SLS_ACT_D_R.$tdlv_sundry_flg);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_nm, MST_SLS_ACT_D_R.$tdlv_nm);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_zip_cd, MST_SLS_ACT_D_R.$tdlv_zip_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_addr1, MST_SLS_ACT_D_R.$tdlv_addr1);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_addr2, MST_SLS_ACT_D_R.$tdlv_addr2);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_addr3, MST_SLS_ACT_D_R.$tdlv_addr3);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_addr4, MST_SLS_ACT_D_R.$tdlv_addr4);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_tel, MST_SLS_ACT_D_R.$tdlv_tel);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_fax, MST_SLS_ACT_D_R.$tdlv_fax);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_cntct_dpt, MST_SLS_ACT_D_R.$tdlv_cntct_dpt);
				addColumnPathMap(Chk03_SlsActDtlR.$tdlv_cntct_psn, MST_SLS_ACT_D_R.$tdlv_cntct_psn);
				addColumnPathMap(Chk03_SlsActDtlR.$itm_cd, MST_SLS_ACT_D_R.$itm_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$itm_sub1, MST_SLS_ACT_D_R.$itm_sub1);
				addColumnPathMap(Chk03_SlsActDtlR.$itm_sub2, MST_SLS_ACT_D_R.$itm_sub2);
				addColumnPathMap(Chk03_SlsActDtlR.$itm_sub3, MST_SLS_ACT_D_R.$itm_sub3);
				addColumnPathMap(Chk03_SlsActDtlR.$sno1, MST_SLS_ACT_D_R.$sno1);
				addColumnPathMap(Chk03_SlsActDtlR.$sno2, MST_SLS_ACT_D_R.$sno2);
				addColumnPathMap(Chk03_SlsActDtlR.$sno3, MST_SLS_ACT_D_R.$sno3);
				addColumnPathMap(Chk03_SlsActDtlR.$sno4, MST_SLS_ACT_D_R.$sno4);
				addColumnPathMap(Chk03_SlsActDtlR.$itm_nm, MST_SLS_ACT_D_R.$itm_nm);
				addColumnPathMap(Chk03_SlsActDtlR.$iv_itm_nm, MST_SLS_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(Chk03_SlsActDtlR.$cntry_org_cd, MST_SLS_ACT_D_R.$cntry_org_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$wrk_no, MST_SLS_ACT_D_R.$wrk_no);
				addColumnPathMap(Chk03_SlsActDtlR.$loc_cd, MST_SLS_ACT_D_R.$loc_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$str_ln_cd, MST_SLS_ACT_D_R.$str_ln_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$lot_no, MST_SLS_ACT_D_R.$lot_no);
				addColumnPathMap(Chk03_SlsActDtlR.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
				addColumnPathMap(Chk03_SlsActDtlR.$gd_cd, MST_SLS_ACT_D_R.$gd_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$trd_unit_cd, MST_SLS_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$trd_unit_qty, MST_SLS_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(Chk03_SlsActDtlR.$base_unit_cd, MST_SLS_ACT_D_R.$base_unit_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$base_unit_qty, MST_SLS_ACT_D_R.$base_unit_qty);
				addColumnPathMap(Chk03_SlsActDtlR.$trd_cur_upri, MST_SLS_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(Chk03_SlsActDtlR.$trd_cur_amt, MST_SLS_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$upri_not_tgt_flg, MST_SLS_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(Chk03_SlsActDtlR.$interim_flg, MST_SLS_ACT_D_R.$interim_flg);
				addColumnPathMap(Chk03_SlsActDtlR.$tax_cd, MST_SLS_ACT_D_R.$tax_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$trd_cur_tax_amt, MST_SLS_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$base_cur_upri, MST_SLS_ACT_D_R.$base_cur_upri);
				addColumnPathMap(Chk03_SlsActDtlR.$base_cur_amt, MST_SLS_ACT_D_R.$base_cur_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$base_cur_tax_amt, MST_SLS_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$ptax_cur_upri, MST_SLS_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(Chk03_SlsActDtlR.$ptax_cur_amt, MST_SLS_ACT_D_R.$ptax_cur_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$ptax_cur_tax_amt, MST_SLS_ACT_D_R.$ptax_cur_tax_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$cost_upri, MST_SLS_ACT_D_R.$cost_upri);
				addColumnPathMap(Chk03_SlsActDtlR.$cost_amt, MST_SLS_ACT_D_R.$cost_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$trd_cur_dscnt_amt, MST_SLS_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$base_cur_dscnt_amt, MST_SLS_ACT_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$ptax_cur_dscnt_amt, MST_SLS_ACT_D_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$dscnt_rsn_cd, MST_SLS_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$bill_crryovr_times, MST_SLS_ACT_D_R.$bill_crryovr_times);
				addColumnPathMap(Chk03_SlsActDtlR.$stk_mng_typ, MST_SLS_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(Chk03_SlsActDtlR.$sundry_itm_flg, MST_SLS_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(Chk03_SlsActDtlR.$sno1_mng_typ, MST_SLS_ACT_D_R.$sno1_mng_typ);
				addColumnPathMap(Chk03_SlsActDtlR.$sno2_mng_typ, MST_SLS_ACT_D_R.$sno2_mng_typ);
				addColumnPathMap(Chk03_SlsActDtlR.$sno3_mng_typ, MST_SLS_ACT_D_R.$sno3_mng_typ);
				addColumnPathMap(Chk03_SlsActDtlR.$sno4_mng_typ, MST_SLS_ACT_D_R.$sno4_mng_typ);
				addColumnPathMap(Chk03_SlsActDtlR.$ar_typ, MST_SLS_ACT_D_R.$ar_typ);
				addColumnPathMap(Chk03_SlsActDtlR.$cst_po_d_no, MST_SLS_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$cst_itm_cd, MST_SLS_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$cst_itm_nm, MST_SLS_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(Chk03_SlsActDtlR.$trd_d_rmrks, MST_SLS_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(Chk03_SlsActDtlR.$intr_rmrks, MST_SLS_ACT_D_R.$intr_rmrks);
				addColumnPathMap(Chk03_SlsActDtlR.$rsn_cd, MST_SLS_ACT_D_R.$rsn_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$bd_dpt_cd, MST_SLS_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(Chk03_SlsActDtlR.$wtax_rate, MST_SLS_ACT_D_R.$wtax_rate);
				addColumnPathMap(Chk03_SlsActDtlR.$wtax_amt, MST_SLS_ACT_D_R.$wtax_amt);
				addColumnPathMap(Chk03_SlsActDtlR.$slo_no, MST_SLS_ACT_D_R.$slo_no);
				addColumnPathMap(Chk03_SlsActDtlR.$slo_d_no, MST_SLS_ACT_D_R.$slo_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$sls_ret_schd_no, MST_SLS_ACT_D_R.$sls_ret_schd_no);
				addColumnPathMap(Chk03_SlsActDtlR.$sls_ret_schd_d_no, MST_SLS_ACT_D_R.$sls_ret_schd_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$ship_schd_no, MST_SLS_ACT_D_R.$ship_schd_no);
				addColumnPathMap(Chk03_SlsActDtlR.$sls_schd_no, MST_SLS_ACT_D_R.$sls_schd_no);
				addColumnPathMap(Chk03_SlsActDtlR.$qtn_no, MST_SLS_ACT_D_R.$qtn_no);
				addColumnPathMap(Chk03_SlsActDtlR.$qtn_rev, MST_SLS_ACT_D_R.$qtn_rev);
				addColumnPathMap(Chk03_SlsActDtlR.$qtn_d_no, MST_SLS_ACT_D_R.$qtn_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$purc_ddlv_po_no, MST_SLS_ACT_D_R.$purc_ddlv_po_no);
				addColumnPathMap(Chk03_SlsActDtlR.$purc_ddlv_po_d_no, MST_SLS_ACT_D_R.$purc_ddlv_po_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$purc_act_no, MST_SLS_ACT_D_R.$purc_act_no);
				addColumnPathMap(Chk03_SlsActDtlR.$purc_act_d_no, MST_SLS_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$iv_d_no, MST_SLS_ACT_D_R.$iv_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$sub_char1, MST_SLS_ACT_D_R.$sub_char1);
				addColumnPathMap(Chk03_SlsActDtlR.$sub_char2, MST_SLS_ACT_D_R.$sub_char2);
				addColumnPathMap(Chk03_SlsActDtlR.$sub_char3, MST_SLS_ACT_D_R.$sub_char3);
				addColumnPathMap(Chk03_SlsActDtlR.$ref_sls_act_no, MST_SLS_ACT_D_R.$ref_sls_act_no);
				addColumnPathMap(Chk03_SlsActDtlR.$ref_sls_act_seq, MST_SLS_ACT_D_R.$ref_sls_act_seq);
				addColumnPathMap(Chk03_SlsActDtlR.$ref_sls_act_d_no, MST_SLS_ACT_D_R.$ref_sls_act_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$ref_sls_act_d_seq, MST_SLS_ACT_D_R.$ref_sls_act_d_seq);
				addColumnPathMap(Chk03_SlsActDtlR.$dlv_slip_d_no, MST_SLS_ACT_D_R.$dlv_slip_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$ship_dlv_slip_d_no, MST_SLS_ACT_D_R.$ship_dlv_slip_d_no);
				addColumnPathMap(Chk03_SlsActDtlR.$ship_dlv_slip_multi_flg, MST_SLS_ACT_D_R.$ship_dlv_slip_multi_flg);
			}
		}
		
		protected Map_Chk03_SlsActR_MST_SLS_ACT_R<Chk03_SlsActR,MST_SLS_ACT_R> createMap_Chk03_SlsActR_MST_SLS_ACT_R() {
			return new Map_Chk03_SlsActR_MST_SLS_ACT_R<Chk03_SlsActR, MST_SLS_ACT_R>();
		}
		
		public class Map_Chk03_SlsActR_MST_SLS_ACT_R<D extends Chk03_SlsActR, S extends MST_SLS_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk03_SlsActR.$sls_act_no, MST_SLS_ACT_R.$sls_act_no);
				addColumnPathMap(Chk03_SlsActR.$sls_act_seq, MST_SLS_ACT_R.$sls_act_seq);
				addColumnPathMap(Chk03_SlsActR.$sls_act_rev, MST_SLS_ACT_R.$sls_act_rev);
				addColumnPathMap(Chk03_SlsActR.$slip_sts_typ, MST_SLS_ACT_R.$slip_sts_typ);
				addColumnPathMap(Chk03_SlsActR.$trd_cd, MST_SLS_ACT_R.$trd_cd);
				addColumnPathMap(Chk03_SlsActR.$trd_ptn_typ, MST_SLS_ACT_R.$trd_ptn_typ);
				addColumnPathMap(Chk03_SlsActR.$ac_ym, MST_SLS_ACT_R.$ac_ym);
				addColumnPathMap(Chk03_SlsActR.$ac_dt, MST_SLS_ACT_R.$ac_dt);
				addColumnPathMap(Chk03_SlsActR.$sls_dpt_cd, MST_SLS_ACT_R.$sls_dpt_cd);
				addColumnPathMap(Chk03_SlsActR.$wg_cd, MST_SLS_ACT_R.$wg_cd);
				addColumnPathMap(Chk03_SlsActR.$sls_usr_cd, MST_SLS_ACT_R.$sls_usr_cd);
				addColumnPathMap(Chk03_SlsActR.$sls_dt, MST_SLS_ACT_R.$sls_dt);
				addColumnPathMap(Chk03_SlsActR.$ship_tm, MST_SLS_ACT_R.$ship_tm);
				addColumnPathMap(Chk03_SlsActR.$dlv_tm, MST_SLS_ACT_R.$dlv_tm);
				addColumnPathMap(Chk03_SlsActR.$cst_cd, MST_SLS_ACT_R.$cst_cd);
				addColumnPathMap(Chk03_SlsActR.$iv_no, MST_SLS_ACT_R.$iv_no);
				addColumnPathMap(Chk03_SlsActR.$ref_iv_no, MST_SLS_ACT_R.$ref_iv_no);
				addColumnPathMap(Chk03_SlsActR.$rcpt_iv_mng_no, MST_SLS_ACT_R.$rcpt_iv_mng_no);
				addColumnPathMap(Chk03_SlsActR.$rcpt_iv_no, MST_SLS_ACT_R.$rcpt_iv_no);
				addColumnPathMap(Chk03_SlsActR.$tterm_cd1, MST_SLS_ACT_R.$tterm_cd1);
				addColumnPathMap(Chk03_SlsActR.$tterm_rmrks1, MST_SLS_ACT_R.$tterm_rmrks1);
				addColumnPathMap(Chk03_SlsActR.$tterm_cd2, MST_SLS_ACT_R.$tterm_cd2);
				addColumnPathMap(Chk03_SlsActR.$tterm_rmrks2, MST_SLS_ACT_R.$tterm_rmrks2);
				addColumnPathMap(Chk03_SlsActR.$tterm_cd3, MST_SLS_ACT_R.$tterm_cd3);
				addColumnPathMap(Chk03_SlsActR.$tterm_rmrks3, MST_SLS_ACT_R.$tterm_rmrks3);
				addColumnPathMap(Chk03_SlsActR.$lc_no, MST_SLS_ACT_R.$lc_no);
				addColumnPathMap(Chk03_SlsActR.$lc_dt, MST_SLS_ACT_R.$lc_dt);
				addColumnPathMap(Chk03_SlsActR.$lc_rmrks, MST_SLS_ACT_R.$lc_rmrks);
				addColumnPathMap(Chk03_SlsActR.$rcv_schd_dt, MST_SLS_ACT_R.$rcv_schd_dt);
				addColumnPathMap(Chk03_SlsActR.$bill_basis_dt, MST_SLS_ACT_R.$bill_basis_dt);
				addColumnPathMap(Chk03_SlsActR.$cred_cd, MST_SLS_ACT_R.$cred_cd);
				addColumnPathMap(Chk03_SlsActR.$bcst_cd, MST_SLS_ACT_R.$bcst_cd);
				addColumnPathMap(Chk03_SlsActR.$acst_cd, MST_SLS_ACT_R.$acst_cd);
				addColumnPathMap(Chk03_SlsActR.$ar_dpt_cd, MST_SLS_ACT_R.$ar_dpt_cd);
				addColumnPathMap(Chk03_SlsActR.$cst_po_no, MST_SLS_ACT_R.$cst_po_no);
				addColumnPathMap(Chk03_SlsActR.$trd_cur_cd, MST_SLS_ACT_R.$trd_cur_cd);
				addColumnPathMap(Chk03_SlsActR.$base_cur_cd, MST_SLS_ACT_R.$base_cur_cd);
				addColumnPathMap(Chk03_SlsActR.$xrate_cd, MST_SLS_ACT_R.$xrate_cd);
				addColumnPathMap(Chk03_SlsActR.$xrate, MST_SLS_ACT_R.$xrate);
				addColumnPathMap(Chk03_SlsActR.$ptax_cur_cd, MST_SLS_ACT_R.$ptax_cur_cd);
				addColumnPathMap(Chk03_SlsActR.$ptax_xrate, MST_SLS_ACT_R.$ptax_xrate);
				addColumnPathMap(Chk03_SlsActR.$trd_cur_amt, MST_SLS_ACT_R.$trd_cur_amt);
				addColumnPathMap(Chk03_SlsActR.$trd_cur_tax_amt, MST_SLS_ACT_R.$trd_cur_tax_amt);
				addColumnPathMap(Chk03_SlsActR.$base_cur_amt, MST_SLS_ACT_R.$base_cur_amt);
				addColumnPathMap(Chk03_SlsActR.$base_cur_tax_amt, MST_SLS_ACT_R.$base_cur_tax_amt);
				addColumnPathMap(Chk03_SlsActR.$trd_rmrks, MST_SLS_ACT_R.$trd_rmrks);
				addColumnPathMap(Chk03_SlsActR.$intr_rmrks, MST_SLS_ACT_R.$intr_rmrks);
				addColumnPathMap(Chk03_SlsActR.$ship_act_no, MST_SLS_ACT_R.$ship_act_no);
				addColumnPathMap(Chk03_SlsActR.$slo_no, MST_SLS_ACT_R.$slo_no);
				addColumnPathMap(Chk03_SlsActR.$sls_ret_schd_no, MST_SLS_ACT_R.$sls_ret_schd_no);
				addColumnPathMap(Chk03_SlsActR.$qtn_no, MST_SLS_ACT_R.$qtn_no);
				addColumnPathMap(Chk03_SlsActR.$qtn_rev, MST_SLS_ACT_R.$qtn_rev);
				addColumnPathMap(Chk03_SlsActR.$dlv_slip_no, MST_SLS_ACT_R.$dlv_slip_no);
				addColumnPathMap(Chk03_SlsActR.$slip_form_cd, MST_SLS_ACT_R.$slip_form_cd);
				addColumnPathMap(Chk03_SlsActR.$aprv_flg, MST_SLS_ACT_R.$aprv_flg);
				addColumnPathMap(Chk03_SlsActR.$aprv_no, MST_SLS_ACT_R.$aprv_no);
				addColumnPathMap(Chk03_SlsActR.$aprv_sts_typ, MST_SLS_ACT_R.$aprv_sts_typ);
				addColumnPathMap(Chk03_SlsActR.$sls_basis_typ, MST_SLS_ACT_R.$sls_basis_typ);
				addColumnPathMap(Chk03_SlsActR.$adjst_tgt_dt, MST_SLS_ACT_R.$adjst_tgt_dt);
				addColumnPathMap(Chk03_SlsActR.$sls_adjst_typ, MST_SLS_ACT_R.$sls_adjst_typ);
				addColumnPathMap(Chk03_SlsActR.$adjst_mtd_typ, MST_SLS_ACT_R.$adjst_mtd_typ);
				addColumnPathMap(Chk03_SlsActR.$sub_char1, MST_SLS_ACT_R.$sub_char1);
				addColumnPathMap(Chk03_SlsActR.$sub_char2, MST_SLS_ACT_R.$sub_char2);
				addColumnPathMap(Chk03_SlsActR.$sub_char3, MST_SLS_ACT_R.$sub_char3);
				addColumnPathMap(Chk03_SlsActR.$upd_cntr, MST_SLS_ACT_R.$upd_cntr);
				addColumnPathMap(Chk03_SlsActR.$ship_dlv_slip_no, MST_SLS_ACT_R.$ship_dlv_slip_no);
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			// 処理対象のロックとデータ取得
			lockAndCrrctData();
			
			// 更新カウンタチェック
			msgL.addAll(checkUpdCntr());
			
			// 承認提供チェックサービス呼出
			callAprvSv();
			
			return msgL;
		}
		
		/**
		 * 承認提供チェックサービス呼出
		 */
		protected void callAprvSv() {
			for (Chk03_RsltR chkR : up0()) {
				if ((MSC_SLS_TGT_TYP.isCSTSTK_SLS(chkR.sls_tgt_typ()) || MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(chkR.sls_tgt_typ())) &&
					!isNull(chkR.slo_no()) && !isNull(chkR.aprv_no())) {
					MBBAL_AprvService.Aprv_Chk03 aprvChk03 = MBBAL_AprvService.crtAprv_Chk03();
					Aprv_Chk02_Rslt1R chk03Up = aprvChk03.up0().createRow();
					
					chk03Up.aprv_no(chkR.aprv_no());
					aprvChk03.up0().add(chk03Up);
					
					if (!aprvChk03.up0().isEmpty()) {
						aprvChk03.exec();
						copyErrFlg(chkR, aprvChk03.down0().get(0));
					}
				}
			}
		}
		
		/**
		 * 更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList checkUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk03_RsltR> chkL = up0().groupBy(Chk03_RsltR.$sls_act_no, Chk03_RsltR.$upd_cntr);
			for (Chk03_RsltR chkR : chkL) {
				
				MST_SLS_ACT_R slsActR = _slsActL.getFirst(MST_SLS_ACT_R.$sls_act_no, chkR.sls_act_no());
				
				if (isNull(slsActR) || slsActR.isEmpty()) {
					msgL.addAll(checkUpdCntrNE(chkR, Chk03_RsltR.$upd_cntr, null));
				} 
				else {
					msgL.addAll(checkUpdCntrNE(chkR, Chk03_RsltR.$upd_cntr, slsActR));
				}
			}
			
			// CauseRowを差し替える
			MCIndexKey idxkey = up0().createIndex(Chk03_RsltR.$sls_act_no);
			for (MCMessage msg : msgL) {
				
				Chk03_RsltR errMsgR = (Chk03_RsltR)msg.getCauseRow();
				Chk03_RsltR causeRow = up0().getFirst(idxkey, errMsgR.sls_act_no());
				msg.setCauseRow(causeRow, msg.getCauseColumn());
			}
			
			setErrFlg(msgL);
			
			MCList<Chk03_RsltR>[] chkGrpL = up0().groupList(Chk01_RsltR.$chk_grp_no);
			for (MCList<Chk03_RsltR> chkRsltL : chkGrpL) {
				if (hasErrFlgOn(chkRsltL)) {
					msgL.addAll(setErrChkGrp(chkRsltL));
				}
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckBase();
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			MSBEL_ExActService.ExAct_Chk02 exOpe = MSBEL_ExActService.crtExAct_Chk02();
			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			for (MCList<Chk03_RsltR> chkL : notErrL.groupList(Chk03_RsltR.$chk_grp_no)) {
				MSBDL_PurcActRegService.Purc_Chk03 tmpOpe = MSBDL_PurcActRegService.crtPurc_Chk03();
				MSBEL_ExActService.ExAct_Chk02 tmpExOpe = MSBEL_ExActService.crtExAct_Chk02();
				
				// DAC更新権限チェック
				msgL.addAll(checkWritableDptCdDac(chkL, Chk03_RsltR.$sls_dpt_cd));
				
				// 固有チェック
				msgL.addAll(checkOther(chkL));
				
				// 仕入実績サービス呼出電文作成
				tmpOpe = makePurcActRegSvChk03(chkL);
				ope.up0().addAll(tmpOpe.up0());
				ope.up1().addAll(tmpOpe.up1());
				ope.up2().addAll(tmpOpe.up2());
				
				// 輸出実績サービス：インボイス更新前チェック呼出電文作成
				tmpExOpe = makeExActSvChk02(chkL);
				exOpe.up0().addAll(tmpExOpe.up0());
			}
			
			// 仕入実績登録チェックサービス
			callPurcActRegSvChk03(ope);
			
			// 輸出実績サービス：インボイス更新前チェック呼出
			callExActSvChk02(exOpe);
			
			// 同一処理グループで一件でもエラーがあった場合、その他のレコードもエラーにする
			setErrFlg(msgL);
			MCList<Chk03_RsltR>[] chkGrpL = up0().groupList(Chk03_RsltR.$chk_grp_no);
			for (MCList<Chk03_RsltR> chkL : chkGrpL) {
				if (hasErrFlgOn(chkL)) {
					msgL.addAll(setErrChkGrp(chkL));
				}
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			msgL.addAll(checkDtl(_slsActL, up0()));
			msgL.addAll(checkMamItm());
			return msgL;
		}
		
		/**
		 * 品目マスタ存在チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkMamItm() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MAM_ITM_R> mamItmL = searchMamItm(_slsActDL);
			MCIndexKey up0Idx = up0().createIndex(Chk02_RsltR.$sls_act_d_no);
			MCIndexKey up0Idx2 = up0().createIndex(Chk02_RsltR.$sls_act_no);
			MCIndexKey mamItmIdx = mamItmL.createIndex(MAM_ITM_R.create().getKeyColumn());
			
			for (MST_SLS_ACT_D_R slsActDR : _slsActDL) {
				if (isNull(mamItmL.getFirst(mamItmIdx, slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3()))) {
					Chk03_RsltR up0R = up0().getFirst(up0Idx, slsActDR.sls_act_d_no());
					
					if (!isNull(up0R)) {
						String itmInfo = toDispItm(slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3());
						msgL.add(new MCMessage(up0R, null, MAUAL0189, itmInfo, toDispGUIIndex(up0R)));
					}
					else {
						MCList<Chk03_RsltR> up0L =up0().subList(up0Idx2, slsActDR.sls_act_no());
						for (Chk03_RsltR up0R2 : up0L) {
							msgL.add(new MCMessage(up0R2, null, MSBBL0301, slsActDR.sls_act_d_no(), toDispGUIIndex(up0R2)));
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 輸出実績サービス：インボイス更新前チェック呼出
		 * 
		 * @param ope
		 */
		protected void callExActSvChk02(MSBEL_ExActService.ExAct_Chk02 ope) {
			if (!ope.up0().isEmpty()) {
				ope.exec();
				copyErrFlg(up0(), ope.down0());
			}
		}
		
		/**
		 * 輸出実績サービス：インボイス更新前チェック呼出電文作成
		 * 
		 * @param chkL
		 * @return
		 */
		protected MSBEL_ExActService.ExAct_Chk02 makeExActSvChk02(MCList<Chk03_RsltR> chkL) {
			MSBEL_ExActService.ExAct_Chk02 ope = MSBEL_ExActService.crtExAct_Chk02();
			ExAct_Upd02_DtlR oUp0;
			MCList<Chk03_RsltR> ivGrL = chkL.groupBy(
					Chk03_RsltR.$peg_no,
					Chk03_RsltR.$sls_tgt_typ,
					Chk03_RsltR.$cst_iv_flg,
					Chk03_RsltR.$sls_cststk_flg,
					Chk03_RsltR.$iv_no);
			for (Chk03_RsltR chkR : ivGrL) {
				MCList<MST_SLS_ACT_R>  tmpActL = _slsActL.subList(MST_SLS_ACT_R.$iv_no, chkR.iv_no());
				chkR.sls_tgt_typ(tmpActL.get(0).getStringNE("sls_tgt_typ"));
				if (chkR.cst_iv_flg()
						&& !isNullOrNullVal(chkR.iv_no())
						&& !chkR.sls_cststk_flg()
						&& !MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(chkR.iv_no()))) {
					oUp0 = ExAct_Upd02_DtlR.create();
					oUp0.peg_no(chkR.peg_no());
					oUp0.iv_no(chkR.iv_no());
					oUp0.cmpl_flg(false);
					ope.up0().add(oUp0);
				}
			}
			
			return ope;
		}
		
		/**
		 * 	チェックＧＲＰＮＯ単位のすべてのレコードのエラーＦＬＧをオンにする
		 * @param chkL
		 */
		protected MCMessageList setErrChkGrp(MCList<Chk03_RsltR> chkL) {
			
			MCMessageList msgL = new MCMessageList();

			Chk03_RsltR errDtl = chkL.getFirst(Chk03_RsltR.$err_flg, true);
			
			for (Chk03_RsltR r : chkL) {
				if (!r.err_flg()) {
					msgL.add(new MCMessage(r, null, MAUDL0013, toDispGUIIndex(r), toDispGUIIndex(errDtl)));
					r.err_flg(true);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 	固有チェック
		 * @return
		 */
		protected MCMessageList checkOther(MCList<Chk03_RsltR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Chk03_RsltR r : chkL) {
				
				// 出荷実績同時計上チェック
				msgL.addAll(checkShipActSync(r));
				
				// 打切チェック
				msgL.addAll(checkAbort(r));
				
			}
			
			// インボイスチェック
			msgL.addAll(checkIV(chkL));
			
			return msgL;
		}
		
		/**
		 * 全インボイス明細対象存在チェック（取消用）
		 * 
		 * @param chkL
		 * @return
		 */
		protected MCMessageList checkIV(MCList<Chk03_RsltR> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxkey = chkL.createIndex(Chk03_RsltR.$cst_iv_flg);
			
			// チェック対象のインボイスＮＯ
			MCList<Chk03_RsltR> ivL = chkL.subList(idxkey, true).groupBy(Chk03_RsltR.$iv_no);
			
			for (Chk03_RsltR ivR : ivL) {
				if (isNullOrNullVal(ivR.iv_no())) {
					for (Chk03_RsltR tgtR : chkL.subList(idxkey, true)) {
						msgL.add(new MCMessage(tgtR, Chk01_RsltR.$iv_no, MSBBL0254, toDispGUIIndex(tgtR)));
					}
					
					continue;
				}
				// 上り電文の対象インボイスＮＯを持つリストを取得
				MCList<Chk03_RsltR> tgtIvGrL = chkL.subList(Chk03_RsltR.$iv_no, ivR.iv_no());
				
				// インボイス明細トランに存在する対象インボイスＮＯを持つ件数を取得
				MST_IV_D_R ivd = MST_IV_D_R.create("IVD");
				MST_SLS_SCHD_R slss = MST_SLS_SCHD_R.create("SLSS");
				MCList<MST_IV_R> ivTblL = MCList.create(MST_IV_R.class);
				MST_IV_R t = MST_IV_R.create("T");
				MCQueryApiBuilder ivTblL_bldr = MCQueryApiBuilder.create(t);
				ivTblL_bldr.addSelect(ivd.iv_d_no);
				ivTblL_bldr.addLeftOuterJoin(ivd, bracket( t.iv_mng_no.eq(ivd.iv_mng_no)));
				ivTblL_bldr.addLeftOuterJoin(slss, bracket( ivd.iv_d_no.eq(slss.iv_d_no)));
				ivTblL.addStringColumn(MST_IV_D_R.$iv_d_no);
				ivTblL_bldr.setWhere(t.iv_no.eq(bind("1")), ivR.iv_no());
				dbSelect("MSBBL1320_MST_IV_S03", ivTblL, ivTblL_bldr);
				
				if (ivTblL.isEmpty()) {
					for (Chk03_RsltR tgtIvGrR : tgtIvGrL) {
						msgL.add(new MCMessage(tgtIvGrR, Chk01_RsltR.$iv_no, MSBBL0254, toDispGUIIndex(tgtIvGrR)));
					}
				}
				else if (tgtIvGrL.size() != ivTblL.size()) {
					for (Chk03_RsltR tgtIvGrR : tgtIvGrL) {
						msgL.add(new MCMessage(tgtIvGrR, Chk03_RsltR.$iv_no, MSBBL0204, tgtIvGrR.iv_no(),toDispGUIIndex(tgtIvGrR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷実績同時計上チェック
		 * @param rsltR チェック対象
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkShipActSync(Chk03_RsltR rsltR) {
			
			MCMessageList msgL = new MCMessageList();
			
			MST_SLS_ACT_R slsActR = _slsActL.getFirst(MST_SLS_ACT_R.$sls_act_no, rsltR.sls_act_no());
			
			if (!isNull(slsActR) && !slsActR.isEmpty() && slsActR.ship_act_sync_flg()) {
				
				if (MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(rsltR.iv_no()))) {
					msgL.add(new MCMessage(rsltR, null, MSBBL0264, slsActR.sls_act_no(), toDispGUIIndex(rsltR)));
				}
				else {
					msgL.add(new MCMessage(rsltR, null, MSBBL0262, slsActR.sls_act_no(), toDispGUIIndex(rsltR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 打切チェック（取消用）
		 * 
		 * @param r
		 * @return
		 */
		protected MCMessageList checkAbort(Chk03_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_SLS_ACT_D_R> tmpSlsActDL = _slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_d_no, r.sls_act_d_no());
			if (!isNull(tmpSlsActDL)) {
				boolean abort_flg = tmpSlsActDL.get(0).getBooleanNE("abort_flg");
				if (abort_flg) {
					msgL.add(new MCMessage(r, Chk01_RsltR.$abort_flg, MSBBL0108, toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 仕入実績登録チェックサービス呼出（取消用）
		 * 
		 * @param ope
		 */
		protected void callPurcActRegSvChk03(MSBDL_PurcActRegService.Purc_Chk03 ope) {
			if (!ope.up0().isEmpty()) {
				ope.up3().crt_param_cache_flg(true);
				ope.up3().purc_ddlv_reg_exec_flg(true);
				ope.exec();
				// ヘッダ、明細、詳細のいずれかでもエラーならばエラー
				copyErrFlg(up0(), ope.down0());
				copyErrFlg(up0(), ope.down1());
				copyErrFlg(up0(), ope.down2());
			}
		}
		
		/**
		 * 	仕入実績登録チェックサービス呼出電文作成（取消用）
		 */
		protected MSBDL_PurcActRegService.Purc_Chk03 makePurcActRegSvChk03(MCList<Chk03_RsltR> chkL) {
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService
					.crtPurc_Chk03();
			
			Purc_Chk03_HdrR oUp0;
			Purc_Chk03_DtlR oUp1;
			MCList<Purc_Chk03_IoR> oUp2L = null;
			
			MCList<Chk03_RsltR> slsActIoL = null;
			
			MCList<Chk03_PurcActIoR> purdActIoL = null;
			
			for (Chk03_RsltR chkR : chkL) {
				
				if (chkR.sync_flg()) {
					
					purdActIoL = MCList.create(Chk03_PurcActIoR.class);
					
					oUp0 = ope.up0().createRow();	// ヘッダ
					oUp1 = ope.up1().createRow();	// 明細
					oUp2L = MCList.create(Purc_Chk03_IoR.class);	// 詳細
					
					slsActIoL = MCList.create(Chk03_RsltR.class);
					
					// ヘッダ情報の設定
					executeQuery(slsActIoL, MSBBL1320_MST_SLS_ACT_D_S02(), chkR);
					setPurcActIoPegNo(slsActIoL);
					
					copy(oUp0, slsActIoL.get(0), createMap_Purc_Chk03_HdrR_Chk03_RsltR());
					oUp0.peg_no(chkR.peg_no());
					oUp0.can_ac_dt(chkR.can_ac_dt());
					ope.up0().add(oUp0);
					
					// 明細情報の設定
					copy(oUp1, slsActIoL.get(0), createMap_Purc_Chk03_DtlR_Chk03_RsltR());
					oUp1.hdr_peg_no(chkR.peg_no());
					oUp1.peg_no(chkR.peg_no());
					oUp1.setAttributes(chkR);
					
					ope.up1().add(oUp1);
							
					// 詳細情報の設定
					addAll(oUp2L, slsActIoL, createMap_Purc_Chk03_IoR_Chk03_RsltR());
					oUp2L.setValueNE(Purc_Chk03_IoR.$dtl_peg_no, chkR.peg_no());
					ope.up2().addAll(oUp2L);
					
					copyPegNoAndAttr(purdActIoL, slsActIoL);
					purdActIoL.setValueNE(Purc_Chk03_IoR.$dtl_peg_no, chkR.peg_no());
					
					_purcActIoL.addAll(purdActIoL);
				}
			}
			
			return ope;
		}
		
		/**
		 * 仕入実績受払の紐付けＮＯを設定する。
		 * @param slsActIoL 売上予定受払リスト
		 */
		protected void setPurcActIoPegNo(MCList<Chk03_RsltR> slsActIoL) {
			
			MCNumber pegNo = (MCNumber)_purcActIoL.max(Chk03_PurcActIoR.$peg_no);
			for (Chk03_RsltR slsActIoR : slsActIoL) {
				
				if (isNull(pegNo)) {
					pegNo = MCNumber.ZERO;
				}
				else {
					pegNo = pegNo.add(1);
				}
				
				slsActIoR.peg_no(pegNo);
			}
		}
		
		protected Map_Purc_Chk03_IoR_Chk03_RsltR<Purc_Chk03_IoR,Chk03_RsltR> createMap_Purc_Chk03_IoR_Chk03_RsltR() {
			return new Map_Purc_Chk03_IoR_Chk03_RsltR<Purc_Chk03_IoR, Chk03_RsltR>();
		}

		public class Map_Purc_Chk03_IoR_Chk03_RsltR<D extends Purc_Chk03_IoR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$peg_no, Chk03_RsltR.$peg_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_no, Chk03_RsltR.$purc_act_io_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_io_seq, Chk03_RsltR.$purc_act_io_seq);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_no, Chk03_RsltR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_seq, Chk03_RsltR.$purc_act_d_seq);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		protected Map_Purc_Chk03_DtlR_Chk03_RsltR<Purc_Chk03_DtlR,Chk03_RsltR> createMap_Purc_Chk03_DtlR_Chk03_RsltR() {
			return new Map_Purc_Chk03_DtlR_Chk03_RsltR<Purc_Chk03_DtlR, Chk03_RsltR>();
		}
		
		public class Map_Purc_Chk03_DtlR_Chk03_RsltR<D extends Purc_Chk03_DtlR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, Chk03_RsltR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, Chk03_RsltR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, Chk03_RsltR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, Chk03_RsltR.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_schd_no, Chk03_RsltR.$purc_schd_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		protected Map_Purc_Chk03_HdrR_Chk03_RsltR<Purc_Chk03_HdrR,Chk03_RsltR> createMap_Purc_Chk03_HdrR_Chk03_RsltR() {
			return new Map_Purc_Chk03_HdrR_Chk03_RsltR<Purc_Chk03_HdrR, Chk03_RsltR>();
		}

		public class Map_Purc_Chk03_HdrR_Chk03_RsltR<D extends Purc_Chk03_HdrR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, Chk03_RsltR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_seq, Chk03_RsltR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_cd, Chk03_RsltR.$trd_cd);
				addColumnPathMap(Purc_Chk03_HdrR.$trd_ptn_typ, Chk03_RsltR.$trd_ptn_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		/**
		 * 処理対象売上実績の排他とデータ取得
		 */
		protected void lockAndCrrctData() {
			MCList<Chk03_RsltR> lockL = up0().groupBy(Chk03_RsltR.$sls_act_no, Chk03_RsltR.$sls_act_rev);
			
			// 売上実績
			MST_SLS_ACT_R t1 = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder slsActL_bldr = MCQueryApiBuilder.create(t1);
			MST_SLS_ACT_R S1W1 = MST_SLS_ACT_R.create("W");
			slsActL_bldr.setWhere(t1.sls_act_no.eq(bind("sls_act_no")));
			slsActL_bldr.addWhereWithAnd(t1.sls_act_rev.eq(bind("sls_act_rev")));
			slsActL_bldr.addWhereWithAnd(
					t1.sls_act_seq.eq(subQuery().select(min(S1W1.sls_act_seq)).from(S1W1)
							.where(S1W1.sls_act_no.eq(bind("sls_act_no"))
									.and(S1W1.sls_act_rev.eq(bind("sls_act_rev"))))));
			MST_SLO_R slo = MST_SLO_R.create("slo");
			slsActL_bldr.addSelect(slo.aprv_no.as("slo_aprv_no"));
			slsActL_bldr.addLeftOuterJoin(slo, bracket(t1.slo_no.eq(slo.slo_no)));
			slsActL_bldr.addLockTable(t1.sls_act_no);
			dbSelectForUpdateNoWait("MSBBL1320_MST_SLS_ACT_S01", _slsActL, slsActL_bldr, lockL);
			
			_slsActDL.addStringColumn("itm_jnl_cd");
			_slsActDL.addNumberColumn("tax_rate");
			_slsActDL.addStringColumn("tax_typ");
			_slsActDL.addBooleanColumn("inc_tax_flg");
			_slsActDL.addBooleanColumn("dscnt_itm_flg");
			_slsActDL.addBooleanColumn("abort_flg");
			_slsActDL.addBooleanColumn("ddlv_iv_grp_flg");
			
			// 売上実績トランより情報を取得
			for (MST_SLS_ACT_R slsActR : _slsActL) {
				// 売上実績ヘッダに紐づく売上実績明細を取得
				MST_SLS_SCHD_R S1W2 = MST_SLS_SCHD_R.create("W");
				MAM_ITM_R itm = MAM_ITM_R.create("ITM");
				MAM_TAX_R tax = MAM_TAX_R.create("TAX");
				MST_SLS_SCHD_R slsschd = MST_SLS_SCHD_R.create("SLSSCHD");
				MST_SLO_D_R slod = MST_SLO_D_R.create("SLOD");

				MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T");
				MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(t2);
				slsActDL_bldr.setWhere(t2.sls_act_no.eq(bind("1")), slsActR.sls_act_no());
				slsActDL_bldr.addWhereWithAnd(t2.sls_act_seq.eq(bind("1")), slsActR.sls_act_seq());
				slsActDL_bldr.addSelect(itm.itm_jnl_cd);
				slsActDL_bldr.addSelect(itm.dscnt_itm_flg);
				slsActDL.addBooleanColumn("inc_tax_flg");
				slsActDL.addBooleanColumn("dscnt_itm_flg");
				slsActDL.addBooleanColumn("abort_flg");
				slsActDL.addBooleanColumn("ddlv_iv_grp_flg");
				slsActDL_bldr.addSelect(tax.inc_tax_flg);
				slsActDL_bldr.addSelect(tax.tax_rate);
				slsActDL_bldr.addSelect(tax.tax_typ);
				slsActDL_bldr.addSelect(slsschd.abort_flg);
				
				slsActDL_bldr.addSelect(decode(
						bracket(subQuery().select(sign(count(S1W2.sls_schd_no)))
								.from(S1W2)
								.where(slsschd.iv_no.eq(S1W2.iv_no)
										.and(S1W2.po_schd_no.isNotNull()))),
						value(0), value(false), value(true)).as("ddlv_iv_grp_flg"));
				slsActDL_bldr.addLeftOuterJoin(itm,
						bracket(t2.itm_cd.eq(itm.itm_cd)
								.and(t2.itm_sub1.eq(itm.itm_sub1))
								.and(t2.itm_sub2.eq(itm.itm_sub2))
								.and(t2.itm_sub3.eq(itm.itm_sub3))));
				slsActDL_bldr.addLeftOuterJoin(tax, bracket(t2.tax_cd.eq(tax.tax_cd)));
				slsActDL_bldr.addLeftOuterJoin(slsschd,
						bracket(t2.sls_schd_no.eq(slsschd.sls_schd_no)));
				slsActDL_bldr.addLeftOuterJoin(slod,
						bracket(t2.slo_d_no.eq(slod.slo_d_no)));
				
				dbSelect("MSBBL1320_MST_SLS_ACT_D_S01", slsActDL, slsActDL_bldr);
				
				_slsActDL.addAll(slsActDL);
				_slsActDL.get(0).getStringNE("tax_typ");
				
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					// 売上実績明細に紐づく売上実績詳細を取得
					MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
					MST_SLS_ACT_IO_R t3 = MST_SLS_ACT_IO_R.create("T");
					MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(t3);
					MST_SHIP_ACT_D_R shipactd = MST_SHIP_ACT_D_R.create("SHIPACTD");
					slsActIoL.addStringColumn("ship_alloc_sts_no");
					slsActIoL_bldr.addSelect(shipactd.ship_alloc_sts_no);
					slsActIoL_bldr.setWhere(t3.sls_act_d_no.eq(bind("1")), slsActDR.sls_act_d_no());
					slsActIoL_bldr.addLeftOuterJoin(shipactd, bracket( t3.ship_act_d_no.eq(shipactd.ship_act_d_no) 
							.and(shipactd.can_flg.eq(value(false)))));
					slsActIoL_bldr.addWhereWithAnd(t3.sls_act_d_seq.eq(bind("1")), slsActDR.sls_act_d_seq());
					dbSelect("MSBBL1320_MST_SLS_ACT_IO_S01", slsActIoL, slsActIoL_bldr);
					_slsActIoL.addAll(slsActIoL);
				}
			}
			
			for (Chk03_RsltR chkR : up0()) {
				MCList<MST_SLS_ACT_R> tmpSlsActL = _slsActL.subList(MST_SLS_ACT_R.$sls_act_no, chkR.sls_act_no());
				if (tmpSlsActL.size() > 0) {
					chkR.sls_dpt_cd(tmpSlsActL.get(0).sls_dpt_cd());
					chkR.iv_no(tmpSlsActL.get(0).iv_no());
				}
			}
			
			// 売上予定に紐づく内容を取得
			MCList<MST_SLS_SCHD_R> wkKeyL = MCList.create(MST_SLS_SCHD_R.class);
			for (Chk03_RsltR dtlR : up0()) {
				// 売上予定キーWK
				MST_SLS_SCHD_R wkKeyR = MST_SLS_SCHD_R.create();
				wkKeyR.sls_schd_no(dtlR.sls_schd_no());
				wkKeyL.add(wkKeyR);
			}
			dbWkInsert("MSBBL1320_MSW_SLS_SCHD_I06", wkKeyL,
					MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T")).getBaseDbc());
			
			initCalc01Hdr();
			executeQuery(_calc01HdrL, MSBBL1320_MST_SLS_SCHD_S07());
			_idxCalc01HdrKey = _calc01HdrL.createIndex(LIST_INDEX_KEY_NM);
			
			_slsActDL.sort(MST_SLS_ACT_D_R.$sls_act_d_no);
			_slsActIoL.sort(MST_SLS_ACT_IO_R.$sls_act_io_no);
			// 上り電文と取消対象データをマージし取消データを作成
			mrgData();
			
			for (Chk03_RsltR chkR : up0()) {
				MCList<MST_SLS_ACT_R> tmpSlsActL = _slsActL.subList(MST_SLS_ACT_R.$sls_act_no, chkR.sls_act_no());
				if (tmpSlsActL.size() > 0) {
					chkR.slo_no(tmpSlsActL.get(0).slo_no());
					chkR.aprv_no(tmpSlsActL.get(0).getString("slo_aprv_no"));
					chkR.sls_tgt_typ(tmpSlsActL.get(0).getStringNE("sls_tgt_typ"));
				}
			}
		}
	}
	
	protected void handleSuccessDel(MCList<Chk03_RsltR> l) {
		dbTran().commit();

		// ここの処理は更新が正常終了した場合に実行される想定。
		// 一覧登録訂正ではチェック処理でerr_flgがオフの行のみ更新処理を実行するため、err_flgがオフの行のみ処理結果状況区分をOKに設定する。
		// なお、err_flgがオンの行の処理結果状況区分はチェックロジックの中で、共通処理として設定されているため、ここでは設定しない。
		for (Chk03_RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleExDel(Exception e,
			MCList<Chk03_RsltR> l) {
		dbTran().rollback();

		// ここの処理は更新サービス内でチェックした結果例外がスローされた場合や、予期せぬ例外が起きた場合に実行される想定。
		// 更新サービス内でチェックする場合、msgOpeErrで取得できるメッセージで例外を生成し、エラーの状態を全て
		// メッセージリストとして例外の原因として設定する（addCauseMessageListを使って設定する)。
		// 例えば、マイナス在庫エラーや引当数不足の場合、処理の過程でマイナスや不足となった在庫情報を全てメッセージリストとしてた蓄え、
		// 1件でもマイナスや不足のメッセージがあれば例外とする。
		// なお、会社マスタや基準通貨が取得できない場合にも例外が発生する（ユーティリティがthrowするため）。
		// その場合は、行毎にエラーチェックしてメッセージプールに追加するわけではないので、
		// 例えば「会社マスタが取得できない」といった旨のメッセージをそのままthrowすればよい。
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
		// causeRowは設定しない
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (Chk03_RsltR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}
	
	protected void setGrpFlgTrue(Srch01_CndR cndR) {
		// 得意先
		cndR.cst_grp_flg1(true);
		cndR.cst_grp_flg2(true);
		cndR.cst_grp_flg3(true);
		cndR.cst_grp_flg4(true);
		cndR.cst_grp_flg5(true);
		cndR.cst_grp_flg6(true);
		cndR.cst_grp_flg7(true);
		cndR.cst_grp_flg8(true);
		cndR.cst_grp_flg9(true);
		cndR.cst_grp_flg10(true);
		// 納品先
		cndR.dlv_grp_flg1(true);
		cndR.dlv_grp_flg2(true);
		cndR.dlv_grp_flg3(true);
		cndR.dlv_grp_flg4(true);
		cndR.dlv_grp_flg5(true);
		cndR.dlv_grp_flg6(true);
		cndR.dlv_grp_flg7(true);
		cndR.dlv_grp_flg8(true);
		cndR.dlv_grp_flg9(true);
		cndR.dlv_grp_flg10(true);
		// 売掛先
		cndR.acst_grp_flg1(true);
		cndR.acst_grp_flg2(true);
		cndR.acst_grp_flg3(true);
		cndR.acst_grp_flg4(true);
		cndR.acst_grp_flg5(true);
		cndR.acst_grp_flg6(true);
		cndR.acst_grp_flg7(true);
		cndR.acst_grp_flg8(true);
		cndR.acst_grp_flg9(true);
		cndR.acst_grp_flg10(true);
		// 発注先
		cndR.sppl_grp_flg1(true);
		cndR.sppl_grp_flg2(true);
		cndR.sppl_grp_flg3(true);
		cndR.sppl_grp_flg4(true);
		cndR.sppl_grp_flg5(true);
		cndR.sppl_grp_flg6(true);
		cndR.sppl_grp_flg7(true);
		cndR.sppl_grp_flg8(true);
		cndR.sppl_grp_flg9(true);
		cndR.sppl_grp_flg10(true);
		// 品目
		cndR.itm_grp_flg1(true);
		cndR.itm_grp_flg2(true);
		cndR.itm_grp_flg3(true);
		cndR.itm_grp_flg4(true);
		cndR.itm_grp_flg5(true);
		cndR.itm_grp_flg6(true);
		cndR.itm_grp_flg7(true);
		cndR.itm_grp_flg8(true);
		cndR.itm_grp_flg9(true);
		cndR.itm_grp_flg10(true);
	}
	
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 更新前チェックを行います。<br>
	 */
	public class Chk02 extends MSBBL_SlsActListReg_MC_A.Chk02 {
		MCList<MST_SLS_ACT_R> _slsActL = MCList.create(MST_SLS_ACT_R.class);
		MCIndexKey _slsActIdxKey;
		MCList<MST_SLS_ACT_D_R> _slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
		MCList<MST_SLS_ACT_IO_R> _slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
		
		/**
		 * 仕入実績明細と受払の紐付けＮＯリスト
		 */
		protected MCList<Chk02_PurcActIoR> _purcActIoL = MCList.create(Chk02_PurcActIoR.class);
		
		MCList<MST_SLS_SCHD_R> _purcSchdGrpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
		MCIndexKey _purcSchdGrpSlsIdxKey = null;
		
		MCList<MST_PURC_SCHD_R> _purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
		MCIndexKey _purcSchdIdxKey = null;
		
		MCList<MST_SLS_SCHD_R> _purcActGrpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
		MCIndexKey _purcActIdxKey = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			super.doIt();
			
			// 上り電文と取得データをマージ
			mrgData();
			
			setDown();
		}
		
		/**
		 * 各部門組織変更対応
		 */
		protected void editUp() {
			// 負担部門
			MAUCL_DptUtil.setDpt(up0(), Chk02_RsltR.$bd_dpt_cd, Chk02_RsltR.$ac_dt);
			
			// 売上部門
			MAUCL_DptUtil.setDpt(up0(), Chk02_RsltR.$sls_dpt_cd, Chk02_RsltR.$ac_dt);
			
			// 債権部門
			MAUCL_DptUtil.setDpt(up0(), Chk02_RsltR.$ar_dpt_cd, Chk02_RsltR.$ac_dt);
		}
		
		protected void setDown() {
			
			MCList<Chk02_SlsActR> downSlsActL = MCList.create(Chk02_SlsActR.class);
			MCList<Chk02_SlsActDtlR> downSlsActDL = MCList.create(Chk02_SlsActDtlR.class);
			MCList<Chk02_SlsActIoR> downSlsActIoL = MCList.create(Chk02_SlsActIoR.class);
			
			for (Chk02_RsltR rsltR : up0()) {
				
				MST_SLS_ACT_R slsActR = _slsActL.getFirst(MST_SLS_ACT_R.$sls_act_no, rsltR.sls_act_no());
				MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(MST_SLS_ACT_D_R.$sls_act_d_no, rsltR.sls_act_d_no());
				
				if (!isNull(slsActR)) {
					rsltR.cst_cd(slsActR.cst_cd());
					rsltR.trd_cur_cd(slsActR.trd_cur_cd());
					rsltR.trd_ptn_typ(slsActR.trd_ptn_typ());
				}
				
				if (!isNull(slsActDR)) {
					rsltR.sls_schd_qty(slsActDR.getNumberNE("sls_schd_qty"));
					rsltR.dscnt_itm_flg(slsActDR.getBooleanNE("dscnt_itm_flg"));
					rsltR.slo_d_no(slsActDR.slo_d_no());
				}
			}
			
			down0().addAll(up0());
			for (MST_SLS_ACT_R slsActR :_slsActL) {
				Chk02_SlsActR downSlsActR = Chk02_SlsActR.create();
				copy(downSlsActR, slsActR, createMap_Chk02_SlsActR_MST_SLS_ACT_R());
				downSlsActR.addDateColumn("can_ac_dt", slsActR.getDate("can_ac_dt"));
				downSlsActR.addDateColumn("eta_dt");
				downSlsActR.addStringColumn("sls_tgt_typ");
				downSlsActR.setDateNE("eta_dt", slsActR.getDateNE("eta_dt"));
				downSlsActR.setStringNE("sls_tgt_typ", slsActR.getStringNE("sls_tgt_typ"));
				downSlsActR.setStatus(MCRow.MODIFY);
				downSlsActL.add(downSlsActR);
			}
			
			for (MST_SLS_ACT_D_R slsActDR : _slsActDL) {
				Chk02_SlsActDtlR downSlsActDR = Chk02_SlsActDtlR.create();
				copy(downSlsActDR, slsActDR, createMap_Chk02_SlsActDtlR_MST_SLS_ACT_D_R());
				downSlsActDR.addBooleanColumn("abort_flg");
				downSlsActDR.addNumberColumn("tax_rate");
				downSlsActDR.addStringColumn("tax_typ");
				downSlsActDR.addBooleanColumn("inc_tax_flg");
				downSlsActDR.addBooleanColumn("dscnt_itm_flg");
				downSlsActDR.setBooleanNE("abort_flg", slsActDR.getBooleanNE("abort_flg"));
				downSlsActDR.setNumberNE("tax_rate", slsActDR.getNumberNE("tax_rate"));
				downSlsActDR.setStringNE("tax_typ", slsActDR.getStringNE("tax_typ"));
				downSlsActDR.setBooleanNE("inc_tax_flg", slsActDR.getBooleanNE("inc_tax_flg"));
				downSlsActDR.setBooleanNE("dscnt_itm_flg", slsActDR.getBooleanNE("dscnt_itm_flg"));
				downSlsActDR.setNumberNE("schd_base_unit_qty", slsActDR.getNumberNE("schd_base_unit_qty"));
				downSlsActDR.setNumberNE("bef_base_unit_qty", slsActDR.getNumberNE("bef_base_unit_qty"));
				downSlsActDR.setStatus(MCRow.MODIFY);
				downSlsActDL.add(downSlsActDR);
			}
			
			for (MST_SLS_ACT_IO_R slsActIoR : _slsActIoL) {
				Chk02_SlsActIoR downSlsActIoR = Chk02_SlsActIoR.create();
				copy(downSlsActIoR, slsActIoR, createMap_Chk02_SlsActIoR_MST_SLS_ACT_IO_R());
				downSlsActIoR.setStatus(MCRow.MODIFY);
				downSlsActIoL.add(downSlsActIoR);
			}
			down1().addAll(downSlsActIoL);
			down2().addAll(downSlsActL);
			down3().addAll(downSlsActDL);
			down4().addAllByName(_calc01HdrL);
			down5().addAll(_purcActIoL);
		}
		
		protected Map_Chk02_SlsActIoR_MST_SLS_ACT_IO_R<Chk02_SlsActIoR,MST_SLS_ACT_IO_R> createMap_Chk02_SlsActIoR_MST_SLS_ACT_IO_R() {
			return new Map_Chk02_SlsActIoR_MST_SLS_ACT_IO_R<Chk02_SlsActIoR, MST_SLS_ACT_IO_R>();
		}
		
		public class Map_Chk02_SlsActIoR_MST_SLS_ACT_IO_R<D extends Chk02_SlsActIoR, S extends MST_SLS_ACT_IO_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_SlsActIoR.$sls_act_io_no, MST_SLS_ACT_IO_R.$sls_act_io_no);
				addColumnPathMap(Chk02_SlsActIoR.$sls_act_io_seq, MST_SLS_ACT_IO_R.$sls_act_io_seq);
				addColumnPathMap(Chk02_SlsActIoR.$ship_act_d_no, MST_SLS_ACT_IO_R.$ship_act_d_no);
				addColumnPathMap(Chk02_SlsActIoR.$iv_ship_act_d_no, MST_SLS_ACT_IO_R.$iv_ship_act_d_no);
				addColumnPathMap(Chk02_SlsActIoR.$arr_act_no, MST_SLS_ACT_IO_R.$arr_act_no);
				addColumnPathMap(Chk02_SlsActIoR.$purc_act_io_no, MST_SLS_ACT_IO_R.$purc_act_io_no);
				addColumnPathMap(Chk02_SlsActIoR.$sno1, MST_SLS_ACT_IO_R.$sno1);
				addColumnPathMap(Chk02_SlsActIoR.$sno2, MST_SLS_ACT_IO_R.$sno2);
				addColumnPathMap(Chk02_SlsActIoR.$sno3, MST_SLS_ACT_IO_R.$sno3);
				addColumnPathMap(Chk02_SlsActIoR.$sno4, MST_SLS_ACT_IO_R.$sno4);
				addColumnPathMap(Chk02_SlsActIoR.$gd_cd, MST_SLS_ACT_IO_R.$gd_cd);
				addColumnPathMap(Chk02_SlsActIoR.$loc_cd, MST_SLS_ACT_IO_R.$loc_cd);
				addColumnPathMap(Chk02_SlsActIoR.$str_ln_cd, MST_SLS_ACT_IO_R.$str_ln_cd);
				addColumnPathMap(Chk02_SlsActIoR.$lot_no, MST_SLS_ACT_IO_R.$lot_no);
				addColumnPathMap(Chk02_SlsActIoR.$sublot_no, MST_SLS_ACT_IO_R.$sublot_no);
				addColumnPathMap(Chk02_SlsActIoR.$trd_unit_cd, MST_SLS_ACT_IO_R.$trd_unit_cd);
				addColumnPathMap(Chk02_SlsActIoR.$trd_unit_qty, MST_SLS_ACT_IO_R.$trd_unit_qty);
				addColumnPathMap(Chk02_SlsActIoR.$base_unit_cd, MST_SLS_ACT_IO_R.$base_unit_cd);
				addColumnPathMap(Chk02_SlsActIoR.$base_unit_qty, MST_SLS_ACT_IO_R.$base_unit_qty);
				addColumnPathMap(Chk02_SlsActIoR.$pack_unit_cd, MST_SLS_ACT_IO_R.$pack_unit_cd);
				addColumnPathMap(Chk02_SlsActIoR.$pack_unit_qty, MST_SLS_ACT_IO_R.$pack_unit_qty);
				addColumnPathMap(Chk02_SlsActIoR.$sync_flg, MST_SLS_ACT_IO_R.$sync_flg);
				addColumnPathMap(Chk02_SlsActIoR.$sub_char1, MST_SLS_ACT_IO_R.$sub_char1);
				addColumnPathMap(Chk02_SlsActIoR.$sub_char2, MST_SLS_ACT_IO_R.$sub_char2);
				addColumnPathMap(Chk02_SlsActIoR.$sub_char3, MST_SLS_ACT_IO_R.$sub_char3);
				addColumnPathMap(Chk02_SlsActIoR.$sls_act_d_no, MST_SLS_ACT_IO_R.$sls_act_d_no);
				addColumnPathMap(Chk02_SlsActIoR.$sls_act_d_seq, MST_SLS_ACT_IO_R.$sls_act_d_seq);
				addColumnPathMap(Chk02_SlsActIoR.$trd_cur_upri, MST_SLS_ACT_IO_R.$trd_cur_upri);
				addColumnPathMap(Chk02_SlsActIoR.$trd_cur_amt, MST_SLS_ACT_IO_R.$trd_cur_amt);
				addColumnPathMap(Chk02_SlsActIoR.$trd_cur_dscnt_amt, MST_SLS_ACT_IO_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Chk02_SlsActIoR.$trd_cur_tax_amt, MST_SLS_ACT_IO_R.$trd_cur_tax_amt);
				addColumnPathMap(Chk02_SlsActIoR.$base_cur_upri, MST_SLS_ACT_IO_R.$base_cur_upri);
				addColumnPathMap(Chk02_SlsActIoR.$base_cur_amt, MST_SLS_ACT_IO_R.$base_cur_amt);
				addColumnPathMap(Chk02_SlsActIoR.$base_cur_dscnt_amt, MST_SLS_ACT_IO_R.$base_cur_dscnt_amt);
				addColumnPathMap(Chk02_SlsActIoR.$base_cur_tax_amt, MST_SLS_ACT_IO_R.$base_cur_tax_amt);
				addColumnPathMap(Chk02_SlsActIoR.$ptax_cur_upri, MST_SLS_ACT_IO_R.$ptax_cur_upri);
				addColumnPathMap(Chk02_SlsActIoR.$ptax_cur_amt, MST_SLS_ACT_IO_R.$ptax_cur_amt);
				addColumnPathMap(Chk02_SlsActIoR.$ptax_cur_dscnt_amt, MST_SLS_ACT_IO_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Chk02_SlsActIoR.$ptax_cur_tax_amt, MST_SLS_ACT_IO_R.$ptax_cur_tax_amt);
			}
		}
		
		protected Map_Chk02_SlsActDtlR_MST_SLS_ACT_D_R<Chk02_SlsActDtlR,MST_SLS_ACT_D_R> createMap_Chk02_SlsActDtlR_MST_SLS_ACT_D_R() {
			return new Map_Chk02_SlsActDtlR_MST_SLS_ACT_D_R<Chk02_SlsActDtlR, MST_SLS_ACT_D_R>();
		}
		
		public class Map_Chk02_SlsActDtlR_MST_SLS_ACT_D_R<D extends Chk02_SlsActDtlR, S extends MST_SLS_ACT_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_SlsActDtlR.$sls_act_d_no, MST_SLS_ACT_D_R.$sls_act_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$sls_act_d_seq, MST_SLS_ACT_D_R.$sls_act_d_seq);
				addColumnPathMap(Chk02_SlsActDtlR.$sls_act_no, MST_SLS_ACT_D_R.$sls_act_no);
				addColumnPathMap(Chk02_SlsActDtlR.$sls_act_seq, MST_SLS_ACT_D_R.$sls_act_seq);
				addColumnPathMap(Chk02_SlsActDtlR.$disp_seq, MST_SLS_ACT_D_R.$disp_seq);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_cd, MST_SLS_ACT_D_R.$dlv_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_sundry_flg, MST_SLS_ACT_D_R.$dlv_sundry_flg);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_nm, MST_SLS_ACT_D_R.$dlv_nm);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_zip_cd, MST_SLS_ACT_D_R.$dlv_zip_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_addr1, MST_SLS_ACT_D_R.$dlv_addr1);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_addr2, MST_SLS_ACT_D_R.$dlv_addr2);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_addr3, MST_SLS_ACT_D_R.$dlv_addr3);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_addr4, MST_SLS_ACT_D_R.$dlv_addr4);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_cntct_dpt, MST_SLS_ACT_D_R.$dlv_cntct_dpt);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_cntct_psn, MST_SLS_ACT_D_R.$dlv_cntct_psn);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_tel, MST_SLS_ACT_D_R.$dlv_tel);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_fax, MST_SLS_ACT_D_R.$dlv_fax);
				addColumnPathMap(Chk02_SlsActDtlR.$pri_prnt_flg, MST_SLS_ACT_D_R.$pri_prnt_flg);
				addColumnPathMap(Chk02_SlsActDtlR.$dest_cd1, MST_SLS_ACT_D_R.$dest_cd1);
				addColumnPathMap(Chk02_SlsActDtlR.$dest_cd2, MST_SLS_ACT_D_R.$dest_cd2);
				addColumnPathMap(Chk02_SlsActDtlR.$dest_cd3, MST_SLS_ACT_D_R.$dest_cd3);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_cd, MST_SLS_ACT_D_R.$tdlv_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_sundry_flg, MST_SLS_ACT_D_R.$tdlv_sundry_flg);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_nm, MST_SLS_ACT_D_R.$tdlv_nm);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_zip_cd, MST_SLS_ACT_D_R.$tdlv_zip_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_addr1, MST_SLS_ACT_D_R.$tdlv_addr1);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_addr2, MST_SLS_ACT_D_R.$tdlv_addr2);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_addr3, MST_SLS_ACT_D_R.$tdlv_addr3);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_addr4, MST_SLS_ACT_D_R.$tdlv_addr4);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_tel, MST_SLS_ACT_D_R.$tdlv_tel);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_fax, MST_SLS_ACT_D_R.$tdlv_fax);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_cntct_dpt, MST_SLS_ACT_D_R.$tdlv_cntct_dpt);
				addColumnPathMap(Chk02_SlsActDtlR.$tdlv_cntct_psn, MST_SLS_ACT_D_R.$tdlv_cntct_psn);
				addColumnPathMap(Chk02_SlsActDtlR.$itm_cd, MST_SLS_ACT_D_R.$itm_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$itm_sub1, MST_SLS_ACT_D_R.$itm_sub1);
				addColumnPathMap(Chk02_SlsActDtlR.$itm_sub2, MST_SLS_ACT_D_R.$itm_sub2);
				addColumnPathMap(Chk02_SlsActDtlR.$itm_sub3, MST_SLS_ACT_D_R.$itm_sub3);
				addColumnPathMap(Chk02_SlsActDtlR.$sno1, MST_SLS_ACT_D_R.$sno1);
				addColumnPathMap(Chk02_SlsActDtlR.$sno2, MST_SLS_ACT_D_R.$sno2);
				addColumnPathMap(Chk02_SlsActDtlR.$sno3, MST_SLS_ACT_D_R.$sno3);
				addColumnPathMap(Chk02_SlsActDtlR.$sno4, MST_SLS_ACT_D_R.$sno4);
				addColumnPathMap(Chk02_SlsActDtlR.$itm_nm, MST_SLS_ACT_D_R.$itm_nm);
				addColumnPathMap(Chk02_SlsActDtlR.$iv_itm_nm, MST_SLS_ACT_D_R.$iv_itm_nm);
				addColumnPathMap(Chk02_SlsActDtlR.$cntry_org_cd, MST_SLS_ACT_D_R.$cntry_org_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$wrk_no, MST_SLS_ACT_D_R.$wrk_no);
				addColumnPathMap(Chk02_SlsActDtlR.$loc_cd, MST_SLS_ACT_D_R.$loc_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$str_ln_cd, MST_SLS_ACT_D_R.$str_ln_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$lot_no, MST_SLS_ACT_D_R.$lot_no);
				addColumnPathMap(Chk02_SlsActDtlR.$sublot_no, MST_SLS_ACT_D_R.$sublot_no);
				addColumnPathMap(Chk02_SlsActDtlR.$gd_cd, MST_SLS_ACT_D_R.$gd_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$trd_unit_cd, MST_SLS_ACT_D_R.$trd_unit_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$trd_unit_qty, MST_SLS_ACT_D_R.$trd_unit_qty);
				addColumnPathMap(Chk02_SlsActDtlR.$base_unit_cd, MST_SLS_ACT_D_R.$base_unit_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$base_unit_qty, MST_SLS_ACT_D_R.$base_unit_qty);
				addColumnPathMap(Chk02_SlsActDtlR.$trd_cur_upri, MST_SLS_ACT_D_R.$trd_cur_upri);
				addColumnPathMap(Chk02_SlsActDtlR.$trd_cur_amt, MST_SLS_ACT_D_R.$trd_cur_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$upri_not_tgt_flg, MST_SLS_ACT_D_R.$upri_not_tgt_flg);
				addColumnPathMap(Chk02_SlsActDtlR.$interim_flg, MST_SLS_ACT_D_R.$interim_flg);
				addColumnPathMap(Chk02_SlsActDtlR.$tax_cd, MST_SLS_ACT_D_R.$tax_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$trd_cur_tax_amt, MST_SLS_ACT_D_R.$trd_cur_tax_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$base_cur_upri, MST_SLS_ACT_D_R.$base_cur_upri);
				addColumnPathMap(Chk02_SlsActDtlR.$base_cur_amt, MST_SLS_ACT_D_R.$base_cur_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$base_cur_tax_amt, MST_SLS_ACT_D_R.$base_cur_tax_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$ptax_cur_upri, MST_SLS_ACT_D_R.$ptax_cur_upri);
				addColumnPathMap(Chk02_SlsActDtlR.$ptax_cur_amt, MST_SLS_ACT_D_R.$ptax_cur_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$ptax_cur_tax_amt, MST_SLS_ACT_D_R.$ptax_cur_tax_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$cost_upri, MST_SLS_ACT_D_R.$cost_upri);
				addColumnPathMap(Chk02_SlsActDtlR.$cost_amt, MST_SLS_ACT_D_R.$cost_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$trd_cur_dscnt_amt, MST_SLS_ACT_D_R.$trd_cur_dscnt_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$base_cur_dscnt_amt, MST_SLS_ACT_D_R.$base_cur_dscnt_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$ptax_cur_dscnt_amt, MST_SLS_ACT_D_R.$ptax_cur_dscnt_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$dscnt_rsn_cd, MST_SLS_ACT_D_R.$dscnt_rsn_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$bill_crryovr_times, MST_SLS_ACT_D_R.$bill_crryovr_times);
				addColumnPathMap(Chk02_SlsActDtlR.$stk_mng_typ, MST_SLS_ACT_D_R.$stk_mng_typ);
				addColumnPathMap(Chk02_SlsActDtlR.$sundry_itm_flg, MST_SLS_ACT_D_R.$sundry_itm_flg);
				addColumnPathMap(Chk02_SlsActDtlR.$sno1_mng_typ, MST_SLS_ACT_D_R.$sno1_mng_typ);
				addColumnPathMap(Chk02_SlsActDtlR.$sno2_mng_typ, MST_SLS_ACT_D_R.$sno2_mng_typ);
				addColumnPathMap(Chk02_SlsActDtlR.$sno3_mng_typ, MST_SLS_ACT_D_R.$sno3_mng_typ);
				addColumnPathMap(Chk02_SlsActDtlR.$sno4_mng_typ, MST_SLS_ACT_D_R.$sno4_mng_typ);
				addColumnPathMap(Chk02_SlsActDtlR.$ar_typ, MST_SLS_ACT_D_R.$ar_typ);
				addColumnPathMap(Chk02_SlsActDtlR.$cst_po_d_no, MST_SLS_ACT_D_R.$cst_po_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$cst_itm_cd, MST_SLS_ACT_D_R.$cst_itm_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$cst_itm_nm, MST_SLS_ACT_D_R.$cst_itm_nm);
				addColumnPathMap(Chk02_SlsActDtlR.$trd_d_rmrks, MST_SLS_ACT_D_R.$trd_d_rmrks);
				addColumnPathMap(Chk02_SlsActDtlR.$intr_rmrks, MST_SLS_ACT_D_R.$intr_rmrks);
				addColumnPathMap(Chk02_SlsActDtlR.$rsn_cd, MST_SLS_ACT_D_R.$rsn_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$bd_dpt_cd, MST_SLS_ACT_D_R.$bd_dpt_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$wtax_rate, MST_SLS_ACT_D_R.$wtax_rate);
				addColumnPathMap(Chk02_SlsActDtlR.$wtax_amt, MST_SLS_ACT_D_R.$wtax_amt);
				addColumnPathMap(Chk02_SlsActDtlR.$slo_no, MST_SLS_ACT_D_R.$slo_no);
				addColumnPathMap(Chk02_SlsActDtlR.$slo_d_no, MST_SLS_ACT_D_R.$slo_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$sls_ret_schd_no, MST_SLS_ACT_D_R.$sls_ret_schd_no);
				addColumnPathMap(Chk02_SlsActDtlR.$sls_ret_schd_d_no, MST_SLS_ACT_D_R.$sls_ret_schd_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$ship_schd_no, MST_SLS_ACT_D_R.$ship_schd_no);
				addColumnPathMap(Chk02_SlsActDtlR.$sls_schd_no, MST_SLS_ACT_D_R.$sls_schd_no);
				addColumnPathMap(Chk02_SlsActDtlR.$qtn_no, MST_SLS_ACT_D_R.$qtn_no);
				addColumnPathMap(Chk02_SlsActDtlR.$qtn_rev, MST_SLS_ACT_D_R.$qtn_rev);
				addColumnPathMap(Chk02_SlsActDtlR.$qtn_d_no, MST_SLS_ACT_D_R.$qtn_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$purc_ddlv_po_no, MST_SLS_ACT_D_R.$purc_ddlv_po_no);
				addColumnPathMap(Chk02_SlsActDtlR.$purc_ddlv_po_d_no, MST_SLS_ACT_D_R.$purc_ddlv_po_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$purc_act_no, MST_SLS_ACT_D_R.$purc_act_no);
				addColumnPathMap(Chk02_SlsActDtlR.$purc_act_d_no, MST_SLS_ACT_D_R.$purc_act_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$iv_d_no, MST_SLS_ACT_D_R.$iv_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$sub_char1, MST_SLS_ACT_D_R.$sub_char1);
				addColumnPathMap(Chk02_SlsActDtlR.$sub_char2, MST_SLS_ACT_D_R.$sub_char2);
				addColumnPathMap(Chk02_SlsActDtlR.$sub_char3, MST_SLS_ACT_D_R.$sub_char3);
				addColumnPathMap(Chk02_SlsActDtlR.$ref_sls_act_no, MST_SLS_ACT_D_R.$ref_sls_act_no);
				addColumnPathMap(Chk02_SlsActDtlR.$ref_sls_act_seq, MST_SLS_ACT_D_R.$ref_sls_act_seq);
				addColumnPathMap(Chk02_SlsActDtlR.$ref_sls_act_d_no, MST_SLS_ACT_D_R.$ref_sls_act_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$ref_sls_act_d_seq, MST_SLS_ACT_D_R.$ref_sls_act_d_seq);
				addColumnPathMap(Chk02_SlsActDtlR.$dlv_slip_d_no, MST_SLS_ACT_D_R.$dlv_slip_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$ship_dlv_slip_d_no, MST_SLS_ACT_D_R.$ship_dlv_slip_d_no);
				addColumnPathMap(Chk02_SlsActDtlR.$ship_dlv_slip_multi_flg, MST_SLS_ACT_D_R.$ship_dlv_slip_multi_flg);
				addColumnPathMap(Chk02_SlsActDtlR.$ext_sys_cd, MST_SLS_ACT_D_R.$ext_sys_cd);
				addColumnPathMap(Chk02_SlsActDtlR.$ext_purc_act_d_no, MST_SLS_ACT_D_R.$ext_purc_act_d_no);
			}
		}
		
		protected Map_Chk02_SlsActR_MST_SLS_ACT_R<Chk02_SlsActR,MST_SLS_ACT_R> createMap_Chk02_SlsActR_MST_SLS_ACT_R() {
			return new Map_Chk02_SlsActR_MST_SLS_ACT_R<Chk02_SlsActR, MST_SLS_ACT_R>();
		}
		
		public class Map_Chk02_SlsActR_MST_SLS_ACT_R<D extends Chk02_SlsActR, S extends MST_SLS_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_SlsActR.$sls_act_no, MST_SLS_ACT_R.$sls_act_no);
				addColumnPathMap(Chk02_SlsActR.$sls_act_seq, MST_SLS_ACT_R.$sls_act_seq);
				addColumnPathMap(Chk02_SlsActR.$sls_act_rev, MST_SLS_ACT_R.$sls_act_rev);
				addColumnPathMap(Chk02_SlsActR.$slip_sts_typ, MST_SLS_ACT_R.$slip_sts_typ);
				addColumnPathMap(Chk02_SlsActR.$trd_cd, MST_SLS_ACT_R.$trd_cd);
				addColumnPathMap(Chk02_SlsActR.$trd_ptn_typ, MST_SLS_ACT_R.$trd_ptn_typ);
				addColumnPathMap(Chk02_SlsActR.$ac_ym, MST_SLS_ACT_R.$ac_ym);
				addColumnPathMap(Chk02_SlsActR.$ac_dt, MST_SLS_ACT_R.$ac_dt);
				addColumnPathMap(Chk02_SlsActR.$sls_dpt_cd, MST_SLS_ACT_R.$sls_dpt_cd);
				addColumnPathMap(Chk02_SlsActR.$wg_cd, MST_SLS_ACT_R.$wg_cd);
				addColumnPathMap(Chk02_SlsActR.$sls_usr_cd, MST_SLS_ACT_R.$sls_usr_cd);
				addColumnPathMap(Chk02_SlsActR.$sls_dt, MST_SLS_ACT_R.$sls_dt);
				addColumnPathMap(Chk02_SlsActR.$ship_tm, MST_SLS_ACT_R.$ship_tm);
				addColumnPathMap(Chk02_SlsActR.$dlv_tm, MST_SLS_ACT_R.$dlv_tm);
				addColumnPathMap(Chk02_SlsActR.$cst_cd, MST_SLS_ACT_R.$cst_cd);
				addColumnPathMap(Chk02_SlsActR.$iv_no, MST_SLS_ACT_R.$iv_no);
				addColumnPathMap(Chk02_SlsActR.$ref_iv_no, MST_SLS_ACT_R.$ref_iv_no);
				addColumnPathMap(Chk02_SlsActR.$rcpt_iv_mng_no, MST_SLS_ACT_R.$rcpt_iv_mng_no);
				addColumnPathMap(Chk02_SlsActR.$rcpt_iv_no, MST_SLS_ACT_R.$rcpt_iv_no);
				addColumnPathMap(Chk02_SlsActR.$tterm_cd1, MST_SLS_ACT_R.$tterm_cd1);
				addColumnPathMap(Chk02_SlsActR.$tterm_rmrks1, MST_SLS_ACT_R.$tterm_rmrks1);
				addColumnPathMap(Chk02_SlsActR.$tterm_cd2, MST_SLS_ACT_R.$tterm_cd2);
				addColumnPathMap(Chk02_SlsActR.$tterm_rmrks2, MST_SLS_ACT_R.$tterm_rmrks2);
				addColumnPathMap(Chk02_SlsActR.$tterm_cd3, MST_SLS_ACT_R.$tterm_cd3);
				addColumnPathMap(Chk02_SlsActR.$tterm_rmrks3, MST_SLS_ACT_R.$tterm_rmrks3);
				addColumnPathMap(Chk02_SlsActR.$lc_no, MST_SLS_ACT_R.$lc_no);
				addColumnPathMap(Chk02_SlsActR.$lc_dt, MST_SLS_ACT_R.$lc_dt);
				addColumnPathMap(Chk02_SlsActR.$lc_rmrks, MST_SLS_ACT_R.$lc_rmrks);
				addColumnPathMap(Chk02_SlsActR.$rcv_schd_dt, MST_SLS_ACT_R.$rcv_schd_dt);
				addColumnPathMap(Chk02_SlsActR.$bill_basis_dt, MST_SLS_ACT_R.$bill_basis_dt);
				addColumnPathMap(Chk02_SlsActR.$cred_cd, MST_SLS_ACT_R.$cred_cd);
				addColumnPathMap(Chk02_SlsActR.$bcst_cd, MST_SLS_ACT_R.$bcst_cd);
				addColumnPathMap(Chk02_SlsActR.$acst_cd, MST_SLS_ACT_R.$acst_cd);
				addColumnPathMap(Chk02_SlsActR.$ar_dpt_cd, MST_SLS_ACT_R.$ar_dpt_cd);
				addColumnPathMap(Chk02_SlsActR.$cst_po_no, MST_SLS_ACT_R.$cst_po_no);
				addColumnPathMap(Chk02_SlsActR.$trd_cur_cd, MST_SLS_ACT_R.$trd_cur_cd);
				addColumnPathMap(Chk02_SlsActR.$base_cur_cd, MST_SLS_ACT_R.$base_cur_cd);
				addColumnPathMap(Chk02_SlsActR.$xrate_cd, MST_SLS_ACT_R.$xrate_cd);
				addColumnPathMap(Chk02_SlsActR.$xrate, MST_SLS_ACT_R.$xrate);
				addColumnPathMap(Chk02_SlsActR.$ptax_cur_cd, MST_SLS_ACT_R.$ptax_cur_cd);
				addColumnPathMap(Chk02_SlsActR.$ptax_xrate, MST_SLS_ACT_R.$ptax_xrate);
				addColumnPathMap(Chk02_SlsActR.$trd_cur_amt, MST_SLS_ACT_R.$trd_cur_amt);
				addColumnPathMap(Chk02_SlsActR.$trd_cur_tax_amt, MST_SLS_ACT_R.$trd_cur_tax_amt);
				addColumnPathMap(Chk02_SlsActR.$base_cur_amt, MST_SLS_ACT_R.$base_cur_amt);
				addColumnPathMap(Chk02_SlsActR.$base_cur_tax_amt, MST_SLS_ACT_R.$base_cur_tax_amt);
				addColumnPathMap(Chk02_SlsActR.$trd_rmrks, MST_SLS_ACT_R.$trd_rmrks);
				addColumnPathMap(Chk02_SlsActR.$intr_rmrks, MST_SLS_ACT_R.$intr_rmrks);
				addColumnPathMap(Chk02_SlsActR.$ship_act_no, MST_SLS_ACT_R.$ship_act_no);
				addColumnPathMap(Chk02_SlsActR.$slo_no, MST_SLS_ACT_R.$slo_no);
				addColumnPathMap(Chk02_SlsActR.$sls_ret_schd_no, MST_SLS_ACT_R.$sls_ret_schd_no);
				addColumnPathMap(Chk02_SlsActR.$qtn_no, MST_SLS_ACT_R.$qtn_no);
				addColumnPathMap(Chk02_SlsActR.$qtn_rev, MST_SLS_ACT_R.$qtn_rev);
				addColumnPathMap(Chk02_SlsActR.$dlv_slip_no, MST_SLS_ACT_R.$dlv_slip_no);
				addColumnPathMap(Chk02_SlsActR.$slip_form_cd, MST_SLS_ACT_R.$slip_form_cd);
				addColumnPathMap(Chk02_SlsActR.$aprv_flg, MST_SLS_ACT_R.$aprv_flg);
				addColumnPathMap(Chk02_SlsActR.$aprv_no, MST_SLS_ACT_R.$aprv_no);
				addColumnPathMap(Chk02_SlsActR.$aprv_sts_typ, MST_SLS_ACT_R.$aprv_sts_typ);
				addColumnPathMap(Chk02_SlsActR.$sls_basis_typ, MST_SLS_ACT_R.$sls_basis_typ);
				addColumnPathMap(Chk02_SlsActR.$adjst_tgt_dt, MST_SLS_ACT_R.$adjst_tgt_dt);
				addColumnPathMap(Chk02_SlsActR.$sls_adjst_typ, MST_SLS_ACT_R.$sls_adjst_typ);
				addColumnPathMap(Chk02_SlsActR.$adjst_mtd_typ, MST_SLS_ACT_R.$adjst_mtd_typ);
				addColumnPathMap(Chk02_SlsActR.$sub_char1, MST_SLS_ACT_R.$sub_char1);
				addColumnPathMap(Chk02_SlsActR.$sub_char2, MST_SLS_ACT_R.$sub_char2);
				addColumnPathMap(Chk02_SlsActR.$sub_char3, MST_SLS_ACT_R.$sub_char3);
				addColumnPathMap(Chk02_SlsActR.$upd_cntr, MST_SLS_ACT_R.$upd_cntr);
				addColumnPathMap(Chk02_SlsActR.$ship_dlv_slip_no, MST_SLS_ACT_R.$ship_dlv_slip_no);
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			// 処理対象のロックとデータ取得
			lockAndCrrctData();
			
			// 更新カウンタチェック
			msgL.addAll(checkUpdCntr());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();
			msgL.addAll(checkDtl(_slsActL, up0()));
			// 品目マスタ存在チェック
			msgL.addAll(checkMamItm());
			return msgL;
		}
		
		/**
		 * 品目マスタ存在チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkMamItm() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MAM_ITM_R> mamItmL = searchMamItm(_slsActDL);
			MCIndexKey up0Idx = up0().createIndex(Chk02_RsltR.$sls_act_d_no);
			MCIndexKey up0Idx2 = up0().createIndex(Chk02_RsltR.$sls_act_no);
			MCIndexKey mamItmIdx = mamItmL.createIndex(MAM_ITM_R.create().getKeyColumn());
			
			for (MST_SLS_ACT_D_R slsActDR : _slsActDL) {
				if (isNull(mamItmL.getFirst(mamItmIdx, slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3()))) {
					Chk02_RsltR up0R = up0().getFirst(up0Idx, slsActDR.sls_act_d_no());
					
					if (!isNull(up0R)) {
						String itmInfo = toDispItm(slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3());
						msgL.add(new MCMessage(up0R, null, MAUAL0189, itmInfo, toDispGUIIndex(up0R)));
					}
					else {
						MCList<Chk02_RsltR> up0L =up0().subList(up0Idx2, slsActDR.sls_act_no());
						for (Chk02_RsltR up0R2 : up0L) {
							msgL.add(new MCMessage(up0R2, null, MSBBL0301, slsActDR.sls_act_d_no(), toDispGUIIndex(up0R2)));
						}
					}
				}
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckBase();
			
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();
			MSBEL_ExActService.ExAct_Chk02 exOpe = MSBEL_ExActService.crtExAct_Chk02();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			initBpCache(_slsActL);
			initDbcCacheDlvSlip(_slsActL);
			getPurcSlsSchd(up0());
			for (MCList<Chk02_RsltR> chkL : notErrL.groupList(Chk02_RsltR.$chk_grp_no)) {
				MSBDL_PurcActRegService.Purc_Chk03 tmpOpe = MSBDL_PurcActRegService.crtPurc_Chk03();
				MSBEL_ExActService.ExAct_Chk02 tmpExOpe = MSBEL_ExActService.crtExAct_Chk02();
				
				// DAC更新権限チェック
				msgL.addAll(checkWritableDptCdDac(chkL, Chk02_RsltR.$sls_dpt_cd));
				
				// 訂正前の売上部門に対してDAC更新権限チェック
				msgL.addAll(chkUpdDac(chkL));
				
				// 固有チェック
				msgL.addAll(checkOther(chkL));
				
				// 仕入実績サービス呼出電文作成
				tmpOpe = makePurcActRegSvChk03(chkL);
				ope.up0().addAll(tmpOpe.up0());
				ope.up1().addAll(tmpOpe.up1());
				ope.up2().addAll(tmpOpe.up2());
				
				// 輸出実績サービス：インボイス更新前チェック呼出電文作成
				tmpExOpe = makeExActSvChk02(chkL);
				exOpe.up0().addAll(tmpExOpe.up0());
			}
			
			// 仕入実績登録チェックサービス呼出
			callPurcActRegSvChk03(ope);
			
			// 輸出実績サービス：インボイス更新前チェック呼出
			callExActSvChk02(exOpe);
			
			// 同一処理グループで一件でもエラーがあった場合、その他のレコードもエラーにする
			setErrFlg(msgL);
			MCList<Chk02_RsltR>[] chkGrpL = up0().groupList(Chk02_RsltR.$chk_grp_no);
			for (MCList<Chk02_RsltR> chkL : chkGrpL) {
				if (hasErrFlgOn(chkL)) {
					msgL.addAll(setErrChkGrp(chkL));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 輸出実績サービス：インボイス更新前チェック呼出
		 * 
		 * @param ope
		 */
		protected void callExActSvChk02(MSBEL_ExActService.ExAct_Chk02 ope) {
			if (!ope.up0().isEmpty()) {
				ope.exec();
				copyErrFlg(up0(), ope.down0());
			}
		}
		
		/**
		 * 輸出実績サービス：インボイス更新前チェック呼出電文作成
		 * 
		 * @param chkL
		 * @return
		 */
		protected MSBEL_ExActService.ExAct_Chk02 makeExActSvChk02(MCList<Chk02_RsltR> chkL) {
			MSBEL_ExActService.ExAct_Chk02 ope = MSBEL_ExActService.crtExAct_Chk02();
			ExAct_Upd02_DtlR oUp0;
			MCList<Chk02_RsltR> ivGrL = chkL.groupBy(
					Chk02_RsltR.$peg_no,
					Chk02_RsltR.$sls_tgt_typ,
					Chk02_RsltR.$cst_iv_flg,
					Chk02_RsltR.$sls_cststk_flg,
					Chk02_RsltR.$via_dlv_typ,
					Chk02_RsltR.$iv_no);
			for (Chk02_RsltR chkR : ivGrL) {
				if (chkR.cst_iv_flg()
						&& !isNullOrNullVal(chkR.iv_no())
						&& !chkR.sls_cststk_flg()
						&& !MAC_VIA_DLV_TYP.isVIA(chkR.via_dlv_typ())) {
					oUp0 = ExAct_Upd02_DtlR.create();
					oUp0.peg_no(chkR.peg_no());
					oUp0.iv_no(chkR.iv_no());
					oUp0.cmpl_flg(true);
					ope.up0().add(oUp0);
				}
			}
			
			return ope;
		}
		
		/**
		 * 	チェックＧＲＰＮＯ単位のすべてのレコードのエラーＦＬＧをオンにする
		 * @param chkL
		 */
		protected MCMessageList setErrChkGrp(MCList<Chk02_RsltR> chkL) {
			
			MCMessageList msgL = new MCMessageList();

			Chk02_RsltR errDtl = chkL.getFirst(Chk02_RsltR.$err_flg, true);
			
			for (Chk02_RsltR r : chkL) {
				if (!r.err_flg()) {
					msgL.add(new MCMessage(r, null, MAUDL0013, toDispGUIIndex(r), toDispGUIIndex(errDtl)));
					r.err_flg(true);
				}
			}
			
			return msgL;
		}
		
		/**
		 * 売上部門変更前のDAC
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkUpdDac(MCList<Chk02_RsltR> chkL) {
			MCMessageList msgL = new MCMessageList();
			for (Chk02_RsltR r : chkL) {
				if (!isSame(r.sls_dpt_cd(), r.bef_sls_dpt_cd())) {
					msgL.addAll(checkWritableDptCdDac(r, Chk02_RsltR.$bef_sls_dpt_cd));
				}
			}
			return msgL;
		}
		
		/**
		 * 	固有チェック
		 * @return
		 */
		protected MCMessageList checkOther(MCList<Chk02_RsltR> chkL) {
			
			MCMessageList msgL = new MCMessageList();
			
			for (Chk02_RsltR r : chkL) {
				
				// 計上日≦請求起算日チェック
				msgL.addAll(checkAcDtBillBasisDt(r));
				
				msgL.addAll(chkShipAcDtAcDt(r));
				
				// 出荷実績同時計上チェック
				msgL.addAll(checkShipActSync(r));
				
				// 得意先禁止チェック
				msgL.addAll(checkStopCst(r));
				
				// 打切チェック
				msgL.addAll(checkAbort(r));
				
			}
			
			// インボイスチェック
			msgL.addAll(checkIV(chkL));
			
			return msgL;
		}
		
		/**
		 * 計上日≦請求起算日チェック
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkAcDtBillBasisDt(Chk02_RsltR r) {
			
			MCMessageList msgL = new MCMessageList();
			
			MAM_BP_R cstR = getBpCache(_slsActL.getFirst(_slsActIdxKey, r.sls_act_no()).cst_cd());
			MAM_BP_R acstR = getBpCache(cstR.acst_cd());
			MAM_BP_R bcstR = getBpCache(acstR.bcst_cd());
			
			// 売上都度請求以外、計上日≦請求起算日チェック
			if (!MAC_BILL_CL_TYP.isEACH_SLS(bcstR.bill_cl_typ())) {
				msgL.addAll(check(r, new String[] {Chk01_RsltR.$ac_dt, Chk01_RsltR.$bill_basis_dt}, new FXUCL_BeforeAfterValidater()));
			}
			
			return msgL;
		}
		
		protected MCMessageList chkShipAcDtAcDt(Chk02_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			MST_SLS_ACT_R slsActR = _slsActL.getFirst(_slsActIdxKey, r.sls_act_no());

			if (MAC_SLS_BASIS_TYP.isIN_BASIS(slsActR.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(slsActR.sls_basis_typ())) {
				MST_DLV_SLIP_R dlvSlipR = getFirstDlvSlipCache(slsActR.ship_dlv_slip_no());

				if (!isNull(dlvSlipR) && r.ac_dt().lt(dlvSlipR.ac_dt())) {
					msgL.add(new MCMessage(r, Chk01_RsltR.$ac_dt, MSBEL1067,
							toYMDString(dlvSlipR.ac_dt()), toYMDString(r.ac_dt()),
							toDispGUIIndex(r)));
				}
			}

			return msgL;
		}
		
		/**
		 * 全インボイス明細対象存在チェック（更新用）
		 * 
		 * @param chkL
		 * @return
		 */
		protected MCMessageList checkIV(MCList<Chk02_RsltR> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxkey = chkL.createIndex(Chk02_RsltR.$cst_iv_flg);
			// チェック対象のインボイスＮＯ
			MCList<Chk02_RsltR> ivL = chkL.subList(idxkey, true).groupBy(Chk02_RsltR.$iv_no);
			
			for (Chk02_RsltR ivR : ivL) {
				if (isNullOrNullVal(ivR.iv_no())) {
					for (Chk02_RsltR tgtR : chkL.subList(idxkey, true)) {
						msgL.add(new MCMessage(tgtR, Chk01_RsltR.$iv_no, MSBBL0254, toDispGUIIndex(tgtR)));
					}
					
					continue;
				}
				// 上り電文の対象インボイスＮＯを持つリストを取得
				MCList<Chk02_RsltR> tgtIvGrL = chkL.subList(Chk02_RsltR.$iv_no, ivR.iv_no());
				
				// インボイス明細トランに存在する対象インボイスＮＯを持つ件数を取得
				MST_IV_D_R ivd = MST_IV_D_R.create("IVD");
				MST_SLS_SCHD_R slss = MST_SLS_SCHD_R.create("SLSS");
				MCList<MST_IV_R> ivTblL = MCList.create(MST_IV_R.class);
				MST_IV_R t = MST_IV_R.create("T");
				MCQueryApiBuilder ivTblL_bldr = MCQueryApiBuilder.create(t);
				ivTblL_bldr.addSelect(ivd.iv_d_no);
				ivTblL_bldr.addLeftOuterJoin(ivd, bracket( t.iv_mng_no.eq(ivd.iv_mng_no)));
				ivTblL_bldr.addLeftOuterJoin(slss, bracket( ivd.iv_d_no.eq(slss.iv_d_no)));
				ivTblL.addStringColumn(MST_IV_D_R.$iv_d_no);
				ivTblL_bldr.setWhere(t.iv_no.eq(bind("1")), ivR.iv_no());
				dbSelect("MSBBL1320_MST_IV_S04", ivTblL, ivTblL_bldr);
				
				if (ivTblL.isEmpty()) {
					for (Chk02_RsltR tgtIvGrR : tgtIvGrL) {
						msgL.add(new MCMessage(tgtIvGrR, Chk01_RsltR.$iv_no, MSBBL0254, toDispGUIIndex(tgtIvGrR)));
					}
				}
				else if (tgtIvGrL.size() != ivTblL.size()) {
					for (Chk02_RsltR tgtIvGrR : tgtIvGrL) {
						msgL.add(new MCMessage(tgtIvGrR, Chk02_RsltR.$iv_no, MSBBL0204, tgtIvGrR.iv_no(),toDispGUIIndex(tgtIvGrR)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 出荷実績同時計上チェック
		 * @param rsltR チェック対象
		 * @return エラーメッセージリスト
		 */
		protected MCMessageList checkShipActSync(Chk02_RsltR rsltR) {
			
			MCMessageList msgL = new MCMessageList();
			
			MST_SLS_ACT_R slsActR = _slsActL.getFirst(MST_SLS_ACT_R.$sls_act_no, rsltR.sls_act_no());
			
			if (!isNull(slsActR) && !slsActR.isEmpty() && slsActR.ship_act_sync_flg()) {
				
				if (MAC_VIA_DLV_TYP.isVIA(getViaDlvTyp(rsltR.iv_no()))) {
					
					msgL.add(new MCMessage(rsltR, null, MSBBL0263, slsActR.sls_act_no(), toDispGUIIndex(rsltR)));	
				}
				else {
					msgL.add(new MCMessage(rsltR, null, MSBBL0261, slsActR.sls_act_no(), toDispGUIIndex(rsltR)));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 	取引禁止チェック(得意先)
		 * @return
		 */
		protected MCMessageList checkStopCst(Chk02_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			
			// 取引禁止チェック(得意先)
			boolean rslt = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_BP$F_IS_SLS_STOP", "02"),
					MAPA_BP$F_IS_SLS_STOP( bind("cst_cd"), bind("sls_dt")), r);
			if (rslt) {
				msgL.add(new MCMessage(r, Chk02_RsltR.$cst_cd, MSBBL0089, r.cst_cd(), toYMDString(r.sls_dt()), toDispGUIIndex(r)));
			}
			
			return msgL;
		}
		
		/**
		 * 打切チェック（更新用）
		 * 
		 * @param r
		 * @return
		 */
		protected MCMessageList checkAbort(Chk02_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			
			if (r.abort_flg()) {
				if (!isNull(r.sls_schd_no())) {
					MCList<MST_SLS_ACT_D_R> tmpL  = _slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_d_no, r.sls_act_d_no());
					if (!isNull(tmpL)) {
						if (MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ())) {
							MCNumber befBaseUnitQty = MCNumber.ZERO;
							MCNumber baseUnitQty = MCNumber.ZERO;
							MCNumber baseUnitSchdQty = MCNumber.ZERO;
							MST_SLS_SCHD_R slsSchdGrpR = null;
							MCList<Chk02_RsltR> tgtDtlL = null;
							
							if (r.sync_flg()) {
								slsSchdGrpR = _purcSchdGrpSlsSchdL.getFirst(_purcSchdGrpSlsIdxKey, r.purc_schd_no());
								tgtDtlL = up0().subList(upR->isSame(upR.purc_schd_no(), r.purc_schd_no()) && upR.sync_flg());
								
								MST_PURC_SCHD_R purcSchdR = _purcSchdL.getFirst(_purcSchdIdxKey, r.purc_schd_no());
								baseUnitSchdQty = purcSchdR.base_unit_schd_qty();
							}
							else {
								MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(MST_SLS_ACT_D_R.$sls_act_d_no, r.sls_act_d_no());
								slsSchdGrpR = _purcActGrpSlsSchdL.getFirst(_purcActIdxKey, slsActDR.purc_act_d_no());
								tgtDtlL = up0().subList(upR->isSame(upR.sls_schd_no(), r.sls_schd_no()) && !upR.sync_flg());
								baseUnitSchdQty = slsSchdGrpR.base_unit_qty();
							}
							
							for (Chk02_RsltR tgtDtlR : tgtDtlL) {
								
								if (!isNull(tgtDtlR.sls_act_d_no())) {
									MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(MST_SLS_ACT_D_R.$sls_act_d_no, tgtDtlR.sls_act_d_no());
									if (!isNull(slsActDR)) {
										baseUnitQty = baseUnitQty.add(slsActDR.base_unit_qty());
										befBaseUnitQty = befBaseUnitQty.add(slsActDR.getNumberNE("bef_base_unit_qty"));
									}
								}
							}
							
							if ((!tmpL.get(0).getBooleanNE("old_abort_flg") || baseUnitQty.gt(befBaseUnitQty)) &&
									slsSchdGrpR.base_unit_sls_qty().subtract(befBaseUnitQty).add(baseUnitQty).gte(
											baseUnitSchdQty)) {
								msgL.add(new MCMessage(r, Chk01_RsltR.$abort_flg, MSBBL0115, toDispGUIIndex(r)));
							}
						}
						else {
							MCNumber schdQty = MCNumber.ZERO;
							MCNumber slsQty = MCNumber.ZERO;
							
							// 仕入直送売上（仕入後計上）、検収基準売上：売上予定の基準単位数量を打切の閾値に設定
							if ((MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ()) && !r.sync_flg())
									|| MSC_SLS_TGT_TYP.isXFR_IN_SLS(r.sls_tgt_typ()) || MSC_SLS_TGT_TYP.isARRIVAL_SLS(r.sls_tgt_typ())) {
								schdQty = tmpL.get(0).getNumberNE("schd_base_unit_qty");
								slsQty = tmpL.get(0).getNumberNE("schd_base_unit_sls_qty");
							}
							else {
								// 仕入直送売上（仕入同時計上）：仕入予定の基準単位予定数量を打切の閾値に設定
								if (MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ()) && r.sync_flg()) {
									schdQty = tmpL.get(0).getNumberNE("base_unit_schd_qty");
									slsQty = tmpL.get(0).getNumberNE("sum_base_unit_sls_qty");
								}
								// 出荷指図対象外売上：出荷進捗の基準単位数量を打切の閾値に設定
								else {
									schdQty = tmpL.get(0).getNumberNE("pr_base_unit_qty");
									slsQty = tmpL.get(0).getNumberNE("sum_base_unit_sls_qty");
								}
							}
							if ((!tmpL.get(0).getBooleanNE("old_abort_flg") || tmpL.get(0).base_unit_qty().gt(tmpL.get(0).getNumberNE("bef_base_unit_qty"))) &&
									slsQty
									.subtract(nvl(tmpL.get(0).getNumberNE("bef_base_unit_qty"), MCNumber.ZERO))
									.add(tmpL.get(0).base_unit_qty())
									.gte(schdQty)) {
								msgL.add(new MCMessage(r, Chk01_RsltR.$abort_flg, MSBBL0115, toDispGUIIndex(r)));
							}
						}
					}
				}
			}
			
			return msgL;
		}
		/**
		 * 仕入直送の売上予定を取得する。<br>
		 * @param dtlL 仕入売上明細の上り電文
		 */
		protected void getPurcSlsSchd(MCList<Chk02_RsltR> dtlL) {
			
			MCList<Chk02_RsltR> ddlvSlsL = dtlL.subList(r->MSC_SLS_TGT_TYP.isDDLV_SLS(r.sls_tgt_typ()));
			if (!ddlvSlsL.isEmpty()) {
				MCList<MST_SLS_SCHD_R> slsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MST_SLS_SCHD_R slsSchd = MST_SLS_SCHD_R.create("SLSSCHD");
				MCQueryApiBuilder slsSchdL_bldr = MCQueryApiBuilder.create(slsSchd);
				slsSchdL_bldr.setWhere(slsSchd.purc_schd_no.eq(bind("purc_schd_no")));
				dbSelect("MSBBL1320_MST_SLS_SCHD_S03", slsSchdL, slsSchdL_bldr, ddlvSlsL);
				
				_purcSchdGrpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MCGroupByPolicy purcSchdPolicy = new MCGroupByPolicy(MST_SLS_SCHD_R.$purc_schd_no);
				purcSchdPolicy.sum(MST_SLS_SCHD_R.$base_unit_qty, MST_SLS_SCHD_R.$base_unit_abort_qty, MST_SLS_SCHD_R.$base_unit_sls_qty);
				_purcSchdGrpSlsSchdL.setAll(slsSchdL.groupBy(purcSchdPolicy));
				_purcSchdGrpSlsIdxKey = _purcSchdGrpSlsSchdL.createIndex(MST_SLS_SCHD_R.$purc_schd_no);
				
				_purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
				MST_PURC_SCHD_R purcSchd = MST_PURC_SCHD_R.create("PURCSCHD");
				MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(purcSchd);
				dbSelectKey("MSBBL1320_MST_PURC_SCHD_S03", _purcSchdL, purcSchdL_bldr, dtlL);
				_purcSchdIdxKey = _purcSchdL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
				
				_purcActGrpSlsSchdL = MCList.create(MST_SLS_SCHD_R.class);
				MCGroupByPolicy purcActPolicy = new MCGroupByPolicy(MST_SLS_SCHD_R.$purc_act_d_no);
				purcActPolicy.sum(MST_SLS_SCHD_R.$base_unit_qty, MST_SLS_SCHD_R.$base_unit_abort_qty, MST_SLS_SCHD_R.$base_unit_sls_qty);
				_purcActGrpSlsSchdL.setAll(slsSchdL.groupBy(purcActPolicy));
				_purcActIdxKey = _purcActGrpSlsSchdL.createIndex(MST_SLS_SCHD_R.$purc_act_d_no);
			}
		}
		
		/**
		 * 仕入実績登録チェックサービス呼出（更新用）
		 * 
		 * @param ope
		 */
		protected void callPurcActRegSvChk03(MSBDL_PurcActRegService.Purc_Chk03 ope) {
			if (!ope.up0().isEmpty()) {
				ope.up3().crt_param_cache_flg(true);
				ope.up3().purc_ddlv_reg_exec_flg(true);
				ope.exec();
				// ヘッダ、明細、詳細のいずれかでもエラーならばエラー
				copyErrFlg(up0(), ope.down0());
				copyErrFlg(up0(), ope.down1());
				copyErrFlg(up0(), ope.down2());
			}
		}
		
		/**
		 * 	仕入実績登録チェックサービス呼出電文作成（更新用）
		 */
		protected MSBDL_PurcActRegService.Purc_Chk03 makePurcActRegSvChk03(MCList<Chk02_RsltR> chkL) {
			MSBDL_PurcActRegService.Purc_Chk03 ope = MSBDL_PurcActRegService.crtPurc_Chk03();

			MCList<MST_SLS_SCHD_R> wkL = MCList.create(MST_SLS_SCHD_R.class);
			for (Chk02_RsltR chkR : chkL) {
				if (chkR.sync_flg()) {
					MST_SLS_SCHD_R wkR = MST_SLS_SCHD_R.create();
					wkR.sls_schd_no(chkR.sls_schd_no());
					wkL.add(wkR);
				}
			}
			if (wkL.isEmpty()) {
				return ope;
			}
			
			MCList<Purc_Chk03_HdrR> oUp0L = MCList.create(Purc_Chk03_HdrR.class);
			MCList<Purc_Chk03_DtlR> oUp1L = MCList.create(Purc_Chk03_DtlR.class);
			oUp1L.addNumberColumn("po_base_unit_qty");
			oUp1L.addStringColumn("purc_amt_rnd_typ");
			oUp1L.addStringColumn("ship_pr_loc_cd");
			oUp1L.addStringColumn("ship_pr_str_ln_cd");
			oUp1L.addStringColumn("pr_loc_wg_cd");
			oUp1L.addNumberColumn("purc_trd_cur_dscnt_amt");
			MCIndexKey ikUp0 = null;
			MCIndexKey ikUp1 = null;
			MCIndexKey ikSlsActD = _slsActDL.createIndex(MST_SLS_ACT_D_R.$purc_act_d_no);

			if (!wkL.isEmpty()) {
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T"));
				dbWkDelete("MSBBL1320_MSW_SLS_SCHD_D06", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBBL1320_MSW_SLS_SCHD_I07", wkL, wkL_bldr.getBaseDbc());
				
				MCRow row = MCRow.create();
				row.addDateColumn("today", chkL.getDate(0, "sls_dt"));

				executeQuery(oUp0L, MSBBL1320_MST_SLS_SCHD_S04(), row);
				executeQuery(oUp1L, MSBBL1320_MST_PO_D_S01(), row);
				
				ikUp0 = oUp0L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);
				ikUp1 = oUp1L.createIndex(MST_SLS_SCHD_R.$sls_schd_no);

				dbWkDelete("MSBBL1320_MSW_SLS_SCHD_D07", wkL_bldr.getBaseDbc());
			}
			Purc_Chk03_IoR oUp2 = null;
			MCList<Purc_Chk03_IoR> oUp2L = null;
			MCList<Chk02_PurcActIoR> purdActIoL = null;
			
			chkL.setDateNE("today", getToday());
			
			for (Chk02_RsltR chkR : chkL) {
				if (chkR.sync_flg()) {
					
					purdActIoL = MCList.create(Chk02_PurcActIoR.class);
					
					Purc_Chk03_HdrR oUp0 = oUp0L.getFirst(ikUp0, chkR.sls_schd_no());	// ヘッダ
					Purc_Chk03_DtlR oUp1 = oUp1L.getFirst(ikUp1, chkR.sls_schd_no());	// 明細
					oUp2L = MCList.create(Purc_Chk03_IoR.class);	// 詳細
					
					// ヘッダ情報の設定
					executeQuery(chkR, MSBBL1320_MST_SLS_ACT_D_S03(), chkR);
					
					copy(oUp0, chkR, createMap_Purc_Chk03_HdrR_Chk02_RsltR());
					oUp0.peg_no(chkR.peg_no());
					ope.up0().add(oUp0);
					chkR.po_no(oUp0.po_no());
					
					// 明細情報の設定
					copy(oUp1, chkR, createMap_Purc_Chk03_DtlR_Chk02_RsltR());
					
					oUp1.hdr_peg_no(oUp0.peg_no());
					oUp1.peg_no(oUp0.peg_no());
					
					// 基準単位数
					oUp1.base_unit_qty(getBaseUnitQty(
							oUp1.trd_unit_qty(),
							oUp1.trd_unit_cd(),
							oUp1.base_unit_cd(),
							oUp1.itm_cd(),
							oUp1.itm_sub1(),
							oUp1.itm_sub2(),
							oUp1.itm_sub3()));
					
					// 取引通貨明細値引金額
					MAM_CUR_R trdCurR = getCur(chkR.trd_cur_cd());
					MST_SLS_ACT_D_R slsActD = _slsActDL.getFirst(ikSlsActD, chkR.purc_act_d_no());
					// 仕入数量が変わらない場合、値引額を再計算しない。
					if (isSame(slsActD.base_unit_qty(), slsActD.getNumberNE("bef_base_unit_qty"))) {
						oUp1.trd_cur_dscnt_amt(oUp1.getNumberNE("purc_trd_cur_dscnt_amt"));
					}
					else if (!isNull(oUp1.trd_cur_dscnt_amt())) {
						oUp1.trd_cur_dscnt_amt(
							oUp1.trd_cur_dscnt_amt().multiply(oUp1.base_unit_qty())
							.divide(oUp1.getNumberNE("po_base_unit_qty"), trdCurR.amt_dec_place().intValue(), MAC_RND_TYP.toMC(oUp1.getStringNE("purc_amt_rnd_typ")))
						);
					}
					
					ope.up1().add(oUp1);
					
					MCList<MST_PURC_ACT_IO_R> purcActIoL = MCList.create(MST_PURC_ACT_IO_R.class);
					MST_PURC_ACT_IO_R purcActIoL_t = MST_PURC_ACT_IO_R.create("T");
					MCQueryApiBuilder purcActIoL_bldr = MCQueryApiBuilder.create(purcActIoL_t);
					purcActIoL_bldr.setWhere(purcActIoL_t.purc_act_d_no.eq(bind("1")), chkR.purc_act_d_no());
					purcActIoL_bldr.addWhereWithAnd(purcActIoL_t.purc_act_d_seq.eq(bind("1")), chkR.purc_act_d_seq());
					dbSelect("MSBBL1320_MST_PURC_ACT_IO_S01", purcActIoL, purcActIoL_bldr);
					
					setPurcActIoPegNo(purcActIoL);
					
					if (!purcActIoL.isEmpty()) {
						
						if (purcActIoL.size() == 1) {
							
							oUp2 = ope.up2().createRow();	// 詳細
							// 詳細情報の設定
							copy(oUp2, oUp1, createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR(chkR));
							
							oUp2.peg_no(purcActIoL.get(0).getNumberNE("peg_no"));
							
							oUp2.purc_act_io_no(purcActIoL.get(0).purc_act_io_no());
							oUp2.purc_act_io_seq(purcActIoL.get(0).purc_act_io_seq());
							
							oUp2.base_unit_cd(oUp1.base_unit_cd());
							oUp2.base_unit_qty(oUp1.base_unit_qty());
							
							oUp2.trd_unit_cd(oUp1.trd_unit_cd());
							oUp2.trd_unit_qty(oUp1.trd_unit_qty());
							
							if (isPack(oUp1.itm_cd(), oUp1.itm_sub1(), oUp1.itm_sub2(), oUp1.itm_sub3(), oUp1.trd_unit_cd())){
								oUp2.pack_unit_cd(oUp1.trd_unit_cd());
								oUp2.pack_unit_qty(oUp1.trd_unit_qty());
							}
							else {
								oUp2.pack_unit_cd(oUp1.base_unit_cd());
								oUp2.pack_unit_qty(oUp1.base_unit_qty());
							}
							
							oUp2L.add(oUp2);
						}
						else {
							
							for (MST_PURC_ACT_IO_R purcActIoR : purcActIoL) {
								
								oUp2 = ope.up2().createRow();	// 詳細
								
								copy(oUp2, oUp1, createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR(chkR));
								
								oUp2.purc_act_io_no(purcActIoR.purc_act_io_no());
								oUp2.purc_act_io_seq(purcActIoR.purc_act_io_seq());
								
								oUp2.peg_no(purcActIoR.getNumberNE("peg_no"));
								
								oUp2.base_unit_cd(purcActIoR.base_unit_cd());
								oUp2.base_unit_qty(purcActIoR.base_unit_qty());
								
								oUp2.trd_unit_cd(purcActIoR.trd_unit_cd());
								oUp2.trd_unit_qty(purcActIoR.trd_unit_qty());
								
								if (isPack(oUp1.itm_cd(), oUp1.itm_sub1(), oUp1.itm_sub2(), oUp1.itm_sub3(), purcActIoR.trd_unit_cd())){
									oUp2.pack_unit_cd(purcActIoR.trd_unit_cd());
									oUp2.pack_unit_qty(purcActIoR.trd_unit_qty());
								}
								else {
									oUp2.pack_unit_cd(purcActIoR.base_unit_cd());
									oUp2.pack_unit_qty(purcActIoR.base_unit_qty());
								}
								
								oUp2L.add(oUp2);
							}
						}
						
						oUp2L.setValue(Purc_Chk03_IoR.$crt_lot_flg, chkR.crt_lot_flg());
						oUp2L.setValue(Purc_Chk03_IoR.$gi_loc_cd, oUp1.getStringNE("ship_pr_loc_cd"));
						oUp2L.setValue(Purc_Chk03_IoR.$gi_str_ln_cd, oUp1.getStringNE("str_ln_cd"));
						oUp2L.setValue(Purc_Chk03_IoR.$gi_wg_cd, oUp1.getStringNE("pr_loc_wg_cd"));
						oUp2L.setValue(Purc_Chk03_IoR.$from_gd_cd, oUp1.gd_cd());
						
						oUp2L.setValueNE(Purc_Chk03_IoR.$dtl_peg_no, chkR.peg_no());
						
						ope.up2().addAll(oUp2L);
					}
					
					copyPegNoAndAttr(purdActIoL, purcActIoL);
					purdActIoL.setValueNE(Purc_Chk03_IoR.$dtl_peg_no, chkR.peg_no());
					
					_purcActIoL.addAll(purdActIoL);
				}
			}
			
			return ope;
		}
		
		/**
		 * 仕入実績受払の紐付けＮＯを設定する。
		 * @param purcActIoL 仕入実績受払リスト
		 */
		protected void setPurcActIoPegNo(MCList<MST_PURC_ACT_IO_R> purcActIoL) {
			
			purcActIoL.addNumberColumn("peg_no");
			MCNumber pegNo = (MCNumber)_purcActIoL.max(Chk02_PurcActIoR.$peg_no);
			for (MST_PURC_ACT_IO_R purcActIoR : purcActIoL) {
				
				if (isNull(pegNo)) {
					pegNo = MCNumber.ZERO;
				}
				else {
					pegNo = pegNo.add(1);
				}
				
				purcActIoR.setValue("peg_no", pegNo);
			}
		}
		
		protected Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<Purc_Chk03_IoR,Purc_Chk03_DtlR> createMap_Purc_Chk03_IoR_Purc_Chk03_DtlR(Chk02_RsltR chkR) {
			return new Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<Purc_Chk03_IoR, Purc_Chk03_DtlR>(chkR);
		}
		
		public class Map_Purc_Chk03_IoR_Purc_Chk03_DtlR<D extends Purc_Chk03_IoR, S extends Purc_Chk03_DtlR> extends MCRowMapper<D,S>{
			
			Chk02_RsltR _chkR;
			
			public Map_Purc_Chk03_IoR_Purc_Chk03_DtlR(Chk02_RsltR chkR) {
				_chkR = chkR;
			}
			
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_no, Purc_Chk03_DtlR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$purc_act_d_seq, Purc_Chk03_DtlR.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_IoR.$ver_no, Purc_Chk03_DtlR.$ver_no);
				addColumnPathMap(Purc_Chk03_IoR.$gd_cd, Purc_Chk03_DtlR.$gd_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_cd, Purc_Chk03_DtlR.$dlv_loc_cd);
				addColumnPathMap(Purc_Chk03_IoR.$dlv_loc_wg_cd, Purc_Chk03_DtlR.$dlv_loc_wg_cd);
				addColumnPathMap(Purc_Chk03_IoR.$str_ln_cd, Purc_Chk03_DtlR.$str_ln_cd);
				addColumnPathMap(Purc_Chk03_IoR.$lot_no, Purc_Chk03_DtlR.$lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$sublot_no, Purc_Chk03_DtlR.$sublot_no);
				addColumnPathMap(Purc_Chk03_IoR.$quality_typ, Purc_Chk03_DtlR.$quality_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_insp_typ, Purc_Chk03_DtlR.$stk_insp_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_id_typ, Purc_Chk03_DtlR.$stk_id_typ);
				addColumnPathMap(Purc_Chk03_IoR.$stk_bp_cd, Purc_Chk03_DtlR.$stk_bp_cd);
				addColumnPathMap(Purc_Chk03_IoR.$bp_lot_no, Purc_Chk03_DtlR.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_no, Purc_Chk03_DtlR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_IoR.$bp_dlv_slip_d_no, Purc_Chk03_DtlR.$bp_dlv_slip_d_no);
				addColumnPathMap(Purc_Chk03_IoR.$ship_fr_valid_dt, Purc_Chk03_DtlR.$ship_fr_valid_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
		
		protected Map_Purc_Chk03_DtlR_Chk02_RsltR<Purc_Chk03_DtlR,Chk02_RsltR> createMap_Purc_Chk03_DtlR_Chk02_RsltR() {
			return new Map_Purc_Chk03_DtlR_Chk02_RsltR<Purc_Chk03_DtlR, Chk02_RsltR>();
		}
		
		public class Map_Purc_Chk03_DtlR_Chk02_RsltR<D extends Purc_Chk03_DtlR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_no, Chk02_RsltR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_seq, Chk02_RsltR.$purc_act_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_no, Chk02_RsltR.$purc_act_d_no);
				addColumnPathMap(Purc_Chk03_DtlR.$purc_act_d_seq, Chk02_RsltR.$purc_act_d_seq);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_cd, Chk02_RsltR.$trd_unit_cd);
				addColumnPathMap(Purc_Chk03_DtlR.$trd_unit_qty, Chk02_RsltR.$trd_unit_qty);
				addColumnPathMap(Purc_Chk03_DtlR.$abort_flg, Chk02_RsltR.$abort_flg);
				addColumnPathMap(Purc_Chk03_DtlR.$lot_no, Chk02_RsltR.$lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$sublot_no, Chk02_RsltR.$sublot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$ver_no, Chk02_RsltR.$ver_no);
				addColumnPathMap(Purc_Chk03_DtlR.$ship_fr_valid_dt, Chk02_RsltR.$ship_fr_valid_dt);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_lot_no, Chk02_RsltR.$bp_lot_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_no, Chk02_RsltR.$bp_dlv_slip_no);
				addColumnPathMap(Purc_Chk03_DtlR.$bp_dlv_slip_d_no, Chk02_RsltR.$bp_dlv_slip_d_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.disp_seq(1);
				dest.purc_id_typ(MAC_PURC_ID_TYP.PURC.value());
			}
		}
		
		protected Map_Purc_Chk03_HdrR_Chk02_RsltR<Purc_Chk03_HdrR,Chk02_RsltR> createMap_Purc_Chk03_HdrR_Chk02_RsltR() {
			return new Map_Purc_Chk03_HdrR_Chk02_RsltR<Purc_Chk03_HdrR, Chk02_RsltR>();
		}

		public class Map_Purc_Chk03_HdrR_Chk02_RsltR<D extends Purc_Chk03_HdrR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_no, Chk02_RsltR.$purc_act_no);
				addColumnPathMap(Purc_Chk03_HdrR.$purc_act_seq, Chk02_RsltR.$purc_act_seq);;
				addColumnPathMap(Purc_Chk03_HdrR.$ac_dt, Chk02_RsltR.$ac_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$can_ac_dt, Chk02_RsltR.$can_ac_dt);
				addColumnPathMap(Purc_Chk03_HdrR.$ptax_dt, Chk02_RsltR.$ptax_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

				dest.purc_dt(src.sls_dt());
				if (isNull(dest.pay_basis_dt()) && isNull(dest.pay_schd_dt())) {
					dest.pay_basis_dt(src.sls_dt());
				}
			}
		}
		
		/**
		 * 更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList checkUpdCntr() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_RsltR> chkL = up0().groupBy(Chk02_RsltR.$sls_act_no, Chk02_RsltR.$upd_cntr);
			for (Chk02_RsltR chkR : chkL) {
				
				MST_SLS_ACT_R slsActR = _slsActL.getFirst(MST_SLS_ACT_R.$sls_act_no, chkR.sls_act_no());
				
				if (isNull(slsActR) || slsActR.isEmpty()) {
					msgL.addAll(checkUpdCntrNE(chkR, Chk02_RsltR.$upd_cntr, null));
				} 
				else {
					msgL.addAll(checkUpdCntrNE(chkR, Chk02_RsltR.$upd_cntr, slsActR));
				}
			}
			
			// CauseRowを差し替える
			MCIndexKey idxkey = up0().createIndex(Chk02_RsltR.$sls_act_no);
			for (MCMessage msg : msgL) {
				
				Chk02_RsltR errMsgR = (Chk02_RsltR)msg.getCauseRow();
				Chk02_RsltR causeRow = up0().getFirst(idxkey, errMsgR.sls_act_no());
				msg.setCauseRow(causeRow, msg.getCauseColumn());
			}
			
			setErrFlg(msgL);
			
			MCList<Chk02_RsltR>[] chkGrpL = up0().groupList(Chk01_RsltR.$chk_grp_no);
			for (MCList<Chk02_RsltR> chkRsltL : chkGrpL) {
				if (hasErrFlgOn(chkRsltL)) {
					msgL.addAll(setErrChkGrp(chkRsltL));
				}
			}
			
			return msgL;
		}
		
		/**
		 * 上り電文と取得した売上実績のデータをマージし登録データを作成する
		 * 
		 */
		protected void mrgData() {
			// 更新情報のマージ
			for (MST_SLS_ACT_R slsActR : _slsActL) {
				MCList<Chk02_RsltR> tgtL = up0().subList(Chk02_RsltR.$sls_act_no, slsActR.sls_act_no());
				Chk02_RsltR hdrR = tgtL.get(0);
				// 更新項目に差し替え
				slsActR.sls_dt(hdrR.sls_dt());					// 売上日
				slsActR.ac_dt(hdrR.ac_dt());					// 計上日
				slsActR.addDateColumn("can_ac_dt", hdrR.can_ac_dt()); // 取消計上日
				slsActR.bill_basis_dt(hdrR.bill_basis_dt());	// 請求起算日
				slsActR.rcv_schd_dt(hdrR.rcv_schd_dt());		// 入金予定日
				slsActR.ship_tm(hdrR.ship_tm());				// 出荷日時
				slsActR.dlv_tm(hdrR.dlv_tm());					// 納品日時
				slsActR.sls_usr_cd(hdrR.sls_usr_cd());			// 売上担当者ＣＤ
				slsActR.sls_dpt_cd(hdrR.sls_dpt_cd());			// 売上部門ＣＤ
				setWgInfo(slsActR);
				slsActR.ar_dpt_cd(hdrR.ar_dpt_cd());			// 債権部門ＣＤ
				slsActR.xrate(hdrR.xrate());					// 為替レート
				slsActR.ptax_xrate(hdrR.ptax_xrate());			// 納税為替レート
				slsActR.trd_rmrks(hdrR.trd_rmrks());			// 取引備考
				slsActR.intr_rmrks(hdrR.intr_rmrks());			// 内部備考
				slsActR.sub_char1(hdrR.sub_char1());			// 予備１
				slsActR.sub_char2(hdrR.sub_char2());			// 予備２
				slsActR.sub_char3(hdrR.sub_char3());			// 予備３
				setIvInfo(slsActR);
				setBpInfo(slsActR);
				
				MAM_BP_R cst = getBpCache(slsActR.cst_cd());
				
				if (!isNull(cst)) {
					tgtL.setBoolean(Chk02_RsltR.$cst_iv_flg, cst.cst_iv_flg());
				}
				
				// ヘッダに紐づく明細情報
				MCList<MST_SLS_ACT_D_R> slsActDL = _slsActDL.subList(MST_SLS_ACT_D_R.$sls_act_no, slsActR.sls_act_no());
				
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					for (Chk02_RsltR tgtDR : tgtL) {
						if (isSame(slsActDR.sls_act_d_no(), tgtDR.sls_act_d_no())) {
							slsActDR.trd_unit_cd(tgtDR.trd_unit_cd());		// 取引単位ＣＤ
							slsActDR.trd_unit_qty(tgtDR.trd_unit_qty());	// 取引単位数量
							// 基準単位換算
							slsActDR.base_unit_qty(getBaseUnitQty(
									slsActDR.trd_unit_qty(),
									slsActDR.trd_unit_cd(),
									slsActDR.base_unit_cd(),
									slsActDR.itm_cd(),
									slsActDR.itm_sub1(),
									slsActDR.itm_sub2(),
									slsActDR.itm_sub3()));
							slsActDR.trd_cur_upri(tgtDR.trd_cur_upri());
							slsActDR.interim_flg(tgtDR.interim_flg());
							slsActDR.trd_cur_amt(tgtDR.trd_cur_amt());
							slsActDR.trd_cur_tax_amt(tgtDR.trd_cur_tax_amt());
							slsActDR.base_cur_upri(tgtDR.base_cur_upri());
							slsActDR.base_cur_amt(tgtDR.base_cur_amt());
							slsActDR.base_cur_tax_amt(tgtDR.base_cur_tax_amt());
							slsActDR.ptax_cur_upri(tgtDR.ptax_cur_upri());
							slsActDR.ptax_cur_amt(tgtDR.ptax_cur_amt());
							slsActDR.ptax_cur_tax_amt(tgtDR.ptax_cur_tax_amt());
							slsActDR.tax_cd(tgtDR.tax_cd());				// 税ＣＤ
							slsActDR.addNumberColumn("tax_rate");
							slsActDR.addStringColumn("tax_typ");
							slsActDR.addBooleanColumn("inc_tax_flg");
							slsActDR.setNumberNE("tax_rate", tgtDR.tax_rate());
							slsActDR.setStringNE("tax_typ", tgtDR.tax_typ());
							slsActDR.setBooleanNE("inc_tax_flg", tgtDR.inc_tax_flg());
							slsActDR.trd_cur_dscnt_amt(tgtDR.trd_cur_dscnt_amt());		// 取引通貨値引額
							slsActDR.base_cur_dscnt_amt(tgtDR.base_cur_dscnt_amt());		// 基準通貨値引額
							slsActDR.ptax_cur_dscnt_amt(tgtDR.ptax_cur_dscnt_amt());		// 納税通貨値引額
							slsActDR.dscnt_rsn_cd(tgtDR.dscnt_rsn_cd());				// 値引理由ＣＤ
							slsActDR.bill_crryovr_times(tgtDR.bill_crryovr_times());	// 請求繰越回数
							slsActDR.rsn_cd(hdrR.sls_rsn_cd());				// 売上理由ＣＤ
							slsActDR.bd_dpt_cd(hdrR.bd_dpt_cd());			// 負担部門ＣＤ
							slsActDR.trd_d_rmrks(tgtDR.trd_d_rmrks());		// 取引明細備考
							slsActDR.intr_rmrks(tgtDR.intr_d_rmrks());		// 内部備考
							slsActDR.sub_char1(tgtDR.dtl_sub_char1());		// 明細予備１
							slsActDR.sub_char2(tgtDR.dtl_sub_char2());		// 明細予備２
							slsActDR.sub_char3(tgtDR.dtl_sub_char3());		// 明細予備３
							
							setSlsTgtTyp(slsActR, slsActDR);
							setAbortFlg(slsActDR, tgtDR.abort_flg());
							
							slsActDR.cost_upri(tgtDR.cost_upri());
							slsActDR.cost_amt(MSUCL_SlsUtil.getCostAmt(slsActDR.cost_upri(), slsActDR.base_unit_qty(), getBaseCur().amt_dec_place())); //原価金額
							slsActDR.wtax_rate(tgtDR.wtax_rate());
							
							if (!isNull(tgtDR.lot_no())) {
								slsActDR.lot_no(tgtDR.lot_no());
							}
							if (!isNull(tgtDR.sublot_no())) {
								slsActDR.sublot_no(tgtDR.sublot_no());
							}
							tgtDR.sls_tgt_typ(slsActR.getStringNE("sls_tgt_typ"));
							tgtDR.purc_schd_no(slsActDR.getStringNE("purc_schd_no"));
							tgtDR.lot_mng_typ(slsActDR.getStringNE("lot_mng_typ"));
							tgtDR.lot_no_typ(slsActDR.getStringNE("lot_no_typ"));
							tgtDR.lot_no_ptn_cd(slsActDR.getStringNE("lot_no_ptn_cd"));
							tgtDR.sublot_mng_typ(slsActDR.getStringNE("sublot_mng_typ"));
							tgtDR.sublot_no_typ(slsActDR.getStringNE("sublot_no_typ"));
							tgtDR.sublot_no_ptn_cd(slsActDR.getStringNE("sublot_no_ptn_cd"));
							tgtDR.itm_cd(slsActDR.itm_cd());
							tgtDR.itm_sub1(slsActDR.itm_sub1());
							tgtDR.itm_sub2(slsActDR.itm_sub2());
							tgtDR.itm_sub3(slsActDR.itm_sub3());
							tgtDR.sno1(slsActDR.sno1());
							tgtDR.sno2(slsActDR.sno2());
							tgtDR.sno3(slsActDR.sno3());
							tgtDR.sno4(slsActDR.sno4());
							tgtDR.sls_cststk_flg(slsActDR.getBooleanNE("sls_cststk_flg"));
							// 変更対象となった明細に紐づく詳細情報
							MCList<MST_SLS_ACT_IO_R> slsIoL = _slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, slsActDR.sls_act_d_no());
							// 明細：詳細が１：１の場合は明細の数量を採用
							// 明細：詳細が１：Nの場合は受払の数量のまま（複数詳細の場合、明細の数量は変更できない）
							if (slsIoL.size() == 1) {
								
								if (!isNull(slsIoL.get(0).trd_unit_qty())
										&& !isSame(slsIoL.get(0).trd_unit_cd(), slsActDR.trd_unit_cd())
										&&  (!isNull(slsActDR.getStringNE("sls_schd_iv_no")) 
												|| ((MAC_SLS_BASIS_TYP.isIN_BASIS(slsActR.sls_basis_typ()) || MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(slsActR.sls_basis_typ())) && !isNull(slsActDR.getStringNE("sls_schd_dlv_slip_d_no"))))) {
									// インボイス取引または検収売上の場合、出荷実績の通りに売上実績受払を計上する
									MAVM_ITM_UNIT_R itmUnitR = getItmUnit(slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3(), slsActDR.trd_unit_cd());
									MAVM_ITM_UNIT_R itmBaseUnitR = getItmUnit(slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3(), slsActDR.base_unit_cd());
									MAVM_ITM_UNIT_R itmIoUnitR = getItmUnit(slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3(), slsIoL.get(0).trd_unit_cd());
									MCNumber convQty = unitConv(slsActDR.trd_unit_qty(),
											itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
											itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ(),
											itmIoUnitR.conv_base_qty(), itmIoUnitR.conv_qty(),
											itmIoUnitR.dec_place(), itmIoUnitR.rnd_typ(), true);
									
									if (isNull(convQty)) {
										slsIoL.get(0).trd_unit_cd(slsActDR.trd_unit_cd());
										slsIoL.get(0).trd_unit_qty(slsActDR.trd_unit_qty());
									}
									else {
										slsIoL.get(0).trd_unit_qty(convQty);
									}
								}
								else {
									slsIoL.get(0).trd_cur_upri(slsActDR.trd_cur_upri());
									slsIoL.get(0).trd_unit_cd(slsActDR.trd_unit_cd());
									slsIoL.get(0).trd_unit_qty(slsActDR.trd_unit_qty());
								}
								slsIoL.get(0).base_unit_cd(slsActDR.base_unit_cd());
								slsIoL.get(0).base_unit_qty(slsActDR.base_unit_qty());
								// 荷姿
								if (isPack(slsActDR.itm_cd(), slsActDR.itm_sub1(), slsActDR.itm_sub2(), slsActDR.itm_sub3(), slsIoL.get(0).trd_unit_cd())) {
									slsIoL.get(0).pack_unit_cd(slsIoL.get(0).trd_unit_cd());
									slsIoL.get(0).pack_unit_qty(slsIoL.get(0).trd_unit_qty());
								}
								else {
									// 基準単位数量を荷姿にする
									slsIoL.get(0).pack_unit_cd(slsActDR.base_unit_cd());
									slsIoL.get(0).pack_unit_qty(slsActDR.base_unit_qty());
								}
								slsIoL.get(0).sync_flg(tgtDR.sync_flg());
								if (!isNull(slsActDR.lot_no())) {
									slsIoL.get(0).lot_no(slsActDR.lot_no());
								}
								if (!isNull(slsActDR.sublot_no())) {
									slsIoL.get(0).sublot_no(slsActDR.sublot_no());
								}
							}
							break;
						}
					}
				}
			}
		}
		
		protected void setAbortFlg(MST_SLS_ACT_D_R slsActDR, boolean abortFlg) {
			slsActDR.addBooleanColumn("abort_flg");
			slsActDR.setBooleanNE("abort_flg", abortFlg);
		}
		
		/**
		 * 処理対象売上実績の排他とデータ取得
		 */
		protected void lockAndCrrctData() {
			MCList<Chk02_RsltR> lockL = up0().groupBy(Chk02_RsltR.$sls_act_no, Chk02_RsltR.$sls_act_rev);
			
			// 売上実績
			MST_SLS_ACT_R t1 = MST_SLS_ACT_R.create("T");
			MCQueryApiBuilder slsActL_bldr = MCQueryApiBuilder.create(t1);
			MST_SLS_ACT_R S1W = MST_SLS_ACT_R.create("W");

			slsActL_bldr.setWhere(t1.sls_act_no.eq(bind("sls_act_no")));
			slsActL_bldr.addWhereWithAnd(t1.sls_act_rev.eq(bind("sls_act_rev")));
			slsActL_bldr.addWhereWithAnd(t1.sls_act_seq.eq(subQuery() .select(min(S1W.sls_act_seq)) .from(S1W) 
					.where( S1W.sls_act_no.eq(bind("sls_act_no")) 
					.and(S1W.sls_act_rev.eq(bind("sls_act_rev"))) )));
			dbSelectForUpdateNoWait("MSBBL1320_MST_SLS_ACT_S02", _slsActL, slsActL_bldr, lockL);
			
			// 売上実績トランより情報を取得
			for (MST_SLS_ACT_R slsActR : _slsActL) {
				// 売上実績ヘッダに紐づく売上実績明細を取得
				MAM_ITM_R itm = MAM_ITM_R.create("ITM");
				MAVM_ITM_UNIT_R itmunit = MAVM_ITM_UNIT_R.create("ITMUNIT");
				MAM_TAX_R tax = MAM_TAX_R.create("TAX");
				MST_SLS_SCHD_R slsschd = MST_SLS_SCHD_R.create("SLSSCHD");
				MST_SLO_D_R slod = MST_SLO_D_R.create("SLOD");
				MCTempView slsschdsum = createTempView("SLSSCHDSUM");
				MST_SLS_SCHD_R slsschdV = MST_SLS_SCHD_R.create("SLSSCHDV");
				MST_PURC_SCHD_R purcschd = MST_PURC_SCHD_R.create("PURCSCHD");
				MST_SHIP_PR_R shippr = MST_SHIP_PR_R.create("SHIPPR");

				MCList<MST_SLS_ACT_D_R> slsActDL = MCList.create(MST_SLS_ACT_D_R.class);
				MST_SLS_ACT_D_R t2 = MST_SLS_ACT_D_R.create("T");
				MCQueryApiBuilder slsActDL_bldr = MCQueryApiBuilder.create(t2);
				slsActDL_bldr.setWhere(t2.sls_act_no.eq(bind("1")), slsActR.sls_act_no());
				slsActDL_bldr.addWhereWithAnd(t2.sls_act_seq.eq(bind("1")), slsActR.sls_act_seq());
				slsActDL_bldr.addSelect(itm.itm_jnl_cd);
				slsActDL_bldr.addSelect(itm.dscnt_itm_flg);
				slsActDL_bldr.addSelect(itm.lot_mng_typ);
				slsActDL_bldr.addSelect(itm.lot_no_typ);
				slsActDL_bldr.addSelect(itm.lot_no_ptn_cd);
				slsActDL_bldr.addSelect(itm.sublot_mng_typ);
				slsActDL_bldr.addSelect(itm.sublot_no_typ);
				slsActDL_bldr.addSelect(itm.sublot_no_ptn_cd);
				slsActDL_bldr.addSelect(itm.rnd_typ.as("base_unit_rnd_typ"));
				slsActDL_bldr.addSelect(itm.dec_place.as("base_unit_dec_place"));
				slsActDL_bldr.addSelect(itmunit.conv_base_qty.as("trd_unit_conv_base_qty"));
				slsActDL_bldr.addSelect(itmunit.conv_qty.as("trd_unit_conv_qty"));
				slsActDL.addBooleanColumn("inc_tax_flg");
				slsActDL.addBooleanColumn("dscnt_itm_flg");
				slsActDL.addNumberColumn("schd_base_unit_qty");
				slsActDL.addNumberColumn("schd_base_unit_sls_qty");
				slsActDL.addNumberColumn("schd_abort_qty");
				slsActDL.addNumberColumn("bef_base_unit_qty");
				slsActDL.addBooleanColumn("old_abort_flg");
				slsActDL.addNumberColumn("sum_base_unit_sls_qty");
				slsActDL.addNumberColumn("base_unit_schd_qty");
				slsActDL.addNumberColumn("pr_base_unit_qty");
				slsActDL.addBooleanColumn("sls_cststk_flg");
				slsActDL_bldr.addSelect(tax.inc_tax_flg);
				slsActDL_bldr.addSelect(tax.tax_rate);
				slsActDL_bldr.addSelect(tax.tax_typ);
				slsActDL_bldr.addSelect(slsschd.base_unit_qty.as("schd_base_unit_qty"));
				slsActDL_bldr.addSelect(slsschd.base_unit_abort_qty.as("schd_abort_qty"));
				slsActDL_bldr.addSelect(slsschd.base_unit_sls_qty.as("schd_base_unit_sls_qty"));
				slsActDL_bldr.addSelect(slsschd.trd_unit_qty.as("sls_schd_qty"));
				slsActDL_bldr.addSelect(slsschd.purc_schd_no);
				slsActDL_bldr.addSelect(slsschd.abort_flg.as("old_abort_flg"));
				slsActDL_bldr.addSelect(slsschd.dlv_slip_d_no.as("sls_schd_dlv_slip_d_no"));
				slsActDL_bldr.addSelect(slsschd.iv_no.as("sls_schd_iv_no"));
				slsActDL_bldr.addSelect(t2.base_unit_qty.as("bef_base_unit_qty"));
				slsActDL_bldr.addSelect(slsschdsum.pr("sum_base_unit_sls_qty"));
				slsActDL_bldr.addSelect(purcschd.base_unit_schd_qty);
				slsActDL_bldr.addSelect(shippr.base_unit_qty.as("pr_base_unit_qty"));
				slsActDL_bldr.addSelect(slod.sls_cststk_flg);
				slsActDL_bldr.addLeftOuterJoin(itm, bracket( t2.itm_cd.eq(itm.itm_cd) 
						.and(t2.itm_sub1.eq(itm.itm_sub1)) 
						.and(t2.itm_sub2.eq(itm.itm_sub2)) 
						.and(t2.itm_sub3.eq(itm.itm_sub3))));
				slsActDL_bldr.addLeftOuterJoin(itmunit, bracket( t2.itm_cd.eq(itmunit.itm_cd) 
						.and(t2.itm_sub1.eq(itmunit.itm_sub1)) 
						.and(t2.itm_sub2.eq(itmunit.itm_sub2)) 
						.and(t2.itm_sub3.eq(itmunit.itm_sub3)) 
						.and(t2.trd_unit_cd.eq(itmunit.unit_cd))));
				slsActDL_bldr.addLeftOuterJoin(tax, bracket( t2.tax_cd.eq(tax.tax_cd)));
				slsActDL_bldr.addLeftOuterJoin(slsschd, bracket( t2.sls_schd_no.eq(slsschd.sls_schd_no)));
				slsActDL_bldr.addLeftOuterJoin(slod, bracket( t2.slo_d_no.eq(slod.slo_d_no))); 
				slsActDL_bldr.addLeftOuterJoin(
						subQuery()
								.select(slsschdV.slo_d_no, sum(slsschdV.base_unit_sls_qty).as("sum_base_unit_sls_qty"))
								.from(slsschdV).groupBy(slsschdV.slo_d_no)
								.view(slsschdsum),
						bracket(t2.slo_d_no.eq(slsschdsum.pr(slsschdV.slo_d_no))));
				slsActDL_bldr.addLeftOuterJoin(purcschd, bracket( slsschd.purc_schd_no.eq(purcschd.purc_schd_no)));
				slsActDL_bldr.addLeftOuterJoin(shippr, bracket( t2.slo_d_no.eq(shippr.slo_d_no))); 
				
				dbSelect("MSBBL1320_MST_SLS_ACT_D_S02", slsActDL, slsActDL_bldr);
				_slsActDL.addStringColumn("itm_jnl_cd");
				_slsActDL.addNumberColumn("tax_rate");
				_slsActDL.addStringColumn("tax_typ");
				_slsActDL.addBooleanColumn("inc_tax_flg");
				_slsActDL.addBooleanColumn("dscnt_itm_flg");
				_slsActDL.addNumberColumn("schd_base_unit_qty");
				_slsActDL.addNumberColumn("schd_base_unit_sls_qty");
				_slsActDL.addNumberColumn("sls_schd_qty");
				_slsActDL.addNumberColumn("schd_abort_qty");
				_slsActDL.addNumberColumn("bef_base_unit_qty");
				_slsActDL.addStringColumn("lot_mng_typ");
				_slsActDL.addStringColumn("lot_no_typ");
				_slsActDL.addStringColumn("lot_no_ptn_cd");
				_slsActDL.addStringColumn("sublot_mng_typ");
				_slsActDL.addStringColumn("sublot_no_typ");
				_slsActDL.addStringColumn("sublot_no_ptn_cd");
				_slsActDL.addStringColumn("purc_schd_no");
				_slsActDL.addBooleanColumn("old_abort_flg");
				_slsActDL.addBooleanColumn("sls_cststk_flg");
				_slsActDL.addAll(slsActDL);
				_slsActDL.get(0).getStringNE("tax_typ");
				
				for (MST_SLS_ACT_D_R slsActDR : slsActDL) {
					// 売上実績明細に紐づく売上実績詳細を取得
					MCList<MST_SLS_ACT_IO_R> slsActIoL = MCList.create(MST_SLS_ACT_IO_R.class);
					MST_SLS_ACT_IO_R t3 = MST_SLS_ACT_IO_R.create("T");
					MCQueryApiBuilder slsActIoL_bldr = MCQueryApiBuilder.create(t3);
					slsActIoL_bldr.setWhere(t3.sls_act_d_no.eq(bind("1")), slsActDR.sls_act_d_no());
					slsActIoL_bldr.addWhereWithAnd(t3.sls_act_d_seq.eq(bind("1")), slsActDR.sls_act_d_seq());
					dbSelect("MSBBL1320_MST_SLS_ACT_IO_S02", slsActIoL, slsActIoL_bldr);
					_slsActIoL.addAll(slsActIoL);
				}
			}
			
			MCIndexKey hdrIdkKey = _slsActL.createIndex(MST_SLS_ACT_R.$sls_act_no);
			_slsActIdxKey = _slsActL.createIndex(MST_SLS_ACT_R.$sls_act_no);
			MCIndexKey idxkey = _slsActDL.createIndex(MST_SLS_ACT_D_R.$sls_act_d_no);
			for (Chk02_RsltR dtlR : up0()) {
				MST_SLS_ACT_R slsActR = _slsActL.getFirst(hdrIdkKey, dtlR.sls_act_no());
				if (!isNull(slsActR) && !slsActR.isEmpty()) {
					dtlR.bef_sls_dpt_cd(slsActR.sls_dpt_cd());
				}
				MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(idxkey, dtlR.sls_act_d_no());
				if (!isNull(slsActDR) && !slsActDR.isEmpty()) {
					dtlR.trd_unit_conv_base_qty(slsActDR.getNumberNE("trd_unit_conv_base_qty"));
					dtlR.trd_unit_conv_qty(slsActDR.getNumberNE("trd_unit_conv_qty"));
				}
			}
			
			// 売上予定に紐づく内容を取得
			MCList<MST_SLS_SCHD_R> wkKeyL = MCList.create(MST_SLS_SCHD_R.class);
			for (Chk02_RsltR dtlR : up0()) {
				// 売上予定キーWK
				MST_SLS_SCHD_R wkKeyR = MST_SLS_SCHD_R.create();
				wkKeyR.sls_schd_no(dtlR.sls_schd_no());
				wkKeyL.add(wkKeyR);
			}
			dbWkInsert("MSBBL1320_MSW_SLS_SCHD_I08", wkKeyL,
					MCQueryApiBuilder.create(MST_SLS_SCHD_R.create("T")).getBaseDbc());
			
			initCalc01Hdr();
			executeQuery(_calc01HdrL, MSBBL1320_MST_SLS_SCHD_S09());
			_idxCalc01HdrKey = _calc01HdrL.createIndex(LIST_INDEX_KEY_NM);
			
			// 上り電文と更新データをマージし登録データを作成
			mrgData();
			
			setLotNo();
		}
		
		/**
		 * 	ロットＮＯ発番処理
		 */
		protected void setLotNo() {

			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			// 明細のロットＮＯ・サブロットＮＯの発番対象の抽出
			for (Chk02_RsltR rsltR : notErrL) {

				if (!MSC_SLS_TGT_TYP.isDDLV_SLS(rsltR.sls_tgt_typ())) {
					continue;
				}
				if (!rsltR.sync_flg()) {
					continue;
				}

				// 入荷予定にロットＮＯが設定されている場合、そのロットＮＯを採用するのでロットＮＯを発番しない
				MST_ARR_SCHD_R arrschd = MST_ARR_SCHD_R.create("ARRSCHD");
				MST_ARR_PR_R arrpr = MST_ARR_PR_R.create("ARRPR");
				MST_PURC_SCHD_R schdR = MST_PURC_SCHD_R.create();
				MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
				MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(t);
				schdR_bldr.setSelect(t.purc_schd_no);
				schdR_bldr.addLeftOuterJoin(arrschd, bracket( t.arr_schd_no.eq(arrschd.arr_schd_no)));
				schdR_bldr.addLeftOuterJoin(arrpr, bracket( t.arr_pr_no.eq(arrpr.arr_pr_no)));
				schdR_bldr.addSelect(arrschd.lot_no.as("lot_no"),
						arrschd.sublot_no.as("sublot_no"),
						arrschd.arr_loc_cd.as("arr_loc_cd"),
						arrschd.bp_lot_no, 
						arrpr.sppl_cd.as("sppl_cd"));
				
				schdR_bldr.setWhere(t.purc_schd_no.eq(bind("1")), rsltR.purc_schd_no());
				dbSelect("MSBBL1320_MST_PURC_SCHD_S02", schdR, schdR_bldr);
				
				if (!isNull(schdR) && !isNull(schdR.getStringNE("lot_no"))) {
					rsltR.lot_no(schdR.getStringNE("lot_no"));
					rsltR.sublot_no(nvl(schdR.getStringNE("sublot_no"), MAC_STR.NULL_VAL.value()));
					rsltR.crt_lot_flg(false);
					continue;
				}
				
				MST_SLS_ACT_D_R slsActDR = _slsActDL.getFirst(MST_SLS_ACT_D_R.$sls_act_d_no, rsltR.sls_act_d_no());
				MCList<MST_SLS_ACT_IO_R> slsActIoL = _slsActIoL.subList(MST_SLS_ACT_IO_R.$sls_act_d_no, rsltR.sls_act_d_no());
				
				// 明細のロットＮＯ発番
				if (isCrtLotNo(rsltR)) {

					// ロット発番して明細、詳細に設定する
					ElmArgsR lotArgs = getLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.LOT, schdR);
					String lotNo = getNum(MAC_NUM_BIZ_TYP.LOT, lotArgs);
					rsltR.lot_no(lotNo);
					
					slsActDR.lot_no(lotNo);
					slsActIoL.setValueNE(MST_SLS_ACT_IO_R.$lot_no, lotNo);
				}
				
				// 明細のサブロットＮＯ
				if (isCrtSubLotNo(rsltR)) {

					// サブロット発番して明細、詳細に設定する
					ElmArgsR subLotArgs = getSubLotElmArgs(rsltR, MAC_NUM_BIZ_TYP.SUBLOT, schdR);
					String subLotNo = nvl(getNum(MAC_NUM_BIZ_TYP.SUBLOT, subLotArgs),  MAC_STR.NULL_VAL.value());
					rsltR.sublot_no(subLotNo);
					slsActDR.sublot_no(subLotNo);
					slsActIoL.setValueNE(MST_SLS_ACT_IO_R.$sublot_no, subLotNo);
				}
				else if (!isNull(rsltR.lot_no()) && isNull(rsltR.sublot_no())) {
					rsltR.sublot_no(MAC_STR.NULL_VAL.value());
					slsActDR.sublot_no(MAC_STR.NULL_VAL.value());
					slsActIoL.setValueNE(MST_SLS_ACT_IO_R.$sublot_no, MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * [ロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [ロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、ロットＮＯの発番対象とする。
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtLotNo(Chk02_RsltR rstlR) {

			return !MAC_LOT_MNG_TYP.isNOT_MNG(rstlR.lot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.lot_no_typ())
					&& rstlR.crt_lot_flg()
					&& isNull(rstlR.lot_no());
		}
		
		/**
		 * [サブロット管理区分：ロット管理しない]以外の場合、かつ、<br>
		 * [サブロットＮＯ発番区分：手動]以外の場合、かつ、<br>
		 * ロット作成ＦＬＧがTrueの場合、サブロットＮＯの発番対象とする。
		 * @param rstlR 明細行
		 * @return 発番する場合はtrue
		 */
		protected boolean isCrtSubLotNo(Chk02_RsltR rstlR) {

			return 	!MAC_SUBLOT_MNG_TYP.isNOT_MNG(rstlR.sublot_mng_typ())
					&& !MAC_LOT_NO_TYP.isMANUAL(rstlR.sublot_no_typ())
					&& (rstlR.crt_lot_flg() || MAC_SUBLOT_MNG_TYP.isSTK(rstlR.sublot_mng_typ()))
					&& isNull(rstlR.sublot_no());
		}

		/**
		 * ロットＮＯの発番要素を取得する
		 * 
		 * @param r
		 * @param numBizTyp
		 * @return 発番要素
		 */
		protected ElmArgsR getLotElmArgs(Chk02_RsltR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR) {

			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.lot_no_ptn_cd());
			arg.bp_cd(schdR.getStringNE("sppl_cd"));
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(r.sls_dt());
			arg.bp_lot_no(schdR.getStringNE("bp_lot_no"));
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());

			return arg;
		}
		
		/**
		 * サブロットＮＯの発番要素を取得する
		 * 
		 * @param r
		 * @param numBizTyp
		 * @return 発番要素
		 */
		protected ElmArgsR getSubLotElmArgs(Chk02_RsltR r, MAC_NUM_BIZ_TYP numBizTyp, MST_PURC_SCHD_R schdR) {
			
			// 発番要素の設定
			ElmArgsR arg = ElmArgsR.create();
			arg.co_cd(getCo().co_cd());
			arg.num_ptn_cd(r.sublot_no_ptn_cd());
			arg.itm_cd(r.itm_cd());
			arg.itm_sub1(r.itm_sub1());
			arg.itm_sub2(r.itm_sub2());
			arg.itm_sub3(r.itm_sub3());
			arg.loc_cd(schdR.getStringNE("arr_loc_cd"));
			arg.wg_cd(getLocR(schdR.getStringNE("arr_loc_cd")).wg_cd());
			arg.site_cd(getLocR(schdR.getStringNE("arr_loc_cd")).site_cd());
			arg.dt(r.sls_dt());
			arg.bp_lot_no(schdR.getStringNE("bp_lot_no"));
			arg.sno1(r.sno1());
			arg.sno2(r.sno2());
			arg.sno3(r.sno3());
			arg.sno4(r.sno4());
			arg.lot_no(r.lot_no());

			return arg;
		}
		
		/**
		 * 取引通貨単価を算出する。
		 * @param dtlL 売上実績チェックリスト
		 */
		protected void calcTrdCurUpri(MCList<Chk02_RsltR> dtlL) {
			
			MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
			
			ConvQtyAmtUtil_Calc01_HdrR up0R = null;
			ConvQtyAmtUtil_Calc01_Dtl1R up1R = null;
			
			for (Chk02_RsltR dtlR : dtlL) {
				
				up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
				getCredSrcBySlsSchd(up0R, dtlR.sls_schd_no());
				up0R.peg_no(dtlR.peg_no());
				
				up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
				copy(up1R, dtlR, createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Chk02_RsltR());
				
				MST_SLS_ACT_D_R tmpSlsActDR = _slsActDL.getFirst(MST_SLS_ACT_D_R.$sls_act_d_no, dtlR.sls_act_d_no());
				if (!isSame(tmpSlsActDR.trd_unit_cd(), up1R.trd_unit_cd())) {
					MAVM_ITM_UNIT_R itmUnitR = getItmUnit(tmpSlsActDR.itm_cd(), tmpSlsActDR.itm_sub1(), tmpSlsActDR.itm_sub2(), tmpSlsActDR.itm_sub3(), dtlR.trd_unit_cd());
					up1R.trd_unit_conv_qty(itmUnitR.conv_qty());
					up1R.trd_unit_conv_base_qty(itmUnitR.conv_base_qty());
					ope.up0().add(up0R);
					ope.up1().add(up1R);
				}
				else {
					dtlR.trd_cur_upri(tmpSlsActDR.trd_cur_upri());
				}
			}
			
			if (!ope.up0().isEmpty()) {
				
				setPegNo(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, ope.up1());
				
				ope.exec();
				
				String[] destCols = new String[] { Srch01_RsltR.$trd_cur_upri };
				String[] srcCols = new String[] { ConvQtyAmtUtil_Calc01_Dtl1R.$trd_cur_upri };

				copyByPegNo(dtlL, destCols, ope.down0(), srcCols);
			}
		}
	}
	
	/**
	 * 	受払実績サービスの呼出
	 */
	protected void callIoActSvUpd01() {
		MSBEL_IoActService.crtIoAct_Upd01().exec();
	}
	
	/**
	 * 	マスタキャッシュ
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;
	
	/**
	 * 取引先マスタの取得
	 * @param cst_cd
	 * @return
	 */
	protected MAM_BP_R getBpCache(String bpCd) {
		return _cacheBp.get(bpCd);
	}
	
	protected void initBpCache() {
		_cacheBp = null;
		_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
	}
	
	protected void initBpCache(MCList<MST_SLS_ACT_R> bindL) {
		_cacheBp = null;
		_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(
				MCQueryApiBuilder.create(MAM_BP_R.create("T")), bindL, MST_SLS_ACT_R.$cst_cd);
	}
	
	/**
	 * 部門マスタの取得
	 * @param dptCd
	 * @param baseDt
	 * @return
	 */
	protected MAM_DPT_R getDptCache(String dptCd, MCDate baseDt) {
		return _cacheDpt.get(baseDt, dptCd);
	}
	
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> initDptCache() {
		MCList<MCRow> bindL = MCList.create(MCRow.class);
		if (_cacheDpt == null){
			_cacheDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(
					MCQueryApiBuilder.create(MAM_DPT_R.create("T")), bindL, MAM_DPT_R.$dpt_cd);
		}
		return _cacheDpt;
	}
	
	protected void setWgInfo(MST_SLS_ACT_R slsActR) {
		initDptCache();
		MAM_DPT_R dptR = getDptCache(slsActR.sls_dpt_cd(), slsActR.ac_dt());
		slsActR.wg_cd(dptR.wg_cd());
	}
	
	protected void setIvInfo(MST_SLS_ACT_R slsActR) {
		if (isNullOrNullVal(slsActR.iv_no())) {
			return;
		}
		MST_IV_R iv = MST_IV_R.create();
		MST_IV_R t = MST_IV_R.create("T");
		MCQueryApiBuilder iv_bldr = MCQueryApiBuilder.create(t);
		iv_bldr.setSelect(t.eta_dt);
		iv_bldr.setWhere(t.iv_no.eq(bind("1")), slsActR.iv_no());
		dbSelect("MSBBL1320_MST_IV_S05", iv, iv_bldr);
		slsActR.addDateColumn("eta_dt");
		slsActR.setDateNE("eta_dt", iv.eta_dt());
	}
	
	protected void setBpInfo(MST_SLS_ACT_R slsActR) {
		initBpCache();
		MAM_BP_R cst = getBpCache(slsActR.cst_cd());
		MAM_BP_R acst = getBpCache(cst.acst_cd());
		MAM_BP_R bcst = getBpCache(acst.bcst_cd());
		
		slsActR.acst_cd(cst.acst_cd());
		slsActR.bcst_cd(acst.bcst_cd());
		slsActR.cred_cd(bcst.ar_cred_cd());
	}
	
	protected void setSlsTgtTyp(MST_SLS_ACT_R slsActR, MST_SLS_ACT_D_R slsActDR) {
		slsActR.addStringColumn("sls_tgt_typ");
		if (!isNull(slsActDR.purc_ddlv_po_no()) || slsActDR.getBooleanNE("ddlv_iv_grp_flg")) {
			slsActR.setStringNE("sls_tgt_typ", MSC_SLS_TGT_TYP.DDLV_SLS.value());	// 仕入直送売上
			return;
		}
		
		if (!isNull(slsActDR.slo_d_no())) {
			MST_SLO_D_R slodR = MST_SLO_D_R.create();
			MST_SLO_D_R t = MST_SLO_D_R.create("T");
			MCQueryApiBuilder slodR_bldr = MCQueryApiBuilder.create(t);
			slodR_bldr.setSelect(t.sls_cststk_flg);
			slodR_bldr.setWhere(t.slo_d_no.eq(bind("1")), slsActDR.slo_d_no());
			dbSelect("MSBBL1320_MST_SLO_D_S02", slodR, slodR_bldr);
			if (slodR.sls_cststk_flg()) {
				slsActR.setStringNE("sls_tgt_typ", MSC_SLS_TGT_TYP.CSTSTK_SLS.value());	// 預り売上
				return;
			}
		}
		
		if (MAC_SLS_BASIS_TYP.isIN_BASIS(slsActR.sls_basis_typ())) {
			slsActR.setStringNE("sls_tgt_typ", MSC_SLS_TGT_TYP.XFR_IN_SLS.value());	// 着荷売上
			return;
		}
		
		if (MAC_SLS_BASIS_TYP.isARRIVAL_BASIS(slsActR.sls_basis_typ())) {
			slsActR.setStringNE("sls_tgt_typ", MSC_SLS_TGT_TYP.ARRIVAL_SLS.value());	// 着荷売上
			return;
		}
		
		slsActR.setStringNE("sls_tgt_typ", MSC_SLS_TGT_TYP.NOT_SHIP_ORD_SLS.value());	// 出荷指示対象外売上
	}
	
	protected MCNumber getBaseUnitQty(MCNumber trd_unit_qty, String trd_unit_cd, String base_unit_cd,
			String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {
		MAVM_ITM_UNIT_R itmUnitR = getItmUnit(itm_cd, itm_sub1, itm_sub2, itm_sub3, trd_unit_cd);
		MAVM_ITM_UNIT_R itmBaseUnitR = getItmUnit(itm_cd, itm_sub1, itm_sub2, itm_sub3, base_unit_cd);
		
		MCNumber base_unit_qty = convToBaseUnit(trd_unit_qty, itmUnitR.conv_base_qty(),
				itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ());
		return base_unit_qty;
	}
	
	// 品目単位のキャッシュ
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected static void setItmUnitCache(MCList<?> dtlL) {
		object(CLAZZ)._setItmUnitCache(dtlL);
	}
	protected void _setItmUnitCache(MCList<?> dtlL) {
		MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
		MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t);
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr);
		_itmUnitCache.setFixMaxCacheSize(-1);

		// 全ての単位を取得する
		MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
		itmUnitL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		itmUnitL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		itmUnitL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		itmUnitL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		
		MCList<?> tmp = dtlL.groupBy("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
		dbSelect("MSBBL1320_MAVM_ITM_UNIT_S01", itmUnitL, itmUnitL_bldr, tmp);

		for (MAVM_ITM_UNIT_R itmUnitR : itmUnitL) {
			Comparable<?>[] key = itmUnitR.toArray(itmUnitR.getKeyColumn());
			_itmUnitCache.putCache(key, itmUnitR);
		}
	}
	// 品目単位のキャッシュからの取得
	protected static MAVM_ITM_UNIT_R getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		return object(CLAZZ)._getItmUnit(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
	}
	protected MAVM_ITM_UNIT_R _getItmUnit(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		if (_itmUnitCache == null) {
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")));
			_itmUnitCache.setFixMaxCacheSize(-1);
		}
		
		return _itmUnitCache.get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
	}

	// 通貨のキャッシュ
	protected FXUCL_MCDbcCache<MAM_CUR_R> _curCache = null;
	protected static MAM_CUR_R getCur(String curCd) {
		return object(CLAZZ)._getCur(curCd);
	}
	
	protected MAM_CUR_R _getCur(String curCd) {
		if (_curCache == null) {
			_curCache = new FXUCL_MCDbcCache<MAM_CUR_R>(MCQueryApiBuilder.create(MAM_CUR_R.create("T")));
		}
		return _curCache.get(curCd);
	}
	
	protected boolean isPack(String itmCd, String itmSub1, String itmSub2,
			String itmSub3, String trdUnitCd) {
		MAVM_ITM_UNIT_R itmUnitR = getItmUnit(itmCd, itmSub1, itmSub2, itmSub3, trdUnitCd);
		return itmUnitR.pack_flg();
	}
	
	/**
	 * 与信戻し金額を計算する。
	 * @param slsSchdNo 売上予定ＮＯ
	 * @param baseUnitQty 基準単位数量
	 * @param oldBaseUnitQty 基準単位数量（変更前）
	 * @param sync_flg 同時計上ＦＬＧ
	 * @param sls_tgt_typ 売上対象区分
	 * @param sls_act_no 売上実績ＮＯ
	 * @param slo_d_no 受注明細ＮＯ
	 * @param delFlg 取消からの呼出の場合true
	 * @param ajstFlg 取消時に処理対象の受注明細ＮＯが変わっていた場合true
	 * @param newAbortFlg 更新時に画面で指定された打切フラグ。新規・取消時は常にfalse
	 * @return 与信戻し金額
	 */
	protected MCNumber calcCredAmt(String slsSchdNo, MCNumber baseUnitQty, MCNumber oldBaseUnitQty,
			boolean sync_flg, String sls_tgt_typ, String sls_act_no, String slo_d_no, boolean delFlg, boolean ajstFlg, boolean newAbortFlg) {

		MCNumber credAmt = MCNumber.ZERO;
				
		MSUCL_ConvQtyAmtUtil.ConvQtyAmtUtil_Calc02 ope = MSUCL_ConvQtyAmtUtil.crtConvQtyAmtUtil_Calc02();
		
		ConvQtyAmtUtil_Calc01_HdrR up0R = ConvQtyAmtUtil_Calc01_HdrR.create();
		
		getCredSrcBySlsSchd(up0R, slsSchdNo);
		
		MCNumber retQty = MCNumber.ZERO;
		boolean calcContFlg = false;
		if (sync_flg && MSC_SLS_TGT_TYP.isDDLV_SLS(sls_tgt_typ)) {
			retQty = MCNumber.max(baseUnitQty, up0R.getNumber("sls_schd_qty"));
		}
		else {
			retQty = up0R.getNumber("sls_schd_qty");
			// 打切オフの場合
			if (!newAbortFlg) {
				if (!isNull(_schdQtyL)) {
					MST_SLS_SCHD_R befSlsSchdR = _schdQtyL.getFirst(_idxSlsSchd, slo_d_no);
					// 更新前に打切数量がある場合は打切解除の動作
					if (!isNull(befSlsSchdR) && befSlsSchdR.base_unit_abort_qty().gt(0)) {
						calcContFlg = true;
					}
				}
			}
			else {
				// 打切のまま数量増加の場合
				if (baseUnitQty.gt(oldBaseUnitQty)) {
					calcContFlg = true;
				}
			}
		}
		
		MCNumber credRetQty = calcCredRetQty(retQty, up0R.getNumber("base_unit_cmpl_qty"), baseUnitQty, oldBaseUnitQty, calcContFlg);
		
		if (MSC_SLS_TGT_TYP.isNOT_SHIP_ORD_SLS(sls_tgt_typ) && !isNull(slo_d_no) && !isNull(_sloDL) && !isNull(_schdQtyL)) {
			MST_SLO_D_R sloDR = _sloDL.getFirst(_idxSloD, slo_d_no);
			if (!isNull(sloDR)) {
				MST_SLS_SCHD_R slsSchdR = _schdQtyL.getFirst(_idxSlsSchd, slo_d_no);
				MCNumber sloRemQty = sloDR.base_unit_qty().subtract(slsSchdR.base_unit_abort_qty()); // 受注数量（打切除く）
				MCNumber slsAllQty = slsSchdR.base_unit_sls_qty(); // 総売上数量
				
				if (!delFlg) {
					if (!isSame(oldBaseUnitQty, baseUnitQty)) {
						if (slsAllQty.gte(sloRemQty)) {
							if (!isSame(slsAllQty, sloRemQty)) {
								if (slsAllQty.subtract(oldBaseUnitQty).add(baseUnitQty).lt(sloRemQty)) {
									credRetQty = credRetQty.subtract(slsAllQty.subtract(sloRemQty));
								}
								else {
									credRetQty = MCNumber.ZERO;
								}
							}
						}
						else {
							if (slsAllQty.subtract(oldBaseUnitQty).add(baseUnitQty).gte(sloRemQty)) {
								credRetQty = credRetQty.subtract((sloRemQty.subtract(slsAllQty)));
							}
							else if (slsAllQty.lt(sloRemQty) && oldBaseUnitQty.lt(sloRemQty) && baseUnitQty.lt(sloRemQty)) {
								if (oldBaseUnitQty.lt(baseUnitQty)) {
									credRetQty = credRetQty.add((oldBaseUnitQty.subtract(baseUnitQty)));
								}
							}
						}
					}
				}
				else {
					if (ajstFlg && slsAllQty.gt(sloRemQty)) {
						credRetQty = credRetQty.subtract(slsAllQty.subtract(sloRemQty));
					}
				}
			}
		}
		
		if (!credRetQty.isZero()) {
				
			setPegNo(up0R);
			
			ConvQtyAmtUtil_Calc01_Dtl1R up1R = ConvQtyAmtUtil_Calc01_Dtl1R.create();
			
			up1R.hdr_peg_no(up0R.peg_no());
			setPegNo(up1R);
			
			up1R.trd_unit_qty(credRetQty);
			up1R.trd_unit_cd(up0R.getString("base_unit_cd"));
			up1R.trd_unit_conv_base_qty(1);
			up1R.trd_unit_conv_qty(1);
			
			ope.up0().add(up0R);
			ope.up1().add(up1R);
			
			ope.exec();
			
			if (!ope.down0().isEmpty()) {
				credAmt = ope.down0().get(0).trd_cur_inc_tax_amt();
			}
		}
		
		return credAmt;
	}
	
	/**
	 * 与信金額戻し数量を算出する。
	 * @param slsSchdQty 売上予定数量（基準単位）
	 * @param cmplQty 完了数量（基準単位売上数量＋基準単位打切数量）
	 * @param baseUnitQty 基準単位数量
	 * @param oldBaseUnitQty 基準単位数量（変更前）
	 * @param calcContFlg 算出制御用フラグ（打切考慮）
	 * @return 与信金額戻し数量
	 */
	protected MCNumber calcCredRetQty(MCNumber slsSchdQty, MCNumber cmplQty, MCNumber baseUnitQty, MCNumber oldBaseUnitQty, boolean calcContFlg) {
		
		MCNumber oldSlsRemQty = slsSchdQty.subtract(cmplQty);
		oldSlsRemQty = oldSlsRemQty.isNegative() ? MCNumber.ZERO : oldSlsRemQty;
		
		MCNumber slsRemQty = slsSchdQty.subtract(cmplQty.add(baseUnitQty.subtract(oldBaseUnitQty)));
		if (!calcContFlg) {
			slsRemQty = slsRemQty.isNegative() ? MCNumber.ZERO : slsRemQty;
		}
		
		return slsRemQty.subtract(oldSlsRemQty);
	}

	/**
	 * 売上予定ＮＯで売上予定の元情報(インボイス明細⇒納品書明細⇒受注明細の優先順)を取得する。
	 * 
	 * @param calc01HdrR 単位・金額の計算ヘッダ（売上予定元情報を格納）
	 * @param slsSchdNo 売上予定ＮＯ
	 * @param trdUnitCd 取引単位ＣＤ
	 */
	protected void getCredSrcBySlsSchd(ConvQtyAmtUtil_Calc01_HdrR calc01HdrR, String slsSchdNo) {
		// 取得済リストより処理対象となる売上予定ＮＯのデータを取得
		ConvQtyAmtUtil_Calc01_HdrR tmpCalc01HdrR = _calc01HdrL.getFirst(_idxCalc01HdrKey, slsSchdNo);
		MCRow.copyvalue(calc01HdrR, tmpCalc01HdrR);
		calc01HdrR.trd_cur_inc_tax_amt(sum(tmpCalc01HdrR.trd_cur_amt(), tmpCalc01HdrR.trd_cur_tax_amt()));
		calc01HdrR.schd_base_unit_qty(convToBaseUnit(
				tmpCalc01HdrR.trd_unit_qty(),
				tmpCalc01HdrR.trd_unit_conv_base_qty(),
				tmpCalc01HdrR.trd_unit_conv_qty(),
				tmpCalc01HdrR.base_unit_dec_place(),
				tmpCalc01HdrR.base_unit_rnd_typ()));
	}
	
	/** 場所マスタのキャッシュ */
	protected FXUCL_MCDbcCache<MAM_LOC_R> _loc;
	
	protected MAM_LOC_R getLocR(String locCd) {
		if (_loc == null) {
			_loc = new FXUCL_MCDbcCache<MAM_LOC_R>(MCQueryApiBuilder.create(MAM_LOC_R.create("T")));
		}
		return _loc.get(locCd);
	}
	
	protected Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR<ConvQtyAmtUtil_Calc01_HdrR,Srch01_RsltR> createMap_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR() {
		return new Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR<ConvQtyAmtUtil_Calc01_HdrR, Srch01_RsltR>();
	}

	public class Map_ConvQtyAmtUtil_Calc01_HdrR_Srch01_RsltR<D extends ConvQtyAmtUtil_Calc01_HdrR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_cd, Srch01_RsltR.$schd_trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_qty, Srch01_RsltR.$schd_trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_upri, Srch01_RsltR.$trd_cur_upri);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_dscnt_amt, Srch01_RsltR.$trd_cur_dscnt_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_amt, Srch01_RsltR.$schd_trd_cur_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_tax_amt, Srch01_RsltR.$schd_trd_cur_tax_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_inc_tax_amt, Srch01_RsltR.$trd_cur_inc_tax_amt);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_dec_place, Srch01_RsltR.$base_unit_dec_place);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$base_unit_rnd_typ, Srch01_RsltR.$base_unit_rnd_typ);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_qty, Srch01_RsltR.$schd_trd_unit_conv_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_unit_conv_base_qty, Srch01_RsltR.$schd_trd_unit_conv_base_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$trd_cur_cd, Srch01_RsltR.$trd_cur_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rate, Srch01_RsltR.$schd_tax_rate);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$inc_tax_flg, Srch01_RsltR.$schd_inc_tax_flg);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_dec_place, Srch01_RsltR.$trd_cur_amt_dec_place);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$upri_dec_place, Srch01_RsltR.$trd_cur_upri_dec_place);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$amt_rnd_typ, Srch01_RsltR.$sls_amt_rnd_typ);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$tax_rnd_typ, Srch01_RsltR.$sls_tax_rnd_typ);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$act_tax_rate, Srch01_RsltR.$tax_rate);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$act_inc_tax_flg, Srch01_RsltR.$inc_tax_flg);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_HdrR.$schd_base_unit_qty, Srch01_RsltR.$init_schd_qty);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.trd_cur_inc_tax_amt(sum(src.schd_trd_cur_amt(), src.schd_trd_cur_tax_amt()));
		}
	}
	
	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR<ConvQtyAmtUtil_Calc01_Dtl1R,Srch01_RsltR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR() {
		return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR<ConvQtyAmtUtil_Calc01_Dtl1R, Srch01_RsltR>();
	}

	public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Srch01_RsltR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, Srch01_RsltR.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, Srch01_RsltR.$trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, Srch01_RsltR.$trd_unit_conv_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, Srch01_RsltR.$trd_unit_conv_base_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$wtax_rate, Srch01_RsltR.$wtax_rate);
		}
	}
	
	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_RsltR<ConvQtyAmtUtil_Calc01_Dtl1R,Chk01_RsltR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_RsltR() {
		return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_RsltR<ConvQtyAmtUtil_Calc01_Dtl1R, Chk01_RsltR>();
	}

	public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Chk01_RsltR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, Chk01_RsltR.$trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, Chk01_RsltR.$trd_unit_conv_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, Chk01_RsltR.$trd_unit_conv_base_qty);

		}
	}
	
	protected Map_ConvQtyAmtUtil_Calc01_Dtl1R_Chk02_RsltR<ConvQtyAmtUtil_Calc01_Dtl1R,Chk02_RsltR> createMap_ConvQtyAmtUtil_Calc01_Dtl1R_Chk02_RsltR() {
		return new Map_ConvQtyAmtUtil_Calc01_Dtl1R_Chk02_RsltR<ConvQtyAmtUtil_Calc01_Dtl1R, Chk02_RsltR>();
	}

	public class Map_ConvQtyAmtUtil_Calc01_Dtl1R_Chk02_RsltR<D extends ConvQtyAmtUtil_Calc01_Dtl1R, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$peg_no, Chk02_RsltR.$peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$hdr_peg_no, Chk02_RsltR.$peg_no);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_qty, Chk02_RsltR.$trd_unit_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_cd, Chk02_RsltR.$trd_unit_cd);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_qty, Chk02_RsltR.$trd_unit_conv_qty);
			addColumnPathMap(ConvQtyAmtUtil_Calc01_Dtl1R.$trd_unit_conv_base_qty, Chk02_RsltR.$trd_unit_conv_base_qty);

		}
	}
	
	protected void setValuesDbc(Srch01_CndR upR, MCList<Srch01_RsltR> down) {
		initDbcCache(upR, down);
		
		setValuesDbc(MSBBL1320_Srch01_RsltR_J01(), upR, down);
		
		if (isSame(upR.getStringNE("ope"), SRCH_OPE_INS)
				|| isSame(upR.getStringNE("mode"), SRCH_MODE_DTL)) {
			setValuesDbc(MSBBL1320_Srch01_RsltR_J02(), upR, down);
		}
		
		for (Srch01_RsltR dtlR : down) {
			if (_cacheSloDShipPr != null) {
				dtlR.ship_pr_upd_cntr(_cacheSloDShipPr.get(dtlR.slo_d_no()).upd_cntr());
			}
		}
			
		// 検索モード「明細」
		if (isSame(upR.mode(), SRCH_MODE_DTL)) {
			
			for (Srch01_RsltR dtlR : down) {
				// 取引先マスタの取引先名
				dtlR.dlv_nm(nvl(dtlR.dlv_nm(), dtlR.dlv_nm_bp()));
	
				// 諸口品以外は品目マスタの品名（受領Ｉ／Ｖ表記品名はロケールマスタの品名）
				dtlR.itm_nm(nvl(dtlR.itm_nm(), dtlR.itm_nm_itm()));
	
				if (dtlR.cst_iv_flg()) {
					
					MAM_ITM_LCL_R dbcR = _cacheItmLcl.get(dtlR.itm_cd(), dtlR.itm_sub1(),
							dtlR.itm_sub2(), dtlR.itm_sub3(), dtlR.lcl_cd());
					dtlR.iv_itm_nm(nvl(dtlR.iv_itm_nm(), nvl(dbcR.itm_nm(), dtlR.itm_nm_itm())));
				}
				else {
					dtlR.iv_itm_nm(null);
				}
	
				if (dtlR.schd_inc_tax_flg()) {
					if (isNullAnd(dtlR.schd_trd_cur_amt(), dtlR.schd_trd_cur_tax_amt())) {
						dtlR.init_schd_amt(null);
					}
					else {
						dtlR.init_schd_amt(nvl(dtlR.schd_trd_cur_amt(), MCNumber.ZERO)
								.add(nvl(dtlR.schd_trd_cur_tax_amt(), MCNumber.ZERO)));
					}
				}
				else {
					dtlR.init_schd_amt(dtlR.schd_trd_cur_amt());
				}
			}
		}
	}
	protected void initDbcCache(Srch01_CndR upR, MCList<Srch01_RsltR> down) {

		initDbcCacheDpt(down);
		
		// 操作種別「登録する」
		if (isSame(upR.ope(), SRCH_OPE_INS)) {
			initDbcCachePurcActD(down);
		}

		// 検索モード「明細」
		if (isSame(upR.mode(), SRCH_MODE_DTL)) {
			initDbcCacheItm(down);
			initDbcCacheItmLcl(down);
			initDbcCacheLotList(down);

			// 操作種別「登録する」以外
			if (!isSame(upR.ope(), SRCH_OPE_INS)) {
				initDbcCacheSlsActD(down);
				initDbcCacheSlo(down);
				initDbcCacheSlsSchdArr(down);
				initDbcCacheSloDSls(down);
			}
		}
		if (isSame(upR.getStringNE("ope"), SRCH_OPE_INS)
				|| isSame(upR.getStringNE("mode"), SRCH_MODE_DTL)) {
			initDbcCacheSloDShipPr(down);
		}
	}

	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheMamDpt;
	protected void initDbcCacheDpt(MCList<Srch01_RsltR> down) {
		
		MAM_WG_R mamWgR = MAM_WG_R.create("M1");
		MAM_DPT_R mamDptR = MAM_DPT_R.create("T");
		MCQueryApiBuilder mamDpt_bldr = MCQueryApiBuilder.create(mamDptR);
		mamDpt_bldr.setSelect(mamDptR.wg_cd);
		mamDpt_bldr.addSelect(mamWgR.wg_nm);
		mamDpt_bldr.addLeftOuterJoin(mamWgR, mamWgR.wg_cd.eq(mamDptR.wg_cd));
		_cacheMamDpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(mamDpt_bldr, down, Srch01_RsltR.$sls_dpt_cd);
		
	}
	protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
	protected void initDbcCacheItm(MCList<Srch01_RsltR> down) {

		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
		itm_bldr.setSelect(t.ver_flg);
		_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itm_bldr, down, Srch01_RsltR.$itm_cd,
				Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3);

	}
	protected FXUCL_MCDbcCache<MAM_ITM_LCL_R> _cacheItmLcl;
	protected void initDbcCacheItmLcl(MCList<Srch01_RsltR> down) {

		MAM_ITM_LCL_R t = MAM_ITM_LCL_R.create("T");
		MCQueryApiBuilder itmLcl_bldr = MCQueryApiBuilder.create(t);
		itmLcl_bldr.setSelect(t.itm_nm);
		_cacheItmLcl = new FXUCL_MCDbcCache<MAM_ITM_LCL_R>(itmLcl_bldr, down,
				Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2,
				Srch01_RsltR.$itm_sub3, Srch01_RsltR.$lcl_cd);

	}
	protected FXUCL_MCDbcCache<MSVT_LOT_LIST_R> _cacheLot;
	protected void initDbcCacheLotList(MCList<Srch01_RsltR> down) {

		MSVT_LOT_LIST_R t = MSVT_LOT_LIST_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

		dbc_bldr.setSelect(t.ver_no);
		
		_cacheLot = new FXUCL_MCDbcCache<MSVT_LOT_LIST_R>(dbc_bldr, down,
				Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2,
				Srch01_RsltR.$itm_sub3, Srch01_RsltR.$lot_no, Srch01_RsltR.$sublot_no);

	}
	protected FXUCL_MCDbcCache<MST_PURC_ACT_D_R> _cachePad;
	protected void initDbcCachePurcActD(MCList<Srch01_RsltR> down) {
		
		MST_PURC_ACT_D_R t = MST_PURC_ACT_D_R.create("T");
		MST_PURC_ACT_IO_R t2 = MST_PURC_ACT_IO_R.create("T2");
		MST_ARR_ACT_R t3 = MST_ARR_ACT_R.create("T3");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		
		dbc_bldr.setSelect(t2.purc_act_d_no, t2.purc_act_d_seq, t3.ship_fr_valid_dt,
				count(value("x")).over().partitionBy(t2.purc_act_d_no, t2.purc_act_d_seq)
						.as("valid_cnt"));
		dbc_bldr.addInnerJoin(t2, t2.purc_act_d_no.eq(t.purc_act_d_no)
				.and(t2.purc_act_d_seq.eq(t.purc_act_d_seq)));
		dbc_bldr.addInnerJoin(t3, t3.arr_act_no.eq(t2.arr_act_no));

		_cachePad = new FXUCL_MCDbcCache<MST_PURC_ACT_D_R>(dbc_bldr, down,
				Srch01_RsltR.$purc_act_d_no, Srch01_RsltR.$purc_act_d_seq);

	}
	protected FXUCL_Cache<MST_SLS_ACT_D_R> _cacheSad;
	protected void initDbcCacheSlsActD(MCList<Srch01_RsltR> down) {

		MST_SLS_ACT_D_R t = MST_SLS_ACT_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_SLS_ACT_IO_R t2 = MST_SLS_ACT_IO_R.create("T2");
		
		dbc_bldr.setGroupBy(t.sls_act_d_no, t.sls_act_d_seq);
		dbc_bldr.addGroupFunc(count(t2.sls_act_io_no), "io_cnt");
		dbc_bldr.addGroupFunc(sum(cases().when(t2.sync_flg.eq(value(true))).then(value(1))
				.otherwise(value(0))), "sync_flg_cnt");
		dbc_bldr.addInnerJoin(t2, t2.sls_act_d_no.eq(t.sls_act_d_no)
				.and(t2.sls_act_d_seq.eq(t.sls_act_d_seq)));
		
		MCList<MST_SLS_ACT_D_R> rslt = MCList.create(MST_SLS_ACT_D_R.class);
		dbSelectKey("MSBBL1320_MST_SLS_ACT_D_S03", rslt, dbc_bldr, down);
		
		if (!rslt.isEmpty()) {
			_cacheSad = new FXUCL_Cache<MST_SLS_ACT_D_R>();
			_cacheSad.setFixMaxCacheSize(-1);
			for (MST_SLS_ACT_D_R r : rslt) {
				_cacheSad.putCache(new Comparable[]{r.sls_act_d_no(), r.sls_act_d_seq()}, r);
			}
		}

	}
	protected FXUCL_MCDbcCache<MST_SLO_R> _cacheSlo;
	protected void initDbcCacheSlo(MCList<Srch01_RsltR> down) {

		MST_SLO_R t = MST_SLO_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		
		dbc_bldr.setSelect(t.slo_no, t.xrate_inpt_flg, t.ptax_xrate_inpt_flg);
		
		_cacheSlo = new FXUCL_MCDbcCache<MST_SLO_R>(dbc_bldr, down, Srch01_RsltR.$slo_no);
		
	}
	protected FXUCL_MCDbcCache<MST_SLS_SCHD_R> _cacheSs;
	protected void initDbcCacheSlsSchdArr(MCList<Srch01_RsltR> down) {

		MST_SLS_SCHD_R t = MST_SLS_SCHD_R.create("T");
		MST_PURC_SCHD_R t1 = MST_PURC_SCHD_R.create("T1");
		MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		
		MCList<MST_SLS_SCHD_R> dbc = MCList.create(MST_SLS_SCHD_R.class);
		dbc.addBooleanColumn("arr_schd_lot_fix_flg");
		dbc_bldr.setSelect(t.sls_schd_no, cases().when(t2.lot_no.isNotNull())
				.then(value(true)).otherwise(value(false)).as("arr_schd_lot_fix_flg"));
		dbc_bldr.addInnerJoin(t1, t1.purc_schd_no.eq(t.purc_schd_no));
		dbc_bldr.addInnerJoin(t2, t2.arr_schd_no.eq(t1.arr_schd_no));

		_cacheSs = new FXUCL_MCDbcCache<MST_SLS_SCHD_R>(dbc, dbc_bldr, down, Srch01_RsltR.$sls_schd_no);
		
	}
	protected FXUCL_Cache<MST_SLO_D_R> _cacheSlodSls;
	protected void initDbcCacheSloDSls(MCList<Srch01_RsltR> down) {

		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MST_SLS_SCHD_R t2 = MST_SLS_SCHD_R.create("T2");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

		MCList<MST_SLO_D_R> dbc = MCList.create(MST_SLO_D_R.class);
		dbc.addNumberColumn("sls_schd_qty");
		dbc.addNumberColumn("abort_qty");
		dbc_bldr.setGroupBy(t.slo_d_no);
		dbc_bldr.addGroupFunc(sum(t2.trd_unit_qty), "sls_schd_qty");
		dbc_bldr.addGroupFunc(sum(t2.base_unit_abort_qty), "abort_qty");
		dbc_bldr.addInnerJoin(t2, t2.slo_d_no.eq(t.slo_d_no)
				.and(t2.abort_flg.eq(value(true))));
		
		MCList<MST_SLO_D_R> rslt = MCList.create(MST_SLO_D_R.class);
		dbSelectKey("MSBBL1320_MST_SLO_D_S03", rslt, dbc_bldr, down);
		
		if (!rslt.isEmpty()) {
			_cacheSlodSls = new FXUCL_Cache<MST_SLO_D_R>();
			_cacheSlodSls.setFixMaxCacheSize(-1);
			for (MST_SLO_D_R r : rslt) {
				_cacheSlodSls.putCache(new String[]{r.slo_d_no()}, r);
			}
		}
		
	}
	protected FXUCL_MCDbcCache<MST_SLO_D_R> _cacheSloDShipPr;
	protected void initDbcCacheSloDShipPr(MCList<Srch01_RsltR> down) {

		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

		MCList<MST_SLO_D_R> dbc = MCList.create(MST_SLO_D_R.class);
		dbc_bldr.setSelect(t2.upd_cntr);
		dbc_bldr.addInnerJoin(t2, t2.slo_d_no.eq(t.slo_d_no));
		
		_cacheSloDShipPr = new FXUCL_MCDbcCache<MST_SLO_D_R>(dbc, dbc_bldr, down, Srch01_RsltR.$slo_d_no);
	}

	protected MCList<MST_DLV_SLIP_R> _cacheDlvSlipL = null;
	protected MCIndexKey _dlvSlipIdx = null;

	protected static void initDbcCacheDlvSlip(MCList<?> dtlL) {
		object(CLAZZ)._initDbcCacheDlvSlip(dtlL);
	}
	protected void _initDbcCacheDlvSlip(MCList<?> dtlL) {

		_cacheDlvSlipL = MCList.create(MST_DLV_SLIP_R.class);
		MST_DLV_SLIP_R dlvSlipR = MST_DLV_SLIP_R.create("SLIP");
		MST_DLV_SLIP_R w1 = MST_DLV_SLIP_R.create("SLIP_W1");
		MCQueryApiBuilder dlvSlipBldr = MCQueryApiBuilder.create(dlvSlipR);
		dlvSlipBldr.setSelect(dlvSlipR.dlv_slip_no);
		dlvSlipBldr.addSelect(dlvSlipR.ac_dt);
		dlvSlipBldr.setWhere(dlvSlipR.dlv_slip_no.eq(bind("ship_dlv_slip_no")));
		dlvSlipBldr.addWhereWithAnd(dlvSlipR.dlv_slip_seq.eq(
			subQuery()
			.select(max(w1.dlv_slip_seq))
			.from(w1)
			.where(
				w1.dlv_slip_no.eq(dlvSlipR.dlv_slip_no)
				.and(w1.trn_typ.eq(value(MSC_TRN_TYP.SHIP.value())))
				.and(w1.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
			)
		));
		dbSelect("MSBBL1320_MST_DLV_SLIP_S01", _cacheDlvSlipL, dlvSlipBldr, dtlL);

		_dlvSlipIdx = _cacheDlvSlipL.createIndex(MST_DLV_SLIP_R.$dlv_slip_no);
	}
	protected static MST_DLV_SLIP_R getFirstDlvSlipCache(String dlvSlipNo) {
		return object(CLAZZ)._getFirstDlvSlipCache(dlvSlipNo);
	}
	protected MST_DLV_SLIP_R _getFirstDlvSlipCache(String dlvSlipNo) {
		return _cacheDlvSlipL.getFirst(_dlvSlipIdx, dlvSlipNo);
	}

	protected MCDynamicSQLInfo checkJoin(Srch01_CndR up) {
		if (isSame(up.ope(), SRCH_OPE_INS)) {
			MCTempView S0_V1 = createTempView("V1");
			MST_SLS_SCHD_R S2_T1 = MST_SLS_SCHD_R.create("T1");
			MST_PO_SCHD_R S0_PO_SCHD = MST_PO_SCHD_R.create("PO_SCHD");
			MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
			
			return when(null)
					.select(DS0D, S0_PO_SCHD.po_no)
					.view(DS0D, v -> v.leftOuterJoin(S0_PO_SCHD).on(S0_PO_SCHD.po_schd_no.eq(S0_V1.pr(S2_T1.po_schd_no))))
					.predicate(DS0D, p -> p.cutoff$and(S0_PO_SCHD.po_no.like(bind("po_no"))));
		}
		return null;
	}


	protected MCMessageList checkDtl(MCList<MST_SLS_ACT_R> actL, MCList<? extends MCRow> up0) {
		MCMessageList msgL = new MCMessageList();
		MCIndexKey idxKey = actL.createIndex(MST_SLS_ACT_R.$sls_act_no);
		initBpCache();
		
		for (MCRow r : up0) {
			MST_SLS_ACT_R row = actL.getFirst(idxKey, r.getStringNE("sls_act_no"));
			if (row != null) {
				msgL.addAll(checkCst(r, row.cst_cd()));
			}
		}
		return msgL;
	}
	
	protected MCMessageList checkCst(MCRow r, String cst_cd) {
		MCMessageList msgL = new MCMessageList();
		MAM_BP_R bpR = MAM_BP_R.create();
		bpR = getBpCache(cst_cd);
		
		if (bpR.isEmpty()) {
			msgL.add(new MCMessage(r, null, MAUAL0117, cst_cd));
		} else if (!bpR.cst_flg() || bpR.cst_sundry_flg()) {
			msgL.add(new MCMessage(r, null, MAUAL0260, cst_cd));
		}
		return msgL;
	}

	/**
	 * 品目マスタ取得
	 * @param bindL 取得対象の品目情報を持ったリスト
	 * @return mamItmL 品目マスタの取得結果リスト
	 */
	protected MCList<MAM_ITM_R> searchMamItm(MCList bindL) {
		MAM_ITM_R mamItmL_t = MAM_ITM_R.create("T");
		MCQueryApiBuilder mamItmL_bldr = MCQueryApiBuilder.create(mamItmL_t);
		MCList<MAM_ITM_R> mamItmL = MCList.create(MAM_ITM_R.class);
		
		mamItmL_bldr.setSelect(mamItmL_bldr.getBaseDbc().getKeyColumn$());
		mamItmL_bldr.setWhere(mamItmL_t.itm_cd.eq(bind("itm_cd")));
		mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub1.eq(bind("itm_sub1")));
		mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub2.eq(bind("itm_sub2")));
		mamItmL_bldr.addWhereWithAnd(mamItmL_t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect("MSBBL1320_MAM_ITM_S01", mamItmL, mamItmL_bldr, bindL);
		return mamItmL;
	}

	//FMCB CUSTOM END
}