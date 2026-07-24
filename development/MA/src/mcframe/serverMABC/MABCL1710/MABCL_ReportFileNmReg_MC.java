package mcframe.serverMABC.MABCL1710;

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
import mcframe.serverMABC.MABCL1710.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ReportFileNmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ReportFileNmReg_MC extends MABCL_ReportFileNmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ReportFileNm_UpdChk01オペレーション.<p>
	 *
	 * 帳票ファイル名称マスタを登録する前のチェックをする。<br>
	 */
	public class ReportFileNm_UpdChk01 extends MABCL_ReportFileNmReg_MC_A.ReportFileNm_UpdChk01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	/**
	 * ReportFileNm_Upd01オペレーション.<p>
	 *
	 * 帳票ファイル名称マスタを登録する。<br>
	 */
	public class ReportFileNm_Upd01 extends MABCL_ReportFileNmReg_MC_A.ReportFileNm_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	/**
	 * ReportFileNm_DelChk01オペレーション.<p>
	 *
	 * 帳票ファイル名称マスタを削除する前のチェックをする。<br>
	 */
	public class ReportFileNm_DelChk01 extends MABCL_ReportFileNmReg_MC_A.ReportFileNm_DelChk01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	/**
	 * ReportFileNm_Del01オペレーション.<p>
	 *
	 * 帳票ファイル名称マスタを削除する。<br>
	 */
	public class ReportFileNm_Del01 extends MABCL_ReportFileNmReg_MC_A.ReportFileNm_Del01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする。<br>
	 */
	public class Srch01 extends MABCL_ReportFileNmReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理をする。<br>
	 */
	public class Upd01 extends MABCL_ReportFileNmReg_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする。<br>
	 */
	public class Del01 extends MABCL_ReportFileNmReg_MC_A.Del01 {

		@Override
		protected void call() {
			super.call();
		}

	}

	//FMCB CUSTOM END
}