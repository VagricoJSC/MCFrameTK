package mcframe.serverMABS.MABSL0010;

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
import mcframe.serverMABS.MABSL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ItmDtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ItmDtlReg_MC extends MABSL_ItmDtlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ItmDtl_UpdChk01オペレーション.<p>
	 *
	 * 品目詳細マスタの登録前のチェックを行います。<br>
	 */
	public class ItmDtl_UpdChk01 extends MABSL_ItmDtlReg_MC_A.ItmDtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					ItmDtl_UpdChk01_DtlR.$wg_cd));
			
			return msgLst;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			createBpCache();

			String _defWgCd = getSysParmNE("DEF_WG_CD") ;
			for (ItmDtl_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 収率機能が無効の場合、各収率を強制クリアする
				if (isSame(getSysParm("YIELD_ENABLE_FLG"), "0")) {
					r.itm_lower_yield(null);
					r.itm_std_yield(null);
					r.itm_upper_yield(null);
				}

				if (!isNull(_defWgCd) && isNullOrNullVal(r.wg_cd())) {
					r.wg_cd(_defWgCd) ;
				}

				// 条件付必須チェック
				if (!isNullOrNullVal(r.mfg_loc_cd())) {
					msgList.addAll(check(r, ItmDtl_UpdChk01_DtlR.$mfg_lt, new FXUCL_RequiredValidater()));
					if (isNullOrNullVal(r.bom_ptn())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$bom_ptn, MABSL0086, toDispGUIIndex(r)));
					}
				}
				if (!isNullOrNullVal(r.sppl_cd()) || !isNull(r.loc_sppl_cd())) {
					msgList.addAll(check(r, ItmDtl_UpdChk01_DtlR.$purc_lt, new FXUCL_RequiredValidater()));
					msgList.addAll(check(r, ItmDtl_UpdChk01_DtlR.$purc_id_typ, new FXUCL_RequiredValidater()));
				}
				if (!isNull(r.sz_day_week_typ())) {
					msgList.addAll(check(r, ItmDtl_UpdChk01_DtlR.$sz_week, new FXUCL_RequiredValidater()));
				}
				if (!isNullOrNullVal(r.mfg_loc_cd()) && !MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					msgList.addAll(check(r, ItmDtl_UpdChk01_DtlR.$lot_issue_typ, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!isNull(r.mfg_loc_wg_cd())) {
					if (!isSame(r.wg_cd(), r.mfg_loc_wg_cd())){
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$mfg_loc_cd, MABSL0164, r.mfg_loc_wg_cd(), toDispGUIIndex(r)));
					}
				}
				if (!isNullOrNullVal(r.mfg_loc_cd()) && !MAC_LOC_MNG_TYP.isPRD(r.loc_mng_typ())){
					msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$mfg_loc_cd, MABSL0054, toDispGUIIndex(r)));
				}
				
				if (!isNullOrNullVal(r.wg_cd()) && !isNull(r.rqst_loc_wg_cd())) {
					if (isSame(r.wg_cd(), r.rqst_loc_wg_cd())){
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$rqst_loc_cd, MABSL0165, toDispGUIIndex(r)));
					}
				}

				if (!MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
					if (!isNullOrNullVal(r.mfg_loc_cd())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$mfg_loc_cd, MABSL0059, toDispGUIIndex(r)));
					}
					if (MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$purc_id_typ, MABSL0062, toDispGUIIndex(r)));
					}
				}
				if (isNullOrNullVal(r.sppl_cd())) {
					if (!isNullOrNullVal(r.maker_cd())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$maker_cd, MABSL0060, toDispGUIIndex(r)));
					}
				}
				if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ()) 
				 && !isNullOrNullVal(r.sppl_cd())
				 && !MAC_PURC_ID_TYP.isPURC(r.purc_id_typ())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$purc_id_typ, MABSL0085, toDispGUIIndex(r)));
				}
				if (isNullOrNullVal(r.mfg_loc_cd())) {
					if (!isNullOrNullVal(r.bom_ptn())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$bom_ptn, MABSL0061, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$bom_ptn), toDispGUIIndex(r)));
					}
					if (!isNull(r.mfg_lt())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$mfg_lt, MABSL0061, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$mfg_lt), toDispGUIIndex(r)));
					}
					if (!isNull(r.mfg_lt_add_qty())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$mfg_lt_add_qty, MABSL0061, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$mfg_lt_add_qty), toDispGUIIndex(r)));
					}
					if (!isNull(r.lot_issue_typ())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$lot_issue_typ, MABSL0061, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$lot_issue_typ), toDispGUIIndex(r)));
					}
					if (r.no_mfg_aprv_flg()) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$no_mfg_aprv_flg, MABSL0061, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$no_mfg_aprv_flg), toDispGUIIndex(r)));
					}

					if (r.inst_rec_issue_flg()) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$inst_rec_issue_flg, MABSL0061, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$inst_rec_issue_flg), toDispGUIIndex(r)));
					}
					if (!isNull(r.itm_lower_yield())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$itm_lower_yield, MABSL0061, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$itm_lower_yield), toDispGUIIndex(r)));
					}
					if (!isNull(r.itm_std_yield())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$itm_std_yield, MABSL0061, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$itm_std_yield), toDispGUIIndex(r)));
					}
					if (!isNull(r.itm_upper_yield())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$itm_upper_yield, MABSL0061, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$itm_upper_yield), toDispGUIIndex(r)));
					}
				}
				
				if (isNullOrNullVal(r.sppl_cd()) && isNull(r.loc_sppl_cd())) {
					if (!isNull(r.purc_lt())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$purc_lt, MABSL0065, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$purc_lt), toDispGUIIndex(r)));
					}
					if (!isNull(r.purc_lt_add_qty())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$purc_lt_add_qty, MABSL0065, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$purc_lt_add_qty), toDispGUIIndex(r)));
					}
					if (!isNull(r.accpt_insp_lt())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$accpt_insp_lt, MABSL0065, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$accpt_insp_lt), toDispGUIIndex(r)));
					}
					if (!isNull(r.rqst_wg_cd())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$rqst_wg_cd, MABSL0065, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$rqst_wg_cd), toDispGUIIndex(r)));
					}
					if (r.po_batch_flg()) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$po_batch_flg, MABSL0065, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$po_batch_flg), toDispGUIIndex(r)));
					}
					if (!isNull(r.purc_id_typ())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$purc_id_typ, MABSL0065, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$purc_id_typ), toDispGUIIndex(r)));
					}
					if(!isNull(r.purc_basis_typ())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$purc_basis_typ, MABSL0065, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$purc_basis_typ), toDispGUIIndex(r)));
					}
				}

				if (MAC_PURC_ID_TYP.isFFR_RCV(r.purc_id_typ()) || MAC_PURC_ID_TYP.isVMI(r.purc_id_typ())) {
					if (!isNull(r.accpt_insp_lt())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$accpt_insp_lt, MABSL0068, toDispGUIIndex(r)));
					}
					if (!isNull(r.loc_sppl_cd())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$purc_id_typ, MABSL0069, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.sz_day_week_typ())) {
					if (!isNull(r.sz_week())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$sz_week, MABSL0070, toDispGUIIndex(r)));
					}
				}
				
				if (isNullOrNullVal(r.bom_ptn())) {
					if (r.bkf_flg()) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$bkf_flg, MABSL0076, toDispGUIIndex(r)));
					}
				}

				if (isNullOrNullVal(r.mfg_loc_cd()) || !isNullOrNullVal(r.loc_sppl_cd())) {
					if (!isNullOrNullVal(r.oper_ptn())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$oper_ptn, MABSL0078, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$oper_ptn), toDispGUIIndex(r)));
					}
					if (!isNull(r.yield_schd_qty()) && !r.yield_schd_qty().eq(MCNumber.ONE)) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$yield_schd_qty, MABSL0072, toDispGUIIndex(r)));
					}
					if (!isNull(r.mfg_inst_qty()) && !r.mfg_inst_qty().eq(MCNumber.ONE)) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$mfg_inst_qty, MABSL0073, toDispGUIIndex(r)));
					}
					if (!isNull(r.fxd_rqmt_qty()) && !r.fxd_rqmt_qty().isZero()) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$fxd_rqmt_qty, MABSL0074, toDispGUIIndex(r)));
					}
					if (r.ln_stk_flg()) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$ln_stk_flg, MABSL0080, 
								getLabel(r, ItmDtl_UpdChk01_DtlR.$ln_stk_flg), toDispGUIIndex(r)));
					}
				}
				if (!isNullOrNullVal(r.sppl_cd()) || !isNull(r.loc_sppl_cd())) {
					MAM_BP_R bpR = MAM_BP_R.create();
					if(!isNullOrNullVal(r.sppl_cd())) {
						bpR = getCacheBp(r.sppl_cd());
					}else if(!isNull(r.loc_sppl_cd())){
						bpR = getCacheBp(r.loc_sppl_cd());
					}
					if(MAC_PURC_BASIS_TYP.isARR_BASIS(bpR.purc_basis_typ()) && isNull(r.purc_basis_typ()) && !isNull(r.accpt_insp_lt())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$accpt_insp_lt, MABSL0530, 
								bpR.bp_cd(), toDispGUIIndex(r)));
					}
					if(bpR.subcon_flg() && !isNull(r.accpt_insp_lt())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$accpt_insp_lt, MABSL0531, 
								bpR.bp_cd(), toDispGUIIndex(r)));
					}
					if(bpR.subcon_flg() && !isNull(r.purc_basis_typ())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$purc_basis_typ, MABSL0532, 
								bpR.bp_cd(), toDispGUIIndex(r)));
					}
				}
				
				if (MAC_PURC_BASIS_TYP.isARR_BASIS(r.purc_basis_typ())) {
					if (!isNull(r.accpt_insp_lt())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$accpt_insp_lt, MABSL0529, toDispGUIIndex(r)));
					}
				}
				
				if (isNull(r.rsrc_cd1())) {
					if (!isNull(r.rsrc_std_qty1())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$rsrc_std_qty1, MABSL0110, toDispGUIIndex(r)));
					}
					if (!isNull(r.rsrc_unit_qty1())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$rsrc_unit_qty1, MABSL0111, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.rsrc_cd2())) {
					if (!isNull(r.rsrc_std_qty2())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$rsrc_std_qty2, MABSL0112, toDispGUIIndex(r)));
					}
					if (!isNull(r.rsrc_unit_qty2())) {
						msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$rsrc_std_qty2, MABSL0113, toDispGUIIndex(r)));
					}
				}
				
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ()) 
				 && !isNull(r.sno1())) {
					msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$sno1, MABSL0066, 
							getLabel(r, ItmDtl_UpdChk01_DtlR.$sno1), toDispGUIIndex(r)));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())
				 && !isNull(r.sno2())) {
					msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$sno2, MABSL0066, 
							getLabel(r, ItmDtl_UpdChk01_DtlR.$sno2), toDispGUIIndex(r)));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())
				 && !isNull(r.sno3())) {
					msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$sno3, MABSL0066, 
							getLabel(r, ItmDtl_UpdChk01_DtlR.$sno3), toDispGUIIndex(r)));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())
				 && !isNull(r.sno4())) {
					msgList.add(new MCMessage(r, ItmDtl_UpdChk01_DtlR.$sno4, MABSL0066, 
							getLabel(r, ItmDtl_UpdChk01_DtlR.$sno4), toDispGUIIndex(r)));
				}
				
				// 数量の小数部有効桁数チェック
				// 製造ＬＴ加算基準数量
				if (!isNull(r.mfg_lt_add_qty())) {
					msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$mfg_lt_add_qty));
				}
				// 購入ＬＴ加算基準数量
				if (!isNull(r.purc_lt_add_qty())) {
					msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$purc_lt_add_qty));
				}
				// 最小ロット数量
				msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$min_lot_qty));
				// 刻みロット数量
				msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$batch_lot_qty));
				// 最大ロット数量
				msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$max_lot_qty));
				// 出来高予定数量
				msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$yield_schd_qty));
				// 製造指図数量
				msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$mfg_inst_qty));
				// 固定必要数量
				if (!isNull(r.fxd_rqmt_qty())) {
					msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$fxd_rqmt_qty));
				}
				// 資源単位数量１
				if (!isNull(r.rsrc_unit_qty1())) {
					msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$rsrc_unit_qty1));
				}
				// 資源単位数量２
				if (!isNull(r.rsrc_unit_qty2())) {
					msgList.addAll(checkDecPlace(r, ItmDtl_UpdChk01_DtlR.$dec_place, ItmDtl_UpdChk01_DtlR.$rsrc_unit_qty2));
				}
			}
			return msgList;
		}
		
		/**
		 * キャッシュ作成（取引先マスタ）
		 */
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp; 
		protected void createBpCache() {
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			for (ItmDtl_UpdChk01_DtlR r : up0()) {
				if (!isNullOrNullVal(r.sppl_cd())) {
					MAM_BP_R spplR = MAM_BP_R.create();
					spplR.bp_cd(r.sppl_cd());
					bindL.add(spplR);
				}
				
				if (!isNullOrNullVal(r.loc_sppl_cd())) {
					MAM_BP_R locSpplR = MAM_BP_R.create();
					locSpplR.bp_cd(r.loc_sppl_cd());
					bindL.add(locSpplR);
				}
			}
			
			bindL = bindL.groupBy(MAM_BP_R.$bp_cd);
			
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(
					MCQueryApiBuilder.create(MAM_BP_R.create("T")),
					bindL, MAM_BP_R.$bp_cd);
		}
		
		/**
		 * キャッシュ取得（取引先マスタ）
		 * @param bpCd 取引先ＣＤ
		 * @return 取引先マスタ
		 */
		protected MAM_BP_R getCacheBp(String bpCd) {
			return _cacheBp.get(bpCd);
		}
	}
	/**
	 * ItmDtl_Upd01オペレーション.<p>
	 *
	 * 品目詳細マスタの登録を行います。<br>
	 */
	public class ItmDtl_Upd01 extends MABSL_ItmDtlReg_MC_A.ItmDtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void up() {
			setNUllValue();
			super.up();
		}
		
		/**
		 * デフォルト値を設定する。
		 */
		protected void setNUllValue() {
			boolean isNotYield = isSame(getSysParm("YIELD_ENABLE_FLG"),"0");
			
			for (ItmDtl_UpdChk01_DtlR r : up0()) {
				if (isNull(r.yield_schd_qty())) {
					r.yield_schd_qty(MCNumber.ONE);
				}
				if (isNull(r.mfg_inst_qty())) {
					r.mfg_inst_qty(MCNumber.ONE);
				}
				if (!isNullOrNullVal(r.mfg_loc_cd()) && isNull(r.oper_ptn())) {
					r.oper_ptn(MAC_STR.NULL_VAL.value());
				}
				if (isNotYield) {
					r.itm_lower_yield(null);
					r.itm_std_yield(null);
					r.itm_upper_yield(null);
				}
				String _defWgCd = getSysParmNE("DEF_WG_CD") ;
				if (!isNull(_defWgCd) && isNullOrNullVal(r.wg_cd())) {
					r.wg_cd(_defWgCd) ;
				}
			}
		}
	}
	/**
	 * ItmDtl_DelChk01オペレーション.<p>
	 *
	 * 品目詳細マスタの削除前のチェックを行います。<br>
	 */
	public class ItmDtl_DelChk01 extends MABSL_ItmDtlReg_MC_A.ItmDtl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(
					up0().subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd())),
					ItmDtl_DelChk01_DtlR.$wg_cd));
			
			return msgLst;
		}
	}
	/**
	 * ItmDtl_Del01オペレーション.<p>
	 *
	 * 品目詳細マスタの削除を行います。<br>
	 */
	public class ItmDtl_Del01 extends MABSL_ItmDtlReg_MC_A.ItmDtl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目詳細マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_ItmDtlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder,rslt);
			if (builder.getBaseDbc() instanceof MAM_ITM_DTL__R) {
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			dbcCustomizeCommon(builder);
			
			MAVM_RD_WG_R S1RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
			MAM_ITM_DTL__R t = MAM_ITM_DTL__R.create(builder.getBaseDbcAlias());
			
			String DefWgCd = getSysParm("DEF_WG_CD");
			if (up0().cmn_flg() == up0().wg_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(t.wg_cd.eq(value(DefWgCd))).or( exists( subQuery() .select(S1RD_WG1.wg_cd) .from(S1RD_WG1) .where( t.wg_cd.eq(S1RD_WG1.wg_cd) .cutoff$and(S1RD_WG1.wg_cd.like(bind("nullval_wg_cd"))) ) )));
			}
			else if (up0().cmn_flg()) {
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(t.wg_cd.eq(value(DefWgCd))));
			}
			else if (up0().wg_flg()) {
				builder.addWhereWithAnd(exists( subQuery() .select(S1RD_WG1.wg_cd) .from(S1RD_WG1) .where( t.wg_cd.eq(S1RD_WG1.wg_cd) .cutoff$and(S1RD_WG1.wg_cd.like(bind("nullval_wg_cd"))) )));
				
			}
			
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_DTL__R.$ITM1);
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");

			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));

			if(!isNull(up0().itm_grp_nm1())) {
				MAM_ITM_GRP_R ig1 = MAM_ITM_GRP_R.create("IG1");
				builder.addLeftOuterJoin(ig1, itm1.itm_grp_cd1.eq(ig1.itm_grp_cd)
						.and(ig1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(ig1.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm1)));
			}
			if(!isNull(up0().itm_grp_nm2())) {
				MAM_ITM_GRP_R ig2 = MAM_ITM_GRP_R.create("IG2");
				builder.addLeftOuterJoin(ig2, itm1.itm_grp_cd2.eq(ig2.itm_grp_cd)
						.and(ig2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(ig2.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm2)));
			}
			if(!isNull(up0().itm_grp_nm3())) {
				MAM_ITM_GRP_R ig3 = MAM_ITM_GRP_R.create("IG3");
				builder.addLeftOuterJoin(ig3, itm1.itm_grp_cd3.eq(ig3.itm_grp_cd)
						.and(ig3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(ig3.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm3)));
			}
			if(!isNull(up0().itm_grp_nm4())) {
				MAM_ITM_GRP_R ig4 = MAM_ITM_GRP_R.create("IG4");
				builder.addLeftOuterJoin(ig4, itm1.itm_grp_cd4.eq(ig4.itm_grp_cd)
						.and(ig4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(ig4.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm4)));
			}
			if(!isNull(up0().itm_grp_nm5())) {
				MAM_ITM_GRP_R ig5 = MAM_ITM_GRP_R.create("IG5");
				builder.addLeftOuterJoin(ig5, itm1.itm_grp_cd5.eq(ig5.itm_grp_cd)
						.and(ig5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(ig5.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm5)));
			}
			if(!isNull(up0().itm_grp_nm6())) {
				MAM_ITM_GRP_R ig6 = MAM_ITM_GRP_R.create("IG6");
				builder.addLeftOuterJoin(ig6, itm1.itm_grp_cd6.eq(ig6.itm_grp_cd)
						.and(ig6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(ig6.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm6)));
			}
			if(!isNull(up0().itm_grp_nm7())) {
				MAM_ITM_GRP_R ig7 = MAM_ITM_GRP_R.create("IG7");
				builder.addLeftOuterJoin(ig7, itm1.itm_grp_cd7.eq(ig7.itm_grp_cd)
						.and(ig7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(ig7.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm7)));
			}
			if(!isNull(up0().itm_grp_nm8())) {
				MAM_ITM_GRP_R ig8 = MAM_ITM_GRP_R.create("IG8");
				builder.addLeftOuterJoin(ig8, itm1.itm_grp_cd8.eq(ig8.itm_grp_cd)
						.and(ig8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(ig8.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm8)));
			}
			if(!isNull(up0().itm_grp_nm9())) {
				MAM_ITM_GRP_R ig9 = MAM_ITM_GRP_R.create("IG9");
				builder.addLeftOuterJoin(ig9, itm1.itm_grp_cd9.eq(ig9.itm_grp_cd)
						.and(ig9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(ig9.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm9)));
			}
			if(!isNull(up0().itm_grp_nm10())) {
				MAM_ITM_GRP_R ig10 = MAM_ITM_GRP_R.create("IG10");
				builder.addLeftOuterJoin(ig10, itm1.itm_grp_cd10.eq(ig10.itm_grp_cd)
						.and(ig10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(ig10.itm_grp_nm.like(bind(Srch01_CndR.$itm_grp_nm10)));
			}
			
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd1.like(bind(Srch01_CndR.$itm_grp_cd1)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd2.like(bind(Srch01_CndR.$itm_grp_cd2)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd3.like(bind(Srch01_CndR.$itm_grp_cd3)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd4.like(bind(Srch01_CndR.$itm_grp_cd4)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd5.like(bind(Srch01_CndR.$itm_grp_cd5)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd6.like(bind(Srch01_CndR.$itm_grp_cd6)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd7.like(bind(Srch01_CndR.$itm_grp_cd7)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd8.like(bind(Srch01_CndR.$itm_grp_cd8)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd9.like(bind(Srch01_CndR.$itm_grp_cd9)));
			builder.addWhereWithCutOffAnd(itm1.itm_grp_cd10.like(bind(Srch01_CndR.$itm_grp_cd10)));
			
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_DTL__R.$LOC1);
			MAM_LOC_R loc2 = MAM_LOC_R.create(MAM_ITM_DTL__R.$LOC2);
			MAM_WG_R wg3 = MAM_WG_R.create("WG3");
			MAM_SITE_R st1 = MAM_SITE_R.create("ST1");
			builder.addWhereWithCutOffAnd(loc1.site_cd.like(bind(Srch01_CndR.$site_cd)));
			builder.addWhereWithCutOffAnd(st1.site_nm.like(bind(Srch01_CndR.$site_nm)));
			builder.addWhereWithCutOffAnd(loc2.wg_cd.like(bind(Srch01_CndR.$rqst_loc_wg_cd)));
			builder.addWhereWithCutOffAnd(wg3.wg_nm.like(bind(Srch01_CndR.$rqst_loc_wg_nm)));
			
		}
	}
	
	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		// Select
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		MAM_RSRC_R rsrc1 = MAM_RSRC_R.create("RSRC1");
		MAM_RSRC_R rsrc2 = MAM_RSRC_R.create("RSRC2");
		MAM_SITE_R st1 = MAM_SITE_R.create("ST1");
		MAM_WG_R wg3 = MAM_WG_R.create("WG3");
		MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_DTL__R.$ITM1);
		MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_DTL__R.$LOC1);
		MAM_LOC_R loc2 = MAM_LOC_R.create(MAM_ITM_DTL__R.$LOC2);
		MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");

		builder.addSelect(itm1.stk_mng_typ);
		builder.addSelect(itm1.asset_mng_typ);
		builder.addSelect(itm1.unit_cd);
		builder.addSelect(itm1.dec_place);
		builder.addSelect(itm1.sno1_mng_typ);
		builder.addSelect(itm1.sno2_mng_typ);
		builder.addSelect(itm1.sno3_mng_typ);
		builder.addSelect(itm1.sno4_mng_typ);
		builder.addSelect(itm1.lot_mng_typ);
		builder.addSelect(itm1.def_bom_ptn);
		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itmtypd1.itm_typ_d_nm);
		builder.addSelect(loc1.sppl_cd.as("loc_sppl_cd"));
		builder.addSelect(loc1.rsrc_cd1);
		builder.addSelect(loc1.rsrc_cd2);
		builder.addSelect(rsrc1.rsrc_nm.as("rsrc_nm1"));
		builder.addSelect(rsrc1.rsrc_unit_nm.as("rsrc_unit_nm1"));
		builder.addSelect(rsrc2.rsrc_nm.as("rsrc_nm2"));
		builder.addSelect(rsrc2.rsrc_unit_nm.as("rsrc_unit_nm2"));
		builder.addSelect(loc1.site_cd);
		builder.addSelect(st1.site_nm);
		builder.addSelect(loc2.wg_cd.as("rqst_loc_wg_cd"));
		builder.addSelect(wg3.wg_nm.as("rqst_loc_wg_nm"));
		builder.addSelect(itm1.unit_cd.as("base_unit_cd"));
		builder.addSelect(unit1.unit_nm.as("base_unit_nm"));
		
		// Join
		builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
		builder.addLeftOuterJoin(rsrc1, loc1.rsrc_cd1.eq(rsrc1.rsrc_cd));
		builder.addLeftOuterJoin(rsrc2, loc1.rsrc_cd2.eq(rsrc2.rsrc_cd));
		builder.addLeftOuterJoin(st1, loc1.site_cd.eq(st1.site_cd));
		builder.addLeftOuterJoin(wg3, loc2.wg_cd.eq(wg3.wg_cd));
		builder.addLeftOuterJoin(unit1, itm1.unit_cd.eq(unit1.unit_cd));
		
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABSL_ItmDtlReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		
		protected <R extends MCDBContainer> void dbcCustomize(	
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder,rslt);
				dbcCustomizeCommon(builder);
			}
		
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目詳細マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_ItmDtlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目詳細マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_ItmDtlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}