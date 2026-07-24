package mcframe.serverMABC.MABCL0034;

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
	public static final String LOGIC_ID = "MABCL0034";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_MultiReg.ExCntnr_UpdChk01 aExCntnr_UpdChk01;

	protected void initExCntnr_UpdChk01() {
		this.info = PDef.MA_MABCL0034_ExCntnr_UpdChk01_INFO;
		this.aExCntnr_UpdChk01 = ((MABCL_MultiReg)this).new ExCntnr_UpdChk01();
	}

	public static MABCL_MultiReg.ExCntnr_UpdChk01 crtExCntnr_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initExCntnr_UpdChk01();
		return lgc.aExCntnr_UpdChk01;
	}

	protected void paramExCntnr_UpdChk01(MCParam p) {
		if (this.aExCntnr_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExCntnr_UpdChk01.up0());
	}

	protected void doExCntnr_UpdChk01() {
		aExCntnr_UpdChk01.call();
	};

	/**
	 * ExCntnr_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR createExCntnr_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.create();
	}

	/**
	 * ExCntnr_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> createExCntnr_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ExCntnr_Upd01 aExCntnr_Upd01;

	protected void initExCntnr_Upd01() {
		this.info = PDef.MA_MABCL0034_ExCntnr_Upd01_INFO;
		this.aExCntnr_Upd01 = ((MABCL_MultiReg)this).new ExCntnr_Upd01();
	}

	public static MABCL_MultiReg.ExCntnr_Upd01 crtExCntnr_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initExCntnr_Upd01();
		return lgc.aExCntnr_Upd01;
	}

	protected void paramExCntnr_Upd01(MCParam p) {
		if (this.aExCntnr_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExCntnr_Upd01.up0());
	}

	protected void doExCntnr_Upd01() {
		aExCntnr_Upd01.call();
	};

	/**
	 * ExCntnr_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR createExCntnr_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.create();
	}

	/**
	 * ExCntnr_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> createExCntnr_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ExCntnrLcl_UpdChk01 aExCntnrLcl_UpdChk01;

	protected void initExCntnrLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_ExCntnrLcl_UpdChk01_INFO;
		this.aExCntnrLcl_UpdChk01 = ((MABCL_MultiReg)this).new ExCntnrLcl_UpdChk01();
	}

	public static MABCL_MultiReg.ExCntnrLcl_UpdChk01 crtExCntnrLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initExCntnrLcl_UpdChk01();
		return lgc.aExCntnrLcl_UpdChk01;
	}

	protected void paramExCntnrLcl_UpdChk01(MCParam p) {
		if (this.aExCntnrLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExCntnrLcl_UpdChk01.up0());
	}

	protected void doExCntnrLcl_UpdChk01() {
		aExCntnrLcl_UpdChk01.call();
	};

	/**
	 * ExCntnrLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR createExCntnrLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ExCntnrLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> createExCntnrLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ExCntnrLcl_Upd01 aExCntnrLcl_Upd01;

	protected void initExCntnrLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_ExCntnrLcl_Upd01_INFO;
		this.aExCntnrLcl_Upd01 = ((MABCL_MultiReg)this).new ExCntnrLcl_Upd01();
	}

	public static MABCL_MultiReg.ExCntnrLcl_Upd01 crtExCntnrLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initExCntnrLcl_Upd01();
		return lgc.aExCntnrLcl_Upd01;
	}

	protected void paramExCntnrLcl_Upd01(MCParam p) {
		if (this.aExCntnrLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExCntnrLcl_Upd01.up0());
	}

	protected void doExCntnrLcl_Upd01() {
		aExCntnrLcl_Upd01.call();
	};

	/**
	 * ExCntnrLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR createExCntnrLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ExCntnrLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> createExCntnrLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ExCntnr_DelChk01 aExCntnr_DelChk01;

	protected void initExCntnr_DelChk01() {
		this.info = PDef.MA_MABCL0034_ExCntnr_DelChk01_INFO;
		this.aExCntnr_DelChk01 = ((MABCL_MultiReg)this).new ExCntnr_DelChk01();
	}

	public static MABCL_MultiReg.ExCntnr_DelChk01 crtExCntnr_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initExCntnr_DelChk01();
		return lgc.aExCntnr_DelChk01;
	}

	protected void paramExCntnr_DelChk01(MCParam p) {
		if (this.aExCntnr_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExCntnr_DelChk01.up0());
	}

	protected void doExCntnr_DelChk01() {
		aExCntnr_DelChk01.call();
	};

	/**
	 * ExCntnr_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR createExCntnr_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.create();
	}

	/**
	 * ExCntnr_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> createExCntnr_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ExCntnr_Del01 aExCntnr_Del01;

	protected void initExCntnr_Del01() {
		this.info = PDef.MA_MABCL0034_ExCntnr_Del01_INFO;
		this.aExCntnr_Del01 = ((MABCL_MultiReg)this).new ExCntnr_Del01();
	}

	public static MABCL_MultiReg.ExCntnr_Del01 crtExCntnr_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initExCntnr_Del01();
		return lgc.aExCntnr_Del01;
	}

	protected void paramExCntnr_Del01(MCParam p) {
		if (this.aExCntnr_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aExCntnr_Del01.up0());
	}

	protected void doExCntnr_Del01() {
		aExCntnr_Del01.call();
	};

	/**
	 * ExCntnr_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR createExCntnr_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.create();
	}

	/**
	 * ExCntnr_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> createExCntnr_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.EximPort_UpdChk01 aEximPort_UpdChk01;

	protected void initEximPort_UpdChk01() {
		this.info = PDef.MA_MABCL0034_EximPort_UpdChk01_INFO;
		this.aEximPort_UpdChk01 = ((MABCL_MultiReg)this).new EximPort_UpdChk01();
	}

	public static MABCL_MultiReg.EximPort_UpdChk01 crtEximPort_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initEximPort_UpdChk01();
		return lgc.aEximPort_UpdChk01;
	}

	protected void paramEximPort_UpdChk01(MCParam p) {
		if (this.aEximPort_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aEximPort_UpdChk01.up0());
	}

	protected void doEximPort_UpdChk01() {
		aEximPort_UpdChk01.call();
	};

	/**
	 * EximPort_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR createEximPort_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.create();
	}

	/**
	 * EximPort_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> createEximPort_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.EximPort_Upd01 aEximPort_Upd01;

	protected void initEximPort_Upd01() {
		this.info = PDef.MA_MABCL0034_EximPort_Upd01_INFO;
		this.aEximPort_Upd01 = ((MABCL_MultiReg)this).new EximPort_Upd01();
	}

	public static MABCL_MultiReg.EximPort_Upd01 crtEximPort_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initEximPort_Upd01();
		return lgc.aEximPort_Upd01;
	}

	protected void paramEximPort_Upd01(MCParam p) {
		if (this.aEximPort_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aEximPort_Upd01.up0());
	}

	protected void doEximPort_Upd01() {
		aEximPort_Upd01.call();
	};

	/**
	 * EximPort_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR createEximPort_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.create();
	}

	/**
	 * EximPort_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> createEximPort_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.EximPortLcl_UpdChk01 aEximPortLcl_UpdChk01;

	protected void initEximPortLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_EximPortLcl_UpdChk01_INFO;
		this.aEximPortLcl_UpdChk01 = ((MABCL_MultiReg)this).new EximPortLcl_UpdChk01();
	}

	public static MABCL_MultiReg.EximPortLcl_UpdChk01 crtEximPortLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initEximPortLcl_UpdChk01();
		return lgc.aEximPortLcl_UpdChk01;
	}

	protected void paramEximPortLcl_UpdChk01(MCParam p) {
		if (this.aEximPortLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aEximPortLcl_UpdChk01.up0());
	}

	protected void doEximPortLcl_UpdChk01() {
		aEximPortLcl_UpdChk01.call();
	};

	/**
	 * EximPortLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR createEximPortLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.create();
	}

	/**
	 * EximPortLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> createEximPortLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.EximPortLcl_Upd01 aEximPortLcl_Upd01;

	protected void initEximPortLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_EximPortLcl_Upd01_INFO;
		this.aEximPortLcl_Upd01 = ((MABCL_MultiReg)this).new EximPortLcl_Upd01();
	}

	public static MABCL_MultiReg.EximPortLcl_Upd01 crtEximPortLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initEximPortLcl_Upd01();
		return lgc.aEximPortLcl_Upd01;
	}

	protected void paramEximPortLcl_Upd01(MCParam p) {
		if (this.aEximPortLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aEximPortLcl_Upd01.up0());
	}

	protected void doEximPortLcl_Upd01() {
		aEximPortLcl_Upd01.call();
	};

	/**
	 * EximPortLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR createEximPortLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.create();
	}

	/**
	 * EximPortLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> createEximPortLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.EximPort_DelChk01 aEximPort_DelChk01;

	protected void initEximPort_DelChk01() {
		this.info = PDef.MA_MABCL0034_EximPort_DelChk01_INFO;
		this.aEximPort_DelChk01 = ((MABCL_MultiReg)this).new EximPort_DelChk01();
	}

	public static MABCL_MultiReg.EximPort_DelChk01 crtEximPort_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initEximPort_DelChk01();
		return lgc.aEximPort_DelChk01;
	}

	protected void paramEximPort_DelChk01(MCParam p) {
		if (this.aEximPort_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aEximPort_DelChk01.up0());
	}

	protected void doEximPort_DelChk01() {
		aEximPort_DelChk01.call();
	};

	/**
	 * EximPort_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR createEximPort_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.create();
	}

	/**
	 * EximPort_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> createEximPort_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.EximPort_Del01 aEximPort_Del01;

	protected void initEximPort_Del01() {
		this.info = PDef.MA_MABCL0034_EximPort_Del01_INFO;
		this.aEximPort_Del01 = ((MABCL_MultiReg)this).new EximPort_Del01();
	}

	public static MABCL_MultiReg.EximPort_Del01 crtEximPort_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initEximPort_Del01();
		return lgc.aEximPort_Del01;
	}

	protected void paramEximPort_Del01(MCParam p) {
		if (this.aEximPort_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aEximPort_Del01.up0());
	}

	protected void doEximPort_Del01() {
		aEximPort_Del01.call();
	};

	/**
	 * EximPort_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR createEximPort_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.create();
	}

	/**
	 * EximPort_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> createEximPort_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.StkGd_UpdChk01 aStkGd_UpdChk01;

	protected void initStkGd_UpdChk01() {
		this.info = PDef.MA_MABCL0034_StkGd_UpdChk01_INFO;
		this.aStkGd_UpdChk01 = ((MABCL_MultiReg)this).new StkGd_UpdChk01();
	}

	public static MABCL_MultiReg.StkGd_UpdChk01 crtStkGd_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initStkGd_UpdChk01();
		return lgc.aStkGd_UpdChk01;
	}

	protected void paramStkGd_UpdChk01(MCParam p) {
		if (this.aStkGd_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkGd_UpdChk01.up0());
	}

	protected void doStkGd_UpdChk01() {
		aStkGd_UpdChk01.call();
	};

	/**
	 * StkGd_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR createStkGd_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.create();
	}

	/**
	 * StkGd_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> createStkGd_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.StkGd_Upd01 aStkGd_Upd01;

	protected void initStkGd_Upd01() {
		this.info = PDef.MA_MABCL0034_StkGd_Upd01_INFO;
		this.aStkGd_Upd01 = ((MABCL_MultiReg)this).new StkGd_Upd01();
	}

	public static MABCL_MultiReg.StkGd_Upd01 crtStkGd_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initStkGd_Upd01();
		return lgc.aStkGd_Upd01;
	}

	protected void paramStkGd_Upd01(MCParam p) {
		if (this.aStkGd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkGd_Upd01.up0());
	}

	protected void doStkGd_Upd01() {
		aStkGd_Upd01.call();
	};

	/**
	 * StkGd_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR createStkGd_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.create();
	}

	/**
	 * StkGd_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> createStkGd_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.StkGdLcl_UpdChk01 aStkGdLcl_UpdChk01;

	protected void initStkGdLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_StkGdLcl_UpdChk01_INFO;
		this.aStkGdLcl_UpdChk01 = ((MABCL_MultiReg)this).new StkGdLcl_UpdChk01();
	}

	public static MABCL_MultiReg.StkGdLcl_UpdChk01 crtStkGdLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initStkGdLcl_UpdChk01();
		return lgc.aStkGdLcl_UpdChk01;
	}

	protected void paramStkGdLcl_UpdChk01(MCParam p) {
		if (this.aStkGdLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkGdLcl_UpdChk01.up0());
	}

	protected void doStkGdLcl_UpdChk01() {
		aStkGdLcl_UpdChk01.call();
	};

	/**
	 * StkGdLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR createStkGdLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.create();
	}

	/**
	 * StkGdLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> createStkGdLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.StkGdLcl_Upd01 aStkGdLcl_Upd01;

	protected void initStkGdLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_StkGdLcl_Upd01_INFO;
		this.aStkGdLcl_Upd01 = ((MABCL_MultiReg)this).new StkGdLcl_Upd01();
	}

	public static MABCL_MultiReg.StkGdLcl_Upd01 crtStkGdLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initStkGdLcl_Upd01();
		return lgc.aStkGdLcl_Upd01;
	}

	protected void paramStkGdLcl_Upd01(MCParam p) {
		if (this.aStkGdLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkGdLcl_Upd01.up0());
	}

	protected void doStkGdLcl_Upd01() {
		aStkGdLcl_Upd01.call();
	};

	/**
	 * StkGdLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR createStkGdLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.create();
	}

	/**
	 * StkGdLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> createStkGdLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.StkGd_DelChk01 aStkGd_DelChk01;

	protected void initStkGd_DelChk01() {
		this.info = PDef.MA_MABCL0034_StkGd_DelChk01_INFO;
		this.aStkGd_DelChk01 = ((MABCL_MultiReg)this).new StkGd_DelChk01();
	}

	public static MABCL_MultiReg.StkGd_DelChk01 crtStkGd_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initStkGd_DelChk01();
		return lgc.aStkGd_DelChk01;
	}

	protected void paramStkGd_DelChk01(MCParam p) {
		if (this.aStkGd_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkGd_DelChk01.up0());
	}

	protected void doStkGd_DelChk01() {
		aStkGd_DelChk01.call();
	};

	/**
	 * StkGd_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR createStkGd_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.create();
	}

	/**
	 * StkGd_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> createStkGd_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.StkGd_Del01 aStkGd_Del01;

	protected void initStkGd_Del01() {
		this.info = PDef.MA_MABCL0034_StkGd_Del01_INFO;
		this.aStkGd_Del01 = ((MABCL_MultiReg)this).new StkGd_Del01();
	}

	public static MABCL_MultiReg.StkGd_Del01 crtStkGd_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initStkGd_Del01();
		return lgc.aStkGd_Del01;
	}

	protected void paramStkGd_Del01(MCParam p) {
		if (this.aStkGd_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStkGd_Del01.up0());
	}

	protected void doStkGd_Del01() {
		aStkGd_Del01.call();
	};

	/**
	 * StkGd_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR createStkGd_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.create();
	}

	/**
	 * StkGd_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> createStkGd_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Trd_UpdChk01 aTrd_UpdChk01;

	protected void initTrd_UpdChk01() {
		this.info = PDef.MA_MABCL0034_Trd_UpdChk01_INFO;
		this.aTrd_UpdChk01 = ((MABCL_MultiReg)this).new Trd_UpdChk01();
	}

	public static MABCL_MultiReg.Trd_UpdChk01 crtTrd_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrd_UpdChk01();
		return lgc.aTrd_UpdChk01;
	}

	protected void paramTrd_UpdChk01(MCParam p) {
		if (this.aTrd_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrd_UpdChk01.up0());
	}

	protected void doTrd_UpdChk01() {
		aTrd_UpdChk01.call();
	};

	/**
	 * Trd_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR createTrd_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.create();
	}

	/**
	 * Trd_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> createTrd_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Trd_Upd01 aTrd_Upd01;

	protected void initTrd_Upd01() {
		this.info = PDef.MA_MABCL0034_Trd_Upd01_INFO;
		this.aTrd_Upd01 = ((MABCL_MultiReg)this).new Trd_Upd01();
	}

	public static MABCL_MultiReg.Trd_Upd01 crtTrd_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrd_Upd01();
		return lgc.aTrd_Upd01;
	}

	protected void paramTrd_Upd01(MCParam p) {
		if (this.aTrd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrd_Upd01.up0());
	}

	protected void doTrd_Upd01() {
		aTrd_Upd01.call();
	};

	/**
	 * Trd_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR createTrd_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.create();
	}

	/**
	 * Trd_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> createTrd_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.TrdLcl_UpdChk01 aTrdLcl_UpdChk01;

	protected void initTrdLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_TrdLcl_UpdChk01_INFO;
		this.aTrdLcl_UpdChk01 = ((MABCL_MultiReg)this).new TrdLcl_UpdChk01();
	}

	public static MABCL_MultiReg.TrdLcl_UpdChk01 crtTrdLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrdLcl_UpdChk01();
		return lgc.aTrdLcl_UpdChk01;
	}

	protected void paramTrdLcl_UpdChk01(MCParam p) {
		if (this.aTrdLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrdLcl_UpdChk01.up0());
	}

	protected void doTrdLcl_UpdChk01() {
		aTrdLcl_UpdChk01.call();
	};

	/**
	 * TrdLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR createTrdLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.create();
	}

	/**
	 * TrdLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> createTrdLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.TrdLcl_Upd01 aTrdLcl_Upd01;

	protected void initTrdLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_TrdLcl_Upd01_INFO;
		this.aTrdLcl_Upd01 = ((MABCL_MultiReg)this).new TrdLcl_Upd01();
	}

	public static MABCL_MultiReg.TrdLcl_Upd01 crtTrdLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrdLcl_Upd01();
		return lgc.aTrdLcl_Upd01;
	}

	protected void paramTrdLcl_Upd01(MCParam p) {
		if (this.aTrdLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrdLcl_Upd01.up0());
	}

	protected void doTrdLcl_Upd01() {
		aTrdLcl_Upd01.call();
	};

	/**
	 * TrdLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR createTrdLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.create();
	}

	/**
	 * TrdLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> createTrdLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Trd_DelChk01 aTrd_DelChk01;

	protected void initTrd_DelChk01() {
		this.info = PDef.MA_MABCL0034_Trd_DelChk01_INFO;
		this.aTrd_DelChk01 = ((MABCL_MultiReg)this).new Trd_DelChk01();
	}

	public static MABCL_MultiReg.Trd_DelChk01 crtTrd_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrd_DelChk01();
		return lgc.aTrd_DelChk01;
	}

	protected void paramTrd_DelChk01(MCParam p) {
		if (this.aTrd_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrd_DelChk01.up0());
	}

	protected void doTrd_DelChk01() {
		aTrd_DelChk01.call();
	};

	/**
	 * Trd_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR createTrd_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.create();
	}

	/**
	 * Trd_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> createTrd_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.Trd_Del01 aTrd_Del01;

	protected void initTrd_Del01() {
		this.info = PDef.MA_MABCL0034_Trd_Del01_INFO;
		this.aTrd_Del01 = ((MABCL_MultiReg)this).new Trd_Del01();
	}

	public static MABCL_MultiReg.Trd_Del01 crtTrd_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initTrd_Del01();
		return lgc.aTrd_Del01;
	}

	protected void paramTrd_Del01(MCParam p) {
		if (this.aTrd_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aTrd_Del01.up0());
	}

	protected void doTrd_Del01() {
		aTrd_Del01.call();
	};

	/**
	 * Trd_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR createTrd_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.create();
	}

	/**
	 * Trd_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> createTrd_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlipForm_UpdChk01 aSlipForm_UpdChk01;

	protected void initSlipForm_UpdChk01() {
		this.info = PDef.MA_MABCL0034_SlipForm_UpdChk01_INFO;
		this.aSlipForm_UpdChk01 = ((MABCL_MultiReg)this).new SlipForm_UpdChk01();
	}

	public static MABCL_MultiReg.SlipForm_UpdChk01 crtSlipForm_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlipForm_UpdChk01();
		return lgc.aSlipForm_UpdChk01;
	}

	protected void paramSlipForm_UpdChk01(MCParam p) {
		if (this.aSlipForm_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlipForm_UpdChk01.up0());
	}

	protected void doSlipForm_UpdChk01() {
		aSlipForm_UpdChk01.call();
	};

	/**
	 * SlipForm_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR createSlipForm_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.create();
	}

	/**
	 * SlipForm_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> createSlipForm_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlipForm_Upd01 aSlipForm_Upd01;

	protected void initSlipForm_Upd01() {
		this.info = PDef.MA_MABCL0034_SlipForm_Upd01_INFO;
		this.aSlipForm_Upd01 = ((MABCL_MultiReg)this).new SlipForm_Upd01();
	}

	public static MABCL_MultiReg.SlipForm_Upd01 crtSlipForm_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlipForm_Upd01();
		return lgc.aSlipForm_Upd01;
	}

	protected void paramSlipForm_Upd01(MCParam p) {
		if (this.aSlipForm_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlipForm_Upd01.up0());
	}

	protected void doSlipForm_Upd01() {
		aSlipForm_Upd01.call();
	};

	/**
	 * SlipForm_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR createSlipForm_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.create();
	}

	/**
	 * SlipForm_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> createSlipForm_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlipFormLcl_UpdChk01 aSlipFormLcl_UpdChk01;

	protected void initSlipFormLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_SlipFormLcl_UpdChk01_INFO;
		this.aSlipFormLcl_UpdChk01 = ((MABCL_MultiReg)this).new SlipFormLcl_UpdChk01();
	}

	public static MABCL_MultiReg.SlipFormLcl_UpdChk01 crtSlipFormLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlipFormLcl_UpdChk01();
		return lgc.aSlipFormLcl_UpdChk01;
	}

	protected void paramSlipFormLcl_UpdChk01(MCParam p) {
		if (this.aSlipFormLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlipFormLcl_UpdChk01.up0());
	}

	protected void doSlipFormLcl_UpdChk01() {
		aSlipFormLcl_UpdChk01.call();
	};

	/**
	 * SlipFormLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR createSlipFormLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SlipFormLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> createSlipFormLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlipFormLcl_Upd01 aSlipFormLcl_Upd01;

	protected void initSlipFormLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_SlipFormLcl_Upd01_INFO;
		this.aSlipFormLcl_Upd01 = ((MABCL_MultiReg)this).new SlipFormLcl_Upd01();
	}

	public static MABCL_MultiReg.SlipFormLcl_Upd01 crtSlipFormLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlipFormLcl_Upd01();
		return lgc.aSlipFormLcl_Upd01;
	}

	protected void paramSlipFormLcl_Upd01(MCParam p) {
		if (this.aSlipFormLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlipFormLcl_Upd01.up0());
	}

	protected void doSlipFormLcl_Upd01() {
		aSlipFormLcl_Upd01.call();
	};

	/**
	 * SlipFormLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR createSlipFormLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SlipFormLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> createSlipFormLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlipForm_DelChk01 aSlipForm_DelChk01;

	protected void initSlipForm_DelChk01() {
		this.info = PDef.MA_MABCL0034_SlipForm_DelChk01_INFO;
		this.aSlipForm_DelChk01 = ((MABCL_MultiReg)this).new SlipForm_DelChk01();
	}

	public static MABCL_MultiReg.SlipForm_DelChk01 crtSlipForm_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlipForm_DelChk01();
		return lgc.aSlipForm_DelChk01;
	}

	protected void paramSlipForm_DelChk01(MCParam p) {
		if (this.aSlipForm_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlipForm_DelChk01.up0());
	}

	protected void doSlipForm_DelChk01() {
		aSlipForm_DelChk01.call();
	};

	/**
	 * SlipForm_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR createSlipForm_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.create();
	}

	/**
	 * SlipForm_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> createSlipForm_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.SlipForm_Del01 aSlipForm_Del01;

	protected void initSlipForm_Del01() {
		this.info = PDef.MA_MABCL0034_SlipForm_Del01_INFO;
		this.aSlipForm_Del01 = ((MABCL_MultiReg)this).new SlipForm_Del01();
	}

	public static MABCL_MultiReg.SlipForm_Del01 crtSlipForm_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initSlipForm_Del01();
		return lgc.aSlipForm_Del01;
	}

	protected void paramSlipForm_Del01(MCParam p) {
		if (this.aSlipForm_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlipForm_Del01.up0());
	}

	protected void doSlipForm_Del01() {
		aSlipForm_Del01.call();
	};

	/**
	 * SlipForm_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR createSlipForm_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.create();
	}

	/**
	 * SlipForm_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> createSlipForm_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.PfGrp_UpdChk01 aPfGrp_UpdChk01;

	protected void initPfGrp_UpdChk01() {
		this.info = PDef.MA_MABCL0034_PfGrp_UpdChk01_INFO;
		this.aPfGrp_UpdChk01 = ((MABCL_MultiReg)this).new PfGrp_UpdChk01();
	}

	public static MABCL_MultiReg.PfGrp_UpdChk01 crtPfGrp_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initPfGrp_UpdChk01();
		return lgc.aPfGrp_UpdChk01;
	}

	protected void paramPfGrp_UpdChk01(MCParam p) {
		if (this.aPfGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPfGrp_UpdChk01.up0());
	}

	protected void doPfGrp_UpdChk01() {
		aPfGrp_UpdChk01.call();
	};

	/**
	 * PfGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR createPfGrp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.create();
	}

	/**
	 * PfGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> createPfGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.PfGrp_Upd01 aPfGrp_Upd01;

	protected void initPfGrp_Upd01() {
		this.info = PDef.MA_MABCL0034_PfGrp_Upd01_INFO;
		this.aPfGrp_Upd01 = ((MABCL_MultiReg)this).new PfGrp_Upd01();
	}

	public static MABCL_MultiReg.PfGrp_Upd01 crtPfGrp_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initPfGrp_Upd01();
		return lgc.aPfGrp_Upd01;
	}

	protected void paramPfGrp_Upd01(MCParam p) {
		if (this.aPfGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPfGrp_Upd01.up0());
	}

	protected void doPfGrp_Upd01() {
		aPfGrp_Upd01.call();
	};

	/**
	 * PfGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR createPfGrp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.create();
	}

	/**
	 * PfGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> createPfGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.PfGrpLcl_UpdChk01 aPfGrpLcl_UpdChk01;

	protected void initPfGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_PfGrpLcl_UpdChk01_INFO;
		this.aPfGrpLcl_UpdChk01 = ((MABCL_MultiReg)this).new PfGrpLcl_UpdChk01();
	}

	public static MABCL_MultiReg.PfGrpLcl_UpdChk01 crtPfGrpLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initPfGrpLcl_UpdChk01();
		return lgc.aPfGrpLcl_UpdChk01;
	}

	protected void paramPfGrpLcl_UpdChk01(MCParam p) {
		if (this.aPfGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPfGrpLcl_UpdChk01.up0());
	}

	protected void doPfGrpLcl_UpdChk01() {
		aPfGrpLcl_UpdChk01.call();
	};

	/**
	 * PfGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR createPfGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * PfGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> createPfGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.PfGrpLcl_Upd01 aPfGrpLcl_Upd01;

	protected void initPfGrpLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_PfGrpLcl_Upd01_INFO;
		this.aPfGrpLcl_Upd01 = ((MABCL_MultiReg)this).new PfGrpLcl_Upd01();
	}

	public static MABCL_MultiReg.PfGrpLcl_Upd01 crtPfGrpLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initPfGrpLcl_Upd01();
		return lgc.aPfGrpLcl_Upd01;
	}

	protected void paramPfGrpLcl_Upd01(MCParam p) {
		if (this.aPfGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPfGrpLcl_Upd01.up0());
	}

	protected void doPfGrpLcl_Upd01() {
		aPfGrpLcl_Upd01.call();
	};

	/**
	 * PfGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR createPfGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * PfGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> createPfGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.PfGrp_DelChk01 aPfGrp_DelChk01;

	protected void initPfGrp_DelChk01() {
		this.info = PDef.MA_MABCL0034_PfGrp_DelChk01_INFO;
		this.aPfGrp_DelChk01 = ((MABCL_MultiReg)this).new PfGrp_DelChk01();
	}

	public static MABCL_MultiReg.PfGrp_DelChk01 crtPfGrp_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initPfGrp_DelChk01();
		return lgc.aPfGrp_DelChk01;
	}

	protected void paramPfGrp_DelChk01(MCParam p) {
		if (this.aPfGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPfGrp_DelChk01.up0());
	}

	protected void doPfGrp_DelChk01() {
		aPfGrp_DelChk01.call();
	};

	/**
	 * PfGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR createPfGrp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.create();
	}

	/**
	 * PfGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> createPfGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.PfGrp_Del01 aPfGrp_Del01;

	protected void initPfGrp_Del01() {
		this.info = PDef.MA_MABCL0034_PfGrp_Del01_INFO;
		this.aPfGrp_Del01 = ((MABCL_MultiReg)this).new PfGrp_Del01();
	}

	public static MABCL_MultiReg.PfGrp_Del01 crtPfGrp_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initPfGrp_Del01();
		return lgc.aPfGrp_Del01;
	}

	protected void paramPfGrp_Del01(MCParam p) {
		if (this.aPfGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPfGrp_Del01.up0());
	}

	protected void doPfGrp_Del01() {
		aPfGrp_Del01.call();
	};

	/**
	 * PfGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR createPfGrp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.create();
	}

	/**
	 * PfGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> createPfGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmSpecGrp_UpdChk01 aItmSpecGrp_UpdChk01;

	protected void initItmSpecGrp_UpdChk01() {
		this.info = PDef.MA_MABCL0034_ItmSpecGrp_UpdChk01_INFO;
		this.aItmSpecGrp_UpdChk01 = ((MABCL_MultiReg)this).new ItmSpecGrp_UpdChk01();
	}

	public static MABCL_MultiReg.ItmSpecGrp_UpdChk01 crtItmSpecGrp_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmSpecGrp_UpdChk01();
		return lgc.aItmSpecGrp_UpdChk01;
	}

	protected void paramItmSpecGrp_UpdChk01(MCParam p) {
		if (this.aItmSpecGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmSpecGrp_UpdChk01.up0());
	}

	protected void doItmSpecGrp_UpdChk01() {
		aItmSpecGrp_UpdChk01.call();
	};

	/**
	 * ItmSpecGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR createItmSpecGrp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.create();
	}

	/**
	 * ItmSpecGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> createItmSpecGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmSpecGrp_Upd01 aItmSpecGrp_Upd01;

	protected void initItmSpecGrp_Upd01() {
		this.info = PDef.MA_MABCL0034_ItmSpecGrp_Upd01_INFO;
		this.aItmSpecGrp_Upd01 = ((MABCL_MultiReg)this).new ItmSpecGrp_Upd01();
	}

	public static MABCL_MultiReg.ItmSpecGrp_Upd01 crtItmSpecGrp_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmSpecGrp_Upd01();
		return lgc.aItmSpecGrp_Upd01;
	}

	protected void paramItmSpecGrp_Upd01(MCParam p) {
		if (this.aItmSpecGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmSpecGrp_Upd01.up0());
	}

	protected void doItmSpecGrp_Upd01() {
		aItmSpecGrp_Upd01.call();
	};

	/**
	 * ItmSpecGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR createItmSpecGrp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.create();
	}

	/**
	 * ItmSpecGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> createItmSpecGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmSpecGrpLcl_UpdChk01 aItmSpecGrpLcl_UpdChk01;

	protected void initItmSpecGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_ItmSpecGrpLcl_UpdChk01_INFO;
		this.aItmSpecGrpLcl_UpdChk01 = ((MABCL_MultiReg)this).new ItmSpecGrpLcl_UpdChk01();
	}

	public static MABCL_MultiReg.ItmSpecGrpLcl_UpdChk01 crtItmSpecGrpLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmSpecGrpLcl_UpdChk01();
		return lgc.aItmSpecGrpLcl_UpdChk01;
	}

	protected void paramItmSpecGrpLcl_UpdChk01(MCParam p) {
		if (this.aItmSpecGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmSpecGrpLcl_UpdChk01.up0());
	}

	protected void doItmSpecGrpLcl_UpdChk01() {
		aItmSpecGrpLcl_UpdChk01.call();
	};

	/**
	 * ItmSpecGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR createItmSpecGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmSpecGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> createItmSpecGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmSpecGrpLcl_Upd01 aItmSpecGrpLcl_Upd01;

	protected void initItmSpecGrpLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_ItmSpecGrpLcl_Upd01_INFO;
		this.aItmSpecGrpLcl_Upd01 = ((MABCL_MultiReg)this).new ItmSpecGrpLcl_Upd01();
	}

	public static MABCL_MultiReg.ItmSpecGrpLcl_Upd01 crtItmSpecGrpLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmSpecGrpLcl_Upd01();
		return lgc.aItmSpecGrpLcl_Upd01;
	}

	protected void paramItmSpecGrpLcl_Upd01(MCParam p) {
		if (this.aItmSpecGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmSpecGrpLcl_Upd01.up0());
	}

	protected void doItmSpecGrpLcl_Upd01() {
		aItmSpecGrpLcl_Upd01.call();
	};

	/**
	 * ItmSpecGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR createItmSpecGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmSpecGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> createItmSpecGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmSpecGrp_DelChk01 aItmSpecGrp_DelChk01;

	protected void initItmSpecGrp_DelChk01() {
		this.info = PDef.MA_MABCL0034_ItmSpecGrp_DelChk01_INFO;
		this.aItmSpecGrp_DelChk01 = ((MABCL_MultiReg)this).new ItmSpecGrp_DelChk01();
	}

	public static MABCL_MultiReg.ItmSpecGrp_DelChk01 crtItmSpecGrp_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmSpecGrp_DelChk01();
		return lgc.aItmSpecGrp_DelChk01;
	}

	protected void paramItmSpecGrp_DelChk01(MCParam p) {
		if (this.aItmSpecGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmSpecGrp_DelChk01.up0());
	}

	protected void doItmSpecGrp_DelChk01() {
		aItmSpecGrp_DelChk01.call();
	};

	/**
	 * ItmSpecGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR createItmSpecGrp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.create();
	}

	/**
	 * ItmSpecGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> createItmSpecGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmSpecGrp_Del01 aItmSpecGrp_Del01;

	protected void initItmSpecGrp_Del01() {
		this.info = PDef.MA_MABCL0034_ItmSpecGrp_Del01_INFO;
		this.aItmSpecGrp_Del01 = ((MABCL_MultiReg)this).new ItmSpecGrp_Del01();
	}

	public static MABCL_MultiReg.ItmSpecGrp_Del01 crtItmSpecGrp_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmSpecGrp_Del01();
		return lgc.aItmSpecGrp_Del01;
	}

	protected void paramItmSpecGrp_Del01(MCParam p) {
		if (this.aItmSpecGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmSpecGrp_Del01.up0());
	}

	protected void doItmSpecGrp_Del01() {
		aItmSpecGrp_Del01.call();
	};

	/**
	 * ItmSpecGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR createItmSpecGrp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.create();
	}

	/**
	 * ItmSpecGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> createItmSpecGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmCompGrp_UpdChk01 aItmCompGrp_UpdChk01;

	protected void initItmCompGrp_UpdChk01() {
		this.info = PDef.MA_MABCL0034_ItmCompGrp_UpdChk01_INFO;
		this.aItmCompGrp_UpdChk01 = ((MABCL_MultiReg)this).new ItmCompGrp_UpdChk01();
	}

	public static MABCL_MultiReg.ItmCompGrp_UpdChk01 crtItmCompGrp_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmCompGrp_UpdChk01();
		return lgc.aItmCompGrp_UpdChk01;
	}

	protected void paramItmCompGrp_UpdChk01(MCParam p) {
		if (this.aItmCompGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCompGrp_UpdChk01.up0());
	}

	protected void doItmCompGrp_UpdChk01() {
		aItmCompGrp_UpdChk01.call();
	};

	/**
	 * ItmCompGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR createItmCompGrp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.create();
	}

	/**
	 * ItmCompGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> createItmCompGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmCompGrp_Upd01 aItmCompGrp_Upd01;

	protected void initItmCompGrp_Upd01() {
		this.info = PDef.MA_MABCL0034_ItmCompGrp_Upd01_INFO;
		this.aItmCompGrp_Upd01 = ((MABCL_MultiReg)this).new ItmCompGrp_Upd01();
	}

	public static MABCL_MultiReg.ItmCompGrp_Upd01 crtItmCompGrp_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmCompGrp_Upd01();
		return lgc.aItmCompGrp_Upd01;
	}

	protected void paramItmCompGrp_Upd01(MCParam p) {
		if (this.aItmCompGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCompGrp_Upd01.up0());
	}

	protected void doItmCompGrp_Upd01() {
		aItmCompGrp_Upd01.call();
	};

	/**
	 * ItmCompGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR createItmCompGrp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.create();
	}

	/**
	 * ItmCompGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> createItmCompGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmCompGrpLcl_UpdChk01 aItmCompGrpLcl_UpdChk01;

	protected void initItmCompGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_ItmCompGrpLcl_UpdChk01_INFO;
		this.aItmCompGrpLcl_UpdChk01 = ((MABCL_MultiReg)this).new ItmCompGrpLcl_UpdChk01();
	}

	public static MABCL_MultiReg.ItmCompGrpLcl_UpdChk01 crtItmCompGrpLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmCompGrpLcl_UpdChk01();
		return lgc.aItmCompGrpLcl_UpdChk01;
	}

	protected void paramItmCompGrpLcl_UpdChk01(MCParam p) {
		if (this.aItmCompGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCompGrpLcl_UpdChk01.up0());
	}

	protected void doItmCompGrpLcl_UpdChk01() {
		aItmCompGrpLcl_UpdChk01.call();
	};

	/**
	 * ItmCompGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR createItmCompGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmCompGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> createItmCompGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmCompGrpLcl_Upd01 aItmCompGrpLcl_Upd01;

	protected void initItmCompGrpLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_ItmCompGrpLcl_Upd01_INFO;
		this.aItmCompGrpLcl_Upd01 = ((MABCL_MultiReg)this).new ItmCompGrpLcl_Upd01();
	}

	public static MABCL_MultiReg.ItmCompGrpLcl_Upd01 crtItmCompGrpLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmCompGrpLcl_Upd01();
		return lgc.aItmCompGrpLcl_Upd01;
	}

	protected void paramItmCompGrpLcl_Upd01(MCParam p) {
		if (this.aItmCompGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCompGrpLcl_Upd01.up0());
	}

	protected void doItmCompGrpLcl_Upd01() {
		aItmCompGrpLcl_Upd01.call();
	};

	/**
	 * ItmCompGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR createItmCompGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmCompGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> createItmCompGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmCompGrp_DelChk01 aItmCompGrp_DelChk01;

	protected void initItmCompGrp_DelChk01() {
		this.info = PDef.MA_MABCL0034_ItmCompGrp_DelChk01_INFO;
		this.aItmCompGrp_DelChk01 = ((MABCL_MultiReg)this).new ItmCompGrp_DelChk01();
	}

	public static MABCL_MultiReg.ItmCompGrp_DelChk01 crtItmCompGrp_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmCompGrp_DelChk01();
		return lgc.aItmCompGrp_DelChk01;
	}

	protected void paramItmCompGrp_DelChk01(MCParam p) {
		if (this.aItmCompGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCompGrp_DelChk01.up0());
	}

	protected void doItmCompGrp_DelChk01() {
		aItmCompGrp_DelChk01.call();
	};

	/**
	 * ItmCompGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR createItmCompGrp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.create();
	}

	/**
	 * ItmCompGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> createItmCompGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.ItmCompGrp_Del01 aItmCompGrp_Del01;

	protected void initItmCompGrp_Del01() {
		this.info = PDef.MA_MABCL0034_ItmCompGrp_Del01_INFO;
		this.aItmCompGrp_Del01 = ((MABCL_MultiReg)this).new ItmCompGrp_Del01();
	}

	public static MABCL_MultiReg.ItmCompGrp_Del01 crtItmCompGrp_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initItmCompGrp_Del01();
		return lgc.aItmCompGrp_Del01;
	}

	protected void paramItmCompGrp_Del01(MCParam p) {
		if (this.aItmCompGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmCompGrp_Del01.up0());
	}

	protected void doItmCompGrp_Del01() {
		aItmCompGrp_Del01.call();
	};

	/**
	 * ItmCompGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR createItmCompGrp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.create();
	}

	/**
	 * ItmCompGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> createItmCompGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlAct_UpdChk01 aJnlAct_UpdChk01;

	protected void initJnlAct_UpdChk01() {
		this.info = PDef.MA_MABCL0034_JnlAct_UpdChk01_INFO;
		this.aJnlAct_UpdChk01 = ((MABCL_MultiReg)this).new JnlAct_UpdChk01();
	}

	public static MABCL_MultiReg.JnlAct_UpdChk01 crtJnlAct_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlAct_UpdChk01();
		return lgc.aJnlAct_UpdChk01;
	}

	protected void paramJnlAct_UpdChk01(MCParam p) {
		if (this.aJnlAct_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlAct_UpdChk01.up0());
	}

	protected void doJnlAct_UpdChk01() {
		aJnlAct_UpdChk01.call();
	};

	/**
	 * JnlAct_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR createJnlAct_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.create();
	}

	/**
	 * JnlAct_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> createJnlAct_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlAct_Upd01 aJnlAct_Upd01;

	protected void initJnlAct_Upd01() {
		this.info = PDef.MA_MABCL0034_JnlAct_Upd01_INFO;
		this.aJnlAct_Upd01 = ((MABCL_MultiReg)this).new JnlAct_Upd01();
	}

	public static MABCL_MultiReg.JnlAct_Upd01 crtJnlAct_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlAct_Upd01();
		return lgc.aJnlAct_Upd01;
	}

	protected void paramJnlAct_Upd01(MCParam p) {
		if (this.aJnlAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlAct_Upd01.up0());
	}

	protected void doJnlAct_Upd01() {
		aJnlAct_Upd01.call();
	};

	/**
	 * JnlAct_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR createJnlAct_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.create();
	}

	/**
	 * JnlAct_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> createJnlAct_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlActLcl_UpdChk01 aJnlActLcl_UpdChk01;

	protected void initJnlActLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_JnlActLcl_UpdChk01_INFO;
		this.aJnlActLcl_UpdChk01 = ((MABCL_MultiReg)this).new JnlActLcl_UpdChk01();
	}

	public static MABCL_MultiReg.JnlActLcl_UpdChk01 crtJnlActLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlActLcl_UpdChk01();
		return lgc.aJnlActLcl_UpdChk01;
	}

	protected void paramJnlActLcl_UpdChk01(MCParam p) {
		if (this.aJnlActLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlActLcl_UpdChk01.up0());
	}

	protected void doJnlActLcl_UpdChk01() {
		aJnlActLcl_UpdChk01.call();
	};

	/**
	 * JnlActLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR createJnlActLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.create();
	}

	/**
	 * JnlActLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> createJnlActLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlActLcl_Upd01 aJnlActLcl_Upd01;

	protected void initJnlActLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_JnlActLcl_Upd01_INFO;
		this.aJnlActLcl_Upd01 = ((MABCL_MultiReg)this).new JnlActLcl_Upd01();
	}

	public static MABCL_MultiReg.JnlActLcl_Upd01 crtJnlActLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlActLcl_Upd01();
		return lgc.aJnlActLcl_Upd01;
	}

	protected void paramJnlActLcl_Upd01(MCParam p) {
		if (this.aJnlActLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlActLcl_Upd01.up0());
	}

	protected void doJnlActLcl_Upd01() {
		aJnlActLcl_Upd01.call();
	};

	/**
	 * JnlActLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR createJnlActLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.create();
	}

	/**
	 * JnlActLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> createJnlActLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlAct_DelChk01 aJnlAct_DelChk01;

	protected void initJnlAct_DelChk01() {
		this.info = PDef.MA_MABCL0034_JnlAct_DelChk01_INFO;
		this.aJnlAct_DelChk01 = ((MABCL_MultiReg)this).new JnlAct_DelChk01();
	}

	public static MABCL_MultiReg.JnlAct_DelChk01 crtJnlAct_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlAct_DelChk01();
		return lgc.aJnlAct_DelChk01;
	}

	protected void paramJnlAct_DelChk01(MCParam p) {
		if (this.aJnlAct_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlAct_DelChk01.up0());
	}

	protected void doJnlAct_DelChk01() {
		aJnlAct_DelChk01.call();
	};

	/**
	 * JnlAct_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR createJnlAct_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.create();
	}

	/**
	 * JnlAct_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> createJnlAct_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlAct_Del01 aJnlAct_Del01;

	protected void initJnlAct_Del01() {
		this.info = PDef.MA_MABCL0034_JnlAct_Del01_INFO;
		this.aJnlAct_Del01 = ((MABCL_MultiReg)this).new JnlAct_Del01();
	}

	public static MABCL_MultiReg.JnlAct_Del01 crtJnlAct_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlAct_Del01();
		return lgc.aJnlAct_Del01;
	}

	protected void paramJnlAct_Del01(MCParam p) {
		if (this.aJnlAct_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlAct_Del01.up0());
	}

	protected void doJnlAct_Del01() {
		aJnlAct_Del01.call();
	};

	/**
	 * JnlAct_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR createJnlAct_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.create();
	}

	/**
	 * JnlAct_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> createJnlAct_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlGrp_UpdChk01 aJnlGrp_UpdChk01;

	protected void initJnlGrp_UpdChk01() {
		this.info = PDef.MA_MABCL0034_JnlGrp_UpdChk01_INFO;
		this.aJnlGrp_UpdChk01 = ((MABCL_MultiReg)this).new JnlGrp_UpdChk01();
	}

	public static MABCL_MultiReg.JnlGrp_UpdChk01 crtJnlGrp_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlGrp_UpdChk01();
		return lgc.aJnlGrp_UpdChk01;
	}

	protected void paramJnlGrp_UpdChk01(MCParam p) {
		if (this.aJnlGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlGrp_UpdChk01.up0());
	}

	protected void doJnlGrp_UpdChk01() {
		aJnlGrp_UpdChk01.call();
	};

	/**
	 * JnlGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR createJnlGrp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.create();
	}

	/**
	 * JnlGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> createJnlGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlGrp_Upd01 aJnlGrp_Upd01;

	protected void initJnlGrp_Upd01() {
		this.info = PDef.MA_MABCL0034_JnlGrp_Upd01_INFO;
		this.aJnlGrp_Upd01 = ((MABCL_MultiReg)this).new JnlGrp_Upd01();
	}

	public static MABCL_MultiReg.JnlGrp_Upd01 crtJnlGrp_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlGrp_Upd01();
		return lgc.aJnlGrp_Upd01;
	}

	protected void paramJnlGrp_Upd01(MCParam p) {
		if (this.aJnlGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlGrp_Upd01.up0());
	}

	protected void doJnlGrp_Upd01() {
		aJnlGrp_Upd01.call();
	};

	/**
	 * JnlGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR createJnlGrp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.create();
	}

	/**
	 * JnlGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> createJnlGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlGrpLcl_UpdChk01 aJnlGrpLcl_UpdChk01;

	protected void initJnlGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0034_JnlGrpLcl_UpdChk01_INFO;
		this.aJnlGrpLcl_UpdChk01 = ((MABCL_MultiReg)this).new JnlGrpLcl_UpdChk01();
	}

	public static MABCL_MultiReg.JnlGrpLcl_UpdChk01 crtJnlGrpLcl_UpdChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlGrpLcl_UpdChk01();
		return lgc.aJnlGrpLcl_UpdChk01;
	}

	protected void paramJnlGrpLcl_UpdChk01(MCParam p) {
		if (this.aJnlGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlGrpLcl_UpdChk01.up0());
	}

	protected void doJnlGrpLcl_UpdChk01() {
		aJnlGrpLcl_UpdChk01.call();
	};

	/**
	 * JnlGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR createJnlGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * JnlGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> createJnlGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlGrpLcl_Upd01 aJnlGrpLcl_Upd01;

	protected void initJnlGrpLcl_Upd01() {
		this.info = PDef.MA_MABCL0034_JnlGrpLcl_Upd01_INFO;
		this.aJnlGrpLcl_Upd01 = ((MABCL_MultiReg)this).new JnlGrpLcl_Upd01();
	}

	public static MABCL_MultiReg.JnlGrpLcl_Upd01 crtJnlGrpLcl_Upd01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlGrpLcl_Upd01();
		return lgc.aJnlGrpLcl_Upd01;
	}

	protected void paramJnlGrpLcl_Upd01(MCParam p) {
		if (this.aJnlGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlGrpLcl_Upd01.up0());
	}

	protected void doJnlGrpLcl_Upd01() {
		aJnlGrpLcl_Upd01.call();
	};

	/**
	 * JnlGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR createJnlGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * JnlGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> createJnlGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlGrp_DelChk01 aJnlGrp_DelChk01;

	protected void initJnlGrp_DelChk01() {
		this.info = PDef.MA_MABCL0034_JnlGrp_DelChk01_INFO;
		this.aJnlGrp_DelChk01 = ((MABCL_MultiReg)this).new JnlGrp_DelChk01();
	}

	public static MABCL_MultiReg.JnlGrp_DelChk01 crtJnlGrp_DelChk01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlGrp_DelChk01();
		return lgc.aJnlGrp_DelChk01;
	}

	protected void paramJnlGrp_DelChk01(MCParam p) {
		if (this.aJnlGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlGrp_DelChk01.up0());
	}

	protected void doJnlGrp_DelChk01() {
		aJnlGrp_DelChk01.call();
	};

	/**
	 * JnlGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR createJnlGrp_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.create();
	}

	/**
	 * JnlGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> createJnlGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.class);
	}
	protected MABCL_MultiReg.JnlGrp_Del01 aJnlGrp_Del01;

	protected void initJnlGrp_Del01() {
		this.info = PDef.MA_MABCL0034_JnlGrp_Del01_INFO;
		this.aJnlGrp_Del01 = ((MABCL_MultiReg)this).new JnlGrp_Del01();
	}

	public static MABCL_MultiReg.JnlGrp_Del01 crtJnlGrp_Del01() {
		MABCL_MultiReg lgc = new MABCL_MultiReg();
		lgc.initJnlGrp_Del01();
		return lgc.aJnlGrp_Del01;
	}

	protected void paramJnlGrp_Del01(MCParam p) {
		if (this.aJnlGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aJnlGrp_Del01.up0());
	}

	protected void doJnlGrp_Del01() {
		aJnlGrp_Del01.call();
	};

	/**
	 * JnlGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR createJnlGrp_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.create();
	}

	/**
	 * JnlGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> createJnlGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ExCntnr_UpdChk01オペレーション.<p>
	 *
	 * 梱包容器マスタの登録前のチェックを行います。<br>
	 */
	abstract public class ExCntnr_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExCntnr_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ExCntnr_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.class);

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
		 * ExCntnr_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR createExCntnr_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.create();
		}

		/**
		 * ExCntnr_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> createExCntnr_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>cntnr_nm</td></tr>
		 * 	<tr><td><br></td><td>wt</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ExCntnr_Upd01オペレーション.<p>
	 *
	 * 梱包容器マスタの登録を行います。<br>
	 */
	abstract public class ExCntnr_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExCntnr_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EX_CNTNR_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EX_CNTNR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EX_CNTNR_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EX_CNTNR_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_EX_CNTNR_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EX_CNTNR_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EX_CNTNR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EX_CNTNR_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EX_CNTNR_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_EX_CNTNR_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExCntnr_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_EX_CNTNR_R.create("T1"));
			chkMaster = MCController.create(MAM_EX_CNTNR_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_EX_CNTNR_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_EX_CNTNR_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EX_CNTNR_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_EX_CNTNR_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ExCntnr_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR createExCntnr_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.create();
		}

		/**
		 * ExCntnr_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> createExCntnr_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>cntnr_nm</td></tr>
		 * 	<tr><td><br></td><td>wt</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_EX_CNTNR_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> src_ExCntnr_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ExCntnr_Upd01_Dtl);
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
				addColumnPathMap("cntnr_cd", "cntnr_cd");
				addColumnPathMap("cntnr_nm", "cntnr_nm");
				addColumnPathMap("wt", "wt");
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
		protected void up_UPDATE_updMaster_0(MAM_EX_CNTNR_R r_dest, mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_EX_CNTNR_R> dest, MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR r_src : src){
				MAM_EX_CNTNR_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_EX_CNTNR_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> src_ExCntnr_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ExCntnr_Upd01_Dtl);
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
				addColumnPathMap("cntnr_cd", "cntnr_cd");
				addColumnPathMap("cntnr_nm", "cntnr_nm");
				addColumnPathMap("wt", "wt");
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
		protected void up_MAIN_chkMaster_0(MAM_EX_CNTNR_R r_dest, mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_EX_CNTNR_R> dest, MCList<mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.ExCntnr_UpdChk01_DtlR r_src : src){
				MAM_EX_CNTNR_R r_dest = dest.createRow();
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
	 * ExCntnrLcl_UpdChk01オペレーション.<p>
	 *
	 * 梱包容器マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class ExCntnrLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExCntnrLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EX_CNTNR_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EX_CNTNR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EX_CNTNR_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EX_CNTNR_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_EX_CNTNR_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExCntnrLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_EX_CNTNR_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_EX_CNTNR_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_EX_CNTNR_R&gt; （{@link #chk01_up0}）<br>
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
		 * ExCntnrLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR createExCntnrLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ExCntnrLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> createExCntnrLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntnr_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_EX_CNTNR_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> src_ExCntnrLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ExCntnrLcl_UpdChk01_Dtl);
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
				addColumnPathMap("cntnr_cd", "cntnr_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_EX_CNTNR_R r_dest, mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_EX_CNTNR_R> dest, MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR r_src : src){
				MAM_EX_CNTNR_R r_dest = dest.createRow();
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
	 * ExCntnrLcl_Upd01オペレーション.<p>
	 *
	 * 梱包容器マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class ExCntnrLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExCntnrLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EX_CNTNR_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EX_CNTNR_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EX_CNTNR_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EX_CNTNR_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_EX_CNTNR_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EX_CNTNR_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EX_CNTNR_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EX_CNTNR_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EX_CNTNR_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_EX_CNTNR_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExCntnrLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_EX_CNTNR_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_EX_CNTNR_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_EX_CNTNR_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_EX_CNTNR_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EX_CNTNR_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_EX_CNTNR_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ExCntnrLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR createExCntnrLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ExCntnrLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> createExCntnrLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cntnr_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_EX_CNTNR_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> src_ExCntnrLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ExCntnrLcl_Upd01_Dtl);
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
				addColumnPathMap("cntnr_cd", "cntnr_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cntnr_nm", "cntnr_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_EX_CNTNR_LCL_R r_dest, mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_EX_CNTNR_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR r_src : src){
				MAM_EX_CNTNR_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_EX_CNTNR_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> src_ExCntnrLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ExCntnrLcl_Upd01_Dtl);
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
				addColumnPathMap("cntnr_cd", "cntnr_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cntnr_nm", "cntnr_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_EX_CNTNR_LCL_R r_dest, mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_EX_CNTNR_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.ExCntnrLcl_UpdChk01_DtlR r_src : src){
				MAM_EX_CNTNR_LCL_R r_dest = dest.createRow();
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
	 * ExCntnr_DelChk01オペレーション.<p>
	 *
	 * 梱包容器マスタの削除前のチェックを行います。<br>
	 */
	abstract public class ExCntnr_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExCntnr_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ExCntnr_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.class);

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
		 * ExCntnr_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR createExCntnr_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.create();
		}

		/**
		 * ExCntnr_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> createExCntnr_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ExCntnr_Del01オペレーション.<p>
	 *
	 * 梱包容器マスタの削除を行います。<br>
	 */
	abstract public class ExCntnr_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ExCntnr_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EX_CNTNR_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_EX_CNTNR_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EX_CNTNR_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EX_CNTNR_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EX_CNTNR_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EX_CNTNR_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EX_CNTNR_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EX_CNTNR_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_EX_CNTNR_R> updMaster1_up0;
		public final MCList<MAM_EX_CNTNR_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ExCntnr_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_EX_CNTNR_R.create("T1"));
			updMaster2 = MCController.create(MAM_EX_CNTNR_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_EX_CNTNR_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_EX_CNTNR_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EX_CNTNR_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_EX_CNTNR_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * ExCntnr_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR createExCntnr_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.create();
		}

		/**
		 * ExCntnr_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> createExCntnr_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cntnr_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_EX_CNTNR_R> dest0_0, MCList<MAM_EX_CNTNR_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> src_ExCntnr_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ExCntnr_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ExCntnr_Del01_Dtl);
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
				addColumnPathMap("cntnr_cd", "cntnr_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_EX_CNTNR_R r_dest, mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_EX_CNTNR_R> dest, MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR r_src : src){
				MAM_EX_CNTNR_R r_dest = dest.createRow();
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
				addColumnPathMap("cntnr_cd", "cntnr_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_EX_CNTNR_LCL_R r_dest, mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_EX_CNTNR_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.ExCntnr_DelChk01_DtlR r_src : src){
				MAM_EX_CNTNR_LCL_R r_dest = dest.createRow();
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
	 * EximPort_UpdChk01オペレーション.<p>
	 *
	 * 港マスタの登録前のチェックを行います。<br>
	 */
	abstract public class EximPort_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "EximPort_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected EximPort_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.class);

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
		 * EximPort_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR createEximPort_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.create();
		}

		/**
		 * EximPort_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> createEximPort_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>port_cd</td></tr>
		 * 	<tr><td><br></td><td>port_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * EximPort_Upd01オペレーション.<p>
	 *
	 * 港マスタの登録を行います。<br>
	 */
	abstract public class EximPort_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "EximPort_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXIM_PORT_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXIM_PORT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXIM_PORT_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXIM_PORT_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXIM_PORT_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXIM_PORT_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXIM_PORT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXIM_PORT_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXIM_PORT_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXIM_PORT_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected EximPort_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_EXIM_PORT_R.create("T1"));
			chkMaster = MCController.create(MAM_EXIM_PORT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_EXIM_PORT_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_EXIM_PORT_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EXIM_PORT_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_EXIM_PORT_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * EximPort_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR createEximPort_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.create();
		}

		/**
		 * EximPort_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> createEximPort_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>port_cd</td></tr>
		 * 	<tr><td><br></td><td>port_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_EXIM_PORT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> src_EximPort_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_EximPort_Upd01_Dtl);
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
				addColumnPathMap("port_cd", "port_cd");
				addColumnPathMap("port_nm", "port_nm");
				addColumnPathMap("cntry_cd", "cntry_cd");
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
		protected void up_UPDATE_updMaster_0(MAM_EXIM_PORT_R r_dest, mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_EXIM_PORT_R> dest, MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR r_src : src){
				MAM_EXIM_PORT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_EXIM_PORT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> src_EximPort_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_EximPort_Upd01_Dtl);
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
				addColumnPathMap("port_cd", "port_cd");
				addColumnPathMap("port_nm", "port_nm");
				addColumnPathMap("cntry_cd", "cntry_cd");
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
		protected void up_MAIN_chkMaster_0(MAM_EXIM_PORT_R r_dest, mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_EXIM_PORT_R> dest, MCList<mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.EximPort_UpdChk01_DtlR r_src : src){
				MAM_EXIM_PORT_R r_dest = dest.createRow();
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
	 * EximPortLcl_UpdChk01オペレーション.<p>
	 *
	 * 港マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class EximPortLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "EximPortLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXIM_PORT_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXIM_PORT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXIM_PORT_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXIM_PORT_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_EXIM_PORT_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected EximPortLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_EXIM_PORT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_EXIM_PORT_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_EXIM_PORT_R&gt; （{@link #chk01_up0}）<br>
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
		 * EximPortLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR createEximPortLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.create();
		}

		/**
		 * EximPortLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> createEximPortLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>port_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>port_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_EXIM_PORT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> src_EximPortLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_EximPortLcl_UpdChk01_Dtl);
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
				addColumnPathMap("port_cd", "port_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_EXIM_PORT_R r_dest, mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_EXIM_PORT_R> dest, MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR r_src : src){
				MAM_EXIM_PORT_R r_dest = dest.createRow();
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
	 * EximPortLcl_Upd01オペレーション.<p>
	 *
	 * 港マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class EximPortLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "EximPortLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXIM_PORT_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXIM_PORT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXIM_PORT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXIM_PORT_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXIM_PORT_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXIM_PORT_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXIM_PORT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXIM_PORT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXIM_PORT_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_EXIM_PORT_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected EximPortLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_EXIM_PORT_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_EXIM_PORT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_EXIM_PORT_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_EXIM_PORT_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EXIM_PORT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_EXIM_PORT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * EximPortLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR createEximPortLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.create();
		}

		/**
		 * EximPortLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> createEximPortLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>port_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>port_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_EXIM_PORT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> src_EximPortLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_EximPortLcl_Upd01_Dtl);
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
				addColumnPathMap("port_cd", "port_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("port_nm", "port_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_EXIM_PORT_LCL_R r_dest, mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_EXIM_PORT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR r_src : src){
				MAM_EXIM_PORT_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_EXIM_PORT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> src_EximPortLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_EximPortLcl_Upd01_Dtl);
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
				addColumnPathMap("port_cd", "port_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("port_nm", "port_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_EXIM_PORT_LCL_R r_dest, mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_EXIM_PORT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.EximPortLcl_UpdChk01_DtlR r_src : src){
				MAM_EXIM_PORT_LCL_R r_dest = dest.createRow();
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
	 * EximPort_DelChk01オペレーション.<p>
	 *
	 * 港マスタの削除前のチェックを行います。<br>
	 */
	abstract public class EximPort_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "EximPort_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected EximPort_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.class);

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
		 * EximPort_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR createEximPort_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.create();
		}

		/**
		 * EximPort_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> createEximPort_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>port_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * EximPort_Del01オペレーション.<p>
	 *
	 * 港マスタの削除を行います。<br>
	 */
	abstract public class EximPort_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "EximPort_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EXIM_PORT_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_EXIM_PORT_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXIM_PORT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXIM_PORT_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXIM_PORT_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EXIM_PORT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_EXIM_PORT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_EXIM_PORT_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_EXIM_PORT_R> updMaster1_up0;
		public final MCList<MAM_EXIM_PORT_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected EximPort_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_EXIM_PORT_R.create("T1"));
			updMaster2 = MCController.create(MAM_EXIM_PORT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_EXIM_PORT_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_EXIM_PORT_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_EXIM_PORT_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_EXIM_PORT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * EximPort_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR createEximPort_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.create();
		}

		/**
		 * EximPort_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> createEximPort_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>port_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_EXIM_PORT_R> dest0_0, MCList<MAM_EXIM_PORT_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> src_EximPort_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_EximPort_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_EximPort_Del01_Dtl);
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
				addColumnPathMap("port_cd", "port_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_EXIM_PORT_R r_dest, mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_EXIM_PORT_R> dest, MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR r_src : src){
				MAM_EXIM_PORT_R r_dest = dest.createRow();
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
				addColumnPathMap("port_cd", "port_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_EXIM_PORT_LCL_R r_dest, mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_EXIM_PORT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.EximPort_DelChk01_DtlR r_src : src){
				MAM_EXIM_PORT_LCL_R r_dest = dest.createRow();
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
	 * StkGd_UpdChk01オペレーション.<p>
	 *
	 * 格付マスタの登録前のチェックを行います。<br>
	 */
	abstract public class StkGd_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkGd_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected StkGd_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.class);

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
		 * StkGd_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR createStkGd_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.create();
		}

		/**
		 * StkGd_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> createStkGd_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_flg</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * StkGd_Upd01オペレーション.<p>
	 *
	 * 格付マスタの登録を行います。<br>
	 */
	abstract public class StkGd_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkGd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STK_GD_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_GD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STK_GD_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STK_GD_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_STK_GD_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STK_GD_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_GD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STK_GD_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STK_GD_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_STK_GD_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected StkGd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_STK_GD_R.create("T1"));
			chkMaster = MCController.create(MAM_STK_GD_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_STK_GD_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_STK_GD_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STK_GD_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_STK_GD_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * StkGd_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR createStkGd_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.create();
		}

		/**
		 * StkGd_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> createStkGd_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_flg</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_STK_GD_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> src_StkGd_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_StkGd_Upd01_Dtl);
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
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("slo_flg", "slo_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_STK_GD_R r_dest, mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_STK_GD_R> dest, MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR r_src : src){
				MAM_STK_GD_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_STK_GD_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> src_StkGd_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_StkGd_Upd01_Dtl);
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
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("slo_flg", "slo_flg");
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
		protected void up_MAIN_chkMaster_0(MAM_STK_GD_R r_dest, mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_STK_GD_R> dest, MCList<mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.StkGd_UpdChk01_DtlR r_src : src){
				MAM_STK_GD_R r_dest = dest.createRow();
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
	 * StkGdLcl_UpdChk01オペレーション.<p>
	 *
	 * 格付マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class StkGdLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkGdLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STK_GD_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_GD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STK_GD_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STK_GD_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_STK_GD_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected StkGdLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_STK_GD_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_STK_GD_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_STK_GD_R&gt; （{@link #chk01_up0}）<br>
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
		 * StkGdLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR createStkGdLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.create();
		}

		/**
		 * StkGdLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> createStkGdLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_STK_GD_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> src_StkGdLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_StkGdLcl_UpdChk01_Dtl);
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
				addColumnPathMap("gd_cd", "gd_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_STK_GD_R r_dest, mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_STK_GD_R> dest, MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR r_src : src){
				MAM_STK_GD_R r_dest = dest.createRow();
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
	 * StkGdLcl_Upd01オペレーション.<p>
	 *
	 * 格付マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class StkGdLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkGdLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STK_GD_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_GD_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STK_GD_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STK_GD_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_STK_GD_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STK_GD_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_GD_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STK_GD_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STK_GD_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_STK_GD_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected StkGdLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_STK_GD_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_STK_GD_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_STK_GD_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_STK_GD_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STK_GD_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_STK_GD_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * StkGdLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR createStkGdLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.create();
		}

		/**
		 * StkGdLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> createStkGdLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_STK_GD_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> src_StkGdLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_StkGdLcl_Upd01_Dtl);
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
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("gd_nm", "gd_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_STK_GD_LCL_R r_dest, mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_STK_GD_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR r_src : src){
				MAM_STK_GD_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_STK_GD_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> src_StkGdLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_StkGdLcl_Upd01_Dtl);
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
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("gd_nm", "gd_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_STK_GD_LCL_R r_dest, mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_STK_GD_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.StkGdLcl_UpdChk01_DtlR r_src : src){
				MAM_STK_GD_LCL_R r_dest = dest.createRow();
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
	 * StkGd_DelChk01オペレーション.<p>
	 *
	 * 格付マスタの削除前のチェックを行います。<br>
	 */
	abstract public class StkGd_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkGd_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected StkGd_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.class);

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
		 * StkGd_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR createStkGd_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.create();
		}

		/**
		 * StkGd_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> createStkGd_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * StkGd_Del01オペレーション.<p>
	 *
	 * 格付マスタの削除を行います。<br>
	 */
	abstract public class StkGd_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "StkGd_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_STK_GD_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_STK_GD_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_GD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STK_GD_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STK_GD_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_STK_GD_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_STK_GD_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_STK_GD_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_STK_GD_R> updMaster1_up0;
		public final MCList<MAM_STK_GD_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected StkGd_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_STK_GD_R.create("T1"));
			updMaster2 = MCController.create(MAM_STK_GD_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_STK_GD_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_STK_GD_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_STK_GD_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_STK_GD_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * StkGd_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR createStkGd_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.create();
		}

		/**
		 * StkGd_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> createStkGd_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_STK_GD_R> dest0_0, MCList<MAM_STK_GD_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> src_StkGd_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_StkGd_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_StkGd_Del01_Dtl);
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
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_STK_GD_R r_dest, mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_STK_GD_R> dest, MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR r_src : src){
				MAM_STK_GD_R r_dest = dest.createRow();
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
				addColumnPathMap("gd_cd", "gd_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_STK_GD_LCL_R r_dest, mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_STK_GD_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.StkGd_DelChk01_DtlR r_src : src){
				MAM_STK_GD_LCL_R r_dest = dest.createRow();
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
	 * Trd_UpdChk01オペレーション.<p>
	 *
	 * 取引マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Trd_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Trd_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Trd_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.class);

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
		 * Trd_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR createTrd_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.create();
		}

		/**
		 * Trd_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> createTrd_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>auto_adopt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sls_slip_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_purc_slip_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Trd_Upd01オペレーション.<p>
	 *
	 * 取引マスタの登録を行います。<br>
	 */
	abstract public class Trd_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Trd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRD_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRD_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRD_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_TRD_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRD_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRD_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRD_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_TRD_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Trd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_TRD_R.create("T1"));
			chkMaster = MCController.create(MAM_TRD_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_TRD_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_TRD_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_TRD_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_TRD_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * Trd_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR createTrd_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.create();
		}

		/**
		 * Trd_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> createTrd_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>auto_adopt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sls_slip_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_purc_slip_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_TRD_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> src_Trd_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Trd_Upd01_Dtl);
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
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_nm", "trd_nm");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("ac_rsn_cd", "ac_rsn_cd");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("slip_form_cd", "slip_form_cd");
				addColumnPathMap("auto_adopt_flg", "auto_adopt_flg");
				addColumnPathMap("not_sls_slip_snd_flg", "not_sls_slip_snd_flg");
				addColumnPathMap("not_purc_slip_snd_flg", "not_purc_slip_snd_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_TRD_R r_dest, mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_TRD_R> dest, MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR r_src : src){
				MAM_TRD_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_TRD_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> src_Trd_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Trd_Upd01_Dtl);
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
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_nm", "trd_nm");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("ac_rsn_cd", "ac_rsn_cd");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("slip_form_cd", "slip_form_cd");
				addColumnPathMap("auto_adopt_flg", "auto_adopt_flg");
				addColumnPathMap("not_sls_slip_snd_flg", "not_sls_slip_snd_flg");
				addColumnPathMap("not_purc_slip_snd_flg", "not_purc_slip_snd_flg");
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
		protected void up_MAIN_chkMaster_0(MAM_TRD_R r_dest, mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_TRD_R> dest, MCList<mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.Trd_UpdChk01_DtlR r_src : src){
				MAM_TRD_R r_dest = dest.createRow();
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
	 * TrdLcl_UpdChk01オペレーション.<p>
	 *
	 * 取引マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class TrdLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "TrdLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRD_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRD_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRD_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_TRD_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected TrdLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_TRD_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_TRD_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_TRD_R&gt; （{@link #chk01_up0}）<br>
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
		 * TrdLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR createTrdLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.create();
		}

		/**
		 * TrdLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> createTrdLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_TRD_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> src_TrdLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_TrdLcl_UpdChk01_Dtl);
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
				addColumnPathMap("trd_cd", "trd_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_TRD_R r_dest, mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_TRD_R> dest, MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR r_src : src){
				MAM_TRD_R r_dest = dest.createRow();
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
	 * TrdLcl_Upd01オペレーション.<p>
	 *
	 * 取引マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class TrdLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "TrdLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRD_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRD_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRD_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRD_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_TRD_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRD_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRD_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRD_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRD_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_TRD_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected TrdLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_TRD_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_TRD_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_TRD_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_TRD_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_TRD_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_TRD_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * TrdLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR createTrdLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.create();
		}

		/**
		 * TrdLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> createTrdLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_TRD_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> src_TrdLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_TrdLcl_Upd01_Dtl);
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
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("trd_nm", "trd_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_TRD_LCL_R r_dest, mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_TRD_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR r_src : src){
				MAM_TRD_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_TRD_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> src_TrdLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_TrdLcl_Upd01_Dtl);
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
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("trd_nm", "trd_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_TRD_LCL_R r_dest, mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_TRD_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.TrdLcl_UpdChk01_DtlR r_src : src){
				MAM_TRD_LCL_R r_dest = dest.createRow();
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
	 * Trd_DelChk01オペレーション.<p>
	 *
	 * 取引マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Trd_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Trd_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Trd_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.class);

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
		 * Trd_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR createTrd_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.create();
		}

		/**
		 * Trd_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> createTrd_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * Trd_Del01オペレーション.<p>
	 *
	 * 取引マスタの削除を行います。<br>
	 */
	abstract public class Trd_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Trd_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_TRD_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_TRD_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRD_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRD_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRD_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_TRD_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_TRD_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_TRD_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_TRD_R> updMaster1_up0;
		public final MCList<MAM_TRD_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Trd_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_TRD_R.create("T1"));
			updMaster2 = MCController.create(MAM_TRD_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_TRD_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_TRD_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_TRD_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_TRD_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * Trd_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR createTrd_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.create();
		}

		/**
		 * Trd_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> createTrd_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_TRD_R> dest0_0, MCList<MAM_TRD_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> src_Trd_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Trd_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Trd_Del01_Dtl);
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
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_TRD_R r_dest, mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_TRD_R> dest, MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR r_src : src){
				MAM_TRD_R r_dest = dest.createRow();
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
				addColumnPathMap("trd_cd", "trd_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_TRD_LCL_R r_dest, mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_TRD_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.Trd_DelChk01_DtlR r_src : src){
				MAM_TRD_LCL_R r_dest = dest.createRow();
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
	 * SlipForm_UpdChk01オペレーション.<p>
	 *
	 * 伝票帳票マスタの登録前のチェックを行います。<br>
	 */
	abstract public class SlipForm_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlipForm_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SlipForm_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.class);

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
		 * SlipForm_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR createSlipForm_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.create();
		}

		/**
		 * SlipForm_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> createSlipForm_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>slip_form_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_form_id</td></tr>
		 * 	<tr><td><br></td><td>copy_slip_form_id</td></tr>
		 * 	<tr><td><br></td><td>line_num</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SlipForm_Upd01オペレーション.<p>
	 *
	 * 伝票帳票マスタの登録を行います。<br>
	 */
	abstract public class SlipForm_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlipForm_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLIP_FORM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLIP_FORM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLIP_FORM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLIP_FORM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLIP_FORM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLIP_FORM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLIP_FORM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLIP_FORM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLIP_FORM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLIP_FORM_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlipForm_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SLIP_FORM_R.create("T1"));
			chkMaster = MCController.create(MAM_SLIP_FORM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SLIP_FORM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SLIP_FORM_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SLIP_FORM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SLIP_FORM_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * SlipForm_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR createSlipForm_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.create();
		}

		/**
		 * SlipForm_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> createSlipForm_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>slip_form_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_form_id</td></tr>
		 * 	<tr><td><br></td><td>copy_slip_form_id</td></tr>
		 * 	<tr><td><br></td><td>line_num</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SLIP_FORM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> src_SlipForm_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SlipForm_Upd01_Dtl);
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
				addColumnPathMap("slip_form_cd", "slip_form_cd");
				addColumnPathMap("slip_form_nm", "slip_form_nm");
				addColumnPathMap("slip_form_id", "slip_form_id");
				addColumnPathMap("copy_slip_form_id", "copy_slip_form_id");
				addColumnPathMap("line_num", "line_num");
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
		protected void up_UPDATE_updMaster_0(MAM_SLIP_FORM_R r_dest, mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SLIP_FORM_R> dest, MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR r_src : src){
				MAM_SLIP_FORM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SLIP_FORM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> src_SlipForm_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SlipForm_Upd01_Dtl);
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
				addColumnPathMap("slip_form_cd", "slip_form_cd");
				addColumnPathMap("slip_form_nm", "slip_form_nm");
				addColumnPathMap("slip_form_id", "slip_form_id");
				addColumnPathMap("copy_slip_form_id", "copy_slip_form_id");
				addColumnPathMap("line_num", "line_num");
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
		protected void up_MAIN_chkMaster_0(MAM_SLIP_FORM_R r_dest, mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SLIP_FORM_R> dest, MCList<mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.SlipForm_UpdChk01_DtlR r_src : src){
				MAM_SLIP_FORM_R r_dest = dest.createRow();
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
	 * SlipFormLcl_UpdChk01オペレーション.<p>
	 *
	 * 伝票帳票マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class SlipFormLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlipFormLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLIP_FORM_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLIP_FORM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLIP_FORM_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLIP_FORM_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SLIP_FORM_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlipFormLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SLIP_FORM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SLIP_FORM_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SLIP_FORM_R&gt; （{@link #chk01_up0}）<br>
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
		 * SlipFormLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR createSlipFormLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SlipFormLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> createSlipFormLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>slip_form_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_SLIP_FORM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> src_SlipFormLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_SlipFormLcl_UpdChk01_Dtl);
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
				addColumnPathMap("slip_form_cd", "slip_form_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SLIP_FORM_R r_dest, mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SLIP_FORM_R> dest, MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR r_src : src){
				MAM_SLIP_FORM_R r_dest = dest.createRow();
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
	 * SlipFormLcl_Upd01オペレーション.<p>
	 *
	 * 伝票帳票マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class SlipFormLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlipFormLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLIP_FORM_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLIP_FORM_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLIP_FORM_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLIP_FORM_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLIP_FORM_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLIP_FORM_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLIP_FORM_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLIP_FORM_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLIP_FORM_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SLIP_FORM_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlipFormLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SLIP_FORM_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SLIP_FORM_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SLIP_FORM_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SLIP_FORM_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SLIP_FORM_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SLIP_FORM_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * SlipFormLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR createSlipFormLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SlipFormLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> createSlipFormLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>slip_form_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SLIP_FORM_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> src_SlipFormLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SlipFormLcl_Upd01_Dtl);
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
				addColumnPathMap("slip_form_cd", "slip_form_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("slip_form_nm", "slip_form_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SLIP_FORM_LCL_R r_dest, mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SLIP_FORM_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR r_src : src){
				MAM_SLIP_FORM_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SLIP_FORM_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> src_SlipFormLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SlipFormLcl_Upd01_Dtl);
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
				addColumnPathMap("slip_form_cd", "slip_form_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("slip_form_nm", "slip_form_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_SLIP_FORM_LCL_R r_dest, mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SLIP_FORM_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.SlipFormLcl_UpdChk01_DtlR r_src : src){
				MAM_SLIP_FORM_LCL_R r_dest = dest.createRow();
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
	 * SlipForm_DelChk01オペレーション.<p>
	 *
	 * 伝票帳票マスタの削除前のチェックを行います。<br>
	 */
	abstract public class SlipForm_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlipForm_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SlipForm_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.class);

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
		 * SlipForm_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR createSlipForm_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.create();
		}

		/**
		 * SlipForm_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> createSlipForm_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * SlipForm_Del01オペレーション.<p>
	 *
	 * 伝票帳票マスタの削除を行います。<br>
	 */
	abstract public class SlipForm_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlipForm_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLIP_FORM_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SLIP_FORM_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLIP_FORM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLIP_FORM_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLIP_FORM_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLIP_FORM_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SLIP_FORM_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLIP_FORM_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_SLIP_FORM_R> updMaster1_up0;
		public final MCList<MAM_SLIP_FORM_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SlipForm_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_SLIP_FORM_R.create("T1"));
			updMaster2 = MCController.create(MAM_SLIP_FORM_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_SLIP_FORM_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_SLIP_FORM_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SLIP_FORM_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_SLIP_FORM_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * SlipForm_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR createSlipForm_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.create();
		}

		/**
		 * SlipForm_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> createSlipForm_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_SLIP_FORM_R> dest0_0, MCList<MAM_SLIP_FORM_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> src_SlipForm_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_SlipForm_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_SlipForm_Del01_Dtl);
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
				addColumnPathMap("slip_form_cd", "slip_form_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_SLIP_FORM_R r_dest, mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_SLIP_FORM_R> dest, MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR r_src : src){
				MAM_SLIP_FORM_R r_dest = dest.createRow();
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
				addColumnPathMap("slip_form_cd", "slip_form_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_SLIP_FORM_LCL_R r_dest, mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_SLIP_FORM_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.SlipForm_DelChk01_DtlR r_src : src){
				MAM_SLIP_FORM_LCL_R r_dest = dest.createRow();
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
	 * PfGrp_UpdChk01オペレーション.<p>
	 *
	 * 購買内示グループマスタの登録前のチェックを行います。<br>
	 */
	abstract public class PfGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PfGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected PfGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.class);

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
		 * PfGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR createPfGrp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.create();
		}

		/**
		 * PfGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> createPfGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>weekly_period_num</td></tr>
		 * 	<tr><td><br></td><td>weekly_period_st</td></tr>
		 * 	<tr><td><br></td><td>tendays_period_num</td></tr>
		 * 	<tr><td><br></td><td>tendays_period_st</td></tr>
		 * 	<tr><td><br></td><td>monthly_period_num</td></tr>
		 * 	<tr><td><br></td><td>monthly_period_st</td></tr>
		 * 	<tr><td><br></td><td>fix_period_num</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * PfGrp_Upd01オペレーション.<p>
	 *
	 * 購買内示グループマスタの登録を行います。<br>
	 */
	abstract public class PfGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PfGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PF_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PF_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PF_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PF_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_PF_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PF_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PF_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PF_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PF_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_PF_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected PfGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_PF_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_PF_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_PF_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_PF_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_PF_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_PF_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * PfGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR createPfGrp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.create();
		}

		/**
		 * PfGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> createPfGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>weekly_period_num</td></tr>
		 * 	<tr><td><br></td><td>weekly_period_st</td></tr>
		 * 	<tr><td><br></td><td>tendays_period_num</td></tr>
		 * 	<tr><td><br></td><td>tendays_period_st</td></tr>
		 * 	<tr><td><br></td><td>monthly_period_num</td></tr>
		 * 	<tr><td><br></td><td>monthly_period_st</td></tr>
		 * 	<tr><td><br></td><td>fix_period_num</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_PF_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> src_PfGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_PfGrp_Upd01_Dtl);
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
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_grp_nm", "pf_grp_nm");
				addColumnPathMap("weekly_period_num", "weekly_period_num");
				addColumnPathMap("weekly_period_st", "weekly_period_st");
				addColumnPathMap("tendays_period_num", "tendays_period_num");
				addColumnPathMap("tendays_period_st", "tendays_period_st");
				addColumnPathMap("monthly_period_num", "monthly_period_num");
				addColumnPathMap("monthly_period_st", "monthly_period_st");
				addColumnPathMap("fix_period_num", "fix_period_num");
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
		protected void up_UPDATE_updMaster_0(MAM_PF_GRP_R r_dest, mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_PF_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR r_src : src){
				MAM_PF_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_PF_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> src_PfGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_PfGrp_Upd01_Dtl);
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
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_grp_nm", "pf_grp_nm");
				addColumnPathMap("weekly_period_num", "weekly_period_num");
				addColumnPathMap("weekly_period_st", "weekly_period_st");
				addColumnPathMap("tendays_period_num", "tendays_period_num");
				addColumnPathMap("tendays_period_st", "tendays_period_st");
				addColumnPathMap("monthly_period_num", "monthly_period_num");
				addColumnPathMap("monthly_period_st", "monthly_period_st");
				addColumnPathMap("fix_period_num", "fix_period_num");
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
		protected void up_MAIN_chkMaster_0(MAM_PF_GRP_R r_dest, mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_PF_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.PfGrp_UpdChk01_DtlR r_src : src){
				MAM_PF_GRP_R r_dest = dest.createRow();
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
	 * PfGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 購買内示グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class PfGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PfGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PF_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PF_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PF_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PF_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_PF_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected PfGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_PF_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_PF_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_PF_GRP_R&gt; （{@link #chk01_up0}）<br>
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
		 * PfGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR createPfGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * PfGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> createPfGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_PF_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> src_PfGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_PfGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_PF_GRP_R r_dest, mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_PF_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_PF_GRP_R r_dest = dest.createRow();
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
	 * PfGrpLcl_Upd01オペレーション.<p>
	 *
	 * 購買内示グループマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class PfGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PfGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PF_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PF_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PF_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PF_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_PF_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PF_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PF_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PF_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PF_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_PF_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected PfGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_PF_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_PF_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_PF_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_PF_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_PF_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_PF_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * PfGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR createPfGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * PfGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> createPfGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_PF_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> src_PfGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_PfGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("pf_grp_nm", "pf_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_PF_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_PF_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_PF_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_PF_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> src_PfGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_PfGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("pf_grp_nm", "pf_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_PF_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_PF_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.PfGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_PF_GRP_LCL_R r_dest = dest.createRow();
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
	 * PfGrp_DelChk01オペレーション.<p>
	 *
	 * 購買内示グループマスタの削除前のチェックを行います。<br>
	 */
	abstract public class PfGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PfGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected PfGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.class);

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
		 * PfGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR createPfGrp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.create();
		}

		/**
		 * PfGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> createPfGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * PfGrp_Del01オペレーション.<p>
	 *
	 * 購買内示グループマスタの削除を行います。<br>
	 */
	abstract public class PfGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PfGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PF_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_PF_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PF_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PF_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PF_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PF_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_PF_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_PF_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_PF_GRP_R> updMaster1_up0;
		public final MCList<MAM_PF_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected PfGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_PF_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_PF_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_PF_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_PF_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_PF_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_PF_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * PfGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR createPfGrp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.create();
		}

		/**
		 * PfGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> createPfGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_PF_GRP_R> dest0_0, MCList<MAM_PF_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> src_PfGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_PfGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_PfGrp_Del01_Dtl);
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
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_PF_GRP_R r_dest, mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_PF_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR r_src : src){
				MAM_PF_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_PF_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_PF_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.PfGrp_DelChk01_DtlR r_src : src){
				MAM_PF_GRP_LCL_R r_dest = dest.createRow();
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
	 * ItmSpecGrp_UpdChk01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの登録前のチェックを行います。<br>
	 */
	abstract public class ItmSpecGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmSpecGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmSpecGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.class);

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
		 * ItmSpecGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR createItmSpecGrp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.create();
		}

		/**
		 * ItmSpecGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> createItmSpecGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ItmSpecGrp_Upd01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの登録を行います。<br>
	 */
	abstract public class ItmSpecGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmSpecGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SPEC_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SPEC_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmSpecGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_SPEC_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_SPEC_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_SPEC_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_SPEC_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ItmSpecGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR createItmSpecGrp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.create();
		}

		/**
		 * ItmSpecGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> createItmSpecGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ITM_SPEC_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> src_ItmSpecGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmSpecGrp_Upd01_Dtl);
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
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("itm_spec_grp_nm", "itm_spec_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ITM_SPEC_GRP_R r_dest, mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_SPEC_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR r_src : src){
				MAM_ITM_SPEC_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_SPEC_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> src_ItmSpecGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmSpecGrp_Upd01_Dtl);
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
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("itm_spec_grp_nm", "itm_spec_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_ITM_SPEC_GRP_R r_dest, mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_SPEC_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.ItmSpecGrp_UpdChk01_DtlR r_src : src){
				MAM_ITM_SPEC_GRP_R r_dest = dest.createRow();
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
	 * ItmSpecGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class ItmSpecGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmSpecGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SPEC_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmSpecGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_ITM_SPEC_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_ITM_SPEC_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #chk01_up0}）<br>
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
		 * ItmSpecGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR createItmSpecGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmSpecGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> createItmSpecGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_ITM_SPEC_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> src_ItmSpecGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ItmSpecGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_ITM_SPEC_GRP_R r_dest, mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_ITM_SPEC_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_SPEC_GRP_R r_dest = dest.createRow();
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
	 * ItmSpecGrpLcl_Upd01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class ItmSpecGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmSpecGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SPEC_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SPEC_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SPEC_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SPEC_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmSpecGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_SPEC_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_SPEC_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_SPEC_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_SPEC_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_SPEC_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_SPEC_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ItmSpecGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR createItmSpecGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmSpecGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> createItmSpecGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ITM_SPEC_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> src_ItmSpecGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmSpecGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_spec_grp_nm", "itm_spec_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ITM_SPEC_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_SPEC_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_SPEC_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_SPEC_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> src_ItmSpecGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmSpecGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_spec_grp_nm", "itm_spec_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_ITM_SPEC_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_SPEC_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.ItmSpecGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_SPEC_GRP_LCL_R r_dest = dest.createRow();
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
	 * ItmSpecGrp_DelChk01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの削除前のチェックを行います。<br>
	 */
	abstract public class ItmSpecGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmSpecGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmSpecGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.class);

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
		 * ItmSpecGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR createItmSpecGrp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.create();
		}

		/**
		 * ItmSpecGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> createItmSpecGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ItmSpecGrp_Del01オペレーション.<p>
	 *
	 * 品目仕様分類マスタの削除を行います。<br>
	 */
	abstract public class ItmSpecGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmSpecGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_SPEC_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_SPEC_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_SPEC_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_ITM_SPEC_GRP_R> updMaster1_up0;
		public final MCList<MAM_ITM_SPEC_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmSpecGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_ITM_SPEC_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_ITM_SPEC_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_ITM_SPEC_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_ITM_SPEC_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_SPEC_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_ITM_SPEC_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * ItmSpecGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR createItmSpecGrp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.create();
		}

		/**
		 * ItmSpecGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> createItmSpecGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ITM_SPEC_GRP_R> dest0_0, MCList<MAM_ITM_SPEC_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> src_ItmSpecGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ItmSpecGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ItmSpecGrp_Del01_Dtl);
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
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_ITM_SPEC_GRP_R r_dest, mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_ITM_SPEC_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR r_src : src){
				MAM_ITM_SPEC_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("itm_spec_grp_cd", "itm_spec_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_ITM_SPEC_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_ITM_SPEC_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.ItmSpecGrp_DelChk01_DtlR r_src : src){
				MAM_ITM_SPEC_GRP_LCL_R r_dest = dest.createRow();
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
	 * ItmCompGrp_UpdChk01オペレーション.<p>
	 *
	 * 品目構成グループマスタの登録前のチェックを行います。<br>
	 */
	abstract public class ItmCompGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCompGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmCompGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.class);

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
		 * ItmCompGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR createItmCompGrp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.create();
		}

		/**
		 * ItmCompGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> createItmCompGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>multi_sel_flg</td></tr>
		 * 	<tr><td><br></td><td>req_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ItmCompGrp_Upd01オペレーション.<p>
	 *
	 * 品目構成グループマスタの登録を行います。<br>
	 */
	abstract public class ItmCompGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCompGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COMP_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COMP_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmCompGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_COMP_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_COMP_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_COMP_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_COMP_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ItmCompGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR createItmCompGrp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.create();
		}

		/**
		 * ItmCompGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> createItmCompGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>multi_sel_flg</td></tr>
		 * 	<tr><td><br></td><td>req_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ITM_COMP_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> src_ItmCompGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmCompGrp_Upd01_Dtl);
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
				addColumnPathMap("itm_comp_grp_cd", "itm_comp_grp_cd");
				addColumnPathMap("itm_comp_grp_nm", "itm_comp_grp_nm");
				addColumnPathMap("multi_sel_flg", "multi_sel_flg");
				addColumnPathMap("req_flg", "req_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_ITM_COMP_GRP_R r_dest, mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_COMP_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR r_src : src){
				MAM_ITM_COMP_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_COMP_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> src_ItmCompGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmCompGrp_Upd01_Dtl);
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
				addColumnPathMap("itm_comp_grp_cd", "itm_comp_grp_cd");
				addColumnPathMap("itm_comp_grp_nm", "itm_comp_grp_nm");
				addColumnPathMap("multi_sel_flg", "multi_sel_flg");
				addColumnPathMap("req_flg", "req_flg");
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
		protected void up_MAIN_chkMaster_0(MAM_ITM_COMP_GRP_R r_dest, mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_COMP_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.ItmCompGrp_UpdChk01_DtlR r_src : src){
				MAM_ITM_COMP_GRP_R r_dest = dest.createRow();
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
	 * ItmCompGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目構成グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class ItmCompGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCompGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COMP_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmCompGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_ITM_COMP_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_ITM_COMP_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #chk01_up0}）<br>
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
		 * ItmCompGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR createItmCompGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmCompGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> createItmCompGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_ITM_COMP_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> src_ItmCompGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ItmCompGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("itm_comp_grp_cd", "itm_comp_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_ITM_COMP_GRP_R r_dest, mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_ITM_COMP_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_COMP_GRP_R r_dest = dest.createRow();
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
	 * ItmCompGrpLcl_Upd01オペレーション.<p>
	 *
	 * 品目構成グループマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class ItmCompGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCompGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COMP_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COMP_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COMP_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COMP_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmCompGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_COMP_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_COMP_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_COMP_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_COMP_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_COMP_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_COMP_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * ItmCompGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR createItmCompGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmCompGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> createItmCompGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ITM_COMP_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> src_ItmCompGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmCompGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("itm_comp_grp_cd", "itm_comp_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_comp_grp_nm", "itm_comp_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ITM_COMP_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_COMP_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_COMP_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_COMP_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> src_ItmCompGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmCompGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("itm_comp_grp_cd", "itm_comp_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_comp_grp_nm", "itm_comp_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_ITM_COMP_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_COMP_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.ItmCompGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_COMP_GRP_LCL_R r_dest = dest.createRow();
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
	 * ItmCompGrp_DelChk01オペレーション.<p>
	 *
	 * 品目構成グループマスタの削除前のチェックを行います。<br>
	 */
	abstract public class ItmCompGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCompGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmCompGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.class);

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
		 * ItmCompGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR createItmCompGrp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.create();
		}

		/**
		 * ItmCompGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> createItmCompGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * ItmCompGrp_Del01オペレーション.<p>
	 *
	 * 品目構成グループマスタの削除を行います。<br>
	 */
	abstract public class ItmCompGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmCompGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_COMP_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_COMP_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_COMP_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_COMP_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_ITM_COMP_GRP_R> updMaster1_up0;
		public final MCList<MAM_ITM_COMP_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmCompGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_ITM_COMP_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_ITM_COMP_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_ITM_COMP_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_ITM_COMP_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_COMP_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_ITM_COMP_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * ItmCompGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR createItmCompGrp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.create();
		}

		/**
		 * ItmCompGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> createItmCompGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_comp_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_ITM_COMP_GRP_R> dest0_0, MCList<MAM_ITM_COMP_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> src_ItmCompGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ItmCompGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ItmCompGrp_Del01_Dtl);
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
				addColumnPathMap("itm_comp_grp_cd", "itm_comp_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_ITM_COMP_GRP_R r_dest, mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_ITM_COMP_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR r_src : src){
				MAM_ITM_COMP_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("itm_comp_grp_cd", "itm_comp_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_ITM_COMP_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_ITM_COMP_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.ItmCompGrp_DelChk01_DtlR r_src : src){
				MAM_ITM_COMP_GRP_LCL_R r_dest = dest.createRow();
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
	 * JnlAct_UpdChk01オペレーション.<p>
	 *
	 * 仕訳実行マスタの登録前のチェックを行います。<br>
	 */
	abstract public class JnlAct_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlAct_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected JnlAct_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.class);

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
		 * JnlAct_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR createJnlAct_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.create();
		}

		/**
		 * JnlAct_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> createJnlAct_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_act_nm</td></tr>
		 * 	<tr><td><br></td><td>jnl_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * JnlAct_Upd01オペレーション.<p>
	 *
	 * 仕訳実行マスタの登録を行います。<br>
	 */
	abstract public class JnlAct_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_ACT_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_ACT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_ACT_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_ACT_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_ACT_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_ACT_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_ACT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_ACT_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_ACT_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_ACT_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_JNL_ACT_R.create("T1"));
			chkMaster = MCController.create(MAM_JNL_ACT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_JNL_ACT_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_JNL_ACT_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_JNL_ACT_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_JNL_ACT_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * JnlAct_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR createJnlAct_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.create();
		}

		/**
		 * JnlAct_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> createJnlAct_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_act_nm</td></tr>
		 * 	<tr><td><br></td><td>jnl_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_JNL_ACT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> src_JnlAct_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_JnlAct_Upd01_Dtl);
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
				addColumnPathMap("jnl_act_cd", "jnl_act_cd");
				addColumnPathMap("jnl_act_nm", "jnl_act_nm");
				addColumnPathMap("jnl_del_flg", "jnl_del_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_JNL_ACT_R r_dest, mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_JNL_ACT_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR r_src : src){
				MAM_JNL_ACT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_JNL_ACT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> src_JnlAct_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_JnlAct_Upd01_Dtl);
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
				addColumnPathMap("jnl_act_cd", "jnl_act_cd");
				addColumnPathMap("jnl_act_nm", "jnl_act_nm");
				addColumnPathMap("jnl_del_flg", "jnl_del_flg");
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
		protected void up_MAIN_chkMaster_0(MAM_JNL_ACT_R r_dest, mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_JNL_ACT_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.JnlAct_UpdChk01_DtlR r_src : src){
				MAM_JNL_ACT_R r_dest = dest.createRow();
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
	 * JnlActLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕訳実行マスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class JnlActLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlActLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_ACT_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_ACT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_ACT_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_ACT_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_JNL_ACT_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlActLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_JNL_ACT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_JNL_ACT_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_JNL_ACT_R&gt; （{@link #chk01_up0}）<br>
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
		 * JnlActLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR createJnlActLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.create();
		}

		/**
		 * JnlActLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> createJnlActLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_act_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_JNL_ACT_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> src_JnlActLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_JnlActLcl_UpdChk01_Dtl);
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
				addColumnPathMap("jnl_act_cd", "jnl_act_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_JNL_ACT_R r_dest, mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_JNL_ACT_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR r_src : src){
				MAM_JNL_ACT_R r_dest = dest.createRow();
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
	 * JnlActLcl_Upd01オペレーション.<p>
	 *
	 * 仕訳実行マスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class JnlActLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlActLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_ACT_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_ACT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_ACT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_ACT_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_ACT_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_ACT_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_ACT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_ACT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_ACT_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_ACT_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlActLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_JNL_ACT_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_JNL_ACT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_JNL_ACT_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_JNL_ACT_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_JNL_ACT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_JNL_ACT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * JnlActLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR createJnlActLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.create();
		}

		/**
		 * JnlActLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> createJnlActLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_act_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_JNL_ACT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> src_JnlActLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_JnlActLcl_Upd01_Dtl);
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
				addColumnPathMap("jnl_act_cd", "jnl_act_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("jnl_act_nm", "jnl_act_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_JNL_ACT_LCL_R r_dest, mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_JNL_ACT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR r_src : src){
				MAM_JNL_ACT_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_JNL_ACT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> src_JnlActLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_JnlActLcl_Upd01_Dtl);
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
				addColumnPathMap("jnl_act_cd", "jnl_act_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("jnl_act_nm", "jnl_act_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_JNL_ACT_LCL_R r_dest, mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_JNL_ACT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.JnlActLcl_UpdChk01_DtlR r_src : src){
				MAM_JNL_ACT_LCL_R r_dest = dest.createRow();
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
	 * JnlAct_DelChk01オペレーション.<p>
	 *
	 * 仕訳実行マスタの削除前のチェックを行います。<br>
	 */
	abstract public class JnlAct_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlAct_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected JnlAct_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.class);

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
		 * JnlAct_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR createJnlAct_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.create();
		}

		/**
		 * JnlAct_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> createJnlAct_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * JnlAct_Del01オペレーション.<p>
	 *
	 * 仕訳実行マスタの削除を行います。<br>
	 */
	abstract public class JnlAct_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlAct_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_ACT_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_ACT_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_ACT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_ACT_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_ACT_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_ACT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_ACT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_ACT_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_JNL_ACT_R> updMaster1_up0;
		public final MCList<MAM_JNL_ACT_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlAct_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_JNL_ACT_R.create("T1"));
			updMaster2 = MCController.create(MAM_JNL_ACT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_JNL_ACT_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_JNL_ACT_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_JNL_ACT_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_JNL_ACT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * JnlAct_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR createJnlAct_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.create();
		}

		/**
		 * JnlAct_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> createJnlAct_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_act_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_JNL_ACT_R> dest0_0, MCList<MAM_JNL_ACT_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> src_JnlAct_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_JnlAct_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_JnlAct_Del01_Dtl);
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
				addColumnPathMap("jnl_act_cd", "jnl_act_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_JNL_ACT_R r_dest, mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_JNL_ACT_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR r_src : src){
				MAM_JNL_ACT_R r_dest = dest.createRow();
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
				addColumnPathMap("jnl_act_cd", "jnl_act_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_JNL_ACT_LCL_R r_dest, mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_JNL_ACT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.JnlAct_DelChk01_DtlR r_src : src){
				MAM_JNL_ACT_LCL_R r_dest = dest.createRow();
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
	 * JnlGrp_UpdChk01オペレーション.<p>
	 *
	 * 仕訳グループマスタの登録前のチェックを行います。<br>
	 */
	abstract public class JnlGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected JnlGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.class);

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
		 * JnlGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR createJnlGrp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.create();
		}

		/**
		 * JnlGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> createJnlGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_bank_flg1</td></tr>
		 * 	<tr><td><br></td><td>ac_bank_flg2</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * JnlGrp_Upd01オペレーション.<p>
	 *
	 * 仕訳グループマスタの登録を行います。<br>
	 */
	abstract public class JnlGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_JNL_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_JNL_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_JNL_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_JNL_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_JNL_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_JNL_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * JnlGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR createJnlGrp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.create();
		}

		/**
		 * JnlGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> createJnlGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_bank_flg1</td></tr>
		 * 	<tr><td><br></td><td>ac_bank_flg2</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_JNL_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> src_JnlGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_JnlGrp_Upd01_Dtl);
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
				addColumnPathMap("jnl_grp_cd", "jnl_grp_cd");
				addColumnPathMap("jnl_grp_nm", "jnl_grp_nm");
				addColumnPathMap("ac_bank_flg1", "ac_bank_flg1");
				addColumnPathMap("ac_bank_flg2", "ac_bank_flg2");
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
		protected void up_UPDATE_updMaster_0(MAM_JNL_GRP_R r_dest, mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_JNL_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR r_src : src){
				MAM_JNL_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_JNL_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> src_JnlGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_JnlGrp_Upd01_Dtl);
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
				addColumnPathMap("jnl_grp_cd", "jnl_grp_cd");
				addColumnPathMap("jnl_grp_nm", "jnl_grp_nm");
				addColumnPathMap("ac_bank_flg1", "ac_bank_flg1");
				addColumnPathMap("ac_bank_flg2", "ac_bank_flg2");
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
		protected void up_MAIN_chkMaster_0(MAM_JNL_GRP_R r_dest, mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_JNL_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.JnlGrp_UpdChk01_DtlR r_src : src){
				MAM_JNL_GRP_R r_dest = dest.createRow();
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
	 * JnlGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕訳グループマスタの登録前のチェックを行います。（ロケール用）<br>
	 */
	abstract public class JnlGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_JNL_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_JNL_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_JNL_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_JNL_GRP_R&gt; （{@link #chk01_up0}）<br>
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
		 * JnlGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR createJnlGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * JnlGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> createJnlGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_EXISTS(MCList<MAM_JNL_GRP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> src_JnlGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_JnlGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("jnl_grp_cd", "jnl_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_JNL_GRP_R r_dest, mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_JNL_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_JNL_GRP_R r_dest = dest.createRow();
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
	 * JnlGrpLcl_Upd01オペレーション.<p>
	 *
	 * 仕訳グループマスタの登録を行います。（ロケール用）<br>
	 */
	abstract public class JnlGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_JNL_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_JNL_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_JNL_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_JNL_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_JNL_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_JNL_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_JNL_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
		 * JnlGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR createJnlGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * JnlGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> createJnlGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_JNL_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> src_JnlGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_JnlGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("jnl_grp_cd", "jnl_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("jnl_grp_nm", "jnl_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_JNL_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_JNL_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_JNL_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_JNL_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> src_JnlGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_JnlGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("jnl_grp_cd", "jnl_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("jnl_grp_nm", "jnl_grp_nm");
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
		protected void up_MAIN_chkMaster_0(MAM_JNL_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_JNL_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0034.JnlGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_JNL_GRP_LCL_R r_dest = dest.createRow();
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
	 * JnlGrp_DelChk01オペレーション.<p>
	 *
	 * 仕訳グループマスタの削除前のチェックを行います。<br>
	 */
	abstract public class JnlGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected JnlGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.class);

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
		 * JnlGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR createJnlGrp_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.create();
		}

		/**
		 * JnlGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> createJnlGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MultiReg)MABCL_MultiReg_MC_A.this).info;
		}


	}
	/**
	 * JnlGrp_Del01オペレーション.<p>
	 *
	 * 仕訳グループマスタの削除を行います。<br>
	 */
	abstract public class JnlGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "JnlGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_JNL_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_JNL_GRP_R> updMaster1_up0;
		public final MCList<MAM_JNL_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected JnlGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_JNL_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_JNL_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_JNL_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_JNL_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_JNL_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_JNL_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
		 * JnlGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR createJnlGrp_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.create();
		}

		/**
		 * JnlGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> createJnlGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> up0() {
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
		protected void up_UPDATE(MCList<MAM_JNL_GRP_R> dest0_0, MCList<MAM_JNL_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> src_JnlGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_JnlGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_JnlGrp_Del01_Dtl);
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
				addColumnPathMap("jnl_grp_cd", "jnl_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_JNL_GRP_R r_dest, mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_JNL_GRP_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR r_src : src){
				MAM_JNL_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("jnl_grp_cd", "jnl_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_JNL_GRP_LCL_R r_dest, mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_JNL_GRP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0034.JnlGrp_DelChk01_DtlR r_src : src){
				MAM_JNL_GRP_LCL_R r_dest = dest.createRow();
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