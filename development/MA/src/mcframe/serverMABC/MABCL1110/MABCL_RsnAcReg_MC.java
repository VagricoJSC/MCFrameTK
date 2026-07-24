package mcframe.serverMABC.MABCL1110;

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
import mcframe.serverMABC.MABCL1110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_RsnAcReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_RsnAcReg_MC extends MABCL_RsnAcReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * RsnAc_UpdChk01オペレーション.<p>
	 *
	 * 会計理由科目設定マスタの登録前のチェックを行います。<br>
	 */
	public class RsnAc_UpdChk01 extends MABCL_RsnAcReg_MC_A.RsnAc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (RsnAc_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (MAC_BP_SET_TYP.isFIX_CST(r.bp_typ()) || MAC_BP_SET_TYP.isFIX_SPL(r.bp_typ())) {
					msgList.addAll(check(r, RsnAc_UpdChk01_DtlR.$bp_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (r.sub_flg() && isNull(r.sub_ac_cd())){
					msgList.add(new MCMessage(r, RsnAc_UpdChk01_DtlR.$ac_cd, MABCL0005, r.ac_cd(), toDispGUIIndex(r)));
				}
				else if (!r.sub_flg() && !isNull(r.sub_ac_cd())) {
					msgList.add(new MCMessage(r, RsnAc_UpdChk01_DtlR.$ac_cd, MABCL0007, r.ac_cd(), toDispGUIIndex(r)));
				}
				
				if (!r.bp_flg() && !MAC_BP_SET_TYP.isNON(r.bp_typ())) {
					msgList.add(new MCMessage(r, RsnAc_UpdChk01_DtlR.$ac_cd, MABCL0008, r.ac_cd(), toDispGUIIndex(r)));
				}
				else if (r.bp_flg() && MAC_BP_SET_TYP.isNON(r.bp_typ())) {
					msgList.add(new MCMessage(r, RsnAc_UpdChk01_DtlR.$ac_cd, MABCL0009, r.ac_cd(), toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * RsnAc_Upd01オペレーション.<p>
	 *
	 * 会計理由科目設定マスタの登録を行います。<br>
	 */
	public class RsnAc_Upd01 extends MABCL_RsnAcReg_MC_A.RsnAc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	
	/**
	 * RsnAc_Del01オペレーション.<p>
	 *
	 * 会計理由科目設定マスタの削除を行います。<br>
	 */
	public class RsnAc_Del01 extends MABCL_RsnAcReg_MC_A.RsnAc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 会計理由科目設定マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_RsnAcReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_RSN_AC_R){
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder,
				MCList<R> result) {
			MAM_ACCOUNT_R account1 = MAM_ACCOUNT_R.create(MAM_RSN_AC_R.$ACCOUNT1);

			result.addBooleanColumn("sub_flg");
			builder.addSelect(account1.sub_flg);

			result.addBooleanColumn("bp_flg");
			builder.addSelect(account1.bp_flg);		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_RSN_AC_R r_src) {

			super.down_SELECT_c0_0(r_dest, r_src);

			r_dest.sub_flg(r_src.getBooleanNE("sub_flg"));
			r_dest.bp_flg(r_src.getBooleanNE("bp_flg"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 会計理由科目設定マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_RsnAcReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 会計理由科目設定マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_RsnAcReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * RsnAc_DelChk01オペレーション.<p>
	 *
	 * 会計理由科目設定マスタの削除前のチェックを行います。<br>
	 */
	public class RsnAc_DelChk01 extends MABCL_RsnAcReg_MC_A.RsnAc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}