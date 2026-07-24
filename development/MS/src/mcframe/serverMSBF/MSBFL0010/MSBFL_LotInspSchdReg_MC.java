package mcframe.serverMSBF.MSBFL0010;

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
import mcframe.serverMSBF.MSBFL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBI.MSBIL5010.*;
import static mcframe.serverMSBF.MSBFL0010.Query.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.commonCore.param.MCParam;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;

import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_LotInspSchdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_LotInspSchdReg_MC extends MSBFL_LotInspSchdReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 現状在庫を検索する<br>
	 */
	public class Srch01 extends MSBFL_LotInspSchdReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件設定
			setUpTmpCol(up0());

			// 検索する
			MCQueryPlan strSql = MSBFL0010_MST_STK_S01();
			searchForDL(strSql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			editDown();
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			// 期限未設定のみＦＬＧ
			if (up.unreg_lmt_flg()) {
				up.addStringColumn("TMP_UNREG_LMT_FLG_CUTOFF", toTrueStr(true));
			}
			// 使用予定日表示ＦＬＧ
			if (up.disp_mrp_use_dt_flg()) {
				up.addStringColumn("TMP_DISP_MRP_USE_DT_FLG_CUTOFF", toTrueStr(true));
			}
		}

		protected void editDown() {
			for (Srch01_RsltR r : down0()) {
				if (r.cont_fctr_flg()) {
					r.cont_fctr_qty(convToContFctrUnit(r.base_unit_qty(),
							nvl(r.act_cont_fctr(), r.std_cont_fctr()), 
							r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
				}
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 現状在庫を検索する<br>
	 */
	public class Srch02 extends MSBFL_LotInspSchdReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件設定
			setUpTmpCol(up0());

			// 検索する
			MCQueryPlan strSql = MSBFL0010_MST_STK_S02();
			searchForDL(strSql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			editDown();
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(Srch02_CndR up) {
			// 期限未設定のみＦＬＧ
			if (up.unreg_lmt_flg()) {
				up.addStringColumn("TMP_UNREG_LMT_FLG_CUTOFF", toTrueStr(true));
			}
			// 使用予定日表示ＦＬＧ
			if (up.disp_mrp_use_dt_flg()) {
				up.addStringColumn("TMP_DISP_MRP_USE_DT_FLG_CUTOFF", toTrueStr(true));
			}
		}

		protected void editDown() {
			for (Srch02_RsltR r : down0()) {
				if (r.cont_fctr_flg()) {
					r.cont_fctr_qty(convToContFctrUnit(r.base_unit_qty(),
							nvl(r.act_cont_fctr(), r.std_cont_fctr()), 
							r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
				}
			}
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 検査予定を検索する<br>
	 */
	public class Srch03 extends MSBFL_LotInspSchdReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索する
			MCQueryPlan strSql = MSBFL0010_MST_INSP_SCHD_S01();
			searchForDL(strSql, up0(), down0());
		}
	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * 検査予定を検索する<br>
	 */
	public class Srch04 extends MSBFL_LotInspSchdReg_MC_A.Srch04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索する
			MCQueryPlan strSql = MSBFL0010_MST_INSP_SCHD_S02();
			searchForDL(strSql, up0(), down0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 期限再検査予定を登録する前に、チェックを実行する<br>
	 */
	public class Chk01 extends MSBFL_LotInspSchdReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			// 下り電文設定
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
			MCList<MST_STK_R> selectL = MCList.create(MST_STK_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_STK_R.create("T"));
			dbSelectKey("MSBFL0010_MST_STK_S01", selectL, selectL_bldr, up0());
			MCIndexKey idxkey = selectL.createIndex(getKeyCols());
			for (Chk01_RsltR r : up0()) {
				MST_STK_R selectR = selectL.getFirst(idxkey, getVals(r));
				if (!isNull(selectR)) {
					r.pack_insp_qty(selectR.pack_unit_qty());
					r.base_unit_insp_qty(selectR.base_unit_qty());
				}
			}
		}

		protected String[] getKeyCols() {
			return new String[] {
					Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3, 
					Srch01_RsltR.$loc_cd, Srch01_RsltR.$str_ln_cd, Srch01_RsltR.$stk_arrv_bp_cd,
					Srch01_RsltR.$lot_no, Srch01_RsltR.$sublot_no, Srch01_RsltR.$sno1, Srch01_RsltR.$sno2, Srch01_RsltR.$sno3, Srch01_RsltR.$sno4, 
					Srch01_RsltR.$fix_no_typ, Srch01_RsltR.$fix_no, Srch01_RsltR.$pack_unit_cd, Srch01_RsltR.$gd_cd, Srch01_RsltR.$in_xfr_typ,
					Srch01_RsltR.$quality_typ, Srch01_RsltR.$asst_typ, Srch01_RsltR.$stk_insp_typ, Srch01_RsltR.$stk_id_typ, Srch01_RsltR.$stk_bp_cd};
		}
		
		protected String [] getVals(Chk01_RsltR r) {
			return new String[] {r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), 
					r.loc_cd(), r.str_ln_cd(), r.stk_arrv_bp_cd(),
					r.lot_no(), r.sublot_no(), r.sno1(), r.sno2(), r.sno3(), r.sno4(), 
					r.fix_no_typ(), r.fix_no(), r.pack_unit_cd(), r.gd_cd(), r.in_xfr_typ(),
					r.quality_typ(), r.asst_typ(), r.stk_insp_typ(), r.stk_id_typ(), r.stk_bp_cd()};
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			msgL.addAll(chkMain(notErrL));

			// ＤＡＣチェック
			msgL.addAll(checkWritableLocCdDac(notErrL, Chk01_RsltR.$loc_cd));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkMain(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_RsltR chkR : upL) {

				// 同一ロットチェック
				msgL.addAll(chkSameLot(chkR, upL));
				// 予定存在チェック
				msgL.addAll(chkInspSchd(chkR));
				// 未完了チェック
				msgL.addAll(chkInspInst(chkR));
			}
			return msgL;
		}

		/**
		 * 同一ロットチェックを実行する。
		 * 
		 * @param chkR
		 * @param chkL
		 * @return
		 */
		protected MCMessageList chkSameLot(Chk01_RsltR chkR, MCList<Chk01_RsltR> chkL) {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey lotIdx = chkL.createIndex(getLotInfKeyCols());

			if (chkL.subList(lotIdx, getLotInfKeyVals(chkR)).size() >= 2) {
				msgL.add(new MCMessage(chkR, null, MSBFL0079,
						toDispItm(chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3()),
						chkR.lot_no(), chkR.sublot_no(),
						toDispSno(chkR.sno1(), chkR.sno2(), chkR.sno3(), chkR.sno4()),
						toDispGUIIndex(chkR)));
			}

			return msgL;
		}

		protected String[] getLotInfKeyCols() {
			return new String[] {
					Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3,
					Chk01_RsltR.$lot_no, Chk01_RsltR.$sublot_no,
					Chk01_RsltR.$sno1, Chk01_RsltR.$sno2, Chk01_RsltR.$sno3, Chk01_RsltR.$sno4
			};
		}

		protected Comparable<?>[] getLotInfKeyVals(Chk01_RsltR r) {
			return new Comparable<?>[] {
				r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
				r.lot_no(), r.sublot_no(),
				r.sno1(), r.sno2(), r.sno3(), r.sno4()
			};
		}
		/**
		 * 該当のサブロットに対する検査予定情報が、指図済以外で存在するか判定する。
		 * 
		 * @param r
		 */
		protected MCMessageList chkInspSchd(Chk01_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_INSP_SCHD_R> dbc = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.insp_no);
			dbc_bldr.setWhere(t.itm_cd.eq(bind("1")), r.itm_cd());
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), r.itm_sub1());
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), r.itm_sub2());
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), r.itm_sub3());
			dbc_bldr.addWhereWithAnd(t.lot_no.eq(bind("1")), r.lot_no());
			dbc_bldr.addWhereWithAnd(t.sublot_no.eq(bind("1")), r.sublot_no());
			dbc_bldr.addWhereWithAnd(t.sno1.eq(bind("1")), r.sno1());
			dbc_bldr.addWhereWithAnd(t.sno2.eq(bind("1")), r.sno2());
			dbc_bldr.addWhereWithAnd(t.sno3.eq(bind("1")), r.sno3());
			dbc_bldr.addWhereWithAnd(t.sno4.eq(bind("1")), r.sno4());
			dbc_bldr.addWhereWithAnd(t.insp_schd_sts_typ.neq(value(MSC_INSP_STS_TYP.ORD.value())));
			dbc_bldr.addWhereWithAnd(t.insp_typ.in( bind("1"), bind("2"), bind("3")),
					MSC_INSP_TYP.PRDCT.value(), MSC_INSP_TYP.ACCPT.value(), MSC_INSP_TYP.LOT.value());

			if (dbSelect("MSBFL0010_MST_INSP_SCHD_S01", dbc, dbc_bldr) > 0) {
				msgL.add(new MCMessage(r, null, MSBFL0016, 
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no(), toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4())
						, toDispGUIIndex(r)));
			}

			return msgL;
		}

		/**
		 * 該当のサブロットに対する検査指図情報が、完了で存在するか判定する。
		 * 
		 * @param r
		 * @return
		 */
		protected MCMessageList chkInspInst(Chk01_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_INSP_INST_R> dbc = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.insp_no);
			dbc_bldr.setWhere(t.itm_cd.eq(bind("1")), r.itm_cd());
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), r.itm_sub1());
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), r.itm_sub2());
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), r.itm_sub3());
			dbc_bldr.addWhereWithAnd(t.lot_no.eq(bind("1")), r.lot_no());
			dbc_bldr.addWhereWithAnd(t.sublot_no.eq(bind("1")), r.sublot_no());
			dbc_bldr.addWhereWithAnd(t.insp_sts_typ.neq(value(MSC_INSP_STS_TYP.JDG.value())));
			dbc_bldr.addWhereWithAnd(t.insp_typ.in( bind("1"), bind("2"), bind("3")),
					MSC_INSP_TYP.PRDCT.value(), MSC_INSP_TYP.ACCPT.value(), MSC_INSP_TYP.LOT.value());

			if (dbSelect("MSBFL0010_MST_INSP_INST_S01", dbc, dbc_bldr) > 0) {
				msgL.add(new MCMessage(r, null, MSBFL0016, 
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no(), toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4())
						, toDispGUIIndex(r)));
			}
			return msgL;
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 在庫再検査予定を登録する前に、チェックを実行する<br>
	 */
	public class Chk02 extends MSBFL_LotInspSchdReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callClServiceChk03(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
			MCList<MST_STK_R> selectL = MCList.create(MST_STK_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_STK_R.create("T"));
			dbSelectKey("MSBFL0010_MST_STK_S02", selectL, selectL_bldr, up0());
			MCIndexKey idxkey = selectL.createIndex(getKeyCols());
			for (Chk02_RsltR r : up0()) {
				MST_STK_R selectR = selectL.getFirst(idxkey, getVals(r));
				if (!isNull(selectR)) {
					if (isNull(r.pack_unit_qty())) {
						r.pack_unit_qty(selectR.pack_unit_qty());
						r.base_unit_qty(selectR.base_unit_qty());
					}
				}
			}
		}

		protected String[] getKeyCols() {
			return new String[] {
					Srch02_RsltR.$itm_cd, Srch02_RsltR.$itm_sub1, Srch02_RsltR.$itm_sub2, Srch02_RsltR.$itm_sub3, 
					Srch02_RsltR.$loc_cd, Srch02_RsltR.$str_ln_cd, Srch02_RsltR.$stk_arrv_bp_cd,
					Srch02_RsltR.$lot_no, Srch02_RsltR.$sublot_no, Srch02_RsltR.$sno1, Srch02_RsltR.$sno2, Srch02_RsltR.$sno3, Srch02_RsltR.$sno4, 
					Srch02_RsltR.$fix_no_typ, Srch02_RsltR.$fix_no, Srch02_RsltR.$pack_unit_cd, Srch02_RsltR.$gd_cd, Srch02_RsltR.$in_xfr_typ,
					Srch02_RsltR.$quality_typ, Srch02_RsltR.$asst_typ, Srch02_RsltR.$stk_insp_typ, Srch02_RsltR.$stk_id_typ, Srch02_RsltR.$stk_bp_cd};
		}
		
		protected String [] getVals(Chk02_RsltR r) {
			return new String[] {r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), 
					r.loc_cd(), r.str_ln_cd(), r.stk_arrv_bp_cd(),
					r.lot_no(), r.sublot_no(), r.sno1(), r.sno2(), r.sno3(), r.sno4(), 
					r.fix_no_typ(), r.fix_no(), r.pack_unit_cd(), r.gd_cd(), r.in_xfr_typ(),
					r.quality_typ(), r.asst_typ(), r.stk_insp_typ(), r.stk_id_typ(), r.stk_bp_cd()};
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());

			msgL.addAll(chkMain(notErrL));

			// ＤＡＣチェック
			msgL.addAll(checkWritableLocCdDac(notErrL, Chk02_RsltR.$loc_cd));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkMain(MCList<Chk02_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk02_RsltR chkR : upL) {
				// 在庫着荷先チェック
				msgL.addAll(chkStkArrvBpCd(chkR));
				// 予定存在チェック
				msgL.addAll(chkInspSchd(chkR));
				// 未完了チェック
				msgL.addAll(chkInspInst(chkR));
			}
			return msgL;
		}
		
		/**
		 * 在庫着荷先があるかチェックする。
		 * @param r
		 * @return
		 */
		protected MCMessageList chkStkArrvBpCd(Chk02_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			
			if (!isNull(r.stk_arrv_bp_cd()) && !isSame(r.stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value())) {
				msgL.add(new MCMessage(r, null, MSBFL0017, 
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no(), toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4())
						, toDispGUIIndex(r)));
			}
			return msgL;
		}

		/**
		 * 該当のロット、サブロットに対する期限再検査の検査予定情報が、指図済以外で存在するか判定する。
		 * 
		 * @param r
		 */
		protected MCMessageList chkInspSchd(Chk02_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_INSP_SCHD_R> dbc = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.insp_no);
			dbc_bldr.setWhere(t.itm_cd.eq(bind("1")), r.itm_cd());
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), r.itm_sub1());
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), r.itm_sub2());
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), r.itm_sub3());
			dbc_bldr.addWhereWithAnd(t.lot_no.eq(bind("1")), r.lot_no());
			dbc_bldr.addWhereWithAnd(t.sublot_no.eq(bind("1")), r.sublot_no());
			dbc_bldr.addWhereWithAnd(t.sno1.eq(bind("1")), r.sno1());
			dbc_bldr.addWhereWithAnd(t.sno2.eq(bind("1")), r.sno2());
			dbc_bldr.addWhereWithAnd(t.sno3.eq(bind("1")), r.sno3());
			dbc_bldr.addWhereWithAnd(t.sno4.eq(bind("1")), r.sno4());
			dbc_bldr.addWhereWithAnd(t.insp_schd_sts_typ.neq(value(MSC_INSP_STS_TYP.ORD.value())));
			dbc_bldr.addWhereWithAnd(t.lmt_up_flg.eq(value(true)));
			
			if (dbSelect("MSBFL0010_MST_INSP_SCHD_S04", dbc, dbc_bldr) > 0) {
				msgL.add(new MCMessage(r, null, MSBFL0137, 
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no(), toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4())
						, toDispGUIIndex(r)));
			}
			return msgL;
		}

		/**
		 * 該当のロット、サブロットに対する期限再検査の検査指図情報が、完了以外で存在するか判定する。
		 * 
		 * @param r
		 * @return
		 */
		protected MCMessageList chkInspInst(Chk02_RsltR r) {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_INSP_INST_R> dbc = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.insp_no);
			dbc_bldr.setWhere(t.itm_cd.eq(bind("1")), r.itm_cd());
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), r.itm_sub1());
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), r.itm_sub2());
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), r.itm_sub3());
			dbc_bldr.addWhereWithAnd(t.lot_no.eq(bind("1")), r.lot_no());
			dbc_bldr.addWhereWithAnd(t.sublot_no.eq(bind("1")), r.sublot_no());
			dbc_bldr.addWhereWithAnd(t.insp_sts_typ.neq(value(MSC_INSP_STS_TYP.JDG.value())));
			dbc_bldr.addWhereWithAnd(t.lmt_up_flg.eq(value(true)));
			
			if (dbSelect("MSBFL0010_MST_INSP_INST_S02", dbc, dbc_bldr) > 0) {
				msgL.add(new MCMessage(r, null, MSBFL0137, 
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						r.lot_no(), r.sublot_no(), toDispSno(r.sno1(), r.sno2(), r.sno3(), r.sno4())
						, toDispGUIIndex(r)));
			}
			return msgL;
		}

		/**
		 * 締処理提供サービスの締日チェックを行う。
		 */
		protected void callClServiceChk03(MCList<Chk02_RsltR> notErrL) {
			MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();
			addAll(ope.up0(), notErrL, createMap_Cl_Chk03_CndR_Chk02_RsltR());
			ope.exec();
			copyErrFlg(notErrL, ope.down0());
		}

		protected Map_Cl_Chk03_CndR_Chk02_RsltR<Cl_Chk03_CndR,Chk02_RsltR> createMap_Cl_Chk03_CndR_Chk02_RsltR() {
			return new Map_Cl_Chk03_CndR_Chk02_RsltR<Cl_Chk03_CndR, Chk02_RsltR>();
		}

		public class Map_Cl_Chk03_CndR_Chk02_RsltR<D extends Cl_Chk03_CndR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(Cl_Chk03_CndR.$ac_dt, Chk02_RsltR.$ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$loc_cd, Chk02_RsltR.$loc_cd);
				addColumnPathMap(Cl_Chk03_CndR.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, Chk02_RsltR.$itm_sub3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.stk_cls_chk_flg(true);
				dest.io_lmt_skip_flg(false);
			}
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 期限再検査予定を取り消す前に、チェックを実行する<br>
	 */
	public class Chk03 extends MSBFL_LotInspSchdReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査予定の更新カウンタチェック
			msgL.addAll(chkInspSchdUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			MCList<Chk03_RsltR> notErrL = getChkList(up0());

			// ＤＡＣチェック
			msgL.addAll(checkWritableLocCdDac(notErrL, Chk03_RsltR.$loc_cd));

			// 取消可能チェック
			msgL.addAll(chkMain(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInspSchdUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_INSP_SCHD_R> selectL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.addOrderByAsc(t.insp_schd_no);
			dbSelectKeyForUpdateNoWait("MSBFL0010_MST_INSP_SCHD_S02", selectL, selectL_bldr, up0());

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			for (Chk03_RsltR r : up0()) {
				MST_INSP_SCHD_R selectR = selectL.getFirst(idxkey, r.insp_schd_no());
				msgL.addAll(checkUpdCntrNE(r, Chk03_RsltR.$upd_cntr, selectR));

				// データ補完
				if (!isNull(selectR)) {
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, selectR.itm_sub3(), r));
					}
					r.insp_typ(selectR.insp_typ());
					r.vld_up_flg(selectR.lmt_up_flg());
					r.lot_no(selectR.lot_no());
					r.sublot_no(selectR.sublot_no());
					r.insp_freq(selectR.insp_freq());
					r.loc_cd(selectR.loc_cd());
				}
			}

			return msgL;
		}

		/**
		 * 取消可能チェックを実行する。
		 * 
		 * @param upL チェック対象
		 */
		protected MCMessageList chkMain(MCList<Chk03_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk03_RsltR upR : upL) {
				if (!upR.insp_freq().eq(MCNumber.ONE)) {
					msgL.add(new MCMessage(upR, null, MSBFL0018, 
						upR.insp_schd_no(), toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}
	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 在庫再検査予定を取り消す前に、チェックを実行する<br>
	 */
	public class Chk04 extends MSBFL_LotInspSchdReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk04_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callClServiceChk03(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査予定の更新カウンタチェック
			msgL.addAll(chkInspSchdUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk04_RsltR> notErrL = getChkList(up0());

			// ＤＡＣチェック
			msgL.addAll(checkWritableLocCdDac(notErrL, Chk04_RsltR.$loc_cd));
			
			// 取消可能チェック
			msgL.addAll(chkMain(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInspSchdUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_INSP_SCHD_R> selectL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.addOrderByAsc(t.insp_schd_no);
			dbSelectKeyForUpdateNoWait("MSBFL0010_MST_INSP_SCHD_S03", selectL, selectL_bldr, up0());

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			for (Chk04_RsltR r : up0()) {
				MST_INSP_SCHD_R selectR = selectL.getFirst(idxkey, r.insp_schd_no());
				msgL.addAll(checkUpdCntrNE(r, Chk04_RsltR.$upd_cntr, selectR));

				// データ補完
				if (!isNull(selectR)) {
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, selectR.itm_sub3(), r));
					}
					r.insp_typ(selectR.insp_typ());
					r.insp_schd_sts_typ(selectR.insp_schd_sts_typ());
					r.vld_up_flg(selectR.lmt_up_flg());
					r.lot_no(selectR.lot_no());
					r.sublot_no(selectR.sublot_no());
					r.loc_cd(selectR.loc_cd());
				}
			}

			return msgL;
		}

		/**
		 * 取消可能チェックを実行する。
		 * 
		 * @param upL チェック対象
		 */
		protected MCMessageList chkMain(MCList<Chk04_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk04_RsltR upR : upL) {
				if (!MSC_INSP_TYP.isLOT(upR.insp_typ())) {
					msgL.add(new MCMessage(upR, null, MSBFL0019, 
						upR.insp_schd_no(), toDispGUIIndex(upR)));
				}
				if (!MSC_INSP_STS_TYP.isYET(upR.insp_schd_sts_typ())) {
					msgL.add(new MCMessage(upR, null, MSBFL0020, 
						upR.insp_schd_no(), toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}

		/**
		 * 締処理提供サービスの締日チェックを行う。
		 */
		protected void callClServiceChk03(MCList<Chk04_RsltR> notErrL) {
			MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();
			addAll(ope.up0(), notErrL, createMap_Cl_Chk03_CndR_Chk04_RsltR());
			ope.exec();
			copyErrFlg(notErrL, ope.down0());
		}
		
		protected Map_Cl_Chk03_CndR_Chk04_RsltR<Cl_Chk03_CndR,Chk04_RsltR> createMap_Cl_Chk03_CndR_Chk04_RsltR() {
			return new Map_Cl_Chk03_CndR_Chk04_RsltR<Cl_Chk03_CndR, Chk04_RsltR>();
		}

		public class Map_Cl_Chk03_CndR_Chk04_RsltR<D extends Cl_Chk03_CndR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, Chk04_RsltR.$peg_no);
				addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, Chk04_RsltR.$can_ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$old_loc_cd, Chk04_RsltR.$loc_cd);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_cd, Chk04_RsltR.$itm_cd);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub1, Chk04_RsltR.$itm_sub1);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub2, Chk04_RsltR.$itm_sub2);
				addColumnPathMap(Cl_Chk03_CndR.$old_itm_sub3, Chk04_RsltR.$itm_sub3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.stk_cls_chk_flg(true);
				dest.io_lmt_skip_flg(false);
			}
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 期限再検査予定の登録を行う<br>
	 */
	public class Ins01 extends MSBFL_LotInspSchdReg_MC_A.Ins01 {
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

			// 前チェック処理
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				// データ補完、品目品管マスタチェック
				compData(notErrL);
				
				notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
				if (notErrL.size() != 0) {
					// 手配ＮＯ１～４管理区分の補完
					compMstInfo(notErrL);

					// 検査予定登録
					insInspSchdL(notErrL);
				}
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
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
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
			MSBFL_LotInspSchdReg.Chk01 ope = MSBFL_LotInspSchdReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * データ補完
		 * 
		 * @param notErrL
		 */
		protected void compData(MCList<Chk01_RsltR> notErrL) {
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);

			addAll(cndL, notErrL, createMap_InspSchd_Srch01_CndR_Chk01_RsltR());
			MCList<InspSchd_Srch01_CndR> mstL = callInspSchdService(cndL);
			MCIndexKey mstKey = mstL.createIndex(InspSchd_Srch01_CndR.$peg_no);
			
			for(Chk01_RsltR r : notErrL) {
				InspSchd_Srch01_CndR mstR = mstL.getFirst(mstKey, r.peg_no());
				// 品目品管マスタが取得できない場合は、エラー
				if (isNull(mstR)) {
					r.err_flg(true);
					MCMessagePool.add(new MCMessage(r, null, MSBFL0111,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
									r.itm_sub3()),
							MAC_STR.NULL_VAL.value(), MAC_STR.NULL_VAL.value(),
							MAC_STR.NULL_VAL.value(), toYMDString(r.st_tm()),
							toDispGUIIndex(r)));
				}
				else {
					r.insp_mtd_typ(mstR.insp_mtd_typ());
					r.smpl_schd_qty(mstR.spl_qty());
					r.insp_bind_typ(mstR.insp_bind_typ());
				}
			}
		}

		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		/**
		 * 手配ＮＯ１～４管理区分を補完する。
		 * @param notErrL
		 */
		protected void compMstInfo(MCList<Chk01_RsltR> notErrL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmDbcL_bldr = MCQueryApiBuilder.create(t);
			itmDbcL_bldr.setSelect(t.sno1_mng_typ);
			itmDbcL_bldr.addSelect(t.sno2_mng_typ);
			itmDbcL_bldr.addSelect(t.sno3_mng_typ);
			itmDbcL_bldr.addSelect(t.sno4_mng_typ);

			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmDbcL_bldr, notErrL,
					Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3);

			for (Chk01_RsltR r : notErrL) {
				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());

				if (!isNull(itmR)) {
					r.sno1_mng_typ(itmR.sno1_mng_typ());
					r.sno2_mng_typ(itmR.sno2_mng_typ());
					r.sno3_mng_typ(itmR.sno3_mng_typ());
					r.sno4_mng_typ(itmR.sno4_mng_typ());
				}
			}
		}

		/**
		 * 検査予定を登録する。
		 * 
		 * @param notErrL
		 */
		protected void insInspSchdL(MCList<Chk01_RsltR> notErrL) {
			MCList<MST_INSP_SCHD_R> insL = MCList.create(MST_INSP_SCHD_R.class);

			addAll(insL, notErrL, createMap_MST_INSP_SCHD_R_Chk01_RsltR());

			if (!insL.isEmpty()) {

				setInspSchdNo(insL);

				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
				dbInsertEx("MSBFL0010_MST_INSP_SCHD_I01", insL, insL_bldr);
			}
		}

		/**
		 * 検査予定ＮＯを発番する。
		 * @param insL
		 */
		protected void setInspSchdNo(MCList<MST_INSP_SCHD_R> insL) {
			for (MST_INSP_SCHD_R r : insL) {
				r.insp_schd_no(getStrSeq(MSC_NUM_SYS_TYP.INSPS));
				r.org_insp_schd_no(r.insp_schd_no());
			}
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
			List<MCList<Chk01_RsltR>> ret = new ArrayList<>();

			MCList<Chk01_RsltR>[] grpL = list.groupList(Chk01_RsltR.$itm_cd
					, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3);
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
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk01_RsltR> l) {
			dbTran().commit();

			// ここの処理は更新が正常終了した場合に実行される想定。
			// 一覧登録訂正ではチェック処理でerr_flgがオフの行のみ更新処理を実行するため、err_flgがオフの行のみ処理結果状況区分をOKに設定する。
			// なお、err_flgがオンの行の処理結果状況区分はチェックロジックの中で、共通処理として設定されているため、ここでは設定しない。
			for (Chk01_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk01_RsltR> l) {
			dbTran().rollback();
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

		protected Map_InspSchd_Srch01_CndR_Chk01_RsltR<InspSchd_Srch01_CndR,Chk01_RsltR> createMap_InspSchd_Srch01_CndR_Chk01_RsltR() {
			return new Map_InspSchd_Srch01_CndR_Chk01_RsltR<InspSchd_Srch01_CndR, Chk01_RsltR>();
		}

		public class Map_InspSchd_Srch01_CndR_Chk01_RsltR<D extends InspSchd_Srch01_CndR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, Chk01_RsltR.$st_tm);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, Chk01_RsltR.$loc_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.insp_typ(MSC_INSP_TYP.LOT.value());
				dest.no_insp_srch_flg(true);
			}
		}

		protected Map_MST_INSP_SCHD_R_Chk01_RsltR<MST_INSP_SCHD_R,Chk01_RsltR> createMap_MST_INSP_SCHD_R_Chk01_RsltR() {
			return new Map_MST_INSP_SCHD_R_Chk01_RsltR<MST_INSP_SCHD_R, Chk01_RsltR>();
		}

		public class Map_MST_INSP_SCHD_R_Chk01_RsltR<D extends MST_INSP_SCHD_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_INSP_SCHD_R.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MST_INSP_SCHD_R.$loc_cd, Chk01_RsltR.$loc_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$str_ln_cd, Chk01_RsltR.$str_ln_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$stk_arrv_bp_cd, Chk01_RsltR.$stk_arrv_bp_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$gd_cd, Chk01_RsltR.$gd_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$quality_typ, Chk01_RsltR.$quality_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$stk_insp_typ, Chk01_RsltR.$stk_insp_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$stk_id_typ, Chk01_RsltR.$stk_id_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$stk_bp_cd, Chk01_RsltR.$stk_bp_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$lot_no, Chk01_RsltR.$lot_no);
				addColumnPathMap(MST_INSP_SCHD_R.$sublot_no, Chk01_RsltR.$sublot_no);
				addColumnPathMap(MST_INSP_SCHD_R.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(MST_INSP_SCHD_R.$sno1_mng_typ, Chk01_RsltR.$sno1_mng_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(MST_INSP_SCHD_R.$sno2_mng_typ, Chk01_RsltR.$sno2_mng_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(MST_INSP_SCHD_R.$sno3_mng_typ, Chk01_RsltR.$sno3_mng_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(MST_INSP_SCHD_R.$sno4_mng_typ, Chk01_RsltR.$sno4_mng_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$bp_lot_no, Chk01_RsltR.$bp_lot_no);
				addColumnPathMap(MST_INSP_SCHD_R.$master_dt, Chk01_RsltR.$st_tm);
				addColumnPathMap(MST_INSP_SCHD_R.$st_tm, Chk01_RsltR.$st_tm);
				addColumnPathMap(MST_INSP_SCHD_R.$end_tm, Chk01_RsltR.$end_tm);
				addColumnPathMap(MST_INSP_SCHD_R.$pack_unit_cd, Chk01_RsltR.$pack_unit_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$insp_mtd_typ, Chk01_RsltR.$insp_mtd_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$smpl_schd_qty, Chk01_RsltR.$smpl_schd_qty);
				addColumnPathMap(MST_INSP_SCHD_R.$insp_bind_typ, Chk01_RsltR.$insp_bind_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$insp_cnt_rmrks, Chk01_RsltR.$insp_cnt_rmrks);
				addColumnPathMap(MST_INSP_SCHD_R.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(MST_INSP_SCHD_R.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(MST_INSP_SCHD_R.$sub_char3, Chk01_RsltR.$sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.insp_typ(MSC_INSP_TYP.LOT.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.latest_flg(true);
				dest.insp_freq(MCNumber.ONE);
				dest.lmt_up_flg(true);
				dest.sppl_cd(MAC_STR.NULL_VAL.value());
				dest.maker_cd(MAC_STR.NULL_VAL.value());
				dest.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				dest.from_site_cd(MAC_STR.NULL_VAL.value());
				dest.insp_schd_sts_typ(MSC_INSP_STS_TYP.YET.value());
				dest.pack_unit_qty(src.pack_insp_qty());
				dest.base_unit_qty(src.base_unit_insp_qty());
			}
		}
	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 在庫再検査予定の登録を行う<br>
	 */
	public class Ins02 extends MSBFL_LotInspSchdReg_MC_A.Ins02 {
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

			// 前チェック処理
			callThisChk02();

			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// データ補完
				compData(notErrL);

				// 手配ＮＯ１～４管理区分の補完
				compMstInfo(notErrL);

				// 検査予定登録
				insInspSchdL(notErrL);
				
				// ロット管理情報の更新
				callLotServiceUpd05(notErrL);
				
				// 受払実績の作成
				callIoActServiceIns01(notErrL);

				// 受払実績の更新
				callIoActServiceUpd01();
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk02_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk02_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_RsltR> up0L = ((MCList<Chk02_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());
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
			MSBFL_LotInspSchdReg.Chk02 ope = MSBFL_LotInspSchdReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * データ補完
		 * 
		 * @param notErrL
		 */
		protected void compData(MCList<Chk02_RsltR> notErrL) {
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);

			addAll(cndL, notErrL, createMap_InspSchd_Srch01_CndR_Chk02_RsltR());
			MCList<InspSchd_Srch01_CndR> mstL = callInspSchdService(cndL);

			String[] destCols = new String[] {Chk01_RsltR.$insp_mtd_typ, Chk01_RsltR.$smpl_schd_qty, Chk01_RsltR.$insp_bind_typ};
			String[] srcCols = new String[] {InspSchd_Srch01_CndR.$insp_mtd_typ, InspSchd_Srch01_CndR.$spl_qty, InspSchd_Srch01_CndR.$insp_bind_typ};
			copyByPegNo(notErrL, destCols, mstL, srcCols);

			// 基準単位検査数の換算
			convToBaseUnitQty(notErrL);
		}

		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		/**
		 * 手配ＮＯ１～４管理区分を補完する。
		 * @param notErrL
		 */
		protected void compMstInfo(MCList<Chk02_RsltR> notErrL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmDbcL_bldr = MCQueryApiBuilder.create(t);
			itmDbcL_bldr.setSelect(t.sno1_mng_typ);
			itmDbcL_bldr.addSelect(t.sno2_mng_typ);
			itmDbcL_bldr.addSelect(t.sno3_mng_typ);
			itmDbcL_bldr.addSelect(t.sno4_mng_typ);

			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmDbcL_bldr, notErrL,
					Chk02_RsltR.$itm_cd, Chk02_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub2, Chk02_RsltR.$itm_sub3);


			for (Chk02_RsltR r : notErrL) {
				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());

				if (!isNull(itmR)) {
					r.sno1_mng_typ(itmR.sno1_mng_typ());
					r.sno2_mng_typ(itmR.sno2_mng_typ());
					r.sno3_mng_typ(itmR.sno3_mng_typ());
					r.sno4_mng_typ(itmR.sno4_mng_typ());
				}
			}
		}

		/**
		 * 基準単位検査数を変換する。
		 * 
		 */
		protected void convToBaseUnitQty(MCList<Chk02_RsltR> notErrL) {
			MCList<MAVM_ITM_UNIT_R> itmUnitBindL = MCList.create(MAVM_ITM_UNIT_R.class);
			MCList<MAM_ITM_R> itmBindL = MCList.create(MAM_ITM_R.class);

			for (Chk02_RsltR r : notErrL) {
				MAVM_ITM_UNIT_R itmUnitBindR = MAVM_ITM_UNIT_R.create();
				MAM_ITM_R itmBindR = MAM_ITM_R.create();
				
				itmUnitBindR.itm_cd(r.itm_cd());
				itmUnitBindR.itm_sub1(r.itm_sub1());
				itmUnitBindR.itm_sub2(r.itm_sub2());
				itmUnitBindR.itm_sub3(r.itm_sub3());
				itmUnitBindR.unit_cd(r.pack_unit_cd());
				itmUnitBindL.add(itmUnitBindR);
				
				itmBindR.itm_cd(r.itm_cd());
				itmBindR.itm_sub1(r.itm_sub1());
				itmBindR.itm_sub2(r.itm_sub2());
				itmBindR.itm_sub3(r.itm_sub3());
				itmBindL.add(itmBindR);
			}
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(MAM_ITM_R.create("T"));
			dbSelectKey("MSBFL0010_MAM_ITM_S01", itmL, itmL_bldr, itmBindL);

			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
			MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(MAVM_ITM_UNIT_R.create("T"));
			dbSelectColumn("MSBFL0010_MAVM_ITM_UNIT_S01",
					itmUnitL, itmUnitL_bldr, itmUnitBindL,
					MAVM_ITM_UNIT_R.$itm_cd, MAVM_ITM_UNIT_R.$itm_sub1,
					MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3,
					MAVM_ITM_UNIT_R.$unit_cd);

			MCIndexKey itmIdxkey = itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
			MCIndexKey idxkey = itmUnitL.createIndex(MAVM_ITM_UNIT_R.$itm_cd,
					MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2, MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
			for (Chk02_RsltR r : notErrL) {
				MAM_ITM_R itmR = itmL.getFirst(itmIdxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (!isNull(itmR)) {
					r.base_dec_place(itmR.dec_place());
					r.base_unit_rnd_typ(itmR.rnd_typ());
				}
				MAVM_ITM_UNIT_R itmUnitR = itmUnitL.getFirst(idxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.pack_unit_cd());
				if (!isNull(itmUnitR)) {
					r.pack_dmn_qty(itmUnitR.conv_base_qty());
					r.pack_conv_qty(itmUnitR.conv_qty());
				}

				r.base_unit_insp_qty(convToBaseUnit(r.pack_insp_qty(), r.pack_dmn_qty(), r.pack_conv_qty(), r.base_dec_place(),
						r.base_unit_rnd_typ()));
			}
		}

		/**
		 * 検査予定を登録する。
		 * 
		 * @param notErrL
		 */
		protected void insInspSchdL(MCList<Chk02_RsltR> notErrL) {
			MCList<MST_INSP_SCHD_R> insL = MCList.create(MST_INSP_SCHD_R.class);

			// 検査予定ＮＯの発番
			setInspSchdNo();

			addAll(insL, notErrL, createMap_MST_INSP_SCHD_R_Chk02_RsltR());

			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_INSP_SCHD_R.create("T"));
				dbInsertEx("MSBFL0010_MST_INSP_SCHD_I02", insL, insL_bldr);
			}
		}

		/**
		 * 検査予定ＮＯを発番する。
		 * @param insL
		 */
		protected void setInspSchdNo() {
			for (Chk02_RsltR r : up0()) {
				r.insp_schd_no(getStrSeq(MSC_NUM_SYS_TYP.INSPS));
			}
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callLotServiceUpd05(MCList<Chk02_RsltR> notErrL) {
			MSBFL_LotService.Lot_Upd05 upd = MSBFL_LotService.crtLot_Upd05();

			addAll(upd.up0(), notErrL, createMap_Lot_Upd05_CndR_Chk02_RsltR());

			upd.exec();
		}

		/**
		 * 受払実績サービスの受払実績WK作成を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callIoActServiceIns01(MCList<Chk02_RsltR> notErrL) {
			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();

			addAll(ope.up0(), notErrL, createMap_IoAct_Ins01_DtlR_Chk02_RsltR_GR());
			addAll(ope.up0(), notErrL, createMap_IoAct_Ins01_DtlR_Chk02_RsltR_GI());

			ope.up0().setValueNE(IoAct_Ins01_DtlR.$trd_cd, MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.REINSP.value()));

			ope.exec();
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk02_RsltR>> splitUp(MCList<Chk02_RsltR> list, int max) {
			List<MCList<Chk02_RsltR>> ret = new ArrayList<>();

			MCList<Chk02_RsltR>[] grpL = list.groupList(Chk02_RsltR.$itm_cd
					, Chk02_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub2, Chk02_RsltR.$itm_sub3);
			MCList<Chk02_RsltR> tmp = MCList.create(Chk02_RsltR.class);
			for (MCList<Chk02_RsltR> grp : grpL) {
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

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk02_RsltR> l) {
			dbTran().commit();

			// ここの処理は更新が正常終了した場合に実行される想定。
			// 一覧登録訂正ではチェック処理でerr_flgがオフの行のみ更新処理を実行するため、err_flgがオフの行のみ処理結果状況区分をOKに設定する。
			// なお、err_flgがオンの行の処理結果状況区分はチェックロジックの中で、共通処理として設定されているため、ここでは設定しない。
			for (Chk02_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk02_RsltR> l) {
			dbTran().rollback();
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

		protected Map_InspSchd_Srch01_CndR_Chk02_RsltR<InspSchd_Srch01_CndR,Chk02_RsltR> createMap_InspSchd_Srch01_CndR_Chk02_RsltR() {
			return new Map_InspSchd_Srch01_CndR_Chk02_RsltR<InspSchd_Srch01_CndR, Chk02_RsltR>();
		}

		public class Map_InspSchd_Srch01_CndR_Chk02_RsltR<D extends InspSchd_Srch01_CndR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Chk02_RsltR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch01_CndR.$base_dt, Chk02_RsltR.$st_tm);
				addColumnPathMap(InspSchd_Srch01_CndR.$to_loc_cd, Chk02_RsltR.$loc_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.insp_typ(MSC_INSP_TYP.LOT.value());
			}
		}

		protected Map_Lot_Upd05_CndR_Chk02_RsltR<Lot_Upd05_CndR,Chk02_RsltR> createMap_Lot_Upd05_CndR_Chk02_RsltR() {
			return new Map_Lot_Upd05_CndR_Chk02_RsltR<Lot_Upd05_CndR, Chk02_RsltR>();
		}

		public class Map_Lot_Upd05_CndR_Chk02_RsltR<D extends Lot_Upd05_CndR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd05_CndR.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub3, Chk02_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Upd05_CndR.$lot_no, Chk02_RsltR.$lot_no);
				addColumnPathMap(Lot_Upd05_CndR.$sublot_no, Chk02_RsltR.$sublot_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.insp_typ(MSC_INSP_TYP.LOT.value());
				dest.lmt_up_flg(false);
				dest.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
				dest.lot_insp_schd_flg(true);
			}
		}

		protected Map_MST_INSP_SCHD_R_Chk02_RsltR<MST_INSP_SCHD_R,Chk02_RsltR> createMap_MST_INSP_SCHD_R_Chk02_RsltR() {
			return new Map_MST_INSP_SCHD_R_Chk02_RsltR<MST_INSP_SCHD_R, Chk02_RsltR>();
		}

		public class Map_MST_INSP_SCHD_R_Chk02_RsltR<D extends MST_INSP_SCHD_R, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_INSP_SCHD_R.$insp_schd_no, Chk02_RsltR.$insp_schd_no);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_sub3, Chk02_RsltR.$itm_sub3);
				addColumnPathMap(MST_INSP_SCHD_R.$loc_cd, Chk02_RsltR.$loc_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$str_ln_cd, Chk02_RsltR.$str_ln_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$stk_arrv_bp_cd, Chk02_RsltR.$stk_arrv_bp_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$gd_cd, Chk02_RsltR.$gd_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$quality_typ, Chk02_RsltR.$quality_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$stk_insp_typ, Chk02_RsltR.$stk_insp_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$stk_id_typ, Chk02_RsltR.$stk_id_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$stk_bp_cd, Chk02_RsltR.$stk_bp_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$lot_no, Chk02_RsltR.$lot_no);
				addColumnPathMap(MST_INSP_SCHD_R.$sublot_no, Chk02_RsltR.$sublot_no);
				addColumnPathMap(MST_INSP_SCHD_R.$sno1, Chk02_RsltR.$sno1);
				addColumnPathMap(MST_INSP_SCHD_R.$sno1_mng_typ, Chk02_RsltR.$sno1_mng_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$sno2, Chk02_RsltR.$sno2);
				addColumnPathMap(MST_INSP_SCHD_R.$sno2_mng_typ, Chk02_RsltR.$sno2_mng_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$sno3, Chk02_RsltR.$sno3);
				addColumnPathMap(MST_INSP_SCHD_R.$sno3_mng_typ, Chk02_RsltR.$sno3_mng_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$sno4, Chk02_RsltR.$sno4);
				addColumnPathMap(MST_INSP_SCHD_R.$sno4_mng_typ, Chk02_RsltR.$sno4_mng_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$bp_lot_no, Chk02_RsltR.$bp_lot_no);
				addColumnPathMap(MST_INSP_SCHD_R.$master_dt, Chk02_RsltR.$st_tm);
				addColumnPathMap(MST_INSP_SCHD_R.$st_tm, Chk02_RsltR.$st_tm);
				addColumnPathMap(MST_INSP_SCHD_R.$end_tm, Chk02_RsltR.$end_tm);
				addColumnPathMap(MST_INSP_SCHD_R.$pack_unit_qty, Chk02_RsltR.$pack_insp_qty);
				addColumnPathMap(MST_INSP_SCHD_R.$pack_unit_cd, Chk02_RsltR.$pack_unit_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$base_unit_qty, Chk02_RsltR.$base_unit_insp_qty);
				addColumnPathMap(MST_INSP_SCHD_R.$base_unit_cd, Chk02_RsltR.$base_unit_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$insp_mtd_typ, Chk02_RsltR.$insp_mtd_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$smpl_schd_qty, Chk02_RsltR.$smpl_schd_qty);
				addColumnPathMap(MST_INSP_SCHD_R.$insp_bind_typ, Chk02_RsltR.$insp_bind_typ);
				addColumnPathMap(MST_INSP_SCHD_R.$ac_dt, Chk02_RsltR.$ac_dt);
				addColumnPathMap(MST_INSP_SCHD_R.$insp_cnt_rmrks, Chk02_RsltR.$insp_cnt_rmrks);
				addColumnPathMap(MST_INSP_SCHD_R.$sub_char1, Chk02_RsltR.$sub_char1);
				addColumnPathMap(MST_INSP_SCHD_R.$sub_char2, Chk02_RsltR.$sub_char2);
				addColumnPathMap(MST_INSP_SCHD_R.$sub_char3, Chk02_RsltR.$sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.org_insp_schd_no(dest.insp_schd_no());
				dest.insp_typ(MSC_INSP_TYP.LOT.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
				dest.latest_flg(true);
				dest.insp_freq(MCNumber.ONE);
				dest.lmt_up_flg(false);
				dest.sppl_cd(MAC_STR.NULL_VAL.value());
				dest.maker_cd(MAC_STR.NULL_VAL.value());
				dest.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				dest.from_site_cd(MAC_STR.NULL_VAL.value());
				dest.insp_schd_sts_typ(MSC_INSP_STS_TYP.YET.value());
			}
		}

		protected Map_IoAct_Ins01_DtlR_Chk02_RsltR_GR<IoAct_Ins01_DtlR,Chk02_RsltR> createMap_IoAct_Ins01_DtlR_Chk02_RsltR_GR() {
			return new Map_IoAct_Ins01_DtlR_Chk02_RsltR_GR<IoAct_Ins01_DtlR, Chk02_RsltR>();
		}

		public class Map_IoAct_Ins01_DtlR_Chk02_RsltR_GR<D extends IoAct_Ins01_DtlR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, Chk02_RsltR.$itm_sub3);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_arrv_bp_cd, Chk02_RsltR.$stk_arrv_bp_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, Chk02_RsltR.$lot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, Chk02_RsltR.$sublot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1, Chk02_RsltR.$sno1);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ, Chk02_RsltR.$sno1_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2, Chk02_RsltR.$sno2);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ, Chk02_RsltR.$sno2_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3, Chk02_RsltR.$sno3);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ, Chk02_RsltR.$sno3_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4, Chk02_RsltR.$sno4);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ, Chk02_RsltR.$sno4_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$fix_no_typ, Chk02_RsltR.$fix_no_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$fix_no, Chk02_RsltR.$fix_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$in_xfr_typ, Chk02_RsltR.$in_xfr_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, Chk02_RsltR.$quality_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_id_typ, Chk02_RsltR.$stk_id_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_bp_cd, Chk02_RsltR.$stk_bp_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd, Chk02_RsltR.$pack_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, Chk02_RsltR.$base_unit_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.ac_dt(src.ac_dt());
				dest.act_tm(src.ac_dt());
				dest.act_no(src.insp_schd_no());
				dest.trd_cd();
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.REINSP.value());
				dest.trn_typ(MSC_TRN_TYP.INSP_SCHD.value());
				dest.gr_wg_cd(src.wg_cd());
				dest.stk_mng_typ(src.stk_mng_typ());
				dest.gr_loc_cd(src.loc_cd());
				dest.gr_str_ln_cd(src.str_ln_cd());
				dest.fix_no_typ(MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
				dest.fix_no(src.insp_schd_no());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.YET.value());
				dest.gr_gd_cd(src.gd_cd());
				dest.trd_unit_cd(src.pack_unit_cd());
				dest.trd_unit_qty(src.pack_insp_qty());
				dest.pack_unit_qty(src.pack_insp_qty());
				dest.base_unit_qty(src.base_unit_insp_qty());
				dest.io_typ(MSC_IO_TYP.GR.value());
			}
		}

		protected Map_IoAct_Ins01_DtlR_Chk02_RsltR_GI<IoAct_Ins01_DtlR,Chk02_RsltR> createMap_IoAct_Ins01_DtlR_Chk02_RsltR_GI() {
			return new Map_IoAct_Ins01_DtlR_Chk02_RsltR_GI<IoAct_Ins01_DtlR, Chk02_RsltR>();
		}

		public class Map_IoAct_Ins01_DtlR_Chk02_RsltR_GI<D extends IoAct_Ins01_DtlR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, Chk02_RsltR.$itm_sub3);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_arrv_bp_cd, Chk02_RsltR.$stk_arrv_bp_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, Chk02_RsltR.$lot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, Chk02_RsltR.$sublot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1, Chk02_RsltR.$sno1);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ, Chk02_RsltR.$sno1_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2, Chk02_RsltR.$sno2);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ, Chk02_RsltR.$sno2_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3, Chk02_RsltR.$sno3);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ, Chk02_RsltR.$sno3_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4, Chk02_RsltR.$sno4);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ, Chk02_RsltR.$sno4_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$fix_no_typ, Chk02_RsltR.$fix_no_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$fix_no, Chk02_RsltR.$fix_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$in_xfr_typ, Chk02_RsltR.$in_xfr_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, Chk02_RsltR.$quality_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_insp_typ, Chk02_RsltR.$stk_insp_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_id_typ, Chk02_RsltR.$stk_id_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_bp_cd, Chk02_RsltR.$stk_bp_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd, Chk02_RsltR.$pack_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, Chk02_RsltR.$base_unit_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.ac_dt(src.ac_dt());
				dest.act_tm(src.ac_dt());
				dest.act_no(src.insp_schd_no());
				dest.trd_cd();
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.REINSP.value());
				dest.trn_typ(MSC_TRN_TYP.INSP_SCHD.value());
				dest.gi_wg_cd(src.wg_cd());
				dest.stk_mng_typ(src.stk_mng_typ());
				dest.gi_loc_cd(src.loc_cd());
				dest.gi_str_ln_cd(src.str_ln_cd());
				dest.fix_no_typ(src.fix_no_typ());
				dest.fix_no(src.fix_no());
				dest.gi_gd_cd(src.gd_cd());
				dest.trd_unit_cd(src.pack_unit_cd());
				dest.trd_unit_qty(src.pack_insp_qty());
				dest.pack_unit_qty(src.pack_insp_qty());
				dest.base_unit_qty(src.base_unit_insp_qty());
				dest.io_typ(MSC_IO_TYP.GI.value());
				dest.no_gi_alloc_flg(true); //出庫引当確認対象外ＦＬＧはオン（引当確認を行わない）
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 期限再検査予定の取消を行う<br>
	 */
	public class Del01 extends MSBFL_LotInspSchdReg_MC_A.Del01 {
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

			// 前チェック処理
			callThisChk03();

			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				
				// 検査予定削除
				delInspSchdL(notErrL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk03_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk03_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk03_RsltR> up0L = ((MCList<Chk03_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk03_RsltR.$peg_no, up0());
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
			MSBFL_LotInspSchdReg.Chk03 ope = MSBFL_LotInspSchdReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 検査予定情報を削除する。
		 * 
		 * @param notErrL
		 */
		protected void delInspSchdL(MCList<Chk03_RsltR> notErrL) {
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			execDbDeleteKey("MSBFL0010_MST_INSP_SCHD_D01", t, notErrL);
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk03_RsltR>> splitUp(MCList<Chk03_RsltR> list, int max) {
			List<MCList<Chk03_RsltR>> ret = new ArrayList<>();

			MCList<Chk03_RsltR>[] grpL = list.groupList(Chk03_RsltR.$itm_cd
					, Chk03_RsltR.$itm_sub1, Chk03_RsltR.$itm_sub2, Chk03_RsltR.$itm_sub3);
			MCList<Chk03_RsltR> tmp = MCList.create(Chk03_RsltR.class);
			for (MCList<Chk03_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk03_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk03_RsltR> l) {
			dbTran().commit();

			// ここの処理は更新が正常終了した場合に実行される想定。
			// 一覧登録訂正ではチェック処理でerr_flgがオフの行のみ更新処理を実行するため、err_flgがオフの行のみ処理結果状況区分をOKに設定する。
			// なお、err_flgがオンの行の処理結果状況区分はチェックロジックの中で、共通処理として設定されているため、ここでは設定しない。
			for (Chk03_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk03_RsltR> l) {
			dbTran().rollback();
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

		protected Map_Lot_Upd05_CndR_Chk03_RsltR<Lot_Upd05_CndR,Chk03_RsltR> createMap_Lot_Upd05_CndR_Chk03_RsltR() {
			return new Map_Lot_Upd05_CndR_Chk03_RsltR<Lot_Upd05_CndR, Chk03_RsltR>();
		}

		public class Map_Lot_Upd05_CndR_Chk03_RsltR<D extends Lot_Upd05_CndR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd05_CndR.$insp_typ, Chk03_RsltR.$insp_typ);
				addColumnPathMap(Lot_Upd05_CndR.$lmt_up_flg, Chk03_RsltR.$vld_up_flg);
				addColumnPathMap(Lot_Upd05_CndR.$itm_cd, Chk03_RsltR.$itm_cd);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub1, Chk03_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub2, Chk03_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub3, Chk03_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Upd05_CndR.$lot_no, Chk03_RsltR.$lot_no);
				addColumnPathMap(Lot_Upd05_CndR.$sublot_no, Chk03_RsltR.$sublot_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.lot_insp_schd_flg(true);
			}
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 在庫再検査予定の取消を行う<br>
	 */
	public class Del02 extends MSBFL_LotInspSchdReg_MC_A.Del02 {
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

			// 前チェック処理
			callThisChk04();

			MCList<Chk04_RsltR> notErrL = up0().subList(Chk04_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 検査予定削除
				delInspSchdL(notErrL);

				// ロット管理情報の更新
				callLotServiceUpd05(notErrL);

				// 受払実績の削除
				callIoActServiceIns01(notErrL);

				// 受払実績の更新
				callIoActServiceUpd01();
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk04_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk04_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk04_RsltR> up0L = ((MCList<Chk04_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk04_RsltR.$peg_no, up0());
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
		protected void callThisChk04() {
			MSBFL_LotInspSchdReg.Chk04 ope = MSBFL_LotInspSchdReg.crtChk04();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 検査予定情報を削除する。
		 * 
		 * @param notErrL
		 */
		protected void delInspSchdL(MCList<Chk04_RsltR> notErrL) {
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			execDbDeleteKey("MSBFL0010_MST_INSP_SCHD_D02", t, notErrL);
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callLotServiceUpd05(MCList<Chk04_RsltR> notErrL) {
			MSBFL_LotService.Lot_Upd05 upd = MSBFL_LotService.crtLot_Upd05();

			addAll(upd.up0(), notErrL, createMap_Lot_Upd05_CndR_Chk04_RsltR());

			upd.exec();
		}

		/**
		 * 受払実績サービスの受払実績WK作成を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callIoActServiceIns01(MCList<Chk04_RsltR> notErrL) {
			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();

			addAll(ope.up0(), notErrL, createMap_IoAct_Ins01_DtlR_Chk04_RsltR());

			ope.exec();
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk04_RsltR>> splitUp(MCList<Chk04_RsltR> list, int max) {
			List<MCList<Chk04_RsltR>> ret = new ArrayList<>();

			MCList<Chk04_RsltR>[] grpL = list.groupList(Chk04_RsltR.$itm_cd
					, Chk04_RsltR.$itm_sub1, Chk04_RsltR.$itm_sub2, Chk04_RsltR.$itm_sub3);
			MCList<Chk04_RsltR> tmp = MCList.create(Chk04_RsltR.class);
			for (MCList<Chk04_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk04_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk04_RsltR> l) {
			dbTran().commit();

			// ここの処理は更新が正常終了した場合に実行される想定。
			// 一覧登録訂正ではチェック処理でerr_flgがオフの行のみ更新処理を実行するため、err_flgがオフの行のみ処理結果状況区分をOKに設定する。
			// なお、err_flgがオンの行の処理結果状況区分はチェックロジックの中で、共通処理として設定されているため、ここでは設定しない。
			for (Chk04_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk04_RsltR> l) {
			dbTran().rollback();
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
			for (Chk04_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_Lot_Upd05_CndR_Chk04_RsltR<Lot_Upd05_CndR,Chk04_RsltR> createMap_Lot_Upd05_CndR_Chk04_RsltR() {
			return new Map_Lot_Upd05_CndR_Chk04_RsltR<Lot_Upd05_CndR, Chk04_RsltR>();
		}

		public class Map_Lot_Upd05_CndR_Chk04_RsltR<D extends Lot_Upd05_CndR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd05_CndR.$insp_typ, Chk04_RsltR.$insp_typ);
				addColumnPathMap(Lot_Upd05_CndR.$lmt_up_flg, Chk04_RsltR.$vld_up_flg);
				addColumnPathMap(Lot_Upd05_CndR.$itm_cd, Chk04_RsltR.$itm_cd);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub1, Chk04_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub2, Chk04_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub3, Chk04_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Upd05_CndR.$lot_no, Chk04_RsltR.$lot_no);
				addColumnPathMap(Lot_Upd05_CndR.$sublot_no, Chk04_RsltR.$sublot_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.lot_insp_schd_flg(true);
			}
		}

		protected Map_IoAct_Ins01_DtlR_Chk04_RsltR<IoAct_Ins01_DtlR,Chk04_RsltR> createMap_IoAct_Ins01_DtlR_Chk04_RsltR() {
			return new Map_IoAct_Ins01_DtlR_Chk04_RsltR<IoAct_Ins01_DtlR, Chk04_RsltR>();
		}

		public class Map_IoAct_Ins01_DtlR_Chk04_RsltR<D extends IoAct_Ins01_DtlR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.can_ac_dt(src.can_ac_dt());
				dest.act_no(src.insp_schd_no());
				dest.trn_typ(MSC_TRN_TYP.INSP_SCHD.value());
			}
		}
	}

	/**
	 * 検査予定登録サービスの品管関連マスタ取得を呼び出す。
	 * @param cndL 上り電文
	 * @return 品管関連マスタ情報
	 */
	protected MCList<InspSchd_Srch01_CndR> callInspSchdService(MCList<InspSchd_Srch01_CndR> cndL) {

		MSBFL_InspSchdService.InspSchd_Srch01 srch01 = MSBFL_InspSchdService.crtInspSchd_Srch01();

		srch01.up0().setAll(cndL);;

		srch01.exec();

		return srch01.down0();
	}

	/**
	 * 受払実績サービスの受払更新を呼び出す。
	 */
	protected void callIoActServiceUpd01() {
		MSBEL_IoActService.IoAct_Upd01 ope = MSBEL_IoActService.crtIoAct_Upd01();

		ope.exec();
	}

	//FMCB CUSTOM END
}