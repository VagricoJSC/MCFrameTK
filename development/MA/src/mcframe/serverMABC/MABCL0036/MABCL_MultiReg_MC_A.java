package mcframe.serverMABC.MABCL0036;

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
 * "MABCL_MultiReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_MultiReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0036";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_MultiReg.GpAlc_UpdChk01 aGpAlc_UpdChk01;

	protected void initGpAlc_UpdChk01() {
		this.info = PDef.MA_MABCL0036_GpAlc_UpdChk01_INFO;
		this.aGpAlc_UpdChk01 = ((MABCL_MultiReg)this).new GpAlc_UpdChk01();
	}

	public static MABCL_MultiReg.GpAlc_UpdChk01 crtGpAlc_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initGpAlc_UpdChk01();
		return lgc.aGpAlc_UpdChk01;
	}

	protected void paramGpAlc_UpdChk01(MCParam p) {
		if (this.aGpAlc_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpAlc_UpdChk01.up0());
	}

	protected void doGpAlc_UpdChk01() {
		aGpAlc_UpdChk01.call();
	};

	/**
	 * GpAlc_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR createGpAlc_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.create();
	}

	/**
	 * GpAlc_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> createGpAlc_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.GpAlc_Upd01 aGpAlc_Upd01;

	protected void initGpAlc_Upd01() {
		this.info = PDef.MA_MABCL0036_GpAlc_Upd01_INFO;
		this.aGpAlc_Upd01 = ((MABCL_MultiReg)this).new GpAlc_Upd01();
	}

	public static MABCL_MultiReg.GpAlc_Upd01 crtGpAlc_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initGpAlc_Upd01();
		return lgc.aGpAlc_Upd01;
	}

	protected void paramGpAlc_Upd01(MCParam p) {
		if (this.aGpAlc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpAlc_Upd01.up0());
	}

	protected void doGpAlc_Upd01() {
		aGpAlc_Upd01.call();
	};

	/**
	 * GpAlc_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR createGpAlc_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.create();
	}

	/**
	 * GpAlc_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> createGpAlc_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.GpAlcLcl_UpdChk01 aGpAlcLcl_UpdChk01;

	protected void initGpAlcLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0036_GpAlcLcl_UpdChk01_INFO;
		this.aGpAlcLcl_UpdChk01 = ((MABCL_MultiReg)this).new GpAlcLcl_UpdChk01();
	}

	public static MABCL_MultiReg.GpAlcLcl_UpdChk01 crtGpAlcLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initGpAlcLcl_UpdChk01();
		return lgc.aGpAlcLcl_UpdChk01;
	}

	protected void paramGpAlcLcl_UpdChk01(MCParam p) {
		if (this.aGpAlcLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpAlcLcl_UpdChk01.up0());
	}

	protected void doGpAlcLcl_UpdChk01() {
		aGpAlcLcl_UpdChk01.call();
	};

	/**
	 * GpAlcLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR createGpAlcLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.create();
	}

	/**
	 * GpAlcLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> createGpAlcLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.GpAlcLcl_Upd01 aGpAlcLcl_Upd01;

	protected void initGpAlcLcl_Upd01() {
		this.info = PDef.MA_MABCL0036_GpAlcLcl_Upd01_INFO;
		this.aGpAlcLcl_Upd01 = ((MABCL_MultiReg)this).new GpAlcLcl_Upd01();
	}

	public static MABCL_MultiReg.GpAlcLcl_Upd01 crtGpAlcLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initGpAlcLcl_Upd01();
		return lgc.aGpAlcLcl_Upd01;
	}

	protected void paramGpAlcLcl_Upd01(MCParam p) {
		if (this.aGpAlcLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpAlcLcl_Upd01.up0());
	}

	protected void doGpAlcLcl_Upd01() {
		aGpAlcLcl_Upd01.call();
	};

	/**
	 * GpAlcLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR createGpAlcLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.create();
	}

	/**
	 * GpAlcLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> createGpAlcLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.GpAlc_DelChk01 aGpAlc_DelChk01;

	protected void initGpAlc_DelChk01() {
		this.info = PDef.MA_MABCL0036_GpAlc_DelChk01_INFO;
		this.aGpAlc_DelChk01 = ((MABCL_MultiReg)this).new GpAlc_DelChk01();
	}

	public static MABCL_MultiReg.GpAlc_DelChk01 crtGpAlc_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initGpAlc_DelChk01();
		return lgc.aGpAlc_DelChk01;
	}

	protected void paramGpAlc_DelChk01(MCParam p) {
		if (this.aGpAlc_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpAlc_DelChk01.up0());
	}

	protected void doGpAlc_DelChk01() {
		aGpAlc_DelChk01.call();
	};

	/**
	 * GpAlc_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR createGpAlc_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.create();
	}

	/**
	 * GpAlc_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> createGpAlc_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.GpAlc_Del01 aGpAlc_Del01;

	protected void initGpAlc_Del01() {
		this.info = PDef.MA_MABCL0036_GpAlc_Del01_INFO;
		this.aGpAlc_Del01 = ((MABCL_MultiReg)this).new GpAlc_Del01();
	}

	public static MABCL_MultiReg.GpAlc_Del01 crtGpAlc_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initGpAlc_Del01();
		return lgc.aGpAlc_Del01;
	}

	protected void paramGpAlc_Del01(MCParam p) {
		if (this.aGpAlc_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aGpAlc_Del01.up0());
	}

	protected void doGpAlc_Del01() {
		aGpAlc_Del01.call();
	};

	/**
	 * GpAlc_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR createGpAlc_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.create();
	}

	/**
	 * GpAlc_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> createGpAlc_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CalcCtg_UpdChk01 aCalcCtg_UpdChk01;

	protected void initCalcCtg_UpdChk01() {
		this.info = PDef.MA_MABCL0036_CalcCtg_UpdChk01_INFO;
		this.aCalcCtg_UpdChk01 = ((MABCL_MultiReg)this).new CalcCtg_UpdChk01();
	}

	public static MABCL_MultiReg.CalcCtg_UpdChk01 crtCalcCtg_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCalcCtg_UpdChk01();
		return lgc.aCalcCtg_UpdChk01;
	}

	protected void paramCalcCtg_UpdChk01(MCParam p) {
		if (this.aCalcCtg_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcCtg_UpdChk01.up0());
	}

	protected void doCalcCtg_UpdChk01() {
		aCalcCtg_UpdChk01.call();
	};

	/**
	 * CalcCtg_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR createCalcCtg_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.create();
	}

	/**
	 * CalcCtg_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> createCalcCtg_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CalcCtg_Upd01 aCalcCtg_Upd01;

	protected void initCalcCtg_Upd01() {
		this.info = PDef.MA_MABCL0036_CalcCtg_Upd01_INFO;
		this.aCalcCtg_Upd01 = ((MABCL_MultiReg)this).new CalcCtg_Upd01();
	}

	public static MABCL_MultiReg.CalcCtg_Upd01 crtCalcCtg_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCalcCtg_Upd01();
		return lgc.aCalcCtg_Upd01;
	}

	protected void paramCalcCtg_Upd01(MCParam p) {
		if (this.aCalcCtg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcCtg_Upd01.up0());
	}

	protected void doCalcCtg_Upd01() {
		aCalcCtg_Upd01.call();
	};

	/**
	 * CalcCtg_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR createCalcCtg_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.create();
	}

	/**
	 * CalcCtg_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> createCalcCtg_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CalcCtgLcl_UpdChk01 aCalcCtgLcl_UpdChk01;

	protected void initCalcCtgLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0036_CalcCtgLcl_UpdChk01_INFO;
		this.aCalcCtgLcl_UpdChk01 = ((MABCL_MultiReg)this).new CalcCtgLcl_UpdChk01();
	}

	public static MABCL_MultiReg.CalcCtgLcl_UpdChk01 crtCalcCtgLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCalcCtgLcl_UpdChk01();
		return lgc.aCalcCtgLcl_UpdChk01;
	}

	protected void paramCalcCtgLcl_UpdChk01(MCParam p) {
		if (this.aCalcCtgLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcCtgLcl_UpdChk01.up0());
	}

	protected void doCalcCtgLcl_UpdChk01() {
		aCalcCtgLcl_UpdChk01.call();
	};

	/**
	 * CalcCtgLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR createCalcCtgLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CalcCtgLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> createCalcCtgLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CalcCtgLcl_Upd01 aCalcCtgLcl_Upd01;

	protected void initCalcCtgLcl_Upd01() {
		this.info = PDef.MA_MABCL0036_CalcCtgLcl_Upd01_INFO;
		this.aCalcCtgLcl_Upd01 = ((MABCL_MultiReg)this).new CalcCtgLcl_Upd01();
	}

	public static MABCL_MultiReg.CalcCtgLcl_Upd01 crtCalcCtgLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCalcCtgLcl_Upd01();
		return lgc.aCalcCtgLcl_Upd01;
	}

	protected void paramCalcCtgLcl_Upd01(MCParam p) {
		if (this.aCalcCtgLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcCtgLcl_Upd01.up0());
	}

	protected void doCalcCtgLcl_Upd01() {
		aCalcCtgLcl_Upd01.call();
	};

	/**
	 * CalcCtgLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR createCalcCtgLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CalcCtgLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> createCalcCtgLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CalcCtg_DelChk01 aCalcCtg_DelChk01;

	protected void initCalcCtg_DelChk01() {
		this.info = PDef.MA_MABCL0036_CalcCtg_DelChk01_INFO;
		this.aCalcCtg_DelChk01 = ((MABCL_MultiReg)this).new CalcCtg_DelChk01();
	}

	public static MABCL_MultiReg.CalcCtg_DelChk01 crtCalcCtg_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCalcCtg_DelChk01();
		return lgc.aCalcCtg_DelChk01;
	}

	protected void paramCalcCtg_DelChk01(MCParam p) {
		if (this.aCalcCtg_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcCtg_DelChk01.up0());
	}

	protected void doCalcCtg_DelChk01() {
		aCalcCtg_DelChk01.call();
	};

	/**
	 * CalcCtg_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR createCalcCtg_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.create();
	}

	/**
	 * CalcCtg_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> createCalcCtg_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CalcCtg_Del01 aCalcCtg_Del01;

	protected void initCalcCtg_Del01() {
		this.info = PDef.MA_MABCL0036_CalcCtg_Del01_INFO;
		this.aCalcCtg_Del01 = ((MABCL_MultiReg)this).new CalcCtg_Del01();
	}

	public static MABCL_MultiReg.CalcCtg_Del01 crtCalcCtg_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCalcCtg_Del01();
		return lgc.aCalcCtg_Del01;
	}

	protected void paramCalcCtg_Del01(MCParam p) {
		if (this.aCalcCtg_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCalcCtg_Del01.up0());
	}

	protected void doCalcCtg_Del01() {
		aCalcCtg_Del01.call();
	};

	/**
	 * CalcCtg_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR createCalcCtg_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.create();
	}

	/**
	 * CalcCtg_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> createCalcCtg_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.RptPtn_UpdChk01 aRptPtn_UpdChk01;

	protected void initRptPtn_UpdChk01() {
		this.info = PDef.MA_MABCL0036_RptPtn_UpdChk01_INFO;
		this.aRptPtn_UpdChk01 = ((MABCL_MultiReg)this).new RptPtn_UpdChk01();
	}

	public static MABCL_MultiReg.RptPtn_UpdChk01 crtRptPtn_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRptPtn_UpdChk01();
		return lgc.aRptPtn_UpdChk01;
	}

	protected void paramRptPtn_UpdChk01(MCParam p) {
		if (this.aRptPtn_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRptPtn_UpdChk01.up0());
	}

	protected void doRptPtn_UpdChk01() {
		aRptPtn_UpdChk01.call();
	};

	/**
	 * RptPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR createRptPtn_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.create();
	}

	/**
	 * RptPtn_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> createRptPtn_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.RptPtn_Upd01 aRptPtn_Upd01;

	protected void initRptPtn_Upd01() {
		this.info = PDef.MA_MABCL0036_RptPtn_Upd01_INFO;
		this.aRptPtn_Upd01 = ((MABCL_MultiReg)this).new RptPtn_Upd01();
	}

	public static MABCL_MultiReg.RptPtn_Upd01 crtRptPtn_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRptPtn_Upd01();
		return lgc.aRptPtn_Upd01;
	}

	protected void paramRptPtn_Upd01(MCParam p) {
		if (this.aRptPtn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRptPtn_Upd01.up0());
	}

	protected void doRptPtn_Upd01() {
		aRptPtn_Upd01.call();
	};

	/**
	 * RptPtn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR createRptPtn_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.create();
	}

	/**
	 * RptPtn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> createRptPtn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.RptPtnLcl_UpdChk01 aRptPtnLcl_UpdChk01;

	protected void initRptPtnLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0036_RptPtnLcl_UpdChk01_INFO;
		this.aRptPtnLcl_UpdChk01 = ((MABCL_MultiReg)this).new RptPtnLcl_UpdChk01();
	}

	public static MABCL_MultiReg.RptPtnLcl_UpdChk01 crtRptPtnLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRptPtnLcl_UpdChk01();
		return lgc.aRptPtnLcl_UpdChk01;
	}

	protected void paramRptPtnLcl_UpdChk01(MCParam p) {
		if (this.aRptPtnLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRptPtnLcl_UpdChk01.up0());
	}

	protected void doRptPtnLcl_UpdChk01() {
		aRptPtnLcl_UpdChk01.call();
	};

	/**
	 * RptPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR createRptPtnLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * RptPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> createRptPtnLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.RptPtnLcl_Upd01 aRptPtnLcl_Upd01;

	protected void initRptPtnLcl_Upd01() {
		this.info = PDef.MA_MABCL0036_RptPtnLcl_Upd01_INFO;
		this.aRptPtnLcl_Upd01 = ((MABCL_MultiReg)this).new RptPtnLcl_Upd01();
	}

	public static MABCL_MultiReg.RptPtnLcl_Upd01 crtRptPtnLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRptPtnLcl_Upd01();
		return lgc.aRptPtnLcl_Upd01;
	}

	protected void paramRptPtnLcl_Upd01(MCParam p) {
		if (this.aRptPtnLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRptPtnLcl_Upd01.up0());
	}

	protected void doRptPtnLcl_Upd01() {
		aRptPtnLcl_Upd01.call();
	};

	/**
	 * RptPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR createRptPtnLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * RptPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> createRptPtnLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.RptPtn_DelChk01 aRptPtn_DelChk01;

	protected void initRptPtn_DelChk01() {
		this.info = PDef.MA_MABCL0036_RptPtn_DelChk01_INFO;
		this.aRptPtn_DelChk01 = ((MABCL_MultiReg)this).new RptPtn_DelChk01();
	}

	public static MABCL_MultiReg.RptPtn_DelChk01 crtRptPtn_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRptPtn_DelChk01();
		return lgc.aRptPtn_DelChk01;
	}

	protected void paramRptPtn_DelChk01(MCParam p) {
		if (this.aRptPtn_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRptPtn_DelChk01.up0());
	}

	protected void doRptPtn_DelChk01() {
		aRptPtn_DelChk01.call();
	};

	/**
	 * RptPtn_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR createRptPtn_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.create();
	}

	/**
	 * RptPtn_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> createRptPtn_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.RptPtn_Del01 aRptPtn_Del01;

	protected void initRptPtn_Del01() {
		this.info = PDef.MA_MABCL0036_RptPtn_Del01_INFO;
		this.aRptPtn_Del01 = ((MABCL_MultiReg)this).new RptPtn_Del01();
	}

	public static MABCL_MultiReg.RptPtn_Del01 crtRptPtn_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRptPtn_Del01();
		return lgc.aRptPtn_Del01;
	}

	protected void paramRptPtn_Del01(MCParam p) {
		if (this.aRptPtn_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRptPtn_Del01.up0());
	}

	protected void doRptPtn_Del01() {
		aRptPtn_Del01.call();
	};

	/**
	 * RptPtn_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR createRptPtn_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.create();
	}

	/**
	 * RptPtn_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> createRptPtn_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CostMenu_UpdChk01 aCostMenu_UpdChk01;

	protected void initCostMenu_UpdChk01() {
		this.info = PDef.MA_MABCL0036_CostMenu_UpdChk01_INFO;
		this.aCostMenu_UpdChk01 = ((MABCL_MultiReg)this).new CostMenu_UpdChk01();
	}

	public static MABCL_MultiReg.CostMenu_UpdChk01 crtCostMenu_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCostMenu_UpdChk01();
		return lgc.aCostMenu_UpdChk01;
	}

	protected void paramCostMenu_UpdChk01(MCParam p) {
		if (this.aCostMenu_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostMenu_UpdChk01.up0());
	}

	protected void doCostMenu_UpdChk01() {
		aCostMenu_UpdChk01.call();
	};

	/**
	 * CostMenu_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR createCostMenu_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.create();
	}

	/**
	 * CostMenu_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> createCostMenu_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CostMenu_Upd01 aCostMenu_Upd01;

	protected void initCostMenu_Upd01() {
		this.info = PDef.MA_MABCL0036_CostMenu_Upd01_INFO;
		this.aCostMenu_Upd01 = ((MABCL_MultiReg)this).new CostMenu_Upd01();
	}

	public static MABCL_MultiReg.CostMenu_Upd01 crtCostMenu_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCostMenu_Upd01();
		return lgc.aCostMenu_Upd01;
	}

	protected void paramCostMenu_Upd01(MCParam p) {
		if (this.aCostMenu_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostMenu_Upd01.up0());
	}

	protected void doCostMenu_Upd01() {
		aCostMenu_Upd01.call();
	};

	/**
	 * CostMenu_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR createCostMenu_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.create();
	}

	/**
	 * CostMenu_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> createCostMenu_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CostMenuLcl_UpdChk01 aCostMenuLcl_UpdChk01;

	protected void initCostMenuLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0036_CostMenuLcl_UpdChk01_INFO;
		this.aCostMenuLcl_UpdChk01 = ((MABCL_MultiReg)this).new CostMenuLcl_UpdChk01();
	}

	public static MABCL_MultiReg.CostMenuLcl_UpdChk01 crtCostMenuLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCostMenuLcl_UpdChk01();
		return lgc.aCostMenuLcl_UpdChk01;
	}

	protected void paramCostMenuLcl_UpdChk01(MCParam p) {
		if (this.aCostMenuLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostMenuLcl_UpdChk01.up0());
	}

	protected void doCostMenuLcl_UpdChk01() {
		aCostMenuLcl_UpdChk01.call();
	};

	/**
	 * CostMenuLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR createCostMenuLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CostMenuLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> createCostMenuLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CostMenuLcl_Upd01 aCostMenuLcl_Upd01;

	protected void initCostMenuLcl_Upd01() {
		this.info = PDef.MA_MABCL0036_CostMenuLcl_Upd01_INFO;
		this.aCostMenuLcl_Upd01 = ((MABCL_MultiReg)this).new CostMenuLcl_Upd01();
	}

	public static MABCL_MultiReg.CostMenuLcl_Upd01 crtCostMenuLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCostMenuLcl_Upd01();
		return lgc.aCostMenuLcl_Upd01;
	}

	protected void paramCostMenuLcl_Upd01(MCParam p) {
		if (this.aCostMenuLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostMenuLcl_Upd01.up0());
	}

	protected void doCostMenuLcl_Upd01() {
		aCostMenuLcl_Upd01.call();
	};

	/**
	 * CostMenuLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR createCostMenuLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CostMenuLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> createCostMenuLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CostMenu_DelChk01 aCostMenu_DelChk01;

	protected void initCostMenu_DelChk01() {
		this.info = PDef.MA_MABCL0036_CostMenu_DelChk01_INFO;
		this.aCostMenu_DelChk01 = ((MABCL_MultiReg)this).new CostMenu_DelChk01();
	}

	public static MABCL_MultiReg.CostMenu_DelChk01 crtCostMenu_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCostMenu_DelChk01();
		return lgc.aCostMenu_DelChk01;
	}

	protected void paramCostMenu_DelChk01(MCParam p) {
		if (this.aCostMenu_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostMenu_DelChk01.up0());
	}

	protected void doCostMenu_DelChk01() {
		aCostMenu_DelChk01.call();
	};

	/**
	 * CostMenu_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR createCostMenu_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.create();
	}

	/**
	 * CostMenu_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> createCostMenu_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CostMenu_Del01 aCostMenu_Del01;

	protected void initCostMenu_Del01() {
		this.info = PDef.MA_MABCL0036_CostMenu_Del01_INFO;
		this.aCostMenu_Del01 = ((MABCL_MultiReg)this).new CostMenu_Del01();
	}

	public static MABCL_MultiReg.CostMenu_Del01 crtCostMenu_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCostMenu_Del01();
		return lgc.aCostMenu_Del01;
	}

	protected void paramCostMenu_Del01(MCParam p) {
		if (this.aCostMenu_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostMenu_Del01.up0());
	}

	protected void doCostMenu_Del01() {
		aCostMenu_Del01.call();
	};

	/**
	 * CostMenu_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR createCostMenu_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.create();
	}

	/**
	 * CostMenu_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> createCostMenu_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SiteCo_UpdChk01 aSiteCo_UpdChk01;

	protected void initSiteCo_UpdChk01() {
		this.info = PDef.MA_MABCL0036_SiteCo_UpdChk01_INFO;
		this.aSiteCo_UpdChk01 = ((MABCL_MultiReg)this).new SiteCo_UpdChk01();
	}

	public static MABCL_MultiReg.SiteCo_UpdChk01 crtSiteCo_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSiteCo_UpdChk01();
		return lgc.aSiteCo_UpdChk01;
	}

	protected void paramSiteCo_UpdChk01(MCParam p) {
		if (this.aSiteCo_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSiteCo_UpdChk01.up0());
	}

	protected void doSiteCo_UpdChk01() {
		aSiteCo_UpdChk01.call();
	};

	/**
	 * SiteCo_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR createSiteCo_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.create();
	}

	/**
	 * SiteCo_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> createSiteCo_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SiteCo_Upd01 aSiteCo_Upd01;

	protected void initSiteCo_Upd01() {
		this.info = PDef.MA_MABCL0036_SiteCo_Upd01_INFO;
		this.aSiteCo_Upd01 = ((MABCL_MultiReg)this).new SiteCo_Upd01();
	}

	public static MABCL_MultiReg.SiteCo_Upd01 crtSiteCo_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSiteCo_Upd01();
		return lgc.aSiteCo_Upd01;
	}

	protected void paramSiteCo_Upd01(MCParam p) {
		if (this.aSiteCo_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSiteCo_Upd01.up0());
	}

	protected void doSiteCo_Upd01() {
		aSiteCo_Upd01.call();
	};

	/**
	 * SiteCo_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR createSiteCo_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.create();
	}

	/**
	 * SiteCo_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> createSiteCo_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SiteCoLcl_UpdChk01 aSiteCoLcl_UpdChk01;

	protected void initSiteCoLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0036_SiteCoLcl_UpdChk01_INFO;
		this.aSiteCoLcl_UpdChk01 = ((MABCL_MultiReg)this).new SiteCoLcl_UpdChk01();
	}

	public static MABCL_MultiReg.SiteCoLcl_UpdChk01 crtSiteCoLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSiteCoLcl_UpdChk01();
		return lgc.aSiteCoLcl_UpdChk01;
	}

	protected void paramSiteCoLcl_UpdChk01(MCParam p) {
		if (this.aSiteCoLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSiteCoLcl_UpdChk01.up0());
	}

	protected void doSiteCoLcl_UpdChk01() {
		aSiteCoLcl_UpdChk01.call();
	};

	/**
	 * SiteCoLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR createSiteCoLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SiteCoLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> createSiteCoLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SiteCoLcl_Upd01 aSiteCoLcl_Upd01;

	protected void initSiteCoLcl_Upd01() {
		this.info = PDef.MA_MABCL0036_SiteCoLcl_Upd01_INFO;
		this.aSiteCoLcl_Upd01 = ((MABCL_MultiReg)this).new SiteCoLcl_Upd01();
	}

	public static MABCL_MultiReg.SiteCoLcl_Upd01 crtSiteCoLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSiteCoLcl_Upd01();
		return lgc.aSiteCoLcl_Upd01;
	}

	protected void paramSiteCoLcl_Upd01(MCParam p) {
		if (this.aSiteCoLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSiteCoLcl_Upd01.up0());
	}

	protected void doSiteCoLcl_Upd01() {
		aSiteCoLcl_Upd01.call();
	};

	/**
	 * SiteCoLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR createSiteCoLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SiteCoLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> createSiteCoLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SiteCo_DelChk01 aSiteCo_DelChk01;

	protected void initSiteCo_DelChk01() {
		this.info = PDef.MA_MABCL0036_SiteCo_DelChk01_INFO;
		this.aSiteCo_DelChk01 = ((MABCL_MultiReg)this).new SiteCo_DelChk01();
	}

	public static MABCL_MultiReg.SiteCo_DelChk01 crtSiteCo_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSiteCo_DelChk01();
		return lgc.aSiteCo_DelChk01;
	}

	protected void paramSiteCo_DelChk01(MCParam p) {
		if (this.aSiteCo_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSiteCo_DelChk01.up0());
	}

	protected void doSiteCo_DelChk01() {
		aSiteCo_DelChk01.call();
	};

	/**
	 * SiteCo_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR createSiteCo_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.create();
	}

	/**
	 * SiteCo_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> createSiteCo_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SiteCo_Del01 aSiteCo_Del01;

	protected void initSiteCo_Del01() {
		this.info = PDef.MA_MABCL0036_SiteCo_Del01_INFO;
		this.aSiteCo_Del01 = ((MABCL_MultiReg)this).new SiteCo_Del01();
	}

	public static MABCL_MultiReg.SiteCo_Del01 crtSiteCo_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSiteCo_Del01();
		return lgc.aSiteCo_Del01;
	}

	protected void paramSiteCo_Del01(MCParam p) {
		if (this.aSiteCo_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSiteCo_Del01.up0());
	}

	protected void doSiteCo_Del01() {
		aSiteCo_Del01.call();
	};

	/**
	 * SiteCo_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR createSiteCo_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.create();
	}

	/**
	 * SiteCo_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> createSiteCo_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * GpAlc_UpdChk01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの登録前のチェックを行います。<br>
	 */
	abstract public class GpAlc_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpAlc_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected GpAlc_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpAlc_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR createGpAlc_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.create();
		}

		/**
		 * GpAlc_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> createGpAlc_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gp_alc_cd</td></tr>
		 * 	<tr><td><br></td><td>gp_alc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * GpAlc_Upd01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの登録を行います。<br>
	 */
	abstract public class GpAlc_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpAlc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_GP_ALC_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_ALC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_ALC_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_ALC_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_GP_ALC_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_GP_ALC_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_ALC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_ALC_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_ALC_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_GP_ALC_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected GpAlc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_GP_ALC_R.create("T1"));
			chkMaster = MCController.create(MAM_GP_ALC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_GP_ALC_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_GP_ALC_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_GP_ALC_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_GP_ALC_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpAlc_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR createGpAlc_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.create();
		}

		/**
		 * GpAlc_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> createGpAlc_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gp_alc_cd</td></tr>
		 * 	<tr><td><br></td><td>gp_alc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_GP_ALC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> src_GpAlc_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_GpAlc_Upd01_Dtl);
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
				addColumnPathMap("gp_alc_cd", "gp_alc_cd");
				addColumnPathMap("gp_alc_nm", "gp_alc_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_GP_ALC_R r_dest, mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_GP_ALC_R> dest, MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR r_src : src){
				MAM_GP_ALC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_GP_ALC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> src_GpAlc_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_GpAlc_Upd01_Dtl);
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
				addColumnPathMap("gp_alc_cd", "gp_alc_cd");
				addColumnPathMap("gp_alc_nm", "gp_alc_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_GP_ALC_R r_dest, mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_GP_ALC_R> dest, MCList<mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.GpAlc_UpdChk01_DtlR r_src : src){
				MAM_GP_ALC_R r_dest = dest.createRow();
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
	 * GpAlcLcl_UpdChk01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class GpAlcLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpAlcLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_GP_ALC_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_ALC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_ALC_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_ALC_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_GP_ALC_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected GpAlcLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_GP_ALC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_GP_ALC_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_GP_ALC_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpAlcLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR createGpAlcLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.create();
		}

		/**
		 * GpAlcLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> createGpAlcLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gp_alc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>gp_alc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_GP_ALC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> src_GpAlcLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_GpAlcLcl_UpdChk01_Dtl);
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
				addColumnPathMap("gp_alc_cd", "gp_alc_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_GP_ALC_R r_dest, mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_GP_ALC_R> dest, MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR r_src : src){
				MAM_GP_ALC_R r_dest = dest.createRow();
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
	 * GpAlcLcl_Upd01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class GpAlcLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpAlcLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_GP_ALC_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_ALC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_ALC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_ALC_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_GP_ALC_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_GP_ALC_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_ALC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_ALC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_ALC_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_GP_ALC_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected GpAlcLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_GP_ALC_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_GP_ALC_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_GP_ALC_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_GP_ALC_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_GP_ALC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_GP_ALC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpAlcLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR createGpAlcLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.create();
		}

		/**
		 * GpAlcLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> createGpAlcLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gp_alc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>gp_alc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_GP_ALC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> src_GpAlcLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_GpAlcLcl_Upd01_Dtl);
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
				addColumnPathMap("gp_alc_cd", "gp_alc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("gp_alc_nm", "gp_alc_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_GP_ALC_LCL_R r_dest, mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_GP_ALC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR r_src : src){
				MAM_GP_ALC_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_GP_ALC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> src_GpAlcLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_GpAlcLcl_Upd01_Dtl);
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
				addColumnPathMap("gp_alc_cd", "gp_alc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("gp_alc_nm", "gp_alc_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_GP_ALC_LCL_R r_dest, mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_GP_ALC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.GpAlcLcl_UpdChk01_DtlR r_src : src){
				MAM_GP_ALC_LCL_R r_dest = dest.createRow();
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
	 * GpAlc_DelChk01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの削除前のチェックを行います。<br>
	 */
	abstract public class GpAlc_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpAlc_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected GpAlc_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpAlc_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR createGpAlc_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.create();
		}

		/**
		 * GpAlc_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> createGpAlc_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gp_alc_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * GpAlc_Del01オペレーション.<p>
	 *
	 * 汎用配賦分類マスタの削除を行います。<br>
	 */
	abstract public class GpAlc_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "GpAlc_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_GP_ALC_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_GP_ALC_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_ALC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_ALC_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_ALC_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_GP_ALC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_GP_ALC_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_GP_ALC_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_GP_ALC_R> updMaster1_up0;
		public final MCList<MAM_GP_ALC_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected GpAlc_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_GP_ALC_R.create("T1"));
			updMaster2 = MCController.create(MAM_GP_ALC_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_GP_ALC_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_GP_ALC_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_GP_ALC_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_GP_ALC_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, up0());
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * GpAlc_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR createGpAlc_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.create();
		}

		/**
		 * GpAlc_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> createGpAlc_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gp_alc_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_GP_ALC_R> dest0_0, MCList<MAM_GP_ALC_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> src_GpAlc_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_GpAlc_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_GpAlc_Del01_Dtl);
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
				addColumnPathMap("gp_alc_cd", "gp_alc_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_GP_ALC_R r_dest, mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_GP_ALC_R> dest, MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR r_src : src){
				MAM_GP_ALC_R r_dest = dest.createRow();
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
				addColumnPathMap("gp_alc_cd", "gp_alc_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_GP_ALC_LCL_R r_dest, mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_GP_ALC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0036.GpAlc_DelChk01_DtlR r_src : src){
				MAM_GP_ALC_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
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
	 * CalcCtg_UpdChk01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの登録前のチェックを行います。<br>
	 */
	abstract public class CalcCtg_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcCtg_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CalcCtg_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CalcCtg_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR createCalcCtg_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.create();
		}

		/**
		 * CalcCtg_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> createCalcCtg_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * CalcCtg_Upd01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの登録を行います。<br>
	 */
	abstract public class CalcCtg_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcCtg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CALC_CTG_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CALC_CTG_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CALC_CTG_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CALC_CTG_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CALC_CTG_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CALC_CTG_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CALC_CTG_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CALC_CTG_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CALC_CTG_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CALC_CTG_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CalcCtg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CALC_CTG_R.create("T1"));
			chkMaster = MCController.create(MAM_CALC_CTG_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CALC_CTG_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CALC_CTG_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CALC_CTG_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CALC_CTG_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CalcCtg_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR createCalcCtg_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.create();
		}

		/**
		 * CalcCtg_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> createCalcCtg_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_CALC_CTG_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> src_CalcCtg_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CalcCtg_Upd01_Dtl);
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
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
				addColumnPathMap("calc_ctg_nm", "calc_ctg_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_CALC_CTG_R r_dest, mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CALC_CTG_R> dest, MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR r_src : src){
				MAM_CALC_CTG_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CALC_CTG_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> src_CalcCtg_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CalcCtg_Upd01_Dtl);
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
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
				addColumnPathMap("calc_ctg_nm", "calc_ctg_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_CALC_CTG_R r_dest, mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CALC_CTG_R> dest, MCList<mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.CalcCtg_UpdChk01_DtlR r_src : src){
				MAM_CALC_CTG_R r_dest = dest.createRow();
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
	 * CalcCtgLcl_UpdChk01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class CalcCtgLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcCtgLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CALC_CTG_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CALC_CTG_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CALC_CTG_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CALC_CTG_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_CALC_CTG_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CalcCtgLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_CALC_CTG_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_CALC_CTG_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_CALC_CTG_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CalcCtgLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR createCalcCtgLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CalcCtgLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> createCalcCtgLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_CALC_CTG_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> src_CalcCtgLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_CalcCtgLcl_UpdChk01_Dtl);
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
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_CALC_CTG_R r_dest, mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_CALC_CTG_R> dest, MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR r_src : src){
				MAM_CALC_CTG_R r_dest = dest.createRow();
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
	 * CalcCtgLcl_Upd01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class CalcCtgLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcCtgLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CALC_CTG_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CALC_CTG_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CALC_CTG_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CALC_CTG_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CALC_CTG_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CALC_CTG_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CALC_CTG_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CALC_CTG_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CALC_CTG_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CALC_CTG_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CalcCtgLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CALC_CTG_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_CALC_CTG_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CALC_CTG_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CALC_CTG_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CALC_CTG_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CALC_CTG_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CalcCtgLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR createCalcCtgLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CalcCtgLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> createCalcCtgLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_CALC_CTG_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> src_CalcCtgLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CalcCtgLcl_Upd01_Dtl);
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
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("calc_ctg_nm", "calc_ctg_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_CALC_CTG_LCL_R r_dest, mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CALC_CTG_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR r_src : src){
				MAM_CALC_CTG_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CALC_CTG_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> src_CalcCtgLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CalcCtgLcl_Upd01_Dtl);
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
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("calc_ctg_nm", "calc_ctg_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_CALC_CTG_LCL_R r_dest, mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CALC_CTG_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.CalcCtgLcl_UpdChk01_DtlR r_src : src){
				MAM_CALC_CTG_LCL_R r_dest = dest.createRow();
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
	 * CalcCtg_DelChk01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの削除前のチェックを行います。<br>
	 */
	abstract public class CalcCtg_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcCtg_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CalcCtg_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CalcCtg_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR createCalcCtg_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.create();
		}

		/**
		 * CalcCtg_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> createCalcCtg_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * CalcCtg_Del01オペレーション.<p>
	 *
	 * 計算カテゴリマスタの削除を行います。<br>
	 */
	abstract public class CalcCtg_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CalcCtg_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CALC_CTG_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_CALC_CTG_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CALC_CTG_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CALC_CTG_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CALC_CTG_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CALC_CTG_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CALC_CTG_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CALC_CTG_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_CALC_CTG_R> updMaster1_up0;
		public final MCList<MAM_CALC_CTG_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CalcCtg_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_CALC_CTG_R.create("T1"));
			updMaster2 = MCController.create(MAM_CALC_CTG_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_CALC_CTG_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_CALC_CTG_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CALC_CTG_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_CALC_CTG_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, up0());
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CalcCtg_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR createCalcCtg_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.create();
		}

		/**
		 * CalcCtg_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> createCalcCtg_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_CALC_CTG_R> dest0_0, MCList<MAM_CALC_CTG_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> src_CalcCtg_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_CalcCtg_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_CalcCtg_Del01_Dtl);
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
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_CALC_CTG_R r_dest, mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_CALC_CTG_R> dest, MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR r_src : src){
				MAM_CALC_CTG_R r_dest = dest.createRow();
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
				addColumnPathMap("calc_ctg_cd", "calc_ctg_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_CALC_CTG_LCL_R r_dest, mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_CALC_CTG_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0036.CalcCtg_DelChk01_DtlR r_src : src){
				MAM_CALC_CTG_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
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
	 * RptPtn_UpdChk01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの登録前のチェックを行います。<br>
	 */
	abstract public class RptPtn_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RptPtn_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected RptPtn_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RptPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR createRptPtn_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.create();
		}

		/**
		 * RptPtn_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> createRptPtn_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * RptPtn_Upd01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの登録を行います。<br>
	 */
	abstract public class RptPtn_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RptPtn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RPT_PTN_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RPT_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RPT_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RPT_PTN_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_RPT_PTN_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RPT_PTN_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RPT_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RPT_PTN_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RPT_PTN_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_RPT_PTN_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected RptPtn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_RPT_PTN_R.create("T1"));
			chkMaster = MCController.create(MAM_RPT_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_RPT_PTN_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_RPT_PTN_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_RPT_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_RPT_PTN_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RptPtn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR createRptPtn_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.create();
		}

		/**
		 * RptPtn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> createRptPtn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_RPT_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> src_RptPtn_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_RptPtn_Upd01_Dtl);
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
				addColumnPathMap("rpt_ptn_cd", "rpt_ptn_cd");
				addColumnPathMap("rpt_ptn_nm", "rpt_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_RPT_PTN_R r_dest, mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_RPT_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR r_src : src){
				MAM_RPT_PTN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_RPT_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> src_RptPtn_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_RptPtn_Upd01_Dtl);
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
				addColumnPathMap("rpt_ptn_cd", "rpt_ptn_cd");
				addColumnPathMap("rpt_ptn_nm", "rpt_ptn_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_RPT_PTN_R r_dest, mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_RPT_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.RptPtn_UpdChk01_DtlR r_src : src){
				MAM_RPT_PTN_R r_dest = dest.createRow();
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
	 * RptPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class RptPtnLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RptPtnLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RPT_PTN_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RPT_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RPT_PTN_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RPT_PTN_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_RPT_PTN_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected RptPtnLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_RPT_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_RPT_PTN_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_RPT_PTN_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RptPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR createRptPtnLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * RptPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> createRptPtnLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_RPT_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> src_RptPtnLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_RptPtnLcl_UpdChk01_Dtl);
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
				addColumnPathMap("rpt_ptn_cd", "rpt_ptn_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_RPT_PTN_R r_dest, mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_RPT_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_RPT_PTN_R r_dest = dest.createRow();
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
	 * RptPtnLcl_Upd01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class RptPtnLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RptPtnLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RPT_PTN_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RPT_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RPT_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RPT_PTN_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_RPT_PTN_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RPT_PTN_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RPT_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RPT_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RPT_PTN_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_RPT_PTN_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected RptPtnLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_RPT_PTN_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_RPT_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_RPT_PTN_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_RPT_PTN_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_RPT_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_RPT_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RptPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR createRptPtnLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * RptPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> createRptPtnLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_RPT_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> src_RptPtnLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_RptPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("rpt_ptn_cd", "rpt_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("rpt_ptn_nm", "rpt_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_RPT_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_RPT_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_RPT_PTN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_RPT_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> src_RptPtnLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_RptPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("rpt_ptn_cd", "rpt_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("rpt_ptn_nm", "rpt_ptn_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_RPT_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_RPT_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.RptPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_RPT_PTN_LCL_R r_dest = dest.createRow();
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
	 * RptPtn_DelChk01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの削除前のチェックを行います。<br>
	 */
	abstract public class RptPtn_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RptPtn_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected RptPtn_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RptPtn_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR createRptPtn_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.create();
		}

		/**
		 * RptPtn_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> createRptPtn_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * RptPtn_Del01オペレーション.<p>
	 *
	 * 原価レポートパタンマスタの削除を行います。<br>
	 */
	abstract public class RptPtn_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RptPtn_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RPT_PTN_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_RPT_PTN_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RPT_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RPT_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RPT_PTN_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RPT_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RPT_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RPT_PTN_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_RPT_PTN_R> updMaster1_up0;
		public final MCList<MAM_RPT_PTN_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected RptPtn_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_RPT_PTN_R.create("T1"));
			updMaster2 = MCController.create(MAM_RPT_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_RPT_PTN_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_RPT_PTN_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_RPT_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_RPT_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, up0());
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RptPtn_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR createRptPtn_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.create();
		}

		/**
		 * RptPtn_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> createRptPtn_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rpt_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_RPT_PTN_R> dest0_0, MCList<MAM_RPT_PTN_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> src_RptPtn_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_RptPtn_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_RptPtn_Del01_Dtl);
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
				addColumnPathMap("rpt_ptn_cd", "rpt_ptn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_RPT_PTN_R r_dest, mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_RPT_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR r_src : src){
				MAM_RPT_PTN_R r_dest = dest.createRow();
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
				addColumnPathMap("rpt_ptn_cd", "rpt_ptn_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_RPT_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_RPT_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0036.RptPtn_DelChk01_DtlR r_src : src){
				MAM_RPT_PTN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
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
	 * CostMenu_UpdChk01オペレーション.<p>
	 *
	 * 原価メニューマスタの登録前のチェックを行います。<br>
	 */
	abstract public class CostMenu_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostMenu_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CostMenu_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostMenu_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR createCostMenu_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.create();
		}

		/**
		 * CostMenu_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> createCostMenu_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>menu_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * CostMenu_Upd01オペレーション.<p>
	 *
	 * 原価メニューマスタの登録を行います。<br>
	 */
	abstract public class CostMenu_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostMenu_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_MENU_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_MENU_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_MENU_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_MENU_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_MENU_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_MENU_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_MENU_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_MENU_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_MENU_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_MENU_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostMenu_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_COST_MENU_R.create("T1"));
			chkMaster = MCController.create(MAM_COST_MENU_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_COST_MENU_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_COST_MENU_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_COST_MENU_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_COST_MENU_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostMenu_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR createCostMenu_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.create();
		}

		/**
		 * CostMenu_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> createCostMenu_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>menu_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_COST_MENU_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> src_CostMenu_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CostMenu_Upd01_Dtl);
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
				addColumnPathMap("menu_cd", "menu_cd");
				addColumnPathMap("menu_nm", "menu_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_COST_MENU_R r_dest, mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_COST_MENU_R> dest, MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR r_src : src){
				MAM_COST_MENU_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_COST_MENU_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> src_CostMenu_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CostMenu_Upd01_Dtl);
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
				addColumnPathMap("menu_cd", "menu_cd");
				addColumnPathMap("menu_nm", "menu_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_COST_MENU_R r_dest, mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_COST_MENU_R> dest, MCList<mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.CostMenu_UpdChk01_DtlR r_src : src){
				MAM_COST_MENU_R r_dest = dest.createRow();
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
	 * CostMenuLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価メニューマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class CostMenuLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostMenuLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_MENU_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_MENU_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_MENU_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_MENU_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_COST_MENU_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostMenuLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_COST_MENU_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_COST_MENU_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_COST_MENU_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostMenuLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR createCostMenuLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CostMenuLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> createCostMenuLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>menu_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_COST_MENU_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> src_CostMenuLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_CostMenuLcl_UpdChk01_Dtl);
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
				addColumnPathMap("menu_cd", "menu_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_COST_MENU_R r_dest, mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_COST_MENU_R> dest, MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR r_src : src){
				MAM_COST_MENU_R r_dest = dest.createRow();
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
	 * CostMenuLcl_Upd01オペレーション.<p>
	 *
	 * 原価メニューマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class CostMenuLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostMenuLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_MENU_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_MENU_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_MENU_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_MENU_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_MENU_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_MENU_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_MENU_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_MENU_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_MENU_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_MENU_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostMenuLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_COST_MENU_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_COST_MENU_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_COST_MENU_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_COST_MENU_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_COST_MENU_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_COST_MENU_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostMenuLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR createCostMenuLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CostMenuLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> createCostMenuLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>menu_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_COST_MENU_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> src_CostMenuLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CostMenuLcl_Upd01_Dtl);
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
				addColumnPathMap("menu_cd", "menu_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("menu_nm", "menu_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_COST_MENU_LCL_R r_dest, mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_COST_MENU_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR r_src : src){
				MAM_COST_MENU_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_COST_MENU_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> src_CostMenuLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CostMenuLcl_Upd01_Dtl);
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
				addColumnPathMap("menu_cd", "menu_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("menu_nm", "menu_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_COST_MENU_LCL_R r_dest, mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_COST_MENU_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.CostMenuLcl_UpdChk01_DtlR r_src : src){
				MAM_COST_MENU_LCL_R r_dest = dest.createRow();
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
	 * CostMenu_DelChk01オペレーション.<p>
	 *
	 * 原価メニューマスタの削除前のチェックを行います。<br>
	 */
	abstract public class CostMenu_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostMenu_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CostMenu_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostMenu_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR createCostMenu_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.create();
		}

		/**
		 * CostMenu_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> createCostMenu_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * CostMenu_Del01オペレーション.<p>
	 *
	 * 原価メニューマスタの削除を行います。<br>
	 */
	abstract public class CostMenu_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostMenu_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_MENU_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_COST_MENU_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_MENU_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_MENU_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_MENU_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_MENU_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_MENU_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_MENU_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_COST_MENU_R> updMaster1_up0;
		public final MCList<MAM_COST_MENU_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostMenu_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_COST_MENU_R.create("T1"));
			updMaster2 = MCController.create(MAM_COST_MENU_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_COST_MENU_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_COST_MENU_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_COST_MENU_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_COST_MENU_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, up0());
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostMenu_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR createCostMenu_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.create();
		}

		/**
		 * CostMenu_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> createCostMenu_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_COST_MENU_R> dest0_0, MCList<MAM_COST_MENU_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> src_CostMenu_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_CostMenu_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_CostMenu_Del01_Dtl);
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
				addColumnPathMap("menu_cd", "menu_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_COST_MENU_R r_dest, mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_COST_MENU_R> dest, MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR r_src : src){
				MAM_COST_MENU_R r_dest = dest.createRow();
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
				addColumnPathMap("menu_cd", "menu_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_COST_MENU_LCL_R r_dest, mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_COST_MENU_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0036.CostMenu_DelChk01_DtlR r_src : src){
				MAM_COST_MENU_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
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
	 * SiteCo_UpdChk01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの登録前のチェックを行います。<br>
	 */
	abstract public class SiteCo_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SiteCo_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SiteCo_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SiteCo_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR createSiteCo_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.create();
		}

		/**
		 * SiteCo_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> createSiteCo_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>site_co_cd</td></tr>
		 * 	<tr><td><br></td><td>site_co_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SiteCo_Upd01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの登録を行います。<br>
	 */
	abstract public class SiteCo_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SiteCo_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SITE_CO_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SITE_CO_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SITE_CO_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SITE_CO_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SITE_CO_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SITE_CO_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SITE_CO_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SITE_CO_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SITE_CO_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SITE_CO_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SiteCo_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SITE_CO_R.create("T1"));
			chkMaster = MCController.create(MAM_SITE_CO_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SITE_CO_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SITE_CO_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SITE_CO_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SITE_CO_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SiteCo_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR createSiteCo_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.create();
		}

		/**
		 * SiteCo_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> createSiteCo_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>site_co_cd</td></tr>
		 * 	<tr><td><br></td><td>site_co_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_SITE_CO_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> src_SiteCo_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SiteCo_Upd01_Dtl);
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
				addColumnPathMap("site_co_cd", "site_co_cd");
				addColumnPathMap("site_co_nm", "site_co_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SITE_CO_R r_dest, mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SITE_CO_R> dest, MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR r_src : src){
				MAM_SITE_CO_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SITE_CO_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> src_SiteCo_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SiteCo_Upd01_Dtl);
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
				addColumnPathMap("site_co_cd", "site_co_cd");
				addColumnPathMap("site_co_nm", "site_co_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_SITE_CO_R r_dest, mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SITE_CO_R> dest, MCList<mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.SiteCo_UpdChk01_DtlR r_src : src){
				MAM_SITE_CO_R r_dest = dest.createRow();
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
	 * SiteCoLcl_UpdChk01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class SiteCoLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SiteCoLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SITE_CO_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SITE_CO_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SITE_CO_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SITE_CO_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SITE_CO_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SiteCoLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SITE_CO_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SITE_CO_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SITE_CO_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SiteCoLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR createSiteCoLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SiteCoLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> createSiteCoLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>site_co_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>site_co_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_SITE_CO_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> src_SiteCoLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_SiteCoLcl_UpdChk01_Dtl);
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
				addColumnPathMap("site_co_cd", "site_co_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SITE_CO_R r_dest, mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SITE_CO_R> dest, MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR r_src : src){
				MAM_SITE_CO_R r_dest = dest.createRow();
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
	 * SiteCoLcl_Upd01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class SiteCoLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SiteCoLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SITE_CO_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SITE_CO_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SITE_CO_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SITE_CO_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SITE_CO_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SITE_CO_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SITE_CO_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SITE_CO_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SITE_CO_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SITE_CO_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SiteCoLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SITE_CO_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SITE_CO_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SITE_CO_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SITE_CO_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SITE_CO_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SITE_CO_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SiteCoLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR createSiteCoLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SiteCoLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> createSiteCoLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>site_co_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>site_co_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_SITE_CO_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> src_SiteCoLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SiteCoLcl_Upd01_Dtl);
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
				addColumnPathMap("site_co_cd", "site_co_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("site_co_nm", "site_co_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SITE_CO_LCL_R r_dest, mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SITE_CO_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR r_src : src){
				MAM_SITE_CO_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SITE_CO_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> src_SiteCoLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SiteCoLcl_Upd01_Dtl);
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
				addColumnPathMap("site_co_cd", "site_co_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("site_co_nm", "site_co_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_SITE_CO_LCL_R r_dest, mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SITE_CO_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0036.SiteCoLcl_UpdChk01_DtlR r_src : src){
				MAM_SITE_CO_LCL_R r_dest = dest.createRow();
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
	 * SiteCo_DelChk01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの削除前のチェックを行います。<br>
	 */
	abstract public class SiteCo_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SiteCo_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SiteCo_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.class);

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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SiteCo_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR createSiteCo_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.create();
		}

		/**
		 * SiteCo_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> createSiteCo_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>site_co_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SiteCo_Del01オペレーション.<p>
	 *
	 * 倉庫事業者マスタの削除を行います。<br>
	 */
	abstract public class SiteCo_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SiteCo_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SITE_CO_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SITE_CO_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SITE_CO_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SITE_CO_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SITE_CO_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SITE_CO_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SITE_CO_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SITE_CO_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_SITE_CO_R> updMaster1_up0;
		public final MCList<MAM_SITE_CO_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SiteCo_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_SITE_CO_R.create("T1"));
			updMaster2 = MCController.create(MAM_SITE_CO_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_SITE_CO_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_SITE_CO_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SITE_CO_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_SITE_CO_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, up0());
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
			invoke((MABCL_MultiReg)MABCL_MultiReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SiteCo_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR createSiteCo_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.create();
		}

		/**
		 * SiteCo_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> createSiteCo_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>site_co_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_SITE_CO_R> dest0_0, MCList<MAM_SITE_CO_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> src_SiteCo_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_SiteCo_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_SiteCo_Del01_Dtl);
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
				addColumnPathMap("site_co_cd", "site_co_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_SITE_CO_R r_dest, mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_SITE_CO_R> dest, MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR r_src : src){
				MAM_SITE_CO_R r_dest = dest.createRow();
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
				addColumnPathMap("site_co_cd", "site_co_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_SITE_CO_LCL_R r_dest, mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_SITE_CO_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0036.SiteCo_DelChk01_DtlR r_src : src){
				MAM_SITE_CO_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
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

	//FMCB LOGIC_CONTROLLER END
}