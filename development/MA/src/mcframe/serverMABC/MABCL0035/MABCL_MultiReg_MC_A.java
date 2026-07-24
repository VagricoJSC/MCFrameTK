package mcframe.serverMABC.MABCL0035;

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
	public static final String LOGIC_ID = "MABCL0035";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_MultiReg.JnlPtnBase_UpdChk01 aJnlPtnBase_UpdChk01;

	protected void initJnlPtnBase_UpdChk01() {
		this.info = PDef.MA_MABCL0035_JnlPtnBase_UpdChk01_INFO;
		this.aJnlPtnBase_UpdChk01 = ((MABCL_MultiReg)this).new JnlPtnBase_UpdChk01();
	}

	public static MABCL_MultiReg.JnlPtnBase_UpdChk01 crtJnlPtnBase_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlPtnBase_UpdChk01();
		return lgc.aJnlPtnBase_UpdChk01;
	}

	protected void paramJnlPtnBase_UpdChk01(MCParam p) {
		if (this.aJnlPtnBase_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlPtnBase_UpdChk01.up0());
	}

	protected void doJnlPtnBase_UpdChk01() {
		aJnlPtnBase_UpdChk01.call();
	};

	/**
	 * JnlPtnBase_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR createJnlPtnBase_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.create();
	}

	/**
	 * JnlPtnBase_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> createJnlPtnBase_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlPtnBase_Upd01 aJnlPtnBase_Upd01;

	protected void initJnlPtnBase_Upd01() {
		this.info = PDef.MA_MABCL0035_JnlPtnBase_Upd01_INFO;
		this.aJnlPtnBase_Upd01 = ((MABCL_MultiReg)this).new JnlPtnBase_Upd01();
	}

	public static MABCL_MultiReg.JnlPtnBase_Upd01 crtJnlPtnBase_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlPtnBase_Upd01();
		return lgc.aJnlPtnBase_Upd01;
	}

	protected void paramJnlPtnBase_Upd01(MCParam p) {
		if (this.aJnlPtnBase_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlPtnBase_Upd01.up0());
	}

	protected void doJnlPtnBase_Upd01() {
		aJnlPtnBase_Upd01.call();
	};

	/**
	 * JnlPtnBase_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR createJnlPtnBase_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.create();
	}

	/**
	 * JnlPtnBase_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> createJnlPtnBase_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlPtnBaseLcl_UpdChk01 aJnlPtnBaseLcl_UpdChk01;

	protected void initJnlPtnBaseLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_JnlPtnBaseLcl_UpdChk01_INFO;
		this.aJnlPtnBaseLcl_UpdChk01 = ((MABCL_MultiReg)this).new JnlPtnBaseLcl_UpdChk01();
	}

	public static MABCL_MultiReg.JnlPtnBaseLcl_UpdChk01 crtJnlPtnBaseLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlPtnBaseLcl_UpdChk01();
		return lgc.aJnlPtnBaseLcl_UpdChk01;
	}

	protected void paramJnlPtnBaseLcl_UpdChk01(MCParam p) {
		if (this.aJnlPtnBaseLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlPtnBaseLcl_UpdChk01.up0());
	}

	protected void doJnlPtnBaseLcl_UpdChk01() {
		aJnlPtnBaseLcl_UpdChk01.call();
	};

	/**
	 * JnlPtnBaseLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR createJnlPtnBaseLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.create();
	}

	/**
	 * JnlPtnBaseLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> createJnlPtnBaseLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlPtnBaseLcl_Upd01 aJnlPtnBaseLcl_Upd01;

	protected void initJnlPtnBaseLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_JnlPtnBaseLcl_Upd01_INFO;
		this.aJnlPtnBaseLcl_Upd01 = ((MABCL_MultiReg)this).new JnlPtnBaseLcl_Upd01();
	}

	public static MABCL_MultiReg.JnlPtnBaseLcl_Upd01 crtJnlPtnBaseLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlPtnBaseLcl_Upd01();
		return lgc.aJnlPtnBaseLcl_Upd01;
	}

	protected void paramJnlPtnBaseLcl_Upd01(MCParam p) {
		if (this.aJnlPtnBaseLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlPtnBaseLcl_Upd01.up0());
	}

	protected void doJnlPtnBaseLcl_Upd01() {
		aJnlPtnBaseLcl_Upd01.call();
	};

	/**
	 * JnlPtnBaseLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR createJnlPtnBaseLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.create();
	}

	/**
	 * JnlPtnBaseLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> createJnlPtnBaseLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlPtnBase_DelChk01 aJnlPtnBase_DelChk01;

	protected void initJnlPtnBase_DelChk01() {
		this.info = PDef.MA_MABCL0035_JnlPtnBase_DelChk01_INFO;
		this.aJnlPtnBase_DelChk01 = ((MABCL_MultiReg)this).new JnlPtnBase_DelChk01();
	}

	public static MABCL_MultiReg.JnlPtnBase_DelChk01 crtJnlPtnBase_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlPtnBase_DelChk01();
		return lgc.aJnlPtnBase_DelChk01;
	}

	protected void paramJnlPtnBase_DelChk01(MCParam p) {
		if (this.aJnlPtnBase_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlPtnBase_DelChk01.up0());
	}

	protected void doJnlPtnBase_DelChk01() {
		aJnlPtnBase_DelChk01.call();
	};

	/**
	 * JnlPtnBase_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR createJnlPtnBase_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.create();
	}

	/**
	 * JnlPtnBase_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> createJnlPtnBase_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlPtnBase_Del01 aJnlPtnBase_Del01;

	protected void initJnlPtnBase_Del01() {
		this.info = PDef.MA_MABCL0035_JnlPtnBase_Del01_INFO;
		this.aJnlPtnBase_Del01 = ((MABCL_MultiReg)this).new JnlPtnBase_Del01();
	}

	public static MABCL_MultiReg.JnlPtnBase_Del01 crtJnlPtnBase_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlPtnBase_Del01();
		return lgc.aJnlPtnBase_Del01;
	}

	protected void paramJnlPtnBase_Del01(MCParam p) {
		if (this.aJnlPtnBase_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlPtnBase_Del01.up0());
	}

	protected void doJnlPtnBase_Del01() {
		aJnlPtnBase_Del01.call();
	};

	/**
	 * JnlPtnBase_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR createJnlPtnBase_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.create();
	}

	/**
	 * JnlPtnBase_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> createJnlPtnBase_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AutoJnlKey_UpdChk01 aAutoJnlKey_UpdChk01;

	protected void initAutoJnlKey_UpdChk01() {
		this.info = PDef.MA_MABCL0035_AutoJnlKey_UpdChk01_INFO;
		this.aAutoJnlKey_UpdChk01 = ((MABCL_MultiReg)this).new AutoJnlKey_UpdChk01();
	}

	public static MABCL_MultiReg.AutoJnlKey_UpdChk01 crtAutoJnlKey_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAutoJnlKey_UpdChk01();
		return lgc.aAutoJnlKey_UpdChk01;
	}

	protected void paramAutoJnlKey_UpdChk01(MCParam p) {
		if (this.aAutoJnlKey_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnlKey_UpdChk01.up0());
	}

	protected void doAutoJnlKey_UpdChk01() {
		aAutoJnlKey_UpdChk01.call();
	};

	/**
	 * AutoJnlKey_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR createAutoJnlKey_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.create();
	}

	/**
	 * AutoJnlKey_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> createAutoJnlKey_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AutoJnlKey_Upd01 aAutoJnlKey_Upd01;

	protected void initAutoJnlKey_Upd01() {
		this.info = PDef.MA_MABCL0035_AutoJnlKey_Upd01_INFO;
		this.aAutoJnlKey_Upd01 = ((MABCL_MultiReg)this).new AutoJnlKey_Upd01();
	}

	public static MABCL_MultiReg.AutoJnlKey_Upd01 crtAutoJnlKey_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAutoJnlKey_Upd01();
		return lgc.aAutoJnlKey_Upd01;
	}

	protected void paramAutoJnlKey_Upd01(MCParam p) {
		if (this.aAutoJnlKey_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnlKey_Upd01.up0());
	}

	protected void doAutoJnlKey_Upd01() {
		aAutoJnlKey_Upd01.call();
	};

	/**
	 * AutoJnlKey_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR createAutoJnlKey_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.create();
	}

	/**
	 * AutoJnlKey_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> createAutoJnlKey_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AutoJnlKeyLcl_UpdChk01 aAutoJnlKeyLcl_UpdChk01;

	protected void initAutoJnlKeyLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_AutoJnlKeyLcl_UpdChk01_INFO;
		this.aAutoJnlKeyLcl_UpdChk01 = ((MABCL_MultiReg)this).new AutoJnlKeyLcl_UpdChk01();
	}

	public static MABCL_MultiReg.AutoJnlKeyLcl_UpdChk01 crtAutoJnlKeyLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAutoJnlKeyLcl_UpdChk01();
		return lgc.aAutoJnlKeyLcl_UpdChk01;
	}

	protected void paramAutoJnlKeyLcl_UpdChk01(MCParam p) {
		if (this.aAutoJnlKeyLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnlKeyLcl_UpdChk01.up0());
	}

	protected void doAutoJnlKeyLcl_UpdChk01() {
		aAutoJnlKeyLcl_UpdChk01.call();
	};

	/**
	 * AutoJnlKeyLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR createAutoJnlKeyLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AutoJnlKeyLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> createAutoJnlKeyLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AutoJnlKeyLcl_Upd01 aAutoJnlKeyLcl_Upd01;

	protected void initAutoJnlKeyLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_AutoJnlKeyLcl_Upd01_INFO;
		this.aAutoJnlKeyLcl_Upd01 = ((MABCL_MultiReg)this).new AutoJnlKeyLcl_Upd01();
	}

	public static MABCL_MultiReg.AutoJnlKeyLcl_Upd01 crtAutoJnlKeyLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAutoJnlKeyLcl_Upd01();
		return lgc.aAutoJnlKeyLcl_Upd01;
	}

	protected void paramAutoJnlKeyLcl_Upd01(MCParam p) {
		if (this.aAutoJnlKeyLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnlKeyLcl_Upd01.up0());
	}

	protected void doAutoJnlKeyLcl_Upd01() {
		aAutoJnlKeyLcl_Upd01.call();
	};

	/**
	 * AutoJnlKeyLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR createAutoJnlKeyLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AutoJnlKeyLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> createAutoJnlKeyLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AutoJnlKey_DelChk01 aAutoJnlKey_DelChk01;

	protected void initAutoJnlKey_DelChk01() {
		this.info = PDef.MA_MABCL0035_AutoJnlKey_DelChk01_INFO;
		this.aAutoJnlKey_DelChk01 = ((MABCL_MultiReg)this).new AutoJnlKey_DelChk01();
	}

	public static MABCL_MultiReg.AutoJnlKey_DelChk01 crtAutoJnlKey_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAutoJnlKey_DelChk01();
		return lgc.aAutoJnlKey_DelChk01;
	}

	protected void paramAutoJnlKey_DelChk01(MCParam p) {
		if (this.aAutoJnlKey_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnlKey_DelChk01.up0());
	}

	protected void doAutoJnlKey_DelChk01() {
		aAutoJnlKey_DelChk01.call();
	};

	/**
	 * AutoJnlKey_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR createAutoJnlKey_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.create();
	}

	/**
	 * AutoJnlKey_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> createAutoJnlKey_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AutoJnlKey_Del01 aAutoJnlKey_Del01;

	protected void initAutoJnlKey_Del01() {
		this.info = PDef.MA_MABCL0035_AutoJnlKey_Del01_INFO;
		this.aAutoJnlKey_Del01 = ((MABCL_MultiReg)this).new AutoJnlKey_Del01();
	}

	public static MABCL_MultiReg.AutoJnlKey_Del01 crtAutoJnlKey_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAutoJnlKey_Del01();
		return lgc.aAutoJnlKey_Del01;
	}

	protected void paramAutoJnlKey_Del01(MCParam p) {
		if (this.aAutoJnlKey_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAutoJnlKey_Del01.up0());
	}

	protected void doAutoJnlKey_Del01() {
		aAutoJnlKey_Del01.call();
	};

	/**
	 * AutoJnlKey_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR createAutoJnlKey_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.create();
	}

	/**
	 * AutoJnlKey_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> createAutoJnlKey_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.InspPtn_UpdChk01 aInspPtn_UpdChk01;

	protected void initInspPtn_UpdChk01() {
		this.info = PDef.MA_MABCL0035_InspPtn_UpdChk01_INFO;
		this.aInspPtn_UpdChk01 = ((MABCL_MultiReg)this).new InspPtn_UpdChk01();
	}

	public static MABCL_MultiReg.InspPtn_UpdChk01 crtInspPtn_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initInspPtn_UpdChk01();
		return lgc.aInspPtn_UpdChk01;
	}

	protected void paramInspPtn_UpdChk01(MCParam p) {
		if (this.aInspPtn_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspPtn_UpdChk01.up0());
	}

	protected void doInspPtn_UpdChk01() {
		aInspPtn_UpdChk01.call();
	};

	/**
	 * InspPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR createInspPtn_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.create();
	}

	/**
	 * InspPtn_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> createInspPtn_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.InspPtn_Upd01 aInspPtn_Upd01;

	protected void initInspPtn_Upd01() {
		this.info = PDef.MA_MABCL0035_InspPtn_Upd01_INFO;
		this.aInspPtn_Upd01 = ((MABCL_MultiReg)this).new InspPtn_Upd01();
	}

	public static MABCL_MultiReg.InspPtn_Upd01 crtInspPtn_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initInspPtn_Upd01();
		return lgc.aInspPtn_Upd01;
	}

	protected void paramInspPtn_Upd01(MCParam p) {
		if (this.aInspPtn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspPtn_Upd01.up0());
	}

	protected void doInspPtn_Upd01() {
		aInspPtn_Upd01.call();
	};

	/**
	 * InspPtn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR createInspPtn_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.create();
	}

	/**
	 * InspPtn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> createInspPtn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.InspPtnLcl_UpdChk01 aInspPtnLcl_UpdChk01;

	protected void initInspPtnLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_InspPtnLcl_UpdChk01_INFO;
		this.aInspPtnLcl_UpdChk01 = ((MABCL_MultiReg)this).new InspPtnLcl_UpdChk01();
	}

	public static MABCL_MultiReg.InspPtnLcl_UpdChk01 crtInspPtnLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initInspPtnLcl_UpdChk01();
		return lgc.aInspPtnLcl_UpdChk01;
	}

	protected void paramInspPtnLcl_UpdChk01(MCParam p) {
		if (this.aInspPtnLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspPtnLcl_UpdChk01.up0());
	}

	protected void doInspPtnLcl_UpdChk01() {
		aInspPtnLcl_UpdChk01.call();
	};

	/**
	 * InspPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR createInspPtnLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * InspPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> createInspPtnLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.InspPtnLcl_Upd01 aInspPtnLcl_Upd01;

	protected void initInspPtnLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_InspPtnLcl_Upd01_INFO;
		this.aInspPtnLcl_Upd01 = ((MABCL_MultiReg)this).new InspPtnLcl_Upd01();
	}

	public static MABCL_MultiReg.InspPtnLcl_Upd01 crtInspPtnLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initInspPtnLcl_Upd01();
		return lgc.aInspPtnLcl_Upd01;
	}

	protected void paramInspPtnLcl_Upd01(MCParam p) {
		if (this.aInspPtnLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspPtnLcl_Upd01.up0());
	}

	protected void doInspPtnLcl_Upd01() {
		aInspPtnLcl_Upd01.call();
	};

	/**
	 * InspPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR createInspPtnLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * InspPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> createInspPtnLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.InspPtn_DelChk01 aInspPtn_DelChk01;

	protected void initInspPtn_DelChk01() {
		this.info = PDef.MA_MABCL0035_InspPtn_DelChk01_INFO;
		this.aInspPtn_DelChk01 = ((MABCL_MultiReg)this).new InspPtn_DelChk01();
	}

	public static MABCL_MultiReg.InspPtn_DelChk01 crtInspPtn_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initInspPtn_DelChk01();
		return lgc.aInspPtn_DelChk01;
	}

	protected void paramInspPtn_DelChk01(MCParam p) {
		if (this.aInspPtn_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspPtn_DelChk01.up0());
	}

	protected void doInspPtn_DelChk01() {
		aInspPtn_DelChk01.call();
	};

	/**
	 * InspPtn_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR createInspPtn_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.create();
	}

	/**
	 * InspPtn_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> createInspPtn_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.InspPtn_Del01 aInspPtn_Del01;

	protected void initInspPtn_Del01() {
		this.info = PDef.MA_MABCL0035_InspPtn_Del01_INFO;
		this.aInspPtn_Del01 = ((MABCL_MultiReg)this).new InspPtn_Del01();
	}

	public static MABCL_MultiReg.InspPtn_Del01 crtInspPtn_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initInspPtn_Del01();
		return lgc.aInspPtn_Del01;
	}

	protected void paramInspPtn_Del01(MCParam p) {
		if (this.aInspPtn_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspPtn_Del01.up0());
	}

	protected void doInspPtn_Del01() {
		aInspPtn_Del01.call();
	};

	/**
	 * InspPtn_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR createInspPtn_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.create();
	}

	/**
	 * InspPtn_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> createInspPtn_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkDay_UpdChk01 aWkDay_UpdChk01;

	protected void initWkDay_UpdChk01() {
		this.info = PDef.MA_MABCL0035_WkDay_UpdChk01_INFO;
		this.aWkDay_UpdChk01 = ((MABCL_MultiReg)this).new WkDay_UpdChk01();
	}

	public static MABCL_MultiReg.WkDay_UpdChk01 crtWkDay_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkDay_UpdChk01();
		return lgc.aWkDay_UpdChk01;
	}

	protected void paramWkDay_UpdChk01(MCParam p) {
		if (this.aWkDay_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkDay_UpdChk01.up0());
	}

	protected void doWkDay_UpdChk01() {
		aWkDay_UpdChk01.call();
	};

	/**
	 * WkDay_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR createWkDay_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.create();
	}

	/**
	 * WkDay_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> createWkDay_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkDay_Upd01 aWkDay_Upd01;

	protected void initWkDay_Upd01() {
		this.info = PDef.MA_MABCL0035_WkDay_Upd01_INFO;
		this.aWkDay_Upd01 = ((MABCL_MultiReg)this).new WkDay_Upd01();
	}

	public static MABCL_MultiReg.WkDay_Upd01 crtWkDay_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkDay_Upd01();
		return lgc.aWkDay_Upd01;
	}

	protected void paramWkDay_Upd01(MCParam p) {
		if (this.aWkDay_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkDay_Upd01.up0());
	}

	protected void doWkDay_Upd01() {
		aWkDay_Upd01.call();
	};

	/**
	 * WkDay_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR createWkDay_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.create();
	}

	/**
	 * WkDay_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> createWkDay_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkDayLcl_UpdChk01 aWkDayLcl_UpdChk01;

	protected void initWkDayLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_WkDayLcl_UpdChk01_INFO;
		this.aWkDayLcl_UpdChk01 = ((MABCL_MultiReg)this).new WkDayLcl_UpdChk01();
	}

	public static MABCL_MultiReg.WkDayLcl_UpdChk01 crtWkDayLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkDayLcl_UpdChk01();
		return lgc.aWkDayLcl_UpdChk01;
	}

	protected void paramWkDayLcl_UpdChk01(MCParam p) {
		if (this.aWkDayLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkDayLcl_UpdChk01.up0());
	}

	protected void doWkDayLcl_UpdChk01() {
		aWkDayLcl_UpdChk01.call();
	};

	/**
	 * WkDayLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR createWkDayLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.create();
	}

	/**
	 * WkDayLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> createWkDayLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkDayLcl_Upd01 aWkDayLcl_Upd01;

	protected void initWkDayLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_WkDayLcl_Upd01_INFO;
		this.aWkDayLcl_Upd01 = ((MABCL_MultiReg)this).new WkDayLcl_Upd01();
	}

	public static MABCL_MultiReg.WkDayLcl_Upd01 crtWkDayLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkDayLcl_Upd01();
		return lgc.aWkDayLcl_Upd01;
	}

	protected void paramWkDayLcl_Upd01(MCParam p) {
		if (this.aWkDayLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkDayLcl_Upd01.up0());
	}

	protected void doWkDayLcl_Upd01() {
		aWkDayLcl_Upd01.call();
	};

	/**
	 * WkDayLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR createWkDayLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.create();
	}

	/**
	 * WkDayLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> createWkDayLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkDay_DelChk01 aWkDay_DelChk01;

	protected void initWkDay_DelChk01() {
		this.info = PDef.MA_MABCL0035_WkDay_DelChk01_INFO;
		this.aWkDay_DelChk01 = ((MABCL_MultiReg)this).new WkDay_DelChk01();
	}

	public static MABCL_MultiReg.WkDay_DelChk01 crtWkDay_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkDay_DelChk01();
		return lgc.aWkDay_DelChk01;
	}

	protected void paramWkDay_DelChk01(MCParam p) {
		if (this.aWkDay_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkDay_DelChk01.up0());
	}

	protected void doWkDay_DelChk01() {
		aWkDay_DelChk01.call();
	};

	/**
	 * WkDay_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR createWkDay_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.create();
	}

	/**
	 * WkDay_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> createWkDay_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.WkDay_Del01 aWkDay_Del01;

	protected void initWkDay_Del01() {
		this.info = PDef.MA_MABCL0035_WkDay_Del01_INFO;
		this.aWkDay_Del01 = ((MABCL_MultiReg)this).new WkDay_Del01();
	}

	public static MABCL_MultiReg.WkDay_Del01 crtWkDay_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initWkDay_Del01();
		return lgc.aWkDay_Del01;
	}

	protected void paramWkDay_Del01(MCParam p) {
		if (this.aWkDay_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aWkDay_Del01.up0());
	}

	protected void doWkDay_Del01() {
		aWkDay_Del01.call();
	};

	/**
	 * WkDay_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR createWkDay_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.create();
	}

	/**
	 * WkDay_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> createWkDay_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipTerm_UpdChk01 aShipTerm_UpdChk01;

	protected void initShipTerm_UpdChk01() {
		this.info = PDef.MA_MABCL0035_ShipTerm_UpdChk01_INFO;
		this.aShipTerm_UpdChk01 = ((MABCL_MultiReg)this).new ShipTerm_UpdChk01();
	}

	public static MABCL_MultiReg.ShipTerm_UpdChk01 crtShipTerm_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipTerm_UpdChk01();
		return lgc.aShipTerm_UpdChk01;
	}

	protected void paramShipTerm_UpdChk01(MCParam p) {
		if (this.aShipTerm_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipTerm_UpdChk01.up0());
	}

	protected void doShipTerm_UpdChk01() {
		aShipTerm_UpdChk01.call();
	};

	/**
	 * ShipTerm_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR createShipTerm_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.create();
	}

	/**
	 * ShipTerm_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> createShipTerm_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipTerm_Upd01 aShipTerm_Upd01;

	protected void initShipTerm_Upd01() {
		this.info = PDef.MA_MABCL0035_ShipTerm_Upd01_INFO;
		this.aShipTerm_Upd01 = ((MABCL_MultiReg)this).new ShipTerm_Upd01();
	}

	public static MABCL_MultiReg.ShipTerm_Upd01 crtShipTerm_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipTerm_Upd01();
		return lgc.aShipTerm_Upd01;
	}

	protected void paramShipTerm_Upd01(MCParam p) {
		if (this.aShipTerm_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipTerm_Upd01.up0());
	}

	protected void doShipTerm_Upd01() {
		aShipTerm_Upd01.call();
	};

	/**
	 * ShipTerm_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR createShipTerm_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.create();
	}

	/**
	 * ShipTerm_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> createShipTerm_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipTermLcl_UpdChk01 aShipTermLcl_UpdChk01;

	protected void initShipTermLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_ShipTermLcl_UpdChk01_INFO;
		this.aShipTermLcl_UpdChk01 = ((MABCL_MultiReg)this).new ShipTermLcl_UpdChk01();
	}

	public static MABCL_MultiReg.ShipTermLcl_UpdChk01 crtShipTermLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipTermLcl_UpdChk01();
		return lgc.aShipTermLcl_UpdChk01;
	}

	protected void paramShipTermLcl_UpdChk01(MCParam p) {
		if (this.aShipTermLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipTermLcl_UpdChk01.up0());
	}

	protected void doShipTermLcl_UpdChk01() {
		aShipTermLcl_UpdChk01.call();
	};

	/**
	 * ShipTermLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR createShipTermLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ShipTermLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> createShipTermLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipTermLcl_Upd01 aShipTermLcl_Upd01;

	protected void initShipTermLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_ShipTermLcl_Upd01_INFO;
		this.aShipTermLcl_Upd01 = ((MABCL_MultiReg)this).new ShipTermLcl_Upd01();
	}

	public static MABCL_MultiReg.ShipTermLcl_Upd01 crtShipTermLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipTermLcl_Upd01();
		return lgc.aShipTermLcl_Upd01;
	}

	protected void paramShipTermLcl_Upd01(MCParam p) {
		if (this.aShipTermLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipTermLcl_Upd01.up0());
	}

	protected void doShipTermLcl_Upd01() {
		aShipTermLcl_Upd01.call();
	};

	/**
	 * ShipTermLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR createShipTermLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ShipTermLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> createShipTermLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipTerm_DelChk01 aShipTerm_DelChk01;

	protected void initShipTerm_DelChk01() {
		this.info = PDef.MA_MABCL0035_ShipTerm_DelChk01_INFO;
		this.aShipTerm_DelChk01 = ((MABCL_MultiReg)this).new ShipTerm_DelChk01();
	}

	public static MABCL_MultiReg.ShipTerm_DelChk01 crtShipTerm_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipTerm_DelChk01();
		return lgc.aShipTerm_DelChk01;
	}

	protected void paramShipTerm_DelChk01(MCParam p) {
		if (this.aShipTerm_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipTerm_DelChk01.up0());
	}

	protected void doShipTerm_DelChk01() {
		aShipTerm_DelChk01.call();
	};

	/**
	 * ShipTerm_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR createShipTerm_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.create();
	}

	/**
	 * ShipTerm_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> createShipTerm_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipTerm_Del01 aShipTerm_Del01;

	protected void initShipTerm_Del01() {
		this.info = PDef.MA_MABCL0035_ShipTerm_Del01_INFO;
		this.aShipTerm_Del01 = ((MABCL_MultiReg)this).new ShipTerm_Del01();
	}

	public static MABCL_MultiReg.ShipTerm_Del01 crtShipTerm_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipTerm_Del01();
		return lgc.aShipTerm_Del01;
	}

	protected void paramShipTerm_Del01(MCParam p) {
		if (this.aShipTerm_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipTerm_Del01.up0());
	}

	protected void doShipTerm_Del01() {
		aShipTerm_Del01.call();
	};

	/**
	 * ShipTerm_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR createShipTerm_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.create();
	}

	/**
	 * ShipTerm_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> createShipTerm_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipWk_UpdChk01 aShipWk_UpdChk01;

	protected void initShipWk_UpdChk01() {
		this.info = PDef.MA_MABCL0035_ShipWk_UpdChk01_INFO;
		this.aShipWk_UpdChk01 = ((MABCL_MultiReg)this).new ShipWk_UpdChk01();
	}

	public static MABCL_MultiReg.ShipWk_UpdChk01 crtShipWk_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipWk_UpdChk01();
		return lgc.aShipWk_UpdChk01;
	}

	protected void paramShipWk_UpdChk01(MCParam p) {
		if (this.aShipWk_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipWk_UpdChk01.up0());
	}

	protected void doShipWk_UpdChk01() {
		aShipWk_UpdChk01.call();
	};

	/**
	 * ShipWk_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR createShipWk_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.create();
	}

	/**
	 * ShipWk_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> createShipWk_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipWk_Upd01 aShipWk_Upd01;

	protected void initShipWk_Upd01() {
		this.info = PDef.MA_MABCL0035_ShipWk_Upd01_INFO;
		this.aShipWk_Upd01 = ((MABCL_MultiReg)this).new ShipWk_Upd01();
	}

	public static MABCL_MultiReg.ShipWk_Upd01 crtShipWk_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipWk_Upd01();
		return lgc.aShipWk_Upd01;
	}

	protected void paramShipWk_Upd01(MCParam p) {
		if (this.aShipWk_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipWk_Upd01.up0());
	}

	protected void doShipWk_Upd01() {
		aShipWk_Upd01.call();
	};

	/**
	 * ShipWk_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR createShipWk_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.create();
	}

	/**
	 * ShipWk_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> createShipWk_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipWkLcl_UpdChk01 aShipWkLcl_UpdChk01;

	protected void initShipWkLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_ShipWkLcl_UpdChk01_INFO;
		this.aShipWkLcl_UpdChk01 = ((MABCL_MultiReg)this).new ShipWkLcl_UpdChk01();
	}

	public static MABCL_MultiReg.ShipWkLcl_UpdChk01 crtShipWkLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipWkLcl_UpdChk01();
		return lgc.aShipWkLcl_UpdChk01;
	}

	protected void paramShipWkLcl_UpdChk01(MCParam p) {
		if (this.aShipWkLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipWkLcl_UpdChk01.up0());
	}

	protected void doShipWkLcl_UpdChk01() {
		aShipWkLcl_UpdChk01.call();
	};

	/**
	 * ShipWkLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR createShipWkLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ShipWkLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> createShipWkLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipWkLcl_Upd01 aShipWkLcl_Upd01;

	protected void initShipWkLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_ShipWkLcl_Upd01_INFO;
		this.aShipWkLcl_Upd01 = ((MABCL_MultiReg)this).new ShipWkLcl_Upd01();
	}

	public static MABCL_MultiReg.ShipWkLcl_Upd01 crtShipWkLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipWkLcl_Upd01();
		return lgc.aShipWkLcl_Upd01;
	}

	protected void paramShipWkLcl_Upd01(MCParam p) {
		if (this.aShipWkLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipWkLcl_Upd01.up0());
	}

	protected void doShipWkLcl_Upd01() {
		aShipWkLcl_Upd01.call();
	};

	/**
	 * ShipWkLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR createShipWkLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ShipWkLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> createShipWkLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipWk_DelChk01 aShipWk_DelChk01;

	protected void initShipWk_DelChk01() {
		this.info = PDef.MA_MABCL0035_ShipWk_DelChk01_INFO;
		this.aShipWk_DelChk01 = ((MABCL_MultiReg)this).new ShipWk_DelChk01();
	}

	public static MABCL_MultiReg.ShipWk_DelChk01 crtShipWk_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipWk_DelChk01();
		return lgc.aShipWk_DelChk01;
	}

	protected void paramShipWk_DelChk01(MCParam p) {
		if (this.aShipWk_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipWk_DelChk01.up0());
	}

	protected void doShipWk_DelChk01() {
		aShipWk_DelChk01.call();
	};

	/**
	 * ShipWk_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR createShipWk_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.create();
	}

	/**
	 * ShipWk_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> createShipWk_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ShipWk_Del01 aShipWk_Del01;

	protected void initShipWk_Del01() {
		this.info = PDef.MA_MABCL0035_ShipWk_Del01_INFO;
		this.aShipWk_Del01 = ((MABCL_MultiReg)this).new ShipWk_Del01();
	}

	public static MABCL_MultiReg.ShipWk_Del01 crtShipWk_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initShipWk_Del01();
		return lgc.aShipWk_Del01;
	}

	protected void paramShipWk_Del01(MCParam p) {
		if (this.aShipWk_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipWk_Del01.up0());
	}

	protected void doShipWk_Del01() {
		aShipWk_Del01.call();
	};

	/**
	 * ShipWk_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR createShipWk_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.create();
	}

	/**
	 * ShipWk_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> createShipWk_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Rsrc_UpdChk01 aRsrc_UpdChk01;

	protected void initRsrc_UpdChk01() {
		this.info = PDef.MA_MABCL0035_Rsrc_UpdChk01_INFO;
		this.aRsrc_UpdChk01 = ((MABCL_MultiReg)this).new Rsrc_UpdChk01();
	}

	public static MABCL_MultiReg.Rsrc_UpdChk01 crtRsrc_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRsrc_UpdChk01();
		return lgc.aRsrc_UpdChk01;
	}

	protected void paramRsrc_UpdChk01(MCParam p) {
		if (this.aRsrc_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRsrc_UpdChk01.up0());
	}

	protected void doRsrc_UpdChk01() {
		aRsrc_UpdChk01.call();
	};

	/**
	 * Rsrc_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR createRsrc_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.create();
	}

	/**
	 * Rsrc_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> createRsrc_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Rsrc_Upd01 aRsrc_Upd01;

	protected void initRsrc_Upd01() {
		this.info = PDef.MA_MABCL0035_Rsrc_Upd01_INFO;
		this.aRsrc_Upd01 = ((MABCL_MultiReg)this).new Rsrc_Upd01();
	}

	public static MABCL_MultiReg.Rsrc_Upd01 crtRsrc_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRsrc_Upd01();
		return lgc.aRsrc_Upd01;
	}

	protected void paramRsrc_Upd01(MCParam p) {
		if (this.aRsrc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRsrc_Upd01.up0());
	}

	protected void doRsrc_Upd01() {
		aRsrc_Upd01.call();
	};

	/**
	 * Rsrc_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR createRsrc_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.create();
	}

	/**
	 * Rsrc_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> createRsrc_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.RsrcLcl_UpdChk01 aRsrcLcl_UpdChk01;

	protected void initRsrcLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_RsrcLcl_UpdChk01_INFO;
		this.aRsrcLcl_UpdChk01 = ((MABCL_MultiReg)this).new RsrcLcl_UpdChk01();
	}

	public static MABCL_MultiReg.RsrcLcl_UpdChk01 crtRsrcLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRsrcLcl_UpdChk01();
		return lgc.aRsrcLcl_UpdChk01;
	}

	protected void paramRsrcLcl_UpdChk01(MCParam p) {
		if (this.aRsrcLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRsrcLcl_UpdChk01.up0());
	}

	protected void doRsrcLcl_UpdChk01() {
		aRsrcLcl_UpdChk01.call();
	};

	/**
	 * RsrcLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR createRsrcLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.create();
	}

	/**
	 * RsrcLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> createRsrcLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.RsrcLcl_Upd01 aRsrcLcl_Upd01;

	protected void initRsrcLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_RsrcLcl_Upd01_INFO;
		this.aRsrcLcl_Upd01 = ((MABCL_MultiReg)this).new RsrcLcl_Upd01();
	}

	public static MABCL_MultiReg.RsrcLcl_Upd01 crtRsrcLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRsrcLcl_Upd01();
		return lgc.aRsrcLcl_Upd01;
	}

	protected void paramRsrcLcl_Upd01(MCParam p) {
		if (this.aRsrcLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRsrcLcl_Upd01.up0());
	}

	protected void doRsrcLcl_Upd01() {
		aRsrcLcl_Upd01.call();
	};

	/**
	 * RsrcLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR createRsrcLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.create();
	}

	/**
	 * RsrcLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> createRsrcLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Rsrc_DelChk01 aRsrc_DelChk01;

	protected void initRsrc_DelChk01() {
		this.info = PDef.MA_MABCL0035_Rsrc_DelChk01_INFO;
		this.aRsrc_DelChk01 = ((MABCL_MultiReg)this).new Rsrc_DelChk01();
	}

	public static MABCL_MultiReg.Rsrc_DelChk01 crtRsrc_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRsrc_DelChk01();
		return lgc.aRsrc_DelChk01;
	}

	protected void paramRsrc_DelChk01(MCParam p) {
		if (this.aRsrc_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRsrc_DelChk01.up0());
	}

	protected void doRsrc_DelChk01() {
		aRsrc_DelChk01.call();
	};

	/**
	 * Rsrc_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR createRsrc_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.create();
	}

	/**
	 * Rsrc_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> createRsrc_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Rsrc_Del01 aRsrc_Del01;

	protected void initRsrc_Del01() {
		this.info = PDef.MA_MABCL0035_Rsrc_Del01_INFO;
		this.aRsrc_Del01 = ((MABCL_MultiReg)this).new Rsrc_Del01();
	}

	public static MABCL_MultiReg.Rsrc_Del01 crtRsrc_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initRsrc_Del01();
		return lgc.aRsrc_Del01;
	}

	protected void paramRsrc_Del01(MCParam p) {
		if (this.aRsrc_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRsrc_Del01.up0());
	}

	protected void doRsrc_Del01() {
		aRsrc_Del01.call();
	};

	/**
	 * Rsrc_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR createRsrc_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.create();
	}

	/**
	 * Rsrc_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> createRsrc_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.HsGrp_UpdChk01 aHsGrp_UpdChk01;

	protected void initHsGrp_UpdChk01() {
		this.info = PDef.MA_MABCL0035_HsGrp_UpdChk01_INFO;
		this.aHsGrp_UpdChk01 = ((MABCL_MultiReg)this).new HsGrp_UpdChk01();
	}

	public static MABCL_MultiReg.HsGrp_UpdChk01 crtHsGrp_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initHsGrp_UpdChk01();
		return lgc.aHsGrp_UpdChk01;
	}

	protected void paramHsGrp_UpdChk01(MCParam p) {
		if (this.aHsGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aHsGrp_UpdChk01.up0());
	}

	protected void doHsGrp_UpdChk01() {
		aHsGrp_UpdChk01.call();
	};

	/**
	 * HsGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR createHsGrp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.create();
	}

	/**
	 * HsGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> createHsGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.HsGrp_Upd01 aHsGrp_Upd01;

	protected void initHsGrp_Upd01() {
		this.info = PDef.MA_MABCL0035_HsGrp_Upd01_INFO;
		this.aHsGrp_Upd01 = ((MABCL_MultiReg)this).new HsGrp_Upd01();
	}

	public static MABCL_MultiReg.HsGrp_Upd01 crtHsGrp_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initHsGrp_Upd01();
		return lgc.aHsGrp_Upd01;
	}

	protected void paramHsGrp_Upd01(MCParam p) {
		if (this.aHsGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aHsGrp_Upd01.up0());
	}

	protected void doHsGrp_Upd01() {
		aHsGrp_Upd01.call();
	};

	/**
	 * HsGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR createHsGrp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.create();
	}

	/**
	 * HsGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> createHsGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.HsGrpLcl_UpdChk01 aHsGrpLcl_UpdChk01;

	protected void initHsGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_HsGrpLcl_UpdChk01_INFO;
		this.aHsGrpLcl_UpdChk01 = ((MABCL_MultiReg)this).new HsGrpLcl_UpdChk01();
	}

	public static MABCL_MultiReg.HsGrpLcl_UpdChk01 crtHsGrpLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initHsGrpLcl_UpdChk01();
		return lgc.aHsGrpLcl_UpdChk01;
	}

	protected void paramHsGrpLcl_UpdChk01(MCParam p) {
		if (this.aHsGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aHsGrpLcl_UpdChk01.up0());
	}

	protected void doHsGrpLcl_UpdChk01() {
		aHsGrpLcl_UpdChk01.call();
	};

	/**
	 * HsGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR createHsGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * HsGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> createHsGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.HsGrpLcl_Upd01 aHsGrpLcl_Upd01;

	protected void initHsGrpLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_HsGrpLcl_Upd01_INFO;
		this.aHsGrpLcl_Upd01 = ((MABCL_MultiReg)this).new HsGrpLcl_Upd01();
	}

	public static MABCL_MultiReg.HsGrpLcl_Upd01 crtHsGrpLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initHsGrpLcl_Upd01();
		return lgc.aHsGrpLcl_Upd01;
	}

	protected void paramHsGrpLcl_Upd01(MCParam p) {
		if (this.aHsGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aHsGrpLcl_Upd01.up0());
	}

	protected void doHsGrpLcl_Upd01() {
		aHsGrpLcl_Upd01.call();
	};

	/**
	 * HsGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR createHsGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * HsGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> createHsGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.HsGrp_DelChk01 aHsGrp_DelChk01;

	protected void initHsGrp_DelChk01() {
		this.info = PDef.MA_MABCL0035_HsGrp_DelChk01_INFO;
		this.aHsGrp_DelChk01 = ((MABCL_MultiReg)this).new HsGrp_DelChk01();
	}

	public static MABCL_MultiReg.HsGrp_DelChk01 crtHsGrp_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initHsGrp_DelChk01();
		return lgc.aHsGrp_DelChk01;
	}

	protected void paramHsGrp_DelChk01(MCParam p) {
		if (this.aHsGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aHsGrp_DelChk01.up0());
	}

	protected void doHsGrp_DelChk01() {
		aHsGrp_DelChk01.call();
	};

	/**
	 * HsGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR createHsGrp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.create();
	}

	/**
	 * HsGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> createHsGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.HsGrp_Del01 aHsGrp_Del01;

	protected void initHsGrp_Del01() {
		this.info = PDef.MA_MABCL0035_HsGrp_Del01_INFO;
		this.aHsGrp_Del01 = ((MABCL_MultiReg)this).new HsGrp_Del01();
	}

	public static MABCL_MultiReg.HsGrp_Del01 crtHsGrp_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initHsGrp_Del01();
		return lgc.aHsGrp_Del01;
	}

	protected void paramHsGrp_Del01(MCParam p) {
		if (this.aHsGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aHsGrp_Del01.up0());
	}

	protected void doHsGrp_Del01() {
		aHsGrp_Del01.call();
	};

	/**
	 * HsGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR createHsGrp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.create();
	}

	/**
	 * HsGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> createHsGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AlcPtn_UpdChk01 aAlcPtn_UpdChk01;

	protected void initAlcPtn_UpdChk01() {
		this.info = PDef.MA_MABCL0035_AlcPtn_UpdChk01_INFO;
		this.aAlcPtn_UpdChk01 = ((MABCL_MultiReg)this).new AlcPtn_UpdChk01();
	}

	public static MABCL_MultiReg.AlcPtn_UpdChk01 crtAlcPtn_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAlcPtn_UpdChk01();
		return lgc.aAlcPtn_UpdChk01;
	}

	protected void paramAlcPtn_UpdChk01(MCParam p) {
		if (this.aAlcPtn_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlcPtn_UpdChk01.up0());
	}

	protected void doAlcPtn_UpdChk01() {
		aAlcPtn_UpdChk01.call();
	};

	/**
	 * AlcPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR createAlcPtn_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.create();
	}

	/**
	 * AlcPtn_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> createAlcPtn_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AlcPtn_Upd01 aAlcPtn_Upd01;

	protected void initAlcPtn_Upd01() {
		this.info = PDef.MA_MABCL0035_AlcPtn_Upd01_INFO;
		this.aAlcPtn_Upd01 = ((MABCL_MultiReg)this).new AlcPtn_Upd01();
	}

	public static MABCL_MultiReg.AlcPtn_Upd01 crtAlcPtn_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAlcPtn_Upd01();
		return lgc.aAlcPtn_Upd01;
	}

	protected void paramAlcPtn_Upd01(MCParam p) {
		if (this.aAlcPtn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlcPtn_Upd01.up0());
	}

	protected void doAlcPtn_Upd01() {
		aAlcPtn_Upd01.call();
	};

	/**
	 * AlcPtn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR createAlcPtn_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.create();
	}

	/**
	 * AlcPtn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> createAlcPtn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AlcPtnLcl_UpdChk01 aAlcPtnLcl_UpdChk01;

	protected void initAlcPtnLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_AlcPtnLcl_UpdChk01_INFO;
		this.aAlcPtnLcl_UpdChk01 = ((MABCL_MultiReg)this).new AlcPtnLcl_UpdChk01();
	}

	public static MABCL_MultiReg.AlcPtnLcl_UpdChk01 crtAlcPtnLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAlcPtnLcl_UpdChk01();
		return lgc.aAlcPtnLcl_UpdChk01;
	}

	protected void paramAlcPtnLcl_UpdChk01(MCParam p) {
		if (this.aAlcPtnLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlcPtnLcl_UpdChk01.up0());
	}

	protected void doAlcPtnLcl_UpdChk01() {
		aAlcPtnLcl_UpdChk01.call();
	};

	/**
	 * AlcPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR createAlcPtnLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AlcPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> createAlcPtnLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AlcPtnLcl_Upd01 aAlcPtnLcl_Upd01;

	protected void initAlcPtnLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_AlcPtnLcl_Upd01_INFO;
		this.aAlcPtnLcl_Upd01 = ((MABCL_MultiReg)this).new AlcPtnLcl_Upd01();
	}

	public static MABCL_MultiReg.AlcPtnLcl_Upd01 crtAlcPtnLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAlcPtnLcl_Upd01();
		return lgc.aAlcPtnLcl_Upd01;
	}

	protected void paramAlcPtnLcl_Upd01(MCParam p) {
		if (this.aAlcPtnLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlcPtnLcl_Upd01.up0());
	}

	protected void doAlcPtnLcl_Upd01() {
		aAlcPtnLcl_Upd01.call();
	};

	/**
	 * AlcPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR createAlcPtnLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * AlcPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> createAlcPtnLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AlcPtn_DelChk01 aAlcPtn_DelChk01;

	protected void initAlcPtn_DelChk01() {
		this.info = PDef.MA_MABCL0035_AlcPtn_DelChk01_INFO;
		this.aAlcPtn_DelChk01 = ((MABCL_MultiReg)this).new AlcPtn_DelChk01();
	}

	public static MABCL_MultiReg.AlcPtn_DelChk01 crtAlcPtn_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAlcPtn_DelChk01();
		return lgc.aAlcPtn_DelChk01;
	}

	protected void paramAlcPtn_DelChk01(MCParam p) {
		if (this.aAlcPtn_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlcPtn_DelChk01.up0());
	}

	protected void doAlcPtn_DelChk01() {
		aAlcPtn_DelChk01.call();
	};

	/**
	 * AlcPtn_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR createAlcPtn_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.create();
	}

	/**
	 * AlcPtn_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> createAlcPtn_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.AlcPtn_Del01 aAlcPtn_Del01;

	protected void initAlcPtn_Del01() {
		this.info = PDef.MA_MABCL0035_AlcPtn_Del01_INFO;
		this.aAlcPtn_Del01 = ((MABCL_MultiReg)this).new AlcPtn_Del01();
	}

	public static MABCL_MultiReg.AlcPtn_Del01 crtAlcPtn_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initAlcPtn_Del01();
		return lgc.aAlcPtn_Del01;
	}

	protected void paramAlcPtn_Del01(MCParam p) {
		if (this.aAlcPtn_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAlcPtn_Del01.up0());
	}

	protected void doAlcPtn_Del01() {
		aAlcPtn_Del01.call();
	};

	/**
	 * AlcPtn_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR createAlcPtn_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.create();
	}

	/**
	 * AlcPtn_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> createAlcPtn_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CtgGrp_UpdChk01 aCtgGrp_UpdChk01;

	protected void initCtgGrp_UpdChk01() {
		this.info = PDef.MA_MABCL0035_CtgGrp_UpdChk01_INFO;
		this.aCtgGrp_UpdChk01 = ((MABCL_MultiReg)this).new CtgGrp_UpdChk01();
	}

	public static MABCL_MultiReg.CtgGrp_UpdChk01 crtCtgGrp_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCtgGrp_UpdChk01();
		return lgc.aCtgGrp_UpdChk01;
	}

	protected void paramCtgGrp_UpdChk01(MCParam p) {
		if (this.aCtgGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCtgGrp_UpdChk01.up0());
	}

	protected void doCtgGrp_UpdChk01() {
		aCtgGrp_UpdChk01.call();
	};

	/**
	 * CtgGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR createCtgGrp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.create();
	}

	/**
	 * CtgGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> createCtgGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CtgGrp_Upd01 aCtgGrp_Upd01;

	protected void initCtgGrp_Upd01() {
		this.info = PDef.MA_MABCL0035_CtgGrp_Upd01_INFO;
		this.aCtgGrp_Upd01 = ((MABCL_MultiReg)this).new CtgGrp_Upd01();
	}

	public static MABCL_MultiReg.CtgGrp_Upd01 crtCtgGrp_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCtgGrp_Upd01();
		return lgc.aCtgGrp_Upd01;
	}

	protected void paramCtgGrp_Upd01(MCParam p) {
		if (this.aCtgGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCtgGrp_Upd01.up0());
	}

	protected void doCtgGrp_Upd01() {
		aCtgGrp_Upd01.call();
	};

	/**
	 * CtgGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR createCtgGrp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.create();
	}

	/**
	 * CtgGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> createCtgGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CtgGrpLcl_UpdChk01 aCtgGrpLcl_UpdChk01;

	protected void initCtgGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_CtgGrpLcl_UpdChk01_INFO;
		this.aCtgGrpLcl_UpdChk01 = ((MABCL_MultiReg)this).new CtgGrpLcl_UpdChk01();
	}

	public static MABCL_MultiReg.CtgGrpLcl_UpdChk01 crtCtgGrpLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCtgGrpLcl_UpdChk01();
		return lgc.aCtgGrpLcl_UpdChk01;
	}

	protected void paramCtgGrpLcl_UpdChk01(MCParam p) {
		if (this.aCtgGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCtgGrpLcl_UpdChk01.up0());
	}

	protected void doCtgGrpLcl_UpdChk01() {
		aCtgGrpLcl_UpdChk01.call();
	};

	/**
	 * CtgGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR createCtgGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CtgGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> createCtgGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CtgGrpLcl_Upd01 aCtgGrpLcl_Upd01;

	protected void initCtgGrpLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_CtgGrpLcl_Upd01_INFO;
		this.aCtgGrpLcl_Upd01 = ((MABCL_MultiReg)this).new CtgGrpLcl_Upd01();
	}

	public static MABCL_MultiReg.CtgGrpLcl_Upd01 crtCtgGrpLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCtgGrpLcl_Upd01();
		return lgc.aCtgGrpLcl_Upd01;
	}

	protected void paramCtgGrpLcl_Upd01(MCParam p) {
		if (this.aCtgGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCtgGrpLcl_Upd01.up0());
	}

	protected void doCtgGrpLcl_Upd01() {
		aCtgGrpLcl_Upd01.call();
	};

	/**
	 * CtgGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR createCtgGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CtgGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> createCtgGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CtgGrp_DelChk01 aCtgGrp_DelChk01;

	protected void initCtgGrp_DelChk01() {
		this.info = PDef.MA_MABCL0035_CtgGrp_DelChk01_INFO;
		this.aCtgGrp_DelChk01 = ((MABCL_MultiReg)this).new CtgGrp_DelChk01();
	}

	public static MABCL_MultiReg.CtgGrp_DelChk01 crtCtgGrp_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCtgGrp_DelChk01();
		return lgc.aCtgGrp_DelChk01;
	}

	protected void paramCtgGrp_DelChk01(MCParam p) {
		if (this.aCtgGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCtgGrp_DelChk01.up0());
	}

	protected void doCtgGrp_DelChk01() {
		aCtgGrp_DelChk01.call();
	};

	/**
	 * CtgGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR createCtgGrp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.create();
	}

	/**
	 * CtgGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> createCtgGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.CtgGrp_Del01 aCtgGrp_Del01;

	protected void initCtgGrp_Del01() {
		this.info = PDef.MA_MABCL0035_CtgGrp_Del01_INFO;
		this.aCtgGrp_Del01 = ((MABCL_MultiReg)this).new CtgGrp_Del01();
	}

	public static MABCL_MultiReg.CtgGrp_Del01 crtCtgGrp_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initCtgGrp_Del01();
		return lgc.aCtgGrp_Del01;
	}

	protected void paramCtgGrp_Del01(MCParam p) {
		if (this.aCtgGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCtgGrp_Del01.up0());
	}

	protected void doCtgGrp_Del01() {
		aCtgGrp_Del01.call();
	};

	/**
	 * CtgGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR createCtgGrp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.create();
	}

	/**
	 * CtgGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> createCtgGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ActPtn_UpdChk01 aActPtn_UpdChk01;

	protected void initActPtn_UpdChk01() {
		this.info = PDef.MA_MABCL0035_ActPtn_UpdChk01_INFO;
		this.aActPtn_UpdChk01 = ((MABCL_MultiReg)this).new ActPtn_UpdChk01();
	}

	public static MABCL_MultiReg.ActPtn_UpdChk01 crtActPtn_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initActPtn_UpdChk01();
		return lgc.aActPtn_UpdChk01;
	}

	protected void paramActPtn_UpdChk01(MCParam p) {
		if (this.aActPtn_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aActPtn_UpdChk01.up0());
	}

	protected void doActPtn_UpdChk01() {
		aActPtn_UpdChk01.call();
	};

	/**
	 * ActPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR createActPtn_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.create();
	}

	/**
	 * ActPtn_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> createActPtn_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ActPtn_Upd01 aActPtn_Upd01;

	protected void initActPtn_Upd01() {
		this.info = PDef.MA_MABCL0035_ActPtn_Upd01_INFO;
		this.aActPtn_Upd01 = ((MABCL_MultiReg)this).new ActPtn_Upd01();
	}

	public static MABCL_MultiReg.ActPtn_Upd01 crtActPtn_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initActPtn_Upd01();
		return lgc.aActPtn_Upd01;
	}

	protected void paramActPtn_Upd01(MCParam p) {
		if (this.aActPtn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aActPtn_Upd01.up0());
	}

	protected void doActPtn_Upd01() {
		aActPtn_Upd01.call();
	};

	/**
	 * ActPtn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR createActPtn_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.create();
	}

	/**
	 * ActPtn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> createActPtn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ActPtnLcl_UpdChk01 aActPtnLcl_UpdChk01;

	protected void initActPtnLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0035_ActPtnLcl_UpdChk01_INFO;
		this.aActPtnLcl_UpdChk01 = ((MABCL_MultiReg)this).new ActPtnLcl_UpdChk01();
	}

	public static MABCL_MultiReg.ActPtnLcl_UpdChk01 crtActPtnLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initActPtnLcl_UpdChk01();
		return lgc.aActPtnLcl_UpdChk01;
	}

	protected void paramActPtnLcl_UpdChk01(MCParam p) {
		if (this.aActPtnLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aActPtnLcl_UpdChk01.up0());
	}

	protected void doActPtnLcl_UpdChk01() {
		aActPtnLcl_UpdChk01.call();
	};

	/**
	 * ActPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR createActPtnLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ActPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> createActPtnLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ActPtnLcl_Upd01 aActPtnLcl_Upd01;

	protected void initActPtnLcl_Upd01() {
		this.info = PDef.MA_MABCL0035_ActPtnLcl_Upd01_INFO;
		this.aActPtnLcl_Upd01 = ((MABCL_MultiReg)this).new ActPtnLcl_Upd01();
	}

	public static MABCL_MultiReg.ActPtnLcl_Upd01 crtActPtnLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initActPtnLcl_Upd01();
		return lgc.aActPtnLcl_Upd01;
	}

	protected void paramActPtnLcl_Upd01(MCParam p) {
		if (this.aActPtnLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aActPtnLcl_Upd01.up0());
	}

	protected void doActPtnLcl_Upd01() {
		aActPtnLcl_Upd01.call();
	};

	/**
	 * ActPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR createActPtnLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ActPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> createActPtnLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ActPtn_DelChk01 aActPtn_DelChk01;

	protected void initActPtn_DelChk01() {
		this.info = PDef.MA_MABCL0035_ActPtn_DelChk01_INFO;
		this.aActPtn_DelChk01 = ((MABCL_MultiReg)this).new ActPtn_DelChk01();
	}

	public static MABCL_MultiReg.ActPtn_DelChk01 crtActPtn_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initActPtn_DelChk01();
		return lgc.aActPtn_DelChk01;
	}

	protected void paramActPtn_DelChk01(MCParam p) {
		if (this.aActPtn_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aActPtn_DelChk01.up0());
	}

	protected void doActPtn_DelChk01() {
		aActPtn_DelChk01.call();
	};

	/**
	 * ActPtn_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR createActPtn_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.create();
	}

	/**
	 * ActPtn_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> createActPtn_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ActPtn_Del01 aActPtn_Del01;

	protected void initActPtn_Del01() {
		this.info = PDef.MA_MABCL0035_ActPtn_Del01_INFO;
		this.aActPtn_Del01 = ((MABCL_MultiReg)this).new ActPtn_Del01();
	}

	public static MABCL_MultiReg.ActPtn_Del01 crtActPtn_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initActPtn_Del01();
		return lgc.aActPtn_Del01;
	}

	protected void paramActPtn_Del01(MCParam p) {
		if (this.aActPtn_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aActPtn_Del01.up0());
	}

	protected void doActPtn_Del01() {
		aActPtn_Del01.call();
	};

	/**
	 * ActPtn_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR createActPtn_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.create();
	}

	/**
	 * ActPtn_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> createActPtn_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * JnlPtnBase_UpdChk01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの登録前のチェックを行います。<br>
	 */
	abstract public class JnlPtnBase_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlPtnBase_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected JnlPtnBase_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.class);

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
		 * JnlPtnBase_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR createJnlPtnBase_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.create();
		}

		/**
		 * JnlPtnBase_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> createJnlPtnBase_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * JnlPtnBase_Upd01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの登録を行います。<br>
	 */
	abstract public class JnlPtnBase_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlPtnBase_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_BASE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_BASE_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_PTN_BASE_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_BASE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_BASE_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_PTN_BASE_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlPtnBase_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_JNL_PTN_BASE_R.create("T1"));
			chkMaster = MCController.create(MAM_JNL_PTN_BASE_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_JNL_PTN_BASE_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_JNL_PTN_BASE_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * JnlPtnBase_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR createJnlPtnBase_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.create();
		}

		/**
		 * JnlPtnBase_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> createJnlPtnBase_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_JNL_PTN_BASE_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> src_JnlPtnBase_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_JnlPtnBase_Upd01_Dtl);
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
				addColumnPathMap("jnl_ptn_cd", "jnl_ptn_cd");
				addColumnPathMap("jnl_ptn_nm", "jnl_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_JNL_PTN_BASE_R r_dest, mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_JNL_PTN_BASE_R> dest, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR r_src : src){
				MAM_JNL_PTN_BASE_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_JNL_PTN_BASE_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> src_JnlPtnBase_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_JnlPtnBase_Upd01_Dtl);
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
				addColumnPathMap("jnl_ptn_cd", "jnl_ptn_cd");
				addColumnPathMap("jnl_ptn_nm", "jnl_ptn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_JNL_PTN_BASE_R r_dest, mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_JNL_PTN_BASE_R> dest, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.JnlPtnBase_UpdChk01_DtlR r_src : src){
				MAM_JNL_PTN_BASE_R r_dest = dest.createRow();
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
	 * JnlPtnBaseLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class JnlPtnBaseLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlPtnBaseLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_BASE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_BASE_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_JNL_PTN_BASE_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlPtnBaseLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_JNL_PTN_BASE_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_JNL_PTN_BASE_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #chk01_up0}）<br>
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
		 * JnlPtnBaseLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR createJnlPtnBaseLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.create();
		}

		/**
		 * JnlPtnBaseLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> createJnlPtnBaseLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_JNL_PTN_BASE_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> src_JnlPtnBaseLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_JnlPtnBaseLcl_UpdChk01_Dtl);
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
				addColumnPathMap("jnl_ptn_cd", "jnl_ptn_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_JNL_PTN_BASE_R r_dest, mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_JNL_PTN_BASE_R> dest, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR r_src : src){
				MAM_JNL_PTN_BASE_R r_dest = dest.createRow();
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
	 * JnlPtnBaseLcl_Upd01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class JnlPtnBaseLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlPtnBaseLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_BASE_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_BASE_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_PTN_BASE_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_BASE_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_PTN_BASE_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_BASE_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_BASE_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_PTN_BASE_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_BASE_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_PTN_BASE_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlPtnBaseLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_JNL_PTN_BASE_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_JNL_PTN_BASE_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_JNL_PTN_BASE_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_JNL_PTN_BASE_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_JNL_PTN_BASE_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_JNL_PTN_BASE_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * JnlPtnBaseLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR createJnlPtnBaseLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.create();
		}

		/**
		 * JnlPtnBaseLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> createJnlPtnBaseLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_JNL_PTN_BASE_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> src_JnlPtnBaseLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_JnlPtnBaseLcl_Upd01_Dtl);
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
				addColumnPathMap("jnl_ptn_cd", "jnl_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("jnl_ptn_nm", "jnl_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_JNL_PTN_BASE_LCL_R r_dest, mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_JNL_PTN_BASE_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR r_src : src){
				MAM_JNL_PTN_BASE_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_JNL_PTN_BASE_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> src_JnlPtnBaseLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_JnlPtnBaseLcl_Upd01_Dtl);
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
				addColumnPathMap("jnl_ptn_cd", "jnl_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("jnl_ptn_nm", "jnl_ptn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_JNL_PTN_BASE_LCL_R r_dest, mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_JNL_PTN_BASE_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.JnlPtnBaseLcl_UpdChk01_DtlR r_src : src){
				MAM_JNL_PTN_BASE_LCL_R r_dest = dest.createRow();
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
	 * JnlPtnBase_DelChk01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの削除前のチェックを行います。<br>
	 */
	abstract public class JnlPtnBase_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlPtnBase_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected JnlPtnBase_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.class);

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
		 * JnlPtnBase_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR createJnlPtnBase_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.create();
		}

		/**
		 * JnlPtnBase_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> createJnlPtnBase_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * JnlPtnBase_Del01オペレーション.<p>
	 *
	 * 仕訳パタンマスタの削除を行います。<br>
	 */
	abstract public class JnlPtnBase_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlPtnBase_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_BASE_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_BASE_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_BASE_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_BASE_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_PTN_BASE_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_BASE_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_JNL_PTN_BASE_R> updMaster1_up0;
		public final MCList<MAM_JNL_PTN_BASE_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlPtnBase_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_JNL_PTN_BASE_R.create("T1"));
			updMaster2 = MCController.create(MAM_JNL_PTN_BASE_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_JNL_PTN_BASE_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_JNL_PTN_BASE_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_JNL_PTN_BASE_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_JNL_PTN_BASE_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * JnlPtnBase_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR createJnlPtnBase_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.create();
		}

		/**
		 * JnlPtnBase_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> createJnlPtnBase_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_JNL_PTN_BASE_R> dest0_0, MCList<MAM_JNL_PTN_BASE_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> src_JnlPtnBase_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_JnlPtnBase_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_JnlPtnBase_Del01_Dtl);
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
				addColumnPathMap("jnl_ptn_cd", "jnl_ptn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_JNL_PTN_BASE_R r_dest, mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_JNL_PTN_BASE_R> dest, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR r_src : src){
				MAM_JNL_PTN_BASE_R r_dest = dest.createRow();
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
				addColumnPathMap("jnl_ptn_cd", "jnl_ptn_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_JNL_PTN_BASE_LCL_R r_dest, mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_JNL_PTN_BASE_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.JnlPtnBase_DelChk01_DtlR r_src : src){
				MAM_JNL_PTN_BASE_LCL_R r_dest = dest.createRow();
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
	 * AutoJnlKey_UpdChk01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの登録前のチェックを行います。<br>
	 */
	abstract public class AutoJnlKey_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnlKey_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected AutoJnlKey_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.class);

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
		 * AutoJnlKey_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR createAutoJnlKey_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.create();
		}

		/**
		 * AutoJnlKey_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> createAutoJnlKey_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_cd</td></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * AutoJnlKey_Upd01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの登録を行います。<br>
	 */
	abstract public class AutoJnlKey_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnlKey_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AUTO_JNL_KEY_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_AUTO_JNL_KEY_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AUTO_JNL_KEY_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_AUTO_JNL_KEY_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AutoJnlKey_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_AUTO_JNL_KEY_R.create("T1"));
			chkMaster = MCController.create(MAM_AUTO_JNL_KEY_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_AUTO_JNL_KEY_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_AUTO_JNL_KEY_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * AutoJnlKey_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR createAutoJnlKey_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.create();
		}

		/**
		 * AutoJnlKey_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> createAutoJnlKey_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_cd</td></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_AUTO_JNL_KEY_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> src_AutoJnlKey_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AutoJnlKey_Upd01_Dtl);
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
				addColumnPathMap("auto_jnl_key_cd", "auto_jnl_key_cd");
				addColumnPathMap("auto_jnl_key_nm", "auto_jnl_key_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_AUTO_JNL_KEY_R r_dest, mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_AUTO_JNL_KEY_R> dest, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR r_src : src){
				MAM_AUTO_JNL_KEY_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_AUTO_JNL_KEY_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> src_AutoJnlKey_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AutoJnlKey_Upd01_Dtl);
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
				addColumnPathMap("auto_jnl_key_cd", "auto_jnl_key_cd");
				addColumnPathMap("auto_jnl_key_nm", "auto_jnl_key_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_AUTO_JNL_KEY_R r_dest, mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_AUTO_JNL_KEY_R> dest, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.AutoJnlKey_UpdChk01_DtlR r_src : src){
				MAM_AUTO_JNL_KEY_R r_dest = dest.createRow();
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
	 * AutoJnlKeyLcl_UpdChk01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class AutoJnlKeyLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnlKeyLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AUTO_JNL_KEY_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_AUTO_JNL_KEY_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AutoJnlKeyLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_AUTO_JNL_KEY_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_AUTO_JNL_KEY_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #chk01_up0}）<br>
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
		 * AutoJnlKeyLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR createAutoJnlKeyLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AutoJnlKeyLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> createAutoJnlKeyLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_AUTO_JNL_KEY_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> src_AutoJnlKeyLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_AutoJnlKeyLcl_UpdChk01_Dtl);
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
				addColumnPathMap("auto_jnl_key_cd", "auto_jnl_key_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_AUTO_JNL_KEY_R r_dest, mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_AUTO_JNL_KEY_R> dest, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR r_src : src){
				MAM_AUTO_JNL_KEY_R r_dest = dest.createRow();
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
	 * AutoJnlKeyLcl_Upd01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class AutoJnlKeyLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnlKeyLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AUTO_JNL_KEY_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AUTO_JNL_KEY_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_AUTO_JNL_KEY_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AUTO_JNL_KEY_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AUTO_JNL_KEY_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_AUTO_JNL_KEY_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AutoJnlKeyLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_AUTO_JNL_KEY_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_AUTO_JNL_KEY_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_AUTO_JNL_KEY_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_AUTO_JNL_KEY_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_AUTO_JNL_KEY_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_AUTO_JNL_KEY_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * AutoJnlKeyLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR createAutoJnlKeyLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AutoJnlKeyLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> createAutoJnlKeyLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_AUTO_JNL_KEY_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> src_AutoJnlKeyLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AutoJnlKeyLcl_Upd01_Dtl);
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
				addColumnPathMap("auto_jnl_key_cd", "auto_jnl_key_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("auto_jnl_key_nm", "auto_jnl_key_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_AUTO_JNL_KEY_LCL_R r_dest, mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_AUTO_JNL_KEY_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR r_src : src){
				MAM_AUTO_JNL_KEY_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_AUTO_JNL_KEY_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> src_AutoJnlKeyLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AutoJnlKeyLcl_Upd01_Dtl);
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
				addColumnPathMap("auto_jnl_key_cd", "auto_jnl_key_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("auto_jnl_key_nm", "auto_jnl_key_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_AUTO_JNL_KEY_LCL_R r_dest, mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_AUTO_JNL_KEY_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.AutoJnlKeyLcl_UpdChk01_DtlR r_src : src){
				MAM_AUTO_JNL_KEY_LCL_R r_dest = dest.createRow();
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
	 * AutoJnlKey_DelChk01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの削除前のチェックを行います。<br>
	 */
	abstract public class AutoJnlKey_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnlKey_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected AutoJnlKey_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.class);

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
		 * AutoJnlKey_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR createAutoJnlKey_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.create();
		}

		/**
		 * AutoJnlKey_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> createAutoJnlKey_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * AutoJnlKey_Del01オペレーション.<p>
	 *
	 * 自動仕訳キーマスタの削除を行います。<br>
	 */
	abstract public class AutoJnlKey_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AutoJnlKey_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AUTO_JNL_KEY_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_AUTO_JNL_KEY_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_AUTO_JNL_KEY_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_AUTO_JNL_KEY_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_AUTO_JNL_KEY_R> updMaster1_up0;
		public final MCList<MAM_AUTO_JNL_KEY_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AutoJnlKey_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_AUTO_JNL_KEY_R.create("T1"));
			updMaster2 = MCController.create(MAM_AUTO_JNL_KEY_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_AUTO_JNL_KEY_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_AUTO_JNL_KEY_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_AUTO_JNL_KEY_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_AUTO_JNL_KEY_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * AutoJnlKey_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR createAutoJnlKey_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.create();
		}

		/**
		 * AutoJnlKey_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> createAutoJnlKey_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>auto_jnl_key_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_AUTO_JNL_KEY_R> dest0_0, MCList<MAM_AUTO_JNL_KEY_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> src_AutoJnlKey_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_AutoJnlKey_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_AutoJnlKey_Del01_Dtl);
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
				addColumnPathMap("auto_jnl_key_cd", "auto_jnl_key_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_AUTO_JNL_KEY_R r_dest, mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_AUTO_JNL_KEY_R> dest, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR r_src : src){
				MAM_AUTO_JNL_KEY_R r_dest = dest.createRow();
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
				addColumnPathMap("auto_jnl_key_cd", "auto_jnl_key_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_AUTO_JNL_KEY_LCL_R r_dest, mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_AUTO_JNL_KEY_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.AutoJnlKey_DelChk01_DtlR r_src : src){
				MAM_AUTO_JNL_KEY_LCL_R r_dest = dest.createRow();
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
	 * InspPtn_UpdChk01オペレーション.<p>
	 *
	 * 検査パタンマスタの登録前のチェックを行います。<br>
	 */
	abstract public class InspPtn_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspPtn_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected InspPtn_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.class);

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
		 * InspPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR createInspPtn_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.create();
		}

		/**
		 * InspPtn_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> createInspPtn_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * InspPtn_Upd01オペレーション.<p>
	 *
	 * 検査パタンマスタの登録を行います。<br>
	 */
	abstract public class InspPtn_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspPtn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_INSP_PTN_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_INSP_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_INSP_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_INSP_PTN_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_INSP_PTN_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_INSP_PTN_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_INSP_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_INSP_PTN_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_INSP_PTN_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_INSP_PTN_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected InspPtn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_INSP_PTN_R.create("T1"));
			chkMaster = MCController.create(MAM_INSP_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_INSP_PTN_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_INSP_PTN_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_INSP_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_INSP_PTN_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * InspPtn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR createInspPtn_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.create();
		}

		/**
		 * InspPtn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> createInspPtn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_INSP_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> src_InspPtn_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_InspPtn_Upd01_Dtl);
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
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("insp_ptn_nm", "insp_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_INSP_PTN_R r_dest, mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_INSP_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR r_src : src){
				MAM_INSP_PTN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_INSP_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> src_InspPtn_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_InspPtn_Upd01_Dtl);
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
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("insp_ptn_nm", "insp_ptn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_INSP_PTN_R r_dest, mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_INSP_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.InspPtn_UpdChk01_DtlR r_src : src){
				MAM_INSP_PTN_R r_dest = dest.createRow();
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
	 * InspPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 検査パタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class InspPtnLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspPtnLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_INSP_PTN_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_INSP_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_INSP_PTN_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_INSP_PTN_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_INSP_PTN_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected InspPtnLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_INSP_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_INSP_PTN_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_INSP_PTN_R&gt; （{@link #chk01_up0}）<br>
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
		 * InspPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR createInspPtnLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * InspPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> createInspPtnLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_INSP_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> src_InspPtnLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_InspPtnLcl_UpdChk01_Dtl);
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
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_INSP_PTN_R r_dest, mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_INSP_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_INSP_PTN_R r_dest = dest.createRow();
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
	 * InspPtnLcl_Upd01オペレーション.<p>
	 *
	 * 検査パタンマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class InspPtnLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspPtnLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_INSP_PTN_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_INSP_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_INSP_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_INSP_PTN_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_INSP_PTN_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_INSP_PTN_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_INSP_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_INSP_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_INSP_PTN_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_INSP_PTN_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected InspPtnLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_INSP_PTN_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_INSP_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_INSP_PTN_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_INSP_PTN_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_INSP_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_INSP_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * InspPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR createInspPtnLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * InspPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> createInspPtnLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_INSP_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> src_InspPtnLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_InspPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("insp_ptn_nm", "insp_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_INSP_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_INSP_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_INSP_PTN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_INSP_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> src_InspPtnLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_InspPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("insp_ptn_nm", "insp_ptn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_INSP_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_INSP_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.InspPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_INSP_PTN_LCL_R r_dest = dest.createRow();
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
	 * InspPtn_DelChk01オペレーション.<p>
	 *
	 * 検査パタンマスタの削除前のチェックを行います。<br>
	 */
	abstract public class InspPtn_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspPtn_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected InspPtn_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.class);

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
		 * InspPtn_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR createInspPtn_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.create();
		}

		/**
		 * InspPtn_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> createInspPtn_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * InspPtn_Del01オペレーション.<p>
	 *
	 * 検査パタンマスタの削除を行います。<br>
	 */
	abstract public class InspPtn_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspPtn_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_INSP_PTN_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_INSP_PTN_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_INSP_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_INSP_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_INSP_PTN_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_INSP_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_INSP_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_INSP_PTN_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_INSP_PTN_R> updMaster1_up0;
		public final MCList<MAM_INSP_PTN_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected InspPtn_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_INSP_PTN_R.create("T1"));
			updMaster2 = MCController.create(MAM_INSP_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_INSP_PTN_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_INSP_PTN_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_INSP_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_INSP_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * InspPtn_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR createInspPtn_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.create();
		}

		/**
		 * InspPtn_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> createInspPtn_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_INSP_PTN_R> dest0_0, MCList<MAM_INSP_PTN_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> src_InspPtn_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_InspPtn_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_InspPtn_Del01_Dtl);
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
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_INSP_PTN_R r_dest, mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_INSP_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR r_src : src){
				MAM_INSP_PTN_R r_dest = dest.createRow();
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
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_INSP_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_INSP_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.InspPtn_DelChk01_DtlR r_src : src){
				MAM_INSP_PTN_LCL_R r_dest = dest.createRow();
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
	 * WkDay_UpdChk01オペレーション.<p>
	 *
	 * 勤務種類マスタの登録前のチェックを行います。<br>
	 */
	abstract public class WkDay_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkDay_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected WkDay_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.class);

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
		 * WkDay_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR createWkDay_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.create();
		}

		/**
		 * WkDay_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> createWkDay_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * WkDay_Upd01オペレーション.<p>
	 *
	 * 勤務種類マスタの登録を行います。<br>
	 */
	abstract public class WkDay_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkDay_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_DAY_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_DAY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_DAY_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_DAY_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_DAY_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_DAY_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_DAY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_DAY_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_DAY_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_DAY_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkDay_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_WK_DAY_R.create("T1"));
			chkMaster = MCController.create(MAM_WK_DAY_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_WK_DAY_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_WK_DAY_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WK_DAY_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_WK_DAY_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * WkDay_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR createWkDay_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.create();
		}

		/**
		 * WkDay_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> createWkDay_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WK_DAY_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> src_WkDay_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_WkDay_Upd01_Dtl);
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
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("wk_day_nm", "wk_day_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_WK_DAY_R r_dest, mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_WK_DAY_R> dest, MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR r_src : src){
				MAM_WK_DAY_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_WK_DAY_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> src_WkDay_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_WkDay_Upd01_Dtl);
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
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("wk_day_nm", "wk_day_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_WK_DAY_R r_dest, mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_WK_DAY_R> dest, MCList<mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.WkDay_UpdChk01_DtlR r_src : src){
				MAM_WK_DAY_R r_dest = dest.createRow();
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
	 * WkDayLcl_UpdChk01オペレーション.<p>
	 *
	 * 勤務種類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class WkDayLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkDayLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_DAY_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_DAY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_DAY_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_DAY_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_WK_DAY_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkDayLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_WK_DAY_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_WK_DAY_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_WK_DAY_R&gt; （{@link #chk01_up0}）<br>
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
		 * WkDayLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR createWkDayLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.create();
		}

		/**
		 * WkDayLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> createWkDayLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_WK_DAY_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> src_WkDayLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_WkDayLcl_UpdChk01_Dtl);
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
				addColumnPathMap("wk_day_cd", "wk_day_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_WK_DAY_R r_dest, mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_WK_DAY_R> dest, MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR r_src : src){
				MAM_WK_DAY_R r_dest = dest.createRow();
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
	 * WkDayLcl_Upd01オペレーション.<p>
	 *
	 * 勤務種類マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class WkDayLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkDayLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_DAY_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_DAY_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_DAY_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_DAY_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_DAY_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_DAY_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_DAY_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_DAY_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_DAY_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_WK_DAY_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkDayLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_WK_DAY_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_WK_DAY_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_WK_DAY_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_WK_DAY_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WK_DAY_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_WK_DAY_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * WkDayLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR createWkDayLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.create();
		}

		/**
		 * WkDayLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> createWkDayLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WK_DAY_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> src_WkDayLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_WkDayLcl_Upd01_Dtl);
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
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("wk_day_nm", "wk_day_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_WK_DAY_LCL_R r_dest, mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_WK_DAY_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR r_src : src){
				MAM_WK_DAY_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_WK_DAY_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> src_WkDayLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_WkDayLcl_Upd01_Dtl);
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
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("wk_day_nm", "wk_day_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_WK_DAY_LCL_R r_dest, mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_WK_DAY_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.WkDayLcl_UpdChk01_DtlR r_src : src){
				MAM_WK_DAY_LCL_R r_dest = dest.createRow();
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
	 * WkDay_DelChk01オペレーション.<p>
	 *
	 * 勤務種類マスタの削除前のチェックを行います。<br>
	 */
	abstract public class WkDay_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkDay_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected WkDay_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.class);

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
		 * WkDay_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR createWkDay_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.create();
		}

		/**
		 * WkDay_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> createWkDay_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * WkDay_Del01オペレーション.<p>
	 *
	 * 勤務種類マスタの削除を行います。<br>
	 */
	abstract public class WkDay_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "WkDay_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_WK_DAY_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_WK_DAY_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_DAY_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_DAY_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_DAY_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_WK_DAY_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_WK_DAY_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_WK_DAY_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_WK_DAY_R> updMaster1_up0;
		public final MCList<MAM_WK_DAY_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected WkDay_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_WK_DAY_R.create("T1"));
			updMaster2 = MCController.create(MAM_WK_DAY_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_WK_DAY_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_WK_DAY_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_WK_DAY_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_WK_DAY_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * WkDay_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR createWkDay_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.create();
		}

		/**
		 * WkDay_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> createWkDay_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_WK_DAY_R> dest0_0, MCList<MAM_WK_DAY_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> src_WkDay_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_WkDay_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_WkDay_Del01_Dtl);
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
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_WK_DAY_R r_dest, mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_WK_DAY_R> dest, MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR r_src : src){
				MAM_WK_DAY_R r_dest = dest.createRow();
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
				addColumnPathMap("wk_day_cd", "wk_day_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_WK_DAY_LCL_R r_dest, mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_WK_DAY_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.WkDay_DelChk01_DtlR r_src : src){
				MAM_WK_DAY_LCL_R r_dest = dest.createRow();
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
	 * ShipTerm_UpdChk01オペレーション.<p>
	 *
	 * 出荷条件マスタの登録前のチェックを行います。<br>
	 */
	abstract public class ShipTerm_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipTerm_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipTerm_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.class);

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
		 * ShipTerm_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR createShipTerm_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.create();
		}

		/**
		 * ShipTerm_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> createShipTerm_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ShipTerm_Upd01オペレーション.<p>
	 *
	 * 出荷条件マスタの登録を行います。<br>
	 */
	abstract public class ShipTerm_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipTerm_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_TERM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_TERM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_TERM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_TERM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_TERM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_TERM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_TERM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_TERM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_TERM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_TERM_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipTerm_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SHIP_TERM_R.create("T1"));
			chkMaster = MCController.create(MAM_SHIP_TERM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SHIP_TERM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SHIP_TERM_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SHIP_TERM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SHIP_TERM_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ShipTerm_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR createShipTerm_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.create();
		}

		/**
		 * ShipTerm_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> createShipTerm_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SHIP_TERM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> src_ShipTerm_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ShipTerm_Upd01_Dtl);
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
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_term_nm", "ship_term_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SHIP_TERM_R r_dest, mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SHIP_TERM_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR r_src : src){
				MAM_SHIP_TERM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SHIP_TERM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> src_ShipTerm_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ShipTerm_Upd01_Dtl);
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
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("ship_term_nm", "ship_term_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SHIP_TERM_R r_dest, mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SHIP_TERM_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.ShipTerm_UpdChk01_DtlR r_src : src){
				MAM_SHIP_TERM_R r_dest = dest.createRow();
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
	 * ShipTermLcl_UpdChk01オペレーション.<p>
	 *
	 * 出荷条件マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class ShipTermLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipTermLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_TERM_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_TERM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_TERM_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_TERM_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_TERM_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipTermLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SHIP_TERM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SHIP_TERM_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SHIP_TERM_R&gt; （{@link #chk01_up0}）<br>
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
		 * ShipTermLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR createShipTermLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ShipTermLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> createShipTermLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_SHIP_TERM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> src_ShipTermLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ShipTermLcl_UpdChk01_Dtl);
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
				addColumnPathMap("ship_term_cd", "ship_term_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SHIP_TERM_R r_dest, mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SHIP_TERM_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR r_src : src){
				MAM_SHIP_TERM_R r_dest = dest.createRow();
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
	 * ShipTermLcl_Upd01オペレーション.<p>
	 *
	 * 出荷条件マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class ShipTermLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipTermLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_TERM_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_TERM_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_TERM_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_TERM_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_TERM_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_TERM_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_TERM_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_TERM_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_TERM_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_TERM_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipTermLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SHIP_TERM_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SHIP_TERM_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SHIP_TERM_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SHIP_TERM_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SHIP_TERM_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SHIP_TERM_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ShipTermLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR createShipTermLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ShipTermLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> createShipTermLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SHIP_TERM_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> src_ShipTermLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ShipTermLcl_Upd01_Dtl);
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
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ship_term_nm", "ship_term_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SHIP_TERM_LCL_R r_dest, mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SHIP_TERM_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR r_src : src){
				MAM_SHIP_TERM_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SHIP_TERM_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> src_ShipTermLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ShipTermLcl_Upd01_Dtl);
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
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ship_term_nm", "ship_term_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SHIP_TERM_LCL_R r_dest, mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SHIP_TERM_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.ShipTermLcl_UpdChk01_DtlR r_src : src){
				MAM_SHIP_TERM_LCL_R r_dest = dest.createRow();
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
	 * ShipTerm_DelChk01オペレーション.<p>
	 *
	 * 出荷条件マスタの削除前のチェックを行います。<br>
	 */
	abstract public class ShipTerm_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipTerm_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipTerm_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.class);

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
		 * ShipTerm_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR createShipTerm_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.create();
		}

		/**
		 * ShipTerm_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> createShipTerm_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ShipTerm_Del01オペレーション.<p>
	 *
	 * 出荷条件マスタの削除を行います。<br>
	 */
	abstract public class ShipTerm_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipTerm_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_TERM_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_TERM_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_TERM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_TERM_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_TERM_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_TERM_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_TERM_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_TERM_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_TERM_R> updMaster1_up0;
		public final MCList<MAM_SHIP_TERM_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipTerm_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_SHIP_TERM_R.create("T1"));
			updMaster2 = MCController.create(MAM_SHIP_TERM_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_SHIP_TERM_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_SHIP_TERM_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SHIP_TERM_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_SHIP_TERM_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * ShipTerm_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR createShipTerm_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.create();
		}

		/**
		 * ShipTerm_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> createShipTerm_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SHIP_TERM_R> dest0_0, MCList<MAM_SHIP_TERM_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> src_ShipTerm_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ShipTerm_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ShipTerm_Del01_Dtl);
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
				addColumnPathMap("ship_term_cd", "ship_term_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_SHIP_TERM_R r_dest, mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_SHIP_TERM_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR r_src : src){
				MAM_SHIP_TERM_R r_dest = dest.createRow();
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
				addColumnPathMap("ship_term_cd", "ship_term_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_SHIP_TERM_LCL_R r_dest, mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_SHIP_TERM_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.ShipTerm_DelChk01_DtlR r_src : src){
				MAM_SHIP_TERM_LCL_R r_dest = dest.createRow();
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
	 * ShipWk_UpdChk01オペレーション.<p>
	 *
	 * 出荷作業マスタの登録前のチェックを行います。<br>
	 */
	abstract public class ShipWk_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipWk_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipWk_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.class);

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
		 * ShipWk_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR createShipWk_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.create();
		}

		/**
		 * ShipWk_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> createShipWk_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ShipWk_Upd01オペレーション.<p>
	 *
	 * 出荷作業マスタの登録を行います。<br>
	 */
	abstract public class ShipWk_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipWk_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_WK_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_WK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_WK_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_WK_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_WK_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_WK_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_WK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_WK_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_WK_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_WK_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipWk_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SHIP_WK_R.create("T1"));
			chkMaster = MCController.create(MAM_SHIP_WK_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SHIP_WK_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SHIP_WK_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SHIP_WK_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SHIP_WK_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ShipWk_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR createShipWk_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.create();
		}

		/**
		 * ShipWk_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> createShipWk_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SHIP_WK_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> src_ShipWk_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ShipWk_Upd01_Dtl);
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
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
				addColumnPathMap("ship_wk_nm", "ship_wk_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SHIP_WK_R r_dest, mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SHIP_WK_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR r_src : src){
				MAM_SHIP_WK_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SHIP_WK_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> src_ShipWk_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ShipWk_Upd01_Dtl);
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
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
				addColumnPathMap("ship_wk_nm", "ship_wk_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SHIP_WK_R r_dest, mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SHIP_WK_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.ShipWk_UpdChk01_DtlR r_src : src){
				MAM_SHIP_WK_R r_dest = dest.createRow();
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
	 * ShipWkLcl_UpdChk01オペレーション.<p>
	 *
	 * 出荷作業マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class ShipWkLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipWkLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_WK_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_WK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_WK_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_WK_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_WK_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipWkLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SHIP_WK_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SHIP_WK_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SHIP_WK_R&gt; （{@link #chk01_up0}）<br>
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
		 * ShipWkLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR createShipWkLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ShipWkLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> createShipWkLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_SHIP_WK_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> src_ShipWkLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ShipWkLcl_UpdChk01_Dtl);
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
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SHIP_WK_R r_dest, mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SHIP_WK_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR r_src : src){
				MAM_SHIP_WK_R r_dest = dest.createRow();
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
	 * ShipWkLcl_Upd01オペレーション.<p>
	 *
	 * 出荷作業マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class ShipWkLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipWkLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_WK_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_WK_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_WK_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_WK_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_WK_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_WK_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_WK_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_WK_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_WK_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_WK_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipWkLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SHIP_WK_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SHIP_WK_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SHIP_WK_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SHIP_WK_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SHIP_WK_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SHIP_WK_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ShipWkLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR createShipWkLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ShipWkLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> createShipWkLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SHIP_WK_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> src_ShipWkLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ShipWkLcl_Upd01_Dtl);
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
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ship_wk_nm", "ship_wk_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SHIP_WK_LCL_R r_dest, mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SHIP_WK_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR r_src : src){
				MAM_SHIP_WK_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SHIP_WK_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> src_ShipWkLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ShipWkLcl_Upd01_Dtl);
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
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ship_wk_nm", "ship_wk_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SHIP_WK_LCL_R r_dest, mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SHIP_WK_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.ShipWkLcl_UpdChk01_DtlR r_src : src){
				MAM_SHIP_WK_LCL_R r_dest = dest.createRow();
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
	 * ShipWk_DelChk01オペレーション.<p>
	 *
	 * 出荷作業マスタの削除前のチェックを行います。<br>
	 */
	abstract public class ShipWk_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipWk_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipWk_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.class);

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
		 * ShipWk_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR createShipWk_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.create();
		}

		/**
		 * ShipWk_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> createShipWk_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ShipWk_Del01オペレーション.<p>
	 *
	 * 出荷作業マスタの削除を行います。<br>
	 */
	abstract public class ShipWk_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipWk_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_WK_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_WK_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_WK_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_WK_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_WK_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_WK_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SHIP_WK_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_WK_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_SHIP_WK_R> updMaster1_up0;
		public final MCList<MAM_SHIP_WK_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ShipWk_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_SHIP_WK_R.create("T1"));
			updMaster2 = MCController.create(MAM_SHIP_WK_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_SHIP_WK_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_SHIP_WK_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SHIP_WK_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_SHIP_WK_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * ShipWk_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR createShipWk_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.create();
		}

		/**
		 * ShipWk_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> createShipWk_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SHIP_WK_R> dest0_0, MCList<MAM_SHIP_WK_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> src_ShipWk_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ShipWk_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ShipWk_Del01_Dtl);
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
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_SHIP_WK_R r_dest, mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_SHIP_WK_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR r_src : src){
				MAM_SHIP_WK_R r_dest = dest.createRow();
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
				addColumnPathMap("ship_wk_cd", "ship_wk_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_SHIP_WK_LCL_R r_dest, mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_SHIP_WK_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.ShipWk_DelChk01_DtlR r_src : src){
				MAM_SHIP_WK_LCL_R r_dest = dest.createRow();
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
	 * Rsrc_UpdChk01オペレーション.<p>
	 *
	 * 資源マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Rsrc_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rsrc_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Rsrc_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.class);

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
		 * Rsrc_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR createRsrc_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.create();
		}

		/**
		 * Rsrc_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> createRsrc_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rsrc_cd</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Rsrc_Upd01オペレーション.<p>
	 *
	 * 資源マスタの登録を行います。<br>
	 */
	abstract public class Rsrc_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rsrc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RSRC_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RSRC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RSRC_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RSRC_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_RSRC_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RSRC_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RSRC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RSRC_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RSRC_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_RSRC_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Rsrc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_RSRC_R.create("T1"));
			chkMaster = MCController.create(MAM_RSRC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_RSRC_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_RSRC_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_RSRC_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_RSRC_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Rsrc_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR createRsrc_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.create();
		}

		/**
		 * Rsrc_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> createRsrc_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rsrc_cd</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_RSRC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> src_Rsrc_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Rsrc_Upd01_Dtl);
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
				addColumnPathMap("rsrc_cd", "rsrc_cd");
				addColumnPathMap("rsrc_nm", "rsrc_nm");
				addColumnPathMap("rsrc_unit_nm", "rsrc_unit_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_RSRC_R r_dest, mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_RSRC_R> dest, MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR r_src : src){
				MAM_RSRC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_RSRC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> src_Rsrc_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Rsrc_Upd01_Dtl);
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
				addColumnPathMap("rsrc_cd", "rsrc_cd");
				addColumnPathMap("rsrc_nm", "rsrc_nm");
				addColumnPathMap("rsrc_unit_nm", "rsrc_unit_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_RSRC_R r_dest, mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_RSRC_R> dest, MCList<mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.Rsrc_UpdChk01_DtlR r_src : src){
				MAM_RSRC_R r_dest = dest.createRow();
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
	 * RsrcLcl_UpdChk01オペレーション.<p>
	 *
	 * 資源マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class RsrcLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RsrcLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RSRC_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RSRC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RSRC_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RSRC_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_RSRC_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected RsrcLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_RSRC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_RSRC_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_RSRC_R&gt; （{@link #chk01_up0}）<br>
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
		 * RsrcLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR createRsrcLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.create();
		}

		/**
		 * RsrcLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> createRsrcLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rsrc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_RSRC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> src_RsrcLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_RsrcLcl_UpdChk01_Dtl);
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
				addColumnPathMap("rsrc_cd", "rsrc_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_RSRC_R r_dest, mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_RSRC_R> dest, MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR r_src : src){
				MAM_RSRC_R r_dest = dest.createRow();
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
	 * RsrcLcl_Upd01オペレーション.<p>
	 *
	 * 資源マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class RsrcLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RsrcLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RSRC_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RSRC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RSRC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RSRC_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_RSRC_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RSRC_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RSRC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RSRC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RSRC_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_RSRC_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected RsrcLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_RSRC_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_RSRC_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_RSRC_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_RSRC_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_RSRC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_RSRC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * RsrcLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR createRsrcLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.create();
		}

		/**
		 * RsrcLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> createRsrcLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rsrc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_RSRC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> src_RsrcLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_RsrcLcl_Upd01_Dtl);
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
				addColumnPathMap("rsrc_cd", "rsrc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("rsrc_nm", "rsrc_nm");
				addColumnPathMap("rsrc_unit_nm", "rsrc_unit_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_RSRC_LCL_R r_dest, mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_RSRC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR r_src : src){
				MAM_RSRC_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_RSRC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> src_RsrcLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_RsrcLcl_Upd01_Dtl);
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
				addColumnPathMap("rsrc_cd", "rsrc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("rsrc_nm", "rsrc_nm");
				addColumnPathMap("rsrc_unit_nm", "rsrc_unit_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_RSRC_LCL_R r_dest, mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_RSRC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.RsrcLcl_UpdChk01_DtlR r_src : src){
				MAM_RSRC_LCL_R r_dest = dest.createRow();
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
	 * Rsrc_DelChk01オペレーション.<p>
	 *
	 * 資源マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Rsrc_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rsrc_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Rsrc_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.class);

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
		 * Rsrc_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR createRsrc_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.create();
		}

		/**
		 * Rsrc_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> createRsrc_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rsrc_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Rsrc_Del01オペレーション.<p>
	 *
	 * 資源マスタの削除を行います。<br>
	 */
	abstract public class Rsrc_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Rsrc_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_RSRC_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_RSRC_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RSRC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RSRC_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RSRC_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_RSRC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_RSRC_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_RSRC_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_RSRC_R> updMaster1_up0;
		public final MCList<MAM_RSRC_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Rsrc_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_RSRC_R.create("T1"));
			updMaster2 = MCController.create(MAM_RSRC_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_RSRC_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_RSRC_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_RSRC_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_RSRC_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Rsrc_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR createRsrc_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.create();
		}

		/**
		 * Rsrc_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> createRsrc_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rsrc_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_RSRC_R> dest0_0, MCList<MAM_RSRC_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> src_Rsrc_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Rsrc_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Rsrc_Del01_Dtl);
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
				addColumnPathMap("rsrc_cd", "rsrc_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_RSRC_R r_dest, mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_RSRC_R> dest, MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR r_src : src){
				MAM_RSRC_R r_dest = dest.createRow();
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
				addColumnPathMap("rsrc_cd", "rsrc_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_RSRC_LCL_R r_dest, mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_RSRC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.Rsrc_DelChk01_DtlR r_src : src){
				MAM_RSRC_LCL_R r_dest = dest.createRow();
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
	 * HsGrp_UpdChk01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの登録前のチェックを行います。<br>
	 */
	abstract public class HsGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "HsGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected HsGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.class);

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
		 * HsGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR createHsGrp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.create();
		}

		/**
		 * HsGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> createHsGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hs_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>hs_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>hs_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * HsGrp_Upd01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの登録を行います。<br>
	 */
	abstract public class HsGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "HsGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_HS_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HS_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HS_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HS_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_HS_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_HS_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HS_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HS_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HS_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_HS_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected HsGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_HS_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_HS_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_HS_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_HS_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_HS_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_HS_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * HsGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR createHsGrp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.create();
		}

		/**
		 * HsGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> createHsGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hs_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>hs_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>hs_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_HS_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> src_HsGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_HsGrp_Upd01_Dtl);
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
				addColumnPathMap("hs_grp_cd", "hs_grp_cd");
				addColumnPathMap("hs_grp_nm", "hs_grp_nm");
				addColumnPathMap("hs_typ", "hs_typ");
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
		protected void up_UPDATE_updMaster_0(MAM_HS_GRP_R r_dest, mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_HS_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR r_src : src){
				MAM_HS_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_HS_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> src_HsGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_HsGrp_Upd01_Dtl);
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
				addColumnPathMap("hs_grp_cd", "hs_grp_cd");
				addColumnPathMap("hs_grp_nm", "hs_grp_nm");
				addColumnPathMap("hs_typ", "hs_typ");
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
		protected void up_MAIN_chkMaster_0(MAM_HS_GRP_R r_dest, mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_HS_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.HsGrp_UpdChk01_DtlR r_src : src){
				MAM_HS_GRP_R r_dest = dest.createRow();
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
	 * HsGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class HsGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "HsGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_HS_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HS_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HS_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HS_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_HS_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected HsGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_HS_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_HS_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_HS_GRP_R&gt; （{@link #chk01_up0}）<br>
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
		 * HsGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR createHsGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * HsGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> createHsGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hs_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>hs_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_HS_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> src_HsGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_HsGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("hs_grp_cd", "hs_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_HS_GRP_R r_dest, mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_HS_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_HS_GRP_R r_dest = dest.createRow();
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
	 * HsGrpLcl_Upd01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class HsGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "HsGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_HS_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HS_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HS_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HS_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_HS_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_HS_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HS_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HS_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HS_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_HS_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected HsGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_HS_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_HS_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_HS_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_HS_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_HS_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_HS_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * HsGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR createHsGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * HsGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> createHsGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hs_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>hs_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_HS_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> src_HsGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_HsGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("hs_grp_cd", "hs_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("hs_grp_nm", "hs_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_HS_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_HS_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_HS_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_HS_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> src_HsGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_HsGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("hs_grp_cd", "hs_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("hs_grp_nm", "hs_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_HS_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_HS_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.HsGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_HS_GRP_LCL_R r_dest = dest.createRow();
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
	 * HsGrp_DelChk01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの削除前のチェックを行います。<br>
	 */
	abstract public class HsGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "HsGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected HsGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.class);

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
		 * HsGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR createHsGrp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.create();
		}

		/**
		 * HsGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> createHsGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hs_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * HsGrp_Del01オペレーション.<p>
	 *
	 * ＨＳ分類マスタの削除を行います。<br>
	 */
	abstract public class HsGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "HsGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_HS_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_HS_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HS_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HS_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HS_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_HS_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_HS_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_HS_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_HS_GRP_R> updMaster1_up0;
		public final MCList<MAM_HS_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected HsGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_HS_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_HS_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_HS_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_HS_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_HS_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_HS_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * HsGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR createHsGrp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.create();
		}

		/**
		 * HsGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> createHsGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hs_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_HS_GRP_R> dest0_0, MCList<MAM_HS_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> src_HsGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_HsGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_HsGrp_Del01_Dtl);
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
				addColumnPathMap("hs_grp_cd", "hs_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_HS_GRP_R r_dest, mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_HS_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR r_src : src){
				MAM_HS_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("hs_grp_cd", "hs_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_HS_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_HS_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.HsGrp_DelChk01_DtlR r_src : src){
				MAM_HS_GRP_LCL_R r_dest = dest.createRow();
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
	 * AlcPtn_UpdChk01オペレーション.<p>
	 *
	 * 配賦パタンマスタの登録前のチェックを行います。<br>
	 */
	abstract public class AlcPtn_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AlcPtn_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected AlcPtn_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.class);

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
		 * AlcPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR createAlcPtn_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.create();
		}

		/**
		 * AlcPtn_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> createAlcPtn_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * AlcPtn_Upd01オペレーション.<p>
	 *
	 * 配賦パタンマスタの登録を行います。<br>
	 */
	abstract public class AlcPtn_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AlcPtn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_PTN_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALC_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALC_PTN_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ALC_PTN_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_PTN_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALC_PTN_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALC_PTN_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ALC_PTN_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AlcPtn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ALC_PTN_R.create("T1"));
			chkMaster = MCController.create(MAM_ALC_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ALC_PTN_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ALC_PTN_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ALC_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ALC_PTN_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * AlcPtn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR createAlcPtn_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.create();
		}

		/**
		 * AlcPtn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> createAlcPtn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ALC_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> src_AlcPtn_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AlcPtn_Upd01_Dtl);
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
				addColumnPathMap("alc_ptn_cd", "alc_ptn_cd");
				addColumnPathMap("alc_ptn_nm", "alc_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ALC_PTN_R r_dest, mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ALC_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR r_src : src){
				MAM_ALC_PTN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ALC_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> src_AlcPtn_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AlcPtn_Upd01_Dtl);
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
				addColumnPathMap("alc_ptn_cd", "alc_ptn_cd");
				addColumnPathMap("alc_ptn_nm", "alc_ptn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_ALC_PTN_R r_dest, mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ALC_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.AlcPtn_UpdChk01_DtlR r_src : src){
				MAM_ALC_PTN_R r_dest = dest.createRow();
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
	 * AlcPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 配賦パタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class AlcPtnLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AlcPtnLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_PTN_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALC_PTN_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALC_PTN_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_ALC_PTN_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AlcPtnLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_ALC_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_ALC_PTN_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_ALC_PTN_R&gt; （{@link #chk01_up0}）<br>
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
		 * AlcPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR createAlcPtnLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AlcPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> createAlcPtnLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_ALC_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> src_AlcPtnLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_AlcPtnLcl_UpdChk01_Dtl);
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
				addColumnPathMap("alc_ptn_cd", "alc_ptn_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_ALC_PTN_R r_dest, mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_ALC_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_ALC_PTN_R r_dest = dest.createRow();
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
	 * AlcPtnLcl_Upd01オペレーション.<p>
	 *
	 * 配賦パタンマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class AlcPtnLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AlcPtnLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_PTN_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALC_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALC_PTN_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ALC_PTN_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_PTN_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALC_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALC_PTN_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ALC_PTN_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AlcPtnLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ALC_PTN_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_ALC_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ALC_PTN_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ALC_PTN_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ALC_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ALC_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * AlcPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR createAlcPtnLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * AlcPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> createAlcPtnLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ALC_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> src_AlcPtnLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AlcPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("alc_ptn_cd", "alc_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("alc_ptn_nm", "alc_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ALC_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ALC_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_ALC_PTN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ALC_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> src_AlcPtnLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AlcPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("alc_ptn_cd", "alc_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("alc_ptn_nm", "alc_ptn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_ALC_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ALC_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.AlcPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_ALC_PTN_LCL_R r_dest = dest.createRow();
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
	 * AlcPtn_DelChk01オペレーション.<p>
	 *
	 * 配賦パタンマスタの削除前のチェックを行います。<br>
	 */
	abstract public class AlcPtn_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AlcPtn_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected AlcPtn_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.class);

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
		 * AlcPtn_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR createAlcPtn_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.create();
		}

		/**
		 * AlcPtn_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> createAlcPtn_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * AlcPtn_Del01オペレーション.<p>
	 *
	 * 配賦パタンマスタの削除を行います。<br>
	 */
	abstract public class AlcPtn_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AlcPtn_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_PTN_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALC_PTN_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALC_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALC_PTN_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALC_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALC_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALC_PTN_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_ALC_PTN_R> updMaster1_up0;
		public final MCList<MAM_ALC_PTN_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AlcPtn_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_ALC_PTN_R.create("T1"));
			updMaster2 = MCController.create(MAM_ALC_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_ALC_PTN_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_ALC_PTN_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ALC_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_ALC_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * AlcPtn_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR createAlcPtn_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.create();
		}

		/**
		 * AlcPtn_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> createAlcPtn_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ALC_PTN_R> dest0_0, MCList<MAM_ALC_PTN_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> src_AlcPtn_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_AlcPtn_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_AlcPtn_Del01_Dtl);
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
				addColumnPathMap("alc_ptn_cd", "alc_ptn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_ALC_PTN_R r_dest, mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_ALC_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR r_src : src){
				MAM_ALC_PTN_R r_dest = dest.createRow();
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
				addColumnPathMap("alc_ptn_cd", "alc_ptn_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_ALC_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_ALC_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.AlcPtn_DelChk01_DtlR r_src : src){
				MAM_ALC_PTN_LCL_R r_dest = dest.createRow();
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
	 * CtgGrp_UpdChk01オペレーション.<p>
	 *
	 * 原価品群グループマスタの登録前のチェックを行います。<br>
	 */
	abstract public class CtgGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CtgGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CtgGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.class);

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
		 * CtgGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR createCtgGrp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.create();
		}

		/**
		 * CtgGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> createCtgGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ctg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * CtgGrp_Upd01オペレーション.<p>
	 *
	 * 原価品群グループマスタの登録を行います。<br>
	 */
	abstract public class CtgGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CtgGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CTG_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CTG_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CTG_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CTG_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CTG_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CTG_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CTG_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CTG_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CTG_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CTG_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CtgGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CTG_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_CTG_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CTG_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CTG_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CTG_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CTG_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * CtgGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR createCtgGrp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.create();
		}

		/**
		 * CtgGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> createCtgGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ctg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_CTG_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> src_CtgGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CtgGrp_Upd01_Dtl);
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
				addColumnPathMap("ctg_grp_cd", "ctg_grp_cd");
				addColumnPathMap("ctg_grp_nm", "ctg_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_CTG_GRP_R r_dest, mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CTG_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR r_src : src){
				MAM_CTG_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CTG_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> src_CtgGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CtgGrp_Upd01_Dtl);
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
				addColumnPathMap("ctg_grp_cd", "ctg_grp_cd");
				addColumnPathMap("ctg_grp_nm", "ctg_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_CTG_GRP_R r_dest, mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CTG_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.CtgGrp_UpdChk01_DtlR r_src : src){
				MAM_CTG_GRP_R r_dest = dest.createRow();
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
	 * CtgGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価品群グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class CtgGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CtgGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CTG_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CTG_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CTG_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CTG_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_CTG_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CtgGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_CTG_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_CTG_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_CTG_GRP_R&gt; （{@link #chk01_up0}）<br>
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
		 * CtgGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR createCtgGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CtgGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> createCtgGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ctg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_CTG_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> src_CtgGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_CtgGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("ctg_grp_cd", "ctg_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_CTG_GRP_R r_dest, mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_CTG_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_CTG_GRP_R r_dest = dest.createRow();
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
	 * CtgGrpLcl_Upd01オペレーション.<p>
	 *
	 * 原価品群グループマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class CtgGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CtgGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CTG_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CTG_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CTG_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CTG_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_CTG_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CTG_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CTG_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CTG_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CTG_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_CTG_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CtgGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_CTG_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_CTG_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_CTG_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_CTG_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CTG_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_CTG_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * CtgGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR createCtgGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CtgGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> createCtgGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ctg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_CTG_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> src_CtgGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CtgGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("ctg_grp_cd", "ctg_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ctg_grp_nm", "ctg_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_CTG_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_CTG_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_CTG_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_CTG_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> src_CtgGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CtgGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("ctg_grp_cd", "ctg_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("ctg_grp_nm", "ctg_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_CTG_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_CTG_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.CtgGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_CTG_GRP_LCL_R r_dest = dest.createRow();
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
	 * CtgGrp_DelChk01オペレーション.<p>
	 *
	 * 原価品群グループマスタの削除前のチェックを行います。<br>
	 */
	abstract public class CtgGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CtgGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CtgGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.class);

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
		 * CtgGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR createCtgGrp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.create();
		}

		/**
		 * CtgGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> createCtgGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ctg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * CtgGrp_Del01オペレーション.<p>
	 *
	 * 原価品群グループマスタの削除を行います。<br>
	 */
	abstract public class CtgGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CtgGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CTG_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_CTG_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CTG_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CTG_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CTG_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CTG_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_CTG_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_CTG_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_CTG_GRP_R> updMaster1_up0;
		public final MCList<MAM_CTG_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CtgGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_CTG_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_CTG_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_CTG_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_CTG_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_CTG_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_CTG_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * CtgGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR createCtgGrp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.create();
		}

		/**
		 * CtgGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> createCtgGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ctg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_CTG_GRP_R> dest0_0, MCList<MAM_CTG_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> src_CtgGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_CtgGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_CtgGrp_Del01_Dtl);
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
				addColumnPathMap("ctg_grp_cd", "ctg_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_CTG_GRP_R r_dest, mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_CTG_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR r_src : src){
				MAM_CTG_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("ctg_grp_cd", "ctg_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_CTG_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_CTG_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.CtgGrp_DelChk01_DtlR r_src : src){
				MAM_CTG_GRP_LCL_R r_dest = dest.createRow();
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
	 * ActPtn_UpdChk01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの登録前のチェックを行います。<br>
	 */
	abstract public class ActPtn_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ActPtn_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ActPtn_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.class);

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
		 * ActPtn_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR createActPtn_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.create();
		}

		/**
		 * ActPtn_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> createActPtn_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>act_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ActPtn_Upd01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの登録を行います。<br>
	 */
	abstract public class ActPtn_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ActPtn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACT_PTN_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACT_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACT_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACT_PTN_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ACT_PTN_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACT_PTN_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACT_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACT_PTN_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACT_PTN_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ACT_PTN_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ActPtn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ACT_PTN_R.create("T1"));
			chkMaster = MCController.create(MAM_ACT_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ACT_PTN_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ACT_PTN_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ACT_PTN_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ACT_PTN_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ActPtn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR createActPtn_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.create();
		}

		/**
		 * ActPtn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> createActPtn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>act_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ACT_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> src_ActPtn_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ActPtn_Upd01_Dtl);
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
				addColumnPathMap("act_ptn_cd", "act_ptn_cd");
				addColumnPathMap("act_ptn_nm", "act_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ACT_PTN_R r_dest, mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ACT_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR r_src : src){
				MAM_ACT_PTN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ACT_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> src_ActPtn_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ActPtn_Upd01_Dtl);
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
				addColumnPathMap("act_ptn_cd", "act_ptn_cd");
				addColumnPathMap("act_ptn_nm", "act_ptn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_ACT_PTN_R r_dest, mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ACT_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.ActPtn_UpdChk01_DtlR r_src : src){
				MAM_ACT_PTN_R r_dest = dest.createRow();
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
	 * ActPtnLcl_UpdChk01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class ActPtnLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ActPtnLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACT_PTN_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACT_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACT_PTN_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACT_PTN_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_ACT_PTN_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ActPtnLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_ACT_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_ACT_PTN_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_ACT_PTN_R&gt; （{@link #chk01_up0}）<br>
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
		 * ActPtnLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR createActPtnLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ActPtnLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> createActPtnLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>act_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_ACT_PTN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> src_ActPtnLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ActPtnLcl_UpdChk01_Dtl);
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
				addColumnPathMap("act_ptn_cd", "act_ptn_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_ACT_PTN_R r_dest, mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_ACT_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_ACT_PTN_R r_dest = dest.createRow();
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
	 * ActPtnLcl_Upd01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class ActPtnLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ActPtnLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACT_PTN_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACT_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACT_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACT_PTN_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ACT_PTN_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACT_PTN_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACT_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACT_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACT_PTN_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ACT_PTN_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ActPtnLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ACT_PTN_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_ACT_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ACT_PTN_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ACT_PTN_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ACT_PTN_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ACT_PTN_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ActPtnLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR createActPtnLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ActPtnLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> createActPtnLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>act_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ACT_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> src_ActPtnLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ActPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("act_ptn_cd", "act_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("act_ptn_nm", "act_ptn_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ACT_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ACT_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_ACT_PTN_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ACT_PTN_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> src_ActPtnLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ActPtnLcl_Upd01_Dtl);
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
				addColumnPathMap("act_ptn_cd", "act_ptn_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("act_ptn_nm", "act_ptn_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_ACT_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ACT_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0035.ActPtnLcl_UpdChk01_DtlR r_src : src){
				MAM_ACT_PTN_LCL_R r_dest = dest.createRow();
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
	 * ActPtn_DelChk01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの削除前のチェックを行います。<br>
	 */
	abstract public class ActPtn_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ActPtn_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ActPtn_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.class);

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
		 * ActPtn_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR createActPtn_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.create();
		}

		/**
		 * ActPtn_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> createActPtn_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ActPtn_Del01オペレーション.<p>
	 *
	 * 計算実行パタンマスタの削除を行います。<br>
	 */
	abstract public class ActPtn_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ActPtn_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ACT_PTN_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ACT_PTN_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACT_PTN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACT_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACT_PTN_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ACT_PTN_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ACT_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ACT_PTN_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_ACT_PTN_R> updMaster1_up0;
		public final MCList<MAM_ACT_PTN_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ActPtn_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_ACT_PTN_R.create("T1"));
			updMaster2 = MCController.create(MAM_ACT_PTN_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_ACT_PTN_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_ACT_PTN_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ACT_PTN_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_ACT_PTN_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * ActPtn_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR createActPtn_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.create();
		}

		/**
		 * ActPtn_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> createActPtn_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ACT_PTN_R> dest0_0, MCList<MAM_ACT_PTN_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> src_ActPtn_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ActPtn_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ActPtn_Del01_Dtl);
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
				addColumnPathMap("act_ptn_cd", "act_ptn_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_ACT_PTN_R r_dest, mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_ACT_PTN_R> dest, MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR r_src : src){
				MAM_ACT_PTN_R r_dest = dest.createRow();
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
				addColumnPathMap("act_ptn_cd", "act_ptn_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_ACT_PTN_LCL_R r_dest, mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_ACT_PTN_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0035.ActPtn_DelChk01_DtlR r_src : src){
				MAM_ACT_PTN_LCL_R r_dest = dest.createRow();
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