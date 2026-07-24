package mcframe.serverMSLA.MSLAL9310;

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
 * "MSLAL_OrdSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_OrdSendIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAL9310";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_OrdSendIfService.OrdSendIf_Itm_Srch01 aOrdSendIf_Itm_Srch01;

	protected void initOrdSendIf_Itm_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Itm_Srch01_INFO;
		this.aOrdSendIf_Itm_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Itm_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Itm_Srch01 crtOrdSendIf_Itm_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Itm_Srch01();
		return lgc.aOrdSendIf_Itm_Srch01;
	}

	protected void paramOrdSendIf_Itm_Srch01(MCParam p) {
		if (this.aOrdSendIf_Itm_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Itm_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Itm_Srch01.down0());
	}

	protected void doOrdSendIf_Itm_Srch01() {
		aOrdSendIf_Itm_Srch01.call();
	};

	/**
	 * OrdSendIf_Itm_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_DtlR createOrdSendIf_Itm_Srch01_DtlR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_DtlR.create();
	}

	/**
	 * OrdSendIf_Itm_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR createOrdSendIf_Itm_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Itm_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR> createOrdSendIf_Itm_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Itm_Oper_Srch01 aOrdSendIf_Itm_Oper_Srch01;

	protected void initOrdSendIf_Itm_Oper_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Itm_Oper_Srch01_INFO;
		this.aOrdSendIf_Itm_Oper_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Itm_Oper_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Itm_Oper_Srch01 crtOrdSendIf_Itm_Oper_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Itm_Oper_Srch01();
		return lgc.aOrdSendIf_Itm_Oper_Srch01;
	}

	protected void paramOrdSendIf_Itm_Oper_Srch01(MCParam p) {
		if (this.aOrdSendIf_Itm_Oper_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Itm_Oper_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Itm_Oper_Srch01.down0());
	}

	protected void doOrdSendIf_Itm_Oper_Srch01() {
		aOrdSendIf_Itm_Oper_Srch01.call();
	};

	/**
	 * OrdSendIf_Itm_Oper_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_DtlR createOrdSendIf_Itm_Oper_Srch01_DtlR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_DtlR.create();
	}

	/**
	 * OrdSendIf_Itm_Oper_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR createOrdSendIf_Itm_Oper_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Itm_Oper_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR> createOrdSendIf_Itm_Oper_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Itm_Dtl_Srch01 aOrdSendIf_Itm_Dtl_Srch01;

	protected void initOrdSendIf_Itm_Dtl_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Itm_Dtl_Srch01_INFO;
		this.aOrdSendIf_Itm_Dtl_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Itm_Dtl_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Itm_Dtl_Srch01 crtOrdSendIf_Itm_Dtl_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Itm_Dtl_Srch01();
		return lgc.aOrdSendIf_Itm_Dtl_Srch01;
	}

	protected void paramOrdSendIf_Itm_Dtl_Srch01(MCParam p) {
		if (this.aOrdSendIf_Itm_Dtl_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Itm_Dtl_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Itm_Dtl_Srch01.down0());
	}

	protected void doOrdSendIf_Itm_Dtl_Srch01() {
		aOrdSendIf_Itm_Dtl_Srch01.call();
	};

	/**
	 * OrdSendIf_Itm_Dtl_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_DtlR createOrdSendIf_Itm_Dtl_Srch01_DtlR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_DtlR.create();
	}

	/**
	 * OrdSendIf_Itm_Dtl_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR createOrdSendIf_Itm_Dtl_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Itm_Dtl_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR> createOrdSendIf_Itm_Dtl_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Bom_Srch01 aOrdSendIf_Bom_Srch01;

	protected void initOrdSendIf_Bom_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Bom_Srch01_INFO;
		this.aOrdSendIf_Bom_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Bom_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Bom_Srch01 crtOrdSendIf_Bom_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Bom_Srch01();
		return lgc.aOrdSendIf_Bom_Srch01;
	}

	protected void paramOrdSendIf_Bom_Srch01(MCParam p) {
		if (this.aOrdSendIf_Bom_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Bom_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Bom_Srch01.down0());
	}

	protected void doOrdSendIf_Bom_Srch01() {
		aOrdSendIf_Bom_Srch01.call();
	};

	/**
	 * OrdSendIf_Bom_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_DtlR createOrdSendIf_Bom_Srch01_DtlR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_DtlR.create();
	}

	/**
	 * OrdSendIf_Bom_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR createOrdSendIf_Bom_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Bom_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR> createOrdSendIf_Bom_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Loc_Srch01 aOrdSendIf_Loc_Srch01;

	protected void initOrdSendIf_Loc_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Loc_Srch01_INFO;
		this.aOrdSendIf_Loc_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Loc_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Loc_Srch01 crtOrdSendIf_Loc_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Loc_Srch01();
		return lgc.aOrdSendIf_Loc_Srch01;
	}

	protected void paramOrdSendIf_Loc_Srch01(MCParam p) {
		if (this.aOrdSendIf_Loc_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Loc_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Loc_Srch01.down0());
	}

	protected void doOrdSendIf_Loc_Srch01() {
		aOrdSendIf_Loc_Srch01.call();
	};

	/**
	 * OrdSendIf_Loc_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_CndR createOrdSendIf_Loc_Srch01_CndR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_CndR.create();
	}

	/**
	 * OrdSendIf_Loc_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR createOrdSendIf_Loc_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Loc_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR> createOrdSendIf_Loc_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Cal_Srch01 aOrdSendIf_Cal_Srch01;

	protected void initOrdSendIf_Cal_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Cal_Srch01_INFO;
		this.aOrdSendIf_Cal_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Cal_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Cal_Srch01 crtOrdSendIf_Cal_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Cal_Srch01();
		return lgc.aOrdSendIf_Cal_Srch01;
	}

	protected void paramOrdSendIf_Cal_Srch01(MCParam p) {
		if (this.aOrdSendIf_Cal_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Cal_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Cal_Srch01.down0());
	}

	protected void doOrdSendIf_Cal_Srch01() {
		aOrdSendIf_Cal_Srch01.call();
	};

	/**
	 * OrdSendIf_Cal_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_CndR createOrdSendIf_Cal_Srch01_CndR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_CndR.create();
	}

	/**
	 * OrdSendIf_Cal_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR createOrdSendIf_Cal_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Cal_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR> createOrdSendIf_Cal_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Ext_Cal_Srch01 aOrdSendIf_Ext_Cal_Srch01;

	protected void initOrdSendIf_Ext_Cal_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Ext_Cal_Srch01_INFO;
		this.aOrdSendIf_Ext_Cal_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Ext_Cal_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Ext_Cal_Srch01 crtOrdSendIf_Ext_Cal_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Ext_Cal_Srch01();
		return lgc.aOrdSendIf_Ext_Cal_Srch01;
	}

	protected void paramOrdSendIf_Ext_Cal_Srch01(MCParam p) {
		if (this.aOrdSendIf_Ext_Cal_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aOrdSendIf_Ext_Cal_Srch01.down0());
	}

	protected void doOrdSendIf_Ext_Cal_Srch01() {
		aOrdSendIf_Ext_Cal_Srch01.call();
	};

	/**
	 * OrdSendIf_Ext_Cal_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR createOrdSendIf_Ext_Cal_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Ext_Cal_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR> createOrdSendIf_Ext_Cal_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Stk_Srch01 aOrdSendIf_Stk_Srch01;

	protected void initOrdSendIf_Stk_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Stk_Srch01_INFO;
		this.aOrdSendIf_Stk_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Stk_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Stk_Srch01 crtOrdSendIf_Stk_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Stk_Srch01();
		return lgc.aOrdSendIf_Stk_Srch01;
	}

	protected void paramOrdSendIf_Stk_Srch01(MCParam p) {
		if (this.aOrdSendIf_Stk_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Stk_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Stk_Srch01.down0());
	}

	protected void doOrdSendIf_Stk_Srch01() {
		aOrdSendIf_Stk_Srch01.call();
	};

	/**
	 * OrdSendIf_Stk_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_CndR createOrdSendIf_Stk_Srch01_CndR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_CndR.create();
	}

	/**
	 * OrdSendIf_Stk_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR createOrdSendIf_Stk_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Stk_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR> createOrdSendIf_Stk_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_IO_Gr_Srch01 aOrdSendIf_IO_Gr_Srch01;

	protected void initOrdSendIf_IO_Gr_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_IO_Gr_Srch01_INFO;
		this.aOrdSendIf_IO_Gr_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_IO_Gr_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_IO_Gr_Srch01 crtOrdSendIf_IO_Gr_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_IO_Gr_Srch01();
		return lgc.aOrdSendIf_IO_Gr_Srch01;
	}

	protected void paramOrdSendIf_IO_Gr_Srch01(MCParam p) {
		if (this.aOrdSendIf_IO_Gr_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_IO_Gr_Srch01.up0());
		p.addDownBlock(aOrdSendIf_IO_Gr_Srch01.down0());
	}

	protected void doOrdSendIf_IO_Gr_Srch01() {
		aOrdSendIf_IO_Gr_Srch01.call();
	};

	/**
	 * OrdSendIf_IO_Gr_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_CndR createOrdSendIf_IO_Gr_Srch01_CndR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_CndR.create();
	}

	/**
	 * OrdSendIf_IO_Gr_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR createOrdSendIf_IO_Gr_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_IO_Gr_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR> createOrdSendIf_IO_Gr_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_IO_Gi_Srch01 aOrdSendIf_IO_Gi_Srch01;

	protected void initOrdSendIf_IO_Gi_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_IO_Gi_Srch01_INFO;
		this.aOrdSendIf_IO_Gi_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_IO_Gi_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_IO_Gi_Srch01 crtOrdSendIf_IO_Gi_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_IO_Gi_Srch01();
		return lgc.aOrdSendIf_IO_Gi_Srch01;
	}

	protected void paramOrdSendIf_IO_Gi_Srch01(MCParam p) {
		if (this.aOrdSendIf_IO_Gi_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_IO_Gi_Srch01.up0());
		p.addDownBlock(aOrdSendIf_IO_Gi_Srch01.down0());
	}

	protected void doOrdSendIf_IO_Gi_Srch01() {
		aOrdSendIf_IO_Gi_Srch01.call();
	};

	/**
	 * OrdSendIf_IO_Gi_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_CndR createOrdSendIf_IO_Gi_Srch01_CndR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_CndR.create();
	}

	/**
	 * OrdSendIf_IO_Gi_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR createOrdSendIf_IO_Gi_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_IO_Gi_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR> createOrdSendIf_IO_Gi_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Dly_Dmnd_Srch01 aOrdSendIf_Dly_Dmnd_Srch01;

	protected void initOrdSendIf_Dly_Dmnd_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Dly_Dmnd_Srch01_INFO;
		this.aOrdSendIf_Dly_Dmnd_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Dly_Dmnd_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Dly_Dmnd_Srch01 crtOrdSendIf_Dly_Dmnd_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Dly_Dmnd_Srch01();
		return lgc.aOrdSendIf_Dly_Dmnd_Srch01;
	}

	protected void paramOrdSendIf_Dly_Dmnd_Srch01(MCParam p) {
		if (this.aOrdSendIf_Dly_Dmnd_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Dly_Dmnd_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Dly_Dmnd_Srch01.down0());
	}

	protected void doOrdSendIf_Dly_Dmnd_Srch01() {
		aOrdSendIf_Dly_Dmnd_Srch01.call();
	};

	/**
	 * OrdSendIf_Dly_Dmnd_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_CndR createOrdSendIf_Dly_Dmnd_Srch01_CndR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_CndR.create();
	}

	/**
	 * OrdSendIf_Dly_Dmnd_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR createOrdSendIf_Dly_Dmnd_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Dly_Dmnd_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR> createOrdSendIf_Dly_Dmnd_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Srch01 aOrdSendIf_Srch01;

	protected void initOrdSendIf_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Srch01_INFO;
		this.aOrdSendIf_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Srch01 crtOrdSendIf_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Srch01();
		return lgc.aOrdSendIf_Srch01;
	}

	protected void paramOrdSendIf_Srch01(MCParam p) {
		if (this.aOrdSendIf_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Srch01.down0());
	}

	protected void doOrdSendIf_Srch01() {
		aOrdSendIf_Srch01.call();
	};

	/**
	 * OrdSendIf_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_DtlR createOrdSendIf_Srch01_DtlR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_DtlR.create();
	}

	/**
	 * OrdSendIf_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR createOrdSendIf_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR> createOrdSendIf_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Itm_Dtl_Bom_Srch01 aOrdSendIf_Itm_Dtl_Bom_Srch01;

	protected void initOrdSendIf_Itm_Dtl_Bom_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Itm_Dtl_Bom_Srch01_INFO;
		this.aOrdSendIf_Itm_Dtl_Bom_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Itm_Dtl_Bom_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Itm_Dtl_Bom_Srch01 crtOrdSendIf_Itm_Dtl_Bom_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Itm_Dtl_Bom_Srch01();
		return lgc.aOrdSendIf_Itm_Dtl_Bom_Srch01;
	}

	protected void paramOrdSendIf_Itm_Dtl_Bom_Srch01(MCParam p) {
		if (this.aOrdSendIf_Itm_Dtl_Bom_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Itm_Dtl_Bom_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Itm_Dtl_Bom_Srch01.down0());
	}

	protected void doOrdSendIf_Itm_Dtl_Bom_Srch01() {
		aOrdSendIf_Itm_Dtl_Bom_Srch01.call();
	};

	/**
	 * OrdSendIf_Itm_Dtl_Bom_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR createOrdSendIf_Itm_Dtl_Bom_Srch01_DtlR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR.create();
	}

	/**
	 * OrdSendIf_Itm_Dtl_Bom_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR createOrdSendIf_Itm_Dtl_Bom_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Itm_Dtl_Bom_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> createOrdSendIf_Itm_Dtl_Bom_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Oper_InstAct_Srch01 aOrdSendIf_Oper_InstAct_Srch01;

	protected void initOrdSendIf_Oper_InstAct_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Oper_InstAct_Srch01_INFO;
		this.aOrdSendIf_Oper_InstAct_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Oper_InstAct_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Oper_InstAct_Srch01 crtOrdSendIf_Oper_InstAct_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Oper_InstAct_Srch01();
		return lgc.aOrdSendIf_Oper_InstAct_Srch01;
	}

	protected void paramOrdSendIf_Oper_InstAct_Srch01(MCParam p) {
		if (this.aOrdSendIf_Oper_InstAct_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Oper_InstAct_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Oper_InstAct_Srch01.down0());
	}

	protected void doOrdSendIf_Oper_InstAct_Srch01() {
		aOrdSendIf_Oper_InstAct_Srch01.call();
	};

	/**
	 * OrdSendIf_Oper_InstAct_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_DtlR createOrdSendIf_Oper_InstAct_Srch01_DtlR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_DtlR.create();
	}

	/**
	 * OrdSendIf_Oper_InstAct_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR createOrdSendIf_Oper_InstAct_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Oper_InstAct_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR> createOrdSendIf_Oper_InstAct_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Ord_Lnk_Srch01 aOrdSendIf_Ord_Lnk_Srch01;

	protected void initOrdSendIf_Ord_Lnk_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Ord_Lnk_Srch01_INFO;
		this.aOrdSendIf_Ord_Lnk_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Ord_Lnk_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Ord_Lnk_Srch01 crtOrdSendIf_Ord_Lnk_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Ord_Lnk_Srch01();
		return lgc.aOrdSendIf_Ord_Lnk_Srch01;
	}

	protected void paramOrdSendIf_Ord_Lnk_Srch01(MCParam p) {
		if (this.aOrdSendIf_Ord_Lnk_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Ord_Lnk_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Ord_Lnk_Srch01.down0());
	}

	protected void doOrdSendIf_Ord_Lnk_Srch01() {
		aOrdSendIf_Ord_Lnk_Srch01.call();
	};

	/**
	 * OrdSendIf_Ord_Lnk_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_DtlR createOrdSendIf_Ord_Lnk_Srch01_DtlR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_DtlR.create();
	}

	/**
	 * OrdSendIf_Ord_Lnk_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR createOrdSendIf_Ord_Lnk_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Ord_Lnk_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR> createOrdSendIf_Ord_Lnk_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR.class);
	}
	protected MSLAL_OrdSendIfService.OrdSendIf_Schd_ActQty_Srch01 aOrdSendIf_Schd_ActQty_Srch01;

	protected void initOrdSendIf_Schd_ActQty_Srch01() {
		this.info = PDef.MS_MSLAL9310_OrdSendIf_Schd_ActQty_Srch01_INFO;
		this.aOrdSendIf_Schd_ActQty_Srch01 = ((MSLAL_OrdSendIfService)this).new OrdSendIf_Schd_ActQty_Srch01();
	}

	public static MSLAL_OrdSendIfService.OrdSendIf_Schd_ActQty_Srch01 crtOrdSendIf_Schd_ActQty_Srch01() {
		MSLAL_OrdSendIfService lgc = new MSLAL_OrdSendIfService();
		lgc.initOrdSendIf_Schd_ActQty_Srch01();
		return lgc.aOrdSendIf_Schd_ActQty_Srch01;
	}

	protected void paramOrdSendIf_Schd_ActQty_Srch01(MCParam p) {
		if (this.aOrdSendIf_Schd_ActQty_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdSendIf_Schd_ActQty_Srch01.up0());
		p.addDownBlock(aOrdSendIf_Schd_ActQty_Srch01.down0());
	}

	protected void doOrdSendIf_Schd_ActQty_Srch01() {
		aOrdSendIf_Schd_ActQty_Srch01.call();
	};

	/**
	 * OrdSendIf_Schd_ActQty_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_DtlR createOrdSendIf_Schd_ActQty_Srch01_DtlR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_DtlR.create();
	}

	/**
	 * OrdSendIf_Schd_ActQty_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR createOrdSendIf_Schd_ActQty_Srch01_RsltR(){
		return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR.create();
	}

	/**
	 * OrdSendIf_Schd_ActQty_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR> createOrdSendIf_Schd_ActQty_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * OrdSendIf_Itm_Srch01オペレーション.<p>
	 *
	 * 送信対象の品目マスタデータを検索する<br>
	 */
	abstract public class OrdSendIf_Itm_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Itm_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Itm_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_DtlR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Itm_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_DtlR createOrdSendIf_Itm_Srch01_DtlR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_DtlR.create();
		}

		/**
		 * OrdSendIf_Itm_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR createOrdSendIf_Itm_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Itm_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR> createOrdSendIf_Itm_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>base_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>base_itm_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Itm_Oper_Srch01オペレーション.<p>
	 *
	 * 送信対象の品目工程マスタデータを検索する<br>
	 */
	abstract public class OrdSendIf_Itm_Oper_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Itm_Oper_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Itm_Oper_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_DtlR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Itm_Oper_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_DtlR createOrdSendIf_Itm_Oper_Srch01_DtlR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_DtlR.create();
		}

		/**
		 * OrdSendIf_Itm_Oper_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR createOrdSendIf_Itm_Oper_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Itm_Oper_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR> createOrdSendIf_Itm_Oper_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Oper_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Itm_Dtl_Srch01オペレーション.<p>
	 *
	 * 送信対象の品目詳細マスタデータを検索する<br>
	 */
	abstract public class OrdSendIf_Itm_Dtl_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Itm_Dtl_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Itm_Dtl_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_DtlR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Itm_Dtl_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_DtlR createOrdSendIf_Itm_Dtl_Srch01_DtlR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_DtlR.create();
		}

		/**
		 * OrdSendIf_Itm_Dtl_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR createOrdSendIf_Itm_Dtl_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Itm_Dtl_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR> createOrdSendIf_Itm_Dtl_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>buf_lt</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sz_week</td></tr>
		 * 	<tr><td><br></td><td>lot_sz_pd</td></tr>
		 * 	<tr><td><br></td><td>min_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>batch_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_order</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>order_ratio</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Bom_Srch01オペレーション.<p>
	 *
	 * 送信対象のＢＯＭマスタデータを検索する<br>
	 */
	abstract public class OrdSendIf_Bom_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Bom_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Bom_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_DtlR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Bom_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_DtlR createOrdSendIf_Bom_Srch01_DtlR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_DtlR.create();
		}

		/**
		 * OrdSendIf_Bom_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR createOrdSendIf_Bom_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Bom_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR> createOrdSendIf_Bom_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ph_flg</td></tr>
		 * 	<tr><td><br></td><td>ph_bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>min_sno1</td></tr>
		 * 	<tr><td><br></td><td>max_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>min_sno2</td></tr>
		 * 	<tr><td><br></td><td>max_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>min_sno3</td></tr>
		 * 	<tr><td><br></td><td>max_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>min_sno4</td></tr>
		 * 	<tr><td><br></td><td>max_sno4</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Bom_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Loc_Srch01オペレーション.<p>
	 *
	 * 送信対象の場所マスタデータを検索する<br>
	 */
	abstract public class OrdSendIf_Loc_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Loc_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Loc_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Loc_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_CndR createOrdSendIf_Loc_Srch01_CndR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_CndR.create();
		}

		/**
		 * OrdSendIf_Loc_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR createOrdSendIf_Loc_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Loc_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR> createOrdSendIf_Loc_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_CndR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Loc_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Cal_Srch01オペレーション.<p>
	 *
	 * 送信対象のカレンダマスタデータを検索する。<br>
	 */
	abstract public class OrdSendIf_Cal_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Cal_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Cal_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Cal_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_CndR createOrdSendIf_Cal_Srch01_CndR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_CndR.create();
		}

		/**
		 * OrdSendIf_Cal_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR createOrdSendIf_Cal_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Cal_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR> createOrdSendIf_Cal_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_CndR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>cal_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>sun_off_flg</td></tr>
		 * 	<tr><td><br></td><td>mon_off_flg</td></tr>
		 * 	<tr><td><br></td><td>tue_off_flg</td></tr>
		 * 	<tr><td><br></td><td>wed_off_flg</td></tr>
		 * 	<tr><td><br></td><td>thu_off_flg</td></tr>
		 * 	<tr><td><br></td><td>fri_off_flg</td></tr>
		 * 	<tr><td><br></td><td>sat_off_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Cal_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Ext_Cal_Srch01オペレーション.<p>
	 *
	 * 送信対象の臨時カレンダマスタデータを検索する。<br>
	 */
	abstract public class OrdSendIf_Ext_Cal_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Ext_Cal_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Ext_Cal_Srch01() {
			
			// このオペレーションのコンテナ初期化
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Ext_Cal_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR createOrdSendIf_Ext_Cal_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Ext_Cal_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR> createOrdSendIf_Ext_Cal_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>off_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ext_Cal_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Stk_Srch01オペレーション.<p>
	 *
	 * 送信対象の在庫情報を検索する<br>
	 */
	abstract public class OrdSendIf_Stk_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Stk_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Stk_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Stk_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_CndR createOrdSendIf_Stk_Srch01_CndR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_CndR.create();
		}

		/**
		 * OrdSendIf_Stk_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR createOrdSendIf_Stk_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Stk_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR> createOrdSendIf_Stk_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_CndR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Stk_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_IO_Gr_Srch01オペレーション.<p>
	 *
	 * 送信対象の入庫予定情報を検索する<br>
	 */
	abstract public class OrdSendIf_IO_Gr_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_IO_Gr_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_IO_Gr_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_IO_Gr_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_CndR createOrdSendIf_IO_Gr_Srch01_CndR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_CndR.create();
		}

		/**
		 * OrdSendIf_IO_Gr_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR createOrdSendIf_IO_Gr_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_IO_Gr_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR> createOrdSendIf_IO_Gr_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_CndR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gr_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_IO_Gi_Srch01オペレーション.<p>
	 *
	 * 送信対象の出庫予定情報を検索する<br>
	 */
	abstract public class OrdSendIf_IO_Gi_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_IO_Gi_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_IO_Gi_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_IO_Gi_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_CndR createOrdSendIf_IO_Gi_Srch01_CndR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_CndR.create();
		}

		/**
		 * OrdSendIf_IO_Gi_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR createOrdSendIf_IO_Gi_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_IO_Gi_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR> createOrdSendIf_IO_Gi_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_CndR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_IO_Gi_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Dly_Dmnd_Srch01オペレーション.<p>
	 *
	 * 送信対象の日次需要情報を検索する<br>
	 */
	abstract public class OrdSendIf_Dly_Dmnd_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Dly_Dmnd_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Dly_Dmnd_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Dly_Dmnd_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_CndR createOrdSendIf_Dly_Dmnd_Srch01_CndR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_CndR.create();
		}

		/**
		 * OrdSendIf_Dly_Dmnd_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR createOrdSendIf_Dly_Dmnd_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Dly_Dmnd_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR> createOrdSendIf_Dly_Dmnd_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_CndR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dly_dmnd_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>dmnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno_typ4</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Dly_Dmnd_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Srch01オペレーション.<p>
	 *
	 * 送信対象のオーダ情報を検索する<br>
	 */
	abstract public class OrdSendIf_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_DtlR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_DtlR createOrdSendIf_Srch01_DtlR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_DtlR.create();
		}

		/**
		 * OrdSendIf_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR createOrdSendIf_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR> createOrdSendIf_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>include_unfirm_flg</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>co_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Itm_Dtl_Bom_Srch01オペレーション.<p>
	 *
	 * 送信対象の品目詳細マスタおよびＢＯＭマスタを検索する<br>
	 */
	abstract public class OrdSendIf_Itm_Dtl_Bom_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Itm_Dtl_Bom_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Itm_Dtl_Bom_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Itm_Dtl_Bom_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR createOrdSendIf_Itm_Dtl_Bom_Srch01_DtlR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR.create();
		}

		/**
		 * OrdSendIf_Itm_Dtl_Bom_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR createOrdSendIf_Itm_Dtl_Bom_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Itm_Dtl_Bom_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> createOrdSendIf_Itm_Dtl_Bom_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.itm_dtl_st_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.itm_dtl_end_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.mfg_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.purc_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.buf_lt</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sz_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sz_week</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.lot_sz_pd</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.min_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.batch_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.max_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.max_order</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.prio</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.order_ratio</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sno1</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sno2</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sno3</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.ver_no</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.in_offst</td></tr>
		 * 	<tr><td><br></td><td>itm_dtl_bom.inpt_ctl_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Itm_Dtl_Bom_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Oper_InstAct_Srch01オペレーション.<p>
	 *
	 * 送信対象の工程指図・実績を検索する<br>
	 */
	abstract public class OrdSendIf_Oper_InstAct_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Oper_InstAct_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Oper_InstAct_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_DtlR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Oper_InstAct_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_DtlR createOrdSendIf_Oper_InstAct_Srch01_DtlR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_DtlR.create();
		}

		/**
		 * OrdSendIf_Oper_InstAct_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR createOrdSendIf_Oper_InstAct_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Oper_InstAct_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR> createOrdSendIf_Oper_InstAct_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>term_from</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope_act.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ope_act.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ope_act.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ope_act.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ope_act.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ope_act.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ope_act.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ope_act.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ope_act.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ope_act.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ope_act.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ope_act.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ope_act.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ope_act.oper_inst_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ope_act.oper_act_qty</td></tr>
		 * 	<tr><td><br></td><td>ope_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ope_act.base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>ope_act.inst_st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ope_act.inst_end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ope_act.act_st_tm</td></tr>
		 * 	<tr><td><br></td><td>ope_act.act_end_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Oper_InstAct_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Ord_Lnk_Srch01オペレーション.<p>
	 *
	 * 送信対象のオーダ引当を検索する<br>
	 */
	abstract public class OrdSendIf_Ord_Lnk_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Ord_Lnk_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Ord_Lnk_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_DtlR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Ord_Lnk_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_DtlR createOrdSendIf_Ord_Lnk_Srch01_DtlR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_DtlR.create();
		}

		/**
		 * OrdSendIf_Ord_Lnk_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR createOrdSendIf_Ord_Lnk_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Ord_Lnk_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR> createOrdSendIf_Ord_Lnk_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>term_from</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord_lnk.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.par_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.par_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.cal_cd</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord_lnk.accpt_insp_lt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Ord_Lnk_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}
	/**
	 * OrdSendIf_Schd_ActQty_Srch01オペレーション.<p>
	 *
	 * 送信対象の実績数量を検索する<br>
	 */
	abstract public class OrdSendIf_Schd_ActQty_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdSendIf_Schd_ActQty_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OrdSendIf_Schd_ActQty_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_DtlR.create();
			down0 = MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR.class);

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
			invoke((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdSendIf_Schd_ActQty_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_DtlR createOrdSendIf_Schd_ActQty_Srch01_DtlR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_DtlR.create();
		}

		/**
		 * OrdSendIf_Schd_ActQty_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR createOrdSendIf_Schd_ActQty_Srch01_RsltR(){
			return mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR.create();
		}

		/**
		 * OrdSendIf_Schd_ActQty_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR> createOrdSendIf_Schd_ActQty_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>term_from</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_DtlR
		 */
		public mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.act_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_act_qty.base_unit_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL9310.OrdSendIf_Schd_ActQty_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_OrdSendIfService)MSLAL_OrdSendIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}