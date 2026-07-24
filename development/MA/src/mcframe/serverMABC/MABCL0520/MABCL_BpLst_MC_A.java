package mcframe.serverMABC.MABCL0520;

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
 * "MABCL_BpLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_BpLst_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0520";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_BpLst.BpLst_UpdChk01 aBpLst_UpdChk01;

	protected void initBpLst_UpdChk01() {
		this.info = PDef.MA_MABCL0520_BpLst_UpdChk01_INFO;
		this.aBpLst_UpdChk01 = ((MABCL_BpLst)this).new BpLst_UpdChk01();
	}

	public static MABCL_BpLst.BpLst_UpdChk01 crtBpLst_UpdChk01() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_UpdChk01();
		return lgc.aBpLst_UpdChk01;
	}

	protected void paramBpLst_UpdChk01(MCParam p) {
		if (this.aBpLst_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_UpdChk01.up0());
	}

	protected void doBpLst_UpdChk01() {
		aBpLst_UpdChk01.call();
	};

	/**
	 * BpLst_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR createBpLst_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.create();
	}

	/**
	 * BpLst_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> createBpLst_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
	}
	protected MABCL_BpLst.BpLst_UpdChk02 aBpLst_UpdChk02;

	protected void initBpLst_UpdChk02() {
		this.info = PDef.MA_MABCL0520_BpLst_UpdChk02_INFO;
		this.aBpLst_UpdChk02 = ((MABCL_BpLst)this).new BpLst_UpdChk02();
	}

	public static MABCL_BpLst.BpLst_UpdChk02 crtBpLst_UpdChk02() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_UpdChk02();
		return lgc.aBpLst_UpdChk02;
	}

	protected void paramBpLst_UpdChk02(MCParam p) {
		if (this.aBpLst_UpdChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_UpdChk02.up0());
	}

	protected void doBpLst_UpdChk02() {
		aBpLst_UpdChk02.call();
	};

	/**
	 * BpLst_UpdChk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR createBpLst_UpdChk02_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.create();
	}

	/**
	 * BpLst_UpdChk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> createBpLst_UpdChk02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.class);
	}
	protected MABCL_BpLst.BpLst_UpdChk03 aBpLst_UpdChk03;

	protected void initBpLst_UpdChk03() {
		this.info = PDef.MA_MABCL0520_BpLst_UpdChk03_INFO;
		this.aBpLst_UpdChk03 = ((MABCL_BpLst)this).new BpLst_UpdChk03();
	}

	public static MABCL_BpLst.BpLst_UpdChk03 crtBpLst_UpdChk03() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_UpdChk03();
		return lgc.aBpLst_UpdChk03;
	}

	protected void paramBpLst_UpdChk03(MCParam p) {
		if (this.aBpLst_UpdChk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_UpdChk03.up0());
	}

	protected void doBpLst_UpdChk03() {
		aBpLst_UpdChk03.call();
	};

	/**
	 * BpLst_UpdChk03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR createBpLst_UpdChk03_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.create();
	}

	/**
	 * BpLst_UpdChk03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> createBpLst_UpdChk03_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.class);
	}
	protected MABCL_BpLst.BpLst_Upd01 aBpLst_Upd01;

	protected void initBpLst_Upd01() {
		this.info = PDef.MA_MABCL0520_BpLst_Upd01_INFO;
		this.aBpLst_Upd01 = ((MABCL_BpLst)this).new BpLst_Upd01();
	}

	public static MABCL_BpLst.BpLst_Upd01 crtBpLst_Upd01() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_Upd01();
		return lgc.aBpLst_Upd01;
	}

	protected void paramBpLst_Upd01(MCParam p) {
		if (this.aBpLst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_Upd01.up0());
	}

	protected void doBpLst_Upd01() {
		aBpLst_Upd01.call();
	};

	/**
	 * BpLst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR createBpLst_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.create();
	}

	/**
	 * BpLst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> createBpLst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
	}
	protected MABCL_BpLst.BpLst_Upd02 aBpLst_Upd02;

	protected void initBpLst_Upd02() {
		this.info = PDef.MA_MABCL0520_BpLst_Upd02_INFO;
		this.aBpLst_Upd02 = ((MABCL_BpLst)this).new BpLst_Upd02();
	}

	public static MABCL_BpLst.BpLst_Upd02 crtBpLst_Upd02() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_Upd02();
		return lgc.aBpLst_Upd02;
	}

	protected void paramBpLst_Upd02(MCParam p) {
		if (this.aBpLst_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_Upd02.up0());
	}

	protected void doBpLst_Upd02() {
		aBpLst_Upd02.call();
	};

	/**
	 * BpLst_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR createBpLst_Upd02_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.create();
	}

	/**
	 * BpLst_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> createBpLst_Upd02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.class);
	}
	protected MABCL_BpLst.BpLst_Upd03 aBpLst_Upd03;

	protected void initBpLst_Upd03() {
		this.info = PDef.MA_MABCL0520_BpLst_Upd03_INFO;
		this.aBpLst_Upd03 = ((MABCL_BpLst)this).new BpLst_Upd03();
	}

	public static MABCL_BpLst.BpLst_Upd03 crtBpLst_Upd03() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_Upd03();
		return lgc.aBpLst_Upd03;
	}

	protected void paramBpLst_Upd03(MCParam p) {
		if (this.aBpLst_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_Upd03.up0());
	}

	protected void doBpLst_Upd03() {
		aBpLst_Upd03.call();
	};

	/**
	 * BpLst_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR createBpLst_Upd03_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.create();
	}

	/**
	 * BpLst_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> createBpLst_Upd03_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.class);
	}
	protected MABCL_BpLst.BpLst_DelChk01 aBpLst_DelChk01;

	protected void initBpLst_DelChk01() {
		this.info = PDef.MA_MABCL0520_BpLst_DelChk01_INFO;
		this.aBpLst_DelChk01 = ((MABCL_BpLst)this).new BpLst_DelChk01();
	}

	public static MABCL_BpLst.BpLst_DelChk01 crtBpLst_DelChk01() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_DelChk01();
		return lgc.aBpLst_DelChk01;
	}

	protected void paramBpLst_DelChk01(MCParam p) {
		if (this.aBpLst_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_DelChk01.up0());
	}

	protected void doBpLst_DelChk01() {
		aBpLst_DelChk01.call();
	};

	/**
	 * BpLst_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createBpLst_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
	}

	/**
	 * BpLst_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createBpLst_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
	}
	protected MABCL_BpLst.BpLst_Del01 aBpLst_Del01;

	protected void initBpLst_Del01() {
		this.info = PDef.MA_MABCL0520_BpLst_Del01_INFO;
		this.aBpLst_Del01 = ((MABCL_BpLst)this).new BpLst_Del01();
	}

	public static MABCL_BpLst.BpLst_Del01 crtBpLst_Del01() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_Del01();
		return lgc.aBpLst_Del01;
	}

	protected void paramBpLst_Del01(MCParam p) {
		if (this.aBpLst_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_Del01.up0());
	}

	protected void doBpLst_Del01() {
		aBpLst_Del01.call();
	};

	/**
	 * BpLst_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createBpLst_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
	}

	/**
	 * BpLst_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createBpLst_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
	}
	protected MABCL_BpLst.BpLst_DelChk02 aBpLst_DelChk02;

	protected void initBpLst_DelChk02() {
		this.info = PDef.MA_MABCL0520_BpLst_DelChk02_INFO;
		this.aBpLst_DelChk02 = ((MABCL_BpLst)this).new BpLst_DelChk02();
	}

	public static MABCL_BpLst.BpLst_DelChk02 crtBpLst_DelChk02() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_DelChk02();
		return lgc.aBpLst_DelChk02;
	}

	protected void paramBpLst_DelChk02(MCParam p) {
		if (this.aBpLst_DelChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_DelChk02.up0());
	}

	protected void doBpLst_DelChk02() {
		aBpLst_DelChk02.call();
	};

	/**
	 * BpLst_DelChk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createBpLst_DelChk02_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
	}

	/**
	 * BpLst_DelChk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createBpLst_DelChk02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
	}
	protected MABCL_BpLst.BpLst_Del02 aBpLst_Del02;

	protected void initBpLst_Del02() {
		this.info = PDef.MA_MABCL0520_BpLst_Del02_INFO;
		this.aBpLst_Del02 = ((MABCL_BpLst)this).new BpLst_Del02();
	}

	public static MABCL_BpLst.BpLst_Del02 crtBpLst_Del02() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpLst_Del02();
		return lgc.aBpLst_Del02;
	}

	protected void paramBpLst_Del02(MCParam p) {
		if (this.aBpLst_Del02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpLst_Del02.up0());
	}

	protected void doBpLst_Del02() {
		aBpLst_Del02.call();
	};

	/**
	 * BpLst_Del02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createBpLst_Del02_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
	}

	/**
	 * BpLst_Del02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createBpLst_Del02_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
	}
	protected MABCL_BpLst.BpCom_UpdChk01 aBpCom_UpdChk01;

	protected void initBpCom_UpdChk01() {
		this.info = PDef.MA_MABCL0520_BpCom_UpdChk01_INFO;
		this.aBpCom_UpdChk01 = ((MABCL_BpLst)this).new BpCom_UpdChk01();
	}

	public static MABCL_BpLst.BpCom_UpdChk01 crtBpCom_UpdChk01() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpCom_UpdChk01();
		return lgc.aBpCom_UpdChk01;
	}

	protected void paramBpCom_UpdChk01(MCParam p) {
		if (this.aBpCom_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpCom_UpdChk01.up0());
	}

	protected void doBpCom_UpdChk01() {
		aBpCom_UpdChk01.call();
	};

	/**
	 * BpCom_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR createBpCom_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.create();
	}

	/**
	 * BpCom_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> createBpCom_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.class);
	}
	protected MABCL_BpLst.BpCom_Upd01 aBpCom_Upd01;

	protected void initBpCom_Upd01() {
		this.info = PDef.MA_MABCL0520_BpCom_Upd01_INFO;
		this.aBpCom_Upd01 = ((MABCL_BpLst)this).new BpCom_Upd01();
	}

	public static MABCL_BpLst.BpCom_Upd01 crtBpCom_Upd01() {
		MABCL_BpLst lgc = new MABCL_BpLst();
		lgc.initBpCom_Upd01();
		return lgc.aBpCom_Upd01;
	}

	protected void paramBpCom_Upd01(MCParam p) {
		if (this.aBpCom_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpCom_Upd01.up0());
	}

	protected void doBpCom_Upd01() {
		aBpCom_Upd01.call();
	};

	/**
	 * BpCom_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR createBpCom_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.create();
	}

	/**
	 * BpCom_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> createBpCom_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.class);
	}
	protected MABCL_BpLst.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0520_Srch01_INFO;
		this.aSrch01 = ((MABCL_BpLst)this).new Srch01();
	}

	public static MABCL_BpLst.Srch01 crtSrch01() {
		MABCL_BpLst lgc = new MABCL_BpLst();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0520.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.class);
	}
	protected MABCL_BpLst.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0520_Upd01_INFO;
		this.aUpd01 = ((MABCL_BpLst)this).new Upd01();
	}

	public static MABCL_BpLst.Upd01 crtUpd01() {
		MABCL_BpLst lgc = new MABCL_BpLst();
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
	public mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0520.Upd01_CndR createUpd01_CndR(){
		return mcframe.serverMABC.MABCL0520.Upd01_CndR.create();
	}
	protected MABCL_BpLst.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0520_Del01_INFO;
		this.aDel01 = ((MABCL_BpLst)this).new Del01();
	}

	public static MABCL_BpLst.Del01 crtDel01() {
		MABCL_BpLst lgc = new MABCL_BpLst();
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
	public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BpLst_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録前のチェックを行います。<br>
	 */
	abstract public class BpLst_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BpLst_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);

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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR createBpLst_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.create();
		}

		/**
		 * BpLst_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> createBpLst_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>all_com_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl1</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl2</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl3</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_on_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr1</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr2</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr4</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_tel</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_dpt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}


	}
	/**
	 * BpLst_UpdChk02オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録前のチェックを行います。(取引先マスタ(全社)のみを対象とする場合に使用)<br>
	 */
	abstract public class BpLst_UpdChk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_UpdChk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> up0;
		
		
		// コンストラクタ
		protected BpLst_UpdChk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.class);

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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_UpdChk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR createBpLst_UpdChk02_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.create();
		}

		/**
		 * BpLst_UpdChk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> createBpLst_UpdChk02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl1</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl2</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl3</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_on_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr1</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr2</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr4</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_tel</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_dpt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}


	}
	/**
	 * BpLst_UpdChk03オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録前のチェックを行います。(取引先マスタ(共通)のみを対象とする場合に使用)<br>
	 */
	abstract public class BpLst_UpdChk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_UpdChk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> up0;
		
		
		// コンストラクタ
		protected BpLst_UpdChk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.class);

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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_UpdChk03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR createBpLst_UpdChk03_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.create();
		}

		/**
		 * BpLst_UpdChk03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> createBpLst_UpdChk03_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}


	}
	/**
	 * BpLst_Upd01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録を行います。<br>
	 */
	abstract public class BpLst_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BpLst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BP_R.create("T1"));
			chkMaster = MCController.create(MAM_BP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR createBpLst_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.create();
		}

		/**
		 * BpLst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> createBpLst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>all_com_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl1</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl2</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl3</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_on_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr1</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr2</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr4</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_tel</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_dpt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src_BpLst_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BpLst_Upd01_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("all_com_flg", "all_com_flg");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("bp_grp_cd1", "bp_grp_cd1");
				addColumnPathMap("bp_grp_cd2", "bp_grp_cd2");
				addColumnPathMap("bp_grp_cd3", "bp_grp_cd3");
				addColumnPathMap("bp_grp_cd4", "bp_grp_cd4");
				addColumnPathMap("bp_grp_cd5", "bp_grp_cd5");
				addColumnPathMap("bp_grp_cd6", "bp_grp_cd6");
				addColumnPathMap("bp_grp_cd7", "bp_grp_cd7");
				addColumnPathMap("bp_grp_cd8", "bp_grp_cd8");
				addColumnPathMap("bp_grp_cd9", "bp_grp_cd9");
				addColumnPathMap("bp_grp_cd10", "bp_grp_cd10");
				addColumnPathMap("bp_alc_grp", "bp_alc_grp");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("tdlv_flg", "tdlv_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_req_flg", "tdlv_req_flg");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("dlv_cal_cd", "dlv_cal_cd");
				addColumnPathMap("dlv_chnnl1", "dlv_chnnl1");
				addColumnPathMap("dlv_chnnl2", "dlv_chnnl2");
				addColumnPathMap("dlv_chnnl3", "dlv_chnnl3");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("ap_cred_cd", "ap_cred_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("psppl_cl_day1", "psppl_cl_day1");
				addColumnPathMap("psppl_cl_day2", "psppl_cl_day2");
				addColumnPathMap("psppl_cl_day3", "psppl_cl_day3");
				addColumnPathMap("psppl_cl_day4", "psppl_cl_day4");
				addColumnPathMap("psppl_cl_day5", "psppl_cl_day5");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("ap_setoff_grp_cd", "ap_setoff_grp_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("tax_on_pay_flg", "tax_on_pay_flg");
				addColumnPathMap("pay_tax_rnd_typ", "pay_tax_rnd_typ");
				addColumnPathMap("pay_schd_ba_typ", "pay_schd_ba_typ");
				addColumnPathMap("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg");
				addColumnPathMap("pay_schd_cl_delay_days", "pay_schd_cl_delay_days");
				addColumnPathMap("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ");
				addColumnPathMap("pay_ntc_prnt_flg", "pay_ntc_prnt_flg");
				addColumnPathMap("pay_ntc_zip_cd", "pay_ntc_zip_cd");
				addColumnPathMap("pay_ntc_addr1", "pay_ntc_addr1");
				addColumnPathMap("pay_ntc_addr2", "pay_ntc_addr2");
				addColumnPathMap("pay_ntc_addr3", "pay_ntc_addr3");
				addColumnPathMap("pay_ntc_addr4", "pay_ntc_addr4");
				addColumnPathMap("pay_ntc_tel", "pay_ntc_tel");
				addColumnPathMap("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm");
				addColumnPathMap("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt");
				addColumnPathMap("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn");
				addColumnPathMap("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title");
				addColumnPathMap("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg");
				addColumnPathMap("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg");
				addColumnPathMap("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg");
				addColumnPathMap("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg");
				addColumnPathMap("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ");
				addColumnPathMap("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ");
				addColumnPathMap("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ");
				addColumnPathMap("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ");
				addColumnPathMap("psppl_rmrks", "psppl_rmrks");
				addColumnPathMap("note_days", "note_days");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src_BpLst_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BpLst_Upd01_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
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
	 * BpLst_Upd02オペレーション.<p>
	 *
	 * 取引先マスタ(全社)の登録を行います。<br>
	 */
	abstract public class BpLst_Upd02 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BpLst_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BP_R.create("T1"));
			chkMaster = MCController.create(MAM_BP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR createBpLst_Upd02_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.create();
		}

		/**
		 * BpLst_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> createBpLst_Upd02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl1</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl2</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl3</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_on_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr1</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr2</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr4</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_tel</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_dpt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> src_BpLst_Upd02_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BpLst_Upd02_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("tdlv_flg", "tdlv_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_req_flg", "tdlv_req_flg");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("dlv_cal_cd", "dlv_cal_cd");
				addColumnPathMap("dlv_chnnl1", "dlv_chnnl1");
				addColumnPathMap("dlv_chnnl2", "dlv_chnnl2");
				addColumnPathMap("dlv_chnnl3", "dlv_chnnl3");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("ap_cred_cd", "ap_cred_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("psppl_cl_day1", "psppl_cl_day1");
				addColumnPathMap("psppl_cl_day2", "psppl_cl_day2");
				addColumnPathMap("psppl_cl_day3", "psppl_cl_day3");
				addColumnPathMap("psppl_cl_day4", "psppl_cl_day4");
				addColumnPathMap("psppl_cl_day5", "psppl_cl_day5");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("ap_setoff_grp_cd", "ap_setoff_grp_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("tax_on_pay_flg", "tax_on_pay_flg");
				addColumnPathMap("pay_tax_rnd_typ", "pay_tax_rnd_typ");
				addColumnPathMap("pay_schd_ba_typ", "pay_schd_ba_typ");
				addColumnPathMap("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg");
				addColumnPathMap("pay_schd_cl_delay_days", "pay_schd_cl_delay_days");
				addColumnPathMap("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ");
				addColumnPathMap("pay_ntc_prnt_flg", "pay_ntc_prnt_flg");
				addColumnPathMap("pay_ntc_zip_cd", "pay_ntc_zip_cd");
				addColumnPathMap("pay_ntc_addr1", "pay_ntc_addr1");
				addColumnPathMap("pay_ntc_addr2", "pay_ntc_addr2");
				addColumnPathMap("pay_ntc_addr3", "pay_ntc_addr3");
				addColumnPathMap("pay_ntc_addr4", "pay_ntc_addr4");
				addColumnPathMap("pay_ntc_tel", "pay_ntc_tel");
				addColumnPathMap("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm");
				addColumnPathMap("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt");
				addColumnPathMap("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn");
				addColumnPathMap("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title");
				addColumnPathMap("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg");
				addColumnPathMap("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg");
				addColumnPathMap("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg");
				addColumnPathMap("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg");
				addColumnPathMap("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ");
				addColumnPathMap("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ");
				addColumnPathMap("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ");
				addColumnPathMap("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ");
				addColumnPathMap("psppl_rmrks", "psppl_rmrks");
				addColumnPathMap("note_days", "note_days");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> src_BpLst_Upd02_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BpLst_Upd02_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
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
	 * BpLst_Upd03オペレーション.<p>
	 *
	 * 取引先マスタ(共通)の登録を行います。<br>
	 */
	abstract public class BpLst_Upd03 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_CMN_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_CMN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_CMN_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_CMN_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_CMN_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_CMN_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_CMN_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_CMN_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_CMN_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_CMN_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BpLst_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BP_CMN_R.create("T1"));
			chkMaster = MCController.create(MAM_BP_CMN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BP_CMN_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BP_CMN_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_CMN_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BP_CMN_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR createBpLst_Upd03_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.create();
		}

		/**
		 * BpLst_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> createBpLst_Upd03_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_CMN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> src_BpLst_Upd03_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BpLst_Upd03_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("all_com_flg", "all_com_flg");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("bp_grp_cd1", "bp_grp_cd1");
				addColumnPathMap("bp_grp_cd2", "bp_grp_cd2");
				addColumnPathMap("bp_grp_cd3", "bp_grp_cd3");
				addColumnPathMap("bp_grp_cd4", "bp_grp_cd4");
				addColumnPathMap("bp_grp_cd5", "bp_grp_cd5");
				addColumnPathMap("bp_grp_cd6", "bp_grp_cd6");
				addColumnPathMap("bp_grp_cd7", "bp_grp_cd7");
				addColumnPathMap("bp_grp_cd8", "bp_grp_cd8");
				addColumnPathMap("bp_grp_cd9", "bp_grp_cd9");
				addColumnPathMap("bp_grp_cd10", "bp_grp_cd10");
				addColumnPathMap("bp_alc_grp", "bp_alc_grp");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BP_CMN_R r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BP_CMN_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR r_src : src){
				MAM_BP_CMN_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BP_CMN_R> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> src_BpLst_Upd03_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BpLst_Upd03_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_BP_CMN_R r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BP_CMN_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR r_src : src){
				MAM_BP_CMN_R r_dest = dest.createRow();
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
	 * BpLst_DelChk01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の削除前のチェックを行います。<br>
	 */
	abstract public class BpLst_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BpLst_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);

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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createBpLst_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
		}

		/**
		 * BpLst_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createBpLst_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}


	}
	/**
	 * BpLst_Del01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の削除を行います。<br>
	 */
	abstract public class BpLst_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BP_LCL_R&gt; （{@link #updMaster2}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_BP_SUB_R&gt; （{@link #updMaster3}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_LCL_R> updMaster2;
		/**
		 * DBC連携 updMaster3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_SUB_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster3_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_SUB_R> updMaster3;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> updMaster1_up0;
		public final MCList<MAM_BP_LCL_R> updMaster2_up0;
		public final MCList<MAM_BP_SUB_R> updMaster3_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BpLst_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_BP_R.create("T1"));
			updMaster2 = MCController.create(MAM_BP_LCL_R.create("T1"));
			updMaster3 = MCController.create(MAM_BP_SUB_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_BP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_BP_LCL_R>)updMaster2.up(1);
			updMaster3_up0 = (MCList<MAM_BP_SUB_R>)updMaster3.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
			appendOpe(UPDATE, updMaster3);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_BP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 * up0() => MCList&lt;MAM_BP_SUB_R&gt; （{@link #updMaster3_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, updMaster3_up0, up0());
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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createBpLst_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
		}

		/**
		 * BpLst_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createBpLst_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_R> dest0_0, MCList<MAM_BP_LCL_R> dest1_0, MCList<MAM_BP_SUB_R> dest2_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src_BpLst_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_BpLst_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_BpLst_Del01_Dtl);
			up_UPDATE_updMaster3_0(dest2_0, src_BpLst_Del01_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
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
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_BP_LCL_R r_dest, mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_BP_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src : src){
				MAM_BP_LCL_R r_dest = dest.createRow();
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
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster3_0(MAM_BP_SUB_R r_dest, mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster3の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster3_0(MCList<MAM_BP_SUB_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster3_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src : src){
				MAM_BP_SUB_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster3_0(r_dest, r_src);
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
	 * BpLst_DelChk02オペレーション.<p>
	 *
	 * 取引先マスタ一覧の削除前のチェックを行います。<br>
	 */
	abstract public class BpLst_DelChk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_DelChk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BpLst_DelChk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);

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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_DelChk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createBpLst_DelChk02_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
		}

		/**
		 * BpLst_DelChk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createBpLst_DelChk02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}


	}
	/**
	 * BpLst_Del02オペレーション.<p>
	 *
	 * 取引先マスタ(共通、全社)を削除します。<br>
	 */
	abstract public class BpLst_Del02 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpLst_Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BpLst_Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);

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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpLst_Del02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createBpLst_Del02_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
		}

		/**
		 * BpLst_Del02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createBpLst_Del02_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}


	}
	/**
	 * BpCom_UpdChk01オペレーション.<p>
	 *
	 * 取引先会社マスタの登録前のチェックを行います。<br>
	 */
	abstract public class BpCom_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpCom_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BpCom_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.class);

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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpCom_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR createBpCom_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.create();
		}

		/**
		 * BpCom_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> createBpCom_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ex_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}


	}
	/**
	 * BpCom_Upd01オペレーション.<p>
	 *
	 * 取引先会社マスタの登録を行います。<br>
	 */
	abstract public class BpCom_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpCom_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_COM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_COM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_COM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_COM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_COM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_COM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_COM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_COM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_COM_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected BpCom_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BP_COM_R.create("T1"));
			chkMaster = MCController.create(MAM_BP_COM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BP_COM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BP_COM_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_COM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BP_COM_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpCom_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR createBpCom_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.create();
		}

		/**
		 * BpCom_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> createBpCom_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ex_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_COM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> src_BpCom_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BpCom_Upd01_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("ex_flg", "ex_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BP_COM_R r_dest, mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BP_COM_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR r_src : src){
				MAM_BP_COM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BP_COM_R> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> src_BpCom_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BpCom_Upd01_Dtl);
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
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_BP_COM_R r_dest, mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BP_COM_R> dest, MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR r_src : src){
				MAM_BP_COM_R r_dest = dest.createRow();
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
	 * Srch01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の検索を行います。<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL0520.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAVM_BP_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAVM_BP_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAVM_BP_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAVM_BP_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAVM_BP_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0520.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAVM_BP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAVM_BP_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAVM_BP_R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
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
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0520.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0520.Srch01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>foreign_flg</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>own_co_flg_off</td></tr>
		 * 	<tr><td><br></td><td>own_co_flg_on</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0520.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0520.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>all_com_flg</td></tr>
		 * 	<tr><td><br></td><td>com_use_flg</td></tr>
		 * 	<tr><td><br></td><td>com_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>area_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bp_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm3</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl1</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl2</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl3</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>po_print_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_nm</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_on_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr1</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr2</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr4</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_tel</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_dpt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>ins_ts_c</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id_c</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_ts_c</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id_c</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm_c</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no_c</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id_c</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm_c</td></tr>
		 * 	<tr><td><br></td><td>del_ts_c</td></tr>
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
		 * 	<tr><td><br></td><td>bp_com_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAVM_BP_R> src0_0){
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm_lcl", "bp_nm");
				addColumnPathMap("bp_nm", "base_bp_nm");
				addColumnPathMap("all_com_flg", "all_com_flg");
				addColumnPathMap("bp_alt_nm1", "base_bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "base_bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "base_bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "base_bp_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("cntry_nm", "cntry_nm");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("area_nm", "area_nm");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("bp_grp_cd1", "bp_grp_cd1");
				addColumnPathMap("bp_grp_nm1", "bp_grp_nm1");
				addColumnPathMap("bp_grp_cd2", "bp_grp_cd2");
				addColumnPathMap("bp_grp_nm2", "bp_grp_nm2");
				addColumnPathMap("bp_grp_cd3", "bp_grp_cd3");
				addColumnPathMap("bp_grp_nm3", "bp_grp_nm3");
				addColumnPathMap("bp_grp_cd4", "bp_grp_cd4");
				addColumnPathMap("bp_grp_nm4", "bp_grp_nm4");
				addColumnPathMap("bp_grp_cd5", "bp_grp_cd5");
				addColumnPathMap("bp_grp_nm5", "bp_grp_nm5");
				addColumnPathMap("bp_grp_cd6", "bp_grp_cd6");
				addColumnPathMap("bp_grp_nm6", "bp_grp_nm6");
				addColumnPathMap("bp_grp_cd7", "bp_grp_cd7");
				addColumnPathMap("bp_grp_nm7", "bp_grp_nm7");
				addColumnPathMap("bp_grp_cd8", "bp_grp_cd8");
				addColumnPathMap("bp_grp_nm8", "bp_grp_nm8");
				addColumnPathMap("bp_grp_cd9", "bp_grp_cd9");
				addColumnPathMap("bp_grp_nm9", "bp_grp_nm9");
				addColumnPathMap("bp_grp_cd10", "bp_grp_cd10");
				addColumnPathMap("bp_grp_nm10", "bp_grp_nm10");
				addColumnPathMap("bp_alc_grp", "bp_alc_grp");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("acst_nm", "acst_nm");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("cst_ship_form_nm", "cst_ship_form_nm");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("stk_lst_form_nm", "stk_lst_form_nm");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_nm1", "cst_tterm_nm1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_nm2", "cst_tterm_nm2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("cst_tterm_nm3", "cst_tterm_nm3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_nm1", "sls_anly_nm1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_nm2", "sls_anly_nm2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("sls_anly_nm3", "sls_anly_nm3");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("bcst_nm", "bcst_nm");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("rcst_nm", "rcst_nm");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("ar_cred_nm", "ar_cred_nm");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bcst_dpt_nm", "bcst_dpt_nm");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("bill_cal_nm", "bill_cal_nm");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("ar_setoff_grp_nm", "ar_setoff_grp_nm");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("tdlv_flg", "tdlv_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_req_flg", "tdlv_req_flg");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("dlv_cal_cd", "dlv_cal_cd");
				addColumnPathMap("dlv_cal_nm", "dlv_cal_nm");
				addColumnPathMap("dlv_chnnl1", "dlv_chnnl1");
				addColumnPathMap("dlv_chnnl2", "dlv_chnnl2");
				addColumnPathMap("dlv_chnnl3", "dlv_chnnl3");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("asppl_nm", "asppl_nm");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("vmi_purc_dpt_nm", "vmi_purc_dpt_nm");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("po_print_nm", "po_print_nm");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("sppl_ship_form_nm", "sppl_ship_form_nm");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_cal_nm", "sppl_cal_nm");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_nm1", "sppl_tterm_nm1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_nm2", "sppl_tterm_nm2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("sppl_tterm_nm3", "sppl_tterm_nm3");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("purc_basis_typ_nm", "purc_basis_typ_nm");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("bsppl_nm", "bsppl_nm");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("psppl_nm", "psppl_nm");
				addColumnPathMap("ap_cred_cd", "ap_cred_cd");
				addColumnPathMap("ap_cred_nm", "ap_cred_nm");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("bsppl_dpt_nm", "bsppl_dpt_nm");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("psppl_cl_day1", "psppl_cl_day1");
				addColumnPathMap("psppl_cl_day2", "psppl_cl_day2");
				addColumnPathMap("psppl_cl_day3", "psppl_cl_day3");
				addColumnPathMap("psppl_cl_day4", "psppl_cl_day4");
				addColumnPathMap("psppl_cl_day5", "psppl_cl_day5");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("ap_setoff_grp_cd", "ap_setoff_grp_cd");
				addColumnPathMap("ap_setoff_grp_nm", "ap_setoff_grp_nm");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("pay_bank_ac_nm", "pay_bank_ac_nm");
				addColumnPathMap("tax_on_pay_flg", "tax_on_pay_flg");
				addColumnPathMap("pay_tax_rnd_typ", "pay_tax_rnd_typ");
				addColumnPathMap("pay_schd_ba_typ", "pay_schd_ba_typ");
				addColumnPathMap("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg");
				addColumnPathMap("pay_schd_cl_delay_days", "pay_schd_cl_delay_days");
				addColumnPathMap("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ");
				addColumnPathMap("pay_ntc_prnt_flg", "pay_ntc_prnt_flg");
				addColumnPathMap("pay_ntc_zip_cd", "pay_ntc_zip_cd");
				addColumnPathMap("pay_ntc_addr1", "pay_ntc_addr1");
				addColumnPathMap("pay_ntc_addr2", "pay_ntc_addr2");
				addColumnPathMap("pay_ntc_addr3", "pay_ntc_addr3");
				addColumnPathMap("pay_ntc_addr4", "pay_ntc_addr4");
				addColumnPathMap("pay_ntc_tel", "pay_ntc_tel");
				addColumnPathMap("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm");
				addColumnPathMap("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt");
				addColumnPathMap("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn");
				addColumnPathMap("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title");
				addColumnPathMap("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg");
				addColumnPathMap("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg");
				addColumnPathMap("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg");
				addColumnPathMap("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg");
				addColumnPathMap("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ");
				addColumnPathMap("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ");
				addColumnPathMap("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ");
				addColumnPathMap("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ");
				addColumnPathMap("psppl_rmrks", "psppl_rmrks");
				addColumnPathMap("note_days", "note_days");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("pay_dpt_nm", "pay_dpt_nm");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("ins_usr_id_c", "ins_usr_id_c");
				addColumnPathMap("ins_usr_nm_c", "ins_usr_nm_c");
				addColumnPathMap("ins_ts_c", "ins_ts_c");
				addColumnPathMap("ins_func_id_c", "ins_func_id_c");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("upd_usr_id_c", "upd_usr_id_c");
				addColumnPathMap("upd_usr_nm_c", "upd_usr_nm_c");
				addColumnPathMap("upd_ts_c", "upd_ts_c");
				addColumnPathMap("upd_func_id_c", "upd_func_id_c");
				addColumnPathMap("upd_srv_req_no_c", "upd_srv_req_no_c");
				addColumnPathMap("del_usr_id_c", "del_usr_id_c");
				addColumnPathMap("del_usr_nm_c", "del_usr_nm_c");
				addColumnPathMap("del_ts_c", "del_ts_c");
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
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0520.Srch01_Rslt1R r_dest, MAVM_BP_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0520.Srch01_Rslt1R> dest, MCList<MAVM_BP_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAVM_BP_R r_src : src){
				mcframe.serverMABC.MABCL0520.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取引先マスタ一覧の登録を行います。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
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
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0520.Upd01_CndR up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpCom_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpCom_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpCom_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpCom_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpCom_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpCom_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_UpdChk03 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd03 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_UpdChk03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_UpdChk03 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd03 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> upd03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_UpdChk02 （{@link #chk04}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd02 （{@link #upd04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_UpdChk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR&gt; （{@link #chk04_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_UpdChk02 chk04;
		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Upd02 upd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> chk04_up0;
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> upd04_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
			up1 = mcframe.serverMABC.MABCL0520.Upd01_CndR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_Upd01();
			chk02 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpCom_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpCom_Upd01();
			chk03 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_UpdChk03();
			upd03 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_Upd03();
			chk04 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_UpdChk02();
			upd04 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_Upd02();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR>)upd03.up(0);
			chk04_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR>)chk04.up(0);
			upd04_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR>)upd04.up(0);

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
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR&gt; （{@link #upd03_up0}）<br>
		 * CALL_OPE04<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR&gt; （{@link #chk04_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up0());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(chk03_up0, upd03_up0, up0());
			}
			if (key.equals(CALL_OPE04)) {
				up_CALL_OPE04(chk04_up0, upd04_up0, up0());
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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.Upd01_CndR createUpd01_CndR(){
			return mcframe.serverMABC.MABCL0520.Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>all_com_flg</td></tr>
		 * 	<tr><td><br></td><td>com_use_flg</td></tr>
		 * 	<tr><td><br></td><td>com_ex_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>zip_cd</td></tr>
		 * 	<tr><td><br></td><td>addr1</td></tr>
		 * 	<tr><td><br></td><td>addr2</td></tr>
		 * 	<tr><td><br></td><td>addr3</td></tr>
		 * 	<tr><td><br></td><td>addr4</td></tr>
		 * 	<tr><td><br></td><td>tel</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>ein</td></tr>
		 * 	<tr><td><br></td><td>std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>area_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_alc_grp</td></tr>
		 * 	<tr><td><br></td><td>cst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>rcst_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>tax_on_bill_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_addr1</td></tr>
		 * 	<tr><td><br></td><td>bill_addr2</td></tr>
		 * 	<tr><td><br></td><td>bill_addr3</td></tr>
		 * 	<tr><td><br></td><td>bill_addr4</td></tr>
		 * 	<tr><td><br></td><td>bill_tel</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_dpt</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn</td></tr>
		 * 	<tr><td><br></td><td>bill_bcst_psn_title</td></tr>
		 * 	<tr><td><br></td><td>bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_outp_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_line_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt_match_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ_match_flg</td></tr>
		 * 	<tr><td><br></td><td>calc_com_paid_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>tdlv_req_flg</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl1</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl2</td></tr>
		 * 	<tr><td><br></td><td>dlv_chnnl3</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day1</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day2</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day3</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day4</td></tr>
		 * 	<tr><td><br></td><td>psppl_cl_day5</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_on_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr1</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr2</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr3</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_addr4</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_tel</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_dpt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bsppl_psn_title</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_outp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_bfw_bal_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_subttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_brk_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_dtl_sort_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_can_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>rcst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>psppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>bp_com_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>memo4</td></tr>
		 * 	<tr><td><br></td><td>memo5</td></tr>
		 * 	<tr><td><br></td><td>memo6</td></tr>
		 * 	<tr><td><br></td><td>memo7</td></tr>
		 * 	<tr><td><br></td><td>memo8</td></tr>
		 * 	<tr><td><br></td><td>memo9</td></tr>
		 * 	<tr><td><br></td><td>memo10</td></tr>
		 * 	<tr><td><br></td><td>memo11</td></tr>
		 * 	<tr><td><br></td><td>memo12</td></tr>
		 * 	<tr><td><br></td><td>memo13</td></tr>
		 * 	<tr><td><br></td><td>memo14</td></tr>
		 * 	<tr><td><br></td><td>memo15</td></tr>
		 * 	<tr><td><br></td><td>memo16</td></tr>
		 * 	<tr><td><br></td><td>memo17</td></tr>
		 * 	<tr><td><br></td><td>memo18</td></tr>
		 * 	<tr><td><br></td><td>memo19</td></tr>
		 * 	<tr><td><br></td><td>memo20</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_only_com_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0520.Upd01_CndR
		 */
		public mcframe.serverMABC.MABCL0520.Upd01_CndR up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src_Upd01_Dtl1){
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("all_com_flg", "all_com_flg");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("bp_grp_cd1", "bp_grp_cd1");
				addColumnPathMap("bp_grp_cd2", "bp_grp_cd2");
				addColumnPathMap("bp_grp_cd3", "bp_grp_cd3");
				addColumnPathMap("bp_grp_cd4", "bp_grp_cd4");
				addColumnPathMap("bp_grp_cd5", "bp_grp_cd5");
				addColumnPathMap("bp_grp_cd6", "bp_grp_cd6");
				addColumnPathMap("bp_grp_cd7", "bp_grp_cd7");
				addColumnPathMap("bp_grp_cd8", "bp_grp_cd8");
				addColumnPathMap("bp_grp_cd9", "bp_grp_cd9");
				addColumnPathMap("bp_grp_cd10", "bp_grp_cd10");
				addColumnPathMap("bp_alc_grp", "bp_alc_grp");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("check_ar_dpt_cd", "check_ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("check_bcst_dpt_cd", "check_bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("tdlv_flg", "tdlv_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_req_flg", "tdlv_req_flg");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("dlv_cal_cd", "dlv_cal_cd");
				addColumnPathMap("dlv_chnnl1", "dlv_chnnl1");
				addColumnPathMap("dlv_chnnl2", "dlv_chnnl2");
				addColumnPathMap("dlv_chnnl3", "dlv_chnnl3");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("check_vmi_purc_dpt_cd", "check_vmi_purc_dpt_cd");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("check_ap_dpt_cd", "check_ap_dpt_cd");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("ap_cred_cd", "ap_cred_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("check_bsppl_dpt_cd", "check_bsppl_dpt_cd");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("psppl_cl_day1", "psppl_cl_day1");
				addColumnPathMap("psppl_cl_day2", "psppl_cl_day2");
				addColumnPathMap("psppl_cl_day3", "psppl_cl_day3");
				addColumnPathMap("psppl_cl_day4", "psppl_cl_day4");
				addColumnPathMap("psppl_cl_day5", "psppl_cl_day5");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("ap_setoff_grp_cd", "ap_setoff_grp_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("tax_on_pay_flg", "tax_on_pay_flg");
				addColumnPathMap("pay_tax_rnd_typ", "pay_tax_rnd_typ");
				addColumnPathMap("pay_schd_ba_typ", "pay_schd_ba_typ");
				addColumnPathMap("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg");
				addColumnPathMap("pay_schd_cl_delay_days", "pay_schd_cl_delay_days");
				addColumnPathMap("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ");
				addColumnPathMap("pay_ntc_prnt_flg", "pay_ntc_prnt_flg");
				addColumnPathMap("pay_ntc_zip_cd", "pay_ntc_zip_cd");
				addColumnPathMap("pay_ntc_addr1", "pay_ntc_addr1");
				addColumnPathMap("pay_ntc_addr2", "pay_ntc_addr2");
				addColumnPathMap("pay_ntc_addr3", "pay_ntc_addr3");
				addColumnPathMap("pay_ntc_addr4", "pay_ntc_addr4");
				addColumnPathMap("pay_ntc_tel", "pay_ntc_tel");
				addColumnPathMap("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm");
				addColumnPathMap("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt");
				addColumnPathMap("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn");
				addColumnPathMap("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title");
				addColumnPathMap("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg");
				addColumnPathMap("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg");
				addColumnPathMap("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg");
				addColumnPathMap("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg");
				addColumnPathMap("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ");
				addColumnPathMap("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ");
				addColumnPathMap("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ");
				addColumnPathMap("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ");
				addColumnPathMap("psppl_rmrks", "psppl_rmrks");
				addColumnPathMap("note_days", "note_days");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("check_pay_dpt_cd", "check_pay_dpt_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("all_com_flg", "all_com_flg");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("bp_grp_cd1", "bp_grp_cd1");
				addColumnPathMap("bp_grp_cd2", "bp_grp_cd2");
				addColumnPathMap("bp_grp_cd3", "bp_grp_cd3");
				addColumnPathMap("bp_grp_cd4", "bp_grp_cd4");
				addColumnPathMap("bp_grp_cd5", "bp_grp_cd5");
				addColumnPathMap("bp_grp_cd6", "bp_grp_cd6");
				addColumnPathMap("bp_grp_cd7", "bp_grp_cd7");
				addColumnPathMap("bp_grp_cd8", "bp_grp_cd8");
				addColumnPathMap("bp_grp_cd9", "bp_grp_cd9");
				addColumnPathMap("bp_grp_cd10", "bp_grp_cd10");
				addColumnPathMap("bp_alc_grp", "bp_alc_grp");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("tdlv_flg", "tdlv_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_req_flg", "tdlv_req_flg");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("dlv_cal_cd", "dlv_cal_cd");
				addColumnPathMap("dlv_chnnl1", "dlv_chnnl1");
				addColumnPathMap("dlv_chnnl2", "dlv_chnnl2");
				addColumnPathMap("dlv_chnnl3", "dlv_chnnl3");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("ap_cred_cd", "ap_cred_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("psppl_cl_day1", "psppl_cl_day1");
				addColumnPathMap("psppl_cl_day2", "psppl_cl_day2");
				addColumnPathMap("psppl_cl_day3", "psppl_cl_day3");
				addColumnPathMap("psppl_cl_day4", "psppl_cl_day4");
				addColumnPathMap("psppl_cl_day5", "psppl_cl_day5");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("ap_setoff_grp_cd", "ap_setoff_grp_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("tax_on_pay_flg", "tax_on_pay_flg");
				addColumnPathMap("pay_tax_rnd_typ", "pay_tax_rnd_typ");
				addColumnPathMap("pay_schd_ba_typ", "pay_schd_ba_typ");
				addColumnPathMap("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg");
				addColumnPathMap("pay_schd_cl_delay_days", "pay_schd_cl_delay_days");
				addColumnPathMap("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ");
				addColumnPathMap("pay_ntc_prnt_flg", "pay_ntc_prnt_flg");
				addColumnPathMap("pay_ntc_zip_cd", "pay_ntc_zip_cd");
				addColumnPathMap("pay_ntc_addr1", "pay_ntc_addr1");
				addColumnPathMap("pay_ntc_addr2", "pay_ntc_addr2");
				addColumnPathMap("pay_ntc_addr3", "pay_ntc_addr3");
				addColumnPathMap("pay_ntc_addr4", "pay_ntc_addr4");
				addColumnPathMap("pay_ntc_tel", "pay_ntc_tel");
				addColumnPathMap("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm");
				addColumnPathMap("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt");
				addColumnPathMap("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn");
				addColumnPathMap("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title");
				addColumnPathMap("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg");
				addColumnPathMap("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg");
				addColumnPathMap("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg");
				addColumnPathMap("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg");
				addColumnPathMap("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ");
				addColumnPathMap("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ");
				addColumnPathMap("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ");
				addColumnPathMap("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ");
				addColumnPathMap("psppl_rmrks", "psppl_rmrks");
				addColumnPathMap("note_days", "note_days");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl1);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("ex_flg", "ex_flg");
				addColumnPathMap("upd_cntr", "bp_com_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("ex_flg", "ex_flg");
				addColumnPathMap("upd_cntr", "bp_com_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpCom_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE03_chk03_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE03_upd03_0(dest1_0, src_Upd01_Dtl1);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("bp_grp_cd1", "bp_grp_cd1");
				addColumnPathMap("bp_grp_cd2", "bp_grp_cd2");
				addColumnPathMap("bp_grp_cd3", "bp_grp_cd3");
				addColumnPathMap("bp_grp_cd4", "bp_grp_cd4");
				addColumnPathMap("bp_grp_cd5", "bp_grp_cd5");
				addColumnPathMap("bp_grp_cd6", "bp_grp_cd6");
				addColumnPathMap("bp_grp_cd7", "bp_grp_cd7");
				addColumnPathMap("bp_grp_cd8", "bp_grp_cd8");
				addColumnPathMap("bp_grp_cd9", "bp_grp_cd9");
				addColumnPathMap("bp_grp_cd10", "bp_grp_cd10");
				addColumnPathMap("bp_alc_grp", "bp_alc_grp");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr_c");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("bp_nm", "bp_nm");
				addColumnPathMap("bp_alt_nm1", "bp_alt_nm1");
				addColumnPathMap("bp_alt_nm2", "bp_alt_nm2");
				addColumnPathMap("bp_alt_nm3", "bp_alt_nm3");
				addColumnPathMap("bp_alt_nm4", "bp_alt_nm4");
				addColumnPathMap("zip_cd", "zip_cd");
				addColumnPathMap("addr1", "addr1");
				addColumnPathMap("addr2", "addr2");
				addColumnPathMap("addr3", "addr3");
				addColumnPathMap("addr4", "addr4");
				addColumnPathMap("tel", "tel");
				addColumnPathMap("fax", "fax");
				addColumnPathMap("biz_co_no", "biz_co_no");
				addColumnPathMap("ein", "ein");
				addColumnPathMap("std_co_cd", "std_co_cd");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("area_cd", "area_cd");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("prnt_lcl_cd", "prnt_lcl_cd");
				addColumnPathMap("bp_grp_cd1", "bp_grp_cd1");
				addColumnPathMap("bp_grp_cd2", "bp_grp_cd2");
				addColumnPathMap("bp_grp_cd3", "bp_grp_cd3");
				addColumnPathMap("bp_grp_cd4", "bp_grp_cd4");
				addColumnPathMap("bp_grp_cd5", "bp_grp_cd5");
				addColumnPathMap("bp_grp_cd6", "bp_grp_cd6");
				addColumnPathMap("bp_grp_cd7", "bp_grp_cd7");
				addColumnPathMap("bp_grp_cd8", "bp_grp_cd8");
				addColumnPathMap("bp_grp_cd9", "bp_grp_cd9");
				addColumnPathMap("bp_grp_cd10", "bp_grp_cd10");
				addColumnPathMap("bp_alc_grp", "bp_alc_grp");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr_c");
				addColumnPathMap("memo4", "memo4");
				addColumnPathMap("memo5", "memo5");
				addColumnPathMap("memo6", "memo6");
				addColumnPathMap("memo7", "memo7");
				addColumnPathMap("memo8", "memo8");
				addColumnPathMap("memo9", "memo9");
				addColumnPathMap("memo10", "memo10");
				addColumnPathMap("memo11", "memo11");
				addColumnPathMap("memo12", "memo12");
				addColumnPathMap("memo13", "memo13");
				addColumnPathMap("memo14", "memo14");
				addColumnPathMap("memo15", "memo15");
				addColumnPathMap("memo16", "memo16");
				addColumnPathMap("memo17", "memo17");
				addColumnPathMap("memo18", "memo18");
				addColumnPathMap("memo19", "memo19");
				addColumnPathMap("memo20", "memo20");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_UpdChk03_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE04_chk04_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE04_upd04_0(dest1_0, src_Upd01_Dtl1);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("tdlv_flg", "tdlv_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_req_flg", "tdlv_req_flg");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("dlv_cal_cd", "dlv_cal_cd");
				addColumnPathMap("dlv_chnnl1", "dlv_chnnl1");
				addColumnPathMap("dlv_chnnl2", "dlv_chnnl2");
				addColumnPathMap("dlv_chnnl3", "dlv_chnnl3");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("ap_cred_cd", "ap_cred_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("psppl_cl_day1", "psppl_cl_day1");
				addColumnPathMap("psppl_cl_day2", "psppl_cl_day2");
				addColumnPathMap("psppl_cl_day3", "psppl_cl_day3");
				addColumnPathMap("psppl_cl_day4", "psppl_cl_day4");
				addColumnPathMap("psppl_cl_day5", "psppl_cl_day5");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("ap_setoff_grp_cd", "ap_setoff_grp_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("tax_on_pay_flg", "tax_on_pay_flg");
				addColumnPathMap("pay_tax_rnd_typ", "pay_tax_rnd_typ");
				addColumnPathMap("pay_schd_ba_typ", "pay_schd_ba_typ");
				addColumnPathMap("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg");
				addColumnPathMap("pay_schd_cl_delay_days", "pay_schd_cl_delay_days");
				addColumnPathMap("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ");
				addColumnPathMap("pay_ntc_prnt_flg", "pay_ntc_prnt_flg");
				addColumnPathMap("pay_ntc_zip_cd", "pay_ntc_zip_cd");
				addColumnPathMap("pay_ntc_addr1", "pay_ntc_addr1");
				addColumnPathMap("pay_ntc_addr2", "pay_ntc_addr2");
				addColumnPathMap("pay_ntc_addr3", "pay_ntc_addr3");
				addColumnPathMap("pay_ntc_addr4", "pay_ntc_addr4");
				addColumnPathMap("pay_ntc_tel", "pay_ntc_tel");
				addColumnPathMap("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm");
				addColumnPathMap("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt");
				addColumnPathMap("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn");
				addColumnPathMap("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title");
				addColumnPathMap("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg");
				addColumnPathMap("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg");
				addColumnPathMap("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg");
				addColumnPathMap("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg");
				addColumnPathMap("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ");
				addColumnPathMap("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ");
				addColumnPathMap("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ");
				addColumnPathMap("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ");
				addColumnPathMap("psppl_rmrks", "psppl_rmrks");
				addColumnPathMap("note_days", "note_days");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_chk04_0(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_chk04_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_chk04_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("cst_flg", "cst_flg");
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("rcst_flg", "rcst_flg");
				addColumnPathMap("dlv_flg", "dlv_flg");
				addColumnPathMap("dest_flg", "dest_flg");
				addColumnPathMap("cred_flg", "cred_flg");
				addColumnPathMap("sppl_flg", "sppl_flg");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("psppl_flg", "psppl_flg");
				addColumnPathMap("maker_flg", "maker_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("ar_cred_cd", "ar_cred_cd");
				addColumnPathMap("bill_dpt_typ", "bill_dpt_typ");
				addColumnPathMap("bcst_dpt_cd", "bcst_dpt_cd");
				addColumnPathMap("bill_cl_typ", "bill_cl_typ");
				addColumnPathMap("bill_cl_day1", "bill_cl_day1");
				addColumnPathMap("bill_cl_day2", "bill_cl_day2");
				addColumnPathMap("bill_cl_day3", "bill_cl_day3");
				addColumnPathMap("bill_cl_day4", "bill_cl_day4");
				addColumnPathMap("bill_cl_day5", "bill_cl_day5");
				addColumnPathMap("tax_on_bill_flg", "tax_on_bill_flg");
				addColumnPathMap("bill_tax_rnd_typ", "bill_tax_rnd_typ");
				addColumnPathMap("bill_cl_delay_days", "bill_cl_delay_days");
				addColumnPathMap("bill_cl_ba_typ", "bill_cl_ba_typ");
				addColumnPathMap("sls_interim_cl_flg", "sls_interim_cl_flg");
				addColumnPathMap("bill_cal_cd", "bill_cal_cd");
				addColumnPathMap("rcv_ba_typ", "rcv_ba_typ");
				addColumnPathMap("bill_zip_cd", "bill_zip_cd");
				addColumnPathMap("bill_addr1", "bill_addr1");
				addColumnPathMap("bill_addr2", "bill_addr2");
				addColumnPathMap("bill_addr3", "bill_addr3");
				addColumnPathMap("bill_addr4", "bill_addr4");
				addColumnPathMap("bill_tel", "bill_tel");
				addColumnPathMap("bill_bcst_nm", "bill_bcst_nm");
				addColumnPathMap("bill_bcst_dpt", "bill_bcst_dpt");
				addColumnPathMap("bill_bcst_psn", "bill_bcst_psn");
				addColumnPathMap("bill_bcst_psn_title", "bill_bcst_psn_title");
				addColumnPathMap("bfw_bal_disp_flg", "bfw_bal_disp_flg");
				addColumnPathMap("sls_dtl_outp_typ", "sls_dtl_outp_typ");
				addColumnPathMap("bill_prnt_typ", "bill_prnt_typ");
				addColumnPathMap("bill_dtl_outp_flg", "bill_dtl_outp_flg");
				addColumnPathMap("bill_dtl_adv_flg", "bill_dtl_adv_flg");
				addColumnPathMap("bill_dtl_rcv_flg", "bill_dtl_rcv_flg");
				addColumnPathMap("bill_dtl_subttl_typ", "bill_dtl_subttl_typ");
				addColumnPathMap("bill_dtl_brk_typ", "bill_dtl_brk_typ");
				addColumnPathMap("bill_dtl_sort_typ", "bill_dtl_sort_typ");
				addColumnPathMap("bill_can_slip_typ", "bill_can_slip_typ");
				addColumnPathMap("auto_line_appl_flg", "auto_line_appl_flg");
				addColumnPathMap("ar_setoff_grp_cd", "ar_setoff_grp_cd");
				addColumnPathMap("xfr_psn", "xfr_psn");
				addColumnPathMap("rcv_auto_appl_tgt_flg", "rcv_auto_appl_tgt_flg");
				addColumnPathMap("rcv_amt_match_flg", "rcv_amt_match_flg");
				addColumnPathMap("ar_sttl_typ_match_flg", "ar_sttl_typ_match_flg");
				addColumnPathMap("calc_com_paid_flg", "calc_com_paid_flg");
				addColumnPathMap("auto_appl_delay_days", "auto_appl_delay_days");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_cntct_psn_title", "dlv_cntct_psn_title");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("tdlv_flg", "tdlv_flg");
				addColumnPathMap("via_dlv_typ", "via_dlv_typ");
				addColumnPathMap("tdlv_req_flg", "tdlv_req_flg");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("dlv_cal_cd", "dlv_cal_cd");
				addColumnPathMap("dlv_chnnl1", "dlv_chnnl1");
				addColumnPathMap("dlv_chnnl2", "dlv_chnnl2");
				addColumnPathMap("dlv_chnnl3", "dlv_chnnl3");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("psppl_cd", "psppl_cd");
				addColumnPathMap("ap_cred_cd", "ap_cred_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("psppl_cl_day1", "psppl_cl_day1");
				addColumnPathMap("psppl_cl_day2", "psppl_cl_day2");
				addColumnPathMap("psppl_cl_day3", "psppl_cl_day3");
				addColumnPathMap("psppl_cl_day4", "psppl_cl_day4");
				addColumnPathMap("psppl_cl_day5", "psppl_cl_day5");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("ap_setoff_grp_cd", "ap_setoff_grp_cd");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("tax_on_pay_flg", "tax_on_pay_flg");
				addColumnPathMap("pay_tax_rnd_typ", "pay_tax_rnd_typ");
				addColumnPathMap("pay_schd_ba_typ", "pay_schd_ba_typ");
				addColumnPathMap("batch_pay_schd_cl_flg", "batch_pay_schd_cl_flg");
				addColumnPathMap("pay_schd_cl_delay_days", "pay_schd_cl_delay_days");
				addColumnPathMap("pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ");
				addColumnPathMap("pay_ntc_prnt_flg", "pay_ntc_prnt_flg");
				addColumnPathMap("pay_ntc_zip_cd", "pay_ntc_zip_cd");
				addColumnPathMap("pay_ntc_addr1", "pay_ntc_addr1");
				addColumnPathMap("pay_ntc_addr2", "pay_ntc_addr2");
				addColumnPathMap("pay_ntc_addr3", "pay_ntc_addr3");
				addColumnPathMap("pay_ntc_addr4", "pay_ntc_addr4");
				addColumnPathMap("pay_ntc_tel", "pay_ntc_tel");
				addColumnPathMap("pay_ntc_bsppl_nm", "pay_ntc_bsppl_nm");
				addColumnPathMap("pay_ntc_bsppl_dpt", "pay_ntc_bsppl_dpt");
				addColumnPathMap("pay_ntc_bsppl_psn", "pay_ntc_bsppl_psn");
				addColumnPathMap("pay_ntc_bsppl_psn_title", "pay_ntc_bsppl_psn_title");
				addColumnPathMap("pay_ntc_dtl_outp_flg", "pay_ntc_dtl_outp_flg");
				addColumnPathMap("pay_ntc_bfw_bal_disp_flg", "pay_ntc_bfw_bal_disp_flg");
				addColumnPathMap("pay_ntc_adv_pay_flg", "pay_ntc_adv_pay_flg");
				addColumnPathMap("pay_ntc_dtl_pay_flg", "pay_ntc_dtl_pay_flg");
				addColumnPathMap("pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ");
				addColumnPathMap("pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ");
				addColumnPathMap("pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ");
				addColumnPathMap("pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ");
				addColumnPathMap("psppl_rmrks", "psppl_rmrks");
				addColumnPathMap("note_days", "note_days");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("acst_prnt_typ", "acst_prnt_typ");
				addColumnPathMap("bcst_prnt_typ", "bcst_prnt_typ");
				addColumnPathMap("rcst_prnt_typ", "rcst_prnt_typ");
				addColumnPathMap("dlv_prnt_typ", "dlv_prnt_typ");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("asppl_prnt_typ", "asppl_prnt_typ");
				addColumnPathMap("bsppl_prnt_typ", "bsppl_prnt_typ");
				addColumnPathMap("psppl_prnt_typ", "psppl_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_upd04_0(mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_upd04_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_upd04_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_UpdChk02_DtlR r_dest = dest.createRow();
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
	 * 取引先マスタ一覧の削除を行います。<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
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
		private final MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_DelChk02 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Del02 （{@link #del02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_DelChk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_DelChk02 chk02;
		/**
		 * 連携オペレーション del02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Del02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR&gt; （{@link #del02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0520.MABCL_BpLst.BpLst_Del02 del02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> del02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_DelChk01();
			del01 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_Del01();
			chk02 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_DelChk02();
			del02 = mcframe.serverMABC.MABCL0520.MABCL_BpLst.crtBpLst_Del02();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR>)del01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR>)chk02.up(0);
			del02_up0 = (MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR>)del02.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, del02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 * CALL_OPE02<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR&gt; （{@link #del02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, del01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, del02_up0, up0());
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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_BpLst)MABCL_BpLst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_c</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_BpLst)MABCL_BpLst_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src_Del01_Dtl1){
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_del01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src_Del01_Dtl1){
			up_CALL_OPE02_chk02_0(dest0_0, src_Del01_Dtl1);
			up_CALL_OPE02_del02_0(dest1_0, src_Del01_Dtl1);
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
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_del02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_del02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_del02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_del02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_del02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("upd_cntr_c", "upd_cntr_c");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_del02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_del02_0(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_del02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_del02_0(MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_del02_0();
			for(mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0520.BpLst_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_del02_0(r_dest, r_src);
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

	//FMCB LOGIC_CONTROLLER END
}