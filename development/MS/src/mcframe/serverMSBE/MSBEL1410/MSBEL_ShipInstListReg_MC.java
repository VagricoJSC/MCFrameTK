package mcframe.serverMSBE.MSBEL1410;

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
import mcframe.serverMSBE.MSBEL1410.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL1410.Query.*;
import mcframe.serverMSBE.MSBEL5530.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.commonCore.param.MCParam;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;

import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipInstListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipInstListReg_MC extends MSBEL_ShipInstListReg_MC_A{
	//FMCB CUSTOM START
	protected static final Class<MSBEL_ShipInstListReg> CLAZZ = MSBEL_ShipInstListReg.class;

	// キャッシュ
	protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache = null;
	protected void _initItmUnitCache(MCList<?> dtlL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
		_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(dbcL_bldr, dtlL,
				MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
	}
	protected static void initItmUnitCache(MCList<?> dtlL) {
		object(CLAZZ)._initItmUnitCache(dtlL);
	}
	protected static FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> getItmUnitCache() {
		if (object(CLAZZ)._itmUnitCache == null) {
			initItmUnitCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmUnitCache;
	}
	protected static MAVM_ITM_UNIT_R getItmUnit(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3, String unit_cd) {
		return getItmUnitCache().get(itm_cd, itm_sub1, itm_sub2, itm_sub3, unit_cd);
	}

	protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
	protected void _initItmCache(MCList<?> dtlL) {
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
		_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcL_bldr, dtlL,
				MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
	}
	protected static void initItmCache(MCList<?> dtlL) {
		object(CLAZZ)._initItmCache(dtlL);
	}
	protected static FXUCL_MCDbcCache<MAM_ITM_R> getItmCache() {
		if (object(CLAZZ)._itmCache == null) {
			initItmCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._itmCache;
	}
	protected static MAM_ITM_R getItm(String itm_cd, String itm_sub1, String itm_sub2, String itm_sub3) {
		return getItmCache().get(itm_cd, itm_sub1, itm_sub2, itm_sub3);
	}

	/**
	 * 出荷指図サービスのShipInst_Chk01オペレーション(ShipInst_Ins01と上り電文を共有する)
	 */
	protected MSBEL_ShipInstService.ShipInst_Chk01 _chk01Ope = null;


	/**
	 * Srch01オペレーション.<p>
	 *
	 * 出荷予定または出荷指図をヘッダ単位で検索します。<br>
	 */
	public class Srch01 extends MSBEL_ShipInstListReg_MC_A.Srch01 {
		protected MCList<Srch01_RsltR> down0_uninst;
		protected int list_no = 0;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());
			down0().addNumberColumn(Srch01_CtrlR.$ship_schd_upd_cntr);
			down0().addStringColumn(Srch01_CtrlR.$ship_pr_no);
			down0().addNumberColumn(Srch01_CtrlR.$ship_pr_upd_cntr);

			if (isSame(up0().srch_mode(), "0")) {
				if (up0().uninst()) {
					MCQueryPlan uninstSql = MSBEL1410_MST_SHIP_SCHD_S02();
					searchForDL(uninstSql, up0(), down0(), Srch01_RsltR.$ship_schd_dt, Srch01_RsltR.$ship_schd_hm);
				}
				if (up0().inst() || up0().p_ship() || up0().ship()) {
					MCQueryPlan instSql = MSBEL1410_MST_SHIP_INST_S01();
					searchForDL(instSql, up0(), down0());
				}
			}
			else if (isSame(up0().srch_mode(), "2")) {
				MCQueryPlan sql = MSBEL1410_MST_SHIP_ALLOC_STS_S02();
				searchForDL(sql, up0(), down0());
			}
			else {
				MCQueryPlan sql = MSBEL1410_MST_SHIP_ALLOC_STS_S01();
				searchForDL(sql, up0(), down0());
			}
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			
			initIvMapCache(down0());

			MCList<Srch01_RsltR> rmList = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				r.ship_schd_time(lpad(r.ship_schd_hm().getHour(), 2, "0")
						+ lpad(r.ship_schd_hm().getMinute(), 2, "0"));
				
				MCList<MST_IV_MAP_R> ivMapL = getIvMapL(r.ship_schd_no());
				if(!isNull(ivMapL)) {
					if(ivMapL.size() == 1) {
						if(ivMapL.get(0).getBooleanNE("IV_SHIP_FLG")) {
							r.iv_no(ivMapL.get(0).getStringNE("IV_NO"));
						}
					}
				}
				if(!isNull(r.iv_no())) {
					r.iv_ship_flg(true);
				}
				if(MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.alloc_scope_typ()) && r.alloc_flg()) {
					r.grp_alloc_flg(true);
					r.alloc_flg(false);
				}
				if ( !(r.getBooleanNE("cst_iv_flg") || r.iv_trd_flg()) ) {	
					r.iv_itm_nm(null);
					if(!isNull(up0().iv_itm_nm())) {
						rmList.add(r);
						continue;
					}
				}
				if(!isNull(up0().iv_no())) {
					if(isLike(r.iv_no(), up0().iv_no())) {
						continue;
					}
					rmList.add(r);
				}
			}
			down0().removeAll(rmList);

			// 未指図のみ
			if (!down0().isEmpty() && isNull(down0().get(0).ship_inst_no())) {
				// 主キーワークに対象データを登録
				MCList<MST_SHIP_SCHD_R> wkL = MCList.create(MST_SHIP_SCHD_R.class);
				for (Srch01_RsltR r : down0()) {
					MST_SHIP_SCHD_R wkR = MST_SHIP_SCHD_R.create();
					wkR.ship_schd_no(r.ship_schd_no());
					wkL.add(wkR);
				}
				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
				dbWkDelete("MSBEL1410_MSW_SHIP_SCHD_D01", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBEL1410_MSW_SHIP_SCHD_I01", wkL, wkL_bldr.getBaseDbc());
				
				// 単位重量・単位容量の取得
				MCList<Srch01_RsltR> rsltList = MCList.create(Srch01_RsltR.class);
				executeQuery(rsltList, MSBEL1410_MST_SHIP_SCHD_S03());
				MCIndexKey idxRsltList = rsltList.createIndex(Srch01_RsltR.$ship_schd_no);
				for (Srch01_RsltR r : down0()) {
					Srch01_RsltR rsltR = rsltList.getFirst(idxRsltList, r.ship_schd_no());
					r.ship_wt(rsltR.ship_wt());
					r.ship_dim(rsltR.ship_dim());
				}
				down0_uninst = down0().createInstance();
				down0_uninst.addNumberColumn(Srch01_CtrlR.$ship_schd_upd_cntr);
				down0_uninst.addStringColumn(Srch01_CtrlR.$ship_pr_no);
				down0_uninst.addNumberColumn(Srch01_CtrlR.$ship_pr_upd_cntr);
				down0_uninst.setAll(down0());

				MCList<Srch01_RsltR>[] gl = down0_uninst.groupList(getGrpCols());
				for (MCList<Srch01_RsltR> l : gl) {
					l.setNumber(Srch01_RsltR.$list_no, list_no++);
					l.setNumber(Srch01_RsltR.$num_of_details, l.size());
				}

				// 梱包不可ＦＬＧの設定
				setPackDisableFlg(down0_uninst);

				MCList<Srch01_RsltR> down0g = down0_uninst.groupBy(groupByForIns());
				down0g.sort(getGrpCols());
				down0().setAll(down0g);
				
				for (Srch01_RsltR r : down0_uninst) {
					Srch01_CtrlR down1R = Srch01_CtrlR.create();
					down1R.list_no(r.list_no());
					down1R.ship_schd_no(r.ship_schd_no());
					down1R.ship_schd_upd_cntr(r.getNumberNE(Srch01_CtrlR.$ship_schd_upd_cntr));
					down1R.ship_pr_no(r.getStringNE(Srch01_CtrlR.$ship_pr_no));
					down1R.ship_pr_upd_cntr(r.getNumberNE(Srch01_CtrlR.$ship_pr_upd_cntr));
					down1().add(down1R);
				}
			}
			else {
				if (!down0().isEmpty() && isSame(up0().srch_mode(), "0")) {
					// 主キーワークに対象データを登録
					MCList<MST_SHIP_INST_R> wkL = MCList.create(MST_SHIP_INST_R.class);
					for (Srch01_RsltR r : down0()) {
						MST_SHIP_INST_R wkR = MST_SHIP_INST_R.create();
						wkR.ship_inst_no(r.ship_inst_no());
						wkL.add(wkR);
					}
					MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
					dbWkDelete("MSBEL1410_MSW_SHIP_INST_D01", wkL_bldr.getBaseDbc());
					dbWkInsert("MSBEL1410_MSW_SHIP_INST_I01", wkL, wkL_bldr.getBaseDbc());
					
					// 単位重量・単位容量の取得
					MCList<Srch01_RsltR> rsltList = MCList.create(Srch01_RsltR.class);
					rsltList.addStringColumn("min_pr_sts_typ");
					rsltList.addStringColumn("max_pr_sts_typ");
					executeQuery(rsltList, MSBEL1410_MST_SHIP_INST_S02());
					MCIndexKey idxRsltList = rsltList.createIndex(Srch01_RsltR.$ship_inst_no);
					for (Srch01_RsltR r : down0()) {
						Srch01_RsltR rsltR = rsltList.getFirst(idxRsltList, r.ship_inst_no());
						r.ship_wt(rsltR.ship_wt());
						r.ship_dim(rsltR.ship_dim());
						r.num_of_details(rsltR.num_of_details());
						r.setStringNE("min_pr_sts_typ", rsltR.getStringNE("min_pr_sts_typ"));
						r.setStringNE("max_pr_sts_typ", rsltR.getStringNE("max_pr_sts_typ"));
					}
					
					// 抽出条件（進捗状況区分）
					down0().setAll(down0().subList(new MCRowMatcher<Srch01_RsltR>() {
						@Override
						public boolean match(Srch01_RsltR row) {
							String minPrStsTyp = row.getStringNE("min_pr_sts_typ");
							String maxPrStsTyp = row.getStringNE("max_pr_sts_typ");
							
							if (up0().inst() && MSC_PR_STS_TYP.isINST(maxPrStsTyp)) {
								return true;
							}
							if (up0().p_ship() && (!isSame(minPrStsTyp, maxPrStsTyp) || MSC_PR_STS_TYP.isPART_SHIP(maxPrStsTyp))) {
								return true;
							}
							if (up0().ship() && MSC_PR_STS_TYP.isSHIP(minPrStsTyp)) {
								return true;
							}
							if (up0().getBooleanNE("can_disp_flg")) {
								return true;
							}
							return false;
						}
					}));
				}
				if (isSame(up0().ope(), "3")) {
					setNonDlvPrntFlg(down0());
				}
				down0().addNumberColumn(Srch01_CtrlR.$ship_schd_upd_cntr);
				down0().addStringColumn(Srch01_CtrlR.$ship_pr_no);
				down0().addNumberColumn(Srch01_CtrlR.$ship_pr_upd_cntr);
			}

		}
		@Override
		protected void editListSub() {
			super.editListSub();
			
		}

		/**
		 * GroupByPolicy
		 */
		protected MCGroupByPolicy groupByForIns() {
			MCGroupByPolicy gp = new MCGroupByPolicy(getGrpCols());
			gp.sum(Srch01_RsltR.$ship_wt, Srch01_RsltR.$ship_dim);
			gp.min(Srch01_RsltR.$pack_disable_flg);
			return gp;
		}
		/**
		 * グルーピング用配列作成
		 */
		protected String[] getGrpCols() {
			return new String[]{
					Srch01_RsltR.$ship_schd_dt,
					Srch01_RsltR.$ship_schd_hm,
					Srch01_RsltR.$ship_schd_time,
					Srch01_RsltR.$dlv_schd_dt,
					Srch01_RsltR.$dlv_schd_hm,
					Srch01_RsltR.$ship_fr_lg_grp_cd,
					Srch01_RsltR.$ship_fr_lg_grp_nm,
					Srch01_RsltR.$ship_to_id_cd,
					Srch01_RsltR.$ship_to_id_nm,
					Srch01_RsltR.$ship_to_zip_cd,
					Srch01_RsltR.$ship_to_addr1,
					Srch01_RsltR.$ship_to_addr2,
					Srch01_RsltR.$ship_to_addr3,
					Srch01_RsltR.$ship_to_addr4,
					Srch01_RsltR.$ship_to_cntct_dpt,
					Srch01_RsltR.$ship_to_cntct_psn,
					Srch01_RsltR.$ship_to_tel,
					Srch01_RsltR.$ship_to_fax,
					Srch01_RsltR.$ship_to_sundry_flg,
					Srch01_RsltR.$ship_term_cd,
					Srch01_RsltR.$ship_term_nm,
					Srch01_RsltR.$ship_wk_grp_cd,
					Srch01_RsltR.$ship_wk_grp_nm,
					Srch01_RsltR.$ship_wk_cd,
					Srch01_RsltR.$ship_wk_nm,
					Srch01_RsltR.$iv_no,
					Srch01_RsltR.$iv_ship_flg,
					Srch01_RsltR.$ship_to_grp_cd1,
					Srch01_RsltR.$ship_to_grp_nm1,
					Srch01_RsltR.$ship_to_grp_cd2,
					Srch01_RsltR.$ship_to_grp_nm2,
					Srch01_RsltR.$ship_to_grp_cd3,
					Srch01_RsltR.$ship_to_grp_nm3,
					Srch01_RsltR.$ship_to_grp_cd4,
					Srch01_RsltR.$ship_to_grp_nm4,
					Srch01_RsltR.$ship_to_grp_cd5,
					Srch01_RsltR.$ship_to_grp_nm5,
					Srch01_RsltR.$ship_to_grp_cd6,
					Srch01_RsltR.$ship_to_grp_nm6,
					Srch01_RsltR.$ship_to_grp_cd7,
					Srch01_RsltR.$ship_to_grp_nm7,
					Srch01_RsltR.$ship_to_grp_cd8,
					Srch01_RsltR.$ship_to_grp_nm8,
					Srch01_RsltR.$ship_to_grp_cd9,
					Srch01_RsltR.$ship_to_grp_nm9,
					Srch01_RsltR.$ship_to_grp_cd10,
					Srch01_RsltR.$ship_to_grp_nm10,
					Srch01_RsltR.$list_no,
					Srch01_RsltR.$num_of_details,
					Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$ship_to_lg_grp_cd,
					Srch01_RsltR.$ship_to_id_typ,
					Srch01_RsltR.$ship_to_id_typ_nm,
					Srch01_RsltR.$via_dlv_typ,
					Srch01_RsltR.$dlv_id_typ,
					Srch01_RsltR.$pick_prnt_flg,
					Srch01_RsltR.$inst_prnt_flg,
					Srch01_RsltR.$adv_prnt_flg,
					Srch01_RsltR.$dlv_prnt_flg
			};
		}

		protected void setPackDisableFlg(MCList<Srch01_RsltR> down0) {
			for (Srch01_RsltR r :down0) {
				r.pack_disable_flg(!isPack_trdPtn(r.iv_trd_flg(), r.trd_ptn_typ(), r.xfr_src_typ()));
			}
		}
		protected void setNonDlvPrntFlg(MCList<Srch01_RsltR> down0) {
			if (down0.isEmpty()) {
				return;
			}
			MCList<MST_SHIP_INST_R> actL = checkShipAct(down0);
			MCIndexKey idxkey = 
				isSame(up0().srch_mode(), "2") ? 
					actL.createIndex(MST_SHIP_INST_R.$ship_inst_no, MST_DLV_SLIP_R.$dlv_slip_no) :
					actL.createIndex(MST_SHIP_INST_R.$ship_inst_no);
			for (Srch01_RsltR r :down0) {
				// 以下の条件を満たす場合、納品書および出荷案内書は発行不可
				// ・指図で発行していない
				// ・実績登録済み
				for (MST_SHIP_INST_R actR : actL.subList(idxkey, r.toArray(idxkey.getKeys()))) {
					if (!isNull(actR.getStringNE("ship_act_no"))) {
						if (!actR.dlv_prnt_flg()) {
							r.non_dlv_prnt_flg(true);
						}
						if (!actR.ship_adv_prnt_flg()) {
							r.non_adv_prnt_flg(true);
						}
					}
				}
			}
		}
		protected MCList<MST_SHIP_INST_R> checkShipAct(MCList<Srch01_RsltR> bindL) {
			MST_SHIP_INST_R dbc = MST_SHIP_INST_R.create();
			dbWkDelete("MSBEL1410_MSW_SHIP_INST_D05", dbc);
			dbWkInsert("MSBEL1410_MSW_SHIP_INST_I04", bindL, dbc);
	
			MSW_SHIP_INST_KEY_R w = MSW_SHIP_INST_KEY_R.create("W");
			MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T1");
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MST_SHIP_ACT_R t3 = MST_SHIP_ACT_R.create("T3");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(w);
			bldr.addInnerJoin(t1, t1.ship_inst_no.eq(w.ship_inst_no));
			bldr.addLeftOuterJoin(t2,
				t2.dlv_slip_no.eq(t1.dlv_slip_no)
				.and(t2.dlv_slip_seq.eq(t1.dlv_slip_seq))
			);
			bldr.addLeftOuterJoin(t3,
				t3.ship_inst_no.eq(t1.ship_inst_no).and(t3.can_flg.eq(value(false)))
			);
			bldr.setGroupBy(t1.ship_inst_no, t1.dlv_slip_no);
			bldr.addMin(t2.slip_prnt_flg, "dlv_prnt_flg");
			bldr.addMin(t2.ship_adv_prnt_flg, "ship_adv_prnt_flg");
			bldr.addMin(t3.ship_act_no, "ship_act_no");
			
			MCList<MST_SHIP_INST_R> rsltL = MCList.create(MST_SHIP_INST_R.class);
			rsltL.addStringColumn(MST_DLV_SLIP_R.$dlv_slip_no);
			rsltL.addStringColumn(MST_SHIP_ACT_R.$ship_act_no);
			dbSelect("MSBEL1410_MST_SHIP_INST_S06", rsltL, bldr);
			
			dbWkDelete("MSBEL1410_MSW_SHIP_INST_D06", dbc);
			return rsltL;
		}
	}
	
	/**
	 * 検索条件に対する一時カラムを設定する
	 * @param up
	 */
	protected void setUpTmpCol(Srch01_CndR up) {
		// 進捗状況
		if (up.uninst()) {
			up.addStringColumn("TMP_STS_NOT_INST", MSC_PR_STS_TYP.NOT_INST.value());
		}
		if (up.inst()) {
			up.addStringColumn("TMP_STS_INST", MSC_PR_STS_TYP.INST.value());
		}
		if (up.p_ship()) {
			up.addStringColumn("TMP_STS_PART_SHIP", MSC_PR_STS_TYP.PART_SHIP.value());
		}
		if (up.ship()) {
			up.addStringColumn("TMP_STS_SHIP", MSC_PR_STS_TYP.SHIP.value());
		}
		// 引当状況
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
		// 出荷予定状況
		up.addStringColumn("tmp_late_ship", toTrueStr(up.late_ship()));
		up.addStringColumn("tmp_late_rqst", toTrueStr(up.late_rqst()));
		// 帳票出力
		up.addStringColumn("tmp_pick_not_prnted", toTrueStr(up.pick_not_prnted()));
		up.addStringColumn("tmp_pick_prnted", toTrueStr(up.pick_prnted()));
		up.addStringColumn("tmp_inst_not_prnted", toTrueStr(up.inst_not_prnted()));
		up.addStringColumn("tmp_inst_prnted", toTrueStr(up.inst_prnted()));
		up.addStringColumn("tmp_dlv_not_prnted", toTrueStr(up.dlv_not_prnted()));
		up.addStringColumn("tmp_dlv_prnted", toTrueStr(up.dlv_prnted()));
		up.addStringColumn("tmp_adv_not_prnted", toTrueStr(up.adv_not_prnted()));
		up.addStringColumn("tmp_adv_prnted", toTrueStr(up.adv_prnted()));

		up.addStringColumn("tmp_pick_not_prnted_false", toFalseStr(up.pick_not_prnted()));
		up.addStringColumn("tmp_inst_not_prnted_false", toFalseStr(up.inst_not_prnted()));
		up.addStringColumn("tmp_dlv_not_prnted_false", toFalseStr(up.dlv_not_prnted()));
		up.addStringColumn("tmp_adv_not_prnted_false", toFalseStr(up.adv_not_prnted()));
		up.addStringColumn("tmp_not_wms_flg", toTrueStr(up.not_wms_flg()));
		up.addStringColumn("tmp_wms_flg", toTrueStr(up.wms_flg()));
		if (isSame(up.ope(), "3")) {
			up.addStringColumn("no_abort", toFalseStr(false));
			// 帳票発行
			up.addStringColumn("prnt_mode_flg", toTrueStr(true));
		}
		else {
			// 登録する／取り消す／参照する
			up.addStringColumn("not_prnt_mode_flg", toTrueStr(true));
		}
	}
	
	/**
	 * 下り電文の加工の共通処理
	 */
	protected void editDownCmn(Srch01_RsltR r) {
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 出荷指図登録前に事前チェックを行います。<br>
	 */
	public class Chk01 extends MSBEL_ShipInstListReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected void setErrToRtnStsTyp() {
			//super.setErrToRtnStsTyp();
			for (Chk01_DtlR r : up0()) {
				if (isNull(r.rtn_sts_typ())) {
					if (r.err_flg()) {
						r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					}
				}
				else {
					// 引当不足=WRNを設定済み
				}
			}
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 出荷予定
			msgL.addAll(chkShipPr());
			setErrFlg(msgL);
			msgL.addAll(chkShipSchd());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 出荷進捗のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkShipPr() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkShipPrCmn(notErrL);
		}
		
		/**
		 * 出荷予定のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkShipSchd() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkShipSchdCmn(notErrL);
		}

		/**
		 * 出荷進捗のロック、更新カウンタチェック（共通）
		 */
		protected MCMessageList chkShipPrCmn(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			// ロック
			MCList<Srch01_CtrlR> up1L = up1().subList(r -> isChk(r));
			MCList<MST_SHIP_PR_R> shipprL = MCList.create(MST_SHIP_PR_R.class);
			MCQueryApiBuilder shipprL_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1410_MST_SHIP_PR_S01",shipprL, shipprL_bldr, up1L);

			// 対応するレコードを取得
			MCIndexKey idxkey = shipprL.createIndex(shipprL_bldr.getBaseDbc().getKeyColumn());
			for (Chk01_DtlR r : notErrL) {
				MCList<Srch01_CtrlR> up1Lsub = up1L.subList(Srch01_CtrlR.$list_no, r.list_no());
				for (Srch01_CtrlR up1R : up1Lsub) {
					MST_SHIP_PR_R selectR = shipprL.getFirst(idxkey, up1R.ship_pr_no());
						// 更新カウンタチェック
						r.setNumberNE(Srch01_CtrlR.$ship_pr_upd_cntr, up1R.ship_pr_upd_cntr());
						MCMessageList msg = checkUpdCntrNE(r, Srch01_CtrlR.$ship_pr_upd_cntr, selectR);
						if (!msg.isEmpty()) {
							msgL.addAll(msg);
							break;
						}
				}
			}
			return msgL;
		}

		/**
		 * 出荷予定のロック、更新カウンタチェック（共通）
		 */
		protected MCMessageList chkShipSchdCmn(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			// ロック
			MCList<Srch01_CtrlR> up1L = up1().subList(r -> isChk(r));
			MCList<MST_SHIP_SCHD_R> shipschdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder shipschdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1410_MST_SHIP_SCHD_S01", shipschdL, shipschdL_bldr, up1L);

			// 対応するレコードを取得
			MCIndexKey idxkey = shipschdL.createIndex(shipschdL_bldr.getBaseDbc().getKeyColumn());
			for (Chk01_DtlR r : notErrL) {
				MCList<Srch01_CtrlR> up1Lsub = up1L.subList(Srch01_CtrlR.$list_no, r.list_no());
				for (Srch01_CtrlR up1R : up1Lsub) {
					MST_SHIP_SCHD_R selectR = shipschdL.getFirst(idxkey, up1R.ship_schd_no());
					if (!isNull(selectR)) {
						// 更新カウンタチェック
						r.setNumberNE(Srch01_CtrlR.$ship_schd_upd_cntr, up1R.ship_schd_upd_cntr());
						msgL.addAll(checkUpdCntrNE(r, Srch01_CtrlR.$ship_schd_upd_cntr, selectR));
					}
				}
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェック対象かどうか
		 */
		protected boolean isChk(Srch01_CtrlR r) {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			return !isNull(notErrL.getFirst(Chk01_DtlR.$list_no, r.list_no()));
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLgGrpCdDac(r, Chk01_DtlR.$ship_fr_lg_grp_cd));
			}
			return msgL;
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			// 出荷指図サービスのチェック処理
			if (!isNull(notErrL)) {
				callShipInst_Chk01(notErrL);
			}

			return(msgL);
		}

		/**
		 * 出荷指図サービスのチェック処理を実行する
		 */
		protected void callShipInst_Chk01(MCList<Chk01_DtlR> notErrL) {
			object(CLAZZ)._chk01Ope = MSBEL_ShipInstService.crtShipInst_Chk01();

			MSBEL_ShipInstService.ShipInst_Chk01 ope = object(CLAZZ)._chk01Ope; 
			setShipInstMessage(ope, notErrL);
			ope.exec();

			MCList<ShipInst_Chk01_DtlR>[] down1Gl = ope.down1().groupList(ShipInst_Chk01_DtlR.$hdr_dtl_peg);
			MCIndexKey dtlIdx = notErrL.createIndex(Chk01_DtlR.$list_no);
			for (MCList<ShipInst_Chk01_DtlR> l : down1Gl) {
				Chk01_DtlR dtlR = notErrL.getFirst(dtlIdx, l.get(0).hdr_dtl_peg());
				if (hasErrFlgOn(l)) {
					dtlR.err_flg(true);
				}
				else {
					if (dtlR.alloc_tgt_flg()) {
						MCList<ShipInst_Chk01_DtlR> tgtL = l.subList(ShipInst_Chk01_DtlR.$alloc_tgt_flg, true);
						// 指図明細ごとに引当できたかチェック
						int dtlCnt = 0, noAllocCnt = 0;
						for (MCList<ShipInst_Chk01_DtlR> gl : tgtL.groupList(ShipInst_Chk01_DtlR.$tmp_inst_d_no)) {
							if (!isNull(gl.getFirst(ShipInst_Chk01_DtlR.$alloc_flg, false))) {
								gl.forEach(r -> r.err_flg(true));	// 引当不足がいる場合、指図明細ごとに指図対象から除外する
								noAllocCnt++;
							}
							dtlCnt++;
						}
						if (noAllocCnt > 0) {
							dtlR.err_flg(dtlCnt == noAllocCnt);
							dtlR.rtn_sts_typ(MAC_RTN_STS_TYP.WRN.value());
							MCMessagePool.add(new MCMessage(
									dtlR, null, MSBEL0332, dtlCnt, dtlCnt - noAllocCnt, noAllocCnt, toDispGUIIndex(dtlR)));
						}
					}
				}
			}
		}

		/**
		 * 出荷指図サービスの上り電文を作成する
		 */
		protected void setShipInstMessage(MSBEL_ShipInstService.ShipInst_Chk01 ope, MCList<Chk01_DtlR> notErrL) {
			MCList<ShipInst_Chk01_HdrR> up0L = MCList.create(ShipInst_Chk01_HdrR.class);
			MCList<ShipInst_Chk01_DtlR> up1L = MCList.create(ShipInst_Chk01_DtlR.class);
			MCList<ShipSchd_Chk01_DtlR> up2L = MCList.create(ShipSchd_Chk01_DtlR.class);
			
			setShipInstMessageUp0(up0L, notErrL);
			setShipInstMessageUp1_2(up1L, up2L, notErrL, up1());
			
			ope.up0().setAll(up0L);
			ope.up1().setAll(up1L);
			ope.up2().setAll(up2L);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 出荷指図取消前に事前チェックを行います。<br>
	 */
	public class Chk02 extends MSBEL_ShipInstListReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 出荷指図
			msgL.addAll(chkShipInst());

			return msgL;
		}
		
		/**
		 * 出荷指図のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkShipInst() {
			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			
			return chkShipInstCmn(notErrL);
		}

		/**
		 * 出荷指図のロック、更新カウンタチェック（共通）
		 */
		protected MCMessageList chkShipInstCmn(MCList<Chk02_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			// ロック
			MCList<MST_SHIP_INST_R> shipinstL = MCList.create(MST_SHIP_INST_R.class);
			MCQueryApiBuilder shipinstL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1410_MST_SHIP_INST_S01", shipinstL, shipinstL_bldr, notErrL);

			// 対応するレコードを取得
			MCIndexKey idxkey = shipinstL.createIndex(shipinstL_bldr.getBaseDbc().getKeyColumn());
			for (Chk02_DtlR r : notErrL) {
				MST_SHIP_INST_R selectR = shipinstL.getFirst(idxkey, r.ship_inst_no());
				if (!isNull(selectR)) {
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_DtlR.$ship_inst_upd_cntr, selectR));
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk02_DtlR> notErrL = getChkList(up0());

			for (Chk02_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLgGrpCdDac(r, Chk02_DtlR.$ship_fr_lg_grp_cd));
			}
			return msgL;
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_DtlR> notErrL = getChkList(up0());

			// 出荷実績が登録されていないこと
			msgL.addAll(chkActNotExist(notErrL));

			// 出荷指図サービスのチェック処理
			callShipInst_Chk03(notErrL);

			return(msgL);
		}

		/**
		 * 出荷実績が登録されていないこと
		 */
		protected MCMessageList chkActNotExist(MCList<Chk02_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_SHIP_ACT_R> actL = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
			actL_bldr.addWhereWithAnd(t.ship_inst_no.eq(bind("ship_inst_no")));
			actL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBEL1410_MST_SHIP_ACT_S01", actL, actL_bldr, notErrL);
			MCIndexKey index = actL.createIndex(MST_SHIP_ACT_R.$ship_inst_no);
			for (Chk02_DtlR r : notErrL) {
				MST_SHIP_ACT_R selectR = actL.getFirst(index, r.ship_inst_no());
				if (!isNull(selectR)) {
					msgL.add(new MCMessage(r, null, MSBEL0172, r.ship_inst_no(), toDispGUIIndex(r)));
				}
			}
			return(msgL);
		}

		/**
		 * 出荷指図サービスのチェック処理を実行する
		 */
		protected void callShipInst_Chk03(MCList<Chk02_DtlR> notErrL) {
			MSBEL_ShipInstService.ShipInst_Chk03 ope = MSBEL_ShipInstService.crtShipInst_Chk03();
			addAll(ope.up0(), notErrL, createMap_ShipInst_Chk03_HdrR_Chk02_DtlR());
			ope.up1().setAll(getAllocL(notErrL));
			ope.exec();

			for (ShipInst_Chk03_HdrR r : ope.down0()) {
				if (r.err_flg()) {
					notErrL.getFirst(Chk02_DtlR.$ship_inst_no, r.ship_inst_no()).err_flg(true);
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
	 * Chk03オペレーション.<p>
	 *
	 * 出荷帳票印刷前に事前チェックを行います。<br>
	 */
	public class Chk03 extends MSBEL_ShipInstListReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 出荷指図
			msgL.addAll(chkShipInst());
			msgL.addAll(chkShipInstD());
			
			return msgL;
		}
		
		/**
		 * 出荷指図のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkShipInst() {
			MCList<Prnt01_DtlR> notErrL = getChkList(up0());

			MCMessageList msgL = new MCMessageList();

			if (notErrL.isEmpty()) {
				return msgL;
			}

			// ロック
			MCList<MST_SHIP_INST_R> instL = MCList.create(MST_SHIP_INST_R.class);

			dbSelectKeyForUpdateNoWait("MSBEL1410_MST_SHIP_INST_R S02",
					instL, MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T")), notErrL);

			// 対応するレコードを取得
			for (Prnt01_DtlR r : notErrL) {
				MST_SHIP_INST_R selectR = instL.getFirst(MST_SHIP_INST_R.$ship_inst_no, r.ship_inst_no());
				if (!isNull(selectR)) {
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Prnt01_DtlR.$ship_inst_upd_cntr, selectR));
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkShipInstD() {
			MCMessageList msgL = new MCMessageList();

			MCList<Prnt01_DtlR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_SHIP_INST_R> selectL = MCList.create(MST_SHIP_INST_R.class);
			MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_INST_D_R t1 = MST_SHIP_INST_D_R.create("T1");

			selectL.addStringColumn("base_ac_dt");
			selectL_bldr.setSelect(t.ship_inst_no);
			selectL_bldr.addSelect(t1.trd_ptn_typ,t1.base_ac_dt);
			selectL_bldr.addWhereWithAnd(t.ship_inst_no.eq(bind(Prnt01_DtlR.$ship_inst_no)));
			selectL_bldr.addLeftOuterJoin(t1,
					bracket(t1.ship_inst_no.eq(t.ship_inst_no)));
			selectL_bldr.addOrderByAscNullsFirst(t.ship_inst_no, t1.base_ac_dt);
			dbSelect("MSBEL1410_MST_SHIP_INST_S05", selectL, selectL_bldr, notErrL);

			MCIndexKey idxkey = selectL.createIndex(MST_SHIP_INST_R.$ship_inst_no);
			for (Prnt01_DtlR r : notErrL) {
				MST_SHIP_INST_R selectR = selectL.getFirst(idxkey, r.ship_inst_no());
				if (MAC_TRD_PTN_TYP.isPROV_RTN(selectR.getString("trd_ptn_typ"))) {
					if (isNull(selectR.getStringNE("base_ac_dt"))) {
						msgL.add(new MCMessage(r, null, MSBEL1105 , toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
			
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			return(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * 出荷指図サービスの上り電文Up0を作成する
	 */
	protected void setShipInstMessageUp0(MCList<ShipInst_Chk01_HdrR> up0L, MCList<Chk01_DtlR> notErrL) {
		addAll(up0L, notErrL, createMap_ShipInst_Chk01_HdrR_Chk01_DtlR());
	}

	/**
	 * 出荷指図サービスの上り電文Up1,Up2を作成する
	 */
	protected void setShipInstMessageUp1_2(MCList<ShipInst_Chk01_DtlR> up1L, MCList<ShipSchd_Chk01_DtlR> up2L,
			MCList<Chk01_DtlR> notErrL, MCList<Srch01_CtrlR> srcUp1) {
		// 出荷予定情報をデータベースから取得しておく
		MCList<MST_SHIP_SCHD_R> wkL = MCList.create(MST_SHIP_SCHD_R.class);
		MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
		dbWkDelete("MSBEL1410_MSW_SHIP_SCHD_D02", wkL_bldr.getBaseDbc());
		addAll(wkL, srcUp1, createMap_MST_SHIP_SCHD_R_Srch01_CtrlR());
		dbWkInsert("MSBEL1410_MSW_SHIP_SCHD_I02", wkL, wkL_bldr.getBaseDbc());
		
		MCList<ShipInst_Chk01_DtlR> dtlAllL = MCList.create(ShipInst_Chk01_DtlR.class);
		dtlAllL.addStringColumn(Srch01_CtrlR.$ship_schd_no);
		dtlAllL.addBooleanColumn("iv_trd_flg");
		dtlAllL.addStringColumn("dlv_id_typ");
		dtlAllL.addStringColumn("dlv_id_cd");
		dtlAllL.addStringColumn("stk_mng_typ");
		dtlAllL.addStringColumn("slo_no");
		dtlAllL.addNumberColumn("slo_d_disp_seq");
		dtlAllL.addNumberColumn("iv_d_disp_seq");
		dtlAllL.addStringColumn("def_loc_cd");
		dtlAllL.addBooleanColumn("ship_loc_prio_flg");
		executeQuery(dtlAllL, MSBEL1410_MST_SHIP_SCHD_S01());
		MCIndexKey dtlAllIdx = dtlAllL.createIndex("ship_schd_no");

		//　移送予定をデータベースから取得しておく
		MCList<MST_XFR_SCHD_R> xfrAllL = MCList.create(MST_XFR_SCHD_R.class);
		MST_XFR_SCHD_R xfrAllL_t = MST_XFR_SCHD_R.create("T");
		MCQueryApiBuilder xfrAllL_bldr = MCQueryApiBuilder.create(xfrAllL_t);
		MST_SHIP_PR_R p = MST_SHIP_PR_R.create("P");
		MST_SHIP_SCHD_R s = MST_SHIP_SCHD_R.create("S");
		xfrAllL.addStringColumn("ship_schd_no");
		xfrAllL_bldr.addSelect(s.ship_schd_no);
		xfrAllL_bldr.addInnerJoin(p, bracket(xfrAllL_t.xfr_schd_no.eq(p.xfr_schd_no)));
		xfrAllL_bldr.addInnerJoin(s, bracket(p.ship_pr_no.eq(s.ship_pr_no)));
		xfrAllL_bldr.addWhereWithAnd(s.ship_schd_no.eq(bind("ship_schd_no")));
		dbSelect("MSBEL1410_MST_XFR_SCHD_S01", xfrAllL, xfrAllL_bldr, srcUp1);
		MCIndexKey xfrAllIdx = xfrAllL.createIndex("ship_schd_no");
		
		
		int tmp_inst_d_no = 0;
		
		for (Chk01_DtlR r : notErrL) {
			int disp_seq = 1;

			// 対象の出荷予定ＮＯのリストを抽出する
			MCList<Srch01_CtrlR> schdnoL = srcUp1.subList(Srch01_CtrlR.$list_no, r.list_no());
			MCIndexKey schdnoIdx = schdnoL.createIndex("ship_schd_no");
			MCList<ShipInst_Chk01_DtlR> dtlL = MCList.create(ShipInst_Chk01_DtlR.class);
			for (Srch01_CtrlR noR : schdnoL) {
				dtlL.addAll(dtlAllL.subList(dtlAllIdx, noR.ship_schd_no()));
			}
			if (!isNull(r.iv_no())) {
				dtlL.sort("iv_d_disp_seq", "ship_schd_no", "ship_alloc_sts_no");
			}
			else {
				dtlL.sort("slo_no", "slo_d_disp_seq", "ship_schd_no", "ship_alloc_sts_no");
			}

			MCList<ShipInst_Chk01_DtlR> packL = MCList.create(ShipInst_Chk01_DtlR.class);
			packL.addStringColumn("prov_typ");
			packL.addStringColumn("prov_basis_typ");
			packL.addStringColumn("ret_prov_typ");
			packL.addStringColumn("ret_prov_basis_typ");
			packL.addStringColumn("dlv_id_typ");
			packL.addStringColumn("dlv_id_cd");
			MCList<ShipInst_Chk01_DtlR> notpackL = MCList.create(ShipInst_Chk01_DtlR.class);
			dtlL.forEach(dtlR -> {
				if (isNull(dtlR.ship_lg_grp_cd())) {	// ピッキングなしの場合は設定されていないのでヘッダの値を設定する
					dtlR.ship_lg_grp_cd(r.ship_fr_lg_grp_cd());
				}
			});

			// まとめ
			if (r.pack_flg()) {
				//　対象の移送を抽出
				MCList<MST_XFR_SCHD_R> xfrL = MCList.create(MST_XFR_SCHD_R.class);
				for (Srch01_CtrlR noR : schdnoL) {
					xfrL.addAll(xfrAllL.subList(xfrAllIdx, noR.ship_schd_no()));
				}

				//　まとめ対象と対象外に分離
				for (ShipInst_Chk01_DtlR dtlR : dtlL) {
					MST_XFR_SCHD_R xfrR = xfrL.getFirst(Srch01_CtrlR.$ship_schd_no, dtlR.getStringNE(Srch01_CtrlR.$ship_schd_no));
					if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(dtlR.alloc_scope_typ())) {
						dtlR.lot_none_flg(!r.lot_prop_flg());
					}
					else {
						if (r.lot_prop_flg()) {
							dtlR.lot_none_flg(false);
						}
						else {
							// ロット提案がオフの場合、前回の引当を再現
							if (isNullAnd(nullValToNull(dtlR.alloc_lot_no()), nullValToNull(dtlR.alloc_sublot_no()))) {
								dtlR.lot_none_flg(true);
							}
							else {
								dtlR.lot_none_flg(false);
							}
						}
					}

					if (isPack_trdPtn(dtlR, xfrR)) {
						if (!isNull(xfrR)) {
							dtlR.addStringColumn("prov_typ", xfrR.prov_typ());
							dtlR.addStringColumn("prov_basis_typ", xfrR.prov_basis_typ());
							dtlR.addStringColumn("ret_prov_typ", xfrR.ret_prov_typ());
							dtlR.addStringColumn("ret_prov_basis_typ", xfrR.ret_prov_basis_typ());
						}
						else {
							dtlR.addStringColumn("prov_typ");
							dtlR.addStringColumn("prov_basis_typ");
							dtlR.addStringColumn("ret_prov_typ");
							dtlR.addStringColumn("ret_prov_basis_typ");
						}
						packL.add(dtlR);
					}
					else {
						notpackL.add(dtlR);
					}
				}
				// 対象についてまとめ
				MCList<ShipInst_Chk01_DtlR>[] gl = packL.groupList(getGrpColsPrePack());
				for (MCList<ShipInst_Chk01_DtlR> l : gl) {
					l.setNumber(ShipInst_Chk01_DtlR.$tmp_inst_d_no, ++tmp_inst_d_no);
				}
				for (ShipInst_Chk01_DtlR packR : packL) {
					Srch01_CtrlR schdnoR = schdnoL.getFirst(schdnoIdx, packR.getStringNE(Srch01_CtrlR.$ship_schd_no));
					schdnoR.addNumberColumn(ShipInst_Chk01_DtlR.$tmp_inst_d_no, packR.tmp_inst_d_no());
					
					if (MAC_STK_MNG_TYP.isMNG(packR.getString("stk_mng_typ"))) {
						if (r.alloc_tgt_flg()) {
							// 引当ＦＬＧがオンの場合は場所引当を実施する。オフの場合は現状維持（現状引当されている場合は現状の引当範囲区分で引当処理を実施する）
							packR.alloc_tgt_flg(true);
							packR.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
						}
						else if (r.lot_prop_flg()) {
							if (packR.alloc_flg() 
								&& MAC_ALLOC_SCOPE_TYP.isLOC(packR.alloc_scope_typ())
								&& isNullOrNullVal(packR.alloc_lot_no()) ) {
								packR.alloc_tgt_flg(true);
							}
						}
					}
				}

				MCList<ShipInst_Chk01_DtlR> packedL = packL.createInstance();
				packedL = packL.groupBy(groupByForPack());

				for (ShipInst_Chk01_DtlR packedR : packedL) {
					packedR.disp_seq(disp_seq++);
					packedR.inst_bndl_flg(true);

					MAM_ITM_R itmR = getItm(packedR.itm_cd(), packedR.itm_sub1(), packedR.itm_sub2(), packedR.itm_sub3());
					MAVM_ITM_UNIT_R itmUnitR;
					if (!isNull(itmR.pckg_unit_cd())) {
						itmUnitR = getItmUnit(packedR.itm_cd(), packedR.itm_sub1(), packedR.itm_sub2(), packedR.itm_sub3(), itmR.pckg_unit_cd());
						MCNumber qty = rvrsBaseUnitConv(packedR.alloc_base_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(), MAC_RND_TYP.RNDUP.value());
						packedR.trd_unit_cd(itmR.pckg_unit_cd());
						packedR.trd_unit_qty(qty);
						packedR.alloc_base_unit_qty(
								convToBaseUnit(
										packedR.trd_unit_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
										itmR.dec_place(), itmR.rnd_typ())
								);
					}
					else {
						packedR.trd_unit_cd(packedR.base_unit_cd());
						packedR.trd_unit_qty(packedR.base_unit_qty());
					}
					packedR.alloc_base_unit_cd(packedR.base_unit_cd());
					packedR.base_unit_qty(packedR.alloc_base_unit_qty());
					packedR.alloc_ent_unit_cd(packedR.trd_unit_cd());
					packedR.alloc_ent_unit_qty(packedR.trd_unit_qty());
				}
				packedL.setAttributes(r);
				packedL.setNumber(ShipInst_Chk01_DtlR.$hdr_dtl_peg, r.list_no());
				up1L.addAll(packedL);
			}
			else {
				notpackL.addAll(dtlL);
			}
			// まとめ対象外
			String ship_schd_no = null;
			for (ShipInst_Chk01_DtlR notpackR : notpackL) {
				if (isSame(notpackR.getStringNE(Srch01_CtrlR.$ship_schd_no), ship_schd_no)) {
					notpackR.tmp_inst_d_no(tmp_inst_d_no);
				}
				else {
					notpackR.tmp_inst_d_no(++tmp_inst_d_no);
				}
				ship_schd_no = notpackR.getStringNE(Srch01_CtrlR.$ship_schd_no);
				notpackR.disp_seq(disp_seq++);
				notpackR.inst_bndl_flg(false);
				if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(notpackR.alloc_scope_typ())) {
					notpackR.lot_none_flg(!r.lot_prop_flg());
				}
				else {
					if (r.lot_prop_flg()) {
						notpackR.lot_none_flg(false);
					}
					else {
						if (isNullAnd(nullValToNull(notpackR.alloc_lot_no()), nullValToNull(notpackR.alloc_sublot_no()))) {
							notpackR.lot_none_flg(true);
						}
						else {
							notpackR.lot_none_flg(false);
						}
					}
				}

				Srch01_CtrlR noR = schdnoL.getFirst(Srch01_CtrlR.$ship_schd_no, notpackR.getStringNE(Srch01_CtrlR.$ship_schd_no));
				noR.addNumberColumn(ShipInst_Chk01_DtlR.$tmp_inst_d_no, notpackR.tmp_inst_d_no());

				if (MAC_STK_MNG_TYP.isMNG(notpackR.getString("stk_mng_typ"))) {
					if (r.alloc_tgt_flg()) {
						if (notpackR.getBoolean("ship_loc_prio_flg")
								&& MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(notpackR.alloc_scope_typ())) {
							notpackR.alloc_loc_cd(notpackR.getString("def_loc_cd"));
							notpackR.alloc_str_ln_cd(null);
						}
						// 引当ＦＬＧがオンの場合は場所引当を実施する。オフの場合は現状維持（現状引当されている場合は現状の引当範囲区分で引当処理を実施する）
						notpackR.alloc_tgt_flg(true);
						notpackR.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
					}
					else if (r.lot_prop_flg()) {
						if (notpackR.alloc_flg() 
							&& MAC_ALLOC_SCOPE_TYP.isLOC(notpackR.alloc_scope_typ())
							&& isNullOrNullVal(notpackR.alloc_lot_no())) {
							notpackR.alloc_tgt_flg(true);
						}
					}
				}
			}
			notpackL.setAttributes(r);
			notpackL.setNumber(ShipInst_Chk01_DtlR.$hdr_dtl_peg, r.list_no());
			up1L.addAll(notpackL);

			// up2
			for (Srch01_CtrlR noR : schdnoL) {
				ShipSchd_Chk01_DtlR destR = ShipSchd_Chk01_DtlR.create();
				destR.tmp_inst_d_no(noR.getNumber(ShipInst_Chk01_DtlR.$tmp_inst_d_no));
				destR.ship_pr_no(noR.ship_pr_no());
				destR.ship_schd_no(noR.ship_schd_no());
				destR.hdr_dtl_peg(r.list_no());
				up2L.add(destR);
			}
		}

		// 共通
		setPegNo(up1L);
		up1L.setStringNE(ShipInst_Chk01_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
		up1L.setBooleanNE(ShipInst_Chk01_DtlR.$abort_flg, false);
		setWmsFlg(up1L);
	}

	/**
	 * まとめ対象かどうか
	 */
	protected boolean isPack_trdPtn(ShipInst_Chk01_DtlR r, MST_XFR_SCHD_R xfrR) {
		return isPack_trdPtn(r.getBooleanNE("iv_trd_flg"), r.trd_ptn_typ(), xfrR == null ? null : xfrR.xfr_src_typ());
	}

	/**
	 * まとめ対象かどうか
	 */
	protected boolean isPack_trdPtn(boolean iv_trd_flg, String trd_ptn_typ, String xfr_src_typ) {
		if (iv_trd_flg) return false;
		
		if (MAC_TRD_PTN_TYP.isXFR(trd_ptn_typ) || MAC_TRD_PTN_TYP.isPROV(trd_ptn_typ)) {
			if (!isNull(xfr_src_typ)) {
				if (!(MSC_XFR_SRC_TYP.isWG_RQST(xfr_src_typ) || MSC_XFR_SRC_TYP.isSLO(xfr_src_typ))) {
					return true;
				}
			}
		}
		else if (MAC_TRD_PTN_TYP.isXFR_RTN(trd_ptn_typ)) return true;
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(trd_ptn_typ)) return true;

		return false;
	}
	
	/**
	 * まとめ用GroupByPolicy
	 */
	protected MCGroupByPolicy groupByForPack() {
		MCGroupByPolicy gp = new MCGroupByPolicy(getGrpColsPack());
		gp.sum(ShipInst_Chk01_DtlR.$alloc_base_unit_qty);
		gp.max(ShipInst_Chk01_DtlR.$valid_dt_from);
		gp.min(ShipInst_Chk01_DtlR.$valid_dt_to);
		return gp;
	}
	/**
	 * まとめ用グルーピング用配列作成
	 */
	protected String[] getGrpColsPrePack() {
		return new String[]{
				ShipInst_Chk01_DtlR.$ship_lg_grp_cd,
				ShipInst_Chk01_DtlR.$trd_cd,
				ShipInst_Chk01_DtlR.$trd_ptn_typ,
				ShipInst_Chk01_DtlR.$itm_cd,
				ShipInst_Chk01_DtlR.$itm_sub1,
				ShipInst_Chk01_DtlR.$itm_sub2,
				ShipInst_Chk01_DtlR.$itm_sub3,
				ShipInst_Chk01_DtlR.$itm_nm,
				ShipInst_Chk01_DtlR.$iv_itm_nm,
				ShipInst_Chk01_DtlR.$sundry_itm_flg,
				ShipInst_Chk01_DtlR.$sno1,
				ShipInst_Chk01_DtlR.$sno1_null_flg,
				ShipInst_Chk01_DtlR.$sno2,
				ShipInst_Chk01_DtlR.$sno2_null_flg,
				ShipInst_Chk01_DtlR.$sno3,
				ShipInst_Chk01_DtlR.$sno3_null_flg,
				ShipInst_Chk01_DtlR.$sno4,
				ShipInst_Chk01_DtlR.$sno4_null_flg,
				ShipInst_Chk01_DtlR.$stk_arrv_bp_cd,
				ShipInst_Chk01_DtlR.$gd_cd,
				ShipInst_Chk01_DtlR.$quality_typ,
				ShipInst_Chk01_DtlR.$stk_insp_typ,
				ShipInst_Chk01_DtlR.$stk_id_typ,
				ShipInst_Chk01_DtlR.$stk_bp_cd,
				ShipInst_Chk01_DtlR.$base_unit_cd,
				ShipInst_Chk01_DtlR.$rsn_cd,
				ShipInst_Chk01_DtlR.$bd_dpt_cd,
				ShipInst_Chk01_DtlR.$not_lot_mix_flg,
				ShipInst_Chk01_DtlR.$not_sublot_mix_flg,
				ShipInst_Chk01_DtlR.$skip_chk_ship_flg,
				ShipInst_Chk01_DtlR.$tmp_inst_d_no,
				"prov_typ",
				"prov_basis_typ",
				"ret_prov_typ",
				"ret_prov_basis_typ",
				"dlv_id_typ",
				"dlv_id_cd"

		};
	}
	/**
	 * まとめ用グルーピング用配列作成
	 */
	protected String[] getGrpColsPack() {
		return new String[]{
				ShipInst_Chk01_DtlR.$alloc_loc_cd,
				ShipInst_Chk01_DtlR.$alloc_str_ln_cd,
				ShipInst_Chk01_DtlR.$ship_lg_grp_cd,
				ShipInst_Chk01_DtlR.$trd_cd,
				ShipInst_Chk01_DtlR.$trd_ptn_typ,
				ShipInst_Chk01_DtlR.$itm_cd,
				ShipInst_Chk01_DtlR.$itm_sub1,
				ShipInst_Chk01_DtlR.$itm_sub2,
				ShipInst_Chk01_DtlR.$itm_sub3,
				ShipInst_Chk01_DtlR.$itm_nm,
				ShipInst_Chk01_DtlR.$iv_itm_nm,
				ShipInst_Chk01_DtlR.$sundry_itm_flg,
				ShipInst_Chk01_DtlR.$sno1,
				ShipInst_Chk01_DtlR.$sno1_null_flg,
				ShipInst_Chk01_DtlR.$sno2,
				ShipInst_Chk01_DtlR.$sno2_null_flg,
				ShipInst_Chk01_DtlR.$sno3,
				ShipInst_Chk01_DtlR.$sno3_null_flg,
				ShipInst_Chk01_DtlR.$sno4,
				ShipInst_Chk01_DtlR.$sno4_null_flg,
				ShipInst_Chk01_DtlR.$alloc_sno1,
				ShipInst_Chk01_DtlR.$alloc_sno2,
				ShipInst_Chk01_DtlR.$alloc_sno3,
				ShipInst_Chk01_DtlR.$alloc_sno4,
				ShipInst_Chk01_DtlR.$alloc_lot_no,
				ShipInst_Chk01_DtlR.$alloc_sublot_no,
				ShipInst_Chk01_DtlR.$alloc_ver_no,
				ShipInst_Chk01_DtlR.$stk_arrv_bp_cd,
				ShipInst_Chk01_DtlR.$gd_cd,
				ShipInst_Chk01_DtlR.$quality_typ,
				ShipInst_Chk01_DtlR.$stk_insp_typ,
				ShipInst_Chk01_DtlR.$stk_id_typ,
				ShipInst_Chk01_DtlR.$stk_bp_cd,
				ShipInst_Chk01_DtlR.$base_unit_cd,
				ShipInst_Chk01_DtlR.$rsn_cd,
				ShipInst_Chk01_DtlR.$bd_dpt_cd,
				ShipInst_Chk01_DtlR.$not_lot_mix_flg,
				ShipInst_Chk01_DtlR.$not_sublot_mix_flg,
				ShipInst_Chk01_DtlR.$skip_chk_ship_flg,
				ShipInst_Chk01_DtlR.$tmp_inst_d_no,
				ShipInst_Chk01_DtlR.$alloc_tgt_flg,
				ShipInst_Chk01_DtlR.$alloc_scope_typ,
				ShipInst_Chk01_DtlR.$lot_none_flg,
				"prov_typ",
				"prov_basis_typ",
				"ret_prov_typ",
				"ret_prov_basis_typ",
				"dlv_id_typ",
				"dlv_id_cd"

		};
	}
	/**
	 * WMS対象フラグを取得・設定する
	 */
	protected void setWmsFlg(MCList<ShipInst_Chk01_DtlR> up1L) {

		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

		for (ShipInst_Chk01_DtlR up1R : up1L) {

			SCMLinkUtil_Srch01_CndR r = o.up0().add();
			r.peg_no(up1R.peg_no());
			r.if_proc_typ(MAC_IF_PROC_TYP.WMS_SHIP_INST_SEND.value());
			r.loc_cd(up1R.alloc_loc_cd());
			r.lg_grp_cd(up1R.ship_lg_grp_cd());
			if (MSC_DLV_ID_TYP.isDLV(up1R.getStringNE("dlv_id_typ"))) {
				r.dlv_cd(up1R.getStringNE("dlv_id_cd"));
			}
			else if (MSC_DLV_ID_TYP.isLOC(up1R.getStringNE("dlv_id_typ"))) {
				r.gr_loc_cd(up1R.getStringNE("dlv_id_cd"));
			}
			r.master_dt(getToday());
		}
		if (!o.up0().isEmpty()) {
			o.exec();

			MCIndexKey idx = o.down0().createIndex(SCMLinkUtil_Srch01_CndR.$peg_no);
			for (ShipInst_Chk01_DtlR up1R : up1L) {
				SCMLinkUtil_Srch01_CndR dR = o.down0().getFirst(idx, up1R.peg_no());
				if (!isNull(dR)) {
					up1R.wms_flg(!isNull(dR.ext_sys_cd()));
				}
			}
		}
	}

	/**
	 * 取消対象の出荷引当状況を取得する
	 */
	protected MCList<ShipInst_Chk03_DtlR> getAllocL(MCList<Chk02_DtlR> notErrL) {
		MCList<MST_SHIP_ALLOC_STS_R> dbc = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MST_SHIP_ALLOC_STS_R t = MST_SHIP_ALLOC_STS_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_SHIP_SCHD_R t1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
		dbc_bldr.setSelect(
				t.ship_inst_no,
				t.ship_alloc_sts_no,
				t.ship_loc_cd
		);
		dbc_bldr.addSelect(
				t1.ship_fr_lg_grp_cd,
				t2.dlv_id_typ,
				nvl(t1.dlv_cd, t2.dlv_id_cd).as("dlv_id_cd")
		);
		dbc_bldr.addInnerJoin(t1, bracket(t1.ship_inst_d_no.eq(t.ship_inst_d_no)));
		dbc_bldr.addInnerJoin(t2, bracket(t2.ship_pr_no.eq(t1.ship_pr_no)));
		dbc_bldr.setWhere(t.ship_inst_no.eq(bind("ship_inst_no")));
		dbSelect("MSBEL1410_MST_SHIP_ALLOC_STS_S01",
				dbc, dbc_bldr, notErrL.groupBy(ShipInst_Chk01_DtlR.$ship_inst_no));

		MCList<ShipInst_Chk01_DtlR> list = MCList.create(ShipInst_Chk01_DtlR.class);
		dbc.forEach(r -> {
			ShipInst_Chk01_DtlR rr = list.add();
			rr.ship_inst_no(r.ship_inst_no());
			rr.ship_alloc_sts_no(r.ship_alloc_sts_no());
			rr.alloc_loc_cd(r.ship_loc_cd());
			rr.ship_lg_grp_cd(r.getString("ship_fr_lg_grp_cd"));
			rr.setStringNE("dlv_id_typ", r.getString("dlv_id_typ"));
			rr.setStringNE("dlv_id_cd", r.getString("dlv_id_cd"));
		});
		setPegNo(list);

		setWmsFlg(list);

		MCList<ShipInst_Chk03_DtlR> up1L = MCList.create(ShipInst_Chk03_DtlR.class);
		list.forEach(r -> {
			ShipInst_Chk03_DtlR up1R = up1L.add();
			up1R.ship_inst_no(r.ship_inst_no());
			up1R.ship_alloc_sts_no(r.ship_alloc_sts_no());
			up1R.wms_flg(r.wms_flg());
		});

		return up1L;
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 出荷指図を登録します。<br>
	 */
	public class Ins01 extends MSBEL_ShipInstListReg_MC_A.Ins01 {
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
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				// オペレーション実行
				callShipInst_Ins01(notErrL);
				
				// ピッキングリスト印刷
				callShipRprt_Prnt02(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
			addNotPickDtl();
		}

		/**
		 * ピッキングなしの明細を追加する
		 */
		protected void addNotPickDtl() {
			MCList<Srch01_CtrlR> up1Lsub = up1().subList(r -> isUpd(r));

			// 出荷指図対象と同一の受注ＮＯで、受注明細の出荷指図区分がピッキングなし、かつ進捗状況区分が未指図の出荷予定を取得
			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MST_SHIP_SCHD_R orgShipSchd = MST_SHIP_SCHD_R.create("ORGSS");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(orgShipSchd);
			MST_SHIP_PR_R p1 = MST_SHIP_PR_R.create("P");
			MST_SLO_D_R sd = MST_SLO_D_R.create("SD");
			MST_SLO_D_R sd2 = MST_SLO_D_R.create("SD2");
			MST_SHIP_PR_R p2 = MST_SHIP_PR_R.create("P2");
			MST_IV_R iv = MST_IV_R.create("IV");
			MST_IV_D_R ivd = MST_IV_D_R.create("IVD");
			MST_IV_R iv2 = MST_IV_R.create("IV2");
			MST_IV_D_R ivd2 = MST_IV_D_R.create("IVD2");
			schdL.addStringColumn("org_pr_no");
			schdL.addNumberColumn("ship_pr_upd_cntr");
			schdL_bldr.setSelect(t.ship_schd_no, t.ship_pr_no, t.upd_cntr);
			schdL_bldr.addSelect(p2.ship_pr_no.as("org_pr_no"));
			schdL_bldr.addSelect(p1.upd_cntr.as("ship_pr_upd_cntr"));
			schdL_bldr.addInnerJoin(p2, bracket(orgShipSchd.ship_pr_no.eq(p2.ship_pr_no)));
			schdL_bldr.addInnerJoin(sd2, bracket(p2.slo_d_no.eq(sd2.slo_d_no)));
			schdL_bldr.addInnerJoin(sd,
					bracket(sd.slo_no.eq(sd2.slo_no)));
			schdL_bldr.addInnerJoin(p1, bracket(sd.slo_d_no.eq(p1.slo_d_no)
					.and(p1.ship_to_id_typ.eq(
							nvl2(orgShipSchd.tdlv_cd, value(MSC_SHIP_TO_ID_TYP.TDLV.value()), p2.ship_to_id_typ)))
					.and(p1.ship_to_id_cd.eq(
							nvl(nvl(orgShipSchd.tdlv_cd,
									decode(p2.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											orgShipSchd.dlv_cd, nullValue())),
									p2.ship_to_id_cd)))
					.and(p1.ship_to_id_nm.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_nm,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_nm, p2.ship_to_id_nm),
									p2.ship_to_id_nm)))
							.or(p1.ship_to_id_nm.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_nm,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_nm, p2.ship_to_id_nm),
									p2.ship_to_id_nm)).isNull()))
					.and(p1.ship_to_zip_cd.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_zip_cd,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_zip_cd, p2.ship_to_zip_cd),
									p2.ship_to_zip_cd)))
							.or(p1.ship_to_zip_cd.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_zip_cd,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_zip_cd, p2.ship_to_zip_cd),
									p2.ship_to_zip_cd)).isNull()))
					.and(p1.ship_to_addr1.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_addr1,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_addr1, p2.ship_to_addr1),
									p2.ship_to_addr1)))
							.or(p1.ship_to_addr1.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_addr1,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_addr1, p2.ship_to_addr1),
									p2.ship_to_addr1)).isNull()))
					.and(p1.ship_to_addr2.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_addr2,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_addr2, p2.ship_to_addr2),
									p2.ship_to_addr2)))
							.or(p1.ship_to_addr2.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_addr2,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_addr2, p2.ship_to_addr2),
									p2.ship_to_addr2)).isNull()))
					.and(p1.ship_to_addr3.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_addr3,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_addr3, p2.ship_to_addr3),
									p2.ship_to_addr3)))
							.or(p1.ship_to_addr3.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_addr3,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_addr3, p2.ship_to_addr3),
									p2.ship_to_addr3)).isNull()))
					.and(p1.ship_to_addr4.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_addr4,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_addr4, p2.ship_to_addr4),
									p2.ship_to_addr4)))
							.or(p1.ship_to_addr4.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_addr4,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_addr4, p2.ship_to_addr4),
									p2.ship_to_addr4)).isNull()))
					.and(p1.ship_to_cntct_dpt.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_cntct_dpt,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_cntct_dpt, p2.ship_to_cntct_dpt),
									p2.ship_to_cntct_dpt)))
							.or(p1.ship_to_cntct_dpt.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_cntct_dpt,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_cntct_dpt, p2.ship_to_cntct_dpt),
									p2.ship_to_cntct_dpt)).isNull()))
					.and(p1.ship_to_cntct_psn.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_cntct_psn,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_cntct_psn, p2.ship_to_cntct_psn),
									p2.ship_to_cntct_psn)))
							.or(p1.ship_to_cntct_psn.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_cntct_psn,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_cntct_psn, p2.ship_to_cntct_psn),
									p2.ship_to_cntct_psn)).isNull()))
					.and(p1.ship_to_tel.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_tel,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_tel, p2.ship_to_tel),
									p2.ship_to_tel)))
							.or(p1.ship_to_tel.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_tel,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_tel, p2.ship_to_tel),
									p2.ship_to_tel)).isNull()))
					.and(p1.ship_to_fax.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_fax,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_fax, p2.ship_to_fax),
									p2.ship_to_fax)))
							.or(p1.ship_to_fax.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_fax,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_fax, p2.ship_to_fax),
									p2.ship_to_fax)).isNull()))
					.and(p1.via_dlv_typ.eq(nvl(orgShipSchd.via_dlv_typ, p2.via_dlv_typ))
							.or(p1.via_dlv_typ.isNull())
							.and(nvl(orgShipSchd.via_dlv_typ, p2.via_dlv_typ).isNull()))
					.and(p1.ship_to_lg_grp_cd.eq(
							nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_lg_grp_cd,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_lg_grp_cd, p2.ship_to_lg_grp_cd),
									p2.ship_to_lg_grp_cd)))
							.or(p1.ship_to_lg_grp_cd.isNull())
							.and(nvl2(orgShipSchd.tdlv_cd, 
									orgShipSchd.tdlv_lg_grp_cd,
									decode(p2.ship_to_id_typ, value(MSC_SHIP_TO_ID_TYP.DLV.value()), nvl2(orgShipSchd.dlv_cd, orgShipSchd.dlv_lg_grp_cd, p2.ship_to_lg_grp_cd),
									p2.ship_to_lg_grp_cd)).isNull()))));
			schdL_bldr.addInnerJoin(sd, bracket(p1.slo_d_no.eq(sd.slo_d_no)));
			schdL_bldr.addInnerJoin(t, bracket(p1.ship_pr_no.eq(t.ship_pr_no)));
			schdL_bldr.addLeftOuterJoin(ivd, bracket(ivd.slo_d_no.eq(sd2.slo_d_no)));
			schdL_bldr.addLeftOuterJoin(iv, bracket(iv.iv_mng_no.eq(ivd.iv_mng_no)));
			schdL_bldr.addLeftOuterJoin(ivd2, bracket(ivd2.slo_d_no.eq(sd.slo_d_no)));
			schdL_bldr.addLeftOuterJoin(iv2, bracket(iv2.iv_mng_no.eq(ivd2.iv_mng_no)));
			schdL_bldr.addWhereWithAnd(orgShipSchd.ship_schd_no.eq(bind("ship_schd_no")));
			schdL_bldr.addWhereWithAnd(
					sd.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NO_PICK.value())));
			schdL_bldr.addWhereWithAnd(
					t.pr_sts_typ.eq(value(MSC_PR_STS_TYP.NOT_INST.value())));
			schdL_bldr.addWhereWithAnd(sd.can_flg.eq(value(false)));
			schdL_bldr.addWhereWithAnd(sd2.can_flg.eq(value(false)));
			schdL_bldr.addWhereWithAnd(bracket(sd.set_itm_grp_no.isNull()
					.or(sd.set_itm_grp_no.eq(sd2.set_itm_grp_no))));
			schdL_bldr.addWhereWithAnd(t.abort_flg.eq(value(false)));
			schdL_bldr.addWhereWithAnd(iv.iv_no.eq(iv2.iv_no).or(iv.iv_no.isNull().and(iv2.iv_no.isNull())));
			dbSelect("MSBEL1410_MST_SHIP_SCHD_S02", schdL, schdL_bldr, up1Lsub);

			if (schdL.isEmpty()) return;
			
			MCGroupByPolicy p = new MCGroupByPolicy(MST_SHIP_SCHD_R.$ship_schd_no, MST_SHIP_SCHD_R.$ship_pr_no, MST_SHIP_SCHD_R.$upd_cntr, "ship_pr_upd_cntr");
			p.min("org_pr_no");
			schdL = schdL.groupBy(p);
			
			MCList<Srch01_CtrlR> tmpL = MCList.create(Srch01_CtrlR.class);
			for (MST_SHIP_SCHD_R schdR : schdL) {
				Srch01_CtrlR selectR = up1Lsub.getFirst(Srch01_CtrlR.$ship_pr_no, schdR.getStringNE("org_pr_no"));
				Srch01_CtrlR addR = selectR.clone();
				addR.ship_schd_no(schdR.ship_schd_no());
				addR.ship_schd_upd_cntr(schdR.upd_cntr());
				addR.ship_pr_no(schdR.ship_pr_no());
				addR.ship_pr_upd_cntr(schdR.getNumberNE("ship_pr_upd_cntr"));
				tmpL.add(addR);
			}
			up1().addAll(tmpL.groupBy(Srch01_CtrlR.colnames()));
		}

		/**
		 * 更新対象かどうか判断する
		 */
		protected boolean isUpd(Srch01_CtrlR r) {
			Chk01_DtlR selectR = up0().getFirst(Chk01_DtlR.$list_no, r.list_no());
			return !isNull(selectR);
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_ShipInstListReg.Chk01 ope = MSBEL_ShipInstListReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 出荷指図サービスの更新処理を実行する
		 */
		protected void callShipInst_Ins01(MCList<Chk01_DtlR> notErrL) {
			MCSortPolicy sp = new MCSortPolicy();
			// 出庫日が直近のものに対して優先して引当するために、日付でソートする
			sp.add(MCList.SortType.ASC, Chk01_DtlR.$ship_schd_tm);
			sp.add(MCList.SortType.ASC, Chk01_DtlR.$dlv_schd_tm);
			notErrL.sort(sp);

			callShipInst_Ins01_sub(notErrL);
			
			// 元の並び順に戻す
			sp = new MCSortPolicy();
			sp.add(MCList.SortType.ASC, Chk01_DtlR.$peg_no);
			notErrL.sort(sp);
		}

		/**
		 * 出荷指図サービスの更新処理を実行する
		 */
		protected void callShipInst_Ins01_sub(MCList<Chk01_DtlR> notErrL) {
			MSBEL_ShipInstService.ShipInst_Ins01 ope = MSBEL_ShipInstService.crtShipInst_Ins01();
			setShipInstMessage(ope, notErrL);
			ope.exec();

			copyByPegNo(notErrL, ope.down0(),
					Chk01_DtlR.$list_no, new String[] {Chk01_DtlR.$ship_inst_no},
					ShipInst_Chk01_HdrR.$hdr_dtl_peg, new String[] {ShipInst_Chk01_HdrR.$ship_inst_no});
		}

		/**
		 * 出荷指図サービスの上り電文を作成する
		 */
		protected void setShipInstMessage(MSBEL_ShipInstService.ShipInst_Ins01 ope, MCList<Chk01_DtlR> notErrL) {
			MCIndexKey
				idx0 = object(CLAZZ)._chk01Ope.down0().createIndex(ShipInst_Chk01_HdrR.$hdr_dtl_peg),
				idx1 = object(CLAZZ)._chk01Ope.down1().createIndex(ShipInst_Chk01_DtlR.$hdr_dtl_peg, ShipInst_Chk01_DtlR.$err_flg),
				idx2 = object(CLAZZ)._chk01Ope.down2().createIndex(ShipSchd_Chk01_DtlR.$tmp_inst_d_no);

			// チェック処理の下り電文から上り電文を作成する
			for (Chk01_DtlR r : notErrL) {
				ShipInst_Chk01_HdrR d0 = object(CLAZZ)._chk01Ope.down0().getFirst(idx0, r.list_no());
				MCList<ShipInst_Chk01_DtlR> d1 = object(CLAZZ)._chk01Ope.down1().subList(idx1, d0.hdr_dtl_peg(), false);
				MCList<ShipSchd_Chk01_DtlR> d2 = MCList.create(ShipSchd_Chk01_DtlR.class);
				d1.groupBy(ShipInst_Chk01_DtlR.$tmp_inst_d_no).forEach(rr -> {
					d2.addAll(object(CLAZZ)._chk01Ope.down2().subList(idx2, rr.tmp_inst_d_no()));
				});
				d1.sort(ShipInst_Chk01_DtlR.$disp_seq);

				ope.up0().add(d0);
				ope.up1().addAll(d1);
				ope.up2().addAll(d2);
			}

			ope.up3().bndl_prnt_flg(!up2().indiv_prnt_flg());	// 個別発行でない＝まとめ発行
			ope.up3().bndl_inst_prnt_flg(!up2().indiv_inst_prnt_flg());
		}

		/**
		 * ピッキングリストを印刷する
		 */
		protected void callShipRprt_Prnt02(MCList<Chk01_DtlR> notErrL) {
			MCList<Chk01_DtlR> l = notErrL.subList(r -> r.pick_prnt_flg());
			if (l.isEmpty()) return;
			
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt02();
			addAll(o.up0(), l, createMap_ShipRprt_Prnt02_HdrR_Chk01_DtlR());
			o.exec();

			MCList<MST_SHIP_INST_R> instL = MCList.create(MST_SHIP_INST_R.class);
			MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t);
			addAll(instL, l, createMap_MST_SHIP_INST_R_Chk01_DtlR());
			instL_bldr.setSet(t.pick_prnt_flg, t.pick_prnt_tm);
			dbUpdateKey("MSBEL1410_U_MST_SHIP_INST_U01", instL, instL_bldr);
			preCallRevDataIns01(instL);
		}
		
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 * @param up0L
		 */
		protected void preCallRevDataIns01(MCList<MST_SHIP_INST_R> argL) {
			MCList<MST_SHIP_INST_R> wkL = MCList.create(MST_SHIP_INST_R.class);
			for (MST_SHIP_INST_R r : argL) {
				MST_SHIP_INST_R wkR = MST_SHIP_INST_R.create();
				wkR.ship_inst_no(r.ship_inst_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbWkDelete("MSBEL1410_MSW_SHIP_INST_D03", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL1410_MSW_SHIP_INST_I02",
					wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), wkL_bldr.getBaseDbc());
			
			callRevDataIns01();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			MCList<T> ret = (MCList<T>) up1();
			return ret;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			MCIndexKey idx = up1().createIndex(Srch01_CtrlR.$list_no);
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), up1(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				MCList<Srch01_CtrlR> up1L = ((MCList<Srch01_CtrlR>)ope.up(1));
				up0L.setAll(l);
				for (Chk01_DtlR r :l) {
					MCList<Srch01_CtrlR> up1Lsub = up1().subList(idx, r.list_no());
					up1L.addAll(up1Lsub);
				}
				MCRow.copyvalue((Ins01_CndR)ope.up(2), up2());
				opeL.add(ope);
			}
			return opeL;
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 出荷指図を取り消します。<br>
	 */
	public class Del01 extends MSBEL_ShipInstListReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess2(up0());
			}
			catch (Exception e) {
				handleEx2(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			editUp();
			
			callThisChk02();
			MCList<Chk02_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// オペレーション実行
				callShipInst_Del01(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			for (Chk02_DtlR r : up0()) {
				r.setStatus(MCRow.Status.DELETE);
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBEL_ShipInstListReg.Chk02 ope = MSBEL_ShipInstListReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 出荷指図サービスの取消処理を実行する
		 */
		protected void callShipInst_Del01(MCList<Chk02_DtlR> notErrL) {
			MSBEL_ShipInstService.ShipInst_Del01 ope = MSBEL_ShipInstService.crtShipInst_Del01();
			addAll(ope.up0(), notErrL, createMap_ShipInst_Chk03_HdrR_Chk02_DtlR());
			ope.up1().setAll(getAllocL(notErrL));
			ope.up2().bndl_prnt_flg(!up1().indiv_prnt_flg());
			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			for (Chk02_DtlR r : up0()) {
				r.setStatus(MCRow.Status.NONE);
			}
			down0().setAll(up0());
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 出荷帳票を印刷します。<br>
	 */
	public class Prnt01 extends MSBEL_ShipInstListReg_MC_A.Prnt01 {
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
			
			callThisChk03();
			
			callShipRprt_Prnt02();
			callShipRprt_Prnt01();
			
			updPrntFlg();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBEL_ShipInstListReg.Chk03 ope = MSBEL_ShipInstListReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		protected void callShipRprt_Prnt01() {
			MCList<Prnt01_DtlR> notErrL = up0().subList(Prnt01_DtlR.$err_flg, false);
			if (notErrL.isEmpty()) return;
			
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01
				ope = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			
			MCList<MST_SHIP_ALLOC_STS_P_R> rsltL = getPrntTgtL(notErrL);
			MCIndexKey idx = notErrL.createIndex(Prnt01_DtlR.$ship_inst_no);
			for (MST_SHIP_ALLOC_STS_P_R actDR : rsltL) {
				Prnt01_DtlR up0R = notErrL.getFirst(idx, actDR.ship_inst_no());
				
				ShipRprt_Prnt01_HdrR prntR = ope.up0().add();
				prntR.peg_no(up0R.peg_no());
				prntR.dlv_slip_no(actDR.dlv_slip_no());
				prntR.dlv_slip_seq(actDR.dlv_slip_seq());
				prntR.dlv_slip_prnt_flg(up0R.dlv_prnt_flg());
				prntR.ship_adv_prnt_flg(up0R.adv_prnt_flg());
				prntR.inc_can_flg(true);
				prntR.setAttributes(up0R);
			}
			ope.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());	// 個別発行でない＝まとめ発行
			ope.exec();
			copyErrFlg(up0(), ope.down0());
		}
		
		protected MCList<MST_SHIP_ALLOC_STS_P_R> getPrntTgtL(MCList<Prnt01_DtlR> notErrL) {
			shipInstWkDel();
			shipInstWkIns(notErrL);
			
			// 上り電文の出荷指図ＮＯ、改訂番号に対応する納品書ＮＯ、連番を取得する
			MST_SHIP_INST_R t1 = MST_SHIP_INST_R.create("T1");
			MCTempView w = createTempView("W");
			MSW_SHIP_INST_KEY_R w1 = MSW_SHIP_INST_KEY_R.create("W1");
			MST_SHIP_INST_R w2 = MST_SHIP_INST_R.create("W2");
			MST_SHIP_ALLOC_STS_P_R w3 = MST_SHIP_ALLOC_STS_P_R.create("W3");
			MST_SHIP_ALLOC_STS_P_R w4 = MST_SHIP_ALLOC_STS_P_R.create("W4");
			MST_SHIP_ALLOC_STS_P_R w5 = MST_SHIP_ALLOC_STS_P_R.create("W5");
			MST_DLV_SLIP_R w6 = MST_DLV_SLIP_R.create("W6");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(
				t1.ship_inst_no,
				w.pr("dlv_slip_no").as("dlv_slip_no"),
				w.pr("dlv_slip_seq").as("dlv_slip_seq")
			);
			bldr.addInnerJoin(w1, w1.ship_inst_no.eq(t1.ship_inst_no));
			bldr.addInnerJoin(
				subQuery()
				.select(
					w3.ship_inst_no,
					w3.dlv_slip_no,
					w3.dlv_slip_seq.add(
							decode(w2.can_flg, value(false), value(0), value(1))
					).as("dlv_slip_seq")
				)
				.from(w1
					.innerJoin(w2).on(w2.ship_inst_no.eq(w1.ship_inst_no))
					.innerJoin(w3).on(
						w3.ship_inst_no.eq(w2.ship_inst_no)
						.and(w3.ship_inst_rev.eq(w2.ship_inst_rev)))
				)
				.unionAll(
					// 最新の改訂番号で行削除された分の納品書ＮＯを取得するための結合
					// ただし指図が取り消されている場合は不要（なのでcan_flgを条件に追加している）
					subQuery()
					.select(
						w4.ship_inst_no,
						w4.dlv_slip_no,
						subQuery()
							.select(max(w6.dlv_slip_seq))
							.from(w6)
							.where(w6.dlv_slip_no.eq(w4.dlv_slip_no)
							.and(w6.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
						).as("dlv_slip_seq")
					)
					.from(w1
						.innerJoin(w2).on(w2.ship_inst_no.eq(w1.ship_inst_no))
						.innerJoin(w4).on(
							w4.ship_inst_no.eq(w2.ship_inst_no)
							.and(w4.ship_inst_rev.eq(w2.ship_inst_rev.subtract(value(1)))))
					)
					.where(
						notExists(
							subQuery()
							.select(value("x"))
							.from(w5)
							.where(
								w5.ship_inst_no.eq(w2.ship_inst_no)
								.and(w5.ship_inst_rev.eq(w2.ship_inst_rev))
								.and(w5.dlv_slip_no.eq(w4.dlv_slip_no)))
						)
						.and(w2.can_flg.eq(value(false)))
					)
				).view(w), w.pr("ship_inst_no").eq(t1.ship_inst_no)
			);
			bldr.addWhereWithCutOffAnd(bracket(
				w.pr("dlv_slip_no").eq(bind("dlv_slip_no"))
				.and(w.pr("dlv_slip_seq").eq(bind("dlv_slip_seq")))
			));
			
			MCList<MST_SHIP_ALLOC_STS_P_R> rsltL = MCList.create(MST_SHIP_ALLOC_STS_P_R.class);
			dbSelect("MSBEL1410_MST_SHIP_INST_S04", rsltL, bldr, notErrL);
			
			shipInstWkDel();
			return rsltL;
		}
		protected void shipInstWkDel() {
			dbWkDelete("MSBEL1410_MSW_SHIP_INST_KEY_D01", MST_SHIP_INST_R.create());
		}
		protected void shipInstWkIns(MCList<Prnt01_DtlR> notErrL) {
			dbWkInsert(
				"MSBEL1410_MSW_SHIP_INST_KEY_I01",
				notErrL
					.subList(r -> r.dlv_prnt_flg() || r.adv_prnt_flg())
					.groupBy(Prnt01_DtlR.$ship_inst_no),
				MST_SHIP_INST_R.create()
			);
		}
		
		/**
		 * 印刷処理を実行する
		 */
		protected void callShipRprt_Prnt02() {
			MCList<Prnt01_DtlR> notErrL = up0().subList(Prnt01_DtlR.$err_flg, false);
			if (notErrL.isEmpty()) return;
			
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt02();
			addAll(o.up0(), notErrL, createMap_ShipRprt_Prnt02_HdrR_Prnt01_DtlR());
			o.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());	// 個別発行でない＝まとめ発行
			o.up1().bndl_inst_prnt_flg(!up1().indiv_inst_prnt_flg());
			o.exec();
			copyErrFlg(up0(), o.down0());
		}

		/**
		 * 発行ＦＬＧ設定
		 */
		protected void updPrntFlg() {
			MCList<Prnt01_DtlR> notErrL = up0().subList(Prnt01_DtlR.$err_flg, false);
			if (notErrL.isEmpty()) return;

			MCList<MST_SHIP_INST_R> instL = MCList.create(MST_SHIP_INST_R.class);
			MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t);
			addAll(
				instL,
				notErrL.distinctNE(Prnt01_DtlR.$ship_inst_no),
				createMap_MST_SHIP_INST_R_Prnt01_DtlR()
			);
			if (notErrL.get(0).pick_prnt_flg()) {
				instL_bldr.setSet(t.pick_prnt_flg, t.pick_prnt_tm);
				dbUpdateKey("MSBEL1410_MST_SHIP_INST_U02", instL, instL_bldr);
				preCallRevDataIns01(instL);
			}
			if (notErrL.get(0).inst_prnt_flg()) {
				instL_bldr.setSet(t.ship_inst_prnt_flg, t.ship_inst_prnt_tm);
				dbUpdateKey("MSBEL1410_MST_SHIP_INST_U03", instL, instL_bldr);
				preCallRevDataIns01(instL);
			}
			if (notErrL.get(0).adv_prnt_flg()) {
				instL_bldr.setSet(t.ship_adv_prnt_flg, t.ship_adv_prnt_tm);
				dbUpdateKey("MSBEL1410_MST_SHIP_INST_U04", instL, instL_bldr);
				preCallRevDataIns01(instL);
			}
			if (notErrL.get(0).dlv_prnt_flg()) {
				instL_bldr.setSet(t.dlv_prnt_flg, t.dlv_prnt_tm);
				dbUpdateKey("MSBEL1410_MST_SHIP_INST_U05", instL, instL_bldr);
				preCallRevDataIns01(instL);
			}
		}
		
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void preCallRevDataIns01(MCList<MST_SHIP_INST_R> argL) {
			MCList<MST_SHIP_INST_R> wkL = MCList.create(MST_SHIP_INST_R.class);
			for (MST_SHIP_INST_R r : argL) {
				MST_SHIP_INST_R wkR = MST_SHIP_INST_R.create();
				wkR.ship_inst_no(r.ship_inst_no());
				wkL.add(wkR);
			}

			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbWkDelete("MSBEL1410_MSW_SHIP_INST_D04", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL1410_MSW_SHIP_INST_I03",
					wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), wkL_bldr.getBaseDbc());
			
			callRevDataIns01();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected void handleSuccess(MCList<Prnt01_DtlR> l) {
			dbTran().commit();
			for (Prnt01_DtlR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e,
				MCList<Prnt01_DtlR> l) {
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
			for (Prnt01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
	}

	/**
	 * 出荷進捗ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param up0L クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> up0L, MCList<Srch01_CtrlR> up1L, int max) {
		List<MCList<Chk01_DtlR>> arr = new ArrayList<>();
		MCIndexKey
			up0Idx = up0L.createIndex(Chk01_DtlR.$list_no),
			up1PrIdx = up1L.createIndex(Srch01_CtrlR.$ship_pr_no),
			up1ListIdx = up1L.createIndex(Srch01_CtrlR.$list_no);

		Map<Chk01_DtlR, Srch01_CtrlR> o = new HashMap<>();
		for (Chk01_DtlR up0R : up0L) {
			if (o.containsKey(up0R)) {	// 追加済みは除く
				continue;
			}

			MCList<Chk01_DtlR> grpL = MCList.create(Chk01_DtlR.class);
			grpL.add(up0R);
			o.put(up0R, null);	// 追加済み

			for (Srch01_CtrlR up1R : up1L.subList(up1ListIdx, up0R.list_no())) {
	
				// 出荷進捗NOが同一のモノも同じグループに含める(スレッドを分けない)
				for (Srch01_CtrlR r : up1L.subList(up1PrIdx, up1R.ship_pr_no())) {

					Chk01_DtlR rr = up0L.getFirst(up0Idx, r.list_no());
					if (!o.containsKey(rr)) {
						grpL.add(rr);
						o.put(rr, null);	// 追加済み
					}
				}
			}
			if (!grpL.isEmpty()) {
				arr.add(grpL);
			}
		}

		List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
		MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
		for (MCList<Chk01_DtlR> grp : arr) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Chk01_DtlR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}
	
	protected void handleSuccess(MCList<Chk01_DtlR> l) {
		dbTran().commit();
		for (Chk01_DtlR r : l) {
			if (isNull(r.rtn_sts_typ())) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			else {
				// 引当不足=WRNを設定済み
			}
		}
	}

	protected void handleEx(Exception e,
			MCList<Chk01_DtlR> l) {
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
		for (Chk01_DtlR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}
	
	protected void handleSuccess2(MCList<Chk02_DtlR> l) {
		dbTran().commit();
		for (Chk02_DtlR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected void handleEx2(Exception e,
			MCList<Chk02_DtlR> l) {
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
		for (Chk02_DtlR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}
	
	/**
	 * 自身のワークテーブルを設定後、本メソッドを呼び出す
	 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
	 * @param up0L
	 */
	protected void callRevDataIns01() {
		
		MCList<MST_SHIP_INST_R> hdrL = MCList.create(MST_SHIP_INST_R.class);
		MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
		MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t);
		MSW_SHIP_INST_KEY_R w = MSW_SHIP_INST_KEY_R.create("W");
		hdrL_bldr.setSelect(t.ship_inst_no, t.ship_inst_rev);
		hdrL_bldr.addInnerJoin(w, bracket( t.ship_inst_no.eq(w.ship_inst_no)));
		dbSelect("MSBEL1410_MST_SHIP_INST_S03", hdrL, hdrL_bldr);
		
		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		for (MST_SHIP_INST_R hdrR : hdrL) {
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(hdrR.ship_inst_no());
			opeR.rev_no(hdrR.ship_inst_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_INST.value());
			ope.up0().add(opeR);
		}
		ope.exec();
	}

	protected Map_ShipInst_Chk01_HdrR_Chk01_DtlR<ShipInst_Chk01_HdrR,Chk01_DtlR> createMap_ShipInst_Chk01_HdrR_Chk01_DtlR() {
		return new Map_ShipInst_Chk01_HdrR_Chk01_DtlR<ShipInst_Chk01_HdrR, Chk01_DtlR>();
	}

	public class Map_ShipInst_Chk01_HdrR_Chk01_DtlR<D extends ShipInst_Chk01_HdrR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_fr_lg_grp_cd, Chk01_DtlR.$ship_fr_lg_grp_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$wg_cd, Chk01_DtlR.$wg_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_term_cd, Chk01_DtlR.$ship_term_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_wk_cd, Chk01_DtlR.$ship_wk_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_schd_tm, Chk01_DtlR.$ship_schd_tm);
			addColumnPathMap(ShipInst_Chk01_HdrR.$dlv_schd_tm, Chk01_DtlR.$dlv_schd_tm);
			addColumnPathMap(ShipInst_Chk01_HdrR.$inst_dpt_cd, Chk01_DtlR.$inst_dpt_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$inst_usr_cd, Chk01_DtlR.$inst_usr_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_inst_tm, Chk01_DtlR.$ship_inst_tm);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_lg_grp_cd, Chk01_DtlR.$ship_to_lg_grp_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_id_typ, Chk01_DtlR.$ship_to_id_typ);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_id_cd, Chk01_DtlR.$ship_to_id_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_id_nm, Chk01_DtlR.$ship_to_id_nm);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_zip_cd, Chk01_DtlR.$ship_to_zip_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_addr1, Chk01_DtlR.$ship_to_addr1);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_addr2, Chk01_DtlR.$ship_to_addr2);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_addr3, Chk01_DtlR.$ship_to_addr3);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_addr4, Chk01_DtlR.$ship_to_addr4);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_cntct_dpt, Chk01_DtlR.$ship_to_cntct_dpt);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_cntct_psn, Chk01_DtlR.$ship_to_cntct_psn);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_tel, Chk01_DtlR.$ship_to_tel);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_fax, Chk01_DtlR.$ship_to_fax);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_sundry_flg, Chk01_DtlR.$ship_to_sundry_flg);
			addColumnPathMap(ShipInst_Chk01_HdrR.$via_dlv_typ, Chk01_DtlR.$via_dlv_typ);
			addColumnPathMap(ShipInst_Chk01_HdrR.$iv_no, Chk01_DtlR.$iv_no);
			addColumnPathMap(ShipInst_Chk01_HdrR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
			addColumnPathMap(ShipInst_Chk01_HdrR.$inst_rmrks, Chk01_DtlR.$inst_rmrks);
			addColumnPathMap(ShipInst_Chk01_HdrR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(ShipInst_Chk01_HdrR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(ShipInst_Chk01_HdrR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_prnt_flg, Chk01_DtlR.$inst_prnt_flg);
			addColumnPathMap(ShipInst_Chk01_HdrR.$dlv_prnt_flg, Chk01_DtlR.$dlv_prnt_flg);
			addColumnPathMap(ShipInst_Chk01_HdrR.$adv_prnt_flg, Chk01_DtlR.$adv_prnt_flg);
			addColumnPathMap(ShipInst_Chk01_HdrR.$hdr_dtl_peg, Chk01_DtlR.$list_no);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			// ピッキングリストは後でまとめて印刷するのでサービスにはfalseを渡す
			dest.pck_prnt_flg(false);
			// 指図一覧からの呼び出し
			dest.is_src_shipinst_list_flg(true);
		}
	}

	protected Map_ShipInst_Chk03_HdrR_Chk02_DtlR<ShipInst_Chk03_HdrR,Chk02_DtlR> createMap_ShipInst_Chk03_HdrR_Chk02_DtlR() {
		return new Map_ShipInst_Chk03_HdrR_Chk02_DtlR<ShipInst_Chk03_HdrR, Chk02_DtlR>();
	}

	public class Map_ShipInst_Chk03_HdrR_Chk02_DtlR<D extends ShipInst_Chk03_HdrR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipInst_Chk03_HdrR.$ship_inst_no, Chk02_DtlR.$ship_inst_no);
			addColumnPathMap(ShipInst_Chk03_HdrR.$dlv_prnt_flg, Chk02_DtlR.$dlv_prnt_flg);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			// 指図一覧からの呼び出し
			dest.is_src_shipinst_list_flg(true);
		}
	}

	protected Map_MST_SHIP_SCHD_R_Srch01_CtrlR<MST_SHIP_SCHD_R,Srch01_CtrlR> createMap_MST_SHIP_SCHD_R_Srch01_CtrlR() {
		return new Map_MST_SHIP_SCHD_R_Srch01_CtrlR<MST_SHIP_SCHD_R, Srch01_CtrlR>();
	}

	public class Map_MST_SHIP_SCHD_R_Srch01_CtrlR<D extends MST_SHIP_SCHD_R, S extends Srch01_CtrlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SHIP_SCHD_R.$ship_schd_no, Srch01_CtrlR.$ship_schd_no);

		}
	}

	protected Map_ShipRprt_Prnt02_HdrR_Prnt01_DtlR<ShipRprt_Prnt02_HdrR,Prnt01_DtlR> createMap_ShipRprt_Prnt02_HdrR_Prnt01_DtlR() {
		return new Map_ShipRprt_Prnt02_HdrR_Prnt01_DtlR<ShipRprt_Prnt02_HdrR, Prnt01_DtlR>();
	}

	public class Map_ShipRprt_Prnt02_HdrR_Prnt01_DtlR<D extends ShipRprt_Prnt02_HdrR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$ship_inst_no, Prnt01_DtlR.$ship_inst_no);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$inst_prnt_flg, Prnt01_DtlR.$inst_prnt_flg);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$pick_prnt_flg, Prnt01_DtlR.$pick_prnt_flg);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$peg_no, Prnt01_DtlR.$peg_no);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trn_typ(MSC_TRN_TYP.SHIP.value());
			dest.xfr_inst_no(null);
		}
	}

	protected Map_MST_SHIP_INST_R_Prnt01_DtlR<MST_SHIP_INST_R,Prnt01_DtlR> createMap_MST_SHIP_INST_R_Prnt01_DtlR() {
		return new Map_MST_SHIP_INST_R_Prnt01_DtlR<MST_SHIP_INST_R, Prnt01_DtlR>();
	}

	public class Map_MST_SHIP_INST_R_Prnt01_DtlR<D extends MST_SHIP_INST_R, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SHIP_INST_R.$ship_inst_no, Prnt01_DtlR.$ship_inst_no);
			addColumnPathMap(MST_SHIP_INST_R.$pick_prnt_flg, Prnt01_DtlR.$pick_prnt_flg);
			addColumnPathMap(MST_SHIP_INST_R.$ship_inst_prnt_flg, Prnt01_DtlR.$inst_prnt_flg);
			addColumnPathMap(MST_SHIP_INST_R.$ship_adv_prnt_flg, Prnt01_DtlR.$adv_prnt_flg);
			addColumnPathMap(MST_SHIP_INST_R.$dlv_prnt_flg, Prnt01_DtlR.$dlv_prnt_flg);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pick_prnt_tm(MCDate.now());
			dest.ship_inst_prnt_tm(MCDate.now());
			dest.ship_adv_prnt_tm(MCDate.now());
			dest.dlv_prnt_tm(MCDate.now());
		}
	}

	protected Map_ShipRprt_Prnt02_HdrR_Chk01_DtlR<ShipRprt_Prnt02_HdrR,Chk01_DtlR> createMap_ShipRprt_Prnt02_HdrR_Chk01_DtlR() {
		return new Map_ShipRprt_Prnt02_HdrR_Chk01_DtlR<ShipRprt_Prnt02_HdrR, Chk01_DtlR>();
	}

	public class Map_ShipRprt_Prnt02_HdrR_Chk01_DtlR<D extends ShipRprt_Prnt02_HdrR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$ship_inst_no, Chk01_DtlR.$ship_inst_no);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$pick_prnt_flg, Chk01_DtlR.$pick_prnt_flg);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$peg_no, Chk01_DtlR.$peg_no);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.trn_typ(MSC_TRN_TYP.SHIP.value());
			dest.xfr_inst_no(null);
			dest.inst_prnt_flg(false);
		}
	}

	protected Map_MST_SHIP_INST_R_Chk01_DtlR<MST_SHIP_INST_R,Chk01_DtlR> createMap_MST_SHIP_INST_R_Chk01_DtlR() {
		return new Map_MST_SHIP_INST_R_Chk01_DtlR<MST_SHIP_INST_R, Chk01_DtlR>();
	}

	public class Map_MST_SHIP_INST_R_Chk01_DtlR<D extends MST_SHIP_INST_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SHIP_INST_R.$ship_inst_no, Chk01_DtlR.$ship_inst_no);
			addColumnPathMap(MST_SHIP_INST_R.$pick_prnt_flg, Chk01_DtlR.$pick_prnt_flg);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.pick_prnt_tm(MCDate.now());
		}
	}

	/**
	 * インボイスマップを元にインボイスヘッダのデータをキャッシュする
	 * @param bindL 検索結果のリスト
	 */
	protected void initIvMapCache(MCList<Srch01_RsltR> bindL) {
		MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
		MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
		dbWkDelete("MSBEL1410_MSW_SHIP_SCHD_D03", shipSchdL_bldr.getBaseDbc());
		for (Srch01_RsltR r : bindL) {
			MST_SHIP_SCHD_R shipSchdR = MST_SHIP_SCHD_R.create();
			shipSchdR.ship_schd_no(r.ship_schd_no());
			shipSchdL.add(shipSchdR);
		}
		
		_ivMapL = MCList.create(MST_IV_MAP_R.class);
		_ivMapL.addBooleanColumn("IV_SHIP_FLG");
		if(!isNull(shipSchdL)) {
			MST_IV_MAP_R ivMapL_t = MST_IV_MAP_R.create("T");
			MCQueryApiBuilder ivMapL_bldr = MCQueryApiBuilder.create(ivMapL_t);
			dbWkInsert("MSBEL1410_MSW_IV_MAP_I01", shipSchdL, shipSchdL_bldr.getBaseDbc());
			
			MSW_SHIP_SCHD_KEY_R t2 = MSW_SHIP_SCHD_KEY_R.create("T2");
			MST_IV_D_R t3 = MST_IV_D_R.create("T3");
			MST_IV_R t4 = MST_IV_R.create("T4");
			ivMapL_bldr.setSelect(ivMapL_t.ship_schd_no, t4.iv_no, t4.iv_ship_flg);
			ivMapL_bldr.addInnerJoin(t2, bracket(t2.ship_schd_no.eq(ivMapL_t.ship_schd_no)));
			ivMapL_bldr.addInnerJoin(t3, bracket(t3.iv_d_no.eq(ivMapL_t.iv_d_no)));
			ivMapL_bldr.addInnerJoin(t4, bracket(t4.iv_mng_no.eq(t3.iv_mng_no)));
			dbSelect("MSBEL1410_MST_IV_MAP_S01", _ivMapL, ivMapL_bldr);
		}
		_ivMapKey = _ivMapL.createIndex("SHIP_SCHD_NO");
	}
	MCList<MST_IV_MAP_R> _ivMapL;
	MCIndexKey _ivMapKey;
	protected MCList<MST_IV_MAP_R> getIvMapL(String shipSchdNo) {
		return _ivMapL.subList(_ivMapKey, shipSchdNo);
	}

	//FMCB CUSTOM END
}