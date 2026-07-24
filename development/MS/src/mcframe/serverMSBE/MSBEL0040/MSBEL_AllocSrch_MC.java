package mcframe.serverMSBE.MSBEL0040;

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
import mcframe.serverMSBE.MSBEL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL0040.Query.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5060.*;
import mcframe.serverMSBE.MSBEL5060.CndR;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_AllocSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_AllocSrch_MC extends MSBEL_AllocSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 在庫推移情報を検索する<br>
	 */
	public class Srch01 extends MSBEL_AllocSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected boolean isDelFlgCtl() {
			return super.isDelFlgCtl();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd();
			srchInvTrans();
		}

		protected void editCnd() {
			editSno(up0());
		}

		protected void srchInvTrans() {
			if (isSame(up0().ope(), "1")) {
				MSBEL_InvTransService.InvTrans_Srch01 invTransSv = MSBEL_InvTransService.crtInvTrans_Srch01();
				copy(invTransSv.up0(), up0(), createMap_CndR_Srch01_CndR());
				invTransSv.exec();
				setDownInvTrans(invTransSv.down1());
			}
			else if (isSame(up0().ope(), "2")) {
				MSBEL_InvTransService.InvTrans_Srch02 invTransSv = MSBEL_InvTransService.crtInvTrans_Srch02();
				copy(invTransSv.up0(), up0(), createMap_CndR_Srch01_CndR());
				invTransSv.exec();
				setDownInvTrans(invTransSv.down1());
			}
			else if (isSame(up0().ope(), "3")) {
				MSBEL_InvTransService.InvTrans_Srch03 invTransSv = MSBEL_InvTransService.crtInvTrans_Srch03();
				copy(invTransSv.up0(), up0(), createMap_CndR_Srch01_CndR());
				invTransSv.exec();
				setDownInvTrans(invTransSv.down1());
			}
		}

		protected void setDownInvTrans(MCList<RsltR> down1) {
			MCDate dtFr = up0().dt_fr().addDay(-1);
			for (RsltR r :down1) {
				if (isSame(r.dt(), dtFr) || !r.gr_schd_qty().isZero() || !r.gr_act_qty().isZero() || !r.stk_qty().isZero()) {
					Srch01_RsltGrR down2 = down2().add();
					copy(down2, r, createMap_Srch01_RsltGrR_RsltR());

					if (isSame(r.dt(), dtFr)) {
						down2.schd_stk_typ(MSC_SCHD_STK_TYP.STK.value());
						down2.qty(r.stk_qty().add(r.gr_schd_qty()).add(r.gr_act_qty()).subtract(r.gi_schd_qty()).subtract(r.gi_act_qty()));
						down2.alloc_qty(MCNumber.ZERO);
						down2.grs_alloc_avl_qty(down2.qty());
					}
					else if (!r.gr_schd_qty().isZero()) {
						down2.schd_stk_typ(MSC_SCHD_STK_TYP.GR_SCHD.value());
						down2.qty(r.gr_schd_qty());
						down2.alloc_qty(MCNumber.ZERO);
						down2.grs_alloc_avl_qty(down2.qty());
					}
					else if (!r.gr_act_qty().isZero()) {
						down2.schd_stk_typ(MSC_SCHD_STK_TYP.GR_ACT.value());
						down2.qty(r.gr_act_qty());
						down2.alloc_qty(MCNumber.ZERO);
						down2.grs_alloc_avl_qty(down2.qty());
					}
					else if (!r.stk_qty().isZero()) {
						down2.schd_stk_typ(MSC_SCHD_STK_TYP.STK.value());
						down2.qty(r.stk_qty());
						down2.alloc_qty(MCNumber.ZERO);
						down2.grs_alloc_avl_qty(down2.qty());
					}
					// 計算用
					down2.base_unit_alloc_qty(down2.alloc_qty());
					down2.base_unit_wait_qty(MCNumber.ZERO);
					down2.base_unit_avl_qty(down2.grs_alloc_avl_qty());
				}
				else if (!r.gi_schd_qty().isZero() || !r.gi_act_qty().isZero()) {
					Srch01_RsltGrR down3 = down3().add();
					copy(down3, r, createMap_Srch01_RsltGrR_RsltR());

					if (!r.gi_schd_qty().isZero()) {
						down3.schd_stk_typ(MSC_SCHD_STK_TYP.GI_SCHD.value());
						down3.qty(r.gi_schd_qty());
						down3.alloc_qty(MCNumber.ZERO);
						down3.grs_alloc_avl_qty(down3.qty());
					}
					else if (!r.gi_act_qty().isZero()) {
						down3.schd_stk_typ(MSC_SCHD_STK_TYP.GI_ACT.value());
						down3.qty(r.gi_act_qty());
						down3.alloc_qty(MCNumber.ZERO);
						down3.grs_alloc_avl_qty(down3.qty());
					}
					// 計算用
					down3.base_unit_alloc_qty(down3.alloc_qty());
					down3.base_unit_wait_qty(MCNumber.ZERO);
					down3.base_unit_avl_qty(down3.grs_alloc_avl_qty());
				}
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down2().isEmpty() && down3().isEmpty()) {
				return;
			}

			doCalc(down2(), down3());

			// 名称などマスタ値の取得
			getMst(up0(), down2(), down3());

			// 実際／標準有効成分の設定
//			setContQty(down2(), down3());

			// ヘッダ項目の設定
			setHdrQty(down0(), down2(), down3());
//			setHdrContFctr(down1(), down2(), down3());
		}

		protected void doCalc(MCList<Srch01_RsltGrR> grList, MCList<Srch01_RsltGrR> giList) {

			String[] key = getKey();
			MCIndexKey idx = grList.createIndex(key);
			boolean flg;

			for (MCList<Srch01_RsltGrR> l :giList.groupList(key)) {
				// マッチングを行い在庫、入庫予定を抽出する
				MCList<Srch01_RsltGrR> extGrList = grList.subList(idx, l.get(0).toArray(key));
				
				for (Srch01_RsltGrR giRow :l) {
					flg = false;
	
					// マッチした在庫数量＋入庫予定数量から出庫予定数量を引き算する
					for (Srch01_RsltGrR grRow :extGrList) {
						if (grRow.grs_alloc_avl_qty().lte(MCNumber.ZERO)) {
							continue;
						}
	
						// 出庫予定数量 <= 在庫数量＋入庫予定数量
						if (giRow.grs_alloc_avl_qty().lte(grRow.grs_alloc_avl_qty())) {
							grRow.alloc_qty(grRow.alloc_qty().add(giRow.grs_alloc_avl_qty()));
							grRow.grs_alloc_avl_qty(grRow.grs_alloc_avl_qty().subtract(giRow.grs_alloc_avl_qty()));
							giRow.alloc_qty(giRow.qty());
							giRow.grs_alloc_avl_qty(MCNumber.ZERO);
							flg = true;
						}
						// 在庫数量＋入庫予定数量 < 出庫予定数量
						else {
							giRow.alloc_qty(giRow.alloc_qty().add(grRow.grs_alloc_avl_qty()));
							giRow.grs_alloc_avl_qty(giRow.grs_alloc_avl_qty().subtract(grRow.grs_alloc_avl_qty()));
							grRow.alloc_qty(grRow.qty());
							grRow.grs_alloc_avl_qty(MCNumber.ZERO);
						}
						// 計算用
						grRow.base_unit_alloc_qty(grRow.alloc_qty());
						grRow.base_unit_wait_qty(MCNumber.ZERO);
						grRow.base_unit_avl_qty(grRow.grs_alloc_avl_qty());
	
						// 数量が足りていれば次の出庫予定の処理に移る
						if (flg) break;
					}
					// 計算用
					giRow.base_unit_alloc_qty(giRow.alloc_qty());
					giRow.base_unit_wait_qty(MCNumber.ZERO);
					giRow.base_unit_avl_qty(giRow.grs_alloc_avl_qty());
				}
			}
		}

		protected String[] getKey() {
			// 比較カラムの定義
			return new String[]{
//					Srch01_RsltGrR.$itm_cd, Srch01_RsltGrR.$itm_sub1, Srch01_RsltGrR.$itm_sub2, Srch01_RsltGrR.$itm_sub3,
//					Srch01_RsltGrR.$lot_no, Srch01_RsltGrR.$sublot_no,
					Srch01_RsltGrR.$loc_cd, Srch01_RsltGrR.$str_ln_cd,
//					Srch01_RsltGrR.$gd_cd, Srch01_RsltGrR.$quality_typ, Srch01_RsltGrR.$stk_insp_typ,
					Srch01_RsltGrR.$sno1, Srch01_RsltGrR.$sno2, Srch01_RsltGrR.$sno3, Srch01_RsltGrR.$sno4,
//					Srch01_RsltGrR.$in_xfr_typ, Srch01_RsltGrR.$asst_typ, Srch01_RsltGrR.$stk_id_typ, Srch01_RsltGrR.$stk_bp_cd
					};
		}

		protected Map_CndR_Srch01_CndR<CndR,Srch01_CndR> createMap_CndR_Srch01_CndR() {
			return new Map_CndR_Srch01_CndR<CndR, Srch01_CndR>();
		}

		public class Map_CndR_Srch01_CndR<D extends CndR, S extends Srch01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CndR.$gr_prcd_flg, Srch01_CndR.$gr_prcd);
				addColumnPathMap(CndR.$gr_sts_opn_grp_flg, Srch01_CndR.$gr_sts_opn_grp);
				addColumnPathMap(CndR.$gr_sts_ordsav_grp_flg, Srch01_CndR.$gr_sts_ordsav_grp);
				addColumnPathMap(CndR.$gr_sts_fix_grp_flg, Srch01_CndR.$gr_sts_fix_grp);
				addColumnPathMap(CndR.$gr_sts_schd_grp_flg, Srch01_CndR.$gr_sts_schd_grp);
				addColumnPathMap(CndR.$gr_sts_ord_grp_flg, Srch01_CndR.$gr_sts_ord_grp);
				addColumnPathMap(CndR.$gr_act_flg, Srch01_CndR.$gr_act);
				addColumnPathMap(CndR.$gi_prcd_flg, Srch01_CndR.$gi_prcd);
				addColumnPathMap(CndR.$gi_sts_opn_grp_flg, Srch01_CndR.$gi_sts_opn_grp);
				addColumnPathMap(CndR.$gi_sts_ordsav_grp_flg, Srch01_CndR.$gi_sts_ordsav_grp);
				addColumnPathMap(CndR.$gi_sts_fix_grp_flg, Srch01_CndR.$gi_sts_fix_grp);
				addColumnPathMap(CndR.$gi_sts_schd_grp_flg, Srch01_CndR.$gi_sts_schd_grp);
				addColumnPathMap(CndR.$gi_sts_ord_grp_flg, Srch01_CndR.$gi_sts_ord_grp);
				addColumnPathMap(CndR.$gi_act_flg, Srch01_CndR.$gi_act);
				addColumnPathMap(CndR.$dt_fr, Srch01_CndR.$dt_fr);
				addColumnPathMap(CndR.$dt_to, Srch01_CndR.$dt_to);
