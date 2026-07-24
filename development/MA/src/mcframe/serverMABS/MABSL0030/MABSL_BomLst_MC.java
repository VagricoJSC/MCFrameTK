package mcframe.serverMABS.MABSL0030;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABS.MABSL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_BomLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_BomLst_MC extends MABSL_BomLst_MC_A{
	//FMCB CUSTOM START
	protected static final String OPE_CHNG_VAL = "5";

	/**
	 * Bom_UpdChk01オペレーション.<p>
	 *
	 * ＢＯＭマスタの登録前チェックを行います。<br>
	 */
	public class Bom_UpdChk01 extends MABSL_BomLst_MC_A.Bom_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void init() {
			super.init();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					Bom_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			// 代替グループマスタ取得
			initAltGrpCache(up0());
			// 版マスタ取得
			initVerCache(up0());
			
			for (Bom_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// デフォルト値設定
				setDefault(r);

				if (!isNull(r.chd_itm_cd()) || !isNull(r.chd_itm_sub1()) 
						|| !isNull(r.chd_itm_sub2()) || !isNull(r.chd_itm_sub3())) {
					if (isNull(r.chd_itm_cd()) || isNull(r.chd_itm_sub1()) 
							|| isNull(r.chd_itm_sub2()) || isNull(r.chd_itm_sub3())) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$chd_itm_cd, MABCL0322, 
								getLabel(r, Bom_UpdChk01_DtlR.$chd_itm_cd), toDispGUIIndex(r)));
					}
				}

				// 条件付必須チェック
				if (isSame(r.bom_ptn(), MAC_STR.NULL_VAL.value())) {
					r.bom_ptn(null);
					msgList.addAll(check(r, Bom_UpdChk01_DtlR.$bom_ptn, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.oper_cd())) {
					msgList.addAll(check(r, Bom_UpdChk01_DtlR.$oper_seq, new FXUCL_RequiredValidater()));
				}
				if (!r.alt_itm_flg() && r.ver_flg() && !r.ph_flg() && !r.byprod_flg()) {
					msgList.addAll(check(r, Bom_UpdChk01_DtlR.$ver_no, new FXUCL_RequiredValidater()));
					if (!isNull(r.ver_no())) {
						MAM_ITM_VER_R itmVerR = getItmVerR(r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(), r.chd_itm_sub3(), r.ver_no());
						if (itmVerR == null) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$ver_no, 
									MABSL0533, toDispItm(r.chd_itm_cd(), r.chd_itm_sub1(),r.chd_itm_sub2(), r.chd_itm_sub3()), 
									r.ver_no(), 
									toDispGUIIndex(r)));
						}
					}
				}
				if (r.ph_flg()) {
					if (isSame(r.ph_bom_ptn(), MAC_STR.NULL_VAL.value())) {
						r.ph_bom_ptn(null);
					}
					msgList.addAll(check(r, Bom_UpdChk01_DtlR.$ph_bom_ptn, new FXUCL_RequiredValidater()));
				}
				if (r.alt_itm_flg()) {
					msgList.addAll(check(r, Bom_UpdChk01_DtlR.$alt_grp_cd, new FXUCL_RequiredValidater()));
				}
				if (!r.alt_itm_flg() && !isNull(r.alt_grp_cd())) {
					msgList.addAll(check(r, Bom_UpdChk01_DtlR.$alt_itm_typ, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, Bom_UpdChk01_DtlR.$alt_itm_ratio, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, Bom_UpdChk01_DtlR.$alt_alloc_prio, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (isSame(r.par_itm_cd(), r.chd_itm_cd())
						&& isSame(r.par_itm_sub1(), r.chd_itm_sub1())
						&& isSame(r.par_itm_sub2(), r.chd_itm_sub2())
						&& isSame(r.par_itm_sub3(), r.chd_itm_sub3())) {
					msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$par_itm_cd, MABSL0183, toDispGUIIndex(r)));
				}
				if (!isNull(r.alt_grp_cd()) && MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())){
					msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$inpt_ctl_typ, MABSL0121, toDispGUIIndex(r)));
				}
				if (!r.alt_itm_flg() && isNull(r.chd_itm_cd())) {
					msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$chd_itm_cd, MABSL0144, toDispGUIIndex(r)));
				}
				if (r.alt_itm_flg()) {
					if (!isNull(r.chd_itm_cd())) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$chd_itm_cd, MABSL0144, toDispGUIIndex(r)));
					}
					// 代替品目ＦＬＧ＝オンのとき、代替グループＣＤの存在チェック
					MAM_ALT_GRP__R altGrpR = getAltGrpR(r.wg_cd(), r.alt_grp_cd());
					if (altGrpR == null) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$alt_grp_cd, MABSL0063, r.wg_cd(), r.alt_grp_cd(), toDispGUIIndex(r)));
					}
					else {
						if (MAC_ALT_ITM_TYP.isMIX(altGrpR.alt_itm_typ()) && !r.fxd_chd_rqmt_qty().isZero()){
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$fxd_chd_rqmt_qty, MABSL0126, toDispGUIIndex(r)));
						}
					}
				}
				if (r.byprod_flg()) {
						if (!r.fxd_chd_rqmt_qty().isZero()) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$fxd_chd_rqmt_qty, MABSL0124, toDispGUIIndex(r)));
						}
						if (!isSame(r.chd_inpt_qty(), r.chd_rqmt_qty())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$chd_inpt_qty, MABSL0087, toDispGUIIndex(r)));
						}
						if (r.lot_mix_flg()) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$lot_mix_flg, MABSL0130, 
									getLabel(r, Bom_UpdChk01_DtlR.$lot_mix_flg), toDispGUIIndex(r)));
						}
						if (r.sublot_mix_flg()) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sublot_mix_flg, MABSL0130, 
									getLabel(r, Bom_UpdChk01_DtlR.$sublot_mix_flg), toDispGUIIndex(r)));
						}
						if (r.ph_flg()) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$ph_flg, MABSL0130, 
									getLabel(r, Bom_UpdChk01_DtlR.$ph_flg), toDispGUIIndex(r)));
						}
				}
				if (!isNull(r.alt_grp_cd()) && !r.alt_itm_flg() && MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ())){
						if (!r.fxd_chd_rqmt_qty().isZero()){
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$alt_itm_typ, MABSL0126, toDispGUIIndex(r)));
						}
						if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && !r.lot_mix_flg()){
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$alt_itm_typ, MABSL0188, toDispGUIIndex(r)));
						}
						if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) && !r.sublot_mix_flg()){
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$alt_itm_typ, MABSL0189, toDispGUIIndex(r)));
						}
						
				}
				if (r.ph_flg() || !isNull(r.chd_itm_cd())) {
					if (r.alt_itm_flg()) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$alt_itm_flg, MABSL0145, toDispGUIIndex(r)));
					}
				}
				if (r.alt_itm_flg() || !r.ver_flg() || r.ph_flg() || r.byprod_flg()) {
					if (!isNull(r.ver_no())) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$ver_no, MABSL0146, toDispGUIIndex(r)));
					}
				}
				if (!r.ph_flg()) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.chd_sno1_mng_typ())) {
						if (!MAC_SNO_TYP.isNO_EXTND(r.sno_typ1())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ1, MABSL0147, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ1), toDispGUIIndex(r)));
						}
					}
					else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.chd_sno1_mng_typ())) {
						if (!MAC_SNO_TYP.isEXTND(r.sno_typ1())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ1, MABSL0148, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ1), toDispGUIIndex(r)));
						}
						if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno1_mng_typ())
						 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.par_asset_mng_typ())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ1, MABSL0179, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ1), toDispGUIIndex(r)));
						}
					}
					else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.chd_sno1_mng_typ())) {
						if (!MAC_SNO_TYP.isEXTND_NULL(r.sno_typ1())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ1, MABSL0149, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ1), toDispGUIIndex(r)));
						}
					}
					
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.chd_sno2_mng_typ())) {
						if (!MAC_SNO_TYP.isNO_EXTND(r.sno_typ2())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ2, MABSL0147, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ2), toDispGUIIndex(r)));
						}
					}
					else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.chd_sno2_mng_typ())) {
						if (!MAC_SNO_TYP.isEXTND(r.sno_typ2())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ2, MABSL0148, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ2), toDispGUIIndex(r)));
						}
						if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno2_mng_typ())
						 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.par_asset_mng_typ())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ2, MABSL0179, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ2), toDispGUIIndex(r)));
						}
					}
					else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.chd_sno2_mng_typ())) {
						if (!MAC_SNO_TYP.isEXTND_NULL(r.sno_typ2())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ2, MABSL0149, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ2), toDispGUIIndex(r)));
						}
					}
					
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.chd_sno3_mng_typ())) {
						if (!MAC_SNO_TYP.isNO_EXTND(r.sno_typ3())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ3, MABSL0147, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ3), toDispGUIIndex(r)));
						}
					}
					else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.chd_sno3_mng_typ())) {
						if (!MAC_SNO_TYP.isEXTND(r.sno_typ3())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ3, MABSL0148, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ3), toDispGUIIndex(r)));
						}
						if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno3_mng_typ())
						 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.par_asset_mng_typ())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ3, MABSL0179, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ3), toDispGUIIndex(r)));
						}
					}
					else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.chd_sno3_mng_typ())) {
						if (!MAC_SNO_TYP.isEXTND_NULL(r.sno_typ3())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ3, MABSL0149, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ3), toDispGUIIndex(r)));
						}
					}
					
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.chd_sno4_mng_typ())) {
						if (!MAC_SNO_TYP.isNO_EXTND(r.sno_typ4())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ4, MABSL0147, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ4), toDispGUIIndex(r)));
						}
					}
					else if (MAC_SNO_MNG_TYP.isMNG_REQ(r.chd_sno4_mng_typ())) {
						if (!MAC_SNO_TYP.isEXTND(r.sno_typ4())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ4, MABSL0148, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ4), toDispGUIIndex(r)));
						}
						if (!MAC_SNO_MNG_TYP.isMNG_REQ(r.par_sno4_mng_typ())
						 && !MAC_ASSET_MNG_TYP.isPHANTOM(r.par_asset_mng_typ())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ4, MABSL0179, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ4), toDispGUIIndex(r)));
						}
					}
					else if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.chd_sno4_mng_typ())) {
						if (!MAC_SNO_TYP.isEXTND_NULL(r.sno_typ4())) {
							msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sno_typ4, MABSL0149, 
									getLabel(r, Bom_UpdChk01_DtlR.$sno_typ4), toDispGUIIndex(r)));
						}
					}
				}

				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())
				 || r.ph_flg()) {
					if (r.inst_lot_fix_flg()) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$inst_lot_fix_flg, MABSL0153, toDispGUIIndex(r)));
					}
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) || r.ph_flg()) {
					if (r.lot_mix_flg()) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$lot_mix_flg, MABSL0154, toDispGUIIndex(r)));
					}
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) || r.ph_flg()) {
					if (r.sublot_mix_flg()) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$sublot_mix_flg, MABSL0155, toDispGUIIndex(r)));
					}
				}
				if (MAC_ASSET_MNG_TYP.isPHANTOM(r.chd_asset_mng_typ()) && !r.ph_flg()) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$ph_flg, MABSL0088, toDispGUIIndex(r)));
				}
				if (MAC_STK_MNG_TYP.isNOT_MNG(r.chd_stk_mng_typ()) 
				 || MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())
				 || r.ph_flg()
				 || r.byprod_flg()) {
					if (!MAC_ALLOC_CTL_TYP.isNO_ALLOC(r.alloc_ctl_typ())) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$alloc_ctl_typ, MABSL0156, toDispGUIIndex(r)));
					}
				}
				if (r.byprod_flg() || r.ph_flg()) {
					if (r.main_itm_flg()) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$main_itm_flg, MABSL0157, toDispGUIIndex(r)));
					}
					if (r.yield_calc_flg()) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$yield_calc_flg, MABSL0158, toDispGUIIndex(r)));
					}
					if (!MAC_BKF_TYP.isNO_BKF(r.bkf_typ())) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$bkf_typ, MABSL0150, toDispGUIIndex(r)));
					}
					if (!MAC_INPT_CTL_TYP.isMRP_INPT(r.inpt_ctl_typ())) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$inpt_ctl_typ, MABSL0152, toDispGUIIndex(r)));
					}
					if (!isNull(r.alt_grp_cd())) {
						msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$alt_grp_cd, MABSL0151, toDispGUIIndex(r)));
					}
				}

				
				// 小数部有効桁数チェック
				msgList.addAll(checkDecPlace(r, Bom_UpdChk01_DtlR.$par_dec_place, Bom_UpdChk01_DtlR.$par_inst_qty));
				if (!isNull(r.chd_itm_cd())) {
					msgList.addAll(checkDecPlace(r, Bom_UpdChk01_DtlR.$chd_dec_place, Bom_UpdChk01_DtlR.$chd_inpt_qty));
					msgList.addAll(checkDecPlace(r, Bom_UpdChk01_DtlR.$chd_dec_place, Bom_UpdChk01_DtlR.$chd_rqmt_qty));
					msgList.addAll(checkDecPlace(r, Bom_UpdChk01_DtlR.$chd_dec_place, Bom_UpdChk01_DtlR.$fxd_chd_rqmt_qty));
				}
				// 子投入数量、子固定必要数量いずれかに０以外入力チェック
				if (r.chd_inpt_qty().isZero() && r.fxd_chd_rqmt_qty().isZero()) {
					msgList.add(new MCMessage(r, Bom_UpdChk01_DtlR.$chd_inpt_qty, MABSL0185, toDispGUIIndex(r)));
				}
				// 上限手配ＮＯと下限手配ＮＯの大小関係チェック
				if (!isNullOr(r.max_sno1(), r.min_sno1()) && r.max_sno1().compareTo(r.min_sno1()) < 0) {
					msgList.add(new MCMessage(r, null, MABSL0125, 
							getLabel(r, Bom_UpdChk01_DtlR.$min_sno1), r.min_sno1(), 
							getLabel(r, Bom_UpdChk01_DtlR.$max_sno1), r.max_sno1(), 
							toDispGUIIndex(r)));
				}
				if (!isNullOr(r.max_sno2(), r.min_sno2()) && r.max_sno2().compareTo(r.min_sno2()) < 0) {
					msgList.add(new MCMessage(r, null, MABSL0125,
							getLabel(r, Bom_UpdChk01_DtlR.$min_sno2), r.min_sno2(), 
							getLabel(r, Bom_UpdChk01_DtlR.$max_sno2), r.max_sno2(), 
							toDispGUIIndex(r)));
				}
				if (!isNullOr(r.max_sno3(), r.min_sno3()) && r.max_sno3().compareTo(r.min_sno3()) < 0) {
					msgList.add(new MCMessage(r, null, MABSL0125, 
							getLabel(r, Bom_UpdChk01_DtlR.$min_sno3), r.min_sno3(), 
							getLabel(r, Bom_UpdChk01_DtlR.$max_sno3), r.max_sno3(), 
							toDispGUIIndex(r)));
				}
				if (!isNullOr(r.max_sno4(), r.min_sno4()) && r.max_sno4().compareTo(r.min_sno4()) < 0) {
					msgList.add(new MCMessage(r, null, MABSL0125, 
							getLabel(r, Bom_UpdChk01_DtlR.$min_sno4), r.min_sno4(), 
							getLabel(r, Bom_UpdChk01_DtlR.$max_sno4), r.max_sno4(), 
							toDispGUIIndex(r)));
				}
			}
			
			return msgList;
		}
	}

	/**
	 * チェック前・更新前にデフォルト値を設定します。<p>
	 */
	protected void setDefault(Bom_UpdChk01_DtlR r) {
		// デフォルト値設定
		if (isNull(r.sno_typ1())) {
			r.sno_typ1(MAC_SNO_TYP.NO_EXTND.value());
		}
		if (isNull(r.sno_typ2())) {
			r.sno_typ2(MAC_SNO_TYP.NO_EXTND.value());
		}
		if (isNull(r.sno_typ3())) {
			r.sno_typ3(MAC_SNO_TYP.NO_EXTND.value());
		}
		if (isNull(r.sno_typ4())) {
			r.sno_typ4(MAC_SNO_TYP.NO_EXTND.value());
		}
		if (r.alt_itm_flg()) {
			r.alt_itm_typ(null);
			r.alt_itm_ratio(null);
			r.alt_alloc_prio(null);
		}
	}

	/**
	 * Bom_Upd01オペレーション.<p>
	 *
	 * ＢＯＭマスタの登録を行います。<br>
	 */
	public class Bom_Upd01 extends MABSL_BomLst_MC_A.Bom_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected boolean isStEndDt(MCDBContainer cond) {
			return false;
		}

		@Override
		protected void up() {
			setBomKey();
			editUp();

			super.up();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			for (Bom_UpdChk01_DtlR r : up0()) {
				setDefault(r);
				if (isNull(r.oper_cd()) && (!isNull(r.oper_seq()))) {
					r.oper_seq(null);
				}
			}
		}
		
		/**
		 * ＢＯＭキーを設定する。
		 */
		protected void setBomKey() {
			
			int i ;
			i = 0 ;
			for (Bom_UpdChk01_DtlR upR : up0()) {
				if (isNull(upR.bom_key())) {
					i++ ;
				}
			}
			
			if (i == 0) {
				return ;
			}
			
			doSeqCache(MAC_NUM_SYS_TYP.BOM_KEY, i);
			for (Bom_UpdChk01_DtlR upR : up0()) {
				if (isNull(upR.bom_key())) {
					upR.bom_key(getStrSeq(MAC_NUM_SYS_TYP.BOM_KEY)) ;
				}
			}
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			// 品目マスタ取得
			initItmCache(dbc);

			for (MCDBContainer r : dbc) {
				if (r instanceof MAM_BOM_R) {
					// 代替品目選択区分同値チェック
					checkAltItmTyp((MAM_BOM_R) r);
					// 有効成分対象同値チェック
					checkContFctr((MAM_BOM_R) r);
					// ロット混在・サブロット混在同値チェック
					checkLotMixAndSublotMix((MAM_BOM_R) r);
			
				}
			}
		}

		/**
		 * 同一組み合わせで代替品目選択区分が同値であるかチェックします。
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void checkAltItmTyp(MAM_BOM_R r) {
			// 代替グループがNULL、代替品目フラグがオン、削除フラグがオンは対象外
			if (isNull(r.alt_grp_cd()) || r.alt_itm_flg() || r.del_flg()) {
				return;
			}
			MAM_BOM_R t = MAM_BOM_R.create("T");
			int i = execDbCount("MABSL0030_MAM_BOM_S01", t,
					t.alt_itm_typ.neq(bind("alt_itm_typ"))
					.and(t.alt_grp_cd.eq(bind("alt_grp_cd")))
					.and(t.par_itm_cd.eq(bind("par_itm_cd")))
					.and(t.par_itm_sub1.eq(bind("par_itm_sub1")))
					.and(t.par_itm_sub2.eq(bind("par_itm_sub2")))
					.and(t.par_itm_sub3.eq(bind("par_itm_sub3")))
					.and(t.wg_cd.eq(bind("wg_cd")))
					.and(t.bom_ptn.eq(bind("bom_ptn")))
					.and(t.oper_cd.isNull()
							.and(bind("oper_cd").isNull())
							.or(t.oper_cd.eq(bind("oper_cd"))))
					.and(t.oper_seq.isNull()
							.and(bind("oper_seq").isNull())
							.or(t.oper_seq.eq(bind("oper_seq"))))
					.and(t.st_dt.eq(bind("st_dt")))
					.and(t.end_dt.eq(bind("end_dt")))
					.and(t.alt_itm_flg.eq(value(false)))
					.and(t.del_flg.eq(value(false))),
					r);
			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_BOM_R.$alt_itm_typ, MABSL0010,
						toDispItm(r.par_itm_cd(), r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3()), r.wg_cd(),
						r.bom_ptn(), r.oper_cd(), r.oper_seq(), toYMDString(r.st_dt()), toYMDString(r.end_dt()), r.alt_grp_cd(),
						toDispGUIIndex(r)));
			}

		}

		/**
		 * 同一組み合わせで有効成分対象が同値であるかチェックします。
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void checkContFctr(MAM_BOM_R r) {
			// 代替グループがNULL、代替品目フラグがオン、削除フラグがオンは対象外
			if (isNull(r.alt_grp_cd()) || r.alt_itm_flg() || r.del_flg()) {
				return;
			}
			MAM_ITM__R itmR = getItmR(r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(), r.chd_itm_sub3());

			if (itmR != null) {
				// 有効成分対象の異なるレコードを検索
				r.setBooleanNE(MAM_ITM__R.$cont_fctr_flg, itmR.cont_fctr_flg());
				MAM_ITM_R S1W = MAM_ITM_R.create("W");
				MAM_BOM_R t = MAM_BOM_R.create("T");
				int i = execDbCount("MABSL0030_MAM_BOM_S02", t,
						t.par_itm_cd.eq(bind("par_itm_cd"))
								.and(t.par_itm_sub1.eq(bind("par_itm_sub1")))
								.and(t.par_itm_sub2.eq(bind("par_itm_sub2")))
								.and(t.par_itm_sub3.eq(bind("par_itm_sub3")))
								.and(t.wg_cd.eq(bind("wg_cd")))
								.and(t.bom_ptn.eq(bind("bom_ptn")))
								.and(t.oper_cd.isNull()
										.and(bind("oper_cd").isNull())
										.or(t.oper_cd.eq(bind("oper_cd"))))
								.and(t.oper_seq.isNull()
										.and(bind("oper_seq").isNull())
										.or(t.oper_seq.eq(bind("oper_seq"))))
								.and(t.st_dt.lte(bind("end_dt")))
								.and(t.end_dt.gte(bind("st_dt")))
								.and(t.alt_grp_cd.eq(bind("alt_grp_cd")))
								.and(t.alt_itm_flg.eq(value(false)))
								.and(t.del_flg.eq(value(false)))
								.and(exists(subQuery().select(S1W.prAll()).from(S1W)
										.where(S1W.itm_cd.eq(t.chd_itm_cd)
												.and(S1W.itm_sub1.eq(t.chd_itm_sub1))
												.and(S1W.itm_sub2.eq(t.chd_itm_sub2))
												.and(S1W.itm_sub3.eq(t.chd_itm_sub3))
												.and(S1W.cont_fctr_flg.neq(bind("cont_fctr_flg")))))),r);
				if (i > 0) {
					getMsgList().add(new MCMessage(r, MAM_BOM_R.$chd_itm_cd, MABSL0011, toDispGUIIndex(r)));
				}
			}
		}

		/**
		 * 同一組み合わせでロット混在及びサブロット混在が同値であるかチェックします。
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void checkLotMixAndSublotMix(MAM_BOM_R r) {
			// 削除フラグがオン、架空品は対象外
			if (r.del_flg() || r.ph_flg()) {
				return;
			}
			// ロット混在・サブロット混在の異なるレコードを検索
			MAM_BOM_R t = MAM_BOM_R.create("T");
			int i = execDbCount("MABSL0030_MAM_BOM_S03", t,
					t.par_itm_cd.eq(bind("par_itm_cd"))
					.and(t.par_itm_sub1.eq(bind("par_itm_sub1")))
					.and(t.par_itm_sub2.eq(bind("par_itm_sub2")))
					.and(t.par_itm_sub3.eq(bind("par_itm_sub3")))
					.and(t.chd_itm_cd.eq(bind("chd_itm_cd")))
					.and(t.chd_itm_sub1.eq(bind("chd_itm_sub1")))
					.and(t.chd_itm_sub2.eq(bind("chd_itm_sub2")))
					.and(t.chd_itm_sub3.eq(bind("chd_itm_sub3")))
					.and(t.wg_cd.eq(bind("wg_cd")))
					.and(t.bom_ptn.eq(bind("bom_ptn")))
					.and(t.oper_cd.isNull()
							.and(bind("oper_cd").isNull())
							.or(t.oper_cd.eq(bind("oper_cd"))))
					.and(t.oper_seq.isNull()
							.and(bind("oper_seq").isNull())
							.or(t.oper_seq.eq(bind("oper_seq"))))
					.and(t.st_dt.lte(bind("end_dt")))
					.and(t.end_dt.gte(bind("st_dt")))
					.and(t.lot_mix_flg.neq(bind("lot_mix_flg"))
							.or(t.sublot_mix_flg.neq(bind("sublot_mix_flg"))))
					.and(t.ph_flg.eq(value(false)))
					.and(t.del_flg.eq(value(false))), r);
			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_BOM_R.$lot_mix_flg, MABSL0198, toDispGUIIndex(r)));
			}
		}
	}
	/**
	 * Bom_DelChk01オペレーション.<p>
	 *
	 * ＢＯＭマスタの削除前チェックを行います。<br>
	 */
	public class Bom_DelChk01 extends MABSL_BomLst_MC_A.Bom_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					Bom_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
	}
	/**
	 * Bom_Del01オペレーション.<p>
	 *
	 * ＢＯＭマスタの削除を行います。<br>
	 */
	public class Bom_Del01 extends MABSL_BomLst_MC_A.Bom_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＢＯＭマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_BomLst_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override

		protected void down() {

			super.down();

			// 切替用の編集
			MAM_ITM__R itmR = null;
			if (isSame(up0().ope(), OPE_CHNG_VAL)) {
				if (!isNull(up0().new_itm_cd())) {
					itmR = MAM_ITM__R.create();
					MAM_ITM__R t = MAM_ITM__R.create("T");
					MCQueryApiBuilder itmR_bldr = MCQueryApiBuilder.create(t);
					MAM_ITM_TYP_D_R itmtypd = MAM_ITM_TYP_D_R.create("ITMTYPD");
					MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");
					itmR_bldr.addLeftOuterJoin(itmtypd, t.itm_typ.eq(itmtypd.itm_typ)
							.and(t.itm_typ_d_cd.eq(itmtypd.itm_typ_d_cd)));
					itmR_bldr.addLeftOuterJoin(unit1, t.unit_cd.eq(unit1.unit_cd));
					itmR_bldr.addSelect(itmtypd.itm_typ_d_nm);
					itmR_bldr.addSelect(unit1.unit_nm);
					dbSelectKey("MABSL0030_MAM_ITM__S01", itmR, itmR_bldr,
							up0().new_itm_cd(), up0().new_itm_sub1(),
							up0().new_itm_sub2(), up0().new_itm_sub3());
				}

				MCList<Srch01_RsltR> l = down0().createInstance();
				for (Srch01_RsltR r : down0()) {
					Srch01_RsltR oldR = r.clone();
					oldR.setStatus(MCRow.MODIFY);
					oldR.end_dt(up0().chng_st_dt().addDay(-1));
					l.add(oldR);
	
					// ＢＯＭ切替区分＝１
					if (MAC_BOM_CHNG_TYP.isTERM(up0().bom_chng_typ())) {
						Srch01_RsltR newR = r.clone();
						newR.setStatus(MCRow.CREATE);
						newR.st_dt(up0().chng_st_dt());
						newR.end_dt(up0().chng_end_dt());
						newR.ver_no(up0().new_ver_no());
						setValue(newR, itmR);
						if (itmR == null) {
							newR.alt_itm_flg(true);
							newR.alt_grp_cd(up0().new_alt_grp_cd());
						}
						else {
							if (!isNull(up0().old_alt_grp_cd())) {
								newR.alt_grp_cd(null);
								newR.alt_grp_nm(null);
							}
						}
						l.add(newR);
					}
					// ＢＯＭ切替区分＝１以外
					else {
						MAC_BOM_CHNG_TYP typ = MAC_BOM_CHNG_TYP.get(up0().bom_chng_typ());
						Srch01_RsltR newR = r.clone();
						newR.setStatus(MCRow.CREATE);
						newR.st_dt(up0().chng_st_dt());
						newR.end_dt(up0().chng_end_dt());
						newR.alt_grp_cd(up0().new_alt_grp_cd());
						newR.alt_grp_nm(up0().new_alt_grp_nm());
						newR.alt_itm_ratio(typ.old_alt_itm_ratio());
						newR.alt_alloc_prio(typ.old_alt_alloc_prio());
						setValue(newR, null);
						l.add(newR);

						newR = r.clone();
						newR.setStatus(MCRow.CREATE);
						newR.st_dt(up0().chng_st_dt());
						newR.end_dt(up0().chng_end_dt());
						newR.ver_no(up0().new_ver_no());
						newR.alt_grp_cd(up0().new_alt_grp_cd());
						newR.alt_grp_nm(up0().new_alt_grp_nm());
						newR.alt_itm_ratio(typ.new_alt_itm_ratio());
						newR.alt_alloc_prio(typ.new_alt_alloc_prio());
						setValue(newR, itmR);
						l.add(newR);
					}
				}
				down0().setAll(l);
			}
		}

		/**
		 * 切替行の編集
		 */
		protected void setValue(Srch01_RsltR r, MAM_ITM__R itmR) {
			r.bom_key(null);
			r.chng_no(null);
			r.ext_sys_no_bom(null);

			r.ins_usr_id(null);
			r.ins_usr_nm(null);
			r.ins_ts(null);
			r.ins_func_id(null);
			r.ins_func_nm(null);
			r.upd_cntr(null);
			r.upd_usr_id(null);
			r.upd_usr_nm(null);
			r.upd_ts(null);
			r.upd_func_id(null);
			r.upd_func_nm(null);
			r.upd_srv_req_no(null);
			r.del_usr_id(null);
			r.del_usr_nm(null);
			r.del_ts(null);

			MAC_BOM_CHNG_TYP typ = MAC_BOM_CHNG_TYP.get(up0().bom_chng_typ());

			if (itmR == null) {
				if (MAC_BOM_CHNG_TYP.isTERM(typ)) {
					r.chd_itm_cd(null);
					r.chd_itm_sub1(null);
					r.chd_itm_sub2(null);
					r.chd_itm_sub3(null);
					r.chd_itm_nm(null);
					r.chd_sno1_mng_typ(null);
					r.chd_sno2_mng_typ(null);
					r.chd_sno3_mng_typ(null);
					r.chd_sno4_mng_typ(null);
					r.chd_def_bom_ptn(null);
					r.chd_dec_place(null);
					r.chd_base_unit_cd(null);
					r.chd_base_unit_nm(null);
					r.chd_stk_mng_typ(null);
					r.chd_asset_mng_typ(null);
					r.chd_itm_typ(null);
					r.chd_itm_typ_d_cd(null);
					r.chd_itm_typ_d_nm(null);
					r.lot_mng_typ(null);
					r.sublot_mng_typ(null);
					r.ver_flg(false);
				}
			}
			else {
				r.chd_itm_cd(itmR.itm_cd());
				r.chd_itm_sub1(itmR.itm_sub1());
				r.chd_itm_sub2(itmR.itm_sub2());
				r.chd_itm_sub3(itmR.itm_sub3());
				r.chd_itm_nm(itmR.itm_nm());
				r.chd_sno1_mng_typ(itmR.sno1_mng_typ());
				r.chd_sno2_mng_typ(itmR.sno2_mng_typ());
				r.chd_sno3_mng_typ(itmR.sno3_mng_typ());
				r.chd_sno4_mng_typ(itmR.sno4_mng_typ());
				r.chd_def_bom_ptn(itmR.def_bom_ptn());
				r.chd_dec_place(itmR.dec_place());
				r.chd_base_unit_cd(itmR.unit_cd());
				r.chd_base_unit_nm(itmR.getStringNE("unit_nm"));
				r.chd_stk_mng_typ(itmR.stk_mng_typ());
				r.chd_asset_mng_typ(itmR.asset_mng_typ());
				r.chd_itm_typ(itmR.itm_typ());
				r.chd_itm_typ_d_cd(itmR.itm_typ_d_cd());
				r.chd_itm_typ_d_nm(itmR.getStringNE("itm_typ_d_nm"));
				r.lot_mng_typ(itmR.lot_mng_typ());
				r.sublot_mng_typ(itmR.sublot_mng_typ());
				r.ver_flg(itmR.ver_flg());
			}

			if (!MAC_BOM_CHNG_TYP.isTERM(typ)) {
				r.alt_itm_typ(typ.alt_itm_typ());
				r.alt_itm_typ_nm(MAC_ALT_ITM_TYP.get(r.alt_itm_typ()).name());
			}
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_BOM_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			// 切替用の検索条件作成	
			MAM_BOM_R t = MAM_BOM_R.create(builder.getBaseDbcAlias());
			
			if (isSame(up0().ope(), OPE_CHNG_VAL)) {
				builder.setWhere(t.st_dt.lte(bind(Srch01_CndR.$chng_st_dt)));
				builder.addWhereWithAnd(t.end_dt.gte(bind(Srch01_CndR.$chng_st_dt)));
				builder.addWhereWithAnd(t.del_flg.eq(value(false)));
				if (!MAC_BOM_CHNG_TYP.isTERM(up0().bom_chng_typ())) {
					builder.addWhereWithAnd(t.alt_grp_cd.isNull());
				}
				builder.addWhereWithCutOffAnd(t.chd_itm_cd.eq(bind(Srch01_CndR.$old_itm_cd)));
				builder.addWhereWithCutOffAnd(t.chd_itm_sub1.eq(bind(Srch01_CndR.$old_itm_sub1)));
				builder.addWhereWithCutOffAnd(t.chd_itm_sub2.eq(bind(Srch01_CndR.$old_itm_sub2)));
				builder.addWhereWithCutOffAnd(t.chd_itm_sub3.eq(bind(Srch01_CndR.$old_itm_sub3)));
				builder.addWhereWithCutOffAnd(t.ver_no.eq(bind(Srch01_CndR.$old_ver_no)));
				builder.addWhereWithCutOffAnd(t.alt_grp_cd.eq(bind(Srch01_CndR.$old_alt_grp_cd)));
				if (!isNullOrNullVal(up0().chng_wg_cd())) {
					builder.addWhereWithAnd(t.wg_cd.eq(bind(Srch01_CndR.$chng_wg_cd)));
				}
			}
			// BOMマスタ登録から呼ばれた場合
			if (isNull(up0().ope())) {
				builder.setWhere(value(0).eq(value(0)));
				builder.addWhereWithCutOffAnd(t.par_itm_cd.eq(bind("par_itm_cd")));
				builder.addWhereWithCutOffAnd(t.par_itm_sub1.eq(bind("par_itm_sub1")));
				builder.addWhereWithCutOffAnd(t.par_itm_sub2.eq(bind("par_itm_sub2")));
				builder.addWhereWithCutOffAnd(t.par_itm_sub3.eq(bind("par_itm_sub3")));
				builder.addWhereWithCutOffAnd(t.wg_cd.eq(bind("wg_cd")));
				builder.addWhereWithCutOffAnd(t.bom_ptn.eq(bind("bom_ptn")));
				addDelFlagCnd(builder);
				addDtFromToCnd(builder);
			}
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
						.or( exists( subQuery() .select(S1WG2.prAll()) .from(S1WG2)
								.where( value(0).eq(value(0))
										.and(t.wg_cd.eq(S1WG2.wg_cd)) ) )));
			}
			else if (up0().cmn_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())));
			}
			else if (up0().wg_flg()) {
				builder.addWhereWithAnd(exists( subQuery() .select(S1WG2.prAll()) .from(S1WG2)
						.where( value(0).eq(value(0))
								.and(t.wg_cd.eq(S1WG2.wg_cd)) )));
			}
			


			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			MAM_ITM_TYP_D_R itmtypd2 = MAM_ITM_TYP_D_R.create("ITMTYPD2");
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_BOM_R.$ITM1);
			MAM_ITM__R itm2 = MAM_ITM__R.create(MAM_BOM_R.$ITM2);
			MAM_ALT_GRP__R alt_grp1 = MAM_ALT_GRP__R.create(MAM_BOM_R.$ALT_GRP1);
			MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");
			MAM_UNIT_R unit2 = MAM_UNIT_R.create("UNIT2");
			builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
					.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
			builder.addLeftOuterJoin(itmtypd2, itm2.itm_typ.eq(itmtypd2.itm_typ)
					.and(itm2.itm_typ_d_cd.eq(itmtypd2.itm_typ_d_cd)));
			builder.removeSelect(MAM_BOM_R.$alt_itm_typ);
			builder.addSelect(decode( t.alt_itm_flg, value(true), alt_grp1.alt_itm_typ, t.alt_itm_typ).as("alt_itm_typ"));
			builder.addLeftOuterJoin(unit1, itm1.unit_cd.eq(unit1.unit_cd));
			builder.addLeftOuterJoin(unit2, itm2.unit_cd.eq(unit2.unit_cd));

			builder.addSelect(itm1.dec_place.as("par_dec_place"));
			builder.addSelect(itm1.unit_cd.as("par_base_unit_cd"));
			builder.addSelect(unit1.unit_nm.as("par_base_unit_nm"));
			builder.addSelect(itm1.itm_typ.as("par_itm_typ"));
			builder.addSelect(itm1.itm_typ_d_cd.as("par_itm_typ_d_cd"));
			builder.addSelect(itmtypd1.itm_typ_d_nm.as("par_itm_typ_d_nm"));
			builder.addSelect(itm1.sno1_mng_typ.as("par_sno1_mng_typ"));
			builder.addSelect(itm1.sno2_mng_typ.as("par_sno2_mng_typ"));
			builder.addSelect(itm1.sno3_mng_typ.as("par_sno3_mng_typ"));
			builder.addSelect(itm1.sno4_mng_typ.as("par_sno4_mng_typ"));
			builder.addSelect(itm1.def_bom_ptn.as("par_def_bom_ptn"));
			builder.addSelect(itm2.sno1_mng_typ.as("chd_sno1_mng_typ"));
			builder.addSelect(itm2.sno2_mng_typ.as("chd_sno2_mng_typ"));
			builder.addSelect(itm2.sno3_mng_typ.as("chd_sno3_mng_typ"));
			builder.addSelect(itm2.sno4_mng_typ.as("chd_sno4_mng_typ"));
			builder.addSelect(itm2.def_bom_ptn.as("chd_def_bom_ptn"));
			builder.addSelect(itm2.dec_place.as("chd_dec_place"));
			builder.addSelect(itm2.unit_cd.as("chd_base_unit_cd"));
			builder.addSelect(unit2.unit_nm.as("chd_base_unit_nm"));
			builder.addSelect(itm2.stk_mng_typ.as("chd_stk_mng_typ"));
			builder.addSelect(itm2.asset_mng_typ.as("chd_asset_mng_typ"));
			builder.addSelect(itm2.itm_typ.as("chd_itm_typ"));
			builder.addSelect(itm2.itm_typ_d_cd.as("chd_itm_typ_d_cd"));
			builder.addSelect(itmtypd2.itm_typ_d_nm.as("chd_itm_typ_d_nm"));
			builder.addSelect(itm2.lot_mng_typ);
			builder.addSelect(itm2.sublot_mng_typ);
			builder.addSelect(itm2.ver_flg);
			rslt.addBooleanColumn("ver_flg");

			// 切替時は以下の検索条件は使用しない
			if (isSame(up0().ope(), OPE_CHNG_VAL)) {
				return ;
			}

			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$par_itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$par_itm_typ_d_cd)));			
			builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$par_itm_typ_d_nm)));

			builder.addWhereWithCutOffAnd(itm2.itm_typ.like(bind(Srch01_CndR.$chd_itm_typ)));
			builder.addWhereWithCutOffAnd(itm2.itm_typ_d_cd.like(bind(Srch01_CndR.$chd_itm_typ_d_cd)));			
			builder.addWhereWithCutOffAnd(itmtypd2.itm_typ_d_nm.like(bind(Srch01_CndR.$chd_itm_typ_d_nm)));

			if(!isNull(up0().par_itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm1)));
			}
			if(!isNull(up0().par_itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm2)));
			}
			if(!isNull(up0().par_itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm3)));
			}
			if(!isNull(up0().par_itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm4)));
			}
			if(!isNull(up0().par_itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm5)));
			}
			if(!isNull(up0().par_itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm6)));
			}
			if(!isNull(up0().par_itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm7)));
			}
			if(!isNull(up0().par_itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm8)));
			}
			if(!isNull(up0().par_itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm9)));
			}
			if(!isNull(up0().par_itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(ig10.itm_grp_nm.like(bind(Srch01_CndR.$par_itm_grp_nm10)));
			}

			if(!isNull(up0().chd_itm_grp_nm1())) {
				MAM_ITM_GRP_R ig11 = MAM_ITM_GRP_R.create("IG11");
				builder.addLeftOuterJoin(ig11, itm2.itm_grp_cd1.eq(ig11.itm_grp_cd)
						.and(ig11.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(ig11.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm1)));
			}
			if(!isNull(up0().chd_itm_grp_nm2())) {
				MAM_ITM_GRP_R ig12 = MAM_ITM_GRP_R.create("IG12");
				builder.addLeftOuterJoin(ig12, itm2.itm_grp_cd2.eq(ig12.itm_grp_cd)
						.and(ig12.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(ig12.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm2)));
			}
			if(!isNull(up0().chd_itm_grp_nm3())) {
				MAM_ITM_GRP_R ig13 = MAM_ITM_GRP_R.create("IG13");
				builder.addLeftOuterJoin(ig13, itm2.itm_grp_cd3.eq(ig13.itm_grp_cd)
						.and(ig13.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(ig13.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm3)));
			}
			if(!isNull(up0().chd_itm_grp_nm4())) {
				MAM_ITM_GRP_R ig14 = MAM_ITM_GRP_R.create("IG14");
				builder.addLeftOuterJoin(ig14, itm2.itm_grp_cd4.eq(ig14.itm_grp_cd)
						.and(ig14.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(ig14.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm4)));
			}
			if(!isNull(up0().chd_itm_grp_nm5())) {
				MAM_ITM_GRP_R ig15 = MAM_ITM_GRP_R.create("IG15");
				builder.addLeftOuterJoin(ig15, itm2.itm_grp_cd5.eq(ig15.itm_grp_cd)
						.and(ig15.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(ig15.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm5)));
			}
			if(!isNull(up0().chd_itm_grp_nm6())) {
				MAM_ITM_GRP_R ig16 = MAM_ITM_GRP_R.create("IG16");
				builder.addLeftOuterJoin(ig16, itm2.itm_grp_cd6.eq(ig16.itm_grp_cd)
						.and(ig16.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(ig16.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm6)));
			}
			if(!isNull(up0().chd_itm_grp_nm7())) {
				MAM_ITM_GRP_R ig17 = MAM_ITM_GRP_R.create("IG17");
				builder.addLeftOuterJoin(ig17, itm2.itm_grp_cd7.eq(ig17.itm_grp_cd)
						.and(ig17.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(ig17.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm7)));
			}
			if(!isNull(up0().chd_itm_grp_nm8())) {
				MAM_ITM_GRP_R ig18 = MAM_ITM_GRP_R.create("IG18");
				builder.addLeftOuterJoin(ig18, itm2.itm_grp_cd8.eq(ig18.itm_grp_cd)
						.and(ig18.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(ig18.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm8)));
			}
			if(!isNull(up0().chd_itm_grp_nm9())) {
				MAM_ITM_GRP_R ig19 = MAM_ITM_GRP_R.create("IG19");
				builder.addLeftOuterJoin(ig19, itm2.itm_grp_cd9.eq(ig19.itm_grp_cd)
						.and(ig19.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(ig19.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm9)));
			}
			if(!isNull(up0().chd_itm_grp_nm10())) {
				MAM_ITM_GRP_R ig20 = MAM_ITM_GRP_R.create("IG20");
				builder.addLeftOuterJoin(ig20, itm2.itm_grp_cd10.eq(ig20.itm_grp_cd)
						.and(ig20.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(ig20.itm_grp_nm.like(bind(Srch01_CndR.$chd_itm_grp_nm10)));
			}

			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd1.like(bind(Srch01_CndR.$par_itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd2.like(bind(Srch01_CndR.$par_itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd3.like(bind(Srch01_CndR.$par_itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd4.like(bind(Srch01_CndR.$par_itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd5.like(bind(Srch01_CndR.$par_itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd6.like(bind(Srch01_CndR.$par_itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd7.like(bind(Srch01_CndR.$par_itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd8.like(bind(Srch01_CndR.$par_itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd9.like(bind(Srch01_CndR.$par_itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd10.like(bind(Srch01_CndR.$par_itm_grp_cd10)));
			
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd1.like(bind(Srch01_CndR.$chd_itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd2.like(bind(Srch01_CndR.$chd_itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd3.like(bind(Srch01_CndR.$chd_itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd4.like(bind(Srch01_CndR.$chd_itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd5.like(bind(Srch01_CndR.$chd_itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd6.like(bind(Srch01_CndR.$chd_itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd7.like(bind(Srch01_CndR.$chd_itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd8.like(bind(Srch01_CndR.$chd_itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd9.like(bind(Srch01_CndR.$chd_itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(itm2.itm_grp_cd10.like(bind(Srch01_CndR.$chd_itm_grp_cd10)));

		}

		@Override
		protected void down_SELECT_c0_0(Srch01_RsltR r_dest, MAM_BOM_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			if (isNull(r_src.chd_itm_cd())) {
				r_dest.chd_dec_place(Srch01_RsltR.chd_rqmt_qty_META.scale());
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＢＯＭマスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_BomLst_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * ＢＯＭマスタの登録を行います。<br>
	 */
	public class Del01 extends MABSL_BomLst_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	// ///////////////////////////////////////////////
	// マスタ取得（ここから）
	// ///////////////////////////////////////////////
	protected static final Class<MABSL_BomLst> CLAZZ = MABSL_BomLst.class;

	/**
	 * 代替グループマスタの主キーワークテーブル作成
	 */

	protected void insAltGrpWk(MCList<Bom_UpdChk01_DtlR> bindL) {

		MAW_ALT_GRP_KEY_R S0T = MAW_ALT_GRP_KEY_R.create("T");

		dbWkDelete("MABSL0030_MAW_ALT_GRP_KEY_D01", MAM_ALT_GRP_R.create());

		MCInsert q1 = sql("MABSL0030_MAW_ALT_GRP_KEY_I01")
			.insert(S0T)
			.columns(
				S0T.alt_grp_cd,
				S0T.wg_cd
			)
			.values(
				bind("alt_grp_cd"),
				bind("wg_cd")
			);
		q1.executeBatchUpdate(bindL);

	}

	/**
	 * 「MAM_ALT_GRP_」取得
	 */
	MCList<MAM_ALT_GRP__R> _altGrpL;
	MCIndexKey _altGrpKey;

	protected void initAltGrpCache(MCList<Bom_UpdChk01_DtlR> dtlL) {
		// ワーク作成
		insAltGrpWk(dtlL.subList(Bom_UpdChk01_DtlR.$alt_itm_flg, true));

		// 検索
		MAW_ALT_GRP_KEY_R S1W = MAW_ALT_GRP_KEY_R.create("W");
		MCList<MAM_ALT_GRP__R> dbc = MCList.create(MAM_ALT_GRP__R.class);
		MAM_ALT_GRP__R t = MAM_ALT_GRP__R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.wg_cd, t.alt_grp_cd, t.alt_itm_typ);
		dbc_bldr.setWhere(value(0).eq(value(0)));
		dbc_bldr.addWhereWithAnd(exists( subQuery() .select(value("X")) .from(S1W)
				.where( S1W.wg_cd.eq(t.wg_cd)
						.and(S1W.alt_grp_cd.eq(t.alt_grp_cd)) )));
		dbSelect("MABSL0030_MAM_ALT_GRP__S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._altGrpL = dbc;
		object(CLAZZ)._altGrpKey = object(CLAZZ)._altGrpL.createIndex(
				MAM_ALT_GRP__R.$wg_cd,
				MAM_ALT_GRP__R.$alt_grp_cd
		);
	}

	protected MAM_ALT_GRP__R getAltGrpR(String wgCd, String altGrpCd) {
		return object(CLAZZ)._altGrpL.getFirst(object(CLAZZ)._altGrpKey, wgCd, altGrpCd);
	}

	/**
	 * 版マスタの主キーワークテーブル作成
	 */

	protected void insItmVerWk(MCList<Bom_UpdChk01_DtlR> bindL) {

		MAW_ITM_VER_KEY_R S0T = MAW_ITM_VER_KEY_R.create("T");

		dbWkDelete("MABSL0030_MAW_ITM_VER_KEY_D01", MAM_ITM_VER_R.create());

		MCInsert q1 = sql("MABSL0030_MAW_ITM_VER_KEY_I01")
			.insert(S0T)
			.columns(
				S0T.itm_cd,
				S0T.itm_sub1,
				S0T.itm_sub2,
				S0T.itm_sub3,
				S0T.ver_no
			)
			.values(
				bind("chd_itm_cd"),
				bind("chd_itm_sub1"),
				bind("chd_itm_sub2"),
				bind("chd_itm_sub3"),
				bind("ver_no")
			);
		q1.executeBatchUpdate(bindL);

	}

	/**
	 * 「MAM_ITM_VER_」取得
	 */
	MCList<MAM_ITM_VER_R> _itmVerL;
	MCIndexKey _itmVerKey;

	protected void initVerCache(MCList<Bom_UpdChk01_DtlR> dtlL) {
		// ワーク作成
		insItmVerWk(dtlL);

		// 検索
		MAW_ITM_VER_KEY_R S1W = MAW_ITM_VER_KEY_R.create("W");
		MCList<MAM_ITM_VER_R> dbc = MCList.create(MAM_ITM_VER_R.class);
		MAM_ITM_VER_R t = MAM_ITM_VER_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.ver_no);
		dbc_bldr.setWhere(value(0).eq(value(0)));
		dbc_bldr.addWhereWithAnd(exists( subQuery() .select(value("X")) .from(S1W)
				.where( S1W.itm_cd.eq(t.itm_cd)
						.and(S1W.itm_sub1.eq(t.itm_sub1))
						.and(S1W.itm_sub2.eq(t.itm_sub2))
						.and(S1W.itm_sub3.eq(t.itm_sub3))
						.and(S1W.ver_no.eq(t.ver_no)))));
		dbSelect("MABSL0030_MAM_ITM_VER_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._itmVerL = dbc;
		object(CLAZZ)._itmVerKey = object(CLAZZ)._itmVerL.createIndex(
				MAM_ITM_VER_R.$itm_cd,
				MAM_ITM_VER_R.$itm_sub1,
				MAM_ITM_VER_R.$itm_sub2,
				MAM_ITM_VER_R.$itm_sub3,
				MAM_ITM_VER_R.$ver_no
		);
	}

	protected MAM_ITM_VER_R getItmVerR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String verNo) {
		return object(CLAZZ)._itmVerL.getFirst(object(CLAZZ)._itmVerKey,  itmCd, itmSub1, itmSub2, itmSub3, verNo);
	}

	/**
	 * 品目マスタの主キーワークテーブル作成
	 */
	protected void insItmWk(MCList<? extends MCRow> bindL) {
		MAW_ITM_KEY_R S0T = MAW_ITM_KEY_R.create("T");

		dbWkDelete("MABSL0030_MAW_ITM_KEY_D01", MAM_ITM_R.create());

		MCInsert q1 = sql("MABSL0030_MAW_ITM_KEY_I01")
			.insert(S0T)
			.columns(
				S0T.itm_cd,
				S0T.itm_sub1,
				S0T.itm_sub2,
				S0T.itm_sub3
			)
			.values(
				bind("chd_itm_cd"),
				bind("chd_itm_sub1"),
				bind("chd_itm_sub2"),
				bind("chd_itm_sub3")
			);
		q1.executeBatchUpdate(bindL);

	}
	/**
	 * 「MAM_ITM_」取得（有効成分対象を取得）
	 */
	MCList<MAM_ITM__R> _itmL;
	MCIndexKey _itmKey;

	protected void initItmCache(MCList<? extends MCRow> dtlL) {
		// ワーク作成
		insItmWk(dtlL);

		// 検索
		MAW_ITM_KEY_R S1W = MAW_ITM_KEY_R.create("W");
		MCList<MAM_ITM__R> dbc = MCList.create(MAM_ITM__R.class);
		MAM_ITM__R t = MAM_ITM__R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.cont_fctr_flg);
		dbc_bldr.setWhere(exists( subQuery() .select(value("X")) .from(S1W)
				.where( S1W.itm_cd.eq(t.itm_cd)
						.and(S1W.itm_sub1.eq(t.itm_sub1))
						.and(S1W.itm_sub2.eq(t.itm_sub2))
						.and(S1W.itm_sub3.eq(t.itm_sub3)) )));
		dbSelect("MABSL0030_MAM_ITM__S02", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._itmL = dbc;
		object(CLAZZ)._itmKey = object(CLAZZ)._itmL.createIndex(
				MAM_ITM__R.$itm_cd, MAM_ITM__R.$itm_sub1, MAM_ITM__R.$itm_sub2, MAM_ITM__R.$itm_sub3
		);
	}

	protected MAM_ITM__R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return object(CLAZZ)._itmL.getFirst(object(CLAZZ)._itmKey, itmCd, itmSub1, itmSub2, itmSub3);
	}
	// ///////////////////////////////////////////////
	// マスタ取得（ここまで）
	// ///////////////////////////////////////////////

	//FMCB CUSTOM END
}