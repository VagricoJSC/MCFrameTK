package mcframe.serverMABC.MABCL2090;

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
 * "MABCL_CostDptReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_CostDptReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL2090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_CostDptReg.CostDpt_UpdChk01 aCostDpt_UpdChk01;

	protected void initCostDpt_UpdChk01() {
		this.info = PDef.MA_MABCL2090_CostDpt_UpdChk01_INFO;
		this.aCostDpt_UpdChk01 = ((MABCL_CostDptReg)this).new CostDpt_UpdChk01();
	}

	public static MABCL_CostDptReg.CostDpt_UpdChk01 crtCostDpt_UpdChk01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
		lgc.initCostDpt_UpdChk01();
		return lgc.aCostDpt_UpdChk01;
	}

	protected void paramCostDpt_UpdChk01(MCParam p) {
		if (this.aCostDpt_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostDpt_UpdChk01.up0());
	}

	protected void doCostDpt_UpdChk01() {
		aCostDpt_UpdChk01.call();
	};

	/**
	 * CostDpt_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR createCostDpt_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.create();
	}

	/**
	 * CostDpt_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> createCostDpt_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.class);
	}
	protected MABCL_CostDptReg.CostDpt_Upd01 aCostDpt_Upd01;

	protected void initCostDpt_Upd01() {
		this.info = PDef.MA_MABCL2090_CostDpt_Upd01_INFO;
		this.aCostDpt_Upd01 = ((MABCL_CostDptReg)this).new CostDpt_Upd01();
	}

	public static MABCL_CostDptReg.CostDpt_Upd01 crtCostDpt_Upd01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
		lgc.initCostDpt_Upd01();
		return lgc.aCostDpt_Upd01;
	}

	protected void paramCostDpt_Upd01(MCParam p) {
		if (this.aCostDpt_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostDpt_Upd01.up0());
	}

	protected void doCostDpt_Upd01() {
		aCostDpt_Upd01.call();
	};

	/**
	 * CostDpt_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR createCostDpt_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.create();
	}

	/**
	 * CostDpt_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> createCostDpt_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.class);
	}
	protected MABCL_CostDptReg.CostDptLcl_UpdChk01 aCostDptLcl_UpdChk01;

	protected void initCostDptLcl_UpdChk01() {
		this.info = PDef.MA_MABCL2090_CostDptLcl_UpdChk01_INFO;
		this.aCostDptLcl_UpdChk01 = ((MABCL_CostDptReg)this).new CostDptLcl_UpdChk01();
	}

	public static MABCL_CostDptReg.CostDptLcl_UpdChk01 crtCostDptLcl_UpdChk01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
		lgc.initCostDptLcl_UpdChk01();
		return lgc.aCostDptLcl_UpdChk01;
	}

	protected void paramCostDptLcl_UpdChk01(MCParam p) {
		if (this.aCostDptLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostDptLcl_UpdChk01.up0());
	}

	protected void doCostDptLcl_UpdChk01() {
		aCostDptLcl_UpdChk01.call();
	};

	/**
	 * CostDptLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR createCostDptLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CostDptLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> createCostDptLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_CostDptReg.CostDptLcl_Upd01 aCostDptLcl_Upd01;

	protected void initCostDptLcl_Upd01() {
		this.info = PDef.MA_MABCL2090_CostDptLcl_Upd01_INFO;
		this.aCostDptLcl_Upd01 = ((MABCL_CostDptReg)this).new CostDptLcl_Upd01();
	}

	public static MABCL_CostDptReg.CostDptLcl_Upd01 crtCostDptLcl_Upd01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
		lgc.initCostDptLcl_Upd01();
		return lgc.aCostDptLcl_Upd01;
	}

	protected void paramCostDptLcl_Upd01(MCParam p) {
		if (this.aCostDptLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostDptLcl_Upd01.up0());
	}

	protected void doCostDptLcl_Upd01() {
		aCostDptLcl_Upd01.call();
	};

	/**
	 * CostDptLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR createCostDptLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CostDptLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> createCostDptLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_CostDptReg.CostDpt_DelChk01 aCostDpt_DelChk01;

	protected void initCostDpt_DelChk01() {
		this.info = PDef.MA_MABCL2090_CostDpt_DelChk01_INFO;
		this.aCostDpt_DelChk01 = ((MABCL_CostDptReg)this).new CostDpt_DelChk01();
	}

	public static MABCL_CostDptReg.CostDpt_DelChk01 crtCostDpt_DelChk01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
		lgc.initCostDpt_DelChk01();
		return lgc.aCostDpt_DelChk01;
	}

	protected void paramCostDpt_DelChk01(MCParam p) {
		if (this.aCostDpt_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostDpt_DelChk01.up0());
	}

	protected void doCostDpt_DelChk01() {
		aCostDpt_DelChk01.call();
	};

	/**
	 * CostDpt_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR createCostDpt_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.create();
	}

	/**
	 * CostDpt_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> createCostDpt_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.class);
	}
	protected MABCL_CostDptReg.CostDpt_Del01 aCostDpt_Del01;

	protected void initCostDpt_Del01() {
		this.info = PDef.MA_MABCL2090_CostDpt_Del01_INFO;
		this.aCostDpt_Del01 = ((MABCL_CostDptReg)this).new CostDpt_Del01();
	}

	public static MABCL_CostDptReg.CostDpt_Del01 crtCostDpt_Del01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
		lgc.initCostDpt_Del01();
		return lgc.aCostDpt_Del01;
	}

	protected void paramCostDpt_Del01(MCParam p) {
		if (this.aCostDpt_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostDpt_Del01.up0());
	}

	protected void doCostDpt_Del01() {
		aCostDpt_Del01.call();
	};

	/**
	 * CostDpt_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR createCostDpt_Del01_DtlR(){
		return mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.create();
	}

	/**
	 * CostDpt_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> createCostDpt_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.class);
	}
	protected MABCL_CostDptReg.CostDpt_InsChk01 aCostDpt_InsChk01;

	protected void initCostDpt_InsChk01() {
		this.info = PDef.MA_MABCL2090_CostDpt_InsChk01_INFO;
		this.aCostDpt_InsChk01 = ((MABCL_CostDptReg)this).new CostDpt_InsChk01();
	}

	public static MABCL_CostDptReg.CostDpt_InsChk01 crtCostDpt_InsChk01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
		lgc.initCostDpt_InsChk01();
		return lgc.aCostDpt_InsChk01;
	}

	protected void paramCostDpt_InsChk01(MCParam p) {
		if (this.aCostDpt_InsChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostDpt_InsChk01.up0());
		p.addDownBlock(aCostDpt_InsChk01.down0());
	}

	protected void doCostDpt_InsChk01() {
		aCostDpt_InsChk01.call();
	};

	/**
	 * CostDpt_InsChk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR createCostDpt_InsChk01_CndR(){
		return mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR.create();
	}
	protected MABCL_CostDptReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL2090_Srch01_INFO;
		this.aSrch01 = ((MABCL_CostDptReg)this).new Srch01();
	}

	public static MABCL_CostDptReg.Srch01 crtSrch01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL2090.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL2090.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL2090.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL2090.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL2090.Srch01_Rslt2R.class);
	}
	protected MABCL_CostDptReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL2090_Upd01_INFO;
		this.aUpd01 = ((MABCL_CostDptReg)this).new Upd01();
	}

	public static MABCL_CostDptReg.Upd01 crtUpd01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
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
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_CostDptReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL2090_Del01_INFO;
		this.aDel01 = ((MABCL_CostDptReg)this).new Del01();
	}

	public static MABCL_CostDptReg.Del01 crtDel01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
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
	public mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.class);
	}
	protected MABCL_CostDptReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MA_MABCL2090_Ins01_INFO;
		this.aIns01 = ((MABCL_CostDptReg)this).new Ins01();
	}

	public static MABCL_CostDptReg.Ins01 crtIns01() {
		MABCL_CostDptReg lgc = new MABCL_CostDptReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_InsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR createIns01_InsR(){
		return mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * CostDpt_UpdChk01オペレーション.<p>
	 *
	 * 原価部門マスタを登録する前のチェックを行う<br>
	 */
	abstract public class CostDpt_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostDpt_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CostDpt_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.class);

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
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostDpt_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR createCostDpt_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.create();
		}

		/**
		 * CostDpt_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> createCostDpt_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>dpt_config_typ</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}


	}
	/**
	 * CostDpt_Upd01オペレーション.<p>
	 *
	 * 原価部門マスタを登録する<br>
	 */
	abstract public class CostDpt_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostDpt_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_DPT_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_DPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_DPT_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_DPT_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_DPT_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_DPT_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_DPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_DPT_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_DPT_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_DPT_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostDpt_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_COST_DPT_R.create("T1"));
			chkMaster = MCController.create(MAM_COST_DPT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_COST_DPT_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_COST_DPT_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_COST_DPT_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_COST_DPT_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostDpt_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR createCostDpt_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.create();
		}

		/**
		 * CostDpt_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> createCostDpt_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>dpt_config_typ</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_COST_DPT_R> dest0_0, MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> src_CostDpt_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CostDpt_Upd01_Dtl);
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("dpt_alc_grp", "dpt_alc_grp");
				addColumnPathMap("dpt_config_typ", "dpt_config_typ");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("site_cd", "site_cd");
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
		protected void up_UPDATE_updMaster_0(MAM_COST_DPT_R r_dest, mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_COST_DPT_R> dest, MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_src : src){
				MAM_COST_DPT_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_COST_DPT_R> dest0_0, MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> src_CostDpt_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CostDpt_Upd01_Dtl);
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_COST_DPT_R r_dest, mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_COST_DPT_R> dest, MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_src : src){
				MAM_COST_DPT_R r_dest = dest.createRow();
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
	 * CostDptLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価部門マスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	abstract public class CostDptLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostDptLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_DPT_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_DPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_DPT_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_DPT_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_COST_DPT_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostDptLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_COST_DPT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_COST_DPT_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_COST_DPT_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostDptLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR createCostDptLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CostDptLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> createCostDptLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_COST_DPT_R> dest0_0, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> src_CostDptLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_CostDptLcl_UpdChk01_Dtl);
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_COST_DPT_R r_dest, mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_COST_DPT_R> dest, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src : src){
				MAM_COST_DPT_R r_dest = dest.createRow();
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
	 * CostDptLcl_Upd01オペレーション.<p>
	 *
	 * 原価部門マスタ(ロケール別情報)を登録する<br>
	 */
	abstract public class CostDptLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostDptLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_DPT_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_DPT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_DPT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_DPT_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_DPT_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_DPT_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_DPT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_DPT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_DPT_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_DPT_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostDptLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_COST_DPT_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_COST_DPT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_COST_DPT_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_COST_DPT_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_COST_DPT_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_COST_DPT_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostDptLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR createCostDptLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CostDptLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> createCostDptLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_COST_DPT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> src_CostDptLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CostDptLcl_Upd01_Dtl);
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_COST_DPT_LCL_R r_dest, mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_COST_DPT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src : src){
				MAM_COST_DPT_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_COST_DPT_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> src_CostDptLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CostDptLcl_Upd01_Dtl);
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_COST_DPT_LCL_R r_dest, mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_COST_DPT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src : src){
				MAM_COST_DPT_LCL_R r_dest = dest.createRow();
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
	 * CostDpt_DelChk01オペレーション.<p>
	 *
	 * 原価部門マスタ、原価部門マスタ(ロケール別情報)を削除する前のチェックを行う<br>
	 */
	abstract public class CostDpt_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostDpt_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CostDpt_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.class);

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
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostDpt_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR createCostDpt_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.create();
		}

		/**
		 * CostDpt_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> createCostDpt_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}


	}
	/**
	 * CostDpt_Del01オペレーション.<p>
	 *
	 * 原価部門マスタ、原価部門マスタ(ロケール別情報)を削除する<br>
	 */
	abstract public class CostDpt_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostDpt_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_DPT_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_COST_DPT_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_DPT_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_DPT_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_DPT_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_DPT_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_DPT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_DPT_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_COST_DPT_R> updMaster1_up0;
		public final MCList<MAM_COST_DPT_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostDpt_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_COST_DPT_R.create("T1"));
			updMaster2 = MCController.create(MAM_COST_DPT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_COST_DPT_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_COST_DPT_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_COST_DPT_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_COST_DPT_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostDpt_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR createCostDpt_Del01_DtlR(){
			return mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.create();
		}

		/**
		 * CostDpt_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> createCostDpt_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_COST_DPT_R> dest0_0, MCList<MAM_COST_DPT_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> src_CostDpt_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_CostDpt_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_CostDpt_Del01_Dtl);
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
				addColumnPathMap("term", "term");
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
		protected void up_UPDATE_updMaster1_0(MAM_COST_DPT_R r_dest, mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_COST_DPT_R> dest, MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_src : src){
				MAM_COST_DPT_R r_dest = dest.createRow();
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_COST_DPT_LCL_R r_dest, mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_COST_DPT_LCL_R> dest, MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_src : src){
				MAM_COST_DPT_LCL_R r_dest = dest.createRow();
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
	 * CostDpt_InsChk01オペレーション.<p>
	 *
	 * 会計部門マスタから原価部門マスタへ取込する前のチェックを行う<br>
	 */
	abstract public class CostDpt_InsChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostDpt_InsChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR down0;
		
		
		// コンストラクタ
		protected CostDpt_InsChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR.create();
			down0 = mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR.create();

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
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CostDpt_InsChk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR createCostDpt_InsChk01_CndR(){
			return mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>ins_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>ins_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
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
		private final mcframe.serverMABC.MABCL2090.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt2R> down1;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_DPT_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_DPT_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_COST_DPT_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_DPT_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_COST_DPT_R> c0_down0;
		/**
		 * 連携情報 SELECT_LCL<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_DPT_LCL_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_LCL = "SELECT_LCL";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_DPT_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_COST_DPT_LCL_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_DPT_LCL_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_COST_DPT_LCL_R> c1_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2090.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL2090.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL2090.Srch01_Rslt2R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_COST_DPT_R.create("T1"));
			c1 = MCController.create(MAM_COST_DPT_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_COST_DPT_R>)c0.down(0);
			c1_down0 = (MCList<MAM_COST_DPT_LCL_R>)c1.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_LCL, c1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_LCL)) {
				up_SELECT_LCL();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_COST_DPT_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_LCL<br>
		 * MCList&lt;MAM_COST_DPT_LCL_R&gt;（{@link #c1_down0}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_LCL)) {
				down_SELECT_LCL(down1(), c1_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL2090.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL2090.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL2090.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL2090.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL2090.Srch01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_fr_nm</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>term_to_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2090.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL2090.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>term_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>dpt_config_typ</td></tr>
		 * 	<tr><td><br></td><td>dpt_config_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_LCL専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_LCLの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_LCL(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_COST_DPT_R> src0_0){
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
				addColumnPathMap("term", "term");
				addColumnPathMap("term_nm", "term_nm");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm_lcl", "dpt_nm");
				addColumnPathMap("dpt_nm", "base_dpt_nm");
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("dpt_lvl_nm", "dpt_lvl_nm");
				addColumnPathMap("dpt_alc_grp", "dpt_alc_grp");
				addColumnPathMap("dpt_config_typ", "dpt_config_typ");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
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
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL2090.Srch01_Rslt1R r_dest, MAM_COST_DPT_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt1R> dest, MCList<MAM_COST_DPT_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_COST_DPT_R r_src : src){
				mcframe.serverMABC.MABCL2090.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCLの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL(MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_COST_DPT_LCL_R> src0_0){
			down_SELECT_LCL_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL_c1_0() {
			MCRowMapper map = new Map_down_SELECT_LCL_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
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
		 * 連携処理SELECT_LCL_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL_c1_0(mcframe.serverMABC.MABCL2090.Srch01_Rslt2R r_dest, MAM_COST_DPT_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL_c1_0(MCList<mcframe.serverMABC.MABCL2090.Srch01_Rslt2R> dest, MCList<MAM_COST_DPT_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL_c1_0();
			for(MAM_COST_DPT_LCL_R r_src : src){
				mcframe.serverMABC.MABCL2090.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL_c1_0(r_dest, r_src);
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
		private final MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDptLcl_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDptLcl_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDptLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDptLcl_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDptLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDptLcl_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.crtCostDpt_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.crtCostDpt_Upd01();
			chk02 = mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.crtCostDptLcl_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.crtCostDptLcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR>)upd02.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
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
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>dpt_config_typ</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> src_Upd01_Dtl1){
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("dpt_alc_grp", "dpt_alc_grp");
				addColumnPathMap("dpt_config_typ", "dpt_config_typ");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("site_cd", "site_cd");
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
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("dpt_lvl_cd", "dpt_lvl_cd");
				addColumnPathMap("dpt_alc_grp", "dpt_alc_grp");
				addColumnPathMap("dpt_config_typ", "dpt_config_typ");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("site_cd", "site_cd");
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
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL2090.CostDpt_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> src_Upd01_Dtl2){
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
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
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
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
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL2090.CostDptLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
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
		private final MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.CostDpt_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.crtCostDpt_DelChk01();
			del01 = mcframe.serverMABC.MABCL2090.MABCL_CostDptReg.crtCostDpt_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> src_Del01_Dtl1){
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("term", "term");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL2090.CostDpt_DelChk01_DtlR r_dest = dest.createRow();
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
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 会計部門マスタから原価部門マスタへ取込処理を行う<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR up0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR.create();

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
			invoke((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins01_InsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR createIns01_InsR(){
			return mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_dt</td></tr>
		 * 	<tr><td><br></td><td>ins_only_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR
		 */
		public mcframe.serverMABC.MABCL2090.CostDpt_InsChk01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CostDptReg)MABCL_CostDptReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}