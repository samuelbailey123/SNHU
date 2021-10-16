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
 *  ======== uartecho.c ========
 */
#include <stdint.h>
#include <stddef.h>

/* Driver Header files */
#include <ti/drivers/GPIO.h>
#include <ti/drivers/UART.h>

/* Driver configuration */
#include "ti_drivers_config.h"

// DEFINE
#define RESET -1
#define OFF 0
#define ON 1

/*
 *  ======== mainThread ========
 */
void *mainThread(void *arg0)
{
    char        input;
    const char  echoPrompt[] = "Echoing characters:\r\n";
    UART_Handle uart;
    UART_Params uartParams;

    /* Call driver init functions */
    GPIO_init();
    UART_init();

    /* Configure the LED pin */
    GPIO_setConfig(CONFIG_GPIO_LED_0, GPIO_CFG_OUT_STD | GPIO_CFG_OUT_LOW);

    /* Create a UART with data processing off. */
    UART_Params_init(&uartParams);
    uartParams.writeDataMode = UART_DATA_BINARY;
    uartParams.readDataMode = UART_DATA_BINARY;
    uartParams.readReturnMode = UART_RETURN_FULL;
    uartParams.baudRate = 115200;

    uart = UART_open(CONFIG_UART_0, &uartParams);

    if (uart == NULL) {
        /* UART_open() failed */
        while (1);
    }

    /* Turn on user LED to indicate successful initialization */
//    GPIO_write(CONFIG_GPIO_LED_0, CONFIG_GPIO_LED_ON);

    UART_write(uart, echoPrompt, sizeof(echoPrompt));
    short state = RESET;

    /* Loop forever echoing */
    while (1) {
        UART_read(uart, &input, 1);
        if(state == RESET && (input == 'O' || input == 'o')){
            state = ON;
        }else if (state == ON && (input == 'N' || input == 'n')){
            GPIO_write(CONFIG_GPIO_LED_0, CONFIG_GPIO_LED_ON);
            state = RESET;
        }else if (state == ON && (input == 'F' || input == 'f')){
            state = OFF;
        }else if(state == OFF && (input == 'F' || input == 'f')){
            GPIO_write(CONFIG_GPIO_LED_0, CONFIG_GPIO_LED_OFF);
            state = RESET;
        }else{
            state = RESET;
        }
        UART_write(uart, &input, 1);
    }
}







//VERSION 1
//unsigned char state;
//        if(input == 'N' && state == 'O'){
//            GPIO_write(CONFIG_GPIO_LED_0, CONFIG_GPIO_LED_ON);
//        }else if(input == 'F' && state == 'F'){
//            GPIO_write(CONFIG_GPIO_LED_0, CONFIG_GPIO_LED_0);
//        }
//        state = input;

//VERSION 0
//if (input == 'O'){
//            strncat(ON, &input, 1);
//            strncat(OFF, &input, 1);
//        } else if(input == 'N' && ON == ' O'){
//            GPIO_write(CONFIG_GPIO_LED_0, CONFIG_GPIO_LED_ON);
//            strcpy(ON, ' ');
//            strcpy(OFF, ' ');
//        } else if(input == 'F'){
//            if(OFF == ' OFF'){
//                GPIO_write(CONFIG_GPIO_LED_0, CONFIG_GPIO_LED_0);
//                strcpy(OFF, ' ');
//            }
//            if(OFF != ' OFF'){
//                strncat(OFF, input, 1);
//                if(OFF == ' OFF'){
//                    GPIO_write(CONFIG_GPIO_LED_0, CONFIG_GPIO_LED_0);
//                    strcpy(OFF, ' ');
//                }
//            }
//        }else{
//            //do nothing if not O, F, or N
//        }
