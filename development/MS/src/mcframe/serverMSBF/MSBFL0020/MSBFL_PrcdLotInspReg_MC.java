package mcframe.serverMSBF.MSBFL0020;

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
import mcframe.serverMSBF.MSBFL0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5010.*;
import static mcframe.commonCore.container.MCRow.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_PrcdLotInspReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_PrcdLotInspReg_MC extends MSBFL_PrcdLotInspReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 先行検査を登録する前のチェック処理<br>
	 */
	public class Chk01 extends MSBFL_PrcdLotInspReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			if (chkInspSchd() > 0) {
				msgL.add(new MCMessage(up0(), null, MSBFL0026, toDispGUIIndex(up0())));
			}
			
			if (chkInspInst() > 0) {
				msgL.add(new MCMessage(up0(), null, MSBFL0026, toDispGUIIndex(up0())));
			}
			
			msgL.addAll(checkWritableLocCdDac(up0(), Chk01_CndR.$loc_cd));
			
			return msgL;
		}
		
		/**
		 * 検査予定情報の存在チェック
		 * 
		 */
		protected int chkInspSchd() {
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCList<MST_INSP_SCHD_R> dbc = MCList.create(MST_INSP_SCHD_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			dbc_bldr.setSelect(t.insp_schd_no);
			dbc_bldr.setWhere(t.itm_cd.eq(bind("1")), up0().itm_cd());
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), up0().itm_sub1());
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), up0().itm_sub2());
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), up0().itm_sub3());
			dbc_bldr.addWhereWithAnd(t.sppl_cd.eq(bind("1")), up0().sppl_cd());
			dbc_bldr.addWhereWithAnd(t.bp_lot_no.eq(bind("1")), up0().bp_lot_no());
			dbc_bldr.addWhereWithAnd(t.insp_typ.eq(bind("1")), MSC_INSP_TYP.PRCD.value());
			dbc_bldr.addWhereWithAnd(t.insp_schd_sts_typ.neq(bind("1")), MSC_INSP_STS_TYP.ORD.value());

			return dbSelect("MSBFL0020_MST_INSP_SCHD_S01", dbc, dbc_bldr);
		}

		/**
		 * 検査指図情報の存在チェック
		 * 
		 */
		protected int chkInspInst() {
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCList<MST_INSP_INST_R> dbc = MCList.create(MST_INSP_INST_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			dbc_bldr.setSelect(t.insp_no);
			dbc_bldr.setWhere(t.itm_cd.eq(bind("1")), up0().itm_cd());
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), up0().itm_sub1());
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), up0().itm_sub2());
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), up0().itm_sub3());
			dbc_bldr.addWhereWithAnd(t.sppl_cd.eq(bind("1")), up0().sppl_cd());
			dbc_bldr.addWhereWithAnd(t.bp_lot_no.eq(bind("1")), up0().bp_lot_no());
			dbc_bldr.addWhereWithAnd(t.insp_typ.eq(bind("1")), MSC_INSP_TYP.PRCD.value());
			dbc_bldr.addWhereWithAnd(t.insp_sts_typ.notIn( bind("1"), bind("2")), MSC_INSP_STS_TYP.STR.value(), MSC_INSP_STS_TYP.JDG.value());

			return dbSelect("MSBFL0020_MST_INSP_INST_S01", dbc, dbc_bldr);
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 先行検査を取り消す前のチェック処理<br>
	 */
	public class Chk02 extends MSBFL_PrcdLotInspReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MST_INSP_SCHD_R inspSchdR = MST_INSP_SCHD_R.create();
			MCQueryApiBuilder inspSchdR_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
			dbSelectKey("MSBFL0020_MST_INSP_SCHD_S02", inspSchdR, inspSchdR_bldr, up0());
			
			if (isNull(inspSchdR.insp_schd_no())) {
				if (!isNull(up0().insp_schd_no())) {
					msgL.add(new MCMessage(up0(), null, MSBFL0028, toDispGUIIndex(up0())));
				}
			}
			else {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(inspSchdR, MST_INSP_SCHD_R.$loc_cd));

				if (!MSC_INSP_STS_TYP.isYET(inspSchdR.insp_schd_sts_typ())) {
					msgL.add(new MCMessage(up0(), null, MSBFL0029, toDispGUIIndex(up0())));
				}
				if (!MSC_INSP_TYP.isPRCD(inspSchdR.insp_typ())) {
					msgL.add(new MCMessage(up0(), null, MSBFL0108, toDispGUIIndex(up0())));
				}
			}
			return msgL;
		}

	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 先行検査予定を登録する。<br>
	 */
	public class Ins01 extends MSBFL_PrcdLotInspReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk01(up0());
			
			throwUpdErr();
			
			insInspSchd(up0());
		}

		protected void callThisChk01(Chk01_CndR up0) {
			MSBFL_PrcdLotInspReg.Chk01 ope = MSBFL_PrcdLotInspReg.crtChk01();
			
			copyall(ope.up0(), up0);
			ope.exec();
		}
		
		protected InspSchd_Srch01_CndR getItmInsp() {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
			oR.peg_no();
			oR.itm_cd(up0().itm_cd());
			oR.itm_sub1(up0().itm_sub1());
			oR.itm_sub2(up0().itm_sub2());
			oR.itm_sub3(up0().itm_sub3());
			oR.mfg_loc_cd(null);
			oR.sppl_cd(up0().sppl_cd());
			oR.maker_cd(up0().maker_cd());
			oR.base_dt(up0().master_dt());
			oR.insp_typ(MSC_INSP_TYP.PRCD.value());
			oR.insp_ptn_cd(null);
			oR.no_insp_srch_flg(false);
			oR.to_site_cd(null);
			oR.to_loc_cd(up0().loc_cd());
			o.up0().add(oR);
			
			o.exec();
			
			if (!o.down0().isEmpty()) {
				return o.down0().get(0);
			}
			else {
				return null;
			}
		}
		
		/**
		 * 検査予定の登録処理
		 */
		protected void insInspSchd(Chk01_CndR up) {
			MST_INSP_SCHD_R schdR = MST_INSP_SCHD_R.create();
			
			InspSchd_Srch01_CndR itmInspR = getItmInsp();
			MAM_ITM_R itmR = getItmR(up);
			
			schdR.insp_schd_no(getStrSeq(MSC_NUM_SYS_TYP.INSPS));
			schdR.src_no1(null);
			schdR.src_no2(null);
			schdR.src_no3(null);
			schdR.src_no4(null);
			schdR.insp_typ(MSC_INSP_TYP.PRCD.value());
			if (!isNull(itmInspR)) {
				schdR.insp_mtd_typ(itmInspR.insp_mtd_typ());
			}
			schdR.itm_cd(up.itm_cd());
			schdR.itm_sub1(up.itm_sub1());
			schdR.itm_sub2(up.itm_sub2());
			schdR.itm_sub3(up.itm_sub3());
			schdR.loc_cd(up.loc_cd());
			schdR.str_ln_cd(MAC_STR.NULL_VAL.value());
			schdR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			schdR.gd_cd(null);
			schdR.quality_typ(null);
			schdR.stk_insp_typ(null);
			schdR.stk_id_typ(null);
			schdR.stk_bp_cd(MAC_STR.NULL_VAL.value());
			schdR.lot_no(null);
			schdR.sublot_no(null);
			schdR.sno1(MAC_STR.NULL_VAL.value());
			schdR.sno1_mng_typ(itmR.sno1_mng_typ());
			schdR.sno2(MAC_STR.NULL_VAL.value());
			schdR.sno2_mng_typ(itmR.sno2_mng_typ());
			schdR.sno3(MAC_STR.NULL_VAL.value());
			schdR.sno3_mng_typ(itmR.sno3_mng_typ());
			schdR.sno4(MAC_STR.NULL_VAL.value());
			schdR.sno4_mng_typ(itmR.sno4_mng_typ());
			schdR.sppl_cd(up.sppl_cd());
			if (!isNull(up.maker_cd())) {
				schdR.maker_cd(up.maker_cd());
			}
			else {
				schdR.maker_cd(MAC_STR.NULL_VAL.value());
			}
			schdR.mfg_loc_cd(MAC_STR.NULL_VAL.value());
			schdR.from_site_cd(MAC_STR.NULL_VAL.value());
			schdR.bp_lot_no(up.bp_lot_no());
			schdR.master_dt(up.master_dt());
			schdR.st_tm(up.st_tm());
			schdR.end_tm(up.end_tm());
			schdR.pack_unit_qty(null);
			schdR.pack_unit_cd(null);
			schdR.base_unit_qty(null);
			schdR.base_unit_cd(null);
			schdR.smpl_schd_qty(null);
			schdR.smpl_inst_qty(null);
			schdR.own_insp_no(null);
			schdR.own_insp_schd_no(null);
			schdR.org_insp_schd_no(schdR.insp_schd_no());
			schdR.insp_freq(MCNumber.ONE);
			schdR.lmt_up_flg(false);
			schdR.insp_schd_sts_typ(MSC_INSP_STS_TYP.YET.value());
			schdR.insp_no(null);
			schdR.itm_ord_no(null);
			schdR.in_prmt_insp_flg(false);
			schdR.trd_cd(null);
			schdR.insp_bind_typ(null);
			schdR.insp_cnt_rmrks(up.insp_cnt_rmrks());
			schdR.sub_char1(up.sub_char1());
			schdR.sub_char2(up.sub_char2());
			schdR.sub_char3(up.sub_char3());

			MCQueryApiBuilder schdR_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
			dbInsertEx("MSBFL0020_MST_INSP_SCHD_I01", schdR, schdR_bldr);
			down0().insp_schd_no(schdR.insp_schd_no());
		}

		protected MAM_ITM_R getItmR(Chk01_CndR up) {
			MAM_ITM_R dbR = MAM_ITM_R.create();
			MCQueryApiBuilder dbR_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			dbSelectKey("MSBFL0020_MAM_ITM_S01", dbR, dbR_bldr, up);
			return dbR;
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 先行検査予定を取り消す。<br>
	 */
	public class Del01 extends MSBFL_PrcdLotInspReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk02(up0());

			throwDelErr();
			
			delInspSchd(up0());
		}

		protected void callThisChk02(Chk02_CndR up0) {
			MSBFL_PrcdLotInspReg.Chk02 ope = MSBFL_PrcdLotInspReg.crtChk02();
			
			copyall(ope.up0(), up0);
			ope.exec();
		}

		protected void delInspSchd(Chk02_CndR up0) {
			MST_INSP_SCHD_R inspSchdR = MST_INSP_SCHD_R.create();
			inspSchdR.insp_schd_no(up0().insp_schd_no());
			MCQueryApiBuilder inspSchdR_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
			dbDeleteKey("MSBFL0020_MST_INSP_SCHD_D01", inspSchdR, inspSchdR_bldr);
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品管関連マスタを取得する。<br>
	 */
	public class Srch01 extends MSBFL_PrcdLotInspReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callInspSchdSrch01();
			setDown();
		}
		
		protected void callInspSchdSrch01() {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
			oR.peg_no(MCNumber.ZERO);
			oR.itm_cd(up0().itm_cd());
			oR.itm_sub1(up0().itm_sub1());
			oR.itm_sub2(up0().itm_sub2());
			oR.itm_sub3(up0().itm_sub3());
			oR.mfg_loc_cd(MAC_STR.NULL_VAL.value());
			oR.sppl_cd(up0().sppl_cd());
			oR.maker_cd(up0().maker_cd());
			oR.base_dt(up0().master_dt());
			oR.insp_typ(MSC_INSP_TYP.PRCD.value());
			oR.insp_ptn_cd(null);
			oR.no_insp_srch_flg(false);
			oR.to_site_cd(null);
			oR.to_loc_cd(up0().loc_cd());
			o.up0().add(oR);
			
			o.exec();
			
			if (!o.down0().isEmpty()) {
				up0().pre_insp_valid_flg(o.down0().get(0).pre_insp_valid_flg());
				
				// 先行検査では検査方法区分：抜取検査のみ有効である。
				// このため、取得したマスタの検査方法区分が抜取規格検査でない場合には、
				// 画面でメッセージを表示する（ただし、エラーとはせず、処理は実行できる）。
				if (!MAC_INSP_MTD_TYP.isSPEC(o.down0().get(0).insp_mtd_typ())) {
					up0().no_spec_flg(true);
				}
			}
		}
		
		protected void setDown() {
			down0().pre_insp_valid_flg(up0().pre_insp_valid_flg());
			down0().no_spec_flg(up0().no_spec_flg());
		}
	}

	//FMCB CUSTOM END
}