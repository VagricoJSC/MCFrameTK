package mcframe.serverMABC.MABCL0890;

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
 * "MABCL_SpecReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_SpecReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0890";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_SpecReg.Spec_UpdChk01 aSpec_UpdChk01;

	protected void initSpec_UpdChk01() {
		this.info = PDef.MA_MABCL0890_Spec_UpdChk01_INFO;
		this.aSpec_UpdChk01 = ((MABCL_SpecReg)this).new Spec_UpdChk01();
	}

	public static MABCL_SpecReg.Spec_UpdChk01 crtSpec_UpdChk01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpec_UpdChk01();
		return lgc.aSpec_UpdChk01;
	}

	protected void paramSpec_UpdChk01(MCParam p) {
		if (this.aSpec_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpec_UpdChk01.up0());
	}

	protected void doSpec_UpdChk01() {
		aSpec_UpdChk01.call();
	};

	/**
	 * Spec_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR createSpec_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.create();
	}

	/**
	 * Spec_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> createSpec_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.class);
	}
	protected MABCL_SpecReg.Spec_Upd01 aSpec_Upd01;

	protected void initSpec_Upd01() {
		this.info = PDef.MA_MABCL0890_Spec_Upd01_INFO;
		this.aSpec_Upd01 = ((MABCL_SpecReg)this).new Spec_Upd01();
	}

	public static MABCL_SpecReg.Spec_Upd01 crtSpec_Upd01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpec_Upd01();
		return lgc.aSpec_Upd01;
	}

	protected void paramSpec_Upd01(MCParam p) {
		if (this.aSpec_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpec_Upd01.up0());
	}

	protected void doSpec_Upd01() {
		aSpec_Upd01.call();
	};

	/**
	 * Spec_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR createSpec_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.create();
	}

	/**
	 * Spec_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> createSpec_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.class);
	}
	protected MABCL_SpecReg.SpecDesc_UpdChk01 aSpecDesc_UpdChk01;

	protected void initSpecDesc_UpdChk01() {
		this.info = PDef.MA_MABCL0890_SpecDesc_UpdChk01_INFO;
		this.aSpecDesc_UpdChk01 = ((MABCL_SpecReg)this).new SpecDesc_UpdChk01();
	}

	public static MABCL_SpecReg.SpecDesc_UpdChk01 crtSpecDesc_UpdChk01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpecDesc_UpdChk01();
		return lgc.aSpecDesc_UpdChk01;
	}

	protected void paramSpecDesc_UpdChk01(MCParam p) {
		if (this.aSpecDesc_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpecDesc_UpdChk01.up0());
	}

	protected void doSpecDesc_UpdChk01() {
		aSpecDesc_UpdChk01.call();
	};

	/**
	 * SpecDesc_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR createSpecDesc_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.create();
	}

	/**
	 * SpecDesc_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> createSpecDesc_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.class);
	}
	protected MABCL_SpecReg.SpecDesc_Upd01 aSpecDesc_Upd01;

	protected void initSpecDesc_Upd01() {
		this.info = PDef.MA_MABCL0890_SpecDesc_Upd01_INFO;
		this.aSpecDesc_Upd01 = ((MABCL_SpecReg)this).new SpecDesc_Upd01();
	}

	public static MABCL_SpecReg.SpecDesc_Upd01 crtSpecDesc_Upd01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpecDesc_Upd01();
		return lgc.aSpecDesc_Upd01;
	}

	protected void paramSpecDesc_Upd01(MCParam p) {
		if (this.aSpecDesc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpecDesc_Upd01.up0());
	}

	protected void doSpecDesc_Upd01() {
		aSpecDesc_Upd01.call();
	};

	/**
	 * SpecDesc_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR createSpecDesc_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.create();
	}

	/**
	 * SpecDesc_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> createSpecDesc_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.class);
	}
	protected MABCL_SpecReg.SpecLcl_UpdChk01 aSpecLcl_UpdChk01;

	protected void initSpecLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0890_SpecLcl_UpdChk01_INFO;
		this.aSpecLcl_UpdChk01 = ((MABCL_SpecReg)this).new SpecLcl_UpdChk01();
	}

	public static MABCL_SpecReg.SpecLcl_UpdChk01 crtSpecLcl_UpdChk01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpecLcl_UpdChk01();
		return lgc.aSpecLcl_UpdChk01;
	}

	protected void paramSpecLcl_UpdChk01(MCParam p) {
		if (this.aSpecLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpecLcl_UpdChk01.up0());
	}

	protected void doSpecLcl_UpdChk01() {
		aSpecLcl_UpdChk01.call();
	};

	/**
	 * SpecLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR createSpecLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SpecLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> createSpecLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_SpecReg.SpecLcl_Upd01 aSpecLcl_Upd01;

	protected void initSpecLcl_Upd01() {
		this.info = PDef.MA_MABCL0890_SpecLcl_Upd01_INFO;
		this.aSpecLcl_Upd01 = ((MABCL_SpecReg)this).new SpecLcl_Upd01();
	}

	public static MABCL_SpecReg.SpecLcl_Upd01 crtSpecLcl_Upd01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpecLcl_Upd01();
		return lgc.aSpecLcl_Upd01;
	}

	protected void paramSpecLcl_Upd01(MCParam p) {
		if (this.aSpecLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpecLcl_Upd01.up0());
	}

	protected void doSpecLcl_Upd01() {
		aSpecLcl_Upd01.call();
	};

	/**
	 * SpecLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR createSpecLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SpecLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> createSpecLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_SpecReg.SpecDescLcl_UpdChk01 aSpecDescLcl_UpdChk01;

	protected void initSpecDescLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0890_SpecDescLcl_UpdChk01_INFO;
		this.aSpecDescLcl_UpdChk01 = ((MABCL_SpecReg)this).new SpecDescLcl_UpdChk01();
	}

	public static MABCL_SpecReg.SpecDescLcl_UpdChk01 crtSpecDescLcl_UpdChk01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpecDescLcl_UpdChk01();
		return lgc.aSpecDescLcl_UpdChk01;
	}

	protected void paramSpecDescLcl_UpdChk01(MCParam p) {
		if (this.aSpecDescLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpecDescLcl_UpdChk01.up0());
	}

	protected void doSpecDescLcl_UpdChk01() {
		aSpecDescLcl_UpdChk01.call();
	};

	/**
	 * SpecDescLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR createSpecDescLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SpecDescLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> createSpecDescLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_SpecReg.SpecDescLcl_Upd01 aSpecDescLcl_Upd01;

	protected void initSpecDescLcl_Upd01() {
		this.info = PDef.MA_MABCL0890_SpecDescLcl_Upd01_INFO;
		this.aSpecDescLcl_Upd01 = ((MABCL_SpecReg)this).new SpecDescLcl_Upd01();
	}

	public static MABCL_SpecReg.SpecDescLcl_Upd01 crtSpecDescLcl_Upd01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpecDescLcl_Upd01();
		return lgc.aSpecDescLcl_Upd01;
	}

	protected void paramSpecDescLcl_Upd01(MCParam p) {
		if (this.aSpecDescLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpecDescLcl_Upd01.up0());
	}

	protected void doSpecDescLcl_Upd01() {
		aSpecDescLcl_Upd01.call();
	};

	/**
	 * SpecDescLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR createSpecDescLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.create();
	}

	/**
	 * SpecDescLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> createSpecDescLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_SpecReg.Spec_DelChk01 aSpec_DelChk01;

	protected void initSpec_DelChk01() {
		this.info = PDef.MA_MABCL0890_Spec_DelChk01_INFO;
		this.aSpec_DelChk01 = ((MABCL_SpecReg)this).new Spec_DelChk01();
	}

	public static MABCL_SpecReg.Spec_DelChk01 crtSpec_DelChk01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpec_DelChk01();
		return lgc.aSpec_DelChk01;
	}

	protected void paramSpec_DelChk01(MCParam p) {
		if (this.aSpec_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpec_DelChk01.up0());
	}

	protected void doSpec_DelChk01() {
		aSpec_DelChk01.call();
	};

	/**
	 * Spec_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR createSpec_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.create();
	}

	/**
	 * Spec_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> createSpec_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.class);
	}
	protected MABCL_SpecReg.Spec_Del01 aSpec_Del01;

	protected void initSpec_Del01() {
		this.info = PDef.MA_MABCL0890_Spec_Del01_INFO;
		this.aSpec_Del01 = ((MABCL_SpecReg)this).new Spec_Del01();
	}

	public static MABCL_SpecReg.Spec_Del01 crtSpec_Del01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
		lgc.initSpec_Del01();
		return lgc.aSpec_Del01;
	}

	protected void paramSpec_Del01(MCParam p) {
		if (this.aSpec_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSpec_Del01.up0());
	}

	protected void doSpec_Del01() {
		aSpec_Del01.call();
	};

	/**
	 * Spec_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR createSpec_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.create();
	}

	/**
	 * Spec_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> createSpec_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.class);
	}
	protected MABCL_SpecReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0890_Srch01_INFO;
		this.aSrch01 = ((MABCL_SpecReg)this).new Srch01();
	}

	public static MABCL_SpecReg.Srch01 crtSrch01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0890.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0890.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL0890.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMABC.MABCL0890.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt3R.class);
	}

	/**
	 * Srch01_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Srch01_Rslt4R createSrch01_Rslt4R(){
		return mcframe.serverMABC.MABCL0890.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt4R> createSrch01_Rslt4L(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt4R.class);
	}
	protected MABCL_SpecReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0890_Upd01_INFO;
		this.aUpd01 = ((MABCL_SpecReg)this).new Upd01();
	}

	public static MABCL_SpecReg.Upd01 crtUpd01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
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
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR createUpd01_Dtl3R(){
		return mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> createUpd01_Dtl3L(){
		return MCList.create(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR createUpd01_Dtl4R(){
		return mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> createUpd01_Dtl4L(){
		return MCList.create(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_SpecReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0890_Del01_INFO;
		this.aDel01 = ((MABCL_SpecReg)this).new Del01();
	}

	public static MABCL_SpecReg.Del01 crtDel01() {
		MABCL_SpecReg lgc = new MABCL_SpecReg();
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
	public mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Spec_UpdChk01オペレーション.<p>
	 *
	 * 仕様マスタの登録前のチェックを行います。<br>
	 */
	abstract public class Spec_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Spec_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Spec_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.class);

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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Spec_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR createSpec_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.create();
		}

		/**
		 * Spec_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> createSpec_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}


	}
	/**
	 * Spec_Upd01オペレーション.<p>
	 *
	 * 仕様マスタの登録を行います。<br>
	 */
	abstract public class Spec_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Spec_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Spec_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SPEC_R.create("T1"));
			chkMaster = MCController.create(MAM_SPEC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SPEC_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SPEC_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SPEC_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SPEC_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Spec_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR createSpec_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.create();
		}

		/**
		 * Spec_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> createSpec_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_SPEC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> src_Spec_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Spec_Upd01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_nm", "spec_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SPEC_R r_dest, mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SPEC_R> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_src : src){
				MAM_SPEC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SPEC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> src_Spec_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Spec_Upd01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_SPEC_R r_dest, mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SPEC_R> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_src : src){
				MAM_SPEC_R r_dest = dest.createRow();
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
	 * SpecDesc_UpdChk01オペレーション.<p>
	 *
	 * 仕様項目マスタの登録前のチェックを行います。<br>
	 */
	abstract public class SpecDesc_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SpecDesc_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected SpecDesc_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.class);

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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SpecDesc_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR createSpecDesc_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.create();
		}

		/**
		 * SpecDesc_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> createSpecDesc_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}


	}
	/**
	 * SpecDesc_Upd01オペレーション.<p>
	 *
	 * 仕様項目マスタの登録を行います。<br>
	 */
	abstract public class SpecDesc_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SpecDesc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_DESC_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_DESC_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_DESC_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_DESC_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_DESC_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_DESC_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SpecDesc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SPEC_DESC_R.create("T1"));
			chkMaster = MCController.create(MAM_SPEC_DESC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SPEC_DESC_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SPEC_DESC_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SPEC_DESC_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SPEC_DESC_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SpecDesc_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR createSpecDesc_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.create();
		}

		/**
		 * SpecDesc_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> createSpecDesc_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_SPEC_DESC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> src_SpecDesc_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SpecDesc_Upd01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
				addColumnPathMap("spec_desc_nm", "spec_desc_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SPEC_DESC_R r_dest, mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SPEC_DESC_R> dest, MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_src : src){
				MAM_SPEC_DESC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SPEC_DESC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> src_SpecDesc_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SpecDesc_Upd01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_SPEC_DESC_R r_dest, mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SPEC_DESC_R> dest, MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_src : src){
				MAM_SPEC_DESC_R r_dest = dest.createRow();
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
	 * SpecLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕様名称マスタ(ロケール別情報)の登録前のチェックを行います。<br>
	 */
	abstract public class SpecLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SpecLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SpecLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SPEC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SPEC_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SPEC_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SpecLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR createSpecLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SpecLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> createSpecLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_SPEC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> src_SpecLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_SpecLcl_UpdChk01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SPEC_R r_dest, mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SPEC_R> dest, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src : src){
				MAM_SPEC_R r_dest = dest.createRow();
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
	 * SpecLcl_Upd01オペレーション.<p>
	 *
	 * 仕様マスタ(ロケール別情報)の登録を行います。<br>
	 */
	abstract public class SpecLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SpecLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SpecLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SPEC_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SPEC_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SPEC_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SPEC_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SPEC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SPEC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SpecLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR createSpecLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SpecLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> createSpecLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_SPEC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> src_SpecLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SpecLcl_Upd01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("spec_nm", "spec_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SPEC_LCL_R r_dest, mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SPEC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src : src){
				MAM_SPEC_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SPEC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> src_SpecLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SpecLcl_Upd01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_SPEC_LCL_R r_dest, mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SPEC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src : src){
				MAM_SPEC_LCL_R r_dest = dest.createRow();
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
	 * SpecDescLcl_UpdChk01オペレーション.<p>
	 *
	 * 仕様項目名称マスタ(ロケール別情報)の登録前のチェックを行います。<br>
	 */
	abstract public class SpecDescLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SpecDescLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_DESC_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_DESC_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_DESC_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SpecDescLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_SPEC_DESC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_SPEC_DESC_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_SPEC_DESC_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SpecDescLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR createSpecDescLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SpecDescLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> createSpecDescLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_SPEC_DESC_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> src_SpecDescLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_SpecDescLcl_UpdChk01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_SPEC_DESC_R r_dest, mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_SPEC_DESC_R> dest, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src : src){
				MAM_SPEC_DESC_R r_dest = dest.createRow();
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
	 * SpecDescLcl_Upd01オペレーション.<p>
	 *
	 * 仕様項目名称マスタの登録を行います。<br>
	 */
	abstract public class SpecDescLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SpecDescLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_DESC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_DESC_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_DESC_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_DESC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_DESC_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_DESC_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected SpecDescLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_SPEC_DESC_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_SPEC_DESC_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_SPEC_DESC_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_SPEC_DESC_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SpecDescLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR createSpecDescLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.create();
		}

		/**
		 * SpecDescLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> createSpecDescLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_SPEC_DESC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> src_SpecDescLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_SpecDescLcl_Upd01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("spec_desc_nm", "spec_desc_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_SPEC_DESC_LCL_R r_dest, mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_SPEC_DESC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src : src){
				MAM_SPEC_DESC_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_SPEC_DESC_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> src_SpecDescLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_SpecDescLcl_Upd01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_SPEC_DESC_LCL_R r_dest, mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_SPEC_DESC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src : src){
				MAM_SPEC_DESC_LCL_R r_dest = dest.createRow();
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
	 * Spec_DelChk01オペレーション.<p>
	 *
	 * 仕様マスタ、仕様名称マスタの削除前のチェックを行います。<br>
	 */
	abstract public class Spec_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Spec_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Spec_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.class);

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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Spec_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR createSpec_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.create();
		}

		/**
		 * Spec_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> createSpec_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}


	}
	/**
	 * Spec_Del01オペレーション.<p>
	 *
	 * 仕様マスタ、仕様名称マスタの削除を行います。<br>
	 */
	abstract public class Spec_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Spec_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_LCL_R&gt; （{@link #updMaster2}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt; （{@link #updMaster3}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #updMaster4}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_LCL_R> updMaster2;
		/**
		 * DBC連携 updMaster3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_DESC_R&gt; （{@link #updMaster3_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_DESC_R> updMaster3;
		/**
		 * DBC連携 updMaster4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_DESC_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #updMaster4_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_DESC_LCL_R> updMaster4;
		// 連携ロジック上り
		public final MCList<MAM_SPEC_R> updMaster1_up0;
		public final MCList<MAM_SPEC_LCL_R> updMaster2_up0;
		public final MCList<MAM_SPEC_DESC_R> updMaster3_up0;
		public final MCList<MAM_SPEC_DESC_LCL_R> updMaster4_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Spec_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_SPEC_R.create("T1"));
			updMaster2 = MCController.create(MAM_SPEC_LCL_R.create("T1"));
			updMaster3 = MCController.create(MAM_SPEC_DESC_R.create("T1"));
			updMaster4 = MCController.create(MAM_SPEC_DESC_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_SPEC_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_SPEC_LCL_R>)updMaster2.up(1);
			updMaster3_up0 = (MCList<MAM_SPEC_DESC_R>)updMaster3.up(1);
			updMaster4_up0 = (MCList<MAM_SPEC_DESC_LCL_R>)updMaster4.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
			appendOpe(UPDATE, updMaster3);
			appendOpe(UPDATE, updMaster4);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_SPEC_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_SPEC_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 * up0() => MCList&lt;MAM_SPEC_DESC_R&gt; （{@link #updMaster3_up0}）<br>
		 * up0() => MCList&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #updMaster4_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, updMaster3_up0, updMaster4_up0, up0());
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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Spec_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR createSpec_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.create();
		}

		/**
		 * Spec_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> createSpec_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_SPEC_R> dest0_0, MCList<MAM_SPEC_LCL_R> dest1_0, MCList<MAM_SPEC_DESC_R> dest2_0, MCList<MAM_SPEC_DESC_LCL_R> dest3_0, MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> src_Spec_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_Spec_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_Spec_Del01_Dtl);
			up_UPDATE_updMaster3_0(dest2_0, src_Spec_Del01_Dtl);
			up_UPDATE_updMaster4_0(dest3_0, src_Spec_Del01_Dtl);
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_SPEC_R r_dest, mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_SPEC_R> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src : src){
				MAM_SPEC_R r_dest = dest.createRow();
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
				addColumnPathMap("spec_cd", "spec_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_SPEC_LCL_R r_dest, mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_SPEC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src : src){
				MAM_SPEC_LCL_R r_dest = dest.createRow();
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
				addColumnPathMap("spec_cd", "spec_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster3_0(MAM_SPEC_DESC_R r_dest, mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster3_0(MCList<MAM_SPEC_DESC_R> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster3_0();
			for(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src : src){
				MAM_SPEC_DESC_R r_dest = dest.createRow();
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
				addColumnPathMap("spec_cd", "spec_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster4の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster4_0(MAM_SPEC_DESC_LCL_R r_dest, mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster4の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster4_0(MCList<MAM_SPEC_DESC_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster4_0();
			for(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src : src){
				MAM_SPEC_DESC_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster4_0(r_dest, r_src);
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
	 * 仕様マスタ、仕様項目マスタの検索を行います。<br>
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
		private final mcframe.serverMABC.MABCL0890.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt3R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt4R> down3;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_R&gt;<br>
		 * 第1 上りブロッククラス MAM_SPEC_R （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_SPEC_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_R> c0;
		// 連携ロジック上り
		public final MAM_SPEC_R c0_up0;
		// 連携ロジック下り
		public final MCList<MAM_SPEC_R> c0_down0;
		/**
		 * 連携情報 SELECT_DESC<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_DESC = "SELECT_DESC";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_DESC_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_SPEC_DESC_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_DESC_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_SPEC_DESC_R> c1_down0;
		/**
		 * 連携情報 SELECT_LCL1<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_LCL_R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT_LCL1 = "SELECT_LCL1";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_SPEC_LCL_R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_LCL_R> c2;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_SPEC_LCL_R> c2_down0;
		/**
		 * 連携情報 SELECT_LCL2<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #c3}）<br>
		 */
		public final String SELECT_LCL2 = "SELECT_LCL2";

		/**
		 * DBC連携 c3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPEC_DESC_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_SPEC_DESC_LCL_R&gt; （{@link #c3_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPEC_DESC_LCL_R> c3;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_SPEC_DESC_LCL_R> c3_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0890.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt2R.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt3R.class);
			down3 = MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt4R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_SPEC_R.create("T1"));
			c1 = MCController.create(MAM_SPEC_DESC_R.create("T1"));
			c2 = MCController.create(MAM_SPEC_LCL_R.create("T1"));
			c3 = MCController.create(MAM_SPEC_DESC_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MAM_SPEC_R)c0.up(0);
			c0_down0 = (MCList<MAM_SPEC_R>)c0.down(0);
			c1_down0 = (MCList<MAM_SPEC_DESC_R>)c1.down(0);
			c2_down0 = (MCList<MAM_SPEC_LCL_R>)c2.down(0);
			c3_down0 = (MCList<MAM_SPEC_DESC_LCL_R>)c3.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_DESC, c1);
			appendOpe(SELECT_LCL1, c2);
			appendOpe(SELECT_LCL2, c3);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => MAM_SPEC_R （{@link #c0_up0}）<br>
		 * SELECT_DESC<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL1<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL2<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
			if (key.equals(SELECT_DESC)) {
				up_SELECT_DESC();
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
		 * MCList&lt;MAM_SPEC_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_DESC<br>
		 * MCList&lt;MAM_SPEC_DESC_R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_LCL1<br>
		 * MCList&lt;MAM_SPEC_LCL_R&gt;（{@link #c2_down0}）=> down2()<br>
		 * SELECT_LCL2<br>
		 * MCList&lt;MAM_SPEC_DESC_LCL_R&gt;（{@link #c3_down0}）=> down3()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_DESC)) {
				down_SELECT_DESC(down1(), c1_down0);
			}
			if (key.equals(SELECT_LCL1)) {
				down_SELECT_LCL1(down2(), c2_down0);
			}
			if (key.equals(SELECT_LCL2)) {
				down_SELECT_LCL2(down3(), c3_down0);
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0890.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0890.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL0890.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMABC.MABCL0890.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt3R.class);
		}

		/**
		 * Srch01_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Srch01_Rslt4R createSrch01_Rslt4R(){
			return mcframe.serverMABC.MABCL0890.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt4R> createSrch01_Rslt4L(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Srch01_Rslt4R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_nm</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0890.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0890.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>spec_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>spec_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt3R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt4R> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(MAM_SPEC_R dest0_0, mcframe.serverMABC.MABCL0890.Srch01_CndR src_Srch01_Cnd){
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_nm", "spec_nm");
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
		protected void up_SELECT_c0_0(MAM_SPEC_R dest, mcframe.serverMABC.MABCL0890.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
		}
		//-----------------------SELECT_DESC専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_DESCの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_DESC(){
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
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_SPEC_R> src0_0){
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_nm_lcl", "spec_nm");
				addColumnPathMap("spec_nm", "base_spec_nm");
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
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0890.Srch01_Rslt1R r_dest, MAM_SPEC_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt1R> dest, MCList<MAM_SPEC_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_SPEC_R r_src : src){
				mcframe.serverMABC.MABCL0890.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_DESC専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_DESCの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_DESC(MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_SPEC_DESC_R> src0_0){
			down_SELECT_DESC_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_DESC_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_DESC_c1_0() {
			MCRowMapper map = new Map_down_SELECT_DESC_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_DESC_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_DESC_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
				addColumnPathMap("spec_desc_nm_lcl", "spec_desc_nm");
				addColumnPathMap("spec_desc_nm", "base_spec_desc_nm");
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
		 * 連携処理SELECT_DESC_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_DESC_c1_0(mcframe.serverMABC.MABCL0890.Srch01_Rslt2R r_dest, MAM_SPEC_DESC_R r_src) {
		}

		/**
		 * 連携処理SELECT_DESC_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_DESC_c1_0(MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt2R> dest, MCList<MAM_SPEC_DESC_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_DESC_c1_0();
			for(MAM_SPEC_DESC_R r_src : src){
				mcframe.serverMABC.MABCL0890.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_DESC_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCL1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL1(MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt3R> dest_Srch01_Rslt3, MCList<MAM_SPEC_LCL_R> src0_0){
			down_SELECT_LCL1_c2_0(dest_Srch01_Rslt3, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL1_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL1_c2_0() {
			MCRowMapper map = new Map_down_SELECT_LCL1_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL1_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL1_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("spec_nm", "spec_nm");
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
		 * 連携処理SELECT_LCL1_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL1_c2_0(mcframe.serverMABC.MABCL0890.Srch01_Rslt3R r_dest, MAM_SPEC_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL1_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL1_c2_0(MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt3R> dest, MCList<MAM_SPEC_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL1_c2_0();
			for(MAM_SPEC_LCL_R r_src : src){
				mcframe.serverMABC.MABCL0890.Srch01_Rslt3R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL1_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCL2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL2(MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt4R> dest_Srch01_Rslt4, MCList<MAM_SPEC_DESC_LCL_R> src0_0){
			down_SELECT_LCL2_c3_0(dest_Srch01_Rslt4, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL2_c3の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL2_c3_0() {
			MCRowMapper map = new Map_down_SELECT_LCL2_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL2_c3の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL2_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("spec_desc_nm", "spec_desc_nm");
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
		 * 連携処理SELECT_LCL2_c3の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL2_c3_0(mcframe.serverMABC.MABCL0890.Srch01_Rslt4R r_dest, MAM_SPEC_DESC_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL2_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL2_c3_0(MCList<mcframe.serverMABC.MABCL0890.Srch01_Rslt4R> dest, MCList<MAM_SPEC_DESC_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL2_c3_0();
			for(MAM_SPEC_DESC_LCL_R r_src : src){
				mcframe.serverMABC.MABCL0890.Srch01_Rslt4R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL2_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仕様マスタの登録を行います。（マスタ画面用）<br>
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
		private final MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> up3;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDesc_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDesc_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDesc_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDesc_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDesc_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDesc_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecLcl_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecLcl_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecLcl_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecLcl_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDescLcl_UpdChk01 （{@link #chk04}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDescLcl_Upd01 （{@link #upd04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDescLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDescLcl_UpdChk01 chk04;
		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDescLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.SpecDescLcl_Upd01 upd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> chk04_up0;
		public final MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> upd04_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.class);
			up3 = MCList.create(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpec_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpec_Upd01();
			chk02 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpecDesc_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpecDesc_Upd01();
			chk03 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpecLcl_UpdChk01();
			upd03 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpecLcl_Upd01();
			chk04 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpecDescLcl_UpdChk01();
			upd04 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpecDescLcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR>)upd03.up(0);
			chk04_up0 = (MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR>)chk04.up(0);
			upd04_up0 = (MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR>)upd04.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
			appendOpe(CALL_OPE03, chk03);
			appendOpe(CALL_OPE03, upd03);
			appendOpe(CALL_OPE04, chk04);
			appendOpe(CALL_OPE04, upd04);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 * CALL_OPE04<br>
		 * up3() => MCList&lt;mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
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
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR createUpd01_Dtl3R(){
			return mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> createUpd01_Dtl3L(){
			return MCList.create(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR createUpd01_Dtl4R(){
			return mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> createUpd01_Dtl4L(){
			return MCList.create(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> up3() {
			return up3;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> src_Upd01_Dtl1){
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_nm", "spec_nm");
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
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_nm", "spec_nm");
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
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.Spec_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> src_Upd01_Dtl2){
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
				addColumnPathMap("spec_desc_nm", "spec_desc_nm");
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
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
				addColumnPathMap("spec_desc_nm", "spec_desc_nm");
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
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.SpecDesc_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> src_Upd01_Dtl3){
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("spec_nm", "spec_nm");
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
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("spec_nm", "spec_nm");
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
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.SpecLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> src_Upd01_Dtl4){
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("spec_desc_nm", "spec_desc_nm");
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
		protected void up_CALL_OPE04_chk04_0(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_chk04_0(MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_chk04_0();
			for(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("spec_desc_cd", "spec_desc_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("spec_desc_nm", "spec_desc_nm");
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
		protected void up_CALL_OPE04_upd04_0(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_upd04_0(MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_upd04_0();
			for(mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.SpecDescLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_upd04_0(r_dest, r_src);
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
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 仕様マスタ、仕様項目マスタの削除を行います。<br>
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
		private final MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0890.MABCL_SpecReg.Spec_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpec_DelChk01();
			del01 = mcframe.serverMABC.MABCL0890.MABCL_SpecReg.crtSpec_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABCL_SpecReg)MABCL_SpecReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpecReg)MABCL_SpecReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> src_Del01_Dtl1){
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("spec_cd", "spec_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0890.Spec_DelChk01_DtlR r_dest = dest.createRow();
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