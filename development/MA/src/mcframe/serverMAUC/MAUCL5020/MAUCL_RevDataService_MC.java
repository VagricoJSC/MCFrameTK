package mcframe.serverMAUC.MAUCL5020;

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
 * "MAUCL_RevDataService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUCL_RevDataService_MC extends MAUCL_RevDataService_MC_A{
	//FMCB CUSTOM START

	/**
	 * RevData_Ins01オペレーション.<p>
	 *
	 * 「改訂履歴データ更新リスト」テーブルにデータを登録します。<br>
	 */
	public class RevData_Ins01 extends MAUCL_RevDataService_MC_A.RevData_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MAW_REV_DATA_UPD_LST_R> wkL = MCList.create(MAW_REV_DATA_UPD_LST_R.class);
			MAW_REV_DATA_UPD_LST_R t = MAW_REV_DATA_UPD_LST_R.create("T");
			String sqlid = createSqlId(LOGIC_ID, t, "I01");
			
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(t);
			for (RevData_Ins01_DtlR up0R : up0()) {
				MAW_REV_DATA_UPD_LST_R wkR = MAW_REV_DATA_UPD_LST_R.create();
				wkR.rev_data_src_no(up0R.rev_data_src_no());
				wkR.rev_no(up0R.rev_no());
				wkR.rev_data_typ(up0R.rev_data_typ());
				wkL.add(wkR);
			}
			if (!isNull(wkL)) {
				dbInsert(sqlid, wkL, wkL_bldr);
			}
		}
	}
	/**
	 * RevData_Upd01オペレーション.<p>
	 *
	 * 改訂履歴データを更新する処理が実装するインターフェースを定義する<br>
	 */
	public class RevData_Upd01 extends MAUCL_RevDataService_MC_A.RevData_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
		}
	}
	/**
	 * RevData_Upd02オペレーション.<p>
	 *
	 * 改訂履歴データ更新リストテーブルのデータを元に、改訂履歴データを更新する処理を呼び出す。<br>
	 */
	public class RevData_Upd02 extends MAUCL_RevDataService_MC_A.RevData_Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MAW_REV_DATA_UPD_LST_R> wkL = MCList.create(MAW_REV_DATA_UPD_LST_R.class);
			selectMAW_REV_DATA_UPD_LST(wkL);
			if (isNull(wkL)) {
				return;
			}
			
			execIfOpe(wkL);
			
			deleteMAW_REV_DATA_UPD_LST();
		}
		
		protected void execIfOpe(MCList<MAW_REV_DATA_UPD_LST_R> wkL) {
			for (MCList<MAW_REV_DATA_UPD_LST_R> gl : wkL.groupList(MAW_REV_DATA_UPD_LST_R.$rev_data_typ)) {
				String data_typ = gl.get(0).rev_data_typ();
				MAC_REV_DATA_TYP revDataTyp = MAC_REV_DATA_TYP.get(data_typ);
				
				String logic_id = revDataTyp.logic_id();
				String operation_id = revDataTyp.operation_id();
				String moduleId = logic_id.substring(0,2);
				
				IfMAUCL_RevDataService_RevData_Upd01 upd01 = createOperation(moduleId, logic_id, operation_id, IfMAUCL_RevDataService_RevData_Upd01.class);
				
				for (MAW_REV_DATA_UPD_LST_R gr : gl) {
					RevData_Upd01_DtlR r = RevData_Upd01_DtlR.create();
					r.rev_data_src_no(gr.rev_data_src_no());
					r.rev_no(gr.rev_no());
					upd01.up0().add(r);
				}
				upd01.exec();
			}
		}
		
		protected void selectMAW_REV_DATA_UPD_LST(MCList<MAW_REV_DATA_UPD_LST_R> wkL) {
			MAW_REV_DATA_UPD_LST_R t = MAW_REV_DATA_UPD_LST_R.create("T");
			String sqlid_s = createSqlId(LOGIC_ID, t, "S01");
			
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(t);
			wkL_bldr.setDistinct();
			dbSelect(sqlid_s, wkL, wkL_bldr);
		}
		
		protected void deleteMAW_REV_DATA_UPD_LST() {
			MAW_REV_DATA_UPD_LST_R t = MAW_REV_DATA_UPD_LST_R.create("T");
			String sqlid_d = createSqlId(LOGIC_ID, t, "D01");
			
			execDbWkDelete(sqlid_d, t);
		}
	}

	//FMCB CUSTOM END
}