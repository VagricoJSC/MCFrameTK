package mcframe.serverMABC.MABCL0900;

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
import mcframe.serverMABC.MABCL0900.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_GpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_GpReg_MC extends MABCL_GpReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Gp_Upd01オペレーション.<p>
	 *
	 * 汎用マスタの登録を行います。<br>
	 */
	public class Gp_Upd01 extends MABCL_GpReg_MC_A.Gp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * GpLcl_Upd01オペレーション.<p>
	 *
	 * 汎用名称マスタの登録を行います。<br>
	 */
	public class GpLcl_Upd01 extends MABCL_GpReg_MC_A.GpLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Gp_Del01オペレーション.<p>
	 *
	 * 汎用マスタ、汎用名称マスタの削除を行います。<br>
	 */
	public class Gp_Del01 extends MABCL_GpReg_MC_A.Gp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Gp_UpdChk01オペレーション.<p>
	 *
	 * 汎用マスタの登録前のチェックを行います。<br>
	 */
	public class Gp_UpdChk01 extends MABCL_GpReg_MC_A.Gp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Gp_UpdChk01_DtlR r : up0()){
				if (!isNullOrNullVal(r.key1()) && isNotCd(r.key1())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key1, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key1), r.key1(), toDispGUIIndex(r)));
					continue;
				}
				if (!isNullOrNullVal(r.key2()) && isNotCd(r.key2())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key2, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key2), r.key2(), toDispGUIIndex(r)));
					continue;
				}
				if (!isNullOrNullVal(r.key3()) && isNotCd(r.key3())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key3, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key3), r.key3(), toDispGUIIndex(r)));
					continue;
				}
				if (!isNullOrNullVal(r.key4()) && isNotCd(r.key4())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key4, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key4), r.key4(), toDispGUIIndex(r)));
					continue;
				}
				if (!isNullOrNullVal(r.key5()) && isNotCd(r.key5())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key5, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key5), r.key5(), toDispGUIIndex(r)));
					continue;
				}
				if (!isNullOrNullVal(r.key6()) && isNotCd(r.key6())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key6, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key6), r.key6(), toDispGUIIndex(r)));
					continue;
				}
				if (!isNullOrNullVal(r.key7()) && isNotCd(r.key7())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key7, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key7), r.key7(), toDispGUIIndex(r)));
					continue;
				}
				if (!isNullOrNullVal(r.key8()) && isNotCd(r.key8())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key8, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key8), r.key8(), toDispGUIIndex(r)));
					continue;
				}
				if (!isNullOrNullVal(r.key9()) && isNotCd(r.key9())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key9, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key9), r.key9(), toDispGUIIndex(r)));
					continue;
				}
				if (!isNullOrNullVal(r.key10()) && isNotCd(r.key10())){
					msgList.add(new MCMessage(r, Gp_UpdChk01_DtlR.$key10, MABCL0306, 
									getLabel(r, Gp_UpdChk01_DtlR.$key10), r.key10(), toDispGUIIndex(r)));
					continue;
				}

				if (r.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * GpLcl_UpdChk01オペレーション.<p>
	 *
	 * 汎用名称マスタの登録前のチェックを行います。<br>
	 */
	public class GpLcl_UpdChk01 extends MABCL_GpReg_MC_A.GpLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Gp_DelChk01オペレーション.<p>
	 *
	 * 汎用マスタ、汎用名称マスタの削除前のチェックを行います。<br>
	 */
	public class Gp_DelChk01 extends MABCL_GpReg_MC_A.Gp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 汎用マスタ、汎用名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_GpReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCPredicate getWhere(MCDataType typ, MCPermColumn col, String bindCol) {
			if (isSame(Srch01_CndR.$gp_grp_cd, bindCol)) {
				return ((MCStringExpr)col).eq(bind(bindCol));
			}
			return super.getWhere(typ, col, bindCol);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 汎用マスタ、汎用名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_GpReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 汎用マスタ、汎用名称マスタの削除を行います。（マスタ画面用）<br>
	 */
	public class Del01 extends MABCL_GpReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}