package mcframe.serverMABC.MABCL2040;

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
import mcframe.serverMABC.MABCL2040.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MenuConfigReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MenuConfigReg_MC extends MABCL_MenuConfigReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * MenuConfig_Upd01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタの登録を行います。<br>
	 */
	public class MenuConfig_Upd01 extends MABCL_MenuConfigReg_MC_A.MenuConfig_Upd01 {
		@Override
		protected void call() {
			lock();
			update();
		}
		/**
		 * メニュー構成の更新
		 */
		protected void update() {
			doDel(up0());
			doIns(up0(), up1());
		}	
		/**
		 * ロック処理と排他処理<br>
		 */
		protected void lock() {
			// 新規登録の場合
			if(up0().isStatusCreate()){
				lockForIns(up0());
			}
			// 更新の場合
			else{
				lockForUpdDel(up0());
			}
		}
	}
	/**
	 * MenuConfig_Del01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタの削除を行います。<br>
	 */
	public class MenuConfig_Del01 extends MABCL_MenuConfigReg_MC_A.MenuConfig_Del01 {
		@Override
		protected void call() {
			lock();
			delete();
		}
		/**
		 * ロック処理と排他処理<br>
		 */
		protected void lock() {
			lockForUpdDel(up0());
		}
		
		/**
		 * メニュー構成の削除
		 */
		protected void delete() {
			doDel(up0());
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_MenuConfigReg_MC_A.Srch01 {
		@Override
		protected void call() {
			getCostMenu();
			super.call();
		}
		protected void  getCostMenu(){
			MAM_COST_MENU_R dbc = MAM_COST_MENU_R.create();
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_COST_MENU_R.create("T"));
			dbSelectKeyEx("MABCL2040_MAM_COST_MENU_S01", dbc, dbc_bldr, up0());
			copy(down1(), dbc, createMap_Srch01_Hdr1R_MAM_COST_MENU_R());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_MenuConfigReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_MenuConfigReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * MenuConfig_UpdChk01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタの登録前のチェックを行います。<br>
	 */
	public class MenuConfig_UpdChk01 extends MABCL_MenuConfigReg_MC_A.MenuConfig_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * MenuConfig_DelChk01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタの削除前のチェックを行います。<br>
	 */
	public class MenuConfig_DelChk01 extends MABCL_MenuConfigReg_MC_A.MenuConfig_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	// -- 更新系共通処理(START)

	/**
	 * ロック処理と排他処理<br>
	 * あるmenu_cdに対して、MAM_MENU_CONFIGの追加・更新・削除は、MAM_COST_MENUの対応行でロックまたは排他処理する。
	 */
	protected void lockForIns(MenuConfig_UpdChk01_HdrR up0){
		MAM_COST_MENU_R dbc = MAM_COST_MENU_R.create();
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc);
		dbc_bldr.removeSelect(MAM_COST_MENU_R.$base_menu_nm);
		dbSelectKeyForUpdateNoWait("MABCL2040_MAM_COST_MENU_S02", dbc, dbc_bldr, up0);
		
		MAM_MENU_CONFIG_R t = MAM_MENU_CONFIG_R.create("T");
		int cnt = execDbCount("MABCL2040_MAM_MENU_CONFIG_S01", t,
				t.menu_cd.eq(bind("1")), up0.menu_cd());
		if (cnt != 0) {
			throw new MCAppException(up0, null, MABCL0249);
		}
		dbTsUpdateKey("MABCL2040_MAM_COST_MENU_U01", dbc, dbc_bldr.getBaseDbc());
}
	
	
	/**
	 * ロック処理と排他処理<br>
	 * あるmenu_cdに対して、MAM_MENU_CONFIGの追加・更新・削除は、MAM_COST_MENUの対応行でロックまたは排他処理する。
	 */
	protected void lockForUpdDel(MenuConfig_UpdChk01_HdrR up0){
		MAM_COST_MENU_R dbc = MAM_COST_MENU_R.create();
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MAM_COST_MENU_R.create("T"));
		dbc_bldr.removeSelect(MAM_COST_MENU_R.$base_menu_nm);
		dbSelectKeyForUpdateNoWait("MABCL2040_MAM_COST_MENU_S03", dbc, dbc_bldr, up0);
		checkUpdCntr(up0, dbc);
		dbTsUpdateKey("MABCL2040_MAM_COST_MENU_U02", dbc, dbc_bldr.getBaseDbc());
	}

	/**
	 * メニュー構成の追加
	 */
	protected void doIns(MenuConfig_UpdChk01_HdrR up0, MCList<MenuConfig_UpdChk01_DtlR> up1) {
		MCList<MAM_MENU_CONFIG_R> list = MCList.create(MAM_MENU_CONFIG_R.class);
		for(MAM_MENU_CONFIG_R dtl : up1){
			MAM_MENU_CONFIG_R dbc = MAM_MENU_CONFIG_R.create();
			copy(dbc, dtl, createMap_MAM_MENU_CONFIG_R_MAM_MENU_CONFIG_R());
			dbc.menu_cd(up0.menu_cd());
			list.add(dbc);
		}
		MCQueryApiBuilder list_bldr = MCQueryApiBuilder.create(MAM_MENU_CONFIG_R.create("T"));
		dbInsert("MABCL2040_MAM_MENU_CONFIG_I01", list, list_bldr);
	}

	
	/**
	 * メニュー構成の削除
	 */
	protected void doDel(MenuConfig_UpdChk01_HdrR up0) {
		MAM_MENU_CONFIG_R t = MAM_MENU_CONFIG_R.create("T");
		execDbDelete("MABCL2040_MAM_MENU_CONFIG_D01", t, t.menu_cd.eq(bind("1")), up0.menu_cd());
	}
	
	// -- 更新系共通処理(END)
	
	// RowMapper
	protected Map_MAM_MENU_CONFIG_R_MAM_MENU_CONFIG_R<MAM_MENU_CONFIG_R,MAM_MENU_CONFIG_R> createMap_MAM_MENU_CONFIG_R_MAM_MENU_CONFIG_R() {
		return new Map_MAM_MENU_CONFIG_R_MAM_MENU_CONFIG_R<MAM_MENU_CONFIG_R, MAM_MENU_CONFIG_R>();
	}
	public class Map_MAM_MENU_CONFIG_R_MAM_MENU_CONFIG_R<D extends MAM_MENU_CONFIG_R, S extends MAM_MENU_CONFIG_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MAM_MENU_CONFIG_R.$menu_cd, MAM_MENU_CONFIG_R.$menu_cd);
			addColumnPathMap(MAM_MENU_CONFIG_R.$menu_no, MAM_MENU_CONFIG_R.$menu_no);
			addColumnPathMap(MAM_MENU_CONFIG_R.$module_id, MAM_MENU_CONFIG_R.$module_id);
			addColumnPathMap(MAM_MENU_CONFIG_R.$scrn_id, MAM_MENU_CONFIG_R.$scrn_id);
			addColumnPathMap(MAM_MENU_CONFIG_R.$memo1, MAM_MENU_CONFIG_R.$memo1);
			addColumnPathMap(MAM_MENU_CONFIG_R.$memo2, MAM_MENU_CONFIG_R.$memo2);
			addColumnPathMap(MAM_MENU_CONFIG_R.$memo3, MAM_MENU_CONFIG_R.$memo3);
			addColumnPathMap(MAM_MENU_CONFIG_R.$del_flg, MAM_MENU_CONFIG_R.$del_flg);
			addColumnPathMap(MAM_MENU_CONFIG_R.$del_usr_id, MAM_MENU_CONFIG_R.$del_usr_id);
			addColumnPathMap(MAM_MENU_CONFIG_R.$del_ts, MAM_MENU_CONFIG_R.$del_ts);
			addColumnPathMap(MAM_MENU_CONFIG_R.$ins_usr_id, MAM_MENU_CONFIG_R.$ins_usr_id);
			addColumnPathMap(MAM_MENU_CONFIG_R.$ins_ts, MAM_MENU_CONFIG_R.$ins_ts);
			addColumnPathMap(MAM_MENU_CONFIG_R.$ins_func_id, MAM_MENU_CONFIG_R.$ins_func_id);
			addColumnPathMap(MAM_MENU_CONFIG_R.$upd_cntr, MAM_MENU_CONFIG_R.$upd_cntr);
			addColumnPathMap(MAM_MENU_CONFIG_R.$upd_usr_id, MAM_MENU_CONFIG_R.$upd_usr_id);
			addColumnPathMap(MAM_MENU_CONFIG_R.$upd_func_id, MAM_MENU_CONFIG_R.$upd_func_id);
			addColumnPathMap(MAM_MENU_CONFIG_R.$upd_srv_req_no, MAM_MENU_CONFIG_R.$upd_srv_req_no);
			addColumnPathMap(MAM_MENU_CONFIG_R.$menu_nm, MAM_MENU_CONFIG_R.$menu_nm);

		}
	}

	protected Map_Srch01_Hdr1R_MAM_COST_MENU_R<Srch01_Hdr1R,MAM_COST_MENU_R> createMap_Srch01_Hdr1R_MAM_COST_MENU_R() {
		return new Map_Srch01_Hdr1R_MAM_COST_MENU_R<Srch01_Hdr1R, MAM_COST_MENU_R>();
	}
	public class Map_Srch01_Hdr1R_MAM_COST_MENU_R<D extends Srch01_Hdr1R, S extends MAM_COST_MENU_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_Hdr1R.$menu_cd, MAM_COST_MENU_R.$menu_cd);
			addColumnPathMap(Srch01_Hdr1R.$menu_nm, MAM_COST_MENU_R.$menu_nm);
			addColumnPathMap(Srch01_Hdr1R.$upd_cntr, MAM_COST_MENU_R.$upd_cntr);

		}
	}

	//FMCB CUSTOM END
}