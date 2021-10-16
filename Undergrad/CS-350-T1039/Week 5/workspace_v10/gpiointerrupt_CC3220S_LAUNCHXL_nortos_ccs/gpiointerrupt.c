/*
 * Copyright (c) 2015-2020, Texas Instruments Incorporated
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * *  Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * *  Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * *  Neither the name of Texas Instruments Incorporated nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
 *  ======== gpiointerrupt.c ========
 */
#include <stdint.h>
#include <stddef.h>
#include <ti/drivers/Timer.h>

/* Driver Header files */
#include <ti/drivers/GPIO.h>

/* Driver configuration */
#include "ti_drivers_config.h"

//define
#define SOS 0
#define OK 1
#define RESET -1

/*
 *  ======== gpioButtonFxn0 ========
 *  Callback function for the GPIO interrupt on CONFIG_GPIO_BUTTON_0.
 *
 *  Note: GPIO interrupts are cleared prior to invoking callbacks.
 */
void gpioButtonFxn0(uint_least8_t index)
{
    /* Toggle an LED */
    GPIO_toggle(CONFIG_GPIO_LED_0);
}

/*
 *  ======== gpioButtonFxn1 ========
 *  Callback function for the GPIO interrupt on CONFIG_GPIO_BUTTON_1.
 *  This may not be used for all boards.
 *
 *  Note: GPIO interrupts are cleared prior to invoking callbacks.
 */
void gpioButtonFxn1(uint_least8_t index)
{
    /* Toggle an LED */
    GPIO_toggle(CONFIG_GPIO_LED_1);
}

void timerCallback(Timer_Handle myHandle, int_fast16_t status){

}

void initTimer(void)
{
    Timer_Handle timer0;
    Timer_Params params;
    Timer_init();
    Timer_Params_init(&params);
    params.period = 500000;
    params.periodUnits = Timer_PERIOD_US;
    params.timerMode = Timer_CONTINUOUS_CALLBACK;
    params.timerCallback = timerCallback;
    timer0 = Timer_open(CONFIG_TIMER_0, &params);
    if (timer0 == NULL) {
     /* Failed to initialized timer */
        while (1) {}
    }
    if (Timer_start(timer0) == Timer_STATUS_ERROR) {
     /* Failed to start timer */
        while (1) {}
    }
}

/*
 *  ======== mainThread ========
 */
void *mainThread(void *arg0)
{

    // state set
    short state = SOS;

    /* Call driver init functions */
    GPIO_init();

    /* Configure the LED and button pins */
    GPIO_setConfig(CONFIG_GPIO_LED_0, GPIO_CFG_OUT_STD | GPIO_CFG_OUT_LOW);
    GPIO_setConfig(CONFIG_GPIO_LED_1, GPIO_CFG_OUT_STD | GPIO_CFG_OUT_LOW);
    GPIO_setConfig(CONFIG_GPIO_BUTTON_0, GPIO_CFG_IN_PU | GPIO_CFG_IN_INT_FALLING);
    GPIO_setConfig(CONFIG_GPIO_BUTTON_1, GPIO_CFG_IN_PU | GPIO_CFG_IN_INT_FALLING);

    /* Turn on user LED */
//    GPIO_write(CONFIG_GPIO_LED_0, CONFIG_GPIO_LED_ON);

    /* Install Button callback */
    GPIO_setCallback(CONFIG_GPIO_BUTTON_0, gpioButtonFxn0);
    GPIO_setCallback(CONFIG_GPIO_BUTTON_1, gpioButtonFxn0);

    /* Enable interrupts */
    GPIO_enableInt(CONFIG_GPIO_BUTTON_0);

    while(state == SOS){
        //S
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        Timer_init();
        Timer_init();

        //O
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        Timer_init();
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        Timer_init();
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        Timer_init();
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        Timer_init();
        Timer_init();

        //S
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        Timer_init();
        Timer_init();

        //change state
        if(CONFIG_GPIO_BUTTON_0 || CONFIG_GPIO_BUTTON_1){
            state = OK;
        }else{
            state = SOS;
        }
    }

    while(state == OK){
        //O
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        Timer_init();
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        Timer_init();
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        Timer_init();
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_1);
        Timer_init();
        Timer_init();
        Timer_init();

        //K
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        Timer_init();
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        GPIO_toggle(CONFIG_GPIO_LED_0);
        Timer_init();
        Timer_init();
        Timer_init();

        //change state
        if(CONFIG_GPIO_BUTTON_0 || CONFIG_GPIO_BUTTON_1){
            state = SOS;
        }else{
            state = OK;
        }
    }


    /*
     *  If more than one input pin is available for your device, interrupts
     *  will be enabled on CONFIG_GPIO_BUTTON1.
     */
//    if (CONFIG_GPIO_BUTTON_0 != CONFIG_GPIO_BUTTON_1) {
//        /* Configure BUTTON1 pin */
//        GPIO_setConfig(CONFIG_GPIO_BUTTON_1, GPIO_CFG_IN_PU | GPIO_CFG_IN_INT_FALLING);
//
//        /* Install Button callback */
//        GPIO_setCallback(CONFIG_GPIO_BUTTON_1, gpioButtonFxn1);
//        GPIO_enableInt(CONFIG_GPIO_BUTTON_1);
//    }


    return (NULL);
}
