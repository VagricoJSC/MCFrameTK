package mcframe.serverMABC.MABCL0600;

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
import mcframe.serverMABC.MABCL0600.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_DlvReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_DlvReg_MC extends MABCL_DlvReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Bp_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタ（納品先関連）の登録前のチェックを行います。<br>
	 */
	public class Bp_UpdChk01 extends MABCL_DlvReg_MC_A.Bp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();
			for (Bp_UpdChk01_DtlR r : up0()) {
				if (isNotCd(r.bp_cd())){
					msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$bp_cd, MABCL0306, 
									getLabel(r, Bp_UpdChk01_DtlR.$bp_cd), r.bp_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (r.tdlv_flg()) {
					msgList.addAll(check(r, Bp_UpdChk01_DtlR.$via_dlv_typ, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (!r.tdlv_flg()) {
					if (!isNull(r.via_dlv_typ())) {
						msgList.add(new MCMessage(r, Bp_UpdChk01_DtlR.$via_dlv_typ, MABCL0153, toDispGUIIndex(r)));
					}
				}
			}
			return msgList;
		}
	}
	/**
	 * Bp_Upd01オペレーション.<p>
	 *
	 * 取引先マスタ（納品先関連）の登録を行います。<br>
	 */
	public class Bp_Upd01 extends MABCL_DlvReg_MC_A.Bp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(
				MCQueryApiBuilder builder, MCList<R> list) {
			super.updDbcCustomize(builder, list);

			builder.removeSet(MAM_BP_R.$all_com_flg);
			builder.removeValues(MAM_BP_R.$all_com_flg);
		}
	}
	/**
	 * BpSub_UpdChk01オペレーション.<p>
	 *
	 * 取引先補助マスタの登録前のチェックを行います。<br>
	 */
	public class BpSub_UpdChk01 extends MABCL_DlvReg_MC_A.BpSub_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpSub_Upd01オペレーション.<p>
	 *
	 * 取引先補助マスタの登録を行います。<br>
	 */
	public class BpSub_Upd01 extends MABCL_DlvReg_MC_A.BpSub_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpLcl_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタ（ロケール別情報）の登録前のチェックを行います。<br>
	 */
	public class BpLcl_UpdChk01 extends MABCL_DlvReg_MC_A.BpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpLcl_Upd01オペレーション.<p>
	 *
	 * 取引先マスタ（ロケール別情報）の登録を行います。<br>
	 */
	public class BpLcl_Upd01 extends MABCL_DlvReg_MC_A.BpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Bp_DelChk01オペレーション.<p>
	 *
	 * 取引先マスタ（納品先関連）の削除前のチェックを行います。<br>
	 */
	public class Bp_DelChk01 extends MABCL_DlvReg_MC_A.Bp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Bp_Del01オペレーション.<p>
	 *
	 * 取引先マスタ（納品先関連）の削除を行います。<br>
	 */
	public class Bp_Del01 extends MABCL_DlvReg_MC_A.Bp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpSub_DelChk01オペレーション.<p>
	 *
	 * 取引先補助マスタの削除前のチェックを行います。<br>
	 */
	public class BpSub_DelChk01 extends MABCL_DlvReg_MC_A.BpSub_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BpSub_Del01オペレーション.<p>
	 *
	 * 取引先補助マスタの削除を行います。<br>
	 */
	public class BpSub_Del01 extends MABCL_DlvReg_MC_A.BpSub_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 取引先マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_DlvReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
			
		}
		protected boolean _foreign;
		protected boolean _dlv_sundry_off;
		protected boolean _dlv_sundry_on;
		protected boolean _tdlv_off;
		protected boolean _tdlv_on;
		
		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			condCustomizeSub((Srch01_CndR) cond);
		}
		
		protected void condCustomizeSub(Srch01_CndR cond){
			_foreign = cond.foreign_flg();
			_dlv_sundry_off = cond.off_dlv_sundry_flg();
			_dlv_sundry_on = cond.on_dlv_sundry_flg();
			_tdlv_off = cond.off_tdlv_flg();
			_tdlv_on = cond.on_tdlv_flg();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if(builder.getBaseDbc() instanceof MAM_BP_R){
				dbcCustomizeSub(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_BP_SUB_R){
				dbcCustomizeSub_BpSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {	

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

			builder.addSelect(bg1.bp_grp_nm.as("bp_grp_nm1"));
			builder.addSelect(bg2.bp_grp_nm.as("bp_grp_nm2"));
			builder.addSelect(bg3.bp_grp_nm.as("bp_grp_nm3"));
			builder.addSelect(bg4.bp_grp_nm.as("bp_grp_nm4"));
			builder.addSelect(bg5.bp_grp_nm.as("bp_grp_nm5"));
			builder.addSelect(bg6.bp_grp_nm.as("bp_grp_nm6"));
			builder.addSelect(bg7.bp_grp_nm.as("bp_grp_nm7"));
			builder.addSelect(bg8.bp_grp_nm.as("bp_grp_nm8"));
			builder.addSelect(bg9.bp_grp_nm.as("bp_grp_nm9"));
			builder.addSelect(bg10.bp_grp_nm.as("bp_grp_nm10"));
			
			MAM_BP_R t = MAM_BP_R.create(builder.getBaseDbcAlias());
			builder.addLeftOuterJoin(bg1, bracket( t.bp_grp_cd1.eq(bg1.bp_grp_cd)
					.and(bg1.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP1.value())))));
			builder.addLeftOuterJoin(bg2, bracket( t.bp_grp_cd2.eq(bg2.bp_grp_cd)
					.and(bg2.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP2.value())))));
			builder.addLeftOuterJoin(bg3, bracket( t.bp_grp_cd3.eq(bg3.bp_grp_cd)
					.and(bg3.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP3.value())))));
			builder.addLeftOuterJoin(bg4, bracket( t.bp_grp_cd4.eq(bg4.bp_grp_cd)
					.and(bg4.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP4.value())))));
			builder.addLeftOuterJoin(bg5, bracket( t.bp_grp_cd5.eq(bg5.bp_grp_cd)
					.and(bg5.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP5.value())))));
			builder.addLeftOuterJoin(bg6, bracket( t.bp_grp_cd6.eq(bg6.bp_grp_cd)
					.and(bg6.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP6.value())))));
			builder.addLeftOuterJoin(bg7, bracket( t.bp_grp_cd7.eq(bg7.bp_grp_cd)
					.and(bg7.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP7.value())))));
			builder.addLeftOuterJoin(bg8, bracket( t.bp_grp_cd8.eq(bg8.bp_grp_cd)
					.and(bg8.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP8.value())))));
			builder.addLeftOuterJoin(bg9, bracket( t.bp_grp_cd9.eq(bg9.bp_grp_cd)
					.and(bg9.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP9.value())))));
			builder.addLeftOuterJoin(bg10, bracket( t.bp_grp_cd10.eq(bg10.bp_grp_cd)
					.and(bg10.bp_grp_typ.eq(value(MAC_BP_GRP_TYP.GRP10.value())))));
			// 国外
			if (_foreign) {
				builder.addWhereWithAnd(t.cntry_cd.neq(bind("1")), getCo().cntry_cd());
			}
			// 納品先諸口
			if (_dlv_sundry_off && ! _dlv_sundry_on) {
				builder.addWhereWithAnd(t.dlv_sundry_flg.eq(value(false)));
			}
			if (!_dlv_sundry_off && _dlv_sundry_on) {
				builder.addWhereWithAnd(t.dlv_sundry_flg.eq(value(true)));
			}
			// 配送先
			if (_tdlv_off && ! _tdlv_on) {
				builder.addWhereWithAnd(t.tdlv_flg.eq(value(false)));
			}
			if (!_tdlv_off && _tdlv_on) {
				builder.addWhereWithAnd(t.tdlv_flg.eq(value(true)));
			}
			builder.addWhereWithCutOffAnd(t.bp_grp_cd1.like(bind(Srch01_CndR.$bp_grp_cd1)));
			builder.addWhereWithCutOffAnd(t.bp_grp_cd2.like(bind(Srch01_CndR.$bp_grp_cd2)));
			builder.addWhereWithCutOffAnd(t.bp_grp_cd3.like(bind(Srch01_CndR.$bp_grp_cd3)));
			builder.addWhereWithCutOffAnd(t.bp_grp_cd4.like(bind(Srch01_CndR.$bp_grp_cd4)));
			builder.addWhereWithCutOffAnd(t.bp_grp_cd5.like(bind(Srch01_CndR.$bp_grp_cd5)));
			builder.addWhereWithCutOffAnd(t.bp_grp_cd6.like(bind(Srch01_CndR.$bp_grp_cd6)));
			builder.addWhereWithCutOffAnd(t.bp_grp_cd7.like(bind(Srch01_CndR.$bp_grp_cd7)));
			builder.addWhereWithCutOffAnd(t.bp_grp_cd8.like(bind(Srch01_CndR.$bp_grp_cd8)));
			builder.addWhereWithCutOffAnd(t.bp_grp_cd9.like(bind(Srch01_CndR.$bp_grp_cd9)));
			builder.addWhereWithCutOffAnd(t.bp_grp_cd10.like(bind(Srch01_CndR.$bp_grp_cd10)));

			builder.addWhereWithCutOffAnd(bg1.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm1)));
			builder.addWhereWithCutOffAnd(bg2.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm2)));
			builder.addWhereWithCutOffAnd(bg3.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm3)));
			builder.addWhereWithCutOffAnd(bg4.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm4)));
			builder.addWhereWithCutOffAnd(bg5.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm5)));
			builder.addWhereWithCutOffAnd(bg6.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm6)));
			builder.addWhereWithCutOffAnd(bg7.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm7)));
			builder.addWhereWithCutOffAnd(bg8.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm8)));
			builder.addWhereWithCutOffAnd(bg9.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm9)));
			builder.addWhereWithCutOffAnd(bg10.bp_grp_nm.like(bind(Srch01_CndR.$bp_grp_nm10)));

			builder.addWhereWithAnd(t.cst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.acst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.rcst_flg.eq(value(false)));
			builder.addWhereWithAnd(t.sppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.asppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.bsppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.psppl_flg.eq(value(false)));
			builder.addWhereWithAnd(t.cred_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dlv_flg.eq(value(true)));
			builder.addWhereWithAnd(t.maker_flg.eq(value(false)));
			builder.addWhereWithAnd(t.dest_flg.eq(value(false)));
		}
		protected void dbcCustomizeSub_BpSub(MCQueryApiBuilder builder) {
			MAM_BP_SUB_R t = MAM_BP_SUB_R.create(builder.getBaseDbcAlias());
			MAW_BP_KEY_R w = MAW_BP_KEY_R.create("w");
			builder.addInnerJoin(w, w.bp_cd.eq(t.bp_cd));
		}
		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_BP_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			// 帳票出力ロケールの名称設定
			putNameNE(r_dest, Srch01_Rslt1R.$prnt_lcl_cd, Srch01_Rslt1R.$prnt_lcl_nm);
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取引先マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_DlvReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			setDefault();
			super.doIt();
		}
		
		protected void setDefault() {			
			for (Bp_UpdChk01_DtlR dtlR : up0()) {
				if(isNull(dtlR.cur_cd())) {
					dtlR.cur_cd(getCo().base_cur_cd());
				}
				
				dtlR.dlv_flg(true);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 取引先マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_DlvReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}