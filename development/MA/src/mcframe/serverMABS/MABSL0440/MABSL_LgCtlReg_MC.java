package mcframe.serverMABS.MABSL0440;

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
import mcframe.serverMABS.MABSL0440.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.List;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_LgCtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_LgCtlReg_MC extends MABSL_LgCtlReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * LgCtl_UpdChk01オペレーション.<p>
	 *
	 * 物流制御マスタの登録前のチェックを行います。<br>
	 */
	public class LgCtl_UpdChk01 extends MABSL_LgCtlReg_MC_A.LgCtl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgList = super.doServerCheckSub();
			for(LgCtl_UpdChk01_DtlR r : up0()){
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
				
				// 条件付必須チェック
				if (r.iv_trd_flg()) {
					msgList.addAll(check(r, LgCtl_UpdChk01_DtlR.$def_tdlv_cd, new FXUCL_RequiredValidater()));
				}

				if (isSame(r.fr_lg_grp_cd(), r.to_lg_grp_cd())) {
					msgList.add(new MCMessage(r, LgCtl_UpdChk01_DtlR.$to_lg_grp_cd, MABSL0001, toDispGUIIndex(r)));
				}
				
				if (r.iv_trd_flg() && !r.to_lg_grp_loc_flg()){
					msgList.add(new MCMessage(r, LgCtl_UpdChk01_DtlR.$to_lg_grp_cd, MABSL0143, toDispGUIIndex(r)));
				}
				
				if (!r.iv_trd_flg() && r.to_lg_grp_loc_flg() && !isNull(r.def_tdlv_cd())){
					msgList.add(new MCMessage(r, LgCtl_UpdChk01_DtlR.$def_tdlv_cd, MABSL0186, toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * LgCtl_Upd01オペレーション.<p>
	 *
	 * 物流制御マスタの登録を行います。<br>
	 */
	public class LgCtl_Upd01 extends MABSL_LgCtlReg_MC_A.LgCtl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (r instanceof MAM_LG_CTL_R) {
					// インボイス取引ＦＬＧチェック
					checkIvTrdFlg((MAM_LG_CTL_R) r);
				}
			}
		}

		/**
		 * 出荷元物流Ｇ、出荷先物流Ｇの組み合わせでインボイス取引ＦＬＧが全て一緒かチェックします。
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void checkIvTrdFlg(MAM_LG_CTL_R r) {
			if (r.del_flg()) {
				return ;
			}
			MAM_LG_CTL_R t = MAM_LG_CTL_R.create("T");
			int i = execDbCount("MABSL0440_MAM_LG_CTL_S01", t,
					t.fr_lg_grp_cd.eq(bind("fr_lg_grp_cd"))
							.and(t.to_lg_grp_cd.eq(bind("to_lg_grp_cd")))
							.and(t.ship_term_cd.neq(bind("ship_term_cd")))
							.and(t.iv_trd_flg.neq(bind("iv_trd_flg")))
							.and(t.del_flg.eq(value(false))),
					r);
			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_LG_CTL_R.$iv_trd_flg, MABSL0141, r.fr_lg_grp_cd(),
						r.to_lg_grp_cd(), toDispGUIIndex(r)));
			}
		}
	}
	/**
	 * LgCtl_DelChk01オペレーション.<p>
	 *
	 * 物流制御マスタの削除前のチェックを行います。<br>
	 */
	public class LgCtl_DelChk01 extends MABSL_LgCtlReg_MC_A.LgCtl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * LgCtl_Del01オペレーション.<p>
	 *
	 * 物流制御マスタの削除を行います。<br>
	 */
	public class LgCtl_Del01 extends MABSL_LgCtlReg_MC_A.LgCtl_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> list, boolean updChk) {

			if (builder.getBaseDbc().tableName().equals("MAM_SHIP_CL")) {
				dbDelLcl(builder, list);
			}
			else {
				super.dbLockDelUpdInsByStatusCheck(builder, list, updChk);
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 物流制御マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABSL_LgCtlReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doItLcl() {
			super.doItLcl();
		}

		@Override
		protected java.util.List<java.lang.String> getSelectLclGrpNames() {
			List<String> l = new ArrayList<String>();
			l.add("SELECT_SHIP1");
			l.addAll(super.getSelectLclGrpNames());
			return l;
		}
		@Override
		protected java.util.List<java.lang.String> getOtherSelectGrpNames() {
			return new ArrayList<String>();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_LG_CTL_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_LG_GRP_R lg_grp2 = MAM_LG_GRP_R.create(MAM_LG_CTL_R.$LG_GRP2);
			builder.addSelect(lg_grp2.loc_flg.as("to_lg_grp_loc_flg"));
			rslt.addBooleanColumn("to_lg_grp_loc_flg");
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R dest, MAM_LG_CTL_R src) {
			super.down_SELECT_c0_0(dest, src);

			dest.to_lg_grp_loc_flg(src.getBooleanNE("to_lg_grp_loc_flg"));
		}

		@Override
		protected void down_SELECT_SHIP1_c1_0(MCList<Srch01_Rslt2R> dest,
				MCList<MAM_SHIP_CL_R> src) {
			super.down_SELECT_SHIP1_c1_0(dest, src);

			// 定数名の設定
			MAUCL_MCDataUtil.setConstNm(dest);
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(dest);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 物流制御マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABSL_LgCtlReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 物流制御マスタの削除を行います。<br>
	 */
	public class Del01 extends MABSL_LgCtlReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipCl_UpdChk01オペレーション.<p>
	 *
	 * 出荷締時間マスタの登録前のチェックを行います。<br>
	 */
	public class ShipCl_UpdChk01 extends MABSL_LgCtlReg_MC_A.ShipCl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ShipCl_Upd01オペレーション.<p>
	 *
	 * 出荷締時間マスタの登録を行います。<br>
	 */
	public class ShipCl_Upd01 extends MABSL_LgCtlReg_MC_A.ShipCl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}