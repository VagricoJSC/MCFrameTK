package mcframe.serverMABC.MABCL0170;

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
import mcframe.serverMABC.MABCL0170.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_IfNtcCtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_IfNtcCtlReg_MC extends MABCL_IfNtcCtlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * IfNtcCtl_UpdChk01オペレーション.<p>
	 *
	 * ＩＦ通知制御マスタを登録する前のチェックを行う<br>
	 */
	public class IfNtcCtl_UpdChk01 extends MABCL_IfNtcCtlReg_MC_A.IfNtcCtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (IfNtcCtl_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				if (isNullOrNullVal(r.module_id()) && !isNullOrNullVal(r.logic_id())) {
					msgList.add(new MCMessage(r, IfNtcCtl_UpdChk01_DtlR.$logic_id, MABCL0313, toDispGUIIndex(r)));
				}
				if (!r.biz_usr_ntc_flg() && !isNull(r.msg_lvl())) {
					msgList.add(new MCMessage(r, IfNtcCtl_UpdChk01_DtlR.$msg_lvl, MABCL0518, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * IfNtcCtl_Upd01オペレーション.<p>
	 *
	 * ＩＦ通知制御マスタを登録する<br>
	 */
	public class IfNtcCtl_Upd01 extends MABCL_IfNtcCtlReg_MC_A.IfNtcCtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void up() {
			compNullVal();
			super.up();
		}
		protected void compNullVal() {
			for (IfNtcCtl_UpdChk01_DtlR r : up0()) {
				if (isNull(r.wg_cd())) {
					r.wg_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.bp_cd())) {
					r.bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
	}
	/**
	 * IfNtc_UpdChk01オペレーション.<p>
	 *
	 * ＩＦ通知先マスタを登録する前のチェックを行う<br>
	 */
	public class IfNtc_UpdChk01 extends MABCL_IfNtcCtlReg_MC_A.IfNtc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * IfNtc_Upd01オペレーション.<p>
	 *
	 * ＩＦ通知先マスタを登録する<br>
	 */
	public class IfNtc_Upd01 extends MABCL_IfNtcCtlReg_MC_A.IfNtc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void up() {
			compNullVal();
			super.up();
		}
		protected void compNullVal() {
			for (IfNtc_UpdChk01_DtlR r : up0()) {
				if (isNull(r.wg_cd())) {
					r.wg_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.bp_cd())) {
					r.bp_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
	}
	/**
	 * IfNtcCtl_DelChk01オペレーション.<p>
	 *
	 * ＩＦ通知制御マスタ、ＩＦ通知先マスタを削除する前のチェックを行う<br>
	 */
	public class IfNtcCtl_DelChk01 extends MABCL_IfNtcCtlReg_MC_A.IfNtcCtl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * IfNtcCtl_Del01オペレーション.<p>
	 *
	 * ＩＦ通知制御マスタ、ＩＦ通知先マスタを削除する<br>
	 */
	public class IfNtcCtl_Del01 extends MABCL_IfNtcCtlReg_MC_A.IfNtcCtl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> list, boolean updChk) {
			
			if (list.createRow() instanceof MAM_IF_NTC_R) {
				// MAM_IF_NTC_に対しdelete を実行
				MAM_IF_NTC_R S0T = MAM_IF_NTC_R.create("T");

				MCDelete q = sql("MABCL0170_MAM_IF_NTC_D01").delete(S0T)
						.where(value(0).eq(value(0))
						.cutoff$and(S0T.module_id.eq(bind("module_id")))
						.cutoff$and(S0T.logic_id.eq(bind("logic_id")))
						.cutoff$and(S0T.wg_cd.eq(bind("wg_cd")))
						.cutoff$and(S0T.bp_cd.eq(bind("bp_cd")))
						.cutoff$and(S0T.usr_cd.eq(bind("usr_cd")))
						.cutoff$and(S0T.st_dt.eq(bind("st_dt")))
						.cutoff$and(S0T.end_dt.eq(bind("end_dt")))
						.cutoff$and(S0T.msg_lvl.eq(bind("msg_lvl")))
						.cutoff$and(S0T.memo1.eq(bind("memo1")))
						.cutoff$and(S0T.memo2.eq(bind("memo2")))
						.cutoff$and(S0T.memo3.eq(bind("memo3")))
						.cutoff$and(S0T.del_usr_id.eq(bind("del_usr_id")))
						.cutoff$and(S0T.del_usr_nm.eq(bind("del_usr_nm")))
						.cutoff$and(S0T.del_ts.eq(bind("del_ts")))
						.cutoff$and(S0T.ins_usr_id.eq(bind("ins_usr_id")))
						.cutoff$and(S0T.ins_usr_nm.eq(bind("ins_usr_nm")))
						.cutoff$and(S0T.ins_ts.eq(bind("ins_ts")))
						.cutoff$and(S0T.ins_func_id.eq(bind("ins_func_id")))
						.cutoff$and(S0T.upd_cntr.eq(bind("upd_cntr")))
						.cutoff$and(S0T.upd_usr_id.eq(bind("upd_usr_id")))
						.cutoff$and(S0T.upd_usr_nm.eq(bind("upd_usr_nm")))
						.cutoff$and(S0T.upd_ts.eq(bind("upd_ts")))
						.cutoff$and(S0T.upd_func_id.eq(bind("upd_func_id")))
						.cutoff$and(S0T.upd_srv_req_no.eq(bind("upd_srv_req_no"))));
				q.executeBatchUpdate(list);
			
			}
			else {
				super.dbLockDelUpdInsByStatusCheck(builder, list, updChk);
			}
		}

	
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABCL_IfNtcCtlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABCL_IfNtcCtlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABCL_IfNtcCtlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected List<String> getSelectLclGrpNames() {
			List<String> l = new ArrayList<String>();
			l.add("SELECT_IF_NTC");
			l.addAll(super.getSelectLclGrpNames());
			return l;
		}

		@Override
		protected List<String> getOtherSelectGrpNames() {
			return new ArrayList<String>();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomizeLcl(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomizeLcl(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_IF_NTC_R) {
				dbcCustomizeLclSub(builder);
			}
		}

		protected void dbcCustomizeLclSub(MCQueryApiBuilder builder) {
			MAM_USR_R usr1 = MAM_USR_R.create("USR1");
			MAM_IF_NTC_R t = MAM_IF_NTC_R.create(builder.getBaseDbcAlias());

			builder.addSelect(usr1.usr_nm);
			builder.addLeftOuterJoin(usr1, t.usr_cd.eq(usr1.usr_cd));
		}

		@Override
		protected void down_SELECT_IF_NTC_c1_0(Srch01_Rslt2R r_dest, MAM_IF_NTC_R r_src) {
			super.down_SELECT_IF_NTC_c1_0(r_dest, r_src);

			putFuncName(r_dest, "ins_func_id", "ins_func_nm") ;
			putFuncName(r_dest, "upd_func_id", "upd_func_nm") ;
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_IF_NTC_CTL_R){
				dbcCustomizeSub(builder);
			}
		}
		protected  void dbcCustomizeSub(MCQueryApiBuilder builder) {
			addJoinTable(builder);
		}
		protected void addJoinTable(MCQueryApiBuilder builder) {
			MAM_BP_GRP_R bg1 = MAM_BP_GRP_R.create("BG1");
			MAM_BP_GRP_R bg2 = MAM_BP_GRP_R.create("BG2");
			MAM_BP_GRP_R bg3 = MAM_BP_GRP_R.create("BG3");
			MAM_BP_GRP_R bg4 = MAM_BP_GRP_R.create("BG4");
			MAM_BP_GRP_R bg5 = MAM_BP_GRP_R.create("BG5");
			MAM_BP_GRP_R bg6 = MAM_BP_GRP_R.create("BG6");
			MAM_BP_GRP_R bg7 = MAM_BP_GRP_R.create("BG7");
			MAM_BP_GRP_R bg8 = MAM_BP_GRP_R.create("BG8");
			MAM_BP_GRP_R bg9 = MAM_BP_GRP_R.create("BG9");
			MAM_BP_GRP_R bg10 = MAM_BP_GRP_R.create("BG10");
			MAM_BP_R bp1 = MAM_BP_R.create("BP1");

			if (!isNull(up0().bp_grp_nm1())) {
				builder.addLeftOuterJoin(bg1, bp1.bp_grp_cd1.eq(bg1.bp_grp_cd)
						.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value()))));
				builder.addWhereWithCutOffAnd(
						bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));
			}
			if (!isNull(up0().bp_grp_nm2())) {
				builder.addLeftOuterJoin(bg2, bp1.bp_grp_cd2.eq(bg2.bp_grp_cd)
						.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value()))));
				builder.addWhereWithCutOffAnd(
						bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));
			}
			if (!isNull(up0().bp_grp_nm3())) {
				builder.addLeftOuterJoin(bg3, bp1.bp_grp_cd3.eq(bg3.bp_grp_cd)
						.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value()))));
				builder.addWhereWithCutOffAnd(
						bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));
			}
			if (!isNull(up0().bp_grp_nm4())) {
				builder.addLeftOuterJoin(bg4, bp1.bp_grp_cd4.eq(bg4.bp_grp_cd)
						.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value()))));
				builder.addWhereWithCutOffAnd(
						bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));
			}
			if (!isNull(up0().bp_grp_nm5())) {
				builder.addLeftOuterJoin(bg5, bp1.bp_grp_cd5.eq(bg5.bp_grp_cd)
						.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value()))));
				builder.addWhereWithCutOffAnd(
						bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));
			}
			if (!isNull(up0().bp_grp_nm6())) {
				builder.addLeftOuterJoin(bg6, bp1.bp_grp_cd6.eq(bg6.bp_grp_cd)
						.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value()))));
				builder.addWhereWithCutOffAnd(
						bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));
			}
			if (!isNull(up0().bp_grp_nm7())) {
				builder.addLeftOuterJoin(bg7, bp1.bp_grp_cd7.eq(bg7.bp_grp_cd)
						.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value()))));
				builder.addWhereWithCutOffAnd(
						bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));
			}
			if (!isNull(up0().bp_grp_nm8())) {
				builder.addLeftOuterJoin(bg8, bp1.bp_grp_cd8.eq(bg8.bp_grp_cd)
						.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value()))));
				builder.addWhereWithCutOffAnd(
						bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));
			}
			if (!isNull(up0().bp_grp_nm9())) {
				builder.addLeftOuterJoin(bg9, bp1.bp_grp_cd9.eq(bg9.bp_grp_cd)
						.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value()))));
				builder.addWhereWithCutOffAnd(
						bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));
			}
			if (!isNull(up0().bp_grp_nm10())) {
				builder.addLeftOuterJoin(bg10, bp1.bp_grp_cd10.eq(bg10.bp_grp_cd)
						.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value()))));
				builder.addWhereWithCutOffAnd(
						bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));
			}

			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd1.like(bind(Srch01_CndR.$bp_grp_cd1)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd2.like(bind(Srch01_CndR.$bp_grp_cd2)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd3.like(bind(Srch01_CndR.$bp_grp_cd3)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd4.like(bind(Srch01_CndR.$bp_grp_cd4)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd5.like(bind(Srch01_CndR.$bp_grp_cd5)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd6.like(bind(Srch01_CndR.$bp_grp_cd6)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd7.like(bind(Srch01_CndR.$bp_grp_cd7)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd8.like(bind(Srch01_CndR.$bp_grp_cd8)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd9.like(bind(Srch01_CndR.$bp_grp_cd9)));
			builder.addWhereWithCutOffAnd(
					bp1.bp_grp_cd10.like(bind(Srch01_CndR.$bp_grp_cd10)));
		}
	}

	//FMCB CUSTOM END
}