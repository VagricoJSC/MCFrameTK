package mcframe.serverMSBE.MSBEL1450;

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
import mcframe.serverMSBE.MSBEL1450.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5540.*;
import mcframe.serverMSBE.MSBEL5550.*;
import static mcframe.serverMSBE.MSBEL1450.Query.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverCore.mcjdbc.MCSavepoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import mcframe.commonCore.param.MCParam;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import mcframe.serverMAUC.MAUCL5020.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import mcframe.serverCore.cache.MCJoinerList;
import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipActListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipActListReg_MC extends MSBEL_ShipActListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 出荷指図（登録時、参照時）・出荷実績（取消時、帳票発行時、参照時）を検索する。<br>
	 */
	public class Srch01 extends MSBEL_ShipActListReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());
			
			MCQueryPlan sql;
			down0().addStringColumn("base_unit_rnd_typ");

			// 登録（出荷指図・ヘッダ単位）
			if (isSame(up0().ope(),"0")) {
				sql = MSBEL1450_MST_SHIP_INST_S01();
				searchForDL(sql, up0(), down0());
			}
			// 取消（出荷実績・ヘッダ単位）
			else if (isSame(up0().ope(),"1")) {
				up0().addStringColumn("DISPLAY_CHK_STR", "1");
				sql = MSBEL1450_MST_SHIP_ACT_S01();
				searchForDL(sql, up0(), down0());
			}
			// 帳票発行（出荷実績・ヘッダ単位or納品書単位）
			else if (isSame(up0().ope(),"2")) {
				up0().addStringColumn("DISPLAY_CHK_STR", "1");
				// ヘッダ
				if (isSame(up0().srch_mode(),"0")) {
					sql = MSBEL1450_MST_SHIP_ACT_S01();
				}
				// 納品書
				else {
					sql = MSBEL1450_MST_SHIP_ACT_S03();
				}
				searchForDL(sql, up0(), down0());
			}
			// 参照
			else {
				// ヘッダ
				if (isSame(up0().srch_mode(),"0")) {
					if (up0().not_ship_flg()) {
						sql = MSBEL1450_MST_SHIP_INST_S01();
						searchForDL(sql, up0(), down0());
					}
					if (up0().ship_flg()) {
						sql = MSBEL1450_MST_SHIP_ACT_S01();
						searchForDL(sql, up0(), down0());
					}
				}
				// 明細
				else {
					if (up0().not_ship_flg()) {
						sql = MSBEL1450_MST_SHIP_INST_S02();
						searchForDL(sql, up0(), down0());
					}
					if (up0().ship_flg()) {
						sql = MSBEL1450_MST_SHIP_ACT_S02();
						searchForDL(sql, up0(), down0());
					}
				}
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			
			if(down0().isEmpty()) {
				return;
			}
			editListMainSub(down0());

			setNonDlvPrntFlg(down0());
			srchShipPrFromInst(down0());
			srchShipPrFromAct(down0());
		}
		
		protected void editListMainSub(MCList<Srch01_RsltR> d0) {
			for (Srch01_RsltR r : d0) {
				if (isNull(r.ship_act_d_no()) && nvl(r.act_qty(), MCNumber.ZERO).isPositive()) {
					// 出荷残数を算出
					r.base_unit_qty(r.base_unit_qty().subtract(r.act_qty()));
					MCNumber trdUnitQty
						= rvrsBaseUnitConv(
							r.base_unit_qty(), r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
							r.trd_unit_dec_place(), r.trd_unit_rnd_typ());
							
					MCNumber baseUnitQty 
						= convToBaseUnit(
							trdUnitQty, r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
							r.base_unit_dec_place(), r.getString("base_unit_rnd_typ"));
					if(isSame(baseUnitQty, r.base_unit_qty())) {
						r.trd_unit_qty(trdUnitQty);
					}
					else {
						r.trd_unit_qty(r.base_unit_qty());
						r.trd_unit_cd(r.base_unit_cd());
						r.trd_unit_nm(r.base_unit_nm());
					}
				}
				if (r.cont_fctr_flg()) {
					// 標準有効成分
					r.std_cont_qty(
							convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(),
									r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
					// 実際有効成分
					r.act_cont_qty(
							convToContFctrUnit(r.base_unit_qty(), r.act_cont_fctr(),
									r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
				}
			}
			// SQLでGROUP BYしており、分類項目をSQLで取得できないため、Java上で取得する
			if (isSame(up0().srch_mode(),"1")) {
				srchDlvGrp(d0);
				srchCstGrp(d0);
				srchItmGrp(d0);
			}
		}
		/**
		 * 納品先分類情報を取得する
		 * 
		 * @param d0
		 */
		protected void srchDlvGrp(MCList<Srch01_RsltR> d0) {
			if (up0().dlv_grp_flg1()
					|| up0().dlv_grp_flg2()
					|| up0().dlv_grp_flg3()
					|| up0().dlv_grp_flg4()
					|| up0().dlv_grp_flg5()
					|| up0().dlv_grp_flg6()
					|| up0().dlv_grp_flg7()
					|| up0().dlv_grp_flg8()
					|| up0().dlv_grp_flg9()
					|| up0().dlv_grp_flg10()) {
				
				MCList<MAM_BP_R> wkL = MCList.create(MAM_BP_R.class);
				for (Srch01_RsltR r : d0.distinctNE(Srch01_RsltR.$dlv_id_cd)) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.dlv_id_cd());
					wkL.add(bpR);
				}
				MAM_BP_R t = MAM_BP_R.create("T");
				MCQueryApiBuilder wk_bldr = MCQueryApiBuilder.create(t);
				dbWkDelete("MSBEL1450_MAW_BP_D01", wk_bldr.getBaseDbc());
				dbWkInsert("MSBEL1450_MAW_BP_I01", wkL, wk_bldr.getBaseDbc());
				
				MCQueryApiBuilder bp_bldr = MCQueryApiBuilder.create(t);
				MAW_BP_KEY_R w = MAW_BP_KEY_R.create("W");
				bp_bldr.setSelect(t.bp_cd);
				bp_bldr.addInnerJoin(w, bracket(w.bp_cd.eq(t.bp_cd)));
				if (up0().dlv_grp_flg1()) {
					MAM_BP_GRP_R grp1 = MAM_BP_GRP_R.create("GRP1");
					bp_bldr.addSelect(grp1.bp_grp_cd.as("bp_grp_cd1"), (grp1.bp_grp_nm.as("bp_grp_nm1")));
					bp_bldr.addLeftOuterJoin(grp1, bracket(grp1.bp_grp_cd.eq(t.bp_grp_cd1).and(grp1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value())))));
				}
				if (up0().dlv_grp_flg2()) {
					MAM_BP_GRP_R grp2 = MAM_BP_GRP_R.create("GRP2");
					bp_bldr.addSelect(grp2.bp_grp_cd.as("bp_grp_cd2"), (grp2.bp_grp_nm.as("bp_grp_nm2")));
					bp_bldr.addLeftOuterJoin(grp2, bracket(grp2.bp_grp_cd.eq(t.bp_grp_cd2).and(grp2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value())))));
				}
				if (up0().dlv_grp_flg3()) {
					MAM_BP_GRP_R grp3 = MAM_BP_GRP_R.create("GRP3");
					bp_bldr.addSelect(grp3.bp_grp_cd.as("bp_grp_cd3"), (grp3.bp_grp_nm.as("bp_grp_nm3")));
					bp_bldr.addLeftOuterJoin(grp3, bracket(grp3.bp_grp_cd.eq(t.bp_grp_cd3).and(grp3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value())))));
				}
				if (up0().dlv_grp_flg4()) {
					MAM_BP_GRP_R grp4 = MAM_BP_GRP_R.create("GRP4");
					bp_bldr.addSelect(grp4.bp_grp_cd.as("bp_grp_cd4"), (grp4.bp_grp_nm.as("bp_grp_nm4")));
					bp_bldr.addLeftOuterJoin(grp4, bracket(grp4.bp_grp_cd.eq(t.bp_grp_cd4).and(grp4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value())))));
				}
				if (up0().dlv_grp_flg5()) {
					MAM_BP_GRP_R grp5 = MAM_BP_GRP_R.create("GRP5");
					bp_bldr.addSelect(grp5.bp_grp_cd.as("bp_grp_cd5"), (grp5.bp_grp_nm.as("bp_grp_nm5")));
					bp_bldr.addLeftOuterJoin(grp5, bracket(grp5.bp_grp_cd.eq(t.bp_grp_cd5).and(grp5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value())))));
				}
				if (up0().dlv_grp_flg6()) {
					MAM_BP_GRP_R grp6 = MAM_BP_GRP_R.create("GRP6");
					bp_bldr.addSelect(grp6.bp_grp_cd.as("bp_grp_cd6"), (grp6.bp_grp_nm.as("bp_grp_nm6")));
					bp_bldr.addLeftOuterJoin(grp6, bracket(grp6.bp_grp_cd.eq(t.bp_grp_cd6).and(grp6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value())))));
				}
				if (up0().dlv_grp_flg7()) {
					MAM_BP_GRP_R grp7 = MAM_BP_GRP_R.create("GRP7");
					bp_bldr.addSelect(grp7.bp_grp_cd.as("bp_grp_cd7"), (grp7.bp_grp_nm.as("bp_grp_nm7")));
					bp_bldr.addLeftOuterJoin(grp7, bracket(grp7.bp_grp_cd.eq(t.bp_grp_cd7).and(grp7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value())))));
				}
				if (up0().dlv_grp_flg8()) {
					MAM_BP_GRP_R grp8 = MAM_BP_GRP_R.create("GRP8");
					bp_bldr.addSelect(grp8.bp_grp_cd.as("bp_grp_cd8"), (grp8.bp_grp_nm.as("bp_grp_nm8")));
					bp_bldr.addLeftOuterJoin(grp8, bracket(grp8.bp_grp_cd.eq(t.bp_grp_cd8).and(grp8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value())))));
				}
				if (up0().dlv_grp_flg9()) {
					MAM_BP_GRP_R grp9 = MAM_BP_GRP_R.create("GRP9");
					bp_bldr.addSelect(grp9.bp_grp_cd.as("bp_grp_cd9"), (grp9.bp_grp_nm.as("bp_grp_nm9")));
					bp_bldr.addLeftOuterJoin(grp9, bracket(grp9.bp_grp_cd.eq(t.bp_grp_cd9).and(grp9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value())))));
				}
				if (up0().dlv_grp_flg10()) {
					MAM_BP_GRP_R grp10 = MAM_BP_GRP_R.create("GRP10");
					bp_bldr.addSelect(grp10.bp_grp_cd.as("bp_grp_cd10"), (grp10.bp_grp_nm.as("bp_grp_nm10")));
					bp_bldr.addLeftOuterJoin(grp10, bracket(grp10.bp_grp_cd.eq(t.bp_grp_cd10).and(grp10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value())))));
				}
				MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
				dbSelect("MSBEL1450_MAM_BP_S01", bpL, bp_bldr);
				MCIndexKey key = bpL.createIndex(MAM_BP_R.$bp_cd);
				
				for (Srch01_RsltR r : d0) {
					MAM_BP_R bpR = bpL.getFirst(key, r.dlv_id_cd());
					if (bpR == null) {
						continue;
					}
					if (up0().dlv_grp_flg1()) {
						r.dlv_grp_cd1(bpR.bp_grp_cd1());
						r.dlv_grp_nm1(bpR.getStringNE("bp_grp_nm1"));
					}
					if (up0().dlv_grp_flg2()) {
						r.dlv_grp_cd2(bpR.bp_grp_cd2());
						r.dlv_grp_nm2(bpR.getStringNE("bp_grp_nm2"));
					}
					if (up0().dlv_grp_flg3()) {
						r.dlv_grp_cd3(bpR.bp_grp_cd3());
						r.dlv_grp_nm3(bpR.getStringNE("bp_grp_nm3"));
					}
					if (up0().dlv_grp_flg4()) {
						r.dlv_grp_cd4(bpR.bp_grp_cd4());
						r.dlv_grp_nm4(bpR.getStringNE("bp_grp_nm4"));
					}
					if (up0().dlv_grp_flg5()) {
						r.dlv_grp_cd5(bpR.bp_grp_cd5());
						r.dlv_grp_nm5(bpR.getStringNE("bp_grp_nm5"));
					}
					if (up0().dlv_grp_flg6()) {
						r.dlv_grp_cd6(bpR.bp_grp_cd6());
						r.dlv_grp_nm6(bpR.getStringNE("bp_grp_nm6"));
					}
					if (up0().dlv_grp_flg7()) {
						r.dlv_grp_cd7(bpR.bp_grp_cd7());
						r.dlv_grp_nm7(bpR.getStringNE("bp_grp_nm7"));
					}
					if (up0().dlv_grp_flg8()) {
						r.dlv_grp_cd8(bpR.bp_grp_cd8());
						r.dlv_grp_nm8(bpR.getStringNE("bp_grp_nm8"));
					}
					if (up0().dlv_grp_flg9()) {
						r.dlv_grp_cd9(bpR.bp_grp_cd9());
						r.dlv_grp_nm9(bpR.getStringNE("bp_grp_nm9"));
					}
					if (up0().dlv_grp_flg10()) {
						r.dlv_grp_cd10(bpR.bp_grp_cd10());
						r.dlv_grp_nm10(bpR.getStringNE("bp_grp_nm10"));
					}
				}
				dbWkDelete("MSBEL1450_MAW_BP_D02", wk_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 得意先分類情報を取得する
		 * 
		 * @param d0
		 */
		protected void srchCstGrp(MCList<Srch01_RsltR> d0) {
			if (up0().cst_grp_flg1()
					|| up0().cst_grp_flg2()
					|| up0().cst_grp_flg3()
					|| up0().cst_grp_flg4()
					|| up0().cst_grp_flg5()
					|| up0().cst_grp_flg6()
					|| up0().cst_grp_flg7()
					|| up0().cst_grp_flg8()
					|| up0().cst_grp_flg9()
					|| up0().cst_grp_flg10()) {
				
				MCList<MAM_BP_R> wkL = MCList.create(MAM_BP_R.class);
				for (Srch01_RsltR r : d0.distinctNE(Srch01_RsltR.$cst_cd)) {
					MAM_BP_R bpR = MAM_BP_R.create();
					bpR.bp_cd(r.cst_cd());
					wkL.add(bpR);
				}
				MAM_BP_R t = MAM_BP_R.create("T");
				MCQueryApiBuilder wk_bldr = MCQueryApiBuilder.create(t);
				dbWkDelete("MSBEL1450_MAW_BP_D03", wk_bldr.getBaseDbc());
				dbWkInsert("MSBEL1450_MAW_BP_I02", wkL, wk_bldr.getBaseDbc());
				
				MCQueryApiBuilder bp_bldr = MCQueryApiBuilder.create(t);
				MAW_BP_KEY_R w = MAW_BP_KEY_R.create("W");
				bp_bldr.setSelect(t.bp_cd);
				bp_bldr.addInnerJoin(w, bracket(w.bp_cd.eq(t.bp_cd)));
				if (up0().cst_grp_flg1()) {
					MAM_BP_GRP_R grp1 = MAM_BP_GRP_R.create("GRP1");
					bp_bldr.addSelect(grp1.bp_grp_cd.as("bp_grp_cd1"), (grp1.bp_grp_nm.as("bp_grp_nm1")));
					bp_bldr.addLeftOuterJoin(grp1, bracket(grp1.bp_grp_cd.eq(t.bp_grp_cd1).and(grp1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value())))));

				}
				if (up0().cst_grp_flg2()) {
					MAM_BP_GRP_R grp2 = MAM_BP_GRP_R.create("GRP2");
					bp_bldr.addSelect(grp2.bp_grp_cd.as("bp_grp_cd2"), (grp2.bp_grp_nm.as("bp_grp_nm2")));
					bp_bldr.addLeftOuterJoin(grp2, bracket(grp2.bp_grp_cd.eq(t.bp_grp_cd2).and(grp2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value())))));
				}
				if (up0().cst_grp_flg3()) {
					MAM_BP_GRP_R grp3 = MAM_BP_GRP_R.create("GRP3");
					bp_bldr.addSelect(grp3.bp_grp_cd.as("bp_grp_cd3"), (grp3.bp_grp_nm.as("bp_grp_nm3")));
					bp_bldr.addLeftOuterJoin(grp3, bracket(grp3.bp_grp_cd.eq(t.bp_grp_cd3).and(grp3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value())))));
				}
				if (up0().cst_grp_flg4()) {
					MAM_BP_GRP_R grp4 = MAM_BP_GRP_R.create("GRP4");
					bp_bldr.addSelect(grp4.bp_grp_cd.as("bp_grp_cd4"), (grp4.bp_grp_nm.as("bp_grp_nm4")));
					bp_bldr.addLeftOuterJoin(grp4, bracket(grp4.bp_grp_cd.eq(t.bp_grp_cd4).and(grp4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value())))));
				}
				if (up0().cst_grp_flg5()) {
					MAM_BP_GRP_R grp5 = MAM_BP_GRP_R.create("GRP5");
					bp_bldr.addSelect(grp5.bp_grp_cd.as("bp_grp_cd5"), (grp5.bp_grp_nm.as("bp_grp_nm5")));
					bp_bldr.addLeftOuterJoin(grp5, bracket(grp5.bp_grp_cd.eq(t.bp_grp_cd5).and(grp5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value())))));
				}
				if (up0().cst_grp_flg6()) {
					MAM_BP_GRP_R grp6 = MAM_BP_GRP_R.create("GRP6");
					bp_bldr.addSelect(grp6.bp_grp_cd.as("bp_grp_cd6"), (grp6.bp_grp_nm.as("bp_grp_nm6")));
					bp_bldr.addLeftOuterJoin(grp6, bracket(grp6.bp_grp_cd.eq(t.bp_grp_cd6).and(grp6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value())))));
				}
				if (up0().cst_grp_flg7()) {
					MAM_BP_GRP_R grp7 = MAM_BP_GRP_R.create("GRP7");
					bp_bldr.addSelect(grp7.bp_grp_cd.as("bp_grp_cd7"), (grp7.bp_grp_nm.as("bp_grp_nm7")));
					bp_bldr.addLeftOuterJoin(grp7, bracket(grp7.bp_grp_cd.eq(t.bp_grp_cd7).and(grp7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value())))));
				}
				if (up0().cst_grp_flg8()) {
					MAM_BP_GRP_R grp8 = MAM_BP_GRP_R.create("GRP8");
					bp_bldr.addSelect(grp8.bp_grp_cd.as("bp_grp_cd8"), (grp8.bp_grp_nm.as("bp_grp_nm8")));
					bp_bldr.addLeftOuterJoin(grp8, bracket(grp8.bp_grp_cd.eq(t.bp_grp_cd8).and(grp8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value())))));
				}
				if (up0().cst_grp_flg9()) {
					MAM_BP_GRP_R grp9 = MAM_BP_GRP_R.create("GRP9");
					bp_bldr.addSelect(grp9.bp_grp_cd.as("bp_grp_cd9"), (grp9.bp_grp_nm.as("bp_grp_nm9")));
					bp_bldr.addLeftOuterJoin(grp9, bracket(grp9.bp_grp_cd.eq(t.bp_grp_cd9).and(grp9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value())))));
				}
				if (up0().cst_grp_flg10()) {
					MAM_BP_GRP_R grp10 = MAM_BP_GRP_R.create("GRP10");
					bp_bldr.addSelect(grp10.bp_grp_cd.as("bp_grp_cd10"), (grp10.bp_grp_nm.as("bp_grp_nm10")));
					bp_bldr.addLeftOuterJoin(grp10, bracket(grp10.bp_grp_cd.eq(t.bp_grp_cd10).and(grp10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value())))));
				}
				MCList<MAM_BP_R> bpL = MCList.create(MAM_BP_R.class);
				dbSelect("MSBEL1450_MAW_BP_S02", bpL, bp_bldr);
				MCIndexKey key = bpL.createIndex(MAM_BP_R.$bp_cd);
				
				for (Srch01_RsltR r : d0) {
					MAM_BP_R bpR = bpL.getFirst(key, r.cst_cd());
					if (bpR == null) {
						continue;
					}
					if (up0().cst_grp_flg1()) {
						r.cst_grp_cd1(bpR.bp_grp_cd1());
						r.cst_grp_nm1(bpR.getStringNE("bp_grp_nm1"));
					}
					if (up0().cst_grp_flg2()) {
						r.cst_grp_cd2(bpR.bp_grp_cd2());
						r.cst_grp_nm2(bpR.getStringNE("bp_grp_nm2"));
					}
					if (up0().cst_grp_flg3()) {
						r.cst_grp_cd3(bpR.bp_grp_cd3());
						r.cst_grp_nm3(bpR.getStringNE("bp_grp_nm3"));
					}
					if (up0().cst_grp_flg4()) {
						r.cst_grp_cd4(bpR.bp_grp_cd4());
						r.cst_grp_nm4(bpR.getStringNE("bp_grp_nm4"));
					}
					if (up0().cst_grp_flg5()) {
						r.cst_grp_cd5(bpR.bp_grp_cd5());
						r.cst_grp_nm5(bpR.getStringNE("bp_grp_nm5"));
					}
					if (up0().cst_grp_flg6()) {
						r.cst_grp_cd6(bpR.bp_grp_cd6());
						r.cst_grp_nm6(bpR.getStringNE("bp_grp_nm6"));
					}
					if (up0().cst_grp_flg7()) {
						r.cst_grp_cd7(bpR.bp_grp_cd7());
						r.cst_grp_nm7(bpR.getStringNE("bp_grp_nm7"));
					}
					if (up0().cst_grp_flg8()) {
						r.cst_grp_cd8(bpR.bp_grp_cd8());
						r.cst_grp_nm8(bpR.getStringNE("bp_grp_nm8"));
					}
					if (up0().cst_grp_flg9()) {
						r.cst_grp_cd9(bpR.bp_grp_cd9());
						r.cst_grp_nm9(bpR.getStringNE("bp_grp_nm9"));
					}
					if (up0().cst_grp_flg10()) {
						r.cst_grp_cd10(bpR.bp_grp_cd10());
						r.cst_grp_nm10(bpR.getStringNE("bp_grp_nm10"));
					}
				}
				dbWkDelete("MSBEL1450_MAW_BP_D04", wk_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 品目分類情報を取得する
		 * 
		 * @param d0
		 */
		protected void srchItmGrp(MCList<Srch01_RsltR> d0) {
			if (up0().itm_grp_flg1()
					|| up0().itm_grp_flg2()
					|| up0().itm_grp_flg3()
					|| up0().itm_grp_flg4()
					|| up0().itm_grp_flg5()
					|| up0().itm_grp_flg6()
					|| up0().itm_grp_flg7()
					|| up0().itm_grp_flg8()
					|| up0().itm_grp_flg9()
					|| up0().itm_grp_flg10()) {
				
				MCList<MAM_ITM_R> wkL = MCList.create(MAM_ITM_R.class);
				for (Srch01_RsltR r : d0.distinctNE(Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3)) {
					MAM_ITM_R itmR = MAM_ITM_R.create();
					itmR.itm_cd(r.itm_cd());
					itmR.itm_sub1(r.itm_sub1());
					itmR.itm_sub2(r.itm_sub2());
					itmR.itm_sub3(r.itm_sub3());
					wkL.add(itmR);
				}
				MAM_ITM_R t = MAM_ITM_R.create("T");
				MCQueryApiBuilder wk_bldr = MCQueryApiBuilder.create(t);
				dbWkDelete("MSBEL1450_MAW_ITM_D01", wk_bldr.getBaseDbc());
				dbWkInsert("MSBEL1450_MAW_ITM_I01", wkL, wk_bldr.getBaseDbc());
				
				MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
				MAW_ITM_KEY_R w = MAW_ITM_KEY_R.create("W");
				
				itm_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3);
				itm_bldr.addInnerJoin(w, bracket(w.itm_cd.eq(t.itm_cd).and(w.itm_sub1.eq(t.itm_sub1)).and(w.itm_sub2.eq(t.itm_sub2)).and(w.itm_sub3.eq(t.itm_sub3))));
				
				if (up0().itm_grp_flg1()) {
					MAM_ITM_GRP_R grp1 = MAM_ITM_GRP_R.create("GRP1");
					itm_bldr.addSelect(grp1.itm_grp_cd.as("itm_grp_cd1"), (grp1.itm_grp_nm.as("itm_grp_nm1")));
					itm_bldr.addLeftOuterJoin(grp1, bracket(grp1.itm_grp_cd.eq(t.itm_grp_cd1).and(grp1.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP1.value())))));
				}
				if (up0().itm_grp_flg2()) {
					MAM_ITM_GRP_R grp2 = MAM_ITM_GRP_R.create("GRP2");
					itm_bldr.addSelect(grp2.itm_grp_cd.as("itm_grp_cd2"), (grp2.itm_grp_nm.as("itm_grp_nm2")));
					itm_bldr.addLeftOuterJoin(grp2, bracket(grp2.itm_grp_cd.eq(t.itm_grp_cd2).and(grp2.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP2.value())))));
				}
				if (up0().itm_grp_flg3()) {
					MAM_ITM_GRP_R grp3 = MAM_ITM_GRP_R.create("GRP3");
					itm_bldr.addSelect(grp3.itm_grp_cd.as("itm_grp_cd3"), (grp3.itm_grp_nm.as("itm_grp_nm3")));
					itm_bldr.addLeftOuterJoin(grp3, bracket(grp3.itm_grp_cd.eq(t.itm_grp_cd3).and(grp3.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP3.value())))));
				}
				if (up0().itm_grp_flg4()) {
					MAM_ITM_GRP_R grp4 = MAM_ITM_GRP_R.create("GRP4");
					itm_bldr.addSelect(grp4.itm_grp_cd.as("itm_grp_cd4"), (grp4.itm_grp_nm.as("itm_grp_nm4")));
					itm_bldr.addLeftOuterJoin(grp4, bracket(grp4.itm_grp_cd.eq(t.itm_grp_cd4).and(grp4.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP4.value())))));
				}
				if (up0().itm_grp_flg5()) {
					MAM_ITM_GRP_R grp5 = MAM_ITM_GRP_R.create("GRP5");
					itm_bldr.addSelect(grp5.itm_grp_cd.as("itm_grp_cd5"), (grp5.itm_grp_nm.as("itm_grp_nm5")));
					itm_bldr.addLeftOuterJoin(grp5, bracket(grp5.itm_grp_cd.eq(t.itm_grp_cd5).and(grp5.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP5.value())))));
				}
				if (up0().itm_grp_flg6()) {
					MAM_ITM_GRP_R grp6 = MAM_ITM_GRP_R.create("GRP6");
					itm_bldr.addSelect(grp6.itm_grp_cd.as("itm_grp_cd6"), (grp6.itm_grp_nm.as("itm_grp_nm6")));
					itm_bldr.addLeftOuterJoin(grp6, bracket(grp6.itm_grp_cd.eq(t.itm_grp_cd6).and(grp6.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP6.value())))));
				}
				if (up0().itm_grp_flg7()) {
					MAM_ITM_GRP_R grp7 = MAM_ITM_GRP_R.create("GRP7");
					itm_bldr.addSelect(grp7.itm_grp_cd.as("itm_grp_cd7"), (grp7.itm_grp_nm.as("itm_grp_nm7")));
					itm_bldr.addLeftOuterJoin(grp7, bracket(grp7.itm_grp_cd.eq(t.itm_grp_cd7).and(grp7.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP7.value())))));
				}
				if (up0().itm_grp_flg8()) {
					MAM_ITM_GRP_R grp8 = MAM_ITM_GRP_R.create("GRP8");
					itm_bldr.addSelect(grp8.itm_grp_cd.as("itm_grp_cd8"), (grp8.itm_grp_nm.as("itm_grp_nm8")));
					itm_bldr.addLeftOuterJoin(grp8, bracket(grp8.itm_grp_cd.eq(t.itm_grp_cd8).and(grp8.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP8.value())))));
				}
				if (up0().itm_grp_flg9()) {
					MAM_ITM_GRP_R grp9 = MAM_ITM_GRP_R.create("GRP9");
					itm_bldr.addSelect(grp9.itm_grp_cd.as("itm_grp_cd9"), (grp9.itm_grp_nm.as("itm_grp_nm9")));
					itm_bldr.addLeftOuterJoin(grp9, bracket(grp9.itm_grp_cd.eq(t.itm_grp_cd9).and(grp9.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP9.value())))));
				}
				if (up0().itm_grp_flg10()) {
					MAM_ITM_GRP_R grp10 = MAM_ITM_GRP_R.create("GRP10");
					itm_bldr.addSelect(grp10.itm_grp_cd.as("itm_grp_cd10"), (grp10.itm_grp_nm.as("itm_grp_nm10")));
					itm_bldr.addLeftOuterJoin(grp10, bracket(grp10.itm_grp_cd.eq(t.itm_grp_cd10).and(grp10.itm_grp_typ.eq(value(MAC_ITM_GRP_TYP.GRP10.value())))));
				}
				MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
				dbSelect("MSBEL1450_MAW_ITM_S01", itmL, itm_bldr);
				MCIndexKey key = itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
				
				for (Srch01_RsltR r : d0) {
					MAM_ITM_R itmR = itmL.getFirst(key, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
					if (itmR == null) {
						continue;
					}
					if (up0().itm_grp_flg1()) {
						r.itm_grp_cd1(itmR.itm_grp_cd1());
						r.itm_grp_nm1(itmR.getStringNE("itm_grp_nm1"));
					}
					if (up0().itm_grp_flg2()) {
						r.itm_grp_cd2(itmR.itm_grp_cd2());
						r.itm_grp_nm2(itmR.getStringNE("itm_grp_nm2"));
					}
					if (up0().itm_grp_flg3()) {
						r.itm_grp_cd3(itmR.itm_grp_cd3());
						r.itm_grp_nm3(itmR.getStringNE("itm_grp_nm3"));
					}
					if (up0().itm_grp_flg4()) {
						r.itm_grp_cd4(itmR.itm_grp_cd4());
						r.itm_grp_nm4(itmR.getStringNE("itm_grp_nm4"));
					}
					if (up0().itm_grp_flg5()) {
						r.itm_grp_cd5(itmR.itm_grp_cd5());
						r.itm_grp_nm5(itmR.getStringNE("itm_grp_nm5"));
					}
					if (up0().itm_grp_flg6()) {
						r.itm_grp_cd6(itmR.itm_grp_cd6());
						r.itm_grp_nm6(itmR.getStringNE("itm_grp_nm6"));
					}
					if (up0().itm_grp_flg7()) {
						r.itm_grp_cd7(itmR.itm_grp_cd7());
						r.itm_grp_nm7(itmR.getStringNE("itm_grp_nm7"));
					}
					if (up0().itm_grp_flg8()) {
						r.itm_grp_cd8(itmR.itm_grp_cd8());
						r.itm_grp_nm8(itmR.getStringNE("itm_grp_nm8"));
					}
					if (up0().itm_grp_flg9()) {
						r.itm_grp_cd9(itmR.itm_grp_cd9());
						r.itm_grp_nm9(itmR.getStringNE("itm_grp_nm9"));
					}
					if (up0().itm_grp_flg10()) {
						r.itm_grp_cd10(itmR.itm_grp_cd10());
						r.itm_grp_nm10(itmR.getStringNE("itm_grp_nm10"));
					}
				}
				dbWkDelete("MSBEL1450_MAM_ITM_D02", wk_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			boolean flg = false;
			if (isSame(up0().ope(),"2")) {
				up0().addStringColumn("prnt_mode_flg", MCBooleanUtil.booleanToDBString(true));
			}
			else {
				up0().addStringColumn("not_prnt_mode_flg", MCBooleanUtil.booleanToDBString(true));
			}
			if (isSame(up.ope(),"3")) {
				if (up.dlv_rqst_flg()) {
					up.addNumberColumn("TMP_DLV_RQST", MCNumber.ZERO);
					flg = true;
				}
				if (up.ship_rqst_flg()) {
					up.addNumberColumn("TMP_SHIP_RQST", MCNumber.ZERO);
					flg = true;
				}
				if (up.pd_inst_dlv_flg()) {
					up.addNumberColumn("TMP_PD_INST_DLV", MCNumber.ZERO);
					flg = true;
				}
			}
			up.addNumberColumn("TMP_NOT_REF_MODE", flg ? MCNumber.ZERO : MCNumber.ONE);
			up.addDateColumn("TODAY", getToday());
		}
		
		protected String[] getSortCol() {
			return new String[] {
					Srch01_RsltR.$ship_inst_dt,
					Srch01_RsltR.$ship_inst_hm,
					Srch01_RsltR.$ship_schd_dt,
					Srch01_RsltR.$ship_schd_hm,
					Srch01_RsltR.$ship_dt,
					Srch01_RsltR.$ship_hm,
					Srch01_RsltR.$ac_dt,
					Srch01_RsltR.$dlv_schd_dt,
					Srch01_RsltR.$dlv_schd_hm,
					Srch01_RsltR.$ship_act_no,
					Srch01_RsltR.$ship_act_d_no,
					Srch01_RsltR.$disp_seq,
					Srch01_RsltR.$ship_inst_no,
					Srch01_RsltR.$ship_inst_d_no,
					Srch01_RsltR.$ship_inst_disp_seq
			};
		}
		
		protected void setNonDlvPrntFlg(MCList<Srch01_RsltR> down0) {
			if (!isSame(up0().ope(),"2") || down0.isEmpty()) {
				return;
			}
			MCList<MST_SHIP_ACT_R> actL = checkSlsAct(down0);
			MCIndexKey idxkey = 
				isSame(up0().srch_mode(), "2") ? 
					actL.createIndex(MST_SHIP_ACT_R.$ship_act_no, MST_DLV_SLIP_R.$dlv_slip_no) :
					actL.createIndex(MST_SHIP_ACT_R.$ship_act_no);
			for (Srch01_RsltR r :down0) {
				// 以下の条件を満たす場合、納品書は発行不可（出荷案内書は売上で発行しないので不要）
				// ・出荷で発行していない
				// ・売上以降で発行している
				for (MST_SHIP_ACT_R actR : actL.subList(idxkey, r.toArray(idxkey.getKeys()))) {
					if (!actR.dlv_prnt_flg() && !isNull(actR.getStringNE("sls_act_no"))) {
						r.non_dlv_prnt_flg(true);
						break;
					}
				}
			}
		}
		protected MCList<MST_SHIP_ACT_R> checkSlsAct(MCList<Srch01_RsltR> bindL) {
			MST_SHIP_ACT_R dbc = MST_SHIP_ACT_R.create();
			dbWkDelete("MSBEL1450_MSW_SHIP_ACT_D03", dbc);
			dbWkInsert("MSBEL1450_MSW_SHIP_ACT_I03", bindL, dbc);
	
			MSW_SHIP_ACT_KEY_R w = MSW_SHIP_ACT_KEY_R.create("W");
			MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MST_SLS_ACT_R t3 = MST_SLS_ACT_R.create("T3");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(w);
			bldr.addInnerJoin(t1, t1.ship_act_no.eq(w.ship_act_no));
			bldr.addLeftOuterJoin(t2,
				t2.dlv_slip_no.eq(t1.dlv_slip_no)
				.and(t2.dlv_slip_seq.eq(t1.dlv_slip_seq))
			);
			bldr.addLeftOuterJoin(t3,
				t3.ship_act_no.eq(t1.ship_act_no)
				.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
				.and(t3.ship_act_sync_flg.eq(value(false)))
			);
			bldr.setGroupBy(t1.ship_act_no, t1.dlv_slip_no);
			bldr.addMin(t2.slip_prnt_flg, "dlv_prnt_flg");
			bldr.addMin(t3.sls_act_no, "sls_act_no");
			
			MCList<MST_SHIP_ACT_R> rsltL = MCList.create(MST_SHIP_ACT_R.class);
			rsltL.addStringColumn(MST_DLV_SLIP_R.$dlv_slip_no);
			rsltL.addStringColumn(MST_SLS_ACT_R.$sls_act_no);
			dbSelect("MSBEL1450_MST_SLS_ACT_S01", rsltL, bldr);
			
			dbWkDelete("MSBEL1450_MSW_SHIP_ACT_D04", dbc);
			return rsltL;
		}

		/**
		 * 出荷指図NOに対応する出荷進捗の更新カウンタを取得する
		 */
		protected void srchShipPrFromInst(MCList<Srch01_RsltR> d0) {

			// 登録モード以外は何もしない
			if (!isSame(up0().ope(),"0")) {
				return;
			}

			MCList<MST_SHIP_INST_R> dbc = MCList.create(MST_SHIP_INST_R.class);
			d0.forEach(r -> {
				dbc.add().ship_inst_no(r.ship_inst_no());
			});
			MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBEL1450_MSW_SHIP_INST_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBEL1450_MSW_SHIP_INST_I01", dbc, dbc_bldr.getBaseDbc());

			MSW_SHIP_INST_KEY_R w = MSW_SHIP_INST_KEY_R.create("W");
			MST_SHIP_INST_D_R t1 = MST_SHIP_INST_D_R.create("T1");
			MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
			MST_SHIP_PR_R t3 = MST_SHIP_PR_R.create("T3");
			dbc.addStringColumn("ship_pr_no");
			dbc_bldr.setSelect(t.ship_inst_no, t3.ship_pr_no, t3.upd_cntr);
			dbc_bldr.addInnerJoin(w, bracket( w.ship_inst_no.eq(t.ship_inst_no)));
			dbc_bldr.addInnerJoin(t1, bracket( t1.ship_inst_no.eq(t.ship_inst_no)));
			dbc_bldr.addInnerJoin(t2, bracket( t2.ship_inst_d_no.eq(t1.ship_inst_d_no)));
			dbc_bldr.addInnerJoin(t3, bracket( t3.ship_pr_no.eq(t2.ship_pr_no)));
			dbSelect("MSBEL1450_MST_SHIP_INST_S01", dbc, dbc_bldr);

			dbc.forEach(r -> {
				Srch01_CntrR cntrR = down1().add();
				cntrR.ship_inst_no(r.ship_inst_no());
				cntrR.ship_pr_no(r.getString("ship_pr_no"));
				cntrR.ship_pr_upd_cntr(r.getNumber("upd_cntr"));
			});
		}

		/**
		 * 出荷実績NOに対応する出荷進捗の更新カウンタを取得する
		 */
		protected void srchShipPrFromAct(MCList<Srch01_RsltR> d0) {

			// 取消モード以外は何もしない
			if (!isSame(up0().ope(),"1")) {
				return;
			}

			MCList<MST_SHIP_ACT_R> dbc = MCList.create(MST_SHIP_ACT_R.class);
			d0.forEach(r -> {
				dbc.add().ship_act_no(r.ship_act_no());
			});
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MSBEL1450_MSW_SHIP_ACT_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBEL1450_MSW_SHIP_ACT_I01", dbc, dbc_bldr.getBaseDbc());

			MSW_SHIP_ACT_KEY_R w = MSW_SHIP_ACT_KEY_R.create("W");
			MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");
			MST_SHIP_ALLOC_STS_R t2 = MST_SHIP_ALLOC_STS_R.create("T2");
			MST_SHIP_SCHD_R t3 = MST_SHIP_SCHD_R.create("T3");
			MST_SHIP_PR_R t4 = MST_SHIP_PR_R.create("T4");
			dbc.addStringColumn("ship_pr_no");
			dbc_bldr.setSelect(t.ship_act_no, t4.ship_pr_no, t4.upd_cntr);
			dbc_bldr.addInnerJoin(w, bracket( w.ship_act_no.eq(t.ship_act_no)));
			dbc_bldr.addInnerJoin(t1, bracket( t1.ship_act_no.eq(t.ship_act_no)));
			dbc_bldr.addInnerJoin(t2, bracket( t2.ship_alloc_sts_no.eq(t1.ship_alloc_sts_no)));
			dbc_bldr.addInnerJoin(t3, bracket( t3.ship_inst_d_no.eq(t2.ship_inst_d_no) .or(t3.ship_schd_no.eq(t2.ship_schd_no))));
			dbc_bldr.addInnerJoin(t4, bracket( t4.ship_pr_no.eq(t3.ship_pr_no)));
			dbSelect("MSBEL1450_MST_SHIP_ACT_S01", dbc, dbc_bldr);

			dbc.forEach(r -> {
				Srch01_CntrR cntrR = down1().add();
				cntrR.ship_act_no(r.ship_act_no());
				cntrR.ship_pr_no(r.getString("ship_pr_no"));
				cntrR.ship_pr_upd_cntr(r.getNumber("upd_cntr"));
			});
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 出荷実績登録前のチェックを行う。<br>
	 */
	public class Chk01 extends MSBEL_ShipActListReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			doCache();

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

			msgL.addAll(chkShipPr());
			msgL.addAll(chkShipInst());

			return msgL;
		}

		/**
		 * 出荷進捗のロック、更新カウンタチェック
		 * @return
		 */
		protected MCMessageList chkShipPr() {
			MCMessageList msgL = chkShipPrCmn(up1(), Srch01_CntrR.$ship_inst_no);
			
			MCIndexKey idx = up0().createIndex(Chk01_RsltR.$ship_inst_no);
			for (MCMessage msg : msgL) {
				// CauseRowを差し替える
				Srch01_CntrR cntrR = (Srch01_CntrR)msg.getCauseRow();
				Chk01_RsltR r = up0().getFirst(idx, cntrR.ship_inst_no());
				msg.setCauseRow(r, msg.getCauseColumn());
				r.err_flg(true);
			}
			
			return msgL;
		}

		/**
		 * 出荷指図のロック、更新カウンタチェック
		 */
		protected MCMessageList chkShipInst() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_SHIP_INST_R> selectL = MCList.create(MST_SHIP_INST_R.class);
			MST_SHIP_INST_R t = MST_SHIP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.ship_inst_no, t.ship_fr_lg_grp_cd, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.ship_inst_no);

			MCList<Chk01_RsltR> bindL = notErrL.groupBy(Chk01_RsltR.$ship_inst_no);
			bindL.sort(Chk01_RsltR.$ship_inst_no);
			dbSelectKeyForUpdateNoWait("MSBEL1450_MST_SHIP_INST_S02",
					selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_SHIP_INST_R.$ship_inst_no);
			for (Chk01_RsltR r : notErrL) {
				MST_SHIP_INST_R selectR = selectL.getFirst(idxkey, r.ship_inst_no());
				if (!isNull(r.ship_inst_no())) {
					msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
					r.ship_fr_lg_grp_cd(selectR.ship_fr_lg_grp_cd());	// DACで使用する
				}
			}
			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			for (Chk01_RsltR r : up0()) {
				if (!isNull(r.ship_tm())) {
					r.ship_dt(r.ship_tm().trunc(MCDateFieldType.DAY));
				}
			}
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			
			for (Chk01_RsltR r : notErrL) {

				// DACチェック
				msgL.addAll(checkWritableLgGrpCdDac(r, Chk01_RsltR.$ship_fr_lg_grp_cd));
			}
			
			return msgL;
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
			initShipInstCache(up0());
			initShipInstDCache(up0(), up2());
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			// 引当済チェック
			for (Chk01_RsltR r : notErrL) {
				MCList<MST_SHIP_INST_D_R> siL = getShipInstDL(r.ship_inst_no());
				for (MST_SHIP_INST_D_R siR : siL) {
					if (MAC_STK_MNG_TYP.isMNG(siR.getString("stk_mng_typ"))) {
						if (!siR.getBoolean("alloc_flg")
							|| (isNull(siR.getString("alloc_ship_loc_cd"))
								 || isNull(siR.getString("alloc_ship_str_ln_cd"))
								 || isNull(siR.getString("alloc_lot_no"))
								 || isNull(siR.getString("alloc_sublot_no")))) {
							msgL.add(new MCMessage(r, Chk01_RsltR.$ship_inst_no, MSBEL0174,
									r.ship_inst_no(), toDispGUIIndex(r)));
							setErrFlg(r, msgL);
							break;
						}
					}
				}
			}

			// 出荷実績サービスのチェック処理
			msgL.addAll(callShipAct_Chk01(getChkList(up0())));

			// 負担部門、依頼部門の組織変更対応
			MCList<MST_SHIP_INST_D_R> sidAllL = MCList.create(MST_SHIP_INST_D_R.class);
			sidAllL.addDateColumn("ac_dt");
			sidAllL.addStringColumn("rqst_dpt_cd");
			notErrL = getChkList(up0());
			MCIndexKey up0IdxKey = notErrL.createIndex(Chk01_RsltR.$peg_no);
			for (Chk01_RsltR r : notErrL) {
				MCList<MST_SHIP_INST_D_R> sidL = getShipInstDL(r.ship_inst_no());
				sidL.addBooleanColumn("err_flg");
				sidL.addDateColumn("ac_dt", r.ac_dt());
				sidL.setAttributes(r);
				sidL.setNumberNE("hdr_peg_no", r.peg_no());
				sidAllL.addAll(sidL);
			}
			setDpt(sidAllL, MST_SHIP_INST_D_R.$bd_dpt_cd, null, "ac_dt", true);
			setDpt(sidAllL, "rqst_dpt_cd", null, "ac_dt", true);
			for (MCList<MST_SHIP_INST_D_R> l : sidAllL.groupList("hdr_peg_no")) {
				for (MST_SHIP_INST_D_R sidR : l) {
					if (sidR.getBoolean("err_flg")) {
						notErrL.getFirst(up0IdxKey, sidR.getNumberNE("hdr_peg_no")).err_flg(true);
						break;
					}
				}
			}
			
			return(msgL);
		}

		/**
		 * 出荷実績サービスのチェック処理を実行する
		 */
		protected MCMessageList callShipAct_Chk01(MCList<Chk01_RsltR> lst) {
			MCMessageList
				poolL = new MCMessageList(), msgL = new MCMessageList();
			poolL.addAll(MCMessagePool.getMessageList());	// メッセージ退避
			MCMessagePool.clear();

			MSBEL_ShipActService.ShipAct_Chk01 ope = MSBEL_ShipActService.crtShipAct_Chk01();
			setShipActMessage(ope, lst);
			ope.exec();

			copyErrFlg(lst, ope.down0());
			
			//登録時のＶＭＩサービス呼び出し時に元紐付けＮＯが必要になるため、
			//下り電文に出荷引当状況ＮＯと紐付けＮＯを格納する
			addAll(down1(), ope.down1(), createMap_Chk01_DtlR_ShipAct_DtlR());

			// ロウの差し替え＆重複を排除
			HashMap<String, MCMessage> o = new HashMap<>();
			MCIndexKey idx = lst.createIndex(Chk01_RsltR.$peg_no);
			for (MCMessage msg : MCMessagePool.getMessageList()) {
				MCRow causeRow = msg.getCauseRow();
				MCNumber pegNo = null;
				if (!isNull(causeRow)) {
					if (causeRow instanceof ShipAct_HdrR) {
						pegNo = ((ShipAct_HdrR)causeRow).peg_no();
					}
					else if (causeRow instanceof ShipAct_DtlR) {
						pegNo = ((ShipAct_DtlR)causeRow).hdr_peg_no();
					}
					if (!isNull(pegNo)) {
						msg.setCauseRow(lst.getFirst(idx, pegNo), msg.getCauseColumn());
					}
				}
				String key = (isNull(pegNo) ? "-" : pegNo.toString()) + " : " + msg.getID() + " : " + msg.toString();
				o.put(key, msg);	// ヘッダ単位にメッセージの重複を排除
			}
			msgL.addAll(o.values());
			
			MCMessagePool.clear();
			MCMessagePool.addAll(poolL);
			
			return msgL;
		}

		/**
		 * 出荷実績サービスの上り電文を作成する
		 */
		protected void setShipActMessage(MSBEL_ShipActService.ShipAct_Chk01 ope, MCList<Chk01_RsltR> lst) {
			for (Chk01_RsltR r : lst) {
				MCList<MST_SHIP_INST_D_R> sidL = getShipInstDL(r.ship_inst_no());
				sidL.setNumberNE("hdr_peg_no", r.peg_no());
				copy(ope.up0().add(), r, createMap_ShipAct_HdrR_Chk01_RsltR());
				sidL.setAttributes(r);
				addAll(ope.up1(), sidL, createMap_ShipAct_DtlR_MST_SHIP_INST_D_R());
			}
			setPegNo(ope.up1());
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	protected Map_Chk01_DtlR_ShipAct_DtlR<Chk01_DtlR, ShipAct_DtlR> createMap_Chk01_DtlR_ShipAct_DtlR() {
		return new Map_Chk01_DtlR_ShipAct_DtlR<Chk01_DtlR, ShipAct_DtlR>();
	}

	public class Map_Chk01_DtlR_ShipAct_DtlR<D extends Chk01_DtlR, S extends ShipAct_DtlR> extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_DtlR.$org_peg_no, ShipAct_DtlR.$peg_no);
			addColumnPathMap(Chk01_DtlR.$ship_alloc_sts_no, ShipAct_DtlR.$ship_alloc_sts_no);
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 出荷実績を登録する。<br>
	 */
	public class Ins01 extends MSBEL_ShipActListReg_MC_A.Ins01 {

		protected Map<MCList<Chk01_RsltR>, MCList<MST_SHIP_INST_D_R>> _mapShipInst = null;
		
		protected MCList<Chk01_DtlR> _chkDtlL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			try {
				// オペレーション実行
				callShipAct_Upd01(notErrL);
				handleSuccess(notErrL);
			}
			catch (Exception e) {
				handleEx(e, notErrL);
			}
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		private void editUp() {
			up0().addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.CRT.value());
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_ShipActListReg.Chk01 ope = MSBEL_ShipActListReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			copy(ope.up2(), up2(), createMap_Chk01_CndR_Ins01_CndR());
			ope.exec();
			up0().setAll(ope.down0());
			_chkDtlL = createChk01_DtlL();
			_chkDtlL.setAll(ope.down1());
		}

		/**
		 * 出荷実績サービスの更新処理を実行する
		 */
		protected void callShipAct_Upd01(MCList<Chk01_RsltR> lst) {
			MSBEL_ShipActService.ShipAct_Upd01 ope = MSBEL_ShipActService.crtShipAct_Upd01();
			setShipActMessage(ope, lst);
			ope.exec();
			
			copyByPegNo(lst, ope.down0(),
					Chk01_RsltR.$peg_no, new String[] {Chk01_RsltR.$ship_act_no},
					ShipAct_HdrR.$peg_no, new String[] {ShipAct_HdrR.$ship_act_no});
		}

		/**
		 * 出荷実績サービスの上り電文を作成する
		 */
		protected void setShipActMessage(MSBEL_ShipActService.ShipAct_Upd01 ope, MCList<Chk01_RsltR> lst) {

			for (Chk01_RsltR r : lst) {
				MCList<MST_SHIP_INST_D_R> sidL = getShipInstDL(r.ship_inst_no());
				sidL.setNumberNE("hdr_peg_no", r.peg_no());
				sidL.setAttributes(r);	// 一覧の行番号を紐付ける

				// 負担部門の組織変更対応
				sidL.addDateColumn("ac_dt", r.ac_dt());
				setDpt(sidL, MST_SHIP_INST_D_R.$bd_dpt_cd, null, "ac_dt", false);

				copy(ope.up0().add(), r , createMap_ShipAct_HdrR_Chk01_RsltR());
				addAll(ope.up1(), sidL, createMap_ShipAct_DtlR_MST_SHIP_INST_D_R());
			}
			setPegNo(ope.up1());
			
			// サービス側でＶＭＩ行を抽出できるように元の紐付けＮＯを割り当てる
			setOrgPegNo(ope.up1());
			
			ope.up2().bndl_prnt_flg(!up2().indiv_prnt_flg());	// 個別発行でない＝まとめ発行
		}
		
		protected void setOrgPegNo (MCList <ShipAct_DtlR> shipActDtlL) {
			if (isNull(_chkDtlL)) {
				return;
			}
			MCIndexKey idx = _chkDtlL.createIndex("ship_alloc_sts_no");
			for (ShipAct_DtlR shipActDtlR : shipActDtlL) {
				Chk01_DtlR chkDtlR = _chkDtlL.getFirst(idx, shipActDtlR.ship_alloc_sts_no());
				if (!isNull(chkDtlR)) {
					shipActDtlR.org_peg_no(chkDtlR.org_peg_no());
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
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
			
			MCIndexKey idx = up1().createIndex(Srch01_CntrR.$ship_inst_no);
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), up1(), getSplitRowCount());

			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				up0L.setAll(l);
				MCList<Srch01_CntrR> up1L = ((MCList<Srch01_CntrR>)ope.up(1));
				for (Chk01_RsltR r : l.groupBy(Chk01_RsltR.$ship_inst_no)) {
					up1L.addAll(up1().subList(idx, r.ship_inst_no()));
				}
				MCRow.copyvalue((Ins01_CndR)ope.up(2), up2());
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 出荷進捗ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param up0L クライアントから渡された上り電文
		 * @param up1L クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_RsltR>> splitUp(
			MCList<Chk01_RsltR> up0L, MCList<Srch01_CntrR> up1L, int max) {

			List<MCList<Chk01_RsltR>> arr = new ArrayList<>();
			MCIndexKey
				up0Idx = up0L.createIndex(Srch01_CntrR.$ship_inst_no),
				up1PrIdx = up1L.createIndex(Srch01_CntrR.$ship_pr_no),
				up1InstIdx = up1L.createIndex(Srch01_CntrR.$ship_inst_no);

			Map<Chk01_RsltR, Chk01_RsltR> o = new HashMap<>();
			for (Chk01_RsltR up0R : up0L) {
				if (o.containsKey(up0R)) {	// 追加済みは除く
					continue;
				}

				MCList<Chk01_RsltR> grpL = MCList.create(Chk01_RsltR.class);
				grpL.add(up0R);
				o.put(up0R, null);	// 追加済み

				for (Srch01_CntrR cntrR : up1L.subList(up1InstIdx, up0R.ship_inst_no())) {
		
					// 出荷進捗NOが同一のモノも同じグループに含める(スレッドを分けない)
					for (Srch01_CntrR r : up1L.subList(up1PrIdx, cntrR.ship_pr_no())) {

						Chk01_RsltR rr = up0L.getFirst(up0Idx, r.ship_inst_no());
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
			initShipInstD1Cache(up0L);
			List<MCList<Chk01_RsltR>> arrTmp = new ArrayList<>();
			if (arr.size() > 1) {
				//売上集計キーが同一のモノも同じグループに含める(スレッドを分けない)
				//売上集計キー：計上年月、売上部門ＣＤ、売上担当者ＣＤ、得意先ＣＤ、品目ＣＤ、枝番１、枝番２、枝番３、通貨ＣＤ、案件ＮＯ
				arrTmp = reGrp(arr, 0);
			}
			else {
				arrTmp = arr;
			}
			List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
			MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
			for (MCList<Chk01_RsltR> grp : arrTmp) {
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

		protected void handleSuccess(MCList<Chk01_RsltR> lst) {
			dbTran().commit();
			lst.forEach(r -> {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			});
		}
		
		protected void handleEx(Exception e, MCList<Chk01_RsltR> lst) {
			dbTran().rollback();
			lst.forEach(r -> {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			});

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
		}
		protected List<MCList<Chk01_RsltR>> reGrp(List<MCList<Chk01_RsltR>> arr, int i) {
			List<MCList<Chk01_RsltR>> arrTmp = new ArrayList<>();
			List<MCList<Chk01_RsltR>> arrTmp1 = new ArrayList<>();
			List<MCList<Chk01_RsltR>> arrTmp2 = new ArrayList<>();
			Map<ArrayList<String>, MST_SHIP_INST_D_R> cstH;
			Map<ArrayList<String>, MST_SHIP_INST_D_R> cstHF = new HashMap<ArrayList<String>, MST_SHIP_INST_D_R>();

			if (_mapShipInst == null) {
				_mapShipInst = new HashMap<MCList<Chk01_RsltR>, MCList<MST_SHIP_INST_D_R>>();
			}

			int n = 0;
			//売上集計キーを含む
			boolean iFlg = false;
			//再比較対象
			boolean cntFlg = false;

			for (MCList<Chk01_RsltR> grp : arr) {
				if (n < i) {
					n = n + 1;
					arrTmp.add(grp);
					continue;
				}

				cstH = new HashMap<ArrayList<String>, MST_SHIP_INST_D_R>();
				iFlg = false;
				MCList<MST_SHIP_INST_D_R> spL = null;
				
				if (_mapShipInst.containsKey(grp)) {
					spL = _mapShipInst.get(grp);
				}
				else {
					spL = getSpData(grp);
					spL.addStringColumn("sls_dpt_cd");
					// 売上部門の組織変更対応
					setDpt(spL, "sls_dpt_cd", null, "ac_dt", false);
					_mapShipInst.put(grp, spL);
				}
				
				for (MST_SHIP_INST_D_R r : spL) {
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

		protected MCList<MST_SHIP_INST_D_R> getSpData(MCList<Chk01_RsltR> up0L) {
			MCList<MST_SHIP_INST_D_R> spL = MCList.create(MST_SHIP_INST_D_R.class);
			MCList<MST_SHIP_INST_D_R> spAllL = MCList.create(MST_SHIP_INST_D_R.class);
			spAllL.addDateColumn("ac_dt");
			for (Chk01_RsltR r : up0L) {
				spL = getShipInstD1L(r.ship_inst_no());
				spL.addDateColumn("ac_dt", r.ac_dt());
				spAllL.addAll(spL);
			}
			return spAllL;
		}

		/**
		 * 売上集計用カラムを設定
		 * 
		 * @return
		 */
		protected ArrayList<String> getKeyCols(MST_SHIP_INST_D_R r) {
			ArrayList<String> key = new ArrayList<String>();
			key.add(getAcYm(r.getDate("ac_dt")).toString());
			key.add(r.getString("sls_dpt_cd"));
			key.add(r.getString("sls_usr_cd"));
			key.add(r.getString("cst_cd"));
			key.add(r.itm_cd());
			key.add(r.itm_sub1());
			key.add(r.itm_sub2());
			key.add(r.itm_sub3());
			key.add(r.getString("trd_cur_cd"));
			key.add(r.getString("wrk_no"));
			
			return key;
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 出荷実績取消前のチェックを行う。<br>
	 */
	public class Chk02 extends MSBEL_ShipActListReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			doCache();

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

			msgL.addAll(chkShipPr());
			msgL.addAll(chkShipAct());

			return msgL;
		}

		/**
		 * 出荷進捗のロック、更新カウンタチェック
		 * @return
		 */
		protected MCMessageList chkShipPr() {
			MCMessageList msgL = chkShipPrCmn(up1(), Srch01_CntrR.$ship_act_no);
			
			MCIndexKey idx = up0().createIndex(Chk02_RsltR.$ship_act_no);
			for (MCMessage msg : msgL) {
				// CauseRowを差し替える
				Srch01_CntrR cntrR = (Srch01_CntrR)msg.getCauseRow();
				Chk02_RsltR r = up0().getFirst(idx, cntrR.ship_act_no());
				msg.setCauseRow(r, msg.getCauseColumn());
				r.err_flg(true);
			}
			
			return msgL;
		}

		/**
		 * 出荷実績のロック、更新カウンタチェック
		 */
		protected MCMessageList chkShipAct() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_SHIP_ACT_R> selectL = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.ship_act_no, t.ship_fr_lg_grp_cd, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.ship_act_no);

			MCList<Chk02_RsltR> bindL = notErrL.groupBy(Chk02_RsltR.$ship_act_no);
			bindL.sort(Chk02_RsltR.$ship_act_no);
			dbSelectKeyForUpdateNoWait("MSBEL1450_MST_SHIP_ACT_S02",
					selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_SHIP_ACT_R.$ship_act_no);
			for (Chk02_RsltR r : notErrL) {
				MST_SHIP_ACT_R selectR = selectL.getFirst(idxkey, r.ship_act_no());
				if (!isNull(r.ship_act_no())) {
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					r.ship_fr_lg_grp_cd(selectR.ship_fr_lg_grp_cd());	// DACで使用する
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			
			for (Chk02_RsltR r : notErrL) {

				// DACチェック
				msgL.addAll(checkWritableLgGrpCdDac(r, Chk02_RsltR.$ship_fr_lg_grp_cd));
			}
			return msgL;
		}

		/**
		 * データキャッシュ
		 */
		protected void doCache() {
			initShipActCache(up0());
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());

			// 出荷実績サービスのチェック処理
			msgL.addAll(callShipAct_Chk01(notErrL));
			return(msgL);
		}

		/**
		 * 出荷実績サービスのチェック処理を実行する
		 */
		protected MCMessageList callShipAct_Chk01(MCList<Chk02_RsltR> lst) {
			MCMessageList
				poolL = new MCMessageList(), msgL = new MCMessageList();
			poolL.addAll(MCMessagePool.getMessageList());	// メッセージ退避
			MCMessagePool.clear();

			MSBEL_ShipActService.ShipAct_Chk01 ope = MSBEL_ShipActService.crtShipAct_Chk01();
			setAll(ope.up0(), lst, createMap_ShipAct_HdrR_Chk02_RsltR());
			ope.exec();

			copyErrFlg(lst, ope.down0());

			// ロウの差し替え＆重複を排除
			HashMap<String, MCMessage> o = new HashMap<>();
			MCIndexKey idx = lst.createIndex(Chk02_RsltR.$peg_no);
			for (MCMessage msg : MCMessagePool.getMessageList()) {
				MCRow causeRow = msg.getCauseRow();
				MCNumber pegNo = null;
				if (!isNull(causeRow)) {
					if (causeRow instanceof ShipAct_HdrR) {
						pegNo = ((ShipAct_HdrR)causeRow).peg_no();
					}
					else if (causeRow instanceof ShipAct_DtlR) {
						pegNo = ((ShipAct_DtlR)causeRow).hdr_peg_no();
					}
					if (!isNull(pegNo)) {
						msg.setCauseRow(lst.getFirst(idx, pegNo), msg.getCauseColumn());
					}
				}
				String key = (isNull(pegNo) ? "-" : pegNo.toString()) + " : " + msg.getID() + " : " + msg.toString();
				o.put(key, msg);	// ヘッダ単位にメッセージの重複を排除
			}
			msgL.addAll(o.values());
			
			MCMessagePool.clear();
			MCMessagePool.addAll(poolL);
			
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 出荷実績を取り消す。<br>
	 */
	public class Del01 extends MSBEL_ShipActListReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();

			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			try {
				// オペレーション実行
				callShipAct_Upd01(notErrL);
				handleSuccess(notErrL);
			}
			catch (Exception e) {
				handleEx(e, notErrL);
			}
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		private void editUp() {
			up0().addStringColumn("data_crud_typ", MAC_DATA_CRUD_TYP.DEL.value());
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBEL_ShipActListReg.Chk02 ope = MSBEL_ShipActListReg.crtChk02();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 出荷実績サービスの更新処理を実行する
		 */
		protected void callShipAct_Upd01(MCList<Chk02_RsltR> lst) {
			MSBEL_ShipActService.ShipAct_Upd01 ope = MSBEL_ShipActService.crtShipAct_Upd01();
			setAll(ope.up0(), lst , createMap_ShipAct_HdrR_Chk02_RsltR());
			ope.up2().bndl_prnt_flg(!up2().indiv_prnt_flg());	// 個別発行でない＝まとめ発行
			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected void handleSuccess(MCList<Chk02_RsltR> lst) {
			dbTran().commit();
			lst.forEach(r -> {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			});
		}
		
		protected void handleEx(Exception e, MCList<Chk02_RsltR> lst) {
			dbTran().rollback();
			lst.forEach(r -> {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			});

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
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
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

			MCIndexKey idx = up1().createIndex(Srch01_CntrR.$ship_act_no);
			List<MCList<Chk02_RsltR>> list = splitUp(up0(), up1(), getSplitRowCount());

			for (MCList<Chk02_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_RsltR> up0L = ((MCList<Chk02_RsltR>)ope.up(0));
				up0L.setAll(l);
				MCList<Srch01_CntrR> up1L = ((MCList<Srch01_CntrR>)ope.up(1));
				for (Chk02_RsltR r : l.groupBy(Chk02_RsltR.$ship_act_no)) {
					up1L.addAll(up1().subList(idx, r.ship_act_no()));
				}
				MCRow.copyvalue((Ins01_CndR)ope.up(2), up2());
				opeL.add(ope);
			}

			return opeL;
		}

		/**
		 * 出荷進捗ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param up0L クライアントから渡された上り電文
		 * @param up1L クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk02_RsltR>> splitUp(
			MCList<Chk02_RsltR> up0L, MCList<Srch01_CntrR> up1L, int max) {

			List<MCList<Chk02_RsltR>> arr = new ArrayList<>();
			MCIndexKey
				up0Idx = up0L.createIndex(Srch01_CntrR.$ship_act_no),
				up1PrIdx = up1L.createIndex(Srch01_CntrR.$ship_pr_no),
				up1ActIdx = up1L.createIndex(Srch01_CntrR.$ship_act_no);

			Map<Chk02_RsltR, Chk02_RsltR> o = new HashMap<>();
			for (Chk02_RsltR up0R : up0L) {
				if (o.containsKey(up0R)) {	// 追加済みは除く
					continue;
				}

				MCList<Chk02_RsltR> grpL = MCList.create(Chk02_RsltR.class);
				grpL.add(up0R);
				o.put(up0R, null);	// 追加済み

				for (Srch01_CntrR cntrR : up1L.subList(up1ActIdx, up0R.ship_act_no())) {
		
					// 出荷進捗NOが同一のモノも同じグループに含める(スレッドを分けない)
					for (Srch01_CntrR r : up1L.subList(up1PrIdx, cntrR.ship_pr_no())) {

						Chk02_RsltR rr = up0L.getFirst(up0Idx, r.ship_act_no());
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

			List<MCList<Chk02_RsltR>> ret = new ArrayList<>();
			MCList<Chk02_RsltR> tmp = MCList.create(Chk02_RsltR.class);
			for (MCList<Chk02_RsltR> grp : arr) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk02_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}

	// ///////////////////////////////////////////////
	// キャッシュ（ここから）
	// ///////////////////////////////////////////////
	protected static final Class<MSBEL_ShipActListReg> CLAZZ = MSBEL_ShipActListReg.class;

	/**
	 * MST_SHIP_INSTキャッシュ
	 */
	protected static void initShipInstCache(MCList<Chk01_RsltR> rsltL) {
		object(CLAZZ)._initShipInstCache(rsltL);
	}
	protected FXUCL_MCDbcCache<MST_SHIP_INST_R> _shipInstCache = null;
	protected void _initShipInstCache(MCList<?> rsltL) {
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_R.create("T"));
		_shipInstCache = new FXUCL_MCDbcCache<MST_SHIP_INST_R>(dbc_bldr, rsltL,
				MST_SHIP_INST_R.$ship_inst_no);
	}
	protected static FXUCL_MCDbcCache<MST_SHIP_INST_R> getShipInstCache() {
		return object(CLAZZ)._shipInstCache;
	}
	protected static MST_SHIP_INST_R getShipInstR(String shipInstNo) {
		return getShipInstCache().get(shipInstNo);
	}

	MCList<MST_SHIP_INST_D_R> _shipInstDL;
	MCIndexKey _shipInstDKey;
	/**
	 * 出荷指図明細のデータをキャッシュします。<br>
	 * @param bindL 「ship_inst_no」に出荷指図ＮＯを格納したリスト
	 */
	protected void initShipInstDCache(MCList<? extends MCRow> bindL, MCRow otherBind) {
		MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T1");
		MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_PR_R t3 = MST_SHIP_PR_R.create("T3");
		MST_SLO_D_R t4 = MST_SLO_D_R.create("T4");
		MST_SLO_R t5 = MST_SLO_R.create("T5");
		MST_DLV_INST_RCPT_R t6 = MST_DLV_INST_RCPT_R.create("T6");
		MAM_ITM_R m1 = MAM_ITM_R.create("M1");
		MAM_LOC_R m2 = MAM_LOC_R.create("M2");
		MAM_ITM_LG_GRP_R m4 = MAM_ITM_LG_GRP_R.create("M4");
		MAM_SCM_IF_CTL_R S1 = MAM_SCM_IF_CTL_R.create("S1");
		MAM_SCM_IF_CTL_R S2 = MAM_SCM_IF_CTL_R.create("S2");

		MCList<MST_SHIP_INST_D_R> dbc = MCList.create(MST_SHIP_INST_D_R.class);
		MST_SHIP_INST_D_R t = MST_SHIP_INST_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addStringColumn("ship_alloc_sts_no");
		dbc.addBooleanColumn("alloc_flg");
		dbc.addStringColumn("dlv_id_typ");
		dbc.addStringColumn("dlv_id_cd");
		dbc.addStringColumn("dlv_id_nm");
		dbc.addStringColumn("dlv_zip_cd");
		dbc.addStringColumn("dlv_addr1");
		dbc.addStringColumn("dlv_addr2");
		dbc.addStringColumn("dlv_addr3");
		dbc.addStringColumn("dlv_addr4");
		dbc.addStringColumn("dlv_cntct_dpt");
		dbc.addStringColumn("dlv_cntct_psn");
		dbc.addStringColumn("dlv_tel");
		dbc.addStringColumn("dlv_fax");
		dbc.addBooleanColumn("pri_prnt_flg");
		dbc.addBooleanColumn("dlv_sundry_flg");
		dbc.addStringColumn("ship_inst_typ");
		dbc.addStringColumn("stk_mng_typ");
		dbc.addStringColumn("sno1_mng_typ");
		dbc.addStringColumn("sno2_mng_typ");
		dbc.addStringColumn("sno3_mng_typ");
		dbc.addStringColumn("sno4_mng_typ");
		dbc.addStringColumn("cst_po_no");
		dbc.addStringColumn("cst_po_d_no");
		dbc.addStringColumn("cst_dlv_inst_no");
		dbc.addStringColumn("cst_dlv_inst_d_no");
		dbc.addStringColumn("cst_itm_cd");
		dbc.addStringColumn("cst_itm_nm");
		dbc.addStringColumn("alloc_sno1");
		dbc.addStringColumn("alloc_sno2");
		dbc.addStringColumn("alloc_sno3");
		dbc.addStringColumn("alloc_sno4");
		dbc.addStringColumn("alloc_lot_no");
		dbc.addStringColumn("alloc_sublot_no");
		dbc.addStringColumn("alloc_ver_no");
		dbc.addNumberColumn("alloc_ent_unit_qty");
		dbc.addStringColumn("alloc_ent_unit_cd");
		dbc.addNumberColumn("alloc_base_unit_qty");
		dbc.addNumberColumn("alloc_ship_act_qty");
		dbc.addStringColumn("alloc_ship_loc_cd");
		dbc.addStringColumn("alloc_ship_str_ln_cd");
		dbc.addStringColumn("io_schd_pr_no");
		dbc.addNumberColumn("wait_qty");
		dbc.addBooleanColumn("skip_chk_ship_flg");
		dbc.addNumberColumn("ent_unit_conv_base_qty");
		dbc.addNumberColumn("ent_unit_conv_qty");
		dbc.addNumberColumn("ent_unit_dec_place");
		dbc.addStringColumn("ent_unit_rnd_typ");
		dbc.addNumberColumn("base_unit_dec_place");
		dbc.addStringColumn("base_unit_rnd_typ");
		dbc.addStringColumn("rqst_dpt_cd");
		dbc.addStringColumn("iv_no");
		dbc.addStringColumn("iv_d_no");
		dbc_bldr.removeSelect(MST_SHIP_INST_D_R.$disp_seq);
		dbc_bldr.removeSelect(MST_SHIP_INST_D_R.$stk_id_typ);
		dbc_bldr.removeSelect(MST_SHIP_INST_D_R.$stk_bp_cd);
		dbc_bldr.addSelect(t1.stk_id_typ,t1.stk_bp_cd);
		dbc_bldr.addSelect(t1.ship_alloc_sts_no,
				t1.disp_seq,
				t1.alloc_flg,
				t1.sno1.as("alloc_sno1"),
				t1.sno2.as("alloc_sno2"),
				t1.sno3.as("alloc_sno3"),
				t1.sno4.as("alloc_sno4"),
				t1.lot_no.as("alloc_lot_no"),
				t1.sublot_no.as("alloc_sublot_no"),
				t1.ver_no.as("alloc_ver_no"),
				t1.ent_unit_qty.as("alloc_ent_unit_qty"),
				t1.ent_unit_cd.as("alloc_ent_unit_cd"),
				t1.base_unit_qty.as("alloc_base_unit_qty"),
				t1.ship_act_qty.as("alloc_ship_act_qty"),
				t1.ship_loc_cd.as("alloc_ship_loc_cd"),
				t1.ship_str_ln_cd.as("alloc_ship_str_ln_cd"),
				t1.io_schd_pr_no, t2.wait_qty,
				t3.dlv_id_typ, nvl( t2.dlv_cd, t3.dlv_id_cd).as("dlv_id_cd"),
				nvl2( t2.dlv_cd, t2.dlv_nm, t3.dlv_id_nm).as("dlv_id_nm"),
				nvl2( t2.dlv_cd, t2.dlv_zip_cd, t3.dlv_zip_cd).as("dlv_zip_cd"),
				nvl2( t2.dlv_cd, t2.dlv_addr1, t3.dlv_addr1).as("dlv_addr1"),
				nvl2( t2.dlv_cd, t2.dlv_addr2, t3.dlv_addr2).as("dlv_addr2"),
				nvl2( t2.dlv_cd, t2.dlv_addr3, t3.dlv_addr3).as("dlv_addr3"),
				nvl2( t2.dlv_cd, t2.dlv_addr4, t3.dlv_addr4).as("dlv_addr4"),
				nvl2( t2.dlv_cd, t2.dlv_cntct_dpt, t3.dlv_cntct_dpt).as("dlv_cntct_dpt"),
				nvl2( t2.dlv_cd, t2.dlv_cntct_psn, t3.dlv_cntct_psn).as("dlv_cntct_psn"),
				nvl2( t2.dlv_cd, t2.dlv_tel, t3.dlv_tel).as("dlv_tel"),
				nvl2( t2.dlv_cd, t2.dlv_fax, t3.dlv_fax).as("dlv_fax"),
				nvl2( t2.dlv_cd, t2.dlv_sundry_flg, t3.dlv_sundry_flg).as("dlv_sundry_flg"),
				t3.ship_inst_typ, t3.rqst_dpt_cd, t5.cst_po_no, t4.cst_po_d_no,
				t6.cst_dlv_inst_no, t6.cst_dlv_inst_d_no, t4.cst_itm_cd, t4.cst_itm_nm,
				nvl2( t2.dlv_cd, t2.pri_prnt_flg, t4.pri_prnt_flg).as("pri_prnt_flg"),
				m1.stk_mng_typ, m1.lot_mng_typ, m1.sno1_mng_typ, m1.sno2_mng_typ,
				m1.sno3_mng_typ, m1.sno4_mng_typ, nvl( m4.lg_def_loc_cd, m2.loc_cd).as("loc_cd"),
				m1.skip_chk_ship_flg, m1.dec_place.as("base_unit_dec_place"),
				m1.rnd_typ.as("base_unit_rnd_typ"));
		dbc_bldr.addInnerJoin(t1, bracket( t1.ship_inst_d_no.eq(t.ship_inst_d_no)));
		dbc_bldr.addInnerJoin(t2, bracket( t2.ship_inst_d_no.eq(t.ship_inst_d_no)));
		dbc_bldr.addInnerJoin(t3, bracket( t3.ship_pr_no.eq(t2.ship_pr_no)));
		dbc_bldr.addLeftOuterJoin(t4, bracket( t4.slo_d_no.eq(t3.slo_d_no)));
		dbc_bldr.addLeftOuterJoin(t5, bracket( t5.slo_no.eq(t4.slo_no)));
		dbc_bldr.addLeftOuterJoin(t6, bracket( t6.dlv_inst_rcpt_no.eq(t2.dlv_inst_rcpt_no)));
		dbc_bldr.addLeftOuterJoin(m1, bracket( m1.itm_cd.eq(t.itm_cd)
				.and(m1.itm_sub1.eq(t.itm_sub1))
				.and(m1.itm_sub2.eq(t.itm_sub2))
				.and(m1.itm_sub3.eq(t.itm_sub3))));
		dbc_bldr.addLeftOuterJoin(m2, bracket( m2.lg_grp_cd.eq(t.ship_lg_grp_cd)
				.and(m2.lg_def_flg.eq(value(true)))));
		dbc_bldr.addLeftOuterJoin(m4, bracket( m4.itm_cd.eq(t.itm_cd)
				.and(m4.itm_sub1.eq(t.itm_sub1))
				.and(m4.itm_sub2.eq(t.itm_sub2))
				.and(m4.itm_sub3.eq(t.itm_sub3))
				.and(m4.lg_grp_cd.eq(t.ship_lg_grp_cd))));
		dbc_bldr.setWhere(t.ship_inst_no.eq(bind("ship_inst_no")));
		otherBind.addDateColumn("TODAY", getToday());

		dbc_bldr.addConstWhereWithAnd(t1.base_unit_qty.subtract(t1.ship_act_qty).gt(value(0))
				.and(t2.abort_flg.eq(value(false)))
				.and( bracket( bind("wms_flg").eq(value(true))
						.and(bind("not_wms_flg").eq(value(true))) )
						.or( bind("not_wms_flg").eq(value(false))
								.and( exists( subQuery()
										.select(value("X")) .from(S1)
										.where( S1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value()))
												.and( S1.loc_cd.eq(t1.ship_loc_cd)
														.or(S1.lg_grp_cd.eq(t2.ship_fr_lg_grp_cd)
																.or(t3.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NO_PICK.value())))) )
												.and(bind("today").between(S1.st_dt, S1.end_dt)) ) ) ) )
						.or( bind("wms_flg").eq(value(false))
								.and( notExists( subQuery() .select(value("X"))
										.from(S2) .where( S2.if_proc_typ.eq(value(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value()))
												.and( S2.loc_cd.eq(t1.ship_loc_cd)
														.or(S2.lg_grp_cd.eq(t2.ship_fr_lg_grp_cd)) )
				.and(bind("today").between(S2.st_dt, S2.end_dt)) ) ) ) )));
		dbSelect("MSBEL1450_MST_SHIP_INST_D_S01", dbc, dbc_bldr, bindL, otherBind);
		
		MCJoinerList<MST_SHIP_INST_D_R> joinList = new MCJoinerList<>();
		joinList
		.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
				r.itm_cd(), r.itm_sub1(), r.itm_sub2(),r.itm_sub3(), r.getStringNE("alloc_ent_unit_cd")
		))
		.addSelect(m -> toArray(
				m.conv_base_qty, m.conv_qty, m.dec_place, m.rnd_typ
		))
		.addMap((r, m) -> {
			r.setNumberNE("ent_unit_conv_base_qty", m.conv_base_qty());
			r.setNumberNE("ent_unit_conv_qty", m.conv_qty());
			r.setNumberNE("ent_unit_dec_place", m.dec_place());
			r.setString("ent_unit_rnd_typ", m.rnd_typ());
		});
		joinList.join(dbc);
		MCList<MST_SHIP_INST_D_R> instDL = MCList.create(MST_SHIP_INST_D_R.class);
		for(MCList<MST_SHIP_INST_D_R> lst : dbc.groupList("ship_alloc_sts_no")) {
			MST_SHIP_INST_D_R r = lst.get(0);
			
			if (nvl(r.getNumber("alloc_ship_act_qty"), MCNumber.ZERO).isPositive()) {
				r.setNumber("alloc_base_unit_qty",
					r.getNumber("alloc_base_unit_qty").subtract(r.getNumber("alloc_ship_act_qty")));
				MCNumber entUnitQty
					= rvrsBaseUnitConv(
						r.getNumber("alloc_base_unit_qty"),
						r.getNumber("ent_unit_conv_base_qty"), r.getNumber("ent_unit_conv_qty"),
						r.getNumber("ent_unit_dec_place"), r.getString("ent_unit_rnd_typ"));

				MCNumber baseUnitQty 
					= convToBaseUnit(
						entUnitQty,
						r.getNumber("ent_unit_conv_base_qty"), r.getNumber("ent_unit_conv_qty"),
						r.getNumber("base_unit_dec_place"), r.getString("base_unit_rnd_typ"));
				if(isSame(baseUnitQty, r.getNumber("alloc_base_unit_qty"))) {
					r.setNumber("alloc_ent_unit_qty", entUnitQty);
				}
				else {
					r.setNumber("alloc_ent_unit_qty", r.getNumber("alloc_base_unit_qty"));
					r.setString("alloc_ent_unit_cd", r.base_unit_cd());
				}
			}
			if (MAC_LOT_MNG_TYP.isNOT_MNG(r.getString("lot_mng_typ"))) {
				if(isNull(r.getString("alloc_lot_no"))) {
					r.setString("alloc_lot_no", MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.getString("alloc_sublot_no"))) {
					r.setString("alloc_sublot_no", MAC_STR.NULL_VAL.value());
				}
			}
			if(isNull(r.ship_str_ln_cd())) {
				r.ship_str_ln_cd(MAC_STR.NULL_VAL.value());
			}
			if (MSC_DLV_ID_TYP.isLOC(r.getString("dlv_id_typ"))) {
				r.dlv_str_ln_cd(nvl(r.dlv_str_ln_cd(), MAC_STR.NULL_VAL.value()));
			}
			else {
				r.dlv_str_ln_cd(null);
			}
			if(isNull(r.getString("alloc_ship_str_ln_cd"))) {
				r.setString("alloc_ship_str_ln_cd", MAC_STR.NULL_VAL.value());
			}
			if (MAC_SHIP_INST_TYP.isNO_PICK(r.getString("ship_inst_typ"))
			 	|| MAC_STK_MNG_TYP.isNOT_MNG(r.getString("stk_mng_typ")) && isNull(r.getString("alloc_ship_loc_cd"))) {
				// ピッキングなし、または非在庫品の場所なしの場合、場所の標準物流場所で補完する
				r.setString("alloc_ship_loc_cd", r.getString("loc_cd"));
				r.setString("alloc_ship_str_ln_cd", MAC_STR.NULL_VAL.value());
			}
			instDL.add(r);
		}
		getIvShipInstMapL(instDL);
		getIvShipActMapL();
		editForIv(instDL);
		
		object(CLAZZ)._shipInstDL = instDL;
		object(CLAZZ)._shipInstDKey = object(CLAZZ)._shipInstDL.createIndex("ship_inst_no");
	}
	protected MCList<MST_SHIP_INST_D_R> getShipInstDL(String shipInstNo) {
		return object(CLAZZ)._shipInstDL.subList(object(CLAZZ)._shipInstDKey, shipInstNo);
	}
	MCList<MST_SHIP_INST_D_R> _shipInstD1L;
	MCIndexKey _shipInstD1Key;
	/**
	 * 出荷進捗のデータをキャッシュします。<br>
	 * @param bindL 「ship_inst_no」に出荷指図ＮＯを格納したリスト
	 */
	protected void initShipInstD1Cache(MCList<? extends MCRow> bindL) {
		MST_SHIP_ALLOC_STS_R t1 = MST_SHIP_ALLOC_STS_R.create("T1");
		MST_SHIP_SCHD_R t2 = MST_SHIP_SCHD_R.create("T2");
		MST_SHIP_PR_R t3 = MST_SHIP_PR_R.create("T3");
		MST_SLO_D_R t4 = MST_SLO_D_R.create("T4");
		MST_SLO_R t5 = MST_SLO_R.create("T5");
		MST_SHIP_INST_R shipInst = MST_SHIP_INST_R.create("SHIPINST");
		MST_WRK_SNO_R m1 = MST_WRK_SNO_R.create("M1");
		
		MCList<MST_SHIP_INST_D_R> dbc = MCList.create(MST_SHIP_INST_D_R.class);
		MST_SHIP_INST_D_R t = MST_SHIP_INST_D_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		dbc.addStringColumn("cst_cd");
		dbc.addStringColumn("sls_dpt_cd");
		dbc.addStringColumn("sls_usr_cd");
		dbc.addStringColumn("trd_cur_cd");
		dbc.addStringColumn("wrk_no");
		dbc_bldr.addSelect(t3.cst_cd, t5.sls_dpt_cd, t5.sls_usr_cd, t5.trd_cur_cd, m1.wrk_no);
		dbc_bldr.addInnerJoin(shipInst, bracket(t.ship_inst_no.eq(shipInst.ship_inst_no)));
		dbc_bldr.addInnerJoin(t1, bracket(t1.ship_inst_d_no.eq(t.ship_inst_d_no)));
		dbc_bldr.addInnerJoin(t2, bracket(t2.ship_inst_d_no.eq(t.ship_inst_d_no)));
		dbc_bldr.addInnerJoin(t3, bracket(t3.ship_pr_no.eq(t2.ship_pr_no)));
		dbc_bldr.addLeftOuterJoin(t4, bracket(t4.slo_d_no.eq(t3.slo_d_no)));
		dbc_bldr.addLeftOuterJoin(t5, bracket(t5.slo_no.eq(t4.slo_no)));
		dbc_bldr.addLeftOuterJoin(m1, bracket(t.sno1.eq(m1.sno1)));
		dbc_bldr.setWhere(t.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.SLS.value())));
		dbc_bldr.addWhereWithAnd(shipInst.via_dlv_typ.neq(value(MAC_VIA_DLV_TYP.VIA.value())));
		dbc_bldr.addWhereWithAnd(t5.sls_basis_typ.eq(value( MAC_SLS_BASIS_TYP.SHIP_BASIS.value())));
		dbc_bldr.addWhereWithAnd(not(t.stk_id_typ.eq(value(MSC_STK_ID_TYP.CSTSTK.value())).and((t3.sls_qty.gt(value(0))))));
		dbc_bldr.addWhereWithAnd(t.ship_inst_no.eq(bind("ship_inst_no")));
		dbSelect("MSBEL1450_MST_SHIP_INST_D_S02", dbc, dbc_bldr, bindL);
		
		object(CLAZZ)._shipInstD1L = dbc;
		object(CLAZZ)._shipInstD1Key = object(CLAZZ)._shipInstD1L.createIndex("ship_inst_no");
	}
	protected MCList<MST_SHIP_INST_D_R> getShipInstD1L(String shipInstNo) {
		return object(CLAZZ)._shipInstD1L.subList(object(CLAZZ)._shipInstD1Key, shipInstNo);
	}
	/**
	 * インボイス出荷実績マップリスト
	 */
	protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
	
	/**
	 * インボイス出荷実績マップリストのインデックス
	 */
	protected MCIndexKey _ivShipActMapIdxkey = null;
	
	/**
	 * インボイス出荷指図マップリスト
	 */
	protected MCList<MST_IV_SHIP_INST_MAP_R> _ivShipInstMapL = null;
	
	/**
	 * インボイス出荷指図マップリストのインデックス
	 */
	protected MCIndexKey _ivShipInstMapIdxkey = null;
	
	/**
	 * インボイス出荷指図マップを取得する。
	 * @param shipInstDL 出荷指図明細リスト
	 */
	protected void getIvShipInstMapL(MCList<MST_SHIP_INST_D_R> shipInstDL) {
		
		_ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
		_ivShipInstMapL.addStringColumn(MST_IV_R.$iv_no);
		
		MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
		MST_IV_R iv = MST_IV_R.create("IV");
		MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
		ivShipInstMap_bldr.addSelect(iv.iv_no);
		ivShipInstMap_bldr.addInnerJoin(ivD, ivShipInstMap.iv_d_no.eq(ivD.iv_d_no));
		ivShipInstMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
		ivShipInstMap_bldr.setWhere(ivShipInstMap.ship_inst_d_no.eq(bind(MST_IV_SHIP_INST_MAP_R.$ship_inst_d_no)));
		ivShipInstMap_bldr.addWhereWithAnd(iv.iv_ship_flg.eq(value(false)));
		ivShipInstMap_bldr.addWhereWithAnd(iv.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())));
		
		dbSelect("MSBEL1450_MST_IV_SHIP_INST_MAP_S01", _ivShipInstMapL, ivShipInstMap_bldr, shipInstDL);
		
		_ivShipInstMapIdxkey = _ivShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_inst_d_no, MST_IV_SHIP_ACT_MAP_R.$ship_alloc_sts_no);
	}
	
	/**
	 * インボイス出荷実績マップを取得する。
	 */
	protected void getIvShipActMapL() {
		
		_ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
		_ivShipActMapL.addStringColumn(MST_IV_R.$iv_no);
		
		MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
		MST_IV_R iv = MST_IV_R.create("IV");
		MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
		ivShipActMap_bldr.addSelect(iv.iv_no);
		ivShipActMap_bldr.addInnerJoin(ivD, ivShipActMap.iv_d_no.eq(ivD.iv_d_no));
		ivShipActMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
		ivShipActMap_bldr.setWhere(ivShipActMap.iv_d_no.eq(bind(MST_IV_SHIP_INST_MAP_R.$iv_d_no)));
		
		dbSelect("MSBEL1450_MST_IV_SHIP_ACT_MAP_S01", _ivShipActMapL, ivShipActMap_bldr, _ivShipInstMapL);
		
		_ivShipActMapIdxkey = _ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$iv_d_no, MST_IV_SHIP_ACT_MAP_R.$ship_alloc_sts_no);
	}
	
	/**
	 * インボイス取引（配送先経由しない＆インボイス単位出荷ではない）の場合、インボイス出荷指図マップの情報を反映する。
	 * @param shipInstDL 出荷指図明細リスト
	 */
	protected void editForIv(MCList<MST_SHIP_INST_D_R> shipInstDL) {
		
		if (_ivShipInstMapL.isEmpty()) {
			return;
		}
		
		MCList<MST_SHIP_INST_D_R> ivShipInstDL = MCList.create(MST_SHIP_INST_D_R.class);
		
		shipInstDL.sort(MST_SHIP_INST_D_R.$ship_inst_no, MST_SHIP_INST_D_R.$disp_seq);
		int dispSeq = 1;
		String befShipInstNo = null;
		
		for (MST_SHIP_INST_D_R shipInstDR : shipInstDL) {
			
			if (!isSame(befShipInstNo, shipInstDR.ship_inst_no())) {
				dispSeq = 1;
			}
			
			befShipInstNo = shipInstDR.ship_inst_no();
			
			MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = _ivShipInstMapL.subList(_ivShipInstMapIdxkey, shipInstDR.ship_inst_d_no(), shipInstDR.getStringNE("ship_alloc_sts_no"));
			
			if (ivShipInstMapL.isEmpty()) {
				
				MST_SHIP_INST_D_R dtlR = shipInstDR.clone();
				dtlR.disp_seq(dispSeq);
				ivShipInstDL.add(dtlR);
				
				dispSeq++;
			}
			else {
				
				MCNumber unIvQty = shipInstDR.getNumber("alloc_base_unit_qty");
				
				for (MST_IV_SHIP_INST_MAP_R ivShipInstMapR: ivShipInstMapL) {

					MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = _ivShipActMapL.subList(_ivShipActMapIdxkey, ivShipInstMapR.iv_d_no(), ivShipInstMapR.ship_alloc_sts_no());
					MCNumber shipQty = MCNumber.ZERO;
					if (!ivShipActMapL.isEmpty()) {
						shipQty = ivShipActMapL.sum(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty);
					}
					
					MCNumber unShipQty =  ivShipInstMapR.base_unit_qty().subtract(shipQty);
					
					if (!unShipQty.isPositive()) {
						continue;
					}
					
					MST_SHIP_INST_D_R dtlR = shipInstDR.clone();
					dtlR.setStringNE("iv_no", ivShipInstMapR.getStringNE(MST_IV_R.$iv_no));
					dtlR.setStringNE("iv_d_no", ivShipInstMapR.iv_d_no());
					dtlR.setNumberNE("alloc_base_unit_qty", unShipQty);
					setTrdUnitQty(dtlR);
					dtlR.disp_seq(dispSeq);
					ivShipInstDL.add(dtlR);
					
					dispSeq++;
					unIvQty = unIvQty.subtract(dtlR.getNumber("alloc_base_unit_qty"));
				}
				
				if (unIvQty.isPositive()) {
					MST_SHIP_INST_D_R dtlR = shipInstDR.clone();
					dtlR.setNumberNE("alloc_base_unit_qty", unIvQty);
					setTrdUnitQty(dtlR);
					dtlR.disp_seq(dispSeq);
					ivShipInstDL.add(dtlR);
					
					dispSeq++;
				}
			}
		}
		shipInstDL.setAll(ivShipInstDL);
	}
	
	/**
	 * 取引単位数量を設定する。
	 * @param dtlR 出荷指図明細
	 */
	protected void setTrdUnitQty(MST_SHIP_INST_D_R dtlR) {
		
		if (isSame(dtlR.getStringNE("alloc_ent_unit_cd"), dtlR.base_unit_cd())) {
			dtlR.setNumberNE("alloc_ent_unit_qty", dtlR.getNumber("alloc_base_unit_qty"));
		}
		else {
			MCNumber trdUnitQty = rvrsBaseUnitConv(
					dtlR.getNumber("alloc_base_unit_qty"), dtlR.getNumber("ent_unit_conv_base_qty"), dtlR.getNumber("ent_unit_conv_qty"),
					dtlR.getNumber("ent_unit_dec_place"), dtlR.getString("ent_unit_rnd_typ"), true);
			
			
			if (!isNull(trdUnitQty)) {
				dtlR.setNumberNE("alloc_ent_unit_qty", trdUnitQty);
			}
			else {
				dtlR.setNumberNE("alloc_ent_unit_qty", dtlR.getNumber("alloc_base_unit_qty"));
				dtlR.setString("alloc_ent_unit_cd", dtlR.base_unit_cd());
			}
		}
	}

	/**
	 * MST_SHIP_ACTキャッシュ
	 */
	protected static void initShipActCache(MCList<Chk02_RsltR> rsltL) {
		object(CLAZZ)._initShipActCache(rsltL);
	}
	protected FXUCL_MCDbcCache<MST_SHIP_ACT_R> _shipActCache = null;
	protected void _initShipActCache(MCList<?> rsltL) {
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_R.create("T"));
		_shipActCache = new FXUCL_MCDbcCache<MST_SHIP_ACT_R>(dbc_bldr, rsltL,
				MST_SHIP_ACT_R.$ship_act_no);
	}
	protected static FXUCL_MCDbcCache<MST_SHIP_ACT_R> getShipActCache() {
		return object(CLAZZ)._shipActCache;
	}
	protected static MST_SHIP_ACT_R getShipActR(String shipActNo) {
		return getShipActCache().get(shipActNo);
	}
	// ///////////////////////////////////////////////
	// キャッシュ（ここまで）
	// ///////////////////////////////////////////////


	// ///////////////////////////////////////////////
	// ロウマッパー（ここから）
	// ///////////////////////////////////////////////
		protected Map_Chk01_CndR_Ins01_CndR<Chk01_CndR,Ins01_CndR> createMap_Chk01_CndR_Ins01_CndR() {
			return new Map_Chk01_CndR_Ins01_CndR<Chk01_CndR, Ins01_CndR>();
		}

		public class Map_Chk01_CndR_Ins01_CndR<D extends Chk01_CndR, S extends Ins01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_CndR.$wms_flg, Ins01_CndR.$wms_flg);
				addColumnPathMap(Chk01_CndR.$not_wms_flg, Ins01_CndR.$not_wms_flg);

			}
		}
	protected Map_ShipAct_HdrR_Chk01_RsltR<ShipAct_HdrR,Chk01_RsltR> createMap_ShipAct_HdrR_Chk01_RsltR() {
		return new Map_ShipAct_HdrR_Chk01_RsltR<ShipAct_HdrR, Chk01_RsltR>();
	}

	public class Map_ShipAct_HdrR_Chk01_RsltR<D extends ShipAct_HdrR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipAct_HdrR.$data_crud_typ, "data_crud_typ");
			addColumnPathMap(ShipAct_HdrR.$ship_inst_no, Chk01_RsltR.$ship_inst_no);
			addColumnPathMap(ShipAct_HdrR.$ac_dt, Chk01_RsltR.$ac_dt);
			addColumnPathMap(ShipAct_HdrR.$ship_dpt_cd, Chk01_RsltR.$act_dpt_cd);
			addColumnPathMap(ShipAct_HdrR.$ship_usr_cd, Chk01_RsltR.$act_usr_cd);
			addColumnPathMap(ShipAct_HdrR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(ShipAct_HdrR.$intr_rmrks , Chk01_RsltR.$intr_rmrks);
			addColumnPathMap(ShipAct_HdrR.$sub_char1 , Chk01_RsltR.$sub_char1);
			addColumnPathMap(ShipAct_HdrR.$sub_char2 , Chk01_RsltR.$sub_char2);
			addColumnPathMap(ShipAct_HdrR.$sub_char3 , Chk01_RsltR.$sub_char3);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.dlv_slip_flg(true);
			dest.io_act_flg(true);
			dest.sls_act_flg(true);

			dest.ship_tm(src.ship_tm());
			dest.dlv_tm(src.dlv_tm());

			MST_SHIP_INST_R siR = getShipInstR(src.ship_inst_no());

			dest.ship_fr_lg_grp_cd(siR.ship_fr_lg_grp_cd());
			dest.wg_cd(siR.wg_cd());
			dest.ship_term_cd(siR.ship_term_cd());
			dest.ship_to_lg_grp_cd(siR.ship_to_lg_grp_cd());
			dest.ship_to_id_typ(siR.ship_to_id_typ());
			dest.ship_to_id_cd(siR.ship_to_id_cd());
			dest.ship_to_id_nm(siR.ship_to_id_nm());
			dest.ship_to_zip_cd(siR.ship_to_zip_cd());
			dest.ship_to_addr1(siR.ship_to_addr1());
			dest.ship_to_addr2(siR.ship_to_addr2());
			dest.ship_to_addr3(siR.ship_to_addr3());
			dest.ship_to_addr4(siR.ship_to_addr4());
			dest.ship_to_cntct_dpt(siR.ship_to_cntct_dpt());
			dest.ship_to_cntct_psn(siR.ship_to_cntct_psn());
			dest.ship_to_tel(siR.ship_to_tel());
			dest.ship_to_fax(siR.ship_to_fax());
			dest.ship_to_sundry_flg(siR.ship_to_sundry_flg());
			dest.via_dlv_typ(siR.via_dlv_typ());
			dest.iv_no(siR.iv_no());
			dest.lot_chk_off_flg(false);
			dest.dlv_slip_prnt_flg(src.dlv_prnt_flg());
			dest.ship_adv_prnt_flg(src.adv_prnt_flg());
		}
	}


	protected Map_ShipAct_HdrR_Chk02_RsltR<ShipAct_HdrR,Chk02_RsltR> createMap_ShipAct_HdrR_Chk02_RsltR() {
		return new Map_ShipAct_HdrR_Chk02_RsltR<ShipAct_HdrR, Chk02_RsltR>();
	}

	public class Map_ShipAct_HdrR_Chk02_RsltR<D extends ShipAct_HdrR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipAct_HdrR.$data_crud_typ, "data_crud_typ");
			addColumnPathMap(ShipAct_HdrR.$ship_act_no, Chk02_RsltR.$ship_act_no);
			addColumnPathMap(ShipAct_HdrR.$peg_no, Chk02_RsltR.$peg_no);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.dlv_slip_flg(true);
			dest.io_act_flg(true);
			dest.sls_act_flg(true);
			dest.dlv_slip_prnt_flg(src.dlv_prnt_flg());

			if (MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
				dest.can_ac_dt(src.can_ac_dt());
				return ;
			}
		}
	}

	protected Map_ShipAct_DtlR_MST_SHIP_INST_D_R<ShipAct_DtlR,MST_SHIP_INST_D_R> createMap_ShipAct_DtlR_MST_SHIP_INST_D_R() {
		return new Map_ShipAct_DtlR_MST_SHIP_INST_D_R<ShipAct_DtlR, MST_SHIP_INST_D_R>();
	}
	public class Map_ShipAct_DtlR_MST_SHIP_INST_D_R<D extends ShipAct_DtlR, S extends MST_SHIP_INST_D_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipAct_DtlR.$peg_no, "peg_no");
			addColumnPathMap(ShipAct_DtlR.$disp_seq, MST_SHIP_INST_D_R.$disp_seq);
			addColumnPathMap(ShipAct_DtlR.$ship_alloc_sts_no, "ship_alloc_sts_no");
			addColumnPathMap(ShipAct_DtlR.$trd_cd, MST_SHIP_INST_D_R.$trd_cd);
			addColumnPathMap(ShipAct_DtlR.$trd_ptn_typ, MST_SHIP_INST_D_R.$trd_ptn_typ);
			addColumnPathMap(ShipAct_DtlR.$ship_loc_cd, "alloc_ship_loc_cd");
			addColumnPathMap(ShipAct_DtlR.$ship_str_ln_cd, "alloc_ship_str_ln_cd");
			addColumnPathMap(ShipAct_DtlR.$dlv_id_typ, "dlv_id_typ");
			addColumnPathMap(ShipAct_DtlR.$dlv_id_cd, "dlv_id_cd");
			addColumnPathMap(ShipAct_DtlR.$dlv_id_nm, "dlv_id_nm");
			addColumnPathMap(ShipAct_DtlR.$dlv_zip_cd, "dlv_zip_cd");
			addColumnPathMap(ShipAct_DtlR.$dlv_addr1, "dlv_addr1");
			addColumnPathMap(ShipAct_DtlR.$dlv_addr2, "dlv_addr2");
			addColumnPathMap(ShipAct_DtlR.$dlv_addr3, "dlv_addr3");
			addColumnPathMap(ShipAct_DtlR.$dlv_addr4, "dlv_addr4");
			addColumnPathMap(ShipAct_DtlR.$dlv_cntct_dpt, "dlv_cntct_dpt");
			addColumnPathMap(ShipAct_DtlR.$dlv_cntct_psn, "dlv_cntct_psn");
			addColumnPathMap(ShipAct_DtlR.$dlv_tel, "dlv_tel");
			addColumnPathMap(ShipAct_DtlR.$dlv_fax, "dlv_fax");
			addColumnPathMap(ShipAct_DtlR.$pri_prnt_flg, "pri_prnt_flg");
			addColumnPathMap(ShipAct_DtlR.$dlv_sundry_flg, "dlv_sundry_flg");
			addColumnPathMap(ShipAct_DtlR.$dlv_str_ln_cd, MST_SHIP_INST_D_R.$dlv_str_ln_cd);
			addColumnPathMap(ShipAct_DtlR.$itm_cd, MST_SHIP_INST_D_R.$itm_cd);
			addColumnPathMap(ShipAct_DtlR.$itm_sub1, MST_SHIP_INST_D_R.$itm_sub1);
			addColumnPathMap(ShipAct_DtlR.$itm_sub2, MST_SHIP_INST_D_R.$itm_sub2);
			addColumnPathMap(ShipAct_DtlR.$itm_sub3, MST_SHIP_INST_D_R.$itm_sub3);
			addColumnPathMap(ShipAct_DtlR.$itm_nm, MST_SHIP_INST_D_R.$itm_nm);
			addColumnPathMap(ShipAct_DtlR.$iv_itm_nm, MST_SHIP_INST_D_R.$iv_itm_nm);
			addColumnPathMap(ShipAct_DtlR.$sundry_itm_flg, MST_SHIP_INST_D_R.$sundry_itm_flg);
			addColumnPathMap(ShipAct_DtlR.$stk_mng_typ, "stk_mng_typ");
			addColumnPathMap(ShipAct_DtlR.$sno1, "alloc_sno1");
			addColumnPathMap(ShipAct_DtlR.$sno2, "alloc_sno2");
			addColumnPathMap(ShipAct_DtlR.$sno3, "alloc_sno3");
			addColumnPathMap(ShipAct_DtlR.$sno4, "alloc_sno4");
			addColumnPathMap(ShipAct_DtlR.$sno1_mng_typ, "sno1_mng_typ");
			addColumnPathMap(ShipAct_DtlR.$sno2_mng_typ, "sno2_mng_typ");
			addColumnPathMap(ShipAct_DtlR.$sno3_mng_typ, "sno3_mng_typ");
			addColumnPathMap(ShipAct_DtlR.$sno4_mng_typ, "sno4_mng_typ");
			addColumnPathMap(ShipAct_DtlR.$lot_no, "alloc_lot_no");
			addColumnPathMap(ShipAct_DtlR.$sublot_no, "alloc_sublot_no");
			addColumnPathMap(ShipAct_DtlR.$ver_no, "alloc_ver_no");
			addColumnPathMap(ShipAct_DtlR.$stk_arrv_bp_cd, MST_SHIP_INST_D_R.$stk_arrv_bp_cd);
			addColumnPathMap(ShipAct_DtlR.$gd_cd, MST_SHIP_INST_D_R.$gd_cd);
			addColumnPathMap(ShipAct_DtlR.$quality_typ, MST_SHIP_INST_D_R.$quality_typ);
			addColumnPathMap(ShipAct_DtlR.$stk_id_typ, MST_SHIP_INST_D_R.$stk_id_typ);
			addColumnPathMap(ShipAct_DtlR.$stk_bp_cd, MST_SHIP_INST_D_R.$stk_bp_cd);
			addColumnPathMap(ShipAct_DtlR.$trd_unit_qty, "alloc_ent_unit_qty");
			addColumnPathMap(ShipAct_DtlR.$trd_unit_cd, "alloc_ent_unit_cd");
			addColumnPathMap(ShipAct_DtlR.$base_unit_qty, "alloc_base_unit_qty");
			addColumnPathMap(ShipAct_DtlR.$base_unit_cd, MST_SHIP_INST_D_R.$base_unit_cd);
			addColumnPathMap(ShipAct_DtlR.$rsn_cd, MST_SHIP_INST_D_R.$rsn_cd);
			addColumnPathMap(ShipAct_DtlR.$bd_dpt_cd, MST_SHIP_INST_D_R.$bd_dpt_cd);
			addColumnPathMap(ShipAct_DtlR.$cst_po_no, "cst_po_no");
			addColumnPathMap(ShipAct_DtlR.$cst_po_d_no, "cst_po_d_no");
			addColumnPathMap(ShipAct_DtlR.$cst_dlv_inst_no, "cst_dlv_inst_no");
			addColumnPathMap(ShipAct_DtlR.$cst_dlv_inst_d_no, "cst_dlv_inst_d_no");
			addColumnPathMap(ShipAct_DtlR.$cst_itm_cd, "cst_itm_cd");
			addColumnPathMap(ShipAct_DtlR.$cst_itm_nm, "cst_itm_nm");
			addColumnPathMap(ShipAct_DtlR.$base_dlv_slip_no, MST_SHIP_INST_D_R.$base_dlv_slip_no);
			addColumnPathMap(ShipAct_DtlR.$base_prov_act_no, MST_SHIP_INST_D_R.$base_prov_act_no);
			addColumnPathMap(ShipAct_DtlR.$base_ac_dt, MST_SHIP_INST_D_R.$base_ac_dt);
			addColumnPathMap(ShipAct_DtlR.$trd_rmrks, MST_SHIP_INST_D_R.$trd_rmrks);
			addColumnPathMap(ShipAct_DtlR.$trd_d_rmrks, MST_SHIP_INST_D_R.$trd_d_rmrks);
			addColumnPathMap(ShipAct_DtlR.$ship_inst_d_no, MST_SHIP_INST_D_R.$ship_inst_d_no);
			addColumnPathMap(ShipAct_DtlR.$skip_chk_ship_flg, "skip_chk_ship_flg");
			addColumnPathMap(ShipAct_DtlR.$io_schd_pr_no, "io_schd_pr_no");
			addColumnPathMap(ShipAct_DtlR.$iv_no, "iv_no");
			addColumnPathMap(ShipAct_DtlR.$iv_d_no, "iv_d_no");
			addColumnPathMap(ShipAct_DtlR.$intr_d_rmrks, MST_SHIP_INST_D_R.$intr_d_rmrks);
			addColumnPathMap(ShipAct_DtlR.$sub_char1, MST_SHIP_INST_D_R.$sub_char1);
			addColumnPathMap(ShipAct_DtlR.$sub_char2, MST_SHIP_INST_D_R.$sub_char2);
			addColumnPathMap(ShipAct_DtlR.$sub_char3, MST_SHIP_INST_D_R.$sub_char3);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.hdr_peg_no(src.getNumberNE("hdr_peg_no"));
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 納品書、出荷案内書の発行前チェックをする。<br>
	 */
	public class Chk03 extends MSBEL_ShipActListReg_MC_A.Chk03 {
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

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrShipAct());
			msgL.addAll(chkShipActD());

			return msgL;
		}

		/**
		 * 出荷実績に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrShipAct() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk03_RsltR> lst = up0().shallowClone();
			lst.sort(Chk03_RsltR.$ship_act_no);

			MCList<MST_SHIP_ACT_R> dbc = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ship_act_no, t.can_flg, t.upd_cntr);
			dbc_bldr.setOrderByAsc(t.ship_act_no);
			dbSelectKeyForUpdateNoWait("MSBEL1450_MST_SHIP_ACT_S03", dbc, dbc_bldr, lst);

			MCIndexKey idx = dbc.createIndex(MST_SHIP_ACT_R.$ship_act_no);
			for (Chk03_RsltR r : up0()) {
				r.can_flg(dbc.getFirst(idx, r.ship_act_no()).can_flg());
				msgL.addAll(
					checkUpdCntrNE(r, Chk03_RsltR.$upd_cntr, dbc.getFirst(idx, r.ship_act_no())));
			}

			return msgL;
		}
		protected MCMessageList chkShipActD() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_SHIP_ACT_R> selectL = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");

			selectL.addStringColumn("base_ac_dt");
			selectL_bldr.setSelect(t.ship_act_no);
			selectL_bldr.addSelect(t1.trd_ptn_typ,t1.base_ac_dt);
			selectL_bldr.addWhereWithAnd(t.ship_act_no.eq(bind(Chk03_RsltR.$ship_act_no)));
			selectL_bldr.addLeftOuterJoin(t1,
					bracket(t1.ship_act_no.eq(t.ship_act_no)));
			selectL_bldr.addOrderByAscNullsFirst(t.ship_act_no, t1.base_ac_dt);
			dbSelect("MSBEL1450_MST_SHIP_ACT_S06", selectL, selectL_bldr, notErrL);

			MCIndexKey idxkey = selectL.createIndex(MST_SHIP_ACT_R.$ship_act_no);
			for (Chk03_RsltR r : notErrL) {
				MST_SHIP_ACT_R selectR = selectL.getFirst(idxkey, r.ship_act_no());
				if (MAC_TRD_PTN_TYP.isPROV_RTN(selectR.getString("trd_ptn_typ"))) {
					if (isNull(selectR.getStringNE("base_ac_dt"))) {
						msgL.add(new MCMessage(r, null, MSBEL1105 , toDispGUIIndex(r)));
					}
				}
			}

			return msgL;

		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書、出荷案内書を発行する。<br>
	 */
	public class Prnt01 extends MSBEL_ShipActListReg_MC_A.Prnt01 {
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
			callShipRprtPrnt01();
			updPrntFlg();
			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
		}
		
		protected void callThisChk03() {
			MSBEL_ShipActListReg.Chk03 ope = MSBEL_ShipActListReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void callShipRprtPrnt01() {
			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (notErrL.isEmpty()) return;

			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 o = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			o.up0().setAll(crtShipRprtPrnt01(notErrL));
			o.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());	// 個別発行でない＝まとめ発行
			o.exec();
			copyErrFlg(up0(), o.down0());
		}
		protected final String DLV_PRNTED_FLG = "_dlv_prntd_flg_";
		protected final String ADV_PRNTED_FLG = "_adv_prntd_flg_";
		protected MCList<ShipRprt_Prnt01_HdrR> crtShipRprtPrnt01(MCList<Chk03_RsltR> notErrL) {
			MCList<MST_SHIP_ACT_D_R> rsltL = getPrntTgtL(notErrL);
			MCIndexKey idx = getUpIdxKey();
			MCList<ShipRprt_Prnt01_HdrR> prntL = MCList.create(ShipRprt_Prnt01_HdrR.class);
			up0().addBooleanColumn(DLV_PRNTED_FLG);
			up0().addBooleanColumn(ADV_PRNTED_FLG);
			for (MST_SHIP_ACT_D_R actDR : rsltL) {
				Chk03_RsltR up0R = up0().getFirst(idx, actDR.toArray(idx.getKeys()));
				
				ShipRprt_Prnt01_HdrR prntR = prntL.add();
				prntR.peg_no(up0R.peg_no());
				prntR.dlv_slip_act_no(actDR.ship_act_no());	// まとめ発行=オフのときに使用する
				prntR.dlv_slip_no(actDR.dlv_slip_no());
				prntR.dlv_slip_seq(actDR.dlv_slip_seq());
				prntR.dlv_slip_prnt_flg(up0R.dlv_prnt_flg());
				prntR.ship_adv_prnt_flg(up0R.adv_prnt_flg());
				if (up0R.dlv_prnt_flg()
					&& actDR.pri_prnt_flg()
					&& MAC_TRD_PTN_TYP.isSLS(actDR.trd_ptn_typ())
					&& actDR.getBoolean(MST_DLV_SLIP_R.$sync_flg)) {
					// 売上伝票発行済ＦＬＧを更新するため
					prntR.sls_prnt_flg(true);
				}
				prntR.inc_can_flg(true);
				prntR.setAttributes(up0R);
				
				if (up0R.dlv_prnt_flg() && !actDR.getBoolean(MST_SHIP_ACT_R.$dlv_prnt_flg)) {
					up0R.setBooleanNE(DLV_PRNTED_FLG, true);
				}
				if (up0R.adv_prnt_flg() && !actDR.getBoolean(MST_SHIP_ACT_R.$ship_adv_prnt_flg)) {
					up0R.setBooleanNE(ADV_PRNTED_FLG, true);
				}
			}
			
			return prntL;
		}
		protected MCIndexKey getUpIdxKey() {
			List<String> arr = new ArrayList<>();
			arr.add(Chk03_RsltR.$ship_act_no);
			if (!up0().isEmpty()
				&& !isNull(up0().get(0).dlv_slip_no())) {
				arr.add(Chk03_RsltR.$dlv_slip_no);
			}
			return up0().createIndex(arr.toArray(new String[0]));
		}
		protected MCList<MST_SHIP_ACT_D_R> getPrntTgtL(MCList<Chk03_RsltR> notErrL) {
			shipActWkDel();
			shipActWkIns(notErrL);
			
			// 上り電文の出荷実績ＮＯ、改訂番号に対応する納品書ＮＯ、連番を取得する
			MST_SHIP_ACT_R t1 = MST_SHIP_ACT_R.create("T1");
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MCTempView w = createTempView("W");
			MSW_SHIP_ACT_KEY_R w1 = MSW_SHIP_ACT_KEY_R.create("W1");
			MST_SHIP_ACT_R w2 = MST_SHIP_ACT_R.create("W2");
			MST_SHIP_ACT_D_R w3 = MST_SHIP_ACT_D_R.create("W3");
			MST_SHIP_ACT_D_P_R w4 = MST_SHIP_ACT_D_P_R.create("W4");
			MST_SHIP_ACT_D_R w5 = MST_SHIP_ACT_D_R.create("W5");
			MST_DLV_SLIP_R w7 = MST_DLV_SLIP_R.create("W7");
			MST_DLV_SLIP_R w8 = MST_DLV_SLIP_R.create("W8");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(
				t1.ship_act_no,
				w.pr("dlv_slip_no").as("dlv_slip_no"),
				w.pr("dlv_slip_seq").as("dlv_slip_seq"),
				w.pr("trd_ptn_typ"),
				w.pr("pri_prnt_flg"),
				t2.sync_flg, t1.dlv_prnt_flg, t1.ship_adv_prnt_flg
			);
			bldr.addInnerJoin(w1,
				w1.ship_act_no.eq(t1.ship_act_no)
			);
			bldr.addInnerJoin(
				subQuery()
				.select(
					w3.ship_act_no,
					w3.dlv_slip_no,
					w3.dlv_slip_seq.add(
							decode(w2.can_flg, value(false), value(0), value(1))
					).as("dlv_slip_seq"),
					w3.trd_ptn_typ,
					w3.pri_prnt_flg
				)
				.from(w1
					.innerJoin(w2).on(w2.ship_act_no.eq(w1.ship_act_no))
					.innerJoin(w3).on(w3.ship_act_no.eq(w1.ship_act_no))
					.innerJoin(w8).on(
						w8.dlv_slip_no.eq(w3.dlv_slip_no)
						.and(w8.dlv_slip_seq.eq(w3.dlv_slip_seq)))
				)
				.where(
					bracket(w2.can_flg.eq(value(true))
						.or(w2.can_flg.eq(value(false))).and(w3.can_flg.eq(value(false))))
				)
				.unionAll(
					// 最新の改訂番号で行削除された分の納品書ＮＯを取得する
					// ただし指図が取り消されている場合は不要（なのでcan_flgを条件に追加している）
					subQuery()
					.select(
						w4.ship_act_no,
						w4.dlv_slip_no,
						subQuery()
							.select(max(w7.dlv_slip_seq))
							.from(w7)
							.where(w7.dlv_slip_no.eq(w4.dlv_slip_no)
							.and(w7.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
						).as("dlv_slip_seq"),
						w4.trd_ptn_typ,
						w4.pri_prnt_flg
					)
					.from(w1
						.innerJoin(w2).on(w2.ship_act_no.eq(w1.ship_act_no))
						.innerJoin(w4).on(
							w4.ship_act_no.eq(w1.ship_act_no)
							.and(w4.ship_act_rev.eq(w2.ship_act_rev.subtract(value(1))))
							.and(w4.can_flg.eq(value(false))))
					)
					.where(
						notExists(
							subQuery()
							.select(value("x"))
							.from(w5)
							.where(
								w5.ship_act_no.eq(w1.ship_act_no)
								.and(w5.can_flg.eq(value(false)))
								.and(w5.dlv_slip_no.eq(w4.dlv_slip_no)))
						)
						.and(w2.can_flg.eq(value(false)))
					)
				).view(w), w.pr("ship_act_no").eq(t1.ship_act_no)
			);
			bldr.addInnerJoin(t2,
				t2.dlv_slip_no.eq(w.pr("dlv_slip_no"))
				.and(t2.dlv_slip_seq.eq(w.pr("dlv_slip_seq")))
			);
			bldr.addWhereWithCutOffAnd(bracket(
				w.pr("dlv_slip_no").eq(bind("dlv_slip_no"))
				.and(w.pr("dlv_slip_seq").eq(bind("dlv_slip_seq")))
			));
			
			MCList<MST_SHIP_ACT_D_R> rsltL = MCList.create(MST_SHIP_ACT_D_R.class);
			rsltL.addBooleanColumn(MST_DLV_SLIP_R.$sync_flg);
			rsltL.addBooleanColumn(MST_SHIP_ACT_R.$dlv_prnt_flg);
			rsltL.addBooleanColumn(MST_SHIP_ACT_R.$ship_adv_prnt_flg);
			dbSelect("MSBEL1450_MST_SHIP_ACT_D_S01", rsltL, bldr, notErrL);
			
			shipActWkDel();
			return rsltL;
		}
		protected void shipActWkDel() {
			dbWkDelete("MSBEL1450_MSW_SHIP_ACT_KEY_D01", MST_SHIP_ACT_R.create());
		}
		protected void shipActWkIns(MCList<Chk03_RsltR> notErrL) {
			dbWkInsert("MSBEL1450_MSW_SHIP_ACT_KEY_I01",
				notErrL.groupBy(Chk03_RsltR.$ship_act_no),
				MST_SHIP_ACT_R.create()
			);
		}

		protected void updPrntFlg() {
			boolean hasCan=false;
			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			notErrL = notErrL.subList(r -> r.dlv_prnt_flg() || r.adv_prnt_flg());
			if (notErrL.isEmpty()) {
				return;
			}
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(
				t.ship_act_no, t.dlv_prnt_flg, t.dlv_prnt_tm, t.ship_adv_prnt_flg, t.ship_adv_prnt_tm, t.can_flg,t.upd_srv_req_no
			);
			
			MCList<MST_SHIP_ACT_R> actL = MCList.create(MST_SHIP_ACT_R.class);
			dbSelectKey("MSBEL1450_MST_SHIP_ACT_S05", actL, bldr, notErrL);
			
			MCDate sysnow = MCDate.sysnow();
			MCIndexKey idx = up0().createIndex(Chk03_RsltR.$ship_act_no);
			for (MST_SHIP_ACT_R actR : actL) {
				// 検索モードが「納品書」の場合、複数件ヒットする
				// そのうち発行済みの納品書、出荷案内書があれば、発行済みにする
				MCList<Chk03_RsltR> up0L = up0().subList(idx, actR.ship_act_no());
				
				if ((Boolean)up0L.max(DLV_PRNTED_FLG)) {
					actR.dlv_prnt_flg(true);
					actR.dlv_prnt_tm(sysnow);
				}
				if ((Boolean)up0L.max(ADV_PRNTED_FLG)) {
					actR.ship_adv_prnt_flg(true);
					actR.ship_adv_prnt_tm(sysnow);
				}
				if (actR.can_flg()) {
					hasCan = true;
				}
			}
			bldr = MCQueryApiBuilder.create(t);
			bldr.setSet(
				t.dlv_prnt_flg, t.dlv_prnt_tm, t.ship_adv_prnt_flg, t.ship_adv_prnt_tm
			);
			dbUpdateKey("MSBEL1450_MST_SHIP_ACT_U01", actL, bldr);
			if (hasCan) {
				MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");
				MCQueryApiBuilder bldrDtl = MCQueryApiBuilder.create(t1);
				MCList<MST_SHIP_ACT_D_R> actDL = MCList.create(MST_SHIP_ACT_D_R.class);
				bldrDtl.setSelect(t1.ship_act_no, t1.ship_act_d_no,t1.upd_srv_req_no);
				bldrDtl.setWhere(t1.ship_act_no.eq(bind("ship_act_no")));
				bldrDtl.addConstWhereWithAnd(t1.can_flg.eq(value(true)));
				dbSelect("MSBEL1450_MST_SHIP_ACT_D_S02", actDL, bldrDtl, actL);

				MCList<MST_SHIP_ACT_D_R> canActDL = MCList.create(MST_SHIP_ACT_D_R.class);
				if (!actDL.isEmpty()) {
					MCIndexKey idx1 = actDL.createIndex(MST_SHIP_ACT_D_R.$ship_act_no,
							MST_SHIP_ACT_D_R.$upd_srv_req_no);
					for (MST_SHIP_ACT_R actR : actL) {
						canActDL.addAll(actDL.subList(idx1, actR.ship_act_no(),
								actR.upd_srv_req_no()));
					}
					bldrDtl.setSet(t1.ship_act_no, t1.ship_act_d_no);
					dbUpdateKey("MSBEL1450_MST_SHIP_ACT_D_U01", canActDL, bldrDtl);
				}
			}
			callRevDataIns01(actL);
		}
		
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01(MCList<MST_SHIP_ACT_R> argL) {
			MCList<MST_SHIP_ACT_R> wkL = MCList.create(MST_SHIP_ACT_R.class);
			for (MST_SHIP_ACT_R r : argL) {
				MST_SHIP_ACT_R wkR = MST_SHIP_ACT_R.create();
				wkR.ship_act_no(r.ship_act_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_R.create("T"));
			dbWkDelete("MSBEL1450_MSW_SHIP_ACT_D02", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL1450_MSW_SHIP_ACT_I02",
					wkL.groupBy(wkL.createRow().getKeyColumn()), wkL_bldr.getBaseDbc());

			MCList<MST_SHIP_ACT_R> hdrL = MCList.create(MST_SHIP_ACT_R.class);
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t);
			hdrL_bldr.setSelect(t.ship_act_no, t.ship_act_rev);
			
			MSW_SHIP_ACT_KEY_R w = MSW_SHIP_ACT_KEY_R.create("W");
			hdrL_bldr.addInnerJoin(w, bracket( t.ship_act_no.eq(w.ship_act_no)));
			dbSelect("MSBEL1450_MST_SHIP_ACT_S04", hdrL, hdrL_bldr);
			
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_SHIP_ACT_R hdrR : hdrL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(hdrR.ship_act_no());
				opeR.rev_no(hdrR.ship_act_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_ACT.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected void handleSuccess(MCList<Chk03_RsltR> l) {
			dbTran().commit();
			for (Chk03_RsltR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e,
				MCList<Chk03_RsltR> l) {
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
			for (Chk03_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
	}

	/**
	 * 出荷進捗のロック、更新カウンタチェック
	 */
	protected MCMessageList chkShipPrCmn(MCList<Srch01_CntrR> cntrL, String chkKey) {
		MCMessageList msgL = new MCMessageList();

		MCList<MST_SHIP_PR_R> selectL = MCList.create(MST_SHIP_PR_R.class);
		MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
		selectL_bldr.setSelect(t.ship_pr_no, t.upd_cntr);
		selectL_bldr.setOrderByAsc(t.ship_pr_no);

		MCList<Srch01_CntrR> bindL = cntrL.groupBy(Srch01_CntrR.$ship_pr_no);
		bindL.sort(Srch01_CntrR.$ship_pr_no);
		dbSelectKeyForUpdateNoWait("MSBEL1450_MST_SHIP_PR_S01",
				selectL, selectL_bldr, bindL);

		MCIndexKey idxkey = selectL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
		for (MCList<Srch01_CntrR> l : cntrL.groupList(chkKey)) {
			for (Srch01_CntrR r : l) {
				MST_SHIP_PR_R selectR = selectL.getFirst(idxkey, r.ship_pr_no());
				int i = msgL.size();
				msgL.addAll(checkUpdCntrNE(r, Srch01_CntrR.$ship_pr_upd_cntr, selectR));
				if (msgL.size() > i) {
					break;
				}
			}
		}
		return msgL;
	}

	//FMCB CUSTOM END
}