package mcframe.serverMSBG.MSBGL5020;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBGL_RcvActCmnService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_RcvActCmnService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_RcvActCmnService.RcvActCmn_Chk01 aRcvActCmn_Chk01;

	protected void initRcvActCmn_Chk01() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Chk01_INFO;
		this.aRcvActCmn_Chk01 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Chk01();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Chk01 crtRcvActCmn_Chk01() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Chk01();
		return lgc.aRcvActCmn_Chk01;
	}

	protected void paramRcvActCmn_Chk01(MCParam p) {
		if (this.aRcvActCmn_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Chk01.up0());
		p.addUpBlock(aRcvActCmn_Chk01.up1());
		p.addDownBlock(aRcvActCmn_Chk01.down0());
	}

	protected void doRcvActCmn_Chk01() {
		aRcvActCmn_Chk01.call();
	};

	/**
	 * RcvActCmn_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR createRcvActCmn_Chk01_HdrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.create();
	}

	/**
	 * RcvActCmn_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> createRcvActCmn_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.class);
	}

	/**
	 * RcvActCmn_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR createRcvActCmn_Chk01_DtlR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.create();
	}

	/**
	 * RcvActCmn_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> createRcvActCmn_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.class);
	}
	protected MSBGL_RcvActCmnService.RcvActCmn_Chk02 aRcvActCmn_Chk02;

	protected void initRcvActCmn_Chk02() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Chk02_INFO;
		this.aRcvActCmn_Chk02 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Chk02();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Chk02 crtRcvActCmn_Chk02() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Chk02();
		return lgc.aRcvActCmn_Chk02;
	}

	protected void paramRcvActCmn_Chk02(MCParam p) {
		if (this.aRcvActCmn_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Chk02.up0());
		p.addUpBlock(aRcvActCmn_Chk02.up1());
		p.addUpBlock(aRcvActCmn_Chk02.up2());
		p.addDownBlock(aRcvActCmn_Chk02.down0());
		p.addDownBlock(aRcvActCmn_Chk02.down1());
		p.addDownBlock(aRcvActCmn_Chk02.down2());
	}

	protected void doRcvActCmn_Chk02() {
		aRcvActCmn_Chk02.call();
	};

	/**
	 * RcvActCmn_Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR createRcvActCmn_Chk02_HdrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.create();
	}

	/**
	 * RcvActCmn_Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> createRcvActCmn_Chk02_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.class);
	}

	/**
	 * RcvActCmn_Chk02_SwToブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR createRcvActCmn_Chk02_SwToR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.create();
	}

	/**
	 * RcvActCmn_Chk02_SwToブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> createRcvActCmn_Chk02_SwToL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.class);
	}

	/**
	 * RcvActCmn_Chk02_SwFrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR createRcvActCmn_Chk02_SwFrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.create();
	}

	/**
	 * RcvActCmn_Chk02_SwFrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> createRcvActCmn_Chk02_SwFrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.class);
	}
	protected MSBGL_RcvActCmnService.RcvActCmn_Chk03 aRcvActCmn_Chk03;

	protected void initRcvActCmn_Chk03() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Chk03_INFO;
		this.aRcvActCmn_Chk03 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Chk03();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Chk03 crtRcvActCmn_Chk03() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Chk03();
		return lgc.aRcvActCmn_Chk03;
	}

	protected void paramRcvActCmn_Chk03(MCParam p) {
		if (this.aRcvActCmn_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Chk03.up0());
		p.addUpBlock(aRcvActCmn_Chk03.up1());
		p.addUpBlock(aRcvActCmn_Chk03.up2());
		p.addDownBlock(aRcvActCmn_Chk03.down0());
		p.addDownBlock(aRcvActCmn_Chk03.down1());
		p.addDownBlock(aRcvActCmn_Chk03.down2());
	}

	protected void doRcvActCmn_Chk03() {
		aRcvActCmn_Chk03.call();
	};

	/**
	 * RcvActCmn_Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR createRcvActCmn_Chk03_HdrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.create();
	}

	/**
	 * RcvActCmn_Chk03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> createRcvActCmn_Chk03_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.class);
	}

	/**
	 * RcvActCmn_Chk03_SwToブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR createRcvActCmn_Chk03_SwToR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.create();
	}

	/**
	 * RcvActCmn_Chk03_SwToブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> createRcvActCmn_Chk03_SwToL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.class);
	}

	/**
	 * RcvActCmn_Chk03_SwFrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR createRcvActCmn_Chk03_SwFrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.create();
	}

	/**
	 * RcvActCmn_Chk03_SwFrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> createRcvActCmn_Chk03_SwFrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.class);
	}
	protected MSBGL_RcvActCmnService.RcvActCmn_Chk04 aRcvActCmn_Chk04;

	protected void initRcvActCmn_Chk04() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Chk04_INFO;
		this.aRcvActCmn_Chk04 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Chk04();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Chk04 crtRcvActCmn_Chk04() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Chk04();
		return lgc.aRcvActCmn_Chk04;
	}

	protected void paramRcvActCmn_Chk04(MCParam p) {
		if (this.aRcvActCmn_Chk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Chk04.up0());
		p.addDownBlock(aRcvActCmn_Chk04.down0());
	}

	protected void doRcvActCmn_Chk04() {
		aRcvActCmn_Chk04.call();
	};

	/**
	 * RcvActCmn_Chk04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR createRcvActCmn_Chk04_CndR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.create();
	}

	/**
	 * RcvActCmn_Chk04_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> createRcvActCmn_Chk04_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);
	}
	protected MSBGL_RcvActCmnService.RcvActCmn_Chk05 aRcvActCmn_Chk05;

	protected void initRcvActCmn_Chk05() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Chk05_INFO;
		this.aRcvActCmn_Chk05 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Chk05();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Chk05 crtRcvActCmn_Chk05() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Chk05();
		return lgc.aRcvActCmn_Chk05;
	}

	protected void paramRcvActCmn_Chk05(MCParam p) {
		if (this.aRcvActCmn_Chk05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Chk05.up0());
		p.addDownBlock(aRcvActCmn_Chk05.down0());
	}

	protected void doRcvActCmn_Chk05() {
		aRcvActCmn_Chk05.call();
	};

	/**
	 * RcvActCmn_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR createRcvActCmn_Del01_CndR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.create();
	}

	/**
	 * RcvActCmn_Del01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> createRcvActCmn_Del01_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);
	}
	protected MSBGL_RcvActCmnService.RcvActCmn_Upd01 aRcvActCmn_Upd01;

	protected void initRcvActCmn_Upd01() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Upd01_INFO;
		this.aRcvActCmn_Upd01 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Upd01();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Upd01 crtRcvActCmn_Upd01() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Upd01();
		return lgc.aRcvActCmn_Upd01;
	}

	protected void paramRcvActCmn_Upd01(MCParam p) {
		if (this.aRcvActCmn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Upd01.up0());
		p.addUpBlock(aRcvActCmn_Upd01.up1());
		p.addUpBlock(aRcvActCmn_Upd01.up2());
		p.addDownBlock(aRcvActCmn_Upd01.down0());
		p.addDownBlock(aRcvActCmn_Upd01.down1());
	}

	protected void doRcvActCmn_Upd01() {
		aRcvActCmn_Upd01.call();
	};

	/**
	 * RcvActCmn_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR createRcvActCmn_Upd01_HdrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.create();
	}

	/**
	 * RcvActCmn_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> createRcvActCmn_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.class);
	}

	/**
	 * RcvActCmn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR createRcvActCmn_Upd01_DtlR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.create();
	}

	/**
	 * RcvActCmn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> createRcvActCmn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.class);
	}

	/**
	 * RcvAct_InfoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvAct_InfoR createRcvAct_InfoR(){
		return mcframe.serverMSBG.MSBGL5020.RcvAct_InfoR.create();
	}

	/**
	 * RcvActD_InfoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR createRcvActD_InfoR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR.create();
	}

	/**
	 * RcvActD_InfoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR> createRcvActD_InfoL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR.class);
	}

	/**
	 * RcvAct_BaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvAct_BaseR createRcvAct_BaseR(){
		return mcframe.serverMSBG.MSBGL5020.RcvAct_BaseR.create();
	}

	/**
	 * RcvActCmn_Upd01_BillDApplActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR createRcvActCmn_Upd01_BillDApplActR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR.create();
	}

	/**
	 * RcvActCmn_Upd01_BillDApplActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR> createRcvActCmn_Upd01_BillDApplActL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR.class);
	}

	/**
	 * RcvActCmn_Upd01_BillDブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR createRcvActCmn_Upd01_BillDR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR.create();
	}

	/**
	 * RcvActCmn_Upd01_BillDブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR> createRcvActCmn_Upd01_BillDL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR.class);
	}
	protected MSBGL_RcvActCmnService.RcvActCmn_Upd02 aRcvActCmn_Upd02;

	protected void initRcvActCmn_Upd02() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Upd02_INFO;
		this.aRcvActCmn_Upd02 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Upd02();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Upd02 crtRcvActCmn_Upd02() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Upd02();
		return lgc.aRcvActCmn_Upd02;
	}

	protected void paramRcvActCmn_Upd02(MCParam p) {
		if (this.aRcvActCmn_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Upd02.up0());
		p.addUpBlock(aRcvActCmn_Upd02.up1());
		p.addUpBlock(aRcvActCmn_Upd02.up2());
		p.addDownBlock(aRcvActCmn_Upd02.down0());
	}

	protected void doRcvActCmn_Upd02() {
		aRcvActCmn_Upd02.call();
	};

	/**
	 * RcvActCmn_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR createRcvActCmn_Upd02_HdrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.create();
	}

	/**
	 * RcvActCmn_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> createRcvActCmn_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.class);
	}

	/**
	 * RcvActCmn_Upd02_SwToブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR createRcvActCmn_Upd02_SwToR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.create();
	}

	/**
	 * RcvActCmn_Upd02_SwToブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> createRcvActCmn_Upd02_SwToL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.class);
	}

	/**
	 * RcvActCmn_Upd02_SwFrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR createRcvActCmn_Upd02_SwFrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.create();
	}

	/**
	 * RcvActCmn_Upd02_SwFrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> createRcvActCmn_Upd02_SwFrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.class);
	}

	/**
	 * RcvActCmn_Upd02_RcvActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_RcvActR createRcvActCmn_Upd02_RcvActR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_RcvActR.create();
	}

	/**
	 * RcvActCmn_Upd02_SwBaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR createRcvActCmn_Upd02_SwBaseR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR.create();
	}

	/**
	 * RcvActCmn_Upd02_SwBaseブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR> createRcvActCmn_Upd02_SwBaseL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR.class);
	}
	protected MSBGL_RcvActCmnService.RcvActCmn_Upd03 aRcvActCmn_Upd03;

	protected void initRcvActCmn_Upd03() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Upd03_INFO;
		this.aRcvActCmn_Upd03 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Upd03();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Upd03 crtRcvActCmn_Upd03() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Upd03();
		return lgc.aRcvActCmn_Upd03;
	}

	protected void paramRcvActCmn_Upd03(MCParam p) {
		if (this.aRcvActCmn_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Upd03.up0());
		p.addUpBlock(aRcvActCmn_Upd03.up1());
		p.addUpBlock(aRcvActCmn_Upd03.up2());
		p.addUpBlock(aRcvActCmn_Upd03.up3());
	}

	protected void doRcvActCmn_Upd03() {
		aRcvActCmn_Upd03.call();
	};

	/**
	 * RcvActCmn_Upd03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR createRcvActCmn_Upd03_HdrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.create();
	}

	/**
	 * RcvActCmn_Upd03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> createRcvActCmn_Upd03_HdrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.class);
	}

	/**
	 * RcvActCmn_Upd03_SwToブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR createRcvActCmn_Upd03_SwToR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.create();
	}

	/**
	 * RcvActCmn_Upd03_SwToブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> createRcvActCmn_Upd03_SwToL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.class);
	}

	/**
	 * RcvActCmn_Upd03_SwFrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR createRcvActCmn_Upd03_SwFrR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.create();
	}

	/**
	 * RcvActCmn_Upd03_SwFrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> createRcvActCmn_Upd03_SwFrL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.class);
	}

	/**
	 * RcvActCmn_Upd03_BillDブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR createRcvActCmn_Upd03_BillDR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR.create();
	}

	/**
	 * RcvActCmn_Upd03_BillDブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR> createRcvActCmn_Upd03_BillDL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR.class);
	}
	protected MSBGL_RcvActCmnService.RcvActCmn_Upd04 aRcvActCmn_Upd04;

	protected void initRcvActCmn_Upd04() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Upd04_INFO;
		this.aRcvActCmn_Upd04 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Upd04();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Upd04 crtRcvActCmn_Upd04() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Upd04();
		return lgc.aRcvActCmn_Upd04;
	}

	protected void paramRcvActCmn_Upd04(MCParam p) {
		if (this.aRcvActCmn_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Upd04.up0());
	}

	protected void doRcvActCmn_Upd04() {
		aRcvActCmn_Upd04.call();
	};

	/**
	 * RcvActCmn_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR createRcvActCmn_Upd04_CndR(){
		return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.create();
	}

	/**
	 * RcvActCmn_Upd04_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> createRcvActCmn_Upd04_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);
	}
	protected MSBGL_RcvActCmnService.RcvActCmn_Del01 aRcvActCmn_Del01;

	protected void initRcvActCmn_Del01() {
		this.info = PDef.MS_MSBGL5020_RcvActCmn_Del01_INFO;
		this.aRcvActCmn_Del01 = ((MSBGL_RcvActCmnService)this).new RcvActCmn_Del01();
	}

	public static MSBGL_RcvActCmnService.RcvActCmn_Del01 crtRcvActCmn_Del01() {
		MSBGL_RcvActCmnService lgc = new MSBGL_RcvActCmnService();
		lgc.initRcvActCmn_Del01();
		return lgc.aRcvActCmn_Del01;
	}

	protected void paramRcvActCmn_Del01(MCParam p) {
		if (this.aRcvActCmn_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRcvActCmn_Del01.up0());
	}

	protected void doRcvActCmn_Del01() {
		aRcvActCmn_Del01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * RcvActCmn_Chk01オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected RcvActCmn_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RcvActCmn_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR createRcvActCmn_Chk01_HdrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.create();
		}

		/**
		 * RcvActCmn_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> createRcvActCmn_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.class);
		}

		/**
		 * RcvActCmn_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR createRcvActCmn_Chk01_DtlR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.create();
		}

		/**
		 * RcvActCmn_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> createRcvActCmn_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ1</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_trd_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}


	}
	/**
	 * RcvActCmn_Chk02オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> down2;
		
		
		// コンストラクタ
		protected RcvActCmn_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.class);
			up2 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.class);
			down2 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.class);

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
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * RcvActCmn_Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR createRcvActCmn_Chk02_HdrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.create();
		}

		/**
		 * RcvActCmn_Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> createRcvActCmn_Chk02_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.class);
		}

		/**
		 * RcvActCmn_Chk02_SwToブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR createRcvActCmn_Chk02_SwToR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.create();
		}

		/**
		 * RcvActCmn_Chk02_SwToブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> createRcvActCmn_Chk02_SwToL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.class);
		}

		/**
		 * RcvActCmn_Chk02_SwFrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR createRcvActCmn_Chk02_SwFrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.create();
		}

		/**
		 * RcvActCmn_Chk02_SwFrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> createRcvActCmn_Chk02_SwFrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}


	}
	/**
	 * RcvActCmn_Chk03オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> down2;
		
		
		// コンストラクタ
		protected RcvActCmn_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.class);
			up2 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.class);
			down2 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.class);

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
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * RcvActCmn_Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR createRcvActCmn_Chk03_HdrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.create();
		}

		/**
		 * RcvActCmn_Chk03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> createRcvActCmn_Chk03_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.class);
		}

		/**
		 * RcvActCmn_Chk03_SwToブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR createRcvActCmn_Chk03_SwToR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.create();
		}

		/**
		 * RcvActCmn_Chk03_SwToブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> createRcvActCmn_Chk03_SwToL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.class);
		}

		/**
		 * RcvActCmn_Chk03_SwFrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR createRcvActCmn_Chk03_SwFrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.create();
		}

		/**
		 * RcvActCmn_Chk03_SwFrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> createRcvActCmn_Chk03_SwFrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}


	}
	/**
	 * RcvActCmn_Chk04オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> down0;
		
		
		// コンストラクタ
		protected RcvActCmn_Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);

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
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RcvActCmn_Chk04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR createRcvActCmn_Chk04_CndR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.create();
		}

		/**
		 * RcvActCmn_Chk04_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> createRcvActCmn_Chk04_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}


	}
	/**
	 * RcvActCmn_Chk05オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Chk05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Chk05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> down0;
		
		
		// コンストラクタ
		protected RcvActCmn_Chk05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);

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
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RcvActCmn_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR createRcvActCmn_Del01_CndR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.create();
		}

		/**
		 * RcvActCmn_Del01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> createRcvActCmn_Del01_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}


	}
	/**
	 * RcvActCmn_Upd01オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5020.RcvAct_BaseR down1;
		/** [RcvActCmn_Upd01_BillDApplAct]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR> aRcvActCmn_Upd01_BillDApplAct;
		/** [RcvActD_Info]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR> aRcvActD_Info;
		/** [RcvAct_Info]ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5020.RcvAct_InfoR aRcvAct_Info;
		
		/**
		 * 連携情報 UPD01<p>
		 *
		 * 連携先 mcframe.serverMSBG.MSBGL5100.MSBGL_ArDtlApplService.ArDtlAppl_Upd01 （{@link #c0}）<br>
		 */
		public final String UPD01 = "UPD01";

		/**
		 * 連携オペレーション c0<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBG.MSBGL5100.MSBGL_ArDtlApplService.ArDtlAppl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR&gt; （{@link #c0_up0}）<br>
		 */
		public final mcframe.serverMSBG.MSBGL5100.MSBGL_ArDtlApplService.ArDtlAppl_Upd01 c0;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> c0_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected RcvActCmn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR.class);
			down0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.class);
			down1 = mcframe.serverMSBG.MSBGL5020.RcvAct_BaseR.create();
			aRcvActCmn_Upd01_BillDApplAct = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR.class);
			aRcvActD_Info = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR.class);
			aRcvAct_Info = mcframe.serverMSBG.MSBGL5020.RcvAct_InfoR.create();

			// 連携オペレーションの初期化
			c0 = mcframe.serverMSBG.MSBGL5100.MSBGL_ArDtlApplService.crtArDtlAppl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR>)c0.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPD01, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPD01<br>
		 * up2() => MCList&lt;mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR&gt; （{@link #c0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPD01)) {
				up_UPD01(c0_up0, up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPD01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPD01)) {
				down_UPD01();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * RcvActCmn_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR createRcvActCmn_Upd01_HdrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.create();
		}

		/**
		 * RcvActCmn_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> createRcvActCmn_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR.class);
		}

		/**
		 * RcvActCmn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR createRcvActCmn_Upd01_DtlR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.create();
		}

		/**
		 * RcvActCmn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> createRcvActCmn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR.class);
		}

		/**
		 * RcvAct_InfoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvAct_InfoR createRcvAct_InfoR(){
			return mcframe.serverMSBG.MSBGL5020.RcvAct_InfoR.create();
		}

		/**
		 * RcvActD_InfoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR createRcvActD_InfoR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR.create();
		}

		/**
		 * RcvActD_InfoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR> createRcvActD_InfoL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR.class);
		}

		/**
		 * RcvAct_BaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvAct_BaseR createRcvAct_BaseR(){
			return mcframe.serverMSBG.MSBGL5020.RcvAct_BaseR.create();
		}

		/**
		 * RcvActCmn_Upd01_BillDApplActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR createRcvActCmn_Upd01_BillDApplActR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR.create();
		}

		/**
		 * RcvActCmn_Upd01_BillDApplActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR> createRcvActCmn_Upd01_BillDApplActL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR.class);
		}

		/**
		 * RcvActCmn_Upd01_BillDブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR createRcvActCmn_Upd01_BillDR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR.create();
		}

		/**
		 * RcvActCmn_Upd01_BillDブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR> createRcvActCmn_Upd01_BillDL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ1</td></tr>
		 * 	<tr><td><br></td><td>tax_cd1</td></tr>
		 * 	<tr><td><br></td><td>tax_typ1</td></tr>
		 * 	<tr><td><br></td><td>tax_rate1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd2</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ2</td></tr>
		 * 	<tr><td><br></td><td>tax_cd2</td></tr>
		 * 	<tr><td><br></td><td>tax_typ2</td></tr>
		 * 	<tr><td><br></td><td>tax_rate2</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd3</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ3</td></tr>
		 * 	<tr><td><br></td><td>tax_cd3</td></tr>
		 * 	<tr><td><br></td><td>tax_typ3</td></tr>
		 * 	<tr><td><br></td><td>tax_rate3</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_trd_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>debt_cred_id_typ</td></tr>
		 * 	<tr><td><br></td><td>debt_cred_id_cd</td></tr>
		 * 	<tr><td><br></td><td>debt_cred_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_dtl_adv_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>grp_seq</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_cd1</td></tr>
		 * 	<tr><td><br></td><td>ar_sttl_typ1</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>amt1</td></tr>
		 * 	<tr><td><br></td><td>amt2</td></tr>
		 * 	<tr><td><br></td><td>amt3</td></tr>
		 * 	<tr><td><br></td><td>bill_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ar_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>grp_seq</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>parent_bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>appl_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk01_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_ym</td></tr>
		 * 	<tr><td><br></td><td>can_trd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_rev</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5020.RcvAct_BaseR
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvAct_BaseR down1() {
			return down1;
		}


		/**
		 * [RcvActCmn_Upd01_BillDApplAct]ブロックのコンテナaRcvActCmn_Upd01_BillDApplActLを返します。
		 *
		 * @return RcvActCmn_Upd01_BillDApplActL
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDApplActR> RcvActCmn_Upd01_BillDApplAct() {
			return aRcvActCmn_Upd01_BillDApplAct;
		}

		/**
		 * [RcvActD_Info]ブロックのコンテナaRcvActD_InfoLを返します。
		 *
		 * @return RcvActD_InfoL
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActD_InfoR> RcvActD_Info() {
			return aRcvActD_Info;
		}

		/**
		 * [RcvAct_Info]ブロックのコンテナaRcvAct_InfoRを返します。
		 *
		 * @return RcvAct_InfoR
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvAct_InfoR RcvAct_Info() {
			return aRcvAct_Info;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}

		//-----------------------UPD01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPD01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPD01(MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> dest0_0, MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR> src_RcvActCmn_Upd01_BillD){
			up_UPD01_c0_0(dest0_0, src_RcvActCmn_Upd01_BillD);
		}
		
		/**
		 * 連携処理UPD01_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPD01_c0_0() {
			MCRowMapper map = new Map_up_UPD01_c0_0();
			return map;
		}

		/**
		 * 連携処理UPD01_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPD01_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("rcv_act_d_no", "rcv_act_d_no");
				addColumnPathMap("rcv_act_d_seq", "rcv_act_d_seq");
				addColumnPathMap("bill_d_no", "bill_d_no");
				addColumnPathMap("parent_bill_d_no", "parent_bill_d_no");
				addColumnPathMap("bill_mng_no", "bill_mng_no");
				addColumnPathMap("appl_amt", "appl_amt");
				addColumnPathMap("rcv_act_no", "rcv_act_no");
				addColumnPathMap("rcv_act_seq", "rcv_act_seq");
			}
		}

		/**
		 * 連携処理UPD01_c0の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPD01_c0_0(mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR r_dest, mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR r_src) {
		}

		/**
		 * 連携処理UPD01_c0の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPD01_c0_0(MCList<mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR> dest, MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR> src) {
			MCRowMapper _rm = createMap_up_UPD01_c0_0();
			for(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd01_BillDR r_src : src){
				mcframe.serverMSBG.MSBGL5100.ArDtlAppl_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPD01_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPD01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPD01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPD01(){
		}
	}
	/**
	 * RcvActCmn_Upd02オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_RcvActR down0;
		/** [RcvActCmn_Upd02_SwBase]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR> aRcvActCmn_Upd02_SwBase;
		
		
		// コンストラクタ
		protected RcvActCmn_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.class);
			up2 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.class);
			down0 = mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_RcvActR.create();
			aRcvActCmn_Upd02_SwBase = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR.class);

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
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RcvActCmn_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR createRcvActCmn_Upd02_HdrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.create();
		}

		/**
		 * RcvActCmn_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> createRcvActCmn_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR.class);
		}

		/**
		 * RcvActCmn_Upd02_SwToブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR createRcvActCmn_Upd02_SwToR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.create();
		}

		/**
		 * RcvActCmn_Upd02_SwToブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> createRcvActCmn_Upd02_SwToL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR.class);
		}

		/**
		 * RcvActCmn_Upd02_SwFrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR createRcvActCmn_Upd02_SwFrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.create();
		}

		/**
		 * RcvActCmn_Upd02_SwFrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> createRcvActCmn_Upd02_SwFrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR.class);
		}

		/**
		 * RcvActCmn_Upd02_RcvActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_RcvActR createRcvActCmn_Upd02_RcvActR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_RcvActR.create();
		}

		/**
		 * RcvActCmn_Upd02_SwBaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR createRcvActCmn_Upd02_SwBaseR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR.create();
		}

		/**
		 * RcvActCmn_Upd02_SwBaseブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR> createRcvActCmn_Upd02_SwBaseL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_trd_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwToR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_no</td></tr>
		 * 	<tr><td><br></td><td>act_seq</td></tr>
		 * 	<tr><td><br></td><td>act_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>parent_bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>base_cur_sw_amt</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk02_SwFrR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>fr_trd_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>fr_rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>fr_rcv_act_rev</td></tr>
		 * 	<tr><td><br></td><td>to_trd_cd</td></tr>
		 * 	<tr><td><br></td><td>to_rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>to_rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>to_rcv_act_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_RcvActR
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_RcvActR down0() {
			return down0;
		}


		/**
		 * [RcvActCmn_Upd02_SwBase]ブロックのコンテナaRcvActCmn_Upd02_SwBaseLを返します。
		 *
		 * @return RcvActCmn_Upd02_SwBaseL
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd02_SwBaseR> RcvActCmn_Upd02_SwBase() {
			return aRcvActCmn_Upd02_SwBase;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}


	}
	/**
	 * RcvActCmn_Upd03オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR> up3;
		
		
		// コンストラクタ
		protected RcvActCmn_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.class);
			up2 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.class);
			up3 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR.class);

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
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RcvActCmn_Upd03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR createRcvActCmn_Upd03_HdrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.create();
		}

		/**
		 * RcvActCmn_Upd03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> createRcvActCmn_Upd03_HdrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR.class);
		}

		/**
		 * RcvActCmn_Upd03_SwToブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR createRcvActCmn_Upd03_SwToR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.create();
		}

		/**
		 * RcvActCmn_Upd03_SwToブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> createRcvActCmn_Upd03_SwToL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR.class);
		}

		/**
		 * RcvActCmn_Upd03_SwFrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR createRcvActCmn_Upd03_SwFrR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.create();
		}

		/**
		 * RcvActCmn_Upd03_SwFrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> createRcvActCmn_Upd03_SwFrL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR.class);
		}

		/**
		 * RcvActCmn_Upd03_BillDブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR createRcvActCmn_Upd03_BillDR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR.create();
		}

		/**
		 * RcvActCmn_Upd03_BillDブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR> createRcvActCmn_Upd03_BillDL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_trd_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sw_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwToR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk03_SwFrR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * 	<tr><td><br></td><td>ar_trd_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>bill_d_iv_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>sw_to_acst_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bill_ymd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_schd_bill_dt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sw_fr_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sw_fr_ar_ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sw_fr_ar_trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_fr_rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>sw_fr_rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sw_fr_rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sw_fr_rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ar_ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sw_to_ar_trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sw_to_rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>sw_to_rcv_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sw_to_rcv_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sw_to_rcv_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>appl_amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Upd03_BillDR> up3() {
			return up3;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}


	}
	/**
	 * RcvActCmn_Upd04オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> up0;
		
		
		// コンストラクタ
		protected RcvActCmn_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);

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
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RcvActCmn_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR createRcvActCmn_Upd04_CndR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.create();
		}

		/**
		 * RcvActCmn_Upd04_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> createRcvActCmn_Upd04_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}


	}
	/**
	 * RcvActCmn_Del01オペレーション.<p>
	 *
	 */
	abstract public class RcvActCmn_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RcvActCmn_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> up0;
		
		
		// コンストラクタ
		protected RcvActCmn_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);

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
			invoke((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RcvActCmn_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR createRcvActCmn_Del01_CndR(){
			return mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.create();
		}

		/**
		 * RcvActCmn_Del01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> createRcvActCmn_Del01_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5020.RcvActCmn_Chk04_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvActCmnService)MSBGL_RcvActCmnService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}