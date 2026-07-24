package mcframe.serverMABS.MABSL5040;

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
import mcframe.serverMABS.MABSL5040.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_GpBomReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_GpBomReg_MC extends MABSL_GpBomReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * GpBom_UpdChk01オペレーション.<p>
	 *
	 * 汎用ＢＯＭマスタの登録前チェックを行います。<br>
	 */
	public class GpBom_UpdChk01 extends MABSL_GpBomReg_MC_A.GpBom_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * GpBom_Upd01オペレーション.<p>
	 *
	 * 汎用ＢＯＭマスタの登録を行います。<br>
	 */
	public class GpBom_Upd01 extends MABSL_GpBomReg_MC_A.GpBom_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void up() {
			setBomKey();
			super.up();
		}
		
		/**
		 * ＢＯＭキーを設定する。
		 */
		protected void setBomKey() {
			doSeqCache(MAC_NUM_SYS_TYP.GP_BOM_KEY, up0().subList(GpBom_UpdChk01_DtlR.$bom_key, null).size());
			
			for (GpBom_UpdChk01_DtlR upR : up0().subList(GpBom_UpdChk01_DtlR.$bom_key, null)) {
				if (isNull(upR.bom_key())) {
					upR.bom_key(getStrSeq(MAC_NUM_SYS_TYP.GP_BOM_KEY)) ;
				}
			}
		}
	}
	/**
	 * GpBom_DelChk01オペレーション.<p>
	 *
	 * 汎用ＢＯＭマスタの削除前チェックを行います。<br>
	 */
	public class GpBom_DelChk01 extends MABSL_GpBomReg_MC_A.GpBom_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * GpBom_Del01オペレーション.<p>
	 *
	 * 汎用ＢＯＭマスタの削除を行います。<br>
	 */
	public class GpBom_Del01 extends MABSL_GpBomReg_MC_A.GpBom_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}