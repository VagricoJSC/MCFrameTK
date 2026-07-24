package mcframe.serverMSBE.MSBEL1400;

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
import mcframe.serverMSBE.MSBEL1400.*; // このimportはFrameManagerの自動生成で追加されました。

import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.serverMSBE.MSBEL5530.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.serverCore.sys.MCSys;

import static mcframe.serverMSBE.MSBEL1400.Query.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;

import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipInstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipInstReg_MC extends MSBEL_ShipInstReg_MC_A{
	//FMCB CUSTOM START

	/** 出荷指図ヘッダの行 */
	MST_SHIP_INST_R _instR = MST_SHIP_INST_R.create();

	/** 出荷予定ＮＯを元に検索した出荷予定の一覧 */
	MCList<MST_SHIP_SCHD_R> _schdL = MCList.create(MST_SHIP_SCHD_R.class);

	MCIndexKey _schdIdx = null;

	/** 出荷進捗の一覧 */
	MCList<MST_SHIP_PR_R> _prL = MCList.create(MST_SHIP_PR_R.class);

	MCIndexKey _prIdx = null;

	/** 出荷引当状況の一覧 */
	MCList<MST_SHIP_ALLOC_STS_R> _allocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);

	MCIndexKey _allocStsIdx = null;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 登録済みの出荷指図を検索する。<br>
	 */
	public class Srch01 extends MSBEL_ShipInstReg_MC_A.Srch01 {
		/**
		 * インボイス出荷指図マップリスト
		 */
		protected MCList<MST_IV_SHIP_INST_MAP_R> _ivShipInstMapL = null;
		
		/**
		 * インボイス出荷指図マップリストのインデックス
		 */
		protected MCIndexKey _ivShipInstMapIdxkey = null;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			MCNumber latestRevNo = getRevNo();
			int cnt = 0;

			if (isNull(up0().ship_inst_rev())) {
				up0().ship_inst_rev(latestRevNo);
			}

			cnt = srchInstHdr();

			if (isSame(cnt, 0)) {
				return;
			}

			down0().latest_flg(checkLatestInst(latestRevNo));
			setNonDlvPrntFlg();
			srchInstDtl();
			srchSchdCntr();
			getIvShipInstMapL();
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();

			if (isNull(down1())) {
				down0().clear();
				return;
			}

			for (Srch01_DtlR dtlR : down1()) {
				// 出荷元物流ＧＣＤ
				dtlR.ship_fr_lg_grp_cd(down0().ship_fr_lg_grp_cd());
			}
			doEditDownForIv();
			doEditDownForSrch(down0(), down1());
		}

		protected MCNumber getRevNo() {
			MCRow row = MCRow.create();

			row.addNumberColumn(MST_SHIP_INST_R.$ship_inst_rev);
			executeQuery(row, MSBEL1400_MST_SHIP_INST_S01(), up0());

			return row.getNumber(MST_SHIP_INST_R.$ship_inst_rev);
		}

		protected int srchInstHdr() {
			// 参照モード以外
			if (!isSame(up0().screen_ope(), "3")) {
				up0().addStringColumn("edit_mode_flg", MCBooleanUtil.booleanToDBString(true));
			}
			return executeQuery(down0(), MSBEL1400_MST_SHIP_INST_S02(), up0());
		}

		protected void setNonDlvPrntFlg() {
			// 以下の条件を満たす場合、納品書および出荷案内書は発行不可
			// ・指図で発行していない
			// ・出荷済み
			for (MST_SHIP_INST_R actR : checkShipAct()) {
				if (!isNull(actR.getStringNE("ship_act_no"))) {
					if (!actR.dlv_prnt_flg()) {
						down0().non_dlv_prnt_flg(true);
					}
					if (!actR.ship_adv_prnt_flg()) {
						down0().non_adv_prnt_flg(true);
					}
				}
			}
		}
		protected MCList<MST_SHIP_INST_R> checkShipAct() {
			MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T1");
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MST_SHIP_ACT_R t3 = MST_SHIP_ACT_R.create("T3");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
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
			bldr.setWhere(t1.ship_inst_no.eq(bind("1")), down0().ship_inst_no());
			
			MCList<MST_SHIP_INST_R> rsltL = MCList.create(MST_SHIP_INST_R.class);
			rsltL.addStringColumn(MST_DLV_SLIP_R.$dlv_slip_no);
			rsltL.addStringColumn(MST_SHIP_ACT_R.$ship_act_no);
			dbSelect("MSBEL1400_MST_SHIP_INST_S06", rsltL, bldr);
			
			return rsltL;
		}

		protected boolean checkLatestInst(MCNumber latestRevNo) {
			if (up0().latest_flg()) {
				return true;
			}
			else {
				if (!isNull(up0().ship_inst_rev())) {
					if (isSame(up0().ship_inst_rev(), latestRevNo)) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
		}

		protected void srchInstDtl() {
			MCList<Srch01_DtlR> d1 = MCList.create(Srch01_DtlR.class);
			if (down0().can_flg()) {
				up0().addStringColumn("ref_mode_flg", MCBooleanUtil.booleanToDBString(true));
			}
		int cnt = executeQuery(d1, MSBEL1400_MST_SHIP_INST_D_S01(), up0());

			if (isSame(cnt, 0)) {
				down0().clear();
				return;
			}

			down1().clear();
			for (MCList<Srch01_DtlR> list : d1.groupList(Srch01_DtlR.$ship_alloc_sts_no)) {
				Srch01_DtlR dtlR = list.get(0);

				if (list.size() > 1) {
					// 指図まとめの場合に複数になる
					// ただし、「売上」「出荷」やWG間依頼経由の移送は指図まとめの対象外
					dtlR.ship_schd_no(null);
					dtlR.xfr_schd_no(null);
					dtlR.inst_bndl_flg(true);
				}
				down1().add(dtlR);
			}
			down1().sort(Srch01_DtlR.$disp_seq);
		}
		
		protected void srchSchdCntr() {
			if (down1().isEmpty()) {
				return;
			}

			MCList<MST_SHIP_SCHD_R> dbc = MCList.create(MST_SHIP_SCHD_R.class);
			dbc.addStringColumn("ship_alloc_sts_no");
			dbc.addNumberColumn("ship_pr_upd_cntr");
			dbc.addNumberColumn("ship_schd_upd_cntr");
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
			dbc_bldr.setSelect(t.ship_pr_no,
					t.ship_schd_no,
					t.ship_inst_d_no,
					t2.ship_alloc_sts_no,
					t1.upd_cntr.as("ship_pr_upd_cntr"),
					t.upd_cntr.as("ship_schd_upd_cntr"));
			dbc_bldr.addInnerJoin(t1, bracket(t1.ship_pr_no.eq(t.ship_pr_no)));
			dbc_bldr.addInnerJoin(t2, bracket(t2.ship_inst_d_no.eq(t.ship_inst_d_no)));
			dbc_bldr.setWhere(t.ship_inst_d_no.eq(bind("ship_inst_d_no")));
			dbSelect("MSBEL1400_MST_SHIP_SCHD_S01", dbc, dbc_bldr, down1().groupBy(Srch01_DtlR.$ship_inst_d_no));

			dbc.forEach(r -> {
				Srch01_ShipSchd_DtlR d2 = down2().add();
				d2.ship_pr_no(r.ship_pr_no());
				d2.ship_schd_no(r.ship_schd_no());
				d2.ship_inst_d_no(r.ship_inst_d_no());
				d2.ship_alloc_sts_no(r.getString("ship_alloc_sts_no"));
				d2.ship_pr_upd_cntr(r.getNumber("ship_pr_upd_cntr"));
				d2.ship_schd_upd_cntr(r.getNumber("ship_schd_upd_cntr"));
			});
		}
		
		/**
		 * インボイス出荷指図マップを取得する。
		 */
		protected void getIvShipInstMapL() {
			
			_ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
			_ivShipInstMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
			ivShipInstMap_bldr.addSelect(iv.iv_no);
			ivShipInstMap_bldr.addInnerJoin(ivD, ivShipInstMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipInstMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipInstMap_bldr.setWhere(ivShipInstMap.ship_inst_d_no.eq(bind(Srch01_DtlR.$ship_inst_d_no)));
			ivShipInstMap_bldr.addWhereWithAnd(ivShipInstMap.ship_inst_fix_flg.eq(value(true)));
			
			dbSelect("MSBEL1440_MST_IV_SHIP_INST_MAP_S01", _ivShipInstMapL, ivShipInstMap_bldr, down1());
			
			_ivShipInstMapIdxkey = _ivShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_inst_d_no, MST_IV_SHIP_INST_MAP_R.$ship_alloc_sts_no);
		}
		
		/**
		 * インボイス取引かつインボイス単位出荷ではない明細に対して下り電文を編集する。
		 */
		protected void doEditDownForIv() {
			
			if (isNull(_ivShipInstMapL)) {
				return;
			}
			
			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			
			for (Srch01_DtlR downR : down1()) {
				
				MCNumber baseUnitQty = downR.base_unit_qty();
				
				MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = _ivShipInstMapL.subList(_ivShipInstMapIdxkey, downR.ship_inst_d_no(), downR.ship_alloc_sts_no());
				
				if (ivShipInstMapL.isEmpty()) {
					Srch01_DtlR dtlR = downR.clone();
					dtlL.add(dtlR);
				}
				else {
					for (MST_IV_SHIP_INST_MAP_R ivShipInstMapR: ivShipInstMapL) {
						
						if (!baseUnitQty.isPositive()) {
							break;
						}
						
						MCNumber unShipinstIvQty =  ivShipInstMapR.base_unit_qty();
						
						if (!unShipinstIvQty.isPositive()) {
							continue;
						}
						
						Srch01_DtlR dtlR = downR.clone();
						dtlR.iv_no(ivShipInstMapR.getStringNE(MST_IV_R.$iv_no));
						dtlR.iv_d_no(ivShipInstMapR.iv_d_no());
						
						if (baseUnitQty.gt(unShipinstIvQty)) {
							dtlR.base_unit_qty(unShipinstIvQty);
							baseUnitQty = baseUnitQty.subtract(unShipinstIvQty);
							ivShipInstMapR.base_unit_qty(ivShipInstMapR.base_unit_qty().subtract(unShipinstIvQty));
						}
						else {
							dtlR.base_unit_qty(baseUnitQty);
							ivShipInstMapR.base_unit_qty(ivShipInstMapR.base_unit_qty().subtract(baseUnitQty));
							baseUnitQty = MCNumber.ZERO;
						}
						
						if (isSame(dtlR.ent_unit_cd(), dtlR.base_unit_cd())) {
							dtlR.ent_unit_qty(dtlR.base_unit_qty());
						}
						else {
							MCNumber entUnitQty = rvrsBaseUnitConv(
									dtlR.base_unit_qty(), dtlR.ent_unit_conv_base_qty(), dtlR.ent_unit_conv_qty(), dtlR.ent_unit_dec_place(), dtlR.ent_unit_rnd_typ(), true);
							
							if (!isNull(entUnitQty)) {
								dtlR.ent_unit_qty(entUnitQty);
							}
							else {
								dtlR.ent_unit_qty(dtlR.base_unit_qty());
								dtlR.ent_unit_cd(dtlR.base_unit_cd());
								dtlR.ent_unit_nm(dtlR.base_unit_nm());
							}
						}
						
						dtlL.add(dtlR);
					}
					
					if (baseUnitQty.isPositive()) {
						Srch01_DtlR dtlR = downR.clone();
						dtlR.base_unit_qty(baseUnitQty);
						
						if (isSame(dtlR.ent_unit_cd(), dtlR.base_unit_cd())) {
							dtlR.ent_unit_qty(dtlR.base_unit_qty());
						}
						else {
							MCNumber entUnitQty = rvrsBaseUnitConv(
									dtlR.base_unit_qty(), dtlR.ent_unit_conv_base_qty(), dtlR.ent_unit_conv_qty(), dtlR.ent_unit_dec_place(), dtlR.ent_unit_rnd_typ(), true);
							
							if (!isNull(entUnitQty)) {
								dtlR.ent_unit_qty(entUnitQty);
							}
							else {
								dtlR.ent_unit_qty(dtlR.base_unit_qty());
								dtlR.ent_unit_cd(dtlR.base_unit_cd());
								dtlR.ent_unit_nm(dtlR.base_unit_nm());
							}
						}
						
						dtlL.add(dtlR);
					}
				}
			}
			dtlL.sort(Srch01_DtlR.$disp_seq, Srch01_DtlR.$iv_no);
			setDispSeq(dtlL);
			dtlL.setStatus(MCRow.NONE);
			down1().setAll(dtlL);
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 出荷指図前に実行する検索処理。<br>
	 */
	public class Srch02 extends MSBEL_ShipInstReg_MC_A.Srch02 {

		protected String SLO_IV_NO = "slo_iv_no";
		protected String IV_TRD_FLG = "iv_trd_flg";
		protected String VIA_DLV_TYP = "via_dlv_typ";
		/**
		 * インボイス出荷指図マップリスト
		 */
		protected MCList<MST_IV_SHIP_INST_MAP_R> _ivShipInstMapL = null;
		
		/**
		 * インボイス出荷指図マップリストのインデックス
		 */
		protected MCIndexKey _ivShipInstMapIdxkey = null;
		
		/**
		 * インボイスマップリスト
		 */
		protected MCList<MST_IV_MAP_R> _ivMapL = null;
		
		/**
		 * インボイスマップリストのインデックス
		 */
		protected MCIndexKey _ivMapIdxkey = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			insSchdWk(up0().linked_ship_schd_no());
			setCndIvNo();

			if (!isNull(up0().iv_no())) {
				doSrchIv();
			}
			else {
				setCndSSNo();
				doSrchSchd();
				getIvMapL();
				getIvShipInstMapL();
			}
		}

		@Override
		protected void doEditDown() {
			super.doEditDown();

			if (down0().isEmpty() || isNull(down1())) {
				down0().clear();
				down1().clear();
				down2().clear();
				return;
			}

			doEditDownForIv();
			doEditDownForSrch(down0(), down1());
			setDispSeq(down1());
		}

		/**
		 * 品揃え対象の出荷予定も含めて、検索対象の出荷予定をワークに登録する
		 */
		protected void setCndSSNo() {
			MSW_SHIP_SCHD_KEY_R w1 = MSW_SHIP_SCHD_KEY_R.create("W1");
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
			MST_SLO_R t3 = MST_SLO_R.create("T3");
			MST_SLO_D_R t4 = MST_SLO_D_R.create("T4");
			MST_SHIP_PR_R t5 = MST_SHIP_PR_R.create("T5");
			MST_SHIP_SCHD_R t6 = MST_SHIP_SCHD_R.create("T6");

			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			schdL.addStringColumn("org_ship_schd_no");
			schdL.addStringColumn("org_slo_d_no");
			schdL.addStringColumn("slo_no");
			schdL.addStringColumn("assort_typ");
			schdL.addStringColumn("set_itm_grp_no");
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setSelect(w1.ship_schd_no.as("org_ship_schd_no"),
					t2.slo_d_no.as("org_slo_d_no"),
					t3.slo_no,
					t3.assort_typ,
					t4.set_itm_grp_no,
					t4.slo_d_no,
					t6.ship_schd_no);
			schdL_bldr.addInnerJoin(w1, bracket(w1.ship_schd_no.eq(t.ship_schd_no)));
			schdL_bldr.addInnerJoin(t1, bracket(t1.ship_pr_no.eq(t.ship_pr_no)));
			schdL_bldr.addInnerJoin(t2, bracket(t2.slo_d_no.eq(t1.slo_d_no)));
			schdL_bldr.addInnerJoin(t3, bracket(t3.slo_no.eq(t2.slo_no)));
			schdL_bldr.addInnerJoin(t4, bracket(t4.slo_no.eq(t3.slo_no)));
			schdL_bldr.addInnerJoin(t5, bracket(t5.slo_d_no.eq(t4.slo_d_no)
					.and(t5.ship_to_id_typ.eq(
							nvl2(t.tdlv_cd, value(MSC_SHIP_TO_ID_TYP.TDLV.value()), t1.ship_to_id_typ)))
					.and(t5.ship_to_id_cd.eq(
							nvl(nvl(t.tdlv_cd,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											t.dlv_cd, nullValue())),
							t1.ship_to_id_cd)))
					.and(t5.ship_to_id_nm.eq(
							nvl2(t.tdlv_cd, t.tdlv_nm,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_nm, t1.ship_to_id_nm),
											t1.ship_to_id_nm)))
							.or(t5.ship_to_id_nm.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_nm,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_nm, t1.ship_to_id_nm),
											t1.ship_to_id_nm)).isNull()))
					.and(t5.ship_to_zip_cd.eq(
							nvl2(t.tdlv_cd, t.tdlv_zip_cd,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_zip_cd, t1.ship_to_zip_cd),
											t1.ship_to_zip_cd)))
							.or(t5.ship_to_zip_cd.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_zip_cd,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_zip_cd, t1.ship_to_zip_cd),
											t1.ship_to_zip_cd)).isNull()))
					.and(t5.ship_to_addr1.eq(
							nvl2(t.tdlv_cd, t.tdlv_addr1,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_addr1, t1.ship_to_addr1),
											t1.ship_to_addr1)))
							.or(t5.ship_to_addr1.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_addr1,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_addr1, t1.ship_to_addr1),
											t1.ship_to_addr1)).isNull()))
					.and(t5.ship_to_addr2.eq(
							nvl2(t.tdlv_cd, t.tdlv_addr2,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_addr2, t1.ship_to_addr2),
											t1.ship_to_addr2)))
							.or(t5.ship_to_addr2.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_addr2,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_addr2, t1.ship_to_addr2),
											t1.ship_to_addr2)).isNull()))
					.and(t5.ship_to_addr3.eq(
							nvl2(t.tdlv_cd, t.tdlv_addr3,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_addr3, t1.ship_to_addr3),
											t1.ship_to_addr3)))
							.or(t5.ship_to_addr3.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_addr3,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_addr3, t1.ship_to_addr3),
											t1.ship_to_addr3)).isNull()))
					.and(t5.ship_to_addr4.eq(
							nvl2(t.tdlv_cd, t.tdlv_addr4,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_addr4, t1.ship_to_addr4),
											t1.ship_to_addr4)))
							.or(t5.ship_to_addr4.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_addr4,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_addr4, t1.ship_to_addr4),
											t1.ship_to_addr4)).isNull()))
					.and(t5.ship_to_cntct_dpt.eq(
							nvl2(t.tdlv_cd, t.tdlv_cntct_dpt,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_cntct_dpt, t1.ship_to_cntct_dpt),
											t1.ship_to_cntct_dpt)))
							.or(t5.ship_to_cntct_dpt.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_cntct_dpt,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_cntct_dpt, t1.ship_to_cntct_dpt),
											t1.ship_to_cntct_dpt)).isNull()))
					.and(t5.ship_to_cntct_psn.eq(
							nvl2(t.tdlv_cd, t.tdlv_cntct_psn,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_cntct_psn, t1.ship_to_cntct_psn),
											t1.ship_to_cntct_psn)))
							.or(t5.ship_to_cntct_psn.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_cntct_psn,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_cntct_psn, t1.ship_to_cntct_psn),
											t1.ship_to_cntct_psn)).isNull()))
					.and(t5.ship_to_tel.eq(
							nvl2(t.tdlv_cd, t.tdlv_tel,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_tel, t1.ship_to_tel),
											t1.ship_to_tel)))
							.or(t5.ship_to_tel.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_tel,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_tel, t1.ship_to_tel),
											t1.ship_to_tel)).isNull()))
					.and(t5.ship_to_fax.eq(
							nvl2(t.tdlv_cd, t.tdlv_fax,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_fax, t1.ship_to_fax),
											t1.ship_to_fax)))
							.or(t5.ship_to_fax.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_fax,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_fax, t1.ship_to_fax),
											t1.ship_to_fax)).isNull()))
					.and(t5.via_dlv_typ.eq(
							nvl(t.via_dlv_typ, t1.via_dlv_typ))
							.or(t5.via_dlv_typ.isNull())
							.and(nvl(t.via_dlv_typ, t1.via_dlv_typ).isNull()))
					.and(t5.ship_to_lg_grp_cd.eq(
							nvl2(t.tdlv_cd, t.tdlv_lg_grp_cd,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_lg_grp_cd, t1.ship_to_lg_grp_cd),
											t1.ship_to_lg_grp_cd)))
							.or(t5.ship_to_lg_grp_cd.isNull())
							.and(nvl2(t.tdlv_cd, t.tdlv_lg_grp_cd,
									decode(t1.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											nvl2(t.dlv_cd, t.dlv_lg_grp_cd, t1.ship_to_lg_grp_cd),
											t1.ship_to_lg_grp_cd)).isNull()))));
			schdL_bldr.addInnerJoin(t6, bracket(t6.ship_pr_no.eq(t5.ship_pr_no)));
			schdL_bldr.setWhere(bracket(t2.set_itm_grp_no.isNotNull()
					.and(t2.set_itm_grp_no.eq(t4.set_itm_grp_no))
					.or(t3.assort_typ.eq(value(MSC_SHIP_ASSORT_TYP.AST.value())))
					.or(t4.set_itm_grp_no.isNull())
					.and(t4.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NO_PICK.value())))));
			schdL_bldr.addWhereWithAnd(t4.can_flg.eq(value(false)));
			schdL_bldr.addWhereWithAnd(t4.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NON.value())));
			schdL_bldr.addWhereWithAnd(t6.abort_flg.eq(value(false)));
			dbSelect("MSBEL1400_MST_SHIP_SCHD_S02", schdL, schdL_bldr);

			// SQLでは品揃え対象、ピッキングなしのみなので、品揃え以外の出荷予定を追加する
			for (String s : MCStringUtil.arrayValueSplit(up0().linked_ship_schd_no())) {
				schdL.add().ship_schd_no(s);
			}
			dbWkDelete("MSBEL1400_MSW_SHIP_SCHD_D01", schdL_bldr.getBaseDbc());
			dbWkInsert("MSBEL1400_MSW_SHIP_SCHD_I01",
					schdL.groupBy(MST_SHIP_SCHD_R.$ship_schd_no), schdL_bldr.getBaseDbc());
		}

		/**
		 * 検索条件をワークに登録する
		 */
		protected void insSchdWk(String schdNos) {
			MCList<MST_SHIP_SCHD_R>
			schdL = MCList.create(MST_SHIP_SCHD_R.class);

			for (String str : MCStringUtil.arrayValueSplit(schdNos)) {
				schdL.add().ship_schd_no(str);
			}
			schdL = schdL.groupBy(MST_SHIP_SCHD_R.$ship_schd_no);

			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			dbWkDelete("MSBEL1400_MSW_SHIP_SCHD_D02", schdL_bldr.getBaseDbc());
			dbWkInsert("MSBEL1400_MSW_SHIP_SCHD_I02", schdL, schdL_bldr.getBaseDbc());
		}

		/**
		 * インボイス単位出荷かを判定し、インボイスNOを設定する
		 */
		protected void setCndIvNo() {
			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);

			schdL.addStringColumn(MST_IV_R.$iv_no);
			schdL.addBooleanColumn(MST_IV_R.$iv_ship_flg);
			schdL.addBooleanColumn(MAM_BP_R.$cst_iv_flg);
			schdL.addStringColumn(SLO_IV_NO);
			schdL.addBooleanColumn(IV_TRD_FLG);

			executeQuery(schdL, MSBEL1400_MST_SHIP_SCHD_S02());

			if (schdL.isEmpty()) {
				// 上り電文の出荷予定NOが不正
				throw new MCAppException(MSBEL0203, up0().linked_ship_schd_no());
			}
			else {
				MST_SHIP_SCHD_R schdR = schdL.get(0);

				// インボイス取引かつ配送先経由しない場合は、インボイス単位出荷であること
				if (schdR.getBoolean("cst_iv_flg") || schdR.getBoolean("iv_trd_flg")) {
					if (!MAC_VIA_DLV_TYP.isVIA(schdR.getString("via_dlv_typ")) 
							&& !MAC_TRD_PTN_TYP.isSLS(schdR.getStringNE("trd_ptn_typ")) && !MAC_TRD_PTN_TYP.isSHIP(schdR.getStringNE("trd_ptn_typ"))) {
						if (isNull(schdR.getString("iv_no"))) {
							throw new MCAppException(MSBEL0266);
						}
						else if (!schdR.getBoolean("iv_ship_flg")) {
							throw new MCAppException(MSBEL0267);
						}
					}
					if (schdL.size() > 1) {
						List<String> ivShipIvNoL = new ArrayList<String>();
						for (MST_SHIP_SCHD_R r : schdL) {
							if (r.getBoolean("iv_ship_flg")) {
								// インボイスNOが混在(インボイス単位出荷が含まれる場合)
								ivShipIvNoL.add(r.getStringNE(MST_IV_R.$iv_no));
							}
						}
						if (ivShipIvNoL.size() > 0) {
							throw new MCAppException(MSBEL0204, String.join(",",ivShipIvNoL));
						}
					}
				}
				// インボイス取引対象（得意先）
				if (schdR.getBoolean(MAM_BP_R.$cst_iv_flg)) {
					if (isNull(schdR.getString(SLO_IV_NO))) {
						// 受注インボイスNOなし、インボイス登録あり、かつインボイス単位出荷
						if (!isNull(schdR.getString(MST_IV_R.$iv_no))
								&& schdR.getBoolean(MST_IV_R.$iv_ship_flg)) {
							up0().iv_no(schdR.getString(MST_IV_R.$iv_no));
						}
					}
					else if (isNull(schdR.getString(MST_IV_R.$iv_no))) {
						// 受注インボイスNOあり、かつインボイスが登録されていない
						throw new MCAppException(MSBEL0205, schdR.getString(SLO_IV_NO));
					}
					else if (isSame(schdR.getString(SLO_IV_NO),
							schdR.getString(MST_IV_R.$iv_no))) {
						up0().iv_no(schdR.getString(MST_IV_R.$iv_no));
					}
				}
				// インボイス取引対象（移送・支給）
				else if (schdR.getBoolean(IV_TRD_FLG)) {
					// インボイス登録あり、かつインボイス単位出荷
					if (!isNull(schdR.getString(MST_IV_R.$iv_no))
							&& schdR.getBoolean(MST_IV_R.$iv_ship_flg)) {
						up0().iv_no(schdR.getString(MST_IV_R.$iv_no));
					}
				}
			}
		}

		/**
		 * インボイス、インボイス明細を検索する
		 */
		protected void doSrchIv() {
			doSrchDtl(up0(), down1(), down2(), MSBEL1400_MST_IV_S01());
			doSrchHdr(up0(), down0(), MSBEL1400_MST_SHIP_SCHD_S03());
		}

		/**
		 * 出荷予定を検索する
		 */
		protected void doSrchSchd() {
			doSrchDtl(up0(), down1(), down2(), MSBEL1400_MST_SHIP_SCHD_S01());
			doSrchHdr(up0(), down0(), MSBEL1400_MST_SHIP_SCHD_S04());
		}
		
		/**
		 * インボイスマップを取得する。
		 */
		protected void getIvMapL() {
			
			_ivMapL = MCList.create(MST_IV_MAP_R.class);
			_ivMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_MAP_R ivMap = MST_IV_MAP_R.create("IVMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivMap_bldr = MCQueryApiBuilder.create(ivMap);
			ivMap_bldr.addSelect(iv.iv_no);
			ivMap_bldr.addInnerJoin(ivD, ivMap.iv_d_no.eq(ivD.iv_d_no));
			ivMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivMap_bldr.setWhere(ivMap.ship_schd_no.eq(bind(MST_IV_MAP_R.$ship_schd_no)));
			ivMap_bldr.addWhereWithAnd(iv.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())));
			
			dbSelect("MSBEL1440_MST_IV_MAP_S01", _ivMapL, ivMap_bldr, down1());
			
			_ivMapIdxkey = _ivMapL.createIndex(MST_IV_MAP_R.$ship_schd_no);
		}
		
		/**
		 * インボイス出荷指図マップを取得する。
		 */
		protected void getIvShipInstMapL() {
			
			_ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
			_ivShipInstMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
			ivShipInstMap_bldr.addSelect(iv.iv_no);
			ivShipInstMap_bldr.addInnerJoin(ivD, ivShipInstMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipInstMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipInstMap_bldr.setWhere(ivShipInstMap.iv_d_no.eq(bind(MST_IV_MAP_R.$iv_d_no)));
			
			dbSelect("MSBEL1440_MST_IV_SHIP_INST_MAP_S02", _ivShipInstMapL, ivShipInstMap_bldr, _ivMapL);
			
			_ivShipInstMapIdxkey = _ivShipInstMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$iv_d_no, MST_IV_SHIP_ACT_MAP_R.$ship_schd_no);
		}
		
		/**
		 * インボイス取引かつインボイス単位出荷ではない明細に対して下り電文を編集する。
		 */
		protected void doEditDownForIv() {
			
			if (isNull(_ivMapL)) {
				return;
			}
			
			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			
			for (Srch01_DtlR downR : down1()) {
				
				MCNumber baseUnitQty = downR.base_unit_qty();
				
				MCList<MST_IV_MAP_R> ivMapL = _ivMapL.subList(_ivMapIdxkey, downR.ship_schd_no());
				
				if (ivMapL.isEmpty()) {
					Srch01_DtlR dtlR = downR.clone();
					dtlL.add(dtlR);
				}
				else {
					for (MST_IV_MAP_R ivMapR: ivMapL) {
						
						if (!baseUnitQty.isPositive()) {
							break;
						}
						
						MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = _ivShipInstMapL.subList(_ivShipInstMapIdxkey, ivMapR.iv_d_no(), ivMapR.ship_schd_no());
						MCNumber shipInstQty = MCNumber.ZERO;
						if (!ivShipInstMapL.isEmpty()) {
							shipInstQty = ivShipInstMapL.sum(MST_IV_SHIP_INST_MAP_R.$base_unit_qty);
						}
						
						MCNumber unShipinstIvQty =  ivMapR.base_unit_qty().subtract(shipInstQty);
						
						if (!unShipinstIvQty.isPositive()) {
							continue;
						}
						
						Srch01_DtlR dtlR = downR.clone();
						dtlR.iv_no(ivMapR.getStringNE(MST_IV_R.$iv_no));
						dtlR.iv_d_no(ivMapR.iv_d_no());
						
						if (baseUnitQty.gt(unShipinstIvQty)) {
							dtlR.base_unit_qty(unShipinstIvQty);
							baseUnitQty = baseUnitQty.subtract(unShipinstIvQty);
							ivMapR.base_unit_qty(ivMapR.base_unit_qty().subtract(unShipinstIvQty));
						}
						else {
							dtlR.base_unit_qty(baseUnitQty);
							ivMapR.base_unit_qty(ivMapR.base_unit_qty().subtract(baseUnitQty));
							baseUnitQty = MCNumber.ZERO;
						}
						
						if (isSame(dtlR.ent_unit_cd(), dtlR.base_unit_cd())) {
							dtlR.ent_unit_qty(dtlR.base_unit_qty());
						}
						else {
							MCNumber entUnitQty = rvrsBaseUnitConv(
									dtlR.base_unit_qty(), dtlR.ent_unit_conv_base_qty(), dtlR.ent_unit_conv_qty(), dtlR.ent_unit_dec_place(), dtlR.ent_unit_rnd_typ(), true);
							
							if (!isNull(entUnitQty)) {
								dtlR.ent_unit_qty(entUnitQty);
							}
							else {
								dtlR.ent_unit_qty(dtlR.base_unit_qty());
								dtlR.ent_unit_cd(dtlR.base_unit_cd());
								dtlR.ent_unit_nm(dtlR.base_unit_nm());
							}
						}
						
						dtlL.add(dtlR);
					}
					
					if (baseUnitQty.isPositive()) {
						Srch01_DtlR dtlR = downR.clone();
						dtlR.base_unit_qty(baseUnitQty);
						
						if (isSame(dtlR.ent_unit_cd(), dtlR.base_unit_cd())) {
							dtlR.ent_unit_qty(dtlR.base_unit_qty());
						}
						else {
							MCNumber entUnitQty = rvrsBaseUnitConv(
									dtlR.base_unit_qty(), dtlR.ent_unit_conv_base_qty(), dtlR.ent_unit_conv_qty(), dtlR.ent_unit_dec_place(), dtlR.ent_unit_rnd_typ(), true);
							
							if (!isNull(entUnitQty)) {
								dtlR.ent_unit_qty(entUnitQty);
							}
							else {
								dtlR.ent_unit_qty(dtlR.base_unit_qty());
								dtlR.ent_unit_cd(dtlR.base_unit_cd());
								dtlR.ent_unit_nm(dtlR.base_unit_nm());
							}
						}
						
						dtlL.add(dtlR);
					}
				}
			}
			dtlL.sort(Srch01_DtlR.$slo_no, Srch01_DtlR.$disp_seq, Srch01_DtlR.$ship_schd_no, Srch01_DtlR.$ship_alloc_sts_no, Srch01_DtlR.$iv_no);
			down1().setAll(dtlL);
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * ロット提案処理を行う。<br>
	 */
	public class Sprt01 extends MSBEL_ShipInstReg_MC_A.Sprt01 {
		
		protected MCIndexKey _up1Idx;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			initCache();
			doChk();
			editUp();
			callAllocMngServiceAllocSrch01();
			dbTran().rollback();
			setDown();
		}

		protected void setDown() {
			down0().setAll(setAllocRsltL(up0()));
		}

		protected void initCache() {
			initTranCache();
			srchShipPr(up1());
			srchShipSchd(up1());
			initItmCache(up0());
			
			MCList<Sprt01_DtlR> l = MCList.create(Sprt01_DtlR.class);
			for (Sprt01_DtlR r : up0()) {
				// 入力単位
				l.add(r);

				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				// 基準単位
				Sprt01_DtlR tmpR = r.clone();
				tmpR.ent_unit_cd(itmR.unit_cd());
				l.add(tmpR);

				// 梱包単位
				tmpR = r.clone();
				tmpR.ent_unit_cd(itmR.pckg_unit_cd());
				l.add(tmpR);
			}
			initItmUnitCache(l);
		}

		protected void doChk() {
			_up1Idx = up1().createIndex(Srch01_ShipSchd_DtlR.$tmp_inst_d_no);

			for (Sprt01_DtlR r : up0()) {
				Srch01_ShipSchd_DtlR up1R = up1().getFirst(_up1Idx, r.tmp_inst_d_no());

				MST_SHIP_SCHD_R schdR = _schdL.getFirst(_schdIdx, up1R.ship_schd_no());
				MST_SHIP_PR_R prR = _prL.getFirst(_prIdx, up1R.ship_pr_no());

				if (isNull(schdR) || isNull(prR)) {
					MCMessagePool.add(new MCMessage(r, null, MSBEL0338, toDispGUIIndex(r)));
				}
			}
			// 排他エラーがある場合、後続処理を行わない
			throwErr(new MCMessage(MSBEL0337));
		}

		protected void editUp() {

			for (Sprt01_DtlR r : up0()) {
				Srch01_ShipSchd_DtlR up1R = up1().getFirst(_up1Idx, r.tmp_inst_d_no());

				MST_SHIP_SCHD_R schdR = _schdL.getFirst(_schdIdx, up1R.ship_schd_no());
				MST_SHIP_PR_R prR = _prL.getFirst(_prIdx, up1R.ship_pr_no());

				// 指図まとめの場合、出荷予定が複数存在するので、その場合も考慮して先頭の出荷予定から情報を取得する
				// ※まとめ時のキーが同じなので、どの出荷予定から取得しても同じなので
				r.ship_pr_no(schdR.ship_pr_no());
				r.ship_schd_no(schdR.ship_schd_no());

				if (r.gi_str_ln_cd_none_flg()) {
					r.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
				boolean isEx =
					(prR.getBoolean("cst_iv_flg") || schdR.getBoolean("iv_trd_flg"))
						&& MAC_VIA_DLV_TYP.isVIA(prR.via_dlv_typ());
				r.io_schd_typ(
					getIoSchdTypForShip(prR.trd_ptn_typ(), r.stk_id_typ(), false, isEx));
				r.io_schd_sts_typ(
					getIoSchdStsTypForShip(
						prR.trd_ptn_typ(), schdR.dlv_inst_rcpt_no(),
						schdR.slo_prms_no(), prR.purc_ddlv_flg(),
						schdR.ship_inst_qty().isPositive(), false, false, r.stk_id_typ()));
			}
		}

		/**
		 * 受払予定を取得
		 */
		protected MCList<MSW_IO_SCHD_DEL_R> getAllocIoSchdL() {
			MCList<MSW_IO_SCHD_DEL_R> ioSchdL = MCList.create(MSW_IO_SCHD_DEL_R.class);

			for (MCList<Sprt01_DtlR> gl : up0().groupList(Sprt01_DtlR.$tmp_inst_d_no)) {
				Sprt01_DtlR dtlR = gl.get(0);

				MCList<Srch01_ShipSchd_DtlR> ssDtlL = up1().subList(_up1Idx, dtlR.tmp_inst_d_no());
				for (Srch01_ShipSchd_DtlR ssDtlR : ssDtlL.groupBy(Srch01_ShipSchd_DtlR.$ship_alloc_sts_no)) {

					MSW_IO_SCHD_DEL_R ioR = MSW_IO_SCHD_DEL_R.create();
					ioR.io_schd_typ(dtlR.io_schd_typ());
					ioR.io_schd_sts_typ(dtlR.io_schd_sts_typ());
					ioR.io_schd_no(ssDtlR.ship_alloc_sts_no());

					ioSchdL.add(ioR);
				}
			}

			return ioSchdL;
		}

		// ロット提案処理
		protected MCList<Srch_RsltR> _allocRsltL = MCList.create(Srch_RsltR.class);
		protected void callAllocMngServiceAllocSrch01() {
			// 有効期限の設定
			if (!up2().lot_chk_off_flg()) {
				shipLotChk(up0());
			}

			MSBEL_AllocMngService.Alloc_Srch01 ope = MSBEL_AllocMngService
					.crtAlloc_Srch01();

			getCstCd(up0());

			MCRow.copyall(ope.up0(), setCnd());
			addAll(ope.up1(), up0(), createMap_Srch_TgtR_Sprt01_DtlR());
			addAll(ope.up3(), getAllocIoSchdL(), createMap_Srch_Io_SchdR_MSW_IO_SCHD_DEL_R());

			if (!ope.up1().isEmpty()) {
				MCSortPolicy sp = new MCSortPolicy();
				// 出庫日が直近のものに対して優先して引当するために、日付でソートする
				sp.add(MCList.SortType.ASC, Srch_TgtR.$gi_schd_dt);
				ope.up1().sort(sp);

				ope.exec();
	
				// ロット提案結果
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
				_allocRsltL.addAll(ope.down0().groupBy(policy));
			}
			else {
				_allocRsltL.clear();
			}
		}

		/**
		 * 得意先を設定する。
		 * @param upL
		 */
		protected void getCstCd(MCList<Sprt01_DtlR> upL) {
			
			MCList<MST_SLO_R> dbcL = MCList.create(MST_SLO_R.class);
			
			MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
			MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
			MST_SLO_R t3 = MST_SLO_R.create("T3");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setSelect(t1.ship_pr_no, t3.cst_cd);
			bldr.addInnerJoin(t2, t2.slo_d_no.eq(t1.slo_d_no));
			bldr.addInnerJoin(t3, t3.slo_no.eq(t2.slo_no));
			bldr.setWhere(t1.ship_pr_no.eq(bind(Sprt01_DtlR.$ship_pr_no)));
			
			dbSelect("MSBEL1400_MST_SLO_S01", dbcL, bldr, upL);
			
			upL.addStringColumn("cst_cd");
			
			MCIndexKey Idx = dbcL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			for (Sprt01_DtlR upR : upL) {
				MST_SLO_R dbcR = dbcL.getFirst(Idx, upR.ship_pr_no());
				if (!isNull(dbcR)) {
					upR.setStringNE("cst_cd", dbcR.cst_cd());
				}
			}
		}

		protected CndR setCnd() {
			CndR cnd = CndR.create();

			cnd.stk_flg(false);
			cnd.short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
			cnd.lot_prop_typ(MSC_LOT_PROP_TYP.LOT.value());
			cnd.except_alloc_wait_flg(true);
			cnd.nm_srch_flg(true);

			return cnd;
		}

		/**
		 * 出荷済みのロットから最小・最大の有効期限を取得する
		 */
		protected void shipLotChk(MCList<Sprt01_DtlR> list) {
			MSBEL_ShipLotChkService.ShipLotChk_Srch01 o = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
	
			for (Sprt01_DtlR r : list) {
				MST_SHIP_SCHD_R ssR = _schdL.getFirst(_schdIdx, r.ship_schd_no());
				MST_SHIP_PR_R prR = _prL.getFirst(_prIdx, r.ship_pr_no());

				if (MAC_TRD_PTN_TYP.isSLS(prR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(prR.trd_ptn_typ())) {
				
					ShipLot_DtlR cndR = ShipLot_DtlR.create();
					cndR.peg_no(r.lot_peg_no());
					cndR.cst_cd(prR.cst_cd());
					if (MSC_SHIP_TO_ID_TYP.isDLV(prR.dlv_id_typ())) {
						cndR.dlv_cd(nvl(ssR.dlv_cd(), prR.dlv_id_cd()));
					}
					cndR.itm_cd(ssR.itm_cd());
					cndR.itm_sub1(ssR.itm_sub1());
					cndR.itm_sub2(ssR.itm_sub2());
					cndR.itm_sub3(ssR.itm_sub3());
					if (!isNull(r.dlv_schd_tm())) {
						cndR.base_dt(r.dlv_schd_tm().trunc(MCDateFieldType.DAY));
					}
					cndR.lock_flg(false);
	
					o.up0().add(cndR);
				}
			}
			o.exec();

			for (Sprt01_DtlR r : list) {
				ShipLot_DtlR selectR = o.down0().getFirst(ShipLot_DtlR.$peg_no, r.lot_peg_no());
				if (!isNull(selectR)) {
					r.valid_dt_fr(selectR.valid_dt_fr());
					r.valid_dt_fr_grp(selectR.valid_dt_fr_grp());
					r.valid_dt_to(selectR.valid_dt_to());
				}
			}
		}

		/**
		 * 引当結果を上り電文に反映して返す
		 */
		protected MCList<Sprt01_DtlR> setAllocRsltL(MCList<Sprt01_DtlR> list) {
			MCList<Sprt01_DtlR> l = MCList.create(Sprt01_DtlR.class);
			MCList<Srch_RsltR> rsltL = MCList.create(Srch_RsltR.class);

			for (Sprt01_DtlR r : list) {

				MCNumber remain_qty = MCNumber.ZERO;
				
				rsltL.init();
				if (!_allocRsltL.isEmpty()) {
					rsltL = _allocRsltL.subList(Srch_RsltR.$peg_no, r.lot_peg_no());
				}
				if (rsltL.isEmpty()) {
					r.no_alloc_flg(true);
					l.add(r);
				}
				else {
					// 引当できた
					remain_qty = r.base_unit_qty();

					MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					MAVM_ITM_UNIT_R entItmUnitR = _itmUnitCache.get(r.itm_cd(),
							r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.ent_unit_cd());
					MAVM_ITM_UNIT_R pckgItmUnitR = _itmUnitCache.get(r.itm_cd(),
								r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), itmR.pckg_unit_cd());

					for (Srch_RsltR rsltR : rsltL) {
						// 引当できた分のレコード作成
						Sprt01_DtlR tmpR = r.clone();
						tmpR.gi_loc_cd(rsltR.stk_loc_cd());
						tmpR.gi_loc_nm(rsltR.stk_loc_nm());
						tmpR.gi_str_ln_cd(rsltR.stk_str_ln_cd());
						tmpR.gi_str_ln_nm(rsltR.stk_str_ln_nm());
						tmpR.gi_str_ln_tgt_flg(rsltR.stk_str_ln_tgt_flg());
						tmpR.lot_no(rsltR.lot_no());
						tmpR.sublot_no(rsltR.sublot_no());
						tmpR.alloc_ver_no(rsltR.ver_no());
						tmpR.base_unit_qty(rsltR.base_unit_qty());
						tmpR.alloc_sno1(rsltR.sno1());
						tmpR.alloc_sno2(rsltR.sno2());
						tmpR.alloc_sno3(rsltR.sno3());
						tmpR.alloc_sno4(rsltR.sno4());

						// 荷姿単位での引当の場合
						if(isSame(tmpR.ent_unit_cd(), rsltR.pack_unit_cd())) {
							tmpR.ent_unit_qty(rsltR.pack_unit_qty());
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
							if (!isSame(reEntQty, rsltR.base_unit_qty())) {
								// 割り切れない場合は基準単位とする
								tmpR.ent_unit_cd(rsltR.base_unit_cd());
								tmpR.ent_unit_nm(rsltR.base_unit_nm());
								tmpR.ent_unit_conv_base_qty(MCNumber.ONE);
								tmpR.ent_unit_conv_qty(MCNumber.ONE);
								tmpR.ent_unit_dec_place(rsltR.base_unit_dec_place());
								tmpR.ent_unit_qty(rsltR.base_unit_qty());
							}
							else {
								tmpR.ent_unit_qty(entQty);
							}
						}

						// 梱包単位
						tmpR.pckg_unit_qty(rvrsBaseUnitConv(rsltR.base_unit_qty(),
								pckgItmUnitR.conv_base_qty(), pckgItmUnitR.conv_qty(), pckgItmUnitR.dec_place(),
								MAC_RND_TYP.RNDUP.value()));

						if (itmR.cont_fctr_flg()) {
							// 標準有効成分
							tmpR.std_cont_fctr(itmR.std_cont_fctr());
							tmpR.std_cont_qty(
									convToContFctrUnit(rsltR.base_unit_qty(), itmR.std_cont_fctr(),
											itmR.cont_fctr_dec_place(), itmR.cont_fctr_rnd_typ()));
							// 実際有効成分
							tmpR.act_cont_fctr(rsltR.act_cont_fctr());
							tmpR.act_cont_qty(
									convToContFctrUnit(rsltR.base_unit_qty(), rsltR.act_cont_fctr(),
											itmR.cont_fctr_dec_place(), itmR.cont_fctr_rnd_typ()));
						}
						l.add(tmpR);

						// 残数
						remain_qty = remain_qty.subtract(rsltR.base_unit_qty());
					}
					// 残数がある場合は未引当レコードを作成する
					if (remain_qty.isPositive()) {
						Sprt01_DtlR tmpR = r.clone();
						tmpR.base_unit_qty(remain_qty);
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
								rsltL.get(0).base_unit_dec_place(),
								rsltL.get(0).base_unit_rnd_typ());
						if(!isSame(reEntQty, remain_qty)) {
							Srch_RsltR rsltR = rsltL.get(0);
							tmpR.ent_unit_cd(rsltR.base_unit_cd());
							tmpR.ent_unit_nm(rsltR.base_unit_nm());
							tmpR.ent_unit_conv_base_qty(MCNumber.ONE);
							tmpR.ent_unit_conv_qty(MCNumber.ONE);
							tmpR.ent_unit_dec_place(rsltR.base_unit_dec_place());
							tmpR.ent_unit_qty(remain_qty);
						}
						else {
							tmpR.ent_unit_qty(entQty);
						}
						// 梱包単位
						tmpR.pckg_unit_qty(rvrsBaseUnitConv(tmpR.base_unit_qty(),
								pckgItmUnitR.conv_base_qty(), pckgItmUnitR.conv_qty(), pckgItmUnitR.dec_place(),
								MAC_RND_TYP.RNDUP.value()));

						if (itmR.cont_fctr_flg()) {
							// 標準有効成分
							tmpR.std_cont_fctr(itmR.std_cont_fctr());
							tmpR.std_cont_qty(
									convToContFctrUnit(tmpR.base_unit_qty(), itmR.std_cont_fctr(),
											itmR.cont_fctr_dec_place(), itmR.cont_fctr_rnd_typ()));
							// 実際有効成分（上り電文(画面で指定したロット)の実際係数で算出）
							tmpR.act_cont_fctr(r.act_cont_fctr());
							tmpR.act_cont_qty(
									convToContFctrUnit(tmpR.base_unit_qty(), r.act_cont_fctr(),
											itmR.cont_fctr_dec_place(), itmR.cont_fctr_rnd_typ()));
						}
						tmpR.no_alloc_flg(true);
						l.add(tmpR);
					}
				}
			}
			setWmsflg(l);
			return l;
		}
		/**
		 * WMS対象フラグを取得・設定する
		 */
		protected void setWmsflg(MCList<Sprt01_DtlR> list) {

			MCList<Srch01_DtlR> dtlL = crtSrchDtl();
			dtlL.addNumberColumn(Sprt01_DtlR.$lot_peg_no);

			// ユーティリティを呼び出すため、コンテナの入れ替え
			for (Sprt01_DtlR up1R : list) {
				MST_SHIP_SCHD_R ssR = _schdL.getFirst(_schdIdx, up1R.ship_schd_no());
				MST_SHIP_PR_R spR = _prL.getFirst(_prIdx, up1R.ship_pr_no());
				
				Srch01_DtlR dtlR = dtlL.add();
				dtlR.setNumber(Sprt01_DtlR.$lot_peg_no, up1R.lot_peg_no());
				dtlR.ship_loc_cd(up1R.gi_loc_cd());
				dtlR.ship_fr_lg_grp_cd(ssR.ship_fr_lg_grp_cd());
				dtlR.dlv_id_typ(spR.dlv_id_typ());
				dtlR.dlv_id_cd(spR.dlv_id_cd());
			}
			setWmsFlg(dtlL);

			copyByPegNo(list, dtlL,
				Sprt01_DtlR.$lot_peg_no, new String[]{Sprt01_DtlR.$wms_flg, Sprt01_DtlR.$wms_tgt_flg},
				Sprt01_DtlR.$lot_peg_no, new String[]{Srch01_DtlR.$wms_flg, Srch01_DtlR.$wms_tgt_flg});
		}

		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected void initItmCache(MCList<Sprt01_DtlR> dtlL) {
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(
					MCQueryApiBuilder.create(MAM_ITM_R.create("T")), dtlL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3");
		}

		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnitCache;
		protected void initItmUnitCache(MCList<Sprt01_DtlR> dtlL) {
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");

			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addSelect(m1.unit_nm);
			dbc_bldr.addLeftOuterJoin(m1, bracket(m1.unit_cd.eq(t.unit_cd)));
			_itmUnitCache = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(
					dbc_bldr, dtlL, "itm_cd", "itm_sub1", "itm_sub2", "itm_sub3", "ent_unit_cd");
		}

		protected Map_Srch_TgtR_Sprt01_DtlR<Srch_TgtR, Sprt01_DtlR> createMap_Srch_TgtR_Sprt01_DtlR() {
			return new Map_Srch_TgtR_Sprt01_DtlR<Srch_TgtR, Sprt01_DtlR>();
		}
	
		public class Map_Srch_TgtR_Sprt01_DtlR<D extends Srch_TgtR, S extends Sprt01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_TgtR.$peg_no, Sprt01_DtlR.$lot_peg_no);
				addColumnPathMap(Srch_TgtR.$gi_loc_cd, Sprt01_DtlR.$gi_loc_cd);
				addColumnPathMap(Srch_TgtR.$gi_str_ln_cd, Sprt01_DtlR.$gi_str_ln_cd);
				addColumnPathMap(Srch_TgtR.$lot_no, Sprt01_DtlR.$lot_no);
				addColumnPathMap(Srch_TgtR.$sublot_no, Sprt01_DtlR.$sublot_no);
				addColumnPathMap(Srch_TgtR.$ship_term_cd, Sprt01_DtlR.$ship_term_cd);
				addColumnPathMap(Srch_TgtR.$io_schd_typ, Sprt01_DtlR.$io_schd_typ);
				addColumnPathMap(Srch_TgtR.$not_lot_fix_flg, Sprt01_DtlR.$lot_none_flg);
				addColumnPathMap(Srch_TgtR.$not_lot_mix_flg, Sprt01_DtlR.$not_lot_mix_flg);
				addColumnPathMap(Srch_TgtR.$not_sublot_mix_flg, Sprt01_DtlR.$not_sublot_mix_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MST_SHIP_PR_R prR = _prL.getFirst(_prIdx, src.ship_pr_no());
				MST_SHIP_SCHD_R schdR = _schdL.getFirst(_schdIdx, src.ship_schd_no());
				
				dest.gi_schd_dt(src.ship_schd_tm());
				dest.gr_schd_dt(src.dlv_schd_tm());
				dest.itm_cd(schdR.itm_cd());
				dest.itm_sub1(schdR.itm_sub1());
				dest.itm_sub2(schdR.itm_sub2());
				dest.itm_sub3(schdR.itm_sub3());
				
				dest.dlv_lg_grp_cd(prR.getString("dlv_lg_grp_cd"));
				dest.alloc_grp_cd(prR.alloc_grp_cd());
				dest.gi_lg_grp_cd(schdR.ship_fr_lg_grp_cd());
				dest.gi_stk_arrv_bp_cd(schdR.stk_arrv_bp_cd());
				if (MSC_SHIP_TO_ID_TYP.isLOC(prR.ship_to_id_typ())) {
					dest.gr_loc_cd(prR.ship_to_id_cd());
				}
				else {
					dest.gr_loc_cd(null);
				}

				dest.quality_typ(schdR.quality_typ());
				dest.stk_id_typ(src.stk_id_typ());
				dest.stk_bp_cd(src.stk_bp_cd());
				dest.gd_cd(schdR.gd_cd());
				dest.ver_no(nvl(src.alloc_ver_no(), schdR.ver_no()));
				dest.sno1(nvl(src.alloc_sno1(), schdR.sno1()));
				dest.sno2(nvl(src.alloc_sno2(), schdR.sno2()));
				dest.sno3(nvl(src.alloc_sno3(), schdR.sno3()));
				dest.sno4(nvl(src.alloc_sno4(), schdR.sno4()));
				dest.sno1_null_flg(schdR.sno1_null_flg());
				dest.sno2_null_flg(schdR.sno2_null_flg());
				dest.sno3_null_flg(schdR.sno3_null_flg());
				dest.sno4_null_flg(schdR.sno4_null_flg());
	
				dest.stk_alloc_flg(false);
				dest.not_lot_mix_flg(schdR.not_lot_mix_flg());
				dest.not_sublot_mix_flg(schdR.not_sublot_mix_flg());
				if (MAC_TRD_PTN_TYP.isSLS(prR.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(prR.trd_ptn_typ())) {
					dest.vld_dt_fr(src.valid_dt_fr());
					dest.vld_dt_fr_grp(src.valid_dt_fr_grp());
					dest.vld_dt_to(src.valid_dt_to());
				}
				else {
					dest.vld_dt_fr(schdR.vld_dt_fr());
					dest.vld_dt_fr_grp(null);
					dest.vld_dt_to(schdR.vld_dt_to());
				}
				dest.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());

				if (MAC_TRD_PTN_TYP.isPROV(prR.trd_ptn_typ()) && isNull(src.gi_loc_cd())) {
					dest.stk_info_loc_typ(MSC_STK_INFO_LOC_TYP.HOUSE.value());
				}
	
				MAVM_ITM_UNIT_R itmUnitR =
					_itmUnitCache.get(
						dest.itm_cd(), dest.itm_sub1(), dest.itm_sub2(), dest.itm_sub3(), src.ent_unit_cd());
				
				MAVM_ITM_UNIT_R itmBaseUnitR =
						_itmUnitCache.get(
							dest.itm_cd(), dest.itm_sub1(), dest.itm_sub2(), dest.itm_sub3(), src.base_unit_cd());
		
				dest.base_unit_cd(schdR.base_unit_cd());
				dest.base_unit_qty(convToBaseUnit(
					src.ent_unit_qty(), itmUnitR.conv_base_qty(),
					itmUnitR.conv_qty(), itmBaseUnitR.dec_place(), itmBaseUnitR.rnd_typ()));

				if (itmUnitR.pack_flg()) {
					dest.pack_unit_cd(src.ent_unit_cd());
					dest.pack_unit_qty(src.ent_unit_qty());
				}
				else {
					dest.pack_unit_cd(dest.base_unit_cd());
					dest.pack_unit_qty(dest.base_unit_qty());
				}
				dest.cst_cd(src.getStringNE("cst_cd"));
				dest.chk_ship_flg(!src.skip_chk_ship_flg());
			}
		}
		protected Map_Srch_Io_SchdR_MSW_IO_SCHD_DEL_R<Srch_Io_SchdR, MSW_IO_SCHD_DEL_R> createMap_Srch_Io_SchdR_MSW_IO_SCHD_DEL_R() {
			return new Map_Srch_Io_SchdR_MSW_IO_SCHD_DEL_R<Srch_Io_SchdR, MSW_IO_SCHD_DEL_R>();
		}
		public class Map_Srch_Io_SchdR_MSW_IO_SCHD_DEL_R<D extends Srch_Io_SchdR, S extends MSW_IO_SCHD_DEL_R>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_Io_SchdR.$io_schd_typ, MSW_IO_SCHD_DEL_R.$io_schd_typ);
				addColumnPathMap(Srch_Io_SchdR.$io_schd_sts_typ, MSW_IO_SCHD_DEL_R.$io_schd_sts_typ);
				addColumnPathMap(Srch_Io_SchdR.$io_schd_no, MSW_IO_SCHD_DEL_R.$io_schd_no);
				addColumnPathMap(Srch_Io_SchdR.$io_schd_seq, MSW_IO_SCHD_DEL_R.$io_schd_seq);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 出荷指図を登録する前に、チェックを実行します。<br>
	 */
	public class Chk01 extends MSBEL_ShipInstReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callShipInstServiceChk01();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (up0().err_flg()) {
				return msgL;
			}

			compBase();

			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			if (!isNull(up0().ship_schd_tm())) {
				up0().ship_schd_time(up0().ship_schd_tm().toString("HHmm"));
			}

			// 出荷場所
			getListLogicBind(up1(), Chk01_DtlR.$ship_loc_cd)
				.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.LocCols.$i_lg_grp_cd, up0(), Chk01_HdrR.$ship_fr_lg_grp_cd);

			// 負担部門
			getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd)
				.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ship_inst_tm);
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex, MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);
			if (isSame(paramIndex, MCNumber.ONE)) {
				Chk01_DtlR r = (Chk01_DtlR)data;

				// 在庫着荷先
				if (isSame(column, Chk01_DtlR.$stk_arrv_bp_cd)) {
					cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.SPPL.value());
					cnd.put(BpCols.$i_sppl_flg, true);
				}
				// 理由
				if (isSame(column, Chk01_DtlR.$rsn_cd)) {
					if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
						cnd.put(ShipBizRsnCols.$i_sls_flg, true);
						cnd.put(ShipBizRsnCols.$i_xfr_flg, false);
					}
					else {
						cnd.put(ShipBizRsnCols.$i_sls_flg, false);
						cnd.put(ShipBizRsnCols.$i_xfr_flg, true);
					}
				}
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			compSub();

			msgL.addAll(checkSub());

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			initTranCache();

			MCIndexKey up2Idx = up2().createIndex(Srch01_ShipSchd_DtlR.$tmp_inst_d_no);

			// 出荷進捗
			msgL.addAll(chkShipPrUpdCntr(up1(), up2(), up2Idx));
			
			// 出荷予定
			msgL.addAll(chkShipSchdUpdCntr(up1(), up2(), up2Idx));

			// DAC
			msgL.addAll(checkWritableLgGrpCdDac(up0(), Chk01_HdrR.$ship_fr_lg_grp_cd));

			if (msgL.size() > 0) {
				up0().err_flg(true);
				up1().setBoolean(Chk01_DtlR.$err_flg, true);
			}

			return msgL;
		}

		protected void compBase() {

			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

			MCIndexKey idx = up2().createIndex(Srch01_ShipSchd_DtlR.$tmp_inst_d_no);
			for (Chk01_DtlR r : up1()) {
				// 指図まとめによって、上り電文の出荷予定NOが設定されていない場合は
				// 同一指図明細内の出荷予定NOを設定する
				// 出荷予定NOはデータ補完に使用する(補完項目はまとめ条件に含まれているので、どの出荷予定NOでも問題ない)
				if (isNull(r.ship_schd_no())) {
					Srch01_ShipSchd_DtlR cntrR = up2().getFirst(idx, r.tmp_inst_d_no());
					r.ship_schd_no(cntrR.ship_schd_no());
				}

				r.data_crud_typ(up0().data_crud_typ());
			}

			compBaseCmn(up0(), up1());
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSubSub(up0(), up1()));

			return msgL;
		}

		protected void compSub() {
			for (Chk01_DtlR dtlR : up1()) {
				setBaseUnitQty(dtlR);
				setStrLn(dtlR);
			}
			setDispSeq(up1());
		}

		protected void callShipInstServiceChk01() {
			MSBEL_ShipInstService.ShipInst_Chk01 ope = MSBEL_ShipInstService
					.crtShipInst_Chk01();

			
			copy(ope.up0().add(), up0(), createMap_ShipInst_Chk01_HdrR_Chk01_HdrR());
			addAll(ope.up1(), up1(), createMap_ShipInst_Chk01_DtlR_Chk01_DtlR());
			addAll(ope.up2(),
				up2().groupBy(
					Srch01_ShipSchd_DtlR.$tmp_inst_d_no,
					Srch01_ShipSchd_DtlR.$ship_pr_no,
					Srch01_ShipSchd_DtlR.$ship_schd_no,
					Srch01_ShipSchd_DtlR.$ship_pr_no),
				createMap_ShipSchd_Chk01_DtlR_Srch01_ShipSchd_DtlR());
			ope.exec();

			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			itmL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			itmL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			itmL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbSelect("MSBEL1400_MAM_ITM_S01", itmL, itmL_bldr, ope.down1());

			MCIndexKey idx = itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1,
					MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);

			for (ShipInst_Chk01_DtlR r : ope.down1()) {
				MAM_ITM_R itmR = itmL.getFirst(idx, r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3());
				if (isNull(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
					|| !r.alloc_tgt_flg()) {	
					// 引当しないのでチェック対象外
				}
				else if (!r.alloc_flg()) {
					if (MAC_STK_MNG_TYP.isMNG(itmR.stk_mng_typ())) {
						r.err_flg(true);
						MCMessagePool.add(new MCMessage(r, null, MSBEL0197, toDispGUIIndex(r)));
					}
				}
			}
			copyErrFlg(up1(), ope.down1());
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 出荷指図を訂正する前に、チェックを実行します。<br>
	 */
	public class Chk02 extends MSBEL_ShipInstReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callShipInstServiceChk02();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (up0().err_flg()) {
				return msgL;
			}

			compBase();

			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			
			if (!isNull(up0().ship_schd_tm())) {
				up0().ship_schd_time(up0().ship_schd_tm().toString("HHmm"));
			}

			// 出荷場所
			getListLogicBind(up1(), Chk01_DtlR.$ship_loc_cd)
				.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.LocCols.$i_lg_grp_cd, up0(), Chk01_HdrR.$ship_fr_lg_grp_cd);

			// 負担部門
			getListLogicBind(up1(), Chk01_DtlR.$bd_dpt_cd)
				.putBind(mcframe.commonMAUA.MAUAC0010.MAUAC_List.DptCols.$i_dt, up0(), Chk01_HdrR.$ship_inst_tm);
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex, MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);
			if (isSame(paramIndex, MCNumber.ONE)) {
				Chk01_DtlR r = (Chk01_DtlR)data;

				// 在庫着荷先
				if (isSame(column, Chk01_DtlR.$stk_arrv_bp_cd)) {
					cnd.put(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.SPPL.value());
					cnd.put(BpCols.$i_sppl_flg, true);
				}
				// 理由
				if (isSame(column, Chk01_DtlR.$rsn_cd)) {
					if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
						cnd.put(ShipBizRsnCols.$i_sls_flg, true);
						cnd.put(ShipBizRsnCols.$i_xfr_flg, false);
					}
					else {
						cnd.put(ShipBizRsnCols.$i_sls_flg, false);
						cnd.put(ShipBizRsnCols.$i_xfr_flg, true);
					}
				}
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			compSub();

			msgL.addAll(checkSub());

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();

			initTranCache();

			MCIndexKey up2Idx = up2().createIndex(Srch01_ShipSchd_DtlR.$ship_inst_d_no);

			// 出荷進捗
			msgL.addAll(chkShipPrUpdCntr(up1(), up2(), up2Idx));
			
			// 出荷予定
			msgL.addAll(chkShipSchdUpdCntr(up1(), up2(), up2Idx));

			// 出荷指図
			msgL.addAll(chkShipInstUpdCntr());

			// DAC
			msgL.addAll(checkWritableLgGrpCdDac(_instR, MST_SHIP_INST_R.$ship_fr_lg_grp_cd));

			if (msgL.size() > 0) {
				up0().err_flg(true);
				up1().setBoolean(Chk01_DtlR.$err_flg, true);
			}

			return msgL;
		}

		protected MCMessageList chkShipInstUpdCntr() {
			MCMessageList msgL = new MCMessageList();

			MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1400_MST_SHIP_INST_S01", _instR, instR_bldr, up0());
			if (!hasErrFlgOn(up1())) {
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$ship_inst_upd_cntr, _instR));
			}

			return msgL;
		}

		protected void compBase() {

			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			MCIndexKey idx = up2().createIndex(Srch01_ShipSchd_DtlR.$ship_inst_d_no);
			for (Chk01_DtlR r : up1()) {
				// 指図まとめによって、上り電文の出荷予定NOが設定されていない場合は
				// 同一指図明細内の出荷予定NOを設定する
				// 出荷予定NOはデータ補完に使用する(補完項目はまとめ条件に含まれているので、どの出荷予定NOでも問題ない)
				if (isNull(r.ship_schd_no())) {
					Srch01_ShipSchd_DtlR cntrR = up2().getFirst(idx, r.ship_inst_d_no());
					r.ship_schd_no(cntrR.ship_schd_no());
				}

				r.data_crud_typ(up0().data_crud_typ());
				r.ship_inst_no(up0().ship_inst_no());
			}

			compBaseCmn(up0(), up1());
		}

		protected void callShipInstServiceChk02() {
			MSBEL_ShipInstService.ShipInst_Chk02 ope = MSBEL_ShipInstService
					.crtShipInst_Chk02();

			copy(ope.up0().add(), up0(), createMap_ShipInst_Chk01_HdrR_Chk01_HdrR());
			addAll(ope.up1(), up1(), createMap_ShipInst_Chk01_DtlR_Chk01_DtlR());
			ope.exec();

			MCIndexKey idx = _schdL.createIndex(MST_SHIP_SCHD_R.$ship_inst_d_no);
			for (ShipInst_Chk01_DtlR r : ope.down1()) {
				MST_SHIP_SCHD_R ssR = _schdL.getFirst(idx, r.ship_inst_d_no());
				if (isNull(r.data_crud_typ())
					|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
					|| r.abort_flg()			// 打切
					|| ssR.abort_flg()		// 打切解除
					|| !r.alloc_tgt_flg()) {	
					// 引当しないのでチェック対象外
				}
				else if (!r.alloc_flg()) {
					r.err_flg(true);
					MCMessagePool.add(new MCMessage(r, null, MSBEL0197, toDispGUIIndex(r)));
				}
			}
			copyErrFlg(up1(), ope.down1());
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSubSub(up0(), up1()));

			return msgL;
		}

		protected void compSub() {

			setCrudTypByStatus();
			for (Chk01_DtlR dtlR : up1()) {
				setBaseUnitQty(dtlR);
				setStrLn(dtlR);
			}
			setDispSeq(up1());
		}

		protected void setCrudTypByStatus() {
			MCList<Chk01_DtlR>[] gl = up1().groupList(Chk01_DtlR.$ship_schd_no);
			for (MCList<Chk01_DtlR> l : gl) {
				// 変更していない出荷予定のデータ更新区分はNULLにしておく
				MCList<Chk01_DtlR> cl = l.subList(MCRow.CREATE, MCRow.MODIFY, MCRow.DELETE);
				if (cl.isEmpty()) {
					l.setString(Chk01_DtlR.$data_crud_typ, null);
				}
				else {
					for (Chk01_DtlR r : l) {
						setCrudTypByStatus(r);
					}
				}
			}
		}

		protected void setCrudTypByStatus(Chk01_DtlR dtlR) {
			if (dtlR.isStatusCreate()) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (dtlR.isStatusModify()) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			else if (dtlR.isStatusDelete()) {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}
		
		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 出荷指図を取り消す前に、チェックを実行します。<br>
	 */
	public class Chk03 extends MSBEL_ShipInstReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				callShipInstServiceChk03();
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());

			if (up0().err_flg()) {
				return msgL;
			}

			compBase();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			compSub();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();
			initTranCache();

			// 出荷進捗
			msgL.addAll(chkShipPrUpdCntr(up1()));
			
			// 出荷予定
			msgL.addAll(chkShipSchdUpdCntr(up1()));

			// 出荷指図
			msgL.addAll(chkShipInstUpdCntr());

			// DAC
			msgL.addAll(checkWritableLgGrpCdDac(_instR, MST_SHIP_INST_R.$ship_fr_lg_grp_cd));

			if (msgL.size() > 0) {
				up0().err_flg(true);
			}

			return msgL;
		}

		protected MCMessageList chkShipPrUpdCntr(MCList<Srch01_ShipSchd_DtlR> cntrL) {
			MCMessageList msgL = new MCMessageList();
			MCList<Srch01_ShipSchd_DtlR> l = cntrL.groupBy(Srch01_ShipSchd_DtlR.$ship_pr_no);
			l.sort(Srch01_ShipSchd_DtlR.$ship_pr_no);

			_prL = MCList.create(MST_SHIP_PR_R.class);
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(MST_SHIP_PR_R.create("T"));
			prL_bldr.setOrderByAsc(prL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL1400_MST_SHIP_PR_S01", _prL, prL_bldr, l);
			_prIdx = _prL.createIndex(MST_SHIP_PR_R.$ship_pr_no);

			for (Srch01_ShipSchd_DtlR cntrR : cntrL) {
				MST_SHIP_PR_R prR = _prL.getFirst(_prIdx, cntrR.ship_pr_no());
				msgL.addAll(checkUpdCntrNE(
					cntrR, Srch01_ShipSchd_DtlR.$ship_pr_upd_cntr, prR));
				setErrFlgCmm(cntrR, msgL);
				if (cntrR.err_flg()) {
					up0().err_flg(true);
					break;
				}
			}
			return msgL;
		}
	
		protected MCMessageList chkShipSchdUpdCntr(MCList<Srch01_ShipSchd_DtlR> cntrL) {
			MCMessageList msgL = new MCMessageList();
			MCList<Srch01_ShipSchd_DtlR> l = cntrL.groupBy(Srch01_ShipSchd_DtlR.$ship_schd_no);
			l.sort(Srch01_ShipSchd_DtlR.$ship_schd_no);
	
			_schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			schdL_bldr.setOrderByAsc(schdL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL1400_MST_SHIP_SCHD_S03", _schdL, schdL_bldr, l);
			_schdIdx = _schdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);

			if (hasErrFlgOn(cntrL)) {
				return msgL;
			}
			for (Srch01_ShipSchd_DtlR cntrR : cntrL) {
				MST_SHIP_SCHD_R prR = _schdL.getFirst(_schdIdx, cntrR.ship_schd_no());
				msgL.addAll(checkUpdCntrNE(
					cntrR, Srch01_ShipSchd_DtlR.$ship_schd_upd_cntr, prR));
				setErrFlgCmm(cntrR, msgL);
				if (cntrR.err_flg()) {
					up0().err_flg(true);
					break;
				}
			}
			return msgL;
		}

		protected MCMessageList chkShipInstUpdCntr() {
			MCMessageList msgL = new MCMessageList();

			MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1400_MST_SHIP_INST_S02", _instR, instR_bldr, up0());
			if (!up0().err_flg()) {
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$ship_inst_upd_cntr, _instR));
			}

			return msgL;
		}

		protected void compBase() {
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}

		protected void compSub() {
		}

		protected void callShipInstServiceChk03() {
			MSBEL_ShipInstService.ShipInst_Chk03 ope = MSBEL_ShipInstService
					.crtShipInst_Chk03();

			copy(ope.up0().add(), up0(), createMap_ShipInst_Chk03_HdrR_Chk03_HdrR());
			setAll(ope.up1(), up2(), up0(), createMap_ShipInst_Chk03_DtlR_Chk03_DtlR());
			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}

		protected void setDown() {

		}
	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * 帳票を発行する前に、チェックを実行します。<br>
	 */
	public class Chk04 extends MSBEL_ShipInstReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				// 特に無し
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(lockAndCheckBase());
			msgL.addAll(chkShipInstD());

			if (up0().err_flg()) {
				return msgL;
			}

			compBase();

			return msgL;
		}

		protected MCMessageList lockAndCheckBase() {
			MCMessageList msgL = new MCMessageList();
			initTranCache();

			// 出荷指図
			msgL.addAll(chkShipInstUpdCntr());

			if (msgL.size() > 0) {
				up0().err_flg(true);
			}

			return msgL;
		}
		
		protected MCMessageList chkShipInstD() {
			MCMessageList msgL = new MCMessageList();

			for (Chk04_DtlR r : up1()) {
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (isNull(r.base_ac_dt())) {
						msgL.add(new MCMessage(r, Chk04_DtlR.$base_ac_dt, MSBEL1105 ,toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		protected void compBase() {
			// ヘッダの補完
			up0().trn_typ(MSC_TRN_TYP.SHIP.value());

			// 明細の補完

		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			msgL.addAll(checkSub());

			if (hasErr()) {
				return msgL;
			}

			compSub();

			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			// 特に無し
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 特に無し

			return msgL;
		}

		protected void compSub() {
			// 特に無し
		}

		protected void setDown() {
			copyall(down0(), up0());
		}

		protected MCMessageList chkShipInstUpdCntr() {
			MCMessageList msgL = new MCMessageList();

			MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
			dbSelectKeyForUpdateNoWait("MSBEL1400_MST_SHIP_INST_S03", _instR, instR_bldr, up0());
			if (!up0().err_flg()) {
				msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$ship_inst_upd_cntr, _instR));
			}

			return msgL;
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 出荷指図を新規登録する。<br>
	 */
	public class Ins01 extends MSBEL_ShipInstReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setPegNo(up1());
			callThisChk01();
			throwUpdErr();
			callShipInstServiceIns01();
			throwUpdErr();
			setDown();
		}

		protected void callThisChk01() {
			MSBEL_ShipInstReg.Chk01 ope = MSBEL_ShipInstReg.crtChk01();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();

			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callShipInstServiceIns01() {
			MSBEL_ShipInstService.ShipInst_Ins01 ope = MSBEL_ShipInstService
					.crtShipInst_Ins01();

			copy(ope.up0().add(), up0(), createMap_ShipInst_Chk01_HdrR_Chk01_HdrR());
			addAll(ope.up1(), up1(), createMap_ShipInst_Chk01_DtlR_Chk01_DtlR());
			addAll(ope.up2(),
				up2().groupBy(
					Srch01_ShipSchd_DtlR.$tmp_inst_d_no,
					Srch01_ShipSchd_DtlR.$ship_pr_no,
					Srch01_ShipSchd_DtlR.$ship_schd_no,
					Srch01_ShipSchd_DtlR.$ship_pr_no),
				createMap_ShipSchd_Chk01_DtlR_Srch01_ShipSchd_DtlR());
			ope.up3().bndl_prnt_flg(!up3().indiv_prnt_flg());
			ope.exec();

			up0().ship_inst_no(ope.down0().get(0).ship_inst_no());

			copyByPegNo(up1(), new String[] {
					Chk01_DtlR.$ship_inst_d_no,
					Chk01_DtlR.$dlv_slip_no,
					Chk01_DtlR.$dlv_slip_d_no
			}, ope.down1(), new String[] {
					ShipInst_Chk01_DtlR.$ship_inst_d_no,
					ShipInst_Chk01_DtlR.$dlv_slip_no,
					ShipInst_Chk01_DtlR.$dlv_slip_d_no
			});
		}

		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録済みの出荷指図を更新する。<br>
	 */
	public class Upd01 extends MSBEL_ShipInstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setPegNo(up1());
			callThisChk02();
			throwUpdErr();
			callShipInstServiceUpd01();
			throwUpdErr();
			setDown();
		}

		protected void callThisChk02() {
			MSBEL_ShipInstReg.Chk02 ope = MSBEL_ShipInstReg.crtChk02();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();

			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callShipInstServiceUpd01() {
			MSBEL_ShipInstService.ShipInst_Upd01 ope = MSBEL_ShipInstService
					.crtShipInst_Upd01();

			copy(ope.up0().add(), up0(), createMap_ShipInst_Chk01_HdrR_Chk01_HdrR());
			addAll(ope.up1(), up1(), createMap_ShipInst_Chk01_DtlR_Chk01_DtlR());
			ope.up2().bndl_prnt_flg(!up3().indiv_prnt_flg());
			ope.exec();

			up0().ship_inst_no(ope.down0().get(0).ship_inst_no());

			copyByPegNo(up1(), new String[] {
					Chk01_DtlR.$ship_inst_d_no,
					Chk01_DtlR.$dlv_slip_no,
					Chk01_DtlR.$dlv_slip_d_no
			}, ope.down1(), new String[] {
					ShipInst_Chk01_DtlR.$ship_inst_d_no,
					ShipInst_Chk01_DtlR.$dlv_slip_no,
					ShipInst_Chk01_DtlR.$dlv_slip_d_no
			});
		}

		protected void setDown() {
			down0().setAll(up1());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 登録済みの出荷指図を取消す。<br>
	 */
	public class Del01 extends MSBEL_ShipInstReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk03();
			throwCanErr();
			callShipInstServiceDel01();
		}

		protected void callThisChk03() {
			MSBEL_ShipInstReg.Chk03 ope = MSBEL_ShipInstReg.crtChk03();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.exec();
		}

		protected void callShipInstServiceDel01() {
			MSBEL_ShipInstService.ShipInst_Del01 ope = MSBEL_ShipInstService
					.crtShipInst_Del01();

			copy(ope.up0().add(), up0(), createMap_ShipInst_Chk03_HdrR_Chk03_HdrR());
			setAll(ope.up1(), up2(), up0(), createMap_ShipInst_Chk03_DtlR_Chk03_DtlR());
			ope.up2().bndl_prnt_flg(!up3().indiv_prnt_flg());
			ope.exec();
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 帳票を発行する。<br>
	 */
	public class Prnt01 extends MSBEL_ShipInstReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk04();
			throwUpdErr();
			callShipRprtPrntServicePrnt02();
			callShipRprtPrntServicePrnt01();
			updPrntFlg();
			setDown();
		}

		protected void updPrntFlg() {
			if (up0().err_flg()) {
				return;
			}

			MCDate tm = MCDate.sysnow();


			MST_SHIP_INST_R instR = MST_SHIP_INST_R.create();
			copy(instR, up0(), createMap_MST_SHIP_INST_R_Chk04_HdrR());

			MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder instR_bldr = MCQueryApiBuilder.create(t);
			instR_bldr.setSet(t.ship_inst_no);
			if (up0().pick_prnt_btn_flg()) {
				instR_bldr.addSet(t.pick_prnt_flg, t.pick_prnt_tm);
				instR.pick_prnt_flg(true);
				instR.pick_prnt_tm(tm);
			}
			if (up0().inst_prnt_btn_flg()) {
				instR_bldr.addSet(t.ship_inst_prnt_flg, t.ship_inst_prnt_tm);
				instR.ship_inst_prnt_flg(true);
				instR.ship_inst_prnt_tm(tm);
			}
			if (up0().adv_prnt_btn_flg()) {
				instR_bldr.addSet(t.ship_adv_prnt_flg, t.ship_adv_prnt_tm);
				instR.ship_adv_prnt_flg(true);
				instR.ship_adv_prnt_tm(tm);
			}
			if (up0().dlv_prnt_btn_flg()) {
				instR_bldr.addSet(t.dlv_prnt_flg, t.dlv_prnt_tm);
				instR.dlv_prnt_flg(true);
				instR.dlv_prnt_tm(tm);
			}
			
			if (!up0().pick_prnt_btn_flg()
				&& !up0().inst_prnt_btn_flg()
				&& !up0().adv_prnt_btn_flg()
				&& !up0().dlv_prnt_btn_flg()) {
				// 更新対象なし
				return;
			}
			dbUpdateKey("MSBEL1400_MST_SHIP_INST_U01", instR, instR_bldr);
			callRevDataIns01(instR);
		}

		protected void callThisChk04() {
			MSBEL_ShipInstReg.Chk04 ope = MSBEL_ShipInstReg.crtChk04();

			copyall(ope.up0(), up0());
			setAll(ope.up1(), up2(), createMap_Chk04_DtlR_Prnt01_DtlR());
			ope.exec();

			copyall(up0(), ope.down0());
		}

		protected void callShipRprtPrntServicePrnt01() {
			if (up0().err_flg()) {
				return;
			}
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01
				ope = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			
			MCList<MST_SHIP_ALLOC_STS_P_R> rsltL = getPrntTgtL();
			boolean prnted = false;
			for (MST_SHIP_ALLOC_STS_P_R actDR : rsltL) {
				if (MAC_SLIP_STS_TYP.isCAN(actDR.getStringNE("slip_sts_typ"))
					&& !up0().dlv_prnt_btn_flg()) {
					// 取消伝票は納品書のみ発行
					continue;
				}
				ShipRprt_Prnt01_HdrR prntR = ope.up0().add();
				prntR.dlv_slip_no(actDR.dlv_slip_no());
				prntR.dlv_slip_seq(actDR.dlv_slip_seq());
				prntR.dlv_slip_prnt_flg(up0().dlv_prnt_btn_flg());
				prntR.ship_adv_prnt_flg(up0().adv_prnt_btn_flg());
				prntR.inc_can_flg(true);
				prntR.setAttributes(up0());
				
				// 最新リビジョンのみフラグを更新する
				if (actDR.getBoolean("latest_flg")) {
					prnted = true;
				}
			}
			up0().dlv_prnt_btn_flg(up0().dlv_prnt_btn_flg() && prnted);
			up0().adv_prnt_btn_flg(up0().adv_prnt_btn_flg() && prnted);
			
			ope.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());
			ope.exec();
			
			// 必ず１行
			up0().err_flg(ope.down0().get(0).err_flg());
		}
		
		protected MCList<MST_SHIP_ALLOC_STS_P_R> getPrntTgtL() {
			shipInstWkDel();
			shipInstWkIns();
			
			// 上り電文の出荷指図ＮＯ、改訂番号に対応する納品書ＮＯ、連番を取得する
			MST_SHIP_INST_P_R t1 = MST_SHIP_INST_P_R.create("T1");
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MST_SHIP_INST_R t3 = MST_SHIP_INST_R.create("T3");
			
			MCTempView w = createTempView("W");
			MSW_SHIP_INST_P_KEY_R w1 = MSW_SHIP_INST_P_KEY_R.create("W1");
			MST_SHIP_INST_P_R w2 = MST_SHIP_INST_P_R.create("W2");
			MST_SHIP_ALLOC_STS_P_R w3 = MST_SHIP_ALLOC_STS_P_R.create("W3");
			MST_SHIP_ALLOC_STS_P_R w4 = MST_SHIP_ALLOC_STS_P_R.create("W4");
			MST_SHIP_ALLOC_STS_P_R w5 = MST_SHIP_ALLOC_STS_P_R.create("W5");
			MST_DLV_SLIP_R w6 = MST_DLV_SLIP_R.create("W6");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(
				t1.ship_inst_no,
				w.pr("dlv_slip_no").as("dlv_slip_no"),
				w.pr("dlv_slip_seq").as("dlv_slip_seq"),
				t2.slip_sts_typ,
				decode(t1.ship_inst_rev, t3.ship_inst_rev, value(true), value(false)).as("latest_flg")
			);
			bldr.addInnerJoin(w1,
				w1.ship_inst_no.eq(t1.ship_inst_no)
				.and(w1.ship_inst_rev.eq(t1.ship_inst_rev))
			);
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
					.innerJoin(w2).on(
						w2.ship_inst_no.eq(w1.ship_inst_no)
						.and(w2.ship_inst_rev.eq(w1.ship_inst_rev)))
					.innerJoin(w3).on(
						w3.ship_inst_no.eq(w1.ship_inst_no)
						.and(w3.ship_inst_rev.eq(w1.ship_inst_rev)))
				)
				.unionAll(
					// 最新の改訂番号で行削除された分の納品書ＮＯを取得する
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
						.innerJoin(w2).on(
							w2.ship_inst_no.eq(w1.ship_inst_no)
							.and(w2.ship_inst_rev.eq(w1.ship_inst_rev)))
						.innerJoin(w4).on(
							w4.ship_inst_no.eq(w1.ship_inst_no)
							.and(w4.ship_inst_rev.eq(w1.ship_inst_rev.subtract(value(1)))))
					)
					.where(
						notExists(
							subQuery()
							.select(value("x"))
							.from(w5)
							.where(
								w5.ship_inst_no.eq(w1.ship_inst_no)
								.and(w5.ship_inst_rev.eq(w1.ship_inst_rev))
								.and(w5.dlv_slip_no.eq(w4.dlv_slip_no)))
						)
						.and(w2.can_flg.eq(value(false)))
					)
				).view(w), w.pr("ship_inst_no").eq(t1.ship_inst_no)
			);
			bldr.addInnerJoin(t2,
				t2.dlv_slip_no.eq(w.pr("dlv_slip_no"))
				.and(t2.dlv_slip_seq.eq(w.pr("dlv_slip_seq")))
			);
			bldr.addLeftOuterJoin(t3, t3.ship_inst_no.eq(t1.ship_inst_no));
			
			MCList<MST_SHIP_ALLOC_STS_P_R> rsltL = MCList.create(MST_SHIP_ALLOC_STS_P_R.class);
			rsltL.addBooleanColumn("latest_flg");
			dbSelect("MSBEL1400_MST_SHIP_INST_S05", rsltL, bldr);
			
			shipInstWkDel();
			return rsltL;
		}
		protected void shipInstWkDel() {
			dbWkDelete("MSBEL1400_MSW_SHIP_INST_P_KEY_D01", MST_SHIP_INST_P_R.create());
		}
		protected void shipInstWkIns() {
			dbWkInsert("MSBEL1400_MSW_SHIP_INST_P_KEY_I01", up0(), MST_SHIP_INST_P_R.create());
		}
		protected void callShipRprtPrntServicePrnt02() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt02 ope = MSBEL_ShipRprtPrntService
					.crtShipRprt_Prnt02();
			ShipRprt_Prnt02_HdrR up = ShipRprt_Prnt02_HdrR.create();

			copy(up, up0(), createMap_ShipRprt_Prnt02_HdrR_Chk04_HdrR());
			ope.up0().add(up);
			ope.exec();

			// 必ず１行
			up0().err_flg(ope.down0().get(0).err_flg());
		}
		
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 * @param up0L
		 */
		protected void callRevDataIns01(MST_SHIP_INST_R argR) {

			MST_SHIP_INST_R hdrR = MST_SHIP_INST_R.create();
			hdrR.ship_inst_no(argR.ship_inst_no());
			MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder hdrR_bldr = MCQueryApiBuilder.create(t);
			hdrR_bldr.setSelect(t.ship_inst_no, t.ship_inst_rev);
			dbSelectKey("MSBEL1400_MST_SHIP_INST_S04", hdrR, hdrR_bldr, hdrR);
			
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(hdrR.ship_inst_no());
			opeR.rev_no(hdrR.ship_inst_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_INST.value());
			ope.up0().add(opeR);
			ope.exec();
		}

		protected Map_Chk04_DtlR_Prnt01_DtlR<Chk04_DtlR,Prnt01_DtlR> createMap_Chk04_DtlR_Prnt01_DtlR() {
			return new Map_Chk04_DtlR_Prnt01_DtlR<Chk04_DtlR,Prnt01_DtlR>();
		}

		public class Map_Chk04_DtlR_Prnt01_DtlR<D extends Chk04_DtlR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk04_DtlR.$base_ac_dt, Prnt01_DtlR.$base_ac_dt);
				addColumnPathMap(Chk04_DtlR.$trd_ptn_typ, Prnt01_DtlR.$trd_ptn_typ);
			}
		}
		
		protected void setDown() {
			// 特に無し
		}
	}

	protected void srchShipPr(MCList<Srch01_ShipSchd_DtlR> cntrL) {
		MCList<Srch01_ShipSchd_DtlR> l = cntrL.groupBy(Srch01_ShipSchd_DtlR.$ship_pr_no);
		l.sort(Srch01_ShipSchd_DtlR.$ship_pr_no);

		_prL = MCList.create(MST_SHIP_PR_R.class);
		_prL.addStringColumn("dlv_lg_grp_cd");
		_prL.addBooleanColumn("cst_iv_flg");

		MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
		MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(t);
		MSVM_DLV_ID_R t1 = MSVM_DLV_ID_R.create("T1");
		MAM_BP_R m1 = MAM_BP_R.create("M1");
		prL_bldr.addSelect(t1.lg_grp_cd.as("dlv_lg_grp_cd"), m1.cst_iv_flg);
		prL_bldr.addLeftOuterJoin(t1, bracket(t1.dlv_id_typ.eq(t.dlv_id_typ)
				.and(t1.dlv_id_cd.eq(t.dlv_id_cd))));
		prL_bldr.addLeftOuterJoin(m1, bracket(m1.bp_cd.eq(t.cst_cd)));
		prL_bldr.setLockTable(t.ship_pr_no);
		prL_bldr.setOrderByAsc(t.ship_pr_no);
		dbSelectKeyForUpdateNoWait("MSBEL1400_MST_SHIP_PR_S02", _prL, prL_bldr, l);
		_prIdx = _prL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
	}
	protected MCMessageList chkShipPrUpdCntr(
			MCList<Chk01_DtlR> dtlL, MCList<Srch01_ShipSchd_DtlR> cntrL, MCIndexKey cntrIdx) {
		MCMessageList msgL = new MCMessageList();

		MCList<Srch01_ShipSchd_DtlR> chkL = MCList.create(Srch01_ShipSchd_DtlR.class);
		for (Chk01_DtlR r : dtlL) {
			chkL.addAll(cntrL.subList(cntrIdx, r.toArray(cntrIdx.getKeys())));
		}
		srchShipPr(chkL);

		MCIndexKey idx = chkL.createIndex(cntrIdx.getKeys());
		for (Chk01_DtlR r : dtlL) {
			if (r.err_flg()) {
				continue;
			}
			for (Srch01_ShipSchd_DtlR cntrR : chkL.subList(idx, r.toArray(idx.getKeys()))) {
				cntrR.setAttributes(r);

				MST_SHIP_PR_R prR = _prL.getFirst(_prIdx, cntrR.ship_pr_no());
				msgL.addAll(checkUpdCntrNE(
					cntrR, Srch01_ShipSchd_DtlR.$ship_pr_upd_cntr, prR));
				setErrFlgCmm(cntrR, msgL);
				if (cntrR.err_flg()) {
					r.err_flg(true);
					break;
				}
			}
		}
		return msgL;
	}

	protected void srchShipSchd(MCList<Srch01_ShipSchd_DtlR> cntrL) {
		MCList<Srch01_ShipSchd_DtlR> l = cntrL.groupBy(Srch01_ShipSchd_DtlR.$ship_schd_no);
		l.sort(Srch01_ShipSchd_DtlR.$ship_schd_no);

		_schdL = MCList.create(MST_SHIP_SCHD_R.class);
		_schdL.addBooleanColumn("iv_trd_flg");
		MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
		MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MAM_LG_CTL_R m2 = MAM_LG_CTL_R.create("M2");
		MAM_LG_CTL_R m3 = MAM_LG_CTL_R.create("M3");
		MAM_SUNDRY_ITM_R m4 = MAM_SUNDRY_ITM_R.create("M4");
		schdL_bldr.addSelect(
				cases().when(t1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
						.then(value(false))
						.otherwise(nvl(m2.iv_trd_flg, m3.iv_trd_flg))
						.as("iv_trd_flg"));
		schdL_bldr.addSelect(nvl(m4.itm_nm, t.itm_nm).as("itm_nm"));
		schdL_bldr.addInnerJoin(t1, bracket(t1.ship_pr_no.eq(t.ship_pr_no)));
		schdL_bldr.addLeftOuterJoin(m1, bracket(m1.loc_cd.eq(t1.dlv_id_cd)));
		schdL_bldr.addLeftOuterJoin(m2,
				bracket(m2.fr_lg_grp_cd.eq(t.ship_fr_lg_grp_cd)
						.and(m2.to_lg_grp_cd.eq(m1.lg_grp_cd))
						.and(m2.ship_term_cd.eq(t.ship_term_cd))));
		schdL_bldr.addLeftOuterJoin(m3,
				bracket(m3.fr_lg_grp_cd.eq(t.ship_fr_lg_grp_cd)
						.and(m3.to_lg_grp_cd.eq(m1.lg_grp_cd))
						.and(m3.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))));
		schdL_bldr.addLeftOuterJoin(m4,
				bracket(m4.itm_cd.eq(t.itm_cd).and(t.itm_sub1.eq(m4.itm_sub1))
						.and(t.itm_sub1.eq(m4.itm_sub1)).and(t.itm_sub2.eq(m4.itm_sub2))
						.and(t.itm_sub3.eq(m4.itm_sub3)).and(t.sno1.eq(m4.sno1))
						.and(t.sno2.eq(m4.sno2)).and(t.sno3.eq(m4.sno3))
						.and(t.sno4.eq(m4.sno4))));
		schdL_bldr.setLockTable(t.ship_schd_no);
		schdL_bldr.setOrderByAsc(t.ship_schd_no);
		dbSelectKeyForUpdateNoWait("MSBEL1400_MST_SHIP_SCHD_S04", _schdL, schdL_bldr, l);
		_schdIdx = _schdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);

		_allocStsL = MCList.create(MST_SHIP_ALLOC_STS_R.class);
		MCQueryApiBuilder allocStsL_bldr = MCQueryApiBuilder.create(MST_SHIP_ALLOC_STS_R.create("T2"));
		dbSelectKey("MSBEL1400_MST_SHIP_ALLOC_STS_S01", _allocStsL, allocStsL_bldr, cntrL.groupBy(Srch01_ShipSchd_DtlR.$ship_alloc_sts_no));
		_allocStsIdx = _allocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
	}
	protected MCMessageList chkShipSchdUpdCntr(
			MCList<Chk01_DtlR> dtlL, MCList<Srch01_ShipSchd_DtlR> cntrL, MCIndexKey cntrIdx) {
		MCMessageList msgL = new MCMessageList();

		MCList<Srch01_ShipSchd_DtlR> chkL = MCList.create(Srch01_ShipSchd_DtlR.class);
		for (Chk01_DtlR r : dtlL) {
			chkL.addAll(cntrL.subList(cntrIdx, r.toArray(cntrIdx.getKeys())));
		}
		srchShipSchd(chkL);

		MCIndexKey idx = chkL.createIndex(cntrIdx.getKeys());
		for (Chk01_DtlR r : dtlL) {
			if (r.err_flg()) {
				continue;
			}
			for (Srch01_ShipSchd_DtlR cntrR : chkL.subList(idx, r.toArray(idx.getKeys()))) {
				cntrR.setAttributes(r);

				MST_SHIP_SCHD_R schdR = _schdL.getFirst(_schdIdx, cntrR.ship_schd_no());
				msgL.addAll(checkUpdCntrNE(
					cntrR, Srch01_ShipSchd_DtlR.$ship_schd_upd_cntr, schdR));
				setErrFlgCmm(cntrR, msgL);
				if (cntrR.err_flg()) {
					r.err_flg(true);
					break;
				}
			}
		}
		return msgL;
	}

	protected void compBaseCmn(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {

		if (dtlL.isEmpty()) {
			return;
		}
		hdrR.via_dlv_typ(nvl(_schdL.get(0).via_dlv_typ(), _prL.get(0).via_dlv_typ()));

		// 指図更新時
		if (!isNull(hdrR.ship_inst_no())) {
			// 出荷指図から補完
			hdrR.ship_inst_tm(_instR.ship_inst_tm());
			hdrR.ship_schd_tm(_instR.ship_schd_tm());
			hdrR.dlv_schd_tm(_instR.dlv_schd_tm());
			hdrR.iv_no(_instR.iv_no());

			hdrR.ship_to_id_typ(_instR.ship_to_id_typ());
			hdrR.ship_to_id_cd(_instR.ship_to_id_cd());
			hdrR.ship_to_id_nm(_instR.ship_to_id_nm());
			hdrR.ship_to_zip_cd(_instR.ship_to_zip_cd());
			hdrR.ship_to_addr1(_instR.ship_to_addr1());
			hdrR.ship_to_addr2(_instR.ship_to_addr2());
			hdrR.ship_to_addr3(_instR.ship_to_addr3());
			hdrR.ship_to_addr4(_instR.ship_to_addr4());
			hdrR.ship_to_cntct_dpt(_instR.ship_to_cntct_dpt());
			hdrR.ship_to_cntct_psn(_instR.ship_to_cntct_psn());
			hdrR.ship_to_tel(_instR.ship_to_tel());
			hdrR.ship_to_fax(_instR.ship_to_fax());
			hdrR.ship_to_sundry_flg(_instR.ship_to_sundry_flg());
			hdrR.ship_to_lg_grp_cd(_instR.ship_to_lg_grp_cd());
		}
		if (!hdrR.ship_to_sundry_flg()) {
			hdrR.ship_to_id_nm(null);
		}

		for (Chk01_DtlR dtlR : dtlL) {
			// 出荷予定から補完
			MST_SHIP_SCHD_R schdR = _schdL.getFirst(_schdIdx, dtlR.ship_schd_no());
			dtlR.ship_lg_grp_cd(schdR.ship_fr_lg_grp_cd());
			dtlR.itm_cd(schdR.itm_cd());
			dtlR.itm_sub1(schdR.itm_sub1());
			dtlR.itm_sub2(schdR.itm_sub2());
			dtlR.itm_sub3(schdR.itm_sub3());
			dtlR.itm_nm(schdR.itm_nm());
			dtlR.sundry_itm_flg(schdR.sundry_itm_flg());
			dtlR.iv_itm_nm(schdR.iv_itm_nm());
			dtlR.ver_no(schdR.ver_no());
			dtlR.sno1(schdR.sno1());
			dtlR.sno2(schdR.sno2());
			dtlR.sno3(schdR.sno3());
			dtlR.sno4(schdR.sno4());
			dtlR.sno1_null_flg(schdR.sno1_null_flg());
			dtlR.sno2_null_flg(schdR.sno2_null_flg());
			dtlR.sno3_null_flg(schdR.sno3_null_flg());
			dtlR.sno4_null_flg(schdR.sno4_null_flg());
			if (!dtlR.alloc_flg()) {
				if (isNull(dtlR.alloc_sno1())) {
					dtlR.alloc_sno1(schdR.sno1());
				}
				if (isNull(dtlR.alloc_sno2())) {
					dtlR.alloc_sno2(schdR.sno2());
				}
				if (isNull(dtlR.alloc_sno3())) {
					dtlR.alloc_sno3(schdR.sno3());
				}
				if (isNull(dtlR.alloc_sno4())) {
					dtlR.alloc_sno4(schdR.sno4());
				}
			}
			dtlR.gd_cd(schdR.gd_cd());
			dtlR.quality_typ(schdR.quality_typ());
			dtlR.stk_insp_typ(schdR.stk_insp_typ());
			dtlR.stk_arrv_bp_cd(schdR.stk_arrv_bp_cd());
			dtlR.not_lot_mix_flg(schdR.not_lot_mix_flg());
			dtlR.not_sublot_mix_flg(schdR.not_sublot_mix_flg());
			dtlR.valid_dt_from(schdR.vld_dt_fr());
			dtlR.valid_dt_to(schdR.vld_dt_to());
			dtlR.iv_trd_flg(schdR.getBoolean("iv_trd_flg"));

			// ピッキングなしは出荷元物流ＧがNULL
			if (!isNull(schdR.ship_fr_lg_grp_cd())) {
				hdrR.ship_fr_lg_grp_cd(schdR.ship_fr_lg_grp_cd());
			}
			if (!isNull(schdR.wg_cd())) {
				hdrR.wg_cd(schdR.wg_cd());
			}

			// 上り電文から補完
			dtlR.alloc_loc_cd(dtlR.ship_loc_cd());
			if (dtlR.ship_str_ln_cd_none_flg()) {
				dtlR.alloc_str_ln_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				dtlR.alloc_str_ln_cd(dtlR.ship_str_ln_cd());
			}
			dtlR.alloc_lot_no(dtlR.lot_no());
			dtlR.alloc_sublot_no(dtlR.sublot_no());
			dtlR.alloc_ent_unit_qty(dtlR.ent_unit_qty());
			dtlR.alloc_ent_unit_cd(dtlR.ent_unit_cd());
			dtlR.inst_bndl_flg(dtlR.inst_bndl_flg());

			// 出荷進捗から補完
			MST_SHIP_PR_R prR = _prL.getFirst(_prIdx, schdR.ship_pr_no());

			dtlR.trd_cd(prR.trd_cd());
			dtlR.trd_ptn_typ(prR.trd_ptn_typ());
			dtlR.rsn_cd(prR.rsn_cd());
			dtlR.bd_dpt_cd(prR.bd_dpt_cd());
			dtlR.dlv_str_ln_cd(prR.dlv_str_ln_cd());
			dtlR.cst_iv_flg(prR.getBoolean("cst_iv_flg"));

			// 指図更新時
			if (!isNull(dtlR.ship_inst_d_no())) {
				dtlR.inst_bndl_flg(schdR.inst_bndl_flg());
				hdrR.ship_term_cd(_instR.ship_term_cd());
				hdrR.ship_wk_cd(_instR.ship_wk_cd());

				if (!isNull(dtlR.ship_alloc_sts_no())) {
					MST_SHIP_ALLOC_STS_R allocR = _allocStsL.getFirst(_allocStsIdx, dtlR.ship_alloc_sts_no());
					dtlR.dlv_slip_no(allocR.dlv_slip_no());
					dtlR.dlv_slip_d_no(allocR.dlv_slip_d_no());
				}
			}
		}
	}

	protected MCMessageList checkSubSub(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCList<Chk01_DtlR> notErrL = getChkList(dtlL, MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);
		MCMessageList msgL = new MCMessageList();

		if (!hdrR.err_flg()) {
			msgL.addAll(checkAtLeastOneDtl(hdrR, notErrL));
		}

		msgL.addAll(checkShipSchd(notErrL));
		msgL.addAll(checkIv(hdrR, notErrL));
		msgL.addAll(checkIvQty(hdrR, dtlL));
		msgL.addAll(checkDecPlace(
			notErrL, Chk01_DtlR.$ent_unit_dec_place, Chk01_DtlR.$ent_unit_qty));
		msgL.addAll(checkSendIf(hdrR, notErrL));

		for (Chk01_DtlR dtlR : notErrL) {

			if (!isNull(dtlR.ship_loc_cd())) {
				// 移送、移送返品、売上、出荷の場合、出荷場所は社内場所であること
				if (MAC_TRD_PTN_TYP.isXFR(dtlR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(dtlR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSLS(dtlR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(dtlR.trd_ptn_typ())) {
					if (!isNull(dtlR.ship_sppl_cd())) {
						msgL.add(new MCMessage(
							dtlR, null, MSBEL0214, dtlR.trd_cd(), dtlR.ship_loc_cd(), toDispGUIIndex(dtlR)));
					}
				}
				// 支給返品の場合、出荷場所は外注場所であること
				if (MAC_TRD_PTN_TYP.isPROV_RTN(dtlR.trd_ptn_typ())) {
					if (isNull(dtlR.ship_sppl_cd())) {
						msgL.add(new MCMessage(
							dtlR, null, MSBEL0215, dtlR.trd_cd(), dtlR.ship_loc_cd(), toDispGUIIndex(dtlR)));
					}
				}
			}
			msgL.addAll(checkStkUtilQualityTyp(
					dtlR, Chk01_DtlR.$trd_cd, Chk01_DtlR.$trd_ptn_typ, Chk01_DtlR.$quality_typ));
		}

		return msgL;
	}

	protected void setBaseUnitQty(Chk01_DtlR dtlR) {
		if (dtlR.isStatusDelete()) {
			MST_SHIP_ALLOC_STS_R allocR = _allocStsL.getFirst(_allocStsIdx, dtlR.ship_alloc_sts_no());
			dtlR.base_unit_cd(allocR.base_unit_cd());
			dtlR.base_unit_qty(allocR.base_unit_qty());
		}
		else if (isSame(dtlR.ent_unit_cd(), dtlR.base_unit_cd())) {
			dtlR.base_unit_qty(dtlR.ent_unit_qty());
		}
		else {
			dtlR.base_unit_qty(convToBaseUnit(dtlR.ent_unit_qty(),
					dtlR.ent_unit_conv_base_qty(), dtlR.ent_unit_conv_qty(),
					dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
		}
		dtlR.alloc_base_unit_qty(dtlR.base_unit_qty());
		dtlR.alloc_base_unit_cd(dtlR.base_unit_cd());
	}

	protected void setStrLn(Chk01_DtlR dtlR) {
		if (dtlR.ship_str_ln_tgt_flg()) {
			if (!isNull(dtlR.ship_loc_cd()) && isNull(dtlR.ship_str_ln_cd())) {
				dtlR.ship_str_ln_cd(MAC_STR.NULL_VAL.value());
			}
		}
		else {
			dtlR.ship_str_ln_cd(MAC_STR.NULL_VAL.value());
		}
	}


	protected void doSrchHdr(Srch01_HdrR upHdrR, Srch01_HdrR downHdrR, MCQueryPlan sqlId) {
		MCList<Srch01_HdrR> hdrL = MCList.create(Srch01_HdrR.class);
		int cnt = executeQuery(hdrL, sqlId, upHdrR);
		if (cnt == 0) {
			upHdrR.clear();
			return;
		}
		else if (cnt == 1) {
			copyall(downHdrR, hdrL.get(0));
		}
		else {
			// 出荷条件、出荷作業が異なるレコードが抽出された場合、出荷予定日の遅い日を適用する
			hdrL.sort(SortType.DESC, Srch01_HdrR.$ship_schd_dt, Srch01_HdrR.$ship_schd_hm);
			copyall(downHdrR, hdrL.get(0));
			hdrL = hdrL.subList(r -> !isNull(r.ship_schd_dt()));
			if (hdrL.groupBy(Srch01_HdrR.$ship_term_cd).size() > 1) {
				downHdrR.ship_term_cd(null);
				downHdrR.ship_term_nm(null);
				downHdrR.ship_wk_grp_cd(null);
				downHdrR.ship_wk_grp_nm(null);
				downHdrR.ship_wk_cd(null);
				downHdrR.ship_wk_nm(null);
			}
		}
	}

	protected void doSrchDtl(Srch01_HdrR upHdrR,
			MCList<Srch01_DtlR> downDtlL1, MCList<Srch01_ShipSchd_DtlR> downDtlL2,
			MCQueryPlan sqlId) {
		MCList<Srch01_DtlR> dtlL = crtSrchDtl();

		int cnt = executeQuery(dtlL, sqlId, upHdrR);
		if (cnt == 0) {
			return;
		}
		downDtlL1.setAll(dtlL);

		setAll(downDtlL2, downDtlL1, createMap_Srch01_ShipSchd_DtlR_Srch01_DtlR());
	}

	/**
	 * 検索結果格納用コンテナを生成する
	 */
	protected MCList<Srch01_DtlR> crtSrchDtl() {
		MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);

		dtlL.addBooleanColumn("ship_to_sundry_flg");
		dtlL.addBooleanColumn("inst_dlv_prnted_flg");
		dtlL.addBooleanColumn("dlv_slip_prnted_flg");
		dtlL.addBooleanColumn("ship_adv_prnted_flg");
		dtlL.addBooleanColumn("uplnd_flg");
		dtlL.addNumberColumn("alloc_inst_qty");
		dtlL.addStringColumn("trd_unit_rnd_typ");
		dtlL.addNumberColumn("ship_inst_upd_cntr");

		return dtlL;
	}

	/**
	 * 検索処理の下り電文を編集する
	 */
	protected void doEditDownForSrch(Srch01_HdrR downHdrR, MCList<Srch01_DtlR> downDtlL) {
		downHdrR.ship_schd_time(downHdrR.ship_schd_dt().toString("HHmm"));
		for (Srch01_DtlR dtlR : downDtlL) {
			// 預りフラグ、貸出フラグ
			if (MAC_TRD_PTN_TYP.isSHIP(dtlR.trd_ptn_typ())) {
				dtlR.cststk_flg(MSC_STK_ID_TYP.isCSTSTK(dtlR.stk_id_typ()));
				dtlR.loan_flg(!dtlR.cststk_flg());
			}
			else if (MAC_TRD_PTN_TYP.isSLS(dtlR.trd_ptn_typ())) {
				dtlR.cststk_flg(MSC_STK_ID_TYP.isCSTSTK(dtlR.stk_id_typ()));
			}

			if ( !(dtlR.cst_iv_flg() || dtlR.iv_trd_flg()) ) {
				dtlR.iv_itm_nm(null);
			}

			if (dtlR.cont_fctr_flg()) {
				// 標準有効成分
				dtlR.std_cont_qty(
						convToContFctrUnit(dtlR.base_unit_qty(), dtlR.std_cont_fctr(),
								dtlR.cont_unit_dec_place(), dtlR.cont_unit_rnd_typ()));
				// 実際有効成分
				dtlR.act_cont_qty(
						convToContFctrUnit(dtlR.base_unit_qty(), dtlR.act_cont_fctr(),
								dtlR.cont_unit_dec_place(), dtlR.cont_unit_rnd_typ()));
			}

			// 梱包単位数量
			// 切り上げ固定とする
			dtlR.pckg_unit_qty(rvrsBaseUnitConv(dtlR.base_unit_qty(),
					dtlR.pckg_unit_conv_base_qty(), dtlR.pckg_unit_conv_qty(),
					dtlR.pckg_unit_dec_place(), MAC_RND_TYP.RNDUP.value()));

			// 重量、容積
			if (!isNull(dtlR.unit_wt())) {
				dtlR.ship_wt(dtlR.ent_unit_qty().multiply(dtlR.unit_wt()));
				downHdrR.ship_wt(
						nvl(downHdrR.ship_wt(), MCNumber.ZERO).add(dtlR.ship_wt()));
			}
			if (!isNull(dtlR.unit_dim())) {
				dtlR.ship_dim(dtlR.ent_unit_qty().multiply(dtlR.unit_dim()));
				downHdrR.ship_dim(
						nvl(downHdrR.ship_dim(), MCNumber.ZERO).add(dtlR.ship_dim()));
			}
			
			if (MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(dtlR.alloc_scope_typ())) {
				dtlR.grp_alloc_flg(dtlR.alloc_flg());
				dtlR.alloc_flg(false);
			}
			else {
				if (dtlR.alloc_flg() && isNullOr(dtlR.lot_no(), dtlR.sublot_no())) {
					dtlR.lot_none_flg(true);
				}
			}
			if (isNull(dtlR.ship_fr_lg_grp_cd())) {
				dtlR.ship_fr_lg_grp_cd(downHdrR.ship_fr_lg_grp_cd());
			}
		}
		if (!isNull(downHdrR.ship_wt())) {
			downHdrR.ship_wt().setScale(Srch01_HdrR.ship_wt_META.scale(), MCNumber.MODE_DOWN);
		}
		if (!isNull(downHdrR.ship_dim())) {
			downHdrR.ship_dim().setScale(Srch01_HdrR.ship_dim_META.scale(), MCNumber.MODE_DOWN);
		}
		setWmsFlg(downDtlL);
	}
	/**
	 * WMS対象フラグを取得・設定する
	 */
	protected void setWmsFlg(MCList<Srch01_DtlR> dtlL) {

		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

		Map<MCNumber, Srch01_DtlR> map = new HashMap<>();
		MCNumber peg = MCNumber.ZERO;
		for (Srch01_DtlR dtlR : dtlL) {

			SCMLinkUtil_Srch01_CndR r = o.up0().add();
			r.peg_no(peg);
			r.if_proc_typ(MAC_IF_PROC_TYP.WMS_SHIP_INST_SEND.value());
			r.loc_cd(dtlR.ship_loc_cd());
			r.lg_grp_cd(dtlR.ship_fr_lg_grp_cd());
			if (MSC_DLV_ID_TYP.isDLV(dtlR.dlv_id_typ())) {
				r.dlv_cd(dtlR.dlv_id_cd());
			}
			else if (MSC_DLV_ID_TYP.isLOC(dtlR.dlv_id_typ())) {
				r.gr_loc_cd(dtlR.dlv_id_cd());
			}
			r.master_dt(getToday());

			map.put(peg, dtlR);
			peg = peg.add(1);
		}
		if (!o.up0().isEmpty()) {
			o.exec();

			for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
				if (map.containsKey(r.peg_no())) {
					Srch01_DtlR dtlR = map.get(r.peg_no());
					dtlR.wms_flg(!isNull(r.ext_sys_cd()));
					dtlR.wms_tgt_flg(dtlR.wms_flg());
				}
			}
		}
	}

	/**
	 * IF送信対象に対するチェック
	 */
	protected MCMessageList checkSendIf(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())) {
			MCIndexKey allocIdx = _allocStsL.createIndex(MST_SHIP_ALLOC_STS_R.$ship_inst_d_no);

			// IF送信対象の打切、もしくは打切解除では明細数が変わるような変更は不可
			for (MCList<Chk01_DtlR> l : dtlL.groupList(Chk01_DtlR.$ship_inst_d_no)) {
				Chk01_DtlR wmsR = l.getFirst(Chk01_DtlR.$wms_flg, true);
				if (!isNull(wmsR)) {
					MST_SHIP_SCHD_R schdR = _schdL.getFirst(_schdIdx, wmsR.ship_schd_no());
					if (wmsR.abort_flg() || schdR.abort_flg()) {	// 打切または打切解除
						MCList<MST_SHIP_ALLOC_STS_R> allocL = _allocStsL.subList(allocIdx, wmsR.ship_inst_d_no());
						MCNumber
							bfrQty = allocL.sum(MST_SHIP_ALLOC_STS_R.$base_unit_qty),
							aftQty = l.sum(Chk01_DtlR.$base_unit_qty);
						if (l.size() != allocL.size() || !isSame(bfrQty, aftQty)) {
							msgL.add(new MCMessage(
								wmsR, null, MSBEL1046, wmsR.ship_inst_d_no(), toDispGUIIndex(wmsR)));
						}
					}
				}
			}
		}
		
		return msgL;
	}

	/**
	 * 出荷予定に対するチェック
	 */
	protected MCMessageList checkShipSchd(MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		// 確定済みの出荷予定の場合は、分割指図不可
		for (MCList<Chk01_DtlR> l : dtlL.groupList(Chk01_DtlR.$tmp_inst_d_no)) {
			Chk01_DtlR dtlR = l.get(0);

			if (!dtlR.inst_bndl_flg()) {	// まとめ済み以外
				MST_SHIP_SCHD_R schdR = _schdL.getFirst(_schdIdx, dtlR.ship_schd_no());
				if (schdR.fix_flg()) {
					MCNumber qty = MCNumber.ZERO;
					for (Chk01_DtlR r : l) {
						if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							qty = qty.add(r.base_unit_qty());	// 指図数(削除行は含めない)
						}
					}
					if (qty.lt(schdR.base_unit_qty())) {
						msgL.add(new MCMessage(
							dtlR, null, MSBEL0324, dtlR.ship_schd_no(), qty, schdR.base_unit_qty(), toDispGUIIndex(dtlR)));
					}
				}
			}
		}
		
		return msgL;
	}

	/**
	 * 以下をチェックする。<br>
	 * <br>
	 * 1. インボイス単位出荷であり、インボイスを登録済の場合 ： 数量は予定数量と同一であること<br>
	 * 2. インボイス単位出荷であり、インボイスを未登録の場合 ： (画面では検索不可)<br>
	 * 3. インボイス登録済のインボイス取引対象レコードの場合 ： 数量は予定数量と同一であること<br>
	 * 4. インボイス未登録のインボイス取引対象レコードの場合 ： 数量の減少のみ許可する<br>
	 */
	protected MCMessageList checkIv(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		MCList<Chk01_DtlR>
			chkIvL = dtlL.subList(r -> r.cst_iv_flg() || r.iv_trd_flg());
		if (chkIvL.isEmpty()) {
			return msgL;
		}
		msgL.addAll(checkIvAbortFlg(chkIvL));
		return msgL;
	}

	/**
	 * インボイス取引対象、かつ、出荷予定.インボイス出荷予定数量 ≠ 0の場合、打切は禁止。
	 *
	 * @param dtlL the dtl L
	 * @return the MC message list
	 */
	protected MCMessageList checkIvAbortFlg(MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		for (Chk01_DtlR dtlR : dtlL) {
			// インボイス取引は指図まとめされないので、必ず出荷予定NOが設定されている
			MST_SHIP_SCHD_R  schdR = _schdL.getFirst(_schdIdx, dtlR.ship_schd_no());

			if (dtlR.abort_flg() && !isSame(schdR.iv_schd_qty(), MCNumber.ZERO) && !isSame(schdR.iv_schd_qty(), schdR.ship_act_qty())) {
				msgL.add(new MCMessage(dtlR, null, MSBEL0350,
					dtlR.ship_schd_no(), schdR.ship_act_qty(), schdR.base_unit_qty(), schdR.iv_schd_qty(), toDispGUIIndex(dtlR)));
			}
		}

		return msgL;
	}

	/**
	 * インボイス数量に関連するチェックを行う。
	 * @param hdrR 出荷指図ヘッダ
	 * @param dtlL 出荷指図明細リスト
	 * @return エラーメッセージ
	 */
	protected MCMessageList checkIvQty(Chk01_HdrR hdrR, MCList<Chk01_DtlR> dtlL) {
		MCMessageList msgL = new MCMessageList();

		MCList<Chk01_DtlR> chkIvL = dtlL.subList(r -> r.cst_iv_flg() || r.iv_trd_flg());
		if (chkIvL.isEmpty()) {
			return msgL;
		}
		
		MCList<Chk01_DtlR> notErrL = getChkList(chkIvL, MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);
		// インボイス取引は指図まとめされないので、必ず出荷予定NOが設定されている
		for (MCList<Chk01_DtlR> l :notErrL.groupList(Chk01_DtlR.$ship_schd_no)) {
			
			Chk01_DtlR chkR = l.get(0);
			
			MST_SHIP_SCHD_R schdR = _schdL.getFirst(_schdIdx, l.get(0).ship_schd_no());
			MCNumber qty = nvl(l.sum(Chk01_DtlR.$base_unit_qty), MCNumber.ZERO);
			
			if (schdR.iv_schd_qty().isPositive()) {
				if (!isNull(hdrR.iv_no())) {
					// インボイス単位出荷の場合、インボイス明細の数量と一致しないとエラーとする。
					if (!qty.eq(schdR.base_unit_qty())) {
						msgL.add(new MCMessage(chkR, null, MSBEL0228, chkR.iv_d_no(), qty, schdR.iv_schd_qty(), toDispGUIIndex(chkR)));
					}
				}
				else {
					MCList<Chk01_DtlR> ivChkL = l.subList(r->!isNull(r.iv_d_no()));
					MCNumber ivQty = nvl(ivChkL.sum(Chk01_DtlR.$base_unit_qty), MCNumber.ZERO);
					String ivDNo =String.join(",", ivChkL.getStringNE(Chk01_DtlR.$iv_d_no));
					if (ivQty.gt(schdR.iv_schd_qty())) {
						// インボイスが登録済の場合、インボイス数量を超えた場合エラーとする。
						msgL.add(new MCMessage(chkR, null, MSBEL1111, schdR.ship_schd_no(), ivDNo, qty,  schdR.iv_schd_qty(), toDispGUIIndex(chkR)));
					}
				}
			}
		}
		
		if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ()) && isNull(hdrR.iv_no())) {
			
			MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = getFixIvShipInstMapL(getChkList(chkIvL));
			MCIndexKey ivShipInstMapIdxkey = ivShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_inst_d_no);
			
			for (MCList<Chk01_DtlR> lst : dtlL.groupList(Chk01_DtlR.$ship_inst_d_no)) {
				
				Chk01_DtlR chkR = lst.get(0);
				MCList<MST_IV_SHIP_INST_MAP_R> subIvShipInstMapL = ivShipInstMapL.subList(ivShipInstMapIdxkey, chkR.ship_inst_d_no());
				MCNumber qty = nvl(lst.sum(Chk01_DtlR.$base_unit_qty), MCNumber.ZERO);
				MCNumber fixQty = nvl(subIvShipInstMapL.sum(MST_IV_SHIP_INST_MAP_R.$base_unit_qty), MCNumber.ZERO);
				
				if (lst.subList(MCRow.DELETE).size() == lst.size() && fixQty.isPositive()) {
					for (Chk01_DtlR dtlR : lst) {
						msgL.add(new MCMessage(dtlR, null, MSBEL1116, dtlR.ship_inst_d_no(), dtlR.ship_alloc_sts_no(), toDispGUIIndex(dtlR)));
					}
				}
				else {
					if (qty.lt(fixQty)) {
						// 出荷指図を元に、インボイスを登録した場合、登録済数量を下回った場合エラーとする。
						msgL.add(new MCMessage(chkR, null, MSBEL1110, chkR.ship_inst_d_no(), qty,fixQty, toDispGUIIndex(chkR)));
					}
				}
			}
		}
		
		return msgL;
	}
	
	/**
	 * 確定フラグがオンのインボイス出荷指図マップを取得する。
	 * @param dtlL 出荷指図明細リスト
	 * @return 確定フラグがオンのインボイス出荷指図マップリスト
	 */
	protected MCList<MST_IV_SHIP_INST_MAP_R> getFixIvShipInstMapL(MCList<Chk01_DtlR> dtlL) {
		
		MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
		
		MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
		ivShipInstMap_bldr.setSelect(ivShipInstMap.ship_inst_d_no, ivShipInstMap.iv_d_no, ivShipInstMap.base_unit_qty);
		ivShipInstMap_bldr.setWhere(ivShipInstMap.ship_inst_d_no.eq(bind(Chk01_DtlR.$ship_inst_d_no)));
		ivShipInstMap_bldr.addWhereWithAnd(ivShipInstMap.fix_flg.eq(value(true)));
		
		dbSelect("MSBEL1440_MST_IV_SHIP_INST_MAP_S03", ivShipInstMapL, ivShipInstMap_bldr, dtlL);
		
		return ivShipInstMapL;
	}

	/**
	 * トランザクションキャッシュをクリアする。
	 */
	protected void initTranCache() {
		_instR.clear();
		_schdL.clear();
		_prL.clear();
		_allocStsL.clear();
	}

	protected Map_Srch01_ShipSchd_DtlR_Srch01_DtlR<Srch01_ShipSchd_DtlR, Srch01_DtlR> createMap_Srch01_ShipSchd_DtlR_Srch01_DtlR() {
		return new Map_Srch01_ShipSchd_DtlR_Srch01_DtlR<Srch01_ShipSchd_DtlR, Srch01_DtlR>();
	}
	public class Map_Srch01_ShipSchd_DtlR_Srch01_DtlR<D extends Srch01_ShipSchd_DtlR, S extends Srch01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_ShipSchd_DtlR.$ship_inst_d_no, Srch01_DtlR.$ship_inst_d_no);
			addColumnPathMap(Srch01_ShipSchd_DtlR.$ship_pr_no, Srch01_DtlR.$ship_pr_no);
			addColumnPathMap(Srch01_ShipSchd_DtlR.$ship_schd_no, Srch01_DtlR.$ship_schd_no);
			addColumnPathMap(Srch01_ShipSchd_DtlR.$ship_alloc_sts_no, Srch01_DtlR.$ship_alloc_sts_no);
			addColumnPathMap(Srch01_ShipSchd_DtlR.$ship_pr_upd_cntr, Srch01_DtlR.$ship_pr_upd_cntr);
			addColumnPathMap(Srch01_ShipSchd_DtlR.$ship_schd_upd_cntr, Srch01_DtlR.$ship_schd_upd_cntr);
		}
	}

	protected Map_ShipInst_Chk01_HdrR_Chk01_HdrR<ShipInst_Chk01_HdrR, Chk01_HdrR> createMap_ShipInst_Chk01_HdrR_Chk01_HdrR() {
		return new Map_ShipInst_Chk01_HdrR_Chk01_HdrR<ShipInst_Chk01_HdrR, Chk01_HdrR>();
	}

	public class Map_ShipInst_Chk01_HdrR_Chk01_HdrR<D extends ShipInst_Chk01_HdrR, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipInst_Chk01_HdrR.$data_crud_typ,
					Chk01_HdrR.$data_crud_typ);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_inst_no, Chk01_HdrR.$ship_inst_no);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_fr_lg_grp_cd,
					Chk01_HdrR.$ship_fr_lg_grp_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_term_cd, Chk01_HdrR.$ship_term_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_wk_cd, Chk01_HdrR.$ship_wk_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_schd_tm, Chk01_HdrR.$ship_schd_tm);
			addColumnPathMap(ShipInst_Chk01_HdrR.$dlv_schd_tm, Chk01_HdrR.$dlv_schd_tm);
			addColumnPathMap(ShipInst_Chk01_HdrR.$inst_dpt_cd, Chk01_HdrR.$inst_dpt_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$inst_usr_cd, Chk01_HdrR.$inst_usr_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_inst_tm, Chk01_HdrR.$ship_inst_tm);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_lg_grp_cd,
					Chk01_HdrR.$ship_to_lg_grp_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_id_typ,
					Chk01_HdrR.$ship_to_id_typ);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_id_cd,
					Chk01_HdrR.$ship_to_id_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_id_nm,
					Chk01_HdrR.$ship_to_id_nm);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_zip_cd,
					Chk01_HdrR.$ship_to_zip_cd);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_addr1,
					Chk01_HdrR.$ship_to_addr1);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_addr2,
					Chk01_HdrR.$ship_to_addr2);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_addr3,
					Chk01_HdrR.$ship_to_addr3);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_addr4,
					Chk01_HdrR.$ship_to_addr4);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_cntct_dpt,
					Chk01_HdrR.$ship_to_cntct_dpt);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_cntct_psn,
					Chk01_HdrR.$ship_to_cntct_psn);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_tel, Chk01_HdrR.$ship_to_tel);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_fax, Chk01_HdrR.$ship_to_fax);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_to_sundry_flg,
					Chk01_HdrR.$ship_to_sundry_flg);
			addColumnPathMap(ShipInst_Chk01_HdrR.$via_dlv_typ, Chk01_HdrR.$via_dlv_typ);
			addColumnPathMap(ShipInst_Chk01_HdrR.$iv_no, Chk01_HdrR.$iv_no);
			addColumnPathMap(ShipInst_Chk01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
			addColumnPathMap(ShipInst_Chk01_HdrR.$inst_rmrks, Chk01_HdrR.$inst_rmrks);
			addColumnPathMap(ShipInst_Chk01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(ShipInst_Chk01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(ShipInst_Chk01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);

			addColumnPathMap(ShipInst_Chk01_HdrR.$pck_prnt_flg,
					Chk01_HdrR.$immd_pick_prnt_flg);
			addColumnPathMap(ShipInst_Chk01_HdrR.$ship_prnt_flg,
					Chk01_HdrR.$immd_ship_inst_prnt_flg);
			addColumnPathMap(ShipInst_Chk01_HdrR.$dlv_prnt_flg,
					Chk01_HdrR.$immd_dlv_prnt_flg);
			addColumnPathMap(ShipInst_Chk01_HdrR.$adv_prnt_flg,
					Chk01_HdrR.$immd_ship_adv_prnt_flg);
			addColumnPathMap(ShipInst_Chk01_HdrR.$lot_chk_off_flg,
					Chk01_HdrR.$lot_chk_off_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.hdr_dtl_peg(0);
		}
	}

	protected Map_ShipInst_Chk01_DtlR_Chk01_DtlR<ShipInst_Chk01_DtlR, Chk01_DtlR> createMap_ShipInst_Chk01_DtlR_Chk01_DtlR() {
		return new Map_ShipInst_Chk01_DtlR_Chk01_DtlR<ShipInst_Chk01_DtlR, Chk01_DtlR>();
	}

	public class Map_ShipInst_Chk01_DtlR_Chk01_DtlR<D extends ShipInst_Chk01_DtlR, S extends Chk01_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipInst_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$err_flg, Chk01_DtlR.$err_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$data_crud_typ,
					Chk01_DtlR.$data_crud_typ);
			addColumnPathMap(ShipInst_Chk01_DtlR.$tmp_inst_d_no,
					Chk01_DtlR.$tmp_inst_d_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$ship_inst_d_no,
					Chk01_DtlR.$ship_inst_d_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$ship_inst_no, Chk01_DtlR.$ship_inst_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
			addColumnPathMap(ShipInst_Chk01_DtlR.$ship_loc_cd, Chk01_DtlR.$ship_loc_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$ship_str_ln_cd,
					Chk01_DtlR.$ship_str_ln_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$ship_lg_grp_cd,
					Chk01_DtlR.$ship_lg_grp_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_loc_cd, Chk01_DtlR.$alloc_loc_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_str_ln_cd,
					Chk01_DtlR.$alloc_str_ln_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$dlv_str_ln_cd,
					Chk01_DtlR.$dlv_str_ln_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$trd_cd, Chk01_DtlR.$trd_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$trd_ptn_typ, Chk01_DtlR.$trd_ptn_typ);
			addColumnPathMap(ShipInst_Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(ShipInst_Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(ShipInst_Chk01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(ShipInst_Chk01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
			addColumnPathMap(ShipInst_Chk01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sundry_itm_flg,
					Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sno1, Chk01_DtlR.$sno1);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sno1_null_flg,
					Chk01_DtlR.$sno1_null_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sno2, Chk01_DtlR.$sno2);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sno2_null_flg,
					Chk01_DtlR.$sno2_null_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sno3, Chk01_DtlR.$sno3);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sno3_null_flg,
					Chk01_DtlR.$sno3_null_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sno4, Chk01_DtlR.$sno4);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sno4_null_flg,
					Chk01_DtlR.$sno4_null_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sno1, Chk01_DtlR.$alloc_sno1);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sno2, Chk01_DtlR.$alloc_sno2);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sno3, Chk01_DtlR.$alloc_sno3);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sno4, Chk01_DtlR.$alloc_sno4);
			addColumnPathMap(ShipInst_Chk01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_lot_no, Chk01_DtlR.$alloc_lot_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_sublot_no,
					Chk01_DtlR.$alloc_sublot_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_ver_no, Chk01_DtlR.$alloc_ver_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$stk_arrv_bp_cd,
					Chk01_DtlR.$stk_arrv_bp_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
			addColumnPathMap(ShipInst_Chk01_DtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
			addColumnPathMap(ShipInst_Chk01_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
			addColumnPathMap(ShipInst_Chk01_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$base_unit_qty,
					Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(ShipInst_Chk01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_ent_unit_qty,
					Chk01_DtlR.$alloc_ent_unit_qty);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_ent_unit_cd,
					Chk01_DtlR.$alloc_ent_unit_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_base_unit_qty,
					Chk01_DtlR.$alloc_base_unit_qty);
			addColumnPathMap(ShipInst_Chk01_DtlR.$alloc_base_unit_cd,
					Chk01_DtlR.$alloc_base_unit_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(ShipInst_Chk01_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$not_lot_mix_flg,
					Chk01_DtlR.$not_lot_mix_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$not_sublot_mix_flg,
					Chk01_DtlR.$not_sublot_mix_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$valid_dt_from,
					Chk01_DtlR.$valid_dt_from);
			addColumnPathMap(ShipInst_Chk01_DtlR.$valid_dt_to, Chk01_DtlR.$valid_dt_to);
			addColumnPathMap(ShipInst_Chk01_DtlR.$base_dlv_slip_no, Chk01_DtlR.$base_dlv_slip_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$base_prov_act_no, Chk01_DtlR.$base_prov_act_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$base_ac_dt, Chk01_DtlR.$base_ac_dt);
			addColumnPathMap(ShipInst_Chk01_DtlR.$iv_no, Chk01_DtlR.$iv_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$iv_d_no, Chk01_DtlR.$iv_d_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$ship_cnt_rmrks,
					Chk01_DtlR.$ship_cnt_rmrks);
			addColumnPathMap(ShipInst_Chk01_DtlR.$trd_rmrks, Chk01_DtlR.$trd_rmrks);
			addColumnPathMap(ShipInst_Chk01_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(ShipInst_Chk01_DtlR.$intr_d_rmrks, Chk01_DtlR.$intr_d_rmrks);
			addColumnPathMap(ShipInst_Chk01_DtlR.$inst_d_rmrks, Chk01_DtlR.$inst_d_rmrks);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(ShipInst_Chk01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(ShipInst_Chk01_DtlR.$inst_bndl_flg,
					Chk01_DtlR.$inst_bndl_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$skip_chk_ship_flg,
					Chk01_DtlR.$skip_chk_ship_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$dlv_slip_d_no,
					Chk01_DtlR.$dlv_slip_d_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$dlv_slip_no, Chk01_DtlR.$dlv_slip_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$ship_alloc_sts_no,
					Chk01_DtlR.$ship_alloc_sts_no);
			addColumnPathMap(ShipInst_Chk01_DtlR.$lot_none_flg, Chk01_DtlR.$lot_none_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$wms_flg, Chk01_DtlR.$wms_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$not_lot_mix_flg, Chk01_DtlR.$not_lot_mix_flg);
			addColumnPathMap(ShipInst_Chk01_DtlR.$not_sublot_mix_flg, Chk01_DtlR.$not_sublot_mix_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if (src.alloc_flg()) {
				dest.alloc_scope_typ(MAC_ALLOC_SCOPE_TYP.LOC.value());
				dest.alloc_tgt_flg(true);
			}
			else {
				dest.alloc_scope_typ(src.alloc_scope_typ());
			}
			
			if (src.grp_alloc_flg()) {
				dest.alloc_tgt_flg(true);
			}
			dest.hdr_dtl_peg(0);
		}
	}

	protected Map_ShipSchd_Chk01_DtlR_Srch01_ShipSchd_DtlR<ShipSchd_Chk01_DtlR, Srch01_ShipSchd_DtlR> createMap_ShipSchd_Chk01_DtlR_Srch01_ShipSchd_DtlR() {
		return new Map_ShipSchd_Chk01_DtlR_Srch01_ShipSchd_DtlR<ShipSchd_Chk01_DtlR, Srch01_ShipSchd_DtlR>();
	}

	public class Map_ShipSchd_Chk01_DtlR_Srch01_ShipSchd_DtlR<D extends ShipSchd_Chk01_DtlR, S extends Srch01_ShipSchd_DtlR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_Chk01_DtlR.$tmp_inst_d_no,
					Srch01_ShipSchd_DtlR.$tmp_inst_d_no);
			addColumnPathMap(ShipSchd_Chk01_DtlR.$ship_pr_no,
					Srch01_ShipSchd_DtlR.$ship_pr_no);
			addColumnPathMap(ShipSchd_Chk01_DtlR.$ship_schd_no,
					Srch01_ShipSchd_DtlR.$ship_schd_no);
			addColumnPathMap(ShipSchd_Chk01_DtlR.$ship_pr_no,
					Srch01_ShipSchd_DtlR.$ship_pr_no);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.hdr_dtl_peg(0);
		}
	}

	protected Map_ShipInst_Chk03_HdrR_Chk03_HdrR<ShipInst_Chk03_HdrR, Chk03_HdrR> createMap_ShipInst_Chk03_HdrR_Chk03_HdrR() {
		return new Map_ShipInst_Chk03_HdrR_Chk03_HdrR<ShipInst_Chk03_HdrR, Chk03_HdrR>();
	}

	public class Map_ShipInst_Chk03_HdrR_Chk03_HdrR<D extends ShipInst_Chk03_HdrR, S extends Chk03_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipInst_Chk03_HdrR.$err_flg, Chk03_HdrR.$err_flg);
			addColumnPathMap(ShipInst_Chk03_HdrR.$data_crud_typ,
					Chk03_HdrR.$data_crud_typ);
			addColumnPathMap(ShipInst_Chk03_HdrR.$ship_inst_no, Chk03_HdrR.$ship_inst_no);
			addColumnPathMap(ShipInst_Chk03_HdrR.$dlv_prnt_flg, Chk03_HdrR.$immd_dlv_prnt_flg);
		}
	}
	protected Map_ShipInst_Chk03_DtlR_Chk03_DtlR<ShipInst_Chk03_DtlR,Chk03_DtlR,Chk03_HdrR> createMap_ShipInst_Chk03_DtlR_Chk03_DtlR() {
		return new Map_ShipInst_Chk03_DtlR_Chk03_DtlR<ShipInst_Chk03_DtlR, Chk03_DtlR, Chk03_HdrR>();
	}
	public class Map_ShipInst_Chk03_DtlR_Chk03_DtlR<D extends ShipInst_Chk03_DtlR, S extends Chk03_DtlR, W extends Chk03_HdrR> extends MAUCC_RowMapperWith<D,S,W>{
		protected W _hdrR;
		@Override
		public void setWith(W hdrR) {
			_hdrR = hdrR;
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.ship_inst_no(_hdrR.ship_inst_no());
			dest.ship_alloc_sts_no(src.ship_alloc_sts_no());
			dest.wms_flg(src.wms_flg());
		}
	}

	protected Map_ShipRprt_Prnt02_HdrR_Chk04_HdrR<ShipRprt_Prnt02_HdrR, Chk04_HdrR> createMap_ShipRprt_Prnt02_HdrR_Chk04_HdrR() {
		return new Map_ShipRprt_Prnt02_HdrR_Chk04_HdrR<ShipRprt_Prnt02_HdrR, Chk04_HdrR>();
	}

	public class Map_ShipRprt_Prnt02_HdrR_Chk04_HdrR<D extends ShipRprt_Prnt02_HdrR, S extends Chk04_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$trn_typ, Chk04_HdrR.$trn_typ);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$ship_inst_no, Chk04_HdrR.$ship_inst_no);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$peg_no, Chk04_HdrR.$peg_no);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$err_flg, Chk04_HdrR.$err_flg);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$inst_prnt_flg, Chk04_HdrR.$inst_prnt_btn_flg);
			addColumnPathMap(ShipRprt_Prnt02_HdrR.$pick_prnt_flg, Chk04_HdrR.$pick_prnt_btn_flg);
		}
	}

	protected Map_MST_SHIP_INST_R_Chk04_HdrR<MST_SHIP_INST_R, Chk04_HdrR> createMap_MST_SHIP_INST_R_Chk04_HdrR() {
		return new Map_MST_SHIP_INST_R_Chk04_HdrR<MST_SHIP_INST_R, Chk04_HdrR>();
	}

	public class Map_MST_SHIP_INST_R_Chk04_HdrR<D extends MST_SHIP_INST_R, S extends Chk04_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_SHIP_INST_R.$ship_inst_no, Chk04_HdrR.$ship_inst_no);

		}
	}
			
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 支給元の支給計上日を取得する。<br>
	 */
	public class Sprt02 extends MSBEL_ShipInstReg_MC_A.Sprt02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			MCList<Sprt02_DtlR> dlvSlipNoL = MCList.create(Sprt02_DtlR.class);
			MCList<Sprt02_DtlR> provActNoL = MCList.create(Sprt02_DtlR.class);
			MCList<Sprt02_DtlR> retL = MCList.create(Sprt02_DtlR.class);

			for (Sprt02_DtlR r : up0()) {
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

			for (Sprt02_DtlR r : up0()) {
				if (!isNull(r.base_ac_dt())) {
					continue;
				}
				Sprt02_DtlR retR = null;
				if (!isNull(r.base_dlv_slip_no())) {
					retR = retL.getFirst(Sprt02_DtlR.$base_dlv_slip_no, r.base_dlv_slip_no());
				}
				else if (!isNull(r.base_prov_act_no())) {
					retR = retL.getFirst(Sprt02_DtlR.$base_prov_act_no, r.base_prov_act_no());
				}
				if (!isNull(retR)) {
					r.base_ac_dt(retR.base_ac_dt());
				}
				else {
					MCMessagePool.add(new MCMessage(r, Sprt02_DtlR.$base_ac_dt, MSBEL1104
					, r.base_dlv_slip_no()
					, r.base_prov_act_no()
					, toDispGUIIndex(r)));
				}
			}

			setDown();
		}

		protected MCList<Sprt02_DtlR> getDlvSlipNo(MCList<Sprt02_DtlR> dlvSlipNoL) {

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
			dbSelect("MSBEL1400_MST_PROV_ACT_S01", dlvSlipNoL, provActR_bldr, dlvSlipNoL);

			return dlvSlipNoL;

		}

		protected MCList<Sprt02_DtlR> getProvActNo(MCList<Sprt02_DtlR> provActNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);
			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(t.prov_act_no.as("base_prov_act_no"));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(t.prov_act_no.eq(bind("base_prov_act_no")));
			provActNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1400_MST_PROV_ACT_S02", provActNoL, provActR_bldr, provActNoL);

			return provActNoL;

		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}