//				addColumnPathMap(CndR.$missing_flg, );
//				addColumnPathMap(CndR.$sim_mrp_no, );
//				addColumnPathMap(CndR.$sim_flg, );
//				addColumnPathMap(CndR.$purc_dt_fr, );
//				addColumnPathMap(CndR.$purc_dt_to, );
//				addColumnPathMap(CndR.$tgt_ver_flg, );
//				addColumnPathMap(CndR.$non_ver_flg, );
//				addColumnPathMap(CndR.$non_cmpl_ver_flg, );
				addColumnPathMap(CndR.$loc_cd, Srch01_CndR.$loc_cd);
				addColumnPathMap(CndR.$loc_nm, Srch01_CndR.$loc_nm);
//				addColumnPathMap(CndR.$site_cd, );
//				addColumnPathMap(CndR.$site_nm, );
//				addColumnPathMap(CndR.$wg_cd, );
//				addColumnPathMap(CndR.$wg_nm, );
				addColumnPathMap(CndR.$lg_grp_cd, Srch01_CndR.$lg_grp_cd);
				addColumnPathMap(CndR.$lg_grp_nm, Srch01_CndR.$lg_grp_nm);
				addColumnPathMap(CndR.$alloc_grp_cd, Srch01_CndR.$alloc_grp_cd);
				addColumnPathMap(CndR.$alloc_grp_nm, Srch01_CndR.$alloc_grp_nm);
				addColumnPathMap(CndR.$loc_grp_cd, Srch01_CndR.$loc_grp_cd);
				addColumnPathMap(CndR.$loc_grp_nm, Srch01_CndR.$loc_grp_nm);
				addColumnPathMap(CndR.$quality_typ, Srch01_CndR.$quality_typ);
				addColumnPathMap(CndR.$gd_cd, Srch01_CndR.$gd_cd);
				addColumnPathMap(CndR.$gd_nm, Srch01_CndR.$gd_nm);
//				addColumnPathMap(CndR.$itm_typ, );
//				addColumnPathMap(CndR.$itm_typ_d_cd, );
//				addColumnPathMap(CndR.$itm_typ_d_nm, );
				addColumnPathMap(CndR.$itm_cd, Srch01_CndR.$itm_cd);
				addColumnPathMap(CndR.$itm_sub1, Srch01_CndR.$itm_sub1);
				addColumnPathMap(CndR.$itm_sub2, Srch01_CndR.$itm_sub2);
				addColumnPathMap(CndR.$itm_sub3, Srch01_CndR.$itm_sub3);
				addColumnPathMap(CndR.$itm_nm, Srch01_CndR.$itm_nm);
				addColumnPathMap(CndR.$ver_no, Srch01_CndR.$ver_no);
				addColumnPathMap(CndR.$sno1, Srch01_CndR.$sno1);
				addColumnPathMap(CndR.$sno2, Srch01_CndR.$sno2);
				addColumnPathMap(CndR.$sno3, Srch01_CndR.$sno3);
				addColumnPathMap(CndR.$sno4, Srch01_CndR.$sno4);
				addColumnPathMap(CndR.$wrk_no, Srch01_CndR.$wrk_no);
				addColumnPathMap(CndR.$wrk_nm, Srch01_CndR.$wrk_nm);
				addColumnPathMap(CndR.$alloc_gi_flg, Srch01_CndR.$alloc_gi_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sum_unit_typ(MSC_SUM_UNIT_TYP.LOC.value());
				dest.sno1_flg(true);
				dest.sno2_flg(true);
				dest.sno3_flg(true);
				dest.sno4_flg(true);
				dest.dtl_flg(true);
				dest.srch_flg(true);
				dest.amt_flg(false);
			}
		}

		protected Map_Srch01_RsltGrR_RsltR<Srch01_RsltGrR,RsltR> createMap_Srch01_RsltGrR_RsltR() {
			return new Map_Srch01_RsltGrR_RsltR<Srch01_RsltGrR, RsltR>();
		}

		public class Map_Srch01_RsltGrR_RsltR<D extends Srch01_RsltGrR, S extends RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
//				addColumnPathMap(Srch01_RsltGrR.$schd_stk_typ, );
//				addColumnPathMap(Srch01_RsltGrR.$schd_stk_typ_nm, );	定数名
				addColumnPathMap(Srch01_RsltGrR.$dt, RsltR.$dt);
