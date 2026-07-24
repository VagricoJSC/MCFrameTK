package mcframe.serverMABG.MABGL0520;

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
import mcframe.serverMABG.MABGL0520.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_PreAlcCtgReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_PreAlcCtgReg_MC extends MABGL_PreAlcCtgReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * PreAlcCtg_UpdChk01オペレーション.<p>
	 *
	 * 一次配賦基準カテゴリマスタの登録前のチェックを行います。<br>
	 */
	public class PreAlcCtg_UpdChk01 extends MABGL_PreAlcCtgReg_MC_A.PreAlcCtg_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub(MCList<? extends MCConstRow> up) {
			MCMessageList msgList = super.doServerCheckSub(up);
			for (MCConstRow row : up) {
				if (!(row instanceof PreAlcCtg_UpdChk01_DtlR)) {
					break;
				}

				PreAlcCtg_UpdChk01_DtlR r = (PreAlcCtg_UpdChk01_DtlR) row;
				MAM_PRE_ALC_RATE_R preAlcRateR = MAM_PRE_ALC_RATE_R.create();
				MCQueryApiBuilder preAlcRateR_bldr = MCQueryApiBuilder.create(MAM_PRE_ALC_RATE_R.create("T"));
				dbSelectKey("MABGL0520_MAM_PRE_ALC_RATE_S01", preAlcRateR, preAlcRateR_bldr, r);
				
				if (!preAlcRateR.pln_mly_flg() && !isNull(r.data_pln_sa_typ())) {
					msgList.add(new MCMessage(row, PreAlcCtg_UpdChk01_DtlR.$data_pln_sa_typ, MABGL0012 ,toDispGUIIndex(row)));
				}
				if (!preAlcRateR.pln_mly_flg() && !isNull(r.key_pln_sa_typ())) {
					msgList.add(new MCMessage(row, PreAlcCtg_UpdChk01_DtlR.$key_pln_sa_typ, MABGL0013 ,toDispGUIIndex(row)));
				}
				if (!preAlcRateR.pln_mly_flg() && !isNull(r.key_pln_ym())) {
					msgList.add(new MCMessage(row, PreAlcCtg_UpdChk01_DtlR.$key_pln_ym, MABGL0014 ,toDispGUIIndex(row)));
				}
				
				if (!preAlcRateR.act_mly_flg() && !isNull(r.data_act_sa_typ())) {
					msgList.add(new MCMessage(row, PreAlcCtg_UpdChk01_DtlR.$data_act_sa_typ, MABGL0015 ,toDispGUIIndex(row)));
				}
				if (!preAlcRateR.act_mly_flg() && !isNull(r.key_act_sa_typ())) {
					msgList.add(new MCMessage(row, PreAlcCtg_UpdChk01_DtlR.$key_act_sa_typ, MABGL0016 ,toDispGUIIndex(row)));
				}
				if (!preAlcRateR.act_mly_flg() && !isNull(r.key_act_ym())) {
					msgList.add(new MCMessage(row, PreAlcCtg_UpdChk01_DtlR.$key_act_ym, MABGL0017 ,toDispGUIIndex(row)));
				}
			}
			return msgList;
			
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),PreAlcCtg_UpdChk01_DtlR.$wg_cd));
			return msgLst;
		}
		
	}
	/**
	 * PreAlcCtg_Upd01オペレーション.<p>
	 *
	 * 一次配賦基準カテゴリマスタの登録を行います。<br>
	 */
	public class PreAlcCtg_Upd01 extends MABGL_PreAlcCtgReg_MC_A.PreAlcCtg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PreAlcCtg_DelChk01オペレーション.<p>
	 *
	 * 一次配賦基準カテゴリマスタの削除前のチェックを行います。<br>
	 */
	public class PreAlcCtg_DelChk01 extends MABGL_PreAlcCtgReg_MC_A.PreAlcCtg_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),PreAlcCtg_DelChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * PreAlcCtg_Del01オペレーション.<p>
	 *
	 * 一次配賦基準カテゴリマスタの削除を行います。<br>
	 */
	public class PreAlcCtg_Del01 extends MABGL_PreAlcCtgReg_MC_A.PreAlcCtg_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦基準カテゴリマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_PreAlcCtgReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_PRE_ALC_CTG_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_PRE_ALC_CTG_R t = MAM_PRE_ALC_CTG_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.term.gte(bind("term_fr")));
			builder.addWhereWithCutOffAnd(t.term.lte(bind("term_to")));
			rslt.addBooleanColumn("PLN_MLY_FLG");
			rslt.addBooleanColumn("ACT_MLY_FLG");
			
			MAM_PRE_ALC_RATE_R pre_alc_rate1  = MAM_PRE_ALC_RATE_R.create(MAM_PRE_ALC_CTG_R.$PRE_ALC_RATE1) ;
			builder.addSelect(pre_alc_rate1.act_mly_flg);
			builder.addSelect(pre_alc_rate1.pln_mly_flg);
			
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			builder.addWhereWithAnd(exists( subQuery()
					.select(S1WG2.prAll())
					.from(S1WG2)
					.where( value(0).eq(value(0))
							.and(t.wg_cd.eq(S1WG2.wg_cd)) )));
		}
		
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 一次配賦基準カテゴリマスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABGL_PreAlcCtgReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 一次配賦基準カテゴリマスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_PreAlcCtgReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}