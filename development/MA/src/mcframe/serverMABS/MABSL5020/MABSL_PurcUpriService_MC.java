package mcframe.serverMABS.MABSL5020;

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
import mcframe.serverMA.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMA.dbc.MAW_PURC_UPRI_SRV_R;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_PurcUpriService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_PurcUpriService_MC extends MABSL_PurcUpriService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PurcUpri_Sprt01オペレーション.<p>
	 *
	 * 購買単価を取得する。<br>
	 */
	public class PurcUpri_Sprt01 extends MABSL_PurcUpriService_MC_A.PurcUpri_Sprt01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUpGrpNo();
			regWk();
			procMain();
			crtDown();
			editDownGrpNo();
		}

		/**
		 * ワークテーブルにデータを登録します。
		 */
		protected void regWk() {
			MAW_PURC_UPRI_SRV_R t = MAW_PURC_UPRI_SRV_R.create("T");
			execDbWkDelete("MABSL5020_MAW_PURC_UPRI_SRV_D01", t);
			
			String col = PurcUpri_Sprt01_DtlR.$purc_upri_srv;
			MCList<MAW_PURC_UPRI_SRV_R> dbcL = MCList.create(MAW_PURC_UPRI_SRV_R.class);
			dbcL.addAll(up0().innerRowList(col, MAW_PURC_UPRI_SRV_R.class));
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbInsert("MABSL5020_MAW_PURC_UPRI_SRV_I01", dbcL, dbcL_bldr);
		}

		/**
		 * メイン処理を実行します。
		 */
		protected void procMain() {
			execProc(createSqlId(LOGIC_ID, "MAPA_PURC_UPRI$P_SET_PURC_UPRI_WK", "01"), "MAPA_PURC_UPRI$P_SET_PURC_UPRI_WK");
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			MCList<MAW_PURC_UPRI_SRV_R> dbcL = MCList.create(MAW_PURC_UPRI_SRV_R.class);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MAW_PURC_UPRI_SRV_R.create("T"));
			dbSelect("MABSL5020_MAW_PURC_UPRI_SRV_S01", dbcL, dbcL_bldr);
			for (MAW_PURC_UPRI_SRV_R dbcR : dbcL) {
				PurcUpri_Sprt01_DtlR downR = down0().createRow();
				String col = PurcUpri_Sprt01_DtlR.$purc_upri_srv;
				downR.setInnerRow(col, dbcR);
				down0().add(downR);
			}
		}
		
		/**
		 * システムパラメータの値が1の場合、グループＮＯに連番をセットします。
		 */
		protected void editUpGrpNo() {
			if (!isSame(getSysParm("PURC_UPRI_GRP_TYP"),"1")) {
				return;
			}
			
			int i = 0;
			for (PurcUpri_Sprt01_DtlR r : up0()) {
				r.setStringNE("org_grp_no", r.grp_no());
				r.grp_no(String.valueOf(i));
				i++;
			}
		}
		
		/**
		 * システムパラメータの値が1の場合、グループＮＯを上り電文の値に戻します。
		 */
		protected void editDownGrpNo() {
			if (!isSame(getSysParm("PURC_UPRI_GRP_TYP"),"1")) {
				return;
			}
			
			String[] destCols = {"grp_no"};
			String[] srcCols = {"org_grp_no"};
			copyByPegNo(down0(), destCols, up0(), srcCols);
		}
	}

	//FMCB CUSTOM END
}