//				addColumnPathMap(Srch01_RsltGrR.$wg_cd, );				setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$wg_nm, );				setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$dpt_cd, );				setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$dpt_nm, );				setMstで設定する
				addColumnPathMap(Srch01_RsltGrR.$ver_no, RsltR.$ver_no);
				addColumnPathMap(Srch01_RsltGrR.$loc_cd, RsltR.$loc_cd);
				addColumnPathMap(Srch01_RsltGrR.$loc_nm, RsltR.$loc_nm);
				addColumnPathMap(Srch01_RsltGrR.$str_ln_cd, RsltR.$str_ln_cd);
				addColumnPathMap(Srch01_RsltGrR.$str_ln_nm, RsltR.$str_ln_nm);
				addColumnPathMap(Srch01_RsltGrR.$str_ln_cd_none_flg, RsltR.$str_ln_cd_none_flg);
//				addColumnPathMap(Srch01_RsltGrR.$site_cd, RsltR.$site_cd);				setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$site_nm, RsltR.$site_nm);				setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lg_grp_cd, RsltR.$lg_grp_cd);			setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lg_grp_nm, RsltR.$lg_grp_nm);			setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$alloc_grp_cd, RsltR.$alloc_grp_cd);	setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$alloc_grp_nm, RsltR.$alloc_grp_nm);	setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$loc_grp_cd, RsltR.$loc_grp_cd);		setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$loc_grp_nm, RsltR.$loc_grp_nm);		setMstで設定する
				addColumnPathMap(Srch01_RsltGrR.$sno1, RsltR.$sno1);
				addColumnPathMap(Srch01_RsltGrR.$sno2, RsltR.$sno2);
				addColumnPathMap(Srch01_RsltGrR.$sno3, RsltR.$sno3);
				addColumnPathMap(Srch01_RsltGrR.$sno4, RsltR.$sno4);
//				addColumnPathMap(Srch01_RsltGrR.$wrk_no, );				setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$wrk_nm, );				setMstで設定する
				addColumnPathMap(Srch01_RsltGrR.$base_unit_cd, RsltR.$base_unit_cd);
				addColumnPathMap(Srch01_RsltGrR.$base_unit_nm, RsltR.$base_unit_nm);
				addColumnPathMap(Srch01_RsltGrR.$base_unit_dec_place, RsltR.$base_unit_dec_place);
//				addColumnPathMap(Srch01_RsltGrR.$qty, );
//				addColumnPathMap(Srch01_RsltGrR.$alloc_qty, );
//				addColumnPathMap(Srch01_RsltGrR.$grs_alloc_avl_qty, );
				addColumnPathMap(Srch01_RsltGrR.$io_schd_typ, RsltR.$io_schd_typ);
				addColumnPathMap(Srch01_RsltGrR.$io_schd_typ_nm, RsltR.$io_schd_typ_nm);
				addColumnPathMap(Srch01_RsltGrR.$io_schd_sts_typ, RsltR.$io_schd_sts_typ);
				addColumnPathMap(Srch01_RsltGrR.$io_schd_sts_typ_nm, RsltR.$io_schd_sts_typ_nm);
				addColumnPathMap(Srch01_RsltGrR.$trd_cd, RsltR.$trd_cd);
				addColumnPathMap(Srch01_RsltGrR.$trd_nm, RsltR.$trd_nm);
				addColumnPathMap(Srch01_RsltGrR.$trd_ptn_typ, RsltR.$trd_ptn_typ);
				addColumnPathMap(Srch01_RsltGrR.$trd_ptn_typ_nm, RsltR.$trd_ptn_typ_nm);
				addColumnPathMap(Srch01_RsltGrR.$trn_typ, RsltR.$trn_typ);
				addColumnPathMap(Srch01_RsltGrR.$trn_typ_nm, RsltR.$trn_typ_nm);
				addColumnPathMap(Srch01_RsltGrR.$io_act_typ, RsltR.$io_act_typ);
				addColumnPathMap(Srch01_RsltGrR.$io_act_typ_nm, RsltR.$io_act_typ_nm);
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 引当状況を検索する<br>
	 */
	public class Srch02 extends MSBEL_AllocSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editCnd();
			srchAlloc();
		}

		protected void editCnd() {
			editSno(up0());
		}

		protected void srchAlloc() {
			doInsItm();
			doInsLoc();
			MSBEL_AllocMngService.Alloc_Avl_Srch01 avl01Sv = MSBEL_AllocMngService.crtAlloc_Avl_Srch01();
			execAllocSv(avl01Sv);
			setDownAlloc(avl01Sv);
		}

		protected void doInsItm() {
			MCQueryApiBuilder allocItm_bldr = MCQueryApiBuilder.create(MSW_ALLOC_ITM_R.create("T"));
			execDbWkDelete("MSBEL0040_MSW_ALLOC_ITM_D01", allocItm_bldr.getBaseDbc());
			executeUpdate(MSBEL0040_MSW_ALLOC_ITM_I01(), up0());
		}

		protected void doInsLoc() {
			dbWkDelete("MSBEL0040_MSW_ALLOC_LOCK_KEY_D01", MST_ALLOC_LOCK_R.create());
			executeUpdate(MSBEL0040_MSW_ALLOC_LOCK_KEY_I01(), up0());
		}

		protected void execAllocSv(MSBEL_AllocMngService.Alloc_Avl_Srch01 avl01Sv) {
			avl01Sv.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			avl01Sv.up0().all_pri_flg(false);
			avl01Sv.up0().except_alloc_wait_flg(up0().except_alloc_wait_flg());
			avl01Sv.up0().except_zero_flg(false);
			avl01Sv.up0().dt_fr(up0().dt_fr());
			avl01Sv.up0().dt_to(up0().dt_to());
			avl01Sv.up0().avl_schd_dt(up0().avl_schd_dt());
			avl01Sv.up0().except_invld_lot_flg(up0().except_invld_lot_flg());
			avl01Sv.up0().alloc_grp_srch_flg(MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(up0().tgt()));
			avl01Sv.up0().dtl_calc_flg(true);
//			avl01Sv.up1();
//			avl01Sv.up2();
//			avl01Sv.up3();
//			avl01Sv.up4();
			avl01Sv.up4().lot_no(up0().lot_no());
			avl01Sv.up4().sublot_no(up0().sublot_no());
			avl01Sv.up4().ver_no(up0().ver_no());
			avl01Sv.up4().pack_unit_cd(up0().pack_unit_cd());
			avl01Sv.up4().pack_unit_nm(up0().pack_unit_nm());
			avl01Sv.exec();
		}

		protected void setDownAlloc(MSBEL_AllocMngService.Alloc_Avl_Srch01 avl01Sv) {
			addAll(down2(), avl01Sv.down0(), createMap_Srch01_RsltGrR_Avl_ListR());
			addAll(down2(), avl01Sv.down1(), createMap_Srch01_RsltGrR_Avl_ListR());
			addAll(down3(), avl01Sv.down2(), createMap_Srch01_RsltGrR_Avl_ListR());
			addAll(down3(), avl01Sv.down3(), createMap_Srch01_RsltGrR_Avl_ListR());
			addAll(down4(), avl01Sv.down8(), createMap_Srch01_LnoR_Lno_ListR());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down2().isEmpty() && down3().isEmpty()) {
				return;
			}

			// 検索条件の絞込み
			extdown();

			// 名称などマスタ値の取得
			getMst(up0(), down2(), down3());

			// 実際／標準有効成分の設定
			setContQty(down2(), down3());

			// ヘッダ項目の設定
			setHdrQty(down0(), down2(), down3());
			setHdrContFctr(down1(), down2(), down3());
		}

		protected void extdown() {
			// 在庫、入庫
			MCList<Srch01_RsltGrR> list = MCList.create(Srch01_RsltGrR.class);
			for (Srch01_RsltGrR r : down2()) {
				extdownSub(up0().gr_sts_opn_grp(), up0().gr_sts_ordsav_grp(), up0().gr_sts_fix_grp(), up0().gr_sts_schd_grp(), up0().gr_sts_ord_grp(), r, list);
			}
			down2().setAll(list);

			// 出庫
			list.clear();
			for (Srch01_RsltGrR r : down3()) {
				extdownSub(up0().gr_sts_opn_grp(), up0().gr_sts_ordsav_grp(), up0().gr_sts_fix_grp(), up0().gi_sts_schd_grp(), up0().gi_sts_ord_grp(), r, list);
			}
			down3().setAll(list);
		}

		protected void extdownSub(Boolean opn, Boolean ordsav, Boolean fix, Boolean schd, Boolean ord, Srch01_RsltGrR r, MCList<Srch01_RsltGrR> list) {
			Boolean flg = true;
			if (!opn && MSC_IO_SCHD_STS_TYP.is_opn_grp(r.io_schd_sts_typ())) {
				flg = false;
			}
			if (!ordsav && MSC_IO_SCHD_STS_TYP.is_ordsav_grp(r.io_schd_sts_typ())) {
				flg = false;
			}
			if (!fix && MSC_IO_SCHD_STS_TYP.is_fix_grp(r.io_schd_sts_typ())) {
				flg = false;
			}
			if (!schd && MSC_IO_SCHD_STS_TYP.is_schd_grp(r.io_schd_sts_typ())) {
				flg = false;
			}
			if (!ord && MSC_IO_SCHD_STS_TYP.is_ord_grp(r.io_schd_sts_typ())) {
				flg = false;
			}
			if (flg) list.add(r);
		}

		protected Map_Srch01_RsltGrR_Avl_ListR<Srch01_RsltGrR,Avl_ListR> createMap_Srch01_RsltGrR_Avl_ListR() {
			return new Map_Srch01_RsltGrR_Avl_ListR<Srch01_RsltGrR, Avl_ListR>();
		}

		public class Map_Srch01_RsltGrR_Avl_ListR<D extends Srch01_RsltGrR, S extends Avl_ListR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltGrR.$schd_stk_typ, Avl_ListR.$schd_stk_typ);
