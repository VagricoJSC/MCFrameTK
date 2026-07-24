package mcframe.serverMABC.MABCL0031;

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
import mcframe.serverMABC.MABCL0031.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MultiReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MultiReg_MC extends MABCL_MultiReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Da_UpdChk01オペレーション.<p>
	 *
	 * データアクセス基本マスタの登録前のチェックを行います。<br>
	 */
	public class Da_UpdChk01 extends MABCL_MultiReg_MC_A.Da_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Da_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.da_cd())){
					msgList.add(new MCMessage(row, Da_UpdChk01_DtlR.$da_cd, MABCL0306, 
									getLabel(row, Da_UpdChk01_DtlR.$da_cd), row.da_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * Da_Upd01オペレーション.<p>
	 *
	 * データアクセス基本マスタの登録を行います。<br>
	 */
	public class Da_Upd01 extends MABCL_MultiReg_MC_A.Da_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DaLcl_UpdChk01オペレーション.<p>
	 *
	 * データアクセス基本マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class DaLcl_UpdChk01 extends MABCL_MultiReg_MC_A.DaLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DaLcl_Upd01オペレーション.<p>
	 *
	 * データアクセス基本マスタの登録を行います。（ロケール用）<br>
	 */
	public class DaLcl_Upd01 extends MABCL_MultiReg_MC_A.DaLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Da_DelChk01オペレーション.<p>
	 *
	 * データアクセス基本マスタの削除前のチェックを行います。<br>
	 */
	public class Da_DelChk01 extends MABCL_MultiReg_MC_A.Da_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Da_Del01オペレーション.<p>
	 *
	 * データアクセス基本マスタの削除を行います。<br>
	 */
	public class Da_Del01 extends MABCL_MultiReg_MC_A.Da_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptBase_UpdChk01オペレーション.<p>
	 *
	 * 部門基本マスタの登録前のチェックを行います。<br>
	 */
	public class DptBase_UpdChk01 extends MABCL_MultiReg_MC_A.DptBase_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(DptBase_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.dpt_cd())){
					msgList.add(new MCMessage(row, DptBase_UpdChk01_DtlR.$dpt_cd, MABCL0306, 
									getLabel(row, DptBase_UpdChk01_DtlR.$dpt_cd), row.dpt_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * DptBase_Upd01オペレーション.<p>
	 *
	 * 部門基本マスタの登録を行います。<br>
	 */
	public class DptBase_Upd01 extends MABCL_MultiReg_MC_A.DptBase_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptBaseLcl_UpdChk01オペレーション.<p>
	 *
	 * 部門基本マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class DptBaseLcl_UpdChk01 extends MABCL_MultiReg_MC_A.DptBaseLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptBaseLcl_Upd01オペレーション.<p>
	 *
	 * 部門基本マスタの登録を行います。（ロケール用）<br>
	 */
	public class DptBaseLcl_Upd01 extends MABCL_MultiReg_MC_A.DptBaseLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptBase_DelChk01オペレーション.<p>
	 *
	 * 部門基本マスタの削除前のチェックを行います。<br>
	 */
	public class DptBase_DelChk01 extends MABCL_MultiReg_MC_A.DptBase_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptBase_Del01オペレーション.<p>
	 *
	 * 部門基本マスタの削除を行います。<br>
	 */
	public class DptBase_Del01 extends MABCL_MultiReg_MC_A.DptBase_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptLvl_UpdChk01オペレーション.<p>
	 *
	 * 部門階層マスタの登録前のチェックを行います。<br>
	 */
	public class DptLvl_UpdChk01 extends MABCL_MultiReg_MC_A.DptLvl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(DptLvl_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.dpt_lvl_cd())){
					msgList.add(new MCMessage(row, DptLvl_UpdChk01_DtlR.$dpt_lvl_cd, MABCL0306, 
									getLabel(row, DptLvl_UpdChk01_DtlR.$dpt_lvl_cd), row.dpt_lvl_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * DptLvl_Upd01オペレーション.<p>
	 *
	 * 部門階層マスタの登録を行います。<br>
	 */
	public class DptLvl_Upd01 extends MABCL_MultiReg_MC_A.DptLvl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptLvlLcl_UpdChk01オペレーション.<p>
	 *
	 * 部門階層マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class DptLvlLcl_UpdChk01 extends MABCL_MultiReg_MC_A.DptLvlLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptLvlLcl_Upd01オペレーション.<p>
	 *
	 * 部門階層マスタの登録を行います。（ロケール用）<br>
	 */
	public class DptLvlLcl_Upd01 extends MABCL_MultiReg_MC_A.DptLvlLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptLvl_DelChk01オペレーション.<p>
	 *
	 * 部門階層マスタの削除前のチェックを行います。<br>
	 */
	public class DptLvl_DelChk01 extends MABCL_MultiReg_MC_A.DptLvl_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptLvl_Del01オペレーション.<p>
	 *
	 * 部門階層マスタの削除を行います。<br>
	 */
	public class DptLvl_Del01 extends MABCL_MultiReg_MC_A.DptLvl_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AprvRole_UpdChk01オペレーション.<p>
	 *
	 * 承認役割マスタの登録前のチェックを行います。<br>
	 */
	public class AprvRole_UpdChk01 extends MABCL_MultiReg_MC_A.AprvRole_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(AprvRole_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.aprv_role_cd())){
					msgList.add(new MCMessage(row, AprvRole_UpdChk01_DtlR.$aprv_role_cd, MABCL0306, 
									getLabel(row, AprvRole_UpdChk01_DtlR.$aprv_role_cd), row.aprv_role_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * AprvRole_Upd01オペレーション.<p>
	 *
	 * 承認役割マスタの登録を行います。<br>
	 */
	public class AprvRole_Upd01 extends MABCL_MultiReg_MC_A.AprvRole_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AprvRoleLcl_UpdChk01オペレーション.<p>
	 *
	 * 承認役割マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class AprvRoleLcl_UpdChk01 extends MABCL_MultiReg_MC_A.AprvRoleLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AprvRoleLcl_Upd01オペレーション.<p>
	 *
	 * 承認役割マスタの登録を行います。（ロケール用）<br>
	 */
	public class AprvRoleLcl_Upd01 extends MABCL_MultiReg_MC_A.AprvRoleLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AprvRole_DelChk01オペレーション.<p>
	 *
	 * 承認役割マスタの削除前のチェックを行います。<br>
	 */
	public class AprvRole_DelChk01 extends MABCL_MultiReg_MC_A.AprvRole_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AprvRole_Del01オペレーション.<p>
	 *
	 * 承認役割マスタの削除を行います。<br>
	 */
	public class AprvRole_Del01 extends MABCL_MultiReg_MC_A.AprvRole_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Cntry_UpdChk01オペレーション.<p>
	 *
	 * 国マスタの登録前のチェックを行います。<br>
	 */
	public class Cntry_UpdChk01 extends MABCL_MultiReg_MC_A.Cntry_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Cntry_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.cntry_cd())){
					msgList.add(new MCMessage(row, Cntry_UpdChk01_DtlR.$cntry_cd, MABCL0306, 
									getLabel(row, Cntry_UpdChk01_DtlR.$cntry_cd), row.cntry_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * Cntry_Upd01オペレーション.<p>
	 *
	 * 国マスタの登録を行います。<br>
	 */
	public class Cntry_Upd01 extends MABCL_MultiReg_MC_A.Cntry_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CntryLcl_UpdChk01オペレーション.<p>
	 *
	 * 国マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class CntryLcl_UpdChk01 extends MABCL_MultiReg_MC_A.CntryLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CntryLcl_Upd01オペレーション.<p>
	 *
	 * 国マスタの登録を行います。（ロケール用）<br>
	 */
	public class CntryLcl_Upd01 extends MABCL_MultiReg_MC_A.CntryLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Cntry_DelChk01オペレーション.<p>
	 *
	 * 国マスタの削除前のチェックを行います。<br>
	 */
	public class Cntry_DelChk01 extends MABCL_MultiReg_MC_A.Cntry_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Cntry_Del01オペレーション.<p>
	 *
	 * 国マスタの削除を行います。<br>
	 */
	public class Cntry_Del01 extends MABCL_MultiReg_MC_A.Cntry_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Area_UpdChk01オペレーション.<p>
	 *
	 * 地域マスタの登録前のチェックを行います。<br>
	 */
	public class Area_UpdChk01 extends MABCL_MultiReg_MC_A.Area_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Area_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.area_cd())){
					msgList.add(new MCMessage(row, Area_UpdChk01_DtlR.$area_cd, MABCL0306, 
									getLabel(row, Area_UpdChk01_DtlR.$area_cd), row.area_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * Area_Upd01オペレーション.<p>
	 *
	 * 地域マスタの登録を行います。<br>
	 */
	public class Area_Upd01 extends MABCL_MultiReg_MC_A.Area_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AreaLcl_UpdChk01オペレーション.<p>
	 *
	 * 地域マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class AreaLcl_UpdChk01 extends MABCL_MultiReg_MC_A.AreaLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AreaLcl_Upd01オペレーション.<p>
	 *
	 * 地域マスタの登録を行います。（ロケール用）<br>
	 */
	public class AreaLcl_Upd01 extends MABCL_MultiReg_MC_A.AreaLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Area_DelChk01オペレーション.<p>
	 *
	 * 地域マスタの削除前のチェックを行います。<br>
	 */
	public class Area_DelChk01 extends MABCL_MultiReg_MC_A.Area_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Area_Del01オペレーション.<p>
	 *
	 * 地域マスタの削除を行います。<br>
	 */
	public class Area_Del01 extends MABCL_MultiReg_MC_A.Area_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Cur_UpdChk01オペレーション.<p>
	 *
	 * 通貨マスタの登録前のチェックを行います。<br>
	 */
	public class Cur_UpdChk01 extends MABCL_MultiReg_MC_A.Cur_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Cur_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.cur_cd())){
					msgList.add(new MCMessage(row, Cur_UpdChk01_DtlR.$cur_cd, MABCL0306, 
									getLabel(row, Cur_UpdChk01_DtlR.$cur_cd), row.cur_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * Cur_Upd01オペレーション.<p>
	 *
	 * 通貨マスタの登録を行います。<br>
	 */
	public class Cur_Upd01 extends MABCL_MultiReg_MC_A.Cur_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CurLcl_UpdChk01オペレーション.<p>
	 *
	 * 通貨マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class CurLcl_UpdChk01 extends MABCL_MultiReg_MC_A.CurLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CurLcl_Upd01オペレーション.<p>
	 *
	 * 通貨マスタの登録を行います。（ロケール用）<br>
	 */
	public class CurLcl_Upd01 extends MABCL_MultiReg_MC_A.CurLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Cur_DelChk01オペレーション.<p>
	 *
	 * 通貨マスタの削除前のチェックを行います。<br>
	 */
	public class Cur_DelChk01 extends MABCL_MultiReg_MC_A.Cur_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Cur_Del01オペレーション.<p>
	 *
	 * 通貨マスタの削除を行います。<br>
	 */
	public class Cur_Del01 extends MABCL_MultiReg_MC_A.Cur_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Unit_UpdChk01オペレーション.<p>
	 *
	 * 単位マスタの登録前のチェックを行います。<br>
	 */
	public class Unit_UpdChk01 extends MABCL_MultiReg_MC_A.Unit_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Unit_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.unit_cd())){
					msgList.add(new MCMessage(row, Unit_UpdChk01_DtlR.$unit_cd, MABCL0306, 
									getLabel(row, Unit_UpdChk01_DtlR.$unit_cd), row.unit_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * Unit_Upd01オペレーション.<p>
	 *
	 * 単位マスタの登録を行います。<br>
	 */
	public class Unit_Upd01 extends MABCL_MultiReg_MC_A.Unit_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * UnitLcl_UpdChk01オペレーション.<p>
	 *
	 * 単位マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class UnitLcl_UpdChk01 extends MABCL_MultiReg_MC_A.UnitLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * UnitLcl_Upd01オペレーション.<p>
	 *
	 * 単位マスタの登録を行います。（ロケール用）<br>
	 */
	public class UnitLcl_Upd01 extends MABCL_MultiReg_MC_A.UnitLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Unit_DelChk01オペレーション.<p>
	 *
	 * 単位マスタの削除前のチェックを行います。<br>
	 */
	public class Unit_DelChk01 extends MABCL_MultiReg_MC_A.Unit_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Unit_Del01オペレーション.<p>
	 *
	 * 単位マスタの削除を行います。<br>
	 */
	public class Unit_Del01 extends MABCL_MultiReg_MC_A.Unit_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Bank_UpdChk01オペレーション.<p>
	 *
	 * 銀行マスタの登録前のチェックを行います。<br>
	 */
	public class Bank_UpdChk01 extends MABCL_MultiReg_MC_A.Bank_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(Bank_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.bank_cd())){
					msgList.add(new MCMessage(row, Bank_UpdChk01_DtlR.$bank_cd, MABCL0306, 
									getLabel(row, Bank_UpdChk01_DtlR.$bank_cd), row.bank_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * Bank_Upd01オペレーション.<p>
	 *
	 * 銀行マスタの登録を行います。<br>
	 */
	public class Bank_Upd01 extends MABCL_MultiReg_MC_A.Bank_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankLcl_UpdChk01オペレーション.<p>
	 *
	 * 銀行マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class BankLcl_UpdChk01 extends MABCL_MultiReg_MC_A.BankLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankLcl_Upd01オペレーション.<p>
	 *
	 * 銀行マスタの登録を行います。（ロケール用）<br>
	 */
	public class BankLcl_Upd01 extends MABCL_MultiReg_MC_A.BankLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Bank_DelChk01オペレーション.<p>
	 *
	 * 銀行マスタの削除前のチェックを行います。<br>
	 */
	public class Bank_DelChk01 extends MABCL_MultiReg_MC_A.Bank_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Bank_Del01オペレーション.<p>
	 *
	 * 銀行マスタの削除を行います。<br>
	 */
	public class Bank_Del01 extends MABCL_MultiReg_MC_A.Bank_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankBranch_UpdChk01オペレーション.<p>
	 *
	 * 銀行支店マスタの登録前のチェックを行います。<br>
	 */
	public class BankBranch_UpdChk01 extends MABCL_MultiReg_MC_A.BankBranch_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(BankBranch_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.branch_cd())){
					msgList.add(new MCMessage(row, BankBranch_UpdChk01_DtlR.$branch_cd, MABCL0306, 
									getLabel(row, BankBranch_UpdChk01_DtlR.$branch_cd), row.branch_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				if (row.getBooleanNE("err_flg")) {
					continue;
				}
			}
			return msgList;
		}
	}
	/**
	 * BankBranch_Upd01オペレーション.<p>
	 *
	 * 銀行支店マスタの登録を行います。<br>
	 */
	public class BankBranch_Upd01 extends MABCL_MultiReg_MC_A.BankBranch_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankBranchLcl_UpdChk01オペレーション.<p>
	 *
	 * 銀行支店マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	public class BankBranchLcl_UpdChk01 extends MABCL_MultiReg_MC_A.BankBranchLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankBranchLcl_Upd01オペレーション.<p>
	 *
	 * 銀行支店マスタの登録を行います。（ロケール用）<br>
	 */
	public class BankBranchLcl_Upd01 extends MABCL_MultiReg_MC_A.BankBranchLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankBranch_DelChk01オペレーション.<p>
	 *
	 * 銀行支店マスタの削除前のチェックを行います。<br>
	 */
	public class BankBranch_DelChk01 extends MABCL_MultiReg_MC_A.BankBranch_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BankBranch_Del01オペレーション.<p>
	 *
	 * 銀行支店マスタの削除を行います。<br>
	 */
	public class BankBranch_Del01 extends MABCL_MultiReg_MC_A.BankBranch_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}