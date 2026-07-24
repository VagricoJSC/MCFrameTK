package mcframe.serverMABC.MABCL1500;

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
 * "MABCL_ExtSysReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_ExtSysReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL1500";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_ExtSysReg.ExtSys_UpdChk01 aExtSys_UpdChk01;

	protected void initExtSys_UpdChk01() {
		this.info = PDef.MA_MABCL1500_ExtSys_UpdChk01_INFO;
		this.aExtSys_UpdChk01 = ((MABCL_ExtSysReg)this).new ExtSys_UpdChk01();
	}

	public static MABCL_ExtSysReg.ExtSys_UpdChk01 crtExtSys_UpdChk01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initExtSys_UpdChk01();
		return lgc.aExtSys_UpdChk01;
	}

	protected void paramExtSys_UpdChk01(MCParam p) {
		if (this.aExtSys_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExtSys_UpdChk01.up0());
	}

	protected void doExtSys_UpdChk01() {
		aExtSys_UpdChk01.call();
	};

	/**
	 * ExtSys_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR createExtSys_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.create();
	}

	/**
	 * ExtSys_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> createExtSys_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.ExtSys_Upd01 aExtSys_Upd01;

	protected void initExtSys_Upd01() {
		this.info = PDef.MA_MABCL1500_ExtSys_Upd01_INFO;
		this.aExtSys_Upd01 = ((MABCL_ExtSysReg)this).new ExtSys_Upd01();
	}

	public static MABCL_ExtSysReg.ExtSys_Upd01 crtExtSys_Upd01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initExtSys_Upd01();
		return lgc.aExtSys_Upd01;
	}

	protected void paramExtSys_Upd01(MCParam p) {
		if (this.aExtSys_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExtSys_Upd01.up0());
	}

	protected void doExtSys_Upd01() {
		aExtSys_Upd01.call();
	};

	/**
	 * ExtSys_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR createExtSys_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.create();
	}

	/**
	 * ExtSys_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> createExtSys_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.IfProtocol_UpdChk01 aIfProtocol_UpdChk01;

	protected void initIfProtocol_UpdChk01() {
		this.info = PDef.MA_MABCL1500_IfProtocol_UpdChk01_INFO;
		this.aIfProtocol_UpdChk01 = ((MABCL_ExtSysReg)this).new IfProtocol_UpdChk01();
	}

	public static MABCL_ExtSysReg.IfProtocol_UpdChk01 crtIfProtocol_UpdChk01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initIfProtocol_UpdChk01();
		return lgc.aIfProtocol_UpdChk01;
	}

	protected void paramIfProtocol_UpdChk01(MCParam p) {
		if (this.aIfProtocol_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIfProtocol_UpdChk01.up0());
	}

	protected void doIfProtocol_UpdChk01() {
		aIfProtocol_UpdChk01.call();
	};

	/**
	 * IfProtocol_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR createIfProtocol_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.create();
	}

	/**
	 * IfProtocol_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> createIfProtocol_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.IfProtocol_Upd01 aIfProtocol_Upd01;

	protected void initIfProtocol_Upd01() {
		this.info = PDef.MA_MABCL1500_IfProtocol_Upd01_INFO;
		this.aIfProtocol_Upd01 = ((MABCL_ExtSysReg)this).new IfProtocol_Upd01();
	}

	public static MABCL_ExtSysReg.IfProtocol_Upd01 crtIfProtocol_Upd01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initIfProtocol_Upd01();
		return lgc.aIfProtocol_Upd01;
	}

	protected void paramIfProtocol_Upd01(MCParam p) {
		if (this.aIfProtocol_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIfProtocol_Upd01.up0());
	}

	protected void doIfProtocol_Upd01() {
		aIfProtocol_Upd01.call();
	};

	/**
	 * IfProtocol_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR createIfProtocol_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.create();
	}

	/**
	 * IfProtocol_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> createIfProtocol_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.IfAdapter_UpdChk01 aIfAdapter_UpdChk01;

	protected void initIfAdapter_UpdChk01() {
		this.info = PDef.MA_MABCL1500_IfAdapter_UpdChk01_INFO;
		this.aIfAdapter_UpdChk01 = ((MABCL_ExtSysReg)this).new IfAdapter_UpdChk01();
	}

	public static MABCL_ExtSysReg.IfAdapter_UpdChk01 crtIfAdapter_UpdChk01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initIfAdapter_UpdChk01();
		return lgc.aIfAdapter_UpdChk01;
	}

	protected void paramIfAdapter_UpdChk01(MCParam p) {
		if (this.aIfAdapter_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIfAdapter_UpdChk01.up0());
	}

	protected void doIfAdapter_UpdChk01() {
		aIfAdapter_UpdChk01.call();
	};

	/**
	 * IfAdapter_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR createIfAdapter_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.create();
	}

	/**
	 * IfAdapter_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> createIfAdapter_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.IfAdapter_Upd01 aIfAdapter_Upd01;

	protected void initIfAdapter_Upd01() {
		this.info = PDef.MA_MABCL1500_IfAdapter_Upd01_INFO;
		this.aIfAdapter_Upd01 = ((MABCL_ExtSysReg)this).new IfAdapter_Upd01();
	}

	public static MABCL_ExtSysReg.IfAdapter_Upd01 crtIfAdapter_Upd01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initIfAdapter_Upd01();
		return lgc.aIfAdapter_Upd01;
	}

	protected void paramIfAdapter_Upd01(MCParam p) {
		if (this.aIfAdapter_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIfAdapter_Upd01.up0());
	}

	protected void doIfAdapter_Upd01() {
		aIfAdapter_Upd01.call();
	};

	/**
	 * IfAdapter_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR createIfAdapter_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.create();
	}

	/**
	 * IfAdapter_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> createIfAdapter_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.HttpHeader_UpdChk01 aHttpHeader_UpdChk01;

	protected void initHttpHeader_UpdChk01() {
		this.info = PDef.MA_MABCL1500_HttpHeader_UpdChk01_INFO;
		this.aHttpHeader_UpdChk01 = ((MABCL_ExtSysReg)this).new HttpHeader_UpdChk01();
	}

	public static MABCL_ExtSysReg.HttpHeader_UpdChk01 crtHttpHeader_UpdChk01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initHttpHeader_UpdChk01();
		return lgc.aHttpHeader_UpdChk01;
	}

	protected void paramHttpHeader_UpdChk01(MCParam p) {
		if (this.aHttpHeader_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aHttpHeader_UpdChk01.up0());
	}

	protected void doHttpHeader_UpdChk01() {
		aHttpHeader_UpdChk01.call();
	};

	/**
	 * HttpHeader_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR createHttpHeader_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.create();
	}

	/**
	 * HttpHeader_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> createHttpHeader_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.HttpHeader_Upd01 aHttpHeader_Upd01;

	protected void initHttpHeader_Upd01() {
		this.info = PDef.MA_MABCL1500_HttpHeader_Upd01_INFO;
		this.aHttpHeader_Upd01 = ((MABCL_ExtSysReg)this).new HttpHeader_Upd01();
	}

	public static MABCL_ExtSysReg.HttpHeader_Upd01 crtHttpHeader_Upd01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initHttpHeader_Upd01();
		return lgc.aHttpHeader_Upd01;
	}

	protected void paramHttpHeader_Upd01(MCParam p) {
		if (this.aHttpHeader_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aHttpHeader_Upd01.up0());
	}

	protected void doHttpHeader_Upd01() {
		aHttpHeader_Upd01.call();
	};

	/**
	 * HttpHeader_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR createHttpHeader_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.create();
	}

	/**
	 * HttpHeader_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> createHttpHeader_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.ExtSysUsr_UpdChk01 aExtSysUsr_UpdChk01;

	protected void initExtSysUsr_UpdChk01() {
		this.info = PDef.MA_MABCL1500_ExtSysUsr_UpdChk01_INFO;
		this.aExtSysUsr_UpdChk01 = ((MABCL_ExtSysReg)this).new ExtSysUsr_UpdChk01();
	}

	public static MABCL_ExtSysReg.ExtSysUsr_UpdChk01 crtExtSysUsr_UpdChk01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initExtSysUsr_UpdChk01();
		return lgc.aExtSysUsr_UpdChk01;
	}

	protected void paramExtSysUsr_UpdChk01(MCParam p) {
		if (this.aExtSysUsr_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExtSysUsr_UpdChk01.up0());
	}

	protected void doExtSysUsr_UpdChk01() {
		aExtSysUsr_UpdChk01.call();
	};

	/**
	 * ExtSysUsr_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR createExtSysUsr_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.create();
	}

	/**
	 * ExtSysUsr_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> createExtSysUsr_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.ExtSysUsr_Upd01 aExtSysUsr_Upd01;

	protected void initExtSysUsr_Upd01() {
		this.info = PDef.MA_MABCL1500_ExtSysUsr_Upd01_INFO;
		this.aExtSysUsr_Upd01 = ((MABCL_ExtSysReg)this).new ExtSysUsr_Upd01();
	}

	public static MABCL_ExtSysReg.ExtSysUsr_Upd01 crtExtSysUsr_Upd01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initExtSysUsr_Upd01();
		return lgc.aExtSysUsr_Upd01;
	}

	protected void paramExtSysUsr_Upd01(MCParam p) {
		if (this.aExtSysUsr_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExtSysUsr_Upd01.up0());
	}

	protected void doExtSysUsr_Upd01() {
		aExtSysUsr_Upd01.call();
	};

	/**
	 * ExtSysUsr_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR createExtSysUsr_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.create();
	}

	/**
	 * ExtSysUsr_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> createExtSysUsr_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.ExtSysLcl_UpdChk01 aExtSysLcl_UpdChk01;

	protected void initExtSysLcl_UpdChk01() {
		this.info = PDef.MA_MABCL1500_ExtSysLcl_UpdChk01_INFO;
		this.aExtSysLcl_UpdChk01 = ((MABCL_ExtSysReg)this).new ExtSysLcl_UpdChk01();
	}

	public static MABCL_ExtSysReg.ExtSysLcl_UpdChk01 crtExtSysLcl_UpdChk01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initExtSysLcl_UpdChk01();
		return lgc.aExtSysLcl_UpdChk01;
	}

	protected void paramExtSysLcl_UpdChk01(MCParam p) {
		if (this.aExtSysLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExtSysLcl_UpdChk01.up0());
	}

	protected void doExtSysLcl_UpdChk01() {
		aExtSysLcl_UpdChk01.call();
	};

	/**
	 * ExtSysLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR createExtSysLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ExtSysLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> createExtSysLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.ExtSysLcl_Upd01 aExtSysLcl_Upd01;

	protected void initExtSysLcl_Upd01() {
		this.info = PDef.MA_MABCL1500_ExtSysLcl_Upd01_INFO;
		this.aExtSysLcl_Upd01 = ((MABCL_ExtSysReg)this).new ExtSysLcl_Upd01();
	}

	public static MABCL_ExtSysReg.ExtSysLcl_Upd01 crtExtSysLcl_Upd01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initExtSysLcl_Upd01();
		return lgc.aExtSysLcl_Upd01;
	}

	protected void paramExtSysLcl_Upd01(MCParam p) {
		if (this.aExtSysLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExtSysLcl_Upd01.up0());
	}

	protected void doExtSysLcl_Upd01() {
		aExtSysLcl_Upd01.call();
	};

	/**
	 * ExtSysLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR createExtSysLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ExtSysLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> createExtSysLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.ExtSys_DelChk01 aExtSys_DelChk01;

	protected void initExtSys_DelChk01() {
		this.info = PDef.MA_MABCL1500_ExtSys_DelChk01_INFO;
		this.aExtSys_DelChk01 = ((MABCL_ExtSysReg)this).new ExtSys_DelChk01();
	}

	public static MABCL_ExtSysReg.ExtSys_DelChk01 crtExtSys_DelChk01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initExtSys_DelChk01();
		return lgc.aExtSys_DelChk01;
	}

	protected void paramExtSys_DelChk01(MCParam p) {
		if (this.aExtSys_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExtSys_DelChk01.up0());
	}

	protected void doExtSys_DelChk01() {
		aExtSys_DelChk01.call();
	};

	/**
	 * ExtSys_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR createExtSys_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.create();
	}

	/**
	 * ExtSys_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> createExtSys_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.ExtSys_Del01 aExtSys_Del01;

	protected void initExtSys_Del01() {
		this.info = PDef.MA_MABCL1500_ExtSys_Del01_INFO;
		this.aExtSys_Del01 = ((MABCL_ExtSysReg)this).new ExtSys_Del01();
	}

	public static MABCL_ExtSysReg.ExtSys_Del01 crtExtSys_Del01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
		lgc.initExtSys_Del01();
		return lgc.aExtSys_Del01;
	}

	protected void paramExtSys_Del01(MCParam p) {
		if (this.aExtSys_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExtSys_Del01.up0());
	}

	protected void doExtSys_Del01() {
		aExtSys_Del01.call();
	};

	/**
	 * ExtSys_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR createExtSys_Del01_DtlR(){
		return mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.create();
	}

	/**
	 * ExtSys_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> createExtSys_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL1500_Srch01_INFO;
		this.aSrch01 = ((MABCL_ExtSysReg)this).new Srch01();
	}

	public static MABCL_ExtSysReg.Srch01 crtSrch01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
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
		p.addDownBlock(aSrch01.down5());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL1500.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL1500.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL1500.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMABC.MABCL1500.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt3R.class);
	}

	/**
	 * Srch01_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.Srch01_Rslt4R createSrch01_Rslt4R(){
		return mcframe.serverMABC.MABCL1500.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt4R> createSrch01_Rslt4L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.Srch01_Rslt5R createSrch01_Rslt5R(){
		return mcframe.serverMABC.MABCL1500.Srch01_Rslt5R.create();
	}

	/**
	 * Srch01_Rslt5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt5R> createSrch01_Rslt5L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt5R.class);
	}

	/**
	 * Srch01_Rslt6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.Srch01_Rslt6R createSrch01_Rslt6R(){
		return mcframe.serverMABC.MABCL1500.Srch01_Rslt6R.create();
	}

	/**
	 * Srch01_Rslt6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt6R> createSrch01_Rslt6L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt6R.class);
	}
	protected MABCL_ExtSysReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL1500_Upd01_INFO;
		this.aUpd01 = ((MABCL_ExtSysReg)this).new Upd01();
	}

	public static MABCL_ExtSysReg.Upd01 crtUpd01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
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
		p.addUpBlock(aUpd01.up5());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR createUpd01_Dtl3R(){
		return mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> createUpd01_Dtl3L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR createUpd01_Dtl4R(){
		return mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> createUpd01_Dtl4L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR createUpd01_Dtl5R(){
		return mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> createUpd01_Dtl5L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR createUpd01_Dtl6R(){
		return mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> createUpd01_Dtl6L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_ExtSysReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL1500_Del01_INFO;
		this.aDel01 = ((MABCL_ExtSysReg)this).new Del01();
	}

	public static MABCL_ExtSysReg.Del01 crtDel01() {
		MABCL_ExtSysReg lgc = new MABCL_ExtSysReg();
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
	public mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ExtSys_UpdChk01オペレーション.<p>
	 *
	 * 外部システムマスタを登録する前のチェックを行う<br>
	 */
	abstract public class ExtSys_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExtSys_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ExtSys_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.class);

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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExtSys_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR createExtSys_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.create();
		}

		/**
		 * ExtSys_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> createExtSys_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_typ</td></tr>
		 * 	<tr><td><br></td><td>web_api_flg</td></tr>
		 * 	<tr><td><br></td><td>cmd_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>real_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_dup_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_split_flg</td></tr>
		 * 	<tr><td><br></td><td>null_val_if_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}


	}
	/**
	 * ExtSys_Upd01オペレーション.<p>
	 *
	 * 外部システムマスタを登録する<br>
	 */
	abstract public class ExtSys_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExtSys_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExtSys_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_EXT_SYS_R.create("T1"));
			chkMaster = MCController.create(MAM_EXT_SYS_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_EXT_SYS_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_EXT_SYS_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExtSys_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR createExtSys_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.create();
		}

		/**
		 * ExtSys_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> createExtSys_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_typ</td></tr>
		 * 	<tr><td><br></td><td>web_api_flg</td></tr>
		 * 	<tr><td><br></td><td>cmd_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>real_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_dup_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_split_flg</td></tr>
		 * 	<tr><td><br></td><td>null_val_if_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_EXT_SYS_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> src_ExtSys_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ExtSys_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
				addColumnPathMap("ext_sys_typ", "ext_sys_typ");
				addColumnPathMap("web_api_flg", "web_api_flg");
				addColumnPathMap("cmd_exec_flg", "cmd_exec_flg");
				addColumnPathMap("real_imp_flg", "real_imp_flg");
				addColumnPathMap("not_send_upd_flg", "not_send_upd_flg");
				addColumnPathMap("not_dup_imp_flg", "not_dup_imp_flg");
				addColumnPathMap("if_upd_typ", "if_upd_typ");
				addColumnPathMap("dlv_slip_split_flg", "dlv_slip_split_flg");
				addColumnPathMap("null_val_if_flg", "null_val_if_flg");
				addColumnPathMap("upri_not_chk_flg", "upri_not_chk_flg");
				addColumnPathMap("amt_not_chk_flg", "amt_not_chk_flg");
				addColumnPathMap("tax_not_chk_flg", "tax_not_chk_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_EXT_SYS_R r_dest, mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_EXT_SYS_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_EXT_SYS_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> src_ExtSys_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ExtSys_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_EXT_SYS_R r_dest, mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_EXT_SYS_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_R r_dest = dest.createRow();
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
	 * IfProtocol_UpdChk01オペレーション.<p>
	 *
	 * ＩＦ通信ルールマスタを登録する前のチェックを行う<br>
	 */
	abstract public class IfProtocol_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IfProtocol_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected IfProtocol_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_EXT_SYS_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_EXT_SYS_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IfProtocol_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR createIfProtocol_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.create();
		}

		/**
		 * IfProtocol_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> createIfProtocol_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>var_str</td></tr>
		 * 	<tr><td><br></td><td>var_num</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_EXT_SYS_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> src_IfProtocol_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_IfProtocol_UpdChk01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_EXT_SYS_R r_dest, mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_EXT_SYS_R> dest, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_R r_dest = dest.createRow();
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
	 * IfProtocol_Upd01オペレーション.<p>
	 *
	 * ＩＦ通信ルールマスタを登録する<br>
	 */
	abstract public class IfProtocol_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IfProtocol_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_IF_PROTOCOL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_PROTOCOL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_IF_PROTOCOL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_IF_PROTOCOL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_IF_PROTOCOL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_IF_PROTOCOL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_PROTOCOL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_IF_PROTOCOL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_IF_PROTOCOL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_IF_PROTOCOL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected IfProtocol_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_IF_PROTOCOL_R.create("T1"));
			chkMaster = MCController.create(MAM_IF_PROTOCOL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_IF_PROTOCOL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_IF_PROTOCOL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_IF_PROTOCOL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_IF_PROTOCOL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IfProtocol_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR createIfProtocol_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.create();
		}

		/**
		 * IfProtocol_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> createIfProtocol_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>var_str</td></tr>
		 * 	<tr><td><br></td><td>var_num</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_IF_PROTOCOL_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> src_IfProtocol_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_IfProtocol_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("if_ctl_typ", "if_ctl_typ");
				addColumnPathMap("var_str", "var_str");
				addColumnPathMap("var_num", "var_num");
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
		protected void up_UPDATE_updMaster_0(MAM_IF_PROTOCOL_R r_dest, mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_IF_PROTOCOL_R> dest, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src : src){
				MAM_IF_PROTOCOL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_IF_PROTOCOL_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> src_IfProtocol_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_IfProtocol_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("if_ctl_typ", "if_ctl_typ");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_IF_PROTOCOL_R r_dest, mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_IF_PROTOCOL_R> dest, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src : src){
				MAM_IF_PROTOCOL_R r_dest = dest.createRow();
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
	 * IfAdapter_UpdChk01オペレーション.<p>
	 *
	 * ＩＦアダプタマスタを登録する前のチェックを行う<br>
	 */
	abstract public class IfAdapter_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IfAdapter_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected IfAdapter_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_EXT_SYS_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_EXT_SYS_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IfAdapter_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR createIfAdapter_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.create();
		}

		/**
		 * IfAdapter_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> createIfAdapter_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>conv_ope</td></tr>
		 * 	<tr><td><br></td><td>file_io_ope</td></tr>
		 * 	<tr><td><br></td><td>web_api_ope</td></tr>
		 * 	<tr><td><br></td><td>cmd_exec_ope</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_EXT_SYS_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> src_IfAdapter_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_IfAdapter_UpdChk01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_EXT_SYS_R r_dest, mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_EXT_SYS_R> dest, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_R r_dest = dest.createRow();
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
	 * IfAdapter_Upd01オペレーション.<p>
	 *
	 * ＩＦアダプタマスタを登録する<br>
	 */
	abstract public class IfAdapter_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IfAdapter_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_IF_ADAPTER_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_ADAPTER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_IF_ADAPTER_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_IF_ADAPTER_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_IF_ADAPTER_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_IF_ADAPTER_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_ADAPTER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_IF_ADAPTER_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_IF_ADAPTER_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_IF_ADAPTER_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected IfAdapter_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_IF_ADAPTER_R.create("T1"));
			chkMaster = MCController.create(MAM_IF_ADAPTER_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_IF_ADAPTER_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_IF_ADAPTER_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_IF_ADAPTER_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_IF_ADAPTER_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IfAdapter_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR createIfAdapter_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.create();
		}

		/**
		 * IfAdapter_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> createIfAdapter_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>conv_ope</td></tr>
		 * 	<tr><td><br></td><td>file_io_ope</td></tr>
		 * 	<tr><td><br></td><td>web_api_ope</td></tr>
		 * 	<tr><td><br></td><td>cmd_exec_ope</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_IF_ADAPTER_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> src_IfAdapter_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_IfAdapter_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("conv_ope", "conv_ope");
				addColumnPathMap("file_io_ope", "file_io_ope");
				addColumnPathMap("web_api_ope", "web_api_ope");
				addColumnPathMap("cmd_exec_ope", "cmd_exec_ope");
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
		protected void up_UPDATE_updMaster_0(MAM_IF_ADAPTER_R r_dest, mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_IF_ADAPTER_R> dest, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src : src){
				MAM_IF_ADAPTER_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_IF_ADAPTER_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> src_IfAdapter_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_IfAdapter_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("st_dt", "st_dt");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_IF_ADAPTER_R r_dest, mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_IF_ADAPTER_R> dest, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src : src){
				MAM_IF_ADAPTER_R r_dest = dest.createRow();
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
	 * HttpHeader_UpdChk01オペレーション.<p>
	 *
	 * ＨＴＴＰヘッダマスタを登録する前のチェックを行う<br>
	 */
	abstract public class HttpHeader_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "HttpHeader_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected HttpHeader_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_EXT_SYS_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_EXT_SYS_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * HttpHeader_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR createHttpHeader_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.create();
		}

		/**
		 * HttpHeader_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> createHttpHeader_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>http_header_nm</td></tr>
		 * 	<tr><td><br></td><td>http_header_val</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_EXT_SYS_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> src_HttpHeader_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_HttpHeader_UpdChk01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_EXT_SYS_R r_dest, mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_EXT_SYS_R> dest, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_R r_dest = dest.createRow();
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
	 * HttpHeader_Upd01オペレーション.<p>
	 *
	 * ＨＴＴＰヘッダマスタを登録する<br>
	 */
	abstract public class HttpHeader_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "HttpHeader_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_HTTP_HEADER_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HTTP_HEADER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HTTP_HEADER_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HTTP_HEADER_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_HTTP_HEADER_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_HTTP_HEADER_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HTTP_HEADER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HTTP_HEADER_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HTTP_HEADER_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_HTTP_HEADER_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected HttpHeader_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_HTTP_HEADER_R.create("T1"));
			chkMaster = MCController.create(MAM_HTTP_HEADER_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_HTTP_HEADER_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_HTTP_HEADER_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_HTTP_HEADER_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_HTTP_HEADER_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * HttpHeader_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR createHttpHeader_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.create();
		}

		/**
		 * HttpHeader_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> createHttpHeader_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>http_header_nm</td></tr>
		 * 	<tr><td><br></td><td>http_header_val</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_HTTP_HEADER_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> src_HttpHeader_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_HttpHeader_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("http_header_nm", "http_header_nm");
				addColumnPathMap("http_header_val", "http_header_val");
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
		protected void up_UPDATE_updMaster_0(MAM_HTTP_HEADER_R r_dest, mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_HTTP_HEADER_R> dest, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src : src){
				MAM_HTTP_HEADER_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_HTTP_HEADER_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> src_HttpHeader_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_HttpHeader_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("http_header_nm", "http_header_nm");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_HTTP_HEADER_R r_dest, mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_HTTP_HEADER_R> dest, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src : src){
				MAM_HTTP_HEADER_R r_dest = dest.createRow();
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
	 * ExtSysUsr_UpdChk01オペレーション.<p>
	 *
	 * 外部システムユーザマスタを登録する前のチェックを行う<br>
	 */
	abstract public class ExtSysUsr_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExtSysUsr_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExtSysUsr_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_EXT_SYS_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_EXT_SYS_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExtSysUsr_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR createExtSysUsr_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.create();
		}

		/**
		 * ExtSysUsr_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> createExtSysUsr_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_pass</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str1</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str4</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str5</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_EXT_SYS_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> src_ExtSysUsr_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ExtSysUsr_UpdChk01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_EXT_SYS_R r_dest, mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_EXT_SYS_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_R r_dest = dest.createRow();
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
	 * ExtSysUsr_Upd01オペレーション.<p>
	 *
	 * 外部システムユーザマスタを登録する<br>
	 */
	abstract public class ExtSysUsr_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExtSysUsr_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_USR_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_USR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_USR_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_USR_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_USR_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_USR_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_USR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_USR_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_USR_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_USR_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExtSysUsr_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_EXT_SYS_USR_R.create("T1"));
			chkMaster = MCController.create(MAM_EXT_SYS_USR_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_EXT_SYS_USR_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_EXT_SYS_USR_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_USR_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_USR_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExtSysUsr_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR createExtSysUsr_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.create();
		}

		/**
		 * ExtSysUsr_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> createExtSysUsr_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_pass</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str1</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str4</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str5</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_EXT_SYS_USR_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> src_ExtSysUsr_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ExtSysUsr_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("ext_sys_usr_cd", "ext_sys_usr_cd");
				addColumnPathMap("ext_sys_pass", "ext_sys_pass");
				addColumnPathMap("ext_sys_str1", "ext_sys_str1");
				addColumnPathMap("ext_sys_str2", "ext_sys_str2");
				addColumnPathMap("ext_sys_str3", "ext_sys_str3");
				addColumnPathMap("ext_sys_str4", "ext_sys_str4");
				addColumnPathMap("ext_sys_str5", "ext_sys_str5");
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
		protected void up_UPDATE_updMaster_0(MAM_EXT_SYS_USR_R r_dest, mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_EXT_SYS_USR_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_USR_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_EXT_SYS_USR_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> src_ExtSysUsr_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ExtSysUsr_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("usr_cd", "usr_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_EXT_SYS_USR_R r_dest, mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_EXT_SYS_USR_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_USR_R r_dest = dest.createRow();
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
	 * ExtSysLcl_UpdChk01オペレーション.<p>
	 *
	 * 外部システムマスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	abstract public class ExtSysLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExtSysLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExtSysLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_EXT_SYS_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_EXT_SYS_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExtSysLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR createExtSysLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ExtSysLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> createExtSysLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_EXT_SYS_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> src_ExtSysLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ExtSysLcl_UpdChk01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_EXT_SYS_R r_dest, mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_EXT_SYS_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_R r_dest = dest.createRow();
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
	 * ExtSysLcl_Upd01オペレーション.<p>
	 *
	 * 外部システムマスタ(ロケール別情報)を登録する<br>
	 */
	abstract public class ExtSysLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExtSysLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExtSysLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_EXT_SYS_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_EXT_SYS_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_EXT_SYS_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_EXT_SYS_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExtSysLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR createExtSysLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ExtSysLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> createExtSysLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_EXT_SYS_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> src_ExtSysLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ExtSysLcl_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_EXT_SYS_LCL_R r_dest, mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_EXT_SYS_LCL_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_EXT_SYS_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> src_ExtSysLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ExtSysLcl_Upd01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_EXT_SYS_LCL_R r_dest, mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_EXT_SYS_LCL_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src : src){
				MAM_EXT_SYS_LCL_R r_dest = dest.createRow();
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
	 * ExtSys_DelChk01オペレーション.<p>
	 *
	 * 外部システムマスタ、ＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタ、外部システムユーザマスタ、外部システムマスタ(ロケール別情報)を削除する前のチェックを行う<br>
	 */
	abstract public class ExtSys_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExtSys_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ExtSys_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.class);

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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExtSys_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR createExtSys_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.create();
		}

		/**
		 * ExtSys_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> createExtSys_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}


	}
	/**
	 * ExtSys_Del01オペレーション.<p>
	 *
	 * 外部システムマスタ、ＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタ、外部システムユーザマスタ、外部システムマスタ(ロケール別情報)を削除する<br>
	 */
	abstract public class ExtSys_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExtSys_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_IF_PROTOCOL_R&gt; （{@link #updMaster2}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_IF_ADAPTER_R&gt; （{@link #updMaster3}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_HTTP_HEADER_R&gt; （{@link #updMaster4}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_USR_R&gt; （{@link #updMaster5}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #updMaster6}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_PROTOCOL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_IF_PROTOCOL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_IF_PROTOCOL_R> updMaster2;
		/**
		 * DBC連携 updMaster3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_ADAPTER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_IF_ADAPTER_R&gt; （{@link #updMaster3_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_IF_ADAPTER_R> updMaster3;
		/**
		 * DBC連携 updMaster4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HTTP_HEADER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HTTP_HEADER_R&gt; （{@link #updMaster4_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HTTP_HEADER_R> updMaster4;
		/**
		 * DBC連携 updMaster5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_USR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_USR_R&gt; （{@link #updMaster5_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_USR_R> updMaster5;
		/**
		 * DBC連携 updMaster6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #updMaster6_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_LCL_R> updMaster6;
		// 連携ロジック上り
		public final MCList<MAM_EXT_SYS_R> updMaster1_up0;
		public final MCList<MAM_IF_PROTOCOL_R> updMaster2_up0;
		public final MCList<MAM_IF_ADAPTER_R> updMaster3_up0;
		public final MCList<MAM_HTTP_HEADER_R> updMaster4_up0;
		public final MCList<MAM_EXT_SYS_USR_R> updMaster5_up0;
		public final MCList<MAM_EXT_SYS_LCL_R> updMaster6_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExtSys_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_EXT_SYS_R.create("T1"));
			updMaster2 = MCController.create(MAM_IF_PROTOCOL_R.create("T1"));
			updMaster3 = MCController.create(MAM_IF_ADAPTER_R.create("T1"));
			updMaster4 = MCController.create(MAM_HTTP_HEADER_R.create("T1"));
			updMaster5 = MCController.create(MAM_EXT_SYS_USR_R.create("T1"));
			updMaster6 = MCController.create(MAM_EXT_SYS_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_EXT_SYS_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_IF_PROTOCOL_R>)updMaster2.up(1);
			updMaster3_up0 = (MCList<MAM_IF_ADAPTER_R>)updMaster3.up(1);
			updMaster4_up0 = (MCList<MAM_HTTP_HEADER_R>)updMaster4.up(1);
			updMaster5_up0 = (MCList<MAM_EXT_SYS_USR_R>)updMaster5.up(1);
			updMaster6_up0 = (MCList<MAM_EXT_SYS_LCL_R>)updMaster6.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
			appendOpe(UPDATE, updMaster3);
			appendOpe(UPDATE, updMaster4);
			appendOpe(UPDATE, updMaster5);
			appendOpe(UPDATE, updMaster6);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_IF_PROTOCOL_R&gt; （{@link #updMaster2_up0}）<br>
		 * up0() => MCList&lt;MAM_IF_ADAPTER_R&gt; （{@link #updMaster3_up0}）<br>
		 * up0() => MCList&lt;MAM_HTTP_HEADER_R&gt; （{@link #updMaster4_up0}）<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_USR_R&gt; （{@link #updMaster5_up0}）<br>
		 * up0() => MCList&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #updMaster6_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, updMaster3_up0, updMaster4_up0, updMaster5_up0, updMaster6_up0, up0());
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ExtSys_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR createExtSys_Del01_DtlR(){
			return mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.create();
		}

		/**
		 * ExtSys_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> createExtSys_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_EXT_SYS_R> dest0_0, MCList<MAM_IF_PROTOCOL_R> dest1_0, MCList<MAM_IF_ADAPTER_R> dest2_0, MCList<MAM_HTTP_HEADER_R> dest3_0, MCList<MAM_EXT_SYS_USR_R> dest4_0, MCList<MAM_EXT_SYS_LCL_R> dest5_0, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src_ExtSys_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ExtSys_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ExtSys_Del01_Dtl);
			up_UPDATE_updMaster3_0(dest2_0, src_ExtSys_Del01_Dtl);
			up_UPDATE_updMaster4_0(dest3_0, src_ExtSys_Del01_Dtl);
			up_UPDATE_updMaster5_0(dest4_0, src_ExtSys_Del01_Dtl);
			up_UPDATE_updMaster6_0(dest5_0, src_ExtSys_Del01_Dtl);
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_EXT_SYS_R r_dest, mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_EXT_SYS_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src : src){
				MAM_EXT_SYS_R r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_IF_PROTOCOL_R r_dest, mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_IF_PROTOCOL_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src : src){
				MAM_IF_PROTOCOL_R r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster3_0(MAM_IF_ADAPTER_R r_dest, mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster3_0(MCList<MAM_IF_ADAPTER_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster3_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src : src){
				MAM_IF_ADAPTER_R r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster4の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster4_0(MAM_HTTP_HEADER_R r_dest, mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster4の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster4_0(MCList<MAM_HTTP_HEADER_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster4_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src : src){
				MAM_HTTP_HEADER_R r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster5の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster5_0(MAM_EXT_SYS_USR_R r_dest, mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster5の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster5_0(MCList<MAM_EXT_SYS_USR_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster5_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src : src){
				MAM_EXT_SYS_USR_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster5_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster6の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster6_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster6_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster6の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster6_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster6の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster6_0(MAM_EXT_SYS_LCL_R r_dest, mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster6の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster6_0(MCList<MAM_EXT_SYS_LCL_R> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster6_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src : src){
				MAM_EXT_SYS_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster6_0(r_dest, r_src);
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
		private final mcframe.serverMABC.MABCL1500.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt3R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt4R> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt5R> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt6R> down5;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_R&gt;<br>
		 * 第1 上りブロッククラス MAM_EXT_SYS_R （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_EXT_SYS_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_R> c0;
		// 連携ロジック上り
		public final MAM_EXT_SYS_R c0_up0;
		// 連携ロジック下り
		public final MCList<MAM_EXT_SYS_R> c0_down0;
		/**
		 * 連携情報 SELECT_SUB1<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_IF_PROTOCOL_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_SUB1 = "SELECT_SUB1";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_PROTOCOL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_IF_PROTOCOL_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_IF_PROTOCOL_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_IF_PROTOCOL_R> c1_down0;
		/**
		 * 連携情報 SELECT_SUB2<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_IF_ADAPTER_R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT_SUB2 = "SELECT_SUB2";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_IF_ADAPTER_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_IF_ADAPTER_R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_IF_ADAPTER_R> c2;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_IF_ADAPTER_R> c2_down0;
		/**
		 * 連携情報 SELECT_SUB3<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_HTTP_HEADER_R&gt; （{@link #c3}）<br>
		 */
		public final String SELECT_SUB3 = "SELECT_SUB3";

		/**
		 * DBC連携 c3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HTTP_HEADER_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_HTTP_HEADER_R&gt; （{@link #c3_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_HTTP_HEADER_R> c3;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_HTTP_HEADER_R> c3_down0;
		/**
		 * 連携情報 SELECT_SUB4<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_USR_R&gt; （{@link #c4}）<br>
		 */
		public final String SELECT_SUB4 = "SELECT_SUB4";

		/**
		 * DBC連携 c4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_USR_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_EXT_SYS_USR_R&gt; （{@link #c4_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_USR_R> c4;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_EXT_SYS_USR_R> c4_down0;
		/**
		 * 連携情報 SELECT_LCL1<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #c5}）<br>
		 */
		public final String SELECT_LCL1 = "SELECT_LCL1";

		/**
		 * DBC連携 c5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXT_SYS_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_EXT_SYS_LCL_R&gt; （{@link #c5_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXT_SYS_LCL_R> c5;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_EXT_SYS_LCL_R> c5_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL1500.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt2R.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt3R.class);
			down3 = MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt4R.class);
			down4 = MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt5R.class);
			down5 = MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt6R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_EXT_SYS_R.create("T1"));
			c1 = MCController.create(MAM_IF_PROTOCOL_R.create("T1"));
			c2 = MCController.create(MAM_IF_ADAPTER_R.create("T1"));
			c3 = MCController.create(MAM_HTTP_HEADER_R.create("T1"));
			c4 = MCController.create(MAM_EXT_SYS_USR_R.create("T1"));
			c5 = MCController.create(MAM_EXT_SYS_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MAM_EXT_SYS_R)c0.up(0);
			c0_down0 = (MCList<MAM_EXT_SYS_R>)c0.down(0);
			c1_down0 = (MCList<MAM_IF_PROTOCOL_R>)c1.down(0);
			c2_down0 = (MCList<MAM_IF_ADAPTER_R>)c2.down(0);
			c3_down0 = (MCList<MAM_HTTP_HEADER_R>)c3.down(0);
			c4_down0 = (MCList<MAM_EXT_SYS_USR_R>)c4.down(0);
			c5_down0 = (MCList<MAM_EXT_SYS_LCL_R>)c5.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB1, c1);
			appendOpe(SELECT_SUB2, c2);
			appendOpe(SELECT_SUB3, c3);
			appendOpe(SELECT_SUB4, c4);
			appendOpe(SELECT_LCL1, c5);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => MAM_EXT_SYS_R （{@link #c0_up0}）<br>
		 * SELECT_SUB1<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB2<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB3<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB4<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL1<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
			if (key.equals(SELECT_SUB1)) {
				up_SELECT_SUB1();
			}
			if (key.equals(SELECT_SUB2)) {
				up_SELECT_SUB2();
			}
			if (key.equals(SELECT_SUB3)) {
				up_SELECT_SUB3();
			}
			if (key.equals(SELECT_SUB4)) {
				up_SELECT_SUB4();
			}
			if (key.equals(SELECT_LCL1)) {
				up_SELECT_LCL1();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_EXT_SYS_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB1<br>
		 * MCList&lt;MAM_IF_PROTOCOL_R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_SUB2<br>
		 * MCList&lt;MAM_IF_ADAPTER_R&gt;（{@link #c2_down0}）=> down2()<br>
		 * SELECT_SUB3<br>
		 * MCList&lt;MAM_HTTP_HEADER_R&gt;（{@link #c3_down0}）=> down3()<br>
		 * SELECT_SUB4<br>
		 * MCList&lt;MAM_EXT_SYS_USR_R&gt;（{@link #c4_down0}）=> down4()<br>
		 * SELECT_LCL1<br>
		 * MCList&lt;MAM_EXT_SYS_LCL_R&gt;（{@link #c5_down0}）=> down5()<br>
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
			if (key.equals(SELECT_SUB3)) {
				down_SELECT_SUB3(down3(), c3_down0);
			}
			if (key.equals(SELECT_SUB4)) {
				down_SELECT_SUB4(down4(), c4_down0);
			}
			if (key.equals(SELECT_LCL1)) {
				down_SELECT_LCL1(down5(), c5_down0);
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
			if (i == 5) return down5();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL1500.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL1500.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL1500.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMABC.MABCL1500.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt3R.class);
		}

		/**
		 * Srch01_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.Srch01_Rslt4R createSrch01_Rslt4R(){
			return mcframe.serverMABC.MABCL1500.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt4R> createSrch01_Rslt4L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.Srch01_Rslt5R createSrch01_Rslt5R(){
			return mcframe.serverMABC.MABCL1500.Srch01_Rslt5R.create();
		}

		/**
		 * Srch01_Rslt5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt5R> createSrch01_Rslt5L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt5R.class);
		}

		/**
		 * Srch01_Rslt6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.Srch01_Rslt6R createSrch01_Rslt6R(){
			return mcframe.serverMABC.MABCL1500.Srch01_Rslt6R.create();
		}

		/**
		 * Srch01_Rslt6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt6R> createSrch01_Rslt6L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.Srch01_Rslt6R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL1500.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL1500.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>web_api_flg</td></tr>
		 * 	<tr><td><br></td><td>cmd_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>real_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_dup_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_split_flg</td></tr>
		 * 	<tr><td><br></td><td>null_val_if_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_not_chk_flg</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>if_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>if_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>var_str</td></tr>
		 * 	<tr><td><br></td><td>var_num</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>conv_ope</td></tr>
		 * 	<tr><td><br></td><td>file_io_ope</td></tr>
		 * 	<tr><td><br></td><td>web_api_ope</td></tr>
		 * 	<tr><td><br></td><td>cmd_exec_ope</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt3R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>http_header_nm</td></tr>
		 * 	<tr><td><br></td><td>http_header_val</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt4R> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_pass</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str1</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str4</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str5</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt5R> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt6R> down5() {
			return down5;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(MAM_EXT_SYS_R dest0_0, mcframe.serverMABC.MABCL1500.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_c0_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_c0_0() {
			MCRowMapper map = new Map_up_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_sys_nm_lcl", "ext_sys_nm_lcl");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
			}
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_c0_0(MAM_EXT_SYS_R dest, mcframe.serverMABC.MABCL1500.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
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
		//-----------------------SELECT_SUB3専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB3の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB3(){
		}
		//-----------------------SELECT_SUB4専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB4の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB4(){
		}
		//-----------------------SELECT_LCL1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_LCL1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_LCL1(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_EXT_SYS_R> src0_0){
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_sys_nm_lcl", "ext_sys_nm");
				addColumnPathMap("ext_sys_nm", "base_ext_sys_nm");
				addColumnPathMap("ext_sys_typ", "ext_sys_typ");
				addColumnPathMap("web_api_flg", "web_api_flg");
				addColumnPathMap("cmd_exec_flg", "cmd_exec_flg");
				addColumnPathMap("real_imp_flg", "real_imp_flg");
				addColumnPathMap("not_send_upd_flg", "not_send_upd_flg");
				addColumnPathMap("not_dup_imp_flg", "not_dup_imp_flg");
				addColumnPathMap("if_upd_typ", "if_upd_typ");
				addColumnPathMap("dlv_slip_split_flg", "dlv_slip_split_flg");
				addColumnPathMap("null_val_if_flg", "null_val_if_flg");
				addColumnPathMap("upri_not_chk_flg", "upri_not_chk_flg");
				addColumnPathMap("amt_not_chk_flg", "amt_not_chk_flg");
				addColumnPathMap("tax_not_chk_flg", "tax_not_chk_flg");
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
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL1500.Srch01_Rslt1R r_dest, MAM_EXT_SYS_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt1R> dest, MCList<MAM_EXT_SYS_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_EXT_SYS_R r_src : src){
				mcframe.serverMABC.MABCL1500.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB1(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_IF_PROTOCOL_R> src0_0){
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("if_ctl_typ", "if_ctl_typ");
				addColumnPathMap("var_str", "var_str");
				addColumnPathMap("var_num", "var_num");
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
		protected void down_SELECT_SUB1_c1_0(mcframe.serverMABC.MABCL1500.Srch01_Rslt2R r_dest, MAM_IF_PROTOCOL_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB1_c1_0(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt2R> dest, MCList<MAM_IF_PROTOCOL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB1_c1_0();
			for(MAM_IF_PROTOCOL_R r_src : src){
				mcframe.serverMABC.MABCL1500.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB2(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt3R> dest_Srch01_Rslt3, MCList<MAM_IF_ADAPTER_R> src0_0){
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("conv_ope", "conv_ope");
				addColumnPathMap("file_io_ope", "file_io_ope");
				addColumnPathMap("web_api_ope", "web_api_ope");
				addColumnPathMap("cmd_exec_ope", "cmd_exec_ope");
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
		protected void down_SELECT_SUB2_c2_0(mcframe.serverMABC.MABCL1500.Srch01_Rslt3R r_dest, MAM_IF_ADAPTER_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB2_c2_0(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt3R> dest, MCList<MAM_IF_ADAPTER_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB2_c2_0();
			for(MAM_IF_ADAPTER_R r_src : src){
				mcframe.serverMABC.MABCL1500.Srch01_Rslt3R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB3(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt4R> dest_Srch01_Rslt4, MCList<MAM_HTTP_HEADER_R> src0_0){
			down_SELECT_SUB3_c3_0(dest_Srch01_Rslt4, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB3_c3_0() {
			MCRowMapper map = new Map_down_SELECT_SUB3_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB3_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("http_header_nm", "http_header_nm");
				addColumnPathMap("http_header_val", "http_header_val");
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
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB3_c3_0(mcframe.serverMABC.MABCL1500.Srch01_Rslt4R r_dest, MAM_HTTP_HEADER_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB3_c3_0(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt4R> dest, MCList<MAM_HTTP_HEADER_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB3_c3_0();
			for(MAM_HTTP_HEADER_R r_src : src){
				mcframe.serverMABC.MABCL1500.Srch01_Rslt4R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB3_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB4専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB4の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB4(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt5R> dest_Srch01_Rslt5, MCList<MAM_EXT_SYS_USR_R> src0_0){
			down_SELECT_SUB4_c4_0(dest_Srch01_Rslt5, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB4_c4_0() {
			MCRowMapper map = new Map_down_SELECT_SUB4_c4_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB4_c4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("usr_nm", "usr_nm");
				addColumnPathMap("ext_sys_usr_cd", "ext_sys_usr_cd");
				addColumnPathMap("ext_sys_pass", "ext_sys_pass");
				addColumnPathMap("ext_sys_str1", "ext_sys_str1");
				addColumnPathMap("ext_sys_str2", "ext_sys_str2");
				addColumnPathMap("ext_sys_str3", "ext_sys_str3");
				addColumnPathMap("ext_sys_str4", "ext_sys_str4");
				addColumnPathMap("ext_sys_str5", "ext_sys_str5");
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
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB4_c4_0(mcframe.serverMABC.MABCL1500.Srch01_Rslt5R r_dest, MAM_EXT_SYS_USR_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB4_c4_0(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt5R> dest, MCList<MAM_EXT_SYS_USR_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB4_c4_0();
			for(MAM_EXT_SYS_USR_R r_src : src){
				mcframe.serverMABC.MABCL1500.Srch01_Rslt5R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB4_c4_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCL1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL1(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt6R> dest_Srch01_Rslt6, MCList<MAM_EXT_SYS_LCL_R> src0_0){
			down_SELECT_LCL1_c5_0(dest_Srch01_Rslt6, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL1_c5の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL1_c5_0() {
			MCRowMapper map = new Map_down_SELECT_LCL1_c5_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL1_c5の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL1_c5_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
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
		 * 連携処理SELECT_LCL1_c5の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL1_c5_0(mcframe.serverMABC.MABCL1500.Srch01_Rslt6R r_dest, MAM_EXT_SYS_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL1_c5の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL1_c5_0(MCList<mcframe.serverMABC.MABCL1500.Srch01_Rslt6R> dest, MCList<MAM_EXT_SYS_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL1_c5_0();
			for(MAM_EXT_SYS_LCL_R r_src : src){
				mcframe.serverMABC.MABCL1500.Srch01_Rslt6R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL1_c5_0(r_dest, r_src);
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
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> up5;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfProtocol_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfProtocol_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfProtocol_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfProtocol_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfProtocol_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfProtocol_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfAdapter_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfAdapter_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfAdapter_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfAdapter_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfAdapter_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.IfAdapter_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.HttpHeader_UpdChk01 （{@link #chk04}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.HttpHeader_Upd01 （{@link #upd04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.HttpHeader_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.HttpHeader_UpdChk01 chk04;
		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.HttpHeader_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.HttpHeader_Upd01 upd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> chk04_up0;
		public final MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> upd04_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE05<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysUsr_UpdChk01 （{@link #chk05}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysUsr_Upd01 （{@link #upd05}）<br>
		 */
		public final String CALL_OPE05 = "CALL_OPE05";

		/**
		 * 連携オペレーション chk05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysUsr_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysUsr_UpdChk01 chk05;
		/**
		 * 連携オペレーション upd05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysUsr_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysUsr_Upd01 upd05;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> chk05_up0;
		public final MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> upd05_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE06<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysLcl_UpdChk01 （{@link #chk06}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysLcl_Upd01 （{@link #upd06}）<br>
		 */
		public final String CALL_OPE06 = "CALL_OPE06";

		/**
		 * 連携オペレーション chk06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR&gt; （{@link #chk06_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysLcl_UpdChk01 chk06;
		/**
		 * 連携オペレーション upd06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR&gt; （{@link #upd06_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSysLcl_Upd01 upd06;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> chk06_up0;
		public final MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> upd06_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.class);
			up3 = MCList.create(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.class);
			up4 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.class);
			up5 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtExtSys_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtExtSys_Upd01();
			chk02 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtIfProtocol_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtIfProtocol_Upd01();
			chk03 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtIfAdapter_UpdChk01();
			upd03 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtIfAdapter_Upd01();
			chk04 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtHttpHeader_UpdChk01();
			upd04 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtHttpHeader_Upd01();
			chk05 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtExtSysUsr_UpdChk01();
			upd05 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtExtSysUsr_Upd01();
			chk06 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtExtSysLcl_UpdChk01();
			upd06 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtExtSysLcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR>)upd03.up(0);
			chk04_up0 = (MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR>)chk04.up(0);
			upd04_up0 = (MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR>)upd04.up(0);
			chk05_up0 = (MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR>)chk05.up(0);
			upd05_up0 = (MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR>)upd05.up(0);
			chk06_up0 = (MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR>)chk06.up(0);
			upd06_up0 = (MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR>)upd06.up(0);

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
			appendOpe(CALL_OPE06, chk06);
			appendOpe(CALL_OPE06, upd06);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 * CALL_OPE04<br>
		 * up3() => MCList&lt;mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 * CALL_OPE05<br>
		 * up4() => MCList&lt;mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 * CALL_OPE06<br>
		 * up5() => MCList&lt;mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR&gt; （{@link #chk06_up0}）<br>
		 * up5() => MCList&lt;mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR&gt; （{@link #upd06_up0}）<br>
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
			if (key.equals(CALL_OPE06)) {
				up_CALL_OPE06(chk06_up0, upd06_up0, up5());
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
		 * CALL_OPE06<br>
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
			if (key.equals(CALL_OPE06)) {
				down_CALL_OPE06();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR createUpd01_Dtl3R(){
			return mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> createUpd01_Dtl3L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR createUpd01_Dtl4R(){
			return mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> createUpd01_Dtl4L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR createUpd01_Dtl5R(){
			return mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> createUpd01_Dtl5L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR createUpd01_Dtl6R(){
			return mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> createUpd01_Dtl6L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_typ</td></tr>
		 * 	<tr><td><br></td><td>web_api_flg</td></tr>
		 * 	<tr><td><br></td><td>cmd_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>real_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_dup_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_split_flg</td></tr>
		 * 	<tr><td><br></td><td>null_val_if_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>var_str</td></tr>
		 * 	<tr><td><br></td><td>var_num</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>conv_ope</td></tr>
		 * 	<tr><td><br></td><td>file_io_ope</td></tr>
		 * 	<tr><td><br></td><td>web_api_ope</td></tr>
		 * 	<tr><td><br></td><td>cmd_exec_ope</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>http_header_nm</td></tr>
		 * 	<tr><td><br></td><td>http_header_val</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_pass</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str1</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str4</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_str5</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> up5() {
			return up5;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> src_Upd01_Dtl1){
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
				addColumnPathMap("ext_sys_typ", "ext_sys_typ");
				addColumnPathMap("web_api_flg", "web_api_flg");
				addColumnPathMap("cmd_exec_flg", "cmd_exec_flg");
				addColumnPathMap("real_imp_flg", "real_imp_flg");
				addColumnPathMap("not_send_upd_flg", "not_send_upd_flg");
				addColumnPathMap("not_dup_imp_flg", "not_dup_imp_flg");
				addColumnPathMap("if_upd_typ", "if_upd_typ");
				addColumnPathMap("dlv_slip_split_flg", "dlv_slip_split_flg");
				addColumnPathMap("null_val_if_flg", "null_val_if_flg");
				addColumnPathMap("upri_not_chk_flg", "upri_not_chk_flg");
				addColumnPathMap("amt_not_chk_flg", "amt_not_chk_flg");
				addColumnPathMap("tax_not_chk_flg", "tax_not_chk_flg");
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
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
				addColumnPathMap("ext_sys_typ", "ext_sys_typ");
				addColumnPathMap("web_api_flg", "web_api_flg");
				addColumnPathMap("cmd_exec_flg", "cmd_exec_flg");
				addColumnPathMap("real_imp_flg", "real_imp_flg");
				addColumnPathMap("not_send_upd_flg", "not_send_upd_flg");
				addColumnPathMap("not_dup_imp_flg", "not_dup_imp_flg");
				addColumnPathMap("if_upd_typ", "if_upd_typ");
				addColumnPathMap("dlv_slip_split_flg", "dlv_slip_split_flg");
				addColumnPathMap("null_val_if_flg", "null_val_if_flg");
				addColumnPathMap("upri_not_chk_flg", "upri_not_chk_flg");
				addColumnPathMap("amt_not_chk_flg", "amt_not_chk_flg");
				addColumnPathMap("tax_not_chk_flg", "tax_not_chk_flg");
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
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.ExtSys_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> src_Upd01_Dtl2){
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("if_ctl_typ", "if_ctl_typ");
				addColumnPathMap("var_str", "var_str");
				addColumnPathMap("var_num", "var_num");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("if_ctl_typ", "if_ctl_typ");
				addColumnPathMap("var_str", "var_str");
				addColumnPathMap("var_num", "var_num");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.IfProtocol_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> src_Upd01_Dtl3){
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("conv_ope", "conv_ope");
				addColumnPathMap("file_io_ope", "file_io_ope");
				addColumnPathMap("web_api_ope", "web_api_ope");
				addColumnPathMap("cmd_exec_ope", "cmd_exec_ope");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("conv_ope", "conv_ope");
				addColumnPathMap("file_io_ope", "file_io_ope");
				addColumnPathMap("web_api_ope", "web_api_ope");
				addColumnPathMap("cmd_exec_ope", "cmd_exec_ope");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.IfAdapter_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> src_Upd01_Dtl4){
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("http_header_nm", "http_header_nm");
				addColumnPathMap("http_header_val", "http_header_val");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_chk04_0(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_chk04_0(MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_chk04_0();
			for(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("http_header_nm", "http_header_nm");
				addColumnPathMap("http_header_val", "http_header_val");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_upd04_0(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_upd04_0(MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_upd04_0();
			for(mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.HttpHeader_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_upd04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE05専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE05の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE05(MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> src_Upd01_Dtl5){
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("ext_sys_usr_cd", "ext_sys_usr_cd");
				addColumnPathMap("ext_sys_pass", "ext_sys_pass");
				addColumnPathMap("ext_sys_str1", "ext_sys_str1");
				addColumnPathMap("ext_sys_str2", "ext_sys_str2");
				addColumnPathMap("ext_sys_str3", "ext_sys_str3");
				addColumnPathMap("ext_sys_str4", "ext_sys_str4");
				addColumnPathMap("ext_sys_str5", "ext_sys_str5");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_chk05_0(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_chk05_0(MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_chk05_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("ext_sys_usr_cd", "ext_sys_usr_cd");
				addColumnPathMap("ext_sys_pass", "ext_sys_pass");
				addColumnPathMap("ext_sys_str1", "ext_sys_str1");
				addColumnPathMap("ext_sys_str2", "ext_sys_str2");
				addColumnPathMap("ext_sys_str3", "ext_sys_str3");
				addColumnPathMap("ext_sys_str4", "ext_sys_str4");
				addColumnPathMap("ext_sys_str5", "ext_sys_str5");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_upd05_0(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_upd05_0(MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_upd05_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.ExtSysUsr_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_upd05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE06専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE06の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE06(MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> src_Upd01_Dtl6){
			up_CALL_OPE06_chk06_0(dest0_0, src_Upd01_Dtl6);
			up_CALL_OPE06_upd06_0(dest1_0, src_Upd01_Dtl6);
		}
		
		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE06_chk06_0() {
			MCRowMapper map = new Map_up_CALL_OPE06_chk06_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE06_chk06_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE06_chk06_0(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE06_chk06_0(MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE06_chk06_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE06_chk06_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE06_upd06_0() {
			MCRowMapper map = new Map_up_CALL_OPE06_upd06_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE06_upd06_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE06_upd06_0(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE06_upd06_0(MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE06_upd06_0();
			for(mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.ExtSysLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE06_upd06_0(r_dest, r_src);
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
		//-----------------------CALL_OPE06専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE06の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE06(){
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
		private final MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.ExtSys_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtExtSys_DelChk01();
			del01 = mcframe.serverMABC.MABCL1500.MABCL_ExtSysReg.crtExtSys_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ExtSysReg)MABCL_ExtSysReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src_Del01_Dtl1){
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL1500.ExtSys_DelChk01_DtlR r_dest = dest.createRow();
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