//				addColumnPathMap(Srch01_RsltGrR.$schd_stk_typ_nm, );		定数名
				addColumnPathMap(Srch01_RsltGrR.$dt, Avl_ListR.$schd_dt);
//				addColumnPathMap(Srch01_RsltGrR.$wg_cd, );
//				addColumnPathMap(Srch01_RsltGrR.$wg_nm, );
//				addColumnPathMap(Srch01_RsltGrR.$dpt_cd, );
//				addColumnPathMap(Srch01_RsltGrR.$dpt_nm, );
				addColumnPathMap(Srch01_RsltGrR.$ver_no, Avl_ListR.$ver_no);
				addColumnPathMap(Srch01_RsltGrR.$lot_no, Avl_ListR.$lot_no);
				addColumnPathMap(Srch01_RsltGrR.$sublot_no, Avl_ListR.$sublot_no);
				addColumnPathMap(Srch01_RsltGrR.$loc_cd, Avl_ListR.$stk_loc_cd);
//				addColumnPathMap(Srch01_RsltGrR.$loc_nm, );
				addColumnPathMap(Srch01_RsltGrR.$str_ln_cd, Avl_ListR.$stk_str_ln_cd);
//				addColumnPathMap(Srch01_RsltGrR.$str_ln_nm, );
//				addColumnPathMap(Srch01_RsltGrR.$str_ln_cd_none_flg, );
//				addColumnPathMap(Srch01_RsltGrR.$site_cd, );
//				addColumnPathMap(Srch01_RsltGrR.$site_nm, );
				addColumnPathMap(Srch01_RsltGrR.$lg_grp_cd, Avl_ListR.$stk_lg_grp_cd);
//				addColumnPathMap(Srch01_RsltGrR.$lg_grp_nm, );
				addColumnPathMap(Srch01_RsltGrR.$alloc_grp_cd, Avl_ListR.$alloc_grp_cd);
//				addColumnPathMap(Srch01_RsltGrR.$alloc_grp_nm, );
//				addColumnPathMap(Srch01_RsltGrR.$loc_grp_cd, );
//				addColumnPathMap(Srch01_RsltGrR.$loc_grp_nm, );
				addColumnPathMap(Srch01_RsltGrR.$gd_cd, Avl_ListR.$gd_cd);
//				addColumnPathMap(Srch01_RsltGrR.$gd_nm, );
				addColumnPathMap(Srch01_RsltGrR.$quality_typ, Avl_ListR.$quality_typ);
//				addColumnPathMap(Srch01_RsltGrR.$quality_typ_nm, );				定数名
				addColumnPathMap(Srch01_RsltGrR.$stk_insp_typ, Avl_ListR.$stk_insp_typ);
//				addColumnPathMap(Srch01_RsltGrR.$stk_insp_typ_nm, );			定数名
				addColumnPathMap(Srch01_RsltGrR.$sno1, Avl_ListR.$sno1);
				addColumnPathMap(Srch01_RsltGrR.$sno2, Avl_ListR.$sno2);
				addColumnPathMap(Srch01_RsltGrR.$sno3, Avl_ListR.$sno3);
				addColumnPathMap(Srch01_RsltGrR.$sno4, Avl_ListR.$sno4);
//				addColumnPathMap(Srch01_RsltGrR.$wrk_no, );						setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$wrk_nm, );						setMstで設定する
				addColumnPathMap(Srch01_RsltGrR.$in_xfr_typ, Avl_ListR.$in_xfr_typ);
//				addColumnPathMap(Srch01_RsltGrR.$in_xfr_typ_nm, );				定数名
				addColumnPathMap(Srch01_RsltGrR.$asst_typ, Avl_ListR.$asst_typ);
//				addColumnPathMap(Srch01_RsltGrR.$asst_typ_nm, );				定数名
				addColumnPathMap(Srch01_RsltGrR.$stk_id_typ, Avl_ListR.$stk_id_typ);
//				addColumnPathMap(Srch01_RsltGrR.$stk_id_typ_nm, );				定数名
				addColumnPathMap(Srch01_RsltGrR.$stk_bp_cd, Avl_ListR.$stk_bp_cd);
//				addColumnPathMap(Srch01_RsltGrR.$stk_bp_nm, );
				addColumnPathMap(Srch01_RsltGrR.$stk_arrv_bp_cd, Avl_ListR.$stk_arrv_bp_cd);
//				addColumnPathMap(Srch01_RsltGrR.$stk_arrv_bp_nm, );
				addColumnPathMap(Srch01_RsltGrR.$pack_unit_qty, Avl_ListR.$pack_unit_src_qty);
				addColumnPathMap(Srch01_RsltGrR.$pack_unit_cd, Avl_ListR.$pack_unit_cd);
//				addColumnPathMap(Srch01_RsltGrR.$pack_unit_nm, );
				addColumnPathMap(Srch01_RsltGrR.$pack_unit_dec_place, Avl_ListR.$pack_unit_dec_place);
				addColumnPathMap(Srch01_RsltGrR.$base_unit_qty, Avl_ListR.$base_unit_src_qty);
				addColumnPathMap(Srch01_RsltGrR.$base_unit_cd, Avl_ListR.$base_unit_cd);
//				addColumnPathMap(Srch01_RsltGrR.$base_unit_nm, );
				addColumnPathMap(Srch01_RsltGrR.$base_unit_dec_place, Avl_ListR.$base_unit_dec_place);
