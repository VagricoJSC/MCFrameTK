package mcframe.serverMABC.MABCL0033;

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
	public static final String LOGIC_ID = "MABCL0033";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_MultiReg.Wg_UpdChk01 aWg_UpdChk01;

	protected void initWg_UpdChk01() {
		this.info = PDef.MA_MABCL0033_Wg_UpdChk01_INFO;
		this.aWg_UpdChk01 = ((MABCL_MultiReg)this).new Wg_UpdChk01();
	}

	public static MABCL_MultiReg.Wg_UpdChk01 crtWg_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWg_UpdChk01();
		return lgc.aWg_UpdChk01;
	}

	protected void paramWg_UpdChk01(MCParam p) {
		if (this.aWg_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWg_UpdChk01.up0());
	}

	protected void doWg_UpdChk01() {
		aWg_UpdChk01.call();
	};

	/**
	 * Wg_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR createWg_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.create();
	}

	/**
	 * Wg_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> createWg_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Wg_Upd01 aWg_Upd01;

	protected void initWg_Upd01() {
		this.info = PDef.MA_MABCL0033_Wg_Upd01_INFO;
		this.aWg_Upd01 = ((MABCL_MultiReg)this).new Wg_Upd01();
	}

	public static MABCL_MultiReg.Wg_Upd01 crtWg_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWg_Upd01();
		return lgc.aWg_Upd01;
	}

	protected void paramWg_Upd01(MCParam p) {
		if (this.aWg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWg_Upd01.up0());
	}

	protected void doWg_Upd01() {
		aWg_Upd01.call();
	};

	/**
	 * Wg_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR createWg_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.create();
	}

	/**
	 * Wg_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> createWg_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WgLcl_UpdChk01 aWgLcl_UpdChk01;

	protected void initWgLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_WgLcl_UpdChk01_INFO;
		this.aWgLcl_UpdChk01 = ((MABCL_MultiReg)this).new WgLcl_UpdChk01();
	}

	public static MABCL_MultiReg.WgLcl_UpdChk01 crtWgLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWgLcl_UpdChk01();
		return lgc.aWgLcl_UpdChk01;
	}

	protected void paramWgLcl_UpdChk01(MCParam p) {
		if (this.aWgLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWgLcl_UpdChk01.up0());
	}

	protected void doWgLcl_UpdChk01() {
		aWgLcl_UpdChk01.call();
	};

	/**
	 * WgLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR createWgLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.create();
	}

	/**
	 * WgLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> createWgLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WgLcl_Upd01 aWgLcl_Upd01;

	protected void initWgLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_WgLcl_Upd01_INFO;
		this.aWgLcl_Upd01 = ((MABCL_MultiReg)this).new WgLcl_Upd01();
	}

	public static MABCL_MultiReg.WgLcl_Upd01 crtWgLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWgLcl_Upd01();
		return lgc.aWgLcl_Upd01;
	}

	protected void paramWgLcl_Upd01(MCParam p) {
		if (this.aWgLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWgLcl_Upd01.up0());
	}

	protected void doWgLcl_Upd01() {
		aWgLcl_Upd01.call();
	};

	/**
	 * WgLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR createWgLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.create();
	}

	/**
	 * WgLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> createWgLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Wg_DelChk01 aWg_DelChk01;

	protected void initWg_DelChk01() {
		this.info = PDef.MA_MABCL0033_Wg_DelChk01_INFO;
		this.aWg_DelChk01 = ((MABCL_MultiReg)this).new Wg_DelChk01();
	}

	public static MABCL_MultiReg.Wg_DelChk01 crtWg_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWg_DelChk01();
		return lgc.aWg_DelChk01;
	}

	protected void paramWg_DelChk01(MCParam p) {
		if (this.aWg_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWg_DelChk01.up0());
	}

	protected void doWg_DelChk01() {
		aWg_DelChk01.call();
	};

	/**
	 * Wg_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR createWg_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.create();
	}

	/**
	 * Wg_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> createWg_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Wg_Del01 aWg_Del01;

	protected void initWg_Del01() {
		this.info = PDef.MA_MABCL0033_Wg_Del01_INFO;
		this.aWg_Del01 = ((MABCL_MultiReg)this).new Wg_Del01();
	}

	public static MABCL_MultiReg.Wg_Del01 crtWg_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWg_Del01();
		return lgc.aWg_Del01;
	}

	protected void paramWg_Del01(MCParam p) {
		if (this.aWg_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWg_Del01.up0());
	}

	protected void doWg_Del01() {
		aWg_Del01.call();
	};

	/**
	 * Wg_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR createWg_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.create();
	}

	/**
	 * Wg_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> createWg_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Oper_UpdChk01 aOper_UpdChk01;

	protected void initOper_UpdChk01() {
		this.info = PDef.MA_MABCL0033_Oper_UpdChk01_INFO;
		this.aOper_UpdChk01 = ((MABCL_MultiReg)this).new Oper_UpdChk01();
	}

	public static MABCL_MultiReg.Oper_UpdChk01 crtOper_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initOper_UpdChk01();
		return lgc.aOper_UpdChk01;
	}

	protected void paramOper_UpdChk01(MCParam p) {
		if (this.aOper_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOper_UpdChk01.up0());
	}

	protected void doOper_UpdChk01() {
		aOper_UpdChk01.call();
	};

	/**
	 * Oper_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR createOper_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.create();
	}

	/**
	 * Oper_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> createOper_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Oper_Upd01 aOper_Upd01;

	protected void initOper_Upd01() {
		this.info = PDef.MA_MABCL0033_Oper_Upd01_INFO;
		this.aOper_Upd01 = ((MABCL_MultiReg)this).new Oper_Upd01();
	}

	public static MABCL_MultiReg.Oper_Upd01 crtOper_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initOper_Upd01();
		return lgc.aOper_Upd01;
	}

	protected void paramOper_Upd01(MCParam p) {
		if (this.aOper_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOper_Upd01.up0());
	}

	protected void doOper_Upd01() {
		aOper_Upd01.call();
	};

	/**
	 * Oper_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR createOper_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.create();
	}

	/**
	 * Oper_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> createOper_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.OperLcl_UpdChk01 aOperLcl_UpdChk01;

	protected void initOperLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_OperLcl_UpdChk01_INFO;
		this.aOperLcl_UpdChk01 = ((MABCL_MultiReg)this).new OperLcl_UpdChk01();
	}

	public static MABCL_MultiReg.OperLcl_UpdChk01 crtOperLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initOperLcl_UpdChk01();
		return lgc.aOperLcl_UpdChk01;
	}

	protected void paramOperLcl_UpdChk01(MCParam p) {
		if (this.aOperLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOperLcl_UpdChk01.up0());
	}

	protected void doOperLcl_UpdChk01() {
		aOperLcl_UpdChk01.call();
	};

	/**
	 * OperLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR createOperLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.create();
	}

	/**
	 * OperLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> createOperLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.OperLcl_Upd01 aOperLcl_Upd01;

	protected void initOperLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_OperLcl_Upd01_INFO;
		this.aOperLcl_Upd01 = ((MABCL_MultiReg)this).new OperLcl_Upd01();
	}

	public static MABCL_MultiReg.OperLcl_Upd01 crtOperLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initOperLcl_Upd01();
		return lgc.aOperLcl_Upd01;
	}

	protected void paramOperLcl_Upd01(MCParam p) {
		if (this.aOperLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOperLcl_Upd01.up0());
	}

	protected void doOperLcl_Upd01() {
		aOperLcl_Upd01.call();
	};

	/**
	 * OperLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR createOperLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.create();
	}

	/**
	 * OperLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> createOperLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Oper_DelChk01 aOper_DelChk01;

	protected void initOper_DelChk01() {
		this.info = PDef.MA_MABCL0033_Oper_DelChk01_INFO;
		this.aOper_DelChk01 = ((MABCL_MultiReg)this).new Oper_DelChk01();
	}

	public static MABCL_MultiReg.Oper_DelChk01 crtOper_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initOper_DelChk01();
		return lgc.aOper_DelChk01;
	}

	protected void paramOper_DelChk01(MCParam p) {
		if (this.aOper_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOper_DelChk01.up0());
	}

	protected void doOper_DelChk01() {
		aOper_DelChk01.call();
	};

	/**
	 * Oper_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR createOper_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.create();
	}

	/**
	 * Oper_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> createOper_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Oper_Del01 aOper_Del01;

	protected void initOper_Del01() {
		this.info = PDef.MA_MABCL0033_Oper_Del01_INFO;
		this.aOper_Del01 = ((MABCL_MultiReg)this).new Oper_Del01();
	}

	public static MABCL_MultiReg.Oper_Del01 crtOper_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initOper_Del01();
		return lgc.aOper_Del01;
	}

	protected void paramOper_Del01(MCParam p) {
		if (this.aOper_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOper_Del01.up0());
	}

	protected void doOper_Del01() {
		aOper_Del01.call();
	};

	/**
	 * Oper_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR createOper_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.create();
	}

	/**
	 * Oper_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> createOper_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkCost_UpdChk01 aWkCost_UpdChk01;

	protected void initWkCost_UpdChk01() {
		this.info = PDef.MA_MABCL0033_WkCost_UpdChk01_INFO;
		this.aWkCost_UpdChk01 = ((MABCL_MultiReg)this).new WkCost_UpdChk01();
	}

	public static MABCL_MultiReg.WkCost_UpdChk01 crtWkCost_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkCost_UpdChk01();
		return lgc.aWkCost_UpdChk01;
	}

	protected void paramWkCost_UpdChk01(MCParam p) {
		if (this.aWkCost_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkCost_UpdChk01.up0());
	}

	protected void doWkCost_UpdChk01() {
		aWkCost_UpdChk01.call();
	};

	/**
	 * WkCost_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR createWkCost_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.create();
	}

	/**
	 * WkCost_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> createWkCost_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkCost_Upd01 aWkCost_Upd01;

	protected void initWkCost_Upd01() {
		this.info = PDef.MA_MABCL0033_WkCost_Upd01_INFO;
		this.aWkCost_Upd01 = ((MABCL_MultiReg)this).new WkCost_Upd01();
	}

	public static MABCL_MultiReg.WkCost_Upd01 crtWkCost_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkCost_Upd01();
		return lgc.aWkCost_Upd01;
	}

	protected void paramWkCost_Upd01(MCParam p) {
		if (this.aWkCost_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkCost_Upd01.up0());
	}

	protected void doWkCost_Upd01() {
		aWkCost_Upd01.call();
	};

	/**
	 * WkCost_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR createWkCost_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.create();
	}

	/**
	 * WkCost_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> createWkCost_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkCostLcl_UpdChk01 aWkCostLcl_UpdChk01;

	protected void initWkCostLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_WkCostLcl_UpdChk01_INFO;
		this.aWkCostLcl_UpdChk01 = ((MABCL_MultiReg)this).new WkCostLcl_UpdChk01();
	}

	public static MABCL_MultiReg.WkCostLcl_UpdChk01 crtWkCostLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkCostLcl_UpdChk01();
		return lgc.aWkCostLcl_UpdChk01;
	}

	protected void paramWkCostLcl_UpdChk01(MCParam p) {
		if (this.aWkCostLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkCostLcl_UpdChk01.up0());
	}

	protected void doWkCostLcl_UpdChk01() {
		aWkCostLcl_UpdChk01.call();
	};

	/**
	 * WkCostLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR createWkCostLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.create();
	}

	/**
	 * WkCostLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> createWkCostLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkCostLcl_Upd01 aWkCostLcl_Upd01;

	protected void initWkCostLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_WkCostLcl_Upd01_INFO;
		this.aWkCostLcl_Upd01 = ((MABCL_MultiReg)this).new WkCostLcl_Upd01();
	}

	public static MABCL_MultiReg.WkCostLcl_Upd01 crtWkCostLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkCostLcl_Upd01();
		return lgc.aWkCostLcl_Upd01;
	}

	protected void paramWkCostLcl_Upd01(MCParam p) {
		if (this.aWkCostLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkCostLcl_Upd01.up0());
	}

	protected void doWkCostLcl_Upd01() {
		aWkCostLcl_Upd01.call();
	};

	/**
	 * WkCostLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR createWkCostLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.create();
	}

	/**
	 * WkCostLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> createWkCostLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkCost_DelChk01 aWkCost_DelChk01;

	protected void initWkCost_DelChk01() {
		this.info = PDef.MA_MABCL0033_WkCost_DelChk01_INFO;
		this.aWkCost_DelChk01 = ((MABCL_MultiReg)this).new WkCost_DelChk01();
	}

	public static MABCL_MultiReg.WkCost_DelChk01 crtWkCost_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkCost_DelChk01();
		return lgc.aWkCost_DelChk01;
	}

	protected void paramWkCost_DelChk01(MCParam p) {
		if (this.aWkCost_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkCost_DelChk01.up0());
	}

	protected void doWkCost_DelChk01() {
		aWkCost_DelChk01.call();
	};

	/**
	 * WkCost_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR createWkCost_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.create();
	}

	/**
	 * WkCost_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> createWkCost_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkCost_Del01 aWkCost_Del01;

	protected void initWkCost_Del01() {
		this.info = PDef.MA_MABCL0033_WkCost_Del01_INFO;
		this.aWkCost_Del01 = ((MABCL_MultiReg)this).new WkCost_Del01();
	}

	public static MABCL_MultiReg.WkCost_Del01 crtWkCost_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkCost_Del01();
		return lgc.aWkCost_Del01;
	}

	protected void paramWkCost_Del01(MCParam p) {
		if (this.aWkCost_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkCost_Del01.up0());
	}

	protected void doWkCost_Del01() {
		aWkCost_Del01.call();
	};

	/**
	 * WkCost_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR createWkCost_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.create();
	}

	/**
	 * WkCost_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> createWkCost_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkRsn_UpdChk01 aWkRsn_UpdChk01;

	protected void initWkRsn_UpdChk01() {
		this.info = PDef.MA_MABCL0033_WkRsn_UpdChk01_INFO;
		this.aWkRsn_UpdChk01 = ((MABCL_MultiReg)this).new WkRsn_UpdChk01();
	}

	public static MABCL_MultiReg.WkRsn_UpdChk01 crtWkRsn_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkRsn_UpdChk01();
		return lgc.aWkRsn_UpdChk01;
	}

	protected void paramWkRsn_UpdChk01(MCParam p) {
		if (this.aWkRsn_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkRsn_UpdChk01.up0());
	}

	protected void doWkRsn_UpdChk01() {
		aWkRsn_UpdChk01.call();
	};

	/**
	 * WkRsn_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR createWkRsn_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.create();
	}

	/**
	 * WkRsn_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> createWkRsn_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkRsn_Upd01 aWkRsn_Upd01;

	protected void initWkRsn_Upd01() {
		this.info = PDef.MA_MABCL0033_WkRsn_Upd01_INFO;
		this.aWkRsn_Upd01 = ((MABCL_MultiReg)this).new WkRsn_Upd01();
	}

	public static MABCL_MultiReg.WkRsn_Upd01 crtWkRsn_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkRsn_Upd01();
		return lgc.aWkRsn_Upd01;
	}

	protected void paramWkRsn_Upd01(MCParam p) {
		if (this.aWkRsn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkRsn_Upd01.up0());
	}

	protected void doWkRsn_Upd01() {
		aWkRsn_Upd01.call();
	};

	/**
	 * WkRsn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR createWkRsn_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.create();
	}

	/**
	 * WkRsn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> createWkRsn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkRsnLcl_UpdChk01 aWkRsnLcl_UpdChk01;

	protected void initWkRsnLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_WkRsnLcl_UpdChk01_INFO;
		this.aWkRsnLcl_UpdChk01 = ((MABCL_MultiReg)this).new WkRsnLcl_UpdChk01();
	}

	public static MABCL_MultiReg.WkRsnLcl_UpdChk01 crtWkRsnLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkRsnLcl_UpdChk01();
		return lgc.aWkRsnLcl_UpdChk01;
	}

	protected void paramWkRsnLcl_UpdChk01(MCParam p) {
		if (this.aWkRsnLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkRsnLcl_UpdChk01.up0());
	}

	protected void doWkRsnLcl_UpdChk01() {
		aWkRsnLcl_UpdChk01.call();
	};

	/**
	 * WkRsnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR createWkRsnLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * WkRsnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> createWkRsnLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkRsnLcl_Upd01 aWkRsnLcl_Upd01;

	protected void initWkRsnLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_WkRsnLcl_Upd01_INFO;
		this.aWkRsnLcl_Upd01 = ((MABCL_MultiReg)this).new WkRsnLcl_Upd01();
	}

	public static MABCL_MultiReg.WkRsnLcl_Upd01 crtWkRsnLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkRsnLcl_Upd01();
		return lgc.aWkRsnLcl_Upd01;
	}

	protected void paramWkRsnLcl_Upd01(MCParam p) {
		if (this.aWkRsnLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkRsnLcl_Upd01.up0());
	}

	protected void doWkRsnLcl_Upd01() {
		aWkRsnLcl_Upd01.call();
	};

	/**
	 * WkRsnLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR createWkRsnLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * WkRsnLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> createWkRsnLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkRsn_DelChk01 aWkRsn_DelChk01;

	protected void initWkRsn_DelChk01() {
		this.info = PDef.MA_MABCL0033_WkRsn_DelChk01_INFO;
		this.aWkRsn_DelChk01 = ((MABCL_MultiReg)this).new WkRsn_DelChk01();
	}

	public static MABCL_MultiReg.WkRsn_DelChk01 crtWkRsn_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkRsn_DelChk01();
		return lgc.aWkRsn_DelChk01;
	}

	protected void paramWkRsn_DelChk01(MCParam p) {
		if (this.aWkRsn_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkRsn_DelChk01.up0());
	}

	protected void doWkRsn_DelChk01() {
		aWkRsn_DelChk01.call();
	};

	/**
	 * WkRsn_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR createWkRsn_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.create();
	}

	/**
	 * WkRsn_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> createWkRsn_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkRsn_Del01 aWkRsn_Del01;

	protected void initWkRsn_Del01() {
		this.info = PDef.MA_MABCL0033_WkRsn_Del01_INFO;
		this.aWkRsn_Del01 = ((MABCL_MultiReg)this).new WkRsn_Del01();
	}

	public static MABCL_MultiReg.WkRsn_Del01 crtWkRsn_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkRsn_Del01();
		return lgc.aWkRsn_Del01;
	}

	protected void paramWkRsn_Del01(MCParam p) {
		if (this.aWkRsn_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkRsn_Del01.up0());
	}

	protected void doWkRsn_Del01() {
		aWkRsn_Del01.call();
	};

	/**
	 * WkRsn_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR createWkRsn_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.create();
	}

	/**
	 * WkRsn_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> createWkRsn_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriGrp_UpdChk01 aSlsUpriGrp_UpdChk01;

	protected void initSlsUpriGrp_UpdChk01() {
		this.info = PDef.MA_MABCL0033_SlsUpriGrp_UpdChk01_INFO;
		this.aSlsUpriGrp_UpdChk01 = ((MABCL_MultiReg)this).new SlsUpriGrp_UpdChk01();
	}

	public static MABCL_MultiReg.SlsUpriGrp_UpdChk01 crtSlsUpriGrp_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriGrp_UpdChk01();
		return lgc.aSlsUpriGrp_UpdChk01;
	}

	protected void paramSlsUpriGrp_UpdChk01(MCParam p) {
		if (this.aSlsUpriGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriGrp_UpdChk01.up0());
	}

	protected void doSlsUpriGrp_UpdChk01() {
		aSlsUpriGrp_UpdChk01.call();
	};

	/**
	 * SlsUpriGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR createSlsUpriGrp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.create();
	}

	/**
	 * SlsUpriGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> createSlsUpriGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriGrp_Upd01 aSlsUpriGrp_Upd01;

	protected void initSlsUpriGrp_Upd01() {
		this.info = PDef.MA_MABCL0033_SlsUpriGrp_Upd01_INFO;
		this.aSlsUpriGrp_Upd01 = ((MABCL_MultiReg)this).new SlsUpriGrp_Upd01();
	}

	public static MABCL_MultiReg.SlsUpriGrp_Upd01 crtSlsUpriGrp_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriGrp_Upd01();
		return lgc.aSlsUpriGrp_Upd01;
	}

	protected void paramSlsUpriGrp_Upd01(MCParam p) {
		if (this.aSlsUpriGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriGrp_Upd01.up0());
	}

	protected void doSlsUpriGrp_Upd01() {
		aSlsUpriGrp_Upd01.call();
	};

	/**
	 * SlsUpriGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR createSlsUpriGrp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.create();
	}

	/**
	 * SlsUpriGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> createSlsUpriGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriGrpLcl_UpdChk01 aSlsUpriGrpLcl_UpdChk01;

	protected void initSlsUpriGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_SlsUpriGrpLcl_UpdChk01_INFO;
		this.aSlsUpriGrpLcl_UpdChk01 = ((MABCL_MultiReg)this).new SlsUpriGrpLcl_UpdChk01();
	}

	public static MABCL_MultiReg.SlsUpriGrpLcl_UpdChk01 crtSlsUpriGrpLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriGrpLcl_UpdChk01();
		return lgc.aSlsUpriGrpLcl_UpdChk01;
	}

	protected void paramSlsUpriGrpLcl_UpdChk01(MCParam p) {
		if (this.aSlsUpriGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriGrpLcl_UpdChk01.up0());
	}

	protected void doSlsUpriGrpLcl_UpdChk01() {
		aSlsUpriGrpLcl_UpdChk01.call();
	};

	/**
	 * SlsUpriGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR createSlsUpriGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SlsUpriGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> createSlsUpriGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriGrpLcl_Upd01 aSlsUpriGrpLcl_Upd01;

	protected void initSlsUpriGrpLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_SlsUpriGrpLcl_Upd01_INFO;
		this.aSlsUpriGrpLcl_Upd01 = ((MABCL_MultiReg)this).new SlsUpriGrpLcl_Upd01();
	}

	public static MABCL_MultiReg.SlsUpriGrpLcl_Upd01 crtSlsUpriGrpLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriGrpLcl_Upd01();
		return lgc.aSlsUpriGrpLcl_Upd01;
	}

	protected void paramSlsUpriGrpLcl_Upd01(MCParam p) {
		if (this.aSlsUpriGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriGrpLcl_Upd01.up0());
	}

	protected void doSlsUpriGrpLcl_Upd01() {
		aSlsUpriGrpLcl_Upd01.call();
	};

	/**
	 * SlsUpriGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR createSlsUpriGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SlsUpriGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> createSlsUpriGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriGrp_DelChk01 aSlsUpriGrp_DelChk01;

	protected void initSlsUpriGrp_DelChk01() {
		this.info = PDef.MA_MABCL0033_SlsUpriGrp_DelChk01_INFO;
		this.aSlsUpriGrp_DelChk01 = ((MABCL_MultiReg)this).new SlsUpriGrp_DelChk01();
	}

	public static MABCL_MultiReg.SlsUpriGrp_DelChk01 crtSlsUpriGrp_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriGrp_DelChk01();
		return lgc.aSlsUpriGrp_DelChk01;
	}

	protected void paramSlsUpriGrp_DelChk01(MCParam p) {
		if (this.aSlsUpriGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriGrp_DelChk01.up0());
	}

	protected void doSlsUpriGrp_DelChk01() {
		aSlsUpriGrp_DelChk01.call();
	};

	/**
	 * SlsUpriGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR createSlsUpriGrp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.create();
	}

	/**
	 * SlsUpriGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> createSlsUpriGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriGrp_Del01 aSlsUpriGrp_Del01;

	protected void initSlsUpriGrp_Del01() {
		this.info = PDef.MA_MABCL0033_SlsUpriGrp_Del01_INFO;
		this.aSlsUpriGrp_Del01 = ((MABCL_MultiReg)this).new SlsUpriGrp_Del01();
	}

	public static MABCL_MultiReg.SlsUpriGrp_Del01 crtSlsUpriGrp_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriGrp_Del01();
		return lgc.aSlsUpriGrp_Del01;
	}

	protected void paramSlsUpriGrp_Del01(MCParam p) {
		if (this.aSlsUpriGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriGrp_Del01.up0());
	}

	protected void doSlsUpriGrp_Del01() {
		aSlsUpriGrp_Del01.call();
	};

	/**
	 * SlsUpriGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR createSlsUpriGrp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.create();
	}

	/**
	 * SlsUpriGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> createSlsUpriGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriRank_UpdChk01 aSlsUpriRank_UpdChk01;

	protected void initSlsUpriRank_UpdChk01() {
		this.info = PDef.MA_MABCL0033_SlsUpriRank_UpdChk01_INFO;
		this.aSlsUpriRank_UpdChk01 = ((MABCL_MultiReg)this).new SlsUpriRank_UpdChk01();
	}

	public static MABCL_MultiReg.SlsUpriRank_UpdChk01 crtSlsUpriRank_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriRank_UpdChk01();
		return lgc.aSlsUpriRank_UpdChk01;
	}

	protected void paramSlsUpriRank_UpdChk01(MCParam p) {
		if (this.aSlsUpriRank_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriRank_UpdChk01.up0());
	}

	protected void doSlsUpriRank_UpdChk01() {
		aSlsUpriRank_UpdChk01.call();
	};

	/**
	 * SlsUpriRank_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR createSlsUpriRank_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.create();
	}

	/**
	 * SlsUpriRank_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> createSlsUpriRank_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriRank_Upd01 aSlsUpriRank_Upd01;

	protected void initSlsUpriRank_Upd01() {
		this.info = PDef.MA_MABCL0033_SlsUpriRank_Upd01_INFO;
		this.aSlsUpriRank_Upd01 = ((MABCL_MultiReg)this).new SlsUpriRank_Upd01();
	}

	public static MABCL_MultiReg.SlsUpriRank_Upd01 crtSlsUpriRank_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriRank_Upd01();
		return lgc.aSlsUpriRank_Upd01;
	}

	protected void paramSlsUpriRank_Upd01(MCParam p) {
		if (this.aSlsUpriRank_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriRank_Upd01.up0());
	}

	protected void doSlsUpriRank_Upd01() {
		aSlsUpriRank_Upd01.call();
	};

	/**
	 * SlsUpriRank_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR createSlsUpriRank_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.create();
	}

	/**
	 * SlsUpriRank_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> createSlsUpriRank_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriRankLcl_UpdChk01 aSlsUpriRankLcl_UpdChk01;

	protected void initSlsUpriRankLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_SlsUpriRankLcl_UpdChk01_INFO;
		this.aSlsUpriRankLcl_UpdChk01 = ((MABCL_MultiReg)this).new SlsUpriRankLcl_UpdChk01();
	}

	public static MABCL_MultiReg.SlsUpriRankLcl_UpdChk01 crtSlsUpriRankLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriRankLcl_UpdChk01();
		return lgc.aSlsUpriRankLcl_UpdChk01;
	}

	protected void paramSlsUpriRankLcl_UpdChk01(MCParam p) {
		if (this.aSlsUpriRankLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriRankLcl_UpdChk01.up0());
	}

	protected void doSlsUpriRankLcl_UpdChk01() {
		aSlsUpriRankLcl_UpdChk01.call();
	};

	/**
	 * SlsUpriRankLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR createSlsUpriRankLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SlsUpriRankLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> createSlsUpriRankLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriRankLcl_Upd01 aSlsUpriRankLcl_Upd01;

	protected void initSlsUpriRankLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_SlsUpriRankLcl_Upd01_INFO;
		this.aSlsUpriRankLcl_Upd01 = ((MABCL_MultiReg)this).new SlsUpriRankLcl_Upd01();
	}

	public static MABCL_MultiReg.SlsUpriRankLcl_Upd01 crtSlsUpriRankLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriRankLcl_Upd01();
		return lgc.aSlsUpriRankLcl_Upd01;
	}

	protected void paramSlsUpriRankLcl_Upd01(MCParam p) {
		if (this.aSlsUpriRankLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriRankLcl_Upd01.up0());
	}

	protected void doSlsUpriRankLcl_Upd01() {
		aSlsUpriRankLcl_Upd01.call();
	};

	/**
	 * SlsUpriRankLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR createSlsUpriRankLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SlsUpriRankLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> createSlsUpriRankLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriRank_DelChk01 aSlsUpriRank_DelChk01;

	protected void initSlsUpriRank_DelChk01() {
		this.info = PDef.MA_MABCL0033_SlsUpriRank_DelChk01_INFO;
		this.aSlsUpriRank_DelChk01 = ((MABCL_MultiReg)this).new SlsUpriRank_DelChk01();
	}

	public static MABCL_MultiReg.SlsUpriRank_DelChk01 crtSlsUpriRank_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriRank_DelChk01();
		return lgc.aSlsUpriRank_DelChk01;
	}

	protected void paramSlsUpriRank_DelChk01(MCParam p) {
		if (this.aSlsUpriRank_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriRank_DelChk01.up0());
	}

	protected void doSlsUpriRank_DelChk01() {
		aSlsUpriRank_DelChk01.call();
	};

	/**
	 * SlsUpriRank_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR createSlsUpriRank_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.create();
	}

	/**
	 * SlsUpriRank_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> createSlsUpriRank_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlsUpriRank_Del01 aSlsUpriRank_Del01;

	protected void initSlsUpriRank_Del01() {
		this.info = PDef.MA_MABCL0033_SlsUpriRank_Del01_INFO;
		this.aSlsUpriRank_Del01 = ((MABCL_MultiReg)this).new SlsUpriRank_Del01();
	}

	public static MABCL_MultiReg.SlsUpriRank_Del01 crtSlsUpriRank_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlsUpriRank_Del01();
		return lgc.aSlsUpriRank_Del01;
	}

	protected void paramSlsUpriRank_Del01(MCParam p) {
		if (this.aSlsUpriRank_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsUpriRank_Del01.up0());
	}

	protected void doSlsUpriRank_Del01() {
		aSlsUpriRank_Del01.call();
	};

	/**
	 * SlsUpriRank_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR createSlsUpriRank_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.create();
	}

	/**
	 * SlsUpriRank_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> createSlsUpriRank_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SetoffGrp_UpdChk01 aSetoffGrp_UpdChk01;

	protected void initSetoffGrp_UpdChk01() {
		this.info = PDef.MA_MABCL0033_SetoffGrp_UpdChk01_INFO;
		this.aSetoffGrp_UpdChk01 = ((MABCL_MultiReg)this).new SetoffGrp_UpdChk01();
	}

	public static MABCL_MultiReg.SetoffGrp_UpdChk01 crtSetoffGrp_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSetoffGrp_UpdChk01();
		return lgc.aSetoffGrp_UpdChk01;
	}

	protected void paramSetoffGrp_UpdChk01(MCParam p) {
		if (this.aSetoffGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSetoffGrp_UpdChk01.up0());
	}

	protected void doSetoffGrp_UpdChk01() {
		aSetoffGrp_UpdChk01.call();
	};

	/**
	 * SetoffGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR createSetoffGrp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.create();
	}

	/**
	 * SetoffGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> createSetoffGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SetoffGrp_Upd01 aSetoffGrp_Upd01;

	protected void initSetoffGrp_Upd01() {
		this.info = PDef.MA_MABCL0033_SetoffGrp_Upd01_INFO;
		this.aSetoffGrp_Upd01 = ((MABCL_MultiReg)this).new SetoffGrp_Upd01();
	}

	public static MABCL_MultiReg.SetoffGrp_Upd01 crtSetoffGrp_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSetoffGrp_Upd01();
		return lgc.aSetoffGrp_Upd01;
	}

	protected void paramSetoffGrp_Upd01(MCParam p) {
		if (this.aSetoffGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSetoffGrp_Upd01.up0());
	}

	protected void doSetoffGrp_Upd01() {
		aSetoffGrp_Upd01.call();
	};

	/**
	 * SetoffGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR createSetoffGrp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.create();
	}

	/**
	 * SetoffGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> createSetoffGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SetoffGrpLcl_UpdChk01 aSetoffGrpLcl_UpdChk01;

	protected void initSetoffGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_SetoffGrpLcl_UpdChk01_INFO;
		this.aSetoffGrpLcl_UpdChk01 = ((MABCL_MultiReg)this).new SetoffGrpLcl_UpdChk01();
	}

	public static MABCL_MultiReg.SetoffGrpLcl_UpdChk01 crtSetoffGrpLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSetoffGrpLcl_UpdChk01();
		return lgc.aSetoffGrpLcl_UpdChk01;
	}

	protected void paramSetoffGrpLcl_UpdChk01(MCParam p) {
		if (this.aSetoffGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSetoffGrpLcl_UpdChk01.up0());
	}

	protected void doSetoffGrpLcl_UpdChk01() {
		aSetoffGrpLcl_UpdChk01.call();
	};

	/**
	 * SetoffGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR createSetoffGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SetoffGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> createSetoffGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SetoffGrpLcl_Upd01 aSetoffGrpLcl_Upd01;

	protected void initSetoffGrpLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_SetoffGrpLcl_Upd01_INFO;
		this.aSetoffGrpLcl_Upd01 = ((MABCL_MultiReg)this).new SetoffGrpLcl_Upd01();
	}

	public static MABCL_MultiReg.SetoffGrpLcl_Upd01 crtSetoffGrpLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSetoffGrpLcl_Upd01();
		return lgc.aSetoffGrpLcl_Upd01;
	}

	protected void paramSetoffGrpLcl_Upd01(MCParam p) {
		if (this.aSetoffGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSetoffGrpLcl_Upd01.up0());
	}

	protected void doSetoffGrpLcl_Upd01() {
		aSetoffGrpLcl_Upd01.call();
	};

	/**
	 * SetoffGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR createSetoffGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SetoffGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> createSetoffGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SetoffGrp_DelChk01 aSetoffGrp_DelChk01;

	protected void initSetoffGrp_DelChk01() {
		this.info = PDef.MA_MABCL0033_SetoffGrp_DelChk01_INFO;
		this.aSetoffGrp_DelChk01 = ((MABCL_MultiReg)this).new SetoffGrp_DelChk01();
	}

	public static MABCL_MultiReg.SetoffGrp_DelChk01 crtSetoffGrp_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSetoffGrp_DelChk01();
		return lgc.aSetoffGrp_DelChk01;
	}

	protected void paramSetoffGrp_DelChk01(MCParam p) {
		if (this.aSetoffGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSetoffGrp_DelChk01.up0());
	}

	protected void doSetoffGrp_DelChk01() {
		aSetoffGrp_DelChk01.call();
	};

	/**
	 * SetoffGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR createSetoffGrp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.create();
	}

	/**
	 * SetoffGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> createSetoffGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SetoffGrp_Del01 aSetoffGrp_Del01;

	protected void initSetoffGrp_Del01() {
		this.info = PDef.MA_MABCL0033_SetoffGrp_Del01_INFO;
		this.aSetoffGrp_Del01 = ((MABCL_MultiReg)this).new SetoffGrp_Del01();
	}

	public static MABCL_MultiReg.SetoffGrp_Del01 crtSetoffGrp_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSetoffGrp_Del01();
		return lgc.aSetoffGrp_Del01;
	}

	protected void paramSetoffGrp_Del01(MCParam p) {
		if (this.aSetoffGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSetoffGrp_Del01.up0());
	}

	protected void doSetoffGrp_Del01() {
		aSetoffGrp_Del01.call();
	};

	/**
	 * SetoffGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR createSetoffGrp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.create();
	}

	/**
	 * SetoffGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> createSetoffGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipValid_UpdChk01 aShipValid_UpdChk01;

	protected void initShipValid_UpdChk01() {
		this.info = PDef.MA_MABCL0033_ShipValid_UpdChk01_INFO;
		this.aShipValid_UpdChk01 = ((MABCL_MultiReg)this).new ShipValid_UpdChk01();
	}

	public static MABCL_MultiReg.ShipValid_UpdChk01 crtShipValid_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipValid_UpdChk01();
		return lgc.aShipValid_UpdChk01;
	}

	protected void paramShipValid_UpdChk01(MCParam p) {
		if (this.aShipValid_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipValid_UpdChk01.up0());
	}

	protected void doShipValid_UpdChk01() {
		aShipValid_UpdChk01.call();
	};

	/**
	 * ShipValid_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR createShipValid_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.create();
	}

	/**
	 * ShipValid_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> createShipValid_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipValid_Upd01 aShipValid_Upd01;

	protected void initShipValid_Upd01() {
		this.info = PDef.MA_MABCL0033_ShipValid_Upd01_INFO;
		this.aShipValid_Upd01 = ((MABCL_MultiReg)this).new ShipValid_Upd01();
	}

	public static MABCL_MultiReg.ShipValid_Upd01 crtShipValid_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipValid_Upd01();
		return lgc.aShipValid_Upd01;
	}

	protected void paramShipValid_Upd01(MCParam p) {
		if (this.aShipValid_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipValid_Upd01.up0());
	}

	protected void doShipValid_Upd01() {
		aShipValid_Upd01.call();
	};

	/**
	 * ShipValid_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR createShipValid_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.create();
	}

	/**
	 * ShipValid_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> createShipValid_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipValidLcl_UpdChk01 aShipValidLcl_UpdChk01;

	protected void initShipValidLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_ShipValidLcl_UpdChk01_INFO;
		this.aShipValidLcl_UpdChk01 = ((MABCL_MultiReg)this).new ShipValidLcl_UpdChk01();
	}

	public static MABCL_MultiReg.ShipValidLcl_UpdChk01 crtShipValidLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipValidLcl_UpdChk01();
		return lgc.aShipValidLcl_UpdChk01;
	}

	protected void paramShipValidLcl_UpdChk01(MCParam p) {
		if (this.aShipValidLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipValidLcl_UpdChk01.up0());
	}

	protected void doShipValidLcl_UpdChk01() {
		aShipValidLcl_UpdChk01.call();
	};

	/**
	 * ShipValidLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR createShipValidLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ShipValidLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> createShipValidLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipValidLcl_Upd01 aShipValidLcl_Upd01;

	protected void initShipValidLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_ShipValidLcl_Upd01_INFO;
		this.aShipValidLcl_Upd01 = ((MABCL_MultiReg)this).new ShipValidLcl_Upd01();
	}

	public static MABCL_MultiReg.ShipValidLcl_Upd01 crtShipValidLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipValidLcl_Upd01();
		return lgc.aShipValidLcl_Upd01;
	}

	protected void paramShipValidLcl_Upd01(MCParam p) {
		if (this.aShipValidLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipValidLcl_Upd01.up0());
	}

	protected void doShipValidLcl_Upd01() {
		aShipValidLcl_Upd01.call();
	};

	/**
	 * ShipValidLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR createShipValidLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ShipValidLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> createShipValidLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipValid_DelChk01 aShipValid_DelChk01;

	protected void initShipValid_DelChk01() {
		this.info = PDef.MA_MABCL0033_ShipValid_DelChk01_INFO;
		this.aShipValid_DelChk01 = ((MABCL_MultiReg)this).new ShipValid_DelChk01();
	}

	public static MABCL_MultiReg.ShipValid_DelChk01 crtShipValid_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipValid_DelChk01();
		return lgc.aShipValid_DelChk01;
	}

	protected void paramShipValid_DelChk01(MCParam p) {
		if (this.aShipValid_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipValid_DelChk01.up0());
	}

	protected void doShipValid_DelChk01() {
		aShipValid_DelChk01.call();
	};

	/**
	 * ShipValid_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR createShipValid_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.create();
	}

	/**
	 * ShipValid_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> createShipValid_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipValid_Del01 aShipValid_Del01;

	protected void initShipValid_Del01() {
		this.info = PDef.MA_MABCL0033_ShipValid_Del01_INFO;
		this.aShipValid_Del01 = ((MABCL_MultiReg)this).new ShipValid_Del01();
	}

	public static MABCL_MultiReg.ShipValid_Del01 crtShipValid_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipValid_Del01();
		return lgc.aShipValid_Del01;
	}

	protected void paramShipValid_Del01(MCParam p) {
		if (this.aShipValid_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipValid_Del01.up0());
	}

	protected void doShipValid_Del01() {
		aShipValid_Del01.call();
	};

	/**
	 * ShipValid_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR createShipValid_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.create();
	}

	/**
	 * ShipValid_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> createShipValid_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmShipGrp_UpdChk01 aItmShipGrp_UpdChk01;

	protected void initItmShipGrp_UpdChk01() {
		this.info = PDef.MA_MABCL0033_ItmShipGrp_UpdChk01_INFO;
		this.aItmShipGrp_UpdChk01 = ((MABCL_MultiReg)this).new ItmShipGrp_UpdChk01();
	}

	public static MABCL_MultiReg.ItmShipGrp_UpdChk01 crtItmShipGrp_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmShipGrp_UpdChk01();
		return lgc.aItmShipGrp_UpdChk01;
	}

	protected void paramItmShipGrp_UpdChk01(MCParam p) {
		if (this.aItmShipGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmShipGrp_UpdChk01.up0());
	}

	protected void doItmShipGrp_UpdChk01() {
		aItmShipGrp_UpdChk01.call();
	};

	/**
	 * ItmShipGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR createItmShipGrp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.create();
	}

	/**
	 * ItmShipGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> createItmShipGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmShipGrp_Upd01 aItmShipGrp_Upd01;

	protected void initItmShipGrp_Upd01() {
		this.info = PDef.MA_MABCL0033_ItmShipGrp_Upd01_INFO;
		this.aItmShipGrp_Upd01 = ((MABCL_MultiReg)this).new ItmShipGrp_Upd01();
	}

	public static MABCL_MultiReg.ItmShipGrp_Upd01 crtItmShipGrp_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmShipGrp_Upd01();
		return lgc.aItmShipGrp_Upd01;
	}

	protected void paramItmShipGrp_Upd01(MCParam p) {
		if (this.aItmShipGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmShipGrp_Upd01.up0());
	}

	protected void doItmShipGrp_Upd01() {
		aItmShipGrp_Upd01.call();
	};

	/**
	 * ItmShipGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR createItmShipGrp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.create();
	}

	/**
	 * ItmShipGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> createItmShipGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmShipGrpLcl_UpdChk01 aItmShipGrpLcl_UpdChk01;

	protected void initItmShipGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_ItmShipGrpLcl_UpdChk01_INFO;
		this.aItmShipGrpLcl_UpdChk01 = ((MABCL_MultiReg)this).new ItmShipGrpLcl_UpdChk01();
	}

	public static MABCL_MultiReg.ItmShipGrpLcl_UpdChk01 crtItmShipGrpLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmShipGrpLcl_UpdChk01();
		return lgc.aItmShipGrpLcl_UpdChk01;
	}

	protected void paramItmShipGrpLcl_UpdChk01(MCParam p) {
		if (this.aItmShipGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmShipGrpLcl_UpdChk01.up0());
	}

	protected void doItmShipGrpLcl_UpdChk01() {
		aItmShipGrpLcl_UpdChk01.call();
	};

	/**
	 * ItmShipGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR createItmShipGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmShipGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> createItmShipGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmShipGrpLcl_Upd01 aItmShipGrpLcl_Upd01;

	protected void initItmShipGrpLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_ItmShipGrpLcl_Upd01_INFO;
		this.aItmShipGrpLcl_Upd01 = ((MABCL_MultiReg)this).new ItmShipGrpLcl_Upd01();
	}

	public static MABCL_MultiReg.ItmShipGrpLcl_Upd01 crtItmShipGrpLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmShipGrpLcl_Upd01();
		return lgc.aItmShipGrpLcl_Upd01;
	}

	protected void paramItmShipGrpLcl_Upd01(MCParam p) {
		if (this.aItmShipGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmShipGrpLcl_Upd01.up0());
	}

	protected void doItmShipGrpLcl_Upd01() {
		aItmShipGrpLcl_Upd01.call();
	};

	/**
	 * ItmShipGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR createItmShipGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmShipGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> createItmShipGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmShipGrp_DelChk01 aItmShipGrp_DelChk01;

	protected void initItmShipGrp_DelChk01() {
		this.info = PDef.MA_MABCL0033_ItmShipGrp_DelChk01_INFO;
		this.aItmShipGrp_DelChk01 = ((MABCL_MultiReg)this).new ItmShipGrp_DelChk01();
	}

	public static MABCL_MultiReg.ItmShipGrp_DelChk01 crtItmShipGrp_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmShipGrp_DelChk01();
		return lgc.aItmShipGrp_DelChk01;
	}

	protected void paramItmShipGrp_DelChk01(MCParam p) {
		if (this.aItmShipGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmShipGrp_DelChk01.up0());
	}

	protected void doItmShipGrp_DelChk01() {
		aItmShipGrp_DelChk01.call();
	};

	/**
	 * ItmShipGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR createItmShipGrp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.create();
	}

	/**
	 * ItmShipGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> createItmShipGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmShipGrp_Del01 aItmShipGrp_Del01;

	protected void initItmShipGrp_Del01() {
		this.info = PDef.MA_MABCL0033_ItmShipGrp_Del01_INFO;
		this.aItmShipGrp_Del01 = ((MABCL_MultiReg)this).new ItmShipGrp_Del01();
	}

	public static MABCL_MultiReg.ItmShipGrp_Del01 crtItmShipGrp_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmShipGrp_Del01();
		return lgc.aItmShipGrp_Del01;
	}

	protected void paramItmShipGrp_Del01(MCParam p) {
		if (this.aItmShipGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmShipGrp_Del01.up0());
	}

	protected void doItmShipGrp_Del01() {
		aItmShipGrp_Del01.call();
	};

	/**
	 * ItmShipGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR createItmShipGrp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.create();
	}

	/**
	 * ItmShipGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> createItmShipGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Trnspt_UpdChk01 aTrnspt_UpdChk01;

	protected void initTrnspt_UpdChk01() {
		this.info = PDef.MA_MABCL0033_Trnspt_UpdChk01_INFO;
		this.aTrnspt_UpdChk01 = ((MABCL_MultiReg)this).new Trnspt_UpdChk01();
	}

	public static MABCL_MultiReg.Trnspt_UpdChk01 crtTrnspt_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrnspt_UpdChk01();
		return lgc.aTrnspt_UpdChk01;
	}

	protected void paramTrnspt_UpdChk01(MCParam p) {
		if (this.aTrnspt_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrnspt_UpdChk01.up0());
	}

	protected void doTrnspt_UpdChk01() {
		aTrnspt_UpdChk01.call();
	};

	/**
	 * Trnspt_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR createTrnspt_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.create();
	}

	/**
	 * Trnspt_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> createTrnspt_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Trnspt_Upd01 aTrnspt_Upd01;

	protected void initTrnspt_Upd01() {
		this.info = PDef.MA_MABCL0033_Trnspt_Upd01_INFO;
		this.aTrnspt_Upd01 = ((MABCL_MultiReg)this).new Trnspt_Upd01();
	}

	public static MABCL_MultiReg.Trnspt_Upd01 crtTrnspt_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrnspt_Upd01();
		return lgc.aTrnspt_Upd01;
	}

	protected void paramTrnspt_Upd01(MCParam p) {
		if (this.aTrnspt_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrnspt_Upd01.up0());
	}

	protected void doTrnspt_Upd01() {
		aTrnspt_Upd01.call();
	};

	/**
	 * Trnspt_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR createTrnspt_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.create();
	}

	/**
	 * Trnspt_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> createTrnspt_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.TrnsptLcl_UpdChk01 aTrnsptLcl_UpdChk01;

	protected void initTrnsptLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0033_TrnsptLcl_UpdChk01_INFO;
		this.aTrnsptLcl_UpdChk01 = ((MABCL_MultiReg)this).new TrnsptLcl_UpdChk01();
	}

	public static MABCL_MultiReg.TrnsptLcl_UpdChk01 crtTrnsptLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrnsptLcl_UpdChk01();
		return lgc.aTrnsptLcl_UpdChk01;
	}

	protected void paramTrnsptLcl_UpdChk01(MCParam p) {
		if (this.aTrnsptLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrnsptLcl_UpdChk01.up0());
	}

	protected void doTrnsptLcl_UpdChk01() {
		aTrnsptLcl_UpdChk01.call();
	};

	/**
	 * TrnsptLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR createTrnsptLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.create();
	}

	/**
	 * TrnsptLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> createTrnsptLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.TrnsptLcl_Upd01 aTrnsptLcl_Upd01;

	protected void initTrnsptLcl_Upd01() {
		this.info = PDef.MA_MABCL0033_TrnsptLcl_Upd01_INFO;
		this.aTrnsptLcl_Upd01 = ((MABCL_MultiReg)this).new TrnsptLcl_Upd01();
	}

	public static MABCL_MultiReg.TrnsptLcl_Upd01 crtTrnsptLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrnsptLcl_Upd01();
		return lgc.aTrnsptLcl_Upd01;
	}

	protected void paramTrnsptLcl_Upd01(MCParam p) {
		if (this.aTrnsptLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrnsptLcl_Upd01.up0());
	}

	protected void doTrnsptLcl_Upd01() {
		aTrnsptLcl_Upd01.call();
	};

	/**
	 * TrnsptLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR createTrnsptLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.create();
	}

	/**
	 * TrnsptLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> createTrnsptLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Trnspt_DelChk01 aTrnspt_DelChk01;

	protected void initTrnspt_DelChk01() {
		this.info = PDef.MA_MABCL0033_Trnspt_DelChk01_INFO;
		this.aTrnspt_DelChk01 = ((MABCL_MultiReg)this).new Trnspt_DelChk01();
	}

	public static MABCL_MultiReg.Trnspt_DelChk01 crtTrnspt_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrnspt_DelChk01();
		return lgc.aTrnspt_DelChk01;
	}

	protected void paramTrnspt_DelChk01(MCParam p) {
		if (this.aTrnspt_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrnspt_DelChk01.up0());
	}

	protected void doTrnspt_DelChk01() {
		aTrnspt_DelChk01.call();
	};

	/**
	 * Trnspt_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR createTrnspt_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.create();
	}

	/**
	 * Trnspt_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> createTrnspt_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Trnspt_Del01 aTrnspt_Del01;

	protected void initTrnspt_Del01() {
		this.info = PDef.MA_MABCL0033_Trnspt_Del01_INFO;
		this.aTrnspt_Del01 = ((MABCL_MultiReg)this).new Trnspt_Del01();
	}

	public static MABCL_MultiReg.Trnspt_Del01 crtTrnspt_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrnspt_Del01();
		return lgc.aTrnspt_Del01;
	}

	protected void paramTrnspt_Del01(MCParam p) {
		if (this.aTrnspt_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrnspt_Del01.up0());
	}

	protected void doTrnspt_Del01() {
		aTrnspt_Del01.call();
	};

	/**
	 * Trnspt_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR createTrnspt_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.create();
	}

	/**
	 * Trnspt_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> createTrnspt_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Wg_UpdChk01オペレーション.<p>
	 *
	 * ＷＧマスタの登録前のチェックを行います。<br>
	 */
	abstract public class Wg_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Wg_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Wg_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.class);

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
		 * Wg_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR createWg_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.create();
		}

		/**
		 * Wg_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> createWg_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_flg</td></tr>
		 * 	<tr><td><br></td><td>sd_flg</td></tr>
		 * 	<tr><td><br></td><td>mrp_prefix</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>not_xfr_flg</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>plm_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_seq</td></tr>
		 * 	<tr><td><br></td><td>cmn_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Wg_Upd01オペレーション.<p>
	 *
	 * ＷＧマスタの登録を行います。<br>
	 */
	abstract public class Wg_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Wg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WG_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WG_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WG_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WG_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_WG_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WG_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WG_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WG_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WG_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_WG_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Wg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_WG_R.create("T1"));
			chkMaster = MCController.create(MAM_WG_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_WG_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_WG_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WG_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_WG_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Wg_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR createWg_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.create();
		}

		/**
		 * Wg_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> createWg_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_flg</td></tr>
		 * 	<tr><td><br></td><td>sd_flg</td></tr>
		 * 	<tr><td><br></td><td>mrp_prefix</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>not_xfr_flg</td></tr>
		 * 	<tr><td><br></td><td>mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>plm_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_seq</td></tr>
		 * 	<tr><td><br></td><td>cmn_upri_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WG_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> src_Wg_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Wg_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("lg_flg", "lg_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("ar_flg", "ar_flg");
				addColumnPathMap("ap_flg", "ap_flg");
				addColumnPathMap("sd_flg", "sd_flg");
				addColumnPathMap("mrp_prefix", "mrp_prefix");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("not_xfr_flg", "not_xfr_flg");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("plm_flg", "plm_flg");
				addColumnPathMap("calc_seq", "calc_seq");
				addColumnPathMap("cmn_upri_flg", "cmn_upri_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_WG_R r_dest, mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_WG_R> dest, MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR r_src : src){
				MAM_WG_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_WG_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> src_Wg_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Wg_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("sls_flg", "sls_flg");
				addColumnPathMap("lg_flg", "lg_flg");
				addColumnPathMap("mfg_flg", "mfg_flg");
				addColumnPathMap("purc_flg", "purc_flg");
				addColumnPathMap("ar_flg", "ar_flg");
				addColumnPathMap("ap_flg", "ap_flg");
				addColumnPathMap("sd_flg", "sd_flg");
				addColumnPathMap("mrp_prefix", "mrp_prefix");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mrp_proc_typ", "mrp_proc_typ");
				addColumnPathMap("alloc_margin_days", "alloc_margin_days");
				addColumnPathMap("not_xfr_flg", "not_xfr_flg");
				addColumnPathMap("mrp_alloc_margin_days", "mrp_alloc_margin_days");
				addColumnPathMap("mrp_opn_xfr_days", "mrp_opn_xfr_days");
				addColumnPathMap("rqmt_typ", "rqmt_typ");
				addColumnPathMap("prod_pln_typ", "prod_pln_typ");
				addColumnPathMap("dmnd_date_div_mons", "dmnd_date_div_mons");
				addColumnPathMap("plm_flg", "plm_flg");
				addColumnPathMap("calc_seq", "calc_seq");
				addColumnPathMap("cmn_upri_flg", "cmn_upri_flg");
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
		protected void up_MAIN_chkMaster_0(MAM_WG_R r_dest, mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_WG_R> dest, MCList<mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.Wg_UpdChk01_DtlR r_src : src){
				MAM_WG_R r_dest = dest.createRow();
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
	 * WgLcl_UpdChk01オペレーション.<p>
	 *
	 * ＷＧマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class WgLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WgLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WG_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WG_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WG_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WG_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_WG_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WgLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_WG_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_WG_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_WG_R&gt; （{@link #chk01_up0}）<br>
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
		 * WgLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR createWgLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.create();
		}

		/**
		 * WgLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> createWgLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_WG_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> src_WgLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_WgLcl_UpdChk01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_WG_R r_dest, mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_WG_R> dest, MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR r_src : src){
				MAM_WG_R r_dest = dest.createRow();
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
	 * WgLcl_Upd01オペレーション.<p>
	 *
	 * ＷＧマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class WgLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WgLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WG_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WG_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WG_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WG_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_WG_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WG_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WG_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WG_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WG_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_WG_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WgLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_WG_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_WG_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_WG_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_WG_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WG_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_WG_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * WgLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR createWgLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.create();
		}

		/**
		 * WgLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> createWgLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WG_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> src_WgLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_WgLcl_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("wg_nm", "wg_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_WG_LCL_R r_dest, mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_WG_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR r_src : src){
				MAM_WG_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_WG_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> src_WgLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_WgLcl_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("wg_nm", "wg_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_WG_LCL_R r_dest, mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_WG_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.WgLcl_UpdChk01_DtlR r_src : src){
				MAM_WG_LCL_R r_dest = dest.createRow();
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
	 * Wg_DelChk01オペレーション.<p>
	 *
	 * ＷＧマスタの削除前のチェックを行います。<br>
	 */
	abstract public class Wg_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Wg_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Wg_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.class);

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
		 * Wg_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR createWg_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.create();
		}

		/**
		 * Wg_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> createWg_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Wg_Del01オペレーション.<p>
	 *
	 * ＷＧマスタの削除を行います。<br>
	 */
	abstract public class Wg_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Wg_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WG_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_WG_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WG_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WG_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WG_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WG_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WG_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WG_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_WG_R> updMaster1_up0;
		public final MCList<MAM_WG_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Wg_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_WG_R.create("T1"));
			updMaster2 = MCController.create(MAM_WG_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_WG_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_WG_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WG_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_WG_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Wg_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR createWg_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.create();
		}

		/**
		 * Wg_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> createWg_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WG_R> dest0_0, MCList<MAM_WG_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> src_Wg_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Wg_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Wg_Del01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_WG_R r_dest, mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_WG_R> dest, MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR r_src : src){
				MAM_WG_R r_dest = dest.createRow();
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
				addColumnPathMap("wg_cd", "wg_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_WG_LCL_R r_dest, mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_WG_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.Wg_DelChk01_DtlR r_src : src){
				MAM_WG_LCL_R r_dest = dest.createRow();
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
	 * Oper_UpdChk01オペレーション.<p>
	 *
	 * 工程マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Oper_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Oper_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Oper_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.class);

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
		 * Oper_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR createOper_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.create();
		}

		/**
		 * Oper_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> createOper_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Oper_Upd01オペレーション.<p>
	 *
	 * 工程マスタの登録を行います。<br>
	 */
	abstract public class Oper_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Oper_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_OPER_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_OPER_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_OPER_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_OPER_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_OPER_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_OPER_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Oper_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_OPER_R.create("T1"));
			chkMaster = MCController.create(MAM_OPER_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_OPER_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_OPER_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_OPER_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_OPER_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Oper_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR createOper_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.create();
		}

		/**
		 * Oper_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> createOper_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_OPER_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> src_Oper_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Oper_Upd01_Dtl);
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
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_alc_grp", "oper_alc_grp");
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
		protected void up_UPDATE_updMaster_0(MAM_OPER_R r_dest, mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_OPER_R> dest, MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR r_src : src){
				MAM_OPER_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_OPER_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> src_Oper_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Oper_Upd01_Dtl);
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
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_alc_grp", "oper_alc_grp");
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
		protected void up_MAIN_chkMaster_0(MAM_OPER_R r_dest, mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_OPER_R> dest, MCList<mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.Oper_UpdChk01_DtlR r_src : src){
				MAM_OPER_R r_dest = dest.createRow();
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
	 * OperLcl_UpdChk01オペレーション.<p>
	 *
	 * 工程マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class OperLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OperLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_OPER_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_OPER_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_OPER_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected OperLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_OPER_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_OPER_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_OPER_R&gt; （{@link #chk01_up0}）<br>
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
		 * OperLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR createOperLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.create();
		}

		/**
		 * OperLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> createOperLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_OPER_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> src_OperLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_OperLcl_UpdChk01_Dtl);
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
				addColumnPathMap("oper_cd", "oper_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_OPER_R r_dest, mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_OPER_R> dest, MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR r_src : src){
				MAM_OPER_R r_dest = dest.createRow();
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
	 * OperLcl_Upd01オペレーション.<p>
	 *
	 * 工程マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class OperLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OperLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_OPER_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_OPER_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_OPER_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_OPER_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_OPER_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_OPER_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected OperLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_OPER_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_OPER_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_OPER_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_OPER_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_OPER_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_OPER_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * OperLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR createOperLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.create();
		}

		/**
		 * OperLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> createOperLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_OPER_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> src_OperLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_OperLcl_Upd01_Dtl);
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
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("oper_nm", "oper_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_OPER_LCL_R r_dest, mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_OPER_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR r_src : src){
				MAM_OPER_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_OPER_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> src_OperLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_OperLcl_Upd01_Dtl);
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
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("oper_nm", "oper_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_OPER_LCL_R r_dest, mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_OPER_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.OperLcl_UpdChk01_DtlR r_src : src){
				MAM_OPER_LCL_R r_dest = dest.createRow();
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
	 * Oper_DelChk01オペレーション.<p>
	 *
	 * 工程マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Oper_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Oper_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Oper_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.class);

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
		 * Oper_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR createOper_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.create();
		}

		/**
		 * Oper_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> createOper_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Oper_Del01オペレーション.<p>
	 *
	 * 工程マスタの削除を行います。<br>
	 */
	abstract public class Oper_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Oper_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_OPER_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_OPER_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_OPER_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_OPER_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_OPER_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_OPER_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_OPER_R> updMaster1_up0;
		public final MCList<MAM_OPER_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Oper_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_OPER_R.create("T1"));
			updMaster2 = MCController.create(MAM_OPER_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_OPER_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_OPER_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_OPER_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_OPER_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Oper_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR createOper_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.create();
		}

		/**
		 * Oper_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> createOper_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_OPER_R> dest0_0, MCList<MAM_OPER_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> src_Oper_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Oper_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Oper_Del01_Dtl);
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
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_OPER_R r_dest, mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_OPER_R> dest, MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR r_src : src){
				MAM_OPER_R r_dest = dest.createRow();
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
				addColumnPathMap("oper_cd", "oper_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_OPER_LCL_R r_dest, mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_OPER_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.Oper_DelChk01_DtlR r_src : src){
				MAM_OPER_LCL_R r_dest = dest.createRow();
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
	 * WkCost_UpdChk01オペレーション.<p>
	 *
	 * 工数管理マスタの登録前のチェックを行います。<br>
	 */
	abstract public class WkCost_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkCost_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected WkCost_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.class);

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
		 * WkCost_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR createWkCost_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.create();
		}

		/**
		 * WkCost_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> createWkCost_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * WkCost_Upd01オペレーション.<p>
	 *
	 * 工数管理マスタの登録を行います。<br>
	 */
	abstract public class WkCost_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkCost_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_COST_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_COST_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_COST_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_COST_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_COST_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_COST_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_COST_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_COST_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_COST_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_COST_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkCost_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_WK_COST_R.create("T1"));
			chkMaster = MCController.create(MAM_WK_COST_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_WK_COST_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_WK_COST_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WK_COST_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_WK_COST_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * WkCost_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR createWkCost_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.create();
		}

		/**
		 * WkCost_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> createWkCost_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WK_COST_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> src_WkCost_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_WkCost_Upd01_Dtl);
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
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_WK_COST_R r_dest, mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_WK_COST_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR r_src : src){
				MAM_WK_COST_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_WK_COST_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> src_WkCost_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_WkCost_Upd01_Dtl);
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
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_WK_COST_R r_dest, mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_WK_COST_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.WkCost_UpdChk01_DtlR r_src : src){
				MAM_WK_COST_R r_dest = dest.createRow();
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
	 * WkCostLcl_UpdChk01オペレーション.<p>
	 *
	 * 工数管理マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class WkCostLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkCostLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_COST_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_COST_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_COST_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_COST_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_WK_COST_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkCostLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_WK_COST_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_WK_COST_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_WK_COST_R&gt; （{@link #chk01_up0}）<br>
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
		 * WkCostLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR createWkCostLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.create();
		}

		/**
		 * WkCostLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> createWkCostLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_WK_COST_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> src_WkCostLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_WkCostLcl_UpdChk01_Dtl);
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
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_WK_COST_R r_dest, mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_WK_COST_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR r_src : src){
				MAM_WK_COST_R r_dest = dest.createRow();
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
	 * WkCostLcl_Upd01オペレーション.<p>
	 *
	 * 工数管理マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class WkCostLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkCostLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_COST_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_COST_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_COST_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_COST_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_COST_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_COST_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_COST_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_COST_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_COST_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_COST_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkCostLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_WK_COST_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_WK_COST_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_WK_COST_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_WK_COST_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WK_COST_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_WK_COST_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * WkCostLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR createWkCostLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.create();
		}

		/**
		 * WkCostLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> createWkCostLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WK_COST_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> src_WkCostLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_WkCostLcl_Upd01_Dtl);
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
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_WK_COST_LCL_R r_dest, mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_WK_COST_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR r_src : src){
				MAM_WK_COST_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_WK_COST_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> src_WkCostLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_WkCostLcl_Upd01_Dtl);
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
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_WK_COST_LCL_R r_dest, mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_WK_COST_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.WkCostLcl_UpdChk01_DtlR r_src : src){
				MAM_WK_COST_LCL_R r_dest = dest.createRow();
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
	 * WkCost_DelChk01オペレーション.<p>
	 *
	 * 工数管理マスタの削除前のチェックを行います。<br>
	 */
	abstract public class WkCost_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkCost_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected WkCost_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.class);

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
		 * WkCost_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR createWkCost_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.create();
		}

		/**
		 * WkCost_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> createWkCost_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * WkCost_Del01オペレーション.<p>
	 *
	 * 工数管理マスタの削除を行います。<br>
	 */
	abstract public class WkCost_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkCost_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_COST_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_WK_COST_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_COST_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_COST_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_COST_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_COST_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_COST_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_COST_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_WK_COST_R> updMaster1_up0;
		public final MCList<MAM_WK_COST_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkCost_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_WK_COST_R.create("T1"));
			updMaster2 = MCController.create(MAM_WK_COST_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_WK_COST_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_WK_COST_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WK_COST_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_WK_COST_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * WkCost_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR createWkCost_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.create();
		}

		/**
		 * WkCost_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> createWkCost_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WK_COST_R> dest0_0, MCList<MAM_WK_COST_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> src_WkCost_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_WkCost_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_WkCost_Del01_Dtl);
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
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_WK_COST_R r_dest, mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_WK_COST_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR r_src : src){
				MAM_WK_COST_R r_dest = dest.createRow();
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
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_WK_COST_LCL_R r_dest, mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_WK_COST_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.WkCost_DelChk01_DtlR r_src : src){
				MAM_WK_COST_LCL_R r_dest = dest.createRow();
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
	 * WkRsn_UpdChk01オペレーション.<p>
	 *
	 * 工数理由マスタの登録前のチェックを行います。<br>
	 */
	abstract public class WkRsn_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkRsn_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected WkRsn_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.class);

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
		 * WkRsn_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR createWkRsn_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.create();
		}

		/**
		 * WkRsn_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> createWkRsn_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * WkRsn_Upd01オペレーション.<p>
	 *
	 * 工数理由マスタの登録を行います。<br>
	 */
	abstract public class WkRsn_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkRsn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_RSN_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_RSN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_RSN_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_RSN_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_RSN_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_RSN_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_RSN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_RSN_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_RSN_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_RSN_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkRsn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_WK_RSN_R.create("T1"));
			chkMaster = MCController.create(MAM_WK_RSN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_WK_RSN_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_WK_RSN_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WK_RSN_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_WK_RSN_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * WkRsn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR createWkRsn_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.create();
		}

		/**
		 * WkRsn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> createWkRsn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WK_RSN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> src_WkRsn_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_WkRsn_Upd01_Dtl);
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
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("wk_rsn_nm", "wk_rsn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_WK_RSN_R r_dest, mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_WK_RSN_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR r_src : src){
				MAM_WK_RSN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_WK_RSN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> src_WkRsn_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_WkRsn_Upd01_Dtl);
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
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("wk_rsn_nm", "wk_rsn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_WK_RSN_R r_dest, mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_WK_RSN_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.WkRsn_UpdChk01_DtlR r_src : src){
				MAM_WK_RSN_R r_dest = dest.createRow();
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
	 * WkRsnLcl_UpdChk01オペレーション.<p>
	 *
	 * 工数理由マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class WkRsnLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkRsnLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_RSN_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_RSN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_RSN_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_RSN_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_WK_RSN_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkRsnLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_WK_RSN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_WK_RSN_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_WK_RSN_R&gt; （{@link #chk01_up0}）<br>
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
		 * WkRsnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR createWkRsnLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * WkRsnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> createWkRsnLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_WK_RSN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> src_WkRsnLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_WkRsnLcl_UpdChk01_Dtl);
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
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_WK_RSN_R r_dest, mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_WK_RSN_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR r_src : src){
				MAM_WK_RSN_R r_dest = dest.createRow();
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
	 * WkRsnLcl_Upd01オペレーション.<p>
	 *
	 * 工数理由マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class WkRsnLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkRsnLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_RSN_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_RSN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_RSN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_RSN_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_RSN_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_RSN_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_RSN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_RSN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_RSN_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_RSN_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkRsnLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_WK_RSN_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_WK_RSN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_WK_RSN_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_WK_RSN_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WK_RSN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_WK_RSN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * WkRsnLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR createWkRsnLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * WkRsnLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> createWkRsnLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WK_RSN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> src_WkRsnLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_WkRsnLcl_Upd01_Dtl);
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
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("wk_rsn_nm", "wk_rsn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_WK_RSN_LCL_R r_dest, mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_WK_RSN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR r_src : src){
				MAM_WK_RSN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_WK_RSN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> src_WkRsnLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_WkRsnLcl_Upd01_Dtl);
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
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("wk_rsn_nm", "wk_rsn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_WK_RSN_LCL_R r_dest, mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_WK_RSN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.WkRsnLcl_UpdChk01_DtlR r_src : src){
				MAM_WK_RSN_LCL_R r_dest = dest.createRow();
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
	 * WkRsn_DelChk01オペレーション.<p>
	 *
	 * 工数理由マスタの削除前のチェックを行います。<br>
	 */
	abstract public class WkRsn_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkRsn_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected WkRsn_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.class);

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
		 * WkRsn_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR createWkRsn_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.create();
		}

		/**
		 * WkRsn_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> createWkRsn_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * WkRsn_Del01オペレーション.<p>
	 *
	 * 工数理由マスタの削除を行います。<br>
	 */
	abstract public class WkRsn_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkRsn_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_RSN_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_WK_RSN_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_RSN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_RSN_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_RSN_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_RSN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_RSN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_RSN_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_WK_RSN_R> updMaster1_up0;
		public final MCList<MAM_WK_RSN_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkRsn_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_WK_RSN_R.create("T1"));
			updMaster2 = MCController.create(MAM_WK_RSN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_WK_RSN_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_WK_RSN_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WK_RSN_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_WK_RSN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * WkRsn_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR createWkRsn_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.create();
		}

		/**
		 * WkRsn_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> createWkRsn_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WK_RSN_R> dest0_0, MCList<MAM_WK_RSN_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> src_WkRsn_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_WkRsn_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_WkRsn_Del01_Dtl);
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
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_WK_RSN_R r_dest, mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_WK_RSN_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR r_src : src){
				MAM_WK_RSN_R r_dest = dest.createRow();
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
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_WK_RSN_LCL_R r_dest, mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_WK_RSN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.WkRsn_DelChk01_DtlR r_src : src){
				MAM_WK_RSN_LCL_R r_dest = dest.createRow();
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
	 * SlsUpriGrp_UpdChk01オペレーション.<p>
	 *
	 * 販売単価分類マスタの登録前のチェックを行います。<br>
	 */
	abstract public class SlsUpriGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SlsUpriGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.class);

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
		 * SlsUpriGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR createSlsUpriGrp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.create();
		}

		/**
		 * SlsUpriGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> createSlsUpriGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SlsUpriGrp_Upd01オペレーション.<p>
	 *
	 * 販売単価分類マスタの登録を行います。<br>
	 */
	abstract public class SlsUpriGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlsUpriGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SLS_UPRI_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_SLS_UPRI_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SLS_UPRI_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SLS_UPRI_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * SlsUpriGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR createSlsUpriGrp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.create();
		}

		/**
		 * SlsUpriGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> createSlsUpriGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SLS_UPRI_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> src_SlsUpriGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SlsUpriGrp_Upd01_Dtl);
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
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("sls_upri_grp_nm", "sls_upri_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SLS_UPRI_GRP_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SLS_UPRI_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SLS_UPRI_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> src_SlsUpriGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SlsUpriGrp_Upd01_Dtl);
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
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("sls_upri_grp_nm", "sls_upri_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SLS_UPRI_GRP_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SLS_UPRI_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriGrp_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_GRP_R r_dest = dest.createRow();
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
	 * SlsUpriGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 販売単価分類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class SlsUpriGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlsUpriGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SLS_UPRI_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SLS_UPRI_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #chk01_up0}）<br>
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
		 * SlsUpriGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR createSlsUpriGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SlsUpriGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> createSlsUpriGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_SLS_UPRI_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> src_SlsUpriGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_SlsUpriGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SLS_UPRI_GRP_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SLS_UPRI_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_GRP_R r_dest = dest.createRow();
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
	 * SlsUpriGrpLcl_Upd01オペレーション.<p>
	 *
	 * 販売単価分類マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class SlsUpriGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlsUpriGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SLS_UPRI_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SLS_UPRI_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SLS_UPRI_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SLS_UPRI_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * SlsUpriGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR createSlsUpriGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SlsUpriGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> createSlsUpriGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SLS_UPRI_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> src_SlsUpriGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SlsUpriGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("sls_upri_grp_nm", "sls_upri_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SLS_UPRI_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SLS_UPRI_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SLS_UPRI_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> src_SlsUpriGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SlsUpriGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("sls_upri_grp_nm", "sls_upri_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SLS_UPRI_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SLS_UPRI_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_GRP_LCL_R r_dest = dest.createRow();
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
	 * SlsUpriGrp_DelChk01オペレーション.<p>
	 *
	 * 販売単価分類マスタの削除前のチェックを行います。<br>
	 */
	abstract public class SlsUpriGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SlsUpriGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.class);

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
		 * SlsUpriGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR createSlsUpriGrp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.create();
		}

		/**
		 * SlsUpriGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> createSlsUpriGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SlsUpriGrp_Del01オペレーション.<p>
	 *
	 * 販売単価分類マスタの削除を行います。<br>
	 */
	abstract public class SlsUpriGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_GRP_R> updMaster1_up0;
		public final MCList<MAM_SLS_UPRI_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlsUpriGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_SLS_UPRI_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_SLS_UPRI_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_SLS_UPRI_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_SLS_UPRI_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * SlsUpriGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR createSlsUpriGrp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.create();
		}

		/**
		 * SlsUpriGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> createSlsUpriGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SLS_UPRI_GRP_R> dest0_0, MCList<MAM_SLS_UPRI_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> src_SlsUpriGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_SlsUpriGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_SlsUpriGrp_Del01_Dtl);
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
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_SLS_UPRI_GRP_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_SLS_UPRI_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR r_src : src){
				MAM_SLS_UPRI_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("sls_upri_grp_cd", "sls_upri_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_SLS_UPRI_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_SLS_UPRI_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriGrp_DelChk01_DtlR r_src : src){
				MAM_SLS_UPRI_GRP_LCL_R r_dest = dest.createRow();
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
	 * SlsUpriRank_UpdChk01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの登録前のチェックを行います。<br>
	 */
	abstract public class SlsUpriRank_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriRank_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SlsUpriRank_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.class);

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
		 * SlsUpriRank_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR createSlsUpriRank_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.create();
		}

		/**
		 * SlsUpriRank_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> createSlsUpriRank_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SlsUpriRank_Upd01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの登録を行います。<br>
	 */
	abstract public class SlsUpriRank_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriRank_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_RANK_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_RANK_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_RANK_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_RANK_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlsUpriRank_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SLS_UPRI_RANK_R.create("T1"));
			chkMaster = MCController.create(MAM_SLS_UPRI_RANK_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SLS_UPRI_RANK_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SLS_UPRI_RANK_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * SlsUpriRank_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR createSlsUpriRank_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.create();
		}

		/**
		 * SlsUpriRank_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> createSlsUpriRank_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SLS_UPRI_RANK_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> src_SlsUpriRank_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SlsUpriRank_Upd01_Dtl);
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
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
				addColumnPathMap("sls_upri_rank_nm", "sls_upri_rank_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SLS_UPRI_RANK_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SLS_UPRI_RANK_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_RANK_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SLS_UPRI_RANK_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> src_SlsUpriRank_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SlsUpriRank_Upd01_Dtl);
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
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
				addColumnPathMap("sls_upri_rank_nm", "sls_upri_rank_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SLS_UPRI_RANK_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SLS_UPRI_RANK_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriRank_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_RANK_R r_dest = dest.createRow();
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
	 * SlsUpriRankLcl_UpdChk01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class SlsUpriRankLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriRankLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_RANK_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_RANK_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlsUpriRankLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SLS_UPRI_RANK_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SLS_UPRI_RANK_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #chk01_up0}）<br>
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
		 * SlsUpriRankLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR createSlsUpriRankLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SlsUpriRankLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> createSlsUpriRankLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_SLS_UPRI_RANK_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> src_SlsUpriRankLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_SlsUpriRankLcl_UpdChk01_Dtl);
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
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SLS_UPRI_RANK_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SLS_UPRI_RANK_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_RANK_R r_dest = dest.createRow();
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
	 * SlsUpriRankLcl_Upd01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class SlsUpriRankLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriRankLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_RANK_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_RANK_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_RANK_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_RANK_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_RANK_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_RANK_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlsUpriRankLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SLS_UPRI_RANK_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SLS_UPRI_RANK_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SLS_UPRI_RANK_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SLS_UPRI_RANK_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_RANK_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_RANK_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * SlsUpriRankLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR createSlsUpriRankLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SlsUpriRankLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> createSlsUpriRankLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SLS_UPRI_RANK_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> src_SlsUpriRankLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SlsUpriRankLcl_Upd01_Dtl);
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
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("sls_upri_rank_nm", "sls_upri_rank_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SLS_UPRI_RANK_LCL_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SLS_UPRI_RANK_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_RANK_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SLS_UPRI_RANK_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> src_SlsUpriRankLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SlsUpriRankLcl_Upd01_Dtl);
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
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("sls_upri_rank_nm", "sls_upri_rank_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SLS_UPRI_RANK_LCL_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SLS_UPRI_RANK_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriRankLcl_UpdChk01_DtlR r_src : src){
				MAM_SLS_UPRI_RANK_LCL_R r_dest = dest.createRow();
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
	 * SlsUpriRank_DelChk01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの削除前のチェックを行います。<br>
	 */
	abstract public class SlsUpriRank_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriRank_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SlsUpriRank_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.class);

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
		 * SlsUpriRank_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR createSlsUpriRank_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.create();
		}

		/**
		 * SlsUpriRank_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> createSlsUpriRank_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SlsUpriRank_Del01オペレーション.<p>
	 *
	 * 販売単価ランクマスタの削除を行います。<br>
	 */
	abstract public class SlsUpriRank_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsUpriRank_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_RANK_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLS_UPRI_RANK_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLS_UPRI_RANK_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLS_UPRI_RANK_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_SLS_UPRI_RANK_R> updMaster1_up0;
		public final MCList<MAM_SLS_UPRI_RANK_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlsUpriRank_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_SLS_UPRI_RANK_R.create("T1"));
			updMaster2 = MCController.create(MAM_SLS_UPRI_RANK_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_SLS_UPRI_RANK_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_SLS_UPRI_RANK_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_RANK_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_SLS_UPRI_RANK_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * SlsUpriRank_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR createSlsUpriRank_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.create();
		}

		/**
		 * SlsUpriRank_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> createSlsUpriRank_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SLS_UPRI_RANK_R> dest0_0, MCList<MAM_SLS_UPRI_RANK_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> src_SlsUpriRank_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_SlsUpriRank_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_SlsUpriRank_Del01_Dtl);
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
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_SLS_UPRI_RANK_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_SLS_UPRI_RANK_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR r_src : src){
				MAM_SLS_UPRI_RANK_R r_dest = dest.createRow();
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
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_SLS_UPRI_RANK_LCL_R r_dest, mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_SLS_UPRI_RANK_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.SlsUpriRank_DelChk01_DtlR r_src : src){
				MAM_SLS_UPRI_RANK_LCL_R r_dest = dest.createRow();
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
	 * SetoffGrp_UpdChk01オペレーション.<p>
	 *
	 * 相殺グループマスタの登録前のチェックを行います。<br>
	 */
	abstract public class SetoffGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SetoffGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SetoffGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.class);

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
		 * SetoffGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR createSetoffGrp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.create();
		}

		/**
		 * SetoffGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> createSetoffGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SetoffGrp_Upd01オペレーション.<p>
	 *
	 * 相殺グループマスタの登録を行います。<br>
	 */
	abstract public class SetoffGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SetoffGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SETOFF_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SETOFF_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SETOFF_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SETOFF_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SETOFF_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SETOFF_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SETOFF_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SETOFF_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SETOFF_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SETOFF_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SetoffGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SETOFF_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_SETOFF_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SETOFF_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SETOFF_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SETOFF_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SETOFF_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * SetoffGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR createSetoffGrp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.create();
		}

		/**
		 * SetoffGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> createSetoffGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SETOFF_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> src_SetoffGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SetoffGrp_Upd01_Dtl);
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
				addColumnPathMap("setoff_grp_cd", "setoff_grp_cd");
				addColumnPathMap("setoff_grp_nm", "setoff_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SETOFF_GRP_R r_dest, mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SETOFF_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR r_src : src){
				MAM_SETOFF_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SETOFF_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> src_SetoffGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SetoffGrp_Upd01_Dtl);
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
				addColumnPathMap("setoff_grp_cd", "setoff_grp_cd");
				addColumnPathMap("setoff_grp_nm", "setoff_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SETOFF_GRP_R r_dest, mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SETOFF_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.SetoffGrp_UpdChk01_DtlR r_src : src){
				MAM_SETOFF_GRP_R r_dest = dest.createRow();
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
	 * SetoffGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 相殺グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class SetoffGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SetoffGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SETOFF_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SETOFF_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SETOFF_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SETOFF_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SETOFF_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SetoffGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SETOFF_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SETOFF_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SETOFF_GRP_R&gt; （{@link #chk01_up0}）<br>
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
		 * SetoffGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR createSetoffGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SetoffGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> createSetoffGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_SETOFF_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> src_SetoffGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_SetoffGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("setoff_grp_cd", "setoff_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SETOFF_GRP_R r_dest, mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SETOFF_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_SETOFF_GRP_R r_dest = dest.createRow();
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
	 * SetoffGrpLcl_Upd01オペレーション.<p>
	 *
	 * 相殺グループマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class SetoffGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SetoffGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SETOFF_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SETOFF_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SETOFF_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SETOFF_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SETOFF_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SETOFF_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SETOFF_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SETOFF_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SETOFF_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SETOFF_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SetoffGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SETOFF_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SETOFF_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SETOFF_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SETOFF_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SETOFF_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SETOFF_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * SetoffGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR createSetoffGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SetoffGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> createSetoffGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SETOFF_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> src_SetoffGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SetoffGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("setoff_grp_cd", "setoff_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("setoff_grp_nm", "setoff_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SETOFF_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SETOFF_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_SETOFF_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SETOFF_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> src_SetoffGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SetoffGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("setoff_grp_cd", "setoff_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("setoff_grp_nm", "setoff_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SETOFF_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SETOFF_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.SetoffGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_SETOFF_GRP_LCL_R r_dest = dest.createRow();
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
	 * SetoffGrp_DelChk01オペレーション.<p>
	 *
	 * 相殺グループマスタの削除前のチェックを行います。<br>
	 */
	abstract public class SetoffGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SetoffGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SetoffGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.class);

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
		 * SetoffGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR createSetoffGrp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.create();
		}

		/**
		 * SetoffGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> createSetoffGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SetoffGrp_Del01オペレーション.<p>
	 *
	 * 相殺グループマスタの削除を行います。<br>
	 */
	abstract public class SetoffGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SetoffGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SETOFF_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SETOFF_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SETOFF_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SETOFF_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SETOFF_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SETOFF_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SETOFF_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SETOFF_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_SETOFF_GRP_R> updMaster1_up0;
		public final MCList<MAM_SETOFF_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SetoffGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_SETOFF_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_SETOFF_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_SETOFF_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_SETOFF_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SETOFF_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_SETOFF_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * SetoffGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR createSetoffGrp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.create();
		}

		/**
		 * SetoffGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> createSetoffGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SETOFF_GRP_R> dest0_0, MCList<MAM_SETOFF_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> src_SetoffGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_SetoffGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_SetoffGrp_Del01_Dtl);
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
				addColumnPathMap("setoff_grp_cd", "setoff_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_SETOFF_GRP_R r_dest, mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_SETOFF_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR r_src : src){
				MAM_SETOFF_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("setoff_grp_cd", "setoff_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_SETOFF_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_SETOFF_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.SetoffGrp_DelChk01_DtlR r_src : src){
				MAM_SETOFF_GRP_LCL_R r_dest = dest.createRow();
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
	 * ShipValid_UpdChk01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの登録前のチェックを行います。<br>
	 */
	abstract public class ShipValid_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipValid_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipValid_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.class);

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
		 * ShipValid_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR createShipValid_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.create();
		}

		/**
		 * ShipValid_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> createShipValid_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ShipValid_Upd01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの登録を行います。<br>
	 */
	abstract public class ShipValid_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipValid_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_VALID_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_VALID_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_VALID_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_VALID_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_VALID_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_VALID_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_VALID_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_VALID_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_VALID_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_VALID_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipValid_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SHIP_VALID_R.create("T1"));
			chkMaster = MCController.create(MAM_SHIP_VALID_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SHIP_VALID_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SHIP_VALID_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SHIP_VALID_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SHIP_VALID_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ShipValid_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR createShipValid_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.create();
		}

		/**
		 * ShipValid_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> createShipValid_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SHIP_VALID_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> src_ShipValid_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ShipValid_Upd01_Dtl);
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
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("ship_valid_grp_nm", "ship_valid_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SHIP_VALID_R r_dest, mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SHIP_VALID_R> dest, MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR r_src : src){
				MAM_SHIP_VALID_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SHIP_VALID_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> src_ShipValid_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ShipValid_Upd01_Dtl);
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
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("ship_valid_grp_nm", "ship_valid_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SHIP_VALID_R r_dest, mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SHIP_VALID_R> dest, MCList<mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.ShipValid_UpdChk01_DtlR r_src : src){
				MAM_SHIP_VALID_R r_dest = dest.createRow();
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
	 * ShipValidLcl_UpdChk01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class ShipValidLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipValidLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_VALID_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_VALID_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_VALID_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_VALID_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_VALID_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipValidLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SHIP_VALID_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SHIP_VALID_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SHIP_VALID_R&gt; （{@link #chk01_up0}）<br>
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
		 * ShipValidLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR createShipValidLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ShipValidLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> createShipValidLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_SHIP_VALID_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> src_ShipValidLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ShipValidLcl_UpdChk01_Dtl);
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
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SHIP_VALID_R r_dest, mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SHIP_VALID_R> dest, MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR r_src : src){
				MAM_SHIP_VALID_R r_dest = dest.createRow();
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
	 * ShipValidLcl_Upd01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class ShipValidLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipValidLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_VALID_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_VALID_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_VALID_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_VALID_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_VALID_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_VALID_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_VALID_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_VALID_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_VALID_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_VALID_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipValidLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SHIP_VALID_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SHIP_VALID_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SHIP_VALID_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SHIP_VALID_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SHIP_VALID_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SHIP_VALID_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ShipValidLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR createShipValidLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ShipValidLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> createShipValidLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SHIP_VALID_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> src_ShipValidLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ShipValidLcl_Upd01_Dtl);
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
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ship_valid_grp_nm", "ship_valid_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SHIP_VALID_LCL_R r_dest, mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SHIP_VALID_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR r_src : src){
				MAM_SHIP_VALID_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SHIP_VALID_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> src_ShipValidLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ShipValidLcl_Upd01_Dtl);
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
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ship_valid_grp_nm", "ship_valid_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SHIP_VALID_LCL_R r_dest, mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SHIP_VALID_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.ShipValidLcl_UpdChk01_DtlR r_src : src){
				MAM_SHIP_VALID_LCL_R r_dest = dest.createRow();
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
	 * ShipValid_DelChk01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの削除前のチェックを行います。<br>
	 */
	abstract public class ShipValid_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipValid_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipValid_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.class);

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
		 * ShipValid_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR createShipValid_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.create();
		}

		/**
		 * ShipValid_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> createShipValid_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ShipValid_Del01オペレーション.<p>
	 *
	 * 出荷有効期限グループマスタの削除を行います。<br>
	 */
	abstract public class ShipValid_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipValid_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_VALID_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_VALID_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_VALID_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_VALID_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_VALID_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_VALID_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_VALID_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_VALID_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_VALID_R> updMaster1_up0;
		public final MCList<MAM_SHIP_VALID_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipValid_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_SHIP_VALID_R.create("T1"));
			updMaster2 = MCController.create(MAM_SHIP_VALID_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_SHIP_VALID_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_SHIP_VALID_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SHIP_VALID_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_SHIP_VALID_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * ShipValid_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR createShipValid_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.create();
		}

		/**
		 * ShipValid_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> createShipValid_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SHIP_VALID_R> dest0_0, MCList<MAM_SHIP_VALID_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> src_ShipValid_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ShipValid_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ShipValid_Del01_Dtl);
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
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_SHIP_VALID_R r_dest, mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_SHIP_VALID_R> dest, MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR r_src : src){
				MAM_SHIP_VALID_R r_dest = dest.createRow();
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
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_SHIP_VALID_LCL_R r_dest, mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_SHIP_VALID_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.ShipValid_DelChk01_DtlR r_src : src){
				MAM_SHIP_VALID_LCL_R r_dest = dest.createRow();
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
	 * ItmShipGrp_UpdChk01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの登録前のチェックを行います。<br>
	 */
	abstract public class ItmShipGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmShipGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmShipGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.class);

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
		 * ItmShipGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR createItmShipGrp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.create();
		}

		/**
		 * ItmShipGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> createItmShipGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ItmShipGrp_Upd01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの登録を行います。<br>
	 */
	abstract public class ItmShipGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmShipGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SHIP_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SHIP_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SHIP_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SHIP_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmShipGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_SHIP_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_SHIP_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_SHIP_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_SHIP_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ItmShipGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR createItmShipGrp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.create();
		}

		/**
		 * ItmShipGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> createItmShipGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ITM_SHIP_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> src_ItmShipGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmShipGrp_Upd01_Dtl);
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
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("itm_ship_grp_nm", "itm_ship_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ITM_SHIP_GRP_R r_dest, mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_SHIP_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR r_src : src){
				MAM_ITM_SHIP_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_SHIP_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> src_ItmShipGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmShipGrp_Upd01_Dtl);
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
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("itm_ship_grp_nm", "itm_ship_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_ITM_SHIP_GRP_R r_dest, mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_SHIP_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.ItmShipGrp_UpdChk01_DtlR r_src : src){
				MAM_ITM_SHIP_GRP_R r_dest = dest.createRow();
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
	 * ItmShipGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class ItmShipGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmShipGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SHIP_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SHIP_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmShipGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_ITM_SHIP_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_ITM_SHIP_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #chk01_up0}）<br>
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
		 * ItmShipGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR createItmShipGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmShipGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> createItmShipGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_ITM_SHIP_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> src_ItmShipGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ItmShipGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_ITM_SHIP_GRP_R r_dest, mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_ITM_SHIP_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_SHIP_GRP_R r_dest = dest.createRow();
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
	 * ItmShipGrpLcl_Upd01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class ItmShipGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmShipGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SHIP_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SHIP_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SHIP_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SHIP_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SHIP_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SHIP_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmShipGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_SHIP_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_SHIP_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_SHIP_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_SHIP_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_SHIP_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_SHIP_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ItmShipGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR createItmShipGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmShipGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> createItmShipGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ITM_SHIP_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> src_ItmShipGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmShipGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_ship_grp_nm", "itm_ship_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ITM_SHIP_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_SHIP_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_SHIP_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_SHIP_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> src_ItmShipGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmShipGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_ship_grp_nm", "itm_ship_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_ITM_SHIP_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_SHIP_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.ItmShipGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_SHIP_GRP_LCL_R r_dest = dest.createRow();
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
	 * ItmShipGrp_DelChk01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの削除前のチェックを行います。<br>
	 */
	abstract public class ItmShipGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmShipGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmShipGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.class);

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
		 * ItmShipGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR createItmShipGrp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.create();
		}

		/**
		 * ItmShipGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> createItmShipGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ItmShipGrp_Del01オペレーション.<p>
	 *
	 * 品目出荷グループマスタの削除を行います。<br>
	 */
	abstract public class ItmShipGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmShipGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SHIP_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SHIP_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SHIP_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SHIP_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SHIP_GRP_R> updMaster1_up0;
		public final MCList<MAM_ITM_SHIP_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmShipGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_ITM_SHIP_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_ITM_SHIP_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_ITM_SHIP_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_ITM_SHIP_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_SHIP_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_ITM_SHIP_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * ItmShipGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR createItmShipGrp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.create();
		}

		/**
		 * ItmShipGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> createItmShipGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ITM_SHIP_GRP_R> dest0_0, MCList<MAM_ITM_SHIP_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> src_ItmShipGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ItmShipGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ItmShipGrp_Del01_Dtl);
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
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_ITM_SHIP_GRP_R r_dest, mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_ITM_SHIP_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR r_src : src){
				MAM_ITM_SHIP_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("itm_ship_grp_cd", "itm_ship_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_ITM_SHIP_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_ITM_SHIP_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.ItmShipGrp_DelChk01_DtlR r_src : src){
				MAM_ITM_SHIP_GRP_LCL_R r_dest = dest.createRow();
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
	 * Trnspt_UpdChk01オペレーション.<p>
	 *
	 * 輸送方法マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Trnspt_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Trnspt_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Trnspt_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.class);

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
		 * Trnspt_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR createTrnspt_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.create();
		}

		/**
		 * Trnspt_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> createTrnspt_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>sort_seq</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Trnspt_Upd01オペレーション.<p>
	 *
	 * 輸送方法マスタの登録を行います。<br>
	 */
	abstract public class Trnspt_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Trnspt_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRNSPT_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRNSPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRNSPT_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRNSPT_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_TRNSPT_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRNSPT_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRNSPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRNSPT_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRNSPT_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_TRNSPT_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Trnspt_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_TRNSPT_R.create("T1"));
			chkMaster = MCController.create(MAM_TRNSPT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_TRNSPT_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_TRNSPT_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_TRNSPT_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_TRNSPT_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Trnspt_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR createTrnspt_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.create();
		}

		/**
		 * Trnspt_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> createTrnspt_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>sort_seq</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_TRNSPT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> src_Trnspt_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Trnspt_Upd01_Dtl);
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
				addColumnPathMap("trnspt_cd", "trnspt_cd");
				addColumnPathMap("trnspt_nm", "trnspt_nm");
				addColumnPathMap("sort_seq", "sort_seq");
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
		protected void up_UPDATE_updMaster_0(MAM_TRNSPT_R r_dest, mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_TRNSPT_R> dest, MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR r_src : src){
				MAM_TRNSPT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_TRNSPT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> src_Trnspt_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Trnspt_Upd01_Dtl);
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
				addColumnPathMap("trnspt_cd", "trnspt_cd");
				addColumnPathMap("trnspt_nm", "trnspt_nm");
				addColumnPathMap("sort_seq", "sort_seq");
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
		protected void up_MAIN_chkMaster_0(MAM_TRNSPT_R r_dest, mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_TRNSPT_R> dest, MCList<mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.Trnspt_UpdChk01_DtlR r_src : src){
				MAM_TRNSPT_R r_dest = dest.createRow();
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
	 * TrnsptLcl_UpdChk01オペレーション.<p>
	 *
	 * 輸送方法マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class TrnsptLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "TrnsptLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRNSPT_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRNSPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRNSPT_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRNSPT_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_TRNSPT_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected TrnsptLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_TRNSPT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_TRNSPT_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_TRNSPT_R&gt; （{@link #chk01_up0}）<br>
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
		 * TrnsptLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR createTrnsptLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.create();
		}

		/**
		 * TrnsptLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> createTrnsptLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_TRNSPT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> src_TrnsptLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_TrnsptLcl_UpdChk01_Dtl);
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
				addColumnPathMap("trnspt_cd", "trnspt_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_TRNSPT_R r_dest, mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_TRNSPT_R> dest, MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR r_src : src){
				MAM_TRNSPT_R r_dest = dest.createRow();
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
	 * TrnsptLcl_Upd01オペレーション.<p>
	 *
	 * 輸送方法マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class TrnsptLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "TrnsptLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRNSPT_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRNSPT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRNSPT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRNSPT_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_TRNSPT_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRNSPT_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRNSPT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRNSPT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRNSPT_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_TRNSPT_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected TrnsptLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_TRNSPT_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_TRNSPT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_TRNSPT_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_TRNSPT_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_TRNSPT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_TRNSPT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * TrnsptLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR createTrnsptLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.create();
		}

		/**
		 * TrnsptLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> createTrnsptLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_TRNSPT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> src_TrnsptLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_TrnsptLcl_Upd01_Dtl);
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
				addColumnPathMap("trnspt_cd", "trnspt_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("trnspt_nm", "trnspt_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_TRNSPT_LCL_R r_dest, mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_TRNSPT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR r_src : src){
				MAM_TRNSPT_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_TRNSPT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> src_TrnsptLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_TrnsptLcl_Upd01_Dtl);
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
				addColumnPathMap("trnspt_cd", "trnspt_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("trnspt_nm", "trnspt_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_TRNSPT_LCL_R r_dest, mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_TRNSPT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0033.TrnsptLcl_UpdChk01_DtlR r_src : src){
				MAM_TRNSPT_LCL_R r_dest = dest.createRow();
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
	 * Trnspt_DelChk01オペレーション.<p>
	 *
	 * 輸送方法マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Trnspt_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Trnspt_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Trnspt_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.class);

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
		 * Trnspt_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR createTrnspt_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.create();
		}

		/**
		 * Trnspt_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> createTrnspt_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Trnspt_Del01オペレーション.<p>
	 *
	 * 輸送方法マスタの削除を行います。<br>
	 */
	abstract public class Trnspt_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Trnspt_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRNSPT_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_TRNSPT_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRNSPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRNSPT_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRNSPT_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRNSPT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRNSPT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRNSPT_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_TRNSPT_R> updMaster1_up0;
		public final MCList<MAM_TRNSPT_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Trnspt_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_TRNSPT_R.create("T1"));
			updMaster2 = MCController.create(MAM_TRNSPT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_TRNSPT_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_TRNSPT_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_TRNSPT_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_TRNSPT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Trnspt_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR createTrnspt_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.create();
		}

		/**
		 * Trnspt_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> createTrnspt_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_TRNSPT_R> dest0_0, MCList<MAM_TRNSPT_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> src_Trnspt_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Trnspt_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Trnspt_Del01_Dtl);
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
				addColumnPathMap("trnspt_cd", "trnspt_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_TRNSPT_R r_dest, mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_TRNSPT_R> dest, MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR r_src : src){
				MAM_TRNSPT_R r_dest = dest.createRow();
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
				addColumnPathMap("trnspt_cd", "trnspt_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_TRNSPT_LCL_R r_dest, mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_TRNSPT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0033.Trnspt_DelChk01_DtlR r_src : src){
				MAM_TRNSPT_LCL_R r_dest = dest.createRow();
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