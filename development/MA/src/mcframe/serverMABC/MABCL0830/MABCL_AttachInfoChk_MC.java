package mcframe.serverMABC.MABCL0830;

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

//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_AttachInfoChk"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_AttachInfoChk_MC extends MABCL_AttachInfoChk_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受注引当マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_AttachInfoChk_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
					MCList<R> rslt) {
			
			super.dbcCustomize(builder,rslt);
			if(builder.getBaseDbc() instanceof MAM_ATTACH_INFO_R){
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			// ワーキンググループＣＤはNULL_VALのデータも検索するため、検索条件全部でカスタマイズする
			MAM_ATTACH_INFO_R t = MAM_ATTACH_INFO_R.create(builder.getBaseDbcAlias());
			
			builder.setWhere(value(0).eq(value(0)));
			builder.addWhereWithCutOffAnd(t.itm_cd.like(bind(Srch01_CndR.$itm_cd)));
			builder.addWhereWithCutOffAnd(t.itm_sub1.like(bind(Srch01_CndR.$itm_sub1)));
			builder.addWhereWithCutOffAnd(t.itm_sub2.like(bind(Srch01_CndR.$itm_sub2)));
			builder.addWhereWithCutOffAnd(t.itm_sub3.like(bind(Srch01_CndR.$itm_sub3)));
			builder.addWhereWithCutOffAnd(t.sno1.like(bind(Srch01_CndR.$sno1)));
			builder.addWhereWithCutOffAnd(t.sno2.like(bind(Srch01_CndR.$sno2)));
			builder.addWhereWithCutOffAnd(t.sno3.like(bind(Srch01_CndR.$sno3)));
			builder.addWhereWithCutOffAnd(t.sno4.like(bind(Srch01_CndR.$sno4)));
			builder.addWhereWithCutOffAnd(t.attach_info_typ.like(bind(Srch01_CndR.$attach_info_typ)));
			builder.addWhereWithCutOffAnd(t.wg_cd.like(bind(Srch01_CndR.$wg_cd)).or(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))));		}
	}

	//FMCB CUSTOM END
}