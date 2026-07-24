package mcframe.serverMABC.MABCL1250;

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
import mcframe.serverMABC.MABCL1250.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_SchdPayReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_SchdPayReg_MC extends MABCL_SchdPayReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * SchdPay_UpdChk01オペレーション.<p>
	 *
	 * 支払依頼科目マスタを登録する前のチェックを行う<br>
	 */
	public class SchdPay_UpdChk01 extends MABCL_SchdPayReg_MC_A.SchdPay_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (SchdPay_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}

				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (!r.dpt_id_flg()) {
					msgList.addAll(check(r, SchdPay_UpdChk01_DtlR.$slip_cnt_id, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (r.sub_flg() && isNull(r.sub_ac_cd())){
					msgList.add(new MCMessage(r, SchdPay_UpdChk01_DtlR.$ac_cd, MABCL0005, r.ac_cd(), toDispGUIIndex(r)));
				}
				else if (!r.sub_flg() && !isNull(r.sub_ac_cd())) {
					msgList.add(new MCMessage(r, SchdPay_UpdChk01_DtlR.$ac_cd, MABCL0007, r.ac_cd(), toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * SchdPay_Upd01オペレーション.<p>
	 *
	 * 支払依頼科目マスタを登録する<br>
	 */
	public class SchdPay_Upd01 extends MABCL_SchdPayReg_MC_A.SchdPay_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SchdPay_DelChk01オペレーション.<p>
	 *
	 * 支払依頼科目マスタを削除する前のチェックを行う<br>
	 */
	public class SchdPay_DelChk01 extends MABCL_SchdPayReg_MC_A.SchdPay_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * SchdPay_Del01オペレーション.<p>
	 *
	 * 支払依頼科目マスタを削除する<br>
	 */
	public class SchdPay_Del01 extends MABCL_SchdPayReg_MC_A.SchdPay_Del01 {
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
	public class Srch01 extends MABCL_SchdPayReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_SCHD_PAY_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {

			MAM_SCHD_PAY_R t = MAM_SCHD_PAY_R.create(builder.getBaseDbcAlias());
			MAM_ACCOUNT_R account1 = MAM_ACCOUNT_R.create(MAM_SCHD_PAY_R.$ACCOUNT1);
			MAM_BP_R bp1 = MAM_BP_R.create("BP1");

			builder.addLeftOuterJoin(bp1, bp1.bp_cd.eq(t.asppl_cd));
			builder.addSelect(bp1.bp_nm.as("asppl_nm"));

			rslt.addBooleanColumn("sub_flg");
			builder.addSelect(account1.sub_flg);
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_SCHD_PAY_R r_src) {

			super.down_SELECT_c0_0(r_dest, r_src);

			r_dest.sub_flg(r_src.getBooleanNE("sub_flg"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABCL_SchdPayReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABCL_SchdPayReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}