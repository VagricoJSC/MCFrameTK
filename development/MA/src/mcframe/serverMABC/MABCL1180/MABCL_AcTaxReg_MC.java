package mcframe.serverMABC.MABCL1180;

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
import mcframe.serverMABC.MABCL1180.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_AcTaxReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_AcTaxReg_MC extends MABCL_AcTaxReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AcTax_UpdChk01オペレーション.<p>
	 *
	 * 会計税マスタの登録前のチェックを行います。<br>
	 */
	public class AcTax_UpdChk01 extends MABCL_AcTaxReg_MC_A.AcTax_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (AcTax_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (r.sub_flg()) {
					msgList.addAll(check(r, AcTax_UpdChk01_DtlR.$sub_ac_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (r.sub_flg() && isNull(r.sub_ac_cd())){
					msgList.add(new MCMessage(r, AcTax_UpdChk01_DtlR.$ac_cd, MABCL0005, r.ac_cd(), toDispGUIIndex(r)));
				}
				else if (!r.sub_flg() && !isNull(r.sub_ac_cd())) {
					msgList.add(new MCMessage(r, AcTax_UpdChk01_DtlR.$ac_cd, MABCL0007, r.ac_cd(), toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * AcTax_Upd01オペレーション.<p>
	 *
	 * 会計税マスタの登録を行います。<br>
	 */
	public class AcTax_Upd01 extends MABCL_AcTaxReg_MC_A.AcTax_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcTaxLcl_UpdChk01オペレーション.<p>
	 *
	 * 会計税名称マスタの登録前のチェックを行います。<br>
	 */
	public class AcTaxLcl_UpdChk01 extends MABCL_AcTaxReg_MC_A.AcTaxLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcTaxLcl_Upd01オペレーション.<p>
	 *
	 * 会計税名称マスタの登録を行います。<br>
	 */
	public class AcTaxLcl_Upd01 extends MABCL_AcTaxReg_MC_A.AcTaxLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcTax_DelChk01オペレーション.<p>
	 *
	 * 会計税マスタ、会計税名称マスタの削除前のチェックを行います。<br>
	 */
	public class AcTax_DelChk01 extends MABCL_AcTaxReg_MC_A.AcTax_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AcTax_Del01オペレーション.<p>
	 *
	 * 会計税マスタ、会計税名称マスタの削除を行います。<br>
	 */
	public class AcTax_Del01 extends MABCL_AcTaxReg_MC_A.AcTax_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 会計税マスタ、会計税名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_AcTaxReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			addSelect(builder, rslt);
			addStEndWhere(builder);
		}

		/**
		 * SELECT句の追加
		 * 
		 * @param dbc
		 */
		protected <R extends MCDBContainer> void addSelect(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_ACCOUNT_R account1 = MAM_ACCOUNT_R.create(MAM_AC_TAX_R.$ACCOUNT1);
			rslt.addBooleanColumn("sub_flg");
			builder.addSelect(account1.sub_flg);
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_AC_TAX_R r_src) {
			
			super.down_SELECT_c0_0(r_dest, r_src);
			
			r_dest.sub_flg(r_src.getBooleanNE("sub_flg"));
		}
		
		/**
		 *  使用開始月および使用停止月をwhere句に追加します
		 * 
		 * @param dbc
		 */
		protected void addStEndWhere(MCQueryApiBuilder builder) {

			MAM_AC_TAX_R t = MAM_AC_TAX_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.st_dt.gte(bind(Srch01_CndR.$st_dt_fr)));
			builder.addWhereWithCutOffAnd(t.st_dt.lte(bind(Srch01_CndR.$st_dt_to)));
			builder.addWhereWithCutOffAnd(t.end_dt.gte(bind(Srch01_CndR.$end_dt_fr)));
			builder.addWhereWithCutOffAnd(t.end_dt.lte(bind(Srch01_CndR.$end_dt_to)));
			
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 会計税マスタ、会計税名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_AcTaxReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 会計税マスタ、会計税名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_AcTaxReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}