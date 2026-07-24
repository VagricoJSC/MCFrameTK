package mcframe.serverMABC.MABCL0031;

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
	public static final String LOGIC_ID = "MABCL0031";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_MultiReg.Da_UpdChk01 aDa_UpdChk01;

	protected void initDa_UpdChk01() {
		this.info = PDef.MA_MABCL0031_Da_UpdChk01_INFO;
		this.aDa_UpdChk01 = ((MABCL_MultiReg)this).new Da_UpdChk01();
	}

	public static MABCL_MultiReg.Da_UpdChk01 crtDa_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDa_UpdChk01();
		return lgc.aDa_UpdChk01;
	}

	protected void paramDa_UpdChk01(MCParam p) {
		if (this.aDa_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDa_UpdChk01.up0());
	}

	protected void doDa_UpdChk01() {
		aDa_UpdChk01.call();
	};

	/**
	 * Da_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR createDa_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.create();
	}

	/**
	 * Da_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> createDa_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Da_Upd01 aDa_Upd01;

	protected void initDa_Upd01() {
		this.info = PDef.MA_MABCL0031_Da_Upd01_INFO;
		this.aDa_Upd01 = ((MABCL_MultiReg)this).new Da_Upd01();
	}

	public static MABCL_MultiReg.Da_Upd01 crtDa_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDa_Upd01();
		return lgc.aDa_Upd01;
	}

	protected void paramDa_Upd01(MCParam p) {
		if (this.aDa_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDa_Upd01.up0());
	}

	protected void doDa_Upd01() {
		aDa_Upd01.call();
	};

	/**
	 * Da_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR createDa_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.create();
	}

	/**
	 * Da_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> createDa_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DaLcl_UpdChk01 aDaLcl_UpdChk01;

	protected void initDaLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_DaLcl_UpdChk01_INFO;
		this.aDaLcl_UpdChk01 = ((MABCL_MultiReg)this).new DaLcl_UpdChk01();
	}

	public static MABCL_MultiReg.DaLcl_UpdChk01 crtDaLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDaLcl_UpdChk01();
		return lgc.aDaLcl_UpdChk01;
	}

	protected void paramDaLcl_UpdChk01(MCParam p) {
		if (this.aDaLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDaLcl_UpdChk01.up0());
	}

	protected void doDaLcl_UpdChk01() {
		aDaLcl_UpdChk01.call();
	};

	/**
	 * DaLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR createDaLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.create();
	}

	/**
	 * DaLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> createDaLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DaLcl_Upd01 aDaLcl_Upd01;

	protected void initDaLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_DaLcl_Upd01_INFO;
		this.aDaLcl_Upd01 = ((MABCL_MultiReg)this).new DaLcl_Upd01();
	}

	public static MABCL_MultiReg.DaLcl_Upd01 crtDaLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDaLcl_Upd01();
		return lgc.aDaLcl_Upd01;
	}

	protected void paramDaLcl_Upd01(MCParam p) {
		if (this.aDaLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDaLcl_Upd01.up0());
	}

	protected void doDaLcl_Upd01() {
		aDaLcl_Upd01.call();
	};

	/**
	 * DaLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR createDaLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.create();
	}

	/**
	 * DaLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> createDaLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Da_DelChk01 aDa_DelChk01;

	protected void initDa_DelChk01() {
		this.info = PDef.MA_MABCL0031_Da_DelChk01_INFO;
		this.aDa_DelChk01 = ((MABCL_MultiReg)this).new Da_DelChk01();
	}

	public static MABCL_MultiReg.Da_DelChk01 crtDa_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDa_DelChk01();
		return lgc.aDa_DelChk01;
	}

	protected void paramDa_DelChk01(MCParam p) {
		if (this.aDa_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDa_DelChk01.up0());
	}

	protected void doDa_DelChk01() {
		aDa_DelChk01.call();
	};

	/**
	 * Da_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR createDa_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.create();
	}

	/**
	 * Da_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> createDa_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Da_Del01 aDa_Del01;

	protected void initDa_Del01() {
		this.info = PDef.MA_MABCL0031_Da_Del01_INFO;
		this.aDa_Del01 = ((MABCL_MultiReg)this).new Da_Del01();
	}

	public static MABCL_MultiReg.Da_Del01 crtDa_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDa_Del01();
		return lgc.aDa_Del01;
	}

	protected void paramDa_Del01(MCParam p) {
		if (this.aDa_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDa_Del01.up0());
	}

	protected void doDa_Del01() {
		aDa_Del01.call();
	};

	/**
	 * Da_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR createDa_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.create();
	}

	/**
	 * Da_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> createDa_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptBase_UpdChk01 aDptBase_UpdChk01;

	protected void initDptBase_UpdChk01() {
		this.info = PDef.MA_MABCL0031_DptBase_UpdChk01_INFO;
		this.aDptBase_UpdChk01 = ((MABCL_MultiReg)this).new DptBase_UpdChk01();
	}

	public static MABCL_MultiReg.DptBase_UpdChk01 crtDptBase_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptBase_UpdChk01();
		return lgc.aDptBase_UpdChk01;
	}

	protected void paramDptBase_UpdChk01(MCParam p) {
		if (this.aDptBase_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptBase_UpdChk01.up0());
	}

	protected void doDptBase_UpdChk01() {
		aDptBase_UpdChk01.call();
	};

	/**
	 * DptBase_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR createDptBase_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.create();
	}

	/**
	 * DptBase_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> createDptBase_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptBase_Upd01 aDptBase_Upd01;

	protected void initDptBase_Upd01() {
		this.info = PDef.MA_MABCL0031_DptBase_Upd01_INFO;
		this.aDptBase_Upd01 = ((MABCL_MultiReg)this).new DptBase_Upd01();
	}

	public static MABCL_MultiReg.DptBase_Upd01 crtDptBase_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptBase_Upd01();
		return lgc.aDptBase_Upd01;
	}

	protected void paramDptBase_Upd01(MCParam p) {
		if (this.aDptBase_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptBase_Upd01.up0());
	}

	protected void doDptBase_Upd01() {
		aDptBase_Upd01.call();
	};

	/**
	 * DptBase_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR createDptBase_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.create();
	}

	/**
	 * DptBase_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> createDptBase_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptBaseLcl_UpdChk01 aDptBaseLcl_UpdChk01;

	protected void initDptBaseLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_DptBaseLcl_UpdChk01_INFO;
		this.aDptBaseLcl_UpdChk01 = ((MABCL_MultiReg)this).new DptBaseLcl_UpdChk01();
	}

	public static MABCL_MultiReg.DptBaseLcl_UpdChk01 crtDptBaseLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptBaseLcl_UpdChk01();
		return lgc.aDptBaseLcl_UpdChk01;
	}

	protected void paramDptBaseLcl_UpdChk01(MCParam p) {
		if (this.aDptBaseLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptBaseLcl_UpdChk01.up0());
	}

	protected void doDptBaseLcl_UpdChk01() {
		aDptBaseLcl_UpdChk01.call();
	};

	/**
	 * DptBaseLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR createDptBaseLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.create();
	}

	/**
	 * DptBaseLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> createDptBaseLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptBaseLcl_Upd01 aDptBaseLcl_Upd01;

	protected void initDptBaseLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_DptBaseLcl_Upd01_INFO;
		this.aDptBaseLcl_Upd01 = ((MABCL_MultiReg)this).new DptBaseLcl_Upd01();
	}

	public static MABCL_MultiReg.DptBaseLcl_Upd01 crtDptBaseLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptBaseLcl_Upd01();
		return lgc.aDptBaseLcl_Upd01;
	}

	protected void paramDptBaseLcl_Upd01(MCParam p) {
		if (this.aDptBaseLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptBaseLcl_Upd01.up0());
	}

	protected void doDptBaseLcl_Upd01() {
		aDptBaseLcl_Upd01.call();
	};

	/**
	 * DptBaseLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR createDptBaseLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.create();
	}

	/**
	 * DptBaseLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> createDptBaseLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptBase_DelChk01 aDptBase_DelChk01;

	protected void initDptBase_DelChk01() {
		this.info = PDef.MA_MABCL0031_DptBase_DelChk01_INFO;
		this.aDptBase_DelChk01 = ((MABCL_MultiReg)this).new DptBase_DelChk01();
	}

	public static MABCL_MultiReg.DptBase_DelChk01 crtDptBase_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptBase_DelChk01();
		return lgc.aDptBase_DelChk01;
	}

	protected void paramDptBase_DelChk01(MCParam p) {
		if (this.aDptBase_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptBase_DelChk01.up0());
	}

	protected void doDptBase_DelChk01() {
		aDptBase_DelChk01.call();
	};

	/**
	 * DptBase_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR createDptBase_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.create();
	}

	/**
	 * DptBase_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> createDptBase_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptBase_Del01 aDptBase_Del01;

	protected void initDptBase_Del01() {
		this.info = PDef.MA_MABCL0031_DptBase_Del01_INFO;
		this.aDptBase_Del01 = ((MABCL_MultiReg)this).new DptBase_Del01();
	}

	public static MABCL_MultiReg.DptBase_Del01 crtDptBase_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptBase_Del01();
		return lgc.aDptBase_Del01;
	}

	protected void paramDptBase_Del01(MCParam p) {
		if (this.aDptBase_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptBase_Del01.up0());
	}

	protected void doDptBase_Del01() {
		aDptBase_Del01.call();
	};

	/**
	 * DptBase_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR createDptBase_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.create();
	}

	/**
	 * DptBase_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> createDptBase_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptLvl_UpdChk01 aDptLvl_UpdChk01;

	protected void initDptLvl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_DptLvl_UpdChk01_INFO;
		this.aDptLvl_UpdChk01 = ((MABCL_MultiReg)this).new DptLvl_UpdChk01();
	}

	public static MABCL_MultiReg.DptLvl_UpdChk01 crtDptLvl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptLvl_UpdChk01();
		return lgc.aDptLvl_UpdChk01;
	}

	protected void paramDptLvl_UpdChk01(MCParam p) {
		if (this.aDptLvl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptLvl_UpdChk01.up0());
	}

	protected void doDptLvl_UpdChk01() {
		aDptLvl_UpdChk01.call();
	};

	/**
	 * DptLvl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR createDptLvl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.create();
	}

	/**
	 * DptLvl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> createDptLvl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptLvl_Upd01 aDptLvl_Upd01;

	protected void initDptLvl_Upd01() {
		this.info = PDef.MA_MABCL0031_DptLvl_Upd01_INFO;
		this.aDptLvl_Upd01 = ((MABCL_MultiReg)this).new DptLvl_Upd01();
	}

	public static MABCL_MultiReg.DptLvl_Upd01 crtDptLvl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptLvl_Upd01();
		return lgc.aDptLvl_Upd01;
	}

	protected void paramDptLvl_Upd01(MCParam p) {
		if (this.aDptLvl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptLvl_Upd01.up0());
	}

	protected void doDptLvl_Upd01() {
		aDptLvl_Upd01.call();
	};

	/**
	 * DptLvl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR createDptLvl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.create();
	}

	/**
	 * DptLvl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> createDptLvl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptLvlLcl_UpdChk01 aDptLvlLcl_UpdChk01;

	protected void initDptLvlLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_DptLvlLcl_UpdChk01_INFO;
		this.aDptLvlLcl_UpdChk01 = ((MABCL_MultiReg)this).new DptLvlLcl_UpdChk01();
	}

	public static MABCL_MultiReg.DptLvlLcl_UpdChk01 crtDptLvlLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptLvlLcl_UpdChk01();
		return lgc.aDptLvlLcl_UpdChk01;
	}

	protected void paramDptLvlLcl_UpdChk01(MCParam p) {
		if (this.aDptLvlLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptLvlLcl_UpdChk01.up0());
	}

	protected void doDptLvlLcl_UpdChk01() {
		aDptLvlLcl_UpdChk01.call();
	};

	/**
	 * DptLvlLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR createDptLvlLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.create();
	}

	/**
	 * DptLvlLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> createDptLvlLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptLvlLcl_Upd01 aDptLvlLcl_Upd01;

	protected void initDptLvlLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_DptLvlLcl_Upd01_INFO;
		this.aDptLvlLcl_Upd01 = ((MABCL_MultiReg)this).new DptLvlLcl_Upd01();
	}

	public static MABCL_MultiReg.DptLvlLcl_Upd01 crtDptLvlLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptLvlLcl_Upd01();
		return lgc.aDptLvlLcl_Upd01;
	}

	protected void paramDptLvlLcl_Upd01(MCParam p) {
		if (this.aDptLvlLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptLvlLcl_Upd01.up0());
	}

	protected void doDptLvlLcl_Upd01() {
		aDptLvlLcl_Upd01.call();
	};

	/**
	 * DptLvlLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR createDptLvlLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.create();
	}

	/**
	 * DptLvlLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> createDptLvlLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptLvl_DelChk01 aDptLvl_DelChk01;

	protected void initDptLvl_DelChk01() {
		this.info = PDef.MA_MABCL0031_DptLvl_DelChk01_INFO;
		this.aDptLvl_DelChk01 = ((MABCL_MultiReg)this).new DptLvl_DelChk01();
	}

	public static MABCL_MultiReg.DptLvl_DelChk01 crtDptLvl_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptLvl_DelChk01();
		return lgc.aDptLvl_DelChk01;
	}

	protected void paramDptLvl_DelChk01(MCParam p) {
		if (this.aDptLvl_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptLvl_DelChk01.up0());
	}

	protected void doDptLvl_DelChk01() {
		aDptLvl_DelChk01.call();
	};

	/**
	 * DptLvl_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR createDptLvl_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.create();
	}

	/**
	 * DptLvl_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> createDptLvl_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.DptLvl_Del01 aDptLvl_Del01;

	protected void initDptLvl_Del01() {
		this.info = PDef.MA_MABCL0031_DptLvl_Del01_INFO;
		this.aDptLvl_Del01 = ((MABCL_MultiReg)this).new DptLvl_Del01();
	}

	public static MABCL_MultiReg.DptLvl_Del01 crtDptLvl_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initDptLvl_Del01();
		return lgc.aDptLvl_Del01;
	}

	protected void paramDptLvl_Del01(MCParam p) {
		if (this.aDptLvl_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDptLvl_Del01.up0());
	}

	protected void doDptLvl_Del01() {
		aDptLvl_Del01.call();
	};

	/**
	 * DptLvl_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR createDptLvl_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.create();
	}

	/**
	 * DptLvl_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> createDptLvl_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AprvRole_UpdChk01 aAprvRole_UpdChk01;

	protected void initAprvRole_UpdChk01() {
		this.info = PDef.MA_MABCL0031_AprvRole_UpdChk01_INFO;
		this.aAprvRole_UpdChk01 = ((MABCL_MultiReg)this).new AprvRole_UpdChk01();
	}

	public static MABCL_MultiReg.AprvRole_UpdChk01 crtAprvRole_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAprvRole_UpdChk01();
		return lgc.aAprvRole_UpdChk01;
	}

	protected void paramAprvRole_UpdChk01(MCParam p) {
		if (this.aAprvRole_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprvRole_UpdChk01.up0());
	}

	protected void doAprvRole_UpdChk01() {
		aAprvRole_UpdChk01.call();
	};

	/**
	 * AprvRole_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR createAprvRole_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.create();
	}

	/**
	 * AprvRole_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> createAprvRole_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AprvRole_Upd01 aAprvRole_Upd01;

	protected void initAprvRole_Upd01() {
		this.info = PDef.MA_MABCL0031_AprvRole_Upd01_INFO;
		this.aAprvRole_Upd01 = ((MABCL_MultiReg)this).new AprvRole_Upd01();
	}

	public static MABCL_MultiReg.AprvRole_Upd01 crtAprvRole_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAprvRole_Upd01();
		return lgc.aAprvRole_Upd01;
	}

	protected void paramAprvRole_Upd01(MCParam p) {
		if (this.aAprvRole_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprvRole_Upd01.up0());
	}

	protected void doAprvRole_Upd01() {
		aAprvRole_Upd01.call();
	};

	/**
	 * AprvRole_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR createAprvRole_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.create();
	}

	/**
	 * AprvRole_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> createAprvRole_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AprvRoleLcl_UpdChk01 aAprvRoleLcl_UpdChk01;

	protected void initAprvRoleLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_AprvRoleLcl_UpdChk01_INFO;
		this.aAprvRoleLcl_UpdChk01 = ((MABCL_MultiReg)this).new AprvRoleLcl_UpdChk01();
	}

	public static MABCL_MultiReg.AprvRoleLcl_UpdChk01 crtAprvRoleLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAprvRoleLcl_UpdChk01();
		return lgc.aAprvRoleLcl_UpdChk01;
	}

	protected void paramAprvRoleLcl_UpdChk01(MCParam p) {
		if (this.aAprvRoleLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprvRoleLcl_UpdChk01.up0());
	}

	protected void doAprvRoleLcl_UpdChk01() {
		aAprvRoleLcl_UpdChk01.call();
	};

	/**
	 * AprvRoleLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR createAprvRoleLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AprvRoleLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> createAprvRoleLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AprvRoleLcl_Upd01 aAprvRoleLcl_Upd01;

	protected void initAprvRoleLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_AprvRoleLcl_Upd01_INFO;
		this.aAprvRoleLcl_Upd01 = ((MABCL_MultiReg)this).new AprvRoleLcl_Upd01();
	}

	public static MABCL_MultiReg.AprvRoleLcl_Upd01 crtAprvRoleLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAprvRoleLcl_Upd01();
		return lgc.aAprvRoleLcl_Upd01;
	}

	protected void paramAprvRoleLcl_Upd01(MCParam p) {
		if (this.aAprvRoleLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprvRoleLcl_Upd01.up0());
	}

	protected void doAprvRoleLcl_Upd01() {
		aAprvRoleLcl_Upd01.call();
	};

	/**
	 * AprvRoleLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR createAprvRoleLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AprvRoleLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> createAprvRoleLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AprvRole_DelChk01 aAprvRole_DelChk01;

	protected void initAprvRole_DelChk01() {
		this.info = PDef.MA_MABCL0031_AprvRole_DelChk01_INFO;
		this.aAprvRole_DelChk01 = ((MABCL_MultiReg)this).new AprvRole_DelChk01();
	}

	public static MABCL_MultiReg.AprvRole_DelChk01 crtAprvRole_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAprvRole_DelChk01();
		return lgc.aAprvRole_DelChk01;
	}

	protected void paramAprvRole_DelChk01(MCParam p) {
		if (this.aAprvRole_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprvRole_DelChk01.up0());
	}

	protected void doAprvRole_DelChk01() {
		aAprvRole_DelChk01.call();
	};

	/**
	 * AprvRole_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR createAprvRole_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.create();
	}

	/**
	 * AprvRole_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> createAprvRole_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AprvRole_Del01 aAprvRole_Del01;

	protected void initAprvRole_Del01() {
		this.info = PDef.MA_MABCL0031_AprvRole_Del01_INFO;
		this.aAprvRole_Del01 = ((MABCL_MultiReg)this).new AprvRole_Del01();
	}

	public static MABCL_MultiReg.AprvRole_Del01 crtAprvRole_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAprvRole_Del01();
		return lgc.aAprvRole_Del01;
	}

	protected void paramAprvRole_Del01(MCParam p) {
		if (this.aAprvRole_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprvRole_Del01.up0());
	}

	protected void doAprvRole_Del01() {
		aAprvRole_Del01.call();
	};

	/**
	 * AprvRole_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR createAprvRole_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.create();
	}

	/**
	 * AprvRole_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> createAprvRole_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Cntry_UpdChk01 aCntry_UpdChk01;

	protected void initCntry_UpdChk01() {
		this.info = PDef.MA_MABCL0031_Cntry_UpdChk01_INFO;
		this.aCntry_UpdChk01 = ((MABCL_MultiReg)this).new Cntry_UpdChk01();
	}

	public static MABCL_MultiReg.Cntry_UpdChk01 crtCntry_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCntry_UpdChk01();
		return lgc.aCntry_UpdChk01;
	}

	protected void paramCntry_UpdChk01(MCParam p) {
		if (this.aCntry_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCntry_UpdChk01.up0());
	}

	protected void doCntry_UpdChk01() {
		aCntry_UpdChk01.call();
	};

	/**
	 * Cntry_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR createCntry_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.create();
	}

	/**
	 * Cntry_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> createCntry_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Cntry_Upd01 aCntry_Upd01;

	protected void initCntry_Upd01() {
		this.info = PDef.MA_MABCL0031_Cntry_Upd01_INFO;
		this.aCntry_Upd01 = ((MABCL_MultiReg)this).new Cntry_Upd01();
	}

	public static MABCL_MultiReg.Cntry_Upd01 crtCntry_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCntry_Upd01();
		return lgc.aCntry_Upd01;
	}

	protected void paramCntry_Upd01(MCParam p) {
		if (this.aCntry_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCntry_Upd01.up0());
	}

	protected void doCntry_Upd01() {
		aCntry_Upd01.call();
	};

	/**
	 * Cntry_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR createCntry_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.create();
	}

	/**
	 * Cntry_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> createCntry_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CntryLcl_UpdChk01 aCntryLcl_UpdChk01;

	protected void initCntryLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_CntryLcl_UpdChk01_INFO;
		this.aCntryLcl_UpdChk01 = ((MABCL_MultiReg)this).new CntryLcl_UpdChk01();
	}

	public static MABCL_MultiReg.CntryLcl_UpdChk01 crtCntryLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCntryLcl_UpdChk01();
		return lgc.aCntryLcl_UpdChk01;
	}

	protected void paramCntryLcl_UpdChk01(MCParam p) {
		if (this.aCntryLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCntryLcl_UpdChk01.up0());
	}

	protected void doCntryLcl_UpdChk01() {
		aCntryLcl_UpdChk01.call();
	};

	/**
	 * CntryLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR createCntryLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CntryLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> createCntryLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CntryLcl_Upd01 aCntryLcl_Upd01;

	protected void initCntryLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_CntryLcl_Upd01_INFO;
		this.aCntryLcl_Upd01 = ((MABCL_MultiReg)this).new CntryLcl_Upd01();
	}

	public static MABCL_MultiReg.CntryLcl_Upd01 crtCntryLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCntryLcl_Upd01();
		return lgc.aCntryLcl_Upd01;
	}

	protected void paramCntryLcl_Upd01(MCParam p) {
		if (this.aCntryLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCntryLcl_Upd01.up0());
	}

	protected void doCntryLcl_Upd01() {
		aCntryLcl_Upd01.call();
	};

	/**
	 * CntryLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR createCntryLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CntryLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> createCntryLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Cntry_DelChk01 aCntry_DelChk01;

	protected void initCntry_DelChk01() {
		this.info = PDef.MA_MABCL0031_Cntry_DelChk01_INFO;
		this.aCntry_DelChk01 = ((MABCL_MultiReg)this).new Cntry_DelChk01();
	}

	public static MABCL_MultiReg.Cntry_DelChk01 crtCntry_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCntry_DelChk01();
		return lgc.aCntry_DelChk01;
	}

	protected void paramCntry_DelChk01(MCParam p) {
		if (this.aCntry_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCntry_DelChk01.up0());
	}

	protected void doCntry_DelChk01() {
		aCntry_DelChk01.call();
	};

	/**
	 * Cntry_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR createCntry_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.create();
	}

	/**
	 * Cntry_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> createCntry_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Cntry_Del01 aCntry_Del01;

	protected void initCntry_Del01() {
		this.info = PDef.MA_MABCL0031_Cntry_Del01_INFO;
		this.aCntry_Del01 = ((MABCL_MultiReg)this).new Cntry_Del01();
	}

	public static MABCL_MultiReg.Cntry_Del01 crtCntry_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCntry_Del01();
		return lgc.aCntry_Del01;
	}

	protected void paramCntry_Del01(MCParam p) {
		if (this.aCntry_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCntry_Del01.up0());
	}

	protected void doCntry_Del01() {
		aCntry_Del01.call();
	};

	/**
	 * Cntry_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR createCntry_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.create();
	}

	/**
	 * Cntry_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> createCntry_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Area_UpdChk01 aArea_UpdChk01;

	protected void initArea_UpdChk01() {
		this.info = PDef.MA_MABCL0031_Area_UpdChk01_INFO;
		this.aArea_UpdChk01 = ((MABCL_MultiReg)this).new Area_UpdChk01();
	}

	public static MABCL_MultiReg.Area_UpdChk01 crtArea_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initArea_UpdChk01();
		return lgc.aArea_UpdChk01;
	}

	protected void paramArea_UpdChk01(MCParam p) {
		if (this.aArea_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArea_UpdChk01.up0());
	}

	protected void doArea_UpdChk01() {
		aArea_UpdChk01.call();
	};

	/**
	 * Area_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR createArea_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.create();
	}

	/**
	 * Area_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> createArea_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Area_Upd01 aArea_Upd01;

	protected void initArea_Upd01() {
		this.info = PDef.MA_MABCL0031_Area_Upd01_INFO;
		this.aArea_Upd01 = ((MABCL_MultiReg)this).new Area_Upd01();
	}

	public static MABCL_MultiReg.Area_Upd01 crtArea_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initArea_Upd01();
		return lgc.aArea_Upd01;
	}

	protected void paramArea_Upd01(MCParam p) {
		if (this.aArea_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArea_Upd01.up0());
	}

	protected void doArea_Upd01() {
		aArea_Upd01.call();
	};

	/**
	 * Area_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR createArea_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.create();
	}

	/**
	 * Area_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> createArea_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AreaLcl_UpdChk01 aAreaLcl_UpdChk01;

	protected void initAreaLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_AreaLcl_UpdChk01_INFO;
		this.aAreaLcl_UpdChk01 = ((MABCL_MultiReg)this).new AreaLcl_UpdChk01();
	}

	public static MABCL_MultiReg.AreaLcl_UpdChk01 crtAreaLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAreaLcl_UpdChk01();
		return lgc.aAreaLcl_UpdChk01;
	}

	protected void paramAreaLcl_UpdChk01(MCParam p) {
		if (this.aAreaLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAreaLcl_UpdChk01.up0());
	}

	protected void doAreaLcl_UpdChk01() {
		aAreaLcl_UpdChk01.call();
	};

	/**
	 * AreaLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR createAreaLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AreaLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> createAreaLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AreaLcl_Upd01 aAreaLcl_Upd01;

	protected void initAreaLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_AreaLcl_Upd01_INFO;
		this.aAreaLcl_Upd01 = ((MABCL_MultiReg)this).new AreaLcl_Upd01();
	}

	public static MABCL_MultiReg.AreaLcl_Upd01 crtAreaLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAreaLcl_Upd01();
		return lgc.aAreaLcl_Upd01;
	}

	protected void paramAreaLcl_Upd01(MCParam p) {
		if (this.aAreaLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAreaLcl_Upd01.up0());
	}

	protected void doAreaLcl_Upd01() {
		aAreaLcl_Upd01.call();
	};

	/**
	 * AreaLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR createAreaLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AreaLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> createAreaLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Area_DelChk01 aArea_DelChk01;

	protected void initArea_DelChk01() {
		this.info = PDef.MA_MABCL0031_Area_DelChk01_INFO;
		this.aArea_DelChk01 = ((MABCL_MultiReg)this).new Area_DelChk01();
	}

	public static MABCL_MultiReg.Area_DelChk01 crtArea_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initArea_DelChk01();
		return lgc.aArea_DelChk01;
	}

	protected void paramArea_DelChk01(MCParam p) {
		if (this.aArea_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArea_DelChk01.up0());
	}

	protected void doArea_DelChk01() {
		aArea_DelChk01.call();
	};

	/**
	 * Area_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR createArea_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.create();
	}

	/**
	 * Area_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> createArea_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Area_Del01 aArea_Del01;

	protected void initArea_Del01() {
		this.info = PDef.MA_MABCL0031_Area_Del01_INFO;
		this.aArea_Del01 = ((MABCL_MultiReg)this).new Area_Del01();
	}

	public static MABCL_MultiReg.Area_Del01 crtArea_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initArea_Del01();
		return lgc.aArea_Del01;
	}

	protected void paramArea_Del01(MCParam p) {
		if (this.aArea_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArea_Del01.up0());
	}

	protected void doArea_Del01() {
		aArea_Del01.call();
	};

	/**
	 * Area_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR createArea_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.create();
	}

	/**
	 * Area_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> createArea_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Cur_UpdChk01 aCur_UpdChk01;

	protected void initCur_UpdChk01() {
		this.info = PDef.MA_MABCL0031_Cur_UpdChk01_INFO;
		this.aCur_UpdChk01 = ((MABCL_MultiReg)this).new Cur_UpdChk01();
	}

	public static MABCL_MultiReg.Cur_UpdChk01 crtCur_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCur_UpdChk01();
		return lgc.aCur_UpdChk01;
	}

	protected void paramCur_UpdChk01(MCParam p) {
		if (this.aCur_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCur_UpdChk01.up0());
	}

	protected void doCur_UpdChk01() {
		aCur_UpdChk01.call();
	};

	/**
	 * Cur_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR createCur_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.create();
	}

	/**
	 * Cur_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> createCur_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Cur_Upd01 aCur_Upd01;

	protected void initCur_Upd01() {
		this.info = PDef.MA_MABCL0031_Cur_Upd01_INFO;
		this.aCur_Upd01 = ((MABCL_MultiReg)this).new Cur_Upd01();
	}

	public static MABCL_MultiReg.Cur_Upd01 crtCur_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCur_Upd01();
		return lgc.aCur_Upd01;
	}

	protected void paramCur_Upd01(MCParam p) {
		if (this.aCur_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCur_Upd01.up0());
	}

	protected void doCur_Upd01() {
		aCur_Upd01.call();
	};

	/**
	 * Cur_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR createCur_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.create();
	}

	/**
	 * Cur_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> createCur_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CurLcl_UpdChk01 aCurLcl_UpdChk01;

	protected void initCurLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_CurLcl_UpdChk01_INFO;
		this.aCurLcl_UpdChk01 = ((MABCL_MultiReg)this).new CurLcl_UpdChk01();
	}

	public static MABCL_MultiReg.CurLcl_UpdChk01 crtCurLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCurLcl_UpdChk01();
		return lgc.aCurLcl_UpdChk01;
	}

	protected void paramCurLcl_UpdChk01(MCParam p) {
		if (this.aCurLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCurLcl_UpdChk01.up0());
	}

	protected void doCurLcl_UpdChk01() {
		aCurLcl_UpdChk01.call();
	};

	/**
	 * CurLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR createCurLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CurLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> createCurLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CurLcl_Upd01 aCurLcl_Upd01;

	protected void initCurLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_CurLcl_Upd01_INFO;
		this.aCurLcl_Upd01 = ((MABCL_MultiReg)this).new CurLcl_Upd01();
	}

	public static MABCL_MultiReg.CurLcl_Upd01 crtCurLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCurLcl_Upd01();
		return lgc.aCurLcl_Upd01;
	}

	protected void paramCurLcl_Upd01(MCParam p) {
		if (this.aCurLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCurLcl_Upd01.up0());
	}

	protected void doCurLcl_Upd01() {
		aCurLcl_Upd01.call();
	};

	/**
	 * CurLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR createCurLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CurLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> createCurLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Cur_DelChk01 aCur_DelChk01;

	protected void initCur_DelChk01() {
		this.info = PDef.MA_MABCL0031_Cur_DelChk01_INFO;
		this.aCur_DelChk01 = ((MABCL_MultiReg)this).new Cur_DelChk01();
	}

	public static MABCL_MultiReg.Cur_DelChk01 crtCur_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCur_DelChk01();
		return lgc.aCur_DelChk01;
	}

	protected void paramCur_DelChk01(MCParam p) {
		if (this.aCur_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCur_DelChk01.up0());
	}

	protected void doCur_DelChk01() {
		aCur_DelChk01.call();
	};

	/**
	 * Cur_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR createCur_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.create();
	}

	/**
	 * Cur_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> createCur_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Cur_Del01 aCur_Del01;

	protected void initCur_Del01() {
		this.info = PDef.MA_MABCL0031_Cur_Del01_INFO;
		this.aCur_Del01 = ((MABCL_MultiReg)this).new Cur_Del01();
	}

	public static MABCL_MultiReg.Cur_Del01 crtCur_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCur_Del01();
		return lgc.aCur_Del01;
	}

	protected void paramCur_Del01(MCParam p) {
		if (this.aCur_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCur_Del01.up0());
	}

	protected void doCur_Del01() {
		aCur_Del01.call();
	};

	/**
	 * Cur_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR createCur_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.create();
	}

	/**
	 * Cur_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> createCur_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Unit_UpdChk01 aUnit_UpdChk01;

	protected void initUnit_UpdChk01() {
		this.info = PDef.MA_MABCL0031_Unit_UpdChk01_INFO;
		this.aUnit_UpdChk01 = ((MABCL_MultiReg)this).new Unit_UpdChk01();
	}

	public static MABCL_MultiReg.Unit_UpdChk01 crtUnit_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initUnit_UpdChk01();
		return lgc.aUnit_UpdChk01;
	}

	protected void paramUnit_UpdChk01(MCParam p) {
		if (this.aUnit_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUnit_UpdChk01.up0());
	}

	protected void doUnit_UpdChk01() {
		aUnit_UpdChk01.call();
	};

	/**
	 * Unit_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR createUnit_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.create();
	}

	/**
	 * Unit_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> createUnit_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Unit_Upd01 aUnit_Upd01;

	protected void initUnit_Upd01() {
		this.info = PDef.MA_MABCL0031_Unit_Upd01_INFO;
		this.aUnit_Upd01 = ((MABCL_MultiReg)this).new Unit_Upd01();
	}

	public static MABCL_MultiReg.Unit_Upd01 crtUnit_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initUnit_Upd01();
		return lgc.aUnit_Upd01;
	}

	protected void paramUnit_Upd01(MCParam p) {
		if (this.aUnit_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUnit_Upd01.up0());
	}

	protected void doUnit_Upd01() {
		aUnit_Upd01.call();
	};

	/**
	 * Unit_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR createUnit_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.create();
	}

	/**
	 * Unit_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> createUnit_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.UnitLcl_UpdChk01 aUnitLcl_UpdChk01;

	protected void initUnitLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_UnitLcl_UpdChk01_INFO;
		this.aUnitLcl_UpdChk01 = ((MABCL_MultiReg)this).new UnitLcl_UpdChk01();
	}

	public static MABCL_MultiReg.UnitLcl_UpdChk01 crtUnitLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initUnitLcl_UpdChk01();
		return lgc.aUnitLcl_UpdChk01;
	}

	protected void paramUnitLcl_UpdChk01(MCParam p) {
		if (this.aUnitLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUnitLcl_UpdChk01.up0());
	}

	protected void doUnitLcl_UpdChk01() {
		aUnitLcl_UpdChk01.call();
	};

	/**
	 * UnitLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR createUnitLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.create();
	}

	/**
	 * UnitLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> createUnitLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.UnitLcl_Upd01 aUnitLcl_Upd01;

	protected void initUnitLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_UnitLcl_Upd01_INFO;
		this.aUnitLcl_Upd01 = ((MABCL_MultiReg)this).new UnitLcl_Upd01();
	}

	public static MABCL_MultiReg.UnitLcl_Upd01 crtUnitLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initUnitLcl_Upd01();
		return lgc.aUnitLcl_Upd01;
	}

	protected void paramUnitLcl_Upd01(MCParam p) {
		if (this.aUnitLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUnitLcl_Upd01.up0());
	}

	protected void doUnitLcl_Upd01() {
		aUnitLcl_Upd01.call();
	};

	/**
	 * UnitLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR createUnitLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.create();
	}

	/**
	 * UnitLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> createUnitLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Unit_DelChk01 aUnit_DelChk01;

	protected void initUnit_DelChk01() {
		this.info = PDef.MA_MABCL0031_Unit_DelChk01_INFO;
		this.aUnit_DelChk01 = ((MABCL_MultiReg)this).new Unit_DelChk01();
	}

	public static MABCL_MultiReg.Unit_DelChk01 crtUnit_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initUnit_DelChk01();
		return lgc.aUnit_DelChk01;
	}

	protected void paramUnit_DelChk01(MCParam p) {
		if (this.aUnit_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUnit_DelChk01.up0());
	}

	protected void doUnit_DelChk01() {
		aUnit_DelChk01.call();
	};

	/**
	 * Unit_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR createUnit_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.create();
	}

	/**
	 * Unit_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> createUnit_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Unit_Del01 aUnit_Del01;

	protected void initUnit_Del01() {
		this.info = PDef.MA_MABCL0031_Unit_Del01_INFO;
		this.aUnit_Del01 = ((MABCL_MultiReg)this).new Unit_Del01();
	}

	public static MABCL_MultiReg.Unit_Del01 crtUnit_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initUnit_Del01();
		return lgc.aUnit_Del01;
	}

	protected void paramUnit_Del01(MCParam p) {
		if (this.aUnit_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUnit_Del01.up0());
	}

	protected void doUnit_Del01() {
		aUnit_Del01.call();
	};

	/**
	 * Unit_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR createUnit_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.create();
	}

	/**
	 * Unit_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> createUnit_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Bank_UpdChk01 aBank_UpdChk01;

	protected void initBank_UpdChk01() {
		this.info = PDef.MA_MABCL0031_Bank_UpdChk01_INFO;
		this.aBank_UpdChk01 = ((MABCL_MultiReg)this).new Bank_UpdChk01();
	}

	public static MABCL_MultiReg.Bank_UpdChk01 crtBank_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBank_UpdChk01();
		return lgc.aBank_UpdChk01;
	}

	protected void paramBank_UpdChk01(MCParam p) {
		if (this.aBank_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBank_UpdChk01.up0());
	}

	protected void doBank_UpdChk01() {
		aBank_UpdChk01.call();
	};

	/**
	 * Bank_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR createBank_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.create();
	}

	/**
	 * Bank_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> createBank_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Bank_Upd01 aBank_Upd01;

	protected void initBank_Upd01() {
		this.info = PDef.MA_MABCL0031_Bank_Upd01_INFO;
		this.aBank_Upd01 = ((MABCL_MultiReg)this).new Bank_Upd01();
	}

	public static MABCL_MultiReg.Bank_Upd01 crtBank_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBank_Upd01();
		return lgc.aBank_Upd01;
	}

	protected void paramBank_Upd01(MCParam p) {
		if (this.aBank_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBank_Upd01.up0());
	}

	protected void doBank_Upd01() {
		aBank_Upd01.call();
	};

	/**
	 * Bank_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR createBank_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.create();
	}

	/**
	 * Bank_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> createBank_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.BankLcl_UpdChk01 aBankLcl_UpdChk01;

	protected void initBankLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_BankLcl_UpdChk01_INFO;
		this.aBankLcl_UpdChk01 = ((MABCL_MultiReg)this).new BankLcl_UpdChk01();
	}

	public static MABCL_MultiReg.BankLcl_UpdChk01 crtBankLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBankLcl_UpdChk01();
		return lgc.aBankLcl_UpdChk01;
	}

	protected void paramBankLcl_UpdChk01(MCParam p) {
		if (this.aBankLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBankLcl_UpdChk01.up0());
	}

	protected void doBankLcl_UpdChk01() {
		aBankLcl_UpdChk01.call();
	};

	/**
	 * BankLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR createBankLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.create();
	}

	/**
	 * BankLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> createBankLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.BankLcl_Upd01 aBankLcl_Upd01;

	protected void initBankLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_BankLcl_Upd01_INFO;
		this.aBankLcl_Upd01 = ((MABCL_MultiReg)this).new BankLcl_Upd01();
	}

	public static MABCL_MultiReg.BankLcl_Upd01 crtBankLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBankLcl_Upd01();
		return lgc.aBankLcl_Upd01;
	}

	protected void paramBankLcl_Upd01(MCParam p) {
		if (this.aBankLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBankLcl_Upd01.up0());
	}

	protected void doBankLcl_Upd01() {
		aBankLcl_Upd01.call();
	};

	/**
	 * BankLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR createBankLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.create();
	}

	/**
	 * BankLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> createBankLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Bank_DelChk01 aBank_DelChk01;

	protected void initBank_DelChk01() {
		this.info = PDef.MA_MABCL0031_Bank_DelChk01_INFO;
		this.aBank_DelChk01 = ((MABCL_MultiReg)this).new Bank_DelChk01();
	}

	public static MABCL_MultiReg.Bank_DelChk01 crtBank_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBank_DelChk01();
		return lgc.aBank_DelChk01;
	}

	protected void paramBank_DelChk01(MCParam p) {
		if (this.aBank_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBank_DelChk01.up0());
	}

	protected void doBank_DelChk01() {
		aBank_DelChk01.call();
	};

	/**
	 * Bank_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR createBank_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.create();
	}

	/**
	 * Bank_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> createBank_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Bank_Del01 aBank_Del01;

	protected void initBank_Del01() {
		this.info = PDef.MA_MABCL0031_Bank_Del01_INFO;
		this.aBank_Del01 = ((MABCL_MultiReg)this).new Bank_Del01();
	}

	public static MABCL_MultiReg.Bank_Del01 crtBank_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBank_Del01();
		return lgc.aBank_Del01;
	}

	protected void paramBank_Del01(MCParam p) {
		if (this.aBank_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBank_Del01.up0());
	}

	protected void doBank_Del01() {
		aBank_Del01.call();
	};

	/**
	 * Bank_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR createBank_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.create();
	}

	/**
	 * Bank_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> createBank_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.BankBranch_UpdChk01 aBankBranch_UpdChk01;

	protected void initBankBranch_UpdChk01() {
		this.info = PDef.MA_MABCL0031_BankBranch_UpdChk01_INFO;
		this.aBankBranch_UpdChk01 = ((MABCL_MultiReg)this).new BankBranch_UpdChk01();
	}

	public static MABCL_MultiReg.BankBranch_UpdChk01 crtBankBranch_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBankBranch_UpdChk01();
		return lgc.aBankBranch_UpdChk01;
	}

	protected void paramBankBranch_UpdChk01(MCParam p) {
		if (this.aBankBranch_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBankBranch_UpdChk01.up0());
	}

	protected void doBankBranch_UpdChk01() {
		aBankBranch_UpdChk01.call();
	};

	/**
	 * BankBranch_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR createBankBranch_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.create();
	}

	/**
	 * BankBranch_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> createBankBranch_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.BankBranch_Upd01 aBankBranch_Upd01;

	protected void initBankBranch_Upd01() {
		this.info = PDef.MA_MABCL0031_BankBranch_Upd01_INFO;
		this.aBankBranch_Upd01 = ((MABCL_MultiReg)this).new BankBranch_Upd01();
	}

	public static MABCL_MultiReg.BankBranch_Upd01 crtBankBranch_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBankBranch_Upd01();
		return lgc.aBankBranch_Upd01;
	}

	protected void paramBankBranch_Upd01(MCParam p) {
		if (this.aBankBranch_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBankBranch_Upd01.up0());
	}

	protected void doBankBranch_Upd01() {
		aBankBranch_Upd01.call();
	};

	/**
	 * BankBranch_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR createBankBranch_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.create();
	}

	/**
	 * BankBranch_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> createBankBranch_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.BankBranchLcl_UpdChk01 aBankBranchLcl_UpdChk01;

	protected void initBankBranchLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0031_BankBranchLcl_UpdChk01_INFO;
		this.aBankBranchLcl_UpdChk01 = ((MABCL_MultiReg)this).new BankBranchLcl_UpdChk01();
	}

	public static MABCL_MultiReg.BankBranchLcl_UpdChk01 crtBankBranchLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBankBranchLcl_UpdChk01();
		return lgc.aBankBranchLcl_UpdChk01;
	}

	protected void paramBankBranchLcl_UpdChk01(MCParam p) {
		if (this.aBankBranchLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBankBranchLcl_UpdChk01.up0());
	}

	protected void doBankBranchLcl_UpdChk01() {
		aBankBranchLcl_UpdChk01.call();
	};

	/**
	 * BankBranchLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR createBankBranchLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.create();
	}

	/**
	 * BankBranchLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> createBankBranchLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.BankBranchLcl_Upd01 aBankBranchLcl_Upd01;

	protected void initBankBranchLcl_Upd01() {
		this.info = PDef.MA_MABCL0031_BankBranchLcl_Upd01_INFO;
		this.aBankBranchLcl_Upd01 = ((MABCL_MultiReg)this).new BankBranchLcl_Upd01();
	}

	public static MABCL_MultiReg.BankBranchLcl_Upd01 crtBankBranchLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBankBranchLcl_Upd01();
		return lgc.aBankBranchLcl_Upd01;
	}

	protected void paramBankBranchLcl_Upd01(MCParam p) {
		if (this.aBankBranchLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBankBranchLcl_Upd01.up0());
	}

	protected void doBankBranchLcl_Upd01() {
		aBankBranchLcl_Upd01.call();
	};

	/**
	 * BankBranchLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR createBankBranchLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.create();
	}

	/**
	 * BankBranchLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> createBankBranchLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.BankBranch_DelChk01 aBankBranch_DelChk01;

	protected void initBankBranch_DelChk01() {
		this.info = PDef.MA_MABCL0031_BankBranch_DelChk01_INFO;
		this.aBankBranch_DelChk01 = ((MABCL_MultiReg)this).new BankBranch_DelChk01();
	}

	public static MABCL_MultiReg.BankBranch_DelChk01 crtBankBranch_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBankBranch_DelChk01();
		return lgc.aBankBranch_DelChk01;
	}

	protected void paramBankBranch_DelChk01(MCParam p) {
		if (this.aBankBranch_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBankBranch_DelChk01.up0());
	}

	protected void doBankBranch_DelChk01() {
		aBankBranch_DelChk01.call();
	};

	/**
	 * BankBranch_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR createBankBranch_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.create();
	}

	/**
	 * BankBranch_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> createBankBranch_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.BankBranch_Del01 aBankBranch_Del01;

	protected void initBankBranch_Del01() {
		this.info = PDef.MA_MABCL0031_BankBranch_Del01_INFO;
		this.aBankBranch_Del01 = ((MABCL_MultiReg)this).new BankBranch_Del01();
	}

	public static MABCL_MultiReg.BankBranch_Del01 crtBankBranch_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initBankBranch_Del01();
		return lgc.aBankBranch_Del01;
	}

	protected void paramBankBranch_Del01(MCParam p) {
		if (this.aBankBranch_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBankBranch_Del01.up0());
	}

	protected void doBankBranch_Del01() {
		aBankBranch_Del01.call();
	};

	/**
	 * BankBranch_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR createBankBranch_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.create();
	}

	/**
	 * BankBranch_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> createBankBranch_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Da_UpdChk01オペレーション.<p>
	 *
	 * データアクセス基本マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Da_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Da_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Da_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.class);

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
		 * Da_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR createDa_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.create();
		}

		/**
		 * Da_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> createDa_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>da_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Da_Upd01オペレーション.<p>
	 *
	 * データアクセス基本マスタの登録を行います。<br>
	 */
	abstract public class Da_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Da_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DA_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DA_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DA_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DA_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_DA_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DA_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DA_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DA_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DA_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_DA_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Da_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_DA_R.create("T1"));
			chkMaster = MCController.create(MAM_DA_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_DA_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_DA_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DA_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_DA_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Da_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR createDa_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.create();
		}

		/**
		 * Da_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> createDa_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>da_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_DA_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> src_Da_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Da_Upd01_Dtl);
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
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("da_nm", "da_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_DA_R r_dest, mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_DA_R> dest, MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR r_src : src){
				MAM_DA_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_DA_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> src_Da_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Da_Upd01_Dtl);
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
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("da_nm", "da_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_DA_R r_dest, mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_DA_R> dest, MCList<mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.Da_UpdChk01_DtlR r_src : src){
				MAM_DA_R r_dest = dest.createRow();
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
	 * DaLcl_UpdChk01オペレーション.<p>
	 *
	 * データアクセス基本マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class DaLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DaLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DA_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DA_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DA_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DA_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_DA_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DaLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_DA_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_DA_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_DA_R&gt; （{@link #chk01_up0}）<br>
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
		 * DaLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR createDaLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.create();
		}

		/**
		 * DaLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> createDaLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>da_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_DA_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> src_DaLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_DaLcl_UpdChk01_Dtl);
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
				addColumnPathMap("da_cd", "da_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_DA_R r_dest, mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_DA_R> dest, MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR r_src : src){
				MAM_DA_R r_dest = dest.createRow();
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
	 * DaLcl_Upd01オペレーション.<p>
	 *
	 * データアクセス基本マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class DaLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DaLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DA_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DA_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DA_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DA_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_DA_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DA_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DA_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DA_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DA_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_DA_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DaLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_DA_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_DA_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_DA_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_DA_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DA_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_DA_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * DaLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR createDaLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.create();
		}

		/**
		 * DaLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> createDaLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>da_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_DA_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> src_DaLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_DaLcl_Upd01_Dtl);
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
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("da_nm", "da_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_DA_LCL_R r_dest, mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_DA_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR r_src : src){
				MAM_DA_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_DA_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> src_DaLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_DaLcl_Upd01_Dtl);
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
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("da_nm", "da_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_DA_LCL_R r_dest, mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_DA_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.DaLcl_UpdChk01_DtlR r_src : src){
				MAM_DA_LCL_R r_dest = dest.createRow();
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
	 * Da_DelChk01オペレーション.<p>
	 *
	 * データアクセス基本マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Da_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Da_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Da_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.class);

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
		 * Da_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR createDa_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.create();
		}

		/**
		 * Da_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> createDa_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Da_Del01オペレーション.<p>
	 *
	 * データアクセス基本マスタの削除を行います。<br>
	 */
	abstract public class Da_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Da_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DA_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_DA_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DA_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DA_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DA_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DA_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DA_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DA_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_DA_R> updMaster1_up0;
		public final MCList<MAM_DA_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Da_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_DA_R.create("T1"));
			updMaster2 = MCController.create(MAM_DA_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_DA_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_DA_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DA_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_DA_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Da_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR createDa_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.create();
		}

		/**
		 * Da_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> createDa_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_DA_R> dest0_0, MCList<MAM_DA_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> src_Da_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Da_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Da_Del01_Dtl);
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
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_DA_R r_dest, mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_DA_R> dest, MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR r_src : src){
				MAM_DA_R r_dest = dest.createRow();
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
				addColumnPathMap("da_cd", "da_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_DA_LCL_R r_dest, mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_DA_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.Da_DelChk01_DtlR r_src : src){
				MAM_DA_LCL_R r_dest = dest.createRow();
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
	 * DptBase_UpdChk01オペレーション.<p>
	 *
	 * 部門基本マスタの登録前のチェックを行います。<br>
	 */
	abstract public class DptBase_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptBase_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected DptBase_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.class);

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
		 * DptBase_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR createDptBase_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.create();
		}

		/**
		 * DptBase_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> createDptBase_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>def_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * DptBase_Upd01オペレーション.<p>
	 *
	 * 部門基本マスタの登録を行います。<br>
	 */
	abstract public class DptBase_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptBase_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_BASE_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_BASE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_BASE_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_BASE_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_BASE_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_BASE_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_BASE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_BASE_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_BASE_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_BASE_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptBase_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_DPT_BASE_R.create("T1"));
			chkMaster = MCController.create(MAM_DPT_BASE_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_DPT_BASE_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_DPT_BASE_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_BASE_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_DPT_BASE_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * DptBase_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR createDptBase_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.create();
		}

		/**
		 * DptBase_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> createDptBase_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>def_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_DPT_BASE_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> src_DptBase_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_DptBase_Upd01_Dtl);
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
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("def_dpt_nm", "def_dpt_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_DPT_BASE_R r_dest, mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_DPT_BASE_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR r_src : src){
				MAM_DPT_BASE_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_DPT_BASE_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> src_DptBase_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_DptBase_Upd01_Dtl);
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
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("def_dpt_nm", "def_dpt_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_DPT_BASE_R r_dest, mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_DPT_BASE_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.DptBase_UpdChk01_DtlR r_src : src){
				MAM_DPT_BASE_R r_dest = dest.createRow();
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
	 * DptBaseLcl_UpdChk01オペレーション.<p>
	 *
	 * 部門基本マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class DptBaseLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptBaseLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_BASE_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_BASE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_BASE_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_BASE_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_DPT_BASE_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptBaseLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_DPT_BASE_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_DPT_BASE_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_DPT_BASE_R&gt; （{@link #chk01_up0}）<br>
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
		 * DptBaseLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR createDptBaseLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.create();
		}

		/**
		 * DptBaseLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> createDptBaseLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>def_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_DPT_BASE_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> src_DptBaseLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_DptBaseLcl_UpdChk01_Dtl);
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
				addColumnPathMap("dpt_cd", "dpt_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_DPT_BASE_R r_dest, mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_DPT_BASE_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR r_src : src){
				MAM_DPT_BASE_R r_dest = dest.createRow();
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
	 * DptBaseLcl_Upd01オペレーション.<p>
	 *
	 * 部門基本マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class DptBaseLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptBaseLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_BASE_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_BASE_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_BASE_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_BASE_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_BASE_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_BASE_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_BASE_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_BASE_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_BASE_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_BASE_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptBaseLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_DPT_BASE_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_DPT_BASE_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_DPT_BASE_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_DPT_BASE_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_BASE_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_DPT_BASE_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * DptBaseLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR createDptBaseLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.create();
		}

		/**
		 * DptBaseLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> createDptBaseLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>def_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_DPT_BASE_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> src_DptBaseLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_DptBaseLcl_Upd01_Dtl);
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
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("def_dpt_nm", "def_dpt_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_DPT_BASE_LCL_R r_dest, mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_DPT_BASE_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR r_src : src){
				MAM_DPT_BASE_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_DPT_BASE_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> src_DptBaseLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_DptBaseLcl_Upd01_Dtl);
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
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("def_dpt_nm", "def_dpt_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_DPT_BASE_LCL_R r_dest, mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_DPT_BASE_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.DptBaseLcl_UpdChk01_DtlR r_src : src){
				MAM_DPT_BASE_LCL_R r_dest = dest.createRow();
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
	 * DptBase_DelChk01オペレーション.<p>
	 *
	 * 部門基本マスタの削除前のチェックを行います。<br>
	 */
	abstract public class DptBase_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptBase_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected DptBase_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.class);

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
		 * DptBase_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR createDptBase_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.create();
		}

		/**
		 * DptBase_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> createDptBase_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * DptBase_Del01オペレーション.<p>
	 *
	 * 部門基本マスタの削除を行います。<br>
	 */
	abstract public class DptBase_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptBase_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_BASE_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_BASE_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_BASE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_BASE_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_BASE_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_BASE_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_BASE_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_BASE_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_DPT_BASE_R> updMaster1_up0;
		public final MCList<MAM_DPT_BASE_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptBase_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_DPT_BASE_R.create("T1"));
			updMaster2 = MCController.create(MAM_DPT_BASE_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_DPT_BASE_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_DPT_BASE_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_BASE_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_DPT_BASE_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * DptBase_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR createDptBase_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.create();
		}

		/**
		 * DptBase_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> createDptBase_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_DPT_BASE_R> dest0_0, MCList<MAM_DPT_BASE_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> src_DptBase_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_DptBase_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_DptBase_Del01_Dtl);
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
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_DPT_BASE_R r_dest, mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_DPT_BASE_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR r_src : src){
				MAM_DPT_BASE_R r_dest = dest.createRow();
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
				addColumnPathMap("dpt_cd", "dpt_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_DPT_BASE_LCL_R r_dest, mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_DPT_BASE_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.DptBase_DelChk01_DtlR r_src : src){
				MAM_DPT_BASE_LCL_R r_dest = dest.createRow();
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
	 * DptLvl_UpdChk01オペレーション.<p>
	 *
	 * 部門階層マスタの登録前のチェックを行います。<br>
	 */
	abstract public class DptLvl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptLvl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected DptLvl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.class);

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
		 * DptLvl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR createDptLvl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.create();
		}

		/**
		 * DptLvl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> createDptLvl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * DptLvl_Upd01オペレーション.<p>
	 *
	 * 部門階層マスタの登録を行います。<br>
	 */
	abstract public class DptLvl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptLvl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_LVL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_LVL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_LVL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_LVL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_LVL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_LVL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_LVL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_LVL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_LVL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_LVL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptLvl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_DPT_LVL_R.create("T1"));
			chkMaster = MCController.create(MAM_DPT_LVL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_DPT_LVL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_DPT_LVL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_LVL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_DPT_LVL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * DptLvl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR createDptLvl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.create();
		}

		/**
		 * DptLvl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> createDptLvl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_DPT_LVL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> src_DptLvl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_DptLvl_Upd01_Dtl);
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
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("dpt_lvl_nm", "dpt_lvl_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_DPT_LVL_R r_dest, mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_DPT_LVL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR r_src : src){
				MAM_DPT_LVL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_DPT_LVL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> src_DptLvl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_DptLvl_Upd01_Dtl);
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
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("dpt_lvl_nm", "dpt_lvl_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_DPT_LVL_R r_dest, mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_DPT_LVL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.DptLvl_UpdChk01_DtlR r_src : src){
				MAM_DPT_LVL_R r_dest = dest.createRow();
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
	 * DptLvlLcl_UpdChk01オペレーション.<p>
	 *
	 * 部門階層マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class DptLvlLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptLvlLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_LVL_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_LVL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_LVL_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_LVL_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_DPT_LVL_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptLvlLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_DPT_LVL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_DPT_LVL_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_DPT_LVL_R&gt; （{@link #chk01_up0}）<br>
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
		 * DptLvlLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR createDptLvlLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.create();
		}

		/**
		 * DptLvlLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> createDptLvlLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_DPT_LVL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> src_DptLvlLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_DptLvlLcl_UpdChk01_Dtl);
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
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_DPT_LVL_R r_dest, mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_DPT_LVL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR r_src : src){
				MAM_DPT_LVL_R r_dest = dest.createRow();
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
	 * DptLvlLcl_Upd01オペレーション.<p>
	 *
	 * 部門階層マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class DptLvlLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptLvlLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_LVL_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_LVL_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_LVL_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_LVL_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_LVL_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_LVL_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_LVL_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_LVL_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_LVL_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_DPT_LVL_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptLvlLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_DPT_LVL_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_DPT_LVL_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_DPT_LVL_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_DPT_LVL_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_LVL_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_DPT_LVL_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * DptLvlLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR createDptLvlLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.create();
		}

		/**
		 * DptLvlLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> createDptLvlLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_DPT_LVL_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> src_DptLvlLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_DptLvlLcl_Upd01_Dtl);
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
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("dpt_lvl_nm", "dpt_lvl_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_DPT_LVL_LCL_R r_dest, mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_DPT_LVL_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR r_src : src){
				MAM_DPT_LVL_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_DPT_LVL_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> src_DptLvlLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_DptLvlLcl_Upd01_Dtl);
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
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("dpt_lvl_nm", "dpt_lvl_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_DPT_LVL_LCL_R r_dest, mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_DPT_LVL_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.DptLvlLcl_UpdChk01_DtlR r_src : src){
				MAM_DPT_LVL_LCL_R r_dest = dest.createRow();
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
	 * DptLvl_DelChk01オペレーション.<p>
	 *
	 * 部門階層マスタの削除前のチェックを行います。<br>
	 */
	abstract public class DptLvl_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptLvl_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected DptLvl_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.class);

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
		 * DptLvl_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR createDptLvl_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.create();
		}

		/**
		 * DptLvl_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> createDptLvl_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * DptLvl_Del01オペレーション.<p>
	 *
	 * 部門階層マスタの削除を行います。<br>
	 */
	abstract public class DptLvl_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DptLvl_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_LVL_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_DPT_LVL_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_LVL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_LVL_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_LVL_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_DPT_LVL_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_DPT_LVL_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_DPT_LVL_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_DPT_LVL_R> updMaster1_up0;
		public final MCList<MAM_DPT_LVL_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected DptLvl_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_DPT_LVL_R.create("T1"));
			updMaster2 = MCController.create(MAM_DPT_LVL_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_DPT_LVL_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_DPT_LVL_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_DPT_LVL_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_DPT_LVL_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * DptLvl_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR createDptLvl_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.create();
		}

		/**
		 * DptLvl_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> createDptLvl_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_DPT_LVL_R> dest0_0, MCList<MAM_DPT_LVL_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> src_DptLvl_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_DptLvl_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_DptLvl_Del01_Dtl);
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
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_DPT_LVL_R r_dest, mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_DPT_LVL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR r_src : src){
				MAM_DPT_LVL_R r_dest = dest.createRow();
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
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_DPT_LVL_LCL_R r_dest, mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_DPT_LVL_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.DptLvl_DelChk01_DtlR r_src : src){
				MAM_DPT_LVL_LCL_R r_dest = dest.createRow();
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
	 * AprvRole_UpdChk01オペレーション.<p>
	 *
	 * 承認役割マスタの登録前のチェックを行います。<br>
	 */
	abstract public class AprvRole_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AprvRole_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected AprvRole_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.class);

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
		 * AprvRole_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR createAprvRole_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.create();
		}

		/**
		 * AprvRole_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> createAprvRole_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * AprvRole_Upd01オペレーション.<p>
	 *
	 * 承認役割マスタの登録を行います。<br>
	 */
	abstract public class AprvRole_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AprvRole_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_APRV_ROLE_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_APRV_ROLE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_APRV_ROLE_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_APRV_ROLE_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_APRV_ROLE_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_APRV_ROLE_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_APRV_ROLE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_APRV_ROLE_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_APRV_ROLE_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_APRV_ROLE_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AprvRole_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_APRV_ROLE_R.create("T1"));
			chkMaster = MCController.create(MAM_APRV_ROLE_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_APRV_ROLE_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_APRV_ROLE_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_APRV_ROLE_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_APRV_ROLE_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * AprvRole_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR createAprvRole_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.create();
		}

		/**
		 * AprvRole_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> createAprvRole_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_APRV_ROLE_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> src_AprvRole_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AprvRole_Upd01_Dtl);
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
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("aprv_role_nm", "aprv_role_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_APRV_ROLE_R r_dest, mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_APRV_ROLE_R> dest, MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR r_src : src){
				MAM_APRV_ROLE_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_APRV_ROLE_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> src_AprvRole_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AprvRole_Upd01_Dtl);
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
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("aprv_role_nm", "aprv_role_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_APRV_ROLE_R r_dest, mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_APRV_ROLE_R> dest, MCList<mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.AprvRole_UpdChk01_DtlR r_src : src){
				MAM_APRV_ROLE_R r_dest = dest.createRow();
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
	 * AprvRoleLcl_UpdChk01オペレーション.<p>
	 *
	 * 承認役割マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class AprvRoleLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AprvRoleLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_APRV_ROLE_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_APRV_ROLE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_APRV_ROLE_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_APRV_ROLE_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_APRV_ROLE_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AprvRoleLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_APRV_ROLE_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_APRV_ROLE_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_APRV_ROLE_R&gt; （{@link #chk01_up0}）<br>
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
		 * AprvRoleLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR createAprvRoleLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AprvRoleLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> createAprvRoleLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_APRV_ROLE_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> src_AprvRoleLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_AprvRoleLcl_UpdChk01_Dtl);
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
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_APRV_ROLE_R r_dest, mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_APRV_ROLE_R> dest, MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR r_src : src){
				MAM_APRV_ROLE_R r_dest = dest.createRow();
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
	 * AprvRoleLcl_Upd01オペレーション.<p>
	 *
	 * 承認役割マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class AprvRoleLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AprvRoleLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_APRV_ROLE_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_APRV_ROLE_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_APRV_ROLE_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_APRV_ROLE_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_APRV_ROLE_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_APRV_ROLE_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_APRV_ROLE_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_APRV_ROLE_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_APRV_ROLE_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_APRV_ROLE_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AprvRoleLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_APRV_ROLE_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_APRV_ROLE_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_APRV_ROLE_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_APRV_ROLE_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_APRV_ROLE_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_APRV_ROLE_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * AprvRoleLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR createAprvRoleLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AprvRoleLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> createAprvRoleLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_APRV_ROLE_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> src_AprvRoleLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AprvRoleLcl_Upd01_Dtl);
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
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("aprv_role_nm", "aprv_role_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_APRV_ROLE_LCL_R r_dest, mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_APRV_ROLE_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR r_src : src){
				MAM_APRV_ROLE_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_APRV_ROLE_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> src_AprvRoleLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AprvRoleLcl_Upd01_Dtl);
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
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("aprv_role_nm", "aprv_role_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_APRV_ROLE_LCL_R r_dest, mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_APRV_ROLE_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.AprvRoleLcl_UpdChk01_DtlR r_src : src){
				MAM_APRV_ROLE_LCL_R r_dest = dest.createRow();
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
	 * AprvRole_DelChk01オペレーション.<p>
	 *
	 * 承認役割マスタの削除前のチェックを行います。<br>
	 */
	abstract public class AprvRole_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AprvRole_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected AprvRole_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.class);

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
		 * AprvRole_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR createAprvRole_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.create();
		}

		/**
		 * AprvRole_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> createAprvRole_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * AprvRole_Del01オペレーション.<p>
	 *
	 * 承認役割マスタの削除を行います。<br>
	 */
	abstract public class AprvRole_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AprvRole_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_APRV_ROLE_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_APRV_ROLE_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_APRV_ROLE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_APRV_ROLE_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_APRV_ROLE_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_APRV_ROLE_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_APRV_ROLE_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_APRV_ROLE_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_APRV_ROLE_R> updMaster1_up0;
		public final MCList<MAM_APRV_ROLE_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AprvRole_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_APRV_ROLE_R.create("T1"));
			updMaster2 = MCController.create(MAM_APRV_ROLE_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_APRV_ROLE_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_APRV_ROLE_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_APRV_ROLE_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_APRV_ROLE_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * AprvRole_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR createAprvRole_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.create();
		}

		/**
		 * AprvRole_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> createAprvRole_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_APRV_ROLE_R> dest0_0, MCList<MAM_APRV_ROLE_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> src_AprvRole_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_AprvRole_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_AprvRole_Del01_Dtl);
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
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_APRV_ROLE_R r_dest, mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_APRV_ROLE_R> dest, MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR r_src : src){
				MAM_APRV_ROLE_R r_dest = dest.createRow();
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
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_APRV_ROLE_LCL_R r_dest, mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_APRV_ROLE_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.AprvRole_DelChk01_DtlR r_src : src){
				MAM_APRV_ROLE_LCL_R r_dest = dest.createRow();
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
	 * Cntry_UpdChk01オペレーション.<p>
	 *
	 * 国マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Cntry_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cntry_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Cntry_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.class);

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
		 * Cntry_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR createCntry_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.create();
		}

		/**
		 * Cntry_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> createCntry_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Cntry_Upd01オペレーション.<p>
	 *
	 * 国マスタの登録を行います。<br>
	 */
	abstract public class Cntry_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cntry_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CNTRY_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CNTRY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CNTRY_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CNTRY_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CNTRY_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CNTRY_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CNTRY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CNTRY_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CNTRY_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CNTRY_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Cntry_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CNTRY_R.create("T1"));
			chkMaster = MCController.create(MAM_CNTRY_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CNTRY_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CNTRY_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CNTRY_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CNTRY_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Cntry_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR createCntry_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.create();
		}

		/**
		 * Cntry_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> createCntry_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_CNTRY_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> src_Cntry_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Cntry_Upd01_Dtl);
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
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("cntry_nm", "cntry_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_CNTRY_R r_dest, mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CNTRY_R> dest, MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR r_src : src){
				MAM_CNTRY_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CNTRY_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> src_Cntry_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Cntry_Upd01_Dtl);
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
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("cntry_nm", "cntry_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_CNTRY_R r_dest, mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CNTRY_R> dest, MCList<mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.Cntry_UpdChk01_DtlR r_src : src){
				MAM_CNTRY_R r_dest = dest.createRow();
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
	 * CntryLcl_UpdChk01オペレーション.<p>
	 *
	 * 国マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class CntryLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CntryLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CNTRY_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CNTRY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CNTRY_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CNTRY_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_CNTRY_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CntryLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_CNTRY_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_CNTRY_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_CNTRY_R&gt; （{@link #chk01_up0}）<br>
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
		 * CntryLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR createCntryLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CntryLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> createCntryLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_CNTRY_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> src_CntryLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_CntryLcl_UpdChk01_Dtl);
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
				addColumnPathMap("cntry_cd", "cntry_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_CNTRY_R r_dest, mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_CNTRY_R> dest, MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR r_src : src){
				MAM_CNTRY_R r_dest = dest.createRow();
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
	 * CntryLcl_Upd01オペレーション.<p>
	 *
	 * 国マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class CntryLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CntryLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CNTRY_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CNTRY_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CNTRY_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CNTRY_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CNTRY_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CNTRY_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CNTRY_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CNTRY_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CNTRY_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CNTRY_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CntryLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CNTRY_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_CNTRY_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CNTRY_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CNTRY_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CNTRY_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CNTRY_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * CntryLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR createCntryLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CntryLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> createCntryLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_CNTRY_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> src_CntryLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CntryLcl_Upd01_Dtl);
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
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cntry_nm", "cntry_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_CNTRY_LCL_R r_dest, mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CNTRY_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR r_src : src){
				MAM_CNTRY_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CNTRY_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> src_CntryLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CntryLcl_Upd01_Dtl);
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
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cntry_nm", "cntry_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_CNTRY_LCL_R r_dest, mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CNTRY_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.CntryLcl_UpdChk01_DtlR r_src : src){
				MAM_CNTRY_LCL_R r_dest = dest.createRow();
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
	 * Cntry_DelChk01オペレーション.<p>
	 *
	 * 国マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Cntry_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cntry_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Cntry_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.class);

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
		 * Cntry_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR createCntry_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.create();
		}

		/**
		 * Cntry_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> createCntry_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Cntry_Del01オペレーション.<p>
	 *
	 * 国マスタの削除を行います。<br>
	 */
	abstract public class Cntry_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cntry_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CNTRY_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_CNTRY_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CNTRY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CNTRY_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CNTRY_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CNTRY_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CNTRY_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CNTRY_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_CNTRY_R> updMaster1_up0;
		public final MCList<MAM_CNTRY_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Cntry_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_CNTRY_R.create("T1"));
			updMaster2 = MCController.create(MAM_CNTRY_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_CNTRY_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_CNTRY_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CNTRY_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_CNTRY_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Cntry_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR createCntry_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.create();
		}

		/**
		 * Cntry_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> createCntry_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_CNTRY_R> dest0_0, MCList<MAM_CNTRY_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> src_Cntry_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Cntry_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Cntry_Del01_Dtl);
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
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_CNTRY_R r_dest, mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_CNTRY_R> dest, MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR r_src : src){
				MAM_CNTRY_R r_dest = dest.createRow();
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
				addColumnPathMap("cntry_cd", "cntry_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_CNTRY_LCL_R r_dest, mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_CNTRY_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.Cntry_DelChk01_DtlR r_src : src){
				MAM_CNTRY_LCL_R r_dest = dest.createRow();
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
	 * Area_UpdChk01オペレーション.<p>
	 *
	 * 地域マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Area_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Area_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Area_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.class);

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
		 * Area_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR createArea_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.create();
		}

		/**
		 * Area_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> createArea_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Area_Upd01オペレーション.<p>
	 *
	 * 地域マスタの登録を行います。<br>
	 */
	abstract public class Area_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Area_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AREA_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AREA_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AREA_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AREA_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_AREA_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AREA_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AREA_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AREA_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AREA_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_AREA_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Area_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_AREA_R.create("T1"));
			chkMaster = MCController.create(MAM_AREA_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_AREA_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_AREA_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_AREA_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_AREA_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Area_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR createArea_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.create();
		}

		/**
		 * Area_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> createArea_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_AREA_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> src_Area_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Area_Upd01_Dtl);
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
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("area_nm", "area_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_AREA_R r_dest, mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_AREA_R> dest, MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR r_src : src){
				MAM_AREA_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_AREA_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> src_Area_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Area_Upd01_Dtl);
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
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("area_nm", "area_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_AREA_R r_dest, mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_AREA_R> dest, MCList<mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.Area_UpdChk01_DtlR r_src : src){
				MAM_AREA_R r_dest = dest.createRow();
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
	 * AreaLcl_UpdChk01オペレーション.<p>
	 *
	 * 地域マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class AreaLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AreaLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AREA_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AREA_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AREA_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AREA_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_AREA_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AreaLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_AREA_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_AREA_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_AREA_R&gt; （{@link #chk01_up0}）<br>
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
		 * AreaLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR createAreaLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AreaLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> createAreaLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_AREA_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> src_AreaLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_AreaLcl_UpdChk01_Dtl);
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
				addColumnPathMap("area_cd", "area_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_AREA_R r_dest, mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_AREA_R> dest, MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR r_src : src){
				MAM_AREA_R r_dest = dest.createRow();
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
	 * AreaLcl_Upd01オペレーション.<p>
	 *
	 * 地域マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class AreaLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AreaLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AREA_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AREA_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AREA_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AREA_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_AREA_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AREA_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AREA_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AREA_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AREA_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_AREA_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AreaLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_AREA_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_AREA_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_AREA_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_AREA_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_AREA_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_AREA_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * AreaLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR createAreaLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AreaLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> createAreaLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_AREA_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> src_AreaLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AreaLcl_Upd01_Dtl);
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
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("area_nm", "area_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_AREA_LCL_R r_dest, mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_AREA_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR r_src : src){
				MAM_AREA_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_AREA_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> src_AreaLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AreaLcl_Upd01_Dtl);
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
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("area_nm", "area_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_AREA_LCL_R r_dest, mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_AREA_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.AreaLcl_UpdChk01_DtlR r_src : src){
				MAM_AREA_LCL_R r_dest = dest.createRow();
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
	 * Area_DelChk01オペレーション.<p>
	 *
	 * 地域マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Area_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Area_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Area_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.class);

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
		 * Area_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR createArea_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.create();
		}

		/**
		 * Area_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> createArea_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Area_Del01オペレーション.<p>
	 *
	 * 地域マスタの削除を行います。<br>
	 */
	abstract public class Area_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Area_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AREA_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_AREA_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AREA_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AREA_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AREA_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AREA_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AREA_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AREA_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_AREA_R> updMaster1_up0;
		public final MCList<MAM_AREA_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Area_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_AREA_R.create("T1"));
			updMaster2 = MCController.create(MAM_AREA_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_AREA_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_AREA_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_AREA_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_AREA_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Area_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR createArea_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.create();
		}

		/**
		 * Area_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> createArea_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_AREA_R> dest0_0, MCList<MAM_AREA_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> src_Area_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Area_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Area_Del01_Dtl);
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
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_AREA_R r_dest, mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_AREA_R> dest, MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR r_src : src){
				MAM_AREA_R r_dest = dest.createRow();
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
				addColumnPathMap("area_cd", "area_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_AREA_LCL_R r_dest, mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_AREA_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.Area_DelChk01_DtlR r_src : src){
				MAM_AREA_LCL_R r_dest = dest.createRow();
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
	 * Cur_UpdChk01オペレーション.<p>
	 *
	 * 通貨マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Cur_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cur_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Cur_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.class);

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
		 * Cur_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR createCur_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.create();
		}

		/**
		 * Cur_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> createCur_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Cur_Upd01オペレーション.<p>
	 *
	 * 通貨マスタの登録を行います。<br>
	 */
	abstract public class Cur_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cur_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CUR_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CUR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CUR_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CUR_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CUR_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CUR_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CUR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CUR_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CUR_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CUR_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Cur_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CUR_R.create("T1"));
			chkMaster = MCController.create(MAM_CUR_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CUR_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CUR_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CUR_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CUR_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Cur_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR createCur_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.create();
		}

		/**
		 * Cur_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> createCur_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_CUR_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> src_Cur_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Cur_Upd01_Dtl);
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
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("amt_dec_place", "amt_dec_place");
				addColumnPathMap("upri_dec_place", "upri_dec_place");
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
		protected void up_UPDATE_updMaster_0(MAM_CUR_R r_dest, mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CUR_R> dest, MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR r_src : src){
				MAM_CUR_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CUR_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> src_Cur_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Cur_Upd01_Dtl);
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
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("amt_dec_place", "amt_dec_place");
				addColumnPathMap("upri_dec_place", "upri_dec_place");
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
		protected void up_MAIN_chkMaster_0(MAM_CUR_R r_dest, mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CUR_R> dest, MCList<mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.Cur_UpdChk01_DtlR r_src : src){
				MAM_CUR_R r_dest = dest.createRow();
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
	 * CurLcl_UpdChk01オペレーション.<p>
	 *
	 * 通貨マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class CurLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CurLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CUR_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CUR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CUR_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CUR_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_CUR_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CurLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_CUR_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_CUR_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_CUR_R&gt; （{@link #chk01_up0}）<br>
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
		 * CurLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR createCurLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CurLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> createCurLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_CUR_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> src_CurLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_CurLcl_UpdChk01_Dtl);
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
				addColumnPathMap("cur_cd", "cur_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_CUR_R r_dest, mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_CUR_R> dest, MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR r_src : src){
				MAM_CUR_R r_dest = dest.createRow();
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
	 * CurLcl_Upd01オペレーション.<p>
	 *
	 * 通貨マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class CurLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CurLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CUR_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CUR_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CUR_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CUR_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CUR_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CUR_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CUR_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CUR_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CUR_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CUR_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CurLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CUR_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_CUR_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CUR_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CUR_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CUR_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CUR_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * CurLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR createCurLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CurLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> createCurLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_CUR_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> src_CurLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CurLcl_Upd01_Dtl);
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
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cur_nm", "cur_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_CUR_LCL_R r_dest, mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CUR_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR r_src : src){
				MAM_CUR_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CUR_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> src_CurLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CurLcl_Upd01_Dtl);
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
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cur_nm", "cur_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_CUR_LCL_R r_dest, mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CUR_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.CurLcl_UpdChk01_DtlR r_src : src){
				MAM_CUR_LCL_R r_dest = dest.createRow();
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
	 * Cur_DelChk01オペレーション.<p>
	 *
	 * 通貨マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Cur_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cur_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Cur_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.class);

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
		 * Cur_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR createCur_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.create();
		}

		/**
		 * Cur_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> createCur_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Cur_Del01オペレーション.<p>
	 *
	 * 通貨マスタの削除を行います。<br>
	 */
	abstract public class Cur_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Cur_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CUR_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_CUR_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CUR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CUR_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CUR_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CUR_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CUR_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CUR_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_CUR_R> updMaster1_up0;
		public final MCList<MAM_CUR_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Cur_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_CUR_R.create("T1"));
			updMaster2 = MCController.create(MAM_CUR_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_CUR_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_CUR_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CUR_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_CUR_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Cur_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR createCur_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.create();
		}

		/**
		 * Cur_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> createCur_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_CUR_R> dest0_0, MCList<MAM_CUR_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> src_Cur_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Cur_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Cur_Del01_Dtl);
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
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_CUR_R r_dest, mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_CUR_R> dest, MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR r_src : src){
				MAM_CUR_R r_dest = dest.createRow();
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
				addColumnPathMap("cur_cd", "cur_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_CUR_LCL_R r_dest, mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_CUR_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.Cur_DelChk01_DtlR r_src : src){
				MAM_CUR_LCL_R r_dest = dest.createRow();
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
	 * Unit_UpdChk01オペレーション.<p>
	 *
	 * 単位マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Unit_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Unit_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Unit_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.class);

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
		 * Unit_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR createUnit_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.create();
		}

		/**
		 * Unit_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> createUnit_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Unit_Upd01オペレーション.<p>
	 *
	 * 単位マスタの登録を行います。<br>
	 */
	abstract public class Unit_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Unit_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_UNIT_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_UNIT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_UNIT_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_UNIT_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_UNIT_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_UNIT_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_UNIT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_UNIT_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_UNIT_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_UNIT_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Unit_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_UNIT_R.create("T1"));
			chkMaster = MCController.create(MAM_UNIT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_UNIT_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_UNIT_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_UNIT_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_UNIT_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Unit_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR createUnit_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.create();
		}

		/**
		 * Unit_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> createUnit_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_UNIT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> src_Unit_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Unit_Upd01_Dtl);
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
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
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
		protected void up_UPDATE_updMaster_0(MAM_UNIT_R r_dest, mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_UNIT_R> dest, MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR r_src : src){
				MAM_UNIT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_UNIT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> src_Unit_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Unit_Upd01_Dtl);
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
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("unit_nm", "unit_nm");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
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
		protected void up_MAIN_chkMaster_0(MAM_UNIT_R r_dest, mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_UNIT_R> dest, MCList<mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.Unit_UpdChk01_DtlR r_src : src){
				MAM_UNIT_R r_dest = dest.createRow();
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
	 * UnitLcl_UpdChk01オペレーション.<p>
	 *
	 * 単位マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class UnitLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "UnitLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_UNIT_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_UNIT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_UNIT_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_UNIT_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_UNIT_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected UnitLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_UNIT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_UNIT_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_UNIT_R&gt; （{@link #chk01_up0}）<br>
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
		 * UnitLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR createUnitLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.create();
		}

		/**
		 * UnitLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> createUnitLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_UNIT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> src_UnitLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_UnitLcl_UpdChk01_Dtl);
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
				addColumnPathMap("unit_cd", "unit_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_UNIT_R r_dest, mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_UNIT_R> dest, MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR r_src : src){
				MAM_UNIT_R r_dest = dest.createRow();
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
	 * UnitLcl_Upd01オペレーション.<p>
	 *
	 * 単位マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class UnitLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "UnitLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_UNIT_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_UNIT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_UNIT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_UNIT_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_UNIT_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_UNIT_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_UNIT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_UNIT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_UNIT_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_UNIT_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected UnitLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_UNIT_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_UNIT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_UNIT_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_UNIT_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_UNIT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_UNIT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * UnitLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR createUnitLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.create();
		}

		/**
		 * UnitLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> createUnitLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_UNIT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> src_UnitLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_UnitLcl_Upd01_Dtl);
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
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("unit_nm", "unit_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_UNIT_LCL_R r_dest, mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_UNIT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR r_src : src){
				MAM_UNIT_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_UNIT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> src_UnitLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_UnitLcl_Upd01_Dtl);
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
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("unit_nm", "unit_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_UNIT_LCL_R r_dest, mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_UNIT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.UnitLcl_UpdChk01_DtlR r_src : src){
				MAM_UNIT_LCL_R r_dest = dest.createRow();
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
	 * Unit_DelChk01オペレーション.<p>
	 *
	 * 単位マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Unit_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Unit_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Unit_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.class);

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
		 * Unit_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR createUnit_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.create();
		}

		/**
		 * Unit_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> createUnit_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Unit_Del01オペレーション.<p>
	 *
	 * 単位マスタの削除を行います。<br>
	 */
	abstract public class Unit_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Unit_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_UNIT_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_UNIT_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_UNIT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_UNIT_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_UNIT_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_UNIT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_UNIT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_UNIT_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_UNIT_R> updMaster1_up0;
		public final MCList<MAM_UNIT_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Unit_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_UNIT_R.create("T1"));
			updMaster2 = MCController.create(MAM_UNIT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_UNIT_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_UNIT_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_UNIT_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_UNIT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Unit_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR createUnit_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.create();
		}

		/**
		 * Unit_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> createUnit_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_UNIT_R> dest0_0, MCList<MAM_UNIT_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> src_Unit_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Unit_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Unit_Del01_Dtl);
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
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_UNIT_R r_dest, mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_UNIT_R> dest, MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR r_src : src){
				MAM_UNIT_R r_dest = dest.createRow();
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
				addColumnPathMap("unit_cd", "unit_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_UNIT_LCL_R r_dest, mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_UNIT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.Unit_DelChk01_DtlR r_src : src){
				MAM_UNIT_LCL_R r_dest = dest.createRow();
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
	 * Bank_UpdChk01オペレーション.<p>
	 *
	 * 銀行マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Bank_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bank_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Bank_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.class);

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
		 * Bank_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR createBank_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.create();
		}

		/**
		 * Bank_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> createBank_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_nm</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Bank_Upd01オペレーション.<p>
	 *
	 * 銀行マスタの登録を行います。<br>
	 */
	abstract public class Bank_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bank_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BANK_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BANK_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Bank_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BANK_R.create("T1"));
			chkMaster = MCController.create(MAM_BANK_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BANK_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BANK_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BANK_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BANK_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Bank_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR createBank_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.create();
		}

		/**
		 * Bank_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> createBank_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_nm</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_BANK_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> src_Bank_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Bank_Upd01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("bank_nm", "bank_nm");
				addColumnPathMap("cal_cd", "cal_cd");
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
		protected void up_UPDATE_updMaster_0(MAM_BANK_R r_dest, mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BANK_R> dest, MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR r_src : src){
				MAM_BANK_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BANK_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> src_Bank_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Bank_Upd01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("bank_nm", "bank_nm");
				addColumnPathMap("cal_cd", "cal_cd");
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
		protected void up_MAIN_chkMaster_0(MAM_BANK_R r_dest, mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BANK_R> dest, MCList<mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.Bank_UpdChk01_DtlR r_src : src){
				MAM_BANK_R r_dest = dest.createRow();
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
	 * BankLcl_UpdChk01オペレーション.<p>
	 *
	 * 銀行マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class BankLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BankLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_BANK_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BankLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_BANK_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_BANK_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_BANK_R&gt; （{@link #chk01_up0}）<br>
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
		 * BankLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR createBankLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.create();
		}

		/**
		 * BankLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> createBankLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_BANK_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> src_BankLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_BankLcl_UpdChk01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_BANK_R r_dest, mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_BANK_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR r_src : src){
				MAM_BANK_R r_dest = dest.createRow();
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
	 * BankLcl_Upd01オペレーション.<p>
	 *
	 * 銀行マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class BankLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BankLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BANK_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BANK_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BankLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BANK_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_BANK_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BANK_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BANK_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BANK_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BANK_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * BankLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR createBankLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.create();
		}

		/**
		 * BankLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> createBankLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_BANK_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> src_BankLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BankLcl_Upd01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("bank_nm", "bank_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_BANK_LCL_R r_dest, mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BANK_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR r_src : src){
				MAM_BANK_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BANK_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> src_BankLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BankLcl_Upd01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("bank_nm", "bank_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_BANK_LCL_R r_dest, mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BANK_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.BankLcl_UpdChk01_DtlR r_src : src){
				MAM_BANK_LCL_R r_dest = dest.createRow();
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
	 * Bank_DelChk01オペレーション.<p>
	 *
	 * 銀行マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Bank_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bank_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Bank_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.class);

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
		 * Bank_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR createBank_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.create();
		}

		/**
		 * Bank_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> createBank_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Bank_Del01オペレーション.<p>
	 *
	 * 銀行マスタの削除を行います。<br>
	 */
	abstract public class Bank_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bank_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_BANK_R> updMaster1_up0;
		public final MCList<MAM_BANK_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Bank_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_BANK_R.create("T1"));
			updMaster2 = MCController.create(MAM_BANK_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_BANK_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_BANK_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BANK_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_BANK_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Bank_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR createBank_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.create();
		}

		/**
		 * Bank_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> createBank_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_BANK_R> dest0_0, MCList<MAM_BANK_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> src_Bank_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Bank_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Bank_Del01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_BANK_R r_dest, mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_BANK_R> dest, MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR r_src : src){
				MAM_BANK_R r_dest = dest.createRow();
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
				addColumnPathMap("bank_cd", "bank_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_BANK_LCL_R r_dest, mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_BANK_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.Bank_DelChk01_DtlR r_src : src){
				MAM_BANK_LCL_R r_dest = dest.createRow();
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
	 * BankBranch_UpdChk01オペレーション.<p>
	 *
	 * 銀行支店マスタの登録前のチェックを行います。<br>
	 */
	abstract public class BankBranch_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BankBranch_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BankBranch_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.class);

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
		 * BankBranch_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR createBankBranch_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.create();
		}

		/**
		 * BankBranch_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> createBankBranch_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_nm</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * BankBranch_Upd01オペレーション.<p>
	 *
	 * 銀行支店マスタの登録を行います。<br>
	 */
	abstract public class BankBranch_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BankBranch_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_BRANCH_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_BRANCH_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_BRANCH_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_BRANCH_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BANK_BRANCH_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_BRANCH_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_BRANCH_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_BRANCH_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_BRANCH_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BANK_BRANCH_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BankBranch_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BANK_BRANCH_R.create("T1"));
			chkMaster = MCController.create(MAM_BANK_BRANCH_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BANK_BRANCH_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BANK_BRANCH_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BANK_BRANCH_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BANK_BRANCH_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * BankBranch_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR createBankBranch_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.create();
		}

		/**
		 * BankBranch_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> createBankBranch_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_nm</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_BANK_BRANCH_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> src_BankBranch_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BankBranch_Upd01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("branch_cd", "branch_cd");
				addColumnPathMap("branch_nm", "branch_nm");
				addColumnPathMap("cal_cd", "cal_cd");
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
		protected void up_UPDATE_updMaster_0(MAM_BANK_BRANCH_R r_dest, mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BANK_BRANCH_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR r_src : src){
				MAM_BANK_BRANCH_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BANK_BRANCH_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> src_BankBranch_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BankBranch_Upd01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("branch_cd", "branch_cd");
				addColumnPathMap("branch_nm", "branch_nm");
				addColumnPathMap("cal_cd", "cal_cd");
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
		protected void up_MAIN_chkMaster_0(MAM_BANK_BRANCH_R r_dest, mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BANK_BRANCH_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.BankBranch_UpdChk01_DtlR r_src : src){
				MAM_BANK_BRANCH_R r_dest = dest.createRow();
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
	 * BankBranchLcl_UpdChk01オペレーション.<p>
	 *
	 * 銀行支店マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class BankBranchLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BankBranchLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_BRANCH_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_BRANCH_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_BRANCH_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_BRANCH_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_BANK_BRANCH_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BankBranchLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_BANK_BRANCH_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_BANK_BRANCH_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_BANK_BRANCH_R&gt; （{@link #chk01_up0}）<br>
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
		 * BankBranchLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR createBankBranchLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.create();
		}

		/**
		 * BankBranchLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> createBankBranchLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_BANK_BRANCH_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> src_BankBranchLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_BankBranchLcl_UpdChk01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("branch_cd", "branch_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_BANK_BRANCH_R r_dest, mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_BANK_BRANCH_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR r_src : src){
				MAM_BANK_BRANCH_R r_dest = dest.createRow();
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
	 * BankBranchLcl_Upd01オペレーション.<p>
	 *
	 * 銀行支店マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class BankBranchLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BankBranchLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_BRANCH_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_BRANCH_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_BRANCH_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_BRANCH_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BANK_BRANCH_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_BRANCH_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_BRANCH_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_BRANCH_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_BRANCH_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BANK_BRANCH_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BankBranchLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BANK_BRANCH_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_BANK_BRANCH_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BANK_BRANCH_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BANK_BRANCH_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BANK_BRANCH_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BANK_BRANCH_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * BankBranchLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR createBankBranchLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.create();
		}

		/**
		 * BankBranchLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> createBankBranchLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_BANK_BRANCH_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> src_BankBranchLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BankBranchLcl_Upd01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("branch_cd", "branch_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("branch_nm", "branch_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_BANK_BRANCH_LCL_R r_dest, mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BANK_BRANCH_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR r_src : src){
				MAM_BANK_BRANCH_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BANK_BRANCH_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> src_BankBranchLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BankBranchLcl_Upd01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("branch_cd", "branch_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("branch_nm", "branch_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_BANK_BRANCH_LCL_R r_dest, mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BANK_BRANCH_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0031.BankBranchLcl_UpdChk01_DtlR r_src : src){
				MAM_BANK_BRANCH_LCL_R r_dest = dest.createRow();
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
	 * BankBranch_DelChk01オペレーション.<p>
	 *
	 * 銀行支店マスタの削除前のチェックを行います。<br>
	 */
	abstract public class BankBranch_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BankBranch_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BankBranch_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.class);

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
		 * BankBranch_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR createBankBranch_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.create();
		}

		/**
		 * BankBranch_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> createBankBranch_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * BankBranch_Del01オペレーション.<p>
	 *
	 * 銀行支店マスタの削除を行います。<br>
	 */
	abstract public class BankBranch_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BankBranch_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_BRANCH_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BANK_BRANCH_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_BRANCH_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_BRANCH_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_BRANCH_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BANK_BRANCH_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BANK_BRANCH_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BANK_BRANCH_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_BANK_BRANCH_R> updMaster1_up0;
		public final MCList<MAM_BANK_BRANCH_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BankBranch_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_BANK_BRANCH_R.create("T1"));
			updMaster2 = MCController.create(MAM_BANK_BRANCH_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_BANK_BRANCH_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_BANK_BRANCH_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BANK_BRANCH_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_BANK_BRANCH_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * BankBranch_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR createBankBranch_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.create();
		}

		/**
		 * BankBranch_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> createBankBranch_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_BANK_BRANCH_R> dest0_0, MCList<MAM_BANK_BRANCH_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> src_BankBranch_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_BankBranch_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_BankBranch_Del01_Dtl);
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("branch_cd", "branch_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_BANK_BRANCH_R r_dest, mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_BANK_BRANCH_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR r_src : src){
				MAM_BANK_BRANCH_R r_dest = dest.createRow();
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
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("branch_cd", "branch_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_BANK_BRANCH_LCL_R r_dest, mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_BANK_BRANCH_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0031.BankBranch_DelChk01_DtlR r_src : src){
				MAM_BANK_BRANCH_LCL_R r_dest = dest.createRow();
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