package mcframe.serverMSBE.MSBEL5040;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBEL_AllocMngService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_AllocMngService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_AllocMngService.Alloc_Lock_Upd01 aAlloc_Lock_Upd01;

	protected void initAlloc_Lock_Upd01() {
		this.info = PDef.MS_MSBEL5040_Alloc_Lock_Upd01_INFO;
		this.aAlloc_Lock_Upd01 = ((MSBEL_AllocMngService)this).new Alloc_Lock_Upd01();
	}

	public static MSBEL_AllocMngService.Alloc_Lock_Upd01 crtAlloc_Lock_Upd01() {
		MSBEL_AllocMngService lgc = new MSBEL_AllocMngService();
		lgc.initAlloc_Lock_Upd01();
		return lgc.aAlloc_Lock_Upd01;
	}

	protected void paramAlloc_Lock_Upd01(MCParam p) {
		if (this.aAlloc_Lock_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlloc_Lock_Upd01.up0());
	}

	protected void doAlloc_Lock_Upd01() {
		aAlloc_Lock_Upd01.call();
	};

	/**
	 * Alloc_Lock_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R createAlloc_Lock_Upd01_DtlR(){
		return mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R.create();
	}

	/**
	 * Alloc_Lock_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R> createAlloc_Lock_Upd01_DtlL(){
		return MCList.create(mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R.class);
	}
	protected MSBEL_AllocMngService.Alloc_Srch01 aAlloc_Srch01;

	protected void initAlloc_Srch01() {
		this.info = PDef.MS_MSBEL5040_Alloc_Srch01_INFO;
		this.aAlloc_Srch01 = ((MSBEL_AllocMngService)this).new Alloc_Srch01();
	}

	public static MSBEL_AllocMngService.Alloc_Srch01 crtAlloc_Srch01() {
		MSBEL_AllocMngService lgc = new MSBEL_AllocMngService();
		lgc.initAlloc_Srch01();
		return lgc.aAlloc_Srch01;
	}

	protected void paramAlloc_Srch01(MCParam p) {
		if (this.aAlloc_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlloc_Srch01.up0());
		p.addUpBlock(aAlloc_Srch01.up1());
		p.addUpBlock(aAlloc_Srch01.up2());
		p.addUpBlock(aAlloc_Srch01.up3());
		p.addUpBlock(aAlloc_Srch01.up4());
		p.addDownBlock(aAlloc_Srch01.down0());
		p.addDownBlock(aAlloc_Srch01.down1());
		p.addDownBlock(aAlloc_Srch01.down2());
		p.addDownBlock(aAlloc_Srch01.down3());
		p.addDownBlock(aAlloc_Srch01.down4());
	}

	protected void doAlloc_Srch01() {
		aAlloc_Srch01.call();
	};

	/**
	 * CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.CndR createCndR(){
		return mcframe.serverMSBE.MSBEL5040.CndR.create();
	}

	/**
	 * Srch_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createSrch_TgtR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
	}

	/**
	 * Srch_TgtブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createSrch_TgtL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
	}

	/**
	 * Srch_StkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_StkR createSrch_StkR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_StkR.create();
	}

	/**
	 * Srch_StkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Srch_StkR> createSrch_StkL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_StkR.class);
	}

	/**
	 * Srch_Io_SchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR createSrch_Io_SchdR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR.create();
	}

	/**
	 * Srch_Io_SchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR> createSrch_Io_SchdL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR.class);
	}

	/**
	 * Srch_Io_Schd_SubブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R createSrch_Io_Schd_SubR(){
		return mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.create();
	}

	/**
	 * Srch_Io_Schd_SubブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> createSrch_Io_Schd_SubL(){
		return MCList.create(mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.class);
	}

	/**
	 * Srch_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createSrch_RsltR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
	}

	/**
	 * Srch_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createSrch_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
	}

	/**
	 * Alt_UnAvlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR createAlt_UnAvlR(){
		return mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.create();
	}

	/**
	 * Alt_UnAvlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> createAlt_UnAvlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.class);
	}

	/**
	 * Srch_Tgt_UnAvlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createSrch_Tgt_UnAvlR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
	}

	/**
	 * Srch_Tgt_UnAvlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createSrch_Tgt_UnAvlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
	}

	/**
	 * Loc_UnAvl_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createLoc_UnAvl_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
	}

	/**
	 * Loc_UnAvl_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createLoc_UnAvl_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
	}

	/**
	 * Grs_UnAvl_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createGrs_UnAvl_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
	}

	/**
	 * Grs_UnAvl_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createGrs_UnAvl_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
	}

	/**
	 * Loc_Map_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR createLoc_Map_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR.create();
	}

	/**
	 * Loc_Map_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR> createLoc_Map_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR.class);
	}

	/**
	 * Vld_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Vld_ListR createVld_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Vld_ListR.create();
	}

	/**
	 * Vld_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Vld_ListR> createVld_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Vld_ListR.class);
	}
	protected MSBEL_AllocMngService.Alloc_Srch02 aAlloc_Srch02;

	protected void initAlloc_Srch02() {
		this.info = PDef.MS_MSBEL5040_Alloc_Srch02_INFO;
		this.aAlloc_Srch02 = ((MSBEL_AllocMngService)this).new Alloc_Srch02();
	}

	public static MSBEL_AllocMngService.Alloc_Srch02 crtAlloc_Srch02() {
		MSBEL_AllocMngService lgc = new MSBEL_AllocMngService();
		lgc.initAlloc_Srch02();
		return lgc.aAlloc_Srch02;
	}

	protected void paramAlloc_Srch02(MCParam p) {
		if (this.aAlloc_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlloc_Srch02.up0());
		p.addUpBlock(aAlloc_Srch02.up1());
		p.addUpBlock(aAlloc_Srch02.up2());
		p.addDownBlock(aAlloc_Srch02.down0());
		p.addDownBlock(aAlloc_Srch02.down1());
		p.addDownBlock(aAlloc_Srch02.down2());
		p.addDownBlock(aAlloc_Srch02.down3());
	}

	protected void doAlloc_Srch02() {
		aAlloc_Srch02.call();
	};

	/**
	 * Avl_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createAvl_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Avl_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createAvl_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}

	/**
	 * Rem_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createRem_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Rem_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createRem_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}
	protected MSBEL_AllocMngService.Alloc_Srch03 aAlloc_Srch03;

	protected void initAlloc_Srch03() {
		this.info = PDef.MS_MSBEL5040_Alloc_Srch03_INFO;
		this.aAlloc_Srch03 = ((MSBEL_AllocMngService)this).new Alloc_Srch03();
	}

	public static MSBEL_AllocMngService.Alloc_Srch03 crtAlloc_Srch03() {
		MSBEL_AllocMngService lgc = new MSBEL_AllocMngService();
		lgc.initAlloc_Srch03();
		return lgc.aAlloc_Srch03;
	}

	protected void paramAlloc_Srch03(MCParam p) {
		if (this.aAlloc_Srch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlloc_Srch03.up0());
		p.addUpBlock(aAlloc_Srch03.up1());
		p.addUpBlock(aAlloc_Srch03.up2());
		p.addDownBlock(aAlloc_Srch03.down0());
		p.addDownBlock(aAlloc_Srch03.down1());
		p.addDownBlock(aAlloc_Srch03.down2());
	}

	protected void doAlloc_Srch03() {
		aAlloc_Srch03.call();
	};
	protected MSBEL_AllocMngService.Alloc_Avl_Srch01 aAlloc_Avl_Srch01;

	protected void initAlloc_Avl_Srch01() {
		this.info = PDef.MS_MSBEL5040_Alloc_Avl_Srch01_INFO;
		this.aAlloc_Avl_Srch01 = ((MSBEL_AllocMngService)this).new Alloc_Avl_Srch01();
	}

	public static MSBEL_AllocMngService.Alloc_Avl_Srch01 crtAlloc_Avl_Srch01() {
		MSBEL_AllocMngService lgc = new MSBEL_AllocMngService();
		lgc.initAlloc_Avl_Srch01();
		return lgc.aAlloc_Avl_Srch01;
	}

	protected void paramAlloc_Avl_Srch01(MCParam p) {
		if (this.aAlloc_Avl_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlloc_Avl_Srch01.up0());
		p.addUpBlock(aAlloc_Avl_Srch01.up1());
		p.addUpBlock(aAlloc_Avl_Srch01.up2());
		p.addUpBlock(aAlloc_Avl_Srch01.up3());
		p.addUpBlock(aAlloc_Avl_Srch01.up4());
		p.addUpBlock(aAlloc_Avl_Srch01.up5());
		p.addUpBlock(aAlloc_Avl_Srch01.up6());
		p.addDownBlock(aAlloc_Avl_Srch01.down0());
		p.addDownBlock(aAlloc_Avl_Srch01.down1());
		p.addDownBlock(aAlloc_Avl_Srch01.down2());
		p.addDownBlock(aAlloc_Avl_Srch01.down3());
		p.addDownBlock(aAlloc_Avl_Srch01.down4());
		p.addDownBlock(aAlloc_Avl_Srch01.down5());
		p.addDownBlock(aAlloc_Avl_Srch01.down6());
		p.addDownBlock(aAlloc_Avl_Srch01.down7());
		p.addDownBlock(aAlloc_Avl_Srch01.down8());
	}

	protected void doAlloc_Avl_Srch01() {
		aAlloc_Avl_Srch01.call();
	};

	/**
	 * Alloc_Avl_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch01_CndR createAlloc_Avl_Srch01_CndR(){
		return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch01_CndR.create();
	}

	/**
	 * Pri_Srch_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createPri_Srch_TgtR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
	}

	/**
	 * Pri_Srch_TgtブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createPri_Srch_TgtL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
	}

	/**
	 * Stk_Gr_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createStk_Gr_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Stk_Gr_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createStk_Gr_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}

	/**
	 * Srch_Lot_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_Lot_ListR createSrch_Lot_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_Lot_ListR.create();
	}

	/**
	 * Srch_TgtブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createSrch_TgtR_0(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Srch_TgtブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createSrch_TgtL_0(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}

	/**
	 * Loc_Avl_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createLoc_Avl_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Loc_Avl_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createLoc_Avl_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}

	/**
	 * Grs_Avl_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGrs_Avl_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Grs_Avl_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGrs_Avl_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}

	/**
	 * Loc_UnAvl_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createLoc_UnAvl_ListR_0(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Loc_UnAvl_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createLoc_UnAvl_ListL_0(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}

	/**
	 * Grs_UnAvl_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGrs_UnAvl_ListR_0(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Grs_UnAvl_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGrs_UnAvl_ListL_0(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}

	/**
	 * Srch_Tgt_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createSrch_Tgt_RsltR(){
		return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
	}

	/**
	 * Srch_Tgt_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createSrch_Tgt_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
	}

	/**
	 * Srch_Tgt_Alt_UnAvlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR createSrch_Tgt_Alt_UnAvlR(){
		return mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.create();
	}

	/**
	 * Srch_Tgt_Alt_UnAvlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> createSrch_Tgt_Alt_UnAvlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.class);
	}

	/**
	 * Can_Gr_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createCan_Gr_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Can_Gr_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createCan_Gr_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}

	/**
	 * Lot_MixブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Lot_MixR createLot_MixR(){
		return mcframe.serverMSBE.MSBEL5040.Lot_MixR.create();
	}

	/**
	 * Loc_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Loc_ListR createLoc_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Loc_ListR.create();
	}

	/**
	 * Loc_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Loc_ListR> createLoc_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Loc_ListR.class);
	}

	/**
	 * Lno_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Lno_ListR createLno_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Lno_ListR.create();
	}

	/**
	 * Lno_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> createLno_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Lno_ListR.class);
	}

	/**
	 * Prio_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Prio_ListR createPrio_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Prio_ListR.create();
	}

	/**
	 * Prio_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Prio_ListR> createPrio_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Prio_ListR.class);
	}
	protected MSBEL_AllocMngService.Alloc_Avl_Srch02 aAlloc_Avl_Srch02;

	protected void initAlloc_Avl_Srch02() {
		this.info = PDef.MS_MSBEL5040_Alloc_Avl_Srch02_INFO;
		this.aAlloc_Avl_Srch02 = ((MSBEL_AllocMngService)this).new Alloc_Avl_Srch02();
	}

	public static MSBEL_AllocMngService.Alloc_Avl_Srch02 crtAlloc_Avl_Srch02() {
		MSBEL_AllocMngService lgc = new MSBEL_AllocMngService();
		lgc.initAlloc_Avl_Srch02();
		return lgc.aAlloc_Avl_Srch02;
	}

	protected void paramAlloc_Avl_Srch02(MCParam p) {
		if (this.aAlloc_Avl_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlloc_Avl_Srch02.up0());
		p.addUpBlock(aAlloc_Avl_Srch02.up1());
		p.addUpBlock(aAlloc_Avl_Srch02.up2());
		p.addUpBlock(aAlloc_Avl_Srch02.up3());
		p.addUpBlock(aAlloc_Avl_Srch02.up4());
		p.addDownBlock(aAlloc_Avl_Srch02.down0());
		p.addDownBlock(aAlloc_Avl_Srch02.down1());
		p.addDownBlock(aAlloc_Avl_Srch02.down2());
		p.addDownBlock(aAlloc_Avl_Srch02.down3());
		p.addDownBlock(aAlloc_Avl_Srch02.down4());
	}

	protected void doAlloc_Avl_Srch02() {
		aAlloc_Avl_Srch02.call();
	};

	/**
	 * Alloc_Avl_Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR createAlloc_Avl_Srch02_CndR(){
		return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR.create();
	}

	/**
	 * Gi_Fix_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGi_Fix_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Gi_Fix_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGi_Fix_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}

	/**
	 * Gi_Not_Fix_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGi_Not_Fix_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Gi_Not_Fix_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGi_Not_Fix_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}
	protected MSBEL_AllocMngService.Alloc_Avl_Srch03 aAlloc_Avl_Srch03;

	protected void initAlloc_Avl_Srch03() {
		this.info = PDef.MS_MSBEL5040_Alloc_Avl_Srch03_INFO;
		this.aAlloc_Avl_Srch03 = ((MSBEL_AllocMngService)this).new Alloc_Avl_Srch03();
	}

	public static MSBEL_AllocMngService.Alloc_Avl_Srch03 crtAlloc_Avl_Srch03() {
		MSBEL_AllocMngService lgc = new MSBEL_AllocMngService();
		lgc.initAlloc_Avl_Srch03();
		return lgc.aAlloc_Avl_Srch03;
	}

	protected void paramAlloc_Avl_Srch03(MCParam p) {
		if (this.aAlloc_Avl_Srch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlloc_Avl_Srch03.up0());
		p.addUpBlock(aAlloc_Avl_Srch03.up1());
		p.addUpBlock(aAlloc_Avl_Srch03.up2());
		p.addUpBlock(aAlloc_Avl_Srch03.up3());
		p.addDownBlock(aAlloc_Avl_Srch03.down0());
		p.addDownBlock(aAlloc_Avl_Srch03.down1());
		p.addDownBlock(aAlloc_Avl_Srch03.down2());
		p.addDownBlock(aAlloc_Avl_Srch03.down3());
	}

	protected void doAlloc_Avl_Srch03() {
		aAlloc_Avl_Srch03.call();
	};

	/**
	 * Alloc_Avl_Srch03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR createAlloc_Avl_Srch03_CndR(){
		return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR.create();
	}

	/**
	 * Gi_ListブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGi_ListR(){
		return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
	}

	/**
	 * Gi_ListブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGi_ListL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
	}
	protected MSBEL_AllocMngService.Alloc_Avl_Srch04 aAlloc_Avl_Srch04;

	protected void initAlloc_Avl_Srch04() {
		this.info = PDef.MS_MSBEL5040_Alloc_Avl_Srch04_INFO;
		this.aAlloc_Avl_Srch04 = ((MSBEL_AllocMngService)this).new Alloc_Avl_Srch04();
	}

	public static MSBEL_AllocMngService.Alloc_Avl_Srch04 crtAlloc_Avl_Srch04() {
		MSBEL_AllocMngService lgc = new MSBEL_AllocMngService();
		lgc.initAlloc_Avl_Srch04();
		return lgc.aAlloc_Avl_Srch04;
	}

	protected void paramAlloc_Avl_Srch04(MCParam p) {
		if (this.aAlloc_Avl_Srch04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlloc_Avl_Srch04.up0());
		p.addUpBlock(aAlloc_Avl_Srch04.up1());
		p.addUpBlock(aAlloc_Avl_Srch04.up2());
		p.addDownBlock(aAlloc_Avl_Srch04.down0());
		p.addDownBlock(aAlloc_Avl_Srch04.down1());
		p.addDownBlock(aAlloc_Avl_Srch04.down2());
	}

	protected void doAlloc_Avl_Srch04() {
		aAlloc_Avl_Srch04.call();
	};

	/**
	 * Alloc_Avl_Srch04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch04_CndR createAlloc_Avl_Srch04_CndR(){
		return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch04_CndR.create();
	}
	protected MSBEL_AllocMngService.Alloc_Avl_Sprt01 aAlloc_Avl_Sprt01;

	protected void initAlloc_Avl_Sprt01() {
		this.info = PDef.MS_MSBEL5040_Alloc_Avl_Sprt01_INFO;
		this.aAlloc_Avl_Sprt01 = ((MSBEL_AllocMngService)this).new Alloc_Avl_Sprt01();
	}

	public static MSBEL_AllocMngService.Alloc_Avl_Sprt01 crtAlloc_Avl_Sprt01() {
		MSBEL_AllocMngService lgc = new MSBEL_AllocMngService();
		lgc.initAlloc_Avl_Sprt01();
		return lgc.aAlloc_Avl_Sprt01;
	}

	protected void paramAlloc_Avl_Sprt01(MCParam p) {
		if (this.aAlloc_Avl_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlloc_Avl_Sprt01.up0());
		p.addDownBlock(aAlloc_Avl_Sprt01.down0());
	}

	protected void doAlloc_Avl_Sprt01() {
		aAlloc_Avl_Sprt01.call();
	};

	/**
	 * Alloc_Avl_Sprt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR createAlloc_Avl_Sprt01_CndR(){
		return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR.create();
	}

	/**
	 * Alloc_Avl_Sprt01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR> createAlloc_Avl_Sprt01_CndL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Alloc_Lock_Upd01オペレーション.<p>
	 *
	 * 引当処理の前にロックを取得する<br>
	 */
	abstract public class Alloc_Lock_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Alloc_Lock_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R> up0;
		
		
		// コンストラクタ
		protected Alloc_Lock_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Alloc_Lock_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R createAlloc_Lock_Upd01_DtlR(){
			return mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R.create();
		}

		/**
		 * Alloc_Lock_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R> createAlloc_Lock_Upd01_DtlL(){
			return MCList.create(mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMS.dbc.MSW_ALLOC_LOC_MAP_R> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this).info;
		}


	}
	/**
	 * Alloc_Srch01オペレーション.<p>
	 *
	 * 指定された品目について在庫や入庫予定を提案する<br>
	 */
	abstract public class Alloc_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Alloc_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5040.CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_StkR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down4;
		/** [Loc_Map_List]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR> aLoc_Map_List;
		/** [Vld_List]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Vld_ListR> aVld_List;
		
		
		// コンストラクタ
		protected Alloc_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5040.CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_StkR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR.class);
			up4 = MCList.create(mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
			down4 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
			aLoc_Map_List = MCList.create(mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR.class);
			aVld_List = MCList.create(mcframe.serverMSBE.MSBEL5040.Vld_ListR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.CndR createCndR(){
			return mcframe.serverMSBE.MSBEL5040.CndR.create();
		}

		/**
		 * Srch_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createSrch_TgtR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
		}

		/**
		 * Srch_TgtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createSrch_TgtL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
		}

		/**
		 * Srch_StkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_StkR createSrch_StkR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_StkR.create();
		}

		/**
		 * Srch_StkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_StkR> createSrch_StkL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_StkR.class);
		}

		/**
		 * Srch_Io_SchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR createSrch_Io_SchdR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR.create();
		}

		/**
		 * Srch_Io_SchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR> createSrch_Io_SchdL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR.class);
		}

		/**
		 * Srch_Io_Schd_SubブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R createSrch_Io_Schd_SubR(){
			return mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.create();
		}

		/**
		 * Srch_Io_Schd_SubブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> createSrch_Io_Schd_SubL(){
			return MCList.create(mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R.class);
		}

		/**
		 * Srch_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createSrch_RsltR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
		}

		/**
		 * Srch_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createSrch_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
		}

		/**
		 * Alt_UnAvlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR createAlt_UnAvlR(){
			return mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.create();
		}

		/**
		 * Alt_UnAvlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> createAlt_UnAvlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.class);
		}

		/**
		 * Srch_Tgt_UnAvlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createSrch_Tgt_UnAvlR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
		}

		/**
		 * Srch_Tgt_UnAvlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createSrch_Tgt_UnAvlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
		}

		/**
		 * Loc_UnAvl_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createLoc_UnAvl_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
		}

		/**
		 * Loc_UnAvl_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createLoc_UnAvl_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
		}

		/**
		 * Grs_UnAvl_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createGrs_UnAvl_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
		}

		/**
		 * Grs_UnAvl_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createGrs_UnAvl_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
		}

		/**
		 * Loc_Map_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR createLoc_Map_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR.create();
		}

		/**
		 * Loc_Map_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR> createLoc_Map_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR.class);
		}

		/**
		 * Vld_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Vld_ListR createVld_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Vld_ListR.create();
		}

		/**
		 * Vld_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Vld_ListR> createVld_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Vld_ListR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>short_ope_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_prop_typ</td></tr>
		 * 	<tr><td><br></td><td>except_alloc_wait_flg</td></tr>
		 * 	<tr><td><br></td><td>nm_srch_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_src_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5040.CndR
		 */
		public mcframe.serverMSBE.MSBEL5040.CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr_grp</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>except_alloc_wait_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_info_loc_typ</td></tr>
		 * 	<tr><td><br></td><td>def_ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>chk_ship_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_StkR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_typ1</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_no1</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_seq1</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_typ2</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_no2</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_seq2</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_typ3</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_no3</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_seq3</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_typ4</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_no4</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sub_seq4</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMS.dbc.MSW_IO_SCHD_DEL_R> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr_grp</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_alloc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down4() {
			return down4;
		}


		/**
		 * [Loc_Map_List]ブロックのコンテナaLoc_Map_ListLを返します。
		 *
		 * @return Loc_Map_ListL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Loc_Map_ListR> Loc_Map_List() {
			return aLoc_Map_List;
		}

		/**
		 * [Vld_List]ブロックのコンテナaVld_ListLを返します。
		 *
		 * @return Vld_ListL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Vld_ListR> Vld_List() {
			return aVld_List;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this).info;
		}


	}
	/**
	 * Alloc_Srch02オペレーション.<p>
	 *
	 * 指定された条件に適する在庫や入庫予定を算出する<br>
	 */
	abstract public class Alloc_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Alloc_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5040.CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> down3;
		
		
		// コンストラクタ
		protected Alloc_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5040.CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.CndR createCndR(){
			return mcframe.serverMSBE.MSBEL5040.CndR.create();
		}

		/**
		 * Srch_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createSrch_TgtR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
		}

		/**
		 * Srch_TgtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createSrch_TgtL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
		}

		/**
		 * Avl_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createAvl_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Avl_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createAvl_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Srch_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createSrch_RsltR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
		}

		/**
		 * Srch_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createSrch_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
		}

		/**
		 * Alt_UnAvlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR createAlt_UnAvlR(){
			return mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.create();
		}

		/**
		 * Alt_UnAvlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> createAlt_UnAvlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.class);
		}

		/**
		 * Rem_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createRem_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Rem_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createRem_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Srch_Tgt_UnAvlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createSrch_Tgt_UnAvlR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
		}

		/**
		 * Srch_Tgt_UnAvlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createSrch_Tgt_UnAvlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>short_ope_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5040.CndR
		 */
		public mcframe.serverMSBE.MSBEL5040.CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>schd_stk_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_stk_prio</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_seq</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_ln_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_alloc_lmt_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>alloc_days</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>unreg_lmt_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_src_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_not_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_lg_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_lg_not_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_not_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_lg_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_lg_not_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_grs_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_not_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_lg_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_lg_not_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_grs_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_src_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_not_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_lg_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_lg_not_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_not_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_lg_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_lg_not_lot_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_grs_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_not_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_lg_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_lg_not_lot_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_grs_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_wait_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>not_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr_grp</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>stop_dt</td></tr>
		 * 	<tr><td><br></td><td>rel_dt</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_info_loc_typ</td></tr>
		 * 	<tr><td><br></td><td>lno</td></tr>
		 * 	<tr><td><br></td><td>can_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_non_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_srch_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>chk_ship_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this).info;
		}


	}
	/**
	 * Alloc_Srch03オペレーション.<p>
	 *
	 * 指定された条件に適する在庫や入庫予定を算出する（総量引当版）<br>
	 */
	abstract public class Alloc_Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Alloc_Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5040.CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> down2;
		
		
		// コンストラクタ
		protected Alloc_Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5040.CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.CndR createCndR(){
			return mcframe.serverMSBE.MSBEL5040.CndR.create();
		}

		/**
		 * Srch_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createSrch_TgtR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
		}

		/**
		 * Srch_TgtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createSrch_TgtL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
		}

		/**
		 * Avl_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createAvl_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Avl_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createAvl_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Srch_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createSrch_RsltR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
		}

		/**
		 * Srch_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createSrch_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
		}

		/**
		 * Rem_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createRem_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Rem_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createRem_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Srch_Tgt_UnAvlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createSrch_Tgt_UnAvlR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
		}

		/**
		 * Srch_Tgt_UnAvlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createSrch_Tgt_UnAvlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>short_ope_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5040.CndR
		 */
		public mcframe.serverMSBE.MSBEL5040.CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr_grp</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this).info;
		}


	}
	/**
	 * Alloc_Avl_Srch01オペレーション.<p>
	 *
	 * 在庫や入庫予定から引当済みの出庫予定を減算して使用可能在庫を取得する<br>
	 */
	abstract public class Alloc_Avl_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Alloc_Avl_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_StkR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5040.Srch_Lot_ListR up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up6;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down7;
		/** このオペレーションからの下り電文パラメータの第8ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> down8;
		/** [Loc_List]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Loc_ListR> aLoc_List;
		/** [Lot_Mix]ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5040.Lot_MixR aLot_Mix;
		/** [Prio_List]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Prio_ListR> aPrio_List;
		
		
		// コンストラクタ
		protected Alloc_Avl_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch01_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_StkR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			up4 = mcframe.serverMSBE.MSBEL5040.Srch_Lot_ListR.create();
			up5 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR.class);
			up6 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down4 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
			down5 = MCList.create(mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.class);
			down6 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
			down7 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down8 = MCList.create(mcframe.serverMSBE.MSBEL5040.Lno_ListR.class);
			aLoc_List = MCList.create(mcframe.serverMSBE.MSBEL5040.Loc_ListR.class);
			aLot_Mix = mcframe.serverMSBE.MSBEL5040.Lot_MixR.create();
			aPrio_List = MCList.create(mcframe.serverMSBE.MSBEL5040.Prio_ListR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			if (i == 6) return up6();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			if (i == 7) return down7();
			if (i == 8) return down8();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
			down7().clear();
			down8().clear();
		}
		/**
		 * Alloc_Avl_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch01_CndR createAlloc_Avl_Srch01_CndR(){
			return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch01_CndR.create();
		}

		/**
		 * Pri_Srch_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createPri_Srch_TgtR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
		}

		/**
		 * Pri_Srch_TgtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createPri_Srch_TgtL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
		}

		/**
		 * Srch_StkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_StkR createSrch_StkR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_StkR.create();
		}

		/**
		 * Srch_StkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_StkR> createSrch_StkL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_StkR.class);
		}

		/**
		 * Stk_Gr_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createStk_Gr_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Stk_Gr_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createStk_Gr_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Srch_Lot_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_Lot_ListR createSrch_Lot_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_Lot_ListR.create();
		}

		/**
		 * Srch_Io_SchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR createSrch_Io_SchdR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR.create();
		}

		/**
		 * Srch_Io_SchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR> createSrch_Io_SchdL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR.class);
		}

		/**
		 * Srch_TgtブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createSrch_TgtR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Srch_TgtブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createSrch_TgtL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Loc_Avl_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createLoc_Avl_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Loc_Avl_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createLoc_Avl_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Grs_Avl_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGrs_Avl_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Grs_Avl_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGrs_Avl_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Loc_UnAvl_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createLoc_UnAvl_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Loc_UnAvl_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createLoc_UnAvl_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Grs_UnAvl_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGrs_UnAvl_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Grs_UnAvl_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGrs_UnAvl_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Srch_Tgt_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createSrch_Tgt_RsltR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
		}

		/**
		 * Srch_Tgt_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createSrch_Tgt_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
		}

		/**
		 * Srch_Tgt_Alt_UnAvlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR createSrch_Tgt_Alt_UnAvlR(){
			return mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.create();
		}

		/**
		 * Srch_Tgt_Alt_UnAvlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> createSrch_Tgt_Alt_UnAvlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR.class);
		}

		/**
		 * Srch_Tgt_UnAvlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_TgtR createSrch_Tgt_UnAvlR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_TgtR.create();
		}

		/**
		 * Srch_Tgt_UnAvlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> createSrch_Tgt_UnAvlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_TgtR.class);
		}

		/**
		 * Can_Gr_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createCan_Gr_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Can_Gr_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createCan_Gr_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Lot_MixブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Lot_MixR createLot_MixR(){
			return mcframe.serverMSBE.MSBEL5040.Lot_MixR.create();
		}

		/**
		 * Loc_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Loc_ListR createLoc_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Loc_ListR.create();
		}

		/**
		 * Loc_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Loc_ListR> createLoc_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Loc_ListR.class);
		}

		/**
		 * Lno_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Lno_ListR createLno_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Lno_ListR.create();
		}

		/**
		 * Lno_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> createLno_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Lno_ListR.class);
		}

		/**
		 * Prio_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Prio_ListR createPrio_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Prio_ListR.create();
		}

		/**
		 * Prio_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Prio_ListR> createPrio_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Prio_ListR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>short_ope_typ</td></tr>
		 * 	<tr><td><br></td><td>gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>all_pri_flg</td></tr>
		 * 	<tr><td><br></td><td>except_alloc_wait_flg</td></tr>
		 * 	<tr><td><br></td><td>except_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>except_invld_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_srch_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ignore_margin_days</td></tr>
		 * 	<tr><td><br></td><td>xfr_src_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alt_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_qty</td></tr>
		 * 	<tr><td><br></td><td>not_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_fr_grp</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_srch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_StkR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5040.Srch_Lot_ListR
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_Lot_ListR up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_Io_SchdR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up6() {
			return up6;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Alt_UnAvlR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_TgtR> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down7() {
			return down7;
		}

		/**
		 * 下り電文の第8ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第8ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gi_lno</td></tr>
		 * 	<tr><td><br></td><td>gr_lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> down8() {
			return down8;
		}


		/**
		 * [Loc_List]ブロックのコンテナaLoc_ListLを返します。
		 *
		 * @return Loc_ListL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Loc_ListR> Loc_List() {
			return aLoc_List;
		}

		/**
		 * [Lot_Mix]ブロックのコンテナaLot_MixRを返します。
		 *
		 * @return Lot_MixR
		 */
		public mcframe.serverMSBE.MSBEL5040.Lot_MixR Lot_Mix() {
			return aLot_Mix;
		}

		/**
		 * [Prio_List]ブロックのコンテナaPrio_ListLを返します。
		 *
		 * @return Prio_ListL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Prio_ListR> Prio_List() {
			return aPrio_List;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this).info;
		}


	}
	/**
	 * Alloc_Avl_Srch02オペレーション.<p>
	 *
	 * 在庫や入庫予定から引当済みの出庫予定を減算する<br>
	 */
	abstract public class Alloc_Avl_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Alloc_Avl_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> down4;
		
		
		// コンストラクタ
		protected Alloc_Avl_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			up4 = MCList.create(mcframe.serverMSBE.MSBEL5040.Lno_ListR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down4 = MCList.create(mcframe.serverMSBE.MSBEL5040.Lno_ListR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * Alloc_Avl_Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR createAlloc_Avl_Srch02_CndR(){
			return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR.create();
		}

		/**
		 * Stk_Gr_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createStk_Gr_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Stk_Gr_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createStk_Gr_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Gi_Fix_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGi_Fix_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Gi_Fix_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGi_Fix_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Gi_Not_Fix_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGi_Not_Fix_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Gi_Not_Fix_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGi_Not_Fix_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Can_Gr_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createCan_Gr_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Can_Gr_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createCan_Gr_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Lno_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Lno_ListR createLno_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Lno_ListR.create();
		}

		/**
		 * Lno_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> createLno_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Lno_ListR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lg_flg</td></tr>
		 * 	<tr><td><br></td><td>except_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ignore_margin_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR
		 */
		public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gi_lno</td></tr>
		 * 	<tr><td><br></td><td>gr_lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gi_lno</td></tr>
		 * 	<tr><td><br></td><td>gr_lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this).info;
		}


	}
	/**
	 * Alloc_Avl_Srch03オペレーション.<p>
	 *
	 * 在庫や入庫予定から引当済みの出庫予定を減算する（総量引当版）<br>
	 */
	abstract public class Alloc_Avl_Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Alloc_Avl_Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> down3;
		
		
		// コンストラクタ
		protected Alloc_Avl_Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5040.Lno_ListR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL5040.Lno_ListR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Alloc_Avl_Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR createAlloc_Avl_Srch03_CndR(){
			return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR.create();
		}

		/**
		 * Stk_Gr_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createStk_Gr_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Stk_Gr_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createStk_Gr_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Gi_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGi_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Gi_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGi_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Can_Gr_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createCan_Gr_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Can_Gr_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createCan_Gr_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Lno_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Lno_ListR createLno_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Lno_ListR.create();
		}

		/**
		 * Lno_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> createLno_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Lno_ListR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lg_flg</td></tr>
		 * 	<tr><td><br></td><td>except_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ignore_margin_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR
		 */
		public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch02_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gi_lno</td></tr>
		 * 	<tr><td><br></td><td>gr_lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gi_lno</td></tr>
		 * 	<tr><td><br></td><td>gr_lno</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Lno_ListR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this).info;
		}


	}
	/**
	 * Alloc_Avl_Srch04オペレーション.<p>
	 *
	 * 在庫、入庫予定から出庫予定を減算する<br>
	 */
	abstract public class Alloc_Avl_Srch04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Alloc_Avl_Srch04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch04_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down2;
		
		
		// コンストラクタ
		protected Alloc_Avl_Srch04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch04_CndR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Alloc_Avl_Srch04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch04_CndR createAlloc_Avl_Srch04_CndR(){
			return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch04_CndR.create();
		}

		/**
		 * Stk_Gr_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createStk_Gr_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Stk_Gr_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createStk_Gr_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Gi_ListブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Avl_ListR createGi_ListR(){
			return mcframe.serverMSBE.MSBEL5040.Avl_ListR.create();
		}

		/**
		 * Gi_ListブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> createGi_ListL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Avl_ListR.class);
		}

		/**
		 * Srch_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Srch_RsltR createSrch_RsltR(){
			return mcframe.serverMSBE.MSBEL5040.Srch_RsltR.create();
		}

		/**
		 * Srch_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> createSrch_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Srch_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>one_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_no_sort_flg</td></tr>
		 * 	<tr><td><br></td><td>except_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>short_ope_typ</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch04_CndR
		 */
		public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Srch04_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Avl_ListR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Srch_RsltR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this).info;
		}


	}
	/**
	 * Alloc_Avl_Sprt01オペレーション.<p>
	 *
	 * 出庫先・納品先物流Ｇと出庫予定日から引当可能日数の範囲内かどうかをチェックする。<br>
	 */
	abstract public class Alloc_Avl_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Alloc_Avl_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR> down0;
		
		
		// コンストラクタ
		protected Alloc_Avl_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Alloc_Avl_Sprt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR createAlloc_Avl_Sprt01_CndR(){
			return mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR.create();
		}

		/**
		 * Alloc_Avl_Sprt01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR> createAlloc_Avl_Sprt01_CndL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exceed_alloc_days_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5040.Alloc_Avl_Sprt01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_AllocMngService)MSBEL_AllocMngService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}