//				addColumnPathMap(Srch01_RsltGrR.$lot_alloc_qty, );				valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lot_wait_qty, );				valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lot_alloc_avl_qty, );			valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$not_lot_alloc_qty, );			valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$not_lot_wait_qty, );			valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$not_lot_alloc_avl_qty, );		valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lg_lot_alloc_qty, );			valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lg_lot_wait_qty, );			valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lg_lot_alloc_avl_qty, );		valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lg_not_lot_alloc_qty, );		valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lg_not_lot_wait_qty, );		valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$lg_not_lot_alloc_avl_qty, );	valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$grs_alloc_qty, );				valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$grs_wait_qty, );				valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$alloc_qty, );					valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$wait_qty, );					valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$grs_alloc_avl_qty, );			valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$alloc_unit_cd, );				valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$alloc_unit_nm, );				setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$alloc_unit_dec_place, );		valueCopyで設定する
				addColumnPathMap(Srch01_RsltGrR.$overdue_alloc_flg, Avl_ListR.$overdue_alloc_flg);
				addColumnPathMap(Srch01_RsltGrR.$another_loc_alloc_flg, Avl_ListR.$another_loc_alloc_flg);
				addColumnPathMap(Srch01_RsltGrR.$abnormal_alloc_flg, Avl_ListR.$abnormal_alloc_flg);
//				addColumnPathMap(Srch01_RsltGrR.$base_unit_alloc_qty, );		valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$base_unit_wait_qty, );			valueCopyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$base_unit_avl_qty, );			valueCopyで設定する
				addColumnPathMap(Srch01_RsltGrR.$act_cont_fctr, Avl_ListR.$act_cont_fctr);
//				addColumnPathMap(Srch01_RsltGrR.$act_cont_qty, );				setContQtyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$act_cont_alloc_qty, );			setContQtyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$act_cont_wait_qty, );			setContQtyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$act_cont_alloc_avl_qty, );		setContQtyで設定する
				addColumnPathMap(Srch01_RsltGrR.$std_cont_fctr, Avl_ListR.$std_cont_fctr);
//				addColumnPathMap(Srch01_RsltGrR.$std_cont_qty, );				setContQtyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$std_cont_alloc_qty, );			setContQtyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$std_cont_wait_qty, );			setContQtyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$std_cont_alloc_avl_qty, );		setContQtyで設定する
//				addColumnPathMap(Srch01_RsltGrR.$cont_fctr_unit_cd, );			setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$cont_fctr_unit_nm, );			setMstで設定する
				addColumnPathMap(Srch01_RsltGrR.$cont_fctr_flg, Avl_ListR.$cont_fctr_flg);
				addColumnPathMap(Srch01_RsltGrR.$cont_fctr_rnd_typ, Avl_ListR.$cont_fctr_rnd_typ);
				addColumnPathMap(Srch01_RsltGrR.$cont_fctr_dec_place, Avl_ListR.$cont_fctr_dec_place);
				addColumnPathMap(Srch01_RsltGrR.$lot_seq, Avl_ListR.$lot_seq);
				addColumnPathMap(Srch01_RsltGrR.$first_gr_dt, Avl_ListR.$first_gr_dt);
				addColumnPathMap(Srch01_RsltGrR.$vld_dt, Avl_ListR.$vld_dt);
				addColumnPathMap(Srch01_RsltGrR.$lmt_dt, Avl_ListR.$lmt_dt);
				addColumnPathMap(Srch01_RsltGrR.$plnt_aprv_sts_typ, Avl_ListR.$plnt_aprv_sts_typ);
//				addColumnPathMap(Srch01_RsltGrR.$plnt_aprv_sts_typ_nm, );	定数名
				addColumnPathMap(Srch01_RsltGrR.$mrkt_judg_sts_typ, Avl_ListR.$mrkt_judg_sts_typ);
//				addColumnPathMap(Srch01_RsltGrR.$mrkt_judg_sts_typ_nm, );	定数名
				addColumnPathMap(Srch01_RsltGrR.$vld_dt_fr, Avl_ListR.$vld_dt_fr);
				addColumnPathMap(Srch01_RsltGrR.$vld_dt_to, Avl_ListR.$vld_dt_to);
				addColumnPathMap(Srch01_RsltGrR.$stop_dt, Avl_ListR.$stop_dt);
				addColumnPathMap(Srch01_RsltGrR.$rel_dt, Avl_ListR.$rel_dt);
				addColumnPathMap(Srch01_RsltGrR.$alloc_margin_days, Avl_ListR.$alloc_margin_days);
//				addColumnPathMap(Srch01_RsltGrR.$loc_sppl_cd, );			setMstで設定する
//				addColumnPathMap(Srch01_RsltGrR.$loc_sppl_nm, );			setMstで設定する
				addColumnPathMap(Srch01_RsltGrR.$io_schd_typ, Avl_ListR.$io_schd_typ);
//				addColumnPathMap(Srch01_RsltGrR.$io_schd_typ_nm, );			定数名
				addColumnPathMap(Srch01_RsltGrR.$io_schd_sts_typ, Avl_ListR.$io_schd_sts_typ);
//				addColumnPathMap(Srch01_RsltGrR.$io_schd_sts_typ_nm, );		定数名
				addColumnPathMap(Srch01_RsltGrR.$io_schd_no, Avl_ListR.$io_schd_no);
				addColumnPathMap(Srch01_RsltGrR.$io_schd_seq, Avl_ListR.$io_schd_seq);
