package mcframe.serverMABS.MABSL1240;

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
import mcframe.serverMABS.MABSL1240.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.List;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_ScmIfCtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_ScmIfCtlReg_MC extends MABSL_ScmIfCtlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ScmIfCtl_UpdChk01オペレーション.<p>
	 *
	 * ＳＣＭ ＩＦ制御マスタの登録前のチェックを行います。<br>
	 */
	public class ScmIfCtl_UpdChk01 extends MABSL_ScmIfCtlReg_MC_A.ScmIfCtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected IfValidater getReqValidater(String col) {
			if (isSame(col, ScmIfCtl_UpdChk01_DtlR.$loc_cd)) {
				String typNm = ScmIfCtl_UpdChk01_DtlR.$if_proc_typ;
				return new MAUDL_RequiredValidater_Status(r -> MAC_IF_PROC_TYP
						.isMES_YIELD_SCHD_SEND(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_OPER_INST_SEND(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_INPT_SCHD_SEND(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(r.getStringNE(typNm)));
			}
			else if (isSame(col, ScmIfCtl_UpdChk01_DtlR.$ext_sys_cd)) {
				return new MAUDL_RequiredValidater_Status(r -> MAC_IF_PROC_TYP
						.is_send(r.getStringNE(ScmIfCtl_UpdChk01_DtlR.$if_proc_typ)));
			}
			return super.getReqValidater(col);
		}
		@Override
		protected IfValidater getConstExistValidater(String col, MCAppConst[] constArr) {
			// ＩＦ処理区分はＳＣＭ関連の処理かどうをチェックする
			List<MAC_IF_PROC_TYP> l = new ArrayList<MAC_IF_PROC_TYP>();
			for (MAC_IF_PROC_TYP ifProcTyp : MAC_IF_PROC_TYP.array()) {
				if (ifProcTyp.is_scm()) {
					l.add(ifProcTyp);
				}
			}
			if (isSame(col, ScmIfCtl_UpdChk01_DtlR.$if_proc_typ)) {
				return new FXUCL_ConstValidater((MCAppConst[])l.toArray(new MCAppConst[0]));
			}
			return super.getConstExistValidater(col, constArr);
		}
		@Override
		protected IfValidater getOnlyOneInputValidater(String[] cols) {
			String typNm = ScmIfCtl_UpdChk01_DtlR.$if_proc_typ;
			return new MAUDL_OnlyOneInputValidater_NULL_VAL(
					r -> MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(r.getStringNE(typNm))
							|| MAC_IF_PROC_TYP.isWMS_SHIP_ACT_RECV(r.getStringNE(typNm))
							|| MAC_IF_PROC_TYP.isWMS_ARR_SCHD_SEND(r.getStringNE(typNm))
							|| MAC_IF_PROC_TYP.isWMS_ARR_ACT_RECV(r.getStringNE(typNm))
							|| MAC_IF_PROC_TYP.isWMS_XFR_INST_SEND(r.getStringNE(typNm))
							|| MAC_IF_PROC_TYP.isWMS_ACXFR_ACT_RECV(r.getStringNE(typNm))
							|| MAC_IF_PROC_TYP.isWMS_XFR_ACT_RECV(r.getStringNE(typNm)));
		}
		@Override
		protected IfValidater getTooManyInputsValidater(String[] cols) {
			String typNm = ScmIfCtl_UpdChk01_DtlR.$if_proc_typ;
			if (isSame(cols[0], ScmIfCtl_UpdChk01_DtlR.$itm_cd)) {
				return new MAUDL_TooManyInputsValidater_NULL_VAL(r -> MAC_IF_PROC_TYP
						.isMES_YIELD_SCHD_SEND(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_OPER_INST_SEND(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_INPT_SCHD_SEND(r.getStringNE(typNm))
						|| MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(r.getStringNE(typNm)));
			}
			else if (isSame(cols[0], ScmIfCtl_UpdChk01_DtlR.$dlv_cd)) {
				return new MAUDL_TooManyInputsValidater_NULL_VAL(
						r -> MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(r.getStringNE(typNm)));
			}
			return super.getTooManyInputsValidater(cols);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (ScmIfCtl_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				String typ = r.if_proc_typ();

				if (MAC_IF_PROC_TYP.isMES_YIELD_SCHD_SEND(typ)
						|| MAC_IF_PROC_TYP.isMES_YIELD_ACT_RECV(typ)
						|| MAC_IF_PROC_TYP.isMES_OPER_INST_SEND(typ)
						|| MAC_IF_PROC_TYP.isMES_OPER_ACT_RECV(typ)
						|| MAC_IF_PROC_TYP.isMES_INPT_SCHD_SEND(typ)
						|| MAC_IF_PROC_TYP.isMES_INPT_ACT_RECV(typ)
						|| MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(typ)
						|| MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(typ)) {
					if (!isNull(r.lg_grp_cd())) {
						msgList.add(getMsg(r, typ, ScmIfCtl_UpdChk01_DtlR.$lg_grp_cd, MABSL0509));
					}
				}
				if (MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(typ)
						|| MAC_IF_PROC_TYP.isWMS_SHIP_ACT_RECV(typ)
						|| MAC_IF_PROC_TYP.isWMS_ARR_SCHD_SEND(typ)
						|| MAC_IF_PROC_TYP.isWMS_ARR_ACT_RECV(typ)
						|| MAC_IF_PROC_TYP.isWMS_XFR_INST_SEND(typ)
						|| MAC_IF_PROC_TYP.isWMS_ACXFR_ACT_RECV(typ)
						|| MAC_IF_PROC_TYP.isWMS_XFR_ACT_RECV(typ)) {
					if (!isNull(r.itm_cd())) {
						msgList.add(getMsg(r, typ, ScmIfCtl_UpdChk01_DtlR.$itm_cd, MABSL0509));
					}
					if (!isNull(r.oper_cd())) {
						msgList.add(getMsg(r, typ, ScmIfCtl_UpdChk01_DtlR.$oper_cd, MABSL0509));
					}
					if (!isNull(r.wk_cost_cd())) {
						msgList.add(getMsg(r, typ, ScmIfCtl_UpdChk01_DtlR.$wk_cost_cd, MABSL0509));
					}
				}
				if (!MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(typ)) {
					if (!isNull(r.dlv_cd())) {
						msgList.add(getMsg(r, typ, ScmIfCtl_UpdChk01_DtlR.$dlv_cd, MABSL0509));
					}
					if (!isNull(r.gr_loc_cd())) {
						msgList.add(getMsg(r, typ, ScmIfCtl_UpdChk01_DtlR.$gr_loc_cd, MABSL0509));
					}
				}
				if ((MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(typ) || MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(typ)) && isNull(r.loc_cd())) {
					if (!isNull(r.oper_cd()) || !isNull(r.wk_cost_cd())) {
						msgList.add(new MCMessage(r, ScmIfCtl_UpdChk01_DtlR.$loc_cd, MABSL0510, toDispGUIIndex(r)));
					}
				}
				if (MAC_IF_PROC_TYP.isMES_WK_ACT_RECV(typ) || MAC_IF_PROC_TYP.isMES_WK_SCHD_SEND(typ)) {
					if (!isNull(r.itm_cd())) {
						msgList.add(new MCMessage(r, ScmIfCtl_UpdChk01_DtlR.$itm_cd, MABSL0513, toDispGUIIndex(r)));
					}
				}
				if (!MAC_IF_PROC_TYP.is_send(typ) && !isNull(r.ext_sys_cd())) {
					msgList.add(new MCMessage(r, ScmIfCtl_UpdChk01_DtlR.$ext_sys_cd, MABSL0511, toDispGUIIndex(r)));
				}
				if (MAC_IF_PROC_TYP.isWMS_SHIP_INST_SEND(typ) && !isNull(r.gr_loc_cd())) {
					if (isSame(r.loc_lg_grp_cd(), r.gr_loc_lg_grp_cd()) || isSame(r.lg_grp_cd(), r.gr_loc_lg_grp_cd())) {
						msgList.add(new MCMessage(r, ScmIfCtl_UpdChk01_DtlR.$gr_loc_cd, MABSL0512, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
		/** ＩＦ処理区分、項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(ScmIfCtl_UpdChk01_DtlR r, String typ, String col, String id) {
			return new MCMessage(r, col, id, typ, getLabel(r, col), toDispGUIIndex(r));
		}
	}
	/**
	 * ScmIfCtl_Upd01オペレーション.<p>
	 *
	 * ＳＣＭ ＩＦ制御マスタの登録を行います。<br>
	 */
	public class ScmIfCtl_Upd01 extends MABSL_ScmIfCtlReg_MC_A.ScmIfCtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ScmIfCtl_DelChk01オペレーション.<p>
	 *
	 * ＳＣＭ ＩＦ制御マスタの削除前のチェックを行います。<br>
	 */
	public class ScmIfCtl_DelChk01 extends MABSL_ScmIfCtlReg_MC_A.ScmIfCtl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ScmIfCtl_Del01オペレーション.<p>
	 *
	 * ＳＣＭ ＩＦ制御マスタの削除を行います。<br>
	 */
	public class ScmIfCtl_Del01 extends MABSL_ScmIfCtlReg_MC_A.ScmIfCtl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * ＳＣＭ ＩＦ制御マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_ScmIfCtlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
				dbcCustomizeSub(builder);
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			dbcCustomizeCommon(builder);
			
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_SCM_IF_CTL_R.$ITM1);
			MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
			MAM_LOC_R loc2 = MAM_LOC_R.create("LOC2");
			builder.addWhereWithCutOffAnd(itm1.itm_typ.like(bind(Srch01_CndR.$itm_typ)));
			builder.addWhereWithCutOffAnd(itm1.itm_typ_d_cd.like(bind(Srch01_CndR.$itm_typ_d_cd)));
			builder.addWhereWithCutOffAnd(itmtypd1.itm_typ_d_nm.like(bind(Srch01_CndR.$itm_typ_d_nm)));
			builder.addWhereWithCutOffAnd(loc2.loc_nm.like(bind(Srch01_CndR.$gr_loc_nm)));

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

			MAM_BP_R bp1 = MAM_BP_R.create(MAM_SCM_IF_CTL_R.$BP1);
			if(!isNull(up0().dlv_grp_nm1())) {
				MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
				builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
						.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(bg1.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm1)));
			}
			if(!isNull(up0().dlv_grp_nm2())) {
				MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
				builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
						.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(bg2.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm2)));
			}
			if(!isNull(up0().dlv_grp_nm3())) {
				MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
				builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
						.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(bg3.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm3)));
			}
			if(!isNull(up0().dlv_grp_nm4())) {
				MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
				builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
						.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(bg4.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm4)));
			}
			if(!isNull(up0().dlv_grp_nm5())) {
				MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
				builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
						.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(bg5.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm5)));
			}
			if(!isNull(up0().dlv_grp_nm6())) {
				MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
				builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
						.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(bg6.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm6)));
			}
			if(!isNull(up0().dlv_grp_nm7())) {
				MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
				builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
						.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(bg7.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm7)));
			}
			if(!isNull(up0().dlv_grp_nm8())) {
				MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
				builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
						.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(bg8.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm8)));
			}
			if(!isNull(up0().dlv_grp_nm9())) {
				MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
				builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
						.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(bg9.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm9)));
			}
			if(!isNull(up0().dlv_grp_nm10())) {
				MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
				builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
						.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(bg10.bp_grp_nm.like(bind(Srch01_CndR.$dlv_grp_nm10)));
			}
						
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd1.like(bind(Srch01_CndR.$dlv_grp_cd1)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd2.like(bind(Srch01_CndR.$dlv_grp_cd2)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd3.like(bind(Srch01_CndR.$dlv_grp_cd3)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd4.like(bind(Srch01_CndR.$dlv_grp_cd4)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd5.like(bind(Srch01_CndR.$dlv_grp_cd5)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd6.like(bind(Srch01_CndR.$dlv_grp_cd6)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd7.like(bind(Srch01_CndR.$dlv_grp_cd7)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd8.like(bind(Srch01_CndR.$dlv_grp_cd8)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd9.like(bind(Srch01_CndR.$dlv_grp_cd9)));
			builder.addWhereWithCutOffAnd(bp1.bp_grp_cd10.like(bind(Srch01_CndR.$dlv_grp_cd10)));					
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABSL_ScmIfCtlReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder,rslt);
			dbcCustomizeCommon(builder);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ＳＣＭ ＩＦ制御マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABSL_ScmIfCtlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * ＳＣＭ ＩＦ制御マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_ScmIfCtlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		MAM_ITM_TYP_D_R itmtypd1 = MAM_ITM_TYP_D_R.create("ITMTYPD1");
		MAM_LOC_R loc2 = MAM_LOC_R.create("LOC2");
		MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_SCM_IF_CTL_R.$ITM1);
		MAM_SCM_IF_CTL_R t = MAM_SCM_IF_CTL_R.create(builder.getBaseDbcAlias());

		builder.addSelect(itm1.itm_typ);
		builder.addSelect(itm1.itm_typ_d_cd);
		builder.addSelect(itmtypd1.itm_typ_d_nm);
		builder.addSelect(loc2.loc_nm.as("gr_loc_nm"));
		builder.addLeftOuterJoin(itmtypd1, itm1.itm_typ.eq(itmtypd1.itm_typ)
				.and(itm1.itm_typ_d_cd.eq(itmtypd1.itm_typ_d_cd)));
		builder.addLeftOuterJoin(loc2, loc2.loc_cd.eq(t.gr_loc_cd));
	}

	//FMCB CUSTOM END
}