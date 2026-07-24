package mcframe.serverMSBA.MSBAL0020;

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
import mcframe.serverMSBA.MSBAL0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBA.MSBAL0020.Query.*;
import mcframe.serverMSBA.MSBAL5100.*;
import mcframe.serverMSBE.MSBEL5060.*;
import mcframe.commonCore.param.MCParam;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;

import java.util.*;
import mcframe.serverMSBD.MSBDL5040.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBAL_WgRqstAdjst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBAL_WgRqstAdjst_MC extends MSBAL_WgRqstAdjst_MC_A{
	//FMCB CUSTOM START

	String _sysParm = getSysParm("MASTER_DT_BASE");

	/**
	 * Chk01オペレーション.<p>
	 *
	 * ＷＧ間依頼回答を登録・訂正・削除するために、チェックを行う<br>
	 */
	public class Chk01 extends MSBAL_WgRqstAdjst_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			callWgRqstSrvChk02();
			
			// 下段のエラーを上段に連動する
			MCIndexKey up0Key = up0().createIndex(Chk01_Rslt1R.$wg_rqst_no);
			for(Chk01_Rslt2R r : up1()) {
				if(r.err_flg()) {
					Chk01_Rslt1R up0 = up0().getFirst(up0Key, r.wg_rqst_no());
					up0.err_flg(r.err_flg());
				}
			}
			
			setErrToRtnStsTyp();
			
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(chkWgRqst());
			msgL.addAll(chkWgRqstPrms());
						
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			callPurcUtilSrch01();

			MCList<MAM_ITM_DTL_R> itmDtlL = MCList.create(MAM_ITM_DTL_R.class);
			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			MCIndexKey idxKey = up0().createIndex(Chk01_Rslt2R.$wg_rqst_no);

			MCList<MST_WG_RQST_PRMS_R> wrpL = MCList.create(MST_WG_RQST_PRMS_R.class);
			dbSelectKey("MSBAL0020_MST_WG_RQST_PRMS_S01", wrpL,
					MCQueryApiBuilder.create(MST_WG_RQST_PRMS_R.create("T")), notErrL);

			for(Chk01_Rslt2R r : notErrL) {
				// 購買依頼の場合、品目詳細マスタの存在チェックを行う
				Chk01_Rslt1R rslt1R = up0().getFirst(idxKey, r.wg_rqst_no());

				if(isNull(rslt1R)) {
					continue;
				}
				
				// 値引品の場合
				if (r.dscnt_itm_flg()) {
					r.prms_trd_unit_qty(MCNumber.ONE);
					r.prms_trd_unit_cd(r.prms_base_unit_cd());
					r.prms_trd_unit_rnd_typ(r.prms_base_unit_rnd_typ());
					r.prms_trd_unit_dec_place(r.prms_base_unit_dec_place());
				}
				
				if(!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					setBaseUnitQty(r);
				}

				if(MSC_WG_RQST_TYP.isPURC(rslt1R.wg_rqst_typ())) {
					MAM_ITM_DTL_R itmDtlR = MAM_ITM_DTL_R.create();
					itmDtlR.setAttributes(r);
					itmDtlR.itm_cd(r.itm_cd());
					itmDtlR.itm_sub1(r.itm_sub1());
					itmDtlR.itm_sub2(r.itm_sub2());
					itmDtlR.itm_sub3(r.itm_sub3());
					itmDtlR.mfg_loc_cd(r.mfg_loc_cd());
					if(isNullOrNullVal(r.mfg_loc_cd())) {
						itmDtlR.sppl_cd(r.sppl_cd());
						itmDtlR.maker_cd(r.maker_cd());
					}
					else {
						itmDtlR.sppl_cd(MAC_STR.NULL_VAL.value());
						itmDtlR.maker_cd(MAC_STR.NULL_VAL.value());
					}
					itmDtlR.rqst_loc_cd(r.gi_loc_cd());
					itmDtlR.wg_cd(r.gr_wg_cd());
					itmDtlR.bom_ptn(r.bom_ptn());
					if (isSame(_sysParm, "1")) {
						itmDtlR.st_dt(r.getDate("avl_schd_dt"));
					}
					else {
						itmDtlR.st_dt(r.po_schd_dt());
					}
					itmDtlL.add(itmDtlR);

					// 外注→購買、購買→外注の変更はエラーとする
					MST_WG_RQST_PRMS_R wrpR = wrpL.getFirst(MST_WG_RQST_PRMS_R.$wg_rqst_prms_no, r.wg_rqst_prms_no());
					if (!isNull(wrpR)) {
						if (!isNullOrNullVal(wrpR.mfg_loc_cd()) && isNullOrNullVal(r.mfg_loc_cd())) {
							msgL.add(new MCMessage(r, null, MSBAL0033, toDispGUIIndex(r)));
						}
						if (isNullOrNullVal(wrpR.mfg_loc_cd()) && !isNullOrNullVal(r.mfg_loc_cd())) {
							msgL.add(new MCMessage(r, null, MSBAL0033, toDispGUIIndex(r)));
						}
					}
				}
			}
			
			msgL.addAll(MSUCL_ProdUtil.chkItmDtlKey(itmDtlL, true));
			msgL.addAll(chkRqstWgCd(itmDtlL));
			
			msgL.addAll(chkDecPlace());
			
			return msgL;
		}
		
		/**
		 * 基準単位数量を設定する
		 * @param rsltR
		 */
		protected void setBaseUnitQty(Chk01_Rslt2R rslt2R) {
			if (isSame(rslt2R.prms_trd_unit_cd(), rslt2R.prms_base_unit_cd())) {
				rslt2R.prms_base_unit_qty(rslt2R.prms_trd_unit_qty());
			}
			else {
				rslt2R.prms_base_unit_qty(convToBaseUnit(rslt2R.prms_trd_unit_qty(),
						rslt2R.prms_trd_unit_conv_base_qty(), rslt2R.prms_trd_unit_conv_qty(),
						rslt2R.prms_base_unit_dec_place(), rslt2R.prms_base_unit_rnd_typ()));
			}
		}

		/**
		 * ＷＧ間依頼のロック、更新カウンタチェック
		 */
		protected MCMessageList chkWgRqst() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_Rslt1R> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_WG_RQST_R> selectL = MCList.create(MST_WG_RQST_R.class);
			MST_WG_RQST_R t = MST_WG_RQST_R.create("T");
			MAM_LOC_R m1 = MAM_LOC_R.create("m1");
			MAM_BP_R m2 = MAM_BP_R.create("m2");
			MAM_BP_R m3 = MAM_BP_R.create("m3");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.wg_rqst_no, t.upd_cntr);
			selectL_bldr.addSelect(
				t.gr_loc_cd,
				m1.sppl_cd.as("gr_loc_sppl_cd"),
				m1.cal_cd.as("gr_loc_cal_cd"),
				t.gr_lg_grp_cd,
				m1.site_cd.as("gr_site_cd"),
				t.dlv_cd,
				m2.lg_grp_cd.as("dlv_lg_grp_cd"),
				m2.dlv_cal_cd,
				t.tdlv_cd,
				m3.lg_grp_cd.as("tdlv_lg_grp_cd"),
				t.itm_ord_no
			);
			selectL_bldr.addLeftOuterJoin(m1, m1.loc_cd.eq(t.gr_loc_cd));
			selectL_bldr.addLeftOuterJoin(m2, m2.bp_cd.eq(t.dlv_cd));
			selectL_bldr.addLeftOuterJoin(m3, m3.bp_cd.eq(t.tdlv_cd));
			selectL_bldr.setLockTable(t.wg_rqst_no);
			selectL_bldr.setOrderByAsc(t.wg_rqst_no);
			MCList<Chk01_Rslt1R> bindL = notErrL;
			bindL.sort(Chk01_Rslt1R.$wg_rqst_no);
			dbSelectKeyForUpdateNoWait("MSBAL0020_MST_WG_RQST_S01", selectL, selectL_bldr, bindL);
			
			MCIndexKey idxkey = selectL.createIndex(MST_WG_RQST_R.$wg_rqst_no);
			for (Chk01_Rslt1R r : notErrL) {
				MST_WG_RQST_R selectR = selectL.getFirst(idxkey, r.wg_rqst_no());
				if(!isNull(selectR)) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_Rslt1R.$wg_rqst_upd_cntr, selectR));
					
					// 補完
					r.gr_loc_cd(selectR.gr_loc_cd());
					r.gr_loc_sppl_cd(selectR.getString("gr_loc_sppl_cd"));
					r.gr_loc_cal_cd(selectR.getString("gr_loc_cal_cd"));
					r.gr_lg_grp_cd(selectR.gr_lg_grp_cd());
					r.gr_site_cd(selectR.getString("gr_site_cd"));
					r.dlv_cd(selectR.dlv_cd());
					r.dlv_lg_grp_cd(selectR.getString("dlv_lg_grp_cd"));
					r.dlv_cal_cd(selectR.getString("dlv_cal_cd"));
					r.tdlv_cd(selectR.tdlv_cd());
					r.tdlv_lg_grp_cd(selectR.getString("tdlv_lg_grp_cd"));
					r.setStringNE(MST_WG_RQST_R.$itm_ord_no, selectR.itm_ord_no());
				}
			}
			return msgL;
		}

		/**
		 * ＷＧ間依頼回答のロック、更新カウンタチェック
		 */
		protected MCMessageList chkWgRqstPrms() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_WG_RQST_PRMS_R> selectL = MCList.create(MST_WG_RQST_PRMS_R.class);
			MST_WG_RQST_PRMS_R t = MST_WG_RQST_PRMS_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.wg_rqst_prms_no, t.wg_cd, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.wg_rqst_prms_no);
			MCList<Chk01_Rslt2R> bindL = notErrL;
			bindL.sort(Chk01_Rslt2R.$wg_rqst_prms_no);
			dbSelectKeyForUpdateNoWait("MSBAL0020_MST_WG_RQST_PRMS_S02", selectL, selectL_bldr, bindL);
			
			MCIndexKey idxkey = selectL.createIndex(MST_WG_RQST_PRMS_R.$wg_rqst_prms_no);
			for (Chk01_Rslt2R r : notErrL) {
				MST_WG_RQST_PRMS_R selectR = selectL.getFirst(idxkey, r.wg_rqst_prms_no());
				if(!isNull(r.wg_rqst_prms_no())) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_Rslt2R.$wg_rqst_prms_upd_cntr, selectR));
				}
				msgL.addAll(checkWritableWgCdDac(r, Chk01_Rslt2R.$wg_cd));
			}
			return msgL;
		}

		protected MCMessageList chkRqstWgCd(MCList<MAM_ITM_DTL_R> itmDtlL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			if(isNull(notErrL)) {
				return msgL;
			}

			MCIndexKey up0Key = up0().createIndex(Chk01_Rslt1R.$wg_rqst_no);
			MCIndexKey itmDtlKey = itmDtlL.createIndex(MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1, MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3, MAM_ITM_DTL_R.$mfg_loc_cd,
					MAM_ITM_DTL_R.$sppl_cd, MAM_ITM_DTL_R.$maker_cd,
					MAM_ITM_DTL_R.$rqst_loc_cd, MAM_ITM_DTL_R.$wg_cd,
					MAM_ITM_DTL_R.$bom_ptn, MAM_ITM_DTL_R.$st_dt);

			for (Chk01_Rslt2R r : notErrL) {
				Chk01_Rslt1R up0 = up0().getFirst(up0Key, r.wg_rqst_no());
				if(MSC_WG_RQST_TYP.isXFR(up0.wg_rqst_typ()) && !isNull(r.gi_wg_cd()) && !isSame(r.wg_cd(), r.gi_wg_cd())) {
					msgL.add(new MCMessage(r, null, MSBAL0031, r.wg_cd(), r.gi_wg_cd(), toDispGUIIndex(r)));
				}
				else if(MSC_WG_RQST_TYP.isPURC(up0.wg_rqst_typ())) {

					MAM_ITM_DTL_R chkItmDtlR = itmDtlL.getFirst(itmDtlKey,
							r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
							r.mfg_loc_cd(),
							isNullOrNullVal(r.mfg_loc_cd()) ? r.sppl_cd() : MAC_STR.NULL_VAL.value(),
							isNullOrNullVal(r.mfg_loc_cd()) ? r.maker_cd() : MAC_STR.NULL_VAL.value(),
							r.gi_loc_cd(),
							r.gr_wg_cd(),
							r.bom_ptn(),
							isSame(_sysParm, "1") ? r.gr_schd_tm() : r.po_schd_dt());

					// 資産管理する品目はユーティリティでチェックしているため、依頼先ＷＧが補完されていない場合はチェック対象外
					if(!isNull(chkItmDtlR) && !isNull(chkItmDtlR.rqst_wg_cd()) && !isSame(r.wg_cd(), chkItmDtlR.rqst_wg_cd())) {
						msgL.add(new MCMessage(r, null, MSBAL0031, r.wg_cd(), chkItmDtlR.rqst_wg_cd(), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 数量の小数有効桁数チェック
		 */
		protected MCMessageList chkDecPlace() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			
			// 小数有効桁数チェック
			for (Chk01_Rslt2R upR : notErrL){
				if (!isNull(upR.prms_trd_unit_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_Rslt2R.$prms_trd_unit_dec_place, Chk01_Rslt2R.$prms_trd_unit_qty));
				}
				if (!isNull(upR.prms_base_unit_qty())) {
					msgL.addAll(checkDecPlace(upR, Chk01_Rslt2R.$prms_base_unit_dec_place, Chk01_Rslt2R.$prms_base_unit_qty));
				}
			}
			return msgL;
		}

		/**
		 * ＷＧ間依頼サービスのチェック処理を実行する
		 */
		protected void callWgRqstSrvChk02() {
			MSBAL_WgRqstService.WgRqst_Chk02 ope = MSBAL_WgRqstService.crtWgRqst_Chk02();
			MCIndexKey idxKey = up0().createIndex(Chk01_Rslt1R.$wg_rqst_no);
			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			for(Chk01_Rslt2R r : notErrL) {
				WgRqst_Chk02_DtlR wgRqstChk02DtlR = WgRqst_Chk02_DtlR.create();
				copy(wgRqstChk02DtlR, r, createMap_WgRqst_Chk02_DtlR_Chk01_Rslt2R());
				Chk01_Rslt1R rslt1R = up0().getFirst(idxKey, r.wg_rqst_no());
				if(!isNull(rslt1R)) {
					wgRqstChk02DtlR.wg_rqst_typ(rslt1R.wg_rqst_typ());
					wgRqstChk02DtlR.slo_no(rslt1R.slo_no());
					wgRqstChk02DtlR.slo_d_no(rslt1R.slo_d_no());
				}
				ope.up0().add(wgRqstChk02DtlR);
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();
			}
			copyErrFlg(up1(), ope.down0());
		}
				
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			// 下段でチェックした結果、下段にエラーがあれば、上段に反映する
			MCIndexKey up0Key = up0().createIndex(Chk01_Rslt1R.$wg_rqst_no);
			for(Chk01_Rslt2R r : up1()) {
				if(r.err_flg()) {
					Chk01_Rslt1R rslt1R = up0().getFirst(up0Key, r.wg_rqst_no());
					if(!isNull(rslt1R)) {
						rslt1R.err_flg(true);
					}
				}
			}
			
			down0().setAll(up0());
			down1().setAll(up1());
		}

		protected Map_WgRqst_Chk02_DtlR_Chk01_Rslt2R<WgRqst_Chk02_DtlR,Chk01_Rslt2R> createMap_WgRqst_Chk02_DtlR_Chk01_Rslt2R() {
			return new Map_WgRqst_Chk02_DtlR_Chk01_Rslt2R<WgRqst_Chk02_DtlR, Chk01_Rslt2R>();
		}

		public class Map_WgRqst_Chk02_DtlR_Chk01_Rslt2R<D extends WgRqst_Chk02_DtlR, S extends Chk01_Rslt2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Chk02_DtlR.$data_crud_typ, Chk01_Rslt2R.$data_crud_typ);
				addColumnPathMap(WgRqst_Chk02_DtlR.$peg_no, Chk01_Rslt2R.$peg_no);
				addColumnPathMap(WgRqst_Chk02_DtlR.$err_flg, Chk01_Rslt2R.$err_flg);
				addColumnPathMap(WgRqst_Chk02_DtlR.$wg_rqst_prms_no, Chk01_Rslt2R.$wg_rqst_prms_no);
				addColumnPathMap(WgRqst_Chk02_DtlR.$wg_rqst_no, Chk01_Rslt2R.$wg_rqst_no);
				addColumnPathMap(WgRqst_Chk02_DtlR.$wg_cd, Chk01_Rslt2R.$wg_cd);
				addColumnPathMap(WgRqst_Chk02_DtlR.$fix_flg, Chk01_Rslt2R.$fix_flg);
				addColumnPathMap(WgRqst_Chk02_DtlR.$fix_dt, Chk01_Rslt2R.$fix_dt);
				addColumnPathMap(WgRqst_Chk02_DtlR.$prms_trd_unit_cd, Chk01_Rslt2R.$prms_trd_unit_cd);
				addColumnPathMap(WgRqst_Chk02_DtlR.$prms_trd_unit_qty, Chk01_Rslt2R.$prms_trd_unit_qty);
				addColumnPathMap(WgRqst_Chk02_DtlR.$prms_base_unit_cd, Chk01_Rslt2R.$prms_base_unit_cd);
				addColumnPathMap(WgRqst_Chk02_DtlR.$prms_base_unit_qty, Chk01_Rslt2R.$prms_base_unit_qty);
				addColumnPathMap(WgRqst_Chk02_DtlR.$gr_schd_tm, Chk01_Rslt2R.$gr_schd_tm);
				addColumnPathMap(WgRqst_Chk02_DtlR.$gi_loc_cd, Chk01_Rslt2R.$gi_loc_cd);
				addColumnPathMap(WgRqst_Chk02_DtlR.$gi_str_ln_cd, Chk01_Rslt2R.$gi_str_ln_cd);
				addColumnPathMap(WgRqst_Chk02_DtlR.$gi_rqst_tm, Chk01_Rslt2R.$gi_schd_tm);
				addColumnPathMap(WgRqst_Chk02_DtlR.$sppl_cd, Chk01_Rslt2R.$sppl_cd);
				addColumnPathMap(WgRqst_Chk02_DtlR.$maker_cd, Chk01_Rslt2R.$maker_cd);
				addColumnPathMap(WgRqst_Chk02_DtlR.$mfg_loc_cd, Chk01_Rslt2R.$mfg_loc_cd);
				addColumnPathMap(WgRqst_Chk02_DtlR.$bom_ptn, Chk01_Rslt2R.$bom_ptn);
				addColumnPathMap(WgRqst_Chk02_DtlR.$can_flg, Chk01_Rslt2R.$can_flg);
				addColumnPathMap(WgRqst_Chk02_DtlR.$last_fix_flg, Chk01_Rslt2R.$last_fix_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if(src.fix_flg() && src.last_fix_flg()) {
					dest.schd_cng_flg(true);
				}
				else {
					dest.schd_cng_flg(false);
				}
			}
		}

		protected MCIndexKey _up0Key;
		protected void callPurcUtilSrch01() {
			_up0Key = up0().createIndex(Srch01_Rslt1R.$wg_rqst_no);

			// 購買依頼に対してのみ発注予定日を設定
			MCList<Chk01_Rslt2R> notErrL = getChkList(up1());
			MCList<Chk01_Rslt2R> purcL = notErrL.createInstance();
			for (Chk01_Rslt2R r : notErrL) {
				Chk01_Rslt1R up0R = up0().getFirst(_up0Key, r.wg_rqst_no());
				if (MAC_WG_RQST_TYP.isPURC(up0R.wg_rqst_typ())) {
					purcL.add(r);
				}
			}
			if (purcL.isEmpty()) {
				return ;
			}

			cmplPoSchdDtByOrd(purcL);
			purcL = purcL.subList(r->isNull(r.po_schd_dt()));

			MSBDL_PurcUtil.PurcUtil_Srch01 purcUtilSrch01 = MSBDL_PurcUtil.crtPurcUtil_Srch01();
			addAll(purcUtilSrch01.up0(), purcL, createMap_PurcUtil_Srch01_DtlR_Chk01_Rslt2R());
			purcUtilSrch01.exec();

			MCIndexKey idx = purcUtilSrch01.down0().createIndex("peg_no");
			for (Chk01_Rslt2R r : purcL) {
				PurcUtil_Srch01_DtlR rsltR = purcUtilSrch01.down0().getFirst(idx,
						r.peg_no());
				if (rsltR.err_flg()) {
					MCMessagePool.add(new MCMessage(r, null, MSBAL0102,
							toDispItm(r.itm_cd(),r.itm_sub1(),r.itm_sub2(),r.itm_sub3()),
							r.gr_wg_cd(),
							r.sppl_cd(),
							r.maker_cd(),
							r.mfg_loc_cd(),
							r.bom_ptn(),
							toYMDHMSString(r.gr_schd_tm()),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
				else {
					r.po_schd_dt(rsltR.po_schd_dt());
					r.setDateNE("avl_schd_dt", rsltR.rqst_dlv_rqst_dt());
				}
			}
		}
		protected void cmplPoSchdDtByOrd(MCList<Chk01_Rslt2R> purcL) {
			up0().addStringColumn(MST_WG_RQST_R.$itm_ord_no);
			MCList<Chk01_Rslt1R> bindL = up0().groupBy(MST_WG_RQST_R.$itm_ord_no);
			if(bindL.isEmpty()) {
				return;
			}
			MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(t);
			dbSelectKey("MSBAL0020_MST_ITM_ORDER_S01", itmOrdL, itmOrdL_bldr, bindL);
			
			MCIndexKey itmOrdKey = itmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (Chk01_Rslt2R purcR : purcL) {
				Chk01_Rslt1R up0R = up0().getFirst(_up0Key, purcR.wg_rqst_no());
				MST_ITM_ORDER_R itmOrdR = itmOrdL.getFirst(itmOrdKey, up0R.getStringNE(MST_WG_RQST_R.$itm_ord_no));
				if(isCmplPoSchdDtByOrd(purcR, itmOrdR)) {
					purcR.po_schd_dt(itmOrdR.po_schd_dt());
					purcR.setDateNE("avl_schd_dt", itmOrdR.avl_schd_dt());
				}
			}
		}
		protected boolean isCmplPoSchdDtByOrd(Chk01_Rslt2R purcR, MST_ITM_ORDER_R itmOrdR) {
			if(!isNull(itmOrdR)
					&& isSame(itmOrdR.strg_schd_dt(), purcR.gr_schd_tm())) {
				if(!isNullOrNullVal(purcR.mfg_loc_cd()) //外注
						&& isSame(itmOrdR.mfg_loc_cd(), nvl(purcR.mfg_loc_cd(), MAC_STR.NULL_VAL.value()))
						&& isSame(itmOrdR.bom_ptn(), nvl(purcR.bom_ptn(), MAC_STR.NULL_VAL.value()))) {
					return true;
				}
				else if(isNullOrNullVal(purcR.mfg_loc_cd()) // 購買
						&& isSame(itmOrdR.sppl_cd(), nvl(purcR.sppl_cd(), MAC_STR.NULL_VAL.value()))
						&& isSame(itmOrdR.maker_cd(), nvl(purcR.maker_cd(), MAC_STR.NULL_VAL.value()))) {
					return true;
				}
			}
			return false;
		}
		protected Map_PurcUtil_Srch01_DtlR_Chk01_Rslt2R<PurcUtil_Srch01_DtlR,Chk01_Rslt2R> createMap_PurcUtil_Srch01_DtlR_Chk01_Rslt2R() {
			return new Map_PurcUtil_Srch01_DtlR_Chk01_Rslt2R<PurcUtil_Srch01_DtlR, Chk01_Rslt2R>();
		}
		public class Map_PurcUtil_Srch01_DtlR_Chk01_Rslt2R<D extends PurcUtil_Srch01_DtlR, S extends Chk01_Rslt2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcUtil_Srch01_DtlR.$peg_no, PurcUtil_Srch01_DtlR.$peg_no);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cd, Chk01_Rslt2R.$sppl_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_cd, Chk01_Rslt2R.$itm_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub1, Chk01_Rslt2R.$itm_sub1);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub2, Chk01_Rslt2R.$itm_sub2);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$itm_sub3, Chk01_Rslt2R.$itm_sub3);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$mfg_loc_cd, Chk01_Rslt2R.$mfg_loc_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$maker_cd, Chk01_Rslt2R.$maker_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$bom_ptn, Chk01_Rslt2R.$bom_ptn);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$sppl_cal_cd, Chk01_Rslt2R.$sppl_cal_cd);
				addColumnPathMap(PurcUtil_Srch01_DtlR.$wg_cd, Chk01_Rslt2R.$gr_wg_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				Chk01_Rslt1R r = up0().getFirst(_up0Key, src.wg_rqst_no());
				if (!isNull(r)) {
					dest.prov_ddlv_flg(isNull(r.gr_loc_sppl_cd()) ? false : true);
					dest.site_cd(r.gr_site_cd());
					dest.in_to_loc_cd(r.gr_loc_cd());
					dest.in_to_loc_cal_cd(r.gr_loc_cal_cd());
					dest.dlv_cd(r.dlv_cd());
					dest.dlv_cal_cd(r.dlv_cal_cd());
					if (!isNull(r.tdlv_cd())) {
						dest.lg_grp_cd(r.tdlv_lg_grp_cd());
					}
					else if (!isNull(r.dlv_cd())) {
						dest.lg_grp_cd(r.dlv_lg_grp_cd());
					}
					else {
						dest.lg_grp_cd(r.gr_lg_grp_cd());
					}
					dest.dlv_rqst_dt(src.gr_schd_tm());
					setBaseUnitQty(src);
					dest.base_unit_qty(src.prms_base_unit_qty());
				}
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＷＧ間依頼回答を登録・訂正・削除する<br>
	 */
	public class Upd01 extends MSBAL_WgRqstAdjst_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			MCList<Chk01_Rslt1R> notErrL = up0().subList(Chk01_Rslt1R.$err_flg, false);
			if (notErrL.size() != 0) {
				callWgRqstSrvUpd02(notErrL);
			}
		}
		
		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(Chk01_Rslt1R.$peg_no, up0());
			setPegNo(Chk01_Rslt2R.$peg_no, up1());

			// 上り電文の属性を変更する前に、下り電文にpeg_noと属性をコピーする
			copyPegNoAndAttr(down1(), up1());

			MCIndexKey idxKey = up0().createIndex(Chk01_Rslt1R.$wg_rqst_no);
			for (Chk01_Rslt2R r : up1()) {
				if(isNull(r.wg_rqst_prms_no())) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if(r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					r.fix_flg(false);
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());		
				}
				Chk01_Rslt1R rslt1R = up0().getFirst(idxKey, r.wg_rqst_no());
				if(!isNull(rslt1R)) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					r.setGUIIndex(rslt1R.getGUIIndex());
				}
			}
		}
				
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBAL_WgRqstAdjst.Chk01 ope = MSBAL_WgRqstAdjst.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			
			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
		}
		
		/**
		 * ＷＧ間依頼サービスの更新処理を実行する
		 * @param notErrL
		 */
		protected void callWgRqstSrvUpd02(MCList<Chk01_Rslt1R> notErrL) {
			MSBAL_WgRqstService.WgRqst_Upd02 ope = MSBAL_WgRqstService.crtWgRqst_Upd02();
			MCIndexKey idxKey = up1().createIndex(Chk01_Rslt2R.$wg_rqst_no);
						
			for(Chk01_Rslt1R rslt1R : notErrL) {
				WgRqst_Upd02_Dtl1R wgRqstUpd02Dtl1R = WgRqst_Upd02_Dtl1R.create();
				copy(wgRqstUpd02Dtl1R, rslt1R, createMap_WgRqst_Upd02_Dtl1R_Chk01_Rslt1R());
				ope.up0().add(wgRqstUpd02Dtl1R);
				
				for(Chk01_Rslt2R r : up1().subList(idxKey, rslt1R.wg_rqst_no())) {
					WgRqst_Upd02_Dtl2R wgRqstUpd02Dtl2R = WgRqst_Upd02_Dtl2R.create();
					copy(wgRqstUpd02Dtl2R, r, createMap_WgRqst_Upd02_Dtl2R_Chk01_Rslt2R());
					if(!isNull(rslt1R)) {
						wgRqstUpd02Dtl2R.slo_no(rslt1R.slo_no());
						wgRqstUpd02Dtl2R.slo_d_no(rslt1R.slo_d_no());
					}
					ope.up1().add(wgRqstUpd02Dtl2R);
				}
			}
			
			if(!ope.up0().isEmpty()) {
				ope.exec();

				String[] destCols = new String[] {Chk01_Rslt2R.$wg_rqst_prms_no};
				String[] srcCols = new String[] {WgRqst_Upd02_Dtl2R.$wg_rqst_prms_no};
				copyByPegNo(up1(), destCols, ope.down1(), srcCols);
			}
		}
		
		protected void handleSuccess(MCList<Chk01_Rslt1R> l) {
			dbTran().commit();
			
			MCIndexKey idxKey = up1().createIndex(Chk01_Rslt2R.$wg_rqst_no);
			for (Chk01_Rslt1R r : l) {
				boolean errExists = false;
				MCList<Chk01_Rslt2R> rslt2L = up1().subList(idxKey, r.wg_rqst_no());
				if(!isNull(rslt2L)) {
					for(Chk01_Rslt2R rslt2R : rslt2L) {
						if(rslt2R.err_flg()) {
							errExists = true;
						}
					}
				}
				if(!errExists) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e,
				MCList<Chk01_Rslt1R> l) {
			dbTran().rollback();
			
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_Rslt1R r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			// up1の属性を変更しているため、setAllで属性ごとRowを追加せず、copyByPegNoで下り電文に必要な情報を設定する
			String[] downCols = new String[] {Chk01_Rslt2R.$wg_rqst_no, Chk01_Rslt2R.$wg_rqst_prms_no};
			copyByPegNo(down1(), downCols, up1(), downCols);
			
			// ※クライアントのshowMergeでエラー行はマージしない動作とするために、処理結果状況区分が必要
			MCIndexKey idxkey = down1().createIndex(Chk01_Rslt2R.$wg_rqst_no);
			for (Chk01_Rslt1R downR : down0()) {
				MCList<Chk01_Rslt2R> subL = down1().subList(idxkey, downR.wg_rqst_no());
				for (Chk01_Rslt2R subR : subL) {
					subR.rtn_sts_typ(downR.rtn_sts_typ());
				}
			}
		}
		
		
		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			@SuppressWarnings("unchecked")
			MCList<T> ret = (MCList<T>) up0();
			return ret;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_Rslt1R>> list = splitUp0(up0(), getSplitRowCount());
			for (MCList<Chk01_Rslt1R> l : list) {
				MCOperation ope = createInstance(lgc, p);
				@SuppressWarnings("unchecked")
				MCList<Chk01_Rslt1R> up0L = ((MCList<Chk01_Rslt1R>)ope.up(0));
				@SuppressWarnings("unchecked")
				MCList<Chk01_Rslt2R> up1L = ((MCList<Chk01_Rslt2R>)ope.up(1));
				up0L.setAll(l);
				
				// ヘッダに対応する明細を設定
				MCIndexKey dtlIdx = up1().createIndex(Chk01_Rslt2R.$wg_rqst_no);
				for (Chk01_Rslt1R rslt1R : l) {
					up1L.addAll(up1().subList(dtlIdx, rslt1R.wg_rqst_no()));
				}
				opeL.add(ope);
			}
			return opeL;
		}
				
		/**
		 * ＷＧ間依頼ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_Rslt1R>> splitUp0(MCList<Chk01_Rslt1R> list,
				int max) {
			List<MCList<Chk01_Rslt1R>> ret = new ArrayList<>();
			MCList<Chk01_Rslt1R> tmp = MCList.create(Chk01_Rslt1R.class);
			for (Chk01_Rslt1R r : list) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_Rslt1R.class);
				}
				tmp.add(r);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		
		protected Map_WgRqst_Upd02_Dtl1R_Chk01_Rslt1R<WgRqst_Upd02_Dtl1R,Chk01_Rslt1R> createMap_WgRqst_Upd02_Dtl1R_Chk01_Rslt1R() {
			return new Map_WgRqst_Upd02_Dtl1R_Chk01_Rslt1R<WgRqst_Upd02_Dtl1R, Chk01_Rslt1R>();
		}

		public class Map_WgRqst_Upd02_Dtl1R_Chk01_Rslt1R<D extends WgRqst_Upd02_Dtl1R, S extends Chk01_Rslt1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Upd02_Dtl1R.$peg_no, Chk01_Rslt1R.$peg_no);
				addColumnPathMap(WgRqst_Upd02_Dtl1R.$wg_rqst_no, Chk01_Rslt1R.$wg_rqst_no);
				addColumnPathMap(WgRqst_Upd02_Dtl1R.$prms_ntc_flg, Chk01_Rslt1R.$prms_ntc_flg);
				addColumnPathMap(WgRqst_Upd02_Dtl1R.$prms_dt, Chk01_Rslt1R.$prms_dt);
				addColumnPathMap(WgRqst_Upd02_Dtl1R.$re_prms_ntc_flg, Chk01_Rslt1R.$re_prms_ntc_flg);
				addColumnPathMap(WgRqst_Upd02_Dtl1R.$re_prms_dt, Chk01_Rslt1R.$re_prms_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				// ＷＧ間依頼調整画面からの回答は手動回答
				dest.man_prms_flg(true);
			}
		}
		
		protected Map_WgRqst_Upd02_Dtl2R_Chk01_Rslt2R<WgRqst_Upd02_Dtl2R,Chk01_Rslt2R> createMap_WgRqst_Upd02_Dtl2R_Chk01_Rslt2R() {
			return new Map_WgRqst_Upd02_Dtl2R_Chk01_Rslt2R<WgRqst_Upd02_Dtl2R, Chk01_Rslt2R>();
		}

		public class Map_WgRqst_Upd02_Dtl2R_Chk01_Rslt2R<D extends WgRqst_Upd02_Dtl2R, S extends Chk01_Rslt2R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$data_crud_typ, Chk01_Rslt2R.$data_crud_typ);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$peg_no, Chk01_Rslt2R.$peg_no);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$wg_rqst_prms_no, Chk01_Rslt2R.$wg_rqst_prms_no);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$wg_rqst_no, Chk01_Rslt2R.$wg_rqst_no);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$wg_cd, Chk01_Rslt2R.$wg_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$fix_flg, Chk01_Rslt2R.$fix_flg);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$fix_dt, Chk01_Rslt2R.$fix_dt);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_trd_unit_qty, Chk01_Rslt2R.$prms_trd_unit_qty);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_trd_unit_cd, Chk01_Rslt2R.$prms_trd_unit_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_base_unit_qty, Chk01_Rslt2R.$prms_base_unit_qty);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_base_unit_cd, Chk01_Rslt2R.$prms_base_unit_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gr_schd_tm, Chk01_Rslt2R.$gr_schd_tm);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_lg_grp_cd, Chk01_Rslt2R.$gi_lg_grp_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_loc_cd, Chk01_Rslt2R.$gi_loc_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_str_ln_cd, Chk01_Rslt2R.$gi_str_ln_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$gi_rqst_tm, Chk01_Rslt2R.$gi_schd_tm);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$sppl_cd, Chk01_Rslt2R.$sppl_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$maker_cd, Chk01_Rslt2R.$maker_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$mfg_loc_cd, Chk01_Rslt2R.$mfg_loc_cd);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$bom_ptn, Chk01_Rslt2R.$bom_ptn);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$can_flg, Chk01_Rslt2R.$can_flg);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_rmrks, Chk01_Rslt2R.$prms_rmrks);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$intr_rmrks, Chk01_Rslt2R.$intr_rmrks);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$sub_char1, Chk01_Rslt2R.$sub_char1);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$sub_char2, Chk01_Rslt2R.$sub_char2);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$sub_char3, Chk01_Rslt2R.$sub_char3);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_ntc_flg, Chk01_Rslt2R.$prms_ntc_flg);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$prms_dt, Chk01_Rslt2R.$prms_dt);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$re_prms_ntc_flg, Chk01_Rslt2R.$re_prms_ntc_flg);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$re_prms_dt, Chk01_Rslt2R.$re_prms_dt);
				addColumnPathMap(WgRqst_Upd02_Dtl2R.$last_fix_flg, Chk01_Rslt2R.$last_fix_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				if(src.fix_flg() && src.last_fix_flg()) {
					dest.schd_cng_flg(true);
				}
				else {
					dest.schd_cng_flg(false);
				}
				dest.screen_crct_flg(true);
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＷＧ間依頼、ＷＧ間依頼回答、納入指示受領を検索する<br>
	 */
	public class Srch01 extends MSBAL_WgRqstAdjst_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());
			
			MCQueryPlan wgRqstSql = MSBAL0020_MST_WG_RQST_S01();
			searchForDL(wgRqstSql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			getDown1();
			editDown0();
		}
		
		protected void getDown1() {
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(MST_WG_RQST_R.create("T"));
			MCList<Srch01_Rslt2R> tmpL = MCList.create(Srch01_Rslt2R.class);
			dbWkDelete("MSBAL0020_MSW_WG_RQST_D01", wgRqstL_bldr.getBaseDbc());
			
			for(Srch01_Rslt1R r : down0()) {
				MST_WG_RQST_R wgRqstR = MST_WG_RQST_R.create();
				wgRqstR.wg_rqst_no(r.wg_rqst_no());
				wgRqstL.add(wgRqstR);
			}
			if(!wgRqstL.isEmpty()) {
				dbWkInsert("MSBAL0020_MSW_WG_RQST_I01", wgRqstL, wgRqstL_bldr.getBaseDbc());
				executeQuery(tmpL, MSBAL0020_MST_WG_RQST_PRMS_S01());
			}
			down1().addAll(tmpL);
		}
		
		protected void editDown0() {
			if(up0().prms_shrtg_flg() || up0().prms_over_flg()) {
				MCList<Srch01_Rslt1R> tmpDown0L = MCList.create(Srch01_Rslt1R.class);
				tmpDown0L.addAll(down0());
				down0().clear();

				for(Srch01_Rslt1R r : tmpDown0L) {
					MCIndexKey down1Key = down1().createIndex(Srch01_Rslt2R.$wg_rqst_no);
					MCList<Srch01_Rslt2R> down1L = down1().subList(down1Key, r.wg_rqst_no());
					if(isNull(down1L)) {
						if(up0().prms_shrtg_flg()) {
							down0().add(r);
						}
						continue;
					}
					MCNumber sumPrmsQty = down1L.sum(Srch01_Rslt2R.$prms_base_unit_qty);
					if(up0().prms_shrtg_flg()) {
						if(r.base_unit_qty().gt(sumPrmsQty)) {
							down0().add(r);
							continue;
						}
					}
					if(up0().prms_over_flg()) {
						if(r.base_unit_qty().lt(sumPrmsQty)) {
							down0().add(r);
							continue;
						}
					}
					down1().removeAll(down1L);
				}
			}

			MCIndexKey down1Key = down1().createIndex(Srch01_Rslt2R.$wg_rqst_no);
			for(Srch01_Rslt1R r : down0()) {
				MCList<Srch01_Rslt2R> down1L = down1().subList(down1Key, r.wg_rqst_no());
				// 回答が複数件ある場合
				if(down1L.size() > 1) {
					r.prms_div_flg(true);
				}
				// 回答が一件の場合、依頼・回答欄の回答内容にコピー
				else if(down1L.size() == 1) {
					Srch01_Rslt2R down1R = down1L.get(0);
					r.wg_rqst_prms_no(down1R.wg_rqst_prms_no());
					r.fix_flg(down1R.fix_flg());
					r.fix_dt(down1R.fix_dt());
					r.can_flg(down1R.can_flg());
					r.gr_schd_dt(down1R.gr_schd_dt());
					r.gr_schd_hm(down1R.gr_schd_hm());
					r.gi_schd_dt(down1R.gi_schd_dt());
					r.gi_schd_hm(down1R.gi_schd_hm());
					r.prms_trd_unit_cd(down1R.prms_trd_unit_cd());
					r.prms_trd_unit_nm(down1R.prms_trd_unit_nm());
					r.prms_trd_unit_dec_place(down1R.prms_trd_unit_dec_place());
					r.prms_trd_unit_conv_base_qty(down1R.prms_trd_unit_conv_base_qty());
					r.prms_trd_unit_conv_qty(down1R.prms_trd_unit_conv_qty());
					r.prms_trd_unit_qty(down1R.prms_trd_unit_qty());
					r.prms_base_unit_cd(down1R.prms_base_unit_cd());
					r.prms_base_unit_nm(down1R.prms_base_unit_nm());
					r.prms_base_unit_dec_place(down1R.prms_base_unit_dec_place());
					r.prms_base_unit_rnd_typ(down1R.prms_base_unit_rnd_typ());
					r.prms_base_unit_qty(down1R.prms_base_unit_qty());
					r.gi_loc_cd(down1R.gi_loc_cd());
					r.gi_loc_nm(down1R.gi_loc_nm());
					r.gi_str_ln_tgt_flg(down1R.gi_str_ln_tgt_flg());
					r.gi_str_ln_cd(down1R.gi_str_ln_cd());
					r.gi_str_ln_nm(down1R.gi_str_ln_nm());
					r.gi_wg_cd(down1R.gi_wg_cd());
					r.gi_wg_nm(down1R.gi_wg_nm());
					r.gi_lg_grp_cd(down1R.gi_lg_grp_cd());
					r.gi_lg_grp_nm(down1R.gi_lg_grp_nm());
					r.mfg_loc_cd(down1R.mfg_loc_cd());
					r.mfg_loc_nm(down1R.mfg_loc_nm());
					r.bom_ptn(down1R.bom_ptn());
					r.sppl_cd(down1R.sppl_cd());
					r.sppl_nm(down1R.sppl_nm());
					r.maker_cd(down1R.maker_cd());
					r.maker_nm(down1R.maker_nm());
					r.prms_rmrks(down1R.prms_rmrks());
					r.intr_rmrks(down1R.intr_rmrks());
					r.sub_char1(down1R.sub_char1());
					r.sub_char2(down1R.sub_char2());
					r.sub_char3(down1R.sub_char3());
				}
			}
		}

		@Override
		protected void doSearchSub() {
			super.doSearchSub();
			
			// 納入指示受領の検索
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBAL0020_MSW_SLO_D_D01", sloDL_bldr.getBaseDbc());
			
			for(Srch01_Rslt1R r : down0().groupBy(Srch01_Rslt1R.$slo_d_no)) {
				MST_SLO_D_R sloDR = MST_SLO_D_R.create();
				sloDR.slo_d_no(r.slo_d_no());
				sloDL.add(sloDR);
			}
			if(!sloDL.isEmpty()) {
				dbWkInsert("MSBAL0020_MSW_SLO_D_I01", sloDL, sloDL_bldr.getBaseDbc());
				executeQuery(down2(), MSBAL0020_MST_DLV_INST_RCPT_S01(), up0());
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * ＷＧ間依頼回答を参照するため、ＷＧ間依頼、ＷＧ間依頼回答、納入指示受領を検索する。<br>
	 */
	public class Srch02 extends MSBAL_WgRqstAdjst_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());
			
			MCQueryPlan wgRqstSql = MSBAL0020_MST_WG_RQST_S02();
			searchForDL(wgRqstSql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			getDown1();
			editDown0();
		}
		
		protected void getDown1() {
			MCList<MST_WG_RQST_R> wgRqstL = MCList.create(MST_WG_RQST_R.class);
			MCQueryApiBuilder wgRqstL_bldr = MCQueryApiBuilder.create(MST_WG_RQST_R.create("T"));
			dbWkDelete("MSBAL0020_MSW_WG_RQST_D02", wgRqstL_bldr.getBaseDbc());
			
			for(Srch01_Rslt1R r : down0().groupBy(Srch01_Rslt1R.$wg_rqst_no)) {
				MST_WG_RQST_R wgRqstR = MST_WG_RQST_R.create();
				wgRqstR.wg_rqst_no(r.wg_rqst_no());
				wgRqstL.add(wgRqstR);
			}
			if(!wgRqstL.isEmpty()) {
				dbWkInsert("MSBAL0020_MSW_WG_RQST_I02", wgRqstL, wgRqstL_bldr.getBaseDbc());
				executeQuery(down1(), MSBAL0020_MST_WG_RQST_PRMS_S01());
			}
		}
		
		protected void editDown0() {
			if(up0().prms_shrtg_flg() || up0().prms_over_flg()) {
				MCList<Srch01_Rslt1R> tmpDown0L = MCList.create(Srch01_Rslt1R.class);
				tmpDown0L.addAll(down0());
				down0().clear();

				for(Srch01_Rslt1R r : tmpDown0L) {
					MCIndexKey down1Key = down1().createIndex(Srch01_Rslt2R.$wg_rqst_no);
					MCList<Srch01_Rslt2R> down1L = down1().subList(down1Key, r.wg_rqst_no());
					if(isNull(down1L)) {
						if(up0().prms_shrtg_flg()) {
							down0().add(r);
						}
						continue;
					}
					MCNumber sumPrmsQty = down1L.sum(Srch01_Rslt2R.$prms_base_unit_qty);
					if(up0().prms_shrtg_flg()) {
						if(r.base_unit_qty().gt(sumPrmsQty)) {
							down0().add(r);
							continue;
						}
					}
					if(up0().prms_over_flg()) {
						if(r.base_unit_qty().lt(sumPrmsQty)) {
							down0().add(r);
							continue;
						}
					}
				}
			}

			MCIndexKey down1Key = down1().createIndex(Srch01_Rslt2R.$wg_rqst_no);
			for(Srch01_Rslt1R r : down0()) {
				MCList<Srch01_Rslt2R> down1L = down1().subList(down1Key, r.wg_rqst_no());
				// 回答が複数件ある場合
				if(down1L.size() > 1) {
					r.prms_div_flg(true);
				}
			}
			
			// 回答が複数件あるか、回答数とのチェックのみで使用するため、下り電文をクリア
			down1().clear();
		}
		
		@Override
		protected void doSearchSub() {
			super.doSearchSub();
			
			// 納入指示受領の検索
			MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
			MCQueryApiBuilder sloDL_bldr = MCQueryApiBuilder.create(MST_SLO_D_R.create("T"));
			dbWkDelete("MSBAL0020_MSW_SLO_D_D02", sloDL_bldr.getBaseDbc());
			
			for(Srch01_Rslt1R r : down0().groupBy(Srch01_Rslt1R.$slo_d_no)) {
				MST_SLO_D_R sloDR = MST_SLO_D_R.create();
				sloDR.slo_d_no(r.slo_d_no());
				sloDL.add(sloDR);
			}
			if(!sloDL.isEmpty()) {
				dbWkInsert("MSBAL0020_MSW_SLO_D_I02", sloDL, sloDL_bldr.getBaseDbc());
				executeQuery(down2(), MSBAL0020_MST_DLV_INST_RCPT_S01(), up0());
			}
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 在庫推移、またはシミュ用在庫推移を検索する。<br>
	 */
	public class Srch03 extends MSBAL_WgRqstAdjst_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchDtl();
		}

		protected void srchDtl(){
			// 入力フォーム検索
			MCList<Srch03_RsltR> inptFormL = crtInptForm();
			
			// 在庫推移検索サービスを実行			
			MSBEL_InvTransService.InvTrans_Srch06 invTransSrch06 = getInvTransSrch();
			// 在庫推移検索結果から自分に関連する数量を削除する。
			editInvTransDown1(invTransSrch06);
			
			// 在庫推移結果マージする。
			mergeToInptFmt(inptFormL, invTransSrch06);

			down0().setAll(inptFormL);
		}

		/**
		 * 品目・場所ごとに各明細を準備する。
		 * @param itmL
		 * @return
		 */
		protected MCList<Srch03_RsltR> crtInptForm() {

			MCList<Srch03_RsltR> retL = MCList.create(Srch03_RsltR.class);
			MCDate dtFr = up0().dt_fr();
			MCDate dtTo = up0().dt_to();
			
			MAM_LOC_R locR = MAM_LOC_R.create("T");
			MCQueryApiBuilder locR_bldr = MCQueryApiBuilder.create(locR);
			MAM_WG_R m2 = MAM_WG_R.create("M2");
			locR_bldr.setSelect(locR.loc_nm);
			locR_bldr.addSelect(locR.wg_cd);
			locR_bldr.addSelect(m2.wg_nm);
			locR_bldr.addLeftOuterJoin(m2, bracket( m2.wg_cd.eq(locR.wg_cd)));
			locR_bldr.setWhere(locR.loc_cd.eq(bind("1")), up0().gi_loc_cd());
			dbSelect("MSBAL0020_MAM_LOC_S01", locR, locR_bldr);
			
			for (MCDate dt = dtFr.addDay(-1); dt.lte(dtTo); dt = dt.addDay(MCNumber.ONE)){
				// 品目行
				Srch03_RsltR rsltR = Srch03_RsltR.create();
				rsltR.itm_cd(up0().itm_cd());
				rsltR.itm_sub1(up0().itm_sub1());
				rsltR.itm_sub2(up0().itm_sub2());
				rsltR.itm_sub3(up0().itm_sub3());
				rsltR.itm_nm(up0().itm_nm());
				rsltR.loc_cd(up0().gi_loc_cd());
				rsltR.loc_nm(locR.loc_nm());
				rsltR.wg_cd(locR.wg_cd());
				rsltR.wg_nm(locR.getStringNE("WG_NM"));
				rsltR.schd_dt(dt);
				rsltR.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.GI.value());
				retL.add(rsltR);
				
				rsltR = rsltR.clone();
				rsltR.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.GR.value());
				retL.add(rsltR);

				rsltR = rsltR.clone();
				rsltR.sd_adjst_dtl_typ(MSC_SD_ADJST_DTL_TYP.STK.value());
				retL.add(rsltR);
			}
			return retL;
		}

		/**
		 * 在庫推移検索サービスの実行
		 */
		protected MSBEL_InvTransService.InvTrans_Srch06 getInvTransSrch() {
			MSBEL_InvTransService.InvTrans_Srch06 invTransSrch06 = MSBEL_InvTransService.crtInvTrans_Srch06();
			invTransSrch06.up0().gr_prcd_flg(false);
			invTransSrch06.up0().gr_sts_opn_grp_flg(up0().opn_flg());
			invTransSrch06.up0().gr_sts_ordsav_grp_flg(true);
			invTransSrch06.up0().gr_sts_fix_grp_flg(true);
			invTransSrch06.up0().gr_sts_schd_grp_flg(true);
			invTransSrch06.up0().gr_sts_ord_grp_flg(true);
			invTransSrch06.up0().gr_act_flg(true);
			invTransSrch06.up0().gi_prcd_flg(false);
			invTransSrch06.up0().gi_sts_opn_grp_flg(up0().opn_flg());
			invTransSrch06.up0().gi_sts_ordsav_grp_flg(true);
			invTransSrch06.up0().gi_sts_fix_grp_flg(true);
			invTransSrch06.up0().gi_sts_schd_grp_flg(true);
			invTransSrch06.up0().gi_sts_ord_grp_flg(true);
			invTransSrch06.up0().gi_act_flg(true);
			invTransSrch06.up0().sim_mrp_no(up0().sim_mrp_no());
			invTransSrch06.up0().tgt_ver_flg(true);
			invTransSrch06.up0().non_ver_flg(true);
			invTransSrch06.up0().dt_fr(up0().dt_fr());
			invTransSrch06.up0().dt_to(up0().dt_to());
			invTransSrch06.up0().loc_cd(up0().gi_loc_cd());
			invTransSrch06.up0().itm_cd(up0().itm_cd());
			invTransSrch06.up0().itm_sub1(up0().itm_sub1());
			invTransSrch06.up0().itm_sub2(up0().itm_sub2());
			invTransSrch06.up0().itm_sub3(up0().itm_sub3());
			invTransSrch06.up0().sum_unit_typ(MSC_SUM_UNIT_TYP.LOC.value());
			invTransSrch06.up0().sno1_flg(false);
			invTransSrch06.up0().sno2_flg(false);
			invTransSrch06.up0().sno3_flg(false);
			invTransSrch06.up0().sno4_flg(false);
			invTransSrch06.up0().dtl_flg(false);
			
			invTransSrch06.exec();
			
			return invTransSrch06;
		}

		/**
		 * 在庫推移検索サービスの結果を編集する
		 */
		protected void editInvTransDown1(MSBEL_InvTransService.InvTrans_Srch06 invTransSrch06){
			// 確定したＷＧ間依頼(移送依頼、もしくは購買依頼)に対応する受払予定、および実績を取得し、在庫推移検索結果から除外する
			MCList<MST_IO_SCHD_R> ioSchdL = getIoSchdL(up1(), down1());
		
			MCIndexKey stkKey = invTransSrch06.down1().createIndex(RsltR.$dt);
			for (MST_IO_SCHD_R r : ioSchdL.subList(r -> isSame(r.loc_cd(), up0().gi_loc_cd()))) {
				RsltR stkR = getStkR(invTransSrch06.down1(), stkKey, r.schd_dt());
				if (!isNull(stkR)) {
					if (MSC_IO_TYP.isGI(r.io_typ())) {
						stkR.gi_schd_qty(stkR.gi_schd_qty().subtract(r.getNumberNE("schd_qty")));
					}
					else if (MSC_IO_TYP.isGR(r.io_typ())) {
						stkR.gr_schd_qty(stkR.gr_schd_qty().subtract(r.getNumberNE("schd_qty")));
					}
				}
			}

			// 在庫数再計算
			MCNumber stk = null;
			for (RsltR r : invTransSrch06.down1()) {
				if (isNull(r.dt())) {
					stk = r.stk_qty();
				}
				else {
					stk = stk.add(r.gr_schd_qty()).add(r.gr_act_qty()).subtract(r.gi_schd_qty()).subtract(r.gi_act_qty());
					r.stk_qty(stk);
				}
			}
		}
		protected RsltR getStkR(MCList<RsltR> l, MCIndexKey stkKey, MCDate dt) {
			return up0().dt_fr().gt(dt) ? l.getFirst(stkKey, up0().dt_fr().addDay(-1)) : l.getFirst(stkKey, dt);
		}

		/**
		 * 日毎の受払予定、受払実績を集計する。
		 * @param inptFormL
		 * @param invTransSrch03
		 */
		protected void mergeToInptFmt (MCList<Srch03_RsltR> inptFormL, MSBEL_InvTransService.InvTrans_Srch06 invTransSrch06){
			String[] itmKeys = {Srch03_RsltR.$itm_cd,
					Srch03_RsltR.$itm_sub1,
					Srch03_RsltR.$itm_sub2,
					Srch03_RsltR.$itm_sub3,
					Srch03_RsltR.$sd_adjst_dtl_typ,
					Srch03_RsltR.$loc_cd,
					Srch03_RsltR.$schd_dt};
			MCIndexKey inptFormKey = inptFormL.createIndex(itmKeys);
			
			//　在庫推移検索サービスの結果をマージ
			for (RsltR srcR : invTransSrch06.down1()) {
				Srch03_RsltR destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(),
						srcR.itm_sub1(), srcR.itm_sub2(), srcR.itm_sub3(),
						MSC_SD_ADJST_DTL_TYP.STK.value(), srcR.loc_cd(), srcR.dt());
				
				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.stk_qty());
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.stk_qty()));
					}
				}
				
				destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(),
						srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.GR.value(),
						srcR.loc_cd(), srcR.dt());

				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.gr_act_qty().add(srcR.gr_schd_qty()));
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.gr_act_qty().add(srcR.gr_schd_qty())));
					}
					
					if(destR.schd_qty().isZero()) {
						destR.schd_qty(null);
					}
				}

				destR = inptFormL.getFirst(inptFormKey, srcR.itm_cd(), srcR.itm_sub1(),
						srcR.itm_sub2(), srcR.itm_sub3(), MSC_SD_ADJST_DTL_TYP.GI.value(),
						srcR.loc_cd(), srcR.dt());

				if(!isNull(destR)) {
					if(isNull(destR.schd_qty())) {
						destR.schd_qty(srcR.gi_act_qty().add(srcR.gi_schd_qty()));
					}
					else {
						destR.schd_qty(destR.schd_qty().add(srcR.gi_act_qty().add(srcR.gi_schd_qty())));
					}

					if(destR.schd_qty().isZero()) {
						destR.schd_qty(null);
					}
				}
			}

			MCSortPolicy p = new MCSortPolicy();
			p.add(SortType.ASC, RsltR.$itm_cd);
			p.add(SortType.ASC, RsltR.$itm_sub1);
			p.add(SortType.ASC, RsltR.$itm_sub2);
			p.add(SortType.ASC, RsltR.$itm_sub3);
			p.add(SortType.ASC, RsltR.$loc_cd);
			p.add(SortType.ASC, RsltR.$dt);
			invTransSrch06.down1().sort(p);
			
		}
	}
	
	/**
	 * 検索条件に対する一時カラムを設定する
	 * @param up 上り電文
	 */
	protected void setUpTmpCol(Srch01_CndR up) {
		if(up.rqst_flg()) {
			up.addStringColumn("TMP_RQST_STS", MSC_WG_RQST_STS_TYP.RQST.value());
		}
		if(up.prms_flg()) {
			up.addStringColumn("TMP_PRMS_STS", MSC_WG_RQST_STS_TYP.PRMS.value());
		}
		if(up.part_inst_flg()) {
			up.addStringColumn("TMP_PART_INST_STS", MSC_WG_RQST_STS_TYP.PART_INST.value());
		}
		if(up.inst_flg()) {
			up.addStringColumn("TMP_INST_STS", MSC_WG_RQST_STS_TYP.INST.value());
		}
		if(up.cmpl_flg()) {
			up.addStringColumn("TMP_CMPL_STS", MSC_WG_RQST_STS_TYP.CMPL.value());
		}
		if(up.re_rqst_flg()) {
			up.addStringColumn("TMP_RE_RQST", toTrueStr(true));
		}

		if(!isNull(up.gr_schd_dt_fr())
				|| !isNull(up.gr_schd_dt_to())
				|| !isNull(up.gi_schd_dt_fr())
				|| !isNull(up.gi_schd_dt_to())
		) {
			up.addStringColumn("TMP_PRMS_CHK", toTrueStr(true));
		}
		else {
			up.addStringColumn("TMP_PRMS_CHK", toFalseStr(false));
		}
		
		up.addStringColumn("TMP_PRMS_DIV", toTrueStr(up.prms_div_flg()));
		up.addStringColumn("TMP_DLV_INST_RCPT", toTrueStr(up.dlv_inst_rcpt_flg()));
		up.addStringColumn("TMP_DUE_DELAY", toTrueStr(up.due_delay_flg()));
		
		if(isNull(up.wg_rqst_ntc_day_typ())) {
			up.addStringColumn("WG_RQST_SRCH_DTY_TYP_NONE", toTrueStr(true));
		}
		else {
			if(MSC_WG_RQST_NTC_DAY_TYP.isRQST_DT(up.wg_rqst_ntc_day_typ())) {
				up.addDateColumn("WG_RQST_RQST_DT_FR", up.srch_dt_fr());
				up.addDateColumn("WG_RQST_RQST_DT_TO", up.srch_dt_to());
			}
			else if(MSC_WG_RQST_NTC_DAY_TYP.isRQST_CRRCT_DT(up.wg_rqst_ntc_day_typ())) {
				up.addDateColumn("WG_RQST_RQST_CRRCT_DT_FR", up.srch_dt_fr());
				up.addDateColumn("WG_RQST_RQST_CRRCT_DT_TO", up.srch_dt_to());
			}
			else if (MSC_WG_RQST_NTC_DAY_TYP.isRQST_CAN_DT(up.wg_rqst_ntc_day_typ())) {
				up.addDateColumn("WG_RQST_RQST_CAN_DT_FR", up.srch_dt_fr());
				up.addDateColumn("WG_RQST_RQST_CAN_DT_TO", up.srch_dt_to());
			}
			else if (MSC_WG_RQST_NTC_DAY_TYP.isPRMS_DT(up.wg_rqst_ntc_day_typ())) {
				up.addDateColumn("WG_RQST_PRMS_DT_FR", up.srch_dt_fr());
				up.addDateColumn("WG_RQST_PRMS_DT_TO", up.srch_dt_to());
			}
			else if (MSC_WG_RQST_NTC_DAY_TYP.isPRMS_CAN_DT(up.wg_rqst_ntc_day_typ())) {
				up.addDateColumn("WG_RQST_PRMS_CAN_DT_FR", up.srch_dt_fr());
				up.addDateColumn("WG_RQST_PRMS_CAN_DT_TO", up.srch_dt_to());
			}
			else if (MSC_WG_RQST_NTC_DAY_TYP.isINST_DT(up.wg_rqst_ntc_day_typ())) {
				up.addDateColumn("WG_RQST_INST_DT_FR", up.srch_dt_fr());
				up.addDateColumn("WG_RQST_INST_DT_TO", up.srch_dt_to());
			}
			else if (MSC_WG_RQST_NTC_DAY_TYP.isINST_CAN_DT(up.wg_rqst_ntc_day_typ())) {
				up.addDateColumn("WG_RQST_INST_CAN_DT_FR", up.srch_dt_fr());
				up.addDateColumn("WG_RQST_INST_CAN_DT_TO", up.srch_dt_to());
			}
			else if (MSC_WG_RQST_NTC_DAY_TYP.isACT_DT(up.wg_rqst_ntc_day_typ())) {
				up.addDateColumn("WG_RQST_ACT_DT_FR", up.srch_dt_fr());
				up.addDateColumn("WG_RQST_ACT_DT_TO", up.srch_dt_to());
			}
			else if (MSC_WG_RQST_NTC_DAY_TYP.isACT_CAN_DT(up.wg_rqst_ntc_day_typ())) {
				up.addDateColumn("WG_RQST_ACT_CAN_DT_FR", up.srch_dt_fr());
				up.addDateColumn("WG_RQST_ACT_CAN_DT_TO", up.srch_dt_to());
			}
		}
	}
	/**
	 * 引数のWG間依頼ＮＯに対応する受払予定を取得する
	 */
	protected MCList<MST_IO_SCHD_R> getIoSchdL(MCList<Srch03_IoActR> upL, MCList<Srch03_IoActR> downL) {
		MCList<MST_WG_RQST_R> dbc = MCList.create(MST_WG_RQST_R.class);
		upL.forEach(r -> {
			dbc.add().wg_rqst_no(r.wg_rqst_no());
		});
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_WG_RQST_R.create("T"));
		dbWkDelete("MSBAL0020_MSW_WG_RQST_D03", dbc_bldr.getBaseDbc());
		MCList<MST_WG_RQST_R> dbc2 = dbc.groupBy(dbc.createRow().getKeyColumn());
		dbWkInsert("MSBAL0020_MSW_WG_RQST_I03", dbc2, dbc_bldr.getBaseDbc());

		// 確定したＷＧ間依頼(移送依頼、もしくは購買依頼)に対応する受払予定を取得する
		MCList<MST_IO_SCHD_R> ioSchdL = MCList.create(MST_IO_SCHD_R.class);
		executeQuery(ioSchdL, MSBAL0020_MSVT_AVL_IO_SCHD_S01());
		
		// 確定したＷＧ間依頼(移送依頼、もしくは購買依頼)に対応する出荷数、入荷数を取得する
		executeQuery(downL, MSBAL0020_MST_WG_RQST_PRMS_S02());
		
		dbWkDelete("MSBAL0020_MSW_WG_RQST_D04", dbc_bldr.getBaseDbc());

		return ioSchdL;
	}

	//FMCB CUSTOM END
}