//				addColumnPathMap(Srch01_RsltGrR.$trd_cd,  );
//				addColumnPathMap(Srch01_RsltGrR.$trd_nm,  );
//				addColumnPathMap(Srch01_RsltGrR.$trd_ptn_typ,  );
//				addColumnPathMap(Srch01_RsltGrR.$trd_ptn_typ_nm,  );
//				addColumnPathMap(Srch01_RsltGrR.$trn_typ,  );
//				addColumnPathMap(Srch01_RsltGrR.$trn_typ_nm,  );
//				addColumnPathMap(Srch01_RsltGrR.$io_act_typ,  );
//				addColumnPathMap(Srch01_RsltGrR.$io_act_typ_nm,  );
				addColumnPathMap(Srch01_RsltGrR.$lno, Avl_ListR.$lno);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (src.pack_alloc_flg()) {
					dest.lot_alloc_qty(src.pack_unit_lot_alloc_qty());
					dest.lot_wait_qty(src.pack_unit_lot_wait_qty());
					dest.lot_alloc_avl_qty(src.pack_unit_lot_qty());
					dest.not_lot_alloc_qty(src.pack_unit_not_lot_alloc_qty());
					dest.not_lot_wait_qty(src.pack_unit_not_lot_wait_qty());
					dest.not_lot_alloc_avl_qty(src.pack_unit_not_lot_qty());
					dest.lg_lot_alloc_qty(src.pack_unit_lg_lot_alloc_qty());
					dest.lg_lot_wait_qty(src.pack_unit_lg_lot_wait_qty());
					dest.lg_lot_alloc_avl_qty(src.pack_unit_lg_lot_qty());
					dest.lg_not_lot_alloc_qty(src.pack_unit_lg_not_lot_alloc_qty());
					dest.lg_not_lot_wait_qty(src.pack_unit_lg_not_lot_wait_qty());
					dest.lg_not_lot_alloc_avl_qty(src.pack_unit_lg_not_lot_qty());
					dest.grs_alloc_qty(src.pack_unit_grs_alloc_qty());
					dest.grs_wait_qty(src.pack_unit_grs_wait_qty());
					dest.alloc_qty(src.pack_unit_alloc_qty());
					dest.wait_qty(src.pack_unit_wait_qty());
					dest.grs_alloc_avl_qty(src.pack_unit_qty());
					dest.alloc_unit_cd(src.pack_unit_cd());
					dest.alloc_unit_dec_place(src.pack_unit_dec_place());
				}
				else {
					dest.lot_alloc_qty(src.base_unit_lot_alloc_qty());
					dest.lot_wait_qty(src.base_unit_lot_wait_qty());
					dest.lot_alloc_avl_qty(src.base_unit_lot_qty());
					dest.not_lot_alloc_qty(src.base_unit_not_lot_alloc_qty());
					dest.not_lot_wait_qty(src.base_unit_not_lot_wait_qty());
					dest.not_lot_alloc_avl_qty(src.base_unit_not_lot_qty());
					dest.lg_lot_alloc_qty(src.base_unit_lg_lot_alloc_qty());
					dest.lg_lot_wait_qty(src.base_unit_lg_lot_wait_qty());
					dest.lg_lot_alloc_avl_qty(src.base_unit_lg_lot_qty());
					dest.lg_not_lot_alloc_qty(src.base_unit_lg_not_lot_alloc_qty());
					dest.lg_not_lot_wait_qty(src.base_unit_lg_not_lot_wait_qty());
					dest.lg_not_lot_alloc_avl_qty(src.base_unit_lg_not_lot_qty());
					dest.grs_alloc_qty(src.base_unit_grs_alloc_qty());
					dest.grs_wait_qty(src.base_unit_grs_wait_qty());
					dest.alloc_qty(src.base_unit_alloc_qty());
					dest.wait_qty(src.base_unit_wait_qty());
					dest.grs_alloc_avl_qty(src.base_unit_qty());
					dest.alloc_unit_cd(src.base_unit_cd());
					dest.alloc_unit_dec_place(src.base_unit_dec_place());
				}
				// 計算用
				dest.qty(src.base_unit_src_qty());
				dest.base_unit_alloc_qty(src.base_unit_alloc_qty());
				dest.base_unit_wait_qty(src.base_unit_wait_qty());
				dest.base_unit_avl_qty(src.base_unit_qty());
			}
		}

		protected Map_Srch01_LnoR_Lno_ListR<Srch01_LnoR,Lno_ListR> createMap_Srch01_LnoR_Lno_ListR() {
			return new Map_Srch01_LnoR_Lno_ListR<Srch01_LnoR, Lno_ListR>();
		}

		public class Map_Srch01_LnoR_Lno_ListR<D extends Srch01_LnoR, S extends Lno_ListR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_LnoR.$gi_lno, Lno_ListR.$gi_lno);
				addColumnPathMap(Srch01_LnoR.$gr_lno, Lno_ListR.$gr_lno);
			}
		}
	}

	protected void getMst(Srch01_CndR up0, MCList<Srch01_RsltGrR> down2, MCList<Srch01_RsltGrR> down3) {
		selectItmL(up0);

		MCList<Srch01_RsltGrR> down = MCList.create(Srch01_RsltGrR.class);
		down.addAll(down2);
		down.addAll(down3);
		selectBaseUnitL(down);
		selectDptL(down);
		selectDptNmL(down);
		selectGdL(down);
		selectLocL(down);
		selectPackUnitL(down);
		selectStkArrvBpL(down);
		selectStkBpL(down);
		selectStrLnL(down);
		selectWrkSnoL(down);

		// 在庫、入庫
		for (Srch01_RsltGrR r : down2) {
			setMst(r);
		}
		// 出庫
		for (Srch01_RsltGrR r : down3) {
			setMst(r);
		}
	}

	protected void setMst(Srch01_RsltGrR r) {

		MAM_LOC_R loc = _locCache.get(r.loc_cd());

		r.wg_cd(loc.wg_cd());
		r.wg_nm(loc.getString(MAM_WG_R.$wg_nm));
		r.dpt_cd(_dptCache.getFirst(_dptIdx, r.loc_cd(), nvl(r.dt(), _today)).getString(MAM_DPT_R.$dpt_cd));
		r.dpt_nm(_dptNmCache.get(nvl(r.dt(), _today), r.dpt_cd()).dpt_nm());
		r.loc_nm(loc.loc_nm());
		r.str_ln_nm(_strLnCache.get(r.loc_cd(), r.str_ln_cd()).str_ln_nm());
		r.site_cd(loc.site_cd());
		r.site_nm(loc.getString(MAM_SITE_R.$site_nm));
		r.lg_grp_cd(loc.lg_grp_cd());
		r.lg_grp_nm(loc.getString(MAM_LG_GRP_R.$lg_grp_nm));
		r.alloc_grp_cd(loc.alloc_grp_cd());
		r.alloc_grp_nm(loc.getString(MAM_ALLOC_GRP_R.$alloc_grp_nm));
		r.loc_grp_cd(loc.loc_grp_cd());
		r.loc_grp_nm(loc.getString(MAM_LOC_GRP_R.$loc_grp_nm));
		r.gd_nm(_gdCache.get(r.gd_cd()).gd_nm());
		r.wrk_no(_wrkSnoCache.get(r.sno1()).wrk_no());
		r.wrk_nm(_wrkSnoCache.get(r.sno1()).wrk_nm());
		r.stk_bp_nm(_stkBpCache.get(r.stk_bp_cd()).bp_nm());
		r.stk_arrv_bp_nm(_stkArrvBpCache.get(r.stk_arrv_bp_cd()).bp_nm());
		r.pack_unit_nm(_packUnitCache.get(r.pack_unit_cd()).unit_nm());
		r.base_unit_nm(_baseUnitCache.get(r.base_unit_cd()).unit_nm());

		if (isSame(r.base_unit_cd(), r.alloc_unit_cd())) {
			r.alloc_unit_nm(r.base_unit_nm());
		}
		else {
			r.alloc_unit_nm(r.pack_unit_nm());
		}

		if (_itmCache.cont_fctr_flg()) {
			r.cont_fctr_unit_cd(_itmCache.cont_fctr_unit_cd());
			r.cont_fctr_unit_nm(_itmCache.getString(MAM_UNIT_R.$unit_nm));
		}

		r.loc_sppl_cd(loc.sppl_cd());
		r.loc_sppl_nm(loc.getString(MAM_BP_R.$bp_nm));
	}

	protected void setContQty(MCList<Srch01_RsltGrR> down2, MCList<Srch01_RsltGrR> down3) {
		// 在庫、入庫
		for (Srch01_RsltGrR r : down2) {
			calcContQty(r);
		}
		// 出庫
		for (Srch01_RsltGrR r : down3) {
			calcContQty(r);
		}
	}

	protected void calcContQty(Srch01_RsltGrR r) {
		if (r.cont_fctr_flg()) {
			r.act_cont_qty(convToContFctrUnit(r.qty(), r.act_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			r.act_cont_alloc_qty(convToContFctrUnit(r.base_unit_alloc_qty(), r.act_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			r.act_cont_wait_qty(convToContFctrUnit(r.base_unit_wait_qty(), r.act_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			r.act_cont_alloc_avl_qty(convToContFctrUnit(r.base_unit_avl_qty(), r.act_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));

			r.std_cont_qty(convToContFctrUnit(r.qty(), r.std_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			r.std_cont_alloc_qty(convToContFctrUnit(r.base_unit_alloc_qty(), r.std_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			r.std_cont_wait_qty(convToContFctrUnit(r.base_unit_wait_qty(), r.std_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			r.std_cont_alloc_avl_qty(convToContFctrUnit(r.base_unit_avl_qty(), r.std_cont_fctr(), 
					r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
		}
	}

	protected void setHdrQty(Srch01_RsltQtyR down0, MCList<Srch01_RsltGrR> down2, MCList<Srch01_RsltGrR> down3) {
		// 初期化
		down0.stk_qty(MCNumber.ZERO);
		down0.stk_qty2(MCNumber.ZERO);
		down0.stk_qty3(MCNumber.ZERO);
		down0.stk_qty4(MCNumber.ZERO);
		down0.gr_qty(MCNumber.ZERO);
		down0.gr_qty2(MCNumber.ZERO);
		down0.gr_qty3(MCNumber.ZERO);
		down0.gr_qty4(MCNumber.ZERO);
		down0.gi_qty(MCNumber.ZERO);
		down0.gi_qty2(MCNumber.ZERO);
		down0.gi_qty3(MCNumber.ZERO);
		down0.gi_qty4(MCNumber.ZERO);

		if (down2.isEmpty() && down3.isEmpty()) {
			return;
		}

		for (Srch01_RsltGrR r : down2.subList(r -> isNull(r.qty()))) {
			if (MSC_SCHD_STK_TYP.isSTK(r.schd_stk_typ())) {
				down0.stk_qty(null);
				down0.stk_qty2(null);
				down0.stk_qty3(null);
				down0.stk_qty4(null);
			}
			else {
				down0.gr_qty(null);
				down0.gr_qty2(null);
				down0.gr_qty3(null);
				down0.gr_qty4(null);
			}
		}
		
		for (Srch01_RsltGrR r : down3.subList(r -> isNull(r.qty()))) {
			down0.gi_qty(null);
			down0.gi_qty2(null);
			down0.gi_qty3(null);
			down0.gi_qty4(null);
		}

		MCGroupByPolicy gp = new MCGroupByPolicy();
		gp.addKey(Srch01_RsltGrR.$schd_stk_typ);
		gp.addKey(Srch01_RsltGrR.$base_unit_cd);
		gp.sum(Srch01_RsltGrR.$qty);
		gp.sum(Srch01_RsltGrR.$base_unit_alloc_qty);
		gp.sum(Srch01_RsltGrR.$base_unit_wait_qty);
		gp.sum(Srch01_RsltGrR.$base_unit_avl_qty);

		// 在庫、入庫
		for (Srch01_RsltGrR r :down2.groupBy(gp)) {
			if (MSC_SCHD_STK_TYP.isSTK(r.schd_stk_typ())) {
				if (isNull(down0.stk_qty())) {
					continue;
				}
				down0.stk_qty(down0.stk_qty().add(r.qty()));
				down0.stk_qty2(down0.stk_qty2().add(r.base_unit_alloc_qty()));
				down0.stk_qty3(down0.stk_qty3().add(r.base_unit_wait_qty()));
				down0.stk_qty4(down0.stk_qty4().add(r.base_unit_avl_qty()));
			}
			else {
				if (isNull(down0.gr_qty())) {
					continue;
				}
				down0.gr_qty(down0.gr_qty().add(r.qty()));
				down0.gr_qty2(down0.gr_qty2().add(r.base_unit_alloc_qty()));
				down0.gr_qty3(down0.gr_qty3().add(r.base_unit_wait_qty()));
				down0.gr_qty4(down0.gr_qty4().add(r.base_unit_avl_qty()));
			}
		}
		// 出庫
		for (Srch01_RsltGrR r :down3.groupBy(gp)) {
			if (isNull(down0.gi_qty())) {
				break;
			}
			down0.gi_qty(down0.gi_qty().add(r.qty()));
			down0.gi_qty2(down0.gi_qty2().add(r.base_unit_alloc_qty()));
			down0.gi_qty3(down0.gi_qty3().add(r.base_unit_wait_qty()));
			down0.gi_qty4(down0.gi_qty4().add(r.base_unit_avl_qty()));
		}
		// その他
		Srch01_RsltGrR r;
		if (down2.isEmpty()) {
			r = down3.get(0);
		}
		else {
			r = down2.get(0);
		}
		down0.base_unit_cd(r.base_unit_cd());
		down0.base_unit_nm(r.base_unit_nm());
		down0.base_unit_dec_place(r.base_unit_dec_place());
	}

	protected void setHdrContFctr(Srch01_RsltContFctrR down1, MCList<Srch01_RsltGrR> down2, MCList<Srch01_RsltGrR> down3) {
		if (!_itmCache.cont_fctr_flg()) {
			return;
		}

		// 初期化
		down1.stk_qty(MCNumber.ZERO);
		down1.stk_qty2(MCNumber.ZERO);
		down1.stk_qty3(MCNumber.ZERO);
		down1.stk_qty4(MCNumber.ZERO);
		down1.gr_qty(MCNumber.ZERO);
		down1.gr_qty2(MCNumber.ZERO);
		down1.gr_qty3(MCNumber.ZERO);
		down1.gr_qty4(MCNumber.ZERO);
		down1.gi_qty(MCNumber.ZERO);
		down1.gi_qty2(MCNumber.ZERO);
		down1.gi_qty3(MCNumber.ZERO);
		down1.gi_qty4(MCNumber.ZERO);

		if (down2.isEmpty() && down3.isEmpty()) {
			return;
		}

		MCGroupByPolicy gp = new MCGroupByPolicy();
		gp.addKey(Srch01_RsltGrR.$schd_stk_typ);
		gp.addKey(Srch01_RsltGrR.$cont_fctr_unit_cd);
		gp.sum(Srch01_RsltGrR.$act_cont_qty);
		gp.sum(Srch01_RsltGrR.$act_cont_alloc_qty);
		gp.sum(Srch01_RsltGrR.$act_cont_wait_qty);
		gp.sum(Srch01_RsltGrR.$act_cont_alloc_avl_qty);

		// 在庫、入庫
		for (Srch01_RsltGrR r :down2.groupBy(gp)) {
			if (MSC_SCHD_STK_TYP.isSTK(r.schd_stk_typ())) {
				down1.stk_qty(down1.stk_qty().add(r.act_cont_qty()));
				down1.stk_qty2(down1.stk_qty2().add(r.act_cont_alloc_qty()));
				down1.stk_qty3(down1.stk_qty3().add(r.act_cont_wait_qty()));
				down1.stk_qty4(down1.stk_qty4().add(r.act_cont_alloc_avl_qty()));
			}
			else {
				down1.gr_qty(down1.gr_qty().add(r.act_cont_qty()));
				down1.gr_qty2(down1.gr_qty2().add(r.act_cont_alloc_qty()));
				down1.gr_qty3(down1.gr_qty3().add(r.act_cont_wait_qty()));
				down1.gr_qty4(down1.gr_qty4().add(r.act_cont_alloc_avl_qty()));
			}
		}
		// 出庫
		for (Srch01_RsltGrR r :down3.groupBy(gp)) {
			down1.gi_qty(down1.gi_qty().add(r.act_cont_qty()));
			down1.gi_qty2(down1.gi_qty2().add(r.act_cont_alloc_qty()));
			down1.gi_qty3(down1.gi_qty3().add(r.act_cont_wait_qty()));
			down1.gi_qty4(down1.gi_qty4().add(r.act_cont_alloc_avl_qty()));
		}
		// その他
		Srch01_RsltGrR r;
		if (down2.isEmpty()) {
			r = down3.get(0);
		}
		else {
			r = down2.get(0);
		}
		down1.cont_fctr_unit_cd(r.cont_fctr_unit_cd());
		down1.cont_fctr_unit_nm(r.cont_fctr_unit_nm());
		down1.cont_fctr_flg(r.cont_fctr_flg());
		down1.cont_fctr_dec_place(r.alloc_unit_dec_place());
		down1.cont_fctr_rnd_typ(r.cont_fctr_rnd_typ());
	}

	//- 品目マスタ検索 ---------------------------------------------
	protected MAM_ITM_R _itmCache = MAM_ITM_R.create();
	protected void selectItmL(Srch01_CndR up0) {
		MAM_ITM_R t = MAM_ITM_R.create("T");
		MCQueryApiBuilder itmCache_bldr = MCQueryApiBuilder.create(t);
		MAM_UNIT_R m = MAM_UNIT_R.create("M");

		itmCache_bldr.setSelect(t.cont_fctr_flg, t.cont_fctr_unit_cd,
				t.cont_fctr_rnd_typ, t.cont_fctr_dec_place);
		itmCache_bldr.addSelect(m.unit_nm);
		itmCache_bldr.addLeftOuterJoin(m, bracket(m.unit_cd.eq(t.cont_fctr_unit_cd)));
		dbSelectKey("MSBEL0040_MAM_ITM_S01", _itmCache, itmCache_bldr, up0);
	}
	//- 場所マスタ検索（部門） ---------------------------------------------
	protected MCList<Srch01_RsltGrR> _dptCache = null;
	protected MCDate _today = null;
	protected MCIndexKey _dptIdx = null;
	protected void selectDptL(MCList<Srch01_RsltGrR> dtlL) {
			_dptCache = dtlL.groupBy(Srch01_RsltGrR.$loc_cd, Srch01_RsltGrR.$dt);
			_today = getToday();
			for (Srch01_RsltGrR r :_dptCache) {
				if (isNull(r.dt())) r.dt(_today);
			}
		
		execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_ASST_DPT_CD", "01"),
				MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_ASST_DPT_CD"),
				MAM_DPT_R.$dpt_cd, _dptCache, Srch01_RsltGrR.$loc_cd, Srch01_RsltGrR.$dt);
			
			_dptIdx = _dptCache.createIndex(Srch01_RsltGrR.$loc_cd, Srch01_RsltGrR.$dt);
	}
	//- 部門マスタ検索（名称） ---------------------------------------------
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptNmCache = null;
	protected void selectDptNmL(MCList<Srch01_RsltGrR> dtlL) {
		MAM_DPT_R t = MAM_DPT_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.dpt_nm);
		_dptNmCache = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbcL_bldr, _dptCache, Srch01_RsltGrR.$dpt_cd);
	}
	//- 場所マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_LOC_R> _locCache = null;
	protected void selectLocL(MCList<Srch01_RsltGrR> dtlL) {
		MAM_LOC_R t0 = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t0);
		MAM_WG_R m = MAM_WG_R.create("M");
		MAM_SITE_R m2 = MAM_SITE_R.create("M2");
		MAM_LOC_GRP_R m3 = MAM_LOC_GRP_R.create("M3");
		MAM_LG_GRP_R m4 = MAM_LG_GRP_R.create("M4");
		MAM_ALLOC_GRP_R m5 = MAM_ALLOC_GRP_R.create("M5");
		MAM_BP_R m6 = MAM_BP_R.create("M6");
		dbcL_bldr.setSelect(t0.loc_nm, t0.wg_cd, t0.site_cd, t0.loc_grp_cd, t0.lg_grp_cd,
				t0.alloc_grp_cd, t0.sppl_cd);
		dbcL_bldr.addSelect(m.wg_nm, m3.loc_grp_nm, m2.site_nm, m4.lg_grp_nm,
				m5.alloc_grp_nm, m6.bp_nm);
		dbcL_bldr.addLeftOuterJoin(m, bracket(m.wg_cd.eq(t0.wg_cd)));
		dbcL_bldr.addLeftOuterJoin(m2, bracket(m2.site_cd.eq(t0.site_cd)));
		dbcL_bldr.addLeftOuterJoin(m3, bracket(m3.loc_grp_cd.eq(t0.loc_grp_cd)));
		dbcL_bldr.addLeftOuterJoin(m4, bracket(m4.lg_grp_cd.eq(t0.lg_grp_cd)));
		dbcL_bldr.addLeftOuterJoin(m5, bracket(m5.alloc_grp_cd.eq(t0.alloc_grp_cd)));
		dbcL_bldr.addLeftOuterJoin(m6, bracket(m6.bp_cd.eq(t0.sppl_cd)));
		_locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbcL_bldr, dtlL, Srch01_RsltGrR.$loc_cd);
	}
	//- 棚・ラインマスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_STR_LN_R> _strLnCache = null;
	protected void selectStrLnL(MCList<Srch01_RsltGrR> dtlL) {
		MAM_STR_LN_R t = MAM_STR_LN_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.str_ln_nm);
		_strLnCache = new FXUCL_MCDbcCache<MAM_STR_LN_R>(dbcL_bldr, dtlL, Srch01_RsltGrR.$loc_cd, Srch01_RsltGrR.$str_ln_cd);
	}
	//- 格付マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_STK_GD_R> _gdCache = null;
	protected void selectGdL(MCList<Srch01_RsltGrR> dtlL) {
		MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.gd_nm);
		_gdCache = new FXUCL_MCDbcCache<MAM_STK_GD_R>(dbcL_bldr, dtlL, Srch01_RsltGrR.$gd_cd);
	}
	//- 案件手配紐付ビュー検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MSVT_WRK_SNO_R> _wrkSnoCache = null;
	protected void selectWrkSnoL(MCList<Srch01_RsltGrR> dtlL) {
		MSVT_WRK_SNO_R t = MSVT_WRK_SNO_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.wrk_no, t.wrk_nm);
		_wrkSnoCache = new FXUCL_MCDbcCache<MSVT_WRK_SNO_R>(dbcL_bldr, dtlL, Srch01_RsltGrR.$sno1);
	}
	//- 取引先マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_BP_R> _stkBpCache = null;
	protected void selectStkBpL(MCList<Srch01_RsltGrR> dtlL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.bp_nm);
		_stkBpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbcL_bldr, dtlL, Srch01_RsltGrR.$stk_bp_cd);
	}
	//- 取引先マスタ検索 ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_BP_R> _stkArrvBpCache = null;
	protected void selectStkArrvBpL(MCList<Srch01_RsltGrR> dtlL) {
		MAM_BP_R t = MAM_BP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.bp_nm);
		_stkArrvBpCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbcL_bldr, dtlL, Srch01_RsltGrR.$stk_arrv_bp_cd);
	}
	//- 単位マスタ検索（荷姿単位） ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_UNIT_R> _packUnitCache = null;
	protected void selectPackUnitL(MCList<Srch01_RsltGrR> dtlL) {
		MAM_UNIT_R t = MAM_UNIT_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.unit_nm);
		_packUnitCache = new FXUCL_MCDbcCache<MAM_UNIT_R>(dbcL_bldr, dtlL, Srch01_RsltGrR.$pack_unit_cd);
	}
	//- 単位マスタ検索（基準単位） ---------------------------------------------
	protected FXUCL_MCDbcCache<MAM_UNIT_R> _baseUnitCache = null;
	protected void selectBaseUnitL(MCList<Srch01_RsltGrR> dtlL) {
		MAM_UNIT_R t = MAM_UNIT_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.unit_nm);
		_baseUnitCache = new FXUCL_MCDbcCache<MAM_UNIT_R>(dbcL_bldr, dtlL, Srch01_RsltGrR.$base_unit_cd);
	}

	protected void editSno(Srch01_CndR up0) {
		// 手配ＮＯ管理区分：管理する（任意：在庫対象外）の場合は検索条件を使用しない
		if (!isNullAnd(up0.sno1(), up0.sno2(), up0.sno3(), up0.sno4())) {
			MAM_ITM_R itm = MAM_ITM_R.create();
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
			itm_bldr.setSelect(t.sno1_mng_typ, t.sno2_mng_typ,
					t.sno3_mng_typ, t.sno4_mng_typ);
			itm_bldr.setWhere(
					t.itm_cd.eq(bind("itm_cd"))
					.and(t.itm_sub1.eq(bind("itm_sub1")))
					.and(t.itm_sub2.eq(bind("itm_sub2")))
					.and(t.itm_sub3.eq(bind("itm_sub3"))));
			dbSelect("MSBEL0040_MAM_ITM_S02", itm, itm_bldr, up0);
			if (!isNull(up0.sno1()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno1_mng_typ())) {
				up0.sno1(MAC_STR.NULL_VAL.value());
			}
			if (!isNull(up0.sno2()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno2_mng_typ())) {
				up0.sno2(MAC_STR.NULL_VAL.value());
			}
			if (!isNull(up0.sno3()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno3_mng_typ())) {
				up0.sno3(MAC_STR.NULL_VAL.value());
			}
			if (!isNull(up0.sno4()) && MAC_SNO_MNG_TYP.isMNG_NOT_STK(itm.sno4_mng_typ())) {
				up0.sno4(MAC_STR.NULL_VAL.value());
			}
		}
	}

	//FMCB CUSTOM END
}