package mcframe.serverMABC.MABCL2020;

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
import mcframe.serverMABC.MABCL2020.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ExpnsReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ExpnsReg_MC extends MABCL_ExpnsReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Expns_UpdChk01オペレーション.<p>
	 *
	 * 原価費目マスタを登録する前のチェック処理を行います。<br>
	 */
	public class Expns_UpdChk01 extends MABCL_ExpnsReg_MC_A.Expns_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Expns_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.expns_cd())){
					msgList.add(new MCMessage(r, Expns_UpdChk01_DtlR.$expns_cd, MABCL0306, 
									getLabel(r, Expns_UpdChk01_DtlR.$expns_cd), r.expns_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * Expns_Upd01オペレーション.<p>
	 *
	 * 原価費目マスタの登録処理を行います。<br>
	 */
	public class Expns_Upd01 extends MABCL_ExpnsReg_MC_A.Expns_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> rslt) {
			super.afterUpdate(rslt);

			checkExpnsNum();
		}

		/**
		 * 「費目の数」＋「費目Ｇの数」は１００件までチェック
		 */
		protected void checkExpnsNum() {
			MAM_EXPNS_R t = MAM_EXPNS_R.create("T");
			// 「費目の数」
			int e = execDbCount("MABCL2020_MAM_EXPNS_S01", t, t.del_flg.eq(value(false)));
	
			// 「費目Ｇの数」
			MCList<MAM_EXPNS_R> dbc = MCList.create(MAM_EXPNS_R.class);
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.del_flg.eq(value(false)));
			dbc_bldr.setDistinct();
			dbc_bldr.setSelect(t.expns_grp_cd);
			int g = dbSelect("MABCL2020_MAM_EXPNS_S02", dbc, dbc_bldr);

			if (e + g > 100) {
				getMsgList().add(new MCMessage(MABCL0248));
			}
		}
	}
	/**
	 * ExpnsLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価費目マスタ(ロケール別情報)を登録する前のチェック処理を行います。<br>
	 */
	public class ExpnsLcl_UpdChk01 extends MABCL_ExpnsReg_MC_A.ExpnsLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExpnsLcl_Upd01オペレーション.<p>
	 *
	 * 原価費目マスタ(ロケール別情報)の登録処理を行います。<br>
	 */
	public class ExpnsLcl_Upd01 extends MABCL_ExpnsReg_MC_A.ExpnsLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Expns_DelChk01オペレーション.<p>
	 *
	 * 原価費目マスタ、原価費目マスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class Expns_DelChk01 extends MABCL_ExpnsReg_MC_A.Expns_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Expns_Del01オペレーション.<p>
	 *
	 * 原価費目マスタ、原価費目マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Expns_Del01 extends MABCL_ExpnsReg_MC_A.Expns_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価費目マスタ、原価費目マスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ExpnsReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_EXPNS_R){
				dbcCustomizeSub(builder);
			}
		}

		protected <R extends MCContainer> void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAM_EXPNS_GRP_R expns_grp1 = MAM_EXPNS_GRP_R.create(MAM_EXPNS_R.$EXPNS_GRP1);
			builder.addSelect(expns_grp1.expns_grp_seq);
			builder.addSelect(expns_grp1.expns_grp_nm);
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_EXPNS_R r_src) {

			super.down_SELECT_c0_0(r_dest, r_src);
			r_dest.expns_grp_nm(r_src.getStringNE("EXPNS_GRP_NM"));
			r_dest.expns_grp_seq(r_src.getNumberNE("EXPNS_GRP_SEQ"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価費目マスタ、原価費目マスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class Upd01 extends MABCL_ExpnsReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価費目マスタ、原価費目マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABCL_ExpnsReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}