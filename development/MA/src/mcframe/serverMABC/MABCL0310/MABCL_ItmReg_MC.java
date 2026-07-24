package mcframe.serverMABC.MABCL0310;

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
import java.util.List;
import mcframe.serverMABC.MABCL0320.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0330.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0380.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0390.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ItmReg_MC extends MABCL_ItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_ItmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void up() {
			editUp();
			super.up();
		}

		protected void editUp() {
			// サムネイル画像を常に検索
			up0().th_image_flg(true);
			up0().reg_flg(true);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_ItmReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up() {
			editUp();
			super.up();
		}

		protected void editUp() {
			for (Upd01_Dtl1R r : up0()) {
				// サムネイル画像を常に更新
				r.th_image_flg(true);
			}
		}

		@Override
		protected List<String> getSortedCallOpeGrpNms() {
			List<String> opeL = super.getSortedCallOpeGrpNms();
			if (up0().isEmpty()) {
				opeL.remove("CALL_OPE01");
			}
			return opeL;
		}
	}

	//FMCB CUSTOM END
}