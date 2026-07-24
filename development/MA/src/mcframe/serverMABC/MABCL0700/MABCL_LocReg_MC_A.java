package mcframe.serverMABC.MABCL0700;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_LocReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_LocReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL0700";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_LocReg.Loc_UpdChk01 aLoc_UpdChk01;

	protected void initLoc_UpdChk01() {
		this.info = PDef.MA_MABCL0700_Loc_UpdChk01_INFO;
		this.aLoc_UpdChk01 = ((MABCL_LocReg)this).new Loc_UpdChk01();
	}

	public static MABCL_LocReg.Loc_UpdChk01 crtLoc_UpdChk01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initLoc_UpdChk01();
		return lgc.aLoc_UpdChk01;
	}

	protected void paramLoc_UpdChk01(MCParam p) {
		if (this.aLoc_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLoc_UpdChk01.up0());
	}

	protected void doLoc_UpdChk01() {
		aLoc_UpdChk01.call();
	};

	/**
	 * Loc_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR createLoc_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.create();
	}

	/**
	 * Loc_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> createLoc_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.class);
	}
	protected MABCL_LocReg.Loc_Upd01 aLoc_Upd01;

	protected void initLoc_Upd01() {
		this.info = PDef.MA_MABCL0700_Loc_Upd01_INFO;
		this.aLoc_Upd01 = ((MABCL_LocReg)this).new Loc_Upd01();
	}

	public static MABCL_LocReg.Loc_Upd01 crtLoc_Upd01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initLoc_Upd01();
		return lgc.aLoc_Upd01;
	}

	protected void paramLoc_Upd01(MCParam p) {
		if (this.aLoc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLoc_Upd01.up0());
	}

	protected void doLoc_Upd01() {
		aLoc_Upd01.call();
	};

	/**
	 * Loc_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR createLoc_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.create();
	}

	/**
	 * Loc_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> createLoc_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.class);
	}
	protected MABCL_LocReg.StrLn_UpdChk01 aStrLn_UpdChk01;

	protected void initStrLn_UpdChk01() {
		this.info = PDef.MA_MABCL0700_StrLn_UpdChk01_INFO;
		this.aStrLn_UpdChk01 = ((MABCL_LocReg)this).new StrLn_UpdChk01();
	}

	public static MABCL_LocReg.StrLn_UpdChk01 crtStrLn_UpdChk01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initStrLn_UpdChk01();
		return lgc.aStrLn_UpdChk01;
	}

	protected void paramStrLn_UpdChk01(MCParam p) {
		if (this.aStrLn_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStrLn_UpdChk01.up0());
	}

	protected void doStrLn_UpdChk01() {
		aStrLn_UpdChk01.call();
	};

	/**
	 * StrLn_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR createStrLn_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.create();
	}

	/**
	 * StrLn_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> createStrLn_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.class);
	}
	protected MABCL_LocReg.StrLn_Upd01 aStrLn_Upd01;

	protected void initStrLn_Upd01() {
		this.info = PDef.MA_MABCL0700_StrLn_Upd01_INFO;
		this.aStrLn_Upd01 = ((MABCL_LocReg)this).new StrLn_Upd01();
	}

	public static MABCL_LocReg.StrLn_Upd01 crtStrLn_Upd01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initStrLn_Upd01();
		return lgc.aStrLn_Upd01;
	}

	protected void paramStrLn_Upd01(MCParam p) {
		if (this.aStrLn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStrLn_Upd01.up0());
	}

	protected void doStrLn_Upd01() {
		aStrLn_Upd01.call();
	};

	/**
	 * StrLn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR createStrLn_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.create();
	}

	/**
	 * StrLn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> createStrLn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.class);
	}
	protected MABCL_LocReg.LocLcl_UpdChk01 aLocLcl_UpdChk01;

	protected void initLocLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0700_LocLcl_UpdChk01_INFO;
		this.aLocLcl_UpdChk01 = ((MABCL_LocReg)this).new LocLcl_UpdChk01();
	}

	public static MABCL_LocReg.LocLcl_UpdChk01 crtLocLcl_UpdChk01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initLocLcl_UpdChk01();
		return lgc.aLocLcl_UpdChk01;
	}

	protected void paramLocLcl_UpdChk01(MCParam p) {
		if (this.aLocLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLocLcl_UpdChk01.up0());
	}

	protected void doLocLcl_UpdChk01() {
		aLocLcl_UpdChk01.call();
	};

	/**
	 * LocLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR createLocLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.create();
	}

	/**
	 * LocLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> createLocLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_LocReg.LocLcl_Upd01 aLocLcl_Upd01;

	protected void initLocLcl_Upd01() {
		this.info = PDef.MA_MABCL0700_LocLcl_Upd01_INFO;
		this.aLocLcl_Upd01 = ((MABCL_LocReg)this).new LocLcl_Upd01();
	}

	public static MABCL_LocReg.LocLcl_Upd01 crtLocLcl_Upd01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initLocLcl_Upd01();
		return lgc.aLocLcl_Upd01;
	}

	protected void paramLocLcl_Upd01(MCParam p) {
		if (this.aLocLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLocLcl_Upd01.up0());
	}

	protected void doLocLcl_Upd01() {
		aLocLcl_Upd01.call();
	};

	/**
	 * LocLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR createLocLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.create();
	}

	/**
	 * LocLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> createLocLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_LocReg.LclStrLn_UpdChk01 aLclStrLn_UpdChk01;

	protected void initLclStrLn_UpdChk01() {
		this.info = PDef.MA_MABCL0700_LclStrLn_UpdChk01_INFO;
		this.aLclStrLn_UpdChk01 = ((MABCL_LocReg)this).new LclStrLn_UpdChk01();
	}

	public static MABCL_LocReg.LclStrLn_UpdChk01 crtLclStrLn_UpdChk01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initLclStrLn_UpdChk01();
		return lgc.aLclStrLn_UpdChk01;
	}

	protected void paramLclStrLn_UpdChk01(MCParam p) {
		if (this.aLclStrLn_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLclStrLn_UpdChk01.up0());
	}

	protected void doLclStrLn_UpdChk01() {
		aLclStrLn_UpdChk01.call();
	};

	/**
	 * LclStrLn_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR createLclStrLn_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.create();
	}

	/**
	 * LclStrLn_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> createLclStrLn_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.class);
	}
	protected MABCL_LocReg.LclStrLn_Upd01 aLclStrLn_Upd01;

	protected void initLclStrLn_Upd01() {
		this.info = PDef.MA_MABCL0700_LclStrLn_Upd01_INFO;
		this.aLclStrLn_Upd01 = ((MABCL_LocReg)this).new LclStrLn_Upd01();
	}

	public static MABCL_LocReg.LclStrLn_Upd01 crtLclStrLn_Upd01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initLclStrLn_Upd01();
		return lgc.aLclStrLn_Upd01;
	}

	protected void paramLclStrLn_Upd01(MCParam p) {
		if (this.aLclStrLn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLclStrLn_Upd01.up0());
	}

	protected void doLclStrLn_Upd01() {
		aLclStrLn_Upd01.call();
	};

	/**
	 * LclStrLn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR createLclStrLn_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.create();
	}

	/**
	 * LclStrLn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> createLclStrLn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.class);
	}
	protected MABCL_LocReg.Loc_DelChk01 aLoc_DelChk01;

	protected void initLoc_DelChk01() {
		this.info = PDef.MA_MABCL0700_Loc_DelChk01_INFO;
		this.aLoc_DelChk01 = ((MABCL_LocReg)this).new Loc_DelChk01();
	}

	public static MABCL_LocReg.Loc_DelChk01 crtLoc_DelChk01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initLoc_DelChk01();
		return lgc.aLoc_DelChk01;
	}

	protected void paramLoc_DelChk01(MCParam p) {
		if (this.aLoc_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLoc_DelChk01.up0());
	}

	protected void doLoc_DelChk01() {
		aLoc_DelChk01.call();
	};

	/**
	 * Loc_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR createLoc_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.create();
	}

	/**
	 * Loc_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> createLoc_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.class);
	}
	protected MABCL_LocReg.Loc_Del01 aLoc_Del01;

	protected void initLoc_Del01() {
		this.info = PDef.MA_MABCL0700_Loc_Del01_INFO;
		this.aLoc_Del01 = ((MABCL_LocReg)this).new Loc_Del01();
	}

	public static MABCL_LocReg.Loc_Del01 crtLoc_Del01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initLoc_Del01();
		return lgc.aLoc_Del01;
	}

	protected void paramLoc_Del01(MCParam p) {
		if (this.aLoc_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLoc_Del01.up0());
	}

	protected void doLoc_Del01() {
		aLoc_Del01.call();
	};

	/**
	 * Loc_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR createLoc_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.create();
	}

	/**
	 * Loc_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> createLoc_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.class);
	}
	protected MABCL_LocReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0700_Srch01_INFO;
		this.aSrch01 = ((MABCL_LocReg)this).new Srch01();
	}

	public static MABCL_LocReg.Srch01 crtSrch01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
		p.addDownBlock(aSrch01.down3());
		p.addDownBlock(aSrch01.down4());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0700.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0700.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL0700.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMABC.MABCL0700.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt3R.class);
	}

	/**
	 * Srch01_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Srch01_Rslt4R createSrch01_Rslt4R(){
		return mcframe.serverMABC.MABCL0700.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt4R> createSrch01_Rslt4L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Srch01_Rslt5R createSrch01_Rslt5R(){
		return mcframe.serverMABC.MABCL0700.Srch01_Rslt5R.create();
	}

	/**
	 * Srch01_Rslt5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt5R> createSrch01_Rslt5L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt5R.class);
	}
	protected MABCL_LocReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0700_Upd01_INFO;
		this.aUpd01 = ((MABCL_LocReg)this).new Upd01();
	}

	public static MABCL_LocReg.Upd01 crtUpd01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addUpBlock(aUpd01.up2());
		p.addUpBlock(aUpd01.up3());
		p.addUpBlock(aUpd01.up4());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR createUpd01_Dtl3R(){
		return mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> createUpd01_Dtl3L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR createUpd01_Dtl4R(){
		return mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> createUpd01_Dtl4L(){
		return MCList.create(mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR createUpd01_Dtl5R(){
		return mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> createUpd01_Dtl5L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.class);
	}
	protected MABCL_LocReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0700_Del01_INFO;
		this.aDel01 = ((MABCL_LocReg)this).new Del01();
	}

	public static MABCL_LocReg.Del01 crtDel01() {
		MABCL_LocReg lgc = new MABCL_LocReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Loc_UpdChk01オペレーション.<p>
	 *
	 * 場所マスタを登録する前のチェックを行う<br>
	 */
	abstract public class Loc_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Loc_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Loc_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.class);

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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Loc_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR createLoc_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.create();
		}

		/**
		 * Loc_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> createLoc_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_asst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_def_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>ddlv_prov_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>num_id</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>stktk_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_ex_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_ex_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_lmt_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_pack_xfer_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_loc_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>addr_flg</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}


	}
	/**
	 * Loc_Upd01オペレーション.<p>
	 *
	 * 場所マスタを登録する<br>
	 */
	abstract public class Loc_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Loc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOC_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_LOC_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOC_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_LOC_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Loc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_LOC_R.create("T1"));
			chkMaster = MCController.create(MAM_LOC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_LOC_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_LOC_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_LOC_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_LOC_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Loc_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR createLoc_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.create();
		}

		/**
		 * Loc_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> createLoc_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_def_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>ddlv_prov_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>num_id</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>stktk_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_ex_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_ex_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_lmt_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_pack_xfer_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_loc_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>addr_flg</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_LOC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> src_Loc_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Loc_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("asst_dpt_cd", "asst_dpt_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_def_flg", "lg_def_flg");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("pre_outsrc_act_flg", "pre_outsrc_act_flg");
				addColumnPathMap("ddlv_prov_insp_flg", "ddlv_prov_insp_flg");
				addColumnPathMap("cal_cd", "cal_cd");
				addColumnPathMap("loc_mng_typ", "loc_mng_typ");
				addColumnPathMap("num_id", "num_id");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("stktk_tgt_flg", "stktk_tgt_flg");
				addColumnPathMap("stktk_tor_disp_flg", "stktk_tor_disp_flg");
				addColumnPathMap("stktk_tor_ex_zero_flg", "stktk_tor_ex_zero_flg");
				addColumnPathMap("stktk_act_ex_zero_flg", "stktk_act_ex_zero_flg");
				addColumnPathMap("stktk_amt_flg", "stktk_amt_flg");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("alloc_lmt_flg", "alloc_lmt_flg");
				addColumnPathMap("gi_pack_xfer_flg", "gi_pack_xfer_flg");
				addColumnPathMap("gi_vmi_flg", "gi_vmi_flg");
				addColumnPathMap("rsrc_cd1", "rsrc_cd1");
				addColumnPathMap("rsrc_cd2", "rsrc_cd2");
				addColumnPathMap("ext_sys_loc_typ", "ext_sys_loc_typ");
				addColumnPathMap("loc_alc_grp", "loc_alc_grp");
				addColumnPathMap("addr_flg", "addr_flg");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_LOC_R r_dest, mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_LOC_R> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_src : src){
				MAM_LOC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_LOC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> src_Loc_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Loc_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_LOC_R r_dest, mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_LOC_R> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_src : src){
				MAM_LOC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * StrLn_UpdChk01オペレーション.<p>
	 *
	 * 棚・ラインマスタを登録する前のチェックを行う<br>
	 */
	abstract public class StrLn_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StrLn_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected StrLn_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.class);

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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StrLn_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR createStrLn_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.create();
		}

		/**
		 * StrLn_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> createStrLn_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ln_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}


	}
	/**
	 * StrLn_Upd01オペレーション.<p>
	 *
	 * 棚・ラインマスタを登録する<br>
	 */
	abstract public class StrLn_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StrLn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STR_LN_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STR_LN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STR_LN_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STR_LN_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_STR_LN_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STR_LN_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STR_LN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STR_LN_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STR_LN_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_STR_LN_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected StrLn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_STR_LN_R.create("T1"));
			chkMaster = MCController.create(MAM_STR_LN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_STR_LN_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_STR_LN_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STR_LN_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_STR_LN_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * StrLn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR createStrLn_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.create();
		}

		/**
		 * StrLn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> createStrLn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ln_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_STR_LN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> src_StrLn_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_StrLn_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("ln_flg", "ln_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_STR_LN_R r_dest, mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_STR_LN_R> dest, MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_src : src){
				MAM_STR_LN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_STR_LN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> src_StrLn_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_StrLn_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_STR_LN_R r_dest, mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_STR_LN_R> dest, MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_src : src){
				MAM_STR_LN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * LocLcl_UpdChk01オペレーション.<p>
	 *
	 * 場所マスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	abstract public class LocLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LocLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOC_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_LOC_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected LocLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_LOC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_LOC_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_LOC_R&gt; （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(EXISTS)) {
				up_EXISTS(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * EXISTS<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(EXISTS)) {
				down_EXISTS();
			}
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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LocLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR createLocLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.create();
		}

		/**
		 * LocLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> createLocLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_LOC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> src_LocLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_LocLcl_UpdChk01_Dtl);
		}
		
		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_EXISTS_chk01_0() {
			MCRowMapper map = new Map_up_EXISTS_chk01_0();
			return map;
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_EXISTS_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_LOC_R r_dest, mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_LOC_R> dest, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src : src){
				MAM_LOC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_EXISTS_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------EXISTS専用down関連メソッド--------------------------

		/**
		 * オペレーショングループEXISTSの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_EXISTS(){
		}
	}
	/**
	 * LocLcl_Upd01オペレーション.<p>
	 *
	 * 場所マスタ(ロケール別情報)を登録する<br>
	 */
	abstract public class LocLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LocLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_LOC_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_LOC_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected LocLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_LOC_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_LOC_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_LOC_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_LOC_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_LOC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_LOC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LocLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR createLocLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.create();
		}

		/**
		 * LocLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> createLocLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_LOC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> src_LocLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_LocLcl_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_LOC_LCL_R r_dest, mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_LOC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src : src){
				MAM_LOC_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_LOC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> src_LocLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_LocLcl_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_LOC_LCL_R r_dest, mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_LOC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src : src){
				MAM_LOC_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * LclStrLn_UpdChk01オペレーション.<p>
	 *
	 * 棚・ラインマスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	abstract public class LclStrLn_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LclStrLn_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected LclStrLn_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.class);

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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LclStrLn_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR createLclStrLn_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.create();
		}

		/**
		 * LclStrLn_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> createLclStrLn_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}


	}
	/**
	 * LclStrLn_Upd01オペレーション.<p>
	 *
	 * 棚・ラインマスタ(ロケール別情報)を登録する<br>
	 */
	abstract public class LclStrLn_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LclStrLn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STR_LN_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STR_LN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STR_LN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STR_LN_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_STR_LN_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STR_LN_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STR_LN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STR_LN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STR_LN_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_STR_LN_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected LclStrLn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_STR_LN_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_STR_LN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_STR_LN_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_STR_LN_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STR_LN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_STR_LN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LclStrLn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR createLclStrLn_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.create();
		}

		/**
		 * LclStrLn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> createLclStrLn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_STR_LN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> src_LclStrLn_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_LclStrLn_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_STR_LN_LCL_R r_dest, mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_STR_LN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_src : src){
				MAM_STR_LN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_STR_LN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> src_LclStrLn_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_LclStrLn_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_STR_LN_LCL_R r_dest, mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_STR_LN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_src : src){
				MAM_STR_LN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * Loc_DelChk01オペレーション.<p>
	 *
	 * 場所マスタ、場所補助マスタ、棚・ラインマスタ、場所マスタ(ロケール別情報)、棚・ラインマスタ(ロケール別情報)を削除する前のチェックを行う<br>
	 */
	abstract public class Loc_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Loc_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Loc_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.class);

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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Loc_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR createLoc_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.create();
		}

		/**
		 * Loc_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> createLoc_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}


	}
	/**
	 * Loc_Del01オペレーション.<p>
	 *
	 * 場所マスタ、場所補助マスタ、棚・ラインマスタ、場所マスタ(ロケール別情報)、棚・ラインマスタ(ロケール別情報)を削除する<br>
	 */
	abstract public class Loc_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Loc_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_LCL_R&gt; （{@link #updMaster2}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_STR_LN_R&gt; （{@link #updMaster3}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_STR_LN_LCL_R&gt; （{@link #updMaster4}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_SUB_R&gt; （{@link #updMaster5}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOC_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOC_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_LCL_R> updMaster2;
		/**
		 * DBC連携 updMaster3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STR_LN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STR_LN_R&gt; （{@link #updMaster3_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STR_LN_R> updMaster3;
		/**
		 * DBC連携 updMaster4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STR_LN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STR_LN_LCL_R&gt; （{@link #updMaster4_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STR_LN_LCL_R> updMaster4;
		/**
		 * DBC連携 updMaster5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_SUB_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOC_SUB_R&gt; （{@link #updMaster5_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_SUB_R> updMaster5;
		// 連携ロジック上り
		public final MCList<MAM_LOC_R> updMaster1_up0;
		public final MCList<MAM_LOC_LCL_R> updMaster2_up0;
		public final MCList<MAM_STR_LN_R> updMaster3_up0;
		public final MCList<MAM_STR_LN_LCL_R> updMaster4_up0;
		public final MCList<MAM_LOC_SUB_R> updMaster5_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Loc_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_LOC_R.create("T1"));
			updMaster2 = MCController.create(MAM_LOC_LCL_R.create("T1"));
			updMaster3 = MCController.create(MAM_STR_LN_R.create("T1"));
			updMaster4 = MCController.create(MAM_STR_LN_LCL_R.create("T1"));
			updMaster5 = MCController.create(MAM_LOC_SUB_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_LOC_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_LOC_LCL_R>)updMaster2.up(1);
			updMaster3_up0 = (MCList<MAM_STR_LN_R>)updMaster3.up(1);
			updMaster4_up0 = (MCList<MAM_STR_LN_LCL_R>)updMaster4.up(1);
			updMaster5_up0 = (MCList<MAM_LOC_SUB_R>)updMaster5.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
			appendOpe(UPDATE, updMaster3);
			appendOpe(UPDATE, updMaster4);
			appendOpe(UPDATE, updMaster5);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_LOC_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_LOC_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 * up0() => MCList&lt;MAM_STR_LN_R&gt; （{@link #updMaster3_up0}）<br>
		 * up0() => MCList&lt;MAM_STR_LN_LCL_R&gt; （{@link #updMaster4_up0}）<br>
		 * up0() => MCList&lt;MAM_LOC_SUB_R&gt; （{@link #updMaster5_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, updMaster3_up0, updMaster4_up0, updMaster5_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Loc_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR createLoc_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.create();
		}

		/**
		 * Loc_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> createLoc_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_LOC_R> dest0_0, MCList<MAM_LOC_LCL_R> dest1_0, MCList<MAM_STR_LN_R> dest2_0, MCList<MAM_STR_LN_LCL_R> dest3_0, MCList<MAM_LOC_SUB_R> dest4_0, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> src_Loc_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Loc_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Loc_Del01_Dtl);
			up_UPDATE_updMaster3_0(dest2_0, src_Loc_Del01_Dtl);
			up_UPDATE_updMaster4_0(dest3_0, src_Loc_Del01_Dtl);
			up_UPDATE_updMaster5_0(dest4_0, src_Loc_Del01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster1_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster1_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_LOC_R r_dest, mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_LOC_R> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src : src){
				MAM_LOC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster2_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster2_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_LOC_LCL_R r_dest, mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_LOC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src : src){
				MAM_LOC_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster3_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster3_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster3_0(MAM_STR_LN_R r_dest, mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster3_0(MCList<MAM_STR_LN_R> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster3_0();
			for(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src : src){
				MAM_STR_LN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster4の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster4_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster4_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster4の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster4の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster4_0(MAM_STR_LN_LCL_R r_dest, mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster4の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster4_0(MCList<MAM_STR_LN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster4_0();
			for(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src : src){
				MAM_STR_LN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster4_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster5の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster5_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster5_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster5の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster5_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster5の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster5_0(MAM_LOC_SUB_R r_dest, mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster5の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster5_0(MCList<MAM_LOC_SUB_R> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster5_0();
			for(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src : src){
				MAM_LOC_SUB_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster5_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLSearcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0700.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt3R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt4R> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt5R> down4;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_LOC_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_LOC_R> c0_down0;
		/**
		 * 連携情報 SELECT_SUB1<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_SUB_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_SUB1 = "SELECT_SUB1";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_SUB_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_LOC_SUB_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_SUB_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_LOC_SUB_R> c1_down0;
		/**
		 * 連携情報 SELECT_SUB2<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STR_LN_R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT_SUB2 = "SELECT_SUB2";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STR_LN_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_STR_LN_R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_STR_LN_R> c2;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_STR_LN_R> c2_down0;
		/**
		 * 連携情報 SELECT_LCL1<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOC_LCL_R&gt; （{@link #c3}）<br>
		 */
		public final String SELECT_LCL1 = "SELECT_LCL1";

		/**
		 * DBC連携 c3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOC_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_LOC_LCL_R&gt; （{@link #c3_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOC_LCL_R> c3;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_LOC_LCL_R> c3_down0;
		/**
		 * 連携情報 SELECT_LCL2<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STR_LN_LCL_R&gt; （{@link #c4}）<br>
		 */
		public final String SELECT_LCL2 = "SELECT_LCL2";

		/**
		 * DBC連携 c4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STR_LN_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_STR_LN_LCL_R&gt; （{@link #c4_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_STR_LN_LCL_R> c4;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_STR_LN_LCL_R> c4_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0700.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt2R.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt3R.class);
			down3 = MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt4R.class);
			down4 = MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt5R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_LOC_R.create("T1"));
			c1 = MCController.create(MAM_LOC_SUB_R.create("T1"));
			c2 = MCController.create(MAM_STR_LN_R.create("T1"));
			c3 = MCController.create(MAM_LOC_LCL_R.create("T1"));
			c4 = MCController.create(MAM_STR_LN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_LOC_R>)c0.down(0);
			c1_down0 = (MCList<MAM_LOC_SUB_R>)c1.down(0);
			c2_down0 = (MCList<MAM_STR_LN_R>)c2.down(0);
			c3_down0 = (MCList<MAM_LOC_LCL_R>)c3.down(0);
			c4_down0 = (MCList<MAM_STR_LN_LCL_R>)c4.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB1, c1);
			appendOpe(SELECT_SUB2, c2);
			appendOpe(SELECT_LCL1, c3);
			appendOpe(SELECT_LCL2, c4);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB1<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB2<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL1<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL2<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_SUB1)) {
				up_SELECT_SUB1();
			}
			if (key.equals(SELECT_SUB2)) {
				up_SELECT_SUB2();
			}
			if (key.equals(SELECT_LCL1)) {
				up_SELECT_LCL1();
			}
			if (key.equals(SELECT_LCL2)) {
				up_SELECT_LCL2();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_LOC_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB1<br>
		 * MCList&lt;MAM_LOC_SUB_R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_SUB2<br>
		 * MCList&lt;MAM_STR_LN_R&gt;（{@link #c2_down0}）=> down2()<br>
		 * SELECT_LCL1<br>
		 * MCList&lt;MAM_LOC_LCL_R&gt;（{@link #c3_down0}）=> down3()<br>
		 * SELECT_LCL2<br>
		 * MCList&lt;MAM_STR_LN_LCL_R&gt;（{@link #c4_down0}）=> down4()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_SUB1)) {
				down_SELECT_SUB1(down1(), c1_down0);
			}
			if (key.equals(SELECT_SUB2)) {
				down_SELECT_SUB2(down2(), c2_down0);
			}
			if (key.equals(SELECT_LCL1)) {
				down_SELECT_LCL1(down3(), c3_down0);
			}
			if (key.equals(SELECT_LCL2)) {
				down_SELECT_LCL2(down4(), c4_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0700.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0700.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL0700.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMABC.MABCL0700.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt3R.class);
		}

		/**
		 * Srch01_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Srch01_Rslt4R createSrch01_Rslt4R(){
			return mcframe.serverMABC.MABCL0700.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt4R> createSrch01_Rslt4L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Srch01_Rslt5R createSrch01_Rslt5R(){
			return mcframe.serverMABC.MABCL0700.Srch01_Rslt5R.create();
		}

		/**
		 * Srch01_Rslt5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt5R> createSrch01_Rslt5L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Srch01_Rslt5R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>no_sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0700.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0700.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_def_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>ddlv_prov_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>cal_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>num_id</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>stktk_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_ex_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_ex_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_lmt_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_pack_xfer_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_loc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_loc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>addr_flg</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ln_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt3R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt4R> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt5R> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_SUB1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB1(){
		}
		//-----------------------SELECT_SUB2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB2(){
		}
		//-----------------------SELECT_LCL1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_LCL1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_LCL1(){
		}
		//-----------------------SELECT_LCL2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_LCL2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_LCL2(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_LOC_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm_lcl", "loc_nm");
				addColumnPathMap("loc_nm", "base_loc_nm");
				addColumnPathMap("asst_dpt_cd", "asst_dpt_cd");
				addColumnPathMap("asst_dpt_nm", "asst_dpt_nm");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("sls_dpt_nm", "sls_dpt_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("lg_def_flg", "lg_def_flg");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("sppl_nm", "sppl_nm");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("maker_nm", "maker_nm");
				addColumnPathMap("pre_outsrc_act_flg", "pre_outsrc_act_flg");
				addColumnPathMap("ddlv_prov_insp_flg", "ddlv_prov_insp_flg");
				addColumnPathMap("cal_cd", "cal_cd");
				addColumnPathMap("cal_nm", "cal_nm");
				addColumnPathMap("loc_mng_typ", "loc_mng_typ");
				addColumnPathMap("num_id", "num_id");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("cntry_nm", "cntry_nm");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("stktk_tgt_flg", "stktk_tgt_flg");
				addColumnPathMap("stktk_tor_disp_flg", "stktk_tor_disp_flg");
				addColumnPathMap("stktk_tor_ex_zero_flg", "stktk_tor_ex_zero_flg");
				addColumnPathMap("stktk_act_ex_zero_flg", "stktk_act_ex_zero_flg");
				addColumnPathMap("stktk_amt_flg", "stktk_amt_flg");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("alloc_lmt_flg", "alloc_lmt_flg");
				addColumnPathMap("gi_pack_xfer_flg", "gi_pack_xfer_flg");
				addColumnPathMap("gi_vmi_flg", "gi_vmi_flg");
				addColumnPathMap("rsrc_cd1", "rsrc_cd1");
				addColumnPathMap("rsrc_nm1", "rsrc_nm1");
				addColumnPathMap("rsrc_cd2", "rsrc_cd2");
				addColumnPathMap("rsrc_nm2", "rsrc_nm2");
				addColumnPathMap("ext_sys_loc_typ", "ext_sys_loc_typ");
				addColumnPathMap("loc_alc_grp", "loc_alc_grp");
				addColumnPathMap("addr_flg", "addr_flg");
				addColumnPathMap("zip_cd", "base_zip_cd");
				addColumnPathMap("addr1", "base_addr1");
				addColumnPathMap("addr2", "base_addr2");
				addColumnPathMap("addr3", "base_addr3");
				addColumnPathMap("addr4", "base_addr4");
				addColumnPathMap("tel", "base_tel");
				addColumnPathMap("fax", "base_fax");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0700.Srch01_Rslt1R r_dest, MAM_LOC_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt1R> dest, MCList<MAM_LOC_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_LOC_R r_src : src){
				mcframe.serverMABC.MABCL0700.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB1(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_LOC_SUB_R> src0_0){
			down_SELECT_SUB1_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("asst_dpt_cd", "asst_dpt_cd");
				addColumnPathMap("asst_dpt_nm", "asst_dpt_nm");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("sls_dpt_nm", "sls_dpt_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB1_c1_0(mcframe.serverMABC.MABCL0700.Srch01_Rslt2R r_dest, MAM_LOC_SUB_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB1_c1_0(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt2R> dest, MCList<MAM_LOC_SUB_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB1_c1_0();
			for(MAM_LOC_SUB_R r_src : src){
				mcframe.serverMABC.MABCL0700.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB2(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt3R> dest_Srch01_Rslt3, MCList<MAM_STR_LN_R> src0_0){
			down_SELECT_SUB2_c2_0(dest_Srch01_Rslt3, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_down_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm_lcl", "str_ln_nm_lcl");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("ln_flg", "ln_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB2_c2_0(mcframe.serverMABC.MABCL0700.Srch01_Rslt3R r_dest, MAM_STR_LN_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB2_c2_0(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt3R> dest, MCList<MAM_STR_LN_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB2_c2_0();
			for(MAM_STR_LN_R r_src : src){
				mcframe.serverMABC.MABCL0700.Srch01_Rslt3R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCL1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL1(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt4R> dest_Srch01_Rslt4, MCList<MAM_LOC_LCL_R> src0_0){
			down_SELECT_LCL1_c3_0(dest_Srch01_Rslt4, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL1_c3の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL1_c3_0() {
			MCRowMapper map = new Map_down_SELECT_LCL1_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL1_c3の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL1_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
			}
		}

		/**
		 * 連携処理SELECT_LCL1_c3の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL1_c3_0(mcframe.serverMABC.MABCL0700.Srch01_Rslt4R r_dest, MAM_LOC_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL1_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL1_c3_0(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt4R> dest, MCList<MAM_LOC_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL1_c3_0();
			for(MAM_LOC_LCL_R r_src : src){
				mcframe.serverMABC.MABCL0700.Srch01_Rslt4R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL1_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCL2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL2(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt5R> dest_Srch01_Rslt5, MCList<MAM_STR_LN_LCL_R> src0_0){
			down_SELECT_LCL2_c4_0(dest_Srch01_Rslt5, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL2_c4の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL2_c4_0() {
			MCRowMapper map = new Map_down_SELECT_LCL2_c4_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL2_c4の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL2_c4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
			}
		}

		/**
		 * 連携処理SELECT_LCL2_c4の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL2_c4_0(mcframe.serverMABC.MABCL0700.Srch01_Rslt5R r_dest, MAM_STR_LN_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL2_c4の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL2_c4_0(MCList<mcframe.serverMABC.MABCL0700.Srch01_Rslt5R> dest, MCList<MAM_STR_LN_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL2_c4_0();
			for(MAM_STR_LN_LCL_R r_src : src){
				mcframe.serverMABC.MABCL0700.Srch01_Rslt5R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL2_c4_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> up4;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.StrLn_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.StrLn_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.StrLn_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.StrLn_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.StrLn_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.StrLn_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.LocLcl_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.LocLcl_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.LocLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.LocLcl_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.LocLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.LocLcl_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0710.MABCL_LocSubReg.LocSub_UpdChk01 （{@link #chk04}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0710.MABCL_LocSubReg.LocSub_Upd01 （{@link #upd04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0710.MABCL_LocSubReg.LocSub_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0710.MABCL_LocSubReg.LocSub_UpdChk01 chk04;
		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0710.MABCL_LocSubReg.LocSub_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0710.MABCL_LocSubReg.LocSub_Upd01 upd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> chk04_up0;
		public final MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> upd04_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE05<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.LclStrLn_UpdChk01 （{@link #chk05}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.LclStrLn_Upd01 （{@link #upd05}）<br>
		 */
		public final String CALL_OPE05 = "CALL_OPE05";

		/**
		 * 連携オペレーション chk05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.LclStrLn_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.LclStrLn_UpdChk01 chk05;
		/**
		 * 連携オペレーション upd05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.LclStrLn_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.LclStrLn_Upd01 upd05;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> chk05_up0;
		public final MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> upd05_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.class);
			up3 = MCList.create(mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR.class);
			up4 = MCList.create(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtLoc_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtLoc_Upd01();
			chk02 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtStrLn_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtStrLn_Upd01();
			chk03 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtLocLcl_UpdChk01();
			upd03 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtLocLcl_Upd01();
			chk04 = mcframe.serverMABC.MABCL0710.MABCL_LocSubReg.crtLocSub_UpdChk01();
			upd04 = mcframe.serverMABC.MABCL0710.MABCL_LocSubReg.crtLocSub_Upd01();
			chk05 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtLclStrLn_UpdChk01();
			upd05 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtLclStrLn_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR>)upd03.up(0);
			chk04_up0 = (MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR>)chk04.up(0);
			upd04_up0 = (MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR>)upd04.up(0);
			chk05_up0 = (MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR>)chk05.up(0);
			upd05_up0 = (MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR>)upd05.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
			appendOpe(CALL_OPE03, chk03);
			appendOpe(CALL_OPE03, upd03);
			appendOpe(CALL_OPE04, chk04);
			appendOpe(CALL_OPE04, upd04);
			appendOpe(CALL_OPE05, chk05);
			appendOpe(CALL_OPE05, upd05);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 * CALL_OPE04<br>
		 * up3() => MCList&lt;mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 * CALL_OPE05<br>
		 * up4() => MCList&lt;mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up1());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(chk03_up0, upd03_up0, up2());
			}
			if (key.equals(CALL_OPE04)) {
				up_CALL_OPE04(chk04_up0, upd04_up0, up3());
			}
			if (key.equals(CALL_OPE05)) {
				up_CALL_OPE05(chk05_up0, upd05_up0, up4());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE03<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE04<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE05<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
			if (key.equals(CALL_OPE03)) {
				down_CALL_OPE03();
			}
			if (key.equals(CALL_OPE04)) {
				down_CALL_OPE04();
			}
			if (key.equals(CALL_OPE05)) {
				down_CALL_OPE05();
			}
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR createUpd01_Dtl3R(){
			return mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> createUpd01_Dtl3L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR createUpd01_Dtl4R(){
			return mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> createUpd01_Dtl4L(){
			return MCList.create(mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR createUpd01_Dtl5R(){
			return mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> createUpd01_Dtl5L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_asst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_def_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>ddlv_prov_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>num_id</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>stktk_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_ex_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_ex_zero_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_lmt_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_pack_xfer_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_loc_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>addr_flg</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>ln_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>asst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> up4() {
			return up4;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("asst_dpt_cd", "asst_dpt_cd");
				addColumnPathMap("check_asst_dpt_cd", "check_asst_dpt_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("check_sls_dpt_cd", "check_sls_dpt_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_def_flg", "lg_def_flg");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("pre_outsrc_act_flg", "pre_outsrc_act_flg");
				addColumnPathMap("ddlv_prov_insp_flg", "ddlv_prov_insp_flg");
				addColumnPathMap("cal_cd", "cal_cd");
				addColumnPathMap("loc_mng_typ", "loc_mng_typ");
				addColumnPathMap("num_id", "num_id");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("stktk_tgt_flg", "stktk_tgt_flg");
				addColumnPathMap("stktk_tor_disp_flg", "stktk_tor_disp_flg");
				addColumnPathMap("stktk_tor_ex_zero_flg", "stktk_tor_ex_zero_flg");
				addColumnPathMap("stktk_act_ex_zero_flg", "stktk_act_ex_zero_flg");
				addColumnPathMap("stktk_amt_flg", "stktk_amt_flg");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("alloc_lmt_flg", "alloc_lmt_flg");
				addColumnPathMap("gi_pack_xfer_flg", "gi_pack_xfer_flg");
				addColumnPathMap("gi_vmi_flg", "gi_vmi_flg");
				addColumnPathMap("rsrc_cd1", "rsrc_cd1");
				addColumnPathMap("rsrc_cd2", "rsrc_cd2");
				addColumnPathMap("ext_sys_loc_typ", "ext_sys_loc_typ");
				addColumnPathMap("loc_alc_grp", "loc_alc_grp");
				addColumnPathMap("addr_flg", "addr_flg");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("asst_dpt_cd", "asst_dpt_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_def_flg", "lg_def_flg");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("pre_outsrc_act_flg", "pre_outsrc_act_flg");
				addColumnPathMap("ddlv_prov_insp_flg", "ddlv_prov_insp_flg");
				addColumnPathMap("cal_cd", "cal_cd");
				addColumnPathMap("loc_mng_typ", "loc_mng_typ");
				addColumnPathMap("num_id", "num_id");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("stktk_tgt_flg", "stktk_tgt_flg");
				addColumnPathMap("stktk_tor_disp_flg", "stktk_tor_disp_flg");
				addColumnPathMap("stktk_tor_ex_zero_flg", "stktk_tor_ex_zero_flg");
				addColumnPathMap("stktk_act_ex_zero_flg", "stktk_act_ex_zero_flg");
				addColumnPathMap("stktk_amt_flg", "stktk_amt_flg");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("alloc_lmt_flg", "alloc_lmt_flg");
				addColumnPathMap("gi_pack_xfer_flg", "gi_pack_xfer_flg");
				addColumnPathMap("gi_vmi_flg", "gi_vmi_flg");
				addColumnPathMap("rsrc_cd1", "rsrc_cd1");
				addColumnPathMap("rsrc_cd2", "rsrc_cd2");
				addColumnPathMap("ext_sys_loc_typ", "ext_sys_loc_typ");
				addColumnPathMap("loc_alc_grp", "loc_alc_grp");
				addColumnPathMap("addr_flg", "addr_flg");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.Loc_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> src_Upd01_Dtl2){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl2);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl2);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("ln_flg", "ln_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("ln_flg", "ln_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.StrLn_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> src_Upd01_Dtl3){
			up_CALL_OPE03_chk03_0(dest0_0, src_Upd01_Dtl3);
			up_CALL_OPE03_upd03_0(dest1_0, src_Upd01_Dtl3);
		}
		
		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_chk03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_chk03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_upd03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_upd03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_upd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.LocLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> src_Upd01_Dtl4){
			up_CALL_OPE04_chk04_0(dest0_0, src_Upd01_Dtl4);
			up_CALL_OPE04_upd04_0(dest1_0, src_Upd01_Dtl4);
		}
		
		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_chk04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_chk04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_chk04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("asst_dpt_cd", "asst_dpt_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_chk04_0(mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_chk04_0(MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_chk04_0();
			for(mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_chk04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_upd04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_upd04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_upd04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("asst_dpt_cd", "asst_dpt_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_upd04_0(mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_upd04_0(MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_upd04_0();
			for(mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0710.LocSub_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_upd04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE05専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE05の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE05(MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> src_Upd01_Dtl5){
			up_CALL_OPE05_chk05_0(dest0_0, src_Upd01_Dtl5);
			up_CALL_OPE05_upd05_0(dest1_0, src_Upd01_Dtl5);
		}
		
		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE05_chk05_0() {
			MCRowMapper map = new Map_up_CALL_OPE05_chk05_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE05_chk05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_chk05_0(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_chk05_0(MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_chk05_0();
			for(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_chk05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE05_upd05_0() {
			MCRowMapper map = new Map_up_CALL_OPE05_upd05_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE05_upd05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_upd05_0(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_upd05_0(MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_upd05_0();
			for(mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.LclStrLn_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_upd05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
		//-----------------------CALL_OPE03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE03(){
		}
		//-----------------------CALL_OPE04専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE04の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE04(){
		}
		//-----------------------CALL_OPE05専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE05の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE05(){
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0700.MABCL_LocReg.Loc_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtLoc_DelChk01();
			del01 = mcframe.serverMABC.MABCL0700.MABCL_LocReg.crtLoc_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, del01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
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
			invoke((MABCL_LocReg)MABCL_LocReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_LocReg)MABCL_LocReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> src_Del01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl1);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_del01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_del01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0700.Loc_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_del01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}