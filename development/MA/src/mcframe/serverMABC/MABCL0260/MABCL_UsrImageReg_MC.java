package mcframe.serverMABC.MABCL0260;

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
import mcframe.serverMABC.MABCL0260.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_UsrImageReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_UsrImageReg_MC extends MABCL_UsrImageReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * UsrImage_UpdChk01オペレーション.<p>
	 *
	 * 担当者画像の登録前のチェックを行います。<br>
	 */
	public class UsrImage_UpdChk01 extends MABCL_UsrImageReg_MC_A.UsrImage_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * UsrImage_Upd01オペレーション.<p>
	 *
	 * 担当者画像の登録を行います。<br>
	 */
	public class UsrImage_Upd01 extends MABCL_UsrImageReg_MC_A.UsrImage_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(
				MCQueryApiBuilder builder, MCList<R> list) {
			super.updDbcCustomize(builder, list);
			if(builder.getBaseDbc() instanceof MAM_USR_R){
				dbcCustomizeSet(builder);
			}
		}
		
		// 上り電文だけを更新する
		protected void dbcCustomizeSet(MCQueryApiBuilder builder) {

			String[] cols = UsrImage_UpdChk01_DtlR.colnames();
			String[] keyCols = builder.getBaseDbc().getKeyColumn();
			int i = 0;
			
			for (String c : cols) {
				boolean isContains = false;
				for (String k : keyCols) {
					if (isSame(c, k)) {
						isContains = true;
					}
				}
				if (!isContains && !isSame(c, MAM_USR_R.$upd_cntr)) {
					if (i==0) {
						builder.setSet(builder.getBaseDbc().getColumn$(c));
					}
					else {
						builder.addSet(builder.getBaseDbc().getColumn$(c));
					}
					i++;
				}
			}
		}
		
		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);
			for (R r : dbc) {
				if (r instanceof MAM_USR_R) {
					insBinary((MAM_USR_R) r);
				}
			}
		}
		
		/**
		 * 担当者マスタを会社共通（別データベース）で管理する場合にサムネイル画像を同期する（共通ＤＢへの反映）
		 * 
		 * @param r ＤＢコンテナ
		 */
		protected <R extends MCRow> void insBinary(MAM_USR_R r) {
			if (!isNull((r.th_image()))) {
				String procId = "MAPA_MASTER$P_INS_BINARY";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":th_image");
			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 担当者画像の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_UsrImageReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			callProc();

			super.doIt();
		}
		/**
		 * 担当者マスタを会社共通（別データベース）で管理する場合にサムネイル画像を同期する（共通ＤＢからの取得）
		 * 
		 */
		protected void callProc() {
			execProc(createSqlId(LOGIC_ID, "MAPA_MASTER$P_GET_BINARY", "01"), "MAPA_MASTER$P_GET_BINARY");
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 担当者画像の登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_UsrImageReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}