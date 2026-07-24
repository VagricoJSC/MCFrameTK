package mcframe.serverMSBE.MSBEL1420;

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
import mcframe.serverMSBE.MSBEL1420.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL1420.Query.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5510.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBF.MSBFL5210.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import mcframe.serverMSUC.MSUCL0080.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipSchdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipSchdReg_MC extends MSBEL_ShipSchdReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 出荷予定を検索する。<br>
	 */
	public class Srch01 extends MSBEL_ShipSchdReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());
			
			MCQueryPlan sql = null;
			if (isSame(up0().srch_mode(),"0")) {
				sql = MSBEL1420_MST_SHIP_SCHD_S01();
			}
			else {
				sql = MSBEL1420_MST_SHIP_SCHD_S02();
			}
			searchForDL(sql, up0(), down0());
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			if (up.not_inst_flg()) {
				up.addStringColumn("TMP_STS_NOT_INST", MSC_PR_STS_TYP.NOT_INST.value());
			}
			if (up.inst_flg()) {
				up.addStringColumn("TMP_STS_INST", MSC_PR_STS_TYP.INST.value());
			}
			if (up.not_ship_flg()) {
				up.addStringColumn("TMP_STS_NOT_SHIP", MSC_PR_STS_TYP.NOT_SHIP.value());
			}
			if (up.part_ship_flg()) {
				up.addStringColumn("TMP_STS_PART_SHIP", MSC_PR_STS_TYP.PART_SHIP.value());
			}
			if (up.ship_flg()) {
				up.addStringColumn("TMP_STS_SHIP", MSC_PR_STS_TYP.SHIP.value());
			}
			if (!isSame(up.srch_mode(),"0")) {
				up.part_alloc_flg(true);	// カットオフを考慮(画面はオフ固定)
			}
			if (up.not_alloc_flg() && up.part_alloc_flg() && up.all_alloc_flg() && up.alloc_invalid_flg()) {
				// 全てTRUEの場合は、引当状況に関するWHERE句はカットオフされるようにする
			}
			else {
				up.addStringColumn("NOT_ALLOC_FLG_STR", MCBooleanUtil.booleanToDBString(up.not_alloc_flg()));
				up.addStringColumn("PART_ALLOC_FLG_STR", MCBooleanUtil.booleanToDBString(up.part_alloc_flg()));
				up.addStringColumn("ALL_ALLOC_FLG_STR", MCBooleanUtil.booleanToDBString(up.all_alloc_flg()));
				up.addStringColumn("ALLOC_INVALID_FLG_STR", MCBooleanUtil.booleanToDBString(up.alloc_invalid_flg()));
			}
			if (up.ship_block_flg() != up.not_ship_block_flg()) {
				up.addStringColumn("TMP_SHIP_BLOCK", MCBooleanUtil.booleanToDBString(up.ship_block_flg()));				
			}
			if (up.dlv_rqst_flg()) {
				up.addNumberColumn("TMP_DLV_RQST", MCNumber.ZERO);
			}
			if (up.ship_rqst_flg()) {
				up.addNumberColumn("TMP_SHIP_RQST", MCNumber.ZERO);
			}
			if (up.pd_inst_dlv_flg()) {
				up.addNumberColumn("TMP_PD_INST_DLV", MCNumber.ZERO);
			}

			// 打切含むがオフの時（オンの時は全件）
			if (!up.abort_flg()) {
				up.addStringColumn("TMP_ABORT_FLG", MCBooleanUtil.booleanToDBString(false));
			}
		}

		/**
		 * doSearchMain()の検索結果を編集します。<p>
		 */
		protected void editListMain() {
			doCache();

			MCList<Srch01_RsltR> rmList = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				r.alloc_sts_typ(getAllocStsTyp(r.alloc_typ(), 
						r.base_unit_qty(), r.alloc_qty(), r.xfr_schd_no()));

				if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ())) {
					r.grp_alloc_flg(r.alloc_flg());
					r.alloc_flg(false);
				}
				else {
					if (r.alloc_flg() && isNullAnd(r.lot_no(), r.sublot_no())) {
						r.lot_none_flg(true);
					}
				}
				
				r.ship_schd_time(getTimeChar(r.ship_schd_hm()));

				MCList<MST_SLO_D_R> l = null;
				if (MSC_SHIP_ASSORT_TYP.isAST(r.assort_typ())) {
					l = getSloDL1(r.slo_no());
				}
				else if (!isNull(r.set_itm_grp_no())) {
					l = getSloDL2(r.slo_no(), r.set_itm_grp_no());
				}
				if (l != null) {
					if (l.getFirst("ship_abl_flg", false) == null) {
						r.assort_sts_mark(MAC_RTN_STS_TYP.OK.name(getUsrLocale()));
					}
					else {
						r.assort_sts_mark(MAC_RTN_STS_TYP.ERR.name(getUsrLocale()));
					}
				}
				MCList<MST_IV_MAP_R> ivMapL = getIvMapL(r.ship_schd_no());
				if(!isNull(ivMapL)) {
					r.iv_reg_flg(true);
					if(ivMapL.size() == 1) {
						if(ivMapL.get(0).getBooleanNE("IV_SHIP_FLG")) {
							r.iv_ship_flg(ivMapL.get(0).getBooleanNE("IV_SHIP_FLG"));
							r.iv_no(ivMapL.get(0).getStringNE("IV_NO"));
						}
					}
				}
				if (r.cont_fctr_flg()) {
					MCNumber qty = isSame(up0().srch_mode(),"0") ? r.base_unit_qty() : r.alloc_base_unit_qty();
					// 標準有効成分
					r.std_cont_qty(
							convToContFctrUnit(qty, r.std_cont_fctr(),
									r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
					// 実際有効成分
					r.act_cont_qty(
							convToContFctrUnit(qty, r.act_cont_fctr(),
									r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
				}
				if(!isNull(up0().iv_no())) {
					if(isLike(r.iv_no(), up0().iv_no())) {
						continue;
					}
					rmList.add(r);
				}
				r.org_fix_flg(r.fix_flg());
			}
			down0().removeAll(rmList);
		}

		protected void doCache() {
			MCList<Srch01_RsltR>
				hL = MCList.create(Srch01_RsltR.class),
				dL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if (MSC_SHIP_ASSORT_TYP.isAST(r.assort_typ())) {
					hL.add(r);
				}
				else if (!isNull(r.set_itm_grp_no())) {
					dL.add(r);
				}
			}
			initSloDCache1(hL);
			initSloDCache2(dL);
			initIvMapCache(down0());
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * ロット提案を実行する。<br>
	 */
	public class Srch02 extends MSBEL_ShipSchdReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();
			doCache();

			if (!doChk()) {
				return ;
			}

			// ロット引当
			callAllocSrch01(up0(), up1(), null);
			dbTran().rollback();

			setDown();
		}

		protected void editUp() {
			initShipSchdCache(up0());
			initShipAllocStsCache(up0());

			// キャッシュ用補完
			for (Chk01_RsltR r : up0()) {
				MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
				r.itm_cd(ssR.itm_cd());
				r.itm_sub1(ssR.itm_sub1());
				r.itm_sub2(ssR.itm_sub2());
				r.itm_sub3(ssR.itm_sub3());
				r.trd_unit_cd(ssR.trd_unit_cd());
				r.base_unit_cd(ssR.base_unit_cd());
				r.ship_fr_lg_grp_cd(ssR.ship_fr_lg_grp_cd());
				r.ship_to_lg_grp_cd(ssR.getString("ship_to_lg_grp_cd"));
				r.cst_cd(ssR.getString("cst_cd"));
				r.dlv_id_cd(ssR.getString("dlv_id_cd"));
				r.alloc_grp_cd(ssR.getString("alloc_grp_cd"));
				r.dlv_lg_grp_cd(ssR.getString("dlv_lg_grp_cd"));
				
				if (r.str_ln_cd_none_flg()) {
					r.str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(r.ship_alloc_sts_no())) {
					MST_SHIP_ALLOC_STS_R stsR = getShipAllocStsR(r.ship_alloc_sts_no());
					if (!isNull(stsR)) {
						r.sas_alloc_flg(stsR.alloc_flg());
					}
				}
			}
			up0().setString(Chk01_RsltR.$alloc_scope_typ, MAC_ALLOC_SCOPE_TYP.LOC.value());
		}

		protected void doCache() {
			initLgCtlCache(up0());
			initBpCache(up0());
			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
			for (Chk01_RsltR r : up0().groupBy(Chk01_RsltR.$itm_cd,
					Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3, Chk01_RsltR.$alloc_ent_unit_cd,
					Chk01_RsltR.$base_unit_cd)) {

				MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
				itmUnitR.itm_cd(r.itm_cd());
				itmUnitR.itm_sub1(r.itm_sub1());
				itmUnitR.itm_sub2(r.itm_sub2());
				itmUnitR.itm_sub3(r.itm_sub3());
				itmUnitR.unit_cd(r.alloc_ent_unit_cd());
				itmUnitL.add(itmUnitR);

				if (!isSame(r.alloc_ent_unit_cd(), r.base_unit_cd())) {
					MAVM_ITM_UNIT_R itmUnitR2 = itmUnitR.clone();
					itmUnitR2.unit_cd(r.base_unit_cd());
					itmUnitL.add(itmUnitR2);
				}
			}
			initItmUnitCache(itmUnitL);
			initItmCache(
				up0().groupBy(Chk01_RsltR.$itm_cd,
					Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3));
		}

		/**
		 * チェック処理
		 */
		protected boolean doChk() {
			List<IfValidater> valL = new ArrayList<IfValidater>();
			valL.add(new FXUCL_RequiredValidater());

			MCMessagePool.addAll(check(up0(), Chk01_RsltR.$ship_schd_tm, valL));
			MCMessagePool.addAll(check(up0(), Chk01_RsltR.$itm_cd, valL));
			MCMessagePool.addAll(check(up0(), Chk01_RsltR.$alloc_ent_unit_cd, valL));
			MCMessagePool.addAll(check(up0(), Chk01_RsltR.$alloc_ent_unit_qty, valL));
			MCMessagePool.addAll(check(up0(), Chk01_RsltR.$gd_cd, valL));
			MCMessagePool.addAll(check(up0(), Chk01_RsltR.$quality_typ, valL));
			MCMessagePool.addAll(check(up0(), Chk01_RsltR.$stk_insp_typ, valL));
			MCMessagePool.addAll(check(up0(), Chk01_RsltR.$stk_id_typ, valL));
			MCMessagePool.addAll(check(up0(), Chk01_RsltR.$stk_bp_cd, valL));

			// DAC
			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : up0()) {
				msgL.addAll(checkWritableLgGrpCdDac(r, Chk01_RsltR.$ship_fr_lg_grp_cd));
			}
			MCMessagePool.addAll(msgL);
			
			return MCMessagePool.size() == 0;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(setAllocRsltL(up0()));
		}
	
		/**
		 * 引当結果を上り電文に反映して返す
		 */
		protected MCList<Chk01_RsltR> setAllocRsltL(MCList<Chk01_RsltR> list) {
			MCList<Chk01_RsltR> l = MCList.create(Chk01_RsltR.class);
			MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);

			for (Chk01_RsltR r : list) {

				MCNumber remain_qty = MCNumber.ZERO;
				MCNumber baseUnitDecPlace = MCNumber.ZERO;
				String baseUnitRndTyp = null;
				
				rsltL.init();
				if (!_allocRsltL.isEmpty()) {
					rsltL = _allocRsltL.subList(Srch_RsltR.$peg_no, r.peg_no());
				}
				if (rsltL.isEmpty()) {
					r.no_alloc_flg(true);
					l.add(r);
				}
				else {
					// 引当できた
					remain_qty = r.alloc_base_unit_qty();

					MAVM_ITM_UNIT_R entItmUnitR = getItmUnitR(r.itm_cd(),
							r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.alloc_ent_unit_cd());

					for (Srch_RsltR rsltR : rsltL) {
						// 引当できた分のレコード作成
						Chk01_RsltR tmpR = r.clone();
						tmpR.loc_cd(rsltR.stk_loc_cd());
						tmpR.loc_nm(rsltR.stk_loc_nm());
						tmpR.str_ln_cd(rsltR.stk_str_ln_cd());
						tmpR.str_ln_nm(rsltR.stk_str_ln_nm());
						tmpR.str_ln_cd_none_flg(isSame(rsltR.stk_str_ln_cd(), MAC_STR.NULL_VAL.value()));
						tmpR.str_ln_tgt_flg(rsltR.stk_str_ln_tgt_flg());
						tmpR.lot_no(rsltR.lot_no());
						tmpR.sublot_no(rsltR.sublot_no());
						tmpR.ver_no(rsltR.ver_no());
						tmpR.alloc_base_unit_qty(rsltR.base_unit_qty());
						tmpR.alloc_sno1(rsltR.sno1());
						tmpR.alloc_sno2(rsltR.sno2());
						tmpR.alloc_sno3(rsltR.sno3());
						tmpR.alloc_sno4(rsltR.sno4());
						tmpR.act_cont_fctr(rsltR.act_cont_fctr());

						// 荷姿単位での引当の場合
						if(isSame(tmpR.alloc_ent_unit_cd(), rsltR.pack_unit_cd())) {
							tmpR.alloc_ent_unit_qty(rsltR.pack_unit_qty());
						}
						// 基準単位での引当の場合
						else {
							// 入力単位に変換
							MCNumber entQty = rvrsBaseUnitConv(
									rsltR.base_unit_qty(),
									entItmUnitR.conv_base_qty(),
									entItmUnitR.conv_qty(),
									entItmUnitR.dec_place(),
									entItmUnitR.rnd_typ());
									
							MCNumber reEntQty = convToBaseUnit(
									entQty,
									entItmUnitR.conv_base_qty(),
									entItmUnitR.conv_qty(),
									rsltR.base_unit_dec_place(),
									rsltR.base_unit_rnd_typ());
							if(!isSame(reEntQty, rsltR.base_unit_qty())) {
								// 割り切れない場合は基準単位とする
								tmpR.alloc_ent_unit_cd(rsltR.base_unit_cd());
								tmpR.alloc_ent_unit_nm(rsltR.base_unit_nm());
								tmpR.alloc_ent_unit_conv_base_qty(MCNumber.ONE);
								tmpR.alloc_ent_unit_conv_qty(MCNumber.ONE);
								tmpR.alloc_ent_unit_dec_place(rsltR.base_unit_dec_place());
								tmpR.alloc_ent_unit_qty(rsltR.base_unit_qty());
							}
							else {
								tmpR.alloc_ent_unit_qty(entQty);
							}
						}

						l.add(tmpR);

						// 残数
						remain_qty = remain_qty.subtract(rsltR.base_unit_qty());
						baseUnitDecPlace = rsltR.base_unit_dec_place();
						baseUnitRndTyp = rsltR.base_unit_rnd_typ();
					}
					// 残数がある場合は未引当レコードを作成する
					if (remain_qty.isPositive()) {
						Chk01_RsltR tmpR = r.clone();
						tmpR.alloc_base_unit_qty(remain_qty);
						MCNumber entQty = rvrsBaseUnitConv(
								remain_qty,
								entItmUnitR.conv_base_qty(),
								entItmUnitR.conv_qty(),
								entItmUnitR.dec_place(),
								entItmUnitR.rnd_typ());
								
						MCNumber reEntQty = convToBaseUnit(
								entQty,
								entItmUnitR.conv_base_qty(),
								entItmUnitR.conv_qty(),
								baseUnitDecPlace,
								baseUnitRndTyp);
						if(!isSame(reEntQty, remain_qty)) {
							Srch_RsltR rsltR = rsltL.get(0);
							tmpR.alloc_ent_unit_cd(rsltR.base_unit_cd());
							tmpR.alloc_ent_unit_nm(rsltR.base_unit_nm());
							tmpR.alloc_ent_unit_conv_base_qty(MCNumber.ONE);
							tmpR.alloc_ent_unit_conv_qty(MCNumber.ONE);
							tmpR.alloc_ent_unit_dec_place(rsltR.base_unit_dec_place());
							tmpR.alloc_ent_unit_qty(remain_qty);
						}
						else {
							tmpR.alloc_ent_unit_qty(entQty);
						}
						tmpR.no_alloc_flg(true);
						l.add(tmpR);
					}
				}
			}

			// 有効成分算出
			setContQty(l);
			
			return l;
		}

		protected void setContQty(MCList<Chk01_RsltR> list) {
			for (Chk01_RsltR r : list) {
				MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (itmR.cont_fctr_flg()) {
					// 標準有効成分
					r.std_cont_qty(null);
					if (!isNull(itmR.std_cont_fctr())) {
						r.std_cont_qty(
								convToContFctrUnit(r.alloc_base_unit_qty(), itmR.std_cont_fctr(),
										itmR.cont_fctr_dec_place(), itmR.cont_fctr_rnd_typ()));
					}
					// 実際有効成分
					r.act_cont_qty(null);
					if (!isNull(r.act_cont_fctr())) {
						r.act_cont_qty(
								convToContFctrUnit(r.alloc_base_unit_qty(), r.act_cont_fctr(),
										itmR.cont_fctr_dec_place(), itmR.cont_fctr_rnd_typ()));
					}
				}
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 出荷予定を訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MSBEL_ShipSchdReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(chkItm());
			msgL.addAll(chkBp());
			msgL.addAll(chkShipPr());

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}
		
		/**
		 * 品目マスタのチェック
		 */
		protected MCMessageList chkItm() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			
			if (notErrL.isEmpty()) {
				return msgL;
			}
			initItmCache(notErrL.groupBy(Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3));
			
			for (Chk01_RsltR r : notErrL) {
				if (isNull(r.itm_cd())) {
					continue;
				}
				MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (isNull(itmR) || itmR.isEmpty()) {
					msgL.add(
							new MCMessage(
									r, null, MAUAL0189, 
									toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									toDispGUIIndex(r)));
				}
			}
			return msgL;
		}
		
		/**
		 * 取引先マスタのチェック
		 */
		protected MCMessageList chkBp() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			if (notErrL.isEmpty()) {
				return msgL;
			}

			for (Chk01_RsltR r : notErrL) {
				if (isNull(r.cst_cd())) {
					continue;
				}
				MAM_BP_R bpR = getBpR(r.cst_cd());
				if (isNull(bpR) || bpR.isEmpty()) {
					msgL.add(new MCMessage(r, null, MSBEL1062, r.cst_cd(),
							toDispGUIIndex(r)));
				}
			}
			return msgL;
		}
		
		/**
		 * 出荷進捗のロック、更新カウンタチェック
		 */
		protected MCMessageList chkShipPr() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_SHIP_PR_R> selectL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.ship_pr_no, t.slo_d_no, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.ship_pr_no);

			MCList<Chk01_RsltR> bindL = notErrL.groupBy(Chk01_RsltR.$ship_pr_no);
			bindL.sort(Chk01_RsltR.$ship_pr_no);
			dbSelectKeyForUpdateNoWait("MSBEL1420_MST_SHIP_PR_S01", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			for (Chk01_RsltR r : notErrL) {
				MST_SHIP_PR_R selectR = selectL.getFirst(idxkey, r.ship_pr_no());
				if (!isNull(r.ship_pr_no())) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$ship_pr_upd_cntr, selectR));
					setErrFlg(r, msgL);
					r.slo_d_no(selectR.slo_d_no());
				}
			}
			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
			MCList<Chk01_RsltR> notErrL = getChkList(up0(), MCRow.CREATE, MCRow.MODIFY);
			MCList<Chk01_RsltR> shipSchdDtSrchTgtL = makeShipSchdDtSrchTgtList(notErrL);

			if (!shipSchdDtSrchTgtL.isEmpty()) {
				callShipSchdDtSrch01(shipSchdDtSrchTgtL);
			}
			
			for (Chk01_RsltR r: notErrL) {
				r.ship_schd_time(getTimeChar(r.ship_schd_tm()));

				// 予定日計算対象外フラグ
				if (!isSame(up1().srch_mode(),"0")) {
					MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
					r.not_dt_calc_flg(ssR.not_dt_calc_flg());
				}
				else {
					r.not_dt_calc_flg(r.no_calc_flg());
				}
			}
		}

		/**
		 * 出荷予定日計算サービスの対象にするリストの作成<br>
		 * 対象にしなかったデータの納品予定日時は、元の納品予定日時のままとする
		 */
		protected MCList<Chk01_RsltR> makeShipSchdDtSrchTgtList(MCList<Chk01_RsltR> notErrL) {
			MCList<Chk01_RsltR> shipSchdDtSrchTgtL = notErrL.createInstance();

			for (Chk01_RsltR r : notErrL) {
				if (!isNull(r.ship_schd_tm()) && !isNull(r.dlv_schd_tm())) {
					continue;
				}
				if (r.no_calc_flg()) {
					if (isNull(r.ship_schd_tm()) && isNull(r.dlv_schd_tm())) {
						MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
						if (isSame(getSysParmNE("DLV_SCHD_TM_NO_CALC_FLG"), "1")
								|| isSame(r.ship_term_cd(), ssR.ship_term_cd())) {
							r.ship_schd_tm(ssR.ship_schd_tm());
							r.dlv_schd_tm(ssR.dlv_schd_tm());
						}
						else {
							// 出荷条件の違いで納品予定日を計算するとき、出荷予定日を元に納品予定日を計算
							r.ship_schd_tm(ssR.ship_schd_tm());
							shipSchdDtSrchTgtL.add(r);
						}
					}
					else {
						shipSchdDtSrchTgtL.add(r);
					}
				}
				else {
					shipSchdDtSrchTgtL.add(r);
				}
			}
			return shipSchdDtSrchTgtL;
		}

		/**
		 * 出荷予定日計算サービス呼び出し
		 */
		protected void callShipSchdDtSrch01(MCList<Chk01_RsltR> list) {
			// 引当状況モード時は実行しない
			if (!isSame(up1().srch_mode(),"0")) {
				return ;
			}

			MSBEL_ShipSchdDtCalcService.ShipSchdDt_Srch01 o = MSBEL_ShipSchdDtCalcService.crtShipSchdDt_Srch01();
			setAll(o.up0(), list, createMap_MSW_SHIP_SCHD_DT_CALC_R_Chk01_RsltR());
			o.exec();
			
			MCIndexKey idx = list.createIndex(Chk01_RsltR.$peg_no);
			for (MSW_SHIP_SCHD_DT_CALC_R downR : o.down0()) {
				Chk01_RsltR r = list.getFirst(idx, downR.peg_no());
				if (!isNull(r)) {
					r.ship_schd_tm(downR.ship_schd_tm());
					r.dlv_schd_tm(downR.dlv_schd_tm());
					if (!r.no_calc_flg()) {
						r.ship_wk_cd(downR.ship_wk_cd());
					}
				}
			}
		}
		protected Map_MSW_SHIP_SCHD_DT_CALC_R_Chk01_RsltR<MSW_SHIP_SCHD_DT_CALC_R,Chk01_RsltR> createMap_MSW_SHIP_SCHD_DT_CALC_R_Chk01_RsltR() {
			return new Map_MSW_SHIP_SCHD_DT_CALC_R_Chk01_RsltR<MSW_SHIP_SCHD_DT_CALC_R, Chk01_RsltR>();
		}
		public class Map_MSW_SHIP_SCHD_DT_CALC_R_Chk01_RsltR<D extends MSW_SHIP_SCHD_DT_CALC_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_term_cd, Chk01_RsltR.$ship_term_cd);
				addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$cl_time_chk_flg, Chk01_RsltR.$cl_time_chk_flg);
				addColumnPathMap(MSW_SHIP_SCHD_DT_CALC_R.$ship_dt_chk_flg, Chk01_RsltR.$ship_dt_chk_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MST_SHIP_SCHD_R ssR = getShipSchdR(src.ship_schd_no());
				dest.ship_fr_lg_grp_cd(ssR.ship_fr_lg_grp_cd());
				dest.ship_to_lg_grp_cd(ssR.getString("ship_to_lg_grp_cd"));
				dest.ship_to_id_typ(ssR.getString("ship_to_id_typ"));
				dest.ship_to_id_cd(ssR.getString("ship_to_id_cd"));
				dest.dlv_day_week_typ(ssR.getString("dlv_day_week_typ"));
				dest.ship_inst_typ(ssR.getString("ship_inst_typ"));
				if(src.no_calc_flg()) {
					dest.dlv_rqst_tm(src.dlv_schd_tm());
					dest.ship_rqst_tm(src.ship_schd_tm());
				}
				else {
					dest.dlv_rqst_tm(ssR.pd_inst_dlv_tm());
					dest.ship_rqst_tm(ssR.ship_rqst_tm());
					if (isSlo(src)) {
						dest.ship_cal_cd_chk_flg(true);
						dest.early_ship_dt_add_days_chk_flg(true);
					}
					else {
						dest.ship_cal_cd_chk_flg(false);
						dest.early_ship_dt_add_days_chk_flg(false);
					}
				}
				dest.base_dt(getToday());
			}
			protected boolean isSlo(S src) {
				return !isNull(src.slo_d_no());
			}
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			crrctDataAfterDoServerChk(notErrL);

			// DACチェック
			for (Chk01_RsltR r : notErrL) {
				msgL.addAll(checkWritableLgGrpCdDac(r, Chk01_RsltR.$ship_fr_lg_grp_cd));
			}

			// ステータスチェック
			for (Chk01_RsltR r : notErrL) {
				MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
				if (!ssR.ship_inst_qty().isZero()) {
					msgL.add(new MCMessage(r, null,	MSBEL0087, toDispGUIIndex(r)));
				}
			}

			if (isSame(up1().srch_mode(),"0")) {
				// 出荷進捗の粒度で数量が一致しているかチェック
				MCList<MST_SHIP_SCHD_R> ssL = MCList.create(MST_SHIP_SCHD_R.class);
				MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
				MCQueryApiBuilder ssL_bldr = MCQueryApiBuilder.create(t);
				MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
				ssL_bldr.addSelect(t2.slo_d_no,t2.xfr_schd_no);
				ssL_bldr.addInnerJoin(t2, bracket( t2.ship_pr_no.eq(t.ship_pr_no)));
				ssL_bldr.setWhere(t.ship_pr_no.eq(bind("ship_pr_no")));
				dbSelect("MSBEL1420_MST_SHIP_SCHD_S01",
						ssL, ssL_bldr, notErrL.groupBy(Chk01_RsltR.$ship_pr_no));
				MCIndexKey prIdx = ssL.createIndex(MST_SHIP_PR_R.$ship_pr_no);

				msgL.addAll(chkSlsActQty(notErrL, ssL));

				for (MCList<Chk01_RsltR> l : notErrL.groupList(Chk01_RsltR.$ship_pr_no)) {
					Chk01_RsltR r = l.get(0);
					MCList<MST_SHIP_SCHD_R> schdL = ssL.subList(prIdx, r.ship_pr_no());
					MCList<Chk01_RsltR> tgtL = l.subList(MCRow.CREATE, MCRow.MODIFY);
					MCList<MST_SHIP_SCHD_R> reShipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
					MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
					
					for(MST_SHIP_SCHD_R shipR : schdL) { 
						if(shipR.re_ship_schd_flg()) {
							reShipSchdL.add(shipR);
						}else {
							shipSchdL.add(shipR);
						}
					}
					
					MCIndexKey reShipSchdNoIdx = reShipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
					MCIndexKey shipSchdNoIdx = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
					MCList<Chk01_RsltR> tgtReShipL = tgtL.subList(tgtR-> !isNull(reShipSchdL.subList(reShipSchdNoIdx,tgtR.ship_schd_no())));
					MCList<Chk01_RsltR> tgtShipL = tgtL.subList(tgtR-> !isNull(shipSchdL.subList(shipSchdNoIdx,tgtR.ship_schd_no())));
					
					MCNumber
						reShipPrQty = MCNumber.ZERO,
						reShipSum = nvl(tgtReShipL.sum(Chk01_RsltR.$alloc_base_unit_qty), MCNumber.ZERO);

					MCNumber
						shipPrQty = MCNumber.ZERO,
						shipSum = nvl(tgtShipL.sum(Chk01_RsltR.$alloc_base_unit_qty), MCNumber.ZERO);
					MCNumber tmpSum;
					// 更新対象以外の分割データがあったらキャッシュから取得して合計数に加算
					for (MST_SHIP_SCHD_R ssR : schdL) {
						tmpSum = MCNumber.ZERO;
						
						Chk01_RsltR r2 = l.getFirst(Chk01_RsltR.$ship_schd_no, ssR.ship_schd_no());
						if (r2 == null) {
							tmpSum = tmpSum.add(ssR.base_unit_qty());
						} else if (ssR.abort_flg() && r2.isStatusDelete()) {
							// 変更前打切オン  かつ 変更後ステータスDELETEの場合も入力合計を加算
							tmpSum = tmpSum.add(ssR.base_unit_qty());
						}
						
						if(ssR.re_ship_schd_flg()) {
							reShipSum = reShipSum.add(tmpSum);  
							reShipPrQty = reShipPrQty.add(ssR.base_unit_qty()); 
						}else {
							shipSum = shipSum.add(tmpSum); 
							shipPrQty = shipPrQty.add(ssR.base_unit_qty()); 
						}
					}
					if (!isSame(shipSum, shipPrQty)) {
						MCList<Chk01_RsltR> errShipL = l.subList(shipR-> !isNull(shipSchdL.subList(shipSchdNoIdx, shipR.ship_schd_no())));
						errShipL.addNumberColumn("org_peg_no");
						MCList<Chk01_RsltR> orgPegNoL = errShipL.groupBy("org_peg_no");
						MCIndexKey orgPegNoKey = errShipL.createIndex("org_peg_no");
						for(Chk01_RsltR orgPegNoR : orgPegNoL){
							Chk01_RsltR errShipR = errShipL.getFirst(orgPegNoKey, orgPegNoR.getNumberNE("org_peg_no"));
							msgL.add(new MCMessage(errShipR, Chk01_RsltR.$trd_unit_qty, MSBEL0345,
									nvl(schdL.get(0).getStringNE("slo_d_no"), MAC_STR.NULL_VAL.value()),
									nvl(schdL.get(0).getStringNE("xfr_schd_no"), MAC_STR.NULL_VAL.value()), shipPrQty, shipSum, toDispGUIIndex(errShipR)));
							errShipR.err_flg(true);
						}
					}
					if (!isSame(reShipSum, reShipPrQty)) {
						MCList<Chk01_RsltR> errReShipL = l.subList(reShipR-> !isNull(reShipSchdL.subList(reShipSchdNoIdx, reShipR.ship_schd_no())));
						errReShipL.addNumberColumn("org_peg_no");
						MCList<Chk01_RsltR> orgPegNoL = errReShipL.groupBy("org_peg_no");
						MCIndexKey orgPegNoKey = errReShipL.createIndex("org_peg_no");
						for(Chk01_RsltR orgPegNoR : orgPegNoL){
							Chk01_RsltR errReShipR = errReShipL.getFirst(orgPegNoKey, orgPegNoR.getNumberNE("org_peg_no"));
							msgL.add(new MCMessage(errReShipR, Chk01_RsltR.$trd_unit_qty, MSBEL0355,
									nvl(schdL.get(0).getStringNE("slo_d_no"), MAC_STR.NULL_VAL.value()),
									 reShipPrQty, reShipSum, toDispGUIIndex(errReShipR)));
							errReShipR.err_flg(true);
						}
					}

					// 出荷引当状況が複数存在する場合は、数量を増やす更新は不可
					for (MCList<Chk01_RsltR> l2 : l.groupList(Chk01_RsltR.$ship_schd_no)) {
						r = l2.get(0);
						MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());

						if (r.base_unit_qty().gt(ssR.base_unit_qty())) {
							MCList<MST_SHIP_ALLOC_STS_R> stsL = getShipAllocStsL(ssR.ship_schd_no());
							if (stsL.size() > 1) {
								// 増やした分の数量をどの引当状況に割り当てるかシステムでは判断つかないため、エラーにする
								msgL.add(new MCMessage(r, Chk01_RsltR.$trd_unit_qty, MSBEL0346, r.ship_schd_no(), toDispGUIIndex(r)));
								l.forEach(rr -> rr.err_flg(true));
							}
						}
					}
				}
			}
			else {
				// 引当状況モード
				// 予定数チェック
				for (MCList<Chk01_RsltR> l : notErrL.groupList(Chk01_RsltR.$ship_schd_no)) {
					MST_SHIP_SCHD_R ssR = getShipSchdR(l.get(0).ship_schd_no());
					
					MCNumber sum = l.sum(Chk01_RsltR.$alloc_base_unit_qty);

					MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = getShipAllocStsL(
							l.get(0).ship_schd_no());

					// 更新対象以外の分割データがあったらキャッシュから取得して合計数に加算
					for (MST_SHIP_ALLOC_STS_R r : shipAllocStsL) {
						Chk01_RsltR r2 = l.getFirst(Chk01_RsltR.$ship_alloc_sts_no, r.ship_alloc_sts_no());
						if (r2 == null) {
							sum = sum.add(r.base_unit_qty());
						}
					}

					if (!isSame(ssR.base_unit_qty(), sum)) {
						msgL.add(new MCMessage(l.get(0), Chk01_RsltR.$alloc_ent_unit_qty,
								MSBEL0153, l.get(0).ship_schd_no(), ssR.base_unit_qty(), sum, toDispGUIIndex(l.get(0))));
						l.forEach(r -> r.err_flg(true));
					}
				}
			}
			return msgL;
		}

		/**
		 * 売上実績明細ＮＯごとに出荷予定の数量が一致するかチェックする。
		 * @return エラーメッセージ
		 */
		protected MCMessageList chkSlsActQty(MCList<Chk01_RsltR> notErrL, MCList<MST_SHIP_SCHD_R> ssL) {
			
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk01_RsltR> tgtL = MCList.create(Chk01_RsltR.class);
			tgtL.addAll(notErrL);
			
			MCIndexKey shipSchdIdx = tgtL.createIndex(Chk01_RsltR.$ship_schd_no);
			MCList<Chk01_RsltR> tgtAddL = MCList.create(Chk01_RsltR.class);
			
			for (MST_SHIP_SCHD_R ssR : ssL) {
				MCList<Chk01_RsltR> TgtShipSchdL = tgtL.subList(shipSchdIdx,
						ssR.ship_schd_no());
				if (!isNull(TgtShipSchdL)) {
					TgtShipSchdL.setStringNE("sls_act_d_no", ssR.sls_act_d_no());
				}
				else {
					Chk01_RsltR addR = Chk01_RsltR.create();
					addR.setStringNE("sls_act_d_no", ssR.sls_act_d_no());
					addR.trd_unit_qty(ssR.trd_unit_qty());
					tgtAddL.add(addR);
				}
			}
			tgtL.addAll(tgtAddL);
			
			MCList<MST_SHIP_SCHD_R> oldshipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			for (MCList<MST_SHIP_SCHD_R> ssGrpL : ssL.groupList(MST_SHIP_SCHD_R.$sls_act_d_no)) {
				if (!isNull(ssGrpL.get(0).sls_act_d_no())) {
					MST_SHIP_SCHD_R oldshipSchdR = MST_SHIP_SCHD_R.create();
					oldshipSchdR.sls_act_d_no(ssGrpL.getString(0, MST_SHIP_SCHD_R.$sls_act_d_no));
					oldshipSchdR.trd_unit_qty(ssGrpL.sum(MST_SHIP_SCHD_R.$trd_unit_qty));
					oldshipSchdL.add(oldshipSchdR);
				}
			}
			
			MCIndexKey slsActIdx = tgtL.createIndex("sls_act_d_no");
			
			for (MST_SHIP_SCHD_R oldshipSchdLR : oldshipSchdL) {

				MCList<Chk01_RsltR> tgtSubL = tgtL.subList(slsActIdx, oldshipSchdLR.sls_act_d_no());

				MCNumber shipSchdQty = MCNumber.ZERO;
				
				if (!isNull(tgtSubL) && !tgtSubL.isEmpty()) {
					MCList<Chk01_RsltR> tgtSubWithoutDltL = tgtSubL.subList(MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);
					shipSchdQty = tgtSubWithoutDltL.sum(Chk01_RsltR.$trd_unit_qty);
				}

				for (Chk01_RsltR tgtSubR : tgtSubL) {
					if (!isSame(oldshipSchdLR.trd_unit_qty(), shipSchdQty)) {
						if (tgtSubR.isStatusCreate() || tgtSubR.isStatusModify()) {
							msgL.add(new MCMessage(tgtSubR, null, MSBEL1070,
									oldshipSchdLR.sls_act_d_no(), tgtSubR.ship_schd_no(),
									oldshipSchdLR.trd_unit_qty(), shipSchdQty));
							tgtSubR.err_flg(true);
						}
						if (tgtSubR.isStatusDelete()) {
							msgL.add(new MCMessage(tgtSubR, null, MSBEL1071,
									tgtSubR.ship_schd_no()));
							tgtSubR.err_flg(true);
						}
					}
				}
			}
			
			return msgL;
		}

		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			setGrpErrFlgCmm(up0());
			// 引当状況モード
			if (isSame(up1().srch_mode(),"1")) {
				setGrpErrFlgShipSchd(up0());
			}
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行後に行うべきデータの補正
		 */
		protected void crrctDataAfterDoServerChk(MCList<Chk01_RsltR> notErrL) {
			for (Chk01_RsltR r : notErrL) {
				if (isNull(r.str_ln_cd())) {
					r.str_ln_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}

		/**
		 * チェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			// ロット逆転チェック
			chkLotInv();
			// ロットチェック
			callLotChk03();
			// 出荷予定サービスチェック処理
			callShipSchdChk02(up0());

			return msgL;
		}

		/**
		 * ロット逆転チェック
		 */
		protected void chkLotInv() {
			if (up1().no_lot_chk_flg()) {
				return;
			}
			MCList<Chk01_RsltR> noErrL = getChkList(up0(), MCRow.CREATE, MCRow.MODIFY);
			chkLotInvCmn(noErrL);
		}
		/**
		 * ロット逆転チェック
		 */
		protected void chkLotInvCmn(MCList<Chk01_RsltR> noErrL) {
			MSBEL_ShipLotChkService.ShipLotChk_Chk01 o = MSBEL_ShipLotChkService.crtShipLotChk_Chk01();
			for (Chk01_RsltR up1R : noErrL) {
				MST_SHIP_SCHD_R ssR = getShipSchdR(up1R.ship_schd_no());
				String trdPtnTyp = ssR.getString("trd_ptn_typ");
				if ((MAC_TRD_PTN_TYP.isSLS(trdPtnTyp)
						|| MAC_TRD_PTN_TYP.isSHIP(trdPtnTyp))
						&& !isNullOrNullVal(up1R.lot_no())) {
					ShipLot_DtlR r = ShipLot_DtlR.create();
					copy(r, up1R, createMap_ShipLot_DtlR_Chk01_RsltR());

					r.cst_cd(up1R.cst_cd());
					r.dlv_cd(up1R.dlv_id_cd());
					r.base_dt(nvl(up1R.dlv_schd_tm(), ssR.dlv_schd_tm()));
					if (!isNull(r.base_dt())) {
						r.base_dt(r.base_dt().trunc(MCDateFieldType.DAY));
					}
					o.up0().add(r);
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
				copyErrFlg(noErrL, o.down0());
			}
		}

		protected void callLotChk03() {
			MCList<Chk01_RsltR> noErrL = getChkList(up0().subList(r -> !isNullOrNullVal(r.lot_no())), MCRow.CREATE, MCRow.MODIFY);
			if (noErrL.isEmpty()) return;

			MSBFL_LotService.Lot_Chk03 o = MSBFL_LotService.crtLot_Chk03();
			setAll(o.up0(), noErrL, createMap_Lot_Chk03_CndR_Chk01_RsltR());
			o.exec();
			copyErrFlg(noErrL, o.down0());
		}

		protected Map_Lot_Chk03_CndR_Chk01_RsltR<Lot_Chk03_CndR,Chk01_RsltR> createMap_Lot_Chk03_CndR_Chk01_RsltR() {
			return new Map_Lot_Chk03_CndR_Chk01_RsltR<Lot_Chk03_CndR, Chk01_RsltR>();
		}
		public class Map_Lot_Chk03_CndR_Chk01_RsltR<D extends Lot_Chk03_CndR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$ver_no, Chk01_RsltR.$ver_no);
			}
		}

		/**
		 * 出荷予定サービスチェック処理
		 */
		protected void callShipSchdChk02(MCList<Chk01_RsltR> list) {
			MCList<Chk01_RsltR> noErrL = getChkList(list);
			MSBEL_ShipSchdService.ShipSchd_Chk02 o = MSBEL_ShipSchdService.crtShipSchd_Chk02();
			o.up0().addAll(setCnd_ShipSchd_ShipSchd_DtlR(noErrL));
			o.exec();

			MCIndexKey k = noErrL.createIndex("tmp_ship_schd_no");
			for (int i = 0; i < o.down0().size(); i++)  {
				MCRow srcRow = o.down0().get(i);
				if (!srcRow.getBoolean("err_flg")) {
					continue;
				}
				MCList<Chk01_RsltR> destSub = noErrL.subList(k, srcRow.getNumber("peg_no"));
				for (int j = 0; j < destSub.size(); j++)  {
					MCRow destRow = destSub.get(j);
					copyErrFlg(destRow, srcRow);
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 出荷予定を更新する。<br>
	 */
	public class Upd01 extends MSBEL_ShipSchdReg_MC_A.Upd01 {
		protected MCList<Chk01_RsltR> _up0_bak;
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
			initVar();
			editUp();
			doCache();
			editUpForAlloc();
			doCache2();
			editUpForSplitSchd();
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				updMain(notErrL, up1());
			}
		}
		
		/**
		 * 初期処理
		 */
		protected void initVar() {
			_up0_bak = up0().createInstance();
			_allocRsltL.init();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
			initShipSchdCache(up0());

			// キャッシュ用補完
			for (Chk01_RsltR r : up0()) {
				MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
				r.itm_cd(ssR.itm_cd());
				r.itm_sub1(ssR.itm_sub1());
				r.itm_sub2(ssR.itm_sub2());
				r.itm_sub3(ssR.itm_sub3());
				r.trd_unit_cd(ssR.trd_unit_cd());
				r.base_unit_cd(ssR.base_unit_cd());
				r.ship_fr_lg_grp_cd(ssR.ship_fr_lg_grp_cd());
				r.ship_to_lg_grp_cd(ssR.getString("ship_to_lg_grp_cd"));
				r.cst_cd(ssR.getString("cst_cd"));
				r.dlv_id_cd(ssR.getString("dlv_id_cd"));
				r.alloc_grp_cd(ssR.getString("alloc_grp_cd"));
				r.dlv_lg_grp_cd(ssR.getString("dlv_lg_grp_cd"));
				
				if (r.str_ln_cd_none_flg()) {
					r.str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				if (isSame(up1().srch_mode(),"1")) {
					if (!r.str_ln_cd_none_flg() && isNull(r.str_ln_cd())) {
						r.addBooleanColumn("no_str_ln", true);
					}
				}
				
				if (r.alloc_flg()) {
					r.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
				}
				else if (r.grp_alloc_flg()) {
					r.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.ALLOC_GRP.value());
				}
			}
		}

		
		/**
		 * 上り電文の編集（引当状況対応）
		 */
		protected void editUpForAlloc() {
			if (isSame(up1().srch_mode(),"1")) {
				_up0_bak = up0().clone();
				
				MCList<Chk01_RsltR>[] gl = up0().groupList(Chk01_RsltR.$ship_schd_no);
				for (MCList<Chk01_RsltR> l : gl) {
					MCList<MST_SHIP_ALLOC_STS_R> stsL = getShipAllocStsL(l.get(0).ship_schd_no());
					if (!isNull(stsL)) {
						stsL = stsL.subList(r -> hasNotUp(r));
						for (MST_SHIP_ALLOC_STS_R stsR : stsL) {
							Chk01_RsltR newR = l.get(0).clone();
							copyValue(newR, stsR, createMap_Chk01_RsltR_MST_SHIP_ALLOC_STS_R());
							if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(newR.alloc_scope_typ())) {
								newR.grp_alloc_flg(newR.alloc_flg());
								newR.alloc_flg(false);
							}
							up0().add(newR);
						}
					}
				}
				for(Chk01_RsltR r : up0()) {
					if (!isNull(r.ship_alloc_sts_no())) {
						MST_SHIP_ALLOC_STS_R stsR = getShipAllocStsR(r.ship_alloc_sts_no());
						if (!isNull(stsR)) {
							r.sas_alloc_flg(stsR.alloc_flg());
						}
					}
				}
				up0().sort(Chk01_RsltR.$ship_schd_no, Chk01_RsltR.$ship_alloc_sts_no);
				up0().setColumnValueNE("org_peg_no", Chk01_RsltR.$peg_no);
				up0().addBooleanColumn("iv_chk_skip_flg", true);
				setPegNo(up0());
			}
		}
		
		/**
		 * 出荷引当状況ＮＯが上り電文に含まれないかどうか
		 */
		protected boolean hasNotUp(MST_SHIP_ALLOC_STS_R r) {
			return isNull(up0().getFirst(Chk01_RsltR.$ship_alloc_sts_no, r.ship_alloc_sts_no()));
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
			initShipAllocStsCache(up0());
			initLgCtlCache(up0());
			initBpCache(up0());
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache2() {
			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
			for (Chk01_RsltR r : up0().groupBy(Chk01_RsltR.$itm_cd,
					Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3, Chk01_RsltR.$trd_unit_cd,
					Chk01_RsltR.$base_unit_cd)) {

				MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
				itmUnitR.itm_cd(r.itm_cd());
				itmUnitR.itm_sub1(r.itm_sub1());
				itmUnitR.itm_sub2(r.itm_sub2());
				itmUnitR.itm_sub3(r.itm_sub3());
				itmUnitR.unit_cd(r.trd_unit_cd());
				itmUnitL.add(itmUnitR);

				if (!isSame(r.trd_unit_cd(), r.base_unit_cd())) {
					MAVM_ITM_UNIT_R itmUnitR2 = itmUnitR.clone();
					itmUnitR2.unit_cd(r.base_unit_cd());
					itmUnitL.add(itmUnitR2);
				}
			}
			if (!isNull(up0().get(0).alloc_ent_unit_cd())) {
				for (Chk01_RsltR r : up0().groupBy(Chk01_RsltR.$itm_cd,
						Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
						Chk01_RsltR.$itm_sub3, Chk01_RsltR.$alloc_ent_unit_cd)) {

					MAVM_ITM_UNIT_R itmUnitR = MAVM_ITM_UNIT_R.create();
					itmUnitR.itm_cd(r.itm_cd());
					itmUnitR.itm_sub1(r.itm_sub1());
					itmUnitR.itm_sub2(r.itm_sub2());
					itmUnitR.itm_sub3(r.itm_sub3());
					itmUnitR.unit_cd(r.alloc_ent_unit_cd());
					itmUnitL.add(itmUnitR);

				}
			}
			initItmUnitCache(itmUnitL.groupBy(MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd));
		}
		
		/**
		 * 上り電文の編集（出荷予定分割対応）
		 */
		protected void editUpForSplitSchd() {
			if (isSame(up1().srch_mode(),"0")) {
				_up0_bak = up0().clone();
				MCList<Chk01_RsltR> up = MCList.create(Chk01_RsltR.class);
				
				MCList<Chk01_RsltR>[] gl = up0().groupList(Chk01_RsltR.$ship_schd_no);
				for (MCList<Chk01_RsltR> l : gl) {
					l.setNumberNE("sum_qty", l.sum(Chk01_RsltR.$trd_unit_qty));
					MCList<MST_SHIP_ALLOC_STS_R> stsL = getShipAllocStsL(l.get(0).ship_schd_no());
					if (isNull(stsL)) {
						int i = 0;
						while (true) {
							Chk01_RsltR newR = l.get(i).clone();
							newR.addBooleanColumn("chkUpTgt", true);
							// 打切り解除対応
							newR.alloc_ent_unit_qty(newR.trd_unit_qty());
							newR.alloc_ent_unit_cd(newR.trd_unit_cd());
							newR.alloc_base_unit_qty(newR.base_unit_qty());
							up.add(newR);
							i++;
							if (i >= l.size()) {
								break;
							}
						}
					}
					else {
						int i = 0, j = 0;
						int tgtRowNum = i;
						int cloneCnt = 0;
						MCNumber schd_qty = l.get(i).base_unit_qty();
						MCNumber alloc_qty = stsL.get(j).base_unit_qty();
						while (true) {
							Chk01_RsltR newR = l.get(i).clone();
							newR.addBooleanColumn("chkUpTgt", true);
							if (tgtRowNum != i) {
								tgtRowNum = i;
								cloneCnt = 0;
							}
							else if (cloneCnt > 0) {
								newR.setBoolean("chkUpTgt", false);
							}
							cloneCnt++;
							copyValue(newR, stsL.get(j), createMap_Chk01_RsltR_MST_SHIP_ALLOC_STS_R());
							if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(newR.alloc_scope_typ())) {
								newR.grp_alloc_flg(newR.alloc_flg());
								newR.alloc_flg(false);
							}
							if (isNullOrNullVal(newR.lot_no()) && isNullOrNullVal(newR.sublot_no())) {
								newR.lot_none_flg(true);
							}
							else {
								newR.lot_none_flg(false);
							}
							if (i != 0) {
								newR.setBooleanNE("add", true);
								newR.setNumberNE("add_num", i);
							}
							MAVM_ITM_UNIT_R unitR = getItmUnitR(newR.itm_cd(), newR.itm_sub1(), newR.itm_sub2(), newR.itm_sub3(), newR.alloc_ent_unit_cd());
							MAVM_ITM_UNIT_R baseUnitR = getItmUnitR(newR.itm_cd(), newR.itm_sub1(), newR.itm_sub2(), newR.itm_sub3(), newR.base_unit_cd());

							MCNumber base_q = schd_qty.gt(alloc_qty) ? alloc_qty : schd_qty;
							newR.alloc_base_unit_qty(base_q);
							MCNumber ent_q = rvrsBaseUnitConv(newR.alloc_base_unit_qty(), unitR.conv_base_qty(), unitR.conv_qty(), unitR.dec_place(), unitR.rnd_typ());
							
							MCNumber re_ent_q = convToBaseUnit(ent_q, unitR.conv_base_qty(), unitR.conv_qty(), baseUnitR.dec_place(), baseUnitR.rnd_typ());
							if (!isSame(re_ent_q, newR.alloc_base_unit_qty())) {
								newR.alloc_ent_unit_qty(newR.alloc_base_unit_qty());
								newR.alloc_ent_unit_cd(newR.base_unit_cd());
							}
							else {
								newR.alloc_ent_unit_qty(ent_q);
							}
							up.add(newR);

							if (schd_qty.gt(alloc_qty)) {
								schd_qty = schd_qty.subtract(alloc_qty);
								j++;
								if (j >= stsL.size()) {
									alloc_qty = schd_qty;
									j--;
								}
								else {
									alloc_qty = stsL.get(j).base_unit_qty();
								}
							}
							else if (schd_qty.lt(alloc_qty)) {
								alloc_qty = alloc_qty.subtract(schd_qty);
								i++;
								if (i >= l.size()) {
									break;
								}
								else {
									schd_qty = l.get(i).base_unit_qty();
								}
							}
							else {
								i++;
								if (i >= l.size()) {
									break;
								}
								schd_qty = l.get(i).base_unit_qty();
								j++;
								if (j >= stsL.size()) {
									alloc_qty = schd_qty;
									j--;
								}
								else {
									alloc_qty = stsL.get(j).base_unit_qty();
								}
							}
						}
					}
				}
				MCList<Chk01_RsltR> tmpUp = createChk01_RsltL();
				tmpUp.setAll(up);
				up.clear();
				for (MCList<Chk01_RsltR> l : tmpUp.groupList(Chk01_RsltR.$ship_schd_no)) {
					Chk01_RsltR r = l.get(0);
					MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
					if (r.base_unit_qty().gt(ssR.base_unit_qty())) {
						// まとめ先の出荷引当状況は出荷予定と同じ単位、数量で作成する
						// 上で複数件引当状況が作成されるが、この時は一つにまとめて作成する
						r.alloc_ent_unit_qty(r.trd_unit_qty());
						r.alloc_ent_unit_cd(r.trd_unit_cd());
						r.alloc_base_unit_qty(r.base_unit_qty());
						up.addAll(addChkUpL(l));
					}
					else {
						up.addAll(l);
					}
				}
				up0().setAll(up);
				up0().setColumnValueNE("org_peg_no", Chk01_RsltR.$peg_no);
				setPegNo(up0());
			}
		}
		protected MCList<Chk01_RsltR> addChkUpL(MCList<Chk01_RsltR> addChkTgtL) {
			return addChkTgtL.subList("chkUpTgt", true);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_ShipSchdReg.Chk01 ope = MSBEL_ShipSchdReg.crtChk01();
			ope.up0().setAll(up0());
			MCRow.copyvalue(ope.up1(), up1());
			ope.exec();
			up0().setAll(ope.down0());
			
			for (Chk01_RsltR r : up0()) {
				if (r.getBooleanNE("no_str_ln")) {
					r.str_ln_cd(null);
				}
			}
		}

		/**
		 * 
		 * @param notErrL
		 */
		protected void updMain(MCList<Chk01_RsltR> notErrL, Srch01_CndR up1) {
			// 引当対象レコードの処理
			MCList<Chk01_RsltR> allocL = MCList.create(Chk01_RsltR.class);
			MCList<Chk01_RsltR> delL = MCList.create(Chk01_RsltR.class);
			for (MCList<Chk01_RsltR> notErrGrpL : notErrL.groupList(Chk01_RsltR.$ship_schd_no)) {
				MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
				boolean allocFlg = false;
				for (Chk01_RsltR r : notErrGrpL) {
					if (r.alloc_flg() || r.grp_alloc_flg()) {
						// 引当状況モード
						if (isSame(up1.srch_mode(),"1")) {
							if (!r.alloc_ent_unit_qty().isZero()) {
								allocL.add(r);
							}
							else {
								delL.add(r);
							}
						}
						// 出荷予定モード
						else {
							tmp.add(r);
							MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
							if (!isSame(r.ship_schd_tm(), ssR.ship_schd_tm())
								|| !isSame(r.dlv_schd_tm(), ssR.dlv_schd_tm())
								|| !isSame(r.base_unit_qty(), ssR.base_unit_qty())
								|| r.isStatusCreate()) {
								allocFlg = true;
							}
						}
					}
				}
				if (allocFlg) {
					allocL.addAll(tmp.subList(allocR-> !allocR.isStatusDelete()));
					delL.addAll(tmp.subList(allocR-> allocR.isStatusDelete()));
				}
			}
			if (allocL.size() != 0) {
				cmpLotNoneFlg(allocL);
				// ロックはまとめて取得
				callAllocLockUpd01(allocL);
				
				callAllocSrch01(allocL, up1, delL);
				for (Chk01_RsltR r : allocL) {
					chkAlloc(r);
				}
				
				chkNotLotMix(notErrL, allocL.subList(Chk01_RsltR.$err_flg, false));
				
				MCList<Chk01_RsltR> updL = createChk01_RsltL();
				// 引当状況モードの場合は出荷予定ＮＯ、出荷予定モードの場合は出荷進捗ＮＯの単位でエラーを除外する
				String noCol = isSame(up1.srch_mode(),"1") ? Chk01_RsltR.$ship_schd_no : Chk01_RsltR.$ship_pr_no;
				MCIndexKey idx = notErrL.createIndex(noCol, Chk01_RsltR.$err_flg);
				for (MCList<Chk01_RsltR> lst : notErrL.groupList(noCol)) {
					if (!isNull(notErrL.getFirst(idx, lst.get(0).getString(noCol), true))) {
						lst.forEach(r -> {
							r.err_flg(true);
							r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
						});
					}
					else {
						updL.addAll(lst);
					}
				}
				if (!updL.isEmpty()) {
					callShipSchdUpd02(updL);
					procByTrnPtn(updL);
				}
				
			}
			// 引当対象がない場合はまとめて処理
			else {
				callShipSchdUpd02(notErrL);
				procByTrnPtn(notErrL);
			}
		}
		
		protected void cmpLotNoneFlg(MCList<Chk01_RsltR> allocL) {
			MCList<Chk01_RsltR> notLotMixL = allocL.subList(r -> (r.not_lot_mix_flg() || r.not_sublot_mix_flg()) && r.lot_none_flg());
			if (isNull(notLotMixL)) {
				return;
			}
			boolean mfgAllocNotLotFixFlg = isSame(getSysParm("MFG_ALLOC_NOT_LOT_FIX_FLG"), "1");
			boolean sloAllocNotLotFixFlg = isSame(getSysParm("SLO_ALLOC_NOT_LOT_FIX_FLG"), "1");
			
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create("SHIP_PR");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(shipPr);
			MST_XFR_SCHD_R xfrSchd = MST_XFR_SCHD_R.create("XFR_SCHD");
			xfrSchdL.addStringColumn(MST_SHIP_PR_R.$ship_pr_no);
			dbc_bldr.setSelect(shipPr.ship_pr_no,
					xfrSchd.xfr_src_typ,
					xfrSchd.slo_d_no,
					xfrSchd.inpt_schd_no);
			dbc_bldr.addInnerJoin(xfrSchd, bracket(xfrSchd.xfr_schd_no.eq(shipPr.xfr_schd_no)));
			dbSelectKey("MSBEL1420_MST_SHIP_PR_S02",
					xfrSchdL, dbc_bldr, notLotMixL.groupBy(Chk01_RsltR.$ship_pr_no));
			
			MCIndexKey xfrSchdIdx = xfrSchdL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			for (Chk01_RsltR allocR : notLotMixL) {
				MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdIdx, allocR.ship_pr_no());
				if (isNull(xfrSchdR)) {
					continue;
				}
				if (!mfgAllocNotLotFixFlg && isSrcInpt(xfrSchdR)) {
					allocR.lot_none_flg(false);
				}
				else if (!sloAllocNotLotFixFlg && isSrcSlo(xfrSchdR)) {
					allocR.lot_none_flg(false);
				}
			}
		}
		protected boolean isSrcInpt(MST_XFR_SCHD_R xfrSchdR) {
			return MSC_XFR_SRC_TYP.isINPT(xfrSchdR.xfr_src_typ()) || MSC_XFR_SRC_TYP.isINPT_RPL(xfrSchdR.xfr_src_typ());
		}
		protected boolean isSrcSlo(MST_XFR_SCHD_R xfrSchdR) {
			return !isNull(xfrSchdR.slo_d_no()) || MSC_XFR_SRC_TYP.isSHIP_RPL(xfrSchdR.xfr_src_typ());
		}

		/**
		 * 全数引当できたかどうかチェックする
		 * @param r
		 */
		protected void chkAlloc(Chk01_RsltR r) {
			MCMessage msg = isSame(up1().srch_mode(),"1")
				? new MCMessage(r, null, MSBEL0197, toDispGUIIndex(r))
				: new MCMessage(r, null, MSBEL0347, toDispGUIIndex(r));
			MCList<Srch_RsltR> rsltL = _allocRsltL.subList(Srch_RsltR.$peg_no, r.peg_no());
			if (isNull(rsltL)) {
				MCMessagePool.add(msg);
				r.err_flg(true);
			}
			else {
				MCNumber allocQty = rsltL.sum(Srch_RsltR.$base_unit_qty);
				if (r.alloc_base_unit_qty().neq(allocQty)) {
					MCMessagePool.add(msg);
					r.err_flg(true);
				}
			}
		}

		/**
		 * ロット・サブロット混在不可チェック
		 */
		protected void chkNotLotMix(MCList<Chk01_RsltR> notErrL,
				MCList<Chk01_RsltR> notAllocL) {
			// 引当後に行う必要があるチェックのため、ChkオペレーションではなくUpdオペレーションで行う
			// 同一受注明細、出荷予定の同一品目でロット・サブロットの混在をチェックするためのindexKey
			MCIndexKey lotMixIdxKey = notAllocL.createIndex(
					Chk01_RsltR.$slo_d_no,
					Chk01_RsltR.$ship_schd_no,
					Chk01_RsltR.$itm_cd,
					Chk01_RsltR.$itm_sub1,
					Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3);
			
			for (Chk01_RsltR r : notErrL) {
				String dispItm = toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				String dispGUIIndex = toDispGUIIndex(r);
				
				MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
				String trdPtnTyp = ssR.getString("trd_ptn_typ");
				
				if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp) || MAC_TRD_PTN_TYP.isSHIP(trdPtnTyp)) {
					MCList<Chk01_RsltR> subL = notAllocL.subList(
							lotMixIdxKey, r.slo_d_no(), r.ship_schd_no(), r.itm_cd(), r.itm_sub1(),
							r.itm_sub2(), r.itm_sub3());
					MAM_ITM_R itmR = getItmR(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					// ロット、サブロット混在（同一受注明細ＮＯ、出荷予定ＮＯ単位の同一品目）
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
						if (r.not_lot_mix_flg()) {
							for (Chk01_RsltR subR : subL) {
								if (isNullOr(r.lot_no(), subR.lot_no())) {
									continue;
								}
								if (!isSame(r.lot_no(), subR.lot_no())) {
									MCMessagePool.add(new MCMessage(r, null, MSBEL1201, dispItm, dispGUIIndex));
									r.err_flg(true);
									break;
								}
							}
						}
						if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ()) && r.not_sublot_mix_flg()) {
							for (Chk01_RsltR subR : subL) {
								if (isNullOr(r.lot_no(), subR.lot_no(), r.sublot_no(), subR.sublot_no())) {
									continue;
								}

								if (isSame(r.lot_no(), subR.lot_no())
										&& !isSame(r.sublot_no(), subR.sublot_no())) {
									MCMessagePool.add(new MCMessage(r, null, MSBEL1202, dispItm, dispGUIIndex));
									r.err_flg(true);
									break;
								}
							}
						}
					}
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			if (!_up0_bak.isEmpty()) {
				for (Chk01_RsltR r : _up0_bak) {
					Chk01_RsltR selectR = up0().getFirst("org_peg_no", r.peg_no());
					down0().add(selectR);
				}
			}
			else {
				down0().setAll(up0());
			}	
			for (Chk01_RsltR r : down0()) {
				r.fix_ship_schd_dt(r.ship_schd_tm());
				r.fix_ship_schd_hm(r.ship_schd_tm());
				r.fix_dlv_schd_dt(r.dlv_schd_tm());
				r.fix_dlv_schd_hm(r.dlv_schd_tm());
			}
			setAllocStsTyp();
			doCompTime(down0(), false);
		}

		protected void setAllocStsTyp() {
			MCList<Chk01_RsltR> notErrL = getChkList(down0());
			if (!isSame(up1().srch_mode(),"0") || notErrL.isEmpty()) {
				// 出荷予定モード以外は対象外
				return;
			}
			MCList<MST_SHIP_SCHD_R> dbc = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			dbc.addStringColumn("alloc_typ");
			dbc_bldr.setSelect(t.ship_schd_no,
					t.base_unit_qty,
					t.alloc_qty,
					t1.xfr_schd_no,
					t1.alloc_typ);
			dbc_bldr.addInnerJoin(t1, bracket( t1.ship_pr_no.eq(t.ship_pr_no)));
			dbSelectKey("MSBEL1420_MST_SHIP_SCHD_S02",
					dbc, dbc_bldr, notErrL.groupBy(Chk01_RsltR.$ship_schd_no));

			MCIndexKey idx = dbc.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			for (Chk01_RsltR r : notErrL) {
				MST_SHIP_SCHD_R ssR = dbc.getFirst(idx, r.ship_schd_no());
				if (isNull(ssR)) {
					r.alloc_sts_typ(null);
					continue;
				}
				r.alloc_sts_typ(getAllocStsTyp(ssR.getString("alloc_typ"), 
						ssR.base_unit_qty(), ssR.alloc_qty(), ssR.getString("xfr_schd_no")));
			}
			setConstNm(notErrL);
		}

		/**
		 * 引当ロックサービス呼び出し
		 */
		protected void callAllocLockUpd01(MCList<Chk01_RsltR> list) {
			if (list.isEmpty()) return ;
			MSBEL_AllocMngService.Alloc_Lock_Upd01 o = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			setAll(o.up0(), list, createMap_MSW_ALLOC_LOC_MAP_R_Chk01_RsltR());
			o.exec();
		}
		protected Map_MSW_ALLOC_LOC_MAP_R_Chk01_RsltR<MSW_ALLOC_LOC_MAP_R,Chk01_RsltR> createMap_MSW_ALLOC_LOC_MAP_R_Chk01_RsltR() {
			return new Map_MSW_ALLOC_LOC_MAP_R_Chk01_RsltR<MSW_ALLOC_LOC_MAP_R, Chk01_RsltR>();
		}
		public class Map_MSW_ALLOC_LOC_MAP_R_Chk01_RsltR<D extends MSW_ALLOC_LOC_MAP_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_loc_cd, Chk01_RsltR.$loc_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$gi_str_ln_cd, Chk01_RsltR.$str_ln_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				MST_SHIP_SCHD_R ssR = getShipSchdR(src.ship_schd_no());
				dest.itm_cd(ssR.itm_cd());
				dest.itm_sub1(ssR.itm_sub1());
				dest.itm_sub2(ssR.itm_sub2());
				dest.itm_sub3(ssR.itm_sub3());
				dest.gi_lg_grp_cd(ssR.ship_fr_lg_grp_cd());
				dest.alloc_grp_cd(ssR.getString("alloc_grp_cd"));
			}
		}

		/**
		 * 出荷予定更新サービス呼び出し
		 */
		protected void callShipSchdUpd02(MCList<Chk01_RsltR> list) {
			MSBEL_ShipSchdService.ShipSchd_Upd02 o = MSBEL_ShipSchdService.crtShipSchd_Upd02();
			o.up0().lot_chk_flg(!up1().no_lot_chk_flg());

			o.up1().addAll(setCnd_ShipSchd_ShipSchd_DtlR(list));

			o.up2().addAll(setChk01_RsltR_Alloc_RsltR(list, up1()));

			o.exec();
		}


		/**
		 * 取引パタン別データ更新
		 */
		protected void procByTrnPtn(MCList<Chk01_RsltR> list) {
			// 売上
			procForSales(list);
		}

		/**
		 * 取引パタン：売上の処理
		 */
		protected void procForSales(MCList<Chk01_RsltR> list) {
			MSBBL_SloStsRegService.SloSts_Ins01 o1 = MSBBL_SloStsRegService.crtSloSts_Ins01();
			MCList<SloSts_DtlR> slostsL = MCList.create(SloSts_DtlR.class);

			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setSelect(t.ship_schd_no, t.alloc_qty, t.abort_qty);
			dbSelectKey("MSBEL1420_MST_SHIP_SCHD_S03",
					schdL, schdL_bldr, list);
			MCIndexKey
				ssIdx = schdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no),
				pegIdx = _allocRsltL.createIndex(Srch_RsltR.$peg_no);

			MCGroupByPolicy gp = new MCGroupByPolicy(Srch_RsltR.$pack_unit_cd);
			gp.sum(Srch_RsltR.$pack_unit_qty);

			for (MCList<Chk01_RsltR> allocL : list.groupList(Chk01_RsltR.$ship_schd_no)) {
				Chk01_RsltR r = allocL.get(0);

				MST_SHIP_SCHD_R
					ssR = getShipSchdR(r.ship_schd_no()),
					newR = schdL.getFirst(ssIdx,  r.ship_schd_no());
				MAVM_ITM_UNIT_R unitR = getItmUnitR(ssR.itm_cd(), ssR.itm_sub1(), ssR.itm_sub2(), ssR.itm_sub3(), ssR.trd_unit_cd());
				MAVM_ITM_UNIT_R baseUnitR = getItmUnitR(ssR.itm_cd(), ssR.itm_sub1(), ssR.itm_sub2(), ssR.itm_sub3(), ssR.base_unit_cd());
				String trdPtnTyp = ssR.getString("trd_ptn_typ");

				if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp) || MAC_TRD_PTN_TYP.isSHIP(trdPtnTyp)) {

					SloSts_DtlR row = SloSts_DtlR.create();
					row.slo_d_no(ssR.getString("slo_d_no"));

					if (r.abort_flg() && !isNull(newR)) {
						row.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_SCHD_ABORT.value());
						row.qty(newR.abort_qty());	// 打ち切った数量
					}
					else if (ssR.abort_flg()) {
						row.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_SCHD_ABORT_CAN.value());
						row.qty(ssR.abort_qty());	// 打ち切りを解除した数量
					}
					if (!isNull(row.slo_sts_typ())) {
						MCNumber qty = 
							rvrsBaseUnitConv(
								row.qty(), unitR.conv_base_qty(), unitR.conv_qty(),
								unitR.dec_place(), unitR.rnd_typ());
								
						MCNumber reQty = convToBaseUnit(qty, unitR.conv_base_qty(),
								unitR.conv_qty(), baseUnitR.dec_place(),
								baseUnitR.rnd_typ());
						if(isSame(reQty, row.qty())) {
							row.qty(qty);
							row.unit_cd(ssR.trd_unit_cd());
						}
						else {
							row.unit_cd(ssR.base_unit_cd());
						}
						slostsL.add(row);
					}
					else {
						boolean alloc = false;
						for (Chk01_RsltR allocR : allocL) {
							MCList<Srch_RsltR> rsltL = _allocRsltL.subList(pegIdx, allocR.peg_no());
							if (!rsltL.isEmpty()) {
								for(Srch_RsltR rsltR : rsltL.groupBy(gp)) {
									SloSts_DtlR tmpR = row.clone();
									tmpR.slo_sts_typ(MSC_SLO_STS_TYP.ALLOC.value());
									tmpR.loc_cd(allocR.loc_cd());
									tmpR.ship_lg_grp_cd(allocR.ship_fr_lg_grp_cd());
									tmpR.alloc_grp_cd(allocR.alloc_grp_cd());
									tmpR.unit_cd(rsltR.pack_unit_cd());
									tmpR.qty(rsltR.pack_unit_qty());
									slostsL.add(tmpR);
								}
								alloc = true;
							}
						}
						if (!alloc) {
							row.slo_sts_typ(MSC_SLO_STS_TYP.SHIP_SCHD_UPD.value());
							slostsL.add(row);
						}
					}
				}
			}
			if (!slostsL.isEmpty()) {
				o1.up0().setAll(slostsL.groupBy(groupByForSloSts()));
				o1.exec();
			}
		}

		/**
		 * GroupByPolicy
		 */
		protected MCGroupByPolicy groupByForSloSts() {
			MCGroupByPolicy gp = new MCGroupByPolicy(
					SloSts_DtlR.$slo_d_no,
					SloSts_DtlR.$slo_sts_typ,
					SloSts_DtlR.$unit_cd,
					SloSts_DtlR.$loc_cd,
					SloSts_DtlR.$ship_lg_grp_cd,
					SloSts_DtlR.$alloc_grp_cd
					);
			gp.sum(SloSts_DtlR.$qty);
			return gp;
		}

		// 分割実行関連処理。以下のメソッドを実装することで、Frameworkが自動で上り電文を分割して、オペレーションをexecしてくれる
		@Override
		protected void initThreadExec() {
			super.initThreadExec();

			initLocCache(up0());

			for (MCList<Chk01_RsltR> lst : up0().groupList(Chk01_RsltR.$ship_pr_no)) {
				lst.sort(Chk01_RsltR.$loc_cd);
				Chk01_RsltR r = lst.get(0);

				MAM_LOC_R locR = getLocR(r.loc_cd());
				lst.forEach(rr -> {
					// 出荷進捗ＮＯが同じ予定は同一のスレッドで実行させるため、キーに同値を設定する
					rr.loc_split_key(nvl(locR.alloc_grp_cd(), nvl(locR.lg_grp_cd(), r.loc_cd())));
				});
			}
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
				Srch01_CndR up1R = (Srch01_CndR)ope.up(1);
				MCRow.copyvalue(up1R, up1());
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}

	/**
	 * 引当状況区分を取得する
	 * 
	 * @param alloc_typ
	 * @param base_unit_qty
	 * @param alloc_qty
	 * @param xfr_schd_no
	 * @return 引当状況区分
	 */
	protected String getAllocStsTyp (String alloc_typ, MCNumber base_unit_qty, MCNumber alloc_qty, String xfr_schd_no) {

		if (!isNull(xfr_schd_no)) {
			if(isNull(alloc_typ)) {
				return MSC_ALLOC_STS_TYP.NON.value();
			}
			else if (base_unit_qty.lte(alloc_qty)) {
				return MSC_ALLOC_STS_TYP.ALL_ALLOC.value();
			}
			else if (base_unit_qty.gt(alloc_qty) && alloc_qty.isPositive()) {
				return MSC_ALLOC_STS_TYP.PART_ALLOC.value();
			}
			else {
				return MSC_ALLOC_STS_TYP.NOT_ALLOC.value();
			}
		}
		else {
			return MSUCL_SlsUtil.getAllocStsTyp(alloc_typ, 
					base_unit_qty, alloc_qty, null, false);
		}
	}

	/**
	 * 品目・場所が同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
		List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
		MCList<Chk01_RsltR>[] grpL = list.groupList(
				Chk01_RsltR.$itm_cd,
				Chk01_RsltR.$itm_sub1,
				Chk01_RsltR.$itm_sub2,
				Chk01_RsltR.$itm_sub3,
				Chk01_RsltR.$loc_split_key);
		MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
		for (MCList<Chk01_RsltR> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Chk01_RsltR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}

	/**
	  * 品目・場所が同一行で1つでもerr_flgがオンの行があれば、全てオンにする
	  * @param list チェック後のリスト
	  * @return
	  */
	protected void setGrpErrFlgCmm(MCList<Chk01_RsltR> list) {
		list.forEach(r -> {
			MAM_LOC_R locR = getLocR(r.loc_cd());
			r.loc_split_key(nvl(locR.alloc_grp_cd(), nvl(locR.lg_grp_cd(), r.loc_cd())));
		});
		MCList<Chk01_RsltR>[] grpL = list.groupList(
				Chk01_RsltR.$itm_cd,
				Chk01_RsltR.$itm_sub1,
				Chk01_RsltR.$itm_sub2,
				Chk01_RsltR.$itm_sub3,
				Chk01_RsltR.$loc_split_key);
		for (MCList<Chk01_RsltR> grp : grpL) {
			boolean err_flg = false;
			for (Chk01_RsltR r : grp) {
				if (r.err_flg()) {
					err_flg = true;
					break;
				}
			}
			if (err_flg) {
				grp.setBoolean(Chk01_RsltR.$err_flg, true);
			}
		}
	}
	
	/**
	  * 出荷予定ＮＯが同一行で1つでもerr_flgがオンの行があれば、全てオンにする
	  * @param list チェック後のリスト
	  * @return
	  */
	protected void setGrpErrFlgShipSchd(MCList<Chk01_RsltR> list) {
		MCList<Chk01_RsltR>[] grpL = list.groupList(
				Chk01_RsltR.$ship_schd_no);
		for (MCList<Chk01_RsltR> grp : grpL) {
			boolean err_flg = false;
			for (Chk01_RsltR r : grp) {
				if (r.err_flg()) {
					err_flg = true;
					break;
				}
			}
			if (err_flg) {
				grp.setBoolean(Chk01_RsltR.$err_flg, true);
			}
		}
	}
		
	protected void handleSuccess(MCList<Chk01_RsltR> l) {
		dbTran().commit();
		for (Chk01_RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleEx(Exception e,
			MCList<Chk01_RsltR> l) {
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
		for (Chk01_RsltR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}


	// ///////////////////////////////////////////////
	// サービス呼び出し共有（ここから）
	// ///////////////////////////////////////////////

	protected MCList<Srch_RsltR> _allocRsltL = MCList.create(Srch_RsltR.class);

	protected void callAllocSrch01(MCList<Chk01_RsltR> list, Srch01_CndR up1, MCList<Chk01_RsltR> delList) {
		// 引当済み、出庫日が直近のものに対して優先して引当する
		MCList<Chk01_RsltR> allocL = list.shallowClone();
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.DESC, Chk01_RsltR.$sas_alloc_flg);
		setAllocSrch01SortValue(allocL);
		sp.add(SortType.DESC, "sublot_exists_flg");
		sp.add(SortType.DESC, "lot_exists_flg");
		sp.add(SortType.ASC, Chk01_RsltR.$ship_schd_tm);
		sp.add(SortType.ASC, Chk01_RsltR.$dlv_schd_tm);
		sp.add(SortType.ASC, Chk01_RsltR.$alloc_scope_typ);
		allocL.sort(sp);

		if (!up1.no_lot_chk_flg()) {
			// ロットチェックを無視する場合のみ、有効期限をセットする
			shipLotChk(allocL);
		}

		MSBEL_AllocMngService.Alloc_Srch01 o = MSBEL_AllocMngService.crtAlloc_Srch01();
		o.up0().stk_flg(false);
		o.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
		o.up0().lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
		o.up0().except_alloc_wait_flg(true);
		o.up0().nm_srch_flg(true);
		o.setLotChkFlg(up1.no_lot_chk_flg());
		setAll(o.up1(), allocL, createMap_Srch_TgtR_Chk01_RsltR());
		allocL.addAll(delList);
		setAll(o.up3(), allocL, createMap_Srch_Io_SchdR_Chk01_RsltR());
		
		if (!o.up1().isEmpty()) {
			o.exec();
			MCGroupByPolicy policy = new MCGroupByPolicy(
					Srch_RsltR.$peg_no,
					Srch_RsltR.$schd_dt,
					Srch_RsltR.$itm_cd,
					Srch_RsltR.$itm_sub1,
					Srch_RsltR.$itm_sub2,
					Srch_RsltR.$itm_sub3,
					Srch_RsltR.$ver_no,
					Srch_RsltR.$stk_loc_cd,
					Srch_RsltR.$stk_str_ln_tgt_flg,
					Srch_RsltR.$stk_str_ln_cd,
					Srch_RsltR.$stk_sppl_cd,
					Srch_RsltR.$stk_lg_grp_cd,
					Srch_RsltR.$asst_typ,
					Srch_RsltR.$in_xfr_typ,
					Srch_RsltR.$quality_typ,
					Srch_RsltR.$stk_insp_typ,
					Srch_RsltR.$stk_id_typ,
					Srch_RsltR.$stk_bp_cd,
					Srch_RsltR.$gd_cd,
					Srch_RsltR.$lot_no,
					Srch_RsltR.$sublot_no,
					Srch_RsltR.$sno1,
					Srch_RsltR.$sno2,
					Srch_RsltR.$sno3,
					Srch_RsltR.$sno4,
					Srch_RsltR.$pack_unit_cd,
					Srch_RsltR.$base_unit_cd,
					Srch_RsltR.$base_unit_nm,
					Srch_RsltR.$vld_dt_fr,
					Srch_RsltR.$vld_dt_to,
					Srch_RsltR.$stk_loc_nm,
					Srch_RsltR.$stk_str_ln_nm,
					Srch_RsltR.$base_unit_dec_place,
					Srch_RsltR.$base_unit_rnd_typ,
					Srch_RsltR.$act_cont_fctr
					);
			policy.sum(
					Srch_RsltR.$base_unit_qty,
					Srch_RsltR.$pack_unit_qty);
			_allocRsltL.addAll(o.down0().groupBy(policy));
		}
		else {
			_allocRsltL.init();
		}
	}
	/**
	 * 引当サービスに送る電文のソートに使用する項目を設定する。
	 * @param allocL
	 */
	protected void setAllocSrch01SortValue(MCList<Chk01_RsltR> allocL) {
		allocL.addBooleanColumn("lot_exists_flg");
		allocL.addBooleanColumn("sublot_exists_flg");
		for(Chk01_RsltR allocR : allocL) {
			allocR.setBooleanNE("lot_exists_flg", !isNull(allocR.lot_no()));
			allocR.setBooleanNE("sublot_exists_flg", !isNull(allocR.sublot_no()));
		}
	}

	/**
	 * 出荷予定更新サービス電文up1設定
	 */
	protected MCList<ShipSchd_DtlR> setCnd_ShipSchd_ShipSchd_DtlR(MCList<Chk01_RsltR> srcL) {
		MCList<ShipSchd_DtlR> destL = MCList.create(ShipSchd_DtlR.class);
		int peg_no = 0;
		String ship_schd_no = null;
		MCNumber add_num = MCNumber.ZERO;
		for (Chk01_RsltR r : srcL) {
			if (isSame(r.ship_schd_no(), ship_schd_no) && 
					(!r.getBooleanNE("add") || isSame(r.getNumberNE("add_num"), add_num))) {
				r.setNumberNE("tmp_ship_schd_no", peg_no);
			}
			else {
				r.setNumberNE("tmp_ship_schd_no", ++peg_no);
				ShipSchd_DtlR destR = ShipSchd_DtlR.create();
				copy(destR, r, createMap_ShipSchd_DtlR_Chk01_RsltR());
				destL.add(destR);
			}
			ship_schd_no = r.ship_schd_no();
			add_num = nvl(r.getNumberNE("add_num"), MCNumber.ZERO);
		}
		return destL;
	}

	/**
	 * 出荷予定更新サービス電文設定up2
	 */
	protected MCList<Alloc_RsltR> setChk01_RsltR_Alloc_RsltR(MCList<Chk01_RsltR> list, Srch01_CndR up1) {
		MCList<Alloc_RsltR> l = MCList.create(Alloc_RsltR.class);
		MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);

		for (Chk01_RsltR r : list) {
			if (r.abort_flg()) {
				MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
				if ( !(MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ()) && !isNull(ssR.getString("slo_d_no"))) ) {
					// 預り在庫以外の打切は引当状況を破棄
					continue;
				}
			}
			if (r.alloc_base_unit_qty().isZero()) continue;

			MCNumber remain_qty = MCNumber.ZERO;
			
			rsltL.init();
			if (!_allocRsltL.isEmpty()) {
				rsltL = _allocRsltL.subList(Srch_RsltR.$peg_no, r.peg_no());
			}
			if (rsltL.isEmpty()) {
				// 引当できなかった
				// 引当できない分のレコード作成
				Alloc_RsltR arR = Alloc_RsltR.create();
				setCnd_ShipSchd_Alloc_RsltR_notalloc(arR, r);
				// 出荷予定モードで更新する場合、引当を維持する
				if (isSame(up1.srch_mode(),"0")) {
					if (r.alloc_flg() || r.grp_alloc_flg()) {
						arR.alloc_flg(true);
						arR.alloc_scope_typ(r.alloc_scope_typ());
					}
				}
				l.add(arR);
			}
			else {
				// 引当できた
				remain_qty = r.alloc_base_unit_qty();

				for (Srch_RsltR rsltR : rsltL) {
					// 引当できた分のレコード作成
					Alloc_RsltR arR = Alloc_RsltR.create();
					copy(arR, rsltR, createMap_Alloc_RsltR_Srch_RsltR());
					arR.peg_no(r.getNumberNE("tmp_ship_schd_no"));
					arR.alloc_flg(true);
					arR.alloc_scope_typ(r.alloc_scope_typ());
					arR.ent_unit_cd(r.alloc_ent_unit_cd());
					
					l.add(arR);

					// 残数
					remain_qty = remain_qty.subtract(rsltR.base_unit_qty());
				}
				// 残数がある場合は未引当レコードを作成する
				if (remain_qty.isPositive()) {
					Alloc_RsltR arR = Alloc_RsltR.create();
					setCnd_ShipSchd_Alloc_RsltR_notalloc(arR, r);
					// 数量は残数で上書き
					arR.base_unit_qty(remain_qty);
					l.add(arR);
				}
			}
		}
		return l;
	}

	/**
	 * 出荷予定更新サービス電文設定up2未引当
	 */
	protected void setCnd_ShipSchd_Alloc_RsltR_notalloc(Alloc_RsltR destR, Chk01_RsltR r) {
		MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());

		destR.peg_no(r.getNumberNE("tmp_ship_schd_no"));
		destR.itm_cd(ssR.itm_cd());
		destR.itm_sub1(ssR.itm_sub1());
		destR.itm_sub2(ssR.itm_sub2());
		destR.itm_sub3(ssR.itm_sub3());
		destR.stk_loc_cd(r.loc_cd());
		destR.stk_str_ln_cd(r.str_ln_cd());
		destR.stk_lg_grp_cd(null);
		destR.quality_typ(ssR.quality_typ());
		destR.stk_insp_typ(ssR.stk_insp_typ());
		if (!isNullOr(r.stk_id_typ(), r.stk_bp_cd())) {
			destR.stk_id_typ(r.stk_id_typ());
			destR.stk_bp_cd(r.stk_bp_cd());
		}
		else if (!isNull(r.ship_alloc_sts_no())) {
			MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = getShipAllocStsL(r.ship_schd_no());	
			MST_SHIP_ALLOC_STS_R sasR = shipAllocStsL.getFirst(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, r.ship_alloc_sts_no());
			if (!isNull(sasR)) {
				destR.stk_id_typ(sasR.stk_id_typ());
				destR.stk_bp_cd(sasR.stk_bp_cd());
			}
		}
		else if (!isNull(r.org_ship_alloc_sts_no())) {
			MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = getShipAllocStsL(r.ship_schd_no());	
			MST_SHIP_ALLOC_STS_R sasR = shipAllocStsL.getFirst(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, r.org_ship_alloc_sts_no());
			if (!isNull(sasR)) {
				destR.stk_id_typ(sasR.stk_id_typ());
				destR.stk_bp_cd(sasR.stk_bp_cd());
			}
		}
		else {
			destR.stk_id_typ(ssR.stk_id_typ());
			destR.stk_bp_cd(ssR.stk_bp_cd());
		}
		destR.stk_arrv_bp_cd(ssR.stk_arrv_bp_cd());
		destR.gd_cd(ssR.gd_cd());
		destR.lot_no(r.lot_no());
		destR.sublot_no(r.sublot_no());
		destR.sno1(r.alloc_sno1());
		destR.sno2(r.alloc_sno2());
		destR.sno3(r.alloc_sno3());
		destR.sno4(r.alloc_sno4());
		destR.ver_no(r.ver_no());
		destR.pack_unit_cd(null);
		destR.pack_unit_qty(null);
		destR.base_unit_cd(ssR.base_unit_cd());
		destR.base_unit_qty(r.alloc_base_unit_qty());
		destR.ent_unit_cd(r.alloc_ent_unit_cd());
		destR.alloc_flg(false);
		destR.vld_dt_fr(ssR.vld_dt_fr());
		destR.vld_dt_to(ssR.vld_dt_to());
	}

	static final String _tmp_valid_dt_fr = "tmp_valid_dt_fr";
	static final String _tmp_valid_dt_fr_grp = "tmp_valid_dt_fr_grp";
	static final String _tmp_valid_dt_to = "tmp_valid_dt_to";

	/**
	 * 出荷済みのロットから最小・最大の有効期限を取得する
	 */
	protected void shipLotChk(MCList<Chk01_RsltR> list) {
		MSBEL_ShipLotChkService.ShipLotChk_Srch01 o = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();

		for (Chk01_RsltR r : list) {
			MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
			String trdPtnTyp = ssR.getString("trd_ptn_typ");

			if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp) || MAC_TRD_PTN_TYP.isSHIP(trdPtnTyp)) {
			
				ShipLot_DtlR cndR = ShipLot_DtlR.create();
				cndR.peg_no(r.peg_no());
				cndR.cst_cd(ssR.getString("cst_cd"));
				if (MSC_SHIP_TO_ID_TYP.isDLV(ssR.getString("dlv_id_typ"))) {
					cndR.dlv_cd(ssR.getString("dlv_id_cd"));
				}
				cndR.itm_cd(ssR.itm_cd());
				cndR.itm_sub1(ssR.itm_sub1());
				cndR.itm_sub2(ssR.itm_sub2());
				cndR.itm_sub3(ssR.itm_sub3());
				if (!isNull(ssR.dlv_schd_tm())) {
					cndR.base_dt(ssR.dlv_schd_tm().trunc(MCDateFieldType.DAY));
				}
				cndR.lock_flg(false);

				o.up0().add(cndR);
			}
		}
		o.exec();

		for (Chk01_RsltR r : list) {
			ShipLot_DtlR selectR = o.down0().getFirst(ShipLot_DtlR.$peg_no, r.peg_no());
			if (!isNull(selectR)) {
				r.setDateNE(_tmp_valid_dt_fr, selectR.valid_dt_fr());
				r.setNumberNE(_tmp_valid_dt_fr_grp, selectR.valid_dt_fr_grp());
				r.setDateNE(_tmp_valid_dt_to, selectR.valid_dt_to());
			}
		}
	}

	
	// ///////////////////////////////////////////////
	// キャッシュ（ここから）
	// ///////////////////////////////////////////////

	protected static final Class<MSBEL_ShipSchdReg> CLAZZ = MSBEL_ShipSchdReg.class;

	/**
	 * MST_SHIP_SCHDキャッシュ
	 */
	protected static void initShipSchdCache(MCList<Chk01_RsltR> rsltL) {
		object(CLAZZ)._initShipSchdCache(rsltL);
	}
	protected FXUCL_MCDbcCache<MST_SHIP_SCHD_R> _shipSchdCache = null;
	protected void _initShipSchdCache(MCList<?> rsltL) {
		MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
		MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
		MSVM_DLV_ID_R t3 = MSVM_DLV_ID_R.create("T3");
		MAVM_ITM_UNIT_R m1 = MAVM_ITM_UNIT_R.create("M1");

		MCList<MST_SHIP_SCHD_R> dbc = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addBooleanColumn("pack_flg");
		dbc.addNumberColumn("conv_base_qty");
		dbc.addNumberColumn("conv_qty");
		dbc.addNumberColumn("dec_place");
		dbc.addStringColumn("slo_d_no");
		dbc.addStringColumn("rnd_typ");
		dbc.addStringColumn("trd_ptn_typ");
		dbc.addStringColumn("cst_cd");
		dbc.addStringColumn("dlv_id_typ");
		dbc.addStringColumn("dlv_id_cd");
		dbc.addBooleanColumn("purc_ddlv_flg");
		dbc.addStringColumn("ship_to_id_typ");
		dbc.addStringColumn("ship_to_id_cd");
		dbc.addStringColumn("ship_inst_typ");
		dbc.addDateColumn("dlv_rqst_tm");
		dbc.addStringColumn("ship_to_lg_grp_cd");
		dbc.addStringColumn("alloc_grp_cd");
		dbc.addStringColumn("alloc_scope_typ");
		dbc.addBooleanColumn("sls_cststk_flg");
		dbc.addDateColumn("sls_schd_dt");
		dbc.addStringColumn("ss_via_dlv_typ");
		dbc.addStringColumn("ss_dlv_day_week_typ");
		dbc.addStringColumn("ss_dlv_lg_grp_cd");
		dbc_bldr.removeSelect(MST_SHIP_SCHD_R.$via_dlv_typ);
		dbc_bldr.removeSelect(MST_SHIP_SCHD_R.$dlv_day_week_typ);
		dbc_bldr.removeSelect(MST_SHIP_SCHD_R.$dlv_lg_grp_cd);
		dbc_bldr.addSelect(t.via_dlv_typ.as("ss_via_dlv_typ"),
							t.dlv_day_week_typ.as("ss_dlv_day_week_typ"),
							t.dlv_lg_grp_cd.as("ss_dlv_lg_grp_cd"),
							m1.pack_flg,
							m1.conv_base_qty,
							m1.conv_qty,
							m1.dec_place,
							m1.rnd_typ,
							t1.slo_d_no,
							t1.trd_ptn_typ,
							nvl(t.via_dlv_typ, t1.via_dlv_typ).as("via_dlv_typ"),
							t1.cst_cd,
							t1.dlv_id_typ,
							nvl( t.dlv_cd, t1.dlv_id_cd).as("dlv_id_cd"),
							t1.purc_ddlv_flg,
							nvl2( t.tdlv_cd, value(MSC_SHIP_TO_ID_TYP.TDLV.value()), t1.ship_to_id_typ).as("ship_to_id_typ"),
							nvl( nvl( t.tdlv_cd, decode( t1.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									t.dlv_cd, nullValue() ) ), t1.ship_to_id_cd).as("ship_to_id_cd"),
							t1.ship_inst_typ,
							t1.dlv_rqst_tm,
							nvl2(
								t.tdlv_cd,
								t.tdlv_lg_grp_cd,
								decode(
									t1.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										t.dlv_cd,
										t.dlv_lg_grp_cd,
										t1.ship_to_lg_grp_cd
									),
									t1.ship_to_lg_grp_cd
								)
							).as("ship_to_lg_grp_cd"),
							t1.alloc_grp_cd,
							t1.alloc_scope_typ,
							nvl( t.dlv_day_week_typ, t2.dlv_day_week_typ).as("dlv_day_week_typ"),
							t2.sls_cststk_flg,
							t2.sls_schd_dt,
							nvl2( t.dlv_cd, t.dlv_lg_grp_cd, t3.lg_grp_cd).as("dlv_lg_grp_cd"));
		dbc_bldr.addLeftOuterJoin(t1, bracket( t1.ship_pr_no.eq(t.ship_pr_no)));
		dbc_bldr.addLeftOuterJoin(t2, bracket( t2.slo_d_no.eq(t1.slo_d_no)));
		dbc_bldr.addLeftOuterJoin(t3, bracket( t1.dlv_id_typ.eq(t3.dlv_id_typ)
				.and(t1.dlv_id_cd.eq(t3.dlv_id_cd))));
		dbc_bldr.addLeftOuterJoin(m1,bracket( m1.itm_cd.eq(t.itm_cd)
				.and(m1.itm_sub1.eq(t.itm_sub1))
				.and(m1.itm_sub2.eq(t.itm_sub2))
				.and(m1.itm_sub3.eq(t.itm_sub3))
				.and(m1.unit_cd.eq(t.trd_unit_cd))));
		_shipSchdCache = new FXUCL_MCDbcCache<MST_SHIP_SCHD_R>(dbc, dbc_bldr, rsltL,
				MST_SHIP_SCHD_R.$ship_schd_no);
	}
	protected static FXUCL_MCDbcCache<MST_SHIP_SCHD_R> getShipSchdCache() {
		return object(CLAZZ)._shipSchdCache;
	}
	protected static MST_SHIP_SCHD_R getShipSchdR(String shipSchdNo) {
		return getShipSchdCache().get(shipSchdNo);
	}

	MCList<MST_SHIP_ALLOC_STS_R> _shipAllocStsL;
	MCIndexKey _shipAllocStsKey, _shipAllocStsKey2;

	/**
	 * 出荷引当状況のデータをキャッシュします。<br>
	 * @param bindL 「ship_schd_no」に出荷予定ＮＯを格納したリスト
	 */
	protected void initShipAllocStsCache(MCList<? extends MCRow> bindL) {
		MCList<MST_SHIP_ALLOC_STS_R> dbc = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setWhere(t.ship_schd_no.eq(bind("ship_schd_no")));
		dbSelect("MSBEL1420_MST_SHIP_ALLOC_STS_S01", dbc, dbc_bldr, bindL);

		object(CLAZZ)._shipAllocStsL = dbc;
		object(CLAZZ)._shipAllocStsKey = object(CLAZZ)._shipAllocStsL.createIndex("ship_schd_no");
		object(CLAZZ)._shipAllocStsKey2 = object(CLAZZ)._shipAllocStsL.createIndex("ship_alloc_sts_no");
	}
	protected MCList<MST_SHIP_ALLOC_STS_R> getShipAllocStsL(String shipSchdNo) {
		return object(CLAZZ)._shipAllocStsL.subList(object(CLAZZ)._shipAllocStsKey, shipSchdNo);
	}
	protected MST_SHIP_ALLOC_STS_R getShipAllocStsR(String shipAllocStsNo) {
		return object(CLAZZ)._shipAllocStsL.getFirst(object(CLAZZ)._shipAllocStsKey2, shipAllocStsNo);
	}

	/**
	 * MAM_LG_CTLキャッシュ
	 */
	MCList<MAM_LG_CTL_R> _lgCtlL;
	MCIndexKey _lgCtlKey;
	protected void initLgCtlCache(MCList<? extends MCRow> bindL) {
		MCList<MAM_LG_CTL_R> dbc = MCList.create(MAM_LG_CTL_R.class);
		MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setWhere(t.fr_lg_grp_cd.eq(bind("ship_fr_lg_grp_cd")));
		dbc_bldr.addWhereWithAnd(t.to_lg_grp_cd.eq(bind("dlv_lg_grp_cd")));
		dbSelect("MSBEL1420_MAM_LG_CTL_S01", dbc, dbc_bldr, bindL);
		object(CLAZZ)._lgCtlL = dbc;
		object(CLAZZ)._lgCtlKey = object(CLAZZ)._lgCtlL.createIndex("fr_lg_grp_cd", "to_lg_grp_cd");
	}
	protected MAM_LG_CTL_R getLgCtlR(String shipFrLgGrpCd, String shipToLgGrpCd) {
		return object(CLAZZ)._lgCtlL.getFirst(object(CLAZZ)._lgCtlKey, shipFrLgGrpCd, shipToLgGrpCd);
	}

	/**
	 * MAM_BPキャッシュ
	 */
	protected static void initBpCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initBpCache(bindL);
	}
	protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache = null;
	protected void _initBpCache(MCList<?> dtlL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.bp_cd, t.cst_iv_flg);
		_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbc_bldr, dtlL, "cst_cd");
	}
	protected static FXUCL_MCDbcCache<MAM_BP_R> getBpCache() {
		if (object(CLAZZ)._bpCache == null) {
			object(CLAZZ)._initBpCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._bpCache;
	}
	protected static MAM_BP_R getBpR(String cstCd) {
		return getBpCache().get(cstCd);
	}

	/**
	 * MAVM_ITM_UNITキャッシュ
	 */
	protected static void initItmUnitCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmUnitCache(bindL);
	}
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected void _initItmUnitCache(MCList<?> dtlL) {		
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
				MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T")), dtlL, "itm_cd",
				"itm_sub1", "itm_sub2", "itm_sub3", "unit_cd");
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			object(CLAZZ)._initItmUnitCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}
	protected static MAVM_ITM_UNIT_R getItmUnitR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String unitCd) {
		return getItmUnitCache().get(itmCd, itmSub1, itmSub2, itmSub3, unitCd);
	}

	/**
	 * 受注明細のデータをキャッシュします。<br>
	 * @param bindL 「slo_no」に受注ＮＯを格納したリスト
	 */
	protected void initSloDCache1(MCList<? extends MCRow> bindL) {
		MCList<MST_SLO_D_R> dbc = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
		dbc.addBooleanColumn("ship_abl_flg");
		dbc_bldr.setSelect(t.slo_no, t2.ship_abl_flg);
		dbc_bldr.addInnerJoin(t1, bracket( t1.slo_d_no.eq(t.slo_d_no)));
		dbc_bldr.addInnerJoin(t2, bracket( t2.ship_pr_no.eq(t1.ship_pr_no)));
		dbc_bldr.setWhere(t.slo_no.eq(bind("slo_no")));
		dbSelect("MSBEL1420_MST_SLO_D_S01", dbc, dbc_bldr, bindL);

		_sloDL1 = dbc;
		_sloDKey1 = _sloDL1.createIndex("slo_no");
	}
	MCList<MST_SLO_D_R> _sloDL1;
	MCIndexKey _sloDKey1;
	protected MCList<MST_SLO_D_R> getSloDL1(String sloNo) {
		return _sloDL1.subList(_sloDKey1, sloNo);
	}

	/**
	 * 受注明細のデータをキャッシュします。<br>
	 * @param bindL 「set_itm_grp_no」に品揃グループＮＯを格納したリスト
	 */
	protected void initSloDCache2(MCList<? extends MCRow> bindL) {
		MCList<MST_SLO_D_R> dbc = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R t = MST_SLO_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
		MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
		dbc.addBooleanColumn("ship_abl_flg");
		dbc_bldr.setSelect(t.slo_no, t.set_itm_grp_no, t2.ship_abl_flg);
		dbc_bldr.addInnerJoin(t1, bracket( t1.slo_d_no.eq(t.slo_d_no)));
		dbc_bldr.addInnerJoin(t2, bracket( t2.ship_pr_no.eq(t1.ship_pr_no)));
		dbc_bldr.setWhere(t.set_itm_grp_no.eq(bind("set_itm_grp_no")));
		dbc_bldr.addWhereWithAnd(t.slo_no.eq(bind("slo_no")));
		dbSelect("MSBEL1420_MST_SLO_D_S02", dbc, dbc_bldr, bindL);

		_sloDL2 = dbc;
		_sloDKey2 = _sloDL2.createIndex("slo_no", "set_itm_grp_no");
	}
	MCList<MST_SLO_D_R> _sloDL2;
	MCIndexKey _sloDKey2;
	protected MCList<MST_SLO_D_R> getSloDL2(String sloNo, MCNumber setItmGrpNo) {
		return _sloDL2.subList(_sloDKey2, sloNo, setItmGrpNo);
	}

	/**
	 * インボイスマップを元にインボイスヘッダのデータをキャッシュする
	 * @param bindL 検索結果のリスト
	 */
	protected void initIvMapCache(MCList<Srch01_RsltR> bindL) {

		MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
		MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
		dbWkDelete("MSBEL1420_MSW_SHIP_SCHD_D01", shipSchdL_bldr.getBaseDbc());
		for (Srch01_RsltR r : bindL) {
			MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create();
			shipSchdR.ship_schd_no(r.ship_schd_no());
			shipSchdL.add(shipSchdR);
		}
		
		_ivMapL = MCList.create(MST_IV_MAP_R.class);
		
		_ivMapL.addBooleanColumn("IV_SHIP_FLG");
		if(!isNull(shipSchdL)) {
			dbWkInsert("MSBEL1420_MSW_SHIP_SCHD_I01", shipSchdL, shipSchdL_bldr.getBaseDbc());
			
			MSW_SHIP_SCHD_KEY_R t2 = MSW_SHIP_SCHD_KEY_R.create("T2");
			MST_IV_D_R t3 = MST_IV_D_R.create("T3");
			MST_IV_R t4 = MST_IV_R.create("T4");
			MST_IV_MAP_R t1 = MST_IV_MAP_R.create("T");
			MCQueryApiBuilder ivMapL_bldr = MCQueryApiBuilder.create(t1);
			ivMapL_bldr.setSelect(t1.ship_schd_no, t4.iv_no, t4.iv_ship_flg);
			ivMapL_bldr.addInnerJoin(t2, bracket( t2.ship_schd_no.eq(t1.ship_schd_no)));
			ivMapL_bldr.addInnerJoin(t3, bracket( t3.iv_d_no.eq(t1.iv_d_no)));
			ivMapL_bldr.addInnerJoin(t4, bracket( t4.iv_mng_no.eq(t3.iv_mng_no)));
			dbSelect("MSBEL1420_MST_IV_MAP_S01", _ivMapL, ivMapL_bldr);
		}
		_ivMapKey = _ivMapL.createIndex("SHIP_SCHD_NO");
	}
	MCList<MST_IV_MAP_R> _ivMapL;
	MCIndexKey _ivMapKey;
	protected MCList<MST_IV_MAP_R> getIvMapL(String shipSchdNo) {
		return _ivMapL.subList(_ivMapKey, shipSchdNo);
	}

	/**
	 * MAM_LOCキャッシュ
	 */
	protected static void initLocCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initLocCache(bindL);
	}
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void _initLocCache(MCList<?> dtlL) {
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.loc_cd, t.lg_grp_cd, t.alloc_grp_cd);
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, dtlL, "loc_cd");
	}
	protected static FXUCL_MCDbcCache<MAM_LOC_R> getLocCache() {
		if (object(CLAZZ)._locCache == null) {
			object(CLAZZ)._initLocCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._locCache;
	}
	protected static MAM_LOC_R getLocR(String locCd) {
		return getLocCache().get(locCd);
	}

	/**
	 * MAM_ITMキャッシュ
	 */
	protected static void initItmCache(MCList<? extends MCRow> bindL) {
		object(CLAZZ)._initItmCache(bindL);
	}
	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected void _initItmCache(MCList<?> dtlL) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc_bldr.setSelect(t.std_cont_fctr, t.cont_fctr_unit_cd, t.cont_fctr_flg,
				t.cont_fctr_rnd_typ, t.cont_fctr_dec_place);
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
				dbc_bldr, dtlL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		if (object(CLAZZ)._itmCache == null) {
			object(CLAZZ)._initItmCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmCache;
	}
	protected static MAM_ITM_R getItmR(
			String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		return getItmCache().get(itmCd, itmSub1, itmSub2, itmSub3);
	}
	// ///////////////////////////////////////////////
	// キャッシュ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ユーティリティ（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 受払予定区分を取得する<br>
	 * 出荷進捗の出荷実績数量を参照するので、事前に更新済みであること
	 */
	protected String getIoSchdTyp(Chk01_RsltR r) {
		MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
		String trdPtnTyp = ssR.getString("trd_ptn_typ");

		return getIoSchdTypForShip(
				trdPtnTyp,
			ssR.stk_id_typ(),
			nvl(ssR.ship_act_qty(), MCNumber.ZERO).isPositive(),
			isEx(r, ssR, trdPtnTyp));
	}

	/**
	 * 輸出取引（輸出実績を登録するパタン）かを判定する
	 * @param prR
	 * @return
	 */
	protected boolean isEx(Chk01_RsltR r, MST_SHIP_SCHD_R ssR, String trdPtnTyp) {

		// インボイス取引、かつ配送先を経由する
		boolean iv_trd_flg = false;
		if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp)
			|| MAC_TRD_PTN_TYP.isSHIP(trdPtnTyp)) {
			
			MAM_BP_R bpR = getBpR(r.cst_cd());
			if (bpR != null) {
				iv_trd_flg = bpR.cst_iv_flg();
			}
		}
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(trdPtnTyp)) {
			// 支給返品はインボイス取引の対象外
			iv_trd_flg = false;
		}
		else {
			MAM_LG_CTL_R lgCtlR = getLgCtlR(r.ship_fr_lg_grp_cd(), r.dlv_lg_grp_cd());
			if (lgCtlR != null) {
				iv_trd_flg = lgCtlR.iv_trd_flg();
			}
		}

		return iv_trd_flg && MAC_VIA_DLV_TYP.isVIA(ssR.getString("via_dlv_typ"));
	}

	/**
	 * 受払予定状況区分を取得する
	 */
	protected String getIoSchdStsTyp(Chk01_RsltR r) {
		MST_SHIP_SCHD_R ssR = getShipSchdR(r.ship_schd_no());
		MST_SHIP_ALLOC_STS_R sasR = null;
		MCList<MST_SHIP_ALLOC_STS_R> sasL = getShipAllocStsL(r.ship_schd_no());
		if (sasL.size() > 0) {
			sasR = sasL.get(0);
		}

		return getIoSchdStsTypForShip(
			ssR.getString("trd_ptn_typ"),
			ssR.dlv_inst_rcpt_no(),
			ssR.slo_prms_no(),
			ssR.getBoolean("purc_ddlv_flg"),
			nvl(ssR.ship_inst_qty(), MCNumber.ZERO).isPositive(),
			nvl(ssR.ship_act_qty(), MCNumber.ZERO).isPositive()
					&& !isNull(sasR) && nvl(sasR.ship_act_qty(), MCNumber.ZERO).isPositive(),
			nvl(ssR.iv_act_qty(), MCNumber.ZERO).isPositive(), ssR.stk_id_typ());
	}

	/**
	 * MCDateから時分（HHMM）の文字列を返す
	 */
	protected String getTimeChar(MCDate dt) {
		if (!isNull(dt)) {
			return lpad(dt.getHour(), 2, "0")
					+ lpad(dt.getMinute(), 2, "0");
		}
		return null;
	}
	// ///////////////////////////////////////////////
	// ユーティリティ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ロウマッパー（ここから）
	// ///////////////////////////////////////////////
	protected Map_Srch_TgtR_Chk01_RsltR<Srch_TgtR,Chk01_RsltR> createMap_Srch_TgtR_Chk01_RsltR() {
		return new Map_Srch_TgtR_Chk01_RsltR<Srch_TgtR, Chk01_RsltR>();
	}
	public class Map_Srch_TgtR_Chk01_RsltR<D extends Srch_TgtR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_TgtR.$peg_no, "peg_no");
			addColumnPathMap(Srch_TgtR.$lot_no, Chk01_RsltR.$lot_no);
			addColumnPathMap(Srch_TgtR.$sublot_no, Chk01_RsltR.$sublot_no);
			addColumnPathMap(Srch_TgtR.$ver_no, Chk01_RsltR.$ver_no);
			addColumnPathMap(Srch_TgtR.$ship_term_cd, Chk01_RsltR.$ship_term_cd);
			addColumnPathMap(Srch_TgtR.$gi_loc_cd, Chk01_RsltR.$loc_cd);
			addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Chk01_RsltR.$str_ln_cd);
			addColumnPathMap(Srch_TgtR.$alloc_scope_typ, Chk01_RsltR.$alloc_scope_typ);
			addColumnPathMap(Srch_TgtR.$not_lot_fix_flg, Chk01_RsltR.$lot_none_flg);
			addColumnPathMap(Srch_TgtR.$cst_cd, Chk01_RsltR.$cst_cd);
			addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, Chk01_RsltR.$not_lot_mix_flg);
			addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, Chk01_RsltR.$not_sublot_mix_flg);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			MST_SHIP_SCHD_R ssR = getShipSchdR(src.ship_schd_no());
			
			String trdPtnTyp = ssR.getString("trd_ptn_typ");

			// 預り売上の場合は出庫予定日として売上予定日をセットする
			if (ssR.getBoolean("sls_cststk_flg")) {
				dest.gi_schd_dt(ssR.getDate("sls_schd_dt"));
			}
			else {
				dest.gi_schd_dt(src.ship_schd_tm());
			}
			dest.inpt_schd_dt(null);
			dest.alt_flg(false);
			dest.alt_grp_cd(null);
			dest.alt_grp_seq(null);
			dest.oper_inst_no(null);
			dest.alt_itm_typ(null);
			dest.alt_alloc_prio(null);
			dest.inpt_loc_cd(null);
			dest.inpt_str_ln_cd(null);
			if (MSC_SHIP_TO_ID_TYP.isLOC(ssR.getString("ship_to_id_typ"))) {
				dest.gr_loc_cd(ssR.getString("ship_to_id_cd"));
			}
			else {
				dest.gr_loc_cd(null);
			}
			dest.gr_str_ln_cd(null);
			dest.cont_qty(null);
			dest.stk_alloc_flg(false);

			dest.gr_schd_dt(ssR.dlv_schd_tm());
			dest.itm_cd(ssR.itm_cd());
			dest.itm_sub1(ssR.itm_sub1());
			dest.itm_sub2(ssR.itm_sub2());
			dest.itm_sub3(ssR.itm_sub3());
			dest.sno1(nvl(src.alloc_sno1(), ssR.sno1()));
			dest.sno2(nvl(src.alloc_sno2(), ssR.sno2()));
			dest.sno3(nvl(src.alloc_sno3(), ssR.sno3()));
			dest.sno4(nvl(src.alloc_sno4(), ssR.sno4()));
			dest.base_unit_cd(ssR.base_unit_cd());
			dest.gi_lg_grp_cd(ssR.ship_fr_lg_grp_cd());
			dest.sno1_null_flg(ssR.sno1_null_flg());
			dest.sno2_null_flg(ssR.sno2_null_flg());
			dest.sno3_null_flg(ssR.sno3_null_flg());
			dest.sno4_null_flg(ssR.sno4_null_flg());
			dest.not_lot_mix_flg(ssR.not_lot_mix_flg());
			dest.not_sublot_mix_flg(ssR.not_sublot_mix_flg());
			dest.alloc_grp_cd(ssR.getString("alloc_grp_cd"));
			dest.dlv_lg_grp_cd(ssR.getString("dlv_lg_grp_cd"));
			dest.gi_stk_arrv_bp_cd(ssR.stk_arrv_bp_cd());

			// 基準単位数量計算
			MAVM_ITM_UNIT_R entItmUnitR = getItmUnitR(ssR.itm_cd(), ssR.itm_sub1(),
					ssR.itm_sub2(), ssR.itm_sub3(), src.alloc_ent_unit_cd());
			MAVM_ITM_UNIT_R baseItmUnitR = getItmUnitR(ssR.itm_cd(), ssR.itm_sub1(),
					ssR.itm_sub2(), ssR.itm_sub3(), ssR.base_unit_cd());
			dest.base_unit_qty(convToBaseUnit(src.alloc_ent_unit_qty(),
					entItmUnitR.conv_base_qty(), entItmUnitR.conv_qty(),
					baseItmUnitR.dec_place(), baseItmUnitR.rnd_typ()));

			if (!isNull(src.ship_alloc_sts_no())) {
				MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = getShipAllocStsL(src.ship_schd_no());	
				MST_SHIP_ALLOC_STS_R sasR = shipAllocStsL.getFirst(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, src.ship_alloc_sts_no());
				if (sasR != null) {
					dest.gd_cd(sasR.gd_cd());
					dest.quality_typ(sasR.quality_typ());
					dest.stk_id_typ(sasR.stk_id_typ());
					dest.stk_bp_cd(sasR.stk_bp_cd());
				}
			}
			else if (!isNull(src.org_ship_alloc_sts_no())) {
				MCList<MST_SHIP_ALLOC_STS_R> shipAllocStsL = getShipAllocStsL(src.ship_schd_no());	
				MST_SHIP_ALLOC_STS_R sasR = shipAllocStsL.getFirst(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no, src.org_ship_alloc_sts_no());
				if (sasR != null) {
					dest.gd_cd(sasR.gd_cd());
					dest.quality_typ(sasR.quality_typ());
					dest.stk_id_typ(sasR.stk_id_typ());
					dest.stk_bp_cd(sasR.stk_bp_cd());
				}
			}
			else {
				dest.gd_cd(ssR.gd_cd());
				dest.quality_typ(ssR.quality_typ());
				dest.stk_id_typ(ssR.stk_id_typ());
				dest.stk_bp_cd(ssR.stk_bp_cd());
			}

			if (entItmUnitR.pack_flg()) {
				dest.pack_unit_cd(src.alloc_ent_unit_cd());
				dest.pack_unit_qty(src.alloc_ent_unit_qty());
			}
			else {
				dest.pack_unit_cd(null);
				dest.pack_unit_qty(null);
			}
			if (MAC_TRD_PTN_TYP.isSLS(trdPtnTyp) || MAC_TRD_PTN_TYP.isSHIP(trdPtnTyp)) {
				dest.vld_dt_fr(src.getDateNE(_tmp_valid_dt_fr));
				dest.vld_dt_fr_grp(src.getNumberNE(_tmp_valid_dt_fr_grp));
				dest.vld_dt_to(src.getDateNE(_tmp_valid_dt_to));
			}
			else {
				dest.vld_dt_fr(ssR.vld_dt_fr());
				dest.vld_dt_fr_grp(null);
				dest.vld_dt_to(ssR.vld_dt_to());
			}

			dest.io_schd_typ(getIoSchdTyp(src));
			dest.io_schd_sts_typ(getIoSchdStsTyp(src));
			
			if (MAC_TRD_PTN_TYP.isPROV(trdPtnTyp) && isNull(src.loc_cd())) {
				dest.stk_info_loc_typ(MSC_STK_INFO_LOC_TYP.HOUSE.value());
			}
		}
	}
	protected Map_Srch_Io_SchdR_Chk01_RsltR<Srch_Io_SchdR,Chk01_RsltR> createMap_Srch_Io_SchdR_Chk01_RsltR() {
		return new Map_Srch_Io_SchdR_Chk01_RsltR<Srch_Io_SchdR, Chk01_RsltR>();
	}
	public class Map_Srch_Io_SchdR_Chk01_RsltR<D extends Srch_Io_SchdR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.io_schd_typ(getIoSchdTyp(src));
			dest.io_schd_sts_typ(getIoSchdStsTyp(src));
			dest.io_schd_no(src.ship_alloc_sts_no());
		}
	}
	protected Map_ShipSchd_DtlR_Chk01_RsltR<ShipSchd_DtlR,Chk01_RsltR> createMap_ShipSchd_DtlR_Chk01_RsltR() {
		return new Map_ShipSchd_DtlR_Chk01_RsltR<ShipSchd_DtlR, Chk01_RsltR>();
	}

	public class Map_ShipSchd_DtlR_Chk01_RsltR<D extends ShipSchd_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_DtlR.$peg_no, "tmp_ship_schd_no");
			addColumnPathMap(ShipSchd_DtlR.$ship_term_cd, Chk01_RsltR.$ship_term_cd);
			addColumnPathMap(ShipSchd_DtlR.$ship_wk_cd, Chk01_RsltR.$ship_wk_cd);
			addColumnPathMap(ShipSchd_DtlR.$abort_flg, Chk01_RsltR.$abort_flg);
			addColumnPathMap(ShipSchd_DtlR.$ship_block_flg, Chk01_RsltR.$ship_block_flg);
			addColumnPathMap(ShipSchd_DtlR.$trd_unit_qty, Chk01_RsltR.$trd_unit_qty);
			addColumnPathMap(ShipSchd_DtlR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
			addColumnPathMap(ShipSchd_DtlR.$base_dlv_slip_no, Chk01_RsltR.$base_dlv_slip_no);
			addColumnPathMap(ShipSchd_DtlR.$base_prov_act_no, Chk01_RsltR.$base_prov_act_no);
			addColumnPathMap(ShipSchd_DtlR.$base_ac_dt, Chk01_RsltR.$base_ac_dt);
			addColumnPathMap(ShipSchd_DtlR.$not_lot_mix_flg, Chk01_RsltR.$not_lot_mix_flg);
			addColumnPathMap(ShipSchd_DtlR.$not_sublot_mix_flg, Chk01_RsltR.$not_sublot_mix_flg);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (src.getBooleanNE("add")) {
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.ship_schd_no(null);
			}
			else {
				if (src.isStatusDelete()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				dest.ship_schd_no(src.ship_schd_no());
			}

			MST_SHIP_SCHD_R ssR = getShipSchdR(src.ship_schd_no());
			dest.ship_pr_no(ssR.ship_pr_no());
			dest.is_src_ship_schd_flg(true);

			dest.ship_schd_tm(src.ship_schd_tm());
			dest.dlv_schd_tm(nvl(src.dlv_schd_tm(), ssR.dlv_schd_tm()));

			dest.trd_unit_cd(ssR.trd_unit_cd());
			dest.base_unit_cd(ssR.base_unit_cd());

			dest.inst_qty(ssR.ship_inst_qty());
			dest.inst_unit_cd(ssR.base_unit_cd());
			dest.ship_inst_d_no(ssR.ship_inst_d_no());
			dest.dlv_inst_rcpt_no(ssR.dlv_inst_rcpt_no());
			dest.slo_prms_no(ssR.slo_prms_no());
			dest.sls_act_d_no(ssR.sls_act_d_no());
			dest.ship_fr_lg_grp_cd(ssR.ship_fr_lg_grp_cd());
			dest.wg_cd(ssR.wg_cd());
			dest.pd_inst_dlv_tm(ssR.pd_inst_dlv_tm());
			dest.ship_rqst_tm(ssR.ship_rqst_tm());
			dest.itm_cd(ssR.itm_cd());
			dest.itm_sub1(ssR.itm_sub1());
			dest.itm_sub2(ssR.itm_sub2());
			dest.itm_sub3(ssR.itm_sub3());
			dest.itm_nm(ssR.itm_nm());
			dest.iv_itm_nm(ssR.iv_itm_nm());
			dest.sundry_itm_flg(ssR.sundry_itm_flg());
			dest.sno1(ssR.sno1());
			dest.sno1_null_flg(ssR.sno1_null_flg());
			dest.sno2(ssR.sno2());
			dest.sno2_null_flg(ssR.sno2_null_flg());
			dest.sno3(ssR.sno3());
			dest.sno3_null_flg(ssR.sno3_null_flg());
			dest.sno4(ssR.sno4());
			dest.sno4_null_flg(ssR.sno4_null_flg());
			dest.lot_no(ssR.lot_no());
			dest.sublot_no(ssR.sublot_no());
			dest.ver_no(ssR.ver_no());
			dest.stk_arrv_bp_cd(ssR.stk_arrv_bp_cd());
			dest.gd_cd(ssR.gd_cd());
			dest.quality_typ(ssR.quality_typ());
			dest.stk_id_typ(ssR.stk_id_typ());
			dest.stk_bp_cd(ssR.stk_bp_cd());
			dest.fix_flg(src.fix_flg());
			dest.inst_bndl_flg(ssR.inst_bndl_flg());
			dest.vld_dt_fr(ssR.vld_dt_fr());
			dest.vld_dt_to(ssR.vld_dt_to());
			dest.intr_rmrks(ssR.intr_rmrks());
			dest.trd_rmrks(ssR.trd_rmrks());
			dest.trd_d_rmrks(ssR.trd_d_rmrks());
			dest.ship_cnt_rmrks(ssR.ship_cnt_rmrks());
			dest.sub_char1(ssR.sub_char1());
			dest.sub_char2(ssR.sub_char2());
			dest.sub_char3(ssR.sub_char3());
			dest.re_ship_schd_flg(ssR.re_ship_schd_flg());
			dest.not_dt_calc_flg(src.not_dt_calc_flg());
			dest.iv_chk_skip_flg(src.getBooleanNE("iv_chk_skip_flg"));
			if (MAC_DATA_CRUD_TYP.isCRT(dest.data_crud_typ())) {
				dest.dlv_cd(ssR.dlv_cd());
				dest.dlv_sundry_flg(ssR.dlv_sundry_flg());
				dest.dlv_nm(ssR.dlv_nm());
				dest.dlv_cntct_dpt(ssR.dlv_cntct_dpt());
				dest.dlv_cntct_psn(ssR.dlv_cntct_psn());
				dest.dlv_zip_cd(ssR.dlv_zip_cd());
				dest.dlv_addr1(ssR.dlv_addr1());
				dest.dlv_addr2(ssR.dlv_addr2());
				dest.dlv_addr3(ssR.dlv_addr3());
				dest.dlv_addr4(ssR.dlv_addr4());
				dest.dlv_tel(ssR.dlv_tel());
				dest.dlv_fax(ssR.dlv_fax());
				dest.dlv_lg_grp_cd(ssR.getStringNE("ss_dlv_lg_grp_cd"));
				dest.pri_prnt_flg(ssR.pri_prnt_flg());
				dest.tdlv_cd(ssR.tdlv_cd());
				dest.tdlv_sundry_flg(ssR.tdlv_sundry_flg());
				dest.tdlv_nm(ssR.tdlv_nm());
				dest.via_dlv_typ(ssR.getStringNE("ss_via_dlv_typ"));
				dest.tdlv_cntct_dpt(ssR.tdlv_cntct_dpt());
				dest.tdlv_cntct_psn(ssR.tdlv_cntct_psn());
				dest.tdlv_zip_cd(ssR.tdlv_zip_cd());
				dest.tdlv_addr1(ssR.tdlv_addr1());
				dest.tdlv_addr2(ssR.tdlv_addr2());
				dest.tdlv_addr3(ssR.tdlv_addr3());
				dest.tdlv_addr4(ssR.tdlv_addr4());
				dest.tdlv_tel(ssR.tdlv_tel());
				dest.tdlv_fax(ssR.tdlv_fax());
				dest.tdlv_lg_grp_cd(ssR.tdlv_lg_grp_cd());
				dest.dlv_day_week_typ(ssR.getStringNE("ss_dlv_day_week_typ"));
			}
		}
	}

	protected Map_Alloc_RsltR_Srch_RsltR<Alloc_RsltR,Srch_RsltR> createMap_Alloc_RsltR_Srch_RsltR() {
		return new Map_Alloc_RsltR_Srch_RsltR<Alloc_RsltR, Srch_RsltR>();
	}
	public class Map_Alloc_RsltR_Srch_RsltR<D extends Alloc_RsltR, S extends Srch_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Alloc_RsltR.$itm_cd, Srch_RsltR.$itm_cd);
			addColumnPathMap(Alloc_RsltR.$itm_sub1, Srch_RsltR.$itm_sub1);
			addColumnPathMap(Alloc_RsltR.$itm_sub2, Srch_RsltR.$itm_sub2);
			addColumnPathMap(Alloc_RsltR.$itm_sub3, Srch_RsltR.$itm_sub3);
			addColumnPathMap(Alloc_RsltR.$ver_no, Srch_RsltR.$ver_no);
			addColumnPathMap(Alloc_RsltR.$stk_loc_cd, Srch_RsltR.$stk_loc_cd);
			addColumnPathMap(Alloc_RsltR.$stk_str_ln_cd, Srch_RsltR.$stk_str_ln_cd);
			addColumnPathMap(Alloc_RsltR.$stk_lg_grp_cd, Srch_RsltR.$stk_lg_grp_cd);
			addColumnPathMap(Alloc_RsltR.$quality_typ, Srch_RsltR.$quality_typ);
			addColumnPathMap(Alloc_RsltR.$stk_insp_typ, Srch_RsltR.$stk_insp_typ);
			addColumnPathMap(Alloc_RsltR.$stk_id_typ, Srch_RsltR.$stk_id_typ);
			addColumnPathMap(Alloc_RsltR.$stk_arrv_bp_cd, Srch_RsltR.$stk_arrv_bp_cd);
			addColumnPathMap(Alloc_RsltR.$stk_bp_cd, Srch_RsltR.$stk_bp_cd);
			addColumnPathMap(Alloc_RsltR.$gd_cd, Srch_RsltR.$gd_cd);
			addColumnPathMap(Alloc_RsltR.$lot_no, Srch_RsltR.$lot_no);
			addColumnPathMap(Alloc_RsltR.$sublot_no, Srch_RsltR.$sublot_no);
			addColumnPathMap(Alloc_RsltR.$sno1, Srch_RsltR.$sno1);
			addColumnPathMap(Alloc_RsltR.$sno2, Srch_RsltR.$sno2);
			addColumnPathMap(Alloc_RsltR.$sno3, Srch_RsltR.$sno3);
			addColumnPathMap(Alloc_RsltR.$sno4, Srch_RsltR.$sno4);
			addColumnPathMap(Alloc_RsltR.$pack_unit_cd, Srch_RsltR.$pack_unit_cd);
			addColumnPathMap(Alloc_RsltR.$pack_unit_qty, Srch_RsltR.$pack_unit_qty);
			addColumnPathMap(Alloc_RsltR.$base_unit_cd, Srch_RsltR.$base_unit_cd);
			addColumnPathMap(Alloc_RsltR.$base_unit_qty, Srch_RsltR.$base_unit_qty);
			addColumnPathMap(Alloc_RsltR.$vld_dt_fr, Srch_RsltR.$vld_dt_fr);
			addColumnPathMap(Alloc_RsltR.$vld_dt_to, Srch_RsltR.$vld_dt_to);
		}
	}
	protected Map_Chk01_RsltR_MST_SHIP_ALLOC_STS_R<Chk01_RsltR,MST_SHIP_ALLOC_STS_R> createMap_Chk01_RsltR_MST_SHIP_ALLOC_STS_R() {
		return new Map_Chk01_RsltR_MST_SHIP_ALLOC_STS_R<Chk01_RsltR, MST_SHIP_ALLOC_STS_R>();
	}

	public class Map_Chk01_RsltR_MST_SHIP_ALLOC_STS_R<D extends Chk01_RsltR, S extends MST_SHIP_ALLOC_STS_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_RsltR.$alloc_sno1, MST_SHIP_ALLOC_STS_R.$sno1);
			addColumnPathMap(Chk01_RsltR.$alloc_sno2, MST_SHIP_ALLOC_STS_R.$sno2);
			addColumnPathMap(Chk01_RsltR.$alloc_sno3, MST_SHIP_ALLOC_STS_R.$sno3);
			addColumnPathMap(Chk01_RsltR.$alloc_sno4, MST_SHIP_ALLOC_STS_R.$sno4);
			addColumnPathMap(Chk01_RsltR.$alloc_ent_unit_cd, MST_SHIP_ALLOC_STS_R.$ent_unit_cd);
			addColumnPathMap(Chk01_RsltR.$alloc_ent_unit_qty, MST_SHIP_ALLOC_STS_R.$ent_unit_qty);
			addColumnPathMap(Chk01_RsltR.$base_unit_cd, MST_SHIP_ALLOC_STS_R.$base_unit_cd);
			addColumnPathMap(Chk01_RsltR.$alloc_base_unit_qty, MST_SHIP_ALLOC_STS_R.$base_unit_qty);
			addColumnPathMap(Chk01_RsltR.$alloc_flg, MST_SHIP_ALLOC_STS_R.$alloc_flg);
			addColumnPathMap(Chk01_RsltR.$loc_cd, MST_SHIP_ALLOC_STS_R.$ship_loc_cd);
			addColumnPathMap(Chk01_RsltR.$str_ln_cd, MST_SHIP_ALLOC_STS_R.$ship_str_ln_cd);
			addColumnPathMap(Chk01_RsltR.$lot_no, MST_SHIP_ALLOC_STS_R.$lot_no);
			addColumnPathMap(Chk01_RsltR.$sublot_no, MST_SHIP_ALLOC_STS_R.$sublot_no);
			addColumnPathMap(Chk01_RsltR.$ver_no, MST_SHIP_ALLOC_STS_R.$ver_no);
			addColumnPathMap(Chk01_RsltR.$ship_alloc_sts_no, MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			addColumnPathMap(Chk01_RsltR.$gd_cd, MST_SHIP_ALLOC_STS_R.$gd_cd);
			addColumnPathMap(Chk01_RsltR.$quality_typ, MST_SHIP_ALLOC_STS_R.$quality_typ);
			addColumnPathMap(Chk01_RsltR.$stk_insp_typ, MST_SHIP_ALLOC_STS_R.$stk_insp_typ);
			addColumnPathMap(Chk01_RsltR.$stk_id_typ, MST_SHIP_ALLOC_STS_R.$stk_id_typ);
			addColumnPathMap(Chk01_RsltR.$stk_bp_cd, MST_SHIP_ALLOC_STS_R.$stk_bp_cd);
			addColumnPathMap(Chk01_RsltR.$alloc_scope_typ, MST_SHIP_ALLOC_STS_R.$alloc_scope_typ);

		}
	}

	protected Map_ShipLot_DtlR_Chk01_RsltR<ShipLot_DtlR,Chk01_RsltR> createMap_ShipLot_DtlR_Chk01_RsltR() {
		return new Map_ShipLot_DtlR_Chk01_RsltR<ShipLot_DtlR, Chk01_RsltR>();
	}

	public class Map_ShipLot_DtlR_Chk01_RsltR<D extends ShipLot_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipLot_DtlR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(ShipLot_DtlR.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(ShipLot_DtlR.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(ShipLot_DtlR.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(ShipLot_DtlR.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(ShipLot_DtlR.$lot_no, Chk01_RsltR.$lot_no);
			addColumnPathMap(ShipLot_DtlR.$sublot_no, Chk01_RsltR.$sublot_no);
			addColumnPathMap(ShipLot_DtlR.$ship_schd_no, Chk01_RsltR.$ship_schd_no);

		}
	}

	// ///////////////////////////////////////////////
	// ロウマッパー（ここまで）
	// ///////////////////////////////////////////////
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 支給元の支給計上日を取得する。<br>
	 */
	public class Sprt01 extends MSBEL_ShipSchdReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			MCList<Sprt01_RsltR> dlvSlipNoL = MCList.create(Sprt01_RsltR.class);
			MCList<Sprt01_RsltR> provActNoL = MCList.create(Sprt01_RsltR.class);
			MCList<Sprt01_RsltR> retL = MCList.create(Sprt01_RsltR.class);

			for (Sprt01_RsltR r : up0()) {
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (isNull(r.base_ac_dt())) {
						if (!isNull(r.base_dlv_slip_no())) {
							dlvSlipNoL.add(r);
						}
						else if (!isNull(r.base_prov_act_no())) {
							provActNoL.add(r);
						}
					}
				}
			}

			retL.addAll(getDlvSlipNo(dlvSlipNoL));
			retL.addAll(getProvActNo(provActNoL));

			for (Sprt01_RsltR r : up0()) {
				if (!isNull(r.base_ac_dt())) {
					continue;
				}
				Sprt01_RsltR retR = null;
				if (!isNull(r.base_dlv_slip_no())) {
					retR = retL.getFirst(Sprt01_RsltR.$base_dlv_slip_no, r.base_dlv_slip_no());
				}
				else if (!isNull(r.base_prov_act_no())) {
					retR = retL.getFirst(Sprt01_RsltR.$base_prov_act_no, r.base_prov_act_no());
				}
				if (!isNull(retR)) {
					r.base_ac_dt(retR.base_ac_dt());
				}
				else {
					MCMessagePool.add(new MCMessage(r, Sprt01_RsltR.$base_ac_dt, MSBEL1104
					, r.base_dlv_slip_no()
					, r.base_prov_act_no()
					, toDispGUIIndex(r)));
				}
			}

			setDown();
		}

		protected MCList<Sprt01_RsltR> getDlvSlipNo(MCList<Sprt01_RsltR> dlvSlipNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");
			MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_SHIP_ACT_D_R t4 = MST_SHIP_ACT_D_R.create("T4");

			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);
			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(
				cases().when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value())))
					.then(t1.dlv_slip_no)
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value())))
					.then(t3.dlv_slip_no)
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value())))
					.then(t4.dlv_slip_no)
					.otherwise(t.dlv_slip_no)
					.as("base_dlv_slip_no"));
			provActR_bldr.addLeftOuterJoin(t1, t.prov_src_act_no.eq(t1.xfr_act_d_no));
			provActR_bldr.addLeftOuterJoin(t2, t.prov_src_act_no.eq(t2.arr_act_no));
			provActR_bldr.addLeftOuterJoin(t3, t2.arr_schd_no.eq(t3.arr_schd_no));
			provActR_bldr.addLeftOuterJoin(t4, t.prov_src_act_no.eq(t4.ship_act_d_no));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(bracket(
				t.dlv_slip_no.eq(bind("base_dlv_slip_no"))
				.or(t1.dlv_slip_no.eq(bind("base_dlv_slip_no")))
				.or(t3.dlv_slip_no.eq(bind("base_dlv_slip_no")))
				.or(t4.dlv_slip_no.eq(bind("base_dlv_slip_no")))
			));
			dlvSlipNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1420_MST_PROV_ACT_S01", dlvSlipNoL, provActR_bldr, dlvSlipNoL);

			return dlvSlipNoL;

		}

		protected MCList<Sprt01_RsltR> getProvActNo(MCList<Sprt01_RsltR> provActNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);
			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(t.prov_act_no.as("base_prov_act_no"));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(t.prov_act_no.eq(bind("base_prov_act_no")));
			provActNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1420_MST_PROV_ACT_S02", provActNoL, provActR_bldr, provActNoL);

			return provActNoL